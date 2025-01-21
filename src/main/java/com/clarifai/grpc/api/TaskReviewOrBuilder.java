// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface TaskReviewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.TaskReview)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Task review strategy.
   * </pre>
   *
   * <code>.clarifai.api.TaskReview.TaskReviewStrategy strategy = 1;</code>
   * @return The enum numeric value on the wire for strategy.
   */
  int getStrategyValue();
  /**
   * <pre>
   * Task review strategy.
   * </pre>
   *
   * <code>.clarifai.api.TaskReview.TaskReviewStrategy strategy = 1;</code>
   * @return The strategy.
   */
  com.clarifai.grpc.api.TaskReview.TaskReviewStrategy getStrategy();

  /**
   * <pre>
   * Who will review this task.
   * DEPRECATED: Use users.id instead.
   * </pre>
   *
   * <code>repeated string user_ids = 2 [deprecated = true];</code>
   * @deprecated clarifai.api.TaskReview.user_ids is deprecated.
   *     See proto/clarifai/api/resources.proto;l=3380
   * @return A list containing the userIds.
   */
  @java.lang.Deprecated java.util.List<java.lang.String>
      getUserIdsList();
  /**
   * <pre>
   * Who will review this task.
   * DEPRECATED: Use users.id instead.
   * </pre>
   *
   * <code>repeated string user_ids = 2 [deprecated = true];</code>
   * @deprecated clarifai.api.TaskReview.user_ids is deprecated.
   *     See proto/clarifai/api/resources.proto;l=3380
   * @return The count of userIds.
   */
  @java.lang.Deprecated int getUserIdsCount();
  /**
   * <pre>
   * Who will review this task.
   * DEPRECATED: Use users.id instead.
   * </pre>
   *
   * <code>repeated string user_ids = 2 [deprecated = true];</code>
   * @deprecated clarifai.api.TaskReview.user_ids is deprecated.
   *     See proto/clarifai/api/resources.proto;l=3380
   * @param index The index of the element to return.
   * @return The userIds at the given index.
   */
  @java.lang.Deprecated java.lang.String getUserIds(int index);
  /**
   * <pre>
   * Who will review this task.
   * DEPRECATED: Use users.id instead.
   * </pre>
   *
   * <code>repeated string user_ids = 2 [deprecated = true];</code>
   * @deprecated clarifai.api.TaskReview.user_ids is deprecated.
   *     See proto/clarifai/api/resources.proto;l=3380
   * @param index The index of the value to return.
   * @return The bytes of the userIds at the given index.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getUserIdsBytes(int index);

  /**
   * <pre>
   * Users who will review this task.
   * When the 'review.users' field is additionally requested, then all user
   * info is filled for the reviewers. Otherwise, only the user 'id' is filled.
   * </pre>
   *
   * <code>repeated .clarifai.api.User users = 5;</code>
   */
  java.util.List<com.clarifai.grpc.api.User> 
      getUsersList();
  /**
   * <pre>
   * Users who will review this task.
   * When the 'review.users' field is additionally requested, then all user
   * info is filled for the reviewers. Otherwise, only the user 'id' is filled.
   * </pre>
   *
   * <code>repeated .clarifai.api.User users = 5;</code>
   */
  com.clarifai.grpc.api.User getUsers(int index);
  /**
   * <pre>
   * Users who will review this task.
   * When the 'review.users' field is additionally requested, then all user
   * info is filled for the reviewers. Otherwise, only the user 'id' is filled.
   * </pre>
   *
   * <code>repeated .clarifai.api.User users = 5;</code>
   */
  int getUsersCount();
  /**
   * <pre>
   * Users who will review this task.
   * When the 'review.users' field is additionally requested, then all user
   * info is filled for the reviewers. Otherwise, only the user 'id' is filled.
   * </pre>
   *
   * <code>repeated .clarifai.api.User users = 5;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.UserOrBuilder> 
      getUsersOrBuilderList();
  /**
   * <pre>
   * Users who will review this task.
   * When the 'review.users' field is additionally requested, then all user
   * info is filled for the reviewers. Otherwise, only the user 'id' is filled.
   * </pre>
   *
   * <code>repeated .clarifai.api.User users = 5;</code>
   */
  com.clarifai.grpc.api.UserOrBuilder getUsersOrBuilder(
      int index);

  /**
   * <code>.clarifai.api.TaskReviewManualStrategyInfo manual_strategy_info = 3;</code>
   * @return Whether the manualStrategyInfo field is set.
   */
  boolean hasManualStrategyInfo();
  /**
   * <code>.clarifai.api.TaskReviewManualStrategyInfo manual_strategy_info = 3;</code>
   * @return The manualStrategyInfo.
   */
  com.clarifai.grpc.api.TaskReviewManualStrategyInfo getManualStrategyInfo();
  /**
   * <code>.clarifai.api.TaskReviewManualStrategyInfo manual_strategy_info = 3;</code>
   */
  com.clarifai.grpc.api.TaskReviewManualStrategyInfoOrBuilder getManualStrategyInfoOrBuilder();

  /**
   * <code>.clarifai.api.TaskReviewConsensusStrategyInfo consensus_strategy_info = 4;</code>
   * @return Whether the consensusStrategyInfo field is set.
   */
  boolean hasConsensusStrategyInfo();
  /**
   * <code>.clarifai.api.TaskReviewConsensusStrategyInfo consensus_strategy_info = 4;</code>
   * @return The consensusStrategyInfo.
   */
  com.clarifai.grpc.api.TaskReviewConsensusStrategyInfo getConsensusStrategyInfo();
  /**
   * <code>.clarifai.api.TaskReviewConsensusStrategyInfo consensus_strategy_info = 4;</code>
   */
  com.clarifai.grpc.api.TaskReviewConsensusStrategyInfoOrBuilder getConsensusStrategyInfoOrBuilder();

  public com.clarifai.grpc.api.TaskReview.StrategyInfoCase getStrategyInfoCase();
}
