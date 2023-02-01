// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface PostModulesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.PostModulesRequest)
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
   * This allows you to create one or more module by posting it to the API.
   * </pre>
   *
   * <code>repeated .clarifai.api.Module modules = 3;</code>
   */
  java.util.List<com.clarifai.grpc.api.Module> 
      getModulesList();
  /**
   * <pre>
   * This allows you to create one or more module by posting it to the API.
   * </pre>
   *
   * <code>repeated .clarifai.api.Module modules = 3;</code>
   */
  com.clarifai.grpc.api.Module getModules(int index);
  /**
   * <pre>
   * This allows you to create one or more module by posting it to the API.
   * </pre>
   *
   * <code>repeated .clarifai.api.Module modules = 3;</code>
   */
  int getModulesCount();
  /**
   * <pre>
   * This allows you to create one or more module by posting it to the API.
   * </pre>
   *
   * <code>repeated .clarifai.api.Module modules = 3;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.ModuleOrBuilder> 
      getModulesOrBuilderList();
  /**
   * <pre>
   * This allows you to create one or more module by posting it to the API.
   * </pre>
   *
   * <code>repeated .clarifai.api.Module modules = 3;</code>
   */
  com.clarifai.grpc.api.ModuleOrBuilder getModulesOrBuilder(
      int index);
}