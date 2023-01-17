// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface CancelBulkOperationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.CancelBulkOperationRequest)
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
   * List of bulk operation ids to be cancelled
   * </pre>
   *
   * <code>repeated string ids = 2;</code>
   * @return A list containing the ids.
   */
  java.util.List<java.lang.String>
      getIdsList();
  /**
   * <pre>
   * List of bulk operation ids to be cancelled
   * </pre>
   *
   * <code>repeated string ids = 2;</code>
   * @return The count of ids.
   */
  int getIdsCount();
  /**
   * <pre>
   * List of bulk operation ids to be cancelled
   * </pre>
   *
   * <code>repeated string ids = 2;</code>
   * @param index The index of the element to return.
   * @return The ids at the given index.
   */
  java.lang.String getIds(int index);
  /**
   * <pre>
   * List of bulk operation ids to be cancelled
   * </pre>
   *
   * <code>repeated string ids = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the ids at the given index.
   */
  com.google.protobuf.ByteString
      getIdsBytes(int index);
}
