package com.clarifai.channel;

import com.clarifai.channel.http.ClarifaiHttpClient;
import com.clarifai.credentials.ClarifaiCallCredentials;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import io.grpc.*;

import javax.annotation.Nullable;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class JsonChannel extends io.grpc.Channel {

  private final ClarifaiHttpClient clarifaiHttpClient;

  JsonChannel(ClarifaiHttpClient clarifaiHttpClient) {
    this.clarifaiHttpClient = clarifaiHttpClient;
  }

  @Override
  public <RequestT, ResponseT> ClientCall<RequestT, ResponseT> newCall(
      MethodDescriptor<RequestT, ResponseT> methodDescriptor, CallOptions callOptions
  ) {
    ClarifaiCallCredentials credentials = (ClarifaiCallCredentials) callOptions.getCredentials();

    return new JsonClientCall<>(clarifaiHttpClient, methodDescriptor, credentials.getApiKey());
  }

  @Override
  public String authority() {
    return null;
  }

  private class JsonClientCall<RequestT, ResponseT> extends ClientCall<RequestT, ResponseT> {

    private final ClarifaiHttpClient clarifaiHttpClient;
    private final MethodDescriptor<RequestT, ResponseT> methodDescriptor;
    private final String apiKey;

    private Listener<ResponseT> responseListener;

    JsonClientCall(
        ClarifaiHttpClient clarifaiHttpClient,
        MethodDescriptor<RequestT, ResponseT> methodDescriptor,
        String apiKey
    ) {
      this.clarifaiHttpClient = clarifaiHttpClient;
      this.methodDescriptor = methodDescriptor;
      this.apiKey = apiKey;
    }

    @Override
    public void start(Listener<ResponseT> responseListener, Metadata headers) {
      responseListener.onReady();
      this.responseListener = responseListener;
    }

    @Override
    public void request(int numMessages) {
      // This never gets called.
    }

    @Override
    public void cancel(@Nullable String message, @Nullable Throwable cause) {
      // This never gets called.
    }

    @Override
    public void halfClose() {
      // This never gets called.
    }

    @Override
    public void sendMessage(Object message) {
      InputStream stream = methodDescriptor.getRequestMarshaller().stream((RequestT) message);

      String fullRequestString = streamToString(stream);

      JsonObject request = new Gson().fromJson(fullRequestString, JsonObject.class);
      JsonEndpoint<RequestT, ResponseT>.Endpoint endpoint = new JsonEndpoint<>(
          methodDescriptor, request
      ).pickProperEndpoint();

      for (String urlField : endpoint.getUrlFields()) {
        request.remove(urlField);
      }

      String responseString = clarifaiHttpClient.executeRequest(
          apiKey,
          endpoint.getUrl(),
          endpoint.getMethod(),
          new Gson().toJson(request)
      );

      ResponseT responseObject = methodDescriptor.getResponseMarshaller().parse(
          new ByteArrayInputStream(responseString.getBytes(StandardCharsets.UTF_8))
      );
      responseListener.onMessage(responseObject);
      responseListener.onClose(Status.OK, new Metadata());
    }

    private String streamToString(InputStream stream) {
      java.util.Scanner s = new java.util.Scanner(stream, StandardCharsets.UTF_8)
          .useDelimiter("\\A");
      String requestString = s.hasNext() ? s.next() : "";
      s.close();
      return requestString;
    }
  }
}
