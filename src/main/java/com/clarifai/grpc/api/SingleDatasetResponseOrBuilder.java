// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface SingleDatasetResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.SingleDatasetResponse)
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
   * <code>.clarifai.api.Dataset dataset = 2;</code>
   * @return Whether the dataset field is set.
   */
  boolean hasDataset();
  /**
   * <code>.clarifai.api.Dataset dataset = 2;</code>
   * @return The dataset.
   */
  com.clarifai.grpc.api.Dataset getDataset();
  /**
   * <code>.clarifai.api.Dataset dataset = 2;</code>
   */
  com.clarifai.grpc.api.DatasetOrBuilder getDatasetOrBuilder();
}
