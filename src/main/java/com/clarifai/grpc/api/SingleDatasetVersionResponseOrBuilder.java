// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface SingleDatasetVersionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.SingleDatasetVersionResponse)
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
   * <code>.clarifai.api.DatasetVersion dataset_version = 2;</code>
   * @return Whether the datasetVersion field is set.
   */
  boolean hasDatasetVersion();
  /**
   * <code>.clarifai.api.DatasetVersion dataset_version = 2;</code>
   * @return The datasetVersion.
   */
  com.clarifai.grpc.api.DatasetVersion getDatasetVersion();
  /**
   * <code>.clarifai.api.DatasetVersion dataset_version = 2;</code>
   */
  com.clarifai.grpc.api.DatasetVersionOrBuilder getDatasetVersionOrBuilder();
}
