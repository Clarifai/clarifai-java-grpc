// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface PatchPipelinesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.PatchPipelinesRequest)
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
   * <code>repeated .clarifai.api.Pipeline pipelines = 2;</code>
   */
  java.util.List<com.clarifai.grpc.api.Pipeline> 
      getPipelinesList();
  /**
   * <code>repeated .clarifai.api.Pipeline pipelines = 2;</code>
   */
  com.clarifai.grpc.api.Pipeline getPipelines(int index);
  /**
   * <code>repeated .clarifai.api.Pipeline pipelines = 2;</code>
   */
  int getPipelinesCount();
  /**
   * <code>repeated .clarifai.api.Pipeline pipelines = 2;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.PipelineOrBuilder> 
      getPipelinesOrBuilderList();
  /**
   * <code>repeated .clarifai.api.Pipeline pipelines = 2;</code>
   */
  com.clarifai.grpc.api.PipelineOrBuilder getPipelinesOrBuilder(
      int index);

  /**
   * <pre>
   * The action to perform on the patched objects
   * For now actions 'overwrite' are supported
   * </pre>
   *
   * <code>string action = 3;</code>
   * @return The action.
   */
  java.lang.String getAction();
  /**
   * <pre>
   * The action to perform on the patched objects
   * For now actions 'overwrite' are supported
   * </pre>
   *
   * <code>string action = 3;</code>
   * @return The bytes for action.
   */
  com.google.protobuf.ByteString
      getActionBytes();
}
