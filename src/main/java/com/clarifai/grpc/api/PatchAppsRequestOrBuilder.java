// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface PatchAppsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.PatchAppsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   */
  boolean hasUserAppId();
  /**
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   */
  com.clarifai.grpc.api.UserAppIDSet getUserAppId();
  /**
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   */
  com.clarifai.grpc.api.UserAppIDSetOrBuilder getUserAppIdOrBuilder();

  /**
   * <code>repeated .clarifai.api.App apps = 2;</code>
   */
  java.util.List<com.clarifai.grpc.api.App> 
      getAppsList();
  /**
   * <code>repeated .clarifai.api.App apps = 2;</code>
   */
  com.clarifai.grpc.api.App getApps(int index);
  /**
   * <code>repeated .clarifai.api.App apps = 2;</code>
   */
  int getAppsCount();
  /**
   * <code>repeated .clarifai.api.App apps = 2;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.AppOrBuilder> 
      getAppsOrBuilderList();
  /**
   * <code>repeated .clarifai.api.App apps = 2;</code>
   */
  com.clarifai.grpc.api.AppOrBuilder getAppsOrBuilder(
      int index);

  /**
   * <pre>
   * The action to perform on the patched App objects except App.Metadata
   * For now only action 'overwrite' is supported
   * </pre>
   *
   * <code>string action = 3;</code>
   */
  java.lang.String getAction();
  /**
   * <pre>
   * The action to perform on the patched App objects except App.Metadata
   * For now only action 'overwrite' is supported
   * </pre>
   *
   * <code>string action = 3;</code>
   */
  com.google.protobuf.ByteString
      getActionBytes();

  /**
   * <pre>
   * The action to perform on the patched App.Metadata
   * </pre>
   *
   * <code>.clarifai.api.PatchAction metadata_action = 4;</code>
   */
  boolean hasMetadataAction();
  /**
   * <pre>
   * The action to perform on the patched App.Metadata
   * </pre>
   *
   * <code>.clarifai.api.PatchAction metadata_action = 4;</code>
   */
  com.clarifai.grpc.api.PatchAction getMetadataAction();
  /**
   * <pre>
   * The action to perform on the patched App.Metadata
   * </pre>
   *
   * <code>.clarifai.api.PatchAction metadata_action = 4;</code>
   */
  com.clarifai.grpc.api.PatchActionOrBuilder getMetadataActionOrBuilder();

  /**
   * <pre>
   * If set, the app will be automatically reindexed upon change of its base workflow.
   * </pre>
   *
   * <code>bool reindex = 5;</code>
   */
  boolean getReindex();
}
