package com.clarifai.channel;

import com.google.api.HttpRule;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.protobuf.Descriptors;
import io.grpc.MethodDescriptor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class JsonEndpoint<RequestT, ResponseT> {

  class Endpoint {
    private final String method;
    private final String url;

    Endpoint(String method, String url) {
      this.method = method;
      this.url = url;
    }

    public String getMethod() {
      return method;
    }

    public String getUrl() {
      return url;
    }
  }

  private final MethodDescriptor<RequestT, ResponseT> methodDescriptor;
  private final HashMap<String, JsonElement> topLevelFields = new HashMap<>();

  private static final Pattern URL_FIELDS_PATTERN = Pattern.compile("\\{(.*?)\\}");


  JsonEndpoint(
      MethodDescriptor<RequestT, ResponseT> methodDescriptor, String requestString
  ) {
    this.methodDescriptor = methodDescriptor;

    JsonObject request = new Gson().fromJson(requestString, JsonObject.class);
    for (Map.Entry<String, JsonElement> entry : request.entrySet()) {
      topLevelFields.put(entry.getKey(), entry.getValue());
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
        int bestMatchCount = -1;

        for (HttpRule httpRule : rule.getAdditionalBindingsList()) {
          String method = httpRule.getPatternCase().name();

          String urlTemplate = url(httpRule, method);

          Matcher matcher = URL_FIELDS_PATTERN.matcher(urlTemplate);

          boolean allArgumentsTranslated = true;
          int count = 0;

          String url = urlTemplate;

          while (matcher.find()) {
            String field = matcher.group(1);

            JsonElement value = topLevelFields.get(field);
            if (value == null) {
              allArgumentsTranslated = false;
              break;
            }

            url = url.replace("{" + field + "}", value.getAsString());

            count++;
          }

          if (allArgumentsTranslated && bestMatchCount < count) {
            bestMatchUrl = url;
            bestMatchMethod = method;
            bestMatchCount = count;
          }
        }

        if (bestMatchUrl != null) {
          return new Endpoint(bestMatchMethod, bestMatchUrl);
        }
      }
    }

    throw new RuntimeException("Unable to find an appropriate HTTP endpoint");
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
