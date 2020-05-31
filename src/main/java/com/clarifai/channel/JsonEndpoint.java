package com.clarifai.channel;

import com.google.api.HttpRule;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.protobuf.Descriptors;
import io.grpc.MethodDescriptor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class JsonEndpoint<RequestT, ResponseT> {

  class Endpoint {
    private final String method;
    private final String url;
    private final ArrayList<String> urlFields;

    Endpoint(String method, String url, ArrayList<String> urlFields) {
      this.method = method;
      this.url = url;
      this.urlFields = urlFields;
    }

    public String getMethod() {
      return method;
    }

    public String getUrl() {
      return url;
    }

    public ArrayList<String> getUrlFields() {
      return urlFields;
    }
  }

  private final MethodDescriptor<RequestT, ResponseT> methodDescriptor;

  /**
   * The request JSON object.
   */
  private final JsonObject request;

  /**
   * The request object as a hash map.
   */
  private final HashMap<String, JsonElement> requestMap = new HashMap<>();

  private static final Pattern URL_FIELDS_PATTERN = Pattern.compile("\\{(.*?)\\}");


  JsonEndpoint(MethodDescriptor<RequestT, ResponseT> methodDescriptor, JsonObject request) {
    this.methodDescriptor = methodDescriptor;
    this.request = request;

    for (Map.Entry<String, JsonElement> entry : request.entrySet()) {
      requestMap.put(entry.getKey(), entry.getValue());
    }
  }

  /**
   * Fills in the url template with the actual url params from the request body.
   * Picks the most appropriate url depending on which parameters are present in the request body.
   *
   * @return The most proper HTTP endpoint, out of those available.
   */
  Endpoint pickProperEndpoint() {
    Object schemaDescriptor = methodDescriptor.getSchemaDescriptor();

    Method m;
    try {
      m = schemaDescriptor.getClass().getMethod("getMethodDescriptor");
    } catch (SecurityException | NoSuchMethodException e) {
      throw new RuntimeException(e);
    }

    m.setAccessible(true);

    com.google.protobuf.Descriptors.MethodDescriptor schemaMethodDescriptor;
    try {
      schemaMethodDescriptor = (Descriptors.MethodDescriptor) m.invoke(schemaDescriptor);
    } catch (IllegalArgumentException | IllegalAccessException | InvocationTargetException e) {
      throw new RuntimeException(e);
    }

    Set<Map.Entry<Descriptors.FieldDescriptor, Object>> allFields = schemaMethodDescriptor
        .getOptions().getAllFields().entrySet();

    for (Map.Entry<Descriptors.FieldDescriptor, Object> pair : allFields) {

      if (pair.getValue().getClass() == HttpRule.class) {
        HttpRule rule = (HttpRule) pair.getValue();

        String bestMatchUrl = null;
        String bestMatchMethod = null;
        ArrayList<String> bestMatchUrlFields = null;
        int bestMatchCount = -1;

        String appId;
        String userId;

        String[] ids = readAppIdAndUserId(request);
        if (ids.length == 2) {
          appId = ids[0];
          userId = ids[1];
        } else {
          appId = null;
          userId = null;
        }

        ArrayList<HttpRule> allRules = new ArrayList<HttpRule>() {{
          add(rule);
          addAll(rule.getAdditionalBindingsList());
        }};

        for (HttpRule httpRule : allRules) {
          String method = httpRule.getPatternCase().name();

          String urlTemplate = url(httpRule, method);

          Matcher matcher = URL_FIELDS_PATTERN.matcher(urlTemplate);

          boolean allArgumentsTranslated = true;
          int count = 0;

          String url = urlTemplate;

          ArrayList<String> urlFields = new ArrayList<>();
          while (matcher.find()) {
            String field = matcher.group(1);

            String[] parts = field.split("\\.");
            String fieldName = parts[parts.length - 1];

            String value;
            if (fieldName.equals("app_id")) {
              if (appId == null) {
                allArgumentsTranslated = false;
                break;
              }

              value = appId;
            } else if (fieldName.equals("user_id")) {
              if (userId != null) {
                value = userId;
              } else {
                // "me" is the alias for the ID of the authorized user.
                value = "me";
              }
            } else {
              if (!requestMap.containsKey(fieldName)) {
                allArgumentsTranslated = false;
                break;
              }
              value = requestMap.get(fieldName).getAsString();
            }

            url = url.replace("{" + field + "}", value);
            urlFields.add(field);

            count++;
          }

          if (allArgumentsTranslated && bestMatchCount < count) {
            bestMatchUrl = url;
            bestMatchMethod = method;
            bestMatchCount = count;
            bestMatchUrlFields = urlFields;
          }
        }

        if (bestMatchUrl != null) {
          return new Endpoint(bestMatchMethod, bestMatchUrl, bestMatchUrlFields);
        }
      }
    }

    throw new RuntimeException("Unable to find an appropriate HTTP endpoint");
  }

  /**
   * Extracts the app_id and user_id values from the request object, or returns an empty array.
   * @return ["app_id", "user_id"] values if they are present, or empty array.
   */
  private String[] readAppIdAndUserId(JsonElement element) {
      if (element.isJsonArray()) {
        for (JsonElement e : element.getAsJsonArray()) {
          String[] vals = readAppIdAndUserId(e);
          if (vals.length == 2) {
            return vals;
          }
        }
      } else if (element.isJsonObject()) {
        for (Map.Entry<String, JsonElement> entry : element.getAsJsonObject().entrySet()) {
          String key = entry.getKey();
          JsonElement value = entry.getValue();
          if (key.equals("apps")) {
            JsonArray apps = value.getAsJsonArray();
            if (apps.size() == 1) {
              String[] result = new String[2];
              JsonObject app = apps.get(0).getAsJsonObject();
              result[0] = app.get("id").getAsString();
              result[1] = app.get("user_id").getAsString();
              return result;
            } else if (apps.size() == 0) {
              return new String[0];
            } else {
              throw new ClarifaiException("Only one app is supported at this time.");
            }
          } else if (key.equals("metadata")) {
            continue;
          }
          String[] vals = readAppIdAndUserId(value);
          if (vals.length == 2) {
            return vals;
          }
        }
      }
      return new String[0];
  }

  private String url(HttpRule httpRule, String method) {
    String urlTemplate;
    switch (method) {
      case "GET": {
        urlTemplate = httpRule.getGet();
        break;
      }
      case "POST": {
        urlTemplate = httpRule.getPost();
        break;
      }
      case "PATCH": {
        urlTemplate = httpRule.getPatch();
        break;
      }
      case "DELETE": {
        urlTemplate = httpRule.getDelete();
        break;
      }
      default: {
        throw new ClarifaiException("Unhandled method " + method);
      }
    }
    return urlTemplate;
  }
}
