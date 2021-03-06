// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface ModelVersionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.ModelVersion)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * When the version was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 2;</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <pre>
   * When the version was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 2;</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <pre>
   * When the version was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <pre>
   * The status of the version (whether it's untrained, training, trained, etc.).
   * </pre>
   *
   * <code>.clarifai.api.status.Status status = 3;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * The status of the version (whether it's untrained, training, trained, etc.).
   * </pre>
   *
   * <code>.clarifai.api.status.Status status = 3;</code>
   * @return The status.
   */
  com.clarifai.grpc.api.status.Status getStatus();
  /**
   * <pre>
   * The status of the version (whether it's untrained, training, trained, etc.).
   * </pre>
   *
   * <code>.clarifai.api.status.Status status = 3;</code>
   */
  com.clarifai.grpc.api.status.StatusOrBuilder getStatusOrBuilder();

  /**
   * <code>uint32 active_concept_count = 4;</code>
   * @return The activeConceptCount.
   */
  int getActiveConceptCount();

  /**
   * <code>.clarifai.api.EvalMetrics metrics = 5;</code>
   * @return Whether the metrics field is set.
   */
  boolean hasMetrics();
  /**
   * <code>.clarifai.api.EvalMetrics metrics = 5;</code>
   * @return The metrics.
   */
  com.clarifai.grpc.api.EvalMetrics getMetrics();
  /**
   * <code>.clarifai.api.EvalMetrics metrics = 5;</code>
   */
  com.clarifai.grpc.api.EvalMetricsOrBuilder getMetricsOrBuilder();

  /**
   * <pre>
   * number of inputs in the model version
   * </pre>
   *
   * <code>uint32 total_input_count = 6;</code>
   * @return The totalInputCount.
   */
  int getTotalInputCount();

  /**
   * <pre>
   * When training of this version was completed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp completed_at = 10;</code>
   * @return Whether the completedAt field is set.
   */
  boolean hasCompletedAt();
  /**
   * <pre>
   * When training of this version was completed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp completed_at = 10;</code>
   * @return The completedAt.
   */
  com.google.protobuf.Timestamp getCompletedAt();
  /**
   * <pre>
   * When training of this version was completed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp completed_at = 10;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCompletedAtOrBuilder();

  /**
   * <pre>
   * Description about this version
   * </pre>
   *
   * <code>string description = 11;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Description about this version
   * </pre>
   *
   * <code>string description = 11;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * The visibility field represents whether this message is privately/publicly visible.
   * To be visible to the public the App that contains it AND the User that contains the App must
   * also be publicly visible.
   * </pre>
   *
   * <code>.clarifai.api.Visibility visibility = 12;</code>
   * @return Whether the visibility field is set.
   */
  boolean hasVisibility();
  /**
   * <pre>
   * The visibility field represents whether this message is privately/publicly visible.
   * To be visible to the public the App that contains it AND the User that contains the App must
   * also be publicly visible.
   * </pre>
   *
   * <code>.clarifai.api.Visibility visibility = 12;</code>
   * @return The visibility.
   */
  com.clarifai.grpc.api.Visibility getVisibility();
  /**
   * <pre>
   * The visibility field represents whether this message is privately/publicly visible.
   * To be visible to the public the App that contains it AND the User that contains the App must
   * also be publicly visible.
   * </pre>
   *
   * <code>.clarifai.api.Visibility visibility = 12;</code>
   */
  com.clarifai.grpc.api.VisibilityOrBuilder getVisibilityOrBuilder();

  /**
   * <pre>
   * The app the model version belongs to.
   * </pre>
   *
   * <code>string app_id = 13;</code>
   * @return The appId.
   */
  java.lang.String getAppId();
  /**
   * <pre>
   * The app the model version belongs to.
   * </pre>
   *
   * <code>string app_id = 13;</code>
   * @return The bytes for appId.
   */
  com.google.protobuf.ByteString
      getAppIdBytes();

  /**
   * <pre>
   * The user the model version belongs to.
   * </pre>
   *
   * <code>string user_id = 14;</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * The user the model version belongs to.
   * </pre>
   *
   * <code>string user_id = 14;</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();
}
