// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface PatchModelUseCasesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.PatchModelUseCasesRequest)
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
   * <code>string model_id = 2;</code>
   * @return The modelId.
   */
  java.lang.String getModelId();
  /**
   * <code>string model_id = 2;</code>
   * @return The bytes for modelId.
   */
  com.google.protobuf.ByteString
      getModelIdBytes();

  /**
   * <code>repeated string usecases = 3;</code>
   * @return A list containing the usecases.
   */
  java.util.List<java.lang.String>
      getUsecasesList();
  /**
   * <code>repeated string usecases = 3;</code>
   * @return The count of usecases.
   */
  int getUsecasesCount();
  /**
   * <code>repeated string usecases = 3;</code>
   * @param index The index of the element to return.
   * @return The usecases at the given index.
   */
  java.lang.String getUsecases(int index);
  /**
   * <code>repeated string usecases = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the usecases at the given index.
   */
  com.google.protobuf.ByteString
      getUsecasesBytes(int index);

  /**
   * <pre>
   *overwrite supported
   * </pre>
   *
   * <code>string action = 4;</code>
   * @return The action.
   */
  java.lang.String getAction();
  /**
   * <pre>
   *overwrite supported
   * </pre>
   *
   * <code>string action = 4;</code>
   * @return The bytes for action.
   */
  com.google.protobuf.ByteString
      getActionBytes();
}
