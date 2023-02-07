// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface MultiEvalMetricsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.MultiEvalMetricsResponse)
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
   * <code>repeated .clarifai.api.EvalMetrics eval_metrics = 2;</code>
   */
  java.util.List<com.clarifai.grpc.api.EvalMetrics> 
      getEvalMetricsList();
  /**
   * <code>repeated .clarifai.api.EvalMetrics eval_metrics = 2;</code>
   */
  com.clarifai.grpc.api.EvalMetrics getEvalMetrics(int index);
  /**
   * <code>repeated .clarifai.api.EvalMetrics eval_metrics = 2;</code>
   */
  int getEvalMetricsCount();
  /**
   * <code>repeated .clarifai.api.EvalMetrics eval_metrics = 2;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.EvalMetricsOrBuilder> 
      getEvalMetricsOrBuilderList();
  /**
   * <code>repeated .clarifai.api.EvalMetrics eval_metrics = 2;</code>
   */
  com.clarifai.grpc.api.EvalMetricsOrBuilder getEvalMetricsOrBuilder(
      int index);
}
