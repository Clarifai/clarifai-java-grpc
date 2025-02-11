// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface ComputePlaneMetricsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.ComputePlaneMetrics)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Who and where the metrics are from.
   * </pre>
   *
   * <code>.clarifai.api.ComputeSourceMetadata meta = 1;</code>
   * @return Whether the meta field is set.
   */
  boolean hasMeta();
  /**
   * <pre>
   * Who and where the metrics are from.
   * </pre>
   *
   * <code>.clarifai.api.ComputeSourceMetadata meta = 1;</code>
   * @return The meta.
   */
  com.clarifai.grpc.api.ComputeSourceMetadata getMeta();
  /**
   * <pre>
   * Who and where the metrics are from.
   * </pre>
   *
   * <code>.clarifai.api.ComputeSourceMetadata meta = 1;</code>
   */
  com.clarifai.grpc.api.ComputeSourceMetadataOrBuilder getMetaOrBuilder();

  /**
   * <pre>
   * e.g. aws, azure, on-prem.
   * </pre>
   *
   * <code>string cloud = 2;</code>
   * @return The cloud.
   */
  java.lang.String getCloud();
  /**
   * <pre>
   * e.g. aws, azure, on-prem.
   * </pre>
   *
   * <code>string cloud = 2;</code>
   * @return The bytes for cloud.
   */
  com.google.protobuf.ByteString
      getCloudBytes();

  /**
   * <pre>
   * e.g. us-east, us-west.
   * </pre>
   *
   * <code>string region = 3;</code>
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   * <pre>
   * e.g. us-east, us-west.
   * </pre>
   *
   * <code>string region = 3;</code>
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString
      getRegionBytes();

  /**
   * <pre>
   * e.g. t3a.medium, g5.xlarge.
   * </pre>
   *
   * <code>string instance_type = 4;</code>
   * @return The instanceType.
   */
  java.lang.String getInstanceType();
  /**
   * <pre>
   * e.g. t3a.medium, g5.xlarge.
   * </pre>
   *
   * <code>string instance_type = 4;</code>
   * @return The bytes for instanceType.
   */
  com.google.protobuf.ByteString
      getInstanceTypeBytes();

  /**
   * <pre>
   * e.g. spot, on-demand.
   * </pre>
   *
   * <code>string reservation_type = 5;</code>
   * @return The reservationType.
   */
  java.lang.String getReservationType();
  /**
   * <pre>
   * e.g. spot, on-demand.
   * </pre>
   *
   * <code>string reservation_type = 5;</code>
   * @return The bytes for reservationType.
   */
  com.google.protobuf.ByteString
      getReservationTypeBytes();

  /**
   * <pre>
   * Metrics billing
   * </pre>
   *
   * <code>float reservation_price = 6;</code>
   * @return The reservationPrice.
   */
  float getReservationPrice();

  /**
   * <pre>
   * Runtime in seconds.
   * </pre>
   *
   * <code>int32 runtime_s = 7;</code>
   * @return The runtimeS.
   */
  int getRuntimeS();

  /**
   * <pre>
   * Metrics for latency.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 8;</code>
   * @return Whether the timestamp field is set.
   */
  boolean hasTimestamp();
  /**
   * <pre>
   * Metrics for latency.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 8;</code>
   * @return The timestamp.
   */
  com.google.protobuf.Timestamp getTimestamp();
  /**
   * <pre>
   * Metrics for latency.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 8;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder();

  /**
   * <pre>
   * e.g. NodeProvisioned, NodeTerminated, ModelDeployed, ModelScheduled, ModelReady.
   * </pre>
   *
   * <code>string event_type = 9;</code>
   * @return The eventType.
   */
  java.lang.String getEventType();
  /**
   * <pre>
   * e.g. NodeProvisioned, NodeTerminated, ModelDeployed, ModelScheduled, ModelReady.
   * </pre>
   *
   * <code>string event_type = 9;</code>
   * @return The bytes for eventType.
   */
  com.google.protobuf.ByteString
      getEventTypeBytes();

  /**
   * <pre>
   * GPU metrics.
   * </pre>
   *
   * <code>repeated .clarifai.api.GpuMetrics gpu_metrics = 10;</code>
   */
  java.util.List<com.clarifai.grpc.api.GpuMetrics> 
      getGpuMetricsList();
  /**
   * <pre>
   * GPU metrics.
   * </pre>
   *
   * <code>repeated .clarifai.api.GpuMetrics gpu_metrics = 10;</code>
   */
  com.clarifai.grpc.api.GpuMetrics getGpuMetrics(int index);
  /**
   * <pre>
   * GPU metrics.
   * </pre>
   *
   * <code>repeated .clarifai.api.GpuMetrics gpu_metrics = 10;</code>
   */
  int getGpuMetricsCount();
  /**
   * <pre>
   * GPU metrics.
   * </pre>
   *
   * <code>repeated .clarifai.api.GpuMetrics gpu_metrics = 10;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.GpuMetricsOrBuilder> 
      getGpuMetricsOrBuilderList();
  /**
   * <pre>
   * GPU metrics.
   * </pre>
   *
   * <code>repeated .clarifai.api.GpuMetrics gpu_metrics = 10;</code>
   */
  com.clarifai.grpc.api.GpuMetricsOrBuilder getGpuMetricsOrBuilder(
      int index);

  /**
   * <pre>
   * Hostname of the node.
   * </pre>
   *
   * <code>string hostname = 11;</code>
   * @return The hostname.
   */
  java.lang.String getHostname();
  /**
   * <pre>
   * Hostname of the node.
   * </pre>
   *
   * <code>string hostname = 11;</code>
   * @return The bytes for hostname.
   */
  com.google.protobuf.ByteString
      getHostnameBytes();
}
