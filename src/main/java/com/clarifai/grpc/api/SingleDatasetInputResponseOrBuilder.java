// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface SingleDatasetInputResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.SingleDatasetInputResponse)
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
   * <code>.clarifai.api.DatasetInput dataset_input = 2;</code>
   * @return Whether the datasetInput field is set.
   */
  boolean hasDatasetInput();
  /**
   * <code>.clarifai.api.DatasetInput dataset_input = 2;</code>
   * @return The datasetInput.
   */
  com.clarifai.grpc.api.DatasetInput getDatasetInput();
  /**
   * <code>.clarifai.api.DatasetInput dataset_input = 2;</code>
   */
  com.clarifai.grpc.api.DatasetInputOrBuilder getDatasetInputOrBuilder();
}
