// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface TaskWorkerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.TaskWorker)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Worker strategy.
   * </pre>
   *
   * <code>.clarifai.api.TaskWorker.TaskWorkerStrategy strategy = 1;</code>
   * @return The enum numeric value on the wire for strategy.
   */
  int getStrategyValue();
  /**
   * <pre>
   * Worker strategy.
   * </pre>
   *
   * <code>.clarifai.api.TaskWorker.TaskWorkerStrategy strategy = 1;</code>
   * @return The strategy.
   */
  com.clarifai.grpc.api.TaskWorker.TaskWorkerStrategy getStrategy();

  /**
   * <pre>
   * Who will work on this task.
   * DEPRECATED: Use workers.user.id instead.
   * </pre>
   *
   * <code>repeated string user_ids = 2 [deprecated = true];</code>
   * @deprecated clarifai.api.TaskWorker.user_ids is deprecated.
   *     See proto/clarifai/api/resources.proto;l=3083
   * @return A list containing the userIds.
   */
  @java.lang.Deprecated java.util.List<java.lang.String>
      getUserIdsList();
  /**
   * <pre>
   * Who will work on this task.
   * DEPRECATED: Use workers.user.id instead.
   * </pre>
   *
   * <code>repeated string user_ids = 2 [deprecated = true];</code>
   * @deprecated clarifai.api.TaskWorker.user_ids is deprecated.
   *     See proto/clarifai/api/resources.proto;l=3083
   * @return The count of userIds.
   */
  @java.lang.Deprecated int getUserIdsCount();
  /**
   * <pre>
   * Who will work on this task.
   * DEPRECATED: Use workers.user.id instead.
   * </pre>
   *
   * <code>repeated string user_ids = 2 [deprecated = true];</code>
   * @deprecated clarifai.api.TaskWorker.user_ids is deprecated.
   *     See proto/clarifai/api/resources.proto;l=3083
   * @param index The index of the element to return.
   * @return The userIds at the given index.
   */
  @java.lang.Deprecated java.lang.String getUserIds(int index);
  /**
   * <pre>
   * Who will work on this task.
   * DEPRECATED: Use workers.user.id instead.
   * </pre>
   *
   * <code>repeated string user_ids = 2 [deprecated = true];</code>
   * @deprecated clarifai.api.TaskWorker.user_ids is deprecated.
   *     See proto/clarifai/api/resources.proto;l=3083
   * @param index The index of the value to return.
   * @return The bytes of the userIds at the given index.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getUserIdsBytes(int index);

  /**
   * <pre>
   * Users who will work on this task.
   * When the 'worker.users' field is additionally requested, then all user
   * info is filled for the workers. Otherwise, only the user 'id' is filled.
   * DEPRECATED: Use workers.user instead.
   * </pre>
   *
   * <code>repeated .clarifai.api.User users = 4 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<com.clarifai.grpc.api.User> 
      getUsersList();
  /**
   * <pre>
   * Users who will work on this task.
   * When the 'worker.users' field is additionally requested, then all user
   * info is filled for the workers. Otherwise, only the user 'id' is filled.
   * DEPRECATED: Use workers.user instead.
   * </pre>
   *
   * <code>repeated .clarifai.api.User users = 4 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.clarifai.grpc.api.User getUsers(int index);
  /**
   * <pre>
   * Users who will work on this task.
   * When the 'worker.users' field is additionally requested, then all user
   * info is filled for the workers. Otherwise, only the user 'id' is filled.
   * DEPRECATED: Use workers.user instead.
   * </pre>
   *
   * <code>repeated .clarifai.api.User users = 4 [deprecated = true];</code>
   */
  @java.lang.Deprecated int getUsersCount();
  /**
   * <pre>
   * Users who will work on this task.
   * When the 'worker.users' field is additionally requested, then all user
   * info is filled for the workers. Otherwise, only the user 'id' is filled.
   * DEPRECATED: Use workers.user instead.
   * </pre>
   *
   * <code>repeated .clarifai.api.User users = 4 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<? extends com.clarifai.grpc.api.UserOrBuilder> 
      getUsersOrBuilderList();
  /**
   * <pre>
   * Users who will work on this task.
   * When the 'worker.users' field is additionally requested, then all user
   * info is filled for the workers. Otherwise, only the user 'id' is filled.
   * DEPRECATED: Use workers.user instead.
   * </pre>
   *
   * <code>repeated .clarifai.api.User users = 4 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.clarifai.grpc.api.UserOrBuilder getUsersOrBuilder(
      int index);

  /**
   * <code>.clarifai.api.TaskWorkerPartitionedStrategyInfo partitioned_strategy_info = 3;</code>
   * @return Whether the partitionedStrategyInfo field is set.
   */
  boolean hasPartitionedStrategyInfo();
  /**
   * <code>.clarifai.api.TaskWorkerPartitionedStrategyInfo partitioned_strategy_info = 3;</code>
   * @return The partitionedStrategyInfo.
   */
  com.clarifai.grpc.api.TaskWorkerPartitionedStrategyInfo getPartitionedStrategyInfo();
  /**
   * <code>.clarifai.api.TaskWorkerPartitionedStrategyInfo partitioned_strategy_info = 3;</code>
   */
  com.clarifai.grpc.api.TaskWorkerPartitionedStrategyInfoOrBuilder getPartitionedStrategyInfoOrBuilder();

  /**
   * <pre>
   * Workers that will work on this task.
   * For Auto Annotation Tasks:
   *   the worker can be either a model or a workflow;
   *   currently only supports 1 worker.
   * For manual labeling Tasks:
   *   the workers can only be users;
   *   no limitation on number of workers.
   * </pre>
   *
   * <code>repeated .clarifai.api.Worker workers = 7;</code>
   */
  java.util.List<com.clarifai.grpc.api.Worker> 
      getWorkersList();
  /**
   * <pre>
   * Workers that will work on this task.
   * For Auto Annotation Tasks:
   *   the worker can be either a model or a workflow;
   *   currently only supports 1 worker.
   * For manual labeling Tasks:
   *   the workers can only be users;
   *   no limitation on number of workers.
   * </pre>
   *
   * <code>repeated .clarifai.api.Worker workers = 7;</code>
   */
  com.clarifai.grpc.api.Worker getWorkers(int index);
  /**
   * <pre>
   * Workers that will work on this task.
   * For Auto Annotation Tasks:
   *   the worker can be either a model or a workflow;
   *   currently only supports 1 worker.
   * For manual labeling Tasks:
   *   the workers can only be users;
   *   no limitation on number of workers.
   * </pre>
   *
   * <code>repeated .clarifai.api.Worker workers = 7;</code>
   */
  int getWorkersCount();
  /**
   * <pre>
   * Workers that will work on this task.
   * For Auto Annotation Tasks:
   *   the worker can be either a model or a workflow;
   *   currently only supports 1 worker.
   * For manual labeling Tasks:
   *   the workers can only be users;
   *   no limitation on number of workers.
   * </pre>
   *
   * <code>repeated .clarifai.api.Worker workers = 7;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.WorkerOrBuilder> 
      getWorkersOrBuilderList();
  /**
   * <pre>
   * Workers that will work on this task.
   * For Auto Annotation Tasks:
   *   the worker can be either a model or a workflow;
   *   currently only supports 1 worker.
   * For manual labeling Tasks:
   *   the workers can only be users;
   *   no limitation on number of workers.
   * </pre>
   *
   * <code>repeated .clarifai.api.Worker workers = 7;</code>
   */
  com.clarifai.grpc.api.WorkerOrBuilder getWorkersOrBuilder(
      int index);

  public com.clarifai.grpc.api.TaskWorker.StrategyInfoCase getStrategyInfoCase();
}
