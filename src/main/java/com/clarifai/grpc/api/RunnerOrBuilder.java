// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface RunnerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.Runner)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A unique ID for this runner.
   * This is a UUID since runners can be automatically orchestrated.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * A unique ID for this runner.
   * This is a UUID since runners can be automatically orchestrated.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * short description about the runner.
   * </pre>
   *
   * <code>string description = 2;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * short description about the runner.
   * </pre>
   *
   * <code>string description = 2;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * When the runner was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 3;</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <pre>
   * When the runner was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 3;</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <pre>
   * When the runner was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <pre>
   * When the runner was last modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modified_at = 4;</code>
   * @return Whether the modifiedAt field is set.
   */
  boolean hasModifiedAt();
  /**
   * <pre>
   * When the runner was last modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modified_at = 4;</code>
   * @return The modifiedAt.
   */
  com.google.protobuf.Timestamp getModifiedAt();
  /**
   * <pre>
   * When the runner was last modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modified_at = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getModifiedAtOrBuilder();

  /**
   * <pre>
   * To handle arbitrary json metadata you can use a struct field:
   * https://github.com/google/protobuf/blob/master/src/google/protobuf/struct.proto
   * This is an optional arg.
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 5;</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <pre>
   * To handle arbitrary json metadata you can use a struct field:
   * https://github.com/google/protobuf/blob/master/src/google/protobuf/struct.proto
   * This is an optional arg.
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 5;</code>
   * @return The metadata.
   */
  com.google.protobuf.Struct getMetadata();
  /**
   * <pre>
   * To handle arbitrary json metadata you can use a struct field:
   * https://github.com/google/protobuf/blob/master/src/google/protobuf/struct.proto
   * This is an optional arg.
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 5;</code>
   */
  com.google.protobuf.StructOrBuilder getMetadataOrBuilder();

  /**
   * <pre>
   * Labels to match in order to find work.
   * </pre>
   *
   * <code>repeated string labels = 7 [deprecated = true];</code>
   * @deprecated clarifai.api.Runner.labels is deprecated.
   *     See proto/clarifai/api/resources.proto;l=4303
   * @return A list containing the labels.
   */
  @java.lang.Deprecated java.util.List<java.lang.String>
      getLabelsList();
  /**
   * <pre>
   * Labels to match in order to find work.
   * </pre>
   *
   * <code>repeated string labels = 7 [deprecated = true];</code>
   * @deprecated clarifai.api.Runner.labels is deprecated.
   *     See proto/clarifai/api/resources.proto;l=4303
   * @return The count of labels.
   */
  @java.lang.Deprecated int getLabelsCount();
  /**
   * <pre>
   * Labels to match in order to find work.
   * </pre>
   *
   * <code>repeated string labels = 7 [deprecated = true];</code>
   * @deprecated clarifai.api.Runner.labels is deprecated.
   *     See proto/clarifai/api/resources.proto;l=4303
   * @param index The index of the element to return.
   * @return The labels at the given index.
   */
  @java.lang.Deprecated java.lang.String getLabels(int index);
  /**
   * <pre>
   * Labels to match in order to find work.
   * </pre>
   *
   * <code>repeated string labels = 7 [deprecated = true];</code>
   * @deprecated clarifai.api.Runner.labels is deprecated.
   *     See proto/clarifai/api/resources.proto;l=4303
   * @param index The index of the value to return.
   * @return The bytes of the labels at the given index.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getLabelsBytes(int index);

  /**
   * <pre>
   * Instead of just matching on labels we might want to have more explicit matching of what
   * work this runner is looking for.
   * The thing that the autoscaling config applies to for this nodepool.
   * </pre>
   *
   * <code>.clarifai.api.Worker worker = 8;</code>
   * @return Whether the worker field is set.
   */
  boolean hasWorker();
  /**
   * <pre>
   * Instead of just matching on labels we might want to have more explicit matching of what
   * work this runner is looking for.
   * The thing that the autoscaling config applies to for this nodepool.
   * </pre>
   *
   * <code>.clarifai.api.Worker worker = 8;</code>
   * @return The worker.
   */
  com.clarifai.grpc.api.Worker getWorker();
  /**
   * <pre>
   * Instead of just matching on labels we might want to have more explicit matching of what
   * work this runner is looking for.
   * The thing that the autoscaling config applies to for this nodepool.
   * </pre>
   *
   * <code>.clarifai.api.Worker worker = 8;</code>
   */
  com.clarifai.grpc.api.WorkerOrBuilder getWorkerOrBuilder();

  /**
   * <pre>
   * Runners are defined within nodepools so this field needs the id and user_id of the nodepool
   * to be provided when creating a Runner.
   * This nodepool must be accessible to you or an org you are part of.
   * </pre>
   *
   * <code>.clarifai.api.Nodepool nodepool = 9;</code>
   * @return Whether the nodepool field is set.
   */
  boolean hasNodepool();
  /**
   * <pre>
   * Runners are defined within nodepools so this field needs the id and user_id of the nodepool
   * to be provided when creating a Runner.
   * This nodepool must be accessible to you or an org you are part of.
   * </pre>
   *
   * <code>.clarifai.api.Nodepool nodepool = 9;</code>
   * @return The nodepool.
   */
  com.clarifai.grpc.api.Nodepool getNodepool();
  /**
   * <pre>
   * Runners are defined within nodepools so this field needs the id and user_id of the nodepool
   * to be provided when creating a Runner.
   * This nodepool must be accessible to you or an org you are part of.
   * </pre>
   *
   * <code>.clarifai.api.Nodepool nodepool = 9;</code>
   */
  com.clarifai.grpc.api.NodepoolOrBuilder getNodepoolOrBuilder();

  /**
   * <pre>
   *&#47;/////////////////////////
   * Need resources on the runner so we can schedule this Runner into the Nodepool.
   * If this runner is being orchestrated for a model then the orchestrator will set this to the
   * model resource requirements. If a workflow then it'll compute those requirements and set
   * populate this resource field.
   * Having this on the underlying object like Model and Workflow allows us to represent the minimum
   * requirements on those object, which may be less than what the Runner allocates (as a safety
   * margin for the runner to for sure run the resource).
   * </pre>
   *
   * <code>.clarifai.api.ComputeInfo compute_info = 10;</code>
   * @return Whether the computeInfo field is set.
   */
  boolean hasComputeInfo();
  /**
   * <pre>
   *&#47;/////////////////////////
   * Need resources on the runner so we can schedule this Runner into the Nodepool.
   * If this runner is being orchestrated for a model then the orchestrator will set this to the
   * model resource requirements. If a workflow then it'll compute those requirements and set
   * populate this resource field.
   * Having this on the underlying object like Model and Workflow allows us to represent the minimum
   * requirements on those object, which may be less than what the Runner allocates (as a safety
   * margin for the runner to for sure run the resource).
   * </pre>
   *
   * <code>.clarifai.api.ComputeInfo compute_info = 10;</code>
   * @return The computeInfo.
   */
  com.clarifai.grpc.api.ComputeInfo getComputeInfo();
  /**
   * <pre>
   *&#47;/////////////////////////
   * Need resources on the runner so we can schedule this Runner into the Nodepool.
   * If this runner is being orchestrated for a model then the orchestrator will set this to the
   * model resource requirements. If a workflow then it'll compute those requirements and set
   * populate this resource field.
   * Having this on the underlying object like Model and Workflow allows us to represent the minimum
   * requirements on those object, which may be less than what the Runner allocates (as a safety
   * margin for the runner to for sure run the resource).
   * </pre>
   *
   * <code>.clarifai.api.ComputeInfo compute_info = 10;</code>
   */
  com.clarifai.grpc.api.ComputeInfoOrBuilder getComputeInfoOrBuilder();

  /**
   * <pre>
   * Number of replicas that this runner should have up.
   * We keep it separate from ComputeInfo which defines how many resources each replica needs.
   * </pre>
   *
   * <code>uint32 num_replicas = 11;</code>
   * @return The numReplicas.
   */
  int getNumReplicas();
}
