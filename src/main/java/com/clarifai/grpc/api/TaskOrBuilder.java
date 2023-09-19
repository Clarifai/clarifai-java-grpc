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
   * List of concept ids used in the work of this task.
   * DEPRECATED: Use task.concepts instead.
   * </pre>
   *
   * <code>repeated string concept_ids = 7 [deprecated = true];</code>
   * @deprecated clarifai.api.Task.concept_ids is deprecated.
   *     See proto/clarifai/api/resources.proto;l=2843
   * @return A list containing the conceptIds.
   */
  @java.lang.Deprecated java.util.List<java.lang.String>
      getConceptIdsList();
  /**
   * <pre>
   * List of concept ids used in the work of this task.
   * DEPRECATED: Use task.concepts instead.
   * </pre>
   *
   * <code>repeated string concept_ids = 7 [deprecated = true];</code>
   * @deprecated clarifai.api.Task.concept_ids is deprecated.
   *     See proto/clarifai/api/resources.proto;l=2843
   * @return The count of conceptIds.
   */
  @java.lang.Deprecated int getConceptIdsCount();
  /**
   * <pre>
   * List of concept ids used in the work of this task.
   * DEPRECATED: Use task.concepts instead.
   * </pre>
   *
   * <code>repeated string concept_ids = 7 [deprecated = true];</code>
   * @deprecated clarifai.api.Task.concept_ids is deprecated.
   *     See proto/clarifai/api/resources.proto;l=2843
   * @param index The index of the element to return.
   * @return The conceptIds at the given index.
   */
  @java.lang.Deprecated java.lang.String getConceptIds(int index);
  /**
   * <pre>
   * List of concept ids used in the work of this task.
   * DEPRECATED: Use task.concepts instead.
   * </pre>
   *
   * <code>repeated string concept_ids = 7 [deprecated = true];</code>
   * @deprecated clarifai.api.Task.concept_ids is deprecated.
   *     See proto/clarifai/api/resources.proto;l=2843
   * @param index The index of the value to return.
   * @return The bytes of the conceptIds at the given index.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
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

  /**
   * <code>.clarifai.api.AiAssistParameters ai_assist_params = 14;</code>
   * @return Whether the aiAssistParams field is set.
   */
  boolean hasAiAssistParams();
  /**
   * <code>.clarifai.api.AiAssistParameters ai_assist_params = 14;</code>
   * @return The aiAssistParams.
   */
  com.clarifai.grpc.api.AiAssistParameters getAiAssistParams();
  /**
   * <code>.clarifai.api.AiAssistParameters ai_assist_params = 14;</code>
   */
  com.clarifai.grpc.api.AiAssistParametersOrBuilder getAiAssistParamsOrBuilder();

  /**
   * <pre>
   * The visibility field represents whether this message is privately/publicly visible.
   * To be visible to the public the App that contains it AND the User that contains the App must
   * also be publicly visible.
   * </pre>
   *
   * <code>.clarifai.api.Visibility visibility = 15;</code>
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
   * <code>.clarifai.api.Visibility visibility = 15;</code>
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
   * <code>.clarifai.api.Visibility visibility = 15;</code>
   */
  com.clarifai.grpc.api.VisibilityOrBuilder getVisibilityOrBuilder();

  /**
   * <pre>
   * The app the task belongs to.
   * </pre>
   *
   * <code>string app_id = 16;</code>
   * @return The appId.
   */
  java.lang.String getAppId();
  /**
   * <pre>
   * The app the task belongs to.
   * </pre>
   *
   * <code>string app_id = 16;</code>
   * @return The bytes for appId.
   */
  com.google.protobuf.ByteString
      getAppIdBytes();

  /**
   * <pre>
   * The user the task belongs to.
   * </pre>
   *
   * <code>string user_id = 17;</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * The user the task belongs to.
   * </pre>
   *
   * <code>string user_id = 17;</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * The label order the task belongs to.
   * </pre>
   *
   * <code>string label_order_id = 18;</code>
   * @return The labelOrderId.
   */
  java.lang.String getLabelOrderId();
  /**
   * <pre>
   * The label order the task belongs to.
   * </pre>
   *
   * <code>string label_order_id = 18;</code>
   * @return The bytes for labelOrderId.
   */
  com.google.protobuf.ByteString
      getLabelOrderIdBytes();

  /**
   * <pre>
   * Ignore Task.concept_ids field if Task.TaskConcept are supplied.
   * </pre>
   *
   * <code>repeated .clarifai.api.TaskConcept concepts = 19;</code>
   */
  java.util.List<com.clarifai.grpc.api.TaskConcept> 
      getConceptsList();
  /**
   * <pre>
   * Ignore Task.concept_ids field if Task.TaskConcept are supplied.
   * </pre>
   *
   * <code>repeated .clarifai.api.TaskConcept concepts = 19;</code>
   */
  com.clarifai.grpc.api.TaskConcept getConcepts(int index);
  /**
   * <pre>
   * Ignore Task.concept_ids field if Task.TaskConcept are supplied.
   * </pre>
   *
   * <code>repeated .clarifai.api.TaskConcept concepts = 19;</code>
   */
  int getConceptsCount();
  /**
   * <pre>
   * Ignore Task.concept_ids field if Task.TaskConcept are supplied.
   * </pre>
   *
   * <code>repeated .clarifai.api.TaskConcept concepts = 19;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.TaskConceptOrBuilder> 
      getConceptsOrBuilderList();
  /**
   * <pre>
   * Ignore Task.concept_ids field if Task.TaskConcept are supplied.
   * </pre>
   *
   * <code>repeated .clarifai.api.TaskConcept concepts = 19;</code>
   */
  com.clarifai.grpc.api.TaskConceptOrBuilder getConceptsOrBuilder(
      int index);

  /**
   * <pre>
   * Specify whether existing Annotations within the same app that are generated by other auto annotation tasks
   * with the specified Concept from the selected Model or Workflow should deleted before executing the Task
   * </pre>
   *
   * <code>bool delete_previous_annotations = 20;</code>
   * @return The deletePreviousAnnotations.
   */
  boolean getDeletePreviousAnnotations();
}
