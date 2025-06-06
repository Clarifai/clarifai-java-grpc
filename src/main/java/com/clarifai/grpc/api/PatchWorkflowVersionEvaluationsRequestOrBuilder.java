// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface PatchWorkflowVersionEvaluationsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.PatchWorkflowVersionEvaluationsRequest)
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
   * <pre>
   * ########## Supported fields ##########
   * - id
   * - predictions_dataset_version.dataset_id
   * - predictions_dataset_version.id
   * - status.code
   * - status.details
   * - workflow_evaluation_result.summary.evaluation_metric_values[].evaluation_metric_id
   * - workflow_evaluation_result.summary.evaluation_metric_values[].explanation
   * - workflow_evaluation_result.summary.evaluation_metric_values[].metric_value.float_value
   * - workflow_evaluation_result.summary.evaluation_metric_values[].metric_value.int_value
   * - workflow_evaluation_result.summary.evaluation_metric_values[].metric_value.string_value
   * - workflow_evaluation_result.summary.evaluation_metric_values[].per_concept_values
   * </pre>
   *
   * <code>repeated .clarifai.api.WorkflowVersionEvaluation workflow_version_evaluations = 4;</code>
   */
  java.util.List<com.clarifai.grpc.api.WorkflowVersionEvaluation> 
      getWorkflowVersionEvaluationsList();
  /**
   * <pre>
   * ########## Supported fields ##########
   * - id
   * - predictions_dataset_version.dataset_id
   * - predictions_dataset_version.id
   * - status.code
   * - status.details
   * - workflow_evaluation_result.summary.evaluation_metric_values[].evaluation_metric_id
   * - workflow_evaluation_result.summary.evaluation_metric_values[].explanation
   * - workflow_evaluation_result.summary.evaluation_metric_values[].metric_value.float_value
   * - workflow_evaluation_result.summary.evaluation_metric_values[].metric_value.int_value
   * - workflow_evaluation_result.summary.evaluation_metric_values[].metric_value.string_value
   * - workflow_evaluation_result.summary.evaluation_metric_values[].per_concept_values
   * </pre>
   *
   * <code>repeated .clarifai.api.WorkflowVersionEvaluation workflow_version_evaluations = 4;</code>
   */
  com.clarifai.grpc.api.WorkflowVersionEvaluation getWorkflowVersionEvaluations(int index);
  /**
   * <pre>
   * ########## Supported fields ##########
   * - id
   * - predictions_dataset_version.dataset_id
   * - predictions_dataset_version.id
   * - status.code
   * - status.details
   * - workflow_evaluation_result.summary.evaluation_metric_values[].evaluation_metric_id
   * - workflow_evaluation_result.summary.evaluation_metric_values[].explanation
   * - workflow_evaluation_result.summary.evaluation_metric_values[].metric_value.float_value
   * - workflow_evaluation_result.summary.evaluation_metric_values[].metric_value.int_value
   * - workflow_evaluation_result.summary.evaluation_metric_values[].metric_value.string_value
   * - workflow_evaluation_result.summary.evaluation_metric_values[].per_concept_values
   * </pre>
   *
   * <code>repeated .clarifai.api.WorkflowVersionEvaluation workflow_version_evaluations = 4;</code>
   */
  int getWorkflowVersionEvaluationsCount();
  /**
   * <pre>
   * ########## Supported fields ##########
   * - id
   * - predictions_dataset_version.dataset_id
   * - predictions_dataset_version.id
   * - status.code
   * - status.details
   * - workflow_evaluation_result.summary.evaluation_metric_values[].evaluation_metric_id
   * - workflow_evaluation_result.summary.evaluation_metric_values[].explanation
   * - workflow_evaluation_result.summary.evaluation_metric_values[].metric_value.float_value
   * - workflow_evaluation_result.summary.evaluation_metric_values[].metric_value.int_value
   * - workflow_evaluation_result.summary.evaluation_metric_values[].metric_value.string_value
   * - workflow_evaluation_result.summary.evaluation_metric_values[].per_concept_values
   * </pre>
   *
   * <code>repeated .clarifai.api.WorkflowVersionEvaluation workflow_version_evaluations = 4;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.WorkflowVersionEvaluationOrBuilder> 
      getWorkflowVersionEvaluationsOrBuilderList();
  /**
   * <pre>
   * ########## Supported fields ##########
   * - id
   * - predictions_dataset_version.dataset_id
   * - predictions_dataset_version.id
   * - status.code
   * - status.details
   * - workflow_evaluation_result.summary.evaluation_metric_values[].evaluation_metric_id
   * - workflow_evaluation_result.summary.evaluation_metric_values[].explanation
   * - workflow_evaluation_result.summary.evaluation_metric_values[].metric_value.float_value
   * - workflow_evaluation_result.summary.evaluation_metric_values[].metric_value.int_value
   * - workflow_evaluation_result.summary.evaluation_metric_values[].metric_value.string_value
   * - workflow_evaluation_result.summary.evaluation_metric_values[].per_concept_values
   * </pre>
   *
   * <code>repeated .clarifai.api.WorkflowVersionEvaluation workflow_version_evaluations = 4;</code>
   */
  com.clarifai.grpc.api.WorkflowVersionEvaluationOrBuilder getWorkflowVersionEvaluationsOrBuilder(
      int index);

  /**
   * <pre>
   * only overwrite supported
   * </pre>
   *
   * <code>string action = 5;</code>
   * @return The action.
   */
  java.lang.String getAction();
  /**
   * <pre>
   * only overwrite supported
   * </pre>
   *
   * <code>string action = 5;</code>
   * @return The bytes for action.
   */
  com.google.protobuf.ByteString
      getActionBytes();
}
