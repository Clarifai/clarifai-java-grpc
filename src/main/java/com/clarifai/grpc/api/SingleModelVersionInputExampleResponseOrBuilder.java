// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface SingleModelVersionInputExampleResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.SingleModelVersionInputExampleResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * status of response
   * </pre>
   *
   * <code>.clarifai.api.status.Status status = 1;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * status of response
   * </pre>
   *
   * <code>.clarifai.api.status.Status status = 1;</code>
   * @return The status.
   */
  com.clarifai.grpc.api.status.Status getStatus();
  /**
   * <pre>
   * status of response
   * </pre>
   *
   * <code>.clarifai.api.status.Status status = 1;</code>
   */
  com.clarifai.grpc.api.status.StatusOrBuilder getStatusOrBuilder();

  /**
   * <pre>
   * model input example message
   * </pre>
   *
   * <code>.clarifai.api.ModelVersionInputExample model_version_input_example = 2;</code>
   * @return Whether the modelVersionInputExample field is set.
   */
  boolean hasModelVersionInputExample();
  /**
   * <pre>
   * model input example message
   * </pre>
   *
   * <code>.clarifai.api.ModelVersionInputExample model_version_input_example = 2;</code>
   * @return The modelVersionInputExample.
   */
  com.clarifai.grpc.api.ModelVersionInputExample getModelVersionInputExample();
  /**
   * <pre>
   * model input example message
   * </pre>
   *
   * <code>.clarifai.api.ModelVersionInputExample model_version_input_example = 2;</code>
   */
  com.clarifai.grpc.api.ModelVersionInputExampleOrBuilder getModelVersionInputExampleOrBuilder();
}
