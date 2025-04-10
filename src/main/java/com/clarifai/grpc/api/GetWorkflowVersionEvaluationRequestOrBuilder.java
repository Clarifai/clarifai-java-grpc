// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface GetWorkflowVersionEvaluationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.GetWorkflowVersionEvaluationRequest)
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
   * <code>string workflow_id = 2;</code>
   * @return The workflowId.
   */
  java.lang.String getWorkflowId();
  /**
   * <code>string workflow_id = 2;</code>
   * @return The bytes for workflowId.
   */
  com.google.protobuf.ByteString
      getWorkflowIdBytes();

  /**
   * <code>string workflow_version_id = 3;</code>
   * @return The workflowVersionId.
   */
  java.lang.String getWorkflowVersionId();
  /**
   * <code>string workflow_version_id = 3;</code>
   * @return The bytes for workflowVersionId.
   */
  com.google.protobuf.ByteString
      getWorkflowVersionIdBytes();

  /**
   * <code>string workflow_version_evaluation_id = 4;</code>
   * @return The workflowVersionEvaluationId.
   */
  java.lang.String getWorkflowVersionEvaluationId();
  /**
   * <code>string workflow_version_evaluation_id = 4;</code>
   * @return The bytes for workflowVersionEvaluationId.
   */
  com.google.protobuf.ByteString
      getWorkflowVersionEvaluationIdBytes();
}
