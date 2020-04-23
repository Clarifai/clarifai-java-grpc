package com.clarifai.channel.http;

import com.clarifai.channel.ClarifaiException;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import okhttp3.*;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public interface ClarifaiHttpClient {
  String executeRequest(String apiKey, String url, String method, JsonObject requestString);

  public class Default implements ClarifaiHttpClient {

    public static final MediaType MEDIA_TYPE_JSON = MediaType.parse(
        "application/json; charset=utf8"
    );

    private final String baseUrl;
    private OkHttpClient okHttpClient;

    public Default() {
      this("https://api.clarifai.com");
    }

    public Default(@NotNull String baseUrl) {
      this(baseUrl, new OkHttpClient());
    }

    public Default(@NotNull String baseUrl, @NotNull OkHttpClient okHttpClient) {
      this.baseUrl = baseUrl;
      this.okHttpClient = okHttpClient;
    }

    @Override
    @NotNull
    public String executeRequest(
        String apiKey, String subUrl, String method, JsonObject requestObject
    ) {
      HttpUrl.Builder url = HttpUrl.parse(baseUrl + subUrl).newBuilder();

      RequestBody body = null;
      if (method.toUpperCase().equals("GET")) {
        for (Map.Entry<String, String> entry : encodeGetParameters(requestObject).entrySet()) {
          url.addQueryParameter(entry.getKey(), entry.getValue());
        }
      } else {
        body = RequestBody.create(MEDIA_TYPE_JSON, new Gson().toJson(requestObject));
      }


      Request request = new Request.Builder()
          .url(url.build())
          .addHeader("Authorization", "Key " + apiKey)
          .method(method, body)
          .build();

      String responseString;
      try {
        Response response = okHttpClient.newCall(request).execute();
        responseString = response.body().string();
      } catch (IOException e) {
        throw new ClarifaiException(e);
      }
      return responseString;
    }

    /**
     * Encodes message parameters into format for use in the GET arguments.
     * @param requestObject The object to encode.
     * @return The URL parameters.
     */
    private Map<String, String> encodeGetParameters(JsonObject requestObject) {
      Map<String, String> encodedParameters = new HashMap<>();

      for (Map.Entry<String, JsonElement> entry : requestObject.entrySet()) {
        String k = entry.getKey();
        JsonElement v = entry.getValue();

        if (v.isJsonPrimitive()) {
          JsonPrimitive vPrimitive = v.getAsJsonPrimitive();
          if (vPrimitive.isString()) {
            encodedParameters.put(k, v.getAsString());
          } else if (vPrimitive.isBoolean()) {
            encodedParameters.put(k, String.valueOf(v.getAsBoolean()));
          } else if (vPrimitive.isNumber()) {
            encodedParameters.put(k, v.getAsNumber().toString());
          }
        } else if (v.isJsonObject()) {
          for (Map.Entry<String, String> subEntry : encodeGetParameters(v.getAsJsonObject()).entrySet()) {
            String subK = subEntry.getKey();
            String subV = subEntry.getValue();
            encodedParameters.put(k + "." + subK, subV);
          }
        } else {
          throw new ClarifaiException(String.format("Cannot convert type for get params: %s", v.getClass()));
        }
      }

      return encodedParameters;
    }
  }
}
