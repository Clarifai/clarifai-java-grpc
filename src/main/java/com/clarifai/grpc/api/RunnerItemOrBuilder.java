// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface RunnerItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.RunnerItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A UUID hash for this work item.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * A UUID hash for this work item.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * A description of the work to be done in case needed for UIs.
   * </pre>
   *
   * <code>string description = 2;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * A description of the work to be done in case needed for UIs.
   * </pre>
   *
   * <code>string description = 2;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * TODO(zeiler): make these options a oneof.
   * first work to do would be an inference runner.
   * </pre>
   *
   * <code>.clarifai.api.PostModelOutputsRequest post_model_outputs_request = 3;</code>
   * @return Whether the postModelOutputsRequest field is set.
   */
  boolean hasPostModelOutputsRequest();
  /**
   * <pre>
   * TODO(zeiler): make these options a oneof.
   * first work to do would be an inference runner.
   * </pre>
   *
   * <code>.clarifai.api.PostModelOutputsRequest post_model_outputs_request = 3;</code>
   * @return The postModelOutputsRequest.
   */
  com.clarifai.grpc.api.PostModelOutputsRequest getPostModelOutputsRequest();
  /**
   * <pre>
   * TODO(zeiler): make these options a oneof.
   * first work to do would be an inference runner.
   * </pre>
   *
   * <code>.clarifai.api.PostModelOutputsRequest post_model_outputs_request = 3;</code>
   */
  com.clarifai.grpc.api.PostModelOutputsRequestOrBuilder getPostModelOutputsRequestOrBuilder();
}
