// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface GetAppDuplicationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.GetAppDuplicationRequest)
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
   *The app duplication id
   * </pre>
   *
   * <code>string app_duplication_id = 2;</code>
   * @return The appDuplicationId.
   */
  java.lang.String getAppDuplicationId();
  /**
   * <pre>
   *The app duplication id
   * </pre>
   *
   * <code>string app_duplication_id = 2;</code>
   * @return The bytes for appDuplicationId.
   */
  com.google.protobuf.ByteString
      getAppDuplicationIdBytes();
}
