// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/utils/test_proto.proto

package com.clarifai.grpc.api.utils;

public final class TestProtoOuterClass {
  private TestProtoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_clarifai_api_utils_TestProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_clarifai_api_utils_TestProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_clarifai_api_utils_TestProto2_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_clarifai_api_utils_TestProto2_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)proto/clarifai/api/utils/test_proto.pr" +
      "oto\022\022clarifai.api.utils\032)proto/clarifai/" +
      "api/utils/extensions.proto\"\345\001\n\tTestProto" +
      "\022\n\n\002id\030\001 \001(\t\022(\n\007message\030\002 \001(\tB\027\200\265\030\001\212\265\030\017p" +
      "rotos are cool\022\026\n\005value\030\003 \001(\001B\007\325\265\030\000\000\200?\022\023" +
      "\n\013image_bytes\030\004 \001(\014\022\026\n\014string_oneof\030\005 \001(" +
      "\tH\000\022\024\n\nbool_oneof\030\006 \001(\010H\000\0227\n\rmessage_one" +
      "of\030\007 \001(\0132\036.clarifai.api.utils.TestProto2" +
      "H\000B\016\n\014one_of_field\"&\n\nTestProto2\022\n\n\002id\030\001" +
      " \001(\t\022\014\n\004flip\030\002 \001(\010Be\n\033com.clarifai.grpc." +
      "api.utilsP\001Z=github.com/Clarifai/clarifa" +
      "i-go-grpc/proto/clarifai/api/utils\242\002\004CAI" +
      "Pb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.clarifai.grpc.api.utils.Extensions.getDescriptor(),
        });
    internal_static_clarifai_api_utils_TestProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_clarifai_api_utils_TestProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_clarifai_api_utils_TestProto_descriptor,
        new java.lang.String[] { "Id", "Message", "Value", "ImageBytes", "StringOneof", "BoolOneof", "MessageOneof", "OneOfField", });
    internal_static_clarifai_api_utils_TestProto2_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_clarifai_api_utils_TestProto2_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_clarifai_api_utils_TestProto2_descriptor,
        new java.lang.String[] { "Id", "Flip", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.clarifai.grpc.api.utils.Extensions.clDefaultFloat);
    registry.add(com.clarifai.grpc.api.utils.Extensions.clMoretags);
    registry.add(com.clarifai.grpc.api.utils.Extensions.clShowIfEmpty);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.clarifai.grpc.api.utils.Extensions.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
