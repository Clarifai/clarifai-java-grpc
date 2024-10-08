// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface WorkflowVersionEvaluationTemplateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.WorkflowVersionEvaluationTemplate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string description = 2;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 2;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Applicable for the task types like TextClassification, TextGeneration, etc
   * </pre>
   *
   * <code>repeated .clarifai.api.WorkflowVersionEvaluationTemplate.TaskType task_types = 3;</code>
   * @return A list containing the taskTypes.
   */
  java.util.List<com.clarifai.grpc.api.WorkflowVersionEvaluationTemplate.TaskType> getTaskTypesList();
  /**
   * <pre>
   * Applicable for the task types like TextClassification, TextGeneration, etc
   * </pre>
   *
   * <code>repeated .clarifai.api.WorkflowVersionEvaluationTemplate.TaskType task_types = 3;</code>
   * @return The count of taskTypes.
   */
  int getTaskTypesCount();
  /**
   * <pre>
   * Applicable for the task types like TextClassification, TextGeneration, etc
   * </pre>
   *
   * <code>repeated .clarifai.api.WorkflowVersionEvaluationTemplate.TaskType task_types = 3;</code>
   * @param index The index of the element to return.
   * @return The taskTypes at the given index.
   */
  com.clarifai.grpc.api.WorkflowVersionEvaluationTemplate.TaskType getTaskTypes(int index);
  /**
   * <pre>
   * Applicable for the task types like TextClassification, TextGeneration, etc
   * </pre>
   *
   * <code>repeated .clarifai.api.WorkflowVersionEvaluationTemplate.TaskType task_types = 3;</code>
   * @return A list containing the enum numeric values on the wire for taskTypes.
   */
  java.util.List<java.lang.Integer>
  getTaskTypesValueList();
  /**
   * <pre>
   * Applicable for the task types like TextClassification, TextGeneration, etc
   * </pre>
   *
   * <code>repeated .clarifai.api.WorkflowVersionEvaluationTemplate.TaskType task_types = 3;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of taskTypes at the given index.
   */
  int getTaskTypesValue(int index);

  /**
   * <pre>
   * The Workflow Evaluation template metrics
   * </pre>
   *
   * <code>repeated .clarifai.api.WorkflowVersionEvaluationMetric workflow_version_evaluation_metrics = 4;</code>
   */
  java.util.List<com.clarifai.grpc.api.WorkflowVersionEvaluationMetric> 
      getWorkflowVersionEvaluationMetricsList();
  /**
   * <pre>
   * The Workflow Evaluation template metrics
   * </pre>
   *
   * <code>repeated .clarifai.api.WorkflowVersionEvaluationMetric workflow_version_evaluation_metrics = 4;</code>
   */
  com.clarifai.grpc.api.WorkflowVersionEvaluationMetric getWorkflowVersionEvaluationMetrics(int index);
  /**
   * <pre>
   * The Workflow Evaluation template metrics
   * </pre>
   *
   * <code>repeated .clarifai.api.WorkflowVersionEvaluationMetric workflow_version_evaluation_metrics = 4;</code>
   */
  int getWorkflowVersionEvaluationMetricsCount();
  /**
   * <pre>
   * The Workflow Evaluation template metrics
   * </pre>
   *
   * <code>repeated .clarifai.api.WorkflowVersionEvaluationMetric workflow_version_evaluation_metrics = 4;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.WorkflowVersionEvaluationMetricOrBuilder> 
      getWorkflowVersionEvaluationMetricsOrBuilderList();
  /**
   * <pre>
   * The Workflow Evaluation template metrics
   * </pre>
   *
   * <code>repeated .clarifai.api.WorkflowVersionEvaluationMetric workflow_version_evaluation_metrics = 4;</code>
   */
  com.clarifai.grpc.api.WorkflowVersionEvaluationMetricOrBuilder getWorkflowVersionEvaluationMetricsOrBuilder(
      int index);
}
