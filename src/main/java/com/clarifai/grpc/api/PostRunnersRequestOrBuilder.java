// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface PostRunnersRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.PostRunnersRequest)
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
   * <code>string nodepool_id = 2;</code>
   * @return The nodepoolId.
   */
  java.lang.String getNodepoolId();
  /**
   * <code>string nodepool_id = 2;</code>
   * @return The bytes for nodepoolId.
   */
  com.google.protobuf.ByteString
      getNodepoolIdBytes();

  /**
   * <pre>
   * This allows you to create one or more runner by posting it to the API.
   * </pre>
   *
   * <code>repeated .clarifai.api.Runner runners = 3;</code>
   */
  java.util.List<com.clarifai.grpc.api.Runner> 
      getRunnersList();
  /**
   * <pre>
   * This allows you to create one or more runner by posting it to the API.
   * </pre>
   *
   * <code>repeated .clarifai.api.Runner runners = 3;</code>
   */
  com.clarifai.grpc.api.Runner getRunners(int index);
  /**
   * <pre>
   * This allows you to create one or more runner by posting it to the API.
   * </pre>
   *
   * <code>repeated .clarifai.api.Runner runners = 3;</code>
   */
  int getRunnersCount();
  /**
   * <pre>
   * This allows you to create one or more runner by posting it to the API.
   * </pre>
   *
   * <code>repeated .clarifai.api.Runner runners = 3;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.RunnerOrBuilder> 
      getRunnersOrBuilderList();
  /**
   * <pre>
   * This allows you to create one or more runner by posting it to the API.
   * </pre>
   *
   * <code>repeated .clarifai.api.Runner runners = 3;</code>
   */
  com.clarifai.grpc.api.RunnerOrBuilder getRunnersOrBuilder(
      int index);
}
