// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface TaskStatusCountPerUserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.TaskStatusCountPerUser)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Deprecated: Use worker instead.
   * </pre>
   *
   * <code>string user_id = 1 [deprecated = true];</code>
   * @deprecated clarifai.api.TaskStatusCountPerUser.user_id is deprecated.
   *     See proto/clarifai/api/resources.proto;l=3622
   * @return The userId.
   */
  @java.lang.Deprecated java.lang.String getUserId();
  /**
   * <pre>
   * Deprecated: Use worker instead.
   * </pre>
   *
   * <code>string user_id = 1 [deprecated = true];</code>
   * @deprecated clarifai.api.TaskStatusCountPerUser.user_id is deprecated.
   *     See proto/clarifai/api/resources.proto;l=3622
   * @return The bytes for userId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <code>uint32 pending = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The pending.
   */
  int getPending();

  /**
   * <code>uint32 awaiting_review = 3 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The awaitingReview.
   */
  int getAwaitingReview();

  /**
   * <code>uint32 success = 4 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The success.
   */
  int getSuccess();

  /**
   * <code>uint32 review_denied = 5 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The reviewDenied.
   */
  int getReviewDenied();

  /**
   * <code>uint32 awaiting_consensus_review = 6 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The awaitingConsensusReview.
   */
  int getAwaitingConsensusReview();

  /**
   * <code>.clarifai.api.Worker worker = 7;</code>
   * @return Whether the worker field is set.
   */
  boolean hasWorker();
  /**
   * <code>.clarifai.api.Worker worker = 7;</code>
   * @return The worker.
   */
  com.clarifai.grpc.api.Worker getWorker();
  /**
   * <code>.clarifai.api.Worker worker = 7;</code>
   */
  com.clarifai.grpc.api.WorkerOrBuilder getWorkerOrBuilder();
}
