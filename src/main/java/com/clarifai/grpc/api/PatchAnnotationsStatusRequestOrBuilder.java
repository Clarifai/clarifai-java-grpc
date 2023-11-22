// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface PatchAnnotationsStatusRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.PatchAnnotationsStatusRequest)
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
   * Filter by user IDs
   * </pre>
   *
   * <code>repeated string user_ids = 3;</code>
   * @return A list containing the userIds.
   */
  java.util.List<java.lang.String>
      getUserIdsList();
  /**
   * <pre>
   * Filter by user IDs
   * </pre>
   *
   * <code>repeated string user_ids = 3;</code>
   * @return The count of userIds.
   */
  int getUserIdsCount();
  /**
   * <pre>
   * Filter by user IDs
   * </pre>
   *
   * <code>repeated string user_ids = 3;</code>
   * @param index The index of the element to return.
   * @return The userIds at the given index.
   */
  java.lang.String getUserIds(int index);
  /**
   * <pre>
   * Filter by user IDs
   * </pre>
   *
   * <code>repeated string user_ids = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the userIds at the given index.
   */
  com.google.protobuf.ByteString
      getUserIdsBytes(int index);

  /**
   * <pre>
   * Filter by task ID
   * </pre>
   *
   * <code>string task_id = 4;</code>
   * @return The taskId.
   */
  java.lang.String getTaskId();
  /**
   * <pre>
   * Filter by task ID
   * </pre>
   *
   * <code>string task_id = 4;</code>
   * @return The bytes for taskId.
   */
  com.google.protobuf.ByteString
      getTaskIdBytes();

  /**
   * <pre>
   * Filter by Status codes
   * </pre>
   *
   * <code>repeated .clarifai.api.status.StatusCode status_codes = 6;</code>
   * @return A list containing the statusCodes.
   */
  java.util.List<com.clarifai.grpc.api.status.StatusCode> getStatusCodesList();
  /**
   * <pre>
   * Filter by Status codes
   * </pre>
   *
   * <code>repeated .clarifai.api.status.StatusCode status_codes = 6;</code>
   * @return The count of statusCodes.
   */
  int getStatusCodesCount();
  /**
   * <pre>
   * Filter by Status codes
   * </pre>
   *
   * <code>repeated .clarifai.api.status.StatusCode status_codes = 6;</code>
   * @param index The index of the element to return.
   * @return The statusCodes at the given index.
   */
  com.clarifai.grpc.api.status.StatusCode getStatusCodes(int index);
  /**
   * <pre>
   * Filter by Status codes
   * </pre>
   *
   * <code>repeated .clarifai.api.status.StatusCode status_codes = 6;</code>
   * @return A list containing the enum numeric values on the wire for statusCodes.
   */
  java.util.List<java.lang.Integer>
  getStatusCodesValueList();
  /**
   * <pre>
   * Filter by Status codes
   * </pre>
   *
   * <code>repeated .clarifai.api.status.StatusCode status_codes = 6;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of statusCodes at the given index.
   */
  int getStatusCodesValue(int index);

  /**
   * <pre>
   * 'overwrite' is supported
   * </pre>
   *
   * <code>string action = 5;</code>
   * @return The action.
   */
  java.lang.String getAction();
  /**
   * <pre>
   * 'overwrite' is supported
   * </pre>
   *
   * <code>string action = 5;</code>
   * @return The bytes for action.
   */
  com.google.protobuf.ByteString
      getActionBytes();

  /**
   * <pre>
   * Update filtered annotations to this status
   * </pre>
   *
   * <code>.clarifai.api.status.StatusCode status_code = 2;</code>
   * @return The enum numeric value on the wire for statusCode.
   */
  int getStatusCodeValue();
  /**
   * <pre>
   * Update filtered annotations to this status
   * </pre>
   *
   * <code>.clarifai.api.status.StatusCode status_code = 2;</code>
   * @return The statusCode.
   */
  com.clarifai.grpc.api.status.StatusCode getStatusCode();
}
