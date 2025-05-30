// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface MultiOutputResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.MultiOutputResponse)
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
   * <pre>
   * For each input processed during model prediction we create one output.
   * </pre>
   *
   * <code>repeated .clarifai.api.Output outputs = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  java.util.List<com.clarifai.grpc.api.Output> 
      getOutputsList();
  /**
   * <pre>
   * For each input processed during model prediction we create one output.
   * </pre>
   *
   * <code>repeated .clarifai.api.Output outputs = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  com.clarifai.grpc.api.Output getOutputs(int index);
  /**
   * <pre>
   * For each input processed during model prediction we create one output.
   * </pre>
   *
   * <code>repeated .clarifai.api.Output outputs = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  int getOutputsCount();
  /**
   * <pre>
   * For each input processed during model prediction we create one output.
   * </pre>
   *
   * <code>repeated .clarifai.api.Output outputs = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.OutputOrBuilder> 
      getOutputsOrBuilderList();
  /**
   * <pre>
   * For each input processed during model prediction we create one output.
   * </pre>
   *
   * <code>repeated .clarifai.api.Output outputs = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  com.clarifai.grpc.api.OutputOrBuilder getOutputsOrBuilder(
      int index);

  /**
   * <pre>
   * Information on where the computation is executed down to specific Deployment, Nodepool and ComputeCluster
   * </pre>
   *
   * <code>.clarifai.api.RunnerSelector runner_selector = 3;</code>
   * @return Whether the runnerSelector field is set.
   */
  boolean hasRunnerSelector();
  /**
   * <pre>
   * Information on where the computation is executed down to specific Deployment, Nodepool and ComputeCluster
   * </pre>
   *
   * <code>.clarifai.api.RunnerSelector runner_selector = 3;</code>
   * @return The runnerSelector.
   */
  com.clarifai.grpc.api.RunnerSelector getRunnerSelector();
  /**
   * <pre>
   * Information on where the computation is executed down to specific Deployment, Nodepool and ComputeCluster
   * </pre>
   *
   * <code>.clarifai.api.RunnerSelector runner_selector = 3;</code>
   */
  com.clarifai.grpc.api.RunnerSelectorOrBuilder getRunnerSelectorOrBuilder();
}
