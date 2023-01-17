// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface PatchModelIdsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.PatchModelIdsRequest)
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
   * <pre>
   * Array containing 1 entry
   * </pre>
   *
   * <code>repeated .clarifai.api.IdUpdateSource ids = 3;</code>
   */
  java.util.List<com.clarifai.grpc.api.IdUpdateSource> 
      getIdsList();
  /**
   * <pre>
   * Array containing 1 entry
   * </pre>
   *
   * <code>repeated .clarifai.api.IdUpdateSource ids = 3;</code>
   */
  com.clarifai.grpc.api.IdUpdateSource getIds(int index);
  /**
   * <pre>
   * Array containing 1 entry
   * </pre>
   *
   * <code>repeated .clarifai.api.IdUpdateSource ids = 3;</code>
   */
  int getIdsCount();
  /**
   * <pre>
   * Array containing 1 entry
   * </pre>
   *
   * <code>repeated .clarifai.api.IdUpdateSource ids = 3;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.IdUpdateSourceOrBuilder> 
      getIdsOrBuilderList();
  /**
   * <pre>
   * Array containing 1 entry
   * </pre>
   *
   * <code>repeated .clarifai.api.IdUpdateSource ids = 3;</code>
   */
  com.clarifai.grpc.api.IdUpdateSourceOrBuilder getIdsOrBuilder(
      int index);

  /**
   * <pre>
   * The action to perform on the patched objects
   * Only 'overwrite' is supported
   * </pre>
   *
   * <code>string action = 4;</code>
   * @return The action.
   */
  java.lang.String getAction();
  /**
   * <pre>
   * The action to perform on the patched objects
   * Only 'overwrite' is supported
   * </pre>
   *
   * <code>string action = 4;</code>
   * @return The bytes for action.
   */
  com.google.protobuf.ByteString
      getActionBytes();
}
