// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface SingleWorkflowVersionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.SingleWorkflowVersionResponse)
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
   * <code>.clarifai.api.WorkflowVersion workflow_version = 2;</code>
   * @return Whether the workflowVersion field is set.
   */
  boolean hasWorkflowVersion();
  /**
   * <code>.clarifai.api.WorkflowVersion workflow_version = 2;</code>
   * @return The workflowVersion.
   */
  com.clarifai.grpc.api.WorkflowVersion getWorkflowVersion();
  /**
   * <code>.clarifai.api.WorkflowVersion workflow_version = 2;</code>
   */
  com.clarifai.grpc.api.WorkflowVersionOrBuilder getWorkflowVersionOrBuilder();
}
