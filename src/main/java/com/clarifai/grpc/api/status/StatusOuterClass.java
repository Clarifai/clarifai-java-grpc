// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/status/status.proto

package com.clarifai.grpc.api.status;

public final class StatusOuterClass {
  private StatusOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_clarifai_api_status_Status_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_clarifai_api_status_Status_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_clarifai_api_status_BaseResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_clarifai_api_status_BaseResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&proto/clarifai/api/status/status.proto" +
      "\022\023clarifai.api.status\032(proto/clarifai/au" +
      "th/util/extension.proto\032+proto/clarifai/" +
      "api/status/status_code.proto\"\333\001\n\006Status\022" +
      "-\n\004code\030\001 \001(\0162\037.clarifai.api.status.Stat" +
      "usCode\022\023\n\013description\030\002 \001(\t\022\017\n\007details\030\003" +
      " \001(\t\022\031\n\013stack_trace\030\004 \003(\tB\004\200\234\'\001\022\031\n\021perce" +
      "nt_completed\030\005 \001(\r\022\026\n\016time_remaining\030\006 \001" +
      "(\r\022\016\n\006req_id\030\007 \001(\t\022\036\n\020internal_details\030\010" +
      " \001(\tB\004\200\234\'\001\";\n\014BaseResponse\022+\n\006status\030\001 \001" +
      "(\0132\033.clarifai.api.status.StatusB\237\001\n\034com." +
      "clarifai.grpc.api.statusP\001Zvgithub.com/C" +
      "larifai/clarifai-go-grpc/proto/clarifai/" +
      "api/github.com/Clarifai/clarifai-go-grpc" +
      "/proto/clarifai/api/status\242\002\004CAIPb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.clarifai.grpc.auth.util.Extension.getDescriptor(),
          com.clarifai.grpc.api.status.StatusCodeOuterClass.getDescriptor(),
        });
    internal_static_clarifai_api_status_Status_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_clarifai_api_status_Status_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_clarifai_api_status_Status_descriptor,
        new java.lang.String[] { "Code", "Description", "Details", "StackTrace", "PercentCompleted", "TimeRemaining", "ReqId", "InternalDetails", });
    internal_static_clarifai_api_status_BaseResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_clarifai_api_status_BaseResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_clarifai_api_status_BaseResponse_descriptor,
        new java.lang.String[] { "Status", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.clarifai.grpc.auth.util.Extension.clPrivateField);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.clarifai.grpc.auth.util.Extension.getDescriptor();
    com.clarifai.grpc.api.status.StatusCodeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
