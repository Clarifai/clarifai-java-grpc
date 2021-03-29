package com.clarifai.grpc.api;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.27.2)",
    comments = "Source: proto/clarifai/api/service.proto")
public final class V2Grpc {

  private V2Grpc() {}

  public static final String SERVICE_NAME = "clarifai.api.V2";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListConceptRelationsRequest,
      com.clarifai.grpc.api.MultiConceptRelationResponse> getListConceptRelationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListConceptRelations",
      requestType = com.clarifai.grpc.api.ListConceptRelationsRequest.class,
      responseType = com.clarifai.grpc.api.MultiConceptRelationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListConceptRelationsRequest,
      com.clarifai.grpc.api.MultiConceptRelationResponse> getListConceptRelationsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListConceptRelationsRequest, com.clarifai.grpc.api.MultiConceptRelationResponse> getListConceptRelationsMethod;
    if ((getListConceptRelationsMethod = V2Grpc.getListConceptRelationsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListConceptRelationsMethod = V2Grpc.getListConceptRelationsMethod) == null) {
          V2Grpc.getListConceptRelationsMethod = getListConceptRelationsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListConceptRelationsRequest, com.clarifai.grpc.api.MultiConceptRelationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListConceptRelations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListConceptRelationsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiConceptRelationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListConceptRelations"))
              .build();
        }
      }
    }
    return getListConceptRelationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostConceptRelationsRequest,
      com.clarifai.grpc.api.MultiConceptRelationResponse> getPostConceptRelationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostConceptRelations",
      requestType = com.clarifai.grpc.api.PostConceptRelationsRequest.class,
      responseType = com.clarifai.grpc.api.MultiConceptRelationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostConceptRelationsRequest,
      com.clarifai.grpc.api.MultiConceptRelationResponse> getPostConceptRelationsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostConceptRelationsRequest, com.clarifai.grpc.api.MultiConceptRelationResponse> getPostConceptRelationsMethod;
    if ((getPostConceptRelationsMethod = V2Grpc.getPostConceptRelationsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostConceptRelationsMethod = V2Grpc.getPostConceptRelationsMethod) == null) {
          V2Grpc.getPostConceptRelationsMethod = getPostConceptRelationsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostConceptRelationsRequest, com.clarifai.grpc.api.MultiConceptRelationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostConceptRelations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostConceptRelationsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiConceptRelationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostConceptRelations"))
              .build();
        }
      }
    }
    return getPostConceptRelationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteConceptRelationsRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteConceptRelationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteConceptRelations",
      requestType = com.clarifai.grpc.api.DeleteConceptRelationsRequest.class,
      responseType = com.clarifai.grpc.api.status.BaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteConceptRelationsRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteConceptRelationsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteConceptRelationsRequest, com.clarifai.grpc.api.status.BaseResponse> getDeleteConceptRelationsMethod;
    if ((getDeleteConceptRelationsMethod = V2Grpc.getDeleteConceptRelationsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getDeleteConceptRelationsMethod = V2Grpc.getDeleteConceptRelationsMethod) == null) {
          V2Grpc.getDeleteConceptRelationsMethod = getDeleteConceptRelationsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.DeleteConceptRelationsRequest, com.clarifai.grpc.api.status.BaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteConceptRelations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.DeleteConceptRelationsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.status.BaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("DeleteConceptRelations"))
              .build();
        }
      }
    }
    return getDeleteConceptRelationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetConceptCountsRequest,
      com.clarifai.grpc.api.MultiConceptCountResponse> getGetConceptCountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetConceptCounts",
      requestType = com.clarifai.grpc.api.GetConceptCountsRequest.class,
      responseType = com.clarifai.grpc.api.MultiConceptCountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetConceptCountsRequest,
      com.clarifai.grpc.api.MultiConceptCountResponse> getGetConceptCountsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetConceptCountsRequest, com.clarifai.grpc.api.MultiConceptCountResponse> getGetConceptCountsMethod;
    if ((getGetConceptCountsMethod = V2Grpc.getGetConceptCountsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getGetConceptCountsMethod = V2Grpc.getGetConceptCountsMethod) == null) {
          V2Grpc.getGetConceptCountsMethod = getGetConceptCountsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.GetConceptCountsRequest, com.clarifai.grpc.api.MultiConceptCountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetConceptCounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.GetConceptCountsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiConceptCountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("GetConceptCounts"))
              .build();
        }
      }
    }
    return getGetConceptCountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetConceptRequest,
      com.clarifai.grpc.api.SingleConceptResponse> getGetConceptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetConcept",
      requestType = com.clarifai.grpc.api.GetConceptRequest.class,
      responseType = com.clarifai.grpc.api.SingleConceptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetConceptRequest,
      com.clarifai.grpc.api.SingleConceptResponse> getGetConceptMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetConceptRequest, com.clarifai.grpc.api.SingleConceptResponse> getGetConceptMethod;
    if ((getGetConceptMethod = V2Grpc.getGetConceptMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getGetConceptMethod = V2Grpc.getGetConceptMethod) == null) {
          V2Grpc.getGetConceptMethod = getGetConceptMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.GetConceptRequest, com.clarifai.grpc.api.SingleConceptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetConcept"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.GetConceptRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleConceptResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("GetConcept"))
              .build();
        }
      }
    }
    return getGetConceptMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListConceptsRequest,
      com.clarifai.grpc.api.MultiConceptResponse> getListConceptsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListConcepts",
      requestType = com.clarifai.grpc.api.ListConceptsRequest.class,
      responseType = com.clarifai.grpc.api.MultiConceptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListConceptsRequest,
      com.clarifai.grpc.api.MultiConceptResponse> getListConceptsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListConceptsRequest, com.clarifai.grpc.api.MultiConceptResponse> getListConceptsMethod;
    if ((getListConceptsMethod = V2Grpc.getListConceptsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListConceptsMethod = V2Grpc.getListConceptsMethod) == null) {
          V2Grpc.getListConceptsMethod = getListConceptsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListConceptsRequest, com.clarifai.grpc.api.MultiConceptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListConcepts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListConceptsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiConceptResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListConcepts"))
              .build();
        }
      }
    }
    return getListConceptsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostConceptsSearchesRequest,
      com.clarifai.grpc.api.MultiConceptResponse> getPostConceptsSearchesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostConceptsSearches",
      requestType = com.clarifai.grpc.api.PostConceptsSearchesRequest.class,
      responseType = com.clarifai.grpc.api.MultiConceptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostConceptsSearchesRequest,
      com.clarifai.grpc.api.MultiConceptResponse> getPostConceptsSearchesMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostConceptsSearchesRequest, com.clarifai.grpc.api.MultiConceptResponse> getPostConceptsSearchesMethod;
    if ((getPostConceptsSearchesMethod = V2Grpc.getPostConceptsSearchesMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostConceptsSearchesMethod = V2Grpc.getPostConceptsSearchesMethod) == null) {
          V2Grpc.getPostConceptsSearchesMethod = getPostConceptsSearchesMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostConceptsSearchesRequest, com.clarifai.grpc.api.MultiConceptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostConceptsSearches"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostConceptsSearchesRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiConceptResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostConceptsSearches"))
              .build();
        }
      }
    }
    return getPostConceptsSearchesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostConceptsRequest,
      com.clarifai.grpc.api.MultiConceptResponse> getPostConceptsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostConcepts",
      requestType = com.clarifai.grpc.api.PostConceptsRequest.class,
      responseType = com.clarifai.grpc.api.MultiConceptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostConceptsRequest,
      com.clarifai.grpc.api.MultiConceptResponse> getPostConceptsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostConceptsRequest, com.clarifai.grpc.api.MultiConceptResponse> getPostConceptsMethod;
    if ((getPostConceptsMethod = V2Grpc.getPostConceptsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostConceptsMethod = V2Grpc.getPostConceptsMethod) == null) {
          V2Grpc.getPostConceptsMethod = getPostConceptsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostConceptsRequest, com.clarifai.grpc.api.MultiConceptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostConcepts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostConceptsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiConceptResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostConcepts"))
              .build();
        }
      }
    }
    return getPostConceptsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchConceptsRequest,
      com.clarifai.grpc.api.MultiConceptResponse> getPatchConceptsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PatchConcepts",
      requestType = com.clarifai.grpc.api.PatchConceptsRequest.class,
      responseType = com.clarifai.grpc.api.MultiConceptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchConceptsRequest,
      com.clarifai.grpc.api.MultiConceptResponse> getPatchConceptsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchConceptsRequest, com.clarifai.grpc.api.MultiConceptResponse> getPatchConceptsMethod;
    if ((getPatchConceptsMethod = V2Grpc.getPatchConceptsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPatchConceptsMethod = V2Grpc.getPatchConceptsMethod) == null) {
          V2Grpc.getPatchConceptsMethod = getPatchConceptsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PatchConceptsRequest, com.clarifai.grpc.api.MultiConceptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PatchConcepts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PatchConceptsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiConceptResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PatchConcepts"))
              .build();
        }
      }
    }
    return getPatchConceptsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetConceptLanguageRequest,
      com.clarifai.grpc.api.SingleConceptLanguageResponse> getGetConceptLanguageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetConceptLanguage",
      requestType = com.clarifai.grpc.api.GetConceptLanguageRequest.class,
      responseType = com.clarifai.grpc.api.SingleConceptLanguageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetConceptLanguageRequest,
      com.clarifai.grpc.api.SingleConceptLanguageResponse> getGetConceptLanguageMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetConceptLanguageRequest, com.clarifai.grpc.api.SingleConceptLanguageResponse> getGetConceptLanguageMethod;
    if ((getGetConceptLanguageMethod = V2Grpc.getGetConceptLanguageMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getGetConceptLanguageMethod = V2Grpc.getGetConceptLanguageMethod) == null) {
          V2Grpc.getGetConceptLanguageMethod = getGetConceptLanguageMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.GetConceptLanguageRequest, com.clarifai.grpc.api.SingleConceptLanguageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetConceptLanguage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.GetConceptLanguageRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleConceptLanguageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("GetConceptLanguage"))
              .build();
        }
      }
    }
    return getGetConceptLanguageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListConceptLanguagesRequest,
      com.clarifai.grpc.api.MultiConceptLanguageResponse> getListConceptLanguagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListConceptLanguages",
      requestType = com.clarifai.grpc.api.ListConceptLanguagesRequest.class,
      responseType = com.clarifai.grpc.api.MultiConceptLanguageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListConceptLanguagesRequest,
      com.clarifai.grpc.api.MultiConceptLanguageResponse> getListConceptLanguagesMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListConceptLanguagesRequest, com.clarifai.grpc.api.MultiConceptLanguageResponse> getListConceptLanguagesMethod;
    if ((getListConceptLanguagesMethod = V2Grpc.getListConceptLanguagesMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListConceptLanguagesMethod = V2Grpc.getListConceptLanguagesMethod) == null) {
          V2Grpc.getListConceptLanguagesMethod = getListConceptLanguagesMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListConceptLanguagesRequest, com.clarifai.grpc.api.MultiConceptLanguageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListConceptLanguages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListConceptLanguagesRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiConceptLanguageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListConceptLanguages"))
              .build();
        }
      }
    }
    return getListConceptLanguagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostConceptLanguagesRequest,
      com.clarifai.grpc.api.MultiConceptLanguageResponse> getPostConceptLanguagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostConceptLanguages",
      requestType = com.clarifai.grpc.api.PostConceptLanguagesRequest.class,
      responseType = com.clarifai.grpc.api.MultiConceptLanguageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostConceptLanguagesRequest,
      com.clarifai.grpc.api.MultiConceptLanguageResponse> getPostConceptLanguagesMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostConceptLanguagesRequest, com.clarifai.grpc.api.MultiConceptLanguageResponse> getPostConceptLanguagesMethod;
    if ((getPostConceptLanguagesMethod = V2Grpc.getPostConceptLanguagesMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostConceptLanguagesMethod = V2Grpc.getPostConceptLanguagesMethod) == null) {
          V2Grpc.getPostConceptLanguagesMethod = getPostConceptLanguagesMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostConceptLanguagesRequest, com.clarifai.grpc.api.MultiConceptLanguageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostConceptLanguages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostConceptLanguagesRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiConceptLanguageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostConceptLanguages"))
              .build();
        }
      }
    }
    return getPostConceptLanguagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchConceptLanguagesRequest,
      com.clarifai.grpc.api.MultiConceptLanguageResponse> getPatchConceptLanguagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PatchConceptLanguages",
      requestType = com.clarifai.grpc.api.PatchConceptLanguagesRequest.class,
      responseType = com.clarifai.grpc.api.MultiConceptLanguageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchConceptLanguagesRequest,
      com.clarifai.grpc.api.MultiConceptLanguageResponse> getPatchConceptLanguagesMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchConceptLanguagesRequest, com.clarifai.grpc.api.MultiConceptLanguageResponse> getPatchConceptLanguagesMethod;
    if ((getPatchConceptLanguagesMethod = V2Grpc.getPatchConceptLanguagesMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPatchConceptLanguagesMethod = V2Grpc.getPatchConceptLanguagesMethod) == null) {
          V2Grpc.getPatchConceptLanguagesMethod = getPatchConceptLanguagesMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PatchConceptLanguagesRequest, com.clarifai.grpc.api.MultiConceptLanguageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PatchConceptLanguages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PatchConceptLanguagesRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiConceptLanguageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PatchConceptLanguages"))
              .build();
        }
      }
    }
    return getPatchConceptLanguagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListKnowledgeGraphsRequest,
      com.clarifai.grpc.api.MultiKnowledgeGraphResponse> getListKnowledgeGraphsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListKnowledgeGraphs",
      requestType = com.clarifai.grpc.api.ListKnowledgeGraphsRequest.class,
      responseType = com.clarifai.grpc.api.MultiKnowledgeGraphResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListKnowledgeGraphsRequest,
      com.clarifai.grpc.api.MultiKnowledgeGraphResponse> getListKnowledgeGraphsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListKnowledgeGraphsRequest, com.clarifai.grpc.api.MultiKnowledgeGraphResponse> getListKnowledgeGraphsMethod;
    if ((getListKnowledgeGraphsMethod = V2Grpc.getListKnowledgeGraphsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListKnowledgeGraphsMethod = V2Grpc.getListKnowledgeGraphsMethod) == null) {
          V2Grpc.getListKnowledgeGraphsMethod = getListKnowledgeGraphsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListKnowledgeGraphsRequest, com.clarifai.grpc.api.MultiKnowledgeGraphResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListKnowledgeGraphs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListKnowledgeGraphsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiKnowledgeGraphResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListKnowledgeGraphs"))
              .build();
        }
      }
    }
    return getListKnowledgeGraphsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostKnowledgeGraphsRequest,
      com.clarifai.grpc.api.MultiKnowledgeGraphResponse> getPostKnowledgeGraphsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostKnowledgeGraphs",
      requestType = com.clarifai.grpc.api.PostKnowledgeGraphsRequest.class,
      responseType = com.clarifai.grpc.api.MultiKnowledgeGraphResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostKnowledgeGraphsRequest,
      com.clarifai.grpc.api.MultiKnowledgeGraphResponse> getPostKnowledgeGraphsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostKnowledgeGraphsRequest, com.clarifai.grpc.api.MultiKnowledgeGraphResponse> getPostKnowledgeGraphsMethod;
    if ((getPostKnowledgeGraphsMethod = V2Grpc.getPostKnowledgeGraphsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostKnowledgeGraphsMethod = V2Grpc.getPostKnowledgeGraphsMethod) == null) {
          V2Grpc.getPostKnowledgeGraphsMethod = getPostKnowledgeGraphsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostKnowledgeGraphsRequest, com.clarifai.grpc.api.MultiKnowledgeGraphResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostKnowledgeGraphs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostKnowledgeGraphsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiKnowledgeGraphResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostKnowledgeGraphs"))
              .build();
        }
      }
    }
    return getPostKnowledgeGraphsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostConceptMappingJobsRequest,
      com.clarifai.grpc.api.MultiConceptMappingJobResponse> getPostConceptMappingJobsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostConceptMappingJobs",
      requestType = com.clarifai.grpc.api.PostConceptMappingJobsRequest.class,
      responseType = com.clarifai.grpc.api.MultiConceptMappingJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostConceptMappingJobsRequest,
      com.clarifai.grpc.api.MultiConceptMappingJobResponse> getPostConceptMappingJobsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostConceptMappingJobsRequest, com.clarifai.grpc.api.MultiConceptMappingJobResponse> getPostConceptMappingJobsMethod;
    if ((getPostConceptMappingJobsMethod = V2Grpc.getPostConceptMappingJobsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostConceptMappingJobsMethod = V2Grpc.getPostConceptMappingJobsMethod) == null) {
          V2Grpc.getPostConceptMappingJobsMethod = getPostConceptMappingJobsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostConceptMappingJobsRequest, com.clarifai.grpc.api.MultiConceptMappingJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostConceptMappingJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostConceptMappingJobsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiConceptMappingJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostConceptMappingJobs"))
              .build();
        }
      }
    }
    return getPostConceptMappingJobsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetAnnotationRequest,
      com.clarifai.grpc.api.SingleAnnotationResponse> getGetAnnotationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAnnotation",
      requestType = com.clarifai.grpc.api.GetAnnotationRequest.class,
      responseType = com.clarifai.grpc.api.SingleAnnotationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetAnnotationRequest,
      com.clarifai.grpc.api.SingleAnnotationResponse> getGetAnnotationMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetAnnotationRequest, com.clarifai.grpc.api.SingleAnnotationResponse> getGetAnnotationMethod;
    if ((getGetAnnotationMethod = V2Grpc.getGetAnnotationMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getGetAnnotationMethod = V2Grpc.getGetAnnotationMethod) == null) {
          V2Grpc.getGetAnnotationMethod = getGetAnnotationMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.GetAnnotationRequest, com.clarifai.grpc.api.SingleAnnotationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAnnotation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.GetAnnotationRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleAnnotationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("GetAnnotation"))
              .build();
        }
      }
    }
    return getGetAnnotationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListAnnotationsRequest,
      com.clarifai.grpc.api.MultiAnnotationResponse> getListAnnotationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAnnotations",
      requestType = com.clarifai.grpc.api.ListAnnotationsRequest.class,
      responseType = com.clarifai.grpc.api.MultiAnnotationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListAnnotationsRequest,
      com.clarifai.grpc.api.MultiAnnotationResponse> getListAnnotationsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListAnnotationsRequest, com.clarifai.grpc.api.MultiAnnotationResponse> getListAnnotationsMethod;
    if ((getListAnnotationsMethod = V2Grpc.getListAnnotationsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListAnnotationsMethod = V2Grpc.getListAnnotationsMethod) == null) {
          V2Grpc.getListAnnotationsMethod = getListAnnotationsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListAnnotationsRequest, com.clarifai.grpc.api.MultiAnnotationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAnnotations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListAnnotationsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiAnnotationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListAnnotations"))
              .build();
        }
      }
    }
    return getListAnnotationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostAnnotationsRequest,
      com.clarifai.grpc.api.MultiAnnotationResponse> getPostAnnotationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostAnnotations",
      requestType = com.clarifai.grpc.api.PostAnnotationsRequest.class,
      responseType = com.clarifai.grpc.api.MultiAnnotationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostAnnotationsRequest,
      com.clarifai.grpc.api.MultiAnnotationResponse> getPostAnnotationsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostAnnotationsRequest, com.clarifai.grpc.api.MultiAnnotationResponse> getPostAnnotationsMethod;
    if ((getPostAnnotationsMethod = V2Grpc.getPostAnnotationsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostAnnotationsMethod = V2Grpc.getPostAnnotationsMethod) == null) {
          V2Grpc.getPostAnnotationsMethod = getPostAnnotationsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostAnnotationsRequest, com.clarifai.grpc.api.MultiAnnotationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostAnnotations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostAnnotationsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiAnnotationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostAnnotations"))
              .build();
        }
      }
    }
    return getPostAnnotationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchAnnotationsRequest,
      com.clarifai.grpc.api.MultiAnnotationResponse> getPatchAnnotationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PatchAnnotations",
      requestType = com.clarifai.grpc.api.PatchAnnotationsRequest.class,
      responseType = com.clarifai.grpc.api.MultiAnnotationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchAnnotationsRequest,
      com.clarifai.grpc.api.MultiAnnotationResponse> getPatchAnnotationsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchAnnotationsRequest, com.clarifai.grpc.api.MultiAnnotationResponse> getPatchAnnotationsMethod;
    if ((getPatchAnnotationsMethod = V2Grpc.getPatchAnnotationsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPatchAnnotationsMethod = V2Grpc.getPatchAnnotationsMethod) == null) {
          V2Grpc.getPatchAnnotationsMethod = getPatchAnnotationsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PatchAnnotationsRequest, com.clarifai.grpc.api.MultiAnnotationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PatchAnnotations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PatchAnnotationsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiAnnotationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PatchAnnotations"))
              .build();
        }
      }
    }
    return getPatchAnnotationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchAnnotationsStatusRequest,
      com.clarifai.grpc.api.PatchAnnotationsStatusResponse> getPatchAnnotationsStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PatchAnnotationsStatus",
      requestType = com.clarifai.grpc.api.PatchAnnotationsStatusRequest.class,
      responseType = com.clarifai.grpc.api.PatchAnnotationsStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchAnnotationsStatusRequest,
      com.clarifai.grpc.api.PatchAnnotationsStatusResponse> getPatchAnnotationsStatusMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchAnnotationsStatusRequest, com.clarifai.grpc.api.PatchAnnotationsStatusResponse> getPatchAnnotationsStatusMethod;
    if ((getPatchAnnotationsStatusMethod = V2Grpc.getPatchAnnotationsStatusMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPatchAnnotationsStatusMethod = V2Grpc.getPatchAnnotationsStatusMethod) == null) {
          V2Grpc.getPatchAnnotationsStatusMethod = getPatchAnnotationsStatusMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PatchAnnotationsStatusRequest, com.clarifai.grpc.api.PatchAnnotationsStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PatchAnnotationsStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PatchAnnotationsStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PatchAnnotationsStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PatchAnnotationsStatus"))
              .build();
        }
      }
    }
    return getPatchAnnotationsStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteAnnotationRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteAnnotationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAnnotation",
      requestType = com.clarifai.grpc.api.DeleteAnnotationRequest.class,
      responseType = com.clarifai.grpc.api.status.BaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteAnnotationRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteAnnotationMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteAnnotationRequest, com.clarifai.grpc.api.status.BaseResponse> getDeleteAnnotationMethod;
    if ((getDeleteAnnotationMethod = V2Grpc.getDeleteAnnotationMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getDeleteAnnotationMethod = V2Grpc.getDeleteAnnotationMethod) == null) {
          V2Grpc.getDeleteAnnotationMethod = getDeleteAnnotationMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.DeleteAnnotationRequest, com.clarifai.grpc.api.status.BaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAnnotation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.DeleteAnnotationRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.status.BaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("DeleteAnnotation"))
              .build();
        }
      }
    }
    return getDeleteAnnotationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteAnnotationsRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteAnnotationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAnnotations",
      requestType = com.clarifai.grpc.api.DeleteAnnotationsRequest.class,
      responseType = com.clarifai.grpc.api.status.BaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteAnnotationsRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteAnnotationsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteAnnotationsRequest, com.clarifai.grpc.api.status.BaseResponse> getDeleteAnnotationsMethod;
    if ((getDeleteAnnotationsMethod = V2Grpc.getDeleteAnnotationsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getDeleteAnnotationsMethod = V2Grpc.getDeleteAnnotationsMethod) == null) {
          V2Grpc.getDeleteAnnotationsMethod = getDeleteAnnotationsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.DeleteAnnotationsRequest, com.clarifai.grpc.api.status.BaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAnnotations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.DeleteAnnotationsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.status.BaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("DeleteAnnotations"))
              .build();
        }
      }
    }
    return getDeleteAnnotationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostAnnotationsSearchesRequest,
      com.clarifai.grpc.api.MultiSearchResponse> getPostAnnotationsSearchesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostAnnotationsSearches",
      requestType = com.clarifai.grpc.api.PostAnnotationsSearchesRequest.class,
      responseType = com.clarifai.grpc.api.MultiSearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostAnnotationsSearchesRequest,
      com.clarifai.grpc.api.MultiSearchResponse> getPostAnnotationsSearchesMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostAnnotationsSearchesRequest, com.clarifai.grpc.api.MultiSearchResponse> getPostAnnotationsSearchesMethod;
    if ((getPostAnnotationsSearchesMethod = V2Grpc.getPostAnnotationsSearchesMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostAnnotationsSearchesMethod = V2Grpc.getPostAnnotationsSearchesMethod) == null) {
          V2Grpc.getPostAnnotationsSearchesMethod = getPostAnnotationsSearchesMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostAnnotationsSearchesRequest, com.clarifai.grpc.api.MultiSearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostAnnotationsSearches"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostAnnotationsSearchesRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiSearchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostAnnotationsSearches"))
              .build();
        }
      }
    }
    return getPostAnnotationsSearchesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetInputCountRequest,
      com.clarifai.grpc.api.SingleInputCountResponse> getGetInputCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInputCount",
      requestType = com.clarifai.grpc.api.GetInputCountRequest.class,
      responseType = com.clarifai.grpc.api.SingleInputCountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetInputCountRequest,
      com.clarifai.grpc.api.SingleInputCountResponse> getGetInputCountMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetInputCountRequest, com.clarifai.grpc.api.SingleInputCountResponse> getGetInputCountMethod;
    if ((getGetInputCountMethod = V2Grpc.getGetInputCountMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getGetInputCountMethod = V2Grpc.getGetInputCountMethod) == null) {
          V2Grpc.getGetInputCountMethod = getGetInputCountMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.GetInputCountRequest, com.clarifai.grpc.api.SingleInputCountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetInputCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.GetInputCountRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleInputCountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("GetInputCount"))
              .build();
        }
      }
    }
    return getGetInputCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.StreamInputsRequest,
      com.clarifai.grpc.api.MultiInputResponse> getStreamInputsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamInputs",
      requestType = com.clarifai.grpc.api.StreamInputsRequest.class,
      responseType = com.clarifai.grpc.api.MultiInputResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.StreamInputsRequest,
      com.clarifai.grpc.api.MultiInputResponse> getStreamInputsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.StreamInputsRequest, com.clarifai.grpc.api.MultiInputResponse> getStreamInputsMethod;
    if ((getStreamInputsMethod = V2Grpc.getStreamInputsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getStreamInputsMethod = V2Grpc.getStreamInputsMethod) == null) {
          V2Grpc.getStreamInputsMethod = getStreamInputsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.StreamInputsRequest, com.clarifai.grpc.api.MultiInputResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamInputs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.StreamInputsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiInputResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("StreamInputs"))
              .build();
        }
      }
    }
    return getStreamInputsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetInputSamplesRequest,
      com.clarifai.grpc.api.MultiInputAnnotationResponse> getGetInputSamplesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInputSamples",
      requestType = com.clarifai.grpc.api.GetInputSamplesRequest.class,
      responseType = com.clarifai.grpc.api.MultiInputAnnotationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetInputSamplesRequest,
      com.clarifai.grpc.api.MultiInputAnnotationResponse> getGetInputSamplesMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetInputSamplesRequest, com.clarifai.grpc.api.MultiInputAnnotationResponse> getGetInputSamplesMethod;
    if ((getGetInputSamplesMethod = V2Grpc.getGetInputSamplesMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getGetInputSamplesMethod = V2Grpc.getGetInputSamplesMethod) == null) {
          V2Grpc.getGetInputSamplesMethod = getGetInputSamplesMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.GetInputSamplesRequest, com.clarifai.grpc.api.MultiInputAnnotationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetInputSamples"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.GetInputSamplesRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiInputAnnotationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("GetInputSamples"))
              .build();
        }
      }
    }
    return getGetInputSamplesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetInputRequest,
      com.clarifai.grpc.api.SingleInputResponse> getGetInputMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInput",
      requestType = com.clarifai.grpc.api.GetInputRequest.class,
      responseType = com.clarifai.grpc.api.SingleInputResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetInputRequest,
      com.clarifai.grpc.api.SingleInputResponse> getGetInputMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetInputRequest, com.clarifai.grpc.api.SingleInputResponse> getGetInputMethod;
    if ((getGetInputMethod = V2Grpc.getGetInputMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getGetInputMethod = V2Grpc.getGetInputMethod) == null) {
          V2Grpc.getGetInputMethod = getGetInputMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.GetInputRequest, com.clarifai.grpc.api.SingleInputResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetInput"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.GetInputRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleInputResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("GetInput"))
              .build();
        }
      }
    }
    return getGetInputMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListInputsRequest,
      com.clarifai.grpc.api.MultiInputResponse> getListInputsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListInputs",
      requestType = com.clarifai.grpc.api.ListInputsRequest.class,
      responseType = com.clarifai.grpc.api.MultiInputResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListInputsRequest,
      com.clarifai.grpc.api.MultiInputResponse> getListInputsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListInputsRequest, com.clarifai.grpc.api.MultiInputResponse> getListInputsMethod;
    if ((getListInputsMethod = V2Grpc.getListInputsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListInputsMethod = V2Grpc.getListInputsMethod) == null) {
          V2Grpc.getListInputsMethod = getListInputsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListInputsRequest, com.clarifai.grpc.api.MultiInputResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListInputs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListInputsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiInputResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListInputs"))
              .build();
        }
      }
    }
    return getListInputsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostInputsRequest,
      com.clarifai.grpc.api.MultiInputResponse> getPostInputsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostInputs",
      requestType = com.clarifai.grpc.api.PostInputsRequest.class,
      responseType = com.clarifai.grpc.api.MultiInputResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostInputsRequest,
      com.clarifai.grpc.api.MultiInputResponse> getPostInputsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostInputsRequest, com.clarifai.grpc.api.MultiInputResponse> getPostInputsMethod;
    if ((getPostInputsMethod = V2Grpc.getPostInputsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostInputsMethod = V2Grpc.getPostInputsMethod) == null) {
          V2Grpc.getPostInputsMethod = getPostInputsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostInputsRequest, com.clarifai.grpc.api.MultiInputResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostInputs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostInputsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiInputResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostInputs"))
              .build();
        }
      }
    }
    return getPostInputsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchInputsRequest,
      com.clarifai.grpc.api.MultiInputResponse> getPatchInputsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PatchInputs",
      requestType = com.clarifai.grpc.api.PatchInputsRequest.class,
      responseType = com.clarifai.grpc.api.MultiInputResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchInputsRequest,
      com.clarifai.grpc.api.MultiInputResponse> getPatchInputsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchInputsRequest, com.clarifai.grpc.api.MultiInputResponse> getPatchInputsMethod;
    if ((getPatchInputsMethod = V2Grpc.getPatchInputsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPatchInputsMethod = V2Grpc.getPatchInputsMethod) == null) {
          V2Grpc.getPatchInputsMethod = getPatchInputsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PatchInputsRequest, com.clarifai.grpc.api.MultiInputResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PatchInputs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PatchInputsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiInputResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PatchInputs"))
              .build();
        }
      }
    }
    return getPatchInputsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteInputRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteInputMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteInput",
      requestType = com.clarifai.grpc.api.DeleteInputRequest.class,
      responseType = com.clarifai.grpc.api.status.BaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteInputRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteInputMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteInputRequest, com.clarifai.grpc.api.status.BaseResponse> getDeleteInputMethod;
    if ((getDeleteInputMethod = V2Grpc.getDeleteInputMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getDeleteInputMethod = V2Grpc.getDeleteInputMethod) == null) {
          V2Grpc.getDeleteInputMethod = getDeleteInputMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.DeleteInputRequest, com.clarifai.grpc.api.status.BaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteInput"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.DeleteInputRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.status.BaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("DeleteInput"))
              .build();
        }
      }
    }
    return getDeleteInputMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteInputsRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteInputsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteInputs",
      requestType = com.clarifai.grpc.api.DeleteInputsRequest.class,
      responseType = com.clarifai.grpc.api.status.BaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteInputsRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteInputsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteInputsRequest, com.clarifai.grpc.api.status.BaseResponse> getDeleteInputsMethod;
    if ((getDeleteInputsMethod = V2Grpc.getDeleteInputsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getDeleteInputsMethod = V2Grpc.getDeleteInputsMethod) == null) {
          V2Grpc.getDeleteInputsMethod = getDeleteInputsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.DeleteInputsRequest, com.clarifai.grpc.api.status.BaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteInputs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.DeleteInputsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.status.BaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("DeleteInputs"))
              .build();
        }
      }
    }
    return getDeleteInputsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostInputsSearchesRequest,
      com.clarifai.grpc.api.MultiSearchResponse> getPostInputsSearchesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostInputsSearches",
      requestType = com.clarifai.grpc.api.PostInputsSearchesRequest.class,
      responseType = com.clarifai.grpc.api.MultiSearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostInputsSearchesRequest,
      com.clarifai.grpc.api.MultiSearchResponse> getPostInputsSearchesMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostInputsSearchesRequest, com.clarifai.grpc.api.MultiSearchResponse> getPostInputsSearchesMethod;
    if ((getPostInputsSearchesMethod = V2Grpc.getPostInputsSearchesMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostInputsSearchesMethod = V2Grpc.getPostInputsSearchesMethod) == null) {
          V2Grpc.getPostInputsSearchesMethod = getPostInputsSearchesMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostInputsSearchesRequest, com.clarifai.grpc.api.MultiSearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostInputsSearches"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostInputsSearchesRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiSearchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostInputsSearches"))
              .build();
        }
      }
    }
    return getPostInputsSearchesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostModelOutputsRequest,
      com.clarifai.grpc.api.MultiOutputResponse> getPostModelOutputsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostModelOutputs",
      requestType = com.clarifai.grpc.api.PostModelOutputsRequest.class,
      responseType = com.clarifai.grpc.api.MultiOutputResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostModelOutputsRequest,
      com.clarifai.grpc.api.MultiOutputResponse> getPostModelOutputsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostModelOutputsRequest, com.clarifai.grpc.api.MultiOutputResponse> getPostModelOutputsMethod;
    if ((getPostModelOutputsMethod = V2Grpc.getPostModelOutputsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostModelOutputsMethod = V2Grpc.getPostModelOutputsMethod) == null) {
          V2Grpc.getPostModelOutputsMethod = getPostModelOutputsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostModelOutputsRequest, com.clarifai.grpc.api.MultiOutputResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostModelOutputs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostModelOutputsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiOutputResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostModelOutputs"))
              .build();
        }
      }
    }
    return getPostModelOutputsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetModelTypeRequest,
      com.clarifai.grpc.api.SingleModelTypeResponse> getGetModelTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetModelType",
      requestType = com.clarifai.grpc.api.GetModelTypeRequest.class,
      responseType = com.clarifai.grpc.api.SingleModelTypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetModelTypeRequest,
      com.clarifai.grpc.api.SingleModelTypeResponse> getGetModelTypeMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetModelTypeRequest, com.clarifai.grpc.api.SingleModelTypeResponse> getGetModelTypeMethod;
    if ((getGetModelTypeMethod = V2Grpc.getGetModelTypeMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getGetModelTypeMethod = V2Grpc.getGetModelTypeMethod) == null) {
          V2Grpc.getGetModelTypeMethod = getGetModelTypeMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.GetModelTypeRequest, com.clarifai.grpc.api.SingleModelTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetModelType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.GetModelTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleModelTypeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("GetModelType"))
              .build();
        }
      }
    }
    return getGetModelTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListModelTypesRequest,
      com.clarifai.grpc.api.MultiModelTypeResponse> getListModelTypesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListModelTypes",
      requestType = com.clarifai.grpc.api.ListModelTypesRequest.class,
      responseType = com.clarifai.grpc.api.MultiModelTypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListModelTypesRequest,
      com.clarifai.grpc.api.MultiModelTypeResponse> getListModelTypesMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListModelTypesRequest, com.clarifai.grpc.api.MultiModelTypeResponse> getListModelTypesMethod;
    if ((getListModelTypesMethod = V2Grpc.getListModelTypesMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListModelTypesMethod = V2Grpc.getListModelTypesMethod) == null) {
          V2Grpc.getListModelTypesMethod = getListModelTypesMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListModelTypesRequest, com.clarifai.grpc.api.MultiModelTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListModelTypes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListModelTypesRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiModelTypeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListModelTypes"))
              .build();
        }
      }
    }
    return getListModelTypesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetModelRequest,
      com.clarifai.grpc.api.SingleModelResponse> getGetModelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetModel",
      requestType = com.clarifai.grpc.api.GetModelRequest.class,
      responseType = com.clarifai.grpc.api.SingleModelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetModelRequest,
      com.clarifai.grpc.api.SingleModelResponse> getGetModelMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetModelRequest, com.clarifai.grpc.api.SingleModelResponse> getGetModelMethod;
    if ((getGetModelMethod = V2Grpc.getGetModelMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getGetModelMethod = V2Grpc.getGetModelMethod) == null) {
          V2Grpc.getGetModelMethod = getGetModelMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.GetModelRequest, com.clarifai.grpc.api.SingleModelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetModel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.GetModelRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleModelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("GetModel"))
              .build();
        }
      }
    }
    return getGetModelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetModelRequest,
      com.clarifai.grpc.api.SingleModelResponse> getGetModelOutputInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetModelOutputInfo",
      requestType = com.clarifai.grpc.api.GetModelRequest.class,
      responseType = com.clarifai.grpc.api.SingleModelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetModelRequest,
      com.clarifai.grpc.api.SingleModelResponse> getGetModelOutputInfoMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetModelRequest, com.clarifai.grpc.api.SingleModelResponse> getGetModelOutputInfoMethod;
    if ((getGetModelOutputInfoMethod = V2Grpc.getGetModelOutputInfoMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getGetModelOutputInfoMethod = V2Grpc.getGetModelOutputInfoMethod) == null) {
          V2Grpc.getGetModelOutputInfoMethod = getGetModelOutputInfoMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.GetModelRequest, com.clarifai.grpc.api.SingleModelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetModelOutputInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.GetModelRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleModelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("GetModelOutputInfo"))
              .build();
        }
      }
    }
    return getGetModelOutputInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListModelsRequest,
      com.clarifai.grpc.api.MultiModelResponse> getListModelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListModels",
      requestType = com.clarifai.grpc.api.ListModelsRequest.class,
      responseType = com.clarifai.grpc.api.MultiModelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListModelsRequest,
      com.clarifai.grpc.api.MultiModelResponse> getListModelsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListModelsRequest, com.clarifai.grpc.api.MultiModelResponse> getListModelsMethod;
    if ((getListModelsMethod = V2Grpc.getListModelsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListModelsMethod = V2Grpc.getListModelsMethod) == null) {
          V2Grpc.getListModelsMethod = getListModelsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListModelsRequest, com.clarifai.grpc.api.MultiModelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListModels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListModelsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiModelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListModels"))
              .build();
        }
      }
    }
    return getListModelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostModelsSearchesRequest,
      com.clarifai.grpc.api.MultiModelResponse> getPostModelsSearchesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostModelsSearches",
      requestType = com.clarifai.grpc.api.PostModelsSearchesRequest.class,
      responseType = com.clarifai.grpc.api.MultiModelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostModelsSearchesRequest,
      com.clarifai.grpc.api.MultiModelResponse> getPostModelsSearchesMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostModelsSearchesRequest, com.clarifai.grpc.api.MultiModelResponse> getPostModelsSearchesMethod;
    if ((getPostModelsSearchesMethod = V2Grpc.getPostModelsSearchesMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostModelsSearchesMethod = V2Grpc.getPostModelsSearchesMethod) == null) {
          V2Grpc.getPostModelsSearchesMethod = getPostModelsSearchesMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostModelsSearchesRequest, com.clarifai.grpc.api.MultiModelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostModelsSearches"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostModelsSearchesRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiModelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostModelsSearches"))
              .build();
        }
      }
    }
    return getPostModelsSearchesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostModelsRequest,
      com.clarifai.grpc.api.SingleModelResponse> getPostModelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostModels",
      requestType = com.clarifai.grpc.api.PostModelsRequest.class,
      responseType = com.clarifai.grpc.api.SingleModelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostModelsRequest,
      com.clarifai.grpc.api.SingleModelResponse> getPostModelsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostModelsRequest, com.clarifai.grpc.api.SingleModelResponse> getPostModelsMethod;
    if ((getPostModelsMethod = V2Grpc.getPostModelsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostModelsMethod = V2Grpc.getPostModelsMethod) == null) {
          V2Grpc.getPostModelsMethod = getPostModelsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostModelsRequest, com.clarifai.grpc.api.SingleModelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostModels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostModelsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleModelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostModels"))
              .build();
        }
      }
    }
    return getPostModelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchModelsRequest,
      com.clarifai.grpc.api.MultiModelResponse> getPatchModelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PatchModels",
      requestType = com.clarifai.grpc.api.PatchModelsRequest.class,
      responseType = com.clarifai.grpc.api.MultiModelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchModelsRequest,
      com.clarifai.grpc.api.MultiModelResponse> getPatchModelsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchModelsRequest, com.clarifai.grpc.api.MultiModelResponse> getPatchModelsMethod;
    if ((getPatchModelsMethod = V2Grpc.getPatchModelsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPatchModelsMethod = V2Grpc.getPatchModelsMethod) == null) {
          V2Grpc.getPatchModelsMethod = getPatchModelsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PatchModelsRequest, com.clarifai.grpc.api.MultiModelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PatchModels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PatchModelsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiModelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PatchModels"))
              .build();
        }
      }
    }
    return getPatchModelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteModelRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteModelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteModel",
      requestType = com.clarifai.grpc.api.DeleteModelRequest.class,
      responseType = com.clarifai.grpc.api.status.BaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteModelRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteModelMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteModelRequest, com.clarifai.grpc.api.status.BaseResponse> getDeleteModelMethod;
    if ((getDeleteModelMethod = V2Grpc.getDeleteModelMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getDeleteModelMethod = V2Grpc.getDeleteModelMethod) == null) {
          V2Grpc.getDeleteModelMethod = getDeleteModelMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.DeleteModelRequest, com.clarifai.grpc.api.status.BaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteModel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.DeleteModelRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.status.BaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("DeleteModel"))
              .build();
        }
      }
    }
    return getDeleteModelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteModelsRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteModelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteModels",
      requestType = com.clarifai.grpc.api.DeleteModelsRequest.class,
      responseType = com.clarifai.grpc.api.status.BaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteModelsRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteModelsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteModelsRequest, com.clarifai.grpc.api.status.BaseResponse> getDeleteModelsMethod;
    if ((getDeleteModelsMethod = V2Grpc.getDeleteModelsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getDeleteModelsMethod = V2Grpc.getDeleteModelsMethod) == null) {
          V2Grpc.getDeleteModelsMethod = getDeleteModelsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.DeleteModelsRequest, com.clarifai.grpc.api.status.BaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteModels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.DeleteModelsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.status.BaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("DeleteModels"))
              .build();
        }
      }
    }
    return getDeleteModelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListModelInputsRequest,
      com.clarifai.grpc.api.MultiInputResponse> getListModelInputsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListModelInputs",
      requestType = com.clarifai.grpc.api.ListModelInputsRequest.class,
      responseType = com.clarifai.grpc.api.MultiInputResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListModelInputsRequest,
      com.clarifai.grpc.api.MultiInputResponse> getListModelInputsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListModelInputsRequest, com.clarifai.grpc.api.MultiInputResponse> getListModelInputsMethod;
    if ((getListModelInputsMethod = V2Grpc.getListModelInputsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListModelInputsMethod = V2Grpc.getListModelInputsMethod) == null) {
          V2Grpc.getListModelInputsMethod = getListModelInputsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListModelInputsRequest, com.clarifai.grpc.api.MultiInputResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListModelInputs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListModelInputsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiInputResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListModelInputs"))
              .build();
        }
      }
    }
    return getListModelInputsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetModelVersionRequest,
      com.clarifai.grpc.api.SingleModelVersionResponse> getGetModelVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetModelVersion",
      requestType = com.clarifai.grpc.api.GetModelVersionRequest.class,
      responseType = com.clarifai.grpc.api.SingleModelVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetModelVersionRequest,
      com.clarifai.grpc.api.SingleModelVersionResponse> getGetModelVersionMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetModelVersionRequest, com.clarifai.grpc.api.SingleModelVersionResponse> getGetModelVersionMethod;
    if ((getGetModelVersionMethod = V2Grpc.getGetModelVersionMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getGetModelVersionMethod = V2Grpc.getGetModelVersionMethod) == null) {
          V2Grpc.getGetModelVersionMethod = getGetModelVersionMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.GetModelVersionRequest, com.clarifai.grpc.api.SingleModelVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetModelVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.GetModelVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleModelVersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("GetModelVersion"))
              .build();
        }
      }
    }
    return getGetModelVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListModelVersionsRequest,
      com.clarifai.grpc.api.MultiModelVersionResponse> getListModelVersionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListModelVersions",
      requestType = com.clarifai.grpc.api.ListModelVersionsRequest.class,
      responseType = com.clarifai.grpc.api.MultiModelVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListModelVersionsRequest,
      com.clarifai.grpc.api.MultiModelVersionResponse> getListModelVersionsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListModelVersionsRequest, com.clarifai.grpc.api.MultiModelVersionResponse> getListModelVersionsMethod;
    if ((getListModelVersionsMethod = V2Grpc.getListModelVersionsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListModelVersionsMethod = V2Grpc.getListModelVersionsMethod) == null) {
          V2Grpc.getListModelVersionsMethod = getListModelVersionsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListModelVersionsRequest, com.clarifai.grpc.api.MultiModelVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListModelVersions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListModelVersionsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiModelVersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListModelVersions"))
              .build();
        }
      }
    }
    return getListModelVersionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostModelVersionsRequest,
      com.clarifai.grpc.api.SingleModelResponse> getPostModelVersionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostModelVersions",
      requestType = com.clarifai.grpc.api.PostModelVersionsRequest.class,
      responseType = com.clarifai.grpc.api.SingleModelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostModelVersionsRequest,
      com.clarifai.grpc.api.SingleModelResponse> getPostModelVersionsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostModelVersionsRequest, com.clarifai.grpc.api.SingleModelResponse> getPostModelVersionsMethod;
    if ((getPostModelVersionsMethod = V2Grpc.getPostModelVersionsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostModelVersionsMethod = V2Grpc.getPostModelVersionsMethod) == null) {
          V2Grpc.getPostModelVersionsMethod = getPostModelVersionsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostModelVersionsRequest, com.clarifai.grpc.api.SingleModelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostModelVersions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostModelVersionsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleModelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostModelVersions"))
              .build();
        }
      }
    }
    return getPostModelVersionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchModelVersionsRequest,
      com.clarifai.grpc.api.MultiModelVersionResponse> getPatchModelVersionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PatchModelVersions",
      requestType = com.clarifai.grpc.api.PatchModelVersionsRequest.class,
      responseType = com.clarifai.grpc.api.MultiModelVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchModelVersionsRequest,
      com.clarifai.grpc.api.MultiModelVersionResponse> getPatchModelVersionsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchModelVersionsRequest, com.clarifai.grpc.api.MultiModelVersionResponse> getPatchModelVersionsMethod;
    if ((getPatchModelVersionsMethod = V2Grpc.getPatchModelVersionsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPatchModelVersionsMethod = V2Grpc.getPatchModelVersionsMethod) == null) {
          V2Grpc.getPatchModelVersionsMethod = getPatchModelVersionsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PatchModelVersionsRequest, com.clarifai.grpc.api.MultiModelVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PatchModelVersions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PatchModelVersionsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiModelVersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PatchModelVersions"))
              .build();
        }
      }
    }
    return getPatchModelVersionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteModelVersionRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteModelVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteModelVersion",
      requestType = com.clarifai.grpc.api.DeleteModelVersionRequest.class,
      responseType = com.clarifai.grpc.api.status.BaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteModelVersionRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteModelVersionMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteModelVersionRequest, com.clarifai.grpc.api.status.BaseResponse> getDeleteModelVersionMethod;
    if ((getDeleteModelVersionMethod = V2Grpc.getDeleteModelVersionMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getDeleteModelVersionMethod = V2Grpc.getDeleteModelVersionMethod) == null) {
          V2Grpc.getDeleteModelVersionMethod = getDeleteModelVersionMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.DeleteModelVersionRequest, com.clarifai.grpc.api.status.BaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteModelVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.DeleteModelVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.status.BaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("DeleteModelVersion"))
              .build();
        }
      }
    }
    return getDeleteModelVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetModelVersionMetricsRequest,
      com.clarifai.grpc.api.SingleModelVersionResponse> getGetModelVersionMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetModelVersionMetrics",
      requestType = com.clarifai.grpc.api.GetModelVersionMetricsRequest.class,
      responseType = com.clarifai.grpc.api.SingleModelVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetModelVersionMetricsRequest,
      com.clarifai.grpc.api.SingleModelVersionResponse> getGetModelVersionMetricsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetModelVersionMetricsRequest, com.clarifai.grpc.api.SingleModelVersionResponse> getGetModelVersionMetricsMethod;
    if ((getGetModelVersionMetricsMethod = V2Grpc.getGetModelVersionMetricsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getGetModelVersionMetricsMethod = V2Grpc.getGetModelVersionMetricsMethod) == null) {
          V2Grpc.getGetModelVersionMetricsMethod = getGetModelVersionMetricsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.GetModelVersionMetricsRequest, com.clarifai.grpc.api.SingleModelVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetModelVersionMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.GetModelVersionMetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleModelVersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("GetModelVersionMetrics"))
              .build();
        }
      }
    }
    return getGetModelVersionMetricsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostModelVersionMetricsRequest,
      com.clarifai.grpc.api.SingleModelVersionResponse> getPostModelVersionMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostModelVersionMetrics",
      requestType = com.clarifai.grpc.api.PostModelVersionMetricsRequest.class,
      responseType = com.clarifai.grpc.api.SingleModelVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostModelVersionMetricsRequest,
      com.clarifai.grpc.api.SingleModelVersionResponse> getPostModelVersionMetricsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostModelVersionMetricsRequest, com.clarifai.grpc.api.SingleModelVersionResponse> getPostModelVersionMetricsMethod;
    if ((getPostModelVersionMetricsMethod = V2Grpc.getPostModelVersionMetricsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostModelVersionMetricsMethod = V2Grpc.getPostModelVersionMetricsMethod) == null) {
          V2Grpc.getPostModelVersionMetricsMethod = getPostModelVersionMetricsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostModelVersionMetricsRequest, com.clarifai.grpc.api.SingleModelVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostModelVersionMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostModelVersionMetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleModelVersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostModelVersionMetrics"))
              .build();
        }
      }
    }
    return getPostModelVersionMetricsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetWorkflowRequest,
      com.clarifai.grpc.api.SingleWorkflowResponse> getGetWorkflowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWorkflow",
      requestType = com.clarifai.grpc.api.GetWorkflowRequest.class,
      responseType = com.clarifai.grpc.api.SingleWorkflowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetWorkflowRequest,
      com.clarifai.grpc.api.SingleWorkflowResponse> getGetWorkflowMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetWorkflowRequest, com.clarifai.grpc.api.SingleWorkflowResponse> getGetWorkflowMethod;
    if ((getGetWorkflowMethod = V2Grpc.getGetWorkflowMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getGetWorkflowMethod = V2Grpc.getGetWorkflowMethod) == null) {
          V2Grpc.getGetWorkflowMethod = getGetWorkflowMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.GetWorkflowRequest, com.clarifai.grpc.api.SingleWorkflowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWorkflow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.GetWorkflowRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleWorkflowResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("GetWorkflow"))
              .build();
        }
      }
    }
    return getGetWorkflowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListWorkflowsRequest,
      com.clarifai.grpc.api.MultiWorkflowResponse> getListWorkflowsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListWorkflows",
      requestType = com.clarifai.grpc.api.ListWorkflowsRequest.class,
      responseType = com.clarifai.grpc.api.MultiWorkflowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListWorkflowsRequest,
      com.clarifai.grpc.api.MultiWorkflowResponse> getListWorkflowsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListWorkflowsRequest, com.clarifai.grpc.api.MultiWorkflowResponse> getListWorkflowsMethod;
    if ((getListWorkflowsMethod = V2Grpc.getListWorkflowsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListWorkflowsMethod = V2Grpc.getListWorkflowsMethod) == null) {
          V2Grpc.getListWorkflowsMethod = getListWorkflowsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListWorkflowsRequest, com.clarifai.grpc.api.MultiWorkflowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListWorkflows"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListWorkflowsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiWorkflowResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListWorkflows"))
              .build();
        }
      }
    }
    return getListWorkflowsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostWorkflowsRequest,
      com.clarifai.grpc.api.MultiWorkflowResponse> getPostWorkflowsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostWorkflows",
      requestType = com.clarifai.grpc.api.PostWorkflowsRequest.class,
      responseType = com.clarifai.grpc.api.MultiWorkflowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostWorkflowsRequest,
      com.clarifai.grpc.api.MultiWorkflowResponse> getPostWorkflowsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostWorkflowsRequest, com.clarifai.grpc.api.MultiWorkflowResponse> getPostWorkflowsMethod;
    if ((getPostWorkflowsMethod = V2Grpc.getPostWorkflowsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostWorkflowsMethod = V2Grpc.getPostWorkflowsMethod) == null) {
          V2Grpc.getPostWorkflowsMethod = getPostWorkflowsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostWorkflowsRequest, com.clarifai.grpc.api.MultiWorkflowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostWorkflows"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostWorkflowsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiWorkflowResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostWorkflows"))
              .build();
        }
      }
    }
    return getPostWorkflowsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchWorkflowsRequest,
      com.clarifai.grpc.api.MultiWorkflowResponse> getPatchWorkflowsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PatchWorkflows",
      requestType = com.clarifai.grpc.api.PatchWorkflowsRequest.class,
      responseType = com.clarifai.grpc.api.MultiWorkflowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchWorkflowsRequest,
      com.clarifai.grpc.api.MultiWorkflowResponse> getPatchWorkflowsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchWorkflowsRequest, com.clarifai.grpc.api.MultiWorkflowResponse> getPatchWorkflowsMethod;
    if ((getPatchWorkflowsMethod = V2Grpc.getPatchWorkflowsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPatchWorkflowsMethod = V2Grpc.getPatchWorkflowsMethod) == null) {
          V2Grpc.getPatchWorkflowsMethod = getPatchWorkflowsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PatchWorkflowsRequest, com.clarifai.grpc.api.MultiWorkflowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PatchWorkflows"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PatchWorkflowsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiWorkflowResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PatchWorkflows"))
              .build();
        }
      }
    }
    return getPatchWorkflowsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteWorkflowRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteWorkflowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteWorkflow",
      requestType = com.clarifai.grpc.api.DeleteWorkflowRequest.class,
      responseType = com.clarifai.grpc.api.status.BaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteWorkflowRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteWorkflowMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteWorkflowRequest, com.clarifai.grpc.api.status.BaseResponse> getDeleteWorkflowMethod;
    if ((getDeleteWorkflowMethod = V2Grpc.getDeleteWorkflowMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getDeleteWorkflowMethod = V2Grpc.getDeleteWorkflowMethod) == null) {
          V2Grpc.getDeleteWorkflowMethod = getDeleteWorkflowMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.DeleteWorkflowRequest, com.clarifai.grpc.api.status.BaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteWorkflow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.DeleteWorkflowRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.status.BaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("DeleteWorkflow"))
              .build();
        }
      }
    }
    return getDeleteWorkflowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteWorkflowsRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteWorkflowsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteWorkflows",
      requestType = com.clarifai.grpc.api.DeleteWorkflowsRequest.class,
      responseType = com.clarifai.grpc.api.status.BaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteWorkflowsRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteWorkflowsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteWorkflowsRequest, com.clarifai.grpc.api.status.BaseResponse> getDeleteWorkflowsMethod;
    if ((getDeleteWorkflowsMethod = V2Grpc.getDeleteWorkflowsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getDeleteWorkflowsMethod = V2Grpc.getDeleteWorkflowsMethod) == null) {
          V2Grpc.getDeleteWorkflowsMethod = getDeleteWorkflowsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.DeleteWorkflowsRequest, com.clarifai.grpc.api.status.BaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteWorkflows"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.DeleteWorkflowsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.status.BaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("DeleteWorkflows"))
              .build();
        }
      }
    }
    return getDeleteWorkflowsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostWorkflowResultsRequest,
      com.clarifai.grpc.api.PostWorkflowResultsResponse> getPostWorkflowResultsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostWorkflowResults",
      requestType = com.clarifai.grpc.api.PostWorkflowResultsRequest.class,
      responseType = com.clarifai.grpc.api.PostWorkflowResultsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostWorkflowResultsRequest,
      com.clarifai.grpc.api.PostWorkflowResultsResponse> getPostWorkflowResultsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostWorkflowResultsRequest, com.clarifai.grpc.api.PostWorkflowResultsResponse> getPostWorkflowResultsMethod;
    if ((getPostWorkflowResultsMethod = V2Grpc.getPostWorkflowResultsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostWorkflowResultsMethod = V2Grpc.getPostWorkflowResultsMethod) == null) {
          V2Grpc.getPostWorkflowResultsMethod = getPostWorkflowResultsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostWorkflowResultsRequest, com.clarifai.grpc.api.PostWorkflowResultsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostWorkflowResults"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostWorkflowResultsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostWorkflowResultsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostWorkflowResults"))
              .build();
        }
      }
    }
    return getPostWorkflowResultsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostWorkflowResultsSimilarityRequest,
      com.clarifai.grpc.api.PostWorkflowResultsSimilarityResponse> getPostWorkflowResultsSimilarityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostWorkflowResultsSimilarity",
      requestType = com.clarifai.grpc.api.PostWorkflowResultsSimilarityRequest.class,
      responseType = com.clarifai.grpc.api.PostWorkflowResultsSimilarityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostWorkflowResultsSimilarityRequest,
      com.clarifai.grpc.api.PostWorkflowResultsSimilarityResponse> getPostWorkflowResultsSimilarityMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostWorkflowResultsSimilarityRequest, com.clarifai.grpc.api.PostWorkflowResultsSimilarityResponse> getPostWorkflowResultsSimilarityMethod;
    if ((getPostWorkflowResultsSimilarityMethod = V2Grpc.getPostWorkflowResultsSimilarityMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostWorkflowResultsSimilarityMethod = V2Grpc.getPostWorkflowResultsSimilarityMethod) == null) {
          V2Grpc.getPostWorkflowResultsSimilarityMethod = getPostWorkflowResultsSimilarityMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostWorkflowResultsSimilarityRequest, com.clarifai.grpc.api.PostWorkflowResultsSimilarityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostWorkflowResultsSimilarity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostWorkflowResultsSimilarityRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostWorkflowResultsSimilarityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostWorkflowResultsSimilarity"))
              .build();
        }
      }
    }
    return getPostWorkflowResultsSimilarityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetKeyRequest,
      com.clarifai.grpc.api.SingleKeyResponse> getGetKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetKey",
      requestType = com.clarifai.grpc.api.GetKeyRequest.class,
      responseType = com.clarifai.grpc.api.SingleKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetKeyRequest,
      com.clarifai.grpc.api.SingleKeyResponse> getGetKeyMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetKeyRequest, com.clarifai.grpc.api.SingleKeyResponse> getGetKeyMethod;
    if ((getGetKeyMethod = V2Grpc.getGetKeyMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getGetKeyMethod = V2Grpc.getGetKeyMethod) == null) {
          V2Grpc.getGetKeyMethod = getGetKeyMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.GetKeyRequest, com.clarifai.grpc.api.SingleKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.GetKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleKeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("GetKey"))
              .build();
        }
      }
    }
    return getGetKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListKeysRequest,
      com.clarifai.grpc.api.MultiKeyResponse> getListKeysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListKeys",
      requestType = com.clarifai.grpc.api.ListKeysRequest.class,
      responseType = com.clarifai.grpc.api.MultiKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListKeysRequest,
      com.clarifai.grpc.api.MultiKeyResponse> getListKeysMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListKeysRequest, com.clarifai.grpc.api.MultiKeyResponse> getListKeysMethod;
    if ((getListKeysMethod = V2Grpc.getListKeysMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListKeysMethod = V2Grpc.getListKeysMethod) == null) {
          V2Grpc.getListKeysMethod = getListKeysMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListKeysRequest, com.clarifai.grpc.api.MultiKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListKeys"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListKeysRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiKeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListKeys"))
              .build();
        }
      }
    }
    return getListKeysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListAppKeysRequest,
      com.clarifai.grpc.api.MultiKeyResponse> getListAppKeysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAppKeys",
      requestType = com.clarifai.grpc.api.ListAppKeysRequest.class,
      responseType = com.clarifai.grpc.api.MultiKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListAppKeysRequest,
      com.clarifai.grpc.api.MultiKeyResponse> getListAppKeysMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListAppKeysRequest, com.clarifai.grpc.api.MultiKeyResponse> getListAppKeysMethod;
    if ((getListAppKeysMethod = V2Grpc.getListAppKeysMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListAppKeysMethod = V2Grpc.getListAppKeysMethod) == null) {
          V2Grpc.getListAppKeysMethod = getListAppKeysMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListAppKeysRequest, com.clarifai.grpc.api.MultiKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAppKeys"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListAppKeysRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiKeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListAppKeys"))
              .build();
        }
      }
    }
    return getListAppKeysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteKeyRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteKey",
      requestType = com.clarifai.grpc.api.DeleteKeyRequest.class,
      responseType = com.clarifai.grpc.api.status.BaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteKeyRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteKeyMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteKeyRequest, com.clarifai.grpc.api.status.BaseResponse> getDeleteKeyMethod;
    if ((getDeleteKeyMethod = V2Grpc.getDeleteKeyMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getDeleteKeyMethod = V2Grpc.getDeleteKeyMethod) == null) {
          V2Grpc.getDeleteKeyMethod = getDeleteKeyMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.DeleteKeyRequest, com.clarifai.grpc.api.status.BaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.DeleteKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.status.BaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("DeleteKey"))
              .build();
        }
      }
    }
    return getDeleteKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostKeysRequest,
      com.clarifai.grpc.api.MultiKeyResponse> getPostKeysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostKeys",
      requestType = com.clarifai.grpc.api.PostKeysRequest.class,
      responseType = com.clarifai.grpc.api.MultiKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostKeysRequest,
      com.clarifai.grpc.api.MultiKeyResponse> getPostKeysMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostKeysRequest, com.clarifai.grpc.api.MultiKeyResponse> getPostKeysMethod;
    if ((getPostKeysMethod = V2Grpc.getPostKeysMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostKeysMethod = V2Grpc.getPostKeysMethod) == null) {
          V2Grpc.getPostKeysMethod = getPostKeysMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostKeysRequest, com.clarifai.grpc.api.MultiKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostKeys"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostKeysRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiKeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostKeys"))
              .build();
        }
      }
    }
    return getPostKeysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchKeysRequest,
      com.clarifai.grpc.api.MultiKeyResponse> getPatchKeysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PatchKeys",
      requestType = com.clarifai.grpc.api.PatchKeysRequest.class,
      responseType = com.clarifai.grpc.api.MultiKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchKeysRequest,
      com.clarifai.grpc.api.MultiKeyResponse> getPatchKeysMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchKeysRequest, com.clarifai.grpc.api.MultiKeyResponse> getPatchKeysMethod;
    if ((getPatchKeysMethod = V2Grpc.getPatchKeysMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPatchKeysMethod = V2Grpc.getPatchKeysMethod) == null) {
          V2Grpc.getPatchKeysMethod = getPatchKeysMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PatchKeysRequest, com.clarifai.grpc.api.MultiKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PatchKeys"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PatchKeysRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiKeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PatchKeys"))
              .build();
        }
      }
    }
    return getPatchKeysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.MyScopesRequest,
      com.clarifai.grpc.api.MultiScopeResponse> getMyScopesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MyScopes",
      requestType = com.clarifai.grpc.api.MyScopesRequest.class,
      responseType = com.clarifai.grpc.api.MultiScopeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.MyScopesRequest,
      com.clarifai.grpc.api.MultiScopeResponse> getMyScopesMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.MyScopesRequest, com.clarifai.grpc.api.MultiScopeResponse> getMyScopesMethod;
    if ((getMyScopesMethod = V2Grpc.getMyScopesMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getMyScopesMethod = V2Grpc.getMyScopesMethod) == null) {
          V2Grpc.getMyScopesMethod = getMyScopesMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.MyScopesRequest, com.clarifai.grpc.api.MultiScopeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MyScopes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MyScopesRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiScopeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("MyScopes"))
              .build();
        }
      }
    }
    return getMyScopesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListScopesRequest,
      com.clarifai.grpc.api.MultiScopeDepsResponse> getListScopesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListScopes",
      requestType = com.clarifai.grpc.api.ListScopesRequest.class,
      responseType = com.clarifai.grpc.api.MultiScopeDepsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListScopesRequest,
      com.clarifai.grpc.api.MultiScopeDepsResponse> getListScopesMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListScopesRequest, com.clarifai.grpc.api.MultiScopeDepsResponse> getListScopesMethod;
    if ((getListScopesMethod = V2Grpc.getListScopesMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListScopesMethod = V2Grpc.getListScopesMethod) == null) {
          V2Grpc.getListScopesMethod = getListScopesMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListScopesRequest, com.clarifai.grpc.api.MultiScopeDepsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListScopes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListScopesRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiScopeDepsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListScopes"))
              .build();
        }
      }
    }
    return getListScopesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetAppRequest,
      com.clarifai.grpc.api.SingleAppResponse> getGetAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetApp",
      requestType = com.clarifai.grpc.api.GetAppRequest.class,
      responseType = com.clarifai.grpc.api.SingleAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetAppRequest,
      com.clarifai.grpc.api.SingleAppResponse> getGetAppMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetAppRequest, com.clarifai.grpc.api.SingleAppResponse> getGetAppMethod;
    if ((getGetAppMethod = V2Grpc.getGetAppMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getGetAppMethod = V2Grpc.getGetAppMethod) == null) {
          V2Grpc.getGetAppMethod = getGetAppMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.GetAppRequest, com.clarifai.grpc.api.SingleAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.GetAppRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleAppResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("GetApp"))
              .build();
        }
      }
    }
    return getGetAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListAppsRequest,
      com.clarifai.grpc.api.MultiAppResponse> getListAppsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListApps",
      requestType = com.clarifai.grpc.api.ListAppsRequest.class,
      responseType = com.clarifai.grpc.api.MultiAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListAppsRequest,
      com.clarifai.grpc.api.MultiAppResponse> getListAppsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListAppsRequest, com.clarifai.grpc.api.MultiAppResponse> getListAppsMethod;
    if ((getListAppsMethod = V2Grpc.getListAppsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListAppsMethod = V2Grpc.getListAppsMethod) == null) {
          V2Grpc.getListAppsMethod = getListAppsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListAppsRequest, com.clarifai.grpc.api.MultiAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListApps"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListAppsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiAppResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListApps"))
              .build();
        }
      }
    }
    return getListAppsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteAppRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteApp",
      requestType = com.clarifai.grpc.api.DeleteAppRequest.class,
      responseType = com.clarifai.grpc.api.status.BaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteAppRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteAppMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteAppRequest, com.clarifai.grpc.api.status.BaseResponse> getDeleteAppMethod;
    if ((getDeleteAppMethod = V2Grpc.getDeleteAppMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getDeleteAppMethod = V2Grpc.getDeleteAppMethod) == null) {
          V2Grpc.getDeleteAppMethod = getDeleteAppMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.DeleteAppRequest, com.clarifai.grpc.api.status.BaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.DeleteAppRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.status.BaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("DeleteApp"))
              .build();
        }
      }
    }
    return getDeleteAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostAppsRequest,
      com.clarifai.grpc.api.MultiAppResponse> getPostAppsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostApps",
      requestType = com.clarifai.grpc.api.PostAppsRequest.class,
      responseType = com.clarifai.grpc.api.MultiAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostAppsRequest,
      com.clarifai.grpc.api.MultiAppResponse> getPostAppsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostAppsRequest, com.clarifai.grpc.api.MultiAppResponse> getPostAppsMethod;
    if ((getPostAppsMethod = V2Grpc.getPostAppsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostAppsMethod = V2Grpc.getPostAppsMethod) == null) {
          V2Grpc.getPostAppsMethod = getPostAppsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostAppsRequest, com.clarifai.grpc.api.MultiAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostApps"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostAppsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiAppResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostApps"))
              .build();
        }
      }
    }
    return getPostAppsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchAppsRequest,
      com.clarifai.grpc.api.MultiAppResponse> getPatchAppsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PatchApps",
      requestType = com.clarifai.grpc.api.PatchAppsRequest.class,
      responseType = com.clarifai.grpc.api.MultiAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchAppsRequest,
      com.clarifai.grpc.api.MultiAppResponse> getPatchAppsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchAppsRequest, com.clarifai.grpc.api.MultiAppResponse> getPatchAppsMethod;
    if ((getPatchAppsMethod = V2Grpc.getPatchAppsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPatchAppsMethod = V2Grpc.getPatchAppsMethod) == null) {
          V2Grpc.getPatchAppsMethod = getPatchAppsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PatchAppsRequest, com.clarifai.grpc.api.MultiAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PatchApps"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PatchAppsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiAppResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PatchApps"))
              .build();
        }
      }
    }
    return getPatchAppsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostAppsSearchesRequest,
      com.clarifai.grpc.api.MultiAppResponse> getPostAppsSearchesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostAppsSearches",
      requestType = com.clarifai.grpc.api.PostAppsSearchesRequest.class,
      responseType = com.clarifai.grpc.api.MultiAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostAppsSearchesRequest,
      com.clarifai.grpc.api.MultiAppResponse> getPostAppsSearchesMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostAppsSearchesRequest, com.clarifai.grpc.api.MultiAppResponse> getPostAppsSearchesMethod;
    if ((getPostAppsSearchesMethod = V2Grpc.getPostAppsSearchesMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostAppsSearchesMethod = V2Grpc.getPostAppsSearchesMethod) == null) {
          V2Grpc.getPostAppsSearchesMethod = getPostAppsSearchesMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostAppsSearchesRequest, com.clarifai.grpc.api.MultiAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostAppsSearches"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostAppsSearchesRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiAppResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostAppsSearches"))
              .build();
        }
      }
    }
    return getPostAppsSearchesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostValidatePasswordRequest,
      com.clarifai.grpc.api.SinglePasswordValidationResponse> getPostValidatePasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostValidatePassword",
      requestType = com.clarifai.grpc.api.PostValidatePasswordRequest.class,
      responseType = com.clarifai.grpc.api.SinglePasswordValidationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostValidatePasswordRequest,
      com.clarifai.grpc.api.SinglePasswordValidationResponse> getPostValidatePasswordMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostValidatePasswordRequest, com.clarifai.grpc.api.SinglePasswordValidationResponse> getPostValidatePasswordMethod;
    if ((getPostValidatePasswordMethod = V2Grpc.getPostValidatePasswordMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostValidatePasswordMethod = V2Grpc.getPostValidatePasswordMethod) == null) {
          V2Grpc.getPostValidatePasswordMethod = getPostValidatePasswordMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostValidatePasswordRequest, com.clarifai.grpc.api.SinglePasswordValidationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostValidatePassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostValidatePasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SinglePasswordValidationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostValidatePassword"))
              .build();
        }
      }
    }
    return getPostValidatePasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetSearchRequest,
      com.clarifai.grpc.api.SingleSearchResponse> getGetSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSearch",
      requestType = com.clarifai.grpc.api.GetSearchRequest.class,
      responseType = com.clarifai.grpc.api.SingleSearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetSearchRequest,
      com.clarifai.grpc.api.SingleSearchResponse> getGetSearchMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetSearchRequest, com.clarifai.grpc.api.SingleSearchResponse> getGetSearchMethod;
    if ((getGetSearchMethod = V2Grpc.getGetSearchMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getGetSearchMethod = V2Grpc.getGetSearchMethod) == null) {
          V2Grpc.getGetSearchMethod = getGetSearchMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.GetSearchRequest, com.clarifai.grpc.api.SingleSearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.GetSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleSearchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("GetSearch"))
              .build();
        }
      }
    }
    return getGetSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListSearchesRequest,
      com.clarifai.grpc.api.MultiSearchResponse> getListSearchesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSearches",
      requestType = com.clarifai.grpc.api.ListSearchesRequest.class,
      responseType = com.clarifai.grpc.api.MultiSearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListSearchesRequest,
      com.clarifai.grpc.api.MultiSearchResponse> getListSearchesMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListSearchesRequest, com.clarifai.grpc.api.MultiSearchResponse> getListSearchesMethod;
    if ((getListSearchesMethod = V2Grpc.getListSearchesMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListSearchesMethod = V2Grpc.getListSearchesMethod) == null) {
          V2Grpc.getListSearchesMethod = getListSearchesMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListSearchesRequest, com.clarifai.grpc.api.MultiSearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSearches"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListSearchesRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiSearchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListSearches"))
              .build();
        }
      }
    }
    return getListSearchesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostSearchesRequest,
      com.clarifai.grpc.api.MultiSearchResponse> getPostSearchesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostSearches",
      requestType = com.clarifai.grpc.api.PostSearchesRequest.class,
      responseType = com.clarifai.grpc.api.MultiSearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostSearchesRequest,
      com.clarifai.grpc.api.MultiSearchResponse> getPostSearchesMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostSearchesRequest, com.clarifai.grpc.api.MultiSearchResponse> getPostSearchesMethod;
    if ((getPostSearchesMethod = V2Grpc.getPostSearchesMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostSearchesMethod = V2Grpc.getPostSearchesMethod) == null) {
          V2Grpc.getPostSearchesMethod = getPostSearchesMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostSearchesRequest, com.clarifai.grpc.api.MultiSearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostSearches"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostSearchesRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiSearchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostSearches"))
              .build();
        }
      }
    }
    return getPostSearchesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostSearchesByIDRequest,
      com.clarifai.grpc.api.MultiSearchResponse> getPostSearchesByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostSearchesByID",
      requestType = com.clarifai.grpc.api.PostSearchesByIDRequest.class,
      responseType = com.clarifai.grpc.api.MultiSearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostSearchesByIDRequest,
      com.clarifai.grpc.api.MultiSearchResponse> getPostSearchesByIDMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostSearchesByIDRequest, com.clarifai.grpc.api.MultiSearchResponse> getPostSearchesByIDMethod;
    if ((getPostSearchesByIDMethod = V2Grpc.getPostSearchesByIDMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostSearchesByIDMethod = V2Grpc.getPostSearchesByIDMethod) == null) {
          V2Grpc.getPostSearchesByIDMethod = getPostSearchesByIDMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostSearchesByIDRequest, com.clarifai.grpc.api.MultiSearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostSearchesByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostSearchesByIDRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiSearchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostSearchesByID"))
              .build();
        }
      }
    }
    return getPostSearchesByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostAnnotationSearchMetricsRequest,
      com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse> getPostAnnotationSearchMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostAnnotationSearchMetrics",
      requestType = com.clarifai.grpc.api.PostAnnotationSearchMetricsRequest.class,
      responseType = com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostAnnotationSearchMetricsRequest,
      com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse> getPostAnnotationSearchMetricsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostAnnotationSearchMetricsRequest, com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse> getPostAnnotationSearchMetricsMethod;
    if ((getPostAnnotationSearchMetricsMethod = V2Grpc.getPostAnnotationSearchMetricsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostAnnotationSearchMetricsMethod = V2Grpc.getPostAnnotationSearchMetricsMethod) == null) {
          V2Grpc.getPostAnnotationSearchMetricsMethod = getPostAnnotationSearchMetricsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostAnnotationSearchMetricsRequest, com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostAnnotationSearchMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostAnnotationSearchMetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostAnnotationSearchMetrics"))
              .build();
        }
      }
    }
    return getPostAnnotationSearchMetricsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetAnnotationSearchMetricsRequest,
      com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse> getGetAnnotationSearchMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAnnotationSearchMetrics",
      requestType = com.clarifai.grpc.api.GetAnnotationSearchMetricsRequest.class,
      responseType = com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetAnnotationSearchMetricsRequest,
      com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse> getGetAnnotationSearchMetricsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetAnnotationSearchMetricsRequest, com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse> getGetAnnotationSearchMetricsMethod;
    if ((getGetAnnotationSearchMetricsMethod = V2Grpc.getGetAnnotationSearchMetricsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getGetAnnotationSearchMetricsMethod = V2Grpc.getGetAnnotationSearchMetricsMethod) == null) {
          V2Grpc.getGetAnnotationSearchMetricsMethod = getGetAnnotationSearchMetricsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.GetAnnotationSearchMetricsRequest, com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAnnotationSearchMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.GetAnnotationSearchMetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("GetAnnotationSearchMetrics"))
              .build();
        }
      }
    }
    return getGetAnnotationSearchMetricsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListAnnotationSearchMetricsRequest,
      com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse> getListAnnotationSearchMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAnnotationSearchMetrics",
      requestType = com.clarifai.grpc.api.ListAnnotationSearchMetricsRequest.class,
      responseType = com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListAnnotationSearchMetricsRequest,
      com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse> getListAnnotationSearchMetricsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListAnnotationSearchMetricsRequest, com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse> getListAnnotationSearchMetricsMethod;
    if ((getListAnnotationSearchMetricsMethod = V2Grpc.getListAnnotationSearchMetricsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListAnnotationSearchMetricsMethod = V2Grpc.getListAnnotationSearchMetricsMethod) == null) {
          V2Grpc.getListAnnotationSearchMetricsMethod = getListAnnotationSearchMetricsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListAnnotationSearchMetricsRequest, com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAnnotationSearchMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListAnnotationSearchMetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListAnnotationSearchMetrics"))
              .build();
        }
      }
    }
    return getListAnnotationSearchMetricsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteAnnotationSearchMetricsRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteAnnotationSearchMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAnnotationSearchMetrics",
      requestType = com.clarifai.grpc.api.DeleteAnnotationSearchMetricsRequest.class,
      responseType = com.clarifai.grpc.api.status.BaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteAnnotationSearchMetricsRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteAnnotationSearchMetricsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteAnnotationSearchMetricsRequest, com.clarifai.grpc.api.status.BaseResponse> getDeleteAnnotationSearchMetricsMethod;
    if ((getDeleteAnnotationSearchMetricsMethod = V2Grpc.getDeleteAnnotationSearchMetricsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getDeleteAnnotationSearchMetricsMethod = V2Grpc.getDeleteAnnotationSearchMetricsMethod) == null) {
          V2Grpc.getDeleteAnnotationSearchMetricsMethod = getDeleteAnnotationSearchMetricsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.DeleteAnnotationSearchMetricsRequest, com.clarifai.grpc.api.status.BaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAnnotationSearchMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.DeleteAnnotationSearchMetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.status.BaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("DeleteAnnotationSearchMetrics"))
              .build();
        }
      }
    }
    return getDeleteAnnotationSearchMetricsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteSearchRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSearch",
      requestType = com.clarifai.grpc.api.DeleteSearchRequest.class,
      responseType = com.clarifai.grpc.api.status.BaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteSearchRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteSearchMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteSearchRequest, com.clarifai.grpc.api.status.BaseResponse> getDeleteSearchMethod;
    if ((getDeleteSearchMethod = V2Grpc.getDeleteSearchMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getDeleteSearchMethod = V2Grpc.getDeleteSearchMethod) == null) {
          V2Grpc.getDeleteSearchMethod = getDeleteSearchMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.DeleteSearchRequest, com.clarifai.grpc.api.status.BaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.DeleteSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.status.BaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("DeleteSearch"))
              .build();
        }
      }
    }
    return getDeleteSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListStatusCodesRequest,
      com.clarifai.grpc.api.MultiStatusCodeResponse> getListStatusCodesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListStatusCodes",
      requestType = com.clarifai.grpc.api.ListStatusCodesRequest.class,
      responseType = com.clarifai.grpc.api.MultiStatusCodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListStatusCodesRequest,
      com.clarifai.grpc.api.MultiStatusCodeResponse> getListStatusCodesMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListStatusCodesRequest, com.clarifai.grpc.api.MultiStatusCodeResponse> getListStatusCodesMethod;
    if ((getListStatusCodesMethod = V2Grpc.getListStatusCodesMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListStatusCodesMethod = V2Grpc.getListStatusCodesMethod) == null) {
          V2Grpc.getListStatusCodesMethod = getListStatusCodesMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListStatusCodesRequest, com.clarifai.grpc.api.MultiStatusCodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListStatusCodes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListStatusCodesRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiStatusCodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListStatusCodes"))
              .build();
        }
      }
    }
    return getListStatusCodesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetStatusCodeRequest,
      com.clarifai.grpc.api.SingleStatusCodeResponse> getGetStatusCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStatusCode",
      requestType = com.clarifai.grpc.api.GetStatusCodeRequest.class,
      responseType = com.clarifai.grpc.api.SingleStatusCodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetStatusCodeRequest,
      com.clarifai.grpc.api.SingleStatusCodeResponse> getGetStatusCodeMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetStatusCodeRequest, com.clarifai.grpc.api.SingleStatusCodeResponse> getGetStatusCodeMethod;
    if ((getGetStatusCodeMethod = V2Grpc.getGetStatusCodeMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getGetStatusCodeMethod = V2Grpc.getGetStatusCodeMethod) == null) {
          V2Grpc.getGetStatusCodeMethod = getGetStatusCodeMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.GetStatusCodeRequest, com.clarifai.grpc.api.SingleStatusCodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStatusCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.GetStatusCodeRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleStatusCodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("GetStatusCode"))
              .build();
        }
      }
    }
    return getGetStatusCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListCollaboratorsRequest,
      com.clarifai.grpc.api.MultiCollaboratorsResponse> getListCollaboratorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCollaborators",
      requestType = com.clarifai.grpc.api.ListCollaboratorsRequest.class,
      responseType = com.clarifai.grpc.api.MultiCollaboratorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListCollaboratorsRequest,
      com.clarifai.grpc.api.MultiCollaboratorsResponse> getListCollaboratorsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListCollaboratorsRequest, com.clarifai.grpc.api.MultiCollaboratorsResponse> getListCollaboratorsMethod;
    if ((getListCollaboratorsMethod = V2Grpc.getListCollaboratorsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListCollaboratorsMethod = V2Grpc.getListCollaboratorsMethod) == null) {
          V2Grpc.getListCollaboratorsMethod = getListCollaboratorsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListCollaboratorsRequest, com.clarifai.grpc.api.MultiCollaboratorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCollaborators"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListCollaboratorsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiCollaboratorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListCollaborators"))
              .build();
        }
      }
    }
    return getListCollaboratorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostCollaboratorsRequest,
      com.clarifai.grpc.api.MultiCollaboratorsResponse> getPostCollaboratorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostCollaborators",
      requestType = com.clarifai.grpc.api.PostCollaboratorsRequest.class,
      responseType = com.clarifai.grpc.api.MultiCollaboratorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostCollaboratorsRequest,
      com.clarifai.grpc.api.MultiCollaboratorsResponse> getPostCollaboratorsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostCollaboratorsRequest, com.clarifai.grpc.api.MultiCollaboratorsResponse> getPostCollaboratorsMethod;
    if ((getPostCollaboratorsMethod = V2Grpc.getPostCollaboratorsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostCollaboratorsMethod = V2Grpc.getPostCollaboratorsMethod) == null) {
          V2Grpc.getPostCollaboratorsMethod = getPostCollaboratorsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostCollaboratorsRequest, com.clarifai.grpc.api.MultiCollaboratorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostCollaborators"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostCollaboratorsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiCollaboratorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostCollaborators"))
              .build();
        }
      }
    }
    return getPostCollaboratorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchCollaboratorsRequest,
      com.clarifai.grpc.api.MultiCollaboratorsResponse> getPatchCollaboratorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PatchCollaborators",
      requestType = com.clarifai.grpc.api.PatchCollaboratorsRequest.class,
      responseType = com.clarifai.grpc.api.MultiCollaboratorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchCollaboratorsRequest,
      com.clarifai.grpc.api.MultiCollaboratorsResponse> getPatchCollaboratorsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchCollaboratorsRequest, com.clarifai.grpc.api.MultiCollaboratorsResponse> getPatchCollaboratorsMethod;
    if ((getPatchCollaboratorsMethod = V2Grpc.getPatchCollaboratorsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPatchCollaboratorsMethod = V2Grpc.getPatchCollaboratorsMethod) == null) {
          V2Grpc.getPatchCollaboratorsMethod = getPatchCollaboratorsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PatchCollaboratorsRequest, com.clarifai.grpc.api.MultiCollaboratorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PatchCollaborators"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PatchCollaboratorsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiCollaboratorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PatchCollaborators"))
              .build();
        }
      }
    }
    return getPatchCollaboratorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteCollaboratorsRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteCollaboratorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCollaborators",
      requestType = com.clarifai.grpc.api.DeleteCollaboratorsRequest.class,
      responseType = com.clarifai.grpc.api.status.BaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteCollaboratorsRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteCollaboratorsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteCollaboratorsRequest, com.clarifai.grpc.api.status.BaseResponse> getDeleteCollaboratorsMethod;
    if ((getDeleteCollaboratorsMethod = V2Grpc.getDeleteCollaboratorsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getDeleteCollaboratorsMethod = V2Grpc.getDeleteCollaboratorsMethod) == null) {
          V2Grpc.getDeleteCollaboratorsMethod = getDeleteCollaboratorsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.DeleteCollaboratorsRequest, com.clarifai.grpc.api.status.BaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCollaborators"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.DeleteCollaboratorsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.status.BaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("DeleteCollaborators"))
              .build();
        }
      }
    }
    return getDeleteCollaboratorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListCollaborationsRequest,
      com.clarifai.grpc.api.MultiCollaborationsResponse> getListCollaborationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCollaborations",
      requestType = com.clarifai.grpc.api.ListCollaborationsRequest.class,
      responseType = com.clarifai.grpc.api.MultiCollaborationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListCollaborationsRequest,
      com.clarifai.grpc.api.MultiCollaborationsResponse> getListCollaborationsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListCollaborationsRequest, com.clarifai.grpc.api.MultiCollaborationsResponse> getListCollaborationsMethod;
    if ((getListCollaborationsMethod = V2Grpc.getListCollaborationsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListCollaborationsMethod = V2Grpc.getListCollaborationsMethod) == null) {
          V2Grpc.getListCollaborationsMethod = getListCollaborationsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListCollaborationsRequest, com.clarifai.grpc.api.MultiCollaborationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCollaborations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListCollaborationsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiCollaborationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListCollaborations"))
              .build();
        }
      }
    }
    return getListCollaborationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostAppDuplicationsRequest,
      com.clarifai.grpc.api.MultiAppDuplicationsResponse> getPostAppDuplicationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostAppDuplications",
      requestType = com.clarifai.grpc.api.PostAppDuplicationsRequest.class,
      responseType = com.clarifai.grpc.api.MultiAppDuplicationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostAppDuplicationsRequest,
      com.clarifai.grpc.api.MultiAppDuplicationsResponse> getPostAppDuplicationsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostAppDuplicationsRequest, com.clarifai.grpc.api.MultiAppDuplicationsResponse> getPostAppDuplicationsMethod;
    if ((getPostAppDuplicationsMethod = V2Grpc.getPostAppDuplicationsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostAppDuplicationsMethod = V2Grpc.getPostAppDuplicationsMethod) == null) {
          V2Grpc.getPostAppDuplicationsMethod = getPostAppDuplicationsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostAppDuplicationsRequest, com.clarifai.grpc.api.MultiAppDuplicationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostAppDuplications"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostAppDuplicationsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiAppDuplicationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostAppDuplications"))
              .build();
        }
      }
    }
    return getPostAppDuplicationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListAppDuplicationsRequest,
      com.clarifai.grpc.api.MultiAppDuplicationsResponse> getListAppDuplicationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAppDuplications",
      requestType = com.clarifai.grpc.api.ListAppDuplicationsRequest.class,
      responseType = com.clarifai.grpc.api.MultiAppDuplicationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListAppDuplicationsRequest,
      com.clarifai.grpc.api.MultiAppDuplicationsResponse> getListAppDuplicationsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListAppDuplicationsRequest, com.clarifai.grpc.api.MultiAppDuplicationsResponse> getListAppDuplicationsMethod;
    if ((getListAppDuplicationsMethod = V2Grpc.getListAppDuplicationsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListAppDuplicationsMethod = V2Grpc.getListAppDuplicationsMethod) == null) {
          V2Grpc.getListAppDuplicationsMethod = getListAppDuplicationsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListAppDuplicationsRequest, com.clarifai.grpc.api.MultiAppDuplicationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAppDuplications"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListAppDuplicationsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiAppDuplicationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListAppDuplications"))
              .build();
        }
      }
    }
    return getListAppDuplicationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetAppDuplicationRequest,
      com.clarifai.grpc.api.SingleAppDuplicationResponse> getGetAppDuplicationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAppDuplication",
      requestType = com.clarifai.grpc.api.GetAppDuplicationRequest.class,
      responseType = com.clarifai.grpc.api.SingleAppDuplicationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetAppDuplicationRequest,
      com.clarifai.grpc.api.SingleAppDuplicationResponse> getGetAppDuplicationMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetAppDuplicationRequest, com.clarifai.grpc.api.SingleAppDuplicationResponse> getGetAppDuplicationMethod;
    if ((getGetAppDuplicationMethod = V2Grpc.getGetAppDuplicationMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getGetAppDuplicationMethod = V2Grpc.getGetAppDuplicationMethod) == null) {
          V2Grpc.getGetAppDuplicationMethod = getGetAppDuplicationMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.GetAppDuplicationRequest, com.clarifai.grpc.api.SingleAppDuplicationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAppDuplication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.GetAppDuplicationRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleAppDuplicationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("GetAppDuplication"))
              .build();
        }
      }
    }
    return getGetAppDuplicationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostTasksRequest,
      com.clarifai.grpc.api.MultiTaskResponse> getPostTasksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostTasks",
      requestType = com.clarifai.grpc.api.PostTasksRequest.class,
      responseType = com.clarifai.grpc.api.MultiTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostTasksRequest,
      com.clarifai.grpc.api.MultiTaskResponse> getPostTasksMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostTasksRequest, com.clarifai.grpc.api.MultiTaskResponse> getPostTasksMethod;
    if ((getPostTasksMethod = V2Grpc.getPostTasksMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostTasksMethod = V2Grpc.getPostTasksMethod) == null) {
          V2Grpc.getPostTasksMethod = getPostTasksMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostTasksRequest, com.clarifai.grpc.api.MultiTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostTasks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostTasksRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiTaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostTasks"))
              .build();
        }
      }
    }
    return getPostTasksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetTaskCountRequest,
      com.clarifai.grpc.api.SingleTaskCountResponse> getGetTaskAnnotationCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTaskAnnotationCount",
      requestType = com.clarifai.grpc.api.GetTaskCountRequest.class,
      responseType = com.clarifai.grpc.api.SingleTaskCountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetTaskCountRequest,
      com.clarifai.grpc.api.SingleTaskCountResponse> getGetTaskAnnotationCountMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetTaskCountRequest, com.clarifai.grpc.api.SingleTaskCountResponse> getGetTaskAnnotationCountMethod;
    if ((getGetTaskAnnotationCountMethod = V2Grpc.getGetTaskAnnotationCountMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getGetTaskAnnotationCountMethod = V2Grpc.getGetTaskAnnotationCountMethod) == null) {
          V2Grpc.getGetTaskAnnotationCountMethod = getGetTaskAnnotationCountMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.GetTaskCountRequest, com.clarifai.grpc.api.SingleTaskCountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTaskAnnotationCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.GetTaskCountRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleTaskCountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("GetTaskAnnotationCount"))
              .build();
        }
      }
    }
    return getGetTaskAnnotationCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetTaskCountRequest,
      com.clarifai.grpc.api.SingleTaskCountResponse> getGetTaskInputCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTaskInputCount",
      requestType = com.clarifai.grpc.api.GetTaskCountRequest.class,
      responseType = com.clarifai.grpc.api.SingleTaskCountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetTaskCountRequest,
      com.clarifai.grpc.api.SingleTaskCountResponse> getGetTaskInputCountMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetTaskCountRequest, com.clarifai.grpc.api.SingleTaskCountResponse> getGetTaskInputCountMethod;
    if ((getGetTaskInputCountMethod = V2Grpc.getGetTaskInputCountMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getGetTaskInputCountMethod = V2Grpc.getGetTaskInputCountMethod) == null) {
          V2Grpc.getGetTaskInputCountMethod = getGetTaskInputCountMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.GetTaskCountRequest, com.clarifai.grpc.api.SingleTaskCountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTaskInputCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.GetTaskCountRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleTaskCountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("GetTaskInputCount"))
              .build();
        }
      }
    }
    return getGetTaskInputCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetTaskRequest,
      com.clarifai.grpc.api.SingleTaskResponse> getGetTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTask",
      requestType = com.clarifai.grpc.api.GetTaskRequest.class,
      responseType = com.clarifai.grpc.api.SingleTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetTaskRequest,
      com.clarifai.grpc.api.SingleTaskResponse> getGetTaskMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetTaskRequest, com.clarifai.grpc.api.SingleTaskResponse> getGetTaskMethod;
    if ((getGetTaskMethod = V2Grpc.getGetTaskMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getGetTaskMethod = V2Grpc.getGetTaskMethod) == null) {
          V2Grpc.getGetTaskMethod = getGetTaskMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.GetTaskRequest, com.clarifai.grpc.api.SingleTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.GetTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleTaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("GetTask"))
              .build();
        }
      }
    }
    return getGetTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListTasksRequest,
      com.clarifai.grpc.api.MultiTaskResponse> getListTasksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTasks",
      requestType = com.clarifai.grpc.api.ListTasksRequest.class,
      responseType = com.clarifai.grpc.api.MultiTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListTasksRequest,
      com.clarifai.grpc.api.MultiTaskResponse> getListTasksMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListTasksRequest, com.clarifai.grpc.api.MultiTaskResponse> getListTasksMethod;
    if ((getListTasksMethod = V2Grpc.getListTasksMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListTasksMethod = V2Grpc.getListTasksMethod) == null) {
          V2Grpc.getListTasksMethod = getListTasksMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListTasksRequest, com.clarifai.grpc.api.MultiTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTasks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListTasksRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiTaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListTasks"))
              .build();
        }
      }
    }
    return getListTasksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchTasksRequest,
      com.clarifai.grpc.api.MultiTaskResponse> getPatchTasksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PatchTasks",
      requestType = com.clarifai.grpc.api.PatchTasksRequest.class,
      responseType = com.clarifai.grpc.api.MultiTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchTasksRequest,
      com.clarifai.grpc.api.MultiTaskResponse> getPatchTasksMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchTasksRequest, com.clarifai.grpc.api.MultiTaskResponse> getPatchTasksMethod;
    if ((getPatchTasksMethod = V2Grpc.getPatchTasksMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPatchTasksMethod = V2Grpc.getPatchTasksMethod) == null) {
          V2Grpc.getPatchTasksMethod = getPatchTasksMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PatchTasksRequest, com.clarifai.grpc.api.MultiTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PatchTasks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PatchTasksRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiTaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PatchTasks"))
              .build();
        }
      }
    }
    return getPatchTasksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteTasksRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteTasksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTasks",
      requestType = com.clarifai.grpc.api.DeleteTasksRequest.class,
      responseType = com.clarifai.grpc.api.status.BaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteTasksRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteTasksMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteTasksRequest, com.clarifai.grpc.api.status.BaseResponse> getDeleteTasksMethod;
    if ((getDeleteTasksMethod = V2Grpc.getDeleteTasksMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getDeleteTasksMethod = V2Grpc.getDeleteTasksMethod) == null) {
          V2Grpc.getDeleteTasksMethod = getDeleteTasksMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.DeleteTasksRequest, com.clarifai.grpc.api.status.BaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteTasks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.DeleteTasksRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.status.BaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("DeleteTasks"))
              .build();
        }
      }
    }
    return getDeleteTasksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostCollectorsRequest,
      com.clarifai.grpc.api.MultiCollectorResponse> getPostCollectorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostCollectors",
      requestType = com.clarifai.grpc.api.PostCollectorsRequest.class,
      responseType = com.clarifai.grpc.api.MultiCollectorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostCollectorsRequest,
      com.clarifai.grpc.api.MultiCollectorResponse> getPostCollectorsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostCollectorsRequest, com.clarifai.grpc.api.MultiCollectorResponse> getPostCollectorsMethod;
    if ((getPostCollectorsMethod = V2Grpc.getPostCollectorsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostCollectorsMethod = V2Grpc.getPostCollectorsMethod) == null) {
          V2Grpc.getPostCollectorsMethod = getPostCollectorsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostCollectorsRequest, com.clarifai.grpc.api.MultiCollectorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostCollectors"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostCollectorsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiCollectorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostCollectors"))
              .build();
        }
      }
    }
    return getPostCollectorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetCollectorRequest,
      com.clarifai.grpc.api.SingleCollectorResponse> getGetCollectorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCollector",
      requestType = com.clarifai.grpc.api.GetCollectorRequest.class,
      responseType = com.clarifai.grpc.api.SingleCollectorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetCollectorRequest,
      com.clarifai.grpc.api.SingleCollectorResponse> getGetCollectorMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetCollectorRequest, com.clarifai.grpc.api.SingleCollectorResponse> getGetCollectorMethod;
    if ((getGetCollectorMethod = V2Grpc.getGetCollectorMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getGetCollectorMethod = V2Grpc.getGetCollectorMethod) == null) {
          V2Grpc.getGetCollectorMethod = getGetCollectorMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.GetCollectorRequest, com.clarifai.grpc.api.SingleCollectorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCollector"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.GetCollectorRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleCollectorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("GetCollector"))
              .build();
        }
      }
    }
    return getGetCollectorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListCollectorsRequest,
      com.clarifai.grpc.api.MultiCollectorResponse> getListCollectorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCollectors",
      requestType = com.clarifai.grpc.api.ListCollectorsRequest.class,
      responseType = com.clarifai.grpc.api.MultiCollectorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListCollectorsRequest,
      com.clarifai.grpc.api.MultiCollectorResponse> getListCollectorsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListCollectorsRequest, com.clarifai.grpc.api.MultiCollectorResponse> getListCollectorsMethod;
    if ((getListCollectorsMethod = V2Grpc.getListCollectorsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListCollectorsMethod = V2Grpc.getListCollectorsMethod) == null) {
          V2Grpc.getListCollectorsMethod = getListCollectorsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListCollectorsRequest, com.clarifai.grpc.api.MultiCollectorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCollectors"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListCollectorsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiCollectorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListCollectors"))
              .build();
        }
      }
    }
    return getListCollectorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchCollectorsRequest,
      com.clarifai.grpc.api.MultiCollectorResponse> getPatchCollectorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PatchCollectors",
      requestType = com.clarifai.grpc.api.PatchCollectorsRequest.class,
      responseType = com.clarifai.grpc.api.MultiCollectorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchCollectorsRequest,
      com.clarifai.grpc.api.MultiCollectorResponse> getPatchCollectorsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchCollectorsRequest, com.clarifai.grpc.api.MultiCollectorResponse> getPatchCollectorsMethod;
    if ((getPatchCollectorsMethod = V2Grpc.getPatchCollectorsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPatchCollectorsMethod = V2Grpc.getPatchCollectorsMethod) == null) {
          V2Grpc.getPatchCollectorsMethod = getPatchCollectorsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PatchCollectorsRequest, com.clarifai.grpc.api.MultiCollectorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PatchCollectors"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PatchCollectorsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiCollectorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PatchCollectors"))
              .build();
        }
      }
    }
    return getPatchCollectorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteCollectorsRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteCollectorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCollectors",
      requestType = com.clarifai.grpc.api.DeleteCollectorsRequest.class,
      responseType = com.clarifai.grpc.api.status.BaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteCollectorsRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteCollectorsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteCollectorsRequest, com.clarifai.grpc.api.status.BaseResponse> getDeleteCollectorsMethod;
    if ((getDeleteCollectorsMethod = V2Grpc.getDeleteCollectorsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getDeleteCollectorsMethod = V2Grpc.getDeleteCollectorsMethod) == null) {
          V2Grpc.getDeleteCollectorsMethod = getDeleteCollectorsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.DeleteCollectorsRequest, com.clarifai.grpc.api.status.BaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCollectors"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.DeleteCollectorsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.status.BaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("DeleteCollectors"))
              .build();
        }
      }
    }
    return getDeleteCollectorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostStatValuesRequest,
      com.clarifai.grpc.api.MultiStatValueResponse> getPostStatValuesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostStatValues",
      requestType = com.clarifai.grpc.api.PostStatValuesRequest.class,
      responseType = com.clarifai.grpc.api.MultiStatValueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostStatValuesRequest,
      com.clarifai.grpc.api.MultiStatValueResponse> getPostStatValuesMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostStatValuesRequest, com.clarifai.grpc.api.MultiStatValueResponse> getPostStatValuesMethod;
    if ((getPostStatValuesMethod = V2Grpc.getPostStatValuesMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostStatValuesMethod = V2Grpc.getPostStatValuesMethod) == null) {
          V2Grpc.getPostStatValuesMethod = getPostStatValuesMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostStatValuesRequest, com.clarifai.grpc.api.MultiStatValueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostStatValues"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostStatValuesRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiStatValueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostStatValues"))
              .build();
        }
      }
    }
    return getPostStatValuesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostStatValuesAggregateRequest,
      com.clarifai.grpc.api.MultiStatValueAggregateResponse> getPostStatValuesAggregateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostStatValuesAggregate",
      requestType = com.clarifai.grpc.api.PostStatValuesAggregateRequest.class,
      responseType = com.clarifai.grpc.api.MultiStatValueAggregateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostStatValuesAggregateRequest,
      com.clarifai.grpc.api.MultiStatValueAggregateResponse> getPostStatValuesAggregateMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostStatValuesAggregateRequest, com.clarifai.grpc.api.MultiStatValueAggregateResponse> getPostStatValuesAggregateMethod;
    if ((getPostStatValuesAggregateMethod = V2Grpc.getPostStatValuesAggregateMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostStatValuesAggregateMethod = V2Grpc.getPostStatValuesAggregateMethod) == null) {
          V2Grpc.getPostStatValuesAggregateMethod = getPostStatValuesAggregateMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostStatValuesAggregateRequest, com.clarifai.grpc.api.MultiStatValueAggregateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostStatValuesAggregate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostStatValuesAggregateRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiStatValueAggregateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostStatValuesAggregate"))
              .build();
        }
      }
    }
    return getPostStatValuesAggregateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static V2Stub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<V2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<V2Stub>() {
        @java.lang.Override
        public V2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new V2Stub(channel, callOptions);
        }
      };
    return V2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static V2BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<V2BlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<V2BlockingStub>() {
        @java.lang.Override
        public V2BlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new V2BlockingStub(channel, callOptions);
        }
      };
    return V2BlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static V2FutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<V2FutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<V2FutureStub>() {
        @java.lang.Override
        public V2FutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new V2FutureStub(channel, callOptions);
        }
      };
    return V2FutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class V2ImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List concept relations between concepts in the platform.
     * MUST be above ListConcepts so that if concept_id is empty this will still match
     * /concepts/relations to list all the concept relations in the app.
     * </pre>
     */
    public void listConceptRelations(com.clarifai.grpc.api.ListConceptRelationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptRelationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListConceptRelationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Post concept relations to create relations between concepts in the platform.
     * </pre>
     */
    public void postConceptRelations(com.clarifai.grpc.api.PostConceptRelationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptRelationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostConceptRelationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Post concept relations to create relations between concepts in the platform.
     * </pre>
     */
    public void deleteConceptRelations(com.clarifai.grpc.api.DeleteConceptRelationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteConceptRelationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all the concepts with their positive and negative counts
     * </pre>
     */
    public void getConceptCounts(com.clarifai.grpc.api.GetConceptCountsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptCountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetConceptCountsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific concept from an app.
     * </pre>
     */
    public void getConcept(com.clarifai.grpc.api.GetConceptRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleConceptResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetConceptMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all the concepts.
     * </pre>
     */
    public void listConcepts(com.clarifai.grpc.api.ListConceptsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListConceptsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Search over the concepts to find one or more you're looking for.
     * This leverage the "body" parameter because we also have page and
     * per_page as url query param variables in this request.
     * </pre>
     */
    public void postConceptsSearches(com.clarifai.grpc.api.PostConceptsSearchesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostConceptsSearchesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add a concept to an app.
     * </pre>
     */
    public void postConcepts(com.clarifai.grpc.api.PostConceptsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostConceptsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Patch one or more concepts.
     * </pre>
     */
    public void patchConcepts(com.clarifai.grpc.api.PatchConceptsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPatchConceptsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific concept from an app.
     * </pre>
     */
    public void getConceptLanguage(com.clarifai.grpc.api.GetConceptLanguageRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleConceptLanguageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetConceptLanguageMethod(), responseObserver);
    }

    /**
     * <pre>
     * List the concept in all the translated languages.
     * </pre>
     */
    public void listConceptLanguages(com.clarifai.grpc.api.ListConceptLanguagesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptLanguageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListConceptLanguagesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add a new tranlsation for this concept.
     * </pre>
     */
    public void postConceptLanguages(com.clarifai.grpc.api.PostConceptLanguagesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptLanguageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostConceptLanguagesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Patch the name for a given language names by passing in a list of concepts with the new names
     * for the languages.
     * </pre>
     */
    public void patchConceptLanguages(com.clarifai.grpc.api.PatchConceptLanguagesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptLanguageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPatchConceptLanguagesMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all domain graphs.
     * </pre>
     */
    public void listKnowledgeGraphs(com.clarifai.grpc.api.ListKnowledgeGraphsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiKnowledgeGraphResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListKnowledgeGraphsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Post domain graphs.
     * </pre>
     */
    public void postKnowledgeGraphs(com.clarifai.grpc.api.PostKnowledgeGraphsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiKnowledgeGraphResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostKnowledgeGraphsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Start concept mapping jobs.
     * </pre>
     */
    public void postConceptMappingJobs(com.clarifai.grpc.api.PostConceptMappingJobsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptMappingJobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostConceptMappingJobsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific annotation from an app.
     * </pre>
     */
    public void getAnnotation(com.clarifai.grpc.api.GetAnnotationRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleAnnotationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAnnotationMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all the annotation.
     * </pre>
     */
    public void listAnnotations(com.clarifai.grpc.api.ListAnnotationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAnnotationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListAnnotationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Post annotations.
     * </pre>
     */
    public void postAnnotations(com.clarifai.grpc.api.PostAnnotationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAnnotationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostAnnotationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Patch one or more annotations.
     * </pre>
     */
    public void patchAnnotations(com.clarifai.grpc.api.PatchAnnotationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAnnotationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPatchAnnotationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Patch annotations status by worker id and task id.
     * </pre>
     */
    public void patchAnnotationsStatus(com.clarifai.grpc.api.PatchAnnotationsStatusRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.PatchAnnotationsStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPatchAnnotationsStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a single annotation.
     * </pre>
     */
    public void deleteAnnotation(com.clarifai.grpc.api.DeleteAnnotationRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteAnnotationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete multiple annotations in one request.
     * </pre>
     */
    public void deleteAnnotations(com.clarifai.grpc.api.DeleteAnnotationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteAnnotationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Execute a search over annotation
     * </pre>
     */
    public void postAnnotationsSearches(com.clarifai.grpc.api.PostAnnotationsSearchesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiSearchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostAnnotationsSearchesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get input count per status.
     * </pre>
     */
    public void getInputCount(com.clarifai.grpc.api.GetInputCountRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleInputCountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetInputCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Streams all the inputs starting from oldest assets.
     * </pre>
     */
    public void streamInputs(com.clarifai.grpc.api.StreamInputsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStreamInputsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific input from an app.
     * </pre>
     */
    public void getInputSamples(com.clarifai.grpc.api.GetInputSamplesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputAnnotationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetInputSamplesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific input from an app.
     * </pre>
     */
    public void getInput(com.clarifai.grpc.api.GetInputRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleInputResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetInputMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all the inputs.
     * </pre>
     */
    public void listInputs(com.clarifai.grpc.api.ListInputsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListInputsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add an input (or set of inputs) to an app.
     * This call is synchronous if the PostInputsRequest contains exactly one image input. Otherwise,
     * it is asynchronous.
     * </pre>
     */
    public void postInputs(com.clarifai.grpc.api.PostInputsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostInputsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Patch one or more inputs.
     * </pre>
     */
    public void patchInputs(com.clarifai.grpc.api.PatchInputsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPatchInputsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a single input asynchronously.
     * </pre>
     */
    public void deleteInput(com.clarifai.grpc.api.DeleteInputRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteInputMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete multiple inputs in one request.
     * This call is asynchronous.
     * </pre>
     */
    public void deleteInputs(com.clarifai.grpc.api.DeleteInputsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteInputsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Execute a search over input
     * </pre>
     */
    public void postInputsSearches(com.clarifai.grpc.api.PostInputsSearchesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiSearchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostInputsSearchesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get predicted outputs from the model.
     * </pre>
     */
    public void postModelOutputs(com.clarifai.grpc.api.PostModelOutputsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiOutputResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostModelOutputsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific model type.
     * </pre>
     */
    public void getModelType(com.clarifai.grpc.api.GetModelTypeRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelTypeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetModelTypeMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all the model types available in the platform.
     * This MUST be above ListModels so that the /models/types endpoint takes precedence.
     * </pre>
     */
    public void listModelTypes(com.clarifai.grpc.api.ListModelTypesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelTypeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListModelTypesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific model from an app.
     * </pre>
     */
    public void getModel(com.clarifai.grpc.api.GetModelRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetModelMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a the output info for a given model_id or model_id/version_id
     * combo.
     * </pre>
     */
    public void getModelOutputInfo(com.clarifai.grpc.api.GetModelRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetModelOutputInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all the models.
     * </pre>
     */
    public void listModels(com.clarifai.grpc.api.ListModelsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListModelsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Search over the models to find one or more you're looking for.
     * This leverage the "body" parameter because we also have page and
     * per_page as url query param variables in this request.
     * </pre>
     */
    public void postModelsSearches(com.clarifai.grpc.api.PostModelsSearchesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostModelsSearchesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add a models to an app.
     * FIXME(zeiler): this should have been a plural response.
     * </pre>
     */
    public void postModels(com.clarifai.grpc.api.PostModelsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostModelsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Patch one or more models.
     * </pre>
     */
    public void patchModels(com.clarifai.grpc.api.PatchModelsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPatchModelsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a single model.
     * </pre>
     */
    public void deleteModel(com.clarifai.grpc.api.DeleteModelRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteModelMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete multiple models in one request.
     * </pre>
     */
    public void deleteModels(com.clarifai.grpc.api.DeleteModelsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteModelsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all the inputs.
     * </pre>
     */
    public void listModelInputs(com.clarifai.grpc.api.ListModelInputsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListModelInputsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific model from an app.
     * </pre>
     */
    public void getModelVersion(com.clarifai.grpc.api.GetModelVersionRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelVersionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetModelVersionMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all the models.
     * </pre>
     */
    public void listModelVersions(com.clarifai.grpc.api.ListModelVersionsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelVersionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListModelVersionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a new model version to trigger training of the model.
     * FIXME(zeiler): this should have been a plural response.
     * </pre>
     */
    public void postModelVersions(com.clarifai.grpc.api.PostModelVersionsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostModelVersionsMethod(), responseObserver);
    }

    /**
     */
    public void patchModelVersions(com.clarifai.grpc.api.PatchModelVersionsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelVersionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPatchModelVersionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a single model.
     * </pre>
     */
    public void deleteModelVersion(com.clarifai.grpc.api.DeleteModelVersionRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteModelVersionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the evaluation metrics for a model version.
     * </pre>
     */
    public void getModelVersionMetrics(com.clarifai.grpc.api.GetModelVersionMetricsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelVersionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetModelVersionMetricsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Run the evaluation metrics for a model version.
     * </pre>
     */
    public void postModelVersionMetrics(com.clarifai.grpc.api.PostModelVersionMetricsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelVersionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostModelVersionMetricsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific workflow from an app.
     * </pre>
     */
    public void getWorkflow(com.clarifai.grpc.api.GetWorkflowRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleWorkflowResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetWorkflowMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all the workflows.
     * </pre>
     */
    public void listWorkflows(com.clarifai.grpc.api.ListWorkflowsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiWorkflowResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListWorkflowsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add a workflow to an app.
     * </pre>
     */
    public void postWorkflows(com.clarifai.grpc.api.PostWorkflowsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiWorkflowResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostWorkflowsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Patch one or more workflows.
     * </pre>
     */
    public void patchWorkflows(com.clarifai.grpc.api.PatchWorkflowsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiWorkflowResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPatchWorkflowsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a single workflow.
     * </pre>
     */
    public void deleteWorkflow(com.clarifai.grpc.api.DeleteWorkflowRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteWorkflowMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete multiple workflows in one request.
     * </pre>
     */
    public void deleteWorkflows(com.clarifai.grpc.api.DeleteWorkflowsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteWorkflowsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Predict using a workflow.
     * </pre>
     */
    public void postWorkflowResults(com.clarifai.grpc.api.PostWorkflowResultsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.PostWorkflowResultsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostWorkflowResultsMethod(), responseObserver);
    }

    /**
     */
    public void postWorkflowResultsSimilarity(com.clarifai.grpc.api.PostWorkflowResultsSimilarityRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.PostWorkflowResultsSimilarityResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostWorkflowResultsSimilarityMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific key from an app.
     * </pre>
     */
    public void getKey(com.clarifai.grpc.api.GetKeyRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleKeyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all the keys.
     * </pre>
     */
    public void listKeys(com.clarifai.grpc.api.ListKeysRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiKeyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListKeysMethod(), responseObserver);
    }

    /**
     * <pre>
     * List keys by app_id
     * </pre>
     */
    public void listAppKeys(com.clarifai.grpc.api.ListAppKeysRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiKeyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListAppKeysMethod(), responseObserver);
    }

    /**
     * <pre>
     * Search over the keys to find one or more you're looking for.
     * This leverage the "body" parameter because we also have page and
     * per_page as url query param variables in this request.
     * </pre>
     */
    public void deleteKey(com.clarifai.grpc.api.DeleteKeyRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add a key to an app.
     * </pre>
     */
    public void postKeys(com.clarifai.grpc.api.PostKeysRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiKeyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostKeysMethod(), responseObserver);
    }

    /**
     * <pre>
     * Patch one or more keys.
     * </pre>
     */
    public void patchKeys(com.clarifai.grpc.api.PatchKeysRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiKeyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPatchKeysMethod(), responseObserver);
    }

    /**
     * <pre>
     * API Keys in the public API -- request is itself Key authorized, and will tell
     * the user the scopes/access of the key/credential they're providing, as computed by
     * our authorizer:
     * </pre>
     */
    public void myScopes(com.clarifai.grpc.api.MyScopesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiScopeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMyScopesMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all auth scopes available to me as a user.
     * </pre>
     */
    public void listScopes(com.clarifai.grpc.api.ListScopesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiScopeDepsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListScopesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific app from an app.
     * </pre>
     */
    public void getApp(com.clarifai.grpc.api.GetAppRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleAppResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAppMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all the apps.
     * </pre>
     */
    public void listApps(com.clarifai.grpc.api.ListAppsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAppResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListAppsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Search over the apps to find one or more you're looking for.
     * This leverage the "body" parameter because we also have page and
     * per_page as url query param variables in this request.
     * </pre>
     */
    public void deleteApp(com.clarifai.grpc.api.DeleteAppRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteAppMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add a app to an app.
     * This needs to load the default workflow to make a copy, validating all the models in it, and
     * then writing the new workflow back to this new app.
     * </pre>
     */
    public void postApps(com.clarifai.grpc.api.PostAppsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAppResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostAppsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Patch one or more apps.
     * </pre>
     */
    public void patchApps(com.clarifai.grpc.api.PatchAppsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAppResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPatchAppsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Search over the applications to find one or more you're looking for.
     * </pre>
     */
    public void postAppsSearches(com.clarifai.grpc.api.PostAppsSearchesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAppResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostAppsSearchesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Validate new password in real-time for a user
     * </pre>
     */
    public void postValidatePassword(com.clarifai.grpc.api.PostValidatePasswordRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SinglePasswordValidationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostValidatePasswordMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a saved search.
     * </pre>
     */
    public void getSearch(com.clarifai.grpc.api.GetSearchRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleSearchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all saved searches.
     * </pre>
     */
    public void listSearches(com.clarifai.grpc.api.ListSearchesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiSearchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListSearchesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Execute a new search and optionally save it.
     * </pre>
     */
    public void postSearches(com.clarifai.grpc.api.PostSearchesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiSearchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostSearchesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Execute a previously saved search.
     * </pre>
     */
    public void postSearchesByID(com.clarifai.grpc.api.PostSearchesByIDRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiSearchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostSearchesByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * Evaluate the results of two search requests
     * </pre>
     */
    public void postAnnotationSearchMetrics(com.clarifai.grpc.api.PostAnnotationSearchMetricsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostAnnotationSearchMetricsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the evaluation results between two search requests
     * </pre>
     */
    public void getAnnotationSearchMetrics(com.clarifai.grpc.api.GetAnnotationSearchMetricsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAnnotationSearchMetricsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List the evaluation results between two search requests
     * </pre>
     */
    public void listAnnotationSearchMetrics(com.clarifai.grpc.api.ListAnnotationSearchMetricsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListAnnotationSearchMetricsMethod(), responseObserver);
    }

    /**
     */
    public void deleteAnnotationSearchMetrics(com.clarifai.grpc.api.DeleteAnnotationSearchMetricsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteAnnotationSearchMetricsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a saved search.
     * </pre>
     */
    public void deleteSearch(com.clarifai.grpc.api.DeleteSearchRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all status codes.
     * </pre>
     */
    public void listStatusCodes(com.clarifai.grpc.api.ListStatusCodesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiStatusCodeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListStatusCodesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get more details for a status code.
     * </pre>
     */
    public void getStatusCode(com.clarifai.grpc.api.GetStatusCodeRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleStatusCodeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStatusCodeMethod(), responseObserver);
    }

    /**
     * <pre>
     * owner list users who the app is shared with
     * </pre>
     */
    public void listCollaborators(com.clarifai.grpc.api.ListCollaboratorsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiCollaboratorsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListCollaboratorsMethod(), responseObserver);
    }

    /**
     * <pre>
     * add collaborators to an app.
     * </pre>
     */
    public void postCollaborators(com.clarifai.grpc.api.PostCollaboratorsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiCollaboratorsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostCollaboratorsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Patch existing collaborators.
     * </pre>
     */
    public void patchCollaborators(com.clarifai.grpc.api.PatchCollaboratorsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiCollaboratorsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPatchCollaboratorsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete existing collaborators.
     * </pre>
     */
    public void deleteCollaborators(com.clarifai.grpc.api.DeleteCollaboratorsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteCollaboratorsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Collaboration includes the app user are invitied to work on
     * </pre>
     */
    public void listCollaborations(com.clarifai.grpc.api.ListCollaborationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiCollaborationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListCollaborationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * start to duplicate an app which copies all the inputs, annotations, models, concepts etc. to a new app.
     * this is an async process, you should use ListAppDuplications or GetAppDuplication to check the status.
     * </pre>
     */
    public void postAppDuplications(com.clarifai.grpc.api.PostAppDuplicationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAppDuplicationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostAppDuplicationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * list all the app duplications user triggers
     * </pre>
     */
    public void listAppDuplications(com.clarifai.grpc.api.ListAppDuplicationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAppDuplicationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListAppDuplicationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * get the app duplication status
     * </pre>
     */
    public void getAppDuplication(com.clarifai.grpc.api.GetAppDuplicationRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleAppDuplicationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAppDuplicationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add tasks to an app.
     * </pre>
     */
    public void postTasks(com.clarifai.grpc.api.PostTasksRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiTaskResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostTasksMethod(), responseObserver);
    }

    /**
     * <pre>
     * Task annotation count
     * </pre>
     */
    public void getTaskAnnotationCount(com.clarifai.grpc.api.GetTaskCountRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleTaskCountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTaskAnnotationCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Task Input count
     * </pre>
     */
    public void getTaskInputCount(com.clarifai.grpc.api.GetTaskCountRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleTaskCountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTaskInputCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific task from an app.
     * </pre>
     */
    public void getTask(com.clarifai.grpc.api.GetTaskRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleTaskResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTaskMethod(), responseObserver);
    }

    /**
     * <pre>
     * List tasks from an app.
     * </pre>
     */
    public void listTasks(com.clarifai.grpc.api.ListTasksRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiTaskResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListTasksMethod(), responseObserver);
    }

    /**
     * <pre>
     * Patch one or more tasks.
     * </pre>
     */
    public void patchTasks(com.clarifai.grpc.api.PatchTasksRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiTaskResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPatchTasksMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete multiple tasks in one request.
     * </pre>
     */
    public void deleteTasks(com.clarifai.grpc.api.DeleteTasksRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteTasksMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add a list of Collectors to an app.
     * In the handler of this endpoint we also check for all the scopes of the  POST /inputs
     * endpoint.
     * Those current scopes are listed here as a hard requirement.
     * They are needed when adding the collectors just so we now that you have permission with
     * that key at least to do the writing to this app with POST /inputs.
     * </pre>
     */
    public void postCollectors(com.clarifai.grpc.api.PostCollectorsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiCollectorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostCollectorsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific collector from an app.
     * </pre>
     */
    public void getCollector(com.clarifai.grpc.api.GetCollectorRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleCollectorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCollectorMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all the collectors.
     * </pre>
     */
    public void listCollectors(com.clarifai.grpc.api.ListCollectorsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiCollectorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListCollectorsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Patch one or more collectors.
     * </pre>
     */
    public void patchCollectors(com.clarifai.grpc.api.PatchCollectorsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiCollectorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPatchCollectorsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete multiple collectors in one request.
     * This call is asynchronous. Use DeleteCollector if you want a synchronous version.
     * </pre>
     */
    public void deleteCollectors(com.clarifai.grpc.api.DeleteCollectorsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteCollectorsMethod(), responseObserver);
    }

    /**
     */
    public void postStatValues(com.clarifai.grpc.api.PostStatValuesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiStatValueResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostStatValuesMethod(), responseObserver);
    }

    /**
     */
    public void postStatValuesAggregate(com.clarifai.grpc.api.PostStatValuesAggregateRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiStatValueAggregateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostStatValuesAggregateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListConceptRelationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListConceptRelationsRequest,
                com.clarifai.grpc.api.MultiConceptRelationResponse>(
                  this, METHODID_LIST_CONCEPT_RELATIONS)))
          .addMethod(
            getPostConceptRelationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostConceptRelationsRequest,
                com.clarifai.grpc.api.MultiConceptRelationResponse>(
                  this, METHODID_POST_CONCEPT_RELATIONS)))
          .addMethod(
            getDeleteConceptRelationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteConceptRelationsRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_CONCEPT_RELATIONS)))
          .addMethod(
            getGetConceptCountsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetConceptCountsRequest,
                com.clarifai.grpc.api.MultiConceptCountResponse>(
                  this, METHODID_GET_CONCEPT_COUNTS)))
          .addMethod(
            getGetConceptMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetConceptRequest,
                com.clarifai.grpc.api.SingleConceptResponse>(
                  this, METHODID_GET_CONCEPT)))
          .addMethod(
            getListConceptsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListConceptsRequest,
                com.clarifai.grpc.api.MultiConceptResponse>(
                  this, METHODID_LIST_CONCEPTS)))
          .addMethod(
            getPostConceptsSearchesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostConceptsSearchesRequest,
                com.clarifai.grpc.api.MultiConceptResponse>(
                  this, METHODID_POST_CONCEPTS_SEARCHES)))
          .addMethod(
            getPostConceptsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostConceptsRequest,
                com.clarifai.grpc.api.MultiConceptResponse>(
                  this, METHODID_POST_CONCEPTS)))
          .addMethod(
            getPatchConceptsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchConceptsRequest,
                com.clarifai.grpc.api.MultiConceptResponse>(
                  this, METHODID_PATCH_CONCEPTS)))
          .addMethod(
            getGetConceptLanguageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetConceptLanguageRequest,
                com.clarifai.grpc.api.SingleConceptLanguageResponse>(
                  this, METHODID_GET_CONCEPT_LANGUAGE)))
          .addMethod(
            getListConceptLanguagesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListConceptLanguagesRequest,
                com.clarifai.grpc.api.MultiConceptLanguageResponse>(
                  this, METHODID_LIST_CONCEPT_LANGUAGES)))
          .addMethod(
            getPostConceptLanguagesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostConceptLanguagesRequest,
                com.clarifai.grpc.api.MultiConceptLanguageResponse>(
                  this, METHODID_POST_CONCEPT_LANGUAGES)))
          .addMethod(
            getPatchConceptLanguagesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchConceptLanguagesRequest,
                com.clarifai.grpc.api.MultiConceptLanguageResponse>(
                  this, METHODID_PATCH_CONCEPT_LANGUAGES)))
          .addMethod(
            getListKnowledgeGraphsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListKnowledgeGraphsRequest,
                com.clarifai.grpc.api.MultiKnowledgeGraphResponse>(
                  this, METHODID_LIST_KNOWLEDGE_GRAPHS)))
          .addMethod(
            getPostKnowledgeGraphsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostKnowledgeGraphsRequest,
                com.clarifai.grpc.api.MultiKnowledgeGraphResponse>(
                  this, METHODID_POST_KNOWLEDGE_GRAPHS)))
          .addMethod(
            getPostConceptMappingJobsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostConceptMappingJobsRequest,
                com.clarifai.grpc.api.MultiConceptMappingJobResponse>(
                  this, METHODID_POST_CONCEPT_MAPPING_JOBS)))
          .addMethod(
            getGetAnnotationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetAnnotationRequest,
                com.clarifai.grpc.api.SingleAnnotationResponse>(
                  this, METHODID_GET_ANNOTATION)))
          .addMethod(
            getListAnnotationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListAnnotationsRequest,
                com.clarifai.grpc.api.MultiAnnotationResponse>(
                  this, METHODID_LIST_ANNOTATIONS)))
          .addMethod(
            getPostAnnotationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostAnnotationsRequest,
                com.clarifai.grpc.api.MultiAnnotationResponse>(
                  this, METHODID_POST_ANNOTATIONS)))
          .addMethod(
            getPatchAnnotationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchAnnotationsRequest,
                com.clarifai.grpc.api.MultiAnnotationResponse>(
                  this, METHODID_PATCH_ANNOTATIONS)))
          .addMethod(
            getPatchAnnotationsStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchAnnotationsStatusRequest,
                com.clarifai.grpc.api.PatchAnnotationsStatusResponse>(
                  this, METHODID_PATCH_ANNOTATIONS_STATUS)))
          .addMethod(
            getDeleteAnnotationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteAnnotationRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_ANNOTATION)))
          .addMethod(
            getDeleteAnnotationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteAnnotationsRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_ANNOTATIONS)))
          .addMethod(
            getPostAnnotationsSearchesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostAnnotationsSearchesRequest,
                com.clarifai.grpc.api.MultiSearchResponse>(
                  this, METHODID_POST_ANNOTATIONS_SEARCHES)))
          .addMethod(
            getGetInputCountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetInputCountRequest,
                com.clarifai.grpc.api.SingleInputCountResponse>(
                  this, METHODID_GET_INPUT_COUNT)))
          .addMethod(
            getStreamInputsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.StreamInputsRequest,
                com.clarifai.grpc.api.MultiInputResponse>(
                  this, METHODID_STREAM_INPUTS)))
          .addMethod(
            getGetInputSamplesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetInputSamplesRequest,
                com.clarifai.grpc.api.MultiInputAnnotationResponse>(
                  this, METHODID_GET_INPUT_SAMPLES)))
          .addMethod(
            getGetInputMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetInputRequest,
                com.clarifai.grpc.api.SingleInputResponse>(
                  this, METHODID_GET_INPUT)))
          .addMethod(
            getListInputsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListInputsRequest,
                com.clarifai.grpc.api.MultiInputResponse>(
                  this, METHODID_LIST_INPUTS)))
          .addMethod(
            getPostInputsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostInputsRequest,
                com.clarifai.grpc.api.MultiInputResponse>(
                  this, METHODID_POST_INPUTS)))
          .addMethod(
            getPatchInputsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchInputsRequest,
                com.clarifai.grpc.api.MultiInputResponse>(
                  this, METHODID_PATCH_INPUTS)))
          .addMethod(
            getDeleteInputMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteInputRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_INPUT)))
          .addMethod(
            getDeleteInputsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteInputsRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_INPUTS)))
          .addMethod(
            getPostInputsSearchesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostInputsSearchesRequest,
                com.clarifai.grpc.api.MultiSearchResponse>(
                  this, METHODID_POST_INPUTS_SEARCHES)))
          .addMethod(
            getPostModelOutputsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostModelOutputsRequest,
                com.clarifai.grpc.api.MultiOutputResponse>(
                  this, METHODID_POST_MODEL_OUTPUTS)))
          .addMethod(
            getGetModelTypeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetModelTypeRequest,
                com.clarifai.grpc.api.SingleModelTypeResponse>(
                  this, METHODID_GET_MODEL_TYPE)))
          .addMethod(
            getListModelTypesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListModelTypesRequest,
                com.clarifai.grpc.api.MultiModelTypeResponse>(
                  this, METHODID_LIST_MODEL_TYPES)))
          .addMethod(
            getGetModelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetModelRequest,
                com.clarifai.grpc.api.SingleModelResponse>(
                  this, METHODID_GET_MODEL)))
          .addMethod(
            getGetModelOutputInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetModelRequest,
                com.clarifai.grpc.api.SingleModelResponse>(
                  this, METHODID_GET_MODEL_OUTPUT_INFO)))
          .addMethod(
            getListModelsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListModelsRequest,
                com.clarifai.grpc.api.MultiModelResponse>(
                  this, METHODID_LIST_MODELS)))
          .addMethod(
            getPostModelsSearchesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostModelsSearchesRequest,
                com.clarifai.grpc.api.MultiModelResponse>(
                  this, METHODID_POST_MODELS_SEARCHES)))
          .addMethod(
            getPostModelsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostModelsRequest,
                com.clarifai.grpc.api.SingleModelResponse>(
                  this, METHODID_POST_MODELS)))
          .addMethod(
            getPatchModelsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchModelsRequest,
                com.clarifai.grpc.api.MultiModelResponse>(
                  this, METHODID_PATCH_MODELS)))
          .addMethod(
            getDeleteModelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteModelRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_MODEL)))
          .addMethod(
            getDeleteModelsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteModelsRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_MODELS)))
          .addMethod(
            getListModelInputsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListModelInputsRequest,
                com.clarifai.grpc.api.MultiInputResponse>(
                  this, METHODID_LIST_MODEL_INPUTS)))
          .addMethod(
            getGetModelVersionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetModelVersionRequest,
                com.clarifai.grpc.api.SingleModelVersionResponse>(
                  this, METHODID_GET_MODEL_VERSION)))
          .addMethod(
            getListModelVersionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListModelVersionsRequest,
                com.clarifai.grpc.api.MultiModelVersionResponse>(
                  this, METHODID_LIST_MODEL_VERSIONS)))
          .addMethod(
            getPostModelVersionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostModelVersionsRequest,
                com.clarifai.grpc.api.SingleModelResponse>(
                  this, METHODID_POST_MODEL_VERSIONS)))
          .addMethod(
            getPatchModelVersionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchModelVersionsRequest,
                com.clarifai.grpc.api.MultiModelVersionResponse>(
                  this, METHODID_PATCH_MODEL_VERSIONS)))
          .addMethod(
            getDeleteModelVersionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteModelVersionRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_MODEL_VERSION)))
          .addMethod(
            getGetModelVersionMetricsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetModelVersionMetricsRequest,
                com.clarifai.grpc.api.SingleModelVersionResponse>(
                  this, METHODID_GET_MODEL_VERSION_METRICS)))
          .addMethod(
            getPostModelVersionMetricsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostModelVersionMetricsRequest,
                com.clarifai.grpc.api.SingleModelVersionResponse>(
                  this, METHODID_POST_MODEL_VERSION_METRICS)))
          .addMethod(
            getGetWorkflowMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetWorkflowRequest,
                com.clarifai.grpc.api.SingleWorkflowResponse>(
                  this, METHODID_GET_WORKFLOW)))
          .addMethod(
            getListWorkflowsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListWorkflowsRequest,
                com.clarifai.grpc.api.MultiWorkflowResponse>(
                  this, METHODID_LIST_WORKFLOWS)))
          .addMethod(
            getPostWorkflowsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostWorkflowsRequest,
                com.clarifai.grpc.api.MultiWorkflowResponse>(
                  this, METHODID_POST_WORKFLOWS)))
          .addMethod(
            getPatchWorkflowsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchWorkflowsRequest,
                com.clarifai.grpc.api.MultiWorkflowResponse>(
                  this, METHODID_PATCH_WORKFLOWS)))
          .addMethod(
            getDeleteWorkflowMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteWorkflowRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_WORKFLOW)))
          .addMethod(
            getDeleteWorkflowsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteWorkflowsRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_WORKFLOWS)))
          .addMethod(
            getPostWorkflowResultsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostWorkflowResultsRequest,
                com.clarifai.grpc.api.PostWorkflowResultsResponse>(
                  this, METHODID_POST_WORKFLOW_RESULTS)))
          .addMethod(
            getPostWorkflowResultsSimilarityMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostWorkflowResultsSimilarityRequest,
                com.clarifai.grpc.api.PostWorkflowResultsSimilarityResponse>(
                  this, METHODID_POST_WORKFLOW_RESULTS_SIMILARITY)))
          .addMethod(
            getGetKeyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetKeyRequest,
                com.clarifai.grpc.api.SingleKeyResponse>(
                  this, METHODID_GET_KEY)))
          .addMethod(
            getListKeysMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListKeysRequest,
                com.clarifai.grpc.api.MultiKeyResponse>(
                  this, METHODID_LIST_KEYS)))
          .addMethod(
            getListAppKeysMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListAppKeysRequest,
                com.clarifai.grpc.api.MultiKeyResponse>(
                  this, METHODID_LIST_APP_KEYS)))
          .addMethod(
            getDeleteKeyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteKeyRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_KEY)))
          .addMethod(
            getPostKeysMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostKeysRequest,
                com.clarifai.grpc.api.MultiKeyResponse>(
                  this, METHODID_POST_KEYS)))
          .addMethod(
            getPatchKeysMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchKeysRequest,
                com.clarifai.grpc.api.MultiKeyResponse>(
                  this, METHODID_PATCH_KEYS)))
          .addMethod(
            getMyScopesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.MyScopesRequest,
                com.clarifai.grpc.api.MultiScopeResponse>(
                  this, METHODID_MY_SCOPES)))
          .addMethod(
            getListScopesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListScopesRequest,
                com.clarifai.grpc.api.MultiScopeDepsResponse>(
                  this, METHODID_LIST_SCOPES)))
          .addMethod(
            getGetAppMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetAppRequest,
                com.clarifai.grpc.api.SingleAppResponse>(
                  this, METHODID_GET_APP)))
          .addMethod(
            getListAppsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListAppsRequest,
                com.clarifai.grpc.api.MultiAppResponse>(
                  this, METHODID_LIST_APPS)))
          .addMethod(
            getDeleteAppMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteAppRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_APP)))
          .addMethod(
            getPostAppsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostAppsRequest,
                com.clarifai.grpc.api.MultiAppResponse>(
                  this, METHODID_POST_APPS)))
          .addMethod(
            getPatchAppsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchAppsRequest,
                com.clarifai.grpc.api.MultiAppResponse>(
                  this, METHODID_PATCH_APPS)))
          .addMethod(
            getPostAppsSearchesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostAppsSearchesRequest,
                com.clarifai.grpc.api.MultiAppResponse>(
                  this, METHODID_POST_APPS_SEARCHES)))
          .addMethod(
            getPostValidatePasswordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostValidatePasswordRequest,
                com.clarifai.grpc.api.SinglePasswordValidationResponse>(
                  this, METHODID_POST_VALIDATE_PASSWORD)))
          .addMethod(
            getGetSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetSearchRequest,
                com.clarifai.grpc.api.SingleSearchResponse>(
                  this, METHODID_GET_SEARCH)))
          .addMethod(
            getListSearchesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListSearchesRequest,
                com.clarifai.grpc.api.MultiSearchResponse>(
                  this, METHODID_LIST_SEARCHES)))
          .addMethod(
            getPostSearchesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostSearchesRequest,
                com.clarifai.grpc.api.MultiSearchResponse>(
                  this, METHODID_POST_SEARCHES)))
          .addMethod(
            getPostSearchesByIDMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostSearchesByIDRequest,
                com.clarifai.grpc.api.MultiSearchResponse>(
                  this, METHODID_POST_SEARCHES_BY_ID)))
          .addMethod(
            getPostAnnotationSearchMetricsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostAnnotationSearchMetricsRequest,
                com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse>(
                  this, METHODID_POST_ANNOTATION_SEARCH_METRICS)))
          .addMethod(
            getGetAnnotationSearchMetricsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetAnnotationSearchMetricsRequest,
                com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse>(
                  this, METHODID_GET_ANNOTATION_SEARCH_METRICS)))
          .addMethod(
            getListAnnotationSearchMetricsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListAnnotationSearchMetricsRequest,
                com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse>(
                  this, METHODID_LIST_ANNOTATION_SEARCH_METRICS)))
          .addMethod(
            getDeleteAnnotationSearchMetricsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteAnnotationSearchMetricsRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_ANNOTATION_SEARCH_METRICS)))
          .addMethod(
            getDeleteSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteSearchRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_SEARCH)))
          .addMethod(
            getListStatusCodesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListStatusCodesRequest,
                com.clarifai.grpc.api.MultiStatusCodeResponse>(
                  this, METHODID_LIST_STATUS_CODES)))
          .addMethod(
            getGetStatusCodeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetStatusCodeRequest,
                com.clarifai.grpc.api.SingleStatusCodeResponse>(
                  this, METHODID_GET_STATUS_CODE)))
          .addMethod(
            getListCollaboratorsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListCollaboratorsRequest,
                com.clarifai.grpc.api.MultiCollaboratorsResponse>(
                  this, METHODID_LIST_COLLABORATORS)))
          .addMethod(
            getPostCollaboratorsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostCollaboratorsRequest,
                com.clarifai.grpc.api.MultiCollaboratorsResponse>(
                  this, METHODID_POST_COLLABORATORS)))
          .addMethod(
            getPatchCollaboratorsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchCollaboratorsRequest,
                com.clarifai.grpc.api.MultiCollaboratorsResponse>(
                  this, METHODID_PATCH_COLLABORATORS)))
          .addMethod(
            getDeleteCollaboratorsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteCollaboratorsRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_COLLABORATORS)))
          .addMethod(
            getListCollaborationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListCollaborationsRequest,
                com.clarifai.grpc.api.MultiCollaborationsResponse>(
                  this, METHODID_LIST_COLLABORATIONS)))
          .addMethod(
            getPostAppDuplicationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostAppDuplicationsRequest,
                com.clarifai.grpc.api.MultiAppDuplicationsResponse>(
                  this, METHODID_POST_APP_DUPLICATIONS)))
          .addMethod(
            getListAppDuplicationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListAppDuplicationsRequest,
                com.clarifai.grpc.api.MultiAppDuplicationsResponse>(
                  this, METHODID_LIST_APP_DUPLICATIONS)))
          .addMethod(
            getGetAppDuplicationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetAppDuplicationRequest,
                com.clarifai.grpc.api.SingleAppDuplicationResponse>(
                  this, METHODID_GET_APP_DUPLICATION)))
          .addMethod(
            getPostTasksMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostTasksRequest,
                com.clarifai.grpc.api.MultiTaskResponse>(
                  this, METHODID_POST_TASKS)))
          .addMethod(
            getGetTaskAnnotationCountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetTaskCountRequest,
                com.clarifai.grpc.api.SingleTaskCountResponse>(
                  this, METHODID_GET_TASK_ANNOTATION_COUNT)))
          .addMethod(
            getGetTaskInputCountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetTaskCountRequest,
                com.clarifai.grpc.api.SingleTaskCountResponse>(
                  this, METHODID_GET_TASK_INPUT_COUNT)))
          .addMethod(
            getGetTaskMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetTaskRequest,
                com.clarifai.grpc.api.SingleTaskResponse>(
                  this, METHODID_GET_TASK)))
          .addMethod(
            getListTasksMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListTasksRequest,
                com.clarifai.grpc.api.MultiTaskResponse>(
                  this, METHODID_LIST_TASKS)))
          .addMethod(
            getPatchTasksMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchTasksRequest,
                com.clarifai.grpc.api.MultiTaskResponse>(
                  this, METHODID_PATCH_TASKS)))
          .addMethod(
            getDeleteTasksMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteTasksRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_TASKS)))
          .addMethod(
            getPostCollectorsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostCollectorsRequest,
                com.clarifai.grpc.api.MultiCollectorResponse>(
                  this, METHODID_POST_COLLECTORS)))
          .addMethod(
            getGetCollectorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetCollectorRequest,
                com.clarifai.grpc.api.SingleCollectorResponse>(
                  this, METHODID_GET_COLLECTOR)))
          .addMethod(
            getListCollectorsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListCollectorsRequest,
                com.clarifai.grpc.api.MultiCollectorResponse>(
                  this, METHODID_LIST_COLLECTORS)))
          .addMethod(
            getPatchCollectorsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchCollectorsRequest,
                com.clarifai.grpc.api.MultiCollectorResponse>(
                  this, METHODID_PATCH_COLLECTORS)))
          .addMethod(
            getDeleteCollectorsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteCollectorsRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_COLLECTORS)))
          .addMethod(
            getPostStatValuesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostStatValuesRequest,
                com.clarifai.grpc.api.MultiStatValueResponse>(
                  this, METHODID_POST_STAT_VALUES)))
          .addMethod(
            getPostStatValuesAggregateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostStatValuesAggregateRequest,
                com.clarifai.grpc.api.MultiStatValueAggregateResponse>(
                  this, METHODID_POST_STAT_VALUES_AGGREGATE)))
          .build();
    }
  }

  /**
   */
  public static final class V2Stub extends io.grpc.stub.AbstractAsyncStub<V2Stub> {
    private V2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected V2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new V2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * List concept relations between concepts in the platform.
     * MUST be above ListConcepts so that if concept_id is empty this will still match
     * /concepts/relations to list all the concept relations in the app.
     * </pre>
     */
    public void listConceptRelations(com.clarifai.grpc.api.ListConceptRelationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptRelationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListConceptRelationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Post concept relations to create relations between concepts in the platform.
     * </pre>
     */
    public void postConceptRelations(com.clarifai.grpc.api.PostConceptRelationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptRelationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostConceptRelationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Post concept relations to create relations between concepts in the platform.
     * </pre>
     */
    public void deleteConceptRelations(com.clarifai.grpc.api.DeleteConceptRelationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteConceptRelationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all the concepts with their positive and negative counts
     * </pre>
     */
    public void getConceptCounts(com.clarifai.grpc.api.GetConceptCountsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptCountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetConceptCountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific concept from an app.
     * </pre>
     */
    public void getConcept(com.clarifai.grpc.api.GetConceptRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleConceptResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetConceptMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all the concepts.
     * </pre>
     */
    public void listConcepts(com.clarifai.grpc.api.ListConceptsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListConceptsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Search over the concepts to find one or more you're looking for.
     * This leverage the "body" parameter because we also have page and
     * per_page as url query param variables in this request.
     * </pre>
     */
    public void postConceptsSearches(com.clarifai.grpc.api.PostConceptsSearchesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostConceptsSearchesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add a concept to an app.
     * </pre>
     */
    public void postConcepts(com.clarifai.grpc.api.PostConceptsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostConceptsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Patch one or more concepts.
     * </pre>
     */
    public void patchConcepts(com.clarifai.grpc.api.PatchConceptsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPatchConceptsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific concept from an app.
     * </pre>
     */
    public void getConceptLanguage(com.clarifai.grpc.api.GetConceptLanguageRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleConceptLanguageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetConceptLanguageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List the concept in all the translated languages.
     * </pre>
     */
    public void listConceptLanguages(com.clarifai.grpc.api.ListConceptLanguagesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptLanguageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListConceptLanguagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add a new tranlsation for this concept.
     * </pre>
     */
    public void postConceptLanguages(com.clarifai.grpc.api.PostConceptLanguagesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptLanguageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostConceptLanguagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Patch the name for a given language names by passing in a list of concepts with the new names
     * for the languages.
     * </pre>
     */
    public void patchConceptLanguages(com.clarifai.grpc.api.PatchConceptLanguagesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptLanguageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPatchConceptLanguagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all domain graphs.
     * </pre>
     */
    public void listKnowledgeGraphs(com.clarifai.grpc.api.ListKnowledgeGraphsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiKnowledgeGraphResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListKnowledgeGraphsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Post domain graphs.
     * </pre>
     */
    public void postKnowledgeGraphs(com.clarifai.grpc.api.PostKnowledgeGraphsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiKnowledgeGraphResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostKnowledgeGraphsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Start concept mapping jobs.
     * </pre>
     */
    public void postConceptMappingJobs(com.clarifai.grpc.api.PostConceptMappingJobsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptMappingJobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostConceptMappingJobsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific annotation from an app.
     * </pre>
     */
    public void getAnnotation(com.clarifai.grpc.api.GetAnnotationRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleAnnotationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAnnotationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all the annotation.
     * </pre>
     */
    public void listAnnotations(com.clarifai.grpc.api.ListAnnotationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAnnotationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAnnotationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Post annotations.
     * </pre>
     */
    public void postAnnotations(com.clarifai.grpc.api.PostAnnotationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAnnotationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostAnnotationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Patch one or more annotations.
     * </pre>
     */
    public void patchAnnotations(com.clarifai.grpc.api.PatchAnnotationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAnnotationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPatchAnnotationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Patch annotations status by worker id and task id.
     * </pre>
     */
    public void patchAnnotationsStatus(com.clarifai.grpc.api.PatchAnnotationsStatusRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.PatchAnnotationsStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPatchAnnotationsStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a single annotation.
     * </pre>
     */
    public void deleteAnnotation(com.clarifai.grpc.api.DeleteAnnotationRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteAnnotationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete multiple annotations in one request.
     * </pre>
     */
    public void deleteAnnotations(com.clarifai.grpc.api.DeleteAnnotationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteAnnotationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Execute a search over annotation
     * </pre>
     */
    public void postAnnotationsSearches(com.clarifai.grpc.api.PostAnnotationsSearchesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiSearchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostAnnotationsSearchesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get input count per status.
     * </pre>
     */
    public void getInputCount(com.clarifai.grpc.api.GetInputCountRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleInputCountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetInputCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Streams all the inputs starting from oldest assets.
     * </pre>
     */
    public void streamInputs(com.clarifai.grpc.api.StreamInputsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStreamInputsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific input from an app.
     * </pre>
     */
    public void getInputSamples(com.clarifai.grpc.api.GetInputSamplesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputAnnotationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetInputSamplesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific input from an app.
     * </pre>
     */
    public void getInput(com.clarifai.grpc.api.GetInputRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleInputResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetInputMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all the inputs.
     * </pre>
     */
    public void listInputs(com.clarifai.grpc.api.ListInputsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListInputsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add an input (or set of inputs) to an app.
     * This call is synchronous if the PostInputsRequest contains exactly one image input. Otherwise,
     * it is asynchronous.
     * </pre>
     */
    public void postInputs(com.clarifai.grpc.api.PostInputsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostInputsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Patch one or more inputs.
     * </pre>
     */
    public void patchInputs(com.clarifai.grpc.api.PatchInputsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPatchInputsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a single input asynchronously.
     * </pre>
     */
    public void deleteInput(com.clarifai.grpc.api.DeleteInputRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteInputMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete multiple inputs in one request.
     * This call is asynchronous.
     * </pre>
     */
    public void deleteInputs(com.clarifai.grpc.api.DeleteInputsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteInputsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Execute a search over input
     * </pre>
     */
    public void postInputsSearches(com.clarifai.grpc.api.PostInputsSearchesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiSearchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostInputsSearchesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get predicted outputs from the model.
     * </pre>
     */
    public void postModelOutputs(com.clarifai.grpc.api.PostModelOutputsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiOutputResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostModelOutputsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific model type.
     * </pre>
     */
    public void getModelType(com.clarifai.grpc.api.GetModelTypeRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelTypeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetModelTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all the model types available in the platform.
     * This MUST be above ListModels so that the /models/types endpoint takes precedence.
     * </pre>
     */
    public void listModelTypes(com.clarifai.grpc.api.ListModelTypesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelTypeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListModelTypesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific model from an app.
     * </pre>
     */
    public void getModel(com.clarifai.grpc.api.GetModelRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetModelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a the output info for a given model_id or model_id/version_id
     * combo.
     * </pre>
     */
    public void getModelOutputInfo(com.clarifai.grpc.api.GetModelRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetModelOutputInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all the models.
     * </pre>
     */
    public void listModels(com.clarifai.grpc.api.ListModelsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListModelsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Search over the models to find one or more you're looking for.
     * This leverage the "body" parameter because we also have page and
     * per_page as url query param variables in this request.
     * </pre>
     */
    public void postModelsSearches(com.clarifai.grpc.api.PostModelsSearchesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostModelsSearchesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add a models to an app.
     * FIXME(zeiler): this should have been a plural response.
     * </pre>
     */
    public void postModels(com.clarifai.grpc.api.PostModelsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostModelsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Patch one or more models.
     * </pre>
     */
    public void patchModels(com.clarifai.grpc.api.PatchModelsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPatchModelsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a single model.
     * </pre>
     */
    public void deleteModel(com.clarifai.grpc.api.DeleteModelRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteModelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete multiple models in one request.
     * </pre>
     */
    public void deleteModels(com.clarifai.grpc.api.DeleteModelsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteModelsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all the inputs.
     * </pre>
     */
    public void listModelInputs(com.clarifai.grpc.api.ListModelInputsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListModelInputsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific model from an app.
     * </pre>
     */
    public void getModelVersion(com.clarifai.grpc.api.GetModelVersionRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelVersionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetModelVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all the models.
     * </pre>
     */
    public void listModelVersions(com.clarifai.grpc.api.ListModelVersionsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelVersionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListModelVersionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a new model version to trigger training of the model.
     * FIXME(zeiler): this should have been a plural response.
     * </pre>
     */
    public void postModelVersions(com.clarifai.grpc.api.PostModelVersionsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostModelVersionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void patchModelVersions(com.clarifai.grpc.api.PatchModelVersionsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelVersionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPatchModelVersionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a single model.
     * </pre>
     */
    public void deleteModelVersion(com.clarifai.grpc.api.DeleteModelVersionRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteModelVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the evaluation metrics for a model version.
     * </pre>
     */
    public void getModelVersionMetrics(com.clarifai.grpc.api.GetModelVersionMetricsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelVersionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetModelVersionMetricsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Run the evaluation metrics for a model version.
     * </pre>
     */
    public void postModelVersionMetrics(com.clarifai.grpc.api.PostModelVersionMetricsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelVersionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostModelVersionMetricsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific workflow from an app.
     * </pre>
     */
    public void getWorkflow(com.clarifai.grpc.api.GetWorkflowRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleWorkflowResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetWorkflowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all the workflows.
     * </pre>
     */
    public void listWorkflows(com.clarifai.grpc.api.ListWorkflowsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiWorkflowResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListWorkflowsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add a workflow to an app.
     * </pre>
     */
    public void postWorkflows(com.clarifai.grpc.api.PostWorkflowsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiWorkflowResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostWorkflowsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Patch one or more workflows.
     * </pre>
     */
    public void patchWorkflows(com.clarifai.grpc.api.PatchWorkflowsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiWorkflowResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPatchWorkflowsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a single workflow.
     * </pre>
     */
    public void deleteWorkflow(com.clarifai.grpc.api.DeleteWorkflowRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteWorkflowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete multiple workflows in one request.
     * </pre>
     */
    public void deleteWorkflows(com.clarifai.grpc.api.DeleteWorkflowsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteWorkflowsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Predict using a workflow.
     * </pre>
     */
    public void postWorkflowResults(com.clarifai.grpc.api.PostWorkflowResultsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.PostWorkflowResultsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostWorkflowResultsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postWorkflowResultsSimilarity(com.clarifai.grpc.api.PostWorkflowResultsSimilarityRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.PostWorkflowResultsSimilarityResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostWorkflowResultsSimilarityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific key from an app.
     * </pre>
     */
    public void getKey(com.clarifai.grpc.api.GetKeyRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleKeyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all the keys.
     * </pre>
     */
    public void listKeys(com.clarifai.grpc.api.ListKeysRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiKeyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListKeysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List keys by app_id
     * </pre>
     */
    public void listAppKeys(com.clarifai.grpc.api.ListAppKeysRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiKeyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAppKeysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Search over the keys to find one or more you're looking for.
     * This leverage the "body" parameter because we also have page and
     * per_page as url query param variables in this request.
     * </pre>
     */
    public void deleteKey(com.clarifai.grpc.api.DeleteKeyRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add a key to an app.
     * </pre>
     */
    public void postKeys(com.clarifai.grpc.api.PostKeysRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiKeyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostKeysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Patch one or more keys.
     * </pre>
     */
    public void patchKeys(com.clarifai.grpc.api.PatchKeysRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiKeyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPatchKeysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * API Keys in the public API -- request is itself Key authorized, and will tell
     * the user the scopes/access of the key/credential they're providing, as computed by
     * our authorizer:
     * </pre>
     */
    public void myScopes(com.clarifai.grpc.api.MyScopesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiScopeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMyScopesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all auth scopes available to me as a user.
     * </pre>
     */
    public void listScopes(com.clarifai.grpc.api.ListScopesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiScopeDepsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListScopesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific app from an app.
     * </pre>
     */
    public void getApp(com.clarifai.grpc.api.GetAppRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleAppResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all the apps.
     * </pre>
     */
    public void listApps(com.clarifai.grpc.api.ListAppsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAppResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAppsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Search over the apps to find one or more you're looking for.
     * This leverage the "body" parameter because we also have page and
     * per_page as url query param variables in this request.
     * </pre>
     */
    public void deleteApp(com.clarifai.grpc.api.DeleteAppRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add a app to an app.
     * This needs to load the default workflow to make a copy, validating all the models in it, and
     * then writing the new workflow back to this new app.
     * </pre>
     */
    public void postApps(com.clarifai.grpc.api.PostAppsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAppResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostAppsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Patch one or more apps.
     * </pre>
     */
    public void patchApps(com.clarifai.grpc.api.PatchAppsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAppResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPatchAppsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Search over the applications to find one or more you're looking for.
     * </pre>
     */
    public void postAppsSearches(com.clarifai.grpc.api.PostAppsSearchesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAppResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostAppsSearchesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Validate new password in real-time for a user
     * </pre>
     */
    public void postValidatePassword(com.clarifai.grpc.api.PostValidatePasswordRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SinglePasswordValidationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostValidatePasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a saved search.
     * </pre>
     */
    public void getSearch(com.clarifai.grpc.api.GetSearchRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleSearchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all saved searches.
     * </pre>
     */
    public void listSearches(com.clarifai.grpc.api.ListSearchesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiSearchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListSearchesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Execute a new search and optionally save it.
     * </pre>
     */
    public void postSearches(com.clarifai.grpc.api.PostSearchesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiSearchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostSearchesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Execute a previously saved search.
     * </pre>
     */
    public void postSearchesByID(com.clarifai.grpc.api.PostSearchesByIDRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiSearchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostSearchesByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Evaluate the results of two search requests
     * </pre>
     */
    public void postAnnotationSearchMetrics(com.clarifai.grpc.api.PostAnnotationSearchMetricsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostAnnotationSearchMetricsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the evaluation results between two search requests
     * </pre>
     */
    public void getAnnotationSearchMetrics(com.clarifai.grpc.api.GetAnnotationSearchMetricsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAnnotationSearchMetricsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List the evaluation results between two search requests
     * </pre>
     */
    public void listAnnotationSearchMetrics(com.clarifai.grpc.api.ListAnnotationSearchMetricsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAnnotationSearchMetricsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAnnotationSearchMetrics(com.clarifai.grpc.api.DeleteAnnotationSearchMetricsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteAnnotationSearchMetricsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a saved search.
     * </pre>
     */
    public void deleteSearch(com.clarifai.grpc.api.DeleteSearchRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all status codes.
     * </pre>
     */
    public void listStatusCodes(com.clarifai.grpc.api.ListStatusCodesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiStatusCodeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListStatusCodesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get more details for a status code.
     * </pre>
     */
    public void getStatusCode(com.clarifai.grpc.api.GetStatusCodeRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleStatusCodeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStatusCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * owner list users who the app is shared with
     * </pre>
     */
    public void listCollaborators(com.clarifai.grpc.api.ListCollaboratorsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiCollaboratorsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListCollaboratorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * add collaborators to an app.
     * </pre>
     */
    public void postCollaborators(com.clarifai.grpc.api.PostCollaboratorsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiCollaboratorsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostCollaboratorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Patch existing collaborators.
     * </pre>
     */
    public void patchCollaborators(com.clarifai.grpc.api.PatchCollaboratorsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiCollaboratorsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPatchCollaboratorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete existing collaborators.
     * </pre>
     */
    public void deleteCollaborators(com.clarifai.grpc.api.DeleteCollaboratorsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteCollaboratorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Collaboration includes the app user are invitied to work on
     * </pre>
     */
    public void listCollaborations(com.clarifai.grpc.api.ListCollaborationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiCollaborationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListCollaborationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * start to duplicate an app which copies all the inputs, annotations, models, concepts etc. to a new app.
     * this is an async process, you should use ListAppDuplications or GetAppDuplication to check the status.
     * </pre>
     */
    public void postAppDuplications(com.clarifai.grpc.api.PostAppDuplicationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAppDuplicationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostAppDuplicationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * list all the app duplications user triggers
     * </pre>
     */
    public void listAppDuplications(com.clarifai.grpc.api.ListAppDuplicationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAppDuplicationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAppDuplicationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get the app duplication status
     * </pre>
     */
    public void getAppDuplication(com.clarifai.grpc.api.GetAppDuplicationRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleAppDuplicationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAppDuplicationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add tasks to an app.
     * </pre>
     */
    public void postTasks(com.clarifai.grpc.api.PostTasksRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiTaskResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostTasksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Task annotation count
     * </pre>
     */
    public void getTaskAnnotationCount(com.clarifai.grpc.api.GetTaskCountRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleTaskCountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTaskAnnotationCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Task Input count
     * </pre>
     */
    public void getTaskInputCount(com.clarifai.grpc.api.GetTaskCountRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleTaskCountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTaskInputCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific task from an app.
     * </pre>
     */
    public void getTask(com.clarifai.grpc.api.GetTaskRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleTaskResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List tasks from an app.
     * </pre>
     */
    public void listTasks(com.clarifai.grpc.api.ListTasksRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiTaskResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListTasksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Patch one or more tasks.
     * </pre>
     */
    public void patchTasks(com.clarifai.grpc.api.PatchTasksRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiTaskResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPatchTasksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete multiple tasks in one request.
     * </pre>
     */
    public void deleteTasks(com.clarifai.grpc.api.DeleteTasksRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteTasksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add a list of Collectors to an app.
     * In the handler of this endpoint we also check for all the scopes of the  POST /inputs
     * endpoint.
     * Those current scopes are listed here as a hard requirement.
     * They are needed when adding the collectors just so we now that you have permission with
     * that key at least to do the writing to this app with POST /inputs.
     * </pre>
     */
    public void postCollectors(com.clarifai.grpc.api.PostCollectorsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiCollectorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostCollectorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific collector from an app.
     * </pre>
     */
    public void getCollector(com.clarifai.grpc.api.GetCollectorRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleCollectorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCollectorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all the collectors.
     * </pre>
     */
    public void listCollectors(com.clarifai.grpc.api.ListCollectorsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiCollectorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListCollectorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Patch one or more collectors.
     * </pre>
     */
    public void patchCollectors(com.clarifai.grpc.api.PatchCollectorsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiCollectorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPatchCollectorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete multiple collectors in one request.
     * This call is asynchronous. Use DeleteCollector if you want a synchronous version.
     * </pre>
     */
    public void deleteCollectors(com.clarifai.grpc.api.DeleteCollectorsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteCollectorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postStatValues(com.clarifai.grpc.api.PostStatValuesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiStatValueResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostStatValuesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postStatValuesAggregate(com.clarifai.grpc.api.PostStatValuesAggregateRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiStatValueAggregateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostStatValuesAggregateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class V2BlockingStub extends io.grpc.stub.AbstractBlockingStub<V2BlockingStub> {
    private V2BlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected V2BlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new V2BlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List concept relations between concepts in the platform.
     * MUST be above ListConcepts so that if concept_id is empty this will still match
     * /concepts/relations to list all the concept relations in the app.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiConceptRelationResponse listConceptRelations(com.clarifai.grpc.api.ListConceptRelationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListConceptRelationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Post concept relations to create relations between concepts in the platform.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiConceptRelationResponse postConceptRelations(com.clarifai.grpc.api.PostConceptRelationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostConceptRelationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Post concept relations to create relations between concepts in the platform.
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteConceptRelations(com.clarifai.grpc.api.DeleteConceptRelationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteConceptRelationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all the concepts with their positive and negative counts
     * </pre>
     */
    public com.clarifai.grpc.api.MultiConceptCountResponse getConceptCounts(com.clarifai.grpc.api.GetConceptCountsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetConceptCountsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific concept from an app.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleConceptResponse getConcept(com.clarifai.grpc.api.GetConceptRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetConceptMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all the concepts.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiConceptResponse listConcepts(com.clarifai.grpc.api.ListConceptsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListConceptsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Search over the concepts to find one or more you're looking for.
     * This leverage the "body" parameter because we also have page and
     * per_page as url query param variables in this request.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiConceptResponse postConceptsSearches(com.clarifai.grpc.api.PostConceptsSearchesRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostConceptsSearchesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a concept to an app.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiConceptResponse postConcepts(com.clarifai.grpc.api.PostConceptsRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostConceptsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Patch one or more concepts.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiConceptResponse patchConcepts(com.clarifai.grpc.api.PatchConceptsRequest request) {
      return blockingUnaryCall(
          getChannel(), getPatchConceptsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific concept from an app.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleConceptLanguageResponse getConceptLanguage(com.clarifai.grpc.api.GetConceptLanguageRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetConceptLanguageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List the concept in all the translated languages.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiConceptLanguageResponse listConceptLanguages(com.clarifai.grpc.api.ListConceptLanguagesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListConceptLanguagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a new tranlsation for this concept.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiConceptLanguageResponse postConceptLanguages(com.clarifai.grpc.api.PostConceptLanguagesRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostConceptLanguagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Patch the name for a given language names by passing in a list of concepts with the new names
     * for the languages.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiConceptLanguageResponse patchConceptLanguages(com.clarifai.grpc.api.PatchConceptLanguagesRequest request) {
      return blockingUnaryCall(
          getChannel(), getPatchConceptLanguagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all domain graphs.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiKnowledgeGraphResponse listKnowledgeGraphs(com.clarifai.grpc.api.ListKnowledgeGraphsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListKnowledgeGraphsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Post domain graphs.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiKnowledgeGraphResponse postKnowledgeGraphs(com.clarifai.grpc.api.PostKnowledgeGraphsRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostKnowledgeGraphsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Start concept mapping jobs.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiConceptMappingJobResponse postConceptMappingJobs(com.clarifai.grpc.api.PostConceptMappingJobsRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostConceptMappingJobsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific annotation from an app.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleAnnotationResponse getAnnotation(com.clarifai.grpc.api.GetAnnotationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAnnotationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all the annotation.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiAnnotationResponse listAnnotations(com.clarifai.grpc.api.ListAnnotationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListAnnotationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Post annotations.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiAnnotationResponse postAnnotations(com.clarifai.grpc.api.PostAnnotationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostAnnotationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Patch one or more annotations.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiAnnotationResponse patchAnnotations(com.clarifai.grpc.api.PatchAnnotationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getPatchAnnotationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Patch annotations status by worker id and task id.
     * </pre>
     */
    public com.clarifai.grpc.api.PatchAnnotationsStatusResponse patchAnnotationsStatus(com.clarifai.grpc.api.PatchAnnotationsStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getPatchAnnotationsStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a single annotation.
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteAnnotation(com.clarifai.grpc.api.DeleteAnnotationRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteAnnotationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete multiple annotations in one request.
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteAnnotations(com.clarifai.grpc.api.DeleteAnnotationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteAnnotationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Execute a search over annotation
     * </pre>
     */
    public com.clarifai.grpc.api.MultiSearchResponse postAnnotationsSearches(com.clarifai.grpc.api.PostAnnotationsSearchesRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostAnnotationsSearchesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get input count per status.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleInputCountResponse getInputCount(com.clarifai.grpc.api.GetInputCountRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetInputCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Streams all the inputs starting from oldest assets.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiInputResponse streamInputs(com.clarifai.grpc.api.StreamInputsRequest request) {
      return blockingUnaryCall(
          getChannel(), getStreamInputsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific input from an app.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiInputAnnotationResponse getInputSamples(com.clarifai.grpc.api.GetInputSamplesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetInputSamplesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific input from an app.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleInputResponse getInput(com.clarifai.grpc.api.GetInputRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetInputMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all the inputs.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiInputResponse listInputs(com.clarifai.grpc.api.ListInputsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListInputsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add an input (or set of inputs) to an app.
     * This call is synchronous if the PostInputsRequest contains exactly one image input. Otherwise,
     * it is asynchronous.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiInputResponse postInputs(com.clarifai.grpc.api.PostInputsRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostInputsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Patch one or more inputs.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiInputResponse patchInputs(com.clarifai.grpc.api.PatchInputsRequest request) {
      return blockingUnaryCall(
          getChannel(), getPatchInputsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a single input asynchronously.
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteInput(com.clarifai.grpc.api.DeleteInputRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteInputMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete multiple inputs in one request.
     * This call is asynchronous.
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteInputs(com.clarifai.grpc.api.DeleteInputsRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteInputsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Execute a search over input
     * </pre>
     */
    public com.clarifai.grpc.api.MultiSearchResponse postInputsSearches(com.clarifai.grpc.api.PostInputsSearchesRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostInputsSearchesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get predicted outputs from the model.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiOutputResponse postModelOutputs(com.clarifai.grpc.api.PostModelOutputsRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostModelOutputsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific model type.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleModelTypeResponse getModelType(com.clarifai.grpc.api.GetModelTypeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetModelTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all the model types available in the platform.
     * This MUST be above ListModels so that the /models/types endpoint takes precedence.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiModelTypeResponse listModelTypes(com.clarifai.grpc.api.ListModelTypesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListModelTypesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific model from an app.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleModelResponse getModel(com.clarifai.grpc.api.GetModelRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetModelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a the output info for a given model_id or model_id/version_id
     * combo.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleModelResponse getModelOutputInfo(com.clarifai.grpc.api.GetModelRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetModelOutputInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all the models.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiModelResponse listModels(com.clarifai.grpc.api.ListModelsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListModelsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Search over the models to find one or more you're looking for.
     * This leverage the "body" parameter because we also have page and
     * per_page as url query param variables in this request.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiModelResponse postModelsSearches(com.clarifai.grpc.api.PostModelsSearchesRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostModelsSearchesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a models to an app.
     * FIXME(zeiler): this should have been a plural response.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleModelResponse postModels(com.clarifai.grpc.api.PostModelsRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostModelsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Patch one or more models.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiModelResponse patchModels(com.clarifai.grpc.api.PatchModelsRequest request) {
      return blockingUnaryCall(
          getChannel(), getPatchModelsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a single model.
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteModel(com.clarifai.grpc.api.DeleteModelRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteModelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete multiple models in one request.
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteModels(com.clarifai.grpc.api.DeleteModelsRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteModelsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all the inputs.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiInputResponse listModelInputs(com.clarifai.grpc.api.ListModelInputsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListModelInputsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific model from an app.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleModelVersionResponse getModelVersion(com.clarifai.grpc.api.GetModelVersionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetModelVersionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all the models.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiModelVersionResponse listModelVersions(com.clarifai.grpc.api.ListModelVersionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListModelVersionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new model version to trigger training of the model.
     * FIXME(zeiler): this should have been a plural response.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleModelResponse postModelVersions(com.clarifai.grpc.api.PostModelVersionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostModelVersionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.clarifai.grpc.api.MultiModelVersionResponse patchModelVersions(com.clarifai.grpc.api.PatchModelVersionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getPatchModelVersionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a single model.
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteModelVersion(com.clarifai.grpc.api.DeleteModelVersionRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteModelVersionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the evaluation metrics for a model version.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleModelVersionResponse getModelVersionMetrics(com.clarifai.grpc.api.GetModelVersionMetricsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetModelVersionMetricsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Run the evaluation metrics for a model version.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleModelVersionResponse postModelVersionMetrics(com.clarifai.grpc.api.PostModelVersionMetricsRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostModelVersionMetricsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific workflow from an app.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleWorkflowResponse getWorkflow(com.clarifai.grpc.api.GetWorkflowRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetWorkflowMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all the workflows.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiWorkflowResponse listWorkflows(com.clarifai.grpc.api.ListWorkflowsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListWorkflowsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a workflow to an app.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiWorkflowResponse postWorkflows(com.clarifai.grpc.api.PostWorkflowsRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostWorkflowsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Patch one or more workflows.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiWorkflowResponse patchWorkflows(com.clarifai.grpc.api.PatchWorkflowsRequest request) {
      return blockingUnaryCall(
          getChannel(), getPatchWorkflowsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a single workflow.
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteWorkflow(com.clarifai.grpc.api.DeleteWorkflowRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteWorkflowMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete multiple workflows in one request.
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteWorkflows(com.clarifai.grpc.api.DeleteWorkflowsRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteWorkflowsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Predict using a workflow.
     * </pre>
     */
    public com.clarifai.grpc.api.PostWorkflowResultsResponse postWorkflowResults(com.clarifai.grpc.api.PostWorkflowResultsRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostWorkflowResultsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.clarifai.grpc.api.PostWorkflowResultsSimilarityResponse postWorkflowResultsSimilarity(com.clarifai.grpc.api.PostWorkflowResultsSimilarityRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostWorkflowResultsSimilarityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific key from an app.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleKeyResponse getKey(com.clarifai.grpc.api.GetKeyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all the keys.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiKeyResponse listKeys(com.clarifai.grpc.api.ListKeysRequest request) {
      return blockingUnaryCall(
          getChannel(), getListKeysMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List keys by app_id
     * </pre>
     */
    public com.clarifai.grpc.api.MultiKeyResponse listAppKeys(com.clarifai.grpc.api.ListAppKeysRequest request) {
      return blockingUnaryCall(
          getChannel(), getListAppKeysMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Search over the keys to find one or more you're looking for.
     * This leverage the "body" parameter because we also have page and
     * per_page as url query param variables in this request.
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteKey(com.clarifai.grpc.api.DeleteKeyRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a key to an app.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiKeyResponse postKeys(com.clarifai.grpc.api.PostKeysRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostKeysMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Patch one or more keys.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiKeyResponse patchKeys(com.clarifai.grpc.api.PatchKeysRequest request) {
      return blockingUnaryCall(
          getChannel(), getPatchKeysMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * API Keys in the public API -- request is itself Key authorized, and will tell
     * the user the scopes/access of the key/credential they're providing, as computed by
     * our authorizer:
     * </pre>
     */
    public com.clarifai.grpc.api.MultiScopeResponse myScopes(com.clarifai.grpc.api.MyScopesRequest request) {
      return blockingUnaryCall(
          getChannel(), getMyScopesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all auth scopes available to me as a user.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiScopeDepsResponse listScopes(com.clarifai.grpc.api.ListScopesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListScopesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific app from an app.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleAppResponse getApp(com.clarifai.grpc.api.GetAppRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAppMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all the apps.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiAppResponse listApps(com.clarifai.grpc.api.ListAppsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListAppsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Search over the apps to find one or more you're looking for.
     * This leverage the "body" parameter because we also have page and
     * per_page as url query param variables in this request.
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteApp(com.clarifai.grpc.api.DeleteAppRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteAppMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a app to an app.
     * This needs to load the default workflow to make a copy, validating all the models in it, and
     * then writing the new workflow back to this new app.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiAppResponse postApps(com.clarifai.grpc.api.PostAppsRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostAppsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Patch one or more apps.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiAppResponse patchApps(com.clarifai.grpc.api.PatchAppsRequest request) {
      return blockingUnaryCall(
          getChannel(), getPatchAppsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Search over the applications to find one or more you're looking for.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiAppResponse postAppsSearches(com.clarifai.grpc.api.PostAppsSearchesRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostAppsSearchesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Validate new password in real-time for a user
     * </pre>
     */
    public com.clarifai.grpc.api.SinglePasswordValidationResponse postValidatePassword(com.clarifai.grpc.api.PostValidatePasswordRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostValidatePasswordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a saved search.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleSearchResponse getSearch(com.clarifai.grpc.api.GetSearchRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all saved searches.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiSearchResponse listSearches(com.clarifai.grpc.api.ListSearchesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListSearchesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Execute a new search and optionally save it.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiSearchResponse postSearches(com.clarifai.grpc.api.PostSearchesRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostSearchesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Execute a previously saved search.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiSearchResponse postSearchesByID(com.clarifai.grpc.api.PostSearchesByIDRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostSearchesByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Evaluate the results of two search requests
     * </pre>
     */
    public com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse postAnnotationSearchMetrics(com.clarifai.grpc.api.PostAnnotationSearchMetricsRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostAnnotationSearchMetricsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the evaluation results between two search requests
     * </pre>
     */
    public com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse getAnnotationSearchMetrics(com.clarifai.grpc.api.GetAnnotationSearchMetricsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAnnotationSearchMetricsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List the evaluation results between two search requests
     * </pre>
     */
    public com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse listAnnotationSearchMetrics(com.clarifai.grpc.api.ListAnnotationSearchMetricsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListAnnotationSearchMetricsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteAnnotationSearchMetrics(com.clarifai.grpc.api.DeleteAnnotationSearchMetricsRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteAnnotationSearchMetricsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a saved search.
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteSearch(com.clarifai.grpc.api.DeleteSearchRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all status codes.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiStatusCodeResponse listStatusCodes(com.clarifai.grpc.api.ListStatusCodesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListStatusCodesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get more details for a status code.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleStatusCodeResponse getStatusCode(com.clarifai.grpc.api.GetStatusCodeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetStatusCodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * owner list users who the app is shared with
     * </pre>
     */
    public com.clarifai.grpc.api.MultiCollaboratorsResponse listCollaborators(com.clarifai.grpc.api.ListCollaboratorsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListCollaboratorsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * add collaborators to an app.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiCollaboratorsResponse postCollaborators(com.clarifai.grpc.api.PostCollaboratorsRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostCollaboratorsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Patch existing collaborators.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiCollaboratorsResponse patchCollaborators(com.clarifai.grpc.api.PatchCollaboratorsRequest request) {
      return blockingUnaryCall(
          getChannel(), getPatchCollaboratorsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete existing collaborators.
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteCollaborators(com.clarifai.grpc.api.DeleteCollaboratorsRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteCollaboratorsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Collaboration includes the app user are invitied to work on
     * </pre>
     */
    public com.clarifai.grpc.api.MultiCollaborationsResponse listCollaborations(com.clarifai.grpc.api.ListCollaborationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListCollaborationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * start to duplicate an app which copies all the inputs, annotations, models, concepts etc. to a new app.
     * this is an async process, you should use ListAppDuplications or GetAppDuplication to check the status.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiAppDuplicationsResponse postAppDuplications(com.clarifai.grpc.api.PostAppDuplicationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostAppDuplicationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * list all the app duplications user triggers
     * </pre>
     */
    public com.clarifai.grpc.api.MultiAppDuplicationsResponse listAppDuplications(com.clarifai.grpc.api.ListAppDuplicationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListAppDuplicationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get the app duplication status
     * </pre>
     */
    public com.clarifai.grpc.api.SingleAppDuplicationResponse getAppDuplication(com.clarifai.grpc.api.GetAppDuplicationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAppDuplicationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add tasks to an app.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiTaskResponse postTasks(com.clarifai.grpc.api.PostTasksRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostTasksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Task annotation count
     * </pre>
     */
    public com.clarifai.grpc.api.SingleTaskCountResponse getTaskAnnotationCount(com.clarifai.grpc.api.GetTaskCountRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTaskAnnotationCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Task Input count
     * </pre>
     */
    public com.clarifai.grpc.api.SingleTaskCountResponse getTaskInputCount(com.clarifai.grpc.api.GetTaskCountRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTaskInputCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific task from an app.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleTaskResponse getTask(com.clarifai.grpc.api.GetTaskRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTaskMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List tasks from an app.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiTaskResponse listTasks(com.clarifai.grpc.api.ListTasksRequest request) {
      return blockingUnaryCall(
          getChannel(), getListTasksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Patch one or more tasks.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiTaskResponse patchTasks(com.clarifai.grpc.api.PatchTasksRequest request) {
      return blockingUnaryCall(
          getChannel(), getPatchTasksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete multiple tasks in one request.
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteTasks(com.clarifai.grpc.api.DeleteTasksRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteTasksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a list of Collectors to an app.
     * In the handler of this endpoint we also check for all the scopes of the  POST /inputs
     * endpoint.
     * Those current scopes are listed here as a hard requirement.
     * They are needed when adding the collectors just so we now that you have permission with
     * that key at least to do the writing to this app with POST /inputs.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiCollectorResponse postCollectors(com.clarifai.grpc.api.PostCollectorsRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostCollectorsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific collector from an app.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleCollectorResponse getCollector(com.clarifai.grpc.api.GetCollectorRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCollectorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all the collectors.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiCollectorResponse listCollectors(com.clarifai.grpc.api.ListCollectorsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListCollectorsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Patch one or more collectors.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiCollectorResponse patchCollectors(com.clarifai.grpc.api.PatchCollectorsRequest request) {
      return blockingUnaryCall(
          getChannel(), getPatchCollectorsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete multiple collectors in one request.
     * This call is asynchronous. Use DeleteCollector if you want a synchronous version.
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteCollectors(com.clarifai.grpc.api.DeleteCollectorsRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteCollectorsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.clarifai.grpc.api.MultiStatValueResponse postStatValues(com.clarifai.grpc.api.PostStatValuesRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostStatValuesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.clarifai.grpc.api.MultiStatValueAggregateResponse postStatValuesAggregate(com.clarifai.grpc.api.PostStatValuesAggregateRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostStatValuesAggregateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class V2FutureStub extends io.grpc.stub.AbstractFutureStub<V2FutureStub> {
    private V2FutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected V2FutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new V2FutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List concept relations between concepts in the platform.
     * MUST be above ListConcepts so that if concept_id is empty this will still match
     * /concepts/relations to list all the concept relations in the app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiConceptRelationResponse> listConceptRelations(
        com.clarifai.grpc.api.ListConceptRelationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListConceptRelationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Post concept relations to create relations between concepts in the platform.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiConceptRelationResponse> postConceptRelations(
        com.clarifai.grpc.api.PostConceptRelationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostConceptRelationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Post concept relations to create relations between concepts in the platform.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteConceptRelations(
        com.clarifai.grpc.api.DeleteConceptRelationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteConceptRelationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all the concepts with their positive and negative counts
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiConceptCountResponse> getConceptCounts(
        com.clarifai.grpc.api.GetConceptCountsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetConceptCountsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific concept from an app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleConceptResponse> getConcept(
        com.clarifai.grpc.api.GetConceptRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetConceptMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all the concepts.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiConceptResponse> listConcepts(
        com.clarifai.grpc.api.ListConceptsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListConceptsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Search over the concepts to find one or more you're looking for.
     * This leverage the "body" parameter because we also have page and
     * per_page as url query param variables in this request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiConceptResponse> postConceptsSearches(
        com.clarifai.grpc.api.PostConceptsSearchesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostConceptsSearchesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add a concept to an app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiConceptResponse> postConcepts(
        com.clarifai.grpc.api.PostConceptsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostConceptsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Patch one or more concepts.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiConceptResponse> patchConcepts(
        com.clarifai.grpc.api.PatchConceptsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPatchConceptsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific concept from an app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleConceptLanguageResponse> getConceptLanguage(
        com.clarifai.grpc.api.GetConceptLanguageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetConceptLanguageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List the concept in all the translated languages.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiConceptLanguageResponse> listConceptLanguages(
        com.clarifai.grpc.api.ListConceptLanguagesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListConceptLanguagesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add a new tranlsation for this concept.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiConceptLanguageResponse> postConceptLanguages(
        com.clarifai.grpc.api.PostConceptLanguagesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostConceptLanguagesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Patch the name for a given language names by passing in a list of concepts with the new names
     * for the languages.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiConceptLanguageResponse> patchConceptLanguages(
        com.clarifai.grpc.api.PatchConceptLanguagesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPatchConceptLanguagesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all domain graphs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiKnowledgeGraphResponse> listKnowledgeGraphs(
        com.clarifai.grpc.api.ListKnowledgeGraphsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListKnowledgeGraphsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Post domain graphs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiKnowledgeGraphResponse> postKnowledgeGraphs(
        com.clarifai.grpc.api.PostKnowledgeGraphsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostKnowledgeGraphsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Start concept mapping jobs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiConceptMappingJobResponse> postConceptMappingJobs(
        com.clarifai.grpc.api.PostConceptMappingJobsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostConceptMappingJobsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific annotation from an app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleAnnotationResponse> getAnnotation(
        com.clarifai.grpc.api.GetAnnotationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAnnotationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all the annotation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiAnnotationResponse> listAnnotations(
        com.clarifai.grpc.api.ListAnnotationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListAnnotationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Post annotations.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiAnnotationResponse> postAnnotations(
        com.clarifai.grpc.api.PostAnnotationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostAnnotationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Patch one or more annotations.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiAnnotationResponse> patchAnnotations(
        com.clarifai.grpc.api.PatchAnnotationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPatchAnnotationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Patch annotations status by worker id and task id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.PatchAnnotationsStatusResponse> patchAnnotationsStatus(
        com.clarifai.grpc.api.PatchAnnotationsStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPatchAnnotationsStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a single annotation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteAnnotation(
        com.clarifai.grpc.api.DeleteAnnotationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteAnnotationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete multiple annotations in one request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteAnnotations(
        com.clarifai.grpc.api.DeleteAnnotationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteAnnotationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Execute a search over annotation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiSearchResponse> postAnnotationsSearches(
        com.clarifai.grpc.api.PostAnnotationsSearchesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostAnnotationsSearchesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get input count per status.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleInputCountResponse> getInputCount(
        com.clarifai.grpc.api.GetInputCountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetInputCountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Streams all the inputs starting from oldest assets.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiInputResponse> streamInputs(
        com.clarifai.grpc.api.StreamInputsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStreamInputsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific input from an app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiInputAnnotationResponse> getInputSamples(
        com.clarifai.grpc.api.GetInputSamplesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetInputSamplesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific input from an app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleInputResponse> getInput(
        com.clarifai.grpc.api.GetInputRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetInputMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all the inputs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiInputResponse> listInputs(
        com.clarifai.grpc.api.ListInputsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListInputsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add an input (or set of inputs) to an app.
     * This call is synchronous if the PostInputsRequest contains exactly one image input. Otherwise,
     * it is asynchronous.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiInputResponse> postInputs(
        com.clarifai.grpc.api.PostInputsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostInputsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Patch one or more inputs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiInputResponse> patchInputs(
        com.clarifai.grpc.api.PatchInputsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPatchInputsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a single input asynchronously.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteInput(
        com.clarifai.grpc.api.DeleteInputRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteInputMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete multiple inputs in one request.
     * This call is asynchronous.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteInputs(
        com.clarifai.grpc.api.DeleteInputsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteInputsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Execute a search over input
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiSearchResponse> postInputsSearches(
        com.clarifai.grpc.api.PostInputsSearchesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostInputsSearchesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get predicted outputs from the model.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiOutputResponse> postModelOutputs(
        com.clarifai.grpc.api.PostModelOutputsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostModelOutputsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific model type.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleModelTypeResponse> getModelType(
        com.clarifai.grpc.api.GetModelTypeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetModelTypeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all the model types available in the platform.
     * This MUST be above ListModels so that the /models/types endpoint takes precedence.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiModelTypeResponse> listModelTypes(
        com.clarifai.grpc.api.ListModelTypesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListModelTypesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific model from an app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleModelResponse> getModel(
        com.clarifai.grpc.api.GetModelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetModelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a the output info for a given model_id or model_id/version_id
     * combo.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleModelResponse> getModelOutputInfo(
        com.clarifai.grpc.api.GetModelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetModelOutputInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all the models.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiModelResponse> listModels(
        com.clarifai.grpc.api.ListModelsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListModelsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Search over the models to find one or more you're looking for.
     * This leverage the "body" parameter because we also have page and
     * per_page as url query param variables in this request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiModelResponse> postModelsSearches(
        com.clarifai.grpc.api.PostModelsSearchesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostModelsSearchesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add a models to an app.
     * FIXME(zeiler): this should have been a plural response.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleModelResponse> postModels(
        com.clarifai.grpc.api.PostModelsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostModelsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Patch one or more models.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiModelResponse> patchModels(
        com.clarifai.grpc.api.PatchModelsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPatchModelsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a single model.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteModel(
        com.clarifai.grpc.api.DeleteModelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteModelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete multiple models in one request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteModels(
        com.clarifai.grpc.api.DeleteModelsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteModelsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all the inputs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiInputResponse> listModelInputs(
        com.clarifai.grpc.api.ListModelInputsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListModelInputsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific model from an app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleModelVersionResponse> getModelVersion(
        com.clarifai.grpc.api.GetModelVersionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetModelVersionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all the models.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiModelVersionResponse> listModelVersions(
        com.clarifai.grpc.api.ListModelVersionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListModelVersionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a new model version to trigger training of the model.
     * FIXME(zeiler): this should have been a plural response.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleModelResponse> postModelVersions(
        com.clarifai.grpc.api.PostModelVersionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostModelVersionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiModelVersionResponse> patchModelVersions(
        com.clarifai.grpc.api.PatchModelVersionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPatchModelVersionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a single model.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteModelVersion(
        com.clarifai.grpc.api.DeleteModelVersionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteModelVersionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the evaluation metrics for a model version.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleModelVersionResponse> getModelVersionMetrics(
        com.clarifai.grpc.api.GetModelVersionMetricsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetModelVersionMetricsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Run the evaluation metrics for a model version.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleModelVersionResponse> postModelVersionMetrics(
        com.clarifai.grpc.api.PostModelVersionMetricsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostModelVersionMetricsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific workflow from an app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleWorkflowResponse> getWorkflow(
        com.clarifai.grpc.api.GetWorkflowRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetWorkflowMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all the workflows.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiWorkflowResponse> listWorkflows(
        com.clarifai.grpc.api.ListWorkflowsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListWorkflowsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add a workflow to an app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiWorkflowResponse> postWorkflows(
        com.clarifai.grpc.api.PostWorkflowsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostWorkflowsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Patch one or more workflows.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiWorkflowResponse> patchWorkflows(
        com.clarifai.grpc.api.PatchWorkflowsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPatchWorkflowsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a single workflow.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteWorkflow(
        com.clarifai.grpc.api.DeleteWorkflowRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteWorkflowMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete multiple workflows in one request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteWorkflows(
        com.clarifai.grpc.api.DeleteWorkflowsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteWorkflowsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Predict using a workflow.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.PostWorkflowResultsResponse> postWorkflowResults(
        com.clarifai.grpc.api.PostWorkflowResultsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostWorkflowResultsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.PostWorkflowResultsSimilarityResponse> postWorkflowResultsSimilarity(
        com.clarifai.grpc.api.PostWorkflowResultsSimilarityRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostWorkflowResultsSimilarityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific key from an app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleKeyResponse> getKey(
        com.clarifai.grpc.api.GetKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all the keys.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiKeyResponse> listKeys(
        com.clarifai.grpc.api.ListKeysRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListKeysMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List keys by app_id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiKeyResponse> listAppKeys(
        com.clarifai.grpc.api.ListAppKeysRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListAppKeysMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Search over the keys to find one or more you're looking for.
     * This leverage the "body" parameter because we also have page and
     * per_page as url query param variables in this request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteKey(
        com.clarifai.grpc.api.DeleteKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add a key to an app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiKeyResponse> postKeys(
        com.clarifai.grpc.api.PostKeysRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostKeysMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Patch one or more keys.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiKeyResponse> patchKeys(
        com.clarifai.grpc.api.PatchKeysRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPatchKeysMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * API Keys in the public API -- request is itself Key authorized, and will tell
     * the user the scopes/access of the key/credential they're providing, as computed by
     * our authorizer:
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiScopeResponse> myScopes(
        com.clarifai.grpc.api.MyScopesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMyScopesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all auth scopes available to me as a user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiScopeDepsResponse> listScopes(
        com.clarifai.grpc.api.ListScopesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListScopesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific app from an app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleAppResponse> getApp(
        com.clarifai.grpc.api.GetAppRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAppMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all the apps.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiAppResponse> listApps(
        com.clarifai.grpc.api.ListAppsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListAppsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Search over the apps to find one or more you're looking for.
     * This leverage the "body" parameter because we also have page and
     * per_page as url query param variables in this request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteApp(
        com.clarifai.grpc.api.DeleteAppRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteAppMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add a app to an app.
     * This needs to load the default workflow to make a copy, validating all the models in it, and
     * then writing the new workflow back to this new app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiAppResponse> postApps(
        com.clarifai.grpc.api.PostAppsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostAppsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Patch one or more apps.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiAppResponse> patchApps(
        com.clarifai.grpc.api.PatchAppsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPatchAppsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Search over the applications to find one or more you're looking for.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiAppResponse> postAppsSearches(
        com.clarifai.grpc.api.PostAppsSearchesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostAppsSearchesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Validate new password in real-time for a user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SinglePasswordValidationResponse> postValidatePassword(
        com.clarifai.grpc.api.PostValidatePasswordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostValidatePasswordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a saved search.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleSearchResponse> getSearch(
        com.clarifai.grpc.api.GetSearchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all saved searches.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiSearchResponse> listSearches(
        com.clarifai.grpc.api.ListSearchesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListSearchesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Execute a new search and optionally save it.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiSearchResponse> postSearches(
        com.clarifai.grpc.api.PostSearchesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostSearchesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Execute a previously saved search.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiSearchResponse> postSearchesByID(
        com.clarifai.grpc.api.PostSearchesByIDRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostSearchesByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Evaluate the results of two search requests
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse> postAnnotationSearchMetrics(
        com.clarifai.grpc.api.PostAnnotationSearchMetricsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostAnnotationSearchMetricsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the evaluation results between two search requests
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse> getAnnotationSearchMetrics(
        com.clarifai.grpc.api.GetAnnotationSearchMetricsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAnnotationSearchMetricsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List the evaluation results between two search requests
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse> listAnnotationSearchMetrics(
        com.clarifai.grpc.api.ListAnnotationSearchMetricsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListAnnotationSearchMetricsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteAnnotationSearchMetrics(
        com.clarifai.grpc.api.DeleteAnnotationSearchMetricsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteAnnotationSearchMetricsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a saved search.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteSearch(
        com.clarifai.grpc.api.DeleteSearchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all status codes.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiStatusCodeResponse> listStatusCodes(
        com.clarifai.grpc.api.ListStatusCodesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListStatusCodesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get more details for a status code.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleStatusCodeResponse> getStatusCode(
        com.clarifai.grpc.api.GetStatusCodeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStatusCodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * owner list users who the app is shared with
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiCollaboratorsResponse> listCollaborators(
        com.clarifai.grpc.api.ListCollaboratorsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListCollaboratorsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * add collaborators to an app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiCollaboratorsResponse> postCollaborators(
        com.clarifai.grpc.api.PostCollaboratorsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostCollaboratorsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Patch existing collaborators.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiCollaboratorsResponse> patchCollaborators(
        com.clarifai.grpc.api.PatchCollaboratorsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPatchCollaboratorsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete existing collaborators.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteCollaborators(
        com.clarifai.grpc.api.DeleteCollaboratorsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteCollaboratorsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Collaboration includes the app user are invitied to work on
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiCollaborationsResponse> listCollaborations(
        com.clarifai.grpc.api.ListCollaborationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListCollaborationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * start to duplicate an app which copies all the inputs, annotations, models, concepts etc. to a new app.
     * this is an async process, you should use ListAppDuplications or GetAppDuplication to check the status.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiAppDuplicationsResponse> postAppDuplications(
        com.clarifai.grpc.api.PostAppDuplicationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostAppDuplicationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * list all the app duplications user triggers
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiAppDuplicationsResponse> listAppDuplications(
        com.clarifai.grpc.api.ListAppDuplicationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListAppDuplicationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get the app duplication status
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleAppDuplicationResponse> getAppDuplication(
        com.clarifai.grpc.api.GetAppDuplicationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAppDuplicationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add tasks to an app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiTaskResponse> postTasks(
        com.clarifai.grpc.api.PostTasksRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostTasksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Task annotation count
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleTaskCountResponse> getTaskAnnotationCount(
        com.clarifai.grpc.api.GetTaskCountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTaskAnnotationCountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Task Input count
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleTaskCountResponse> getTaskInputCount(
        com.clarifai.grpc.api.GetTaskCountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTaskInputCountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific task from an app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleTaskResponse> getTask(
        com.clarifai.grpc.api.GetTaskRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTaskMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List tasks from an app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiTaskResponse> listTasks(
        com.clarifai.grpc.api.ListTasksRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListTasksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Patch one or more tasks.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiTaskResponse> patchTasks(
        com.clarifai.grpc.api.PatchTasksRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPatchTasksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete multiple tasks in one request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteTasks(
        com.clarifai.grpc.api.DeleteTasksRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteTasksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add a list of Collectors to an app.
     * In the handler of this endpoint we also check for all the scopes of the  POST /inputs
     * endpoint.
     * Those current scopes are listed here as a hard requirement.
     * They are needed when adding the collectors just so we now that you have permission with
     * that key at least to do the writing to this app with POST /inputs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiCollectorResponse> postCollectors(
        com.clarifai.grpc.api.PostCollectorsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostCollectorsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific collector from an app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleCollectorResponse> getCollector(
        com.clarifai.grpc.api.GetCollectorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCollectorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all the collectors.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiCollectorResponse> listCollectors(
        com.clarifai.grpc.api.ListCollectorsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListCollectorsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Patch one or more collectors.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiCollectorResponse> patchCollectors(
        com.clarifai.grpc.api.PatchCollectorsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPatchCollectorsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete multiple collectors in one request.
     * This call is asynchronous. Use DeleteCollector if you want a synchronous version.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteCollectors(
        com.clarifai.grpc.api.DeleteCollectorsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteCollectorsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiStatValueResponse> postStatValues(
        com.clarifai.grpc.api.PostStatValuesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostStatValuesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiStatValueAggregateResponse> postStatValuesAggregate(
        com.clarifai.grpc.api.PostStatValuesAggregateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostStatValuesAggregateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_CONCEPT_RELATIONS = 0;
  private static final int METHODID_POST_CONCEPT_RELATIONS = 1;
  private static final int METHODID_DELETE_CONCEPT_RELATIONS = 2;
  private static final int METHODID_GET_CONCEPT_COUNTS = 3;
  private static final int METHODID_GET_CONCEPT = 4;
  private static final int METHODID_LIST_CONCEPTS = 5;
  private static final int METHODID_POST_CONCEPTS_SEARCHES = 6;
  private static final int METHODID_POST_CONCEPTS = 7;
  private static final int METHODID_PATCH_CONCEPTS = 8;
  private static final int METHODID_GET_CONCEPT_LANGUAGE = 9;
  private static final int METHODID_LIST_CONCEPT_LANGUAGES = 10;
  private static final int METHODID_POST_CONCEPT_LANGUAGES = 11;
  private static final int METHODID_PATCH_CONCEPT_LANGUAGES = 12;
  private static final int METHODID_LIST_KNOWLEDGE_GRAPHS = 13;
  private static final int METHODID_POST_KNOWLEDGE_GRAPHS = 14;
  private static final int METHODID_POST_CONCEPT_MAPPING_JOBS = 15;
  private static final int METHODID_GET_ANNOTATION = 16;
  private static final int METHODID_LIST_ANNOTATIONS = 17;
  private static final int METHODID_POST_ANNOTATIONS = 18;
  private static final int METHODID_PATCH_ANNOTATIONS = 19;
  private static final int METHODID_PATCH_ANNOTATIONS_STATUS = 20;
  private static final int METHODID_DELETE_ANNOTATION = 21;
  private static final int METHODID_DELETE_ANNOTATIONS = 22;
  private static final int METHODID_POST_ANNOTATIONS_SEARCHES = 23;
  private static final int METHODID_GET_INPUT_COUNT = 24;
  private static final int METHODID_STREAM_INPUTS = 25;
  private static final int METHODID_GET_INPUT_SAMPLES = 26;
  private static final int METHODID_GET_INPUT = 27;
  private static final int METHODID_LIST_INPUTS = 28;
  private static final int METHODID_POST_INPUTS = 29;
  private static final int METHODID_PATCH_INPUTS = 30;
  private static final int METHODID_DELETE_INPUT = 31;
  private static final int METHODID_DELETE_INPUTS = 32;
  private static final int METHODID_POST_INPUTS_SEARCHES = 33;
  private static final int METHODID_POST_MODEL_OUTPUTS = 34;
  private static final int METHODID_GET_MODEL_TYPE = 35;
  private static final int METHODID_LIST_MODEL_TYPES = 36;
  private static final int METHODID_GET_MODEL = 37;
  private static final int METHODID_GET_MODEL_OUTPUT_INFO = 38;
  private static final int METHODID_LIST_MODELS = 39;
  private static final int METHODID_POST_MODELS_SEARCHES = 40;
  private static final int METHODID_POST_MODELS = 41;
  private static final int METHODID_PATCH_MODELS = 42;
  private static final int METHODID_DELETE_MODEL = 43;
  private static final int METHODID_DELETE_MODELS = 44;
  private static final int METHODID_LIST_MODEL_INPUTS = 45;
  private static final int METHODID_GET_MODEL_VERSION = 46;
  private static final int METHODID_LIST_MODEL_VERSIONS = 47;
  private static final int METHODID_POST_MODEL_VERSIONS = 48;
  private static final int METHODID_PATCH_MODEL_VERSIONS = 49;
  private static final int METHODID_DELETE_MODEL_VERSION = 50;
  private static final int METHODID_GET_MODEL_VERSION_METRICS = 51;
  private static final int METHODID_POST_MODEL_VERSION_METRICS = 52;
  private static final int METHODID_GET_WORKFLOW = 53;
  private static final int METHODID_LIST_WORKFLOWS = 54;
  private static final int METHODID_POST_WORKFLOWS = 55;
  private static final int METHODID_PATCH_WORKFLOWS = 56;
  private static final int METHODID_DELETE_WORKFLOW = 57;
  private static final int METHODID_DELETE_WORKFLOWS = 58;
  private static final int METHODID_POST_WORKFLOW_RESULTS = 59;
  private static final int METHODID_POST_WORKFLOW_RESULTS_SIMILARITY = 60;
  private static final int METHODID_GET_KEY = 61;
  private static final int METHODID_LIST_KEYS = 62;
  private static final int METHODID_LIST_APP_KEYS = 63;
  private static final int METHODID_DELETE_KEY = 64;
  private static final int METHODID_POST_KEYS = 65;
  private static final int METHODID_PATCH_KEYS = 66;
  private static final int METHODID_MY_SCOPES = 67;
  private static final int METHODID_LIST_SCOPES = 68;
  private static final int METHODID_GET_APP = 69;
  private static final int METHODID_LIST_APPS = 70;
  private static final int METHODID_DELETE_APP = 71;
  private static final int METHODID_POST_APPS = 72;
  private static final int METHODID_PATCH_APPS = 73;
  private static final int METHODID_POST_APPS_SEARCHES = 74;
  private static final int METHODID_POST_VALIDATE_PASSWORD = 75;
  private static final int METHODID_GET_SEARCH = 76;
  private static final int METHODID_LIST_SEARCHES = 77;
  private static final int METHODID_POST_SEARCHES = 78;
  private static final int METHODID_POST_SEARCHES_BY_ID = 79;
  private static final int METHODID_POST_ANNOTATION_SEARCH_METRICS = 80;
  private static final int METHODID_GET_ANNOTATION_SEARCH_METRICS = 81;
  private static final int METHODID_LIST_ANNOTATION_SEARCH_METRICS = 82;
  private static final int METHODID_DELETE_ANNOTATION_SEARCH_METRICS = 83;
  private static final int METHODID_DELETE_SEARCH = 84;
  private static final int METHODID_LIST_STATUS_CODES = 85;
  private static final int METHODID_GET_STATUS_CODE = 86;
  private static final int METHODID_LIST_COLLABORATORS = 87;
  private static final int METHODID_POST_COLLABORATORS = 88;
  private static final int METHODID_PATCH_COLLABORATORS = 89;
  private static final int METHODID_DELETE_COLLABORATORS = 90;
  private static final int METHODID_LIST_COLLABORATIONS = 91;
  private static final int METHODID_POST_APP_DUPLICATIONS = 92;
  private static final int METHODID_LIST_APP_DUPLICATIONS = 93;
  private static final int METHODID_GET_APP_DUPLICATION = 94;
  private static final int METHODID_POST_TASKS = 95;
  private static final int METHODID_GET_TASK_ANNOTATION_COUNT = 96;
  private static final int METHODID_GET_TASK_INPUT_COUNT = 97;
  private static final int METHODID_GET_TASK = 98;
  private static final int METHODID_LIST_TASKS = 99;
  private static final int METHODID_PATCH_TASKS = 100;
  private static final int METHODID_DELETE_TASKS = 101;
  private static final int METHODID_POST_COLLECTORS = 102;
  private static final int METHODID_GET_COLLECTOR = 103;
  private static final int METHODID_LIST_COLLECTORS = 104;
  private static final int METHODID_PATCH_COLLECTORS = 105;
  private static final int METHODID_DELETE_COLLECTORS = 106;
  private static final int METHODID_POST_STAT_VALUES = 107;
  private static final int METHODID_POST_STAT_VALUES_AGGREGATE = 108;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final V2ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(V2ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_CONCEPT_RELATIONS:
          serviceImpl.listConceptRelations((com.clarifai.grpc.api.ListConceptRelationsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptRelationResponse>) responseObserver);
          break;
        case METHODID_POST_CONCEPT_RELATIONS:
          serviceImpl.postConceptRelations((com.clarifai.grpc.api.PostConceptRelationsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptRelationResponse>) responseObserver);
          break;
        case METHODID_DELETE_CONCEPT_RELATIONS:
          serviceImpl.deleteConceptRelations((com.clarifai.grpc.api.DeleteConceptRelationsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse>) responseObserver);
          break;
        case METHODID_GET_CONCEPT_COUNTS:
          serviceImpl.getConceptCounts((com.clarifai.grpc.api.GetConceptCountsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptCountResponse>) responseObserver);
          break;
        case METHODID_GET_CONCEPT:
          serviceImpl.getConcept((com.clarifai.grpc.api.GetConceptRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleConceptResponse>) responseObserver);
          break;
        case METHODID_LIST_CONCEPTS:
          serviceImpl.listConcepts((com.clarifai.grpc.api.ListConceptsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptResponse>) responseObserver);
          break;
        case METHODID_POST_CONCEPTS_SEARCHES:
          serviceImpl.postConceptsSearches((com.clarifai.grpc.api.PostConceptsSearchesRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptResponse>) responseObserver);
          break;
        case METHODID_POST_CONCEPTS:
          serviceImpl.postConcepts((com.clarifai.grpc.api.PostConceptsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptResponse>) responseObserver);
          break;
        case METHODID_PATCH_CONCEPTS:
          serviceImpl.patchConcepts((com.clarifai.grpc.api.PatchConceptsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptResponse>) responseObserver);
          break;
        case METHODID_GET_CONCEPT_LANGUAGE:
          serviceImpl.getConceptLanguage((com.clarifai.grpc.api.GetConceptLanguageRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleConceptLanguageResponse>) responseObserver);
          break;
        case METHODID_LIST_CONCEPT_LANGUAGES:
          serviceImpl.listConceptLanguages((com.clarifai.grpc.api.ListConceptLanguagesRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptLanguageResponse>) responseObserver);
          break;
        case METHODID_POST_CONCEPT_LANGUAGES:
          serviceImpl.postConceptLanguages((com.clarifai.grpc.api.PostConceptLanguagesRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptLanguageResponse>) responseObserver);
          break;
        case METHODID_PATCH_CONCEPT_LANGUAGES:
          serviceImpl.patchConceptLanguages((com.clarifai.grpc.api.PatchConceptLanguagesRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptLanguageResponse>) responseObserver);
          break;
        case METHODID_LIST_KNOWLEDGE_GRAPHS:
          serviceImpl.listKnowledgeGraphs((com.clarifai.grpc.api.ListKnowledgeGraphsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiKnowledgeGraphResponse>) responseObserver);
          break;
        case METHODID_POST_KNOWLEDGE_GRAPHS:
          serviceImpl.postKnowledgeGraphs((com.clarifai.grpc.api.PostKnowledgeGraphsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiKnowledgeGraphResponse>) responseObserver);
          break;
        case METHODID_POST_CONCEPT_MAPPING_JOBS:
          serviceImpl.postConceptMappingJobs((com.clarifai.grpc.api.PostConceptMappingJobsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptMappingJobResponse>) responseObserver);
          break;
        case METHODID_GET_ANNOTATION:
          serviceImpl.getAnnotation((com.clarifai.grpc.api.GetAnnotationRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleAnnotationResponse>) responseObserver);
          break;
        case METHODID_LIST_ANNOTATIONS:
          serviceImpl.listAnnotations((com.clarifai.grpc.api.ListAnnotationsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAnnotationResponse>) responseObserver);
          break;
        case METHODID_POST_ANNOTATIONS:
          serviceImpl.postAnnotations((com.clarifai.grpc.api.PostAnnotationsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAnnotationResponse>) responseObserver);
          break;
        case METHODID_PATCH_ANNOTATIONS:
          serviceImpl.patchAnnotations((com.clarifai.grpc.api.PatchAnnotationsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAnnotationResponse>) responseObserver);
          break;
        case METHODID_PATCH_ANNOTATIONS_STATUS:
          serviceImpl.patchAnnotationsStatus((com.clarifai.grpc.api.PatchAnnotationsStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.PatchAnnotationsStatusResponse>) responseObserver);
          break;
        case METHODID_DELETE_ANNOTATION:
          serviceImpl.deleteAnnotation((com.clarifai.grpc.api.DeleteAnnotationRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse>) responseObserver);
          break;
        case METHODID_DELETE_ANNOTATIONS:
          serviceImpl.deleteAnnotations((com.clarifai.grpc.api.DeleteAnnotationsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse>) responseObserver);
          break;
        case METHODID_POST_ANNOTATIONS_SEARCHES:
          serviceImpl.postAnnotationsSearches((com.clarifai.grpc.api.PostAnnotationsSearchesRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiSearchResponse>) responseObserver);
          break;
        case METHODID_GET_INPUT_COUNT:
          serviceImpl.getInputCount((com.clarifai.grpc.api.GetInputCountRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleInputCountResponse>) responseObserver);
          break;
        case METHODID_STREAM_INPUTS:
          serviceImpl.streamInputs((com.clarifai.grpc.api.StreamInputsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputResponse>) responseObserver);
          break;
        case METHODID_GET_INPUT_SAMPLES:
          serviceImpl.getInputSamples((com.clarifai.grpc.api.GetInputSamplesRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputAnnotationResponse>) responseObserver);
          break;
        case METHODID_GET_INPUT:
          serviceImpl.getInput((com.clarifai.grpc.api.GetInputRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleInputResponse>) responseObserver);
          break;
        case METHODID_LIST_INPUTS:
          serviceImpl.listInputs((com.clarifai.grpc.api.ListInputsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputResponse>) responseObserver);
          break;
        case METHODID_POST_INPUTS:
          serviceImpl.postInputs((com.clarifai.grpc.api.PostInputsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputResponse>) responseObserver);
          break;
        case METHODID_PATCH_INPUTS:
          serviceImpl.patchInputs((com.clarifai.grpc.api.PatchInputsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputResponse>) responseObserver);
          break;
        case METHODID_DELETE_INPUT:
          serviceImpl.deleteInput((com.clarifai.grpc.api.DeleteInputRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse>) responseObserver);
          break;
        case METHODID_DELETE_INPUTS:
          serviceImpl.deleteInputs((com.clarifai.grpc.api.DeleteInputsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse>) responseObserver);
          break;
        case METHODID_POST_INPUTS_SEARCHES:
          serviceImpl.postInputsSearches((com.clarifai.grpc.api.PostInputsSearchesRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiSearchResponse>) responseObserver);
          break;
        case METHODID_POST_MODEL_OUTPUTS:
          serviceImpl.postModelOutputs((com.clarifai.grpc.api.PostModelOutputsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiOutputResponse>) responseObserver);
          break;
        case METHODID_GET_MODEL_TYPE:
          serviceImpl.getModelType((com.clarifai.grpc.api.GetModelTypeRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelTypeResponse>) responseObserver);
          break;
        case METHODID_LIST_MODEL_TYPES:
          serviceImpl.listModelTypes((com.clarifai.grpc.api.ListModelTypesRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelTypeResponse>) responseObserver);
          break;
        case METHODID_GET_MODEL:
          serviceImpl.getModel((com.clarifai.grpc.api.GetModelRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelResponse>) responseObserver);
          break;
        case METHODID_GET_MODEL_OUTPUT_INFO:
          serviceImpl.getModelOutputInfo((com.clarifai.grpc.api.GetModelRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelResponse>) responseObserver);
          break;
        case METHODID_LIST_MODELS:
          serviceImpl.listModels((com.clarifai.grpc.api.ListModelsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelResponse>) responseObserver);
          break;
        case METHODID_POST_MODELS_SEARCHES:
          serviceImpl.postModelsSearches((com.clarifai.grpc.api.PostModelsSearchesRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelResponse>) responseObserver);
          break;
        case METHODID_POST_MODELS:
          serviceImpl.postModels((com.clarifai.grpc.api.PostModelsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelResponse>) responseObserver);
          break;
        case METHODID_PATCH_MODELS:
          serviceImpl.patchModels((com.clarifai.grpc.api.PatchModelsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelResponse>) responseObserver);
          break;
        case METHODID_DELETE_MODEL:
          serviceImpl.deleteModel((com.clarifai.grpc.api.DeleteModelRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse>) responseObserver);
          break;
        case METHODID_DELETE_MODELS:
          serviceImpl.deleteModels((com.clarifai.grpc.api.DeleteModelsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse>) responseObserver);
          break;
        case METHODID_LIST_MODEL_INPUTS:
          serviceImpl.listModelInputs((com.clarifai.grpc.api.ListModelInputsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputResponse>) responseObserver);
          break;
        case METHODID_GET_MODEL_VERSION:
          serviceImpl.getModelVersion((com.clarifai.grpc.api.GetModelVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelVersionResponse>) responseObserver);
          break;
        case METHODID_LIST_MODEL_VERSIONS:
          serviceImpl.listModelVersions((com.clarifai.grpc.api.ListModelVersionsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelVersionResponse>) responseObserver);
          break;
        case METHODID_POST_MODEL_VERSIONS:
          serviceImpl.postModelVersions((com.clarifai.grpc.api.PostModelVersionsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelResponse>) responseObserver);
          break;
        case METHODID_PATCH_MODEL_VERSIONS:
          serviceImpl.patchModelVersions((com.clarifai.grpc.api.PatchModelVersionsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelVersionResponse>) responseObserver);
          break;
        case METHODID_DELETE_MODEL_VERSION:
          serviceImpl.deleteModelVersion((com.clarifai.grpc.api.DeleteModelVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse>) responseObserver);
          break;
        case METHODID_GET_MODEL_VERSION_METRICS:
          serviceImpl.getModelVersionMetrics((com.clarifai.grpc.api.GetModelVersionMetricsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelVersionResponse>) responseObserver);
          break;
        case METHODID_POST_MODEL_VERSION_METRICS:
          serviceImpl.postModelVersionMetrics((com.clarifai.grpc.api.PostModelVersionMetricsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelVersionResponse>) responseObserver);
          break;
        case METHODID_GET_WORKFLOW:
          serviceImpl.getWorkflow((com.clarifai.grpc.api.GetWorkflowRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleWorkflowResponse>) responseObserver);
          break;
        case METHODID_LIST_WORKFLOWS:
          serviceImpl.listWorkflows((com.clarifai.grpc.api.ListWorkflowsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiWorkflowResponse>) responseObserver);
          break;
        case METHODID_POST_WORKFLOWS:
          serviceImpl.postWorkflows((com.clarifai.grpc.api.PostWorkflowsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiWorkflowResponse>) responseObserver);
          break;
        case METHODID_PATCH_WORKFLOWS:
          serviceImpl.patchWorkflows((com.clarifai.grpc.api.PatchWorkflowsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiWorkflowResponse>) responseObserver);
          break;
        case METHODID_DELETE_WORKFLOW:
          serviceImpl.deleteWorkflow((com.clarifai.grpc.api.DeleteWorkflowRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse>) responseObserver);
          break;
        case METHODID_DELETE_WORKFLOWS:
          serviceImpl.deleteWorkflows((com.clarifai.grpc.api.DeleteWorkflowsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse>) responseObserver);
          break;
        case METHODID_POST_WORKFLOW_RESULTS:
          serviceImpl.postWorkflowResults((com.clarifai.grpc.api.PostWorkflowResultsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.PostWorkflowResultsResponse>) responseObserver);
          break;
        case METHODID_POST_WORKFLOW_RESULTS_SIMILARITY:
          serviceImpl.postWorkflowResultsSimilarity((com.clarifai.grpc.api.PostWorkflowResultsSimilarityRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.PostWorkflowResultsSimilarityResponse>) responseObserver);
          break;
        case METHODID_GET_KEY:
          serviceImpl.getKey((com.clarifai.grpc.api.GetKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleKeyResponse>) responseObserver);
          break;
        case METHODID_LIST_KEYS:
          serviceImpl.listKeys((com.clarifai.grpc.api.ListKeysRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiKeyResponse>) responseObserver);
          break;
        case METHODID_LIST_APP_KEYS:
          serviceImpl.listAppKeys((com.clarifai.grpc.api.ListAppKeysRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiKeyResponse>) responseObserver);
          break;
        case METHODID_DELETE_KEY:
          serviceImpl.deleteKey((com.clarifai.grpc.api.DeleteKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse>) responseObserver);
          break;
        case METHODID_POST_KEYS:
          serviceImpl.postKeys((com.clarifai.grpc.api.PostKeysRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiKeyResponse>) responseObserver);
          break;
        case METHODID_PATCH_KEYS:
          serviceImpl.patchKeys((com.clarifai.grpc.api.PatchKeysRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiKeyResponse>) responseObserver);
          break;
        case METHODID_MY_SCOPES:
          serviceImpl.myScopes((com.clarifai.grpc.api.MyScopesRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiScopeResponse>) responseObserver);
          break;
        case METHODID_LIST_SCOPES:
          serviceImpl.listScopes((com.clarifai.grpc.api.ListScopesRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiScopeDepsResponse>) responseObserver);
          break;
        case METHODID_GET_APP:
          serviceImpl.getApp((com.clarifai.grpc.api.GetAppRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleAppResponse>) responseObserver);
          break;
        case METHODID_LIST_APPS:
          serviceImpl.listApps((com.clarifai.grpc.api.ListAppsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAppResponse>) responseObserver);
          break;
        case METHODID_DELETE_APP:
          serviceImpl.deleteApp((com.clarifai.grpc.api.DeleteAppRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse>) responseObserver);
          break;
        case METHODID_POST_APPS:
          serviceImpl.postApps((com.clarifai.grpc.api.PostAppsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAppResponse>) responseObserver);
          break;
        case METHODID_PATCH_APPS:
          serviceImpl.patchApps((com.clarifai.grpc.api.PatchAppsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAppResponse>) responseObserver);
          break;
        case METHODID_POST_APPS_SEARCHES:
          serviceImpl.postAppsSearches((com.clarifai.grpc.api.PostAppsSearchesRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAppResponse>) responseObserver);
          break;
        case METHODID_POST_VALIDATE_PASSWORD:
          serviceImpl.postValidatePassword((com.clarifai.grpc.api.PostValidatePasswordRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SinglePasswordValidationResponse>) responseObserver);
          break;
        case METHODID_GET_SEARCH:
          serviceImpl.getSearch((com.clarifai.grpc.api.GetSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleSearchResponse>) responseObserver);
          break;
        case METHODID_LIST_SEARCHES:
          serviceImpl.listSearches((com.clarifai.grpc.api.ListSearchesRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiSearchResponse>) responseObserver);
          break;
        case METHODID_POST_SEARCHES:
          serviceImpl.postSearches((com.clarifai.grpc.api.PostSearchesRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiSearchResponse>) responseObserver);
          break;
        case METHODID_POST_SEARCHES_BY_ID:
          serviceImpl.postSearchesByID((com.clarifai.grpc.api.PostSearchesByIDRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiSearchResponse>) responseObserver);
          break;
        case METHODID_POST_ANNOTATION_SEARCH_METRICS:
          serviceImpl.postAnnotationSearchMetrics((com.clarifai.grpc.api.PostAnnotationSearchMetricsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse>) responseObserver);
          break;
        case METHODID_GET_ANNOTATION_SEARCH_METRICS:
          serviceImpl.getAnnotationSearchMetrics((com.clarifai.grpc.api.GetAnnotationSearchMetricsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse>) responseObserver);
          break;
        case METHODID_LIST_ANNOTATION_SEARCH_METRICS:
          serviceImpl.listAnnotationSearchMetrics((com.clarifai.grpc.api.ListAnnotationSearchMetricsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse>) responseObserver);
          break;
        case METHODID_DELETE_ANNOTATION_SEARCH_METRICS:
          serviceImpl.deleteAnnotationSearchMetrics((com.clarifai.grpc.api.DeleteAnnotationSearchMetricsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse>) responseObserver);
          break;
        case METHODID_DELETE_SEARCH:
          serviceImpl.deleteSearch((com.clarifai.grpc.api.DeleteSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse>) responseObserver);
          break;
        case METHODID_LIST_STATUS_CODES:
          serviceImpl.listStatusCodes((com.clarifai.grpc.api.ListStatusCodesRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiStatusCodeResponse>) responseObserver);
          break;
        case METHODID_GET_STATUS_CODE:
          serviceImpl.getStatusCode((com.clarifai.grpc.api.GetStatusCodeRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleStatusCodeResponse>) responseObserver);
          break;
        case METHODID_LIST_COLLABORATORS:
          serviceImpl.listCollaborators((com.clarifai.grpc.api.ListCollaboratorsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiCollaboratorsResponse>) responseObserver);
          break;
        case METHODID_POST_COLLABORATORS:
          serviceImpl.postCollaborators((com.clarifai.grpc.api.PostCollaboratorsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiCollaboratorsResponse>) responseObserver);
          break;
        case METHODID_PATCH_COLLABORATORS:
          serviceImpl.patchCollaborators((com.clarifai.grpc.api.PatchCollaboratorsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiCollaboratorsResponse>) responseObserver);
          break;
        case METHODID_DELETE_COLLABORATORS:
          serviceImpl.deleteCollaborators((com.clarifai.grpc.api.DeleteCollaboratorsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse>) responseObserver);
          break;
        case METHODID_LIST_COLLABORATIONS:
          serviceImpl.listCollaborations((com.clarifai.grpc.api.ListCollaborationsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiCollaborationsResponse>) responseObserver);
          break;
        case METHODID_POST_APP_DUPLICATIONS:
          serviceImpl.postAppDuplications((com.clarifai.grpc.api.PostAppDuplicationsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAppDuplicationsResponse>) responseObserver);
          break;
        case METHODID_LIST_APP_DUPLICATIONS:
          serviceImpl.listAppDuplications((com.clarifai.grpc.api.ListAppDuplicationsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAppDuplicationsResponse>) responseObserver);
          break;
        case METHODID_GET_APP_DUPLICATION:
          serviceImpl.getAppDuplication((com.clarifai.grpc.api.GetAppDuplicationRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleAppDuplicationResponse>) responseObserver);
          break;
        case METHODID_POST_TASKS:
          serviceImpl.postTasks((com.clarifai.grpc.api.PostTasksRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiTaskResponse>) responseObserver);
          break;
        case METHODID_GET_TASK_ANNOTATION_COUNT:
          serviceImpl.getTaskAnnotationCount((com.clarifai.grpc.api.GetTaskCountRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleTaskCountResponse>) responseObserver);
          break;
        case METHODID_GET_TASK_INPUT_COUNT:
          serviceImpl.getTaskInputCount((com.clarifai.grpc.api.GetTaskCountRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleTaskCountResponse>) responseObserver);
          break;
        case METHODID_GET_TASK:
          serviceImpl.getTask((com.clarifai.grpc.api.GetTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleTaskResponse>) responseObserver);
          break;
        case METHODID_LIST_TASKS:
          serviceImpl.listTasks((com.clarifai.grpc.api.ListTasksRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiTaskResponse>) responseObserver);
          break;
        case METHODID_PATCH_TASKS:
          serviceImpl.patchTasks((com.clarifai.grpc.api.PatchTasksRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiTaskResponse>) responseObserver);
          break;
        case METHODID_DELETE_TASKS:
          serviceImpl.deleteTasks((com.clarifai.grpc.api.DeleteTasksRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse>) responseObserver);
          break;
        case METHODID_POST_COLLECTORS:
          serviceImpl.postCollectors((com.clarifai.grpc.api.PostCollectorsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiCollectorResponse>) responseObserver);
          break;
        case METHODID_GET_COLLECTOR:
          serviceImpl.getCollector((com.clarifai.grpc.api.GetCollectorRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleCollectorResponse>) responseObserver);
          break;
        case METHODID_LIST_COLLECTORS:
          serviceImpl.listCollectors((com.clarifai.grpc.api.ListCollectorsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiCollectorResponse>) responseObserver);
          break;
        case METHODID_PATCH_COLLECTORS:
          serviceImpl.patchCollectors((com.clarifai.grpc.api.PatchCollectorsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiCollectorResponse>) responseObserver);
          break;
        case METHODID_DELETE_COLLECTORS:
          serviceImpl.deleteCollectors((com.clarifai.grpc.api.DeleteCollectorsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse>) responseObserver);
          break;
        case METHODID_POST_STAT_VALUES:
          serviceImpl.postStatValues((com.clarifai.grpc.api.PostStatValuesRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiStatValueResponse>) responseObserver);
          break;
        case METHODID_POST_STAT_VALUES_AGGREGATE:
          serviceImpl.postStatValuesAggregate((com.clarifai.grpc.api.PostStatValuesAggregateRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiStatValueAggregateResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class V2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    V2BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.clarifai.grpc.api.Service.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("V2");
    }
  }

  private static final class V2FileDescriptorSupplier
      extends V2BaseDescriptorSupplier {
    V2FileDescriptorSupplier() {}
  }

  private static final class V2MethodDescriptorSupplier
      extends V2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    V2MethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (V2Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new V2FileDescriptorSupplier())
              .addMethod(getListConceptRelationsMethod())
              .addMethod(getPostConceptRelationsMethod())
              .addMethod(getDeleteConceptRelationsMethod())
              .addMethod(getGetConceptCountsMethod())
              .addMethod(getGetConceptMethod())
              .addMethod(getListConceptsMethod())
              .addMethod(getPostConceptsSearchesMethod())
              .addMethod(getPostConceptsMethod())
              .addMethod(getPatchConceptsMethod())
              .addMethod(getGetConceptLanguageMethod())
              .addMethod(getListConceptLanguagesMethod())
              .addMethod(getPostConceptLanguagesMethod())
              .addMethod(getPatchConceptLanguagesMethod())
              .addMethod(getListKnowledgeGraphsMethod())
              .addMethod(getPostKnowledgeGraphsMethod())
              .addMethod(getPostConceptMappingJobsMethod())
              .addMethod(getGetAnnotationMethod())
              .addMethod(getListAnnotationsMethod())
              .addMethod(getPostAnnotationsMethod())
              .addMethod(getPatchAnnotationsMethod())
              .addMethod(getPatchAnnotationsStatusMethod())
              .addMethod(getDeleteAnnotationMethod())
              .addMethod(getDeleteAnnotationsMethod())
              .addMethod(getPostAnnotationsSearchesMethod())
              .addMethod(getGetInputCountMethod())
              .addMethod(getStreamInputsMethod())
              .addMethod(getGetInputSamplesMethod())
              .addMethod(getGetInputMethod())
              .addMethod(getListInputsMethod())
              .addMethod(getPostInputsMethod())
              .addMethod(getPatchInputsMethod())
              .addMethod(getDeleteInputMethod())
              .addMethod(getDeleteInputsMethod())
              .addMethod(getPostInputsSearchesMethod())
              .addMethod(getPostModelOutputsMethod())
              .addMethod(getGetModelTypeMethod())
              .addMethod(getListModelTypesMethod())
              .addMethod(getGetModelMethod())
              .addMethod(getGetModelOutputInfoMethod())
              .addMethod(getListModelsMethod())
              .addMethod(getPostModelsSearchesMethod())
              .addMethod(getPostModelsMethod())
              .addMethod(getPatchModelsMethod())
              .addMethod(getDeleteModelMethod())
              .addMethod(getDeleteModelsMethod())
              .addMethod(getListModelInputsMethod())
              .addMethod(getGetModelVersionMethod())
              .addMethod(getListModelVersionsMethod())
              .addMethod(getPostModelVersionsMethod())
              .addMethod(getPatchModelVersionsMethod())
              .addMethod(getDeleteModelVersionMethod())
              .addMethod(getGetModelVersionMetricsMethod())
              .addMethod(getPostModelVersionMetricsMethod())
              .addMethod(getGetWorkflowMethod())
              .addMethod(getListWorkflowsMethod())
              .addMethod(getPostWorkflowsMethod())
              .addMethod(getPatchWorkflowsMethod())
              .addMethod(getDeleteWorkflowMethod())
              .addMethod(getDeleteWorkflowsMethod())
              .addMethod(getPostWorkflowResultsMethod())
              .addMethod(getPostWorkflowResultsSimilarityMethod())
              .addMethod(getGetKeyMethod())
              .addMethod(getListKeysMethod())
              .addMethod(getListAppKeysMethod())
              .addMethod(getDeleteKeyMethod())
              .addMethod(getPostKeysMethod())
              .addMethod(getPatchKeysMethod())
              .addMethod(getMyScopesMethod())
              .addMethod(getListScopesMethod())
              .addMethod(getGetAppMethod())
              .addMethod(getListAppsMethod())
              .addMethod(getDeleteAppMethod())
              .addMethod(getPostAppsMethod())
              .addMethod(getPatchAppsMethod())
              .addMethod(getPostAppsSearchesMethod())
              .addMethod(getPostValidatePasswordMethod())
              .addMethod(getGetSearchMethod())
              .addMethod(getListSearchesMethod())
              .addMethod(getPostSearchesMethod())
              .addMethod(getPostSearchesByIDMethod())
              .addMethod(getPostAnnotationSearchMetricsMethod())
              .addMethod(getGetAnnotationSearchMetricsMethod())
              .addMethod(getListAnnotationSearchMetricsMethod())
              .addMethod(getDeleteAnnotationSearchMetricsMethod())
              .addMethod(getDeleteSearchMethod())
              .addMethod(getListStatusCodesMethod())
              .addMethod(getGetStatusCodeMethod())
              .addMethod(getListCollaboratorsMethod())
              .addMethod(getPostCollaboratorsMethod())
              .addMethod(getPatchCollaboratorsMethod())
              .addMethod(getDeleteCollaboratorsMethod())
              .addMethod(getListCollaborationsMethod())
              .addMethod(getPostAppDuplicationsMethod())
              .addMethod(getListAppDuplicationsMethod())
              .addMethod(getGetAppDuplicationMethod())
              .addMethod(getPostTasksMethod())
              .addMethod(getGetTaskAnnotationCountMethod())
              .addMethod(getGetTaskInputCountMethod())
              .addMethod(getGetTaskMethod())
              .addMethod(getListTasksMethod())
              .addMethod(getPatchTasksMethod())
              .addMethod(getDeleteTasksMethod())
              .addMethod(getPostCollectorsMethod())
              .addMethod(getGetCollectorMethod())
              .addMethod(getListCollectorsMethod())
              .addMethod(getPatchCollectorsMethod())
              .addMethod(getDeleteCollectorsMethod())
              .addMethod(getPostStatValuesMethod())
              .addMethod(getPostStatValuesAggregateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
