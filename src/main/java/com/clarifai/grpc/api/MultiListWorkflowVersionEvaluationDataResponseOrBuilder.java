// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface MultiListWorkflowVersionEvaluationDataResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.MultiListWorkflowVersionEvaluationDataResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.clarifai.api.status.Status status = 1;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>.clarifai.api.status.Status status = 1;</code>
   * @return The status.
   */
  com.clarifai.grpc.api.status.Status getStatus();
  /**
   * <code>.clarifai.api.status.Status status = 1;</code>
   */
  com.clarifai.grpc.api.status.StatusOrBuilder getStatusOrBuilder();

  /**
   * <code>repeated .clarifai.api.WorkflowVersionEvaluationData workflow_version_evaluation_data = 2;</code>
   */
  java.util.List<com.clarifai.grpc.api.WorkflowVersionEvaluationData> 
      getWorkflowVersionEvaluationDataList();
  /**
   * <code>repeated .clarifai.api.WorkflowVersionEvaluationData workflow_version_evaluation_data = 2;</code>
   */
  com.clarifai.grpc.api.WorkflowVersionEvaluationData getWorkflowVersionEvaluationData(int index);
  /**
   * <code>repeated .clarifai.api.WorkflowVersionEvaluationData workflow_version_evaluation_data = 2;</code>
   */
  int getWorkflowVersionEvaluationDataCount();
  /**
   * <code>repeated .clarifai.api.WorkflowVersionEvaluationData workflow_version_evaluation_data = 2;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.WorkflowVersionEvaluationDataOrBuilder> 
      getWorkflowVersionEvaluationDataOrBuilderList();
  /**
   * <code>repeated .clarifai.api.WorkflowVersionEvaluationData workflow_version_evaluation_data = 2;</code>
   */
  com.clarifai.grpc.api.WorkflowVersionEvaluationDataOrBuilder getWorkflowVersionEvaluationDataOrBuilder(
      int index);
}
