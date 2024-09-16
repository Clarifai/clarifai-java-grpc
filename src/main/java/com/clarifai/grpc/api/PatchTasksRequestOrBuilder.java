// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface PatchTasksRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.PatchTasksRequest)
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
   * <code>repeated .clarifai.api.Task tasks = 2;</code>
   */
  java.util.List<com.clarifai.grpc.api.Task> 
      getTasksList();
  /**
   * <code>repeated .clarifai.api.Task tasks = 2;</code>
   */
  com.clarifai.grpc.api.Task getTasks(int index);
  /**
   * <code>repeated .clarifai.api.Task tasks = 2;</code>
   */
  int getTasksCount();
  /**
   * <code>repeated .clarifai.api.Task tasks = 2;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.TaskOrBuilder> 
      getTasksOrBuilderList();
  /**
   * <code>repeated .clarifai.api.Task tasks = 2;</code>
   */
  com.clarifai.grpc.api.TaskOrBuilder getTasksOrBuilder(
      int index);

  /**
   * <pre>
   * The action to perform on the patched objects
   * For now, only 'overwrite' action is supported
   * </pre>
   *
   * <code>string action = 3;</code>
   * @return The action.
   */
  java.lang.String getAction();
  /**
   * <pre>
   * The action to perform on the patched objects
   * For now, only 'overwrite' action is supported
   * </pre>
   *
   * <code>string action = 3;</code>
   * @return The bytes for action.
   */
  com.google.protobuf.ByteString
      getActionBytes();
}
