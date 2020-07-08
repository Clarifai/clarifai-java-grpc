// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface TaskOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.Task)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Unique ID for the task.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Unique ID for the task.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * When the task was created.
   * The format is https://www.ietf.org/rfc/rfc3339.txt.
   * Example: "2006-01-02T15:04:05.999999Z".
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 2;</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <pre>
   * When the task was created.
   * The format is https://www.ietf.org/rfc/rfc3339.txt.
   * Example: "2006-01-02T15:04:05.999999Z".
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 2;</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <pre>
   * When the task was created.
   * The format is https://www.ietf.org/rfc/rfc3339.txt.
   * Example: "2006-01-02T15:04:05.999999Z".
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <pre>
   * Most recent time when the task was updated.
   * The format is https://www.ietf.org/rfc/rfc3339.txt.
   * Example: "2006-01-02T15:04:05.999999Z".
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modified_at = 3;</code>
   * @return Whether the modifiedAt field is set.
   */
  boolean hasModifiedAt();
  /**
   * <pre>
   * Most recent time when the task was updated.
   * The format is https://www.ietf.org/rfc/rfc3339.txt.
   * Example: "2006-01-02T15:04:05.999999Z".
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modified_at = 3;</code>
   * @return The modifiedAt.
   */
  com.google.protobuf.Timestamp getModifiedAt();
  /**
   * <pre>
   * Most recent time when the task was updated.
   * The format is https://www.ietf.org/rfc/rfc3339.txt.
   * Example: "2006-01-02T15:04:05.999999Z".
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modified_at = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getModifiedAtOrBuilder();

  /**
   * <pre>
   * Task type.
   * </pre>
   *
   * <code>.clarifai.api.Task.TaskType type = 4;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Task type.
   * </pre>
   *
   * <code>.clarifai.api.Task.TaskType type = 4;</code>
   * @return The type.
   */
  com.clarifai.grpc.api.Task.TaskType getType();

  /**
   * <pre>
   * Description of the task.
   * </pre>
   *
   * <code>string description = 5;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Description of the task.
   * </pre>
   *
   * <code>string description = 5;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Worker details.
   * </pre>
   *
   * <code>.clarifai.api.TaskWorker worker = 6;</code>
   * @return Whether the worker field is set.
   */
  boolean hasWorker();
  /**
   * <pre>
   * Worker details.
   * </pre>
   *
   * <code>.clarifai.api.TaskWorker worker = 6;</code>
   * @return The worker.
   */
  com.clarifai.grpc.api.TaskWorker getWorker();
  /**
   * <pre>
   * Worker details.
   * </pre>
   *
   * <code>.clarifai.api.TaskWorker worker = 6;</code>
   */
  com.clarifai.grpc.api.TaskWorkerOrBuilder getWorkerOrBuilder();

  /**
   * <pre>
   * List of concept ids used in the work of this task if label type is classification.
   * </pre>
   *
   * <code>repeated string concept_ids = 7;</code>
   * @return A list containing the conceptIds.
   */
  java.util.List<java.lang.String>
      getConceptIdsList();
  /**
   * <pre>
   * List of concept ids used in the work of this task if label type is classification.
   * </pre>
   *
   * <code>repeated string concept_ids = 7;</code>
   * @return The count of conceptIds.
   */
  int getConceptIdsCount();
  /**
   * <pre>
   * List of concept ids used in the work of this task if label type is classification.
   * </pre>
   *
   * <code>repeated string concept_ids = 7;</code>
   * @param index The index of the element to return.
   * @return The conceptIds at the given index.
   */
  java.lang.String getConceptIds(int index);
  /**
   * <pre>
   * List of concept ids used in the work of this task if label type is classification.
   * </pre>
   *
   * <code>repeated string concept_ids = 7;</code>
   * @param index The index of the value to return.
   * @return The bytes of the conceptIds at the given index.
   */
  com.google.protobuf.ByteString
      getConceptIdsBytes(int index);

  /**
   * <pre>
   * List of inputs used in this task will be taken from this source.
   * </pre>
   *
   * <code>.clarifai.api.TaskInputSource input_source = 8;</code>
   * @return Whether the inputSource field is set.
   */
  boolean hasInputSource();
  /**
   * <pre>
   * List of inputs used in this task will be taken from this source.
   * </pre>
   *
   * <code>.clarifai.api.TaskInputSource input_source = 8;</code>
   * @return The inputSource.
   */
  com.clarifai.grpc.api.TaskInputSource getInputSource();
  /**
   * <pre>
   * List of inputs used in this task will be taken from this source.
   * </pre>
   *
   * <code>.clarifai.api.TaskInputSource input_source = 8;</code>
   */
  com.clarifai.grpc.api.TaskInputSourceOrBuilder getInputSourceOrBuilder();

  /**
   * <pre>
   * For model predictions on video: Sample delay for video predicting (1 frame per N milliseconds)
   * </pre>
   *
   * <code>uint32 sample_ms = 9;</code>
   * @return The sampleMs.
   */
  int getSampleMs();

  /**
   * <pre>
   * AI assistant details.
   * </pre>
   *
   * <code>.clarifai.api.TaskAIAssistant ai_assistant = 10;</code>
   * @return Whether the aiAssistant field is set.
   */
  boolean hasAiAssistant();
  /**
   * <pre>
   * AI assistant details.
   * </pre>
   *
   * <code>.clarifai.api.TaskAIAssistant ai_assistant = 10;</code>
   * @return The aiAssistant.
   */
  com.clarifai.grpc.api.TaskAIAssistant getAiAssistant();
  /**
   * <pre>
   * AI assistant details.
   * </pre>
   *
   * <code>.clarifai.api.TaskAIAssistant ai_assistant = 10;</code>
   */
  com.clarifai.grpc.api.TaskAIAssistantOrBuilder getAiAssistantOrBuilder();

  /**
   * <pre>
   * Review details.
   * </pre>
   *
   * <code>.clarifai.api.TaskReview review = 11;</code>
   * @return Whether the review field is set.
   */
  boolean hasReview();
  /**
   * <pre>
   * Review details.
   * </pre>
   *
   * <code>.clarifai.api.TaskReview review = 11;</code>
   * @return The review.
   */
  com.clarifai.grpc.api.TaskReview getReview();
  /**
   * <pre>
   * Review details.
   * </pre>
   *
   * <code>.clarifai.api.TaskReview review = 11;</code>
   */
  com.clarifai.grpc.api.TaskReviewOrBuilder getReviewOrBuilder();

  /**
   * <pre>
   * Status of this task.
   * </pre>
   *
   * <code>.clarifai.api.status.Status status = 12;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * Status of this task.
   * </pre>
   *
   * <code>.clarifai.api.status.Status status = 12;</code>
   * @return The status.
   */
  com.clarifai.grpc.api.status.Status getStatus();
  /**
   * <pre>
   * Status of this task.
   * </pre>
   *
   * <code>.clarifai.api.status.Status status = 12;</code>
   */
  com.clarifai.grpc.api.status.StatusOrBuilder getStatusOrBuilder();

  /**
   * <pre>
   * Add a title for this task to quickly recognise it in a list of tasks.
   * </pre>
   *
   * <code>string name = 13;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Add a title for this task to quickly recognise it in a list of tasks.
   * </pre>
   *
   * <code>string name = 13;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
