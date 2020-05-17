package com.clarifai.credentials;


import io.grpc.CallCredentials;
import io.grpc.Metadata;

import java.util.concurrent.Executor;

public class ClarifaiCallCredentials extends CallCredentials {

  private final String apiKey;

  public ClarifaiCallCredentials() {
    this(System.getenv("CLARIFAI_API_KEY"));
  }

  public ClarifaiCallCredentials(String apiKey) {
    this.apiKey = apiKey;
  }

  public String getApiKey() {
    return apiKey;
  }

  @Override
  public void applyRequestMetadata(RequestInfo requestInfo, Executor appExecutor, MetadataApplier applier) {
    appExecutor.execute(() -> {
      Metadata headers = new Metadata();
      Metadata.Key<String> authorization = Metadata.Key.of(
          "authorization", Metadata.ASCII_STRING_MARSHALLER
      );
      headers.put(authorization, "Key " + this.apiKey);
      applier.apply(headers);
    });
  }

  @Override
  public void thisUsesUnstableApi() {
  }
}
