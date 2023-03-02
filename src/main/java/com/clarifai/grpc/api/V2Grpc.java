package com.clarifai.grpc.api;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: proto/clarifai/api/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
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

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListModelConceptsRequest,
      com.clarifai.grpc.api.MultiConceptResponse> getListModelConceptsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListModelConcepts",
      requestType = com.clarifai.grpc.api.ListModelConceptsRequest.class,
      responseType = com.clarifai.grpc.api.MultiConceptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListModelConceptsRequest,
      com.clarifai.grpc.api.MultiConceptResponse> getListModelConceptsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListModelConceptsRequest, com.clarifai.grpc.api.MultiConceptResponse> getListModelConceptsMethod;
    if ((getListModelConceptsMethod = V2Grpc.getListModelConceptsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListModelConceptsMethod = V2Grpc.getListModelConceptsMethod) == null) {
          V2Grpc.getListModelConceptsMethod = getListModelConceptsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListModelConceptsRequest, com.clarifai.grpc.api.MultiConceptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListModelConcepts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListModelConceptsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiConceptResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListModelConcepts"))
              .build();
        }
      }
    }
    return getListModelConceptsMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchAnnotationsSearchesRequest,
      com.clarifai.grpc.api.MultiSearchResponse> getPatchAnnotationsSearchesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PatchAnnotationsSearches",
      requestType = com.clarifai.grpc.api.PatchAnnotationsSearchesRequest.class,
      responseType = com.clarifai.grpc.api.MultiSearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchAnnotationsSearchesRequest,
      com.clarifai.grpc.api.MultiSearchResponse> getPatchAnnotationsSearchesMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchAnnotationsSearchesRequest, com.clarifai.grpc.api.MultiSearchResponse> getPatchAnnotationsSearchesMethod;
    if ((getPatchAnnotationsSearchesMethod = V2Grpc.getPatchAnnotationsSearchesMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPatchAnnotationsSearchesMethod = V2Grpc.getPatchAnnotationsSearchesMethod) == null) {
          V2Grpc.getPatchAnnotationsSearchesMethod = getPatchAnnotationsSearchesMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PatchAnnotationsSearchesRequest, com.clarifai.grpc.api.MultiSearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PatchAnnotationsSearches"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PatchAnnotationsSearchesRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiSearchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PatchAnnotationsSearches"))
              .build();
        }
      }
    }
    return getPatchAnnotationsSearchesMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchInputsSearchesRequest,
      com.clarifai.grpc.api.MultiSearchResponse> getPatchInputsSearchesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PatchInputsSearches",
      requestType = com.clarifai.grpc.api.PatchInputsSearchesRequest.class,
      responseType = com.clarifai.grpc.api.MultiSearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchInputsSearchesRequest,
      com.clarifai.grpc.api.MultiSearchResponse> getPatchInputsSearchesMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchInputsSearchesRequest, com.clarifai.grpc.api.MultiSearchResponse> getPatchInputsSearchesMethod;
    if ((getPatchInputsSearchesMethod = V2Grpc.getPatchInputsSearchesMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPatchInputsSearchesMethod = V2Grpc.getPatchInputsSearchesMethod) == null) {
          V2Grpc.getPatchInputsSearchesMethod = getPatchInputsSearchesMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PatchInputsSearchesRequest, com.clarifai.grpc.api.MultiSearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PatchInputsSearches"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PatchInputsSearchesRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiSearchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PatchInputsSearches"))
              .build();
        }
      }
    }
    return getPatchInputsSearchesMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListDatasetsRequest,
      com.clarifai.grpc.api.MultiDatasetResponse> getListDatasetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDatasets",
      requestType = com.clarifai.grpc.api.ListDatasetsRequest.class,
      responseType = com.clarifai.grpc.api.MultiDatasetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListDatasetsRequest,
      com.clarifai.grpc.api.MultiDatasetResponse> getListDatasetsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListDatasetsRequest, com.clarifai.grpc.api.MultiDatasetResponse> getListDatasetsMethod;
    if ((getListDatasetsMethod = V2Grpc.getListDatasetsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListDatasetsMethod = V2Grpc.getListDatasetsMethod) == null) {
          V2Grpc.getListDatasetsMethod = getListDatasetsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListDatasetsRequest, com.clarifai.grpc.api.MultiDatasetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDatasets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListDatasetsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiDatasetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListDatasets"))
              .build();
        }
      }
    }
    return getListDatasetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetDatasetRequest,
      com.clarifai.grpc.api.SingleDatasetResponse> getGetDatasetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDataset",
      requestType = com.clarifai.grpc.api.GetDatasetRequest.class,
      responseType = com.clarifai.grpc.api.SingleDatasetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetDatasetRequest,
      com.clarifai.grpc.api.SingleDatasetResponse> getGetDatasetMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetDatasetRequest, com.clarifai.grpc.api.SingleDatasetResponse> getGetDatasetMethod;
    if ((getGetDatasetMethod = V2Grpc.getGetDatasetMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getGetDatasetMethod = V2Grpc.getGetDatasetMethod) == null) {
          V2Grpc.getGetDatasetMethod = getGetDatasetMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.GetDatasetRequest, com.clarifai.grpc.api.SingleDatasetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDataset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.GetDatasetRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleDatasetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("GetDataset"))
              .build();
        }
      }
    }
    return getGetDatasetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostDatasetsRequest,
      com.clarifai.grpc.api.MultiDatasetResponse> getPostDatasetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostDatasets",
      requestType = com.clarifai.grpc.api.PostDatasetsRequest.class,
      responseType = com.clarifai.grpc.api.MultiDatasetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostDatasetsRequest,
      com.clarifai.grpc.api.MultiDatasetResponse> getPostDatasetsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostDatasetsRequest, com.clarifai.grpc.api.MultiDatasetResponse> getPostDatasetsMethod;
    if ((getPostDatasetsMethod = V2Grpc.getPostDatasetsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostDatasetsMethod = V2Grpc.getPostDatasetsMethod) == null) {
          V2Grpc.getPostDatasetsMethod = getPostDatasetsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostDatasetsRequest, com.clarifai.grpc.api.MultiDatasetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostDatasets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostDatasetsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiDatasetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostDatasets"))
              .build();
        }
      }
    }
    return getPostDatasetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchDatasetsRequest,
      com.clarifai.grpc.api.MultiDatasetResponse> getPatchDatasetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PatchDatasets",
      requestType = com.clarifai.grpc.api.PatchDatasetsRequest.class,
      responseType = com.clarifai.grpc.api.MultiDatasetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchDatasetsRequest,
      com.clarifai.grpc.api.MultiDatasetResponse> getPatchDatasetsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchDatasetsRequest, com.clarifai.grpc.api.MultiDatasetResponse> getPatchDatasetsMethod;
    if ((getPatchDatasetsMethod = V2Grpc.getPatchDatasetsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPatchDatasetsMethod = V2Grpc.getPatchDatasetsMethod) == null) {
          V2Grpc.getPatchDatasetsMethod = getPatchDatasetsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PatchDatasetsRequest, com.clarifai.grpc.api.MultiDatasetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PatchDatasets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PatchDatasetsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiDatasetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PatchDatasets"))
              .build();
        }
      }
    }
    return getPatchDatasetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchDatasetIdsRequest,
      com.clarifai.grpc.api.MultiDatasetResponse> getPatchDatasetIdsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PatchDatasetIds",
      requestType = com.clarifai.grpc.api.PatchDatasetIdsRequest.class,
      responseType = com.clarifai.grpc.api.MultiDatasetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchDatasetIdsRequest,
      com.clarifai.grpc.api.MultiDatasetResponse> getPatchDatasetIdsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchDatasetIdsRequest, com.clarifai.grpc.api.MultiDatasetResponse> getPatchDatasetIdsMethod;
    if ((getPatchDatasetIdsMethod = V2Grpc.getPatchDatasetIdsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPatchDatasetIdsMethod = V2Grpc.getPatchDatasetIdsMethod) == null) {
          V2Grpc.getPatchDatasetIdsMethod = getPatchDatasetIdsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PatchDatasetIdsRequest, com.clarifai.grpc.api.MultiDatasetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PatchDatasetIds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PatchDatasetIdsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiDatasetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PatchDatasetIds"))
              .build();
        }
      }
    }
    return getPatchDatasetIdsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteDatasetsRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteDatasetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDatasets",
      requestType = com.clarifai.grpc.api.DeleteDatasetsRequest.class,
      responseType = com.clarifai.grpc.api.status.BaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteDatasetsRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteDatasetsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteDatasetsRequest, com.clarifai.grpc.api.status.BaseResponse> getDeleteDatasetsMethod;
    if ((getDeleteDatasetsMethod = V2Grpc.getDeleteDatasetsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getDeleteDatasetsMethod = V2Grpc.getDeleteDatasetsMethod) == null) {
          V2Grpc.getDeleteDatasetsMethod = getDeleteDatasetsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.DeleteDatasetsRequest, com.clarifai.grpc.api.status.BaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDatasets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.DeleteDatasetsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.status.BaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("DeleteDatasets"))
              .build();
        }
      }
    }
    return getDeleteDatasetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListDatasetInputsRequest,
      com.clarifai.grpc.api.MultiDatasetInputResponse> getListDatasetInputsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDatasetInputs",
      requestType = com.clarifai.grpc.api.ListDatasetInputsRequest.class,
      responseType = com.clarifai.grpc.api.MultiDatasetInputResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListDatasetInputsRequest,
      com.clarifai.grpc.api.MultiDatasetInputResponse> getListDatasetInputsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListDatasetInputsRequest, com.clarifai.grpc.api.MultiDatasetInputResponse> getListDatasetInputsMethod;
    if ((getListDatasetInputsMethod = V2Grpc.getListDatasetInputsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListDatasetInputsMethod = V2Grpc.getListDatasetInputsMethod) == null) {
          V2Grpc.getListDatasetInputsMethod = getListDatasetInputsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListDatasetInputsRequest, com.clarifai.grpc.api.MultiDatasetInputResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDatasetInputs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListDatasetInputsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiDatasetInputResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListDatasetInputs"))
              .build();
        }
      }
    }
    return getListDatasetInputsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetDatasetInputRequest,
      com.clarifai.grpc.api.SingleDatasetInputResponse> getGetDatasetInputMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDatasetInput",
      requestType = com.clarifai.grpc.api.GetDatasetInputRequest.class,
      responseType = com.clarifai.grpc.api.SingleDatasetInputResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetDatasetInputRequest,
      com.clarifai.grpc.api.SingleDatasetInputResponse> getGetDatasetInputMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetDatasetInputRequest, com.clarifai.grpc.api.SingleDatasetInputResponse> getGetDatasetInputMethod;
    if ((getGetDatasetInputMethod = V2Grpc.getGetDatasetInputMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getGetDatasetInputMethod = V2Grpc.getGetDatasetInputMethod) == null) {
          V2Grpc.getGetDatasetInputMethod = getGetDatasetInputMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.GetDatasetInputRequest, com.clarifai.grpc.api.SingleDatasetInputResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDatasetInput"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.GetDatasetInputRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleDatasetInputResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("GetDatasetInput"))
              .build();
        }
      }
    }
    return getGetDatasetInputMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostDatasetInputsRequest,
      com.clarifai.grpc.api.MultiDatasetInputResponse> getPostDatasetInputsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostDatasetInputs",
      requestType = com.clarifai.grpc.api.PostDatasetInputsRequest.class,
      responseType = com.clarifai.grpc.api.MultiDatasetInputResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostDatasetInputsRequest,
      com.clarifai.grpc.api.MultiDatasetInputResponse> getPostDatasetInputsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostDatasetInputsRequest, com.clarifai.grpc.api.MultiDatasetInputResponse> getPostDatasetInputsMethod;
    if ((getPostDatasetInputsMethod = V2Grpc.getPostDatasetInputsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostDatasetInputsMethod = V2Grpc.getPostDatasetInputsMethod) == null) {
          V2Grpc.getPostDatasetInputsMethod = getPostDatasetInputsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostDatasetInputsRequest, com.clarifai.grpc.api.MultiDatasetInputResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostDatasetInputs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostDatasetInputsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiDatasetInputResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostDatasetInputs"))
              .build();
        }
      }
    }
    return getPostDatasetInputsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteDatasetInputsRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteDatasetInputsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDatasetInputs",
      requestType = com.clarifai.grpc.api.DeleteDatasetInputsRequest.class,
      responseType = com.clarifai.grpc.api.status.BaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteDatasetInputsRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteDatasetInputsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteDatasetInputsRequest, com.clarifai.grpc.api.status.BaseResponse> getDeleteDatasetInputsMethod;
    if ((getDeleteDatasetInputsMethod = V2Grpc.getDeleteDatasetInputsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getDeleteDatasetInputsMethod = V2Grpc.getDeleteDatasetInputsMethod) == null) {
          V2Grpc.getDeleteDatasetInputsMethod = getDeleteDatasetInputsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.DeleteDatasetInputsRequest, com.clarifai.grpc.api.status.BaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDatasetInputs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.DeleteDatasetInputsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.status.BaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("DeleteDatasetInputs"))
              .build();
        }
      }
    }
    return getDeleteDatasetInputsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListDatasetVersionsRequest,
      com.clarifai.grpc.api.MultiDatasetVersionResponse> getListDatasetVersionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDatasetVersions",
      requestType = com.clarifai.grpc.api.ListDatasetVersionsRequest.class,
      responseType = com.clarifai.grpc.api.MultiDatasetVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListDatasetVersionsRequest,
      com.clarifai.grpc.api.MultiDatasetVersionResponse> getListDatasetVersionsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListDatasetVersionsRequest, com.clarifai.grpc.api.MultiDatasetVersionResponse> getListDatasetVersionsMethod;
    if ((getListDatasetVersionsMethod = V2Grpc.getListDatasetVersionsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListDatasetVersionsMethod = V2Grpc.getListDatasetVersionsMethod) == null) {
          V2Grpc.getListDatasetVersionsMethod = getListDatasetVersionsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListDatasetVersionsRequest, com.clarifai.grpc.api.MultiDatasetVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDatasetVersions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListDatasetVersionsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiDatasetVersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListDatasetVersions"))
              .build();
        }
      }
    }
    return getListDatasetVersionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetDatasetVersionRequest,
      com.clarifai.grpc.api.SingleDatasetVersionResponse> getGetDatasetVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDatasetVersion",
      requestType = com.clarifai.grpc.api.GetDatasetVersionRequest.class,
      responseType = com.clarifai.grpc.api.SingleDatasetVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetDatasetVersionRequest,
      com.clarifai.grpc.api.SingleDatasetVersionResponse> getGetDatasetVersionMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetDatasetVersionRequest, com.clarifai.grpc.api.SingleDatasetVersionResponse> getGetDatasetVersionMethod;
    if ((getGetDatasetVersionMethod = V2Grpc.getGetDatasetVersionMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getGetDatasetVersionMethod = V2Grpc.getGetDatasetVersionMethod) == null) {
          V2Grpc.getGetDatasetVersionMethod = getGetDatasetVersionMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.GetDatasetVersionRequest, com.clarifai.grpc.api.SingleDatasetVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDatasetVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.GetDatasetVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleDatasetVersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("GetDatasetVersion"))
              .build();
        }
      }
    }
    return getGetDatasetVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListDatasetVersionMetricsGroupsRequest,
      com.clarifai.grpc.api.MultiDatasetVersionMetricsGroupResponse> getListDatasetVersionMetricsGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDatasetVersionMetricsGroups",
      requestType = com.clarifai.grpc.api.ListDatasetVersionMetricsGroupsRequest.class,
      responseType = com.clarifai.grpc.api.MultiDatasetVersionMetricsGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListDatasetVersionMetricsGroupsRequest,
      com.clarifai.grpc.api.MultiDatasetVersionMetricsGroupResponse> getListDatasetVersionMetricsGroupsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListDatasetVersionMetricsGroupsRequest, com.clarifai.grpc.api.MultiDatasetVersionMetricsGroupResponse> getListDatasetVersionMetricsGroupsMethod;
    if ((getListDatasetVersionMetricsGroupsMethod = V2Grpc.getListDatasetVersionMetricsGroupsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListDatasetVersionMetricsGroupsMethod = V2Grpc.getListDatasetVersionMetricsGroupsMethod) == null) {
          V2Grpc.getListDatasetVersionMetricsGroupsMethod = getListDatasetVersionMetricsGroupsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListDatasetVersionMetricsGroupsRequest, com.clarifai.grpc.api.MultiDatasetVersionMetricsGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDatasetVersionMetricsGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListDatasetVersionMetricsGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiDatasetVersionMetricsGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListDatasetVersionMetricsGroups"))
              .build();
        }
      }
    }
    return getListDatasetVersionMetricsGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostDatasetVersionsRequest,
      com.clarifai.grpc.api.MultiDatasetVersionResponse> getPostDatasetVersionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostDatasetVersions",
      requestType = com.clarifai.grpc.api.PostDatasetVersionsRequest.class,
      responseType = com.clarifai.grpc.api.MultiDatasetVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostDatasetVersionsRequest,
      com.clarifai.grpc.api.MultiDatasetVersionResponse> getPostDatasetVersionsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostDatasetVersionsRequest, com.clarifai.grpc.api.MultiDatasetVersionResponse> getPostDatasetVersionsMethod;
    if ((getPostDatasetVersionsMethod = V2Grpc.getPostDatasetVersionsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostDatasetVersionsMethod = V2Grpc.getPostDatasetVersionsMethod) == null) {
          V2Grpc.getPostDatasetVersionsMethod = getPostDatasetVersionsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostDatasetVersionsRequest, com.clarifai.grpc.api.MultiDatasetVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostDatasetVersions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostDatasetVersionsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiDatasetVersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostDatasetVersions"))
              .build();
        }
      }
    }
    return getPostDatasetVersionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchDatasetVersionsRequest,
      com.clarifai.grpc.api.MultiDatasetVersionResponse> getPatchDatasetVersionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PatchDatasetVersions",
      requestType = com.clarifai.grpc.api.PatchDatasetVersionsRequest.class,
      responseType = com.clarifai.grpc.api.MultiDatasetVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchDatasetVersionsRequest,
      com.clarifai.grpc.api.MultiDatasetVersionResponse> getPatchDatasetVersionsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchDatasetVersionsRequest, com.clarifai.grpc.api.MultiDatasetVersionResponse> getPatchDatasetVersionsMethod;
    if ((getPatchDatasetVersionsMethod = V2Grpc.getPatchDatasetVersionsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPatchDatasetVersionsMethod = V2Grpc.getPatchDatasetVersionsMethod) == null) {
          V2Grpc.getPatchDatasetVersionsMethod = getPatchDatasetVersionsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PatchDatasetVersionsRequest, com.clarifai.grpc.api.MultiDatasetVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PatchDatasetVersions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PatchDatasetVersionsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiDatasetVersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PatchDatasetVersions"))
              .build();
        }
      }
    }
    return getPatchDatasetVersionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteDatasetVersionsRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteDatasetVersionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDatasetVersions",
      requestType = com.clarifai.grpc.api.DeleteDatasetVersionsRequest.class,
      responseType = com.clarifai.grpc.api.status.BaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteDatasetVersionsRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteDatasetVersionsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteDatasetVersionsRequest, com.clarifai.grpc.api.status.BaseResponse> getDeleteDatasetVersionsMethod;
    if ((getDeleteDatasetVersionsMethod = V2Grpc.getDeleteDatasetVersionsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getDeleteDatasetVersionsMethod = V2Grpc.getDeleteDatasetVersionsMethod) == null) {
          V2Grpc.getDeleteDatasetVersionsMethod = getDeleteDatasetVersionsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.DeleteDatasetVersionsRequest, com.clarifai.grpc.api.status.BaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDatasetVersions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.DeleteDatasetVersionsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.status.BaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("DeleteDatasetVersions"))
              .build();
        }
      }
    }
    return getDeleteDatasetVersionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PutDatasetVersionExportsRequest,
      com.clarifai.grpc.api.MultiDatasetVersionExportResponse> getPutDatasetVersionExportsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutDatasetVersionExports",
      requestType = com.clarifai.grpc.api.PutDatasetVersionExportsRequest.class,
      responseType = com.clarifai.grpc.api.MultiDatasetVersionExportResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PutDatasetVersionExportsRequest,
      com.clarifai.grpc.api.MultiDatasetVersionExportResponse> getPutDatasetVersionExportsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PutDatasetVersionExportsRequest, com.clarifai.grpc.api.MultiDatasetVersionExportResponse> getPutDatasetVersionExportsMethod;
    if ((getPutDatasetVersionExportsMethod = V2Grpc.getPutDatasetVersionExportsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPutDatasetVersionExportsMethod = V2Grpc.getPutDatasetVersionExportsMethod) == null) {
          V2Grpc.getPutDatasetVersionExportsMethod = getPutDatasetVersionExportsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PutDatasetVersionExportsRequest, com.clarifai.grpc.api.MultiDatasetVersionExportResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PutDatasetVersionExports"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PutDatasetVersionExportsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiDatasetVersionExportResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PutDatasetVersionExports"))
              .build();
        }
      }
    }
    return getPutDatasetVersionExportsMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListOpenSourceLicensesRequest,
      com.clarifai.grpc.api.ListOpenSourceLicensesResponse> getListOpenSourceLicensesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOpenSourceLicenses",
      requestType = com.clarifai.grpc.api.ListOpenSourceLicensesRequest.class,
      responseType = com.clarifai.grpc.api.ListOpenSourceLicensesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListOpenSourceLicensesRequest,
      com.clarifai.grpc.api.ListOpenSourceLicensesResponse> getListOpenSourceLicensesMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListOpenSourceLicensesRequest, com.clarifai.grpc.api.ListOpenSourceLicensesResponse> getListOpenSourceLicensesMethod;
    if ((getListOpenSourceLicensesMethod = V2Grpc.getListOpenSourceLicensesMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListOpenSourceLicensesMethod = V2Grpc.getListOpenSourceLicensesMethod) == null) {
          V2Grpc.getListOpenSourceLicensesMethod = getListOpenSourceLicensesMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListOpenSourceLicensesRequest, com.clarifai.grpc.api.ListOpenSourceLicensesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOpenSourceLicenses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListOpenSourceLicensesRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListOpenSourceLicensesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListOpenSourceLicenses"))
              .build();
        }
      }
    }
    return getListOpenSourceLicensesMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchModelIdsRequest,
      com.clarifai.grpc.api.MultiModelResponse> getPatchModelIdsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PatchModelIds",
      requestType = com.clarifai.grpc.api.PatchModelIdsRequest.class,
      responseType = com.clarifai.grpc.api.MultiModelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchModelIdsRequest,
      com.clarifai.grpc.api.MultiModelResponse> getPatchModelIdsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchModelIdsRequest, com.clarifai.grpc.api.MultiModelResponse> getPatchModelIdsMethod;
    if ((getPatchModelIdsMethod = V2Grpc.getPatchModelIdsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPatchModelIdsMethod = V2Grpc.getPatchModelIdsMethod) == null) {
          V2Grpc.getPatchModelIdsMethod = getPatchModelIdsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PatchModelIdsRequest, com.clarifai.grpc.api.MultiModelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PatchModelIds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PatchModelIdsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiModelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PatchModelIds"))
              .build();
        }
      }
    }
    return getPatchModelIdsMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchModelCheckConsentsRequest,
      com.clarifai.grpc.api.MultiModelCheckConsentResponse> getPatchModelCheckConsentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PatchModelCheckConsents",
      requestType = com.clarifai.grpc.api.PatchModelCheckConsentsRequest.class,
      responseType = com.clarifai.grpc.api.MultiModelCheckConsentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchModelCheckConsentsRequest,
      com.clarifai.grpc.api.MultiModelCheckConsentResponse> getPatchModelCheckConsentsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchModelCheckConsentsRequest, com.clarifai.grpc.api.MultiModelCheckConsentResponse> getPatchModelCheckConsentsMethod;
    if ((getPatchModelCheckConsentsMethod = V2Grpc.getPatchModelCheckConsentsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPatchModelCheckConsentsMethod = V2Grpc.getPatchModelCheckConsentsMethod) == null) {
          V2Grpc.getPatchModelCheckConsentsMethod = getPatchModelCheckConsentsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PatchModelCheckConsentsRequest, com.clarifai.grpc.api.MultiModelCheckConsentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PatchModelCheckConsents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PatchModelCheckConsentsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiModelCheckConsentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PatchModelCheckConsents"))
              .build();
        }
      }
    }
    return getPatchModelCheckConsentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchModelToolkitsRequest,
      com.clarifai.grpc.api.MultiModelToolkitResponse> getPatchModelToolkitsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PatchModelToolkits",
      requestType = com.clarifai.grpc.api.PatchModelToolkitsRequest.class,
      responseType = com.clarifai.grpc.api.MultiModelToolkitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchModelToolkitsRequest,
      com.clarifai.grpc.api.MultiModelToolkitResponse> getPatchModelToolkitsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchModelToolkitsRequest, com.clarifai.grpc.api.MultiModelToolkitResponse> getPatchModelToolkitsMethod;
    if ((getPatchModelToolkitsMethod = V2Grpc.getPatchModelToolkitsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPatchModelToolkitsMethod = V2Grpc.getPatchModelToolkitsMethod) == null) {
          V2Grpc.getPatchModelToolkitsMethod = getPatchModelToolkitsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PatchModelToolkitsRequest, com.clarifai.grpc.api.MultiModelToolkitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PatchModelToolkits"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PatchModelToolkitsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiModelToolkitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PatchModelToolkits"))
              .build();
        }
      }
    }
    return getPatchModelToolkitsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchModelUseCasesRequest,
      com.clarifai.grpc.api.MultiModelUseCaseResponse> getPatchModelUseCasesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PatchModelUseCases",
      requestType = com.clarifai.grpc.api.PatchModelUseCasesRequest.class,
      responseType = com.clarifai.grpc.api.MultiModelUseCaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchModelUseCasesRequest,
      com.clarifai.grpc.api.MultiModelUseCaseResponse> getPatchModelUseCasesMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchModelUseCasesRequest, com.clarifai.grpc.api.MultiModelUseCaseResponse> getPatchModelUseCasesMethod;
    if ((getPatchModelUseCasesMethod = V2Grpc.getPatchModelUseCasesMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPatchModelUseCasesMethod = V2Grpc.getPatchModelUseCasesMethod) == null) {
          V2Grpc.getPatchModelUseCasesMethod = getPatchModelUseCasesMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PatchModelUseCasesRequest, com.clarifai.grpc.api.MultiModelUseCaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PatchModelUseCases"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PatchModelUseCasesRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiModelUseCaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PatchModelUseCases"))
              .build();
        }
      }
    }
    return getPatchModelUseCasesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchModelLanguagesRequest,
      com.clarifai.grpc.api.MultiModelLanguageResponse> getPatchModelLanguagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PatchModelLanguages",
      requestType = com.clarifai.grpc.api.PatchModelLanguagesRequest.class,
      responseType = com.clarifai.grpc.api.MultiModelLanguageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchModelLanguagesRequest,
      com.clarifai.grpc.api.MultiModelLanguageResponse> getPatchModelLanguagesMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchModelLanguagesRequest, com.clarifai.grpc.api.MultiModelLanguageResponse> getPatchModelLanguagesMethod;
    if ((getPatchModelLanguagesMethod = V2Grpc.getPatchModelLanguagesMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPatchModelLanguagesMethod = V2Grpc.getPatchModelLanguagesMethod) == null) {
          V2Grpc.getPatchModelLanguagesMethod = getPatchModelLanguagesMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PatchModelLanguagesRequest, com.clarifai.grpc.api.MultiModelLanguageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PatchModelLanguages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PatchModelLanguagesRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiModelLanguageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PatchModelLanguages"))
              .build();
        }
      }
    }
    return getPatchModelLanguagesMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest,
      com.clarifai.grpc.api.status.BaseResponse> getPostWorkflowVersionsUnPublishMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostWorkflowVersionsUnPublish",
      requestType = com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest.class,
      responseType = com.clarifai.grpc.api.status.BaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest,
      com.clarifai.grpc.api.status.BaseResponse> getPostWorkflowVersionsUnPublishMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest, com.clarifai.grpc.api.status.BaseResponse> getPostWorkflowVersionsUnPublishMethod;
    if ((getPostWorkflowVersionsUnPublishMethod = V2Grpc.getPostWorkflowVersionsUnPublishMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostWorkflowVersionsUnPublishMethod = V2Grpc.getPostWorkflowVersionsUnPublishMethod) == null) {
          V2Grpc.getPostWorkflowVersionsUnPublishMethod = getPostWorkflowVersionsUnPublishMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest, com.clarifai.grpc.api.status.BaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostWorkflowVersionsUnPublish"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.status.BaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostWorkflowVersionsUnPublish"))
              .build();
        }
      }
    }
    return getPostWorkflowVersionsUnPublishMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostWorkflowVersionsPublishRequest,
      com.clarifai.grpc.api.status.BaseResponse> getPostWorkflowVersionsPublishMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostWorkflowVersionsPublish",
      requestType = com.clarifai.grpc.api.PostWorkflowVersionsPublishRequest.class,
      responseType = com.clarifai.grpc.api.status.BaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostWorkflowVersionsPublishRequest,
      com.clarifai.grpc.api.status.BaseResponse> getPostWorkflowVersionsPublishMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostWorkflowVersionsPublishRequest, com.clarifai.grpc.api.status.BaseResponse> getPostWorkflowVersionsPublishMethod;
    if ((getPostWorkflowVersionsPublishMethod = V2Grpc.getPostWorkflowVersionsPublishMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostWorkflowVersionsPublishMethod = V2Grpc.getPostWorkflowVersionsPublishMethod) == null) {
          V2Grpc.getPostWorkflowVersionsPublishMethod = getPostWorkflowVersionsPublishMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostWorkflowVersionsPublishRequest, com.clarifai.grpc.api.status.BaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostWorkflowVersionsPublish"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostWorkflowVersionsPublishRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.status.BaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostWorkflowVersionsPublish"))
              .build();
        }
      }
    }
    return getPostWorkflowVersionsPublishMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostModelVersionsPublishRequest,
      com.clarifai.grpc.api.status.BaseResponse> getPostModelVersionsPublishMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostModelVersionsPublish",
      requestType = com.clarifai.grpc.api.PostModelVersionsPublishRequest.class,
      responseType = com.clarifai.grpc.api.status.BaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostModelVersionsPublishRequest,
      com.clarifai.grpc.api.status.BaseResponse> getPostModelVersionsPublishMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostModelVersionsPublishRequest, com.clarifai.grpc.api.status.BaseResponse> getPostModelVersionsPublishMethod;
    if ((getPostModelVersionsPublishMethod = V2Grpc.getPostModelVersionsPublishMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostModelVersionsPublishMethod = V2Grpc.getPostModelVersionsPublishMethod) == null) {
          V2Grpc.getPostModelVersionsPublishMethod = getPostModelVersionsPublishMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostModelVersionsPublishRequest, com.clarifai.grpc.api.status.BaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostModelVersionsPublish"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostModelVersionsPublishRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.status.BaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostModelVersionsPublish"))
              .build();
        }
      }
    }
    return getPostModelVersionsPublishMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostModelVersionsUnPublishRequest,
      com.clarifai.grpc.api.status.BaseResponse> getPostModelVersionsUnPublishMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostModelVersionsUnPublish",
      requestType = com.clarifai.grpc.api.PostModelVersionsUnPublishRequest.class,
      responseType = com.clarifai.grpc.api.status.BaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostModelVersionsUnPublishRequest,
      com.clarifai.grpc.api.status.BaseResponse> getPostModelVersionsUnPublishMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostModelVersionsUnPublishRequest, com.clarifai.grpc.api.status.BaseResponse> getPostModelVersionsUnPublishMethod;
    if ((getPostModelVersionsUnPublishMethod = V2Grpc.getPostModelVersionsUnPublishMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostModelVersionsUnPublishMethod = V2Grpc.getPostModelVersionsUnPublishMethod) == null) {
          V2Grpc.getPostModelVersionsUnPublishMethod = getPostModelVersionsUnPublishMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostModelVersionsUnPublishRequest, com.clarifai.grpc.api.status.BaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostModelVersionsUnPublish"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostModelVersionsUnPublishRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.status.BaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostModelVersionsUnPublish"))
              .build();
        }
      }
    }
    return getPostModelVersionsUnPublishMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostModelVersionEvaluationsRequest,
      com.clarifai.grpc.api.MultiEvalMetricsResponse> getPostModelVersionEvaluationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostModelVersionEvaluations",
      requestType = com.clarifai.grpc.api.PostModelVersionEvaluationsRequest.class,
      responseType = com.clarifai.grpc.api.MultiEvalMetricsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostModelVersionEvaluationsRequest,
      com.clarifai.grpc.api.MultiEvalMetricsResponse> getPostModelVersionEvaluationsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostModelVersionEvaluationsRequest, com.clarifai.grpc.api.MultiEvalMetricsResponse> getPostModelVersionEvaluationsMethod;
    if ((getPostModelVersionEvaluationsMethod = V2Grpc.getPostModelVersionEvaluationsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostModelVersionEvaluationsMethod = V2Grpc.getPostModelVersionEvaluationsMethod) == null) {
          V2Grpc.getPostModelVersionEvaluationsMethod = getPostModelVersionEvaluationsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostModelVersionEvaluationsRequest, com.clarifai.grpc.api.MultiEvalMetricsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostModelVersionEvaluations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostModelVersionEvaluationsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiEvalMetricsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostModelVersionEvaluations"))
              .build();
        }
      }
    }
    return getPostModelVersionEvaluationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListModelVersionEvaluationsRequest,
      com.clarifai.grpc.api.MultiEvalMetricsResponse> getListModelVersionEvaluationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListModelVersionEvaluations",
      requestType = com.clarifai.grpc.api.ListModelVersionEvaluationsRequest.class,
      responseType = com.clarifai.grpc.api.MultiEvalMetricsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListModelVersionEvaluationsRequest,
      com.clarifai.grpc.api.MultiEvalMetricsResponse> getListModelVersionEvaluationsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListModelVersionEvaluationsRequest, com.clarifai.grpc.api.MultiEvalMetricsResponse> getListModelVersionEvaluationsMethod;
    if ((getListModelVersionEvaluationsMethod = V2Grpc.getListModelVersionEvaluationsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListModelVersionEvaluationsMethod = V2Grpc.getListModelVersionEvaluationsMethod) == null) {
          V2Grpc.getListModelVersionEvaluationsMethod = getListModelVersionEvaluationsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListModelVersionEvaluationsRequest, com.clarifai.grpc.api.MultiEvalMetricsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListModelVersionEvaluations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListModelVersionEvaluationsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiEvalMetricsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListModelVersionEvaluations"))
              .build();
        }
      }
    }
    return getListModelVersionEvaluationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetModelVersionEvaluationRequest,
      com.clarifai.grpc.api.SingleEvalMetricsResponse> getGetModelVersionEvaluationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetModelVersionEvaluation",
      requestType = com.clarifai.grpc.api.GetModelVersionEvaluationRequest.class,
      responseType = com.clarifai.grpc.api.SingleEvalMetricsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetModelVersionEvaluationRequest,
      com.clarifai.grpc.api.SingleEvalMetricsResponse> getGetModelVersionEvaluationMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetModelVersionEvaluationRequest, com.clarifai.grpc.api.SingleEvalMetricsResponse> getGetModelVersionEvaluationMethod;
    if ((getGetModelVersionEvaluationMethod = V2Grpc.getGetModelVersionEvaluationMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getGetModelVersionEvaluationMethod = V2Grpc.getGetModelVersionEvaluationMethod) == null) {
          V2Grpc.getGetModelVersionEvaluationMethod = getGetModelVersionEvaluationMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.GetModelVersionEvaluationRequest, com.clarifai.grpc.api.SingleEvalMetricsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetModelVersionEvaluation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.GetModelVersionEvaluationRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleEvalMetricsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("GetModelVersionEvaluation"))
              .build();
        }
      }
    }
    return getGetModelVersionEvaluationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListModelReferencesRequest,
      com.clarifai.grpc.api.MultiModelReferenceResponse> getListModelReferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListModelReferences",
      requestType = com.clarifai.grpc.api.ListModelReferencesRequest.class,
      responseType = com.clarifai.grpc.api.MultiModelReferenceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListModelReferencesRequest,
      com.clarifai.grpc.api.MultiModelReferenceResponse> getListModelReferencesMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListModelReferencesRequest, com.clarifai.grpc.api.MultiModelReferenceResponse> getListModelReferencesMethod;
    if ((getListModelReferencesMethod = V2Grpc.getListModelReferencesMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListModelReferencesMethod = V2Grpc.getListModelReferencesMethod) == null) {
          V2Grpc.getListModelReferencesMethod = getListModelReferencesMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListModelReferencesRequest, com.clarifai.grpc.api.MultiModelReferenceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListModelReferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListModelReferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiModelReferenceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListModelReferences"))
              .build();
        }
      }
    }
    return getListModelReferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetModelVersionInputExampleRequest,
      com.clarifai.grpc.api.SingleModelVersionInputExampleResponse> getGetModelVersionInputExampleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetModelVersionInputExample",
      requestType = com.clarifai.grpc.api.GetModelVersionInputExampleRequest.class,
      responseType = com.clarifai.grpc.api.SingleModelVersionInputExampleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetModelVersionInputExampleRequest,
      com.clarifai.grpc.api.SingleModelVersionInputExampleResponse> getGetModelVersionInputExampleMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetModelVersionInputExampleRequest, com.clarifai.grpc.api.SingleModelVersionInputExampleResponse> getGetModelVersionInputExampleMethod;
    if ((getGetModelVersionInputExampleMethod = V2Grpc.getGetModelVersionInputExampleMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getGetModelVersionInputExampleMethod = V2Grpc.getGetModelVersionInputExampleMethod) == null) {
          V2Grpc.getGetModelVersionInputExampleMethod = getGetModelVersionInputExampleMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.GetModelVersionInputExampleRequest, com.clarifai.grpc.api.SingleModelVersionInputExampleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetModelVersionInputExample"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.GetModelVersionInputExampleRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleModelVersionInputExampleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("GetModelVersionInputExample"))
              .build();
        }
      }
    }
    return getGetModelVersionInputExampleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListModelVersionInputExamplesRequest,
      com.clarifai.grpc.api.MultiModelVersionInputExampleResponse> getListModelVersionInputExamplesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListModelVersionInputExamples",
      requestType = com.clarifai.grpc.api.ListModelVersionInputExamplesRequest.class,
      responseType = com.clarifai.grpc.api.MultiModelVersionInputExampleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListModelVersionInputExamplesRequest,
      com.clarifai.grpc.api.MultiModelVersionInputExampleResponse> getListModelVersionInputExamplesMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListModelVersionInputExamplesRequest, com.clarifai.grpc.api.MultiModelVersionInputExampleResponse> getListModelVersionInputExamplesMethod;
    if ((getListModelVersionInputExamplesMethod = V2Grpc.getListModelVersionInputExamplesMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListModelVersionInputExamplesMethod = V2Grpc.getListModelVersionInputExamplesMethod) == null) {
          V2Grpc.getListModelVersionInputExamplesMethod = getListModelVersionInputExamplesMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListModelVersionInputExamplesRequest, com.clarifai.grpc.api.MultiModelVersionInputExampleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListModelVersionInputExamples"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListModelVersionInputExamplesRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiModelVersionInputExampleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListModelVersionInputExamples"))
              .build();
        }
      }
    }
    return getListModelVersionInputExamplesMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchWorkflowIdsRequest,
      com.clarifai.grpc.api.MultiWorkflowResponse> getPatchWorkflowIdsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PatchWorkflowIds",
      requestType = com.clarifai.grpc.api.PatchWorkflowIdsRequest.class,
      responseType = com.clarifai.grpc.api.MultiWorkflowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchWorkflowIdsRequest,
      com.clarifai.grpc.api.MultiWorkflowResponse> getPatchWorkflowIdsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchWorkflowIdsRequest, com.clarifai.grpc.api.MultiWorkflowResponse> getPatchWorkflowIdsMethod;
    if ((getPatchWorkflowIdsMethod = V2Grpc.getPatchWorkflowIdsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPatchWorkflowIdsMethod = V2Grpc.getPatchWorkflowIdsMethod) == null) {
          V2Grpc.getPatchWorkflowIdsMethod = getPatchWorkflowIdsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PatchWorkflowIdsRequest, com.clarifai.grpc.api.MultiWorkflowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PatchWorkflowIds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PatchWorkflowIdsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiWorkflowResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PatchWorkflowIds"))
              .build();
        }
      }
    }
    return getPatchWorkflowIdsMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListWorkflowVersionsRequest,
      com.clarifai.grpc.api.MultiWorkflowVersionResponse> getListWorkflowVersionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListWorkflowVersions",
      requestType = com.clarifai.grpc.api.ListWorkflowVersionsRequest.class,
      responseType = com.clarifai.grpc.api.MultiWorkflowVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListWorkflowVersionsRequest,
      com.clarifai.grpc.api.MultiWorkflowVersionResponse> getListWorkflowVersionsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListWorkflowVersionsRequest, com.clarifai.grpc.api.MultiWorkflowVersionResponse> getListWorkflowVersionsMethod;
    if ((getListWorkflowVersionsMethod = V2Grpc.getListWorkflowVersionsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListWorkflowVersionsMethod = V2Grpc.getListWorkflowVersionsMethod) == null) {
          V2Grpc.getListWorkflowVersionsMethod = getListWorkflowVersionsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListWorkflowVersionsRequest, com.clarifai.grpc.api.MultiWorkflowVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListWorkflowVersions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListWorkflowVersionsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiWorkflowVersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListWorkflowVersions"))
              .build();
        }
      }
    }
    return getListWorkflowVersionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetWorkflowVersionRequest,
      com.clarifai.grpc.api.SingleWorkflowVersionResponse> getGetWorkflowVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWorkflowVersion",
      requestType = com.clarifai.grpc.api.GetWorkflowVersionRequest.class,
      responseType = com.clarifai.grpc.api.SingleWorkflowVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetWorkflowVersionRequest,
      com.clarifai.grpc.api.SingleWorkflowVersionResponse> getGetWorkflowVersionMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetWorkflowVersionRequest, com.clarifai.grpc.api.SingleWorkflowVersionResponse> getGetWorkflowVersionMethod;
    if ((getGetWorkflowVersionMethod = V2Grpc.getGetWorkflowVersionMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getGetWorkflowVersionMethod = V2Grpc.getGetWorkflowVersionMethod) == null) {
          V2Grpc.getGetWorkflowVersionMethod = getGetWorkflowVersionMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.GetWorkflowVersionRequest, com.clarifai.grpc.api.SingleWorkflowVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWorkflowVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.GetWorkflowVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleWorkflowVersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("GetWorkflowVersion"))
              .build();
        }
      }
    }
    return getGetWorkflowVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteWorkflowVersionsRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteWorkflowVersionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteWorkflowVersions",
      requestType = com.clarifai.grpc.api.DeleteWorkflowVersionsRequest.class,
      responseType = com.clarifai.grpc.api.status.BaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteWorkflowVersionsRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteWorkflowVersionsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteWorkflowVersionsRequest, com.clarifai.grpc.api.status.BaseResponse> getDeleteWorkflowVersionsMethod;
    if ((getDeleteWorkflowVersionsMethod = V2Grpc.getDeleteWorkflowVersionsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getDeleteWorkflowVersionsMethod = V2Grpc.getDeleteWorkflowVersionsMethod) == null) {
          V2Grpc.getDeleteWorkflowVersionsMethod = getDeleteWorkflowVersionsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.DeleteWorkflowVersionsRequest, com.clarifai.grpc.api.status.BaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteWorkflowVersions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.DeleteWorkflowVersionsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.status.BaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("DeleteWorkflowVersions"))
              .build();
        }
      }
    }
    return getDeleteWorkflowVersionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchWorkflowVersionsRequest,
      com.clarifai.grpc.api.MultiWorkflowVersionResponse> getPatchWorkflowVersionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PatchWorkflowVersions",
      requestType = com.clarifai.grpc.api.PatchWorkflowVersionsRequest.class,
      responseType = com.clarifai.grpc.api.MultiWorkflowVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchWorkflowVersionsRequest,
      com.clarifai.grpc.api.MultiWorkflowVersionResponse> getPatchWorkflowVersionsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchWorkflowVersionsRequest, com.clarifai.grpc.api.MultiWorkflowVersionResponse> getPatchWorkflowVersionsMethod;
    if ((getPatchWorkflowVersionsMethod = V2Grpc.getPatchWorkflowVersionsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPatchWorkflowVersionsMethod = V2Grpc.getPatchWorkflowVersionsMethod) == null) {
          V2Grpc.getPatchWorkflowVersionsMethod = getPatchWorkflowVersionsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PatchWorkflowVersionsRequest, com.clarifai.grpc.api.MultiWorkflowVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PatchWorkflowVersions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PatchWorkflowVersionsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiWorkflowVersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PatchWorkflowVersions"))
              .build();
        }
      }
    }
    return getPatchWorkflowVersionsMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.MyScopesUserRequest,
      com.clarifai.grpc.api.MultiScopeUserResponse> getMyScopesUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MyScopesUser",
      requestType = com.clarifai.grpc.api.MyScopesUserRequest.class,
      responseType = com.clarifai.grpc.api.MultiScopeUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.MyScopesUserRequest,
      com.clarifai.grpc.api.MultiScopeUserResponse> getMyScopesUserMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.MyScopesUserRequest, com.clarifai.grpc.api.MultiScopeUserResponse> getMyScopesUserMethod;
    if ((getMyScopesUserMethod = V2Grpc.getMyScopesUserMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getMyScopesUserMethod = V2Grpc.getMyScopesUserMethod) == null) {
          V2Grpc.getMyScopesUserMethod = getMyScopesUserMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.MyScopesUserRequest, com.clarifai.grpc.api.MultiScopeUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MyScopesUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MyScopesUserRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiScopeUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("MyScopesUser"))
              .build();
        }
      }
    }
    return getMyScopesUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.MyScopesRootRequest,
      com.clarifai.grpc.api.MultiScopeRootResponse> getMyScopesRootMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MyScopesRoot",
      requestType = com.clarifai.grpc.api.MyScopesRootRequest.class,
      responseType = com.clarifai.grpc.api.MultiScopeRootResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.MyScopesRootRequest,
      com.clarifai.grpc.api.MultiScopeRootResponse> getMyScopesRootMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.MyScopesRootRequest, com.clarifai.grpc.api.MultiScopeRootResponse> getMyScopesRootMethod;
    if ((getMyScopesRootMethod = V2Grpc.getMyScopesRootMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getMyScopesRootMethod = V2Grpc.getMyScopesRootMethod) == null) {
          V2Grpc.getMyScopesRootMethod = getMyScopesRootMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.MyScopesRootRequest, com.clarifai.grpc.api.MultiScopeRootResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MyScopesRoot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MyScopesRootRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiScopeRootResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("MyScopesRoot"))
              .build();
        }
      }
    }
    return getMyScopesRootMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchAppsIdsRequest,
      com.clarifai.grpc.api.MultiAppResponse> getPatchAppsIdsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PatchAppsIds",
      requestType = com.clarifai.grpc.api.PatchAppsIdsRequest.class,
      responseType = com.clarifai.grpc.api.MultiAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchAppsIdsRequest,
      com.clarifai.grpc.api.MultiAppResponse> getPatchAppsIdsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchAppsIdsRequest, com.clarifai.grpc.api.MultiAppResponse> getPatchAppsIdsMethod;
    if ((getPatchAppsIdsMethod = V2Grpc.getPatchAppsIdsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPatchAppsIdsMethod = V2Grpc.getPatchAppsIdsMethod) == null) {
          V2Grpc.getPatchAppsIdsMethod = getPatchAppsIdsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PatchAppsIdsRequest, com.clarifai.grpc.api.MultiAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PatchAppsIds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PatchAppsIdsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiAppResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PatchAppsIds"))
              .build();
        }
      }
    }
    return getPatchAppsIdsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchAppRequest,
      com.clarifai.grpc.api.SingleAppResponse> getPatchAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PatchApp",
      requestType = com.clarifai.grpc.api.PatchAppRequest.class,
      responseType = com.clarifai.grpc.api.SingleAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchAppRequest,
      com.clarifai.grpc.api.SingleAppResponse> getPatchAppMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchAppRequest, com.clarifai.grpc.api.SingleAppResponse> getPatchAppMethod;
    if ((getPatchAppMethod = V2Grpc.getPatchAppMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPatchAppMethod = V2Grpc.getPatchAppMethod) == null) {
          V2Grpc.getPatchAppMethod = getPatchAppMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PatchAppRequest, com.clarifai.grpc.api.SingleAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PatchApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PatchAppRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleAppResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PatchApp"))
              .build();
        }
      }
    }
    return getPatchAppMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchSearchesRequest,
      com.clarifai.grpc.api.MultiSearchResponse> getPatchSearchesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PatchSearches",
      requestType = com.clarifai.grpc.api.PatchSearchesRequest.class,
      responseType = com.clarifai.grpc.api.MultiSearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchSearchesRequest,
      com.clarifai.grpc.api.MultiSearchResponse> getPatchSearchesMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchSearchesRequest, com.clarifai.grpc.api.MultiSearchResponse> getPatchSearchesMethod;
    if ((getPatchSearchesMethod = V2Grpc.getPatchSearchesMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPatchSearchesMethod = V2Grpc.getPatchSearchesMethod) == null) {
          V2Grpc.getPatchSearchesMethod = getPatchSearchesMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PatchSearchesRequest, com.clarifai.grpc.api.MultiSearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PatchSearches"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PatchSearchesRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiSearchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PatchSearches"))
              .build();
        }
      }
    }
    return getPatchSearchesMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListAnnotationFiltersRequest,
      com.clarifai.grpc.api.MultiAnnotationFilterResponse> getListAnnotationFiltersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAnnotationFilters",
      requestType = com.clarifai.grpc.api.ListAnnotationFiltersRequest.class,
      responseType = com.clarifai.grpc.api.MultiAnnotationFilterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListAnnotationFiltersRequest,
      com.clarifai.grpc.api.MultiAnnotationFilterResponse> getListAnnotationFiltersMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListAnnotationFiltersRequest, com.clarifai.grpc.api.MultiAnnotationFilterResponse> getListAnnotationFiltersMethod;
    if ((getListAnnotationFiltersMethod = V2Grpc.getListAnnotationFiltersMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListAnnotationFiltersMethod = V2Grpc.getListAnnotationFiltersMethod) == null) {
          V2Grpc.getListAnnotationFiltersMethod = getListAnnotationFiltersMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListAnnotationFiltersRequest, com.clarifai.grpc.api.MultiAnnotationFilterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAnnotationFilters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListAnnotationFiltersRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiAnnotationFilterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListAnnotationFilters"))
              .build();
        }
      }
    }
    return getListAnnotationFiltersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetAnnotationFilterRequest,
      com.clarifai.grpc.api.SingleAnnotationFilterResponse> getGetAnnotationFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAnnotationFilter",
      requestType = com.clarifai.grpc.api.GetAnnotationFilterRequest.class,
      responseType = com.clarifai.grpc.api.SingleAnnotationFilterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetAnnotationFilterRequest,
      com.clarifai.grpc.api.SingleAnnotationFilterResponse> getGetAnnotationFilterMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetAnnotationFilterRequest, com.clarifai.grpc.api.SingleAnnotationFilterResponse> getGetAnnotationFilterMethod;
    if ((getGetAnnotationFilterMethod = V2Grpc.getGetAnnotationFilterMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getGetAnnotationFilterMethod = V2Grpc.getGetAnnotationFilterMethod) == null) {
          V2Grpc.getGetAnnotationFilterMethod = getGetAnnotationFilterMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.GetAnnotationFilterRequest, com.clarifai.grpc.api.SingleAnnotationFilterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAnnotationFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.GetAnnotationFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleAnnotationFilterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("GetAnnotationFilter"))
              .build();
        }
      }
    }
    return getGetAnnotationFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostAnnotationFiltersRequest,
      com.clarifai.grpc.api.MultiAnnotationFilterResponse> getPostAnnotationFiltersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostAnnotationFilters",
      requestType = com.clarifai.grpc.api.PostAnnotationFiltersRequest.class,
      responseType = com.clarifai.grpc.api.MultiAnnotationFilterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostAnnotationFiltersRequest,
      com.clarifai.grpc.api.MultiAnnotationFilterResponse> getPostAnnotationFiltersMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostAnnotationFiltersRequest, com.clarifai.grpc.api.MultiAnnotationFilterResponse> getPostAnnotationFiltersMethod;
    if ((getPostAnnotationFiltersMethod = V2Grpc.getPostAnnotationFiltersMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostAnnotationFiltersMethod = V2Grpc.getPostAnnotationFiltersMethod) == null) {
          V2Grpc.getPostAnnotationFiltersMethod = getPostAnnotationFiltersMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostAnnotationFiltersRequest, com.clarifai.grpc.api.MultiAnnotationFilterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostAnnotationFilters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostAnnotationFiltersRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiAnnotationFilterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostAnnotationFilters"))
              .build();
        }
      }
    }
    return getPostAnnotationFiltersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchAnnotationFiltersRequest,
      com.clarifai.grpc.api.MultiAnnotationFilterResponse> getPatchAnnotationFiltersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PatchAnnotationFilters",
      requestType = com.clarifai.grpc.api.PatchAnnotationFiltersRequest.class,
      responseType = com.clarifai.grpc.api.MultiAnnotationFilterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchAnnotationFiltersRequest,
      com.clarifai.grpc.api.MultiAnnotationFilterResponse> getPatchAnnotationFiltersMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchAnnotationFiltersRequest, com.clarifai.grpc.api.MultiAnnotationFilterResponse> getPatchAnnotationFiltersMethod;
    if ((getPatchAnnotationFiltersMethod = V2Grpc.getPatchAnnotationFiltersMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPatchAnnotationFiltersMethod = V2Grpc.getPatchAnnotationFiltersMethod) == null) {
          V2Grpc.getPatchAnnotationFiltersMethod = getPatchAnnotationFiltersMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PatchAnnotationFiltersRequest, com.clarifai.grpc.api.MultiAnnotationFilterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PatchAnnotationFilters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PatchAnnotationFiltersRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiAnnotationFilterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PatchAnnotationFilters"))
              .build();
        }
      }
    }
    return getPatchAnnotationFiltersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteAnnotationFiltersRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteAnnotationFiltersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAnnotationFilters",
      requestType = com.clarifai.grpc.api.DeleteAnnotationFiltersRequest.class,
      responseType = com.clarifai.grpc.api.status.BaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteAnnotationFiltersRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteAnnotationFiltersMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteAnnotationFiltersRequest, com.clarifai.grpc.api.status.BaseResponse> getDeleteAnnotationFiltersMethod;
    if ((getDeleteAnnotationFiltersMethod = V2Grpc.getDeleteAnnotationFiltersMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getDeleteAnnotationFiltersMethod = V2Grpc.getDeleteAnnotationFiltersMethod) == null) {
          V2Grpc.getDeleteAnnotationFiltersMethod = getDeleteAnnotationFiltersMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.DeleteAnnotationFiltersRequest, com.clarifai.grpc.api.status.BaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAnnotationFilters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.DeleteAnnotationFiltersRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.status.BaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("DeleteAnnotationFilters"))
              .build();
        }
      }
    }
    return getDeleteAnnotationFiltersMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostLabelOrdersRequest,
      com.clarifai.grpc.api.MultiLabelOrderResponse> getPostLabelOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostLabelOrders",
      requestType = com.clarifai.grpc.api.PostLabelOrdersRequest.class,
      responseType = com.clarifai.grpc.api.MultiLabelOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostLabelOrdersRequest,
      com.clarifai.grpc.api.MultiLabelOrderResponse> getPostLabelOrdersMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostLabelOrdersRequest, com.clarifai.grpc.api.MultiLabelOrderResponse> getPostLabelOrdersMethod;
    if ((getPostLabelOrdersMethod = V2Grpc.getPostLabelOrdersMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostLabelOrdersMethod = V2Grpc.getPostLabelOrdersMethod) == null) {
          V2Grpc.getPostLabelOrdersMethod = getPostLabelOrdersMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostLabelOrdersRequest, com.clarifai.grpc.api.MultiLabelOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostLabelOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostLabelOrdersRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiLabelOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostLabelOrders"))
              .build();
        }
      }
    }
    return getPostLabelOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetLabelOrderRequest,
      com.clarifai.grpc.api.SingleLabelOrderResponse> getGetLabelOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLabelOrder",
      requestType = com.clarifai.grpc.api.GetLabelOrderRequest.class,
      responseType = com.clarifai.grpc.api.SingleLabelOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetLabelOrderRequest,
      com.clarifai.grpc.api.SingleLabelOrderResponse> getGetLabelOrderMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetLabelOrderRequest, com.clarifai.grpc.api.SingleLabelOrderResponse> getGetLabelOrderMethod;
    if ((getGetLabelOrderMethod = V2Grpc.getGetLabelOrderMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getGetLabelOrderMethod = V2Grpc.getGetLabelOrderMethod) == null) {
          V2Grpc.getGetLabelOrderMethod = getGetLabelOrderMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.GetLabelOrderRequest, com.clarifai.grpc.api.SingleLabelOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLabelOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.GetLabelOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleLabelOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("GetLabelOrder"))
              .build();
        }
      }
    }
    return getGetLabelOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListLabelOrdersRequest,
      com.clarifai.grpc.api.MultiLabelOrderResponse> getListLabelOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListLabelOrders",
      requestType = com.clarifai.grpc.api.ListLabelOrdersRequest.class,
      responseType = com.clarifai.grpc.api.MultiLabelOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListLabelOrdersRequest,
      com.clarifai.grpc.api.MultiLabelOrderResponse> getListLabelOrdersMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListLabelOrdersRequest, com.clarifai.grpc.api.MultiLabelOrderResponse> getListLabelOrdersMethod;
    if ((getListLabelOrdersMethod = V2Grpc.getListLabelOrdersMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListLabelOrdersMethod = V2Grpc.getListLabelOrdersMethod) == null) {
          V2Grpc.getListLabelOrdersMethod = getListLabelOrdersMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListLabelOrdersRequest, com.clarifai.grpc.api.MultiLabelOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListLabelOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListLabelOrdersRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiLabelOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListLabelOrders"))
              .build();
        }
      }
    }
    return getListLabelOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchLabelOrdersRequest,
      com.clarifai.grpc.api.MultiLabelOrderResponse> getPatchLabelOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PatchLabelOrders",
      requestType = com.clarifai.grpc.api.PatchLabelOrdersRequest.class,
      responseType = com.clarifai.grpc.api.MultiLabelOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchLabelOrdersRequest,
      com.clarifai.grpc.api.MultiLabelOrderResponse> getPatchLabelOrdersMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchLabelOrdersRequest, com.clarifai.grpc.api.MultiLabelOrderResponse> getPatchLabelOrdersMethod;
    if ((getPatchLabelOrdersMethod = V2Grpc.getPatchLabelOrdersMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPatchLabelOrdersMethod = V2Grpc.getPatchLabelOrdersMethod) == null) {
          V2Grpc.getPatchLabelOrdersMethod = getPatchLabelOrdersMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PatchLabelOrdersRequest, com.clarifai.grpc.api.MultiLabelOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PatchLabelOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PatchLabelOrdersRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiLabelOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PatchLabelOrders"))
              .build();
        }
      }
    }
    return getPatchLabelOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteLabelOrdersRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteLabelOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteLabelOrders",
      requestType = com.clarifai.grpc.api.DeleteLabelOrdersRequest.class,
      responseType = com.clarifai.grpc.api.status.BaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteLabelOrdersRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteLabelOrdersMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteLabelOrdersRequest, com.clarifai.grpc.api.status.BaseResponse> getDeleteLabelOrdersMethod;
    if ((getDeleteLabelOrdersMethod = V2Grpc.getDeleteLabelOrdersMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getDeleteLabelOrdersMethod = V2Grpc.getDeleteLabelOrdersMethod) == null) {
          V2Grpc.getDeleteLabelOrdersMethod = getDeleteLabelOrdersMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.DeleteLabelOrdersRequest, com.clarifai.grpc.api.status.BaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteLabelOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.DeleteLabelOrdersRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.status.BaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("DeleteLabelOrders"))
              .build();
        }
      }
    }
    return getDeleteLabelOrdersMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostTrendingMetricsViewRequest,
      com.clarifai.grpc.api.status.BaseResponse> getPostTrendingMetricsViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostTrendingMetricsView",
      requestType = com.clarifai.grpc.api.PostTrendingMetricsViewRequest.class,
      responseType = com.clarifai.grpc.api.status.BaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostTrendingMetricsViewRequest,
      com.clarifai.grpc.api.status.BaseResponse> getPostTrendingMetricsViewMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostTrendingMetricsViewRequest, com.clarifai.grpc.api.status.BaseResponse> getPostTrendingMetricsViewMethod;
    if ((getPostTrendingMetricsViewMethod = V2Grpc.getPostTrendingMetricsViewMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostTrendingMetricsViewMethod = V2Grpc.getPostTrendingMetricsViewMethod) == null) {
          V2Grpc.getPostTrendingMetricsViewMethod = getPostTrendingMetricsViewMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostTrendingMetricsViewRequest, com.clarifai.grpc.api.status.BaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostTrendingMetricsView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostTrendingMetricsViewRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.status.BaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostTrendingMetricsView"))
              .build();
        }
      }
    }
    return getPostTrendingMetricsViewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListTrendingMetricsViewsRequest,
      com.clarifai.grpc.api.MultiTrendingMetricsViewResponse> getListTrendingMetricsViewsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTrendingMetricsViews",
      requestType = com.clarifai.grpc.api.ListTrendingMetricsViewsRequest.class,
      responseType = com.clarifai.grpc.api.MultiTrendingMetricsViewResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListTrendingMetricsViewsRequest,
      com.clarifai.grpc.api.MultiTrendingMetricsViewResponse> getListTrendingMetricsViewsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListTrendingMetricsViewsRequest, com.clarifai.grpc.api.MultiTrendingMetricsViewResponse> getListTrendingMetricsViewsMethod;
    if ((getListTrendingMetricsViewsMethod = V2Grpc.getListTrendingMetricsViewsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListTrendingMetricsViewsMethod = V2Grpc.getListTrendingMetricsViewsMethod) == null) {
          V2Grpc.getListTrendingMetricsViewsMethod = getListTrendingMetricsViewsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListTrendingMetricsViewsRequest, com.clarifai.grpc.api.MultiTrendingMetricsViewResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTrendingMetricsViews"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListTrendingMetricsViewsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiTrendingMetricsViewResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListTrendingMetricsViews"))
              .build();
        }
      }
    }
    return getListTrendingMetricsViewsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetModuleRequest,
      com.clarifai.grpc.api.SingleModuleResponse> getGetModuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetModule",
      requestType = com.clarifai.grpc.api.GetModuleRequest.class,
      responseType = com.clarifai.grpc.api.SingleModuleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetModuleRequest,
      com.clarifai.grpc.api.SingleModuleResponse> getGetModuleMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetModuleRequest, com.clarifai.grpc.api.SingleModuleResponse> getGetModuleMethod;
    if ((getGetModuleMethod = V2Grpc.getGetModuleMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getGetModuleMethod = V2Grpc.getGetModuleMethod) == null) {
          V2Grpc.getGetModuleMethod = getGetModuleMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.GetModuleRequest, com.clarifai.grpc.api.SingleModuleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetModule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.GetModuleRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleModuleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("GetModule"))
              .build();
        }
      }
    }
    return getGetModuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListModulesRequest,
      com.clarifai.grpc.api.MultiModuleResponse> getListModulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListModules",
      requestType = com.clarifai.grpc.api.ListModulesRequest.class,
      responseType = com.clarifai.grpc.api.MultiModuleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListModulesRequest,
      com.clarifai.grpc.api.MultiModuleResponse> getListModulesMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListModulesRequest, com.clarifai.grpc.api.MultiModuleResponse> getListModulesMethod;
    if ((getListModulesMethod = V2Grpc.getListModulesMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListModulesMethod = V2Grpc.getListModulesMethod) == null) {
          V2Grpc.getListModulesMethod = getListModulesMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListModulesRequest, com.clarifai.grpc.api.MultiModuleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListModules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListModulesRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiModuleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListModules"))
              .build();
        }
      }
    }
    return getListModulesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostModulesRequest,
      com.clarifai.grpc.api.MultiModuleResponse> getPostModulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostModules",
      requestType = com.clarifai.grpc.api.PostModulesRequest.class,
      responseType = com.clarifai.grpc.api.MultiModuleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostModulesRequest,
      com.clarifai.grpc.api.MultiModuleResponse> getPostModulesMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostModulesRequest, com.clarifai.grpc.api.MultiModuleResponse> getPostModulesMethod;
    if ((getPostModulesMethod = V2Grpc.getPostModulesMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostModulesMethod = V2Grpc.getPostModulesMethod) == null) {
          V2Grpc.getPostModulesMethod = getPostModulesMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostModulesRequest, com.clarifai.grpc.api.MultiModuleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostModules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostModulesRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiModuleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostModules"))
              .build();
        }
      }
    }
    return getPostModulesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchModulesRequest,
      com.clarifai.grpc.api.MultiModuleResponse> getPatchModulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PatchModules",
      requestType = com.clarifai.grpc.api.PatchModulesRequest.class,
      responseType = com.clarifai.grpc.api.MultiModuleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchModulesRequest,
      com.clarifai.grpc.api.MultiModuleResponse> getPatchModulesMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PatchModulesRequest, com.clarifai.grpc.api.MultiModuleResponse> getPatchModulesMethod;
    if ((getPatchModulesMethod = V2Grpc.getPatchModulesMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPatchModulesMethod = V2Grpc.getPatchModulesMethod) == null) {
          V2Grpc.getPatchModulesMethod = getPatchModulesMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PatchModulesRequest, com.clarifai.grpc.api.MultiModuleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PatchModules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PatchModulesRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiModuleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PatchModules"))
              .build();
        }
      }
    }
    return getPatchModulesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteModulesRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteModulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteModules",
      requestType = com.clarifai.grpc.api.DeleteModulesRequest.class,
      responseType = com.clarifai.grpc.api.status.BaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteModulesRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteModulesMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteModulesRequest, com.clarifai.grpc.api.status.BaseResponse> getDeleteModulesMethod;
    if ((getDeleteModulesMethod = V2Grpc.getDeleteModulesMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getDeleteModulesMethod = V2Grpc.getDeleteModulesMethod) == null) {
          V2Grpc.getDeleteModulesMethod = getDeleteModulesMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.DeleteModulesRequest, com.clarifai.grpc.api.status.BaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteModules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.DeleteModulesRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.status.BaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("DeleteModules"))
              .build();
        }
      }
    }
    return getDeleteModulesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetModuleVersionRequest,
      com.clarifai.grpc.api.SingleModuleVersionResponse> getGetModuleVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetModuleVersion",
      requestType = com.clarifai.grpc.api.GetModuleVersionRequest.class,
      responseType = com.clarifai.grpc.api.SingleModuleVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetModuleVersionRequest,
      com.clarifai.grpc.api.SingleModuleVersionResponse> getGetModuleVersionMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetModuleVersionRequest, com.clarifai.grpc.api.SingleModuleVersionResponse> getGetModuleVersionMethod;
    if ((getGetModuleVersionMethod = V2Grpc.getGetModuleVersionMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getGetModuleVersionMethod = V2Grpc.getGetModuleVersionMethod) == null) {
          V2Grpc.getGetModuleVersionMethod = getGetModuleVersionMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.GetModuleVersionRequest, com.clarifai.grpc.api.SingleModuleVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetModuleVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.GetModuleVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleModuleVersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("GetModuleVersion"))
              .build();
        }
      }
    }
    return getGetModuleVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListModuleVersionsRequest,
      com.clarifai.grpc.api.MultiModuleVersionResponse> getListModuleVersionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListModuleVersions",
      requestType = com.clarifai.grpc.api.ListModuleVersionsRequest.class,
      responseType = com.clarifai.grpc.api.MultiModuleVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListModuleVersionsRequest,
      com.clarifai.grpc.api.MultiModuleVersionResponse> getListModuleVersionsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListModuleVersionsRequest, com.clarifai.grpc.api.MultiModuleVersionResponse> getListModuleVersionsMethod;
    if ((getListModuleVersionsMethod = V2Grpc.getListModuleVersionsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListModuleVersionsMethod = V2Grpc.getListModuleVersionsMethod) == null) {
          V2Grpc.getListModuleVersionsMethod = getListModuleVersionsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListModuleVersionsRequest, com.clarifai.grpc.api.MultiModuleVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListModuleVersions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListModuleVersionsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiModuleVersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListModuleVersions"))
              .build();
        }
      }
    }
    return getListModuleVersionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostModuleVersionsRequest,
      com.clarifai.grpc.api.MultiModuleVersionResponse> getPostModuleVersionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostModuleVersions",
      requestType = com.clarifai.grpc.api.PostModuleVersionsRequest.class,
      responseType = com.clarifai.grpc.api.MultiModuleVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostModuleVersionsRequest,
      com.clarifai.grpc.api.MultiModuleVersionResponse> getPostModuleVersionsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostModuleVersionsRequest, com.clarifai.grpc.api.MultiModuleVersionResponse> getPostModuleVersionsMethod;
    if ((getPostModuleVersionsMethod = V2Grpc.getPostModuleVersionsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostModuleVersionsMethod = V2Grpc.getPostModuleVersionsMethod) == null) {
          V2Grpc.getPostModuleVersionsMethod = getPostModuleVersionsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostModuleVersionsRequest, com.clarifai.grpc.api.MultiModuleVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostModuleVersions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostModuleVersionsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiModuleVersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostModuleVersions"))
              .build();
        }
      }
    }
    return getPostModuleVersionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteModuleVersionsRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteModuleVersionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteModuleVersions",
      requestType = com.clarifai.grpc.api.DeleteModuleVersionsRequest.class,
      responseType = com.clarifai.grpc.api.status.BaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteModuleVersionsRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteModuleVersionsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteModuleVersionsRequest, com.clarifai.grpc.api.status.BaseResponse> getDeleteModuleVersionsMethod;
    if ((getDeleteModuleVersionsMethod = V2Grpc.getDeleteModuleVersionsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getDeleteModuleVersionsMethod = V2Grpc.getDeleteModuleVersionsMethod) == null) {
          V2Grpc.getDeleteModuleVersionsMethod = getDeleteModuleVersionsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.DeleteModuleVersionsRequest, com.clarifai.grpc.api.status.BaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteModuleVersions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.DeleteModuleVersionsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.status.BaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("DeleteModuleVersions"))
              .build();
        }
      }
    }
    return getDeleteModuleVersionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetInstalledModuleVersionRequest,
      com.clarifai.grpc.api.SingleInstalledModuleVersionResponse> getGetInstalledModuleVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInstalledModuleVersion",
      requestType = com.clarifai.grpc.api.GetInstalledModuleVersionRequest.class,
      responseType = com.clarifai.grpc.api.SingleInstalledModuleVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetInstalledModuleVersionRequest,
      com.clarifai.grpc.api.SingleInstalledModuleVersionResponse> getGetInstalledModuleVersionMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetInstalledModuleVersionRequest, com.clarifai.grpc.api.SingleInstalledModuleVersionResponse> getGetInstalledModuleVersionMethod;
    if ((getGetInstalledModuleVersionMethod = V2Grpc.getGetInstalledModuleVersionMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getGetInstalledModuleVersionMethod = V2Grpc.getGetInstalledModuleVersionMethod) == null) {
          V2Grpc.getGetInstalledModuleVersionMethod = getGetInstalledModuleVersionMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.GetInstalledModuleVersionRequest, com.clarifai.grpc.api.SingleInstalledModuleVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetInstalledModuleVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.GetInstalledModuleVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleInstalledModuleVersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("GetInstalledModuleVersion"))
              .build();
        }
      }
    }
    return getGetInstalledModuleVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListInstalledModuleVersionsRequest,
      com.clarifai.grpc.api.MultiInstalledModuleVersionResponse> getListInstalledModuleVersionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListInstalledModuleVersions",
      requestType = com.clarifai.grpc.api.ListInstalledModuleVersionsRequest.class,
      responseType = com.clarifai.grpc.api.MultiInstalledModuleVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListInstalledModuleVersionsRequest,
      com.clarifai.grpc.api.MultiInstalledModuleVersionResponse> getListInstalledModuleVersionsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListInstalledModuleVersionsRequest, com.clarifai.grpc.api.MultiInstalledModuleVersionResponse> getListInstalledModuleVersionsMethod;
    if ((getListInstalledModuleVersionsMethod = V2Grpc.getListInstalledModuleVersionsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListInstalledModuleVersionsMethod = V2Grpc.getListInstalledModuleVersionsMethod) == null) {
          V2Grpc.getListInstalledModuleVersionsMethod = getListInstalledModuleVersionsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListInstalledModuleVersionsRequest, com.clarifai.grpc.api.MultiInstalledModuleVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListInstalledModuleVersions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListInstalledModuleVersionsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiInstalledModuleVersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListInstalledModuleVersions"))
              .build();
        }
      }
    }
    return getListInstalledModuleVersionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostInstalledModuleVersionsRequest,
      com.clarifai.grpc.api.MultiInstalledModuleVersionResponse> getPostInstalledModuleVersionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostInstalledModuleVersions",
      requestType = com.clarifai.grpc.api.PostInstalledModuleVersionsRequest.class,
      responseType = com.clarifai.grpc.api.MultiInstalledModuleVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostInstalledModuleVersionsRequest,
      com.clarifai.grpc.api.MultiInstalledModuleVersionResponse> getPostInstalledModuleVersionsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostInstalledModuleVersionsRequest, com.clarifai.grpc.api.MultiInstalledModuleVersionResponse> getPostInstalledModuleVersionsMethod;
    if ((getPostInstalledModuleVersionsMethod = V2Grpc.getPostInstalledModuleVersionsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostInstalledModuleVersionsMethod = V2Grpc.getPostInstalledModuleVersionsMethod) == null) {
          V2Grpc.getPostInstalledModuleVersionsMethod = getPostInstalledModuleVersionsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostInstalledModuleVersionsRequest, com.clarifai.grpc.api.MultiInstalledModuleVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostInstalledModuleVersions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostInstalledModuleVersionsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiInstalledModuleVersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostInstalledModuleVersions"))
              .build();
        }
      }
    }
    return getPostInstalledModuleVersionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteInstalledModuleVersionsRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteInstalledModuleVersionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteInstalledModuleVersions",
      requestType = com.clarifai.grpc.api.DeleteInstalledModuleVersionsRequest.class,
      responseType = com.clarifai.grpc.api.status.BaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteInstalledModuleVersionsRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteInstalledModuleVersionsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteInstalledModuleVersionsRequest, com.clarifai.grpc.api.status.BaseResponse> getDeleteInstalledModuleVersionsMethod;
    if ((getDeleteInstalledModuleVersionsMethod = V2Grpc.getDeleteInstalledModuleVersionsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getDeleteInstalledModuleVersionsMethod = V2Grpc.getDeleteInstalledModuleVersionsMethod) == null) {
          V2Grpc.getDeleteInstalledModuleVersionsMethod = getDeleteInstalledModuleVersionsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.DeleteInstalledModuleVersionsRequest, com.clarifai.grpc.api.status.BaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteInstalledModuleVersions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.DeleteInstalledModuleVersionsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.status.BaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("DeleteInstalledModuleVersions"))
              .build();
        }
      }
    }
    return getDeleteInstalledModuleVersionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostInstalledModuleVersionsKeyRequest,
      com.clarifai.grpc.api.SingleKeyResponse> getPostInstalledModuleVersionsKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostInstalledModuleVersionsKey",
      requestType = com.clarifai.grpc.api.PostInstalledModuleVersionsKeyRequest.class,
      responseType = com.clarifai.grpc.api.SingleKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostInstalledModuleVersionsKeyRequest,
      com.clarifai.grpc.api.SingleKeyResponse> getPostInstalledModuleVersionsKeyMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostInstalledModuleVersionsKeyRequest, com.clarifai.grpc.api.SingleKeyResponse> getPostInstalledModuleVersionsKeyMethod;
    if ((getPostInstalledModuleVersionsKeyMethod = V2Grpc.getPostInstalledModuleVersionsKeyMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostInstalledModuleVersionsKeyMethod = V2Grpc.getPostInstalledModuleVersionsKeyMethod) == null) {
          V2Grpc.getPostInstalledModuleVersionsKeyMethod = getPostInstalledModuleVersionsKeyMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostInstalledModuleVersionsKeyRequest, com.clarifai.grpc.api.SingleKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostInstalledModuleVersionsKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostInstalledModuleVersionsKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleKeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostInstalledModuleVersionsKey"))
              .build();
        }
      }
    }
    return getPostInstalledModuleVersionsKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostBulkOperationsRequest,
      com.clarifai.grpc.api.MultiBulkOperationsResponse> getPostBulkOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostBulkOperations",
      requestType = com.clarifai.grpc.api.PostBulkOperationsRequest.class,
      responseType = com.clarifai.grpc.api.MultiBulkOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostBulkOperationsRequest,
      com.clarifai.grpc.api.MultiBulkOperationsResponse> getPostBulkOperationsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostBulkOperationsRequest, com.clarifai.grpc.api.MultiBulkOperationsResponse> getPostBulkOperationsMethod;
    if ((getPostBulkOperationsMethod = V2Grpc.getPostBulkOperationsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostBulkOperationsMethod = V2Grpc.getPostBulkOperationsMethod) == null) {
          V2Grpc.getPostBulkOperationsMethod = getPostBulkOperationsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostBulkOperationsRequest, com.clarifai.grpc.api.MultiBulkOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostBulkOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostBulkOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiBulkOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostBulkOperations"))
              .build();
        }
      }
    }
    return getPostBulkOperationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListBulkOperationsRequest,
      com.clarifai.grpc.api.MultiBulkOperationsResponse> getListBulkOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBulkOperations",
      requestType = com.clarifai.grpc.api.ListBulkOperationsRequest.class,
      responseType = com.clarifai.grpc.api.MultiBulkOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListBulkOperationsRequest,
      com.clarifai.grpc.api.MultiBulkOperationsResponse> getListBulkOperationsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListBulkOperationsRequest, com.clarifai.grpc.api.MultiBulkOperationsResponse> getListBulkOperationsMethod;
    if ((getListBulkOperationsMethod = V2Grpc.getListBulkOperationsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListBulkOperationsMethod = V2Grpc.getListBulkOperationsMethod) == null) {
          V2Grpc.getListBulkOperationsMethod = getListBulkOperationsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListBulkOperationsRequest, com.clarifai.grpc.api.MultiBulkOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListBulkOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListBulkOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiBulkOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListBulkOperations"))
              .build();
        }
      }
    }
    return getListBulkOperationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetBulkOperationRequest,
      com.clarifai.grpc.api.SingleBulkOperationsResponse> getGetBulkOperationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBulkOperation",
      requestType = com.clarifai.grpc.api.GetBulkOperationRequest.class,
      responseType = com.clarifai.grpc.api.SingleBulkOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetBulkOperationRequest,
      com.clarifai.grpc.api.SingleBulkOperationsResponse> getGetBulkOperationMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetBulkOperationRequest, com.clarifai.grpc.api.SingleBulkOperationsResponse> getGetBulkOperationMethod;
    if ((getGetBulkOperationMethod = V2Grpc.getGetBulkOperationMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getGetBulkOperationMethod = V2Grpc.getGetBulkOperationMethod) == null) {
          V2Grpc.getGetBulkOperationMethod = getGetBulkOperationMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.GetBulkOperationRequest, com.clarifai.grpc.api.SingleBulkOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBulkOperation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.GetBulkOperationRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleBulkOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("GetBulkOperation"))
              .build();
        }
      }
    }
    return getGetBulkOperationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.CancelBulkOperationRequest,
      com.clarifai.grpc.api.MultiBulkOperationsResponse> getCancelBulkOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelBulkOperations",
      requestType = com.clarifai.grpc.api.CancelBulkOperationRequest.class,
      responseType = com.clarifai.grpc.api.MultiBulkOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.CancelBulkOperationRequest,
      com.clarifai.grpc.api.MultiBulkOperationsResponse> getCancelBulkOperationsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.CancelBulkOperationRequest, com.clarifai.grpc.api.MultiBulkOperationsResponse> getCancelBulkOperationsMethod;
    if ((getCancelBulkOperationsMethod = V2Grpc.getCancelBulkOperationsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getCancelBulkOperationsMethod = V2Grpc.getCancelBulkOperationsMethod) == null) {
          V2Grpc.getCancelBulkOperationsMethod = getCancelBulkOperationsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.CancelBulkOperationRequest, com.clarifai.grpc.api.MultiBulkOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelBulkOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.CancelBulkOperationRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiBulkOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("CancelBulkOperations"))
              .build();
        }
      }
    }
    return getCancelBulkOperationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteBulkOperationRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteBulkOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteBulkOperations",
      requestType = com.clarifai.grpc.api.DeleteBulkOperationRequest.class,
      responseType = com.clarifai.grpc.api.status.BaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteBulkOperationRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteBulkOperationsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteBulkOperationRequest, com.clarifai.grpc.api.status.BaseResponse> getDeleteBulkOperationsMethod;
    if ((getDeleteBulkOperationsMethod = V2Grpc.getDeleteBulkOperationsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getDeleteBulkOperationsMethod = V2Grpc.getDeleteBulkOperationsMethod) == null) {
          V2Grpc.getDeleteBulkOperationsMethod = getDeleteBulkOperationsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.DeleteBulkOperationRequest, com.clarifai.grpc.api.status.BaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteBulkOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.DeleteBulkOperationRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.status.BaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("DeleteBulkOperations"))
              .build();
        }
      }
    }
    return getDeleteBulkOperationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetDatasetInputsSearchAddJobRequest,
      com.clarifai.grpc.api.SingleDatasetInputsSearchAddJobResponse> getGetDatasetInputsSearchAddJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDatasetInputsSearchAddJob",
      requestType = com.clarifai.grpc.api.GetDatasetInputsSearchAddJobRequest.class,
      responseType = com.clarifai.grpc.api.SingleDatasetInputsSearchAddJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetDatasetInputsSearchAddJobRequest,
      com.clarifai.grpc.api.SingleDatasetInputsSearchAddJobResponse> getGetDatasetInputsSearchAddJobMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetDatasetInputsSearchAddJobRequest, com.clarifai.grpc.api.SingleDatasetInputsSearchAddJobResponse> getGetDatasetInputsSearchAddJobMethod;
    if ((getGetDatasetInputsSearchAddJobMethod = V2Grpc.getGetDatasetInputsSearchAddJobMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getGetDatasetInputsSearchAddJobMethod = V2Grpc.getGetDatasetInputsSearchAddJobMethod) == null) {
          V2Grpc.getGetDatasetInputsSearchAddJobMethod = getGetDatasetInputsSearchAddJobMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.GetDatasetInputsSearchAddJobRequest, com.clarifai.grpc.api.SingleDatasetInputsSearchAddJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDatasetInputsSearchAddJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.GetDatasetInputsSearchAddJobRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleDatasetInputsSearchAddJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("GetDatasetInputsSearchAddJob"))
              .build();
        }
      }
    }
    return getGetDatasetInputsSearchAddJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListInputsAddJobsRequest,
      com.clarifai.grpc.api.MultiInputsAddJobResponse> getListInputsAddJobsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListInputsAddJobs",
      requestType = com.clarifai.grpc.api.ListInputsAddJobsRequest.class,
      responseType = com.clarifai.grpc.api.MultiInputsAddJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListInputsAddJobsRequest,
      com.clarifai.grpc.api.MultiInputsAddJobResponse> getListInputsAddJobsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListInputsAddJobsRequest, com.clarifai.grpc.api.MultiInputsAddJobResponse> getListInputsAddJobsMethod;
    if ((getListInputsAddJobsMethod = V2Grpc.getListInputsAddJobsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListInputsAddJobsMethod = V2Grpc.getListInputsAddJobsMethod) == null) {
          V2Grpc.getListInputsAddJobsMethod = getListInputsAddJobsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListInputsAddJobsRequest, com.clarifai.grpc.api.MultiInputsAddJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListInputsAddJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListInputsAddJobsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiInputsAddJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListInputsAddJobs"))
              .build();
        }
      }
    }
    return getListInputsAddJobsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetInputsAddJobRequest,
      com.clarifai.grpc.api.SingleInputsAddJobResponse> getGetInputsAddJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInputsAddJob",
      requestType = com.clarifai.grpc.api.GetInputsAddJobRequest.class,
      responseType = com.clarifai.grpc.api.SingleInputsAddJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetInputsAddJobRequest,
      com.clarifai.grpc.api.SingleInputsAddJobResponse> getGetInputsAddJobMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetInputsAddJobRequest, com.clarifai.grpc.api.SingleInputsAddJobResponse> getGetInputsAddJobMethod;
    if ((getGetInputsAddJobMethod = V2Grpc.getGetInputsAddJobMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getGetInputsAddJobMethod = V2Grpc.getGetInputsAddJobMethod) == null) {
          V2Grpc.getGetInputsAddJobMethod = getGetInputsAddJobMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.GetInputsAddJobRequest, com.clarifai.grpc.api.SingleInputsAddJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetInputsAddJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.GetInputsAddJobRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleInputsAddJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("GetInputsAddJob"))
              .build();
        }
      }
    }
    return getGetInputsAddJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostUploadsRequest,
      com.clarifai.grpc.api.MultiUploadResponse> getPostUploadsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostUploads",
      requestType = com.clarifai.grpc.api.PostUploadsRequest.class,
      responseType = com.clarifai.grpc.api.MultiUploadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostUploadsRequest,
      com.clarifai.grpc.api.MultiUploadResponse> getPostUploadsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostUploadsRequest, com.clarifai.grpc.api.MultiUploadResponse> getPostUploadsMethod;
    if ((getPostUploadsMethod = V2Grpc.getPostUploadsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostUploadsMethod = V2Grpc.getPostUploadsMethod) == null) {
          V2Grpc.getPostUploadsMethod = getPostUploadsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostUploadsRequest, com.clarifai.grpc.api.MultiUploadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostUploads"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostUploadsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiUploadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostUploads"))
              .build();
        }
      }
    }
    return getPostUploadsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PutUploadContentPartsRequest,
      com.clarifai.grpc.api.SingleUploadResponse> getPutUploadContentPartsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutUploadContentParts",
      requestType = com.clarifai.grpc.api.PutUploadContentPartsRequest.class,
      responseType = com.clarifai.grpc.api.SingleUploadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PutUploadContentPartsRequest,
      com.clarifai.grpc.api.SingleUploadResponse> getPutUploadContentPartsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PutUploadContentPartsRequest, com.clarifai.grpc.api.SingleUploadResponse> getPutUploadContentPartsMethod;
    if ((getPutUploadContentPartsMethod = V2Grpc.getPutUploadContentPartsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPutUploadContentPartsMethod = V2Grpc.getPutUploadContentPartsMethod) == null) {
          V2Grpc.getPutUploadContentPartsMethod = getPutUploadContentPartsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PutUploadContentPartsRequest, com.clarifai.grpc.api.SingleUploadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PutUploadContentParts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PutUploadContentPartsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleUploadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PutUploadContentParts"))
              .build();
        }
      }
    }
    return getPutUploadContentPartsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetUploadRequest,
      com.clarifai.grpc.api.SingleUploadResponse> getGetUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUpload",
      requestType = com.clarifai.grpc.api.GetUploadRequest.class,
      responseType = com.clarifai.grpc.api.SingleUploadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetUploadRequest,
      com.clarifai.grpc.api.SingleUploadResponse> getGetUploadMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetUploadRequest, com.clarifai.grpc.api.SingleUploadResponse> getGetUploadMethod;
    if ((getGetUploadMethod = V2Grpc.getGetUploadMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getGetUploadMethod = V2Grpc.getGetUploadMethod) == null) {
          V2Grpc.getGetUploadMethod = getGetUploadMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.GetUploadRequest, com.clarifai.grpc.api.SingleUploadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUpload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.GetUploadRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleUploadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("GetUpload"))
              .build();
        }
      }
    }
    return getGetUploadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListUploadsRequest,
      com.clarifai.grpc.api.MultiUploadResponse> getListUploadsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUploads",
      requestType = com.clarifai.grpc.api.ListUploadsRequest.class,
      responseType = com.clarifai.grpc.api.MultiUploadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListUploadsRequest,
      com.clarifai.grpc.api.MultiUploadResponse> getListUploadsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListUploadsRequest, com.clarifai.grpc.api.MultiUploadResponse> getListUploadsMethod;
    if ((getListUploadsMethod = V2Grpc.getListUploadsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListUploadsMethod = V2Grpc.getListUploadsMethod) == null) {
          V2Grpc.getListUploadsMethod = getListUploadsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListUploadsRequest, com.clarifai.grpc.api.MultiUploadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUploads"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListUploadsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiUploadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListUploads"))
              .build();
        }
      }
    }
    return getListUploadsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteUploadsRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteUploadsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteUploads",
      requestType = com.clarifai.grpc.api.DeleteUploadsRequest.class,
      responseType = com.clarifai.grpc.api.status.BaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteUploadsRequest,
      com.clarifai.grpc.api.status.BaseResponse> getDeleteUploadsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.DeleteUploadsRequest, com.clarifai.grpc.api.status.BaseResponse> getDeleteUploadsMethod;
    if ((getDeleteUploadsMethod = V2Grpc.getDeleteUploadsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getDeleteUploadsMethod = V2Grpc.getDeleteUploadsMethod) == null) {
          V2Grpc.getDeleteUploadsMethod = getDeleteUploadsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.DeleteUploadsRequest, com.clarifai.grpc.api.status.BaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteUploads"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.DeleteUploadsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.status.BaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("DeleteUploads"))
              .build();
        }
      }
    }
    return getDeleteUploadsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostInputsDataSourcesRequest,
      com.clarifai.grpc.api.MultiInputsAddJobResponse> getPostInputsDataSourcesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostInputsDataSources",
      requestType = com.clarifai.grpc.api.PostInputsDataSourcesRequest.class,
      responseType = com.clarifai.grpc.api.MultiInputsAddJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostInputsDataSourcesRequest,
      com.clarifai.grpc.api.MultiInputsAddJobResponse> getPostInputsDataSourcesMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostInputsDataSourcesRequest, com.clarifai.grpc.api.MultiInputsAddJobResponse> getPostInputsDataSourcesMethod;
    if ((getPostInputsDataSourcesMethod = V2Grpc.getPostInputsDataSourcesMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostInputsDataSourcesMethod = V2Grpc.getPostInputsDataSourcesMethod) == null) {
          V2Grpc.getPostInputsDataSourcesMethod = getPostInputsDataSourcesMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostInputsDataSourcesRequest, com.clarifai.grpc.api.MultiInputsAddJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostInputsDataSources"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostInputsDataSourcesRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiInputsAddJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostInputsDataSources"))
              .build();
        }
      }
    }
    return getPostInputsDataSourcesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetInputsExtractionJobRequest,
      com.clarifai.grpc.api.SingleInputsExtractionJobResponse> getGetInputsExtractionJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInputsExtractionJob",
      requestType = com.clarifai.grpc.api.GetInputsExtractionJobRequest.class,
      responseType = com.clarifai.grpc.api.SingleInputsExtractionJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetInputsExtractionJobRequest,
      com.clarifai.grpc.api.SingleInputsExtractionJobResponse> getGetInputsExtractionJobMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.GetInputsExtractionJobRequest, com.clarifai.grpc.api.SingleInputsExtractionJobResponse> getGetInputsExtractionJobMethod;
    if ((getGetInputsExtractionJobMethod = V2Grpc.getGetInputsExtractionJobMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getGetInputsExtractionJobMethod = V2Grpc.getGetInputsExtractionJobMethod) == null) {
          V2Grpc.getGetInputsExtractionJobMethod = getGetInputsExtractionJobMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.GetInputsExtractionJobRequest, com.clarifai.grpc.api.SingleInputsExtractionJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetInputsExtractionJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.GetInputsExtractionJobRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.SingleInputsExtractionJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("GetInputsExtractionJob"))
              .build();
        }
      }
    }
    return getGetInputsExtractionJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListInputsExtractionJobsRequest,
      com.clarifai.grpc.api.MultiInputsExtractionJobResponse> getListInputsExtractionJobsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListInputsExtractionJobs",
      requestType = com.clarifai.grpc.api.ListInputsExtractionJobsRequest.class,
      responseType = com.clarifai.grpc.api.MultiInputsExtractionJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListInputsExtractionJobsRequest,
      com.clarifai.grpc.api.MultiInputsExtractionJobResponse> getListInputsExtractionJobsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.ListInputsExtractionJobsRequest, com.clarifai.grpc.api.MultiInputsExtractionJobResponse> getListInputsExtractionJobsMethod;
    if ((getListInputsExtractionJobsMethod = V2Grpc.getListInputsExtractionJobsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getListInputsExtractionJobsMethod = V2Grpc.getListInputsExtractionJobsMethod) == null) {
          V2Grpc.getListInputsExtractionJobsMethod = getListInputsExtractionJobsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.ListInputsExtractionJobsRequest, com.clarifai.grpc.api.MultiInputsExtractionJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListInputsExtractionJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.ListInputsExtractionJobsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiInputsExtractionJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("ListInputsExtractionJobs"))
              .build();
        }
      }
    }
    return getListInputsExtractionJobsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.CancelInputsExtractionJobsRequest,
      com.clarifai.grpc.api.MultiInputsExtractionJobResponse> getCancelInputsExtractionJobsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelInputsExtractionJobs",
      requestType = com.clarifai.grpc.api.CancelInputsExtractionJobsRequest.class,
      responseType = com.clarifai.grpc.api.MultiInputsExtractionJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.CancelInputsExtractionJobsRequest,
      com.clarifai.grpc.api.MultiInputsExtractionJobResponse> getCancelInputsExtractionJobsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.CancelInputsExtractionJobsRequest, com.clarifai.grpc.api.MultiInputsExtractionJobResponse> getCancelInputsExtractionJobsMethod;
    if ((getCancelInputsExtractionJobsMethod = V2Grpc.getCancelInputsExtractionJobsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getCancelInputsExtractionJobsMethod = V2Grpc.getCancelInputsExtractionJobsMethod) == null) {
          V2Grpc.getCancelInputsExtractionJobsMethod = getCancelInputsExtractionJobsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.CancelInputsExtractionJobsRequest, com.clarifai.grpc.api.MultiInputsExtractionJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelInputsExtractionJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.CancelInputsExtractionJobsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiInputsExtractionJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("CancelInputsExtractionJobs"))
              .build();
        }
      }
    }
    return getCancelInputsExtractionJobsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostInputsUploadsRequest,
      com.clarifai.grpc.api.MultiInputsAddJobResponse> getPostInputsUploadsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostInputsUploads",
      requestType = com.clarifai.grpc.api.PostInputsUploadsRequest.class,
      responseType = com.clarifai.grpc.api.MultiInputsAddJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostInputsUploadsRequest,
      com.clarifai.grpc.api.MultiInputsAddJobResponse> getPostInputsUploadsMethod() {
    io.grpc.MethodDescriptor<com.clarifai.grpc.api.PostInputsUploadsRequest, com.clarifai.grpc.api.MultiInputsAddJobResponse> getPostInputsUploadsMethod;
    if ((getPostInputsUploadsMethod = V2Grpc.getPostInputsUploadsMethod) == null) {
      synchronized (V2Grpc.class) {
        if ((getPostInputsUploadsMethod = V2Grpc.getPostInputsUploadsMethod) == null) {
          V2Grpc.getPostInputsUploadsMethod = getPostInputsUploadsMethod =
              io.grpc.MethodDescriptor.<com.clarifai.grpc.api.PostInputsUploadsRequest, com.clarifai.grpc.api.MultiInputsAddJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostInputsUploads"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.PostInputsUploadsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiChannel.INSTANCE.marshaller(
                  com.clarifai.grpc.api.MultiInputsAddJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostInputsUploads"))
              .build();
        }
      }
    }
    return getPostInputsUploadsMethod;
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
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListConceptRelationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Post concept relations to create relations between concepts in the platform.
     * </pre>
     */
    public void postConceptRelations(com.clarifai.grpc.api.PostConceptRelationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptRelationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostConceptRelationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Post concept relations to create relations between concepts in the platform.
     * </pre>
     */
    public void deleteConceptRelations(com.clarifai.grpc.api.DeleteConceptRelationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteConceptRelationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all the concepts with their positive and negative counts
     * </pre>
     */
    public void getConceptCounts(com.clarifai.grpc.api.GetConceptCountsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptCountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetConceptCountsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific concept from an app.
     * </pre>
     */
    public void getConcept(com.clarifai.grpc.api.GetConceptRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleConceptResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetConceptMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all the concepts.
     * </pre>
     */
    public void listConcepts(com.clarifai.grpc.api.ListConceptsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListConceptsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List models concepts.
     * </pre>
     */
    public void listModelConcepts(com.clarifai.grpc.api.ListModelConceptsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListModelConceptsMethod(), responseObserver);
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
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostConceptsSearchesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add a concept to an app.
     * </pre>
     */
    public void postConcepts(com.clarifai.grpc.api.PostConceptsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostConceptsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Patch one or more concepts.
     * </pre>
     */
    public void patchConcepts(com.clarifai.grpc.api.PatchConceptsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPatchConceptsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific concept from an app.
     * </pre>
     */
    public void getConceptLanguage(com.clarifai.grpc.api.GetConceptLanguageRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleConceptLanguageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetConceptLanguageMethod(), responseObserver);
    }

    /**
     * <pre>
     * List the concept in all the translated languages.
     * </pre>
     */
    public void listConceptLanguages(com.clarifai.grpc.api.ListConceptLanguagesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptLanguageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListConceptLanguagesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add a new translation for this concept.
     * </pre>
     */
    public void postConceptLanguages(com.clarifai.grpc.api.PostConceptLanguagesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptLanguageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostConceptLanguagesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Patch the name for a given language names by passing in a list of concepts with the new names
     * for the languages.
     * </pre>
     */
    public void patchConceptLanguages(com.clarifai.grpc.api.PatchConceptLanguagesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptLanguageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPatchConceptLanguagesMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all domain graphs.
     * </pre>
     */
    public void listKnowledgeGraphs(com.clarifai.grpc.api.ListKnowledgeGraphsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiKnowledgeGraphResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListKnowledgeGraphsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Post domain graphs.
     * </pre>
     */
    public void postKnowledgeGraphs(com.clarifai.grpc.api.PostKnowledgeGraphsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiKnowledgeGraphResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostKnowledgeGraphsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Start concept mapping jobs.
     * </pre>
     */
    public void postConceptMappingJobs(com.clarifai.grpc.api.PostConceptMappingJobsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptMappingJobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostConceptMappingJobsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific annotation from an app.
     * </pre>
     */
    public void getAnnotation(com.clarifai.grpc.api.GetAnnotationRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleAnnotationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnnotationMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all the annotation.
     * </pre>
     */
    public void listAnnotations(com.clarifai.grpc.api.ListAnnotationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAnnotationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAnnotationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Post annotations.
     * </pre>
     */
    public void postAnnotations(com.clarifai.grpc.api.PostAnnotationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAnnotationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostAnnotationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Patch one or more annotations.
     * </pre>
     */
    public void patchAnnotations(com.clarifai.grpc.api.PatchAnnotationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAnnotationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPatchAnnotationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Patch annotations status by worker id and task id.
     * </pre>
     */
    public void patchAnnotationsStatus(com.clarifai.grpc.api.PatchAnnotationsStatusRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.PatchAnnotationsStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPatchAnnotationsStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a single annotation.
     * </pre>
     */
    public void deleteAnnotation(com.clarifai.grpc.api.DeleteAnnotationRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAnnotationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete multiple annotations in one request.
     * </pre>
     */
    public void deleteAnnotations(com.clarifai.grpc.api.DeleteAnnotationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAnnotationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Patch saved annotations searches by ids.
     * </pre>
     */
    public void patchAnnotationsSearches(com.clarifai.grpc.api.PatchAnnotationsSearchesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiSearchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPatchAnnotationsSearchesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Execute a search over annotations
     * </pre>
     */
    public void postAnnotationsSearches(com.clarifai.grpc.api.PostAnnotationsSearchesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiSearchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostAnnotationsSearchesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get input count per status.
     * </pre>
     */
    public void getInputCount(com.clarifai.grpc.api.GetInputCountRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleInputCountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetInputCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Streams all the inputs starting from oldest assets.
     * </pre>
     */
    public void streamInputs(com.clarifai.grpc.api.StreamInputsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamInputsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific input from an app.
     * </pre>
     */
    public void getInputSamples(com.clarifai.grpc.api.GetInputSamplesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputAnnotationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetInputSamplesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific input from an app.
     * </pre>
     */
    public void getInput(com.clarifai.grpc.api.GetInputRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleInputResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetInputMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all the inputs.
     * </pre>
     */
    public void listInputs(com.clarifai.grpc.api.ListInputsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListInputsMethod(), responseObserver);
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
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostInputsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Patch one or more inputs.
     * </pre>
     */
    public void patchInputs(com.clarifai.grpc.api.PatchInputsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPatchInputsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a single input asynchronously.
     * </pre>
     */
    public void deleteInput(com.clarifai.grpc.api.DeleteInputRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteInputMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete multiple inputs in one request.
     * This call is asynchronous.
     * </pre>
     */
    public void deleteInputs(com.clarifai.grpc.api.DeleteInputsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteInputsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Patch saved inputs searches by ids.
     * </pre>
     */
    public void patchInputsSearches(com.clarifai.grpc.api.PatchInputsSearchesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiSearchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPatchInputsSearchesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Execute a search over inputs
     * </pre>
     */
    public void postInputsSearches(com.clarifai.grpc.api.PostInputsSearchesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiSearchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostInputsSearchesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get predicted outputs from the model.
     * </pre>
     */
    public void postModelOutputs(com.clarifai.grpc.api.PostModelOutputsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiOutputResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostModelOutputsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all the datasets.
     * </pre>
     */
    public void listDatasets(com.clarifai.grpc.api.ListDatasetsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiDatasetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDatasetsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific dataset.
     * </pre>
     */
    public void getDataset(com.clarifai.grpc.api.GetDatasetRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleDatasetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDatasetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add datasets to an app.
     * The process is atomic, i.e. either all or no datasets are added.
     * If there is an error for one dataset,
     * the process will stop, revert the transaction and return the error.
     * </pre>
     */
    public void postDatasets(com.clarifai.grpc.api.PostDatasetsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiDatasetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostDatasetsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Patch one or more datasets.
     * The process is atomic, i.e. either all or no datasets are patched.
     * If there is an error for one dataset,
     * the process will stop, revert the transaction and return the error.
     * </pre>
     */
    public void patchDatasets(com.clarifai.grpc.api.PatchDatasetsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiDatasetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPatchDatasetsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Patch one or more dataset ids.
     * </pre>
     */
    public void patchDatasetIds(com.clarifai.grpc.api.PatchDatasetIdsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiDatasetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPatchDatasetIdsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete one or more datasets in a single request.
     * </pre>
     */
    public void deleteDatasets(com.clarifai.grpc.api.DeleteDatasetsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDatasetsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all the dataset inputs in a dataset.
     * </pre>
     */
    public void listDatasetInputs(com.clarifai.grpc.api.ListDatasetInputsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiDatasetInputResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDatasetInputsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific dataset input.
     * </pre>
     */
    public void getDatasetInput(com.clarifai.grpc.api.GetDatasetInputRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleDatasetInputResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDatasetInputMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add dataset inputs to a dataset.
     * The process is not atomic, i.e. if there are errors with some dataset
     * inputs, others might still be added. The response reports
     *   - SUCCESS if all dataset inputs were added,
     *   - MIXED_STATUS if only some dataset inputs were added, and
     *   - FAILURE if no dataset inputs were added.
     * Each individual dataset input in the response has the status set to
     * indicate if it was successful or if there was an error.
     * </pre>
     */
    public void postDatasetInputs(com.clarifai.grpc.api.PostDatasetInputsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiDatasetInputResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostDatasetInputsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete one or more dataset inputs in a single request.
     * </pre>
     */
    public void deleteDatasetInputs(com.clarifai.grpc.api.DeleteDatasetInputsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDatasetInputsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all the dataset versions.
     * </pre>
     */
    public void listDatasetVersions(com.clarifai.grpc.api.ListDatasetVersionsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiDatasetVersionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDatasetVersionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific dataset version.
     * </pre>
     */
    public void getDatasetVersion(com.clarifai.grpc.api.GetDatasetVersionRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleDatasetVersionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDatasetVersionMethod(), responseObserver);
    }

    /**
     */
    public void listDatasetVersionMetricsGroups(com.clarifai.grpc.api.ListDatasetVersionMetricsGroupsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiDatasetVersionMetricsGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDatasetVersionMetricsGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add dataset versions to a dataset.
     * </pre>
     */
    public void postDatasetVersions(com.clarifai.grpc.api.PostDatasetVersionsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiDatasetVersionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostDatasetVersionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Patch one or more dataset versions.
     * </pre>
     */
    public void patchDatasetVersions(com.clarifai.grpc.api.PatchDatasetVersionsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiDatasetVersionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPatchDatasetVersionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete one or more dataset versions in a single request.
     * </pre>
     */
    public void deleteDatasetVersions(com.clarifai.grpc.api.DeleteDatasetVersionsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDatasetVersionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create export of a dataset version.
     * </pre>
     */
    public void putDatasetVersionExports(com.clarifai.grpc.api.PutDatasetVersionExportsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiDatasetVersionExportResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPutDatasetVersionExportsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific model type.
     * </pre>
     */
    public void getModelType(com.clarifai.grpc.api.GetModelTypeRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelTypeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetModelTypeMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all the supported open source licenses in the platform.
     * </pre>
     */
    public void listOpenSourceLicenses(com.clarifai.grpc.api.ListOpenSourceLicensesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.ListOpenSourceLicensesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOpenSourceLicensesMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all the model types available in the platform.
     * This MUST be above ListModels so that the /models/types endpoint takes precedence.
     * </pre>
     */
    public void listModelTypes(com.clarifai.grpc.api.ListModelTypesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelTypeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListModelTypesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific model from an app.
     * </pre>
     */
    public void getModel(com.clarifai.grpc.api.GetModelRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetModelMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a the output info for a given model_id or model_id/version_id
     * combo.
     * </pre>
     */
    public void getModelOutputInfo(com.clarifai.grpc.api.GetModelRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetModelOutputInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all the models.
     * </pre>
     */
    public void listModels(com.clarifai.grpc.api.ListModelsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListModelsMethod(), responseObserver);
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
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostModelsSearchesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add a models to an app.
     * </pre>
     */
    public void postModels(com.clarifai.grpc.api.PostModelsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostModelsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Patch one or more models.
     * </pre>
     */
    public void patchModels(com.clarifai.grpc.api.PatchModelsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPatchModelsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Patch one or more models ids.
     * </pre>
     */
    public void patchModelIds(com.clarifai.grpc.api.PatchModelIdsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPatchModelIdsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a single model.
     * </pre>
     */
    public void deleteModel(com.clarifai.grpc.api.DeleteModelRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteModelMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete multiple models in one request.
     * </pre>
     */
    public void deleteModels(com.clarifai.grpc.api.DeleteModelsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteModelsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update model check consents
     * </pre>
     */
    public void patchModelCheckConsents(com.clarifai.grpc.api.PatchModelCheckConsentsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelCheckConsentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPatchModelCheckConsentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update model toolkits tags
     * </pre>
     */
    public void patchModelToolkits(com.clarifai.grpc.api.PatchModelToolkitsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelToolkitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPatchModelToolkitsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update model use_cases tags
     * </pre>
     */
    public void patchModelUseCases(com.clarifai.grpc.api.PatchModelUseCasesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelUseCaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPatchModelUseCasesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update model languages tags
     * </pre>
     */
    public void patchModelLanguages(com.clarifai.grpc.api.PatchModelLanguagesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelLanguageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPatchModelLanguagesMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all the inputs.
     * </pre>
     */
    public void listModelInputs(com.clarifai.grpc.api.ListModelInputsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListModelInputsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific model from an app.
     * </pre>
     */
    public void getModelVersion(com.clarifai.grpc.api.GetModelVersionRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelVersionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetModelVersionMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all the models.
     * </pre>
     */
    public void listModelVersions(com.clarifai.grpc.api.ListModelVersionsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelVersionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListModelVersionsMethod(), responseObserver);
    }

    /**
     */
    public void postWorkflowVersionsUnPublish(com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostWorkflowVersionsUnPublishMethod(), responseObserver);
    }

    /**
     */
    public void postWorkflowVersionsPublish(com.clarifai.grpc.api.PostWorkflowVersionsPublishRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostWorkflowVersionsPublishMethod(), responseObserver);
    }

    /**
     * <pre>
     * PostModelVersionsPublish
     * </pre>
     */
    public void postModelVersionsPublish(com.clarifai.grpc.api.PostModelVersionsPublishRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostModelVersionsPublishMethod(), responseObserver);
    }

    /**
     * <pre>
     * PostModelVersionsUnPublish
     * </pre>
     */
    public void postModelVersionsUnPublish(com.clarifai.grpc.api.PostModelVersionsUnPublishRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostModelVersionsUnPublishMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a new model version to trigger training of the model.
     * </pre>
     */
    public void postModelVersions(com.clarifai.grpc.api.PostModelVersionsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostModelVersionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * PatchModelVersions
     * </pre>
     */
    public void patchModelVersions(com.clarifai.grpc.api.PatchModelVersionsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelVersionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPatchModelVersionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a single model.
     * </pre>
     */
    public void deleteModelVersion(com.clarifai.grpc.api.DeleteModelVersionRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteModelVersionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deprecated: Use GetModelVersionEvaluation instead
     * Get the evaluation metrics for a model version.
     * </pre>
     */
    public void getModelVersionMetrics(com.clarifai.grpc.api.GetModelVersionMetricsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelVersionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetModelVersionMetricsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deprecated, use PostModelVersionEvaluations instead
     * Run the evaluation metrics for a model version.
     * </pre>
     */
    public void postModelVersionMetrics(com.clarifai.grpc.api.PostModelVersionMetricsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelVersionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostModelVersionMetricsMethod(), responseObserver);
    }

    /**
     */
    public void postModelVersionEvaluations(com.clarifai.grpc.api.PostModelVersionEvaluationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiEvalMetricsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostModelVersionEvaluationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List the evaluation metrics for a model version.
     * </pre>
     */
    public void listModelVersionEvaluations(com.clarifai.grpc.api.ListModelVersionEvaluationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiEvalMetricsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListModelVersionEvaluationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an evaluation metrics for a model version.
     * </pre>
     */
    public void getModelVersionEvaluation(com.clarifai.grpc.api.GetModelVersionEvaluationRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleEvalMetricsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetModelVersionEvaluationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists model references tied to a particular model id.
     * </pre>
     */
    public void listModelReferences(com.clarifai.grpc.api.ListModelReferencesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelReferenceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListModelReferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetModelVersionInputExample
     * </pre>
     */
    public void getModelVersionInputExample(com.clarifai.grpc.api.GetModelVersionInputExampleRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelVersionInputExampleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetModelVersionInputExampleMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListModelVersionInputExamples
     * </pre>
     */
    public void listModelVersionInputExamples(com.clarifai.grpc.api.ListModelVersionInputExamplesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelVersionInputExampleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListModelVersionInputExamplesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific workflow from an app.
     * </pre>
     */
    public void getWorkflow(com.clarifai.grpc.api.GetWorkflowRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleWorkflowResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWorkflowMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all the workflows.
     * </pre>
     */
    public void listWorkflows(com.clarifai.grpc.api.ListWorkflowsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiWorkflowResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListWorkflowsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add a workflow to an app.
     * </pre>
     */
    public void postWorkflows(com.clarifai.grpc.api.PostWorkflowsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiWorkflowResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostWorkflowsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Patch one or more workflows.
     * </pre>
     */
    public void patchWorkflows(com.clarifai.grpc.api.PatchWorkflowsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiWorkflowResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPatchWorkflowsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Patch one or more workflows ids.
     * </pre>
     */
    public void patchWorkflowIds(com.clarifai.grpc.api.PatchWorkflowIdsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiWorkflowResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPatchWorkflowIdsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a single workflow.
     * </pre>
     */
    public void deleteWorkflow(com.clarifai.grpc.api.DeleteWorkflowRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteWorkflowMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete multiple workflows in one request.
     * </pre>
     */
    public void deleteWorkflows(com.clarifai.grpc.api.DeleteWorkflowsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteWorkflowsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Predict using a workflow.
     * </pre>
     */
    public void postWorkflowResults(com.clarifai.grpc.api.PostWorkflowResultsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.PostWorkflowResultsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostWorkflowResultsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Compare embeddings distances using a workflow
     * </pre>
     */
    public void postWorkflowResultsSimilarity(com.clarifai.grpc.api.PostWorkflowResultsSimilarityRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.PostWorkflowResultsSimilarityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostWorkflowResultsSimilarityMethod(), responseObserver);
    }

    /**
     * <pre>
     * List workflow versions.
     * </pre>
     */
    public void listWorkflowVersions(com.clarifai.grpc.api.ListWorkflowVersionsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiWorkflowVersionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListWorkflowVersionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get single workflow version.
     * </pre>
     */
    public void getWorkflowVersion(com.clarifai.grpc.api.GetWorkflowVersionRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleWorkflowVersionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWorkflowVersionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete workflow versions.
     * </pre>
     */
    public void deleteWorkflowVersions(com.clarifai.grpc.api.DeleteWorkflowVersionsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteWorkflowVersionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Patch workflow versions.
     * </pre>
     */
    public void patchWorkflowVersions(com.clarifai.grpc.api.PatchWorkflowVersionsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiWorkflowVersionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPatchWorkflowVersionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific key from an app.
     * </pre>
     */
    public void getKey(com.clarifai.grpc.api.GetKeyRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all the keys.
     * </pre>
     */
    public void listKeys(com.clarifai.grpc.api.ListKeysRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListKeysMethod(), responseObserver);
    }

    /**
     * <pre>
     * List keys by app_id
     * </pre>
     */
    public void listAppKeys(com.clarifai.grpc.api.ListAppKeysRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAppKeysMethod(), responseObserver);
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
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add a key to an app.
     * </pre>
     */
    public void postKeys(com.clarifai.grpc.api.PostKeysRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostKeysMethod(), responseObserver);
    }

    /**
     * <pre>
     * Patch one or more keys.
     * </pre>
     */
    public void patchKeys(com.clarifai.grpc.api.PatchKeysRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPatchKeysMethod(), responseObserver);
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
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMyScopesMethod(), responseObserver);
    }

    /**
     */
    public void myScopesUser(com.clarifai.grpc.api.MyScopesUserRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiScopeUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMyScopesUserMethod(), responseObserver);
    }

    /**
     */
    public void myScopesRoot(com.clarifai.grpc.api.MyScopesRootRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiScopeRootResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMyScopesRootMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all auth scopes available to me as a user.
     * </pre>
     */
    public void listScopes(com.clarifai.grpc.api.ListScopesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiScopeDepsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListScopesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific app from an app.
     * </pre>
     */
    public void getApp(com.clarifai.grpc.api.GetAppRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAppMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all the apps.
     * </pre>
     */
    public void listApps(com.clarifai.grpc.api.ListAppsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAppsMethod(), responseObserver);
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
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAppMethod(), responseObserver);
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
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostAppsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Patch one or more apps.
     * </pre>
     */
    public void patchApps(com.clarifai.grpc.api.PatchAppsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPatchAppsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Patch apps ids.
     * </pre>
     */
    public void patchAppsIds(com.clarifai.grpc.api.PatchAppsIdsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPatchAppsIdsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Patch one app.
     * </pre>
     */
    public void patchApp(com.clarifai.grpc.api.PatchAppRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPatchAppMethod(), responseObserver);
    }

    /**
     * <pre>
     * Search over the applications to find one or more you're looking for.
     * </pre>
     */
    public void postAppsSearches(com.clarifai.grpc.api.PostAppsSearchesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostAppsSearchesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Validate new password in real-time for a user
     * </pre>
     */
    public void postValidatePassword(com.clarifai.grpc.api.PostValidatePasswordRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SinglePasswordValidationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostValidatePasswordMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a saved legacy search.
     * </pre>
     */
    public void getSearch(com.clarifai.grpc.api.GetSearchRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleSearchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all saved legacy searches.
     * </pre>
     */
    public void listSearches(com.clarifai.grpc.api.ListSearchesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiSearchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSearchesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Patch saved legacy searches by ids.
     * </pre>
     */
    public void patchSearches(com.clarifai.grpc.api.PatchSearchesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiSearchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPatchSearchesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Execute a new search and optionally save it.
     * Deprecated: Use PostInputsSearches or PostAnnotationsSearches instead.
     * </pre>
     */
    @java.lang.Deprecated
    public void postSearches(com.clarifai.grpc.api.PostSearchesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiSearchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostSearchesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Execute a previously saved legacy search.
     * </pre>
     */
    public void postSearchesByID(com.clarifai.grpc.api.PostSearchesByIDRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiSearchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostSearchesByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * Evaluate the results of two search requests
     * </pre>
     */
    public void postAnnotationSearchMetrics(com.clarifai.grpc.api.PostAnnotationSearchMetricsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostAnnotationSearchMetricsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the evaluation results between two search requests
     * </pre>
     */
    public void getAnnotationSearchMetrics(com.clarifai.grpc.api.GetAnnotationSearchMetricsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnnotationSearchMetricsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List the evaluation results between two search requests
     * </pre>
     */
    public void listAnnotationSearchMetrics(com.clarifai.grpc.api.ListAnnotationSearchMetricsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAnnotationSearchMetricsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteAnnotationSearchMetrics
     * </pre>
     */
    public void deleteAnnotationSearchMetrics(com.clarifai.grpc.api.DeleteAnnotationSearchMetricsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAnnotationSearchMetricsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a saved search.
     * </pre>
     */
    public void deleteSearch(com.clarifai.grpc.api.DeleteSearchRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all the annotation filters.
     * </pre>
     */
    public void listAnnotationFilters(com.clarifai.grpc.api.ListAnnotationFiltersRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAnnotationFilterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAnnotationFiltersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific annotation filter.
     * </pre>
     */
    public void getAnnotationFilter(com.clarifai.grpc.api.GetAnnotationFilterRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleAnnotationFilterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnnotationFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add annotation filters.
     * </pre>
     */
    public void postAnnotationFilters(com.clarifai.grpc.api.PostAnnotationFiltersRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAnnotationFilterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostAnnotationFiltersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Patch one or more annotation filters.
     * </pre>
     */
    public void patchAnnotationFilters(com.clarifai.grpc.api.PatchAnnotationFiltersRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAnnotationFilterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPatchAnnotationFiltersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete one or more annotation filters in a single request.
     * </pre>
     */
    public void deleteAnnotationFilters(com.clarifai.grpc.api.DeleteAnnotationFiltersRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAnnotationFiltersMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all status codes.
     * </pre>
     */
    public void listStatusCodes(com.clarifai.grpc.api.ListStatusCodesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiStatusCodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListStatusCodesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get more details for a status code.
     * </pre>
     */
    public void getStatusCode(com.clarifai.grpc.api.GetStatusCodeRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleStatusCodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStatusCodeMethod(), responseObserver);
    }

    /**
     * <pre>
     * owner list users who the app is shared with
     * </pre>
     */
    public void listCollaborators(com.clarifai.grpc.api.ListCollaboratorsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiCollaboratorsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCollaboratorsMethod(), responseObserver);
    }

    /**
     * <pre>
     * add collaborators to an app.
     * </pre>
     */
    public void postCollaborators(com.clarifai.grpc.api.PostCollaboratorsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiCollaboratorsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostCollaboratorsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Patch existing collaborators.
     * </pre>
     */
    public void patchCollaborators(com.clarifai.grpc.api.PatchCollaboratorsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiCollaboratorsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPatchCollaboratorsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete existing collaborators.
     * </pre>
     */
    public void deleteCollaborators(com.clarifai.grpc.api.DeleteCollaboratorsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCollaboratorsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Collaboration includes the app user are invitied to work on
     * </pre>
     */
    public void listCollaborations(com.clarifai.grpc.api.ListCollaborationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiCollaborationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCollaborationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * start to duplicate an app which copies all the inputs, annotations, models, concepts etc. to a new app.
     * this is an async process, you should use ListAppDuplications or GetAppDuplication to check the status.
     * </pre>
     */
    public void postAppDuplications(com.clarifai.grpc.api.PostAppDuplicationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAppDuplicationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostAppDuplicationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * list all the app duplications user triggers
     * </pre>
     */
    public void listAppDuplications(com.clarifai.grpc.api.ListAppDuplicationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAppDuplicationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAppDuplicationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * get the app duplication status
     * </pre>
     */
    public void getAppDuplication(com.clarifai.grpc.api.GetAppDuplicationRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleAppDuplicationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAppDuplicationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add tasks to an app.
     * </pre>
     */
    public void postTasks(com.clarifai.grpc.api.PostTasksRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiTaskResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostTasksMethod(), responseObserver);
    }

    /**
     * <pre>
     * Task annotation count
     * </pre>
     */
    public void getTaskAnnotationCount(com.clarifai.grpc.api.GetTaskCountRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleTaskCountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTaskAnnotationCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Task Input count
     * </pre>
     */
    public void getTaskInputCount(com.clarifai.grpc.api.GetTaskCountRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleTaskCountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTaskInputCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific task from an app.
     * </pre>
     */
    public void getTask(com.clarifai.grpc.api.GetTaskRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleTaskResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTaskMethod(), responseObserver);
    }

    /**
     * <pre>
     * List tasks from an app.
     * </pre>
     */
    public void listTasks(com.clarifai.grpc.api.ListTasksRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiTaskResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTasksMethod(), responseObserver);
    }

    /**
     * <pre>
     * Patch one or more tasks.
     * </pre>
     */
    public void patchTasks(com.clarifai.grpc.api.PatchTasksRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiTaskResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPatchTasksMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete multiple tasks in one request.
     * </pre>
     */
    public void deleteTasks(com.clarifai.grpc.api.DeleteTasksRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTasksMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add Label orders.
     * </pre>
     */
    public void postLabelOrders(com.clarifai.grpc.api.PostLabelOrdersRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiLabelOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostLabelOrdersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a label order.
     * </pre>
     */
    public void getLabelOrder(com.clarifai.grpc.api.GetLabelOrderRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleLabelOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLabelOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * List label orders.
     * </pre>
     */
    public void listLabelOrders(com.clarifai.grpc.api.ListLabelOrdersRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiLabelOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListLabelOrdersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Patch one or more label orders.
     * </pre>
     */
    public void patchLabelOrders(com.clarifai.grpc.api.PatchLabelOrdersRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiLabelOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPatchLabelOrdersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete multiple label orders in one request.
     * this do not change task status
     * </pre>
     */
    public void deleteLabelOrders(com.clarifai.grpc.api.DeleteLabelOrdersRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteLabelOrdersMethod(), responseObserver);
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
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostCollectorsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific collector from an app.
     * </pre>
     */
    public void getCollector(com.clarifai.grpc.api.GetCollectorRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleCollectorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCollectorMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all the collectors.
     * </pre>
     */
    public void listCollectors(com.clarifai.grpc.api.ListCollectorsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiCollectorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCollectorsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Patch one or more collectors.
     * </pre>
     */
    public void patchCollectors(com.clarifai.grpc.api.PatchCollectorsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiCollectorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPatchCollectorsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete multiple collectors in one request.
     * This call is asynchronous. Use DeleteCollector if you want a synchronous version.
     * </pre>
     */
    public void deleteCollectors(com.clarifai.grpc.api.DeleteCollectorsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCollectorsMethod(), responseObserver);
    }

    /**
     * <pre>
     * PostStatValues
     * </pre>
     */
    public void postStatValues(com.clarifai.grpc.api.PostStatValuesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiStatValueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostStatValuesMethod(), responseObserver);
    }

    /**
     * <pre>
     * PostStatValuesAggregate
     * </pre>
     */
    public void postStatValuesAggregate(com.clarifai.grpc.api.PostStatValuesAggregateRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiStatValueAggregateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostStatValuesAggregateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Increase the view metric for a detail view
     * </pre>
     */
    public void postTrendingMetricsView(com.clarifai.grpc.api.PostTrendingMetricsViewRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostTrendingMetricsViewMethod(), responseObserver);
    }

    /**
     * <pre>
     * List the view metrics for a detail view
     * </pre>
     */
    public void listTrendingMetricsViews(com.clarifai.grpc.api.ListTrendingMetricsViewsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiTrendingMetricsViewResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTrendingMetricsViewsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific module from an app.
     * </pre>
     */
    public void getModule(com.clarifai.grpc.api.GetModuleRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModuleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetModuleMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all the modules in community, by user or by app.
     * </pre>
     */
    public void listModules(com.clarifai.grpc.api.ListModulesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModuleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListModulesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add a modules to an app.
     * </pre>
     */
    public void postModules(com.clarifai.grpc.api.PostModulesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModuleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostModulesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Patch one or more modules.
     * </pre>
     */
    public void patchModules(com.clarifai.grpc.api.PatchModulesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModuleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPatchModulesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete multiple modules in one request.
     * </pre>
     */
    public void deleteModules(com.clarifai.grpc.api.DeleteModulesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteModulesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific module version for a module.
     * </pre>
     */
    public void getModuleVersion(com.clarifai.grpc.api.GetModuleVersionRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModuleVersionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetModuleVersionMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all the modules versions for a given module.
     * </pre>
     */
    public void listModuleVersions(com.clarifai.grpc.api.ListModuleVersionsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModuleVersionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListModuleVersionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a new module version to trigger training of the module.
     * </pre>
     */
    public void postModuleVersions(com.clarifai.grpc.api.PostModuleVersionsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModuleVersionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostModuleVersionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a multiple module version.
     * </pre>
     */
    public void deleteModuleVersions(com.clarifai.grpc.api.DeleteModuleVersionsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteModuleVersionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get installed modules vesrions for an app.
     * </pre>
     */
    public void getInstalledModuleVersion(com.clarifai.grpc.api.GetInstalledModuleVersionRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleInstalledModuleVersionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetInstalledModuleVersionMethod(), responseObserver);
    }

    /**
     * <pre>
     * List installed modules vesrions for an app.
     * </pre>
     */
    public void listInstalledModuleVersions(com.clarifai.grpc.api.ListInstalledModuleVersionsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInstalledModuleVersionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListInstalledModuleVersionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Install a new module version which will deploy the specific ModuleVersion to the app in the url.
     * </pre>
     */
    public void postInstalledModuleVersions(com.clarifai.grpc.api.PostInstalledModuleVersionsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInstalledModuleVersionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostInstalledModuleVersionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Uninstall an installed module version which will deploy the specific ModuleVersion to the app
     * in the url.
     * This cleaned up any associated caller keys so needs the Keys_Delete scope.
     * </pre>
     */
    public void deleteInstalledModuleVersions(com.clarifai.grpc.api.DeleteInstalledModuleVersionsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteInstalledModuleVersionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Assign a key that the caller owns to be used when accessing this installed module version
     * If this endpoint is called with a different key then it overwrites what is there.
     * </pre>
     */
    public void postInstalledModuleVersionsKey(com.clarifai.grpc.api.PostInstalledModuleVersionsKeyRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostInstalledModuleVersionsKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Perform bulk operations on a list of inputs based on input source.
     * Operation include add, update, delete of concepts, metadata and geo data.
     * This is an Asynchronous process. Use ListBulkOperations or GetBulkOperation to check the status.
     * </pre>
     */
    public void postBulkOperations(com.clarifai.grpc.api.PostBulkOperationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiBulkOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostBulkOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all the bulk operations
     * </pre>
     */
    public void listBulkOperations(com.clarifai.grpc.api.ListBulkOperationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiBulkOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListBulkOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the bulk operation details by ID
     * </pre>
     */
    public void getBulkOperation(com.clarifai.grpc.api.GetBulkOperationRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleBulkOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBulkOperationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Cancel one or more bulk operations
     * </pre>
     */
    public void cancelBulkOperations(com.clarifai.grpc.api.CancelBulkOperationRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiBulkOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelBulkOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * delete one or more terminated bulk operations
     * </pre>
     */
    public void deleteBulkOperations(com.clarifai.grpc.api.DeleteBulkOperationRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteBulkOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific job.
     * </pre>
     */
    public void getDatasetInputsSearchAddJob(com.clarifai.grpc.api.GetDatasetInputsSearchAddJobRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleDatasetInputsSearchAddJobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDatasetInputsSearchAddJobMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all the inputs add jobs
     * </pre>
     */
    public void listInputsAddJobs(com.clarifai.grpc.api.ListInputsAddJobsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputsAddJobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListInputsAddJobsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the input add job details by ID
     * </pre>
     */
    public void getInputsAddJob(com.clarifai.grpc.api.GetInputsAddJobRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleInputsAddJobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetInputsAddJobMethod(), responseObserver);
    }

    /**
     */
    public void postUploads(com.clarifai.grpc.api.PostUploadsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiUploadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostUploadsMethod(), responseObserver);
    }

    /**
     */
    public void putUploadContentParts(com.clarifai.grpc.api.PutUploadContentPartsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleUploadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPutUploadContentPartsMethod(), responseObserver);
    }

    /**
     */
    public void getUpload(com.clarifai.grpc.api.GetUploadRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleUploadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUploadMethod(), responseObserver);
    }

    /**
     */
    public void listUploads(com.clarifai.grpc.api.ListUploadsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiUploadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUploadsMethod(), responseObserver);
    }

    /**
     */
    public void deleteUploads(com.clarifai.grpc.api.DeleteUploadsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUploadsMethod(), responseObserver);
    }

    /**
     */
    public void postInputsDataSources(com.clarifai.grpc.api.PostInputsDataSourcesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputsAddJobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostInputsDataSourcesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the input extraction job details by ID
     * </pre>
     */
    public void getInputsExtractionJob(com.clarifai.grpc.api.GetInputsExtractionJobRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleInputsExtractionJobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetInputsExtractionJobMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all the input extraction jobs
     * </pre>
     */
    public void listInputsExtractionJobs(com.clarifai.grpc.api.ListInputsExtractionJobsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputsExtractionJobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListInputsExtractionJobsMethod(), responseObserver);
    }

    /**
     */
    public void cancelInputsExtractionJobs(com.clarifai.grpc.api.CancelInputsExtractionJobsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputsExtractionJobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelInputsExtractionJobsMethod(), responseObserver);
    }

    /**
     */
    public void postInputsUploads(com.clarifai.grpc.api.PostInputsUploadsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputsAddJobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostInputsUploadsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListConceptRelationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListConceptRelationsRequest,
                com.clarifai.grpc.api.MultiConceptRelationResponse>(
                  this, METHODID_LIST_CONCEPT_RELATIONS)))
          .addMethod(
            getPostConceptRelationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostConceptRelationsRequest,
                com.clarifai.grpc.api.MultiConceptRelationResponse>(
                  this, METHODID_POST_CONCEPT_RELATIONS)))
          .addMethod(
            getDeleteConceptRelationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteConceptRelationsRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_CONCEPT_RELATIONS)))
          .addMethod(
            getGetConceptCountsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetConceptCountsRequest,
                com.clarifai.grpc.api.MultiConceptCountResponse>(
                  this, METHODID_GET_CONCEPT_COUNTS)))
          .addMethod(
            getGetConceptMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetConceptRequest,
                com.clarifai.grpc.api.SingleConceptResponse>(
                  this, METHODID_GET_CONCEPT)))
          .addMethod(
            getListConceptsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListConceptsRequest,
                com.clarifai.grpc.api.MultiConceptResponse>(
                  this, METHODID_LIST_CONCEPTS)))
          .addMethod(
            getListModelConceptsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListModelConceptsRequest,
                com.clarifai.grpc.api.MultiConceptResponse>(
                  this, METHODID_LIST_MODEL_CONCEPTS)))
          .addMethod(
            getPostConceptsSearchesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostConceptsSearchesRequest,
                com.clarifai.grpc.api.MultiConceptResponse>(
                  this, METHODID_POST_CONCEPTS_SEARCHES)))
          .addMethod(
            getPostConceptsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostConceptsRequest,
                com.clarifai.grpc.api.MultiConceptResponse>(
                  this, METHODID_POST_CONCEPTS)))
          .addMethod(
            getPatchConceptsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchConceptsRequest,
                com.clarifai.grpc.api.MultiConceptResponse>(
                  this, METHODID_PATCH_CONCEPTS)))
          .addMethod(
            getGetConceptLanguageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetConceptLanguageRequest,
                com.clarifai.grpc.api.SingleConceptLanguageResponse>(
                  this, METHODID_GET_CONCEPT_LANGUAGE)))
          .addMethod(
            getListConceptLanguagesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListConceptLanguagesRequest,
                com.clarifai.grpc.api.MultiConceptLanguageResponse>(
                  this, METHODID_LIST_CONCEPT_LANGUAGES)))
          .addMethod(
            getPostConceptLanguagesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostConceptLanguagesRequest,
                com.clarifai.grpc.api.MultiConceptLanguageResponse>(
                  this, METHODID_POST_CONCEPT_LANGUAGES)))
          .addMethod(
            getPatchConceptLanguagesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchConceptLanguagesRequest,
                com.clarifai.grpc.api.MultiConceptLanguageResponse>(
                  this, METHODID_PATCH_CONCEPT_LANGUAGES)))
          .addMethod(
            getListKnowledgeGraphsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListKnowledgeGraphsRequest,
                com.clarifai.grpc.api.MultiKnowledgeGraphResponse>(
                  this, METHODID_LIST_KNOWLEDGE_GRAPHS)))
          .addMethod(
            getPostKnowledgeGraphsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostKnowledgeGraphsRequest,
                com.clarifai.grpc.api.MultiKnowledgeGraphResponse>(
                  this, METHODID_POST_KNOWLEDGE_GRAPHS)))
          .addMethod(
            getPostConceptMappingJobsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostConceptMappingJobsRequest,
                com.clarifai.grpc.api.MultiConceptMappingJobResponse>(
                  this, METHODID_POST_CONCEPT_MAPPING_JOBS)))
          .addMethod(
            getGetAnnotationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetAnnotationRequest,
                com.clarifai.grpc.api.SingleAnnotationResponse>(
                  this, METHODID_GET_ANNOTATION)))
          .addMethod(
            getListAnnotationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListAnnotationsRequest,
                com.clarifai.grpc.api.MultiAnnotationResponse>(
                  this, METHODID_LIST_ANNOTATIONS)))
          .addMethod(
            getPostAnnotationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostAnnotationsRequest,
                com.clarifai.grpc.api.MultiAnnotationResponse>(
                  this, METHODID_POST_ANNOTATIONS)))
          .addMethod(
            getPatchAnnotationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchAnnotationsRequest,
                com.clarifai.grpc.api.MultiAnnotationResponse>(
                  this, METHODID_PATCH_ANNOTATIONS)))
          .addMethod(
            getPatchAnnotationsStatusMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchAnnotationsStatusRequest,
                com.clarifai.grpc.api.PatchAnnotationsStatusResponse>(
                  this, METHODID_PATCH_ANNOTATIONS_STATUS)))
          .addMethod(
            getDeleteAnnotationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteAnnotationRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_ANNOTATION)))
          .addMethod(
            getDeleteAnnotationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteAnnotationsRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_ANNOTATIONS)))
          .addMethod(
            getPatchAnnotationsSearchesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchAnnotationsSearchesRequest,
                com.clarifai.grpc.api.MultiSearchResponse>(
                  this, METHODID_PATCH_ANNOTATIONS_SEARCHES)))
          .addMethod(
            getPostAnnotationsSearchesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostAnnotationsSearchesRequest,
                com.clarifai.grpc.api.MultiSearchResponse>(
                  this, METHODID_POST_ANNOTATIONS_SEARCHES)))
          .addMethod(
            getGetInputCountMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetInputCountRequest,
                com.clarifai.grpc.api.SingleInputCountResponse>(
                  this, METHODID_GET_INPUT_COUNT)))
          .addMethod(
            getStreamInputsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.StreamInputsRequest,
                com.clarifai.grpc.api.MultiInputResponse>(
                  this, METHODID_STREAM_INPUTS)))
          .addMethod(
            getGetInputSamplesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetInputSamplesRequest,
                com.clarifai.grpc.api.MultiInputAnnotationResponse>(
                  this, METHODID_GET_INPUT_SAMPLES)))
          .addMethod(
            getGetInputMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetInputRequest,
                com.clarifai.grpc.api.SingleInputResponse>(
                  this, METHODID_GET_INPUT)))
          .addMethod(
            getListInputsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListInputsRequest,
                com.clarifai.grpc.api.MultiInputResponse>(
                  this, METHODID_LIST_INPUTS)))
          .addMethod(
            getPostInputsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostInputsRequest,
                com.clarifai.grpc.api.MultiInputResponse>(
                  this, METHODID_POST_INPUTS)))
          .addMethod(
            getPatchInputsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchInputsRequest,
                com.clarifai.grpc.api.MultiInputResponse>(
                  this, METHODID_PATCH_INPUTS)))
          .addMethod(
            getDeleteInputMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteInputRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_INPUT)))
          .addMethod(
            getDeleteInputsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteInputsRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_INPUTS)))
          .addMethod(
            getPatchInputsSearchesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchInputsSearchesRequest,
                com.clarifai.grpc.api.MultiSearchResponse>(
                  this, METHODID_PATCH_INPUTS_SEARCHES)))
          .addMethod(
            getPostInputsSearchesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostInputsSearchesRequest,
                com.clarifai.grpc.api.MultiSearchResponse>(
                  this, METHODID_POST_INPUTS_SEARCHES)))
          .addMethod(
            getPostModelOutputsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostModelOutputsRequest,
                com.clarifai.grpc.api.MultiOutputResponse>(
                  this, METHODID_POST_MODEL_OUTPUTS)))
          .addMethod(
            getListDatasetsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListDatasetsRequest,
                com.clarifai.grpc.api.MultiDatasetResponse>(
                  this, METHODID_LIST_DATASETS)))
          .addMethod(
            getGetDatasetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetDatasetRequest,
                com.clarifai.grpc.api.SingleDatasetResponse>(
                  this, METHODID_GET_DATASET)))
          .addMethod(
            getPostDatasetsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostDatasetsRequest,
                com.clarifai.grpc.api.MultiDatasetResponse>(
                  this, METHODID_POST_DATASETS)))
          .addMethod(
            getPatchDatasetsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchDatasetsRequest,
                com.clarifai.grpc.api.MultiDatasetResponse>(
                  this, METHODID_PATCH_DATASETS)))
          .addMethod(
            getPatchDatasetIdsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchDatasetIdsRequest,
                com.clarifai.grpc.api.MultiDatasetResponse>(
                  this, METHODID_PATCH_DATASET_IDS)))
          .addMethod(
            getDeleteDatasetsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteDatasetsRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_DATASETS)))
          .addMethod(
            getListDatasetInputsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListDatasetInputsRequest,
                com.clarifai.grpc.api.MultiDatasetInputResponse>(
                  this, METHODID_LIST_DATASET_INPUTS)))
          .addMethod(
            getGetDatasetInputMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetDatasetInputRequest,
                com.clarifai.grpc.api.SingleDatasetInputResponse>(
                  this, METHODID_GET_DATASET_INPUT)))
          .addMethod(
            getPostDatasetInputsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostDatasetInputsRequest,
                com.clarifai.grpc.api.MultiDatasetInputResponse>(
                  this, METHODID_POST_DATASET_INPUTS)))
          .addMethod(
            getDeleteDatasetInputsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteDatasetInputsRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_DATASET_INPUTS)))
          .addMethod(
            getListDatasetVersionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListDatasetVersionsRequest,
                com.clarifai.grpc.api.MultiDatasetVersionResponse>(
                  this, METHODID_LIST_DATASET_VERSIONS)))
          .addMethod(
            getGetDatasetVersionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetDatasetVersionRequest,
                com.clarifai.grpc.api.SingleDatasetVersionResponse>(
                  this, METHODID_GET_DATASET_VERSION)))
          .addMethod(
            getListDatasetVersionMetricsGroupsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListDatasetVersionMetricsGroupsRequest,
                com.clarifai.grpc.api.MultiDatasetVersionMetricsGroupResponse>(
                  this, METHODID_LIST_DATASET_VERSION_METRICS_GROUPS)))
          .addMethod(
            getPostDatasetVersionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostDatasetVersionsRequest,
                com.clarifai.grpc.api.MultiDatasetVersionResponse>(
                  this, METHODID_POST_DATASET_VERSIONS)))
          .addMethod(
            getPatchDatasetVersionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchDatasetVersionsRequest,
                com.clarifai.grpc.api.MultiDatasetVersionResponse>(
                  this, METHODID_PATCH_DATASET_VERSIONS)))
          .addMethod(
            getDeleteDatasetVersionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteDatasetVersionsRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_DATASET_VERSIONS)))
          .addMethod(
            getPutDatasetVersionExportsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PutDatasetVersionExportsRequest,
                com.clarifai.grpc.api.MultiDatasetVersionExportResponse>(
                  this, METHODID_PUT_DATASET_VERSION_EXPORTS)))
          .addMethod(
            getGetModelTypeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetModelTypeRequest,
                com.clarifai.grpc.api.SingleModelTypeResponse>(
                  this, METHODID_GET_MODEL_TYPE)))
          .addMethod(
            getListOpenSourceLicensesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListOpenSourceLicensesRequest,
                com.clarifai.grpc.api.ListOpenSourceLicensesResponse>(
                  this, METHODID_LIST_OPEN_SOURCE_LICENSES)))
          .addMethod(
            getListModelTypesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListModelTypesRequest,
                com.clarifai.grpc.api.MultiModelTypeResponse>(
                  this, METHODID_LIST_MODEL_TYPES)))
          .addMethod(
            getGetModelMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetModelRequest,
                com.clarifai.grpc.api.SingleModelResponse>(
                  this, METHODID_GET_MODEL)))
          .addMethod(
            getGetModelOutputInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetModelRequest,
                com.clarifai.grpc.api.SingleModelResponse>(
                  this, METHODID_GET_MODEL_OUTPUT_INFO)))
          .addMethod(
            getListModelsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListModelsRequest,
                com.clarifai.grpc.api.MultiModelResponse>(
                  this, METHODID_LIST_MODELS)))
          .addMethod(
            getPostModelsSearchesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostModelsSearchesRequest,
                com.clarifai.grpc.api.MultiModelResponse>(
                  this, METHODID_POST_MODELS_SEARCHES)))
          .addMethod(
            getPostModelsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostModelsRequest,
                com.clarifai.grpc.api.SingleModelResponse>(
                  this, METHODID_POST_MODELS)))
          .addMethod(
            getPatchModelsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchModelsRequest,
                com.clarifai.grpc.api.MultiModelResponse>(
                  this, METHODID_PATCH_MODELS)))
          .addMethod(
            getPatchModelIdsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchModelIdsRequest,
                com.clarifai.grpc.api.MultiModelResponse>(
                  this, METHODID_PATCH_MODEL_IDS)))
          .addMethod(
            getDeleteModelMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteModelRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_MODEL)))
          .addMethod(
            getDeleteModelsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteModelsRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_MODELS)))
          .addMethod(
            getPatchModelCheckConsentsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchModelCheckConsentsRequest,
                com.clarifai.grpc.api.MultiModelCheckConsentResponse>(
                  this, METHODID_PATCH_MODEL_CHECK_CONSENTS)))
          .addMethod(
            getPatchModelToolkitsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchModelToolkitsRequest,
                com.clarifai.grpc.api.MultiModelToolkitResponse>(
                  this, METHODID_PATCH_MODEL_TOOLKITS)))
          .addMethod(
            getPatchModelUseCasesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchModelUseCasesRequest,
                com.clarifai.grpc.api.MultiModelUseCaseResponse>(
                  this, METHODID_PATCH_MODEL_USE_CASES)))
          .addMethod(
            getPatchModelLanguagesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchModelLanguagesRequest,
                com.clarifai.grpc.api.MultiModelLanguageResponse>(
                  this, METHODID_PATCH_MODEL_LANGUAGES)))
          .addMethod(
            getListModelInputsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListModelInputsRequest,
                com.clarifai.grpc.api.MultiInputResponse>(
                  this, METHODID_LIST_MODEL_INPUTS)))
          .addMethod(
            getGetModelVersionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetModelVersionRequest,
                com.clarifai.grpc.api.SingleModelVersionResponse>(
                  this, METHODID_GET_MODEL_VERSION)))
          .addMethod(
            getListModelVersionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListModelVersionsRequest,
                com.clarifai.grpc.api.MultiModelVersionResponse>(
                  this, METHODID_LIST_MODEL_VERSIONS)))
          .addMethod(
            getPostWorkflowVersionsUnPublishMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_POST_WORKFLOW_VERSIONS_UN_PUBLISH)))
          .addMethod(
            getPostWorkflowVersionsPublishMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostWorkflowVersionsPublishRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_POST_WORKFLOW_VERSIONS_PUBLISH)))
          .addMethod(
            getPostModelVersionsPublishMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostModelVersionsPublishRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_POST_MODEL_VERSIONS_PUBLISH)))
          .addMethod(
            getPostModelVersionsUnPublishMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostModelVersionsUnPublishRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_POST_MODEL_VERSIONS_UN_PUBLISH)))
          .addMethod(
            getPostModelVersionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostModelVersionsRequest,
                com.clarifai.grpc.api.SingleModelResponse>(
                  this, METHODID_POST_MODEL_VERSIONS)))
          .addMethod(
            getPatchModelVersionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchModelVersionsRequest,
                com.clarifai.grpc.api.MultiModelVersionResponse>(
                  this, METHODID_PATCH_MODEL_VERSIONS)))
          .addMethod(
            getDeleteModelVersionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteModelVersionRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_MODEL_VERSION)))
          .addMethod(
            getGetModelVersionMetricsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetModelVersionMetricsRequest,
                com.clarifai.grpc.api.SingleModelVersionResponse>(
                  this, METHODID_GET_MODEL_VERSION_METRICS)))
          .addMethod(
            getPostModelVersionMetricsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostModelVersionMetricsRequest,
                com.clarifai.grpc.api.SingleModelVersionResponse>(
                  this, METHODID_POST_MODEL_VERSION_METRICS)))
          .addMethod(
            getPostModelVersionEvaluationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostModelVersionEvaluationsRequest,
                com.clarifai.grpc.api.MultiEvalMetricsResponse>(
                  this, METHODID_POST_MODEL_VERSION_EVALUATIONS)))
          .addMethod(
            getListModelVersionEvaluationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListModelVersionEvaluationsRequest,
                com.clarifai.grpc.api.MultiEvalMetricsResponse>(
                  this, METHODID_LIST_MODEL_VERSION_EVALUATIONS)))
          .addMethod(
            getGetModelVersionEvaluationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetModelVersionEvaluationRequest,
                com.clarifai.grpc.api.SingleEvalMetricsResponse>(
                  this, METHODID_GET_MODEL_VERSION_EVALUATION)))
          .addMethod(
            getListModelReferencesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListModelReferencesRequest,
                com.clarifai.grpc.api.MultiModelReferenceResponse>(
                  this, METHODID_LIST_MODEL_REFERENCES)))
          .addMethod(
            getGetModelVersionInputExampleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetModelVersionInputExampleRequest,
                com.clarifai.grpc.api.SingleModelVersionInputExampleResponse>(
                  this, METHODID_GET_MODEL_VERSION_INPUT_EXAMPLE)))
          .addMethod(
            getListModelVersionInputExamplesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListModelVersionInputExamplesRequest,
                com.clarifai.grpc.api.MultiModelVersionInputExampleResponse>(
                  this, METHODID_LIST_MODEL_VERSION_INPUT_EXAMPLES)))
          .addMethod(
            getGetWorkflowMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetWorkflowRequest,
                com.clarifai.grpc.api.SingleWorkflowResponse>(
                  this, METHODID_GET_WORKFLOW)))
          .addMethod(
            getListWorkflowsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListWorkflowsRequest,
                com.clarifai.grpc.api.MultiWorkflowResponse>(
                  this, METHODID_LIST_WORKFLOWS)))
          .addMethod(
            getPostWorkflowsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostWorkflowsRequest,
                com.clarifai.grpc.api.MultiWorkflowResponse>(
                  this, METHODID_POST_WORKFLOWS)))
          .addMethod(
            getPatchWorkflowsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchWorkflowsRequest,
                com.clarifai.grpc.api.MultiWorkflowResponse>(
                  this, METHODID_PATCH_WORKFLOWS)))
          .addMethod(
            getPatchWorkflowIdsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchWorkflowIdsRequest,
                com.clarifai.grpc.api.MultiWorkflowResponse>(
                  this, METHODID_PATCH_WORKFLOW_IDS)))
          .addMethod(
            getDeleteWorkflowMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteWorkflowRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_WORKFLOW)))
          .addMethod(
            getDeleteWorkflowsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteWorkflowsRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_WORKFLOWS)))
          .addMethod(
            getPostWorkflowResultsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostWorkflowResultsRequest,
                com.clarifai.grpc.api.PostWorkflowResultsResponse>(
                  this, METHODID_POST_WORKFLOW_RESULTS)))
          .addMethod(
            getPostWorkflowResultsSimilarityMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostWorkflowResultsSimilarityRequest,
                com.clarifai.grpc.api.PostWorkflowResultsSimilarityResponse>(
                  this, METHODID_POST_WORKFLOW_RESULTS_SIMILARITY)))
          .addMethod(
            getListWorkflowVersionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListWorkflowVersionsRequest,
                com.clarifai.grpc.api.MultiWorkflowVersionResponse>(
                  this, METHODID_LIST_WORKFLOW_VERSIONS)))
          .addMethod(
            getGetWorkflowVersionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetWorkflowVersionRequest,
                com.clarifai.grpc.api.SingleWorkflowVersionResponse>(
                  this, METHODID_GET_WORKFLOW_VERSION)))
          .addMethod(
            getDeleteWorkflowVersionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteWorkflowVersionsRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_WORKFLOW_VERSIONS)))
          .addMethod(
            getPatchWorkflowVersionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchWorkflowVersionsRequest,
                com.clarifai.grpc.api.MultiWorkflowVersionResponse>(
                  this, METHODID_PATCH_WORKFLOW_VERSIONS)))
          .addMethod(
            getGetKeyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetKeyRequest,
                com.clarifai.grpc.api.SingleKeyResponse>(
                  this, METHODID_GET_KEY)))
          .addMethod(
            getListKeysMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListKeysRequest,
                com.clarifai.grpc.api.MultiKeyResponse>(
                  this, METHODID_LIST_KEYS)))
          .addMethod(
            getListAppKeysMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListAppKeysRequest,
                com.clarifai.grpc.api.MultiKeyResponse>(
                  this, METHODID_LIST_APP_KEYS)))
          .addMethod(
            getDeleteKeyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteKeyRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_KEY)))
          .addMethod(
            getPostKeysMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostKeysRequest,
                com.clarifai.grpc.api.MultiKeyResponse>(
                  this, METHODID_POST_KEYS)))
          .addMethod(
            getPatchKeysMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchKeysRequest,
                com.clarifai.grpc.api.MultiKeyResponse>(
                  this, METHODID_PATCH_KEYS)))
          .addMethod(
            getMyScopesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.MyScopesRequest,
                com.clarifai.grpc.api.MultiScopeResponse>(
                  this, METHODID_MY_SCOPES)))
          .addMethod(
            getMyScopesUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.MyScopesUserRequest,
                com.clarifai.grpc.api.MultiScopeUserResponse>(
                  this, METHODID_MY_SCOPES_USER)))
          .addMethod(
            getMyScopesRootMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.MyScopesRootRequest,
                com.clarifai.grpc.api.MultiScopeRootResponse>(
                  this, METHODID_MY_SCOPES_ROOT)))
          .addMethod(
            getListScopesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListScopesRequest,
                com.clarifai.grpc.api.MultiScopeDepsResponse>(
                  this, METHODID_LIST_SCOPES)))
          .addMethod(
            getGetAppMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetAppRequest,
                com.clarifai.grpc.api.SingleAppResponse>(
                  this, METHODID_GET_APP)))
          .addMethod(
            getListAppsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListAppsRequest,
                com.clarifai.grpc.api.MultiAppResponse>(
                  this, METHODID_LIST_APPS)))
          .addMethod(
            getDeleteAppMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteAppRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_APP)))
          .addMethod(
            getPostAppsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostAppsRequest,
                com.clarifai.grpc.api.MultiAppResponse>(
                  this, METHODID_POST_APPS)))
          .addMethod(
            getPatchAppsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchAppsRequest,
                com.clarifai.grpc.api.MultiAppResponse>(
                  this, METHODID_PATCH_APPS)))
          .addMethod(
            getPatchAppsIdsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchAppsIdsRequest,
                com.clarifai.grpc.api.MultiAppResponse>(
                  this, METHODID_PATCH_APPS_IDS)))
          .addMethod(
            getPatchAppMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchAppRequest,
                com.clarifai.grpc.api.SingleAppResponse>(
                  this, METHODID_PATCH_APP)))
          .addMethod(
            getPostAppsSearchesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostAppsSearchesRequest,
                com.clarifai.grpc.api.MultiAppResponse>(
                  this, METHODID_POST_APPS_SEARCHES)))
          .addMethod(
            getPostValidatePasswordMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostValidatePasswordRequest,
                com.clarifai.grpc.api.SinglePasswordValidationResponse>(
                  this, METHODID_POST_VALIDATE_PASSWORD)))
          .addMethod(
            getGetSearchMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetSearchRequest,
                com.clarifai.grpc.api.SingleSearchResponse>(
                  this, METHODID_GET_SEARCH)))
          .addMethod(
            getListSearchesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListSearchesRequest,
                com.clarifai.grpc.api.MultiSearchResponse>(
                  this, METHODID_LIST_SEARCHES)))
          .addMethod(
            getPatchSearchesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchSearchesRequest,
                com.clarifai.grpc.api.MultiSearchResponse>(
                  this, METHODID_PATCH_SEARCHES)))
          .addMethod(
            getPostSearchesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostSearchesRequest,
                com.clarifai.grpc.api.MultiSearchResponse>(
                  this, METHODID_POST_SEARCHES)))
          .addMethod(
            getPostSearchesByIDMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostSearchesByIDRequest,
                com.clarifai.grpc.api.MultiSearchResponse>(
                  this, METHODID_POST_SEARCHES_BY_ID)))
          .addMethod(
            getPostAnnotationSearchMetricsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostAnnotationSearchMetricsRequest,
                com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse>(
                  this, METHODID_POST_ANNOTATION_SEARCH_METRICS)))
          .addMethod(
            getGetAnnotationSearchMetricsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetAnnotationSearchMetricsRequest,
                com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse>(
                  this, METHODID_GET_ANNOTATION_SEARCH_METRICS)))
          .addMethod(
            getListAnnotationSearchMetricsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListAnnotationSearchMetricsRequest,
                com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse>(
                  this, METHODID_LIST_ANNOTATION_SEARCH_METRICS)))
          .addMethod(
            getDeleteAnnotationSearchMetricsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteAnnotationSearchMetricsRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_ANNOTATION_SEARCH_METRICS)))
          .addMethod(
            getDeleteSearchMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteSearchRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_SEARCH)))
          .addMethod(
            getListAnnotationFiltersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListAnnotationFiltersRequest,
                com.clarifai.grpc.api.MultiAnnotationFilterResponse>(
                  this, METHODID_LIST_ANNOTATION_FILTERS)))
          .addMethod(
            getGetAnnotationFilterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetAnnotationFilterRequest,
                com.clarifai.grpc.api.SingleAnnotationFilterResponse>(
                  this, METHODID_GET_ANNOTATION_FILTER)))
          .addMethod(
            getPostAnnotationFiltersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostAnnotationFiltersRequest,
                com.clarifai.grpc.api.MultiAnnotationFilterResponse>(
                  this, METHODID_POST_ANNOTATION_FILTERS)))
          .addMethod(
            getPatchAnnotationFiltersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchAnnotationFiltersRequest,
                com.clarifai.grpc.api.MultiAnnotationFilterResponse>(
                  this, METHODID_PATCH_ANNOTATION_FILTERS)))
          .addMethod(
            getDeleteAnnotationFiltersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteAnnotationFiltersRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_ANNOTATION_FILTERS)))
          .addMethod(
            getListStatusCodesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListStatusCodesRequest,
                com.clarifai.grpc.api.MultiStatusCodeResponse>(
                  this, METHODID_LIST_STATUS_CODES)))
          .addMethod(
            getGetStatusCodeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetStatusCodeRequest,
                com.clarifai.grpc.api.SingleStatusCodeResponse>(
                  this, METHODID_GET_STATUS_CODE)))
          .addMethod(
            getListCollaboratorsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListCollaboratorsRequest,
                com.clarifai.grpc.api.MultiCollaboratorsResponse>(
                  this, METHODID_LIST_COLLABORATORS)))
          .addMethod(
            getPostCollaboratorsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostCollaboratorsRequest,
                com.clarifai.grpc.api.MultiCollaboratorsResponse>(
                  this, METHODID_POST_COLLABORATORS)))
          .addMethod(
            getPatchCollaboratorsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchCollaboratorsRequest,
                com.clarifai.grpc.api.MultiCollaboratorsResponse>(
                  this, METHODID_PATCH_COLLABORATORS)))
          .addMethod(
            getDeleteCollaboratorsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteCollaboratorsRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_COLLABORATORS)))
          .addMethod(
            getListCollaborationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListCollaborationsRequest,
                com.clarifai.grpc.api.MultiCollaborationsResponse>(
                  this, METHODID_LIST_COLLABORATIONS)))
          .addMethod(
            getPostAppDuplicationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostAppDuplicationsRequest,
                com.clarifai.grpc.api.MultiAppDuplicationsResponse>(
                  this, METHODID_POST_APP_DUPLICATIONS)))
          .addMethod(
            getListAppDuplicationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListAppDuplicationsRequest,
                com.clarifai.grpc.api.MultiAppDuplicationsResponse>(
                  this, METHODID_LIST_APP_DUPLICATIONS)))
          .addMethod(
            getGetAppDuplicationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetAppDuplicationRequest,
                com.clarifai.grpc.api.SingleAppDuplicationResponse>(
                  this, METHODID_GET_APP_DUPLICATION)))
          .addMethod(
            getPostTasksMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostTasksRequest,
                com.clarifai.grpc.api.MultiTaskResponse>(
                  this, METHODID_POST_TASKS)))
          .addMethod(
            getGetTaskAnnotationCountMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetTaskCountRequest,
                com.clarifai.grpc.api.SingleTaskCountResponse>(
                  this, METHODID_GET_TASK_ANNOTATION_COUNT)))
          .addMethod(
            getGetTaskInputCountMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetTaskCountRequest,
                com.clarifai.grpc.api.SingleTaskCountResponse>(
                  this, METHODID_GET_TASK_INPUT_COUNT)))
          .addMethod(
            getGetTaskMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetTaskRequest,
                com.clarifai.grpc.api.SingleTaskResponse>(
                  this, METHODID_GET_TASK)))
          .addMethod(
            getListTasksMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListTasksRequest,
                com.clarifai.grpc.api.MultiTaskResponse>(
                  this, METHODID_LIST_TASKS)))
          .addMethod(
            getPatchTasksMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchTasksRequest,
                com.clarifai.grpc.api.MultiTaskResponse>(
                  this, METHODID_PATCH_TASKS)))
          .addMethod(
            getDeleteTasksMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteTasksRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_TASKS)))
          .addMethod(
            getPostLabelOrdersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostLabelOrdersRequest,
                com.clarifai.grpc.api.MultiLabelOrderResponse>(
                  this, METHODID_POST_LABEL_ORDERS)))
          .addMethod(
            getGetLabelOrderMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetLabelOrderRequest,
                com.clarifai.grpc.api.SingleLabelOrderResponse>(
                  this, METHODID_GET_LABEL_ORDER)))
          .addMethod(
            getListLabelOrdersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListLabelOrdersRequest,
                com.clarifai.grpc.api.MultiLabelOrderResponse>(
                  this, METHODID_LIST_LABEL_ORDERS)))
          .addMethod(
            getPatchLabelOrdersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchLabelOrdersRequest,
                com.clarifai.grpc.api.MultiLabelOrderResponse>(
                  this, METHODID_PATCH_LABEL_ORDERS)))
          .addMethod(
            getDeleteLabelOrdersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteLabelOrdersRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_LABEL_ORDERS)))
          .addMethod(
            getPostCollectorsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostCollectorsRequest,
                com.clarifai.grpc.api.MultiCollectorResponse>(
                  this, METHODID_POST_COLLECTORS)))
          .addMethod(
            getGetCollectorMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetCollectorRequest,
                com.clarifai.grpc.api.SingleCollectorResponse>(
                  this, METHODID_GET_COLLECTOR)))
          .addMethod(
            getListCollectorsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListCollectorsRequest,
                com.clarifai.grpc.api.MultiCollectorResponse>(
                  this, METHODID_LIST_COLLECTORS)))
          .addMethod(
            getPatchCollectorsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchCollectorsRequest,
                com.clarifai.grpc.api.MultiCollectorResponse>(
                  this, METHODID_PATCH_COLLECTORS)))
          .addMethod(
            getDeleteCollectorsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteCollectorsRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_COLLECTORS)))
          .addMethod(
            getPostStatValuesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostStatValuesRequest,
                com.clarifai.grpc.api.MultiStatValueResponse>(
                  this, METHODID_POST_STAT_VALUES)))
          .addMethod(
            getPostStatValuesAggregateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostStatValuesAggregateRequest,
                com.clarifai.grpc.api.MultiStatValueAggregateResponse>(
                  this, METHODID_POST_STAT_VALUES_AGGREGATE)))
          .addMethod(
            getPostTrendingMetricsViewMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostTrendingMetricsViewRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_POST_TRENDING_METRICS_VIEW)))
          .addMethod(
            getListTrendingMetricsViewsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListTrendingMetricsViewsRequest,
                com.clarifai.grpc.api.MultiTrendingMetricsViewResponse>(
                  this, METHODID_LIST_TRENDING_METRICS_VIEWS)))
          .addMethod(
            getGetModuleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetModuleRequest,
                com.clarifai.grpc.api.SingleModuleResponse>(
                  this, METHODID_GET_MODULE)))
          .addMethod(
            getListModulesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListModulesRequest,
                com.clarifai.grpc.api.MultiModuleResponse>(
                  this, METHODID_LIST_MODULES)))
          .addMethod(
            getPostModulesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostModulesRequest,
                com.clarifai.grpc.api.MultiModuleResponse>(
                  this, METHODID_POST_MODULES)))
          .addMethod(
            getPatchModulesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PatchModulesRequest,
                com.clarifai.grpc.api.MultiModuleResponse>(
                  this, METHODID_PATCH_MODULES)))
          .addMethod(
            getDeleteModulesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteModulesRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_MODULES)))
          .addMethod(
            getGetModuleVersionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetModuleVersionRequest,
                com.clarifai.grpc.api.SingleModuleVersionResponse>(
                  this, METHODID_GET_MODULE_VERSION)))
          .addMethod(
            getListModuleVersionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListModuleVersionsRequest,
                com.clarifai.grpc.api.MultiModuleVersionResponse>(
                  this, METHODID_LIST_MODULE_VERSIONS)))
          .addMethod(
            getPostModuleVersionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostModuleVersionsRequest,
                com.clarifai.grpc.api.MultiModuleVersionResponse>(
                  this, METHODID_POST_MODULE_VERSIONS)))
          .addMethod(
            getDeleteModuleVersionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteModuleVersionsRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_MODULE_VERSIONS)))
          .addMethod(
            getGetInstalledModuleVersionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetInstalledModuleVersionRequest,
                com.clarifai.grpc.api.SingleInstalledModuleVersionResponse>(
                  this, METHODID_GET_INSTALLED_MODULE_VERSION)))
          .addMethod(
            getListInstalledModuleVersionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListInstalledModuleVersionsRequest,
                com.clarifai.grpc.api.MultiInstalledModuleVersionResponse>(
                  this, METHODID_LIST_INSTALLED_MODULE_VERSIONS)))
          .addMethod(
            getPostInstalledModuleVersionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostInstalledModuleVersionsRequest,
                com.clarifai.grpc.api.MultiInstalledModuleVersionResponse>(
                  this, METHODID_POST_INSTALLED_MODULE_VERSIONS)))
          .addMethod(
            getDeleteInstalledModuleVersionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteInstalledModuleVersionsRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_INSTALLED_MODULE_VERSIONS)))
          .addMethod(
            getPostInstalledModuleVersionsKeyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostInstalledModuleVersionsKeyRequest,
                com.clarifai.grpc.api.SingleKeyResponse>(
                  this, METHODID_POST_INSTALLED_MODULE_VERSIONS_KEY)))
          .addMethod(
            getPostBulkOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostBulkOperationsRequest,
                com.clarifai.grpc.api.MultiBulkOperationsResponse>(
                  this, METHODID_POST_BULK_OPERATIONS)))
          .addMethod(
            getListBulkOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListBulkOperationsRequest,
                com.clarifai.grpc.api.MultiBulkOperationsResponse>(
                  this, METHODID_LIST_BULK_OPERATIONS)))
          .addMethod(
            getGetBulkOperationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetBulkOperationRequest,
                com.clarifai.grpc.api.SingleBulkOperationsResponse>(
                  this, METHODID_GET_BULK_OPERATION)))
          .addMethod(
            getCancelBulkOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.CancelBulkOperationRequest,
                com.clarifai.grpc.api.MultiBulkOperationsResponse>(
                  this, METHODID_CANCEL_BULK_OPERATIONS)))
          .addMethod(
            getDeleteBulkOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteBulkOperationRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_BULK_OPERATIONS)))
          .addMethod(
            getGetDatasetInputsSearchAddJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetDatasetInputsSearchAddJobRequest,
                com.clarifai.grpc.api.SingleDatasetInputsSearchAddJobResponse>(
                  this, METHODID_GET_DATASET_INPUTS_SEARCH_ADD_JOB)))
          .addMethod(
            getListInputsAddJobsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListInputsAddJobsRequest,
                com.clarifai.grpc.api.MultiInputsAddJobResponse>(
                  this, METHODID_LIST_INPUTS_ADD_JOBS)))
          .addMethod(
            getGetInputsAddJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetInputsAddJobRequest,
                com.clarifai.grpc.api.SingleInputsAddJobResponse>(
                  this, METHODID_GET_INPUTS_ADD_JOB)))
          .addMethod(
            getPostUploadsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostUploadsRequest,
                com.clarifai.grpc.api.MultiUploadResponse>(
                  this, METHODID_POST_UPLOADS)))
          .addMethod(
            getPutUploadContentPartsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PutUploadContentPartsRequest,
                com.clarifai.grpc.api.SingleUploadResponse>(
                  this, METHODID_PUT_UPLOAD_CONTENT_PARTS)))
          .addMethod(
            getGetUploadMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetUploadRequest,
                com.clarifai.grpc.api.SingleUploadResponse>(
                  this, METHODID_GET_UPLOAD)))
          .addMethod(
            getListUploadsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListUploadsRequest,
                com.clarifai.grpc.api.MultiUploadResponse>(
                  this, METHODID_LIST_UPLOADS)))
          .addMethod(
            getDeleteUploadsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.DeleteUploadsRequest,
                com.clarifai.grpc.api.status.BaseResponse>(
                  this, METHODID_DELETE_UPLOADS)))
          .addMethod(
            getPostInputsDataSourcesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostInputsDataSourcesRequest,
                com.clarifai.grpc.api.MultiInputsAddJobResponse>(
                  this, METHODID_POST_INPUTS_DATA_SOURCES)))
          .addMethod(
            getGetInputsExtractionJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetInputsExtractionJobRequest,
                com.clarifai.grpc.api.SingleInputsExtractionJobResponse>(
                  this, METHODID_GET_INPUTS_EXTRACTION_JOB)))
          .addMethod(
            getListInputsExtractionJobsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.ListInputsExtractionJobsRequest,
                com.clarifai.grpc.api.MultiInputsExtractionJobResponse>(
                  this, METHODID_LIST_INPUTS_EXTRACTION_JOBS)))
          .addMethod(
            getCancelInputsExtractionJobsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.CancelInputsExtractionJobsRequest,
                com.clarifai.grpc.api.MultiInputsExtractionJobResponse>(
                  this, METHODID_CANCEL_INPUTS_EXTRACTION_JOBS)))
          .addMethod(
            getPostInputsUploadsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostInputsUploadsRequest,
                com.clarifai.grpc.api.MultiInputsAddJobResponse>(
                  this, METHODID_POST_INPUTS_UPLOADS)))
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListConceptRelationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Post concept relations to create relations between concepts in the platform.
     * </pre>
     */
    public void postConceptRelations(com.clarifai.grpc.api.PostConceptRelationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptRelationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostConceptRelationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Post concept relations to create relations between concepts in the platform.
     * </pre>
     */
    public void deleteConceptRelations(com.clarifai.grpc.api.DeleteConceptRelationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteConceptRelationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all the concepts with their positive and negative counts
     * </pre>
     */
    public void getConceptCounts(com.clarifai.grpc.api.GetConceptCountsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptCountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetConceptCountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific concept from an app.
     * </pre>
     */
    public void getConcept(com.clarifai.grpc.api.GetConceptRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleConceptResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetConceptMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all the concepts.
     * </pre>
     */
    public void listConcepts(com.clarifai.grpc.api.ListConceptsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListConceptsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List models concepts.
     * </pre>
     */
    public void listModelConcepts(com.clarifai.grpc.api.ListModelConceptsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListModelConceptsMethod(), getCallOptions()), request, responseObserver);
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostConceptsSearchesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add a concept to an app.
     * </pre>
     */
    public void postConcepts(com.clarifai.grpc.api.PostConceptsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostConceptsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Patch one or more concepts.
     * </pre>
     */
    public void patchConcepts(com.clarifai.grpc.api.PatchConceptsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPatchConceptsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific concept from an app.
     * </pre>
     */
    public void getConceptLanguage(com.clarifai.grpc.api.GetConceptLanguageRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleConceptLanguageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetConceptLanguageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List the concept in all the translated languages.
     * </pre>
     */
    public void listConceptLanguages(com.clarifai.grpc.api.ListConceptLanguagesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptLanguageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListConceptLanguagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add a new translation for this concept.
     * </pre>
     */
    public void postConceptLanguages(com.clarifai.grpc.api.PostConceptLanguagesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptLanguageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPatchConceptLanguagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all domain graphs.
     * </pre>
     */
    public void listKnowledgeGraphs(com.clarifai.grpc.api.ListKnowledgeGraphsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiKnowledgeGraphResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListKnowledgeGraphsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Post domain graphs.
     * </pre>
     */
    public void postKnowledgeGraphs(com.clarifai.grpc.api.PostKnowledgeGraphsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiKnowledgeGraphResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostKnowledgeGraphsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Start concept mapping jobs.
     * </pre>
     */
    public void postConceptMappingJobs(com.clarifai.grpc.api.PostConceptMappingJobsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiConceptMappingJobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostConceptMappingJobsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific annotation from an app.
     * </pre>
     */
    public void getAnnotation(com.clarifai.grpc.api.GetAnnotationRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleAnnotationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnnotationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all the annotation.
     * </pre>
     */
    public void listAnnotations(com.clarifai.grpc.api.ListAnnotationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAnnotationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAnnotationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Post annotations.
     * </pre>
     */
    public void postAnnotations(com.clarifai.grpc.api.PostAnnotationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAnnotationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostAnnotationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Patch one or more annotations.
     * </pre>
     */
    public void patchAnnotations(com.clarifai.grpc.api.PatchAnnotationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAnnotationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPatchAnnotationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Patch annotations status by worker id and task id.
     * </pre>
     */
    public void patchAnnotationsStatus(com.clarifai.grpc.api.PatchAnnotationsStatusRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.PatchAnnotationsStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPatchAnnotationsStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a single annotation.
     * </pre>
     */
    public void deleteAnnotation(com.clarifai.grpc.api.DeleteAnnotationRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAnnotationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete multiple annotations in one request.
     * </pre>
     */
    public void deleteAnnotations(com.clarifai.grpc.api.DeleteAnnotationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAnnotationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Patch saved annotations searches by ids.
     * </pre>
     */
    public void patchAnnotationsSearches(com.clarifai.grpc.api.PatchAnnotationsSearchesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiSearchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPatchAnnotationsSearchesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Execute a search over annotations
     * </pre>
     */
    public void postAnnotationsSearches(com.clarifai.grpc.api.PostAnnotationsSearchesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiSearchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostAnnotationsSearchesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get input count per status.
     * </pre>
     */
    public void getInputCount(com.clarifai.grpc.api.GetInputCountRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleInputCountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetInputCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Streams all the inputs starting from oldest assets.
     * </pre>
     */
    public void streamInputs(com.clarifai.grpc.api.StreamInputsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStreamInputsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific input from an app.
     * </pre>
     */
    public void getInputSamples(com.clarifai.grpc.api.GetInputSamplesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputAnnotationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetInputSamplesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific input from an app.
     * </pre>
     */
    public void getInput(com.clarifai.grpc.api.GetInputRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleInputResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetInputMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all the inputs.
     * </pre>
     */
    public void listInputs(com.clarifai.grpc.api.ListInputsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostInputsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Patch one or more inputs.
     * </pre>
     */
    public void patchInputs(com.clarifai.grpc.api.PatchInputsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPatchInputsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a single input asynchronously.
     * </pre>
     */
    public void deleteInput(com.clarifai.grpc.api.DeleteInputRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteInputsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Patch saved inputs searches by ids.
     * </pre>
     */
    public void patchInputsSearches(com.clarifai.grpc.api.PatchInputsSearchesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiSearchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPatchInputsSearchesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Execute a search over inputs
     * </pre>
     */
    public void postInputsSearches(com.clarifai.grpc.api.PostInputsSearchesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiSearchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostInputsSearchesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get predicted outputs from the model.
     * </pre>
     */
    public void postModelOutputs(com.clarifai.grpc.api.PostModelOutputsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiOutputResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostModelOutputsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all the datasets.
     * </pre>
     */
    public void listDatasets(com.clarifai.grpc.api.ListDatasetsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiDatasetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDatasetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific dataset.
     * </pre>
     */
    public void getDataset(com.clarifai.grpc.api.GetDatasetRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleDatasetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDatasetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add datasets to an app.
     * The process is atomic, i.e. either all or no datasets are added.
     * If there is an error for one dataset,
     * the process will stop, revert the transaction and return the error.
     * </pre>
     */
    public void postDatasets(com.clarifai.grpc.api.PostDatasetsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiDatasetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostDatasetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Patch one or more datasets.
     * The process is atomic, i.e. either all or no datasets are patched.
     * If there is an error for one dataset,
     * the process will stop, revert the transaction and return the error.
     * </pre>
     */
    public void patchDatasets(com.clarifai.grpc.api.PatchDatasetsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiDatasetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPatchDatasetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Patch one or more dataset ids.
     * </pre>
     */
    public void patchDatasetIds(com.clarifai.grpc.api.PatchDatasetIdsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiDatasetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPatchDatasetIdsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete one or more datasets in a single request.
     * </pre>
     */
    public void deleteDatasets(com.clarifai.grpc.api.DeleteDatasetsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDatasetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all the dataset inputs in a dataset.
     * </pre>
     */
    public void listDatasetInputs(com.clarifai.grpc.api.ListDatasetInputsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiDatasetInputResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDatasetInputsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific dataset input.
     * </pre>
     */
    public void getDatasetInput(com.clarifai.grpc.api.GetDatasetInputRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleDatasetInputResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDatasetInputMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add dataset inputs to a dataset.
     * The process is not atomic, i.e. if there are errors with some dataset
     * inputs, others might still be added. The response reports
     *   - SUCCESS if all dataset inputs were added,
     *   - MIXED_STATUS if only some dataset inputs were added, and
     *   - FAILURE if no dataset inputs were added.
     * Each individual dataset input in the response has the status set to
     * indicate if it was successful or if there was an error.
     * </pre>
     */
    public void postDatasetInputs(com.clarifai.grpc.api.PostDatasetInputsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiDatasetInputResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostDatasetInputsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete one or more dataset inputs in a single request.
     * </pre>
     */
    public void deleteDatasetInputs(com.clarifai.grpc.api.DeleteDatasetInputsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDatasetInputsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all the dataset versions.
     * </pre>
     */
    public void listDatasetVersions(com.clarifai.grpc.api.ListDatasetVersionsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiDatasetVersionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDatasetVersionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific dataset version.
     * </pre>
     */
    public void getDatasetVersion(com.clarifai.grpc.api.GetDatasetVersionRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleDatasetVersionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDatasetVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listDatasetVersionMetricsGroups(com.clarifai.grpc.api.ListDatasetVersionMetricsGroupsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiDatasetVersionMetricsGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDatasetVersionMetricsGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add dataset versions to a dataset.
     * </pre>
     */
    public void postDatasetVersions(com.clarifai.grpc.api.PostDatasetVersionsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiDatasetVersionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostDatasetVersionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Patch one or more dataset versions.
     * </pre>
     */
    public void patchDatasetVersions(com.clarifai.grpc.api.PatchDatasetVersionsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiDatasetVersionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPatchDatasetVersionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete one or more dataset versions in a single request.
     * </pre>
     */
    public void deleteDatasetVersions(com.clarifai.grpc.api.DeleteDatasetVersionsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDatasetVersionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create export of a dataset version.
     * </pre>
     */
    public void putDatasetVersionExports(com.clarifai.grpc.api.PutDatasetVersionExportsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiDatasetVersionExportResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPutDatasetVersionExportsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific model type.
     * </pre>
     */
    public void getModelType(com.clarifai.grpc.api.GetModelTypeRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelTypeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetModelTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all the supported open source licenses in the platform.
     * </pre>
     */
    public void listOpenSourceLicenses(com.clarifai.grpc.api.ListOpenSourceLicensesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.ListOpenSourceLicensesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOpenSourceLicensesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all the model types available in the platform.
     * This MUST be above ListModels so that the /models/types endpoint takes precedence.
     * </pre>
     */
    public void listModelTypes(com.clarifai.grpc.api.ListModelTypesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelTypeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListModelTypesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific model from an app.
     * </pre>
     */
    public void getModel(com.clarifai.grpc.api.GetModelRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetModelOutputInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all the models.
     * </pre>
     */
    public void listModels(com.clarifai.grpc.api.ListModelsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostModelsSearchesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add a models to an app.
     * </pre>
     */
    public void postModels(com.clarifai.grpc.api.PostModelsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostModelsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Patch one or more models.
     * </pre>
     */
    public void patchModels(com.clarifai.grpc.api.PatchModelsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPatchModelsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Patch one or more models ids.
     * </pre>
     */
    public void patchModelIds(com.clarifai.grpc.api.PatchModelIdsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPatchModelIdsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a single model.
     * </pre>
     */
    public void deleteModel(com.clarifai.grpc.api.DeleteModelRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteModelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete multiple models in one request.
     * </pre>
     */
    public void deleteModels(com.clarifai.grpc.api.DeleteModelsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteModelsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update model check consents
     * </pre>
     */
    public void patchModelCheckConsents(com.clarifai.grpc.api.PatchModelCheckConsentsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelCheckConsentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPatchModelCheckConsentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update model toolkits tags
     * </pre>
     */
    public void patchModelToolkits(com.clarifai.grpc.api.PatchModelToolkitsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelToolkitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPatchModelToolkitsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update model use_cases tags
     * </pre>
     */
    public void patchModelUseCases(com.clarifai.grpc.api.PatchModelUseCasesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelUseCaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPatchModelUseCasesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update model languages tags
     * </pre>
     */
    public void patchModelLanguages(com.clarifai.grpc.api.PatchModelLanguagesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelLanguageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPatchModelLanguagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all the inputs.
     * </pre>
     */
    public void listModelInputs(com.clarifai.grpc.api.ListModelInputsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListModelInputsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific model from an app.
     * </pre>
     */
    public void getModelVersion(com.clarifai.grpc.api.GetModelVersionRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelVersionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetModelVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all the models.
     * </pre>
     */
    public void listModelVersions(com.clarifai.grpc.api.ListModelVersionsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelVersionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListModelVersionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postWorkflowVersionsUnPublish(com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostWorkflowVersionsUnPublishMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postWorkflowVersionsPublish(com.clarifai.grpc.api.PostWorkflowVersionsPublishRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostWorkflowVersionsPublishMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PostModelVersionsPublish
     * </pre>
     */
    public void postModelVersionsPublish(com.clarifai.grpc.api.PostModelVersionsPublishRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostModelVersionsPublishMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PostModelVersionsUnPublish
     * </pre>
     */
    public void postModelVersionsUnPublish(com.clarifai.grpc.api.PostModelVersionsUnPublishRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostModelVersionsUnPublishMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a new model version to trigger training of the model.
     * </pre>
     */
    public void postModelVersions(com.clarifai.grpc.api.PostModelVersionsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostModelVersionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PatchModelVersions
     * </pre>
     */
    public void patchModelVersions(com.clarifai.grpc.api.PatchModelVersionsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelVersionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPatchModelVersionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a single model.
     * </pre>
     */
    public void deleteModelVersion(com.clarifai.grpc.api.DeleteModelVersionRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteModelVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deprecated: Use GetModelVersionEvaluation instead
     * Get the evaluation metrics for a model version.
     * </pre>
     */
    public void getModelVersionMetrics(com.clarifai.grpc.api.GetModelVersionMetricsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelVersionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetModelVersionMetricsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deprecated, use PostModelVersionEvaluations instead
     * Run the evaluation metrics for a model version.
     * </pre>
     */
    public void postModelVersionMetrics(com.clarifai.grpc.api.PostModelVersionMetricsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelVersionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostModelVersionMetricsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postModelVersionEvaluations(com.clarifai.grpc.api.PostModelVersionEvaluationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiEvalMetricsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostModelVersionEvaluationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List the evaluation metrics for a model version.
     * </pre>
     */
    public void listModelVersionEvaluations(com.clarifai.grpc.api.ListModelVersionEvaluationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiEvalMetricsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListModelVersionEvaluationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an evaluation metrics for a model version.
     * </pre>
     */
    public void getModelVersionEvaluation(com.clarifai.grpc.api.GetModelVersionEvaluationRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleEvalMetricsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetModelVersionEvaluationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists model references tied to a particular model id.
     * </pre>
     */
    public void listModelReferences(com.clarifai.grpc.api.ListModelReferencesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelReferenceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListModelReferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetModelVersionInputExample
     * </pre>
     */
    public void getModelVersionInputExample(com.clarifai.grpc.api.GetModelVersionInputExampleRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelVersionInputExampleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetModelVersionInputExampleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListModelVersionInputExamples
     * </pre>
     */
    public void listModelVersionInputExamples(com.clarifai.grpc.api.ListModelVersionInputExamplesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelVersionInputExampleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListModelVersionInputExamplesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific workflow from an app.
     * </pre>
     */
    public void getWorkflow(com.clarifai.grpc.api.GetWorkflowRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleWorkflowResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWorkflowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all the workflows.
     * </pre>
     */
    public void listWorkflows(com.clarifai.grpc.api.ListWorkflowsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiWorkflowResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListWorkflowsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add a workflow to an app.
     * </pre>
     */
    public void postWorkflows(com.clarifai.grpc.api.PostWorkflowsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiWorkflowResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostWorkflowsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Patch one or more workflows.
     * </pre>
     */
    public void patchWorkflows(com.clarifai.grpc.api.PatchWorkflowsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiWorkflowResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPatchWorkflowsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Patch one or more workflows ids.
     * </pre>
     */
    public void patchWorkflowIds(com.clarifai.grpc.api.PatchWorkflowIdsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiWorkflowResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPatchWorkflowIdsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a single workflow.
     * </pre>
     */
    public void deleteWorkflow(com.clarifai.grpc.api.DeleteWorkflowRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteWorkflowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete multiple workflows in one request.
     * </pre>
     */
    public void deleteWorkflows(com.clarifai.grpc.api.DeleteWorkflowsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteWorkflowsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Predict using a workflow.
     * </pre>
     */
    public void postWorkflowResults(com.clarifai.grpc.api.PostWorkflowResultsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.PostWorkflowResultsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostWorkflowResultsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Compare embeddings distances using a workflow
     * </pre>
     */
    public void postWorkflowResultsSimilarity(com.clarifai.grpc.api.PostWorkflowResultsSimilarityRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.PostWorkflowResultsSimilarityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostWorkflowResultsSimilarityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List workflow versions.
     * </pre>
     */
    public void listWorkflowVersions(com.clarifai.grpc.api.ListWorkflowVersionsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiWorkflowVersionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListWorkflowVersionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get single workflow version.
     * </pre>
     */
    public void getWorkflowVersion(com.clarifai.grpc.api.GetWorkflowVersionRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleWorkflowVersionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWorkflowVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete workflow versions.
     * </pre>
     */
    public void deleteWorkflowVersions(com.clarifai.grpc.api.DeleteWorkflowVersionsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteWorkflowVersionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Patch workflow versions.
     * </pre>
     */
    public void patchWorkflowVersions(com.clarifai.grpc.api.PatchWorkflowVersionsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiWorkflowVersionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPatchWorkflowVersionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific key from an app.
     * </pre>
     */
    public void getKey(com.clarifai.grpc.api.GetKeyRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all the keys.
     * </pre>
     */
    public void listKeys(com.clarifai.grpc.api.ListKeysRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListKeysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List keys by app_id
     * </pre>
     */
    public void listAppKeys(com.clarifai.grpc.api.ListAppKeysRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add a key to an app.
     * </pre>
     */
    public void postKeys(com.clarifai.grpc.api.PostKeysRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostKeysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Patch one or more keys.
     * </pre>
     */
    public void patchKeys(com.clarifai.grpc.api.PatchKeysRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMyScopesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void myScopesUser(com.clarifai.grpc.api.MyScopesUserRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiScopeUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMyScopesUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void myScopesRoot(com.clarifai.grpc.api.MyScopesRootRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiScopeRootResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMyScopesRootMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all auth scopes available to me as a user.
     * </pre>
     */
    public void listScopes(com.clarifai.grpc.api.ListScopesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiScopeDepsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListScopesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific app from an app.
     * </pre>
     */
    public void getApp(com.clarifai.grpc.api.GetAppRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all the apps.
     * </pre>
     */
    public void listApps(com.clarifai.grpc.api.ListAppsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostAppsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Patch one or more apps.
     * </pre>
     */
    public void patchApps(com.clarifai.grpc.api.PatchAppsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPatchAppsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Patch apps ids.
     * </pre>
     */
    public void patchAppsIds(com.clarifai.grpc.api.PatchAppsIdsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPatchAppsIdsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Patch one app.
     * </pre>
     */
    public void patchApp(com.clarifai.grpc.api.PatchAppRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPatchAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Search over the applications to find one or more you're looking for.
     * </pre>
     */
    public void postAppsSearches(com.clarifai.grpc.api.PostAppsSearchesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostAppsSearchesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Validate new password in real-time for a user
     * </pre>
     */
    public void postValidatePassword(com.clarifai.grpc.api.PostValidatePasswordRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SinglePasswordValidationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostValidatePasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a saved legacy search.
     * </pre>
     */
    public void getSearch(com.clarifai.grpc.api.GetSearchRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleSearchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all saved legacy searches.
     * </pre>
     */
    public void listSearches(com.clarifai.grpc.api.ListSearchesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiSearchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSearchesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Patch saved legacy searches by ids.
     * </pre>
     */
    public void patchSearches(com.clarifai.grpc.api.PatchSearchesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiSearchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPatchSearchesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Execute a new search and optionally save it.
     * Deprecated: Use PostInputsSearches or PostAnnotationsSearches instead.
     * </pre>
     */
    @java.lang.Deprecated
    public void postSearches(com.clarifai.grpc.api.PostSearchesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiSearchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostSearchesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Execute a previously saved legacy search.
     * </pre>
     */
    public void postSearchesByID(com.clarifai.grpc.api.PostSearchesByIDRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiSearchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostSearchesByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Evaluate the results of two search requests
     * </pre>
     */
    public void postAnnotationSearchMetrics(com.clarifai.grpc.api.PostAnnotationSearchMetricsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostAnnotationSearchMetricsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the evaluation results between two search requests
     * </pre>
     */
    public void getAnnotationSearchMetrics(com.clarifai.grpc.api.GetAnnotationSearchMetricsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnnotationSearchMetricsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List the evaluation results between two search requests
     * </pre>
     */
    public void listAnnotationSearchMetrics(com.clarifai.grpc.api.ListAnnotationSearchMetricsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAnnotationSearchMetricsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteAnnotationSearchMetrics
     * </pre>
     */
    public void deleteAnnotationSearchMetrics(com.clarifai.grpc.api.DeleteAnnotationSearchMetricsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAnnotationSearchMetricsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a saved search.
     * </pre>
     */
    public void deleteSearch(com.clarifai.grpc.api.DeleteSearchRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all the annotation filters.
     * </pre>
     */
    public void listAnnotationFilters(com.clarifai.grpc.api.ListAnnotationFiltersRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAnnotationFilterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAnnotationFiltersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific annotation filter.
     * </pre>
     */
    public void getAnnotationFilter(com.clarifai.grpc.api.GetAnnotationFilterRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleAnnotationFilterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnnotationFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add annotation filters.
     * </pre>
     */
    public void postAnnotationFilters(com.clarifai.grpc.api.PostAnnotationFiltersRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAnnotationFilterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostAnnotationFiltersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Patch one or more annotation filters.
     * </pre>
     */
    public void patchAnnotationFilters(com.clarifai.grpc.api.PatchAnnotationFiltersRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAnnotationFilterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPatchAnnotationFiltersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete one or more annotation filters in a single request.
     * </pre>
     */
    public void deleteAnnotationFilters(com.clarifai.grpc.api.DeleteAnnotationFiltersRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAnnotationFiltersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all status codes.
     * </pre>
     */
    public void listStatusCodes(com.clarifai.grpc.api.ListStatusCodesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiStatusCodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListStatusCodesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get more details for a status code.
     * </pre>
     */
    public void getStatusCode(com.clarifai.grpc.api.GetStatusCodeRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleStatusCodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStatusCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * owner list users who the app is shared with
     * </pre>
     */
    public void listCollaborators(com.clarifai.grpc.api.ListCollaboratorsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiCollaboratorsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCollaboratorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * add collaborators to an app.
     * </pre>
     */
    public void postCollaborators(com.clarifai.grpc.api.PostCollaboratorsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiCollaboratorsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostCollaboratorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Patch existing collaborators.
     * </pre>
     */
    public void patchCollaborators(com.clarifai.grpc.api.PatchCollaboratorsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiCollaboratorsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPatchCollaboratorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete existing collaborators.
     * </pre>
     */
    public void deleteCollaborators(com.clarifai.grpc.api.DeleteCollaboratorsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCollaboratorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Collaboration includes the app user are invitied to work on
     * </pre>
     */
    public void listCollaborations(com.clarifai.grpc.api.ListCollaborationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiCollaborationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostAppDuplicationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * list all the app duplications user triggers
     * </pre>
     */
    public void listAppDuplications(com.clarifai.grpc.api.ListAppDuplicationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAppDuplicationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAppDuplicationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get the app duplication status
     * </pre>
     */
    public void getAppDuplication(com.clarifai.grpc.api.GetAppDuplicationRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleAppDuplicationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAppDuplicationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add tasks to an app.
     * </pre>
     */
    public void postTasks(com.clarifai.grpc.api.PostTasksRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiTaskResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostTasksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Task annotation count
     * </pre>
     */
    public void getTaskAnnotationCount(com.clarifai.grpc.api.GetTaskCountRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleTaskCountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTaskAnnotationCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Task Input count
     * </pre>
     */
    public void getTaskInputCount(com.clarifai.grpc.api.GetTaskCountRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleTaskCountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTaskInputCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific task from an app.
     * </pre>
     */
    public void getTask(com.clarifai.grpc.api.GetTaskRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleTaskResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List tasks from an app.
     * </pre>
     */
    public void listTasks(com.clarifai.grpc.api.ListTasksRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiTaskResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTasksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Patch one or more tasks.
     * </pre>
     */
    public void patchTasks(com.clarifai.grpc.api.PatchTasksRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiTaskResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPatchTasksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete multiple tasks in one request.
     * </pre>
     */
    public void deleteTasks(com.clarifai.grpc.api.DeleteTasksRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTasksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add Label orders.
     * </pre>
     */
    public void postLabelOrders(com.clarifai.grpc.api.PostLabelOrdersRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiLabelOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostLabelOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a label order.
     * </pre>
     */
    public void getLabelOrder(com.clarifai.grpc.api.GetLabelOrderRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleLabelOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLabelOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List label orders.
     * </pre>
     */
    public void listLabelOrders(com.clarifai.grpc.api.ListLabelOrdersRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiLabelOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListLabelOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Patch one or more label orders.
     * </pre>
     */
    public void patchLabelOrders(com.clarifai.grpc.api.PatchLabelOrdersRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiLabelOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPatchLabelOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete multiple label orders in one request.
     * this do not change task status
     * </pre>
     */
    public void deleteLabelOrders(com.clarifai.grpc.api.DeleteLabelOrdersRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteLabelOrdersMethod(), getCallOptions()), request, responseObserver);
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostCollectorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific collector from an app.
     * </pre>
     */
    public void getCollector(com.clarifai.grpc.api.GetCollectorRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleCollectorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCollectorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all the collectors.
     * </pre>
     */
    public void listCollectors(com.clarifai.grpc.api.ListCollectorsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiCollectorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCollectorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Patch one or more collectors.
     * </pre>
     */
    public void patchCollectors(com.clarifai.grpc.api.PatchCollectorsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiCollectorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCollectorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PostStatValues
     * </pre>
     */
    public void postStatValues(com.clarifai.grpc.api.PostStatValuesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiStatValueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostStatValuesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PostStatValuesAggregate
     * </pre>
     */
    public void postStatValuesAggregate(com.clarifai.grpc.api.PostStatValuesAggregateRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiStatValueAggregateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostStatValuesAggregateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Increase the view metric for a detail view
     * </pre>
     */
    public void postTrendingMetricsView(com.clarifai.grpc.api.PostTrendingMetricsViewRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostTrendingMetricsViewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List the view metrics for a detail view
     * </pre>
     */
    public void listTrendingMetricsViews(com.clarifai.grpc.api.ListTrendingMetricsViewsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiTrendingMetricsViewResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTrendingMetricsViewsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific module from an app.
     * </pre>
     */
    public void getModule(com.clarifai.grpc.api.GetModuleRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModuleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetModuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all the modules in community, by user or by app.
     * </pre>
     */
    public void listModules(com.clarifai.grpc.api.ListModulesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModuleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListModulesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add a modules to an app.
     * </pre>
     */
    public void postModules(com.clarifai.grpc.api.PostModulesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModuleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostModulesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Patch one or more modules.
     * </pre>
     */
    public void patchModules(com.clarifai.grpc.api.PatchModulesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModuleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPatchModulesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete multiple modules in one request.
     * </pre>
     */
    public void deleteModules(com.clarifai.grpc.api.DeleteModulesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteModulesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific module version for a module.
     * </pre>
     */
    public void getModuleVersion(com.clarifai.grpc.api.GetModuleVersionRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModuleVersionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetModuleVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all the modules versions for a given module.
     * </pre>
     */
    public void listModuleVersions(com.clarifai.grpc.api.ListModuleVersionsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModuleVersionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListModuleVersionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a new module version to trigger training of the module.
     * </pre>
     */
    public void postModuleVersions(com.clarifai.grpc.api.PostModuleVersionsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModuleVersionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostModuleVersionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a multiple module version.
     * </pre>
     */
    public void deleteModuleVersions(com.clarifai.grpc.api.DeleteModuleVersionsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteModuleVersionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get installed modules vesrions for an app.
     * </pre>
     */
    public void getInstalledModuleVersion(com.clarifai.grpc.api.GetInstalledModuleVersionRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleInstalledModuleVersionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetInstalledModuleVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List installed modules vesrions for an app.
     * </pre>
     */
    public void listInstalledModuleVersions(com.clarifai.grpc.api.ListInstalledModuleVersionsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInstalledModuleVersionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListInstalledModuleVersionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Install a new module version which will deploy the specific ModuleVersion to the app in the url.
     * </pre>
     */
    public void postInstalledModuleVersions(com.clarifai.grpc.api.PostInstalledModuleVersionsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInstalledModuleVersionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostInstalledModuleVersionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Uninstall an installed module version which will deploy the specific ModuleVersion to the app
     * in the url.
     * This cleaned up any associated caller keys so needs the Keys_Delete scope.
     * </pre>
     */
    public void deleteInstalledModuleVersions(com.clarifai.grpc.api.DeleteInstalledModuleVersionsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteInstalledModuleVersionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Assign a key that the caller owns to be used when accessing this installed module version
     * If this endpoint is called with a different key then it overwrites what is there.
     * </pre>
     */
    public void postInstalledModuleVersionsKey(com.clarifai.grpc.api.PostInstalledModuleVersionsKeyRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostInstalledModuleVersionsKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Perform bulk operations on a list of inputs based on input source.
     * Operation include add, update, delete of concepts, metadata and geo data.
     * This is an Asynchronous process. Use ListBulkOperations or GetBulkOperation to check the status.
     * </pre>
     */
    public void postBulkOperations(com.clarifai.grpc.api.PostBulkOperationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiBulkOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostBulkOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all the bulk operations
     * </pre>
     */
    public void listBulkOperations(com.clarifai.grpc.api.ListBulkOperationsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiBulkOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListBulkOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the bulk operation details by ID
     * </pre>
     */
    public void getBulkOperation(com.clarifai.grpc.api.GetBulkOperationRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleBulkOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBulkOperationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Cancel one or more bulk operations
     * </pre>
     */
    public void cancelBulkOperations(com.clarifai.grpc.api.CancelBulkOperationRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiBulkOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelBulkOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * delete one or more terminated bulk operations
     * </pre>
     */
    public void deleteBulkOperations(com.clarifai.grpc.api.DeleteBulkOperationRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteBulkOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific job.
     * </pre>
     */
    public void getDatasetInputsSearchAddJob(com.clarifai.grpc.api.GetDatasetInputsSearchAddJobRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleDatasetInputsSearchAddJobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDatasetInputsSearchAddJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all the inputs add jobs
     * </pre>
     */
    public void listInputsAddJobs(com.clarifai.grpc.api.ListInputsAddJobsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputsAddJobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListInputsAddJobsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the input add job details by ID
     * </pre>
     */
    public void getInputsAddJob(com.clarifai.grpc.api.GetInputsAddJobRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleInputsAddJobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetInputsAddJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postUploads(com.clarifai.grpc.api.PostUploadsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiUploadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostUploadsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void putUploadContentParts(com.clarifai.grpc.api.PutUploadContentPartsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleUploadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPutUploadContentPartsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUpload(com.clarifai.grpc.api.GetUploadRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleUploadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUploadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listUploads(com.clarifai.grpc.api.ListUploadsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiUploadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUploadsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUploads(com.clarifai.grpc.api.DeleteUploadsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUploadsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postInputsDataSources(com.clarifai.grpc.api.PostInputsDataSourcesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputsAddJobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostInputsDataSourcesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the input extraction job details by ID
     * </pre>
     */
    public void getInputsExtractionJob(com.clarifai.grpc.api.GetInputsExtractionJobRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleInputsExtractionJobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetInputsExtractionJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all the input extraction jobs
     * </pre>
     */
    public void listInputsExtractionJobs(com.clarifai.grpc.api.ListInputsExtractionJobsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputsExtractionJobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListInputsExtractionJobsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelInputsExtractionJobs(com.clarifai.grpc.api.CancelInputsExtractionJobsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputsExtractionJobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelInputsExtractionJobsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postInputsUploads(com.clarifai.grpc.api.PostInputsUploadsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputsAddJobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostInputsUploadsMethod(), getCallOptions()), request, responseObserver);
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListConceptRelationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Post concept relations to create relations between concepts in the platform.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiConceptRelationResponse postConceptRelations(com.clarifai.grpc.api.PostConceptRelationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostConceptRelationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Post concept relations to create relations between concepts in the platform.
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteConceptRelations(com.clarifai.grpc.api.DeleteConceptRelationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteConceptRelationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all the concepts with their positive and negative counts
     * </pre>
     */
    public com.clarifai.grpc.api.MultiConceptCountResponse getConceptCounts(com.clarifai.grpc.api.GetConceptCountsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetConceptCountsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific concept from an app.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleConceptResponse getConcept(com.clarifai.grpc.api.GetConceptRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetConceptMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all the concepts.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiConceptResponse listConcepts(com.clarifai.grpc.api.ListConceptsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListConceptsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List models concepts.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiConceptResponse listModelConcepts(com.clarifai.grpc.api.ListModelConceptsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListModelConceptsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Search over the concepts to find one or more you're looking for.
     * This leverage the "body" parameter because we also have page and
     * per_page as url query param variables in this request.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiConceptResponse postConceptsSearches(com.clarifai.grpc.api.PostConceptsSearchesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostConceptsSearchesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a concept to an app.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiConceptResponse postConcepts(com.clarifai.grpc.api.PostConceptsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostConceptsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Patch one or more concepts.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiConceptResponse patchConcepts(com.clarifai.grpc.api.PatchConceptsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPatchConceptsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific concept from an app.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleConceptLanguageResponse getConceptLanguage(com.clarifai.grpc.api.GetConceptLanguageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetConceptLanguageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List the concept in all the translated languages.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiConceptLanguageResponse listConceptLanguages(com.clarifai.grpc.api.ListConceptLanguagesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListConceptLanguagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a new translation for this concept.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiConceptLanguageResponse postConceptLanguages(com.clarifai.grpc.api.PostConceptLanguagesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostConceptLanguagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Patch the name for a given language names by passing in a list of concepts with the new names
     * for the languages.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiConceptLanguageResponse patchConceptLanguages(com.clarifai.grpc.api.PatchConceptLanguagesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPatchConceptLanguagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all domain graphs.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiKnowledgeGraphResponse listKnowledgeGraphs(com.clarifai.grpc.api.ListKnowledgeGraphsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListKnowledgeGraphsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Post domain graphs.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiKnowledgeGraphResponse postKnowledgeGraphs(com.clarifai.grpc.api.PostKnowledgeGraphsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostKnowledgeGraphsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Start concept mapping jobs.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiConceptMappingJobResponse postConceptMappingJobs(com.clarifai.grpc.api.PostConceptMappingJobsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostConceptMappingJobsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific annotation from an app.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleAnnotationResponse getAnnotation(com.clarifai.grpc.api.GetAnnotationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnnotationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all the annotation.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiAnnotationResponse listAnnotations(com.clarifai.grpc.api.ListAnnotationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAnnotationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Post annotations.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiAnnotationResponse postAnnotations(com.clarifai.grpc.api.PostAnnotationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostAnnotationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Patch one or more annotations.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiAnnotationResponse patchAnnotations(com.clarifai.grpc.api.PatchAnnotationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPatchAnnotationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Patch annotations status by worker id and task id.
     * </pre>
     */
    public com.clarifai.grpc.api.PatchAnnotationsStatusResponse patchAnnotationsStatus(com.clarifai.grpc.api.PatchAnnotationsStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPatchAnnotationsStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a single annotation.
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteAnnotation(com.clarifai.grpc.api.DeleteAnnotationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAnnotationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete multiple annotations in one request.
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteAnnotations(com.clarifai.grpc.api.DeleteAnnotationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAnnotationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Patch saved annotations searches by ids.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiSearchResponse patchAnnotationsSearches(com.clarifai.grpc.api.PatchAnnotationsSearchesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPatchAnnotationsSearchesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Execute a search over annotations
     * </pre>
     */
    public com.clarifai.grpc.api.MultiSearchResponse postAnnotationsSearches(com.clarifai.grpc.api.PostAnnotationsSearchesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostAnnotationsSearchesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get input count per status.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleInputCountResponse getInputCount(com.clarifai.grpc.api.GetInputCountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetInputCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Streams all the inputs starting from oldest assets.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiInputResponse streamInputs(com.clarifai.grpc.api.StreamInputsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStreamInputsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific input from an app.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiInputAnnotationResponse getInputSamples(com.clarifai.grpc.api.GetInputSamplesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetInputSamplesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific input from an app.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleInputResponse getInput(com.clarifai.grpc.api.GetInputRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetInputMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all the inputs.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiInputResponse listInputs(com.clarifai.grpc.api.ListInputsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostInputsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Patch one or more inputs.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiInputResponse patchInputs(com.clarifai.grpc.api.PatchInputsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPatchInputsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a single input asynchronously.
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteInput(com.clarifai.grpc.api.DeleteInputRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteInputMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete multiple inputs in one request.
     * This call is asynchronous.
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteInputs(com.clarifai.grpc.api.DeleteInputsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteInputsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Patch saved inputs searches by ids.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiSearchResponse patchInputsSearches(com.clarifai.grpc.api.PatchInputsSearchesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPatchInputsSearchesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Execute a search over inputs
     * </pre>
     */
    public com.clarifai.grpc.api.MultiSearchResponse postInputsSearches(com.clarifai.grpc.api.PostInputsSearchesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostInputsSearchesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get predicted outputs from the model.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiOutputResponse postModelOutputs(com.clarifai.grpc.api.PostModelOutputsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostModelOutputsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all the datasets.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiDatasetResponse listDatasets(com.clarifai.grpc.api.ListDatasetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDatasetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific dataset.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleDatasetResponse getDataset(com.clarifai.grpc.api.GetDatasetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDatasetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add datasets to an app.
     * The process is atomic, i.e. either all or no datasets are added.
     * If there is an error for one dataset,
     * the process will stop, revert the transaction and return the error.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiDatasetResponse postDatasets(com.clarifai.grpc.api.PostDatasetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostDatasetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Patch one or more datasets.
     * The process is atomic, i.e. either all or no datasets are patched.
     * If there is an error for one dataset,
     * the process will stop, revert the transaction and return the error.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiDatasetResponse patchDatasets(com.clarifai.grpc.api.PatchDatasetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPatchDatasetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Patch one or more dataset ids.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiDatasetResponse patchDatasetIds(com.clarifai.grpc.api.PatchDatasetIdsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPatchDatasetIdsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete one or more datasets in a single request.
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteDatasets(com.clarifai.grpc.api.DeleteDatasetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDatasetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all the dataset inputs in a dataset.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiDatasetInputResponse listDatasetInputs(com.clarifai.grpc.api.ListDatasetInputsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDatasetInputsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific dataset input.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleDatasetInputResponse getDatasetInput(com.clarifai.grpc.api.GetDatasetInputRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDatasetInputMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add dataset inputs to a dataset.
     * The process is not atomic, i.e. if there are errors with some dataset
     * inputs, others might still be added. The response reports
     *   - SUCCESS if all dataset inputs were added,
     *   - MIXED_STATUS if only some dataset inputs were added, and
     *   - FAILURE if no dataset inputs were added.
     * Each individual dataset input in the response has the status set to
     * indicate if it was successful or if there was an error.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiDatasetInputResponse postDatasetInputs(com.clarifai.grpc.api.PostDatasetInputsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostDatasetInputsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete one or more dataset inputs in a single request.
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteDatasetInputs(com.clarifai.grpc.api.DeleteDatasetInputsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDatasetInputsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all the dataset versions.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiDatasetVersionResponse listDatasetVersions(com.clarifai.grpc.api.ListDatasetVersionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDatasetVersionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific dataset version.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleDatasetVersionResponse getDatasetVersion(com.clarifai.grpc.api.GetDatasetVersionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDatasetVersionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.clarifai.grpc.api.MultiDatasetVersionMetricsGroupResponse listDatasetVersionMetricsGroups(com.clarifai.grpc.api.ListDatasetVersionMetricsGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDatasetVersionMetricsGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add dataset versions to a dataset.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiDatasetVersionResponse postDatasetVersions(com.clarifai.grpc.api.PostDatasetVersionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostDatasetVersionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Patch one or more dataset versions.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiDatasetVersionResponse patchDatasetVersions(com.clarifai.grpc.api.PatchDatasetVersionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPatchDatasetVersionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete one or more dataset versions in a single request.
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteDatasetVersions(com.clarifai.grpc.api.DeleteDatasetVersionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDatasetVersionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create export of a dataset version.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiDatasetVersionExportResponse putDatasetVersionExports(com.clarifai.grpc.api.PutDatasetVersionExportsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPutDatasetVersionExportsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific model type.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleModelTypeResponse getModelType(com.clarifai.grpc.api.GetModelTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetModelTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all the supported open source licenses in the platform.
     * </pre>
     */
    public com.clarifai.grpc.api.ListOpenSourceLicensesResponse listOpenSourceLicenses(com.clarifai.grpc.api.ListOpenSourceLicensesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOpenSourceLicensesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all the model types available in the platform.
     * This MUST be above ListModels so that the /models/types endpoint takes precedence.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiModelTypeResponse listModelTypes(com.clarifai.grpc.api.ListModelTypesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListModelTypesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific model from an app.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleModelResponse getModel(com.clarifai.grpc.api.GetModelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetModelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a the output info for a given model_id or model_id/version_id
     * combo.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleModelResponse getModelOutputInfo(com.clarifai.grpc.api.GetModelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetModelOutputInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all the models.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiModelResponse listModels(com.clarifai.grpc.api.ListModelsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostModelsSearchesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a models to an app.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleModelResponse postModels(com.clarifai.grpc.api.PostModelsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostModelsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Patch one or more models.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiModelResponse patchModels(com.clarifai.grpc.api.PatchModelsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPatchModelsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Patch one or more models ids.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiModelResponse patchModelIds(com.clarifai.grpc.api.PatchModelIdsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPatchModelIdsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a single model.
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteModel(com.clarifai.grpc.api.DeleteModelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteModelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete multiple models in one request.
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteModels(com.clarifai.grpc.api.DeleteModelsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteModelsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update model check consents
     * </pre>
     */
    public com.clarifai.grpc.api.MultiModelCheckConsentResponse patchModelCheckConsents(com.clarifai.grpc.api.PatchModelCheckConsentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPatchModelCheckConsentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update model toolkits tags
     * </pre>
     */
    public com.clarifai.grpc.api.MultiModelToolkitResponse patchModelToolkits(com.clarifai.grpc.api.PatchModelToolkitsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPatchModelToolkitsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update model use_cases tags
     * </pre>
     */
    public com.clarifai.grpc.api.MultiModelUseCaseResponse patchModelUseCases(com.clarifai.grpc.api.PatchModelUseCasesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPatchModelUseCasesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update model languages tags
     * </pre>
     */
    public com.clarifai.grpc.api.MultiModelLanguageResponse patchModelLanguages(com.clarifai.grpc.api.PatchModelLanguagesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPatchModelLanguagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all the inputs.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiInputResponse listModelInputs(com.clarifai.grpc.api.ListModelInputsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListModelInputsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific model from an app.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleModelVersionResponse getModelVersion(com.clarifai.grpc.api.GetModelVersionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetModelVersionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all the models.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiModelVersionResponse listModelVersions(com.clarifai.grpc.api.ListModelVersionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListModelVersionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.clarifai.grpc.api.status.BaseResponse postWorkflowVersionsUnPublish(com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostWorkflowVersionsUnPublishMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.clarifai.grpc.api.status.BaseResponse postWorkflowVersionsPublish(com.clarifai.grpc.api.PostWorkflowVersionsPublishRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostWorkflowVersionsPublishMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PostModelVersionsPublish
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse postModelVersionsPublish(com.clarifai.grpc.api.PostModelVersionsPublishRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostModelVersionsPublishMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PostModelVersionsUnPublish
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse postModelVersionsUnPublish(com.clarifai.grpc.api.PostModelVersionsUnPublishRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostModelVersionsUnPublishMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new model version to trigger training of the model.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleModelResponse postModelVersions(com.clarifai.grpc.api.PostModelVersionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostModelVersionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PatchModelVersions
     * </pre>
     */
    public com.clarifai.grpc.api.MultiModelVersionResponse patchModelVersions(com.clarifai.grpc.api.PatchModelVersionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPatchModelVersionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a single model.
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteModelVersion(com.clarifai.grpc.api.DeleteModelVersionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteModelVersionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deprecated: Use GetModelVersionEvaluation instead
     * Get the evaluation metrics for a model version.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleModelVersionResponse getModelVersionMetrics(com.clarifai.grpc.api.GetModelVersionMetricsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetModelVersionMetricsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deprecated, use PostModelVersionEvaluations instead
     * Run the evaluation metrics for a model version.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleModelVersionResponse postModelVersionMetrics(com.clarifai.grpc.api.PostModelVersionMetricsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostModelVersionMetricsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.clarifai.grpc.api.MultiEvalMetricsResponse postModelVersionEvaluations(com.clarifai.grpc.api.PostModelVersionEvaluationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostModelVersionEvaluationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List the evaluation metrics for a model version.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiEvalMetricsResponse listModelVersionEvaluations(com.clarifai.grpc.api.ListModelVersionEvaluationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListModelVersionEvaluationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an evaluation metrics for a model version.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleEvalMetricsResponse getModelVersionEvaluation(com.clarifai.grpc.api.GetModelVersionEvaluationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetModelVersionEvaluationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists model references tied to a particular model id.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiModelReferenceResponse listModelReferences(com.clarifai.grpc.api.ListModelReferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListModelReferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetModelVersionInputExample
     * </pre>
     */
    public com.clarifai.grpc.api.SingleModelVersionInputExampleResponse getModelVersionInputExample(com.clarifai.grpc.api.GetModelVersionInputExampleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetModelVersionInputExampleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListModelVersionInputExamples
     * </pre>
     */
    public com.clarifai.grpc.api.MultiModelVersionInputExampleResponse listModelVersionInputExamples(com.clarifai.grpc.api.ListModelVersionInputExamplesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListModelVersionInputExamplesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific workflow from an app.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleWorkflowResponse getWorkflow(com.clarifai.grpc.api.GetWorkflowRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWorkflowMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all the workflows.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiWorkflowResponse listWorkflows(com.clarifai.grpc.api.ListWorkflowsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListWorkflowsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a workflow to an app.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiWorkflowResponse postWorkflows(com.clarifai.grpc.api.PostWorkflowsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostWorkflowsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Patch one or more workflows.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiWorkflowResponse patchWorkflows(com.clarifai.grpc.api.PatchWorkflowsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPatchWorkflowsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Patch one or more workflows ids.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiWorkflowResponse patchWorkflowIds(com.clarifai.grpc.api.PatchWorkflowIdsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPatchWorkflowIdsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a single workflow.
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteWorkflow(com.clarifai.grpc.api.DeleteWorkflowRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteWorkflowMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete multiple workflows in one request.
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteWorkflows(com.clarifai.grpc.api.DeleteWorkflowsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteWorkflowsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Predict using a workflow.
     * </pre>
     */
    public com.clarifai.grpc.api.PostWorkflowResultsResponse postWorkflowResults(com.clarifai.grpc.api.PostWorkflowResultsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostWorkflowResultsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Compare embeddings distances using a workflow
     * </pre>
     */
    public com.clarifai.grpc.api.PostWorkflowResultsSimilarityResponse postWorkflowResultsSimilarity(com.clarifai.grpc.api.PostWorkflowResultsSimilarityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostWorkflowResultsSimilarityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List workflow versions.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiWorkflowVersionResponse listWorkflowVersions(com.clarifai.grpc.api.ListWorkflowVersionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListWorkflowVersionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get single workflow version.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleWorkflowVersionResponse getWorkflowVersion(com.clarifai.grpc.api.GetWorkflowVersionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWorkflowVersionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete workflow versions.
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteWorkflowVersions(com.clarifai.grpc.api.DeleteWorkflowVersionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteWorkflowVersionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Patch workflow versions.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiWorkflowVersionResponse patchWorkflowVersions(com.clarifai.grpc.api.PatchWorkflowVersionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPatchWorkflowVersionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific key from an app.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleKeyResponse getKey(com.clarifai.grpc.api.GetKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all the keys.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiKeyResponse listKeys(com.clarifai.grpc.api.ListKeysRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListKeysMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List keys by app_id
     * </pre>
     */
    public com.clarifai.grpc.api.MultiKeyResponse listAppKeys(com.clarifai.grpc.api.ListAppKeysRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a key to an app.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiKeyResponse postKeys(com.clarifai.grpc.api.PostKeysRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostKeysMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Patch one or more keys.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiKeyResponse patchKeys(com.clarifai.grpc.api.PatchKeysRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMyScopesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.clarifai.grpc.api.MultiScopeUserResponse myScopesUser(com.clarifai.grpc.api.MyScopesUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMyScopesUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.clarifai.grpc.api.MultiScopeRootResponse myScopesRoot(com.clarifai.grpc.api.MyScopesRootRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMyScopesRootMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all auth scopes available to me as a user.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiScopeDepsResponse listScopes(com.clarifai.grpc.api.ListScopesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListScopesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific app from an app.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleAppResponse getApp(com.clarifai.grpc.api.GetAppRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAppMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all the apps.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiAppResponse listApps(com.clarifai.grpc.api.ListAppsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostAppsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Patch one or more apps.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiAppResponse patchApps(com.clarifai.grpc.api.PatchAppsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPatchAppsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Patch apps ids.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiAppResponse patchAppsIds(com.clarifai.grpc.api.PatchAppsIdsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPatchAppsIdsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Patch one app.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleAppResponse patchApp(com.clarifai.grpc.api.PatchAppRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPatchAppMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Search over the applications to find one or more you're looking for.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiAppResponse postAppsSearches(com.clarifai.grpc.api.PostAppsSearchesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostAppsSearchesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Validate new password in real-time for a user
     * </pre>
     */
    public com.clarifai.grpc.api.SinglePasswordValidationResponse postValidatePassword(com.clarifai.grpc.api.PostValidatePasswordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostValidatePasswordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a saved legacy search.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleSearchResponse getSearch(com.clarifai.grpc.api.GetSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all saved legacy searches.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiSearchResponse listSearches(com.clarifai.grpc.api.ListSearchesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSearchesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Patch saved legacy searches by ids.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiSearchResponse patchSearches(com.clarifai.grpc.api.PatchSearchesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPatchSearchesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Execute a new search and optionally save it.
     * Deprecated: Use PostInputsSearches or PostAnnotationsSearches instead.
     * </pre>
     */
    @java.lang.Deprecated
    public com.clarifai.grpc.api.MultiSearchResponse postSearches(com.clarifai.grpc.api.PostSearchesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostSearchesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Execute a previously saved legacy search.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiSearchResponse postSearchesByID(com.clarifai.grpc.api.PostSearchesByIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostSearchesByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Evaluate the results of two search requests
     * </pre>
     */
    public com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse postAnnotationSearchMetrics(com.clarifai.grpc.api.PostAnnotationSearchMetricsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostAnnotationSearchMetricsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the evaluation results between two search requests
     * </pre>
     */
    public com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse getAnnotationSearchMetrics(com.clarifai.grpc.api.GetAnnotationSearchMetricsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnnotationSearchMetricsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List the evaluation results between two search requests
     * </pre>
     */
    public com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse listAnnotationSearchMetrics(com.clarifai.grpc.api.ListAnnotationSearchMetricsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAnnotationSearchMetricsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteAnnotationSearchMetrics
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteAnnotationSearchMetrics(com.clarifai.grpc.api.DeleteAnnotationSearchMetricsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAnnotationSearchMetricsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a saved search.
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteSearch(com.clarifai.grpc.api.DeleteSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all the annotation filters.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiAnnotationFilterResponse listAnnotationFilters(com.clarifai.grpc.api.ListAnnotationFiltersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAnnotationFiltersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific annotation filter.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleAnnotationFilterResponse getAnnotationFilter(com.clarifai.grpc.api.GetAnnotationFilterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnnotationFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add annotation filters.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiAnnotationFilterResponse postAnnotationFilters(com.clarifai.grpc.api.PostAnnotationFiltersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostAnnotationFiltersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Patch one or more annotation filters.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiAnnotationFilterResponse patchAnnotationFilters(com.clarifai.grpc.api.PatchAnnotationFiltersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPatchAnnotationFiltersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete one or more annotation filters in a single request.
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteAnnotationFilters(com.clarifai.grpc.api.DeleteAnnotationFiltersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAnnotationFiltersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all status codes.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiStatusCodeResponse listStatusCodes(com.clarifai.grpc.api.ListStatusCodesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListStatusCodesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get more details for a status code.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleStatusCodeResponse getStatusCode(com.clarifai.grpc.api.GetStatusCodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStatusCodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * owner list users who the app is shared with
     * </pre>
     */
    public com.clarifai.grpc.api.MultiCollaboratorsResponse listCollaborators(com.clarifai.grpc.api.ListCollaboratorsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCollaboratorsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * add collaborators to an app.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiCollaboratorsResponse postCollaborators(com.clarifai.grpc.api.PostCollaboratorsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostCollaboratorsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Patch existing collaborators.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiCollaboratorsResponse patchCollaborators(com.clarifai.grpc.api.PatchCollaboratorsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPatchCollaboratorsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete existing collaborators.
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteCollaborators(com.clarifai.grpc.api.DeleteCollaboratorsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCollaboratorsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Collaboration includes the app user are invitied to work on
     * </pre>
     */
    public com.clarifai.grpc.api.MultiCollaborationsResponse listCollaborations(com.clarifai.grpc.api.ListCollaborationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCollaborationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * start to duplicate an app which copies all the inputs, annotations, models, concepts etc. to a new app.
     * this is an async process, you should use ListAppDuplications or GetAppDuplication to check the status.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiAppDuplicationsResponse postAppDuplications(com.clarifai.grpc.api.PostAppDuplicationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostAppDuplicationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * list all the app duplications user triggers
     * </pre>
     */
    public com.clarifai.grpc.api.MultiAppDuplicationsResponse listAppDuplications(com.clarifai.grpc.api.ListAppDuplicationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAppDuplicationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get the app duplication status
     * </pre>
     */
    public com.clarifai.grpc.api.SingleAppDuplicationResponse getAppDuplication(com.clarifai.grpc.api.GetAppDuplicationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAppDuplicationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add tasks to an app.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiTaskResponse postTasks(com.clarifai.grpc.api.PostTasksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostTasksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Task annotation count
     * </pre>
     */
    public com.clarifai.grpc.api.SingleTaskCountResponse getTaskAnnotationCount(com.clarifai.grpc.api.GetTaskCountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTaskAnnotationCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Task Input count
     * </pre>
     */
    public com.clarifai.grpc.api.SingleTaskCountResponse getTaskInputCount(com.clarifai.grpc.api.GetTaskCountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTaskInputCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific task from an app.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleTaskResponse getTask(com.clarifai.grpc.api.GetTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTaskMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List tasks from an app.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiTaskResponse listTasks(com.clarifai.grpc.api.ListTasksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTasksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Patch one or more tasks.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiTaskResponse patchTasks(com.clarifai.grpc.api.PatchTasksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPatchTasksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete multiple tasks in one request.
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteTasks(com.clarifai.grpc.api.DeleteTasksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTasksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add Label orders.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiLabelOrderResponse postLabelOrders(com.clarifai.grpc.api.PostLabelOrdersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostLabelOrdersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a label order.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleLabelOrderResponse getLabelOrder(com.clarifai.grpc.api.GetLabelOrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLabelOrderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List label orders.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiLabelOrderResponse listLabelOrders(com.clarifai.grpc.api.ListLabelOrdersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListLabelOrdersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Patch one or more label orders.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiLabelOrderResponse patchLabelOrders(com.clarifai.grpc.api.PatchLabelOrdersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPatchLabelOrdersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete multiple label orders in one request.
     * this do not change task status
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteLabelOrders(com.clarifai.grpc.api.DeleteLabelOrdersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteLabelOrdersMethod(), getCallOptions(), request);
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostCollectorsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific collector from an app.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleCollectorResponse getCollector(com.clarifai.grpc.api.GetCollectorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCollectorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all the collectors.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiCollectorResponse listCollectors(com.clarifai.grpc.api.ListCollectorsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCollectorsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Patch one or more collectors.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiCollectorResponse patchCollectors(com.clarifai.grpc.api.PatchCollectorsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPatchCollectorsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete multiple collectors in one request.
     * This call is asynchronous. Use DeleteCollector if you want a synchronous version.
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteCollectors(com.clarifai.grpc.api.DeleteCollectorsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCollectorsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PostStatValues
     * </pre>
     */
    public com.clarifai.grpc.api.MultiStatValueResponse postStatValues(com.clarifai.grpc.api.PostStatValuesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostStatValuesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PostStatValuesAggregate
     * </pre>
     */
    public com.clarifai.grpc.api.MultiStatValueAggregateResponse postStatValuesAggregate(com.clarifai.grpc.api.PostStatValuesAggregateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostStatValuesAggregateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Increase the view metric for a detail view
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse postTrendingMetricsView(com.clarifai.grpc.api.PostTrendingMetricsViewRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostTrendingMetricsViewMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List the view metrics for a detail view
     * </pre>
     */
    public com.clarifai.grpc.api.MultiTrendingMetricsViewResponse listTrendingMetricsViews(com.clarifai.grpc.api.ListTrendingMetricsViewsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTrendingMetricsViewsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific module from an app.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleModuleResponse getModule(com.clarifai.grpc.api.GetModuleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetModuleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all the modules in community, by user or by app.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiModuleResponse listModules(com.clarifai.grpc.api.ListModulesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListModulesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a modules to an app.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiModuleResponse postModules(com.clarifai.grpc.api.PostModulesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostModulesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Patch one or more modules.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiModuleResponse patchModules(com.clarifai.grpc.api.PatchModulesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPatchModulesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete multiple modules in one request.
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteModules(com.clarifai.grpc.api.DeleteModulesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteModulesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific module version for a module.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleModuleVersionResponse getModuleVersion(com.clarifai.grpc.api.GetModuleVersionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetModuleVersionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all the modules versions for a given module.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiModuleVersionResponse listModuleVersions(com.clarifai.grpc.api.ListModuleVersionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListModuleVersionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new module version to trigger training of the module.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiModuleVersionResponse postModuleVersions(com.clarifai.grpc.api.PostModuleVersionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostModuleVersionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a multiple module version.
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteModuleVersions(com.clarifai.grpc.api.DeleteModuleVersionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteModuleVersionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get installed modules vesrions for an app.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleInstalledModuleVersionResponse getInstalledModuleVersion(com.clarifai.grpc.api.GetInstalledModuleVersionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetInstalledModuleVersionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List installed modules vesrions for an app.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiInstalledModuleVersionResponse listInstalledModuleVersions(com.clarifai.grpc.api.ListInstalledModuleVersionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListInstalledModuleVersionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Install a new module version which will deploy the specific ModuleVersion to the app in the url.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiInstalledModuleVersionResponse postInstalledModuleVersions(com.clarifai.grpc.api.PostInstalledModuleVersionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostInstalledModuleVersionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Uninstall an installed module version which will deploy the specific ModuleVersion to the app
     * in the url.
     * This cleaned up any associated caller keys so needs the Keys_Delete scope.
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteInstalledModuleVersions(com.clarifai.grpc.api.DeleteInstalledModuleVersionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteInstalledModuleVersionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Assign a key that the caller owns to be used when accessing this installed module version
     * If this endpoint is called with a different key then it overwrites what is there.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleKeyResponse postInstalledModuleVersionsKey(com.clarifai.grpc.api.PostInstalledModuleVersionsKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostInstalledModuleVersionsKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Perform bulk operations on a list of inputs based on input source.
     * Operation include add, update, delete of concepts, metadata and geo data.
     * This is an Asynchronous process. Use ListBulkOperations or GetBulkOperation to check the status.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiBulkOperationsResponse postBulkOperations(com.clarifai.grpc.api.PostBulkOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostBulkOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all the bulk operations
     * </pre>
     */
    public com.clarifai.grpc.api.MultiBulkOperationsResponse listBulkOperations(com.clarifai.grpc.api.ListBulkOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListBulkOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the bulk operation details by ID
     * </pre>
     */
    public com.clarifai.grpc.api.SingleBulkOperationsResponse getBulkOperation(com.clarifai.grpc.api.GetBulkOperationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBulkOperationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Cancel one or more bulk operations
     * </pre>
     */
    public com.clarifai.grpc.api.MultiBulkOperationsResponse cancelBulkOperations(com.clarifai.grpc.api.CancelBulkOperationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelBulkOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * delete one or more terminated bulk operations
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteBulkOperations(com.clarifai.grpc.api.DeleteBulkOperationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteBulkOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific job.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleDatasetInputsSearchAddJobResponse getDatasetInputsSearchAddJob(com.clarifai.grpc.api.GetDatasetInputsSearchAddJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDatasetInputsSearchAddJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all the inputs add jobs
     * </pre>
     */
    public com.clarifai.grpc.api.MultiInputsAddJobResponse listInputsAddJobs(com.clarifai.grpc.api.ListInputsAddJobsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListInputsAddJobsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the input add job details by ID
     * </pre>
     */
    public com.clarifai.grpc.api.SingleInputsAddJobResponse getInputsAddJob(com.clarifai.grpc.api.GetInputsAddJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetInputsAddJobMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.clarifai.grpc.api.MultiUploadResponse postUploads(com.clarifai.grpc.api.PostUploadsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostUploadsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.clarifai.grpc.api.SingleUploadResponse putUploadContentParts(com.clarifai.grpc.api.PutUploadContentPartsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPutUploadContentPartsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.clarifai.grpc.api.SingleUploadResponse getUpload(com.clarifai.grpc.api.GetUploadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUploadMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.clarifai.grpc.api.MultiUploadResponse listUploads(com.clarifai.grpc.api.ListUploadsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUploadsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteUploads(com.clarifai.grpc.api.DeleteUploadsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUploadsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.clarifai.grpc.api.MultiInputsAddJobResponse postInputsDataSources(com.clarifai.grpc.api.PostInputsDataSourcesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostInputsDataSourcesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the input extraction job details by ID
     * </pre>
     */
    public com.clarifai.grpc.api.SingleInputsExtractionJobResponse getInputsExtractionJob(com.clarifai.grpc.api.GetInputsExtractionJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetInputsExtractionJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all the input extraction jobs
     * </pre>
     */
    public com.clarifai.grpc.api.MultiInputsExtractionJobResponse listInputsExtractionJobs(com.clarifai.grpc.api.ListInputsExtractionJobsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListInputsExtractionJobsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.clarifai.grpc.api.MultiInputsExtractionJobResponse cancelInputsExtractionJobs(com.clarifai.grpc.api.CancelInputsExtractionJobsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelInputsExtractionJobsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.clarifai.grpc.api.MultiInputsAddJobResponse postInputsUploads(com.clarifai.grpc.api.PostInputsUploadsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostInputsUploadsMethod(), getCallOptions(), request);
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListConceptRelationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Post concept relations to create relations between concepts in the platform.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiConceptRelationResponse> postConceptRelations(
        com.clarifai.grpc.api.PostConceptRelationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostConceptRelationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Post concept relations to create relations between concepts in the platform.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteConceptRelations(
        com.clarifai.grpc.api.DeleteConceptRelationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteConceptRelationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all the concepts with their positive and negative counts
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiConceptCountResponse> getConceptCounts(
        com.clarifai.grpc.api.GetConceptCountsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetConceptCountsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific concept from an app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleConceptResponse> getConcept(
        com.clarifai.grpc.api.GetConceptRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetConceptMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all the concepts.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiConceptResponse> listConcepts(
        com.clarifai.grpc.api.ListConceptsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListConceptsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List models concepts.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiConceptResponse> listModelConcepts(
        com.clarifai.grpc.api.ListModelConceptsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListModelConceptsMethod(), getCallOptions()), request);
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostConceptsSearchesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add a concept to an app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiConceptResponse> postConcepts(
        com.clarifai.grpc.api.PostConceptsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostConceptsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Patch one or more concepts.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiConceptResponse> patchConcepts(
        com.clarifai.grpc.api.PatchConceptsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPatchConceptsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific concept from an app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleConceptLanguageResponse> getConceptLanguage(
        com.clarifai.grpc.api.GetConceptLanguageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetConceptLanguageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List the concept in all the translated languages.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiConceptLanguageResponse> listConceptLanguages(
        com.clarifai.grpc.api.ListConceptLanguagesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListConceptLanguagesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add a new translation for this concept.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiConceptLanguageResponse> postConceptLanguages(
        com.clarifai.grpc.api.PostConceptLanguagesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPatchConceptLanguagesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all domain graphs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiKnowledgeGraphResponse> listKnowledgeGraphs(
        com.clarifai.grpc.api.ListKnowledgeGraphsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListKnowledgeGraphsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Post domain graphs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiKnowledgeGraphResponse> postKnowledgeGraphs(
        com.clarifai.grpc.api.PostKnowledgeGraphsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostKnowledgeGraphsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Start concept mapping jobs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiConceptMappingJobResponse> postConceptMappingJobs(
        com.clarifai.grpc.api.PostConceptMappingJobsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostConceptMappingJobsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific annotation from an app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleAnnotationResponse> getAnnotation(
        com.clarifai.grpc.api.GetAnnotationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnnotationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all the annotation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiAnnotationResponse> listAnnotations(
        com.clarifai.grpc.api.ListAnnotationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAnnotationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Post annotations.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiAnnotationResponse> postAnnotations(
        com.clarifai.grpc.api.PostAnnotationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostAnnotationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Patch one or more annotations.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiAnnotationResponse> patchAnnotations(
        com.clarifai.grpc.api.PatchAnnotationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPatchAnnotationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Patch annotations status by worker id and task id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.PatchAnnotationsStatusResponse> patchAnnotationsStatus(
        com.clarifai.grpc.api.PatchAnnotationsStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPatchAnnotationsStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a single annotation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteAnnotation(
        com.clarifai.grpc.api.DeleteAnnotationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAnnotationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete multiple annotations in one request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteAnnotations(
        com.clarifai.grpc.api.DeleteAnnotationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAnnotationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Patch saved annotations searches by ids.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiSearchResponse> patchAnnotationsSearches(
        com.clarifai.grpc.api.PatchAnnotationsSearchesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPatchAnnotationsSearchesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Execute a search over annotations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiSearchResponse> postAnnotationsSearches(
        com.clarifai.grpc.api.PostAnnotationsSearchesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostAnnotationsSearchesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get input count per status.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleInputCountResponse> getInputCount(
        com.clarifai.grpc.api.GetInputCountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetInputCountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Streams all the inputs starting from oldest assets.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiInputResponse> streamInputs(
        com.clarifai.grpc.api.StreamInputsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStreamInputsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific input from an app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiInputAnnotationResponse> getInputSamples(
        com.clarifai.grpc.api.GetInputSamplesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetInputSamplesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific input from an app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleInputResponse> getInput(
        com.clarifai.grpc.api.GetInputRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetInputMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all the inputs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiInputResponse> listInputs(
        com.clarifai.grpc.api.ListInputsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostInputsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Patch one or more inputs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiInputResponse> patchInputs(
        com.clarifai.grpc.api.PatchInputsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPatchInputsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a single input asynchronously.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteInput(
        com.clarifai.grpc.api.DeleteInputRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteInputsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Patch saved inputs searches by ids.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiSearchResponse> patchInputsSearches(
        com.clarifai.grpc.api.PatchInputsSearchesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPatchInputsSearchesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Execute a search over inputs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiSearchResponse> postInputsSearches(
        com.clarifai.grpc.api.PostInputsSearchesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostInputsSearchesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get predicted outputs from the model.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiOutputResponse> postModelOutputs(
        com.clarifai.grpc.api.PostModelOutputsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostModelOutputsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all the datasets.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiDatasetResponse> listDatasets(
        com.clarifai.grpc.api.ListDatasetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDatasetsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific dataset.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleDatasetResponse> getDataset(
        com.clarifai.grpc.api.GetDatasetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDatasetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add datasets to an app.
     * The process is atomic, i.e. either all or no datasets are added.
     * If there is an error for one dataset,
     * the process will stop, revert the transaction and return the error.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiDatasetResponse> postDatasets(
        com.clarifai.grpc.api.PostDatasetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostDatasetsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Patch one or more datasets.
     * The process is atomic, i.e. either all or no datasets are patched.
     * If there is an error for one dataset,
     * the process will stop, revert the transaction and return the error.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiDatasetResponse> patchDatasets(
        com.clarifai.grpc.api.PatchDatasetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPatchDatasetsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Patch one or more dataset ids.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiDatasetResponse> patchDatasetIds(
        com.clarifai.grpc.api.PatchDatasetIdsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPatchDatasetIdsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete one or more datasets in a single request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteDatasets(
        com.clarifai.grpc.api.DeleteDatasetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDatasetsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all the dataset inputs in a dataset.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiDatasetInputResponse> listDatasetInputs(
        com.clarifai.grpc.api.ListDatasetInputsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDatasetInputsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific dataset input.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleDatasetInputResponse> getDatasetInput(
        com.clarifai.grpc.api.GetDatasetInputRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDatasetInputMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add dataset inputs to a dataset.
     * The process is not atomic, i.e. if there are errors with some dataset
     * inputs, others might still be added. The response reports
     *   - SUCCESS if all dataset inputs were added,
     *   - MIXED_STATUS if only some dataset inputs were added, and
     *   - FAILURE if no dataset inputs were added.
     * Each individual dataset input in the response has the status set to
     * indicate if it was successful or if there was an error.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiDatasetInputResponse> postDatasetInputs(
        com.clarifai.grpc.api.PostDatasetInputsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostDatasetInputsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete one or more dataset inputs in a single request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteDatasetInputs(
        com.clarifai.grpc.api.DeleteDatasetInputsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDatasetInputsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all the dataset versions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiDatasetVersionResponse> listDatasetVersions(
        com.clarifai.grpc.api.ListDatasetVersionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDatasetVersionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific dataset version.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleDatasetVersionResponse> getDatasetVersion(
        com.clarifai.grpc.api.GetDatasetVersionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDatasetVersionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiDatasetVersionMetricsGroupResponse> listDatasetVersionMetricsGroups(
        com.clarifai.grpc.api.ListDatasetVersionMetricsGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDatasetVersionMetricsGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add dataset versions to a dataset.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiDatasetVersionResponse> postDatasetVersions(
        com.clarifai.grpc.api.PostDatasetVersionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostDatasetVersionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Patch one or more dataset versions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiDatasetVersionResponse> patchDatasetVersions(
        com.clarifai.grpc.api.PatchDatasetVersionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPatchDatasetVersionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete one or more dataset versions in a single request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteDatasetVersions(
        com.clarifai.grpc.api.DeleteDatasetVersionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDatasetVersionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create export of a dataset version.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiDatasetVersionExportResponse> putDatasetVersionExports(
        com.clarifai.grpc.api.PutDatasetVersionExportsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPutDatasetVersionExportsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific model type.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleModelTypeResponse> getModelType(
        com.clarifai.grpc.api.GetModelTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetModelTypeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all the supported open source licenses in the platform.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.ListOpenSourceLicensesResponse> listOpenSourceLicenses(
        com.clarifai.grpc.api.ListOpenSourceLicensesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOpenSourceLicensesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all the model types available in the platform.
     * This MUST be above ListModels so that the /models/types endpoint takes precedence.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiModelTypeResponse> listModelTypes(
        com.clarifai.grpc.api.ListModelTypesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListModelTypesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific model from an app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleModelResponse> getModel(
        com.clarifai.grpc.api.GetModelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetModelOutputInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all the models.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiModelResponse> listModels(
        com.clarifai.grpc.api.ListModelsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostModelsSearchesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add a models to an app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleModelResponse> postModels(
        com.clarifai.grpc.api.PostModelsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostModelsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Patch one or more models.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiModelResponse> patchModels(
        com.clarifai.grpc.api.PatchModelsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPatchModelsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Patch one or more models ids.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiModelResponse> patchModelIds(
        com.clarifai.grpc.api.PatchModelIdsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPatchModelIdsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a single model.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteModel(
        com.clarifai.grpc.api.DeleteModelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteModelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete multiple models in one request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteModels(
        com.clarifai.grpc.api.DeleteModelsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteModelsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update model check consents
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiModelCheckConsentResponse> patchModelCheckConsents(
        com.clarifai.grpc.api.PatchModelCheckConsentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPatchModelCheckConsentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update model toolkits tags
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiModelToolkitResponse> patchModelToolkits(
        com.clarifai.grpc.api.PatchModelToolkitsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPatchModelToolkitsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update model use_cases tags
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiModelUseCaseResponse> patchModelUseCases(
        com.clarifai.grpc.api.PatchModelUseCasesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPatchModelUseCasesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update model languages tags
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiModelLanguageResponse> patchModelLanguages(
        com.clarifai.grpc.api.PatchModelLanguagesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPatchModelLanguagesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all the inputs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiInputResponse> listModelInputs(
        com.clarifai.grpc.api.ListModelInputsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListModelInputsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific model from an app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleModelVersionResponse> getModelVersion(
        com.clarifai.grpc.api.GetModelVersionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetModelVersionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all the models.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiModelVersionResponse> listModelVersions(
        com.clarifai.grpc.api.ListModelVersionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListModelVersionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> postWorkflowVersionsUnPublish(
        com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostWorkflowVersionsUnPublishMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> postWorkflowVersionsPublish(
        com.clarifai.grpc.api.PostWorkflowVersionsPublishRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostWorkflowVersionsPublishMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PostModelVersionsPublish
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> postModelVersionsPublish(
        com.clarifai.grpc.api.PostModelVersionsPublishRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostModelVersionsPublishMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PostModelVersionsUnPublish
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> postModelVersionsUnPublish(
        com.clarifai.grpc.api.PostModelVersionsUnPublishRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostModelVersionsUnPublishMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a new model version to trigger training of the model.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleModelResponse> postModelVersions(
        com.clarifai.grpc.api.PostModelVersionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostModelVersionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PatchModelVersions
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiModelVersionResponse> patchModelVersions(
        com.clarifai.grpc.api.PatchModelVersionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPatchModelVersionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a single model.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteModelVersion(
        com.clarifai.grpc.api.DeleteModelVersionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteModelVersionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deprecated: Use GetModelVersionEvaluation instead
     * Get the evaluation metrics for a model version.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleModelVersionResponse> getModelVersionMetrics(
        com.clarifai.grpc.api.GetModelVersionMetricsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetModelVersionMetricsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deprecated, use PostModelVersionEvaluations instead
     * Run the evaluation metrics for a model version.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleModelVersionResponse> postModelVersionMetrics(
        com.clarifai.grpc.api.PostModelVersionMetricsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostModelVersionMetricsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiEvalMetricsResponse> postModelVersionEvaluations(
        com.clarifai.grpc.api.PostModelVersionEvaluationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostModelVersionEvaluationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List the evaluation metrics for a model version.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiEvalMetricsResponse> listModelVersionEvaluations(
        com.clarifai.grpc.api.ListModelVersionEvaluationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListModelVersionEvaluationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an evaluation metrics for a model version.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleEvalMetricsResponse> getModelVersionEvaluation(
        com.clarifai.grpc.api.GetModelVersionEvaluationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetModelVersionEvaluationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists model references tied to a particular model id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiModelReferenceResponse> listModelReferences(
        com.clarifai.grpc.api.ListModelReferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListModelReferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetModelVersionInputExample
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleModelVersionInputExampleResponse> getModelVersionInputExample(
        com.clarifai.grpc.api.GetModelVersionInputExampleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetModelVersionInputExampleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListModelVersionInputExamples
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiModelVersionInputExampleResponse> listModelVersionInputExamples(
        com.clarifai.grpc.api.ListModelVersionInputExamplesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListModelVersionInputExamplesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific workflow from an app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleWorkflowResponse> getWorkflow(
        com.clarifai.grpc.api.GetWorkflowRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWorkflowMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all the workflows.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiWorkflowResponse> listWorkflows(
        com.clarifai.grpc.api.ListWorkflowsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListWorkflowsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add a workflow to an app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiWorkflowResponse> postWorkflows(
        com.clarifai.grpc.api.PostWorkflowsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostWorkflowsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Patch one or more workflows.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiWorkflowResponse> patchWorkflows(
        com.clarifai.grpc.api.PatchWorkflowsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPatchWorkflowsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Patch one or more workflows ids.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiWorkflowResponse> patchWorkflowIds(
        com.clarifai.grpc.api.PatchWorkflowIdsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPatchWorkflowIdsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a single workflow.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteWorkflow(
        com.clarifai.grpc.api.DeleteWorkflowRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteWorkflowMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete multiple workflows in one request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteWorkflows(
        com.clarifai.grpc.api.DeleteWorkflowsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteWorkflowsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Predict using a workflow.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.PostWorkflowResultsResponse> postWorkflowResults(
        com.clarifai.grpc.api.PostWorkflowResultsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostWorkflowResultsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Compare embeddings distances using a workflow
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.PostWorkflowResultsSimilarityResponse> postWorkflowResultsSimilarity(
        com.clarifai.grpc.api.PostWorkflowResultsSimilarityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostWorkflowResultsSimilarityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List workflow versions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiWorkflowVersionResponse> listWorkflowVersions(
        com.clarifai.grpc.api.ListWorkflowVersionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListWorkflowVersionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get single workflow version.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleWorkflowVersionResponse> getWorkflowVersion(
        com.clarifai.grpc.api.GetWorkflowVersionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWorkflowVersionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete workflow versions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteWorkflowVersions(
        com.clarifai.grpc.api.DeleteWorkflowVersionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteWorkflowVersionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Patch workflow versions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiWorkflowVersionResponse> patchWorkflowVersions(
        com.clarifai.grpc.api.PatchWorkflowVersionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPatchWorkflowVersionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific key from an app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleKeyResponse> getKey(
        com.clarifai.grpc.api.GetKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all the keys.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiKeyResponse> listKeys(
        com.clarifai.grpc.api.ListKeysRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListKeysMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List keys by app_id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiKeyResponse> listAppKeys(
        com.clarifai.grpc.api.ListAppKeysRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add a key to an app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiKeyResponse> postKeys(
        com.clarifai.grpc.api.PostKeysRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostKeysMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Patch one or more keys.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiKeyResponse> patchKeys(
        com.clarifai.grpc.api.PatchKeysRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMyScopesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiScopeUserResponse> myScopesUser(
        com.clarifai.grpc.api.MyScopesUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMyScopesUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiScopeRootResponse> myScopesRoot(
        com.clarifai.grpc.api.MyScopesRootRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMyScopesRootMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all auth scopes available to me as a user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiScopeDepsResponse> listScopes(
        com.clarifai.grpc.api.ListScopesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListScopesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific app from an app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleAppResponse> getApp(
        com.clarifai.grpc.api.GetAppRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAppMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all the apps.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiAppResponse> listApps(
        com.clarifai.grpc.api.ListAppsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostAppsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Patch one or more apps.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiAppResponse> patchApps(
        com.clarifai.grpc.api.PatchAppsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPatchAppsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Patch apps ids.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiAppResponse> patchAppsIds(
        com.clarifai.grpc.api.PatchAppsIdsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPatchAppsIdsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Patch one app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleAppResponse> patchApp(
        com.clarifai.grpc.api.PatchAppRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPatchAppMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Search over the applications to find one or more you're looking for.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiAppResponse> postAppsSearches(
        com.clarifai.grpc.api.PostAppsSearchesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostAppsSearchesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Validate new password in real-time for a user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SinglePasswordValidationResponse> postValidatePassword(
        com.clarifai.grpc.api.PostValidatePasswordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostValidatePasswordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a saved legacy search.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleSearchResponse> getSearch(
        com.clarifai.grpc.api.GetSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all saved legacy searches.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiSearchResponse> listSearches(
        com.clarifai.grpc.api.ListSearchesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSearchesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Patch saved legacy searches by ids.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiSearchResponse> patchSearches(
        com.clarifai.grpc.api.PatchSearchesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPatchSearchesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Execute a new search and optionally save it.
     * Deprecated: Use PostInputsSearches or PostAnnotationsSearches instead.
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiSearchResponse> postSearches(
        com.clarifai.grpc.api.PostSearchesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostSearchesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Execute a previously saved legacy search.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiSearchResponse> postSearchesByID(
        com.clarifai.grpc.api.PostSearchesByIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostSearchesByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Evaluate the results of two search requests
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse> postAnnotationSearchMetrics(
        com.clarifai.grpc.api.PostAnnotationSearchMetricsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostAnnotationSearchMetricsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the evaluation results between two search requests
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse> getAnnotationSearchMetrics(
        com.clarifai.grpc.api.GetAnnotationSearchMetricsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnnotationSearchMetricsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List the evaluation results between two search requests
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse> listAnnotationSearchMetrics(
        com.clarifai.grpc.api.ListAnnotationSearchMetricsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAnnotationSearchMetricsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteAnnotationSearchMetrics
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteAnnotationSearchMetrics(
        com.clarifai.grpc.api.DeleteAnnotationSearchMetricsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAnnotationSearchMetricsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a saved search.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteSearch(
        com.clarifai.grpc.api.DeleteSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all the annotation filters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiAnnotationFilterResponse> listAnnotationFilters(
        com.clarifai.grpc.api.ListAnnotationFiltersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAnnotationFiltersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific annotation filter.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleAnnotationFilterResponse> getAnnotationFilter(
        com.clarifai.grpc.api.GetAnnotationFilterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnnotationFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add annotation filters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiAnnotationFilterResponse> postAnnotationFilters(
        com.clarifai.grpc.api.PostAnnotationFiltersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostAnnotationFiltersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Patch one or more annotation filters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiAnnotationFilterResponse> patchAnnotationFilters(
        com.clarifai.grpc.api.PatchAnnotationFiltersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPatchAnnotationFiltersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete one or more annotation filters in a single request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteAnnotationFilters(
        com.clarifai.grpc.api.DeleteAnnotationFiltersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAnnotationFiltersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all status codes.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiStatusCodeResponse> listStatusCodes(
        com.clarifai.grpc.api.ListStatusCodesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListStatusCodesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get more details for a status code.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleStatusCodeResponse> getStatusCode(
        com.clarifai.grpc.api.GetStatusCodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStatusCodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * owner list users who the app is shared with
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiCollaboratorsResponse> listCollaborators(
        com.clarifai.grpc.api.ListCollaboratorsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCollaboratorsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * add collaborators to an app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiCollaboratorsResponse> postCollaborators(
        com.clarifai.grpc.api.PostCollaboratorsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostCollaboratorsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Patch existing collaborators.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiCollaboratorsResponse> patchCollaborators(
        com.clarifai.grpc.api.PatchCollaboratorsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPatchCollaboratorsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete existing collaborators.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteCollaborators(
        com.clarifai.grpc.api.DeleteCollaboratorsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCollaboratorsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Collaboration includes the app user are invitied to work on
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiCollaborationsResponse> listCollaborations(
        com.clarifai.grpc.api.ListCollaborationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostAppDuplicationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * list all the app duplications user triggers
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiAppDuplicationsResponse> listAppDuplications(
        com.clarifai.grpc.api.ListAppDuplicationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAppDuplicationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get the app duplication status
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleAppDuplicationResponse> getAppDuplication(
        com.clarifai.grpc.api.GetAppDuplicationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAppDuplicationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add tasks to an app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiTaskResponse> postTasks(
        com.clarifai.grpc.api.PostTasksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostTasksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Task annotation count
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleTaskCountResponse> getTaskAnnotationCount(
        com.clarifai.grpc.api.GetTaskCountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTaskAnnotationCountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Task Input count
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleTaskCountResponse> getTaskInputCount(
        com.clarifai.grpc.api.GetTaskCountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTaskInputCountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific task from an app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleTaskResponse> getTask(
        com.clarifai.grpc.api.GetTaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTaskMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List tasks from an app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiTaskResponse> listTasks(
        com.clarifai.grpc.api.ListTasksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTasksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Patch one or more tasks.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiTaskResponse> patchTasks(
        com.clarifai.grpc.api.PatchTasksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPatchTasksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete multiple tasks in one request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteTasks(
        com.clarifai.grpc.api.DeleteTasksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTasksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add Label orders.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiLabelOrderResponse> postLabelOrders(
        com.clarifai.grpc.api.PostLabelOrdersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostLabelOrdersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a label order.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleLabelOrderResponse> getLabelOrder(
        com.clarifai.grpc.api.GetLabelOrderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLabelOrderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List label orders.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiLabelOrderResponse> listLabelOrders(
        com.clarifai.grpc.api.ListLabelOrdersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListLabelOrdersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Patch one or more label orders.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiLabelOrderResponse> patchLabelOrders(
        com.clarifai.grpc.api.PatchLabelOrdersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPatchLabelOrdersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete multiple label orders in one request.
     * this do not change task status
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteLabelOrders(
        com.clarifai.grpc.api.DeleteLabelOrdersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteLabelOrdersMethod(), getCallOptions()), request);
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostCollectorsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific collector from an app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleCollectorResponse> getCollector(
        com.clarifai.grpc.api.GetCollectorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCollectorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all the collectors.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiCollectorResponse> listCollectors(
        com.clarifai.grpc.api.ListCollectorsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCollectorsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Patch one or more collectors.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiCollectorResponse> patchCollectors(
        com.clarifai.grpc.api.PatchCollectorsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCollectorsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PostStatValues
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiStatValueResponse> postStatValues(
        com.clarifai.grpc.api.PostStatValuesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostStatValuesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PostStatValuesAggregate
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiStatValueAggregateResponse> postStatValuesAggregate(
        com.clarifai.grpc.api.PostStatValuesAggregateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostStatValuesAggregateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Increase the view metric for a detail view
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> postTrendingMetricsView(
        com.clarifai.grpc.api.PostTrendingMetricsViewRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostTrendingMetricsViewMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List the view metrics for a detail view
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiTrendingMetricsViewResponse> listTrendingMetricsViews(
        com.clarifai.grpc.api.ListTrendingMetricsViewsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTrendingMetricsViewsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific module from an app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleModuleResponse> getModule(
        com.clarifai.grpc.api.GetModuleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetModuleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all the modules in community, by user or by app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiModuleResponse> listModules(
        com.clarifai.grpc.api.ListModulesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListModulesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add a modules to an app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiModuleResponse> postModules(
        com.clarifai.grpc.api.PostModulesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostModulesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Patch one or more modules.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiModuleResponse> patchModules(
        com.clarifai.grpc.api.PatchModulesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPatchModulesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete multiple modules in one request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteModules(
        com.clarifai.grpc.api.DeleteModulesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteModulesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific module version for a module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleModuleVersionResponse> getModuleVersion(
        com.clarifai.grpc.api.GetModuleVersionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetModuleVersionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all the modules versions for a given module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiModuleVersionResponse> listModuleVersions(
        com.clarifai.grpc.api.ListModuleVersionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListModuleVersionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a new module version to trigger training of the module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiModuleVersionResponse> postModuleVersions(
        com.clarifai.grpc.api.PostModuleVersionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostModuleVersionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a multiple module version.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteModuleVersions(
        com.clarifai.grpc.api.DeleteModuleVersionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteModuleVersionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get installed modules vesrions for an app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleInstalledModuleVersionResponse> getInstalledModuleVersion(
        com.clarifai.grpc.api.GetInstalledModuleVersionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetInstalledModuleVersionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List installed modules vesrions for an app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiInstalledModuleVersionResponse> listInstalledModuleVersions(
        com.clarifai.grpc.api.ListInstalledModuleVersionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListInstalledModuleVersionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Install a new module version which will deploy the specific ModuleVersion to the app in the url.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiInstalledModuleVersionResponse> postInstalledModuleVersions(
        com.clarifai.grpc.api.PostInstalledModuleVersionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostInstalledModuleVersionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Uninstall an installed module version which will deploy the specific ModuleVersion to the app
     * in the url.
     * This cleaned up any associated caller keys so needs the Keys_Delete scope.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteInstalledModuleVersions(
        com.clarifai.grpc.api.DeleteInstalledModuleVersionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteInstalledModuleVersionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Assign a key that the caller owns to be used when accessing this installed module version
     * If this endpoint is called with a different key then it overwrites what is there.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleKeyResponse> postInstalledModuleVersionsKey(
        com.clarifai.grpc.api.PostInstalledModuleVersionsKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostInstalledModuleVersionsKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Perform bulk operations on a list of inputs based on input source.
     * Operation include add, update, delete of concepts, metadata and geo data.
     * This is an Asynchronous process. Use ListBulkOperations or GetBulkOperation to check the status.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiBulkOperationsResponse> postBulkOperations(
        com.clarifai.grpc.api.PostBulkOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostBulkOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all the bulk operations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiBulkOperationsResponse> listBulkOperations(
        com.clarifai.grpc.api.ListBulkOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListBulkOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the bulk operation details by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleBulkOperationsResponse> getBulkOperation(
        com.clarifai.grpc.api.GetBulkOperationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBulkOperationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Cancel one or more bulk operations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiBulkOperationsResponse> cancelBulkOperations(
        com.clarifai.grpc.api.CancelBulkOperationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelBulkOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * delete one or more terminated bulk operations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteBulkOperations(
        com.clarifai.grpc.api.DeleteBulkOperationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteBulkOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleDatasetInputsSearchAddJobResponse> getDatasetInputsSearchAddJob(
        com.clarifai.grpc.api.GetDatasetInputsSearchAddJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDatasetInputsSearchAddJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all the inputs add jobs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiInputsAddJobResponse> listInputsAddJobs(
        com.clarifai.grpc.api.ListInputsAddJobsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListInputsAddJobsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the input add job details by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleInputsAddJobResponse> getInputsAddJob(
        com.clarifai.grpc.api.GetInputsAddJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetInputsAddJobMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiUploadResponse> postUploads(
        com.clarifai.grpc.api.PostUploadsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostUploadsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleUploadResponse> putUploadContentParts(
        com.clarifai.grpc.api.PutUploadContentPartsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPutUploadContentPartsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleUploadResponse> getUpload(
        com.clarifai.grpc.api.GetUploadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUploadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiUploadResponse> listUploads(
        com.clarifai.grpc.api.ListUploadsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUploadsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteUploads(
        com.clarifai.grpc.api.DeleteUploadsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUploadsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiInputsAddJobResponse> postInputsDataSources(
        com.clarifai.grpc.api.PostInputsDataSourcesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostInputsDataSourcesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the input extraction job details by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleInputsExtractionJobResponse> getInputsExtractionJob(
        com.clarifai.grpc.api.GetInputsExtractionJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetInputsExtractionJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all the input extraction jobs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiInputsExtractionJobResponse> listInputsExtractionJobs(
        com.clarifai.grpc.api.ListInputsExtractionJobsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListInputsExtractionJobsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiInputsExtractionJobResponse> cancelInputsExtractionJobs(
        com.clarifai.grpc.api.CancelInputsExtractionJobsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelInputsExtractionJobsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.MultiInputsAddJobResponse> postInputsUploads(
        com.clarifai.grpc.api.PostInputsUploadsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostInputsUploadsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_CONCEPT_RELATIONS = 0;
  private static final int METHODID_POST_CONCEPT_RELATIONS = 1;
  private static final int METHODID_DELETE_CONCEPT_RELATIONS = 2;
  private static final int METHODID_GET_CONCEPT_COUNTS = 3;
  private static final int METHODID_GET_CONCEPT = 4;
  private static final int METHODID_LIST_CONCEPTS = 5;
  private static final int METHODID_LIST_MODEL_CONCEPTS = 6;
  private static final int METHODID_POST_CONCEPTS_SEARCHES = 7;
  private static final int METHODID_POST_CONCEPTS = 8;
  private static final int METHODID_PATCH_CONCEPTS = 9;
  private static final int METHODID_GET_CONCEPT_LANGUAGE = 10;
  private static final int METHODID_LIST_CONCEPT_LANGUAGES = 11;
  private static final int METHODID_POST_CONCEPT_LANGUAGES = 12;
  private static final int METHODID_PATCH_CONCEPT_LANGUAGES = 13;
  private static final int METHODID_LIST_KNOWLEDGE_GRAPHS = 14;
  private static final int METHODID_POST_KNOWLEDGE_GRAPHS = 15;
  private static final int METHODID_POST_CONCEPT_MAPPING_JOBS = 16;
  private static final int METHODID_GET_ANNOTATION = 17;
  private static final int METHODID_LIST_ANNOTATIONS = 18;
  private static final int METHODID_POST_ANNOTATIONS = 19;
  private static final int METHODID_PATCH_ANNOTATIONS = 20;
  private static final int METHODID_PATCH_ANNOTATIONS_STATUS = 21;
  private static final int METHODID_DELETE_ANNOTATION = 22;
  private static final int METHODID_DELETE_ANNOTATIONS = 23;
  private static final int METHODID_PATCH_ANNOTATIONS_SEARCHES = 24;
  private static final int METHODID_POST_ANNOTATIONS_SEARCHES = 25;
  private static final int METHODID_GET_INPUT_COUNT = 26;
  private static final int METHODID_STREAM_INPUTS = 27;
  private static final int METHODID_GET_INPUT_SAMPLES = 28;
  private static final int METHODID_GET_INPUT = 29;
  private static final int METHODID_LIST_INPUTS = 30;
  private static final int METHODID_POST_INPUTS = 31;
  private static final int METHODID_PATCH_INPUTS = 32;
  private static final int METHODID_DELETE_INPUT = 33;
  private static final int METHODID_DELETE_INPUTS = 34;
  private static final int METHODID_PATCH_INPUTS_SEARCHES = 35;
  private static final int METHODID_POST_INPUTS_SEARCHES = 36;
  private static final int METHODID_POST_MODEL_OUTPUTS = 37;
  private static final int METHODID_LIST_DATASETS = 38;
  private static final int METHODID_GET_DATASET = 39;
  private static final int METHODID_POST_DATASETS = 40;
  private static final int METHODID_PATCH_DATASETS = 41;
  private static final int METHODID_PATCH_DATASET_IDS = 42;
  private static final int METHODID_DELETE_DATASETS = 43;
  private static final int METHODID_LIST_DATASET_INPUTS = 44;
  private static final int METHODID_GET_DATASET_INPUT = 45;
  private static final int METHODID_POST_DATASET_INPUTS = 46;
  private static final int METHODID_DELETE_DATASET_INPUTS = 47;
  private static final int METHODID_LIST_DATASET_VERSIONS = 48;
  private static final int METHODID_GET_DATASET_VERSION = 49;
  private static final int METHODID_LIST_DATASET_VERSION_METRICS_GROUPS = 50;
  private static final int METHODID_POST_DATASET_VERSIONS = 51;
  private static final int METHODID_PATCH_DATASET_VERSIONS = 52;
  private static final int METHODID_DELETE_DATASET_VERSIONS = 53;
  private static final int METHODID_PUT_DATASET_VERSION_EXPORTS = 54;
  private static final int METHODID_GET_MODEL_TYPE = 55;
  private static final int METHODID_LIST_OPEN_SOURCE_LICENSES = 56;
  private static final int METHODID_LIST_MODEL_TYPES = 57;
  private static final int METHODID_GET_MODEL = 58;
  private static final int METHODID_GET_MODEL_OUTPUT_INFO = 59;
  private static final int METHODID_LIST_MODELS = 60;
  private static final int METHODID_POST_MODELS_SEARCHES = 61;
  private static final int METHODID_POST_MODELS = 62;
  private static final int METHODID_PATCH_MODELS = 63;
  private static final int METHODID_PATCH_MODEL_IDS = 64;
  private static final int METHODID_DELETE_MODEL = 65;
  private static final int METHODID_DELETE_MODELS = 66;
  private static final int METHODID_PATCH_MODEL_CHECK_CONSENTS = 67;
  private static final int METHODID_PATCH_MODEL_TOOLKITS = 68;
  private static final int METHODID_PATCH_MODEL_USE_CASES = 69;
  private static final int METHODID_PATCH_MODEL_LANGUAGES = 70;
  private static final int METHODID_LIST_MODEL_INPUTS = 71;
  private static final int METHODID_GET_MODEL_VERSION = 72;
  private static final int METHODID_LIST_MODEL_VERSIONS = 73;
  private static final int METHODID_POST_WORKFLOW_VERSIONS_UN_PUBLISH = 74;
  private static final int METHODID_POST_WORKFLOW_VERSIONS_PUBLISH = 75;
  private static final int METHODID_POST_MODEL_VERSIONS_PUBLISH = 76;
  private static final int METHODID_POST_MODEL_VERSIONS_UN_PUBLISH = 77;
  private static final int METHODID_POST_MODEL_VERSIONS = 78;
  private static final int METHODID_PATCH_MODEL_VERSIONS = 79;
  private static final int METHODID_DELETE_MODEL_VERSION = 80;
  private static final int METHODID_GET_MODEL_VERSION_METRICS = 81;
  private static final int METHODID_POST_MODEL_VERSION_METRICS = 82;
  private static final int METHODID_POST_MODEL_VERSION_EVALUATIONS = 83;
  private static final int METHODID_LIST_MODEL_VERSION_EVALUATIONS = 84;
  private static final int METHODID_GET_MODEL_VERSION_EVALUATION = 85;
  private static final int METHODID_LIST_MODEL_REFERENCES = 86;
  private static final int METHODID_GET_MODEL_VERSION_INPUT_EXAMPLE = 87;
  private static final int METHODID_LIST_MODEL_VERSION_INPUT_EXAMPLES = 88;
  private static final int METHODID_GET_WORKFLOW = 89;
  private static final int METHODID_LIST_WORKFLOWS = 90;
  private static final int METHODID_POST_WORKFLOWS = 91;
  private static final int METHODID_PATCH_WORKFLOWS = 92;
  private static final int METHODID_PATCH_WORKFLOW_IDS = 93;
  private static final int METHODID_DELETE_WORKFLOW = 94;
  private static final int METHODID_DELETE_WORKFLOWS = 95;
  private static final int METHODID_POST_WORKFLOW_RESULTS = 96;
  private static final int METHODID_POST_WORKFLOW_RESULTS_SIMILARITY = 97;
  private static final int METHODID_LIST_WORKFLOW_VERSIONS = 98;
  private static final int METHODID_GET_WORKFLOW_VERSION = 99;
  private static final int METHODID_DELETE_WORKFLOW_VERSIONS = 100;
  private static final int METHODID_PATCH_WORKFLOW_VERSIONS = 101;
  private static final int METHODID_GET_KEY = 102;
  private static final int METHODID_LIST_KEYS = 103;
  private static final int METHODID_LIST_APP_KEYS = 104;
  private static final int METHODID_DELETE_KEY = 105;
  private static final int METHODID_POST_KEYS = 106;
  private static final int METHODID_PATCH_KEYS = 107;
  private static final int METHODID_MY_SCOPES = 108;
  private static final int METHODID_MY_SCOPES_USER = 109;
  private static final int METHODID_MY_SCOPES_ROOT = 110;
  private static final int METHODID_LIST_SCOPES = 111;
  private static final int METHODID_GET_APP = 112;
  private static final int METHODID_LIST_APPS = 113;
  private static final int METHODID_DELETE_APP = 114;
  private static final int METHODID_POST_APPS = 115;
  private static final int METHODID_PATCH_APPS = 116;
  private static final int METHODID_PATCH_APPS_IDS = 117;
  private static final int METHODID_PATCH_APP = 118;
  private static final int METHODID_POST_APPS_SEARCHES = 119;
  private static final int METHODID_POST_VALIDATE_PASSWORD = 120;
  private static final int METHODID_GET_SEARCH = 121;
  private static final int METHODID_LIST_SEARCHES = 122;
  private static final int METHODID_PATCH_SEARCHES = 123;
  private static final int METHODID_POST_SEARCHES = 124;
  private static final int METHODID_POST_SEARCHES_BY_ID = 125;
  private static final int METHODID_POST_ANNOTATION_SEARCH_METRICS = 126;
  private static final int METHODID_GET_ANNOTATION_SEARCH_METRICS = 127;
  private static final int METHODID_LIST_ANNOTATION_SEARCH_METRICS = 128;
  private static final int METHODID_DELETE_ANNOTATION_SEARCH_METRICS = 129;
  private static final int METHODID_DELETE_SEARCH = 130;
  private static final int METHODID_LIST_ANNOTATION_FILTERS = 131;
  private static final int METHODID_GET_ANNOTATION_FILTER = 132;
  private static final int METHODID_POST_ANNOTATION_FILTERS = 133;
  private static final int METHODID_PATCH_ANNOTATION_FILTERS = 134;
  private static final int METHODID_DELETE_ANNOTATION_FILTERS = 135;
  private static final int METHODID_LIST_STATUS_CODES = 136;
  private static final int METHODID_GET_STATUS_CODE = 137;
  private static final int METHODID_LIST_COLLABORATORS = 138;
  private static final int METHODID_POST_COLLABORATORS = 139;
  private static final int METHODID_PATCH_COLLABORATORS = 140;
  private static final int METHODID_DELETE_COLLABORATORS = 141;
  private static final int METHODID_LIST_COLLABORATIONS = 142;
  private static final int METHODID_POST_APP_DUPLICATIONS = 143;
  private static final int METHODID_LIST_APP_DUPLICATIONS = 144;
  private static final int METHODID_GET_APP_DUPLICATION = 145;
  private static final int METHODID_POST_TASKS = 146;
  private static final int METHODID_GET_TASK_ANNOTATION_COUNT = 147;
  private static final int METHODID_GET_TASK_INPUT_COUNT = 148;
  private static final int METHODID_GET_TASK = 149;
  private static final int METHODID_LIST_TASKS = 150;
  private static final int METHODID_PATCH_TASKS = 151;
  private static final int METHODID_DELETE_TASKS = 152;
  private static final int METHODID_POST_LABEL_ORDERS = 153;
  private static final int METHODID_GET_LABEL_ORDER = 154;
  private static final int METHODID_LIST_LABEL_ORDERS = 155;
  private static final int METHODID_PATCH_LABEL_ORDERS = 156;
  private static final int METHODID_DELETE_LABEL_ORDERS = 157;
  private static final int METHODID_POST_COLLECTORS = 158;
  private static final int METHODID_GET_COLLECTOR = 159;
  private static final int METHODID_LIST_COLLECTORS = 160;
  private static final int METHODID_PATCH_COLLECTORS = 161;
  private static final int METHODID_DELETE_COLLECTORS = 162;
  private static final int METHODID_POST_STAT_VALUES = 163;
  private static final int METHODID_POST_STAT_VALUES_AGGREGATE = 164;
  private static final int METHODID_POST_TRENDING_METRICS_VIEW = 165;
  private static final int METHODID_LIST_TRENDING_METRICS_VIEWS = 166;
  private static final int METHODID_GET_MODULE = 167;
  private static final int METHODID_LIST_MODULES = 168;
  private static final int METHODID_POST_MODULES = 169;
  private static final int METHODID_PATCH_MODULES = 170;
  private static final int METHODID_DELETE_MODULES = 171;
  private static final int METHODID_GET_MODULE_VERSION = 172;
  private static final int METHODID_LIST_MODULE_VERSIONS = 173;
  private static final int METHODID_POST_MODULE_VERSIONS = 174;
  private static final int METHODID_DELETE_MODULE_VERSIONS = 175;
  private static final int METHODID_GET_INSTALLED_MODULE_VERSION = 176;
  private static final int METHODID_LIST_INSTALLED_MODULE_VERSIONS = 177;
  private static final int METHODID_POST_INSTALLED_MODULE_VERSIONS = 178;
  private static final int METHODID_DELETE_INSTALLED_MODULE_VERSIONS = 179;
  private static final int METHODID_POST_INSTALLED_MODULE_VERSIONS_KEY = 180;
  private static final int METHODID_POST_BULK_OPERATIONS = 181;
  private static final int METHODID_LIST_BULK_OPERATIONS = 182;
  private static final int METHODID_GET_BULK_OPERATION = 183;
  private static final int METHODID_CANCEL_BULK_OPERATIONS = 184;
  private static final int METHODID_DELETE_BULK_OPERATIONS = 185;
  private static final int METHODID_GET_DATASET_INPUTS_SEARCH_ADD_JOB = 186;
  private static final int METHODID_LIST_INPUTS_ADD_JOBS = 187;
  private static final int METHODID_GET_INPUTS_ADD_JOB = 188;
  private static final int METHODID_POST_UPLOADS = 189;
  private static final int METHODID_PUT_UPLOAD_CONTENT_PARTS = 190;
  private static final int METHODID_GET_UPLOAD = 191;
  private static final int METHODID_LIST_UPLOADS = 192;
  private static final int METHODID_DELETE_UPLOADS = 193;
  private static final int METHODID_POST_INPUTS_DATA_SOURCES = 194;
  private static final int METHODID_GET_INPUTS_EXTRACTION_JOB = 195;
  private static final int METHODID_LIST_INPUTS_EXTRACTION_JOBS = 196;
  private static final int METHODID_CANCEL_INPUTS_EXTRACTION_JOBS = 197;
  private static final int METHODID_POST_INPUTS_UPLOADS = 198;

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
        case METHODID_LIST_MODEL_CONCEPTS:
          serviceImpl.listModelConcepts((com.clarifai.grpc.api.ListModelConceptsRequest) request,
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
        case METHODID_PATCH_ANNOTATIONS_SEARCHES:
          serviceImpl.patchAnnotationsSearches((com.clarifai.grpc.api.PatchAnnotationsSearchesRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiSearchResponse>) responseObserver);
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
        case METHODID_PATCH_INPUTS_SEARCHES:
          serviceImpl.patchInputsSearches((com.clarifai.grpc.api.PatchInputsSearchesRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiSearchResponse>) responseObserver);
          break;
        case METHODID_POST_INPUTS_SEARCHES:
          serviceImpl.postInputsSearches((com.clarifai.grpc.api.PostInputsSearchesRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiSearchResponse>) responseObserver);
          break;
        case METHODID_POST_MODEL_OUTPUTS:
          serviceImpl.postModelOutputs((com.clarifai.grpc.api.PostModelOutputsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiOutputResponse>) responseObserver);
          break;
        case METHODID_LIST_DATASETS:
          serviceImpl.listDatasets((com.clarifai.grpc.api.ListDatasetsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiDatasetResponse>) responseObserver);
          break;
        case METHODID_GET_DATASET:
          serviceImpl.getDataset((com.clarifai.grpc.api.GetDatasetRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleDatasetResponse>) responseObserver);
          break;
        case METHODID_POST_DATASETS:
          serviceImpl.postDatasets((com.clarifai.grpc.api.PostDatasetsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiDatasetResponse>) responseObserver);
          break;
        case METHODID_PATCH_DATASETS:
          serviceImpl.patchDatasets((com.clarifai.grpc.api.PatchDatasetsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiDatasetResponse>) responseObserver);
          break;
        case METHODID_PATCH_DATASET_IDS:
          serviceImpl.patchDatasetIds((com.clarifai.grpc.api.PatchDatasetIdsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiDatasetResponse>) responseObserver);
          break;
        case METHODID_DELETE_DATASETS:
          serviceImpl.deleteDatasets((com.clarifai.grpc.api.DeleteDatasetsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse>) responseObserver);
          break;
        case METHODID_LIST_DATASET_INPUTS:
          serviceImpl.listDatasetInputs((com.clarifai.grpc.api.ListDatasetInputsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiDatasetInputResponse>) responseObserver);
          break;
        case METHODID_GET_DATASET_INPUT:
          serviceImpl.getDatasetInput((com.clarifai.grpc.api.GetDatasetInputRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleDatasetInputResponse>) responseObserver);
          break;
        case METHODID_POST_DATASET_INPUTS:
          serviceImpl.postDatasetInputs((com.clarifai.grpc.api.PostDatasetInputsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiDatasetInputResponse>) responseObserver);
          break;
        case METHODID_DELETE_DATASET_INPUTS:
          serviceImpl.deleteDatasetInputs((com.clarifai.grpc.api.DeleteDatasetInputsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse>) responseObserver);
          break;
        case METHODID_LIST_DATASET_VERSIONS:
          serviceImpl.listDatasetVersions((com.clarifai.grpc.api.ListDatasetVersionsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiDatasetVersionResponse>) responseObserver);
          break;
        case METHODID_GET_DATASET_VERSION:
          serviceImpl.getDatasetVersion((com.clarifai.grpc.api.GetDatasetVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleDatasetVersionResponse>) responseObserver);
          break;
        case METHODID_LIST_DATASET_VERSION_METRICS_GROUPS:
          serviceImpl.listDatasetVersionMetricsGroups((com.clarifai.grpc.api.ListDatasetVersionMetricsGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiDatasetVersionMetricsGroupResponse>) responseObserver);
          break;
        case METHODID_POST_DATASET_VERSIONS:
          serviceImpl.postDatasetVersions((com.clarifai.grpc.api.PostDatasetVersionsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiDatasetVersionResponse>) responseObserver);
          break;
        case METHODID_PATCH_DATASET_VERSIONS:
          serviceImpl.patchDatasetVersions((com.clarifai.grpc.api.PatchDatasetVersionsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiDatasetVersionResponse>) responseObserver);
          break;
        case METHODID_DELETE_DATASET_VERSIONS:
          serviceImpl.deleteDatasetVersions((com.clarifai.grpc.api.DeleteDatasetVersionsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse>) responseObserver);
          break;
        case METHODID_PUT_DATASET_VERSION_EXPORTS:
          serviceImpl.putDatasetVersionExports((com.clarifai.grpc.api.PutDatasetVersionExportsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiDatasetVersionExportResponse>) responseObserver);
          break;
        case METHODID_GET_MODEL_TYPE:
          serviceImpl.getModelType((com.clarifai.grpc.api.GetModelTypeRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelTypeResponse>) responseObserver);
          break;
        case METHODID_LIST_OPEN_SOURCE_LICENSES:
          serviceImpl.listOpenSourceLicenses((com.clarifai.grpc.api.ListOpenSourceLicensesRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.ListOpenSourceLicensesResponse>) responseObserver);
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
        case METHODID_PATCH_MODEL_IDS:
          serviceImpl.patchModelIds((com.clarifai.grpc.api.PatchModelIdsRequest) request,
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
        case METHODID_PATCH_MODEL_CHECK_CONSENTS:
          serviceImpl.patchModelCheckConsents((com.clarifai.grpc.api.PatchModelCheckConsentsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelCheckConsentResponse>) responseObserver);
          break;
        case METHODID_PATCH_MODEL_TOOLKITS:
          serviceImpl.patchModelToolkits((com.clarifai.grpc.api.PatchModelToolkitsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelToolkitResponse>) responseObserver);
          break;
        case METHODID_PATCH_MODEL_USE_CASES:
          serviceImpl.patchModelUseCases((com.clarifai.grpc.api.PatchModelUseCasesRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelUseCaseResponse>) responseObserver);
          break;
        case METHODID_PATCH_MODEL_LANGUAGES:
          serviceImpl.patchModelLanguages((com.clarifai.grpc.api.PatchModelLanguagesRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelLanguageResponse>) responseObserver);
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
        case METHODID_POST_WORKFLOW_VERSIONS_UN_PUBLISH:
          serviceImpl.postWorkflowVersionsUnPublish((com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse>) responseObserver);
          break;
        case METHODID_POST_WORKFLOW_VERSIONS_PUBLISH:
          serviceImpl.postWorkflowVersionsPublish((com.clarifai.grpc.api.PostWorkflowVersionsPublishRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse>) responseObserver);
          break;
        case METHODID_POST_MODEL_VERSIONS_PUBLISH:
          serviceImpl.postModelVersionsPublish((com.clarifai.grpc.api.PostModelVersionsPublishRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse>) responseObserver);
          break;
        case METHODID_POST_MODEL_VERSIONS_UN_PUBLISH:
          serviceImpl.postModelVersionsUnPublish((com.clarifai.grpc.api.PostModelVersionsUnPublishRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse>) responseObserver);
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
        case METHODID_POST_MODEL_VERSION_EVALUATIONS:
          serviceImpl.postModelVersionEvaluations((com.clarifai.grpc.api.PostModelVersionEvaluationsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiEvalMetricsResponse>) responseObserver);
          break;
        case METHODID_LIST_MODEL_VERSION_EVALUATIONS:
          serviceImpl.listModelVersionEvaluations((com.clarifai.grpc.api.ListModelVersionEvaluationsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiEvalMetricsResponse>) responseObserver);
          break;
        case METHODID_GET_MODEL_VERSION_EVALUATION:
          serviceImpl.getModelVersionEvaluation((com.clarifai.grpc.api.GetModelVersionEvaluationRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleEvalMetricsResponse>) responseObserver);
          break;
        case METHODID_LIST_MODEL_REFERENCES:
          serviceImpl.listModelReferences((com.clarifai.grpc.api.ListModelReferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelReferenceResponse>) responseObserver);
          break;
        case METHODID_GET_MODEL_VERSION_INPUT_EXAMPLE:
          serviceImpl.getModelVersionInputExample((com.clarifai.grpc.api.GetModelVersionInputExampleRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModelVersionInputExampleResponse>) responseObserver);
          break;
        case METHODID_LIST_MODEL_VERSION_INPUT_EXAMPLES:
          serviceImpl.listModelVersionInputExamples((com.clarifai.grpc.api.ListModelVersionInputExamplesRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModelVersionInputExampleResponse>) responseObserver);
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
        case METHODID_PATCH_WORKFLOW_IDS:
          serviceImpl.patchWorkflowIds((com.clarifai.grpc.api.PatchWorkflowIdsRequest) request,
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
        case METHODID_LIST_WORKFLOW_VERSIONS:
          serviceImpl.listWorkflowVersions((com.clarifai.grpc.api.ListWorkflowVersionsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiWorkflowVersionResponse>) responseObserver);
          break;
        case METHODID_GET_WORKFLOW_VERSION:
          serviceImpl.getWorkflowVersion((com.clarifai.grpc.api.GetWorkflowVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleWorkflowVersionResponse>) responseObserver);
          break;
        case METHODID_DELETE_WORKFLOW_VERSIONS:
          serviceImpl.deleteWorkflowVersions((com.clarifai.grpc.api.DeleteWorkflowVersionsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse>) responseObserver);
          break;
        case METHODID_PATCH_WORKFLOW_VERSIONS:
          serviceImpl.patchWorkflowVersions((com.clarifai.grpc.api.PatchWorkflowVersionsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiWorkflowVersionResponse>) responseObserver);
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
        case METHODID_MY_SCOPES_USER:
          serviceImpl.myScopesUser((com.clarifai.grpc.api.MyScopesUserRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiScopeUserResponse>) responseObserver);
          break;
        case METHODID_MY_SCOPES_ROOT:
          serviceImpl.myScopesRoot((com.clarifai.grpc.api.MyScopesRootRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiScopeRootResponse>) responseObserver);
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
        case METHODID_PATCH_APPS_IDS:
          serviceImpl.patchAppsIds((com.clarifai.grpc.api.PatchAppsIdsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAppResponse>) responseObserver);
          break;
        case METHODID_PATCH_APP:
          serviceImpl.patchApp((com.clarifai.grpc.api.PatchAppRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleAppResponse>) responseObserver);
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
        case METHODID_PATCH_SEARCHES:
          serviceImpl.patchSearches((com.clarifai.grpc.api.PatchSearchesRequest) request,
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
        case METHODID_LIST_ANNOTATION_FILTERS:
          serviceImpl.listAnnotationFilters((com.clarifai.grpc.api.ListAnnotationFiltersRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAnnotationFilterResponse>) responseObserver);
          break;
        case METHODID_GET_ANNOTATION_FILTER:
          serviceImpl.getAnnotationFilter((com.clarifai.grpc.api.GetAnnotationFilterRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleAnnotationFilterResponse>) responseObserver);
          break;
        case METHODID_POST_ANNOTATION_FILTERS:
          serviceImpl.postAnnotationFilters((com.clarifai.grpc.api.PostAnnotationFiltersRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAnnotationFilterResponse>) responseObserver);
          break;
        case METHODID_PATCH_ANNOTATION_FILTERS:
          serviceImpl.patchAnnotationFilters((com.clarifai.grpc.api.PatchAnnotationFiltersRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiAnnotationFilterResponse>) responseObserver);
          break;
        case METHODID_DELETE_ANNOTATION_FILTERS:
          serviceImpl.deleteAnnotationFilters((com.clarifai.grpc.api.DeleteAnnotationFiltersRequest) request,
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
        case METHODID_POST_LABEL_ORDERS:
          serviceImpl.postLabelOrders((com.clarifai.grpc.api.PostLabelOrdersRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiLabelOrderResponse>) responseObserver);
          break;
        case METHODID_GET_LABEL_ORDER:
          serviceImpl.getLabelOrder((com.clarifai.grpc.api.GetLabelOrderRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleLabelOrderResponse>) responseObserver);
          break;
        case METHODID_LIST_LABEL_ORDERS:
          serviceImpl.listLabelOrders((com.clarifai.grpc.api.ListLabelOrdersRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiLabelOrderResponse>) responseObserver);
          break;
        case METHODID_PATCH_LABEL_ORDERS:
          serviceImpl.patchLabelOrders((com.clarifai.grpc.api.PatchLabelOrdersRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiLabelOrderResponse>) responseObserver);
          break;
        case METHODID_DELETE_LABEL_ORDERS:
          serviceImpl.deleteLabelOrders((com.clarifai.grpc.api.DeleteLabelOrdersRequest) request,
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
        case METHODID_POST_TRENDING_METRICS_VIEW:
          serviceImpl.postTrendingMetricsView((com.clarifai.grpc.api.PostTrendingMetricsViewRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse>) responseObserver);
          break;
        case METHODID_LIST_TRENDING_METRICS_VIEWS:
          serviceImpl.listTrendingMetricsViews((com.clarifai.grpc.api.ListTrendingMetricsViewsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiTrendingMetricsViewResponse>) responseObserver);
          break;
        case METHODID_GET_MODULE:
          serviceImpl.getModule((com.clarifai.grpc.api.GetModuleRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModuleResponse>) responseObserver);
          break;
        case METHODID_LIST_MODULES:
          serviceImpl.listModules((com.clarifai.grpc.api.ListModulesRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModuleResponse>) responseObserver);
          break;
        case METHODID_POST_MODULES:
          serviceImpl.postModules((com.clarifai.grpc.api.PostModulesRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModuleResponse>) responseObserver);
          break;
        case METHODID_PATCH_MODULES:
          serviceImpl.patchModules((com.clarifai.grpc.api.PatchModulesRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModuleResponse>) responseObserver);
          break;
        case METHODID_DELETE_MODULES:
          serviceImpl.deleteModules((com.clarifai.grpc.api.DeleteModulesRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse>) responseObserver);
          break;
        case METHODID_GET_MODULE_VERSION:
          serviceImpl.getModuleVersion((com.clarifai.grpc.api.GetModuleVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleModuleVersionResponse>) responseObserver);
          break;
        case METHODID_LIST_MODULE_VERSIONS:
          serviceImpl.listModuleVersions((com.clarifai.grpc.api.ListModuleVersionsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModuleVersionResponse>) responseObserver);
          break;
        case METHODID_POST_MODULE_VERSIONS:
          serviceImpl.postModuleVersions((com.clarifai.grpc.api.PostModuleVersionsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiModuleVersionResponse>) responseObserver);
          break;
        case METHODID_DELETE_MODULE_VERSIONS:
          serviceImpl.deleteModuleVersions((com.clarifai.grpc.api.DeleteModuleVersionsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse>) responseObserver);
          break;
        case METHODID_GET_INSTALLED_MODULE_VERSION:
          serviceImpl.getInstalledModuleVersion((com.clarifai.grpc.api.GetInstalledModuleVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleInstalledModuleVersionResponse>) responseObserver);
          break;
        case METHODID_LIST_INSTALLED_MODULE_VERSIONS:
          serviceImpl.listInstalledModuleVersions((com.clarifai.grpc.api.ListInstalledModuleVersionsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInstalledModuleVersionResponse>) responseObserver);
          break;
        case METHODID_POST_INSTALLED_MODULE_VERSIONS:
          serviceImpl.postInstalledModuleVersions((com.clarifai.grpc.api.PostInstalledModuleVersionsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInstalledModuleVersionResponse>) responseObserver);
          break;
        case METHODID_DELETE_INSTALLED_MODULE_VERSIONS:
          serviceImpl.deleteInstalledModuleVersions((com.clarifai.grpc.api.DeleteInstalledModuleVersionsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse>) responseObserver);
          break;
        case METHODID_POST_INSTALLED_MODULE_VERSIONS_KEY:
          serviceImpl.postInstalledModuleVersionsKey((com.clarifai.grpc.api.PostInstalledModuleVersionsKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleKeyResponse>) responseObserver);
          break;
        case METHODID_POST_BULK_OPERATIONS:
          serviceImpl.postBulkOperations((com.clarifai.grpc.api.PostBulkOperationsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiBulkOperationsResponse>) responseObserver);
          break;
        case METHODID_LIST_BULK_OPERATIONS:
          serviceImpl.listBulkOperations((com.clarifai.grpc.api.ListBulkOperationsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiBulkOperationsResponse>) responseObserver);
          break;
        case METHODID_GET_BULK_OPERATION:
          serviceImpl.getBulkOperation((com.clarifai.grpc.api.GetBulkOperationRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleBulkOperationsResponse>) responseObserver);
          break;
        case METHODID_CANCEL_BULK_OPERATIONS:
          serviceImpl.cancelBulkOperations((com.clarifai.grpc.api.CancelBulkOperationRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiBulkOperationsResponse>) responseObserver);
          break;
        case METHODID_DELETE_BULK_OPERATIONS:
          serviceImpl.deleteBulkOperations((com.clarifai.grpc.api.DeleteBulkOperationRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse>) responseObserver);
          break;
        case METHODID_GET_DATASET_INPUTS_SEARCH_ADD_JOB:
          serviceImpl.getDatasetInputsSearchAddJob((com.clarifai.grpc.api.GetDatasetInputsSearchAddJobRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleDatasetInputsSearchAddJobResponse>) responseObserver);
          break;
        case METHODID_LIST_INPUTS_ADD_JOBS:
          serviceImpl.listInputsAddJobs((com.clarifai.grpc.api.ListInputsAddJobsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputsAddJobResponse>) responseObserver);
          break;
        case METHODID_GET_INPUTS_ADD_JOB:
          serviceImpl.getInputsAddJob((com.clarifai.grpc.api.GetInputsAddJobRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleInputsAddJobResponse>) responseObserver);
          break;
        case METHODID_POST_UPLOADS:
          serviceImpl.postUploads((com.clarifai.grpc.api.PostUploadsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiUploadResponse>) responseObserver);
          break;
        case METHODID_PUT_UPLOAD_CONTENT_PARTS:
          serviceImpl.putUploadContentParts((com.clarifai.grpc.api.PutUploadContentPartsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleUploadResponse>) responseObserver);
          break;
        case METHODID_GET_UPLOAD:
          serviceImpl.getUpload((com.clarifai.grpc.api.GetUploadRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleUploadResponse>) responseObserver);
          break;
        case METHODID_LIST_UPLOADS:
          serviceImpl.listUploads((com.clarifai.grpc.api.ListUploadsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiUploadResponse>) responseObserver);
          break;
        case METHODID_DELETE_UPLOADS:
          serviceImpl.deleteUploads((com.clarifai.grpc.api.DeleteUploadsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse>) responseObserver);
          break;
        case METHODID_POST_INPUTS_DATA_SOURCES:
          serviceImpl.postInputsDataSources((com.clarifai.grpc.api.PostInputsDataSourcesRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputsAddJobResponse>) responseObserver);
          break;
        case METHODID_GET_INPUTS_EXTRACTION_JOB:
          serviceImpl.getInputsExtractionJob((com.clarifai.grpc.api.GetInputsExtractionJobRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleInputsExtractionJobResponse>) responseObserver);
          break;
        case METHODID_LIST_INPUTS_EXTRACTION_JOBS:
          serviceImpl.listInputsExtractionJobs((com.clarifai.grpc.api.ListInputsExtractionJobsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputsExtractionJobResponse>) responseObserver);
          break;
        case METHODID_CANCEL_INPUTS_EXTRACTION_JOBS:
          serviceImpl.cancelInputsExtractionJobs((com.clarifai.grpc.api.CancelInputsExtractionJobsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputsExtractionJobResponse>) responseObserver);
          break;
        case METHODID_POST_INPUTS_UPLOADS:
          serviceImpl.postInputsUploads((com.clarifai.grpc.api.PostInputsUploadsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiInputsAddJobResponse>) responseObserver);
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
              .addMethod(getListModelConceptsMethod())
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
              .addMethod(getPatchAnnotationsSearchesMethod())
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
              .addMethod(getPatchInputsSearchesMethod())
              .addMethod(getPostInputsSearchesMethod())
              .addMethod(getPostModelOutputsMethod())
              .addMethod(getListDatasetsMethod())
              .addMethod(getGetDatasetMethod())
              .addMethod(getPostDatasetsMethod())
              .addMethod(getPatchDatasetsMethod())
              .addMethod(getPatchDatasetIdsMethod())
              .addMethod(getDeleteDatasetsMethod())
              .addMethod(getListDatasetInputsMethod())
              .addMethod(getGetDatasetInputMethod())
              .addMethod(getPostDatasetInputsMethod())
              .addMethod(getDeleteDatasetInputsMethod())
              .addMethod(getListDatasetVersionsMethod())
              .addMethod(getGetDatasetVersionMethod())
              .addMethod(getListDatasetVersionMetricsGroupsMethod())
              .addMethod(getPostDatasetVersionsMethod())
              .addMethod(getPatchDatasetVersionsMethod())
              .addMethod(getDeleteDatasetVersionsMethod())
              .addMethod(getPutDatasetVersionExportsMethod())
              .addMethod(getGetModelTypeMethod())
              .addMethod(getListOpenSourceLicensesMethod())
              .addMethod(getListModelTypesMethod())
              .addMethod(getGetModelMethod())
              .addMethod(getGetModelOutputInfoMethod())
              .addMethod(getListModelsMethod())
              .addMethod(getPostModelsSearchesMethod())
              .addMethod(getPostModelsMethod())
              .addMethod(getPatchModelsMethod())
              .addMethod(getPatchModelIdsMethod())
              .addMethod(getDeleteModelMethod())
              .addMethod(getDeleteModelsMethod())
              .addMethod(getPatchModelCheckConsentsMethod())
              .addMethod(getPatchModelToolkitsMethod())
              .addMethod(getPatchModelUseCasesMethod())
              .addMethod(getPatchModelLanguagesMethod())
              .addMethod(getListModelInputsMethod())
              .addMethod(getGetModelVersionMethod())
              .addMethod(getListModelVersionsMethod())
              .addMethod(getPostWorkflowVersionsUnPublishMethod())
              .addMethod(getPostWorkflowVersionsPublishMethod())
              .addMethod(getPostModelVersionsPublishMethod())
              .addMethod(getPostModelVersionsUnPublishMethod())
              .addMethod(getPostModelVersionsMethod())
              .addMethod(getPatchModelVersionsMethod())
              .addMethod(getDeleteModelVersionMethod())
              .addMethod(getGetModelVersionMetricsMethod())
              .addMethod(getPostModelVersionMetricsMethod())
              .addMethod(getPostModelVersionEvaluationsMethod())
              .addMethod(getListModelVersionEvaluationsMethod())
              .addMethod(getGetModelVersionEvaluationMethod())
              .addMethod(getListModelReferencesMethod())
              .addMethod(getGetModelVersionInputExampleMethod())
              .addMethod(getListModelVersionInputExamplesMethod())
              .addMethod(getGetWorkflowMethod())
              .addMethod(getListWorkflowsMethod())
              .addMethod(getPostWorkflowsMethod())
              .addMethod(getPatchWorkflowsMethod())
              .addMethod(getPatchWorkflowIdsMethod())
              .addMethod(getDeleteWorkflowMethod())
              .addMethod(getDeleteWorkflowsMethod())
              .addMethod(getPostWorkflowResultsMethod())
              .addMethod(getPostWorkflowResultsSimilarityMethod())
              .addMethod(getListWorkflowVersionsMethod())
              .addMethod(getGetWorkflowVersionMethod())
              .addMethod(getDeleteWorkflowVersionsMethod())
              .addMethod(getPatchWorkflowVersionsMethod())
              .addMethod(getGetKeyMethod())
              .addMethod(getListKeysMethod())
              .addMethod(getListAppKeysMethod())
              .addMethod(getDeleteKeyMethod())
              .addMethod(getPostKeysMethod())
              .addMethod(getPatchKeysMethod())
              .addMethod(getMyScopesMethod())
              .addMethod(getMyScopesUserMethod())
              .addMethod(getMyScopesRootMethod())
              .addMethod(getListScopesMethod())
              .addMethod(getGetAppMethod())
              .addMethod(getListAppsMethod())
              .addMethod(getDeleteAppMethod())
              .addMethod(getPostAppsMethod())
              .addMethod(getPatchAppsMethod())
              .addMethod(getPatchAppsIdsMethod())
              .addMethod(getPatchAppMethod())
              .addMethod(getPostAppsSearchesMethod())
              .addMethod(getPostValidatePasswordMethod())
              .addMethod(getGetSearchMethod())
              .addMethod(getListSearchesMethod())
              .addMethod(getPatchSearchesMethod())
              .addMethod(getPostSearchesMethod())
              .addMethod(getPostSearchesByIDMethod())
              .addMethod(getPostAnnotationSearchMetricsMethod())
              .addMethod(getGetAnnotationSearchMetricsMethod())
              .addMethod(getListAnnotationSearchMetricsMethod())
              .addMethod(getDeleteAnnotationSearchMetricsMethod())
              .addMethod(getDeleteSearchMethod())
              .addMethod(getListAnnotationFiltersMethod())
              .addMethod(getGetAnnotationFilterMethod())
              .addMethod(getPostAnnotationFiltersMethod())
              .addMethod(getPatchAnnotationFiltersMethod())
              .addMethod(getDeleteAnnotationFiltersMethod())
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
              .addMethod(getPostLabelOrdersMethod())
              .addMethod(getGetLabelOrderMethod())
              .addMethod(getListLabelOrdersMethod())
              .addMethod(getPatchLabelOrdersMethod())
              .addMethod(getDeleteLabelOrdersMethod())
              .addMethod(getPostCollectorsMethod())
              .addMethod(getGetCollectorMethod())
              .addMethod(getListCollectorsMethod())
              .addMethod(getPatchCollectorsMethod())
              .addMethod(getDeleteCollectorsMethod())
              .addMethod(getPostStatValuesMethod())
              .addMethod(getPostStatValuesAggregateMethod())
              .addMethod(getPostTrendingMetricsViewMethod())
              .addMethod(getListTrendingMetricsViewsMethod())
              .addMethod(getGetModuleMethod())
              .addMethod(getListModulesMethod())
              .addMethod(getPostModulesMethod())
              .addMethod(getPatchModulesMethod())
              .addMethod(getDeleteModulesMethod())
              .addMethod(getGetModuleVersionMethod())
              .addMethod(getListModuleVersionsMethod())
              .addMethod(getPostModuleVersionsMethod())
              .addMethod(getDeleteModuleVersionsMethod())
              .addMethod(getGetInstalledModuleVersionMethod())
              .addMethod(getListInstalledModuleVersionsMethod())
              .addMethod(getPostInstalledModuleVersionsMethod())
              .addMethod(getDeleteInstalledModuleVersionsMethod())
              .addMethod(getPostInstalledModuleVersionsKeyMethod())
              .addMethod(getPostBulkOperationsMethod())
              .addMethod(getListBulkOperationsMethod())
              .addMethod(getGetBulkOperationMethod())
              .addMethod(getCancelBulkOperationsMethod())
              .addMethod(getDeleteBulkOperationsMethod())
              .addMethod(getGetDatasetInputsSearchAddJobMethod())
              .addMethod(getListInputsAddJobsMethod())
              .addMethod(getGetInputsAddJobMethod())
              .addMethod(getPostUploadsMethod())
              .addMethod(getPutUploadContentPartsMethod())
              .addMethod(getGetUploadMethod())
              .addMethod(getListUploadsMethod())
              .addMethod(getDeleteUploadsMethod())
              .addMethod(getPostInputsDataSourcesMethod())
              .addMethod(getGetInputsExtractionJobMethod())
              .addMethod(getListInputsExtractionJobsMethod())
              .addMethod(getCancelInputsExtractionJobsMethod())
              .addMethod(getPostInputsUploadsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
