// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface MultiWorkflowVersionEvaluationResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.MultiWorkflowVersionEvaluationResponse)
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
   * <code>repeated .clarifai.api.WorkflowVersionEvaluation workflow_version_evaluations = 2;</code>
   */
  java.util.List<com.clarifai.grpc.api.WorkflowVersionEvaluation> 
      getWorkflowVersionEvaluationsList();
  /**
   * <code>repeated .clarifai.api.WorkflowVersionEvaluation workflow_version_evaluations = 2;</code>
   */
  com.clarifai.grpc.api.WorkflowVersionEvaluation getWorkflowVersionEvaluations(int index);
  /**
   * <code>repeated .clarifai.api.WorkflowVersionEvaluation workflow_version_evaluations = 2;</code>
   */
  int getWorkflowVersionEvaluationsCount();
  /**
   * <code>repeated .clarifai.api.WorkflowVersionEvaluation workflow_version_evaluations = 2;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.WorkflowVersionEvaluationOrBuilder> 
      getWorkflowVersionEvaluationsOrBuilderList();
  /**
   * <code>repeated .clarifai.api.WorkflowVersionEvaluation workflow_version_evaluations = 2;</code>
   */
  com.clarifai.grpc.api.WorkflowVersionEvaluationOrBuilder getWorkflowVersionEvaluationsOrBuilder(
      int index);
}
