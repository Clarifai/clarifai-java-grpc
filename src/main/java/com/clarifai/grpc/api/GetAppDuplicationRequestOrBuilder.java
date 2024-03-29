// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface GetAppDuplicationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.GetAppDuplicationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the user that created the app duplication job.
   * </pre>
   *
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   * @return Whether the userAppId field is set.
   */
  boolean hasUserAppId();
  /**
   * <pre>
   * The ID of the user that created the app duplication job.
   * </pre>
   *
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   * @return The userAppId.
   */
  com.clarifai.grpc.api.UserAppIDSet getUserAppId();
  /**
   * <pre>
   * The ID of the user that created the app duplication job.
   * </pre>
   *
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   */
  com.clarifai.grpc.api.UserAppIDSetOrBuilder getUserAppIdOrBuilder();

  /**
   * <code>string app_duplication_id = 2;</code>
   * @return The appDuplicationId.
   */
  java.lang.String getAppDuplicationId();
  /**
   * <code>string app_duplication_id = 2;</code>
   * @return The bytes for appDuplicationId.
   */
  com.google.protobuf.ByteString
      getAppDuplicationIdBytes();
}
