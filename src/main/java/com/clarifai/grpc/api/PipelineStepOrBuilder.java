// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface PipelineStepOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.PipelineStep)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the pipeline step.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * The ID of the pipeline step.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * The user the pipeline step belongs to
   * </pre>
   *
   * <code>string user_id = 2;</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * The user the pipeline step belongs to
   * </pre>
   *
   * <code>string user_id = 2;</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * Description of the pipeline step
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Description of the pipeline step
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Latest Pipeline Step Version
   * </pre>
   *
   * <code>.clarifai.api.PipelineStepVersion pipeline_step_version = 4;</code>
   * @return Whether the pipelineStepVersion field is set.
   */
  boolean hasPipelineStepVersion();
  /**
   * <pre>
   * Latest Pipeline Step Version
   * </pre>
   *
   * <code>.clarifai.api.PipelineStepVersion pipeline_step_version = 4;</code>
   * @return The pipelineStepVersion.
   */
  com.clarifai.grpc.api.PipelineStepVersion getPipelineStepVersion();
  /**
   * <pre>
   * Latest Pipeline Step Version
   * </pre>
   *
   * <code>.clarifai.api.PipelineStepVersion pipeline_step_version = 4;</code>
   */
  com.clarifai.grpc.api.PipelineStepVersionOrBuilder getPipelineStepVersionOrBuilder();

  /**
   * <pre>
   * The visibility field represents whether this is privately/publicly visible.
   * To be visible to the public the App that contains it AND the User that contains the App must
   * also be publicly visible.
   * </pre>
   *
   * <code>.clarifai.api.Visibility visibility = 5;</code>
   * @return Whether the visibility field is set.
   */
  boolean hasVisibility();
  /**
   * <pre>
   * The visibility field represents whether this is privately/publicly visible.
   * To be visible to the public the App that contains it AND the User that contains the App must
   * also be publicly visible.
   * </pre>
   *
   * <code>.clarifai.api.Visibility visibility = 5;</code>
   * @return The visibility.
   */
  com.clarifai.grpc.api.Visibility getVisibility();
  /**
   * <pre>
   * The visibility field represents whether this is privately/publicly visible.
   * To be visible to the public the App that contains it AND the User that contains the App must
   * also be publicly visible.
   * </pre>
   *
   * <code>.clarifai.api.Visibility visibility = 5;</code>
   */
  com.clarifai.grpc.api.VisibilityOrBuilder getVisibilityOrBuilder();

  /**
   * <pre>
   * When the pipeline step was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 6;</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <pre>
   * When the pipeline step was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 6;</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <pre>
   * When the pipeline step was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <pre>
   * When the pipeline step was last modified
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modified_at = 7;</code>
   * @return Whether the modifiedAt field is set.
   */
  boolean hasModifiedAt();
  /**
   * <pre>
   * When the pipeline step was last modified
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modified_at = 7;</code>
   * @return The modifiedAt.
   */
  com.google.protobuf.Timestamp getModifiedAt();
  /**
   * <pre>
   * When the pipeline step was last modified
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modified_at = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getModifiedAtOrBuilder();
}
