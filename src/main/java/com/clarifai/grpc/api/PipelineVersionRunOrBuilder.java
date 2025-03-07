// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface PipelineVersionRunOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.PipelineVersionRun)
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
   * <pre>
   * Pipeline Version associated with this run
   * </pre>
   *
   * <code>.clarifai.api.PipelineVersion pipeline_version = 2;</code>
   * @return Whether the pipelineVersion field is set.
   */
  boolean hasPipelineVersion();
  /**
   * <pre>
   * Pipeline Version associated with this run
   * </pre>
   *
   * <code>.clarifai.api.PipelineVersion pipeline_version = 2;</code>
   * @return The pipelineVersion.
   */
  com.clarifai.grpc.api.PipelineVersion getPipelineVersion();
  /**
   * <pre>
   * Pipeline Version associated with this run
   * </pre>
   *
   * <code>.clarifai.api.PipelineVersion pipeline_version = 2;</code>
   */
  com.clarifai.grpc.api.PipelineVersionOrBuilder getPipelineVersionOrBuilder();

  /**
   * <pre>
   * Nodepool(s) used for the Pipeline Version Run
   * </pre>
   *
   * <code>repeated .clarifai.api.Nodepool nodepools = 3;</code>
   */
  java.util.List<com.clarifai.grpc.api.Nodepool> 
      getNodepoolsList();
  /**
   * <pre>
   * Nodepool(s) used for the Pipeline Version Run
   * </pre>
   *
   * <code>repeated .clarifai.api.Nodepool nodepools = 3;</code>
   */
  com.clarifai.grpc.api.Nodepool getNodepools(int index);
  /**
   * <pre>
   * Nodepool(s) used for the Pipeline Version Run
   * </pre>
   *
   * <code>repeated .clarifai.api.Nodepool nodepools = 3;</code>
   */
  int getNodepoolsCount();
  /**
   * <pre>
   * Nodepool(s) used for the Pipeline Version Run
   * </pre>
   *
   * <code>repeated .clarifai.api.Nodepool nodepools = 3;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.NodepoolOrBuilder> 
      getNodepoolsOrBuilderList();
  /**
   * <pre>
   * Nodepool(s) used for the Pipeline Version Run
   * </pre>
   *
   * <code>repeated .clarifai.api.Nodepool nodepools = 3;</code>
   */
  com.clarifai.grpc.api.NodepoolOrBuilder getNodepoolsOrBuilder(
      int index);

  /**
   * <pre>
   * Orchestration Status for this run, supporting multiple orchestration systems
   * </pre>
   *
   * <code>.clarifai.api.OrchestrationStatus orchestration_status = 4;</code>
   * @return Whether the orchestrationStatus field is set.
   */
  boolean hasOrchestrationStatus();
  /**
   * <pre>
   * Orchestration Status for this run, supporting multiple orchestration systems
   * </pre>
   *
   * <code>.clarifai.api.OrchestrationStatus orchestration_status = 4;</code>
   * @return The orchestrationStatus.
   */
  com.clarifai.grpc.api.OrchestrationStatus getOrchestrationStatus();
  /**
   * <pre>
   * Orchestration Status for this run, supporting multiple orchestration systems
   * </pre>
   *
   * <code>.clarifai.api.OrchestrationStatus orchestration_status = 4;</code>
   */
  com.clarifai.grpc.api.OrchestrationStatusOrBuilder getOrchestrationStatusOrBuilder();

  /**
   * <pre>
   * The user the pipeline belongs to
   * </pre>
   *
   * <code>string user_id = 5;</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * The user the pipeline belongs to
   * </pre>
   *
   * <code>string user_id = 5;</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * The app the pipeline belongs to
   * </pre>
   *
   * <code>string app_id = 6;</code>
   * @return The appId.
   */
  java.lang.String getAppId();
  /**
   * <pre>
   * The app the pipeline belongs to
   * </pre>
   *
   * <code>string app_id = 6;</code>
   * @return The bytes for appId.
   */
  com.google.protobuf.ByteString
      getAppIdBytes();
}
