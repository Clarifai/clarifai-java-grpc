// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface FieldsValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.FieldsValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool confusion_matrix = 1;</code>
   * @return The confusionMatrix.
   */
  boolean getConfusionMatrix();

  /**
   * <code>bool cooccurrence_matrix = 2;</code>
   * @return The cooccurrenceMatrix.
   */
  boolean getCooccurrenceMatrix();

  /**
   * <code>bool label_counts = 3;</code>
   * @return The labelCounts.
   */
  boolean getLabelCounts();

  /**
   * <code>bool binary_metrics = 4;</code>
   * @return The binaryMetrics.
   */
  boolean getBinaryMetrics();

  /**
   * <code>bool test_set = 5;</code>
   * @return The testSet.
   */
  boolean getTestSet();

  /**
   * <code>bool metrics_by_area = 6;</code>
   * @return The metricsByArea.
   */
  boolean getMetricsByArea();

  /**
   * <code>bool metrics_by_class = 7;</code>
   * @return The metricsByClass.
   */
  boolean getMetricsByClass();
}
