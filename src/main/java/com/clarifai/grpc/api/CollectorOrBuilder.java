// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface CollectorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.Collector)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Unique ID for the collector.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Unique ID for the collector.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Human readable description for the collector.
   * </pre>
   *
   * <code>string description = 2;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Human readable description for the collector.
   * </pre>
   *
   * <code>string description = 2;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * When the collector is created. We follow the XXXX timestamp
   * format. We use https://www.ietf.org/rfc/rfc3339.txt format:
   * "2006-01-02T15:04:05.999999Z" so you can expect results like
   * the following from the API:
   * "2017-04-11T21:50:50.223962Z"
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 3;</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <pre>
   * When the collector is created. We follow the XXXX timestamp
   * format. We use https://www.ietf.org/rfc/rfc3339.txt format:
   * "2006-01-02T15:04:05.999999Z" so you can expect results like
   * the following from the API:
   * "2017-04-11T21:50:50.223962Z"
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 3;</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <pre>
   * When the collector is created. We follow the XXXX timestamp
   * format. We use https://www.ietf.org/rfc/rfc3339.txt format:
   * "2006-01-02T15:04:05.999999Z" so you can expect results like
   * the following from the API:
   * "2017-04-11T21:50:50.223962Z"
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <pre>
   * This is a workflow to run inline in model predict calls. It should ONLY have very fast and
   * light-weight models in it as it will effect the speed of the predictions being made.
   * This workflow's purpose is to filter down the inputs to queue for the collector to process.
   * The input to this workflow is going to be the OUTPUT of the model, not the input to the model
   * since we want to encourage having fast workflows that can also take advantage of the model
   * outputs to make deciions (for example: thresholding based on concepts). If the workflow
   * output has any field that is non-empty then the input will be queued for the collector
   * to process with the post_queue_workflow_id.
   * As a simpler alternative, pre_queue_random_sample can be set to just use random sampling instead.
   * </pre>
   *
   * <code>string pre_queue_workflow_id = 4;</code>
   * @return The preQueueWorkflowId.
   */
  java.lang.String getPreQueueWorkflowId();
  /**
   * <pre>
   * This is a workflow to run inline in model predict calls. It should ONLY have very fast and
   * light-weight models in it as it will effect the speed of the predictions being made.
   * This workflow's purpose is to filter down the inputs to queue for the collector to process.
   * The input to this workflow is going to be the OUTPUT of the model, not the input to the model
   * since we want to encourage having fast workflows that can also take advantage of the model
   * outputs to make deciions (for example: thresholding based on concepts). If the workflow
   * output has any field that is non-empty then the input will be queued for the collector
   * to process with the post_queue_workflow_id.
   * As a simpler alternative, pre_queue_random_sample can be set to just use random sampling instead.
   * </pre>
   *
   * <code>string pre_queue_workflow_id = 4;</code>
   * @return The bytes for preQueueWorkflowId.
   */
  com.google.protobuf.ByteString
      getPreQueueWorkflowIdBytes();

  /**
   * <pre>
   * Instead of needing to create a new workflow for pre_queue_workflow_id, if just random sampling
   * of the model inputs is required, then pre_queue_random_sample can be set to a value from (0-1]
   * to denote the fraction of inputs to collect.
   * </pre>
   *
   * <code>float pre_queue_random_sample = 8;</code>
   * @return The preQueueRandomSample.
   */
  float getPreQueueRandomSample();

  /**
   * <pre>
   * A workflow to run to after the collector is processing the queued input. This workflow
   * uses the original input to the model as input to the workflow so that you can run additional
   * models as well on that input to decide whether to queue the model or not. If the workflow
   * output has any field that is non-empty then it will be passed on to POST /inputs to
   * the destination app.
   * </pre>
   *
   * <code>string post_queue_workflow_id = 5;</code>
   * @return The postQueueWorkflowId.
   */
  java.lang.String getPostQueueWorkflowId();
  /**
   * <pre>
   * A workflow to run to after the collector is processing the queued input. This workflow
   * uses the original input to the model as input to the workflow so that you can run additional
   * models as well on that input to decide whether to queue the model or not. If the workflow
   * output has any field that is non-empty then it will be passed on to POST /inputs to
   * the destination app.
   * </pre>
   *
   * <code>string post_queue_workflow_id = 5;</code>
   * @return The bytes for postQueueWorkflowId.
   */
  com.google.protobuf.ByteString
      getPostQueueWorkflowIdBytes();

  /**
   * <pre>
   * The source of the collector to feed data into this app.
   * Note(zeiler): if we wanted more than one source per collector we could make this it's own
   * object and introduce /collectors/{collector_id}/sources
   * We will keep it simple for now and have just one source per collector since a user can make
   * more than one collector in the same app anyways.
   * </pre>
   *
   * <code>.clarifai.api.CollectorSource collector_source = 6;</code>
   * @return Whether the collectorSource field is set.
   */
  boolean hasCollectorSource();
  /**
   * <pre>
   * The source of the collector to feed data into this app.
   * Note(zeiler): if we wanted more than one source per collector we could make this it's own
   * object and introduce /collectors/{collector_id}/sources
   * We will keep it simple for now and have just one source per collector since a user can make
   * more than one collector in the same app anyways.
   * </pre>
   *
   * <code>.clarifai.api.CollectorSource collector_source = 6;</code>
   * @return The collectorSource.
   */
  com.clarifai.grpc.api.CollectorSource getCollectorSource();
  /**
   * <pre>
   * The source of the collector to feed data into this app.
   * Note(zeiler): if we wanted more than one source per collector we could make this it's own
   * object and introduce /collectors/{collector_id}/sources
   * We will keep it simple for now and have just one source per collector since a user can make
   * more than one collector in the same app anyways.
   * </pre>
   *
   * <code>.clarifai.api.CollectorSource collector_source = 6;</code>
   */
  com.clarifai.grpc.api.CollectorSourceOrBuilder getCollectorSourceOrBuilder();

  /**
   * <pre>
   * Status for the collector. This allows you to pause a collector without having to delete it as
   * an example.
   * </pre>
   *
   * <code>.clarifai.api.status.Status status = 7;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * Status for the collector. This allows you to pause a collector without having to delete it as
   * an example.
   * </pre>
   *
   * <code>.clarifai.api.status.Status status = 7;</code>
   * @return The status.
   */
  com.clarifai.grpc.api.status.Status getStatus();
  /**
   * <pre>
   * Status for the collector. This allows you to pause a collector without having to delete it as
   * an example.
   * </pre>
   *
   * <code>.clarifai.api.status.Status status = 7;</code>
   */
  com.clarifai.grpc.api.status.StatusOrBuilder getStatusOrBuilder();

  /**
   * <pre>
   * Whether to collect outputs or not. Default is false. If selected, outputs from the
   * original model predict call will be posted as annotations along with the input with success status.
   * </pre>
   *
   * <code>bool collect_outputs = 9;</code>
   * @return The collectOutputs.
   */
  boolean getCollectOutputs();
}
