// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface PatchModulesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.PatchModulesRequest)
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
   * <code>repeated .clarifai.api.Module modules = 2;</code>
   */
  java.util.List<com.clarifai.grpc.api.Module> 
      getModulesList();
  /**
   * <code>repeated .clarifai.api.Module modules = 2;</code>
   */
  com.clarifai.grpc.api.Module getModules(int index);
  /**
   * <code>repeated .clarifai.api.Module modules = 2;</code>
   */
  int getModulesCount();
  /**
   * <code>repeated .clarifai.api.Module modules = 2;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.ModuleOrBuilder> 
      getModulesOrBuilderList();
  /**
   * <code>repeated .clarifai.api.Module modules = 2;</code>
   */
  com.clarifai.grpc.api.ModuleOrBuilder getModulesOrBuilder(
      int index);

  /**
   * <pre>
   * The action to perform on the patched objects
   * For now actions 'merge', 'overwrite', and 'remove' are supported
   * </pre>
   *
   * <code>string action = 3;</code>
   * @return The action.
   */
  java.lang.String getAction();
  /**
   * <pre>
   * The action to perform on the patched objects
   * For now actions 'merge', 'overwrite', and 'remove' are supported
   * </pre>
   *
   * <code>string action = 3;</code>
   * @return The bytes for action.
   */
  com.google.protobuf.ByteString
      getActionBytes();
}
