// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface SingleBulkOperationsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.SingleBulkOperationsResponse)
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
   * <code>.clarifai.api.BulkOperation bulk_operation = 2;</code>
   * @return Whether the bulkOperation field is set.
   */
  boolean hasBulkOperation();
  /**
   * <code>.clarifai.api.BulkOperation bulk_operation = 2;</code>
   * @return The bulkOperation.
   */
  com.clarifai.grpc.api.BulkOperation getBulkOperation();
  /**
   * <code>.clarifai.api.BulkOperation bulk_operation = 2;</code>
   */
  com.clarifai.grpc.api.BulkOperationOrBuilder getBulkOperationOrBuilder();
}
