package com.clarifai.channel.http;

import com.clarifai.channel.ClarifaiException;
import okhttp3.*;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public interface ClarifaiHttpClient {
  String apiKey();
  String executeRequest(String url, String method, String requestString);
  void client(OkHttpClient client);

  public class Default implements ClarifaiHttpClient {

    public static final MediaType MEDIA_TYPE_JSON = MediaType.parse(
            "application/json; charset=utf8"
    );

    private final String apiKey;
    private final String baseUrl;
    private OkHttpClient okHttpClient;

    public Default(@NotNull String apiKey) {
        this(apiKey, "https://api.clarifai.com");
    }

    public Default(@NotNull String apiKey, @NotNull String baseUrl) {
      this.apiKey = apiKey;
      this.baseUrl = baseUrl;
      this.okHttpClient = new OkHttpClient();
    }

    @Override @NotNull public String apiKey() {
      return this.apiKey;
    }

    @Override public void client(OkHttpClient client) {
      this.okHttpClient = client;
    }

    @Override @NotNull public String executeRequest(
            String subUrl, String method, String requestString
    ) {
      RequestBody body = null;
      if (!method.toUpperCase().equals("GET")) {
        body = RequestBody.create(MEDIA_TYPE_JSON, requestString);
      }

      Request request = new Request.Builder()
          .url(baseUrl + subUrl)
          .addHeader("Authorization", "Key " + this.apiKey)
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

