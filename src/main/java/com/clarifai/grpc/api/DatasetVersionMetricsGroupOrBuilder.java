// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface DatasetVersionMetricsGroupOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.DatasetVersionMetricsGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string parent_path = 1;</code>
   * @return The parentPath.
   */
  java.lang.String getParentPath();
  /**
   * <code>string parent_path = 1;</code>
   * @return The bytes for parentPath.
   */
  com.google.protobuf.ByteString
      getParentPathBytes();

  /**
   * <code>.clarifai.api.DatasetVersionMetricsGroupType type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.clarifai.api.DatasetVersionMetricsGroupType type = 2;</code>
   * @return The type.
   */
  com.clarifai.grpc.api.DatasetVersionMetricsGroupType getType();

  /**
   * <code>.google.protobuf.Value value = 3;</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <code>.google.protobuf.Value value = 3;</code>
   * @return The value.
   */
  com.google.protobuf.Value getValue();
  /**
   * <code>.google.protobuf.Value value = 3;</code>
   */
  com.google.protobuf.ValueOrBuilder getValueOrBuilder();

  /**
   * <code>.clarifai.api.DatasetVersionMetrics metrics = 4;</code>
   * @return Whether the metrics field is set.
   */
  boolean hasMetrics();
  /**
   * <code>.clarifai.api.DatasetVersionMetrics metrics = 4;</code>
   * @return The metrics.
   */
  com.clarifai.grpc.api.DatasetVersionMetrics getMetrics();
  /**
   * <code>.clarifai.api.DatasetVersionMetrics metrics = 4;</code>
   */
  com.clarifai.grpc.api.DatasetVersionMetricsOrBuilder getMetricsOrBuilder();
}
