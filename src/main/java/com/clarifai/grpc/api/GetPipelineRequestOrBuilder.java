// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface GetPipelineRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.GetPipelineRequest)
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
   * <code>string pipeline_id = 2;</code>
   * @return The pipelineId.
   */
  java.lang.String getPipelineId();
  /**
   * <code>string pipeline_id = 2;</code>
   * @return The bytes for pipelineId.
   */
  com.google.protobuf.ByteString
      getPipelineIdBytes();
}
