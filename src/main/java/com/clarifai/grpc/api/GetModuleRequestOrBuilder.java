// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface GetModuleRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.GetModuleRequest)
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
   * <code>string module_id = 2;</code>
   * @return The moduleId.
   */
  java.lang.String getModuleId();
  /**
   * <code>string module_id = 2;</code>
   * @return The bytes for moduleId.
   */
  com.google.protobuf.ByteString
      getModuleIdBytes();
}
