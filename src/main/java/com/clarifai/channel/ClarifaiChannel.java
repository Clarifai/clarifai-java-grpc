package com.clarifai.channel;

import com.google.protobuf.Message;
import io.grpc.ManagedChannel;
import io.grpc.MethodDescriptor;
import io.grpc.netty.shaded.io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;
import io.grpc.netty.shaded.io.netty.handler.ssl.util.InsecureTrustManagerFactory;

import javax.net.ssl.SSLException;

public enum ClarifaiChannel {

  INSTANCE;

  private enum MarshallerType {
    PROTO,
    JSON,
  }

  private MarshallerType marshallerType = MarshallerType.PROTO;

  /**
   * Currently, the secure gRPC channel is not supported.
   *
   * @return
   * @throws SSLException
   */
  public ManagedChannel getGrpcChannel() throws SSLException {
    marshallerType = MarshallerType.PROTO;
    return NettyChannelBuilder
        .forAddress("api-grpc.clarifai.com", 18081)
        .sslContext(
            GrpcSslContexts.forClient()
                .trustManager(InsecureTrustManagerFactory.INSTANCE)
                .build()
        )
        .build();
  }

  public ManagedChannel getInsecureGrpcChannel() {
    marshallerType = MarshallerType.PROTO;
    return NettyChannelBuilder
        .forAddress("api-grpc.clarifai.com", 18080)
        .usePlaintext()
        .build();
  }

  public JsonChannel getJsonChannel() {
    marshallerType = MarshallerType.JSON;
    return new JsonChannel();
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
