// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface DeleteAnnotationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.DeleteAnnotationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   * @return Whether the userAppId field is set.
   */
  boolean hasUserAppId();
  /**
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   * @return The userAppId.
   */
  com.clarifai.grpc.api.UserAppIDSet getUserAppId();
  /**
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   */
  com.clarifai.grpc.api.UserAppIDSetOrBuilder getUserAppIdOrBuilder();

  /**
   * <code>string input_id = 2;</code>
   * @return The inputId.
   */
  java.lang.String getInputId();
  /**
   * <code>string input_id = 2;</code>
   * @return The bytes for inputId.
   */
  com.google.protobuf.ByteString
      getInputIdBytes();

  /**
   * <code>string annotation_id = 3;</code>
   * @return The annotationId.
   */
  java.lang.String getAnnotationId();
  /**
   * <code>string annotation_id = 3;</code>
   * @return The bytes for annotationId.
   */
  com.google.protobuf.ByteString
      getAnnotationIdBytes();
}