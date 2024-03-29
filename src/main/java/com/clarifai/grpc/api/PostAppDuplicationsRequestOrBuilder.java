// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface PostAppDuplicationsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.PostAppDuplicationsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The user and application ID of the source application to duplicate.
   * </pre>
   *
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   * @return Whether the userAppId field is set.
   */
  boolean hasUserAppId();
  /**
   * <pre>
   * The user and application ID of the source application to duplicate.
   * </pre>
   *
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   * @return The userAppId.
   */
  com.clarifai.grpc.api.UserAppIDSet getUserAppId();
  /**
   * <pre>
   * The user and application ID of the source application to duplicate.
   * </pre>
   *
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   */
  com.clarifai.grpc.api.UserAppIDSetOrBuilder getUserAppIdOrBuilder();

  /**
   * <code>repeated .clarifai.api.AppDuplication app_duplications = 2;</code>
   */
  java.util.List<com.clarifai.grpc.api.AppDuplication> 
      getAppDuplicationsList();
  /**
   * <code>repeated .clarifai.api.AppDuplication app_duplications = 2;</code>
   */
  com.clarifai.grpc.api.AppDuplication getAppDuplications(int index);
  /**
   * <code>repeated .clarifai.api.AppDuplication app_duplications = 2;</code>
   */
  int getAppDuplicationsCount();
  /**
   * <code>repeated .clarifai.api.AppDuplication app_duplications = 2;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.AppDuplicationOrBuilder> 
      getAppDuplicationsOrBuilderList();
  /**
   * <code>repeated .clarifai.api.AppDuplication app_duplications = 2;</code>
   */
  com.clarifai.grpc.api.AppDuplicationOrBuilder getAppDuplicationsOrBuilder(
      int index);
}
