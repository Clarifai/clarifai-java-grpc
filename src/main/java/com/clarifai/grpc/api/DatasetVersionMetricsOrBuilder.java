// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface DatasetVersionMetricsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.DatasetVersionMetrics)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 inputs_count = 1;</code>
   * @return The inputsCount.
   */
  long getInputsCount();

  /**
   * <code>uint64 positive_annotations_count = 2;</code>
   * @return The positiveAnnotationsCount.
   */
  long getPositiveAnnotationsCount();

  /**
   * <code>uint64 bounding_boxes_count = 3;</code>
   * @return The boundingBoxesCount.
   */
  long getBoundingBoxesCount();
}