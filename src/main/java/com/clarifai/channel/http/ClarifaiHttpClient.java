package com.clarifai.channel.http;

import com.clarifai.channel.ClarifaiException;
import okhttp3.*;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public interface ClarifaiHttpClient {
  String executeRequest(String apiKey, String url, String method, String requestString);

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

    @Override @NotNull public String executeRequest(
            String apiKey, String subUrl, String method, String requestString
    ) {
      RequestBody body = null;
      if (!method.toUpperCase().equals("GET")) {
        body = RequestBody.create(MEDIA_TYPE_JSON, requestString);
      }

      Request request = new Request.Builder()
          .url(baseUrl + subUrl)
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
  }
}
