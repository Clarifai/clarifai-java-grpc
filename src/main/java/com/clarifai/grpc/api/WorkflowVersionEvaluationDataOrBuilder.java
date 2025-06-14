// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface WorkflowVersionEvaluationDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.WorkflowVersionEvaluationData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the data example id
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * the data example id
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>.clarifai.api.Input input = 2;</code>
   * @return Whether the input field is set.
   */
  boolean hasInput();
  /**
   * <code>.clarifai.api.Input input = 2;</code>
   * @return The input.
   */
  com.clarifai.grpc.api.Input getInput();
  /**
   * <code>.clarifai.api.Input input = 2;</code>
   */
  com.clarifai.grpc.api.InputOrBuilder getInputOrBuilder();

  /**
   * <code>repeated .clarifai.api.Data ground_truths = 3;</code>
   */
  java.util.List<com.clarifai.grpc.api.Data> 
      getGroundTruthsList();
  /**
   * <code>repeated .clarifai.api.Data ground_truths = 3;</code>
   */
  com.clarifai.grpc.api.Data getGroundTruths(int index);
  /**
   * <code>repeated .clarifai.api.Data ground_truths = 3;</code>
   */
  int getGroundTruthsCount();
  /**
   * <code>repeated .clarifai.api.Data ground_truths = 3;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.DataOrBuilder> 
      getGroundTruthsOrBuilderList();
  /**
   * <code>repeated .clarifai.api.Data ground_truths = 3;</code>
   */
  com.clarifai.grpc.api.DataOrBuilder getGroundTruthsOrBuilder(
      int index);

  /**
   * <code>repeated .clarifai.api.Data predictions = 4;</code>
   */
  java.util.List<com.clarifai.grpc.api.Data> 
      getPredictionsList();
  /**
   * <code>repeated .clarifai.api.Data predictions = 4;</code>
   */
  com.clarifai.grpc.api.Data getPredictions(int index);
  /**
   * <code>repeated .clarifai.api.Data predictions = 4;</code>
   */
  int getPredictionsCount();
  /**
   * <code>repeated .clarifai.api.Data predictions = 4;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.DataOrBuilder> 
      getPredictionsOrBuilderList();
  /**
   * <code>repeated .clarifai.api.Data predictions = 4;</code>
   */
  com.clarifai.grpc.api.DataOrBuilder getPredictionsOrBuilder(
      int index);

  /**
   * <code>.clarifai.api.WorkflowEvaluationInputResult workflow_evaluation_sample_result = 5;</code>
   * @return Whether the workflowEvaluationSampleResult field is set.
   */
  boolean hasWorkflowEvaluationSampleResult();
  /**
   * <code>.clarifai.api.WorkflowEvaluationInputResult workflow_evaluation_sample_result = 5;</code>
   * @return The workflowEvaluationSampleResult.
   */
  com.clarifai.grpc.api.WorkflowEvaluationInputResult getWorkflowEvaluationSampleResult();
  /**
   * <code>.clarifai.api.WorkflowEvaluationInputResult workflow_evaluation_sample_result = 5;</code>
   */
  com.clarifai.grpc.api.WorkflowEvaluationInputResultOrBuilder getWorkflowEvaluationSampleResultOrBuilder();
}
