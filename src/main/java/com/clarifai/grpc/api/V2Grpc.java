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
    value = "by gRPC proto compiler (version 1.23.0)",
    comments = "Source: proto/clarifai/api/service.proto")
public final class V2Grpc {

  private V2Grpc() {}

  public static final String SERVICE_NAME = "clarifai.api.V2";

  // Static method descriptors that strictly reflect the proto.
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.GetConceptCountsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.GetConceptRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.ListConceptsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.PostConceptsSearchesRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.PostConceptsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.PatchConceptsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.MultiConceptResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PatchConcepts"))
              .build();
        }
      }
    }
    return getPatchConceptsMethod;
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.GetInputCountRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.SingleInputCountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("GetInputCount"))
              .build();
        }
      }
    }
    return getGetInputCountMethod;
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.GetInputRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.ListInputsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.PostInputsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.PatchInputsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.DeleteInputRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.DeleteInputsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.status.BaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("DeleteInputs"))
              .build();
        }
      }
    }
    return getDeleteInputsMethod;
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.PostModelOutputsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.MultiOutputResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostModelOutputs"))
              .build();
        }
      }
    }
    return getPostModelOutputsMethod;
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.GetModelRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.GetModelRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.ListModelsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.PostModelsSearchesRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.PostModelsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.PatchModelsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.DeleteModelRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.DeleteModelsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.ListModelInputsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.GetModelVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.ListModelVersionsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.PostModelVersionsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.SingleModelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostModelVersions"))
              .build();
        }
      }
    }
    return getPostModelVersionsMethod;
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.DeleteModelVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.GetModelVersionMetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.PostModelVersionMetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.GetWorkflowRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.ListWorkflowsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.PostWorkflowsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.PatchWorkflowsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.DeleteWorkflowRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.DeleteWorkflowsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.PostWorkflowResultsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.PostWorkflowResultsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostWorkflowResults"))
              .build();
        }
      }
    }
    return getPostWorkflowResultsMethod;
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.GetKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.ListKeysRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.ListAppKeysRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.DeleteKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.PostKeysRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.PatchKeysRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.MultiKeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PatchKeys"))
              .build();
        }
      }
    }
    return getPatchKeysMethod;
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.GetAppRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.ListAppsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.DeleteAppRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.PostAppsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.PatchAppsRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.MultiAppResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PatchApps"))
              .build();
        }
      }
    }
    return getPatchAppsMethod;
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.PostSearchesRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.MultiSearchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("PostSearches"))
              .build();
        }
      }
    }
    return getPostSearchesMethod;
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.ListStatusCodesRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
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
              .setRequestMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.GetStatusCodeRequest.getDefaultInstance()))
              .setResponseMarshaller(com.clarifai.channel.ClarifaiMarshaller.marshaller(
                  com.clarifai.grpc.api.SingleStatusCodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new V2MethodDescriptorSupplier("GetStatusCode"))
              .build();
        }
      }
    }
    return getGetStatusCodeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static V2Stub newStub(io.grpc.Channel channel) {
    return new V2Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static V2BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new V2BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static V2FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new V2FutureStub(channel);
  }

  /**
   */
  public static abstract class V2ImplBase implements io.grpc.BindableService {

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
     * Patch one or more inputs.
     * </pre>
     */
    public void getInputCount(com.clarifai.grpc.api.GetInputCountRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleInputCountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetInputCountMethod(), responseObserver);
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
     * Delete a single input.  This call is synchronous.
     * </pre>
     */
    public void deleteInput(com.clarifai.grpc.api.DeleteInputRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteInputMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete multiple inputs in one request.
     * This call is asynchronous. Use DeleteInput if you want a synchronous version.
     * </pre>
     */
    public void deleteInputs(com.clarifai.grpc.api.DeleteInputsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteInputsMethod(), responseObserver);
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
     * Get the evaluation metrics for a model version.
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
     * Execute a new search and optionally save it.
     * </pre>
     */
    public void postSearches(com.clarifai.grpc.api.PostSearchesRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiSearchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostSearchesMethod(), responseObserver);
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

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
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
            getGetInputCountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.GetInputCountRequest,
                com.clarifai.grpc.api.SingleInputCountResponse>(
                  this, METHODID_GET_INPUT_COUNT)))
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
            getPostModelOutputsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostModelOutputsRequest,
                com.clarifai.grpc.api.MultiOutputResponse>(
                  this, METHODID_POST_MODEL_OUTPUTS)))
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
            getPostSearchesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.clarifai.grpc.api.PostSearchesRequest,
                com.clarifai.grpc.api.MultiSearchResponse>(
                  this, METHODID_POST_SEARCHES)))
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
          .build();
    }
  }

  /**
   */
  public static final class V2Stub extends io.grpc.stub.AbstractStub<V2Stub> {
    private V2Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private V2Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected V2Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new V2Stub(channel, callOptions);
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
     * Patch one or more inputs.
     * </pre>
     */
    public void getInputCount(com.clarifai.grpc.api.GetInputCountRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleInputCountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetInputCountMethod(), getCallOptions()), request, responseObserver);
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
     * Delete a single input.  This call is synchronous.
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
     * This call is asynchronous. Use DeleteInput if you want a synchronous version.
     * </pre>
     */
    public void deleteInputs(com.clarifai.grpc.api.DeleteInputsRequest request,
        io.grpc.stub.StreamObserver<com.clarifai.grpc.api.status.BaseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteInputsMethod(), getCallOptions()), request, responseObserver);
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
     * Get the evaluation metrics for a model version.
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
  }

  /**
   */
  public static final class V2BlockingStub extends io.grpc.stub.AbstractStub<V2BlockingStub> {
    private V2BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private V2BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected V2BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new V2BlockingStub(channel, callOptions);
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
     * Patch one or more inputs.
     * </pre>
     */
    public com.clarifai.grpc.api.SingleInputCountResponse getInputCount(com.clarifai.grpc.api.GetInputCountRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetInputCountMethod(), getCallOptions(), request);
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
     * Delete a single input.  This call is synchronous.
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteInput(com.clarifai.grpc.api.DeleteInputRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteInputMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete multiple inputs in one request.
     * This call is asynchronous. Use DeleteInput if you want a synchronous version.
     * </pre>
     */
    public com.clarifai.grpc.api.status.BaseResponse deleteInputs(com.clarifai.grpc.api.DeleteInputsRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteInputsMethod(), getCallOptions(), request);
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
     * Get the evaluation metrics for a model version.
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
     * Execute a new search and optionally save it.
     * </pre>
     */
    public com.clarifai.grpc.api.MultiSearchResponse postSearches(com.clarifai.grpc.api.PostSearchesRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostSearchesMethod(), getCallOptions(), request);
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
  }

  /**
   */
  public static final class V2FutureStub extends io.grpc.stub.AbstractStub<V2FutureStub> {
    private V2FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private V2FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected V2FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new V2FutureStub(channel, callOptions);
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
     * Patch one or more inputs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.SingleInputCountResponse> getInputCount(
        com.clarifai.grpc.api.GetInputCountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetInputCountMethod(), getCallOptions()), request);
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
     * Delete a single input.  This call is synchronous.
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
     * This call is asynchronous. Use DeleteInput if you want a synchronous version.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.clarifai.grpc.api.status.BaseResponse> deleteInputs(
        com.clarifai.grpc.api.DeleteInputsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteInputsMethod(), getCallOptions()), request);
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
     * Get the evaluation metrics for a model version.
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
  }

  private static final int METHODID_GET_CONCEPT_COUNTS = 0;
  private static final int METHODID_GET_CONCEPT = 1;
  private static final int METHODID_LIST_CONCEPTS = 2;
  private static final int METHODID_POST_CONCEPTS_SEARCHES = 3;
  private static final int METHODID_POST_CONCEPTS = 4;
  private static final int METHODID_PATCH_CONCEPTS = 5;
  private static final int METHODID_GET_INPUT_COUNT = 6;
  private static final int METHODID_GET_INPUT = 7;
  private static final int METHODID_LIST_INPUTS = 8;
  private static final int METHODID_POST_INPUTS = 9;
  private static final int METHODID_PATCH_INPUTS = 10;
  private static final int METHODID_DELETE_INPUT = 11;
  private static final int METHODID_DELETE_INPUTS = 12;
  private static final int METHODID_POST_MODEL_OUTPUTS = 13;
  private static final int METHODID_GET_MODEL = 14;
  private static final int METHODID_GET_MODEL_OUTPUT_INFO = 15;
  private static final int METHODID_LIST_MODELS = 16;
  private static final int METHODID_POST_MODELS_SEARCHES = 17;
  private static final int METHODID_POST_MODELS = 18;
  private static final int METHODID_PATCH_MODELS = 19;
  private static final int METHODID_DELETE_MODEL = 20;
  private static final int METHODID_DELETE_MODELS = 21;
  private static final int METHODID_LIST_MODEL_INPUTS = 22;
  private static final int METHODID_GET_MODEL_VERSION = 23;
  private static final int METHODID_LIST_MODEL_VERSIONS = 24;
  private static final int METHODID_POST_MODEL_VERSIONS = 25;
  private static final int METHODID_DELETE_MODEL_VERSION = 26;
  private static final int METHODID_GET_MODEL_VERSION_METRICS = 27;
  private static final int METHODID_POST_MODEL_VERSION_METRICS = 28;
  private static final int METHODID_GET_WORKFLOW = 29;
  private static final int METHODID_LIST_WORKFLOWS = 30;
  private static final int METHODID_POST_WORKFLOWS = 31;
  private static final int METHODID_PATCH_WORKFLOWS = 32;
  private static final int METHODID_DELETE_WORKFLOW = 33;
  private static final int METHODID_DELETE_WORKFLOWS = 34;
  private static final int METHODID_POST_WORKFLOW_RESULTS = 35;
  private static final int METHODID_GET_KEY = 36;
  private static final int METHODID_LIST_KEYS = 37;
  private static final int METHODID_LIST_APP_KEYS = 38;
  private static final int METHODID_DELETE_KEY = 39;
  private static final int METHODID_POST_KEYS = 40;
  private static final int METHODID_PATCH_KEYS = 41;
  private static final int METHODID_GET_APP = 42;
  private static final int METHODID_LIST_APPS = 43;
  private static final int METHODID_DELETE_APP = 44;
  private static final int METHODID_POST_APPS = 45;
  private static final int METHODID_PATCH_APPS = 46;
  private static final int METHODID_POST_SEARCHES = 47;
  private static final int METHODID_LIST_STATUS_CODES = 48;
  private static final int METHODID_GET_STATUS_CODE = 49;

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
        case METHODID_GET_INPUT_COUNT:
          serviceImpl.getInputCount((com.clarifai.grpc.api.GetInputCountRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleInputCountResponse>) responseObserver);
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
        case METHODID_POST_MODEL_OUTPUTS:
          serviceImpl.postModelOutputs((com.clarifai.grpc.api.PostModelOutputsRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiOutputResponse>) responseObserver);
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
        case METHODID_POST_SEARCHES:
          serviceImpl.postSearches((com.clarifai.grpc.api.PostSearchesRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiSearchResponse>) responseObserver);
          break;
        case METHODID_LIST_STATUS_CODES:
          serviceImpl.listStatusCodes((com.clarifai.grpc.api.ListStatusCodesRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.MultiStatusCodeResponse>) responseObserver);
          break;
        case METHODID_GET_STATUS_CODE:
          serviceImpl.getStatusCode((com.clarifai.grpc.api.GetStatusCodeRequest) request,
              (io.grpc.stub.StreamObserver<com.clarifai.grpc.api.SingleStatusCodeResponse>) responseObserver);
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
              .addMethod(getGetConceptCountsMethod())
              .addMethod(getGetConceptMethod())
              .addMethod(getListConceptsMethod())
              .addMethod(getPostConceptsSearchesMethod())
              .addMethod(getPostConceptsMethod())
              .addMethod(getPatchConceptsMethod())
              .addMethod(getGetInputCountMethod())
              .addMethod(getGetInputMethod())
              .addMethod(getListInputsMethod())
              .addMethod(getPostInputsMethod())
              .addMethod(getPatchInputsMethod())
              .addMethod(getDeleteInputMethod())
              .addMethod(getDeleteInputsMethod())
              .addMethod(getPostModelOutputsMethod())
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
              .addMethod(getGetKeyMethod())
              .addMethod(getListKeysMethod())
              .addMethod(getListAppKeysMethod())
              .addMethod(getDeleteKeyMethod())
              .addMethod(getPostKeysMethod())
              .addMethod(getPatchKeysMethod())
              .addMethod(getGetAppMethod())
              .addMethod(getListAppsMethod())
              .addMethod(getDeleteAppMethod())
              .addMethod(getPostAppsMethod())
              .addMethod(getPatchAppsMethod())
              .addMethod(getPostSearchesMethod())
              .addMethod(getListStatusCodesMethod())
              .addMethod(getGetStatusCodeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
