// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface DeleteWorkflowVersionsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.DeleteWorkflowVersionsRequest)
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
   * The id of the workflow that has the requested versions to delete.
   * </pre>
   *
   * <code>string workflow_id = 2;</code>
   * @return The workflowId.
   */
  java.lang.String getWorkflowId();
  /**
   * <pre>
   * The id of the workflow that has the requested versions to delete.
   * </pre>
   *
   * <code>string workflow_id = 2;</code>
   * @return The bytes for workflowId.
   */
  com.google.protobuf.ByteString
      getWorkflowIdBytes();

  /**
   * <pre>
   * Delete the versions identified by these ids
   * </pre>
   *
   * <code>repeated string workflow_version_ids = 3;</code>
   * @return A list containing the workflowVersionIds.
   */
  java.util.List<java.lang.String>
      getWorkflowVersionIdsList();
  /**
   * <pre>
   * Delete the versions identified by these ids
   * </pre>
   *
   * <code>repeated string workflow_version_ids = 3;</code>
   * @return The count of workflowVersionIds.
   */
  int getWorkflowVersionIdsCount();
  /**
   * <pre>
   * Delete the versions identified by these ids
   * </pre>
   *
   * <code>repeated string workflow_version_ids = 3;</code>
   * @param index The index of the element to return.
   * @return The workflowVersionIds at the given index.
   */
  java.lang.String getWorkflowVersionIds(int index);
  /**
   * <pre>
   * Delete the versions identified by these ids
   * </pre>
   *
   * <code>repeated string workflow_version_ids = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the workflowVersionIds at the given index.
   */
  com.google.protobuf.ByteString
      getWorkflowVersionIdsBytes(int index);
}
