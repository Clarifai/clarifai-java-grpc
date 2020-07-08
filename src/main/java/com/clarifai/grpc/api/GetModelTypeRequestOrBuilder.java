// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface GetModelTypeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.GetModelTypeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * use and app combo. Not really used for this endpoint at this time so may go away in future.
   * </pre>
   *
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   * @return Whether the userAppId field is set.
   */
  boolean hasUserAppId();
  /**
   * <pre>
   * use and app combo. Not really used for this endpoint at this time so may go away in future.
   * </pre>
   *
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   * @return The userAppId.
   */
  com.clarifai.grpc.api.UserAppIDSet getUserAppId();
  /**
   * <pre>
   * use and app combo. Not really used for this endpoint at this time so may go away in future.
   * </pre>
   *
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   */
  com.clarifai.grpc.api.UserAppIDSetOrBuilder getUserAppIdOrBuilder();

  /**
   * <pre>
   * The specific ModelType.Id you want to retrieve.
   * </pre>
   *
   * <code>string model_type_id = 2;</code>
   * @return The modelTypeId.
   */
  java.lang.String getModelTypeId();
  /**
   * <pre>
   * The specific ModelType.Id you want to retrieve.
   * </pre>
   *
   * <code>string model_type_id = 2;</code>
   * @return The bytes for modelTypeId.
   */
  com.google.protobuf.ByteString
      getModelTypeIdBytes();
}
