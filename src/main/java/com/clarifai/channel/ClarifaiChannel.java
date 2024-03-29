package com.clarifai.channel;

import com.clarifai.channel.http.ClarifaiHttpClient;
import com.google.protobuf.Message;
import io.grpc.ManagedChannel;
import io.grpc.MethodDescriptor;
import io.grpc.netty.shaded.io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;
import io.grpc.netty.shaded.io.netty.handler.ssl.util.InsecureTrustManagerFactory;

import javax.net.ssl.SSLException;

public enum ClarifaiChannel {

  INSTANCE;

  public static final int MAX_MESSAGE_LENGTH = 128 * 1024 * 1024; // 128MB

  private enum MarshallerType {
    PROTO,
    JSON,
  }

  private MarshallerType marshallerType = MarshallerType.PROTO;

  public ManagedChannel getGrpcChannel() {
    String base = System.getenv("CLARIFAI_GRPC_BASE");
    if (base == null)
      base = "api.clarifai.com";
    return getGrpcChannel(base);
  }

  public ManagedChannel getGrpcChannel(String base) {
    try {
      marshallerType = MarshallerType.PROTO;
      return NettyChannelBuilder
          .forAddress(base, 443)
          .maxInboundMessageSize(MAX_MESSAGE_LENGTH)
          .sslContext(
              GrpcSslContexts.forClient()
                  .trustManager(InsecureTrustManagerFactory.INSTANCE)
                  .build()
          )
          .build();
    } catch (SSLException e) {
      // This should never happen.
      throw new RuntimeException(e);
    }
  }

  public ManagedChannel getInsecureGrpcChannel() {
    marshallerType = MarshallerType.PROTO;
    return NettyChannelBuilder
        .forAddress("api-grpc.clarifai.com", 18080)
        .usePlaintext()
        .maxInboundMessageSize(MAX_MESSAGE_LENGTH)
        .build();
  }

  public JsonChannel getJsonChannel() {
    return getJsonChannel(new ClarifaiHttpClient.Default());
  }

  public JsonChannel getJsonChannel(ClarifaiHttpClient clarifaiHttpClient) {
    marshallerType = MarshallerType.JSON;
    return new JsonChannel(clarifaiHttpClient);
  }

  public static <T extends Message> MethodDescriptor.Marshaller<T> marshaller(
      final T defaultInstance
  ) {
    switch (ClarifaiChannel.INSTANCE.marshallerType) {
      case PROTO: {
        return io.grpc.protobuf.ProtoUtils.marshaller(defaultInstance);
      }
      case JSON: {
        return JsonMarshaller.jsonMarshaller(defaultInstance);
      }
      default: {
        throw new RuntimeException(
            "Unhandled marshaller type " + ClarifaiChannel.INSTANCE.marshallerType
        );
      }
    }
  }
}
