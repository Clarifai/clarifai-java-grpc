// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface AppOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.App)
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
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string default_language = 3;</code>
   * @return The defaultLanguage.
   */
  java.lang.String getDefaultLanguage();
  /**
   * <code>string default_language = 3;</code>
   * @return The bytes for defaultLanguage.
   */
  com.google.protobuf.ByteString
      getDefaultLanguageBytes();

  /**
   * <pre>
   * Default workflow id deprecated in favor of default_workflow
   * </pre>
   *
   * <code>string default_workflow_id = 4;</code>
   * @return The defaultWorkflowId.
   */
  java.lang.String getDefaultWorkflowId();
  /**
   * <pre>
   * Default workflow id deprecated in favor of default_workflow
   * </pre>
   *
   * <code>string default_workflow_id = 4;</code>
   * @return The bytes for defaultWorkflowId.
   */
  com.google.protobuf.ByteString
      getDefaultWorkflowIdBytes();

  /**
   * <code>.clarifai.api.Workflow default_workflow = 23;</code>
   * @return Whether the defaultWorkflow field is set.
   */
  boolean hasDefaultWorkflow();
  /**
   * <code>.clarifai.api.Workflow default_workflow = 23;</code>
   * @return The defaultWorkflow.
   */
  com.clarifai.grpc.api.Workflow getDefaultWorkflow();
  /**
   * <code>.clarifai.api.Workflow default_workflow = 23;</code>
   */
  com.clarifai.grpc.api.WorkflowOrBuilder getDefaultWorkflowOrBuilder();

  /**
   * <pre>
   * why is user_id present here when this message type is used in PostApps but completely ignored there? PostApp already
   * specifies the userid in path but doesn't even actually use neither of userids, it instead used the id from auth context.
   * This creates a lot of ambiguity, should always have different message types for Post/Get endpoints so that the minimum interface for each op can be described
   * </pre>
   *
   * <code>string user_id = 5;</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * why is user_id present here when this message type is used in PostApps but completely ignored there? PostApp already
   * specifies the userid in path but doesn't even actually use neither of userids, it instead used the id from auth context.
   * This creates a lot of ambiguity, should always have different message types for Post/Get endpoints so that the minimum interface for each op can be described
   * </pre>
   *
   * <code>string user_id = 5;</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * When the app was created. We follow the XXXX timestamp
   * format. We use https://www.ietf.org/rfc/rfc3339.txt format:
   * "2006-01-02T15:04:05.999999Z" so you can expect results like
   * the following from the API:
   * "2017-04-11T21:50:50.223962Z"
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 6;</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <pre>
   * When the app was created. We follow the XXXX timestamp
   * format. We use https://www.ietf.org/rfc/rfc3339.txt format:
   * "2006-01-02T15:04:05.999999Z" so you can expect results like
   * the following from the API:
   * "2017-04-11T21:50:50.223962Z"
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 6;</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <pre>
   * When the app was created. We follow the XXXX timestamp
   * format. We use https://www.ietf.org/rfc/rfc3339.txt format:
   * "2006-01-02T15:04:05.999999Z" so you can expect results like
   * the following from the API:
   * "2017-04-11T21:50:50.223962Z"
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <pre>
   * When the app was last modified
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modified_at = 17;</code>
   * @return Whether the modifiedAt field is set.
   */
  boolean hasModifiedAt();
  /**
   * <pre>
   * When the app was last modified
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modified_at = 17;</code>
   * @return The modifiedAt.
   */
  com.google.protobuf.Timestamp getModifiedAt();
  /**
   * <pre>
   * When the app was last modified
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modified_at = 17;</code>
   */
  com.google.protobuf.TimestampOrBuilder getModifiedAtOrBuilder();

  /**
   * <pre>
   * if user accept legal consent for face recognition
   * </pre>
   *
   * <code>uint32 legal_consent_status = 7;</code>
   * @return The legalConsentStatus.
   */
  int getLegalConsentStatus();

  /**
   * <pre>
   * To handle arbitrary json metadata you can use a struct field:
   * https://github.com/google/protobuf/blob/master/src/google/protobuf/struct.proto
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 13;</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <pre>
   * To handle arbitrary json metadata you can use a struct field:
   * https://github.com/google/protobuf/blob/master/src/google/protobuf/struct.proto
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 13;</code>
   * @return The metadata.
   */
  com.google.protobuf.Struct getMetadata();
  /**
   * <pre>
   * To handle arbitrary json metadata you can use a struct field:
   * https://github.com/google/protobuf/blob/master/src/google/protobuf/struct.proto
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 13;</code>
   */
  com.google.protobuf.StructOrBuilder getMetadataOrBuilder();

  /**
   * <pre>
   * short description about the app.
   * </pre>
   *
   * <code>string description = 14;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * short description about the app.
   * </pre>
   *
   * <code>string description = 14;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Default value for model predictions on video: Sample delay for video predicting (1 frame per N milliseconds)
   * </pre>
   *
   * <code>uint32 sample_ms = 15;</code>
   * @return The sampleMs.
   */
  int getSampleMs();

  /**
   * <pre>
   * The visibility field represents whether this message is privately/publicly visible.
   * To be visible to the public the App that contains it AND the User that contains the App must
   * also be publicly visible.
   * </pre>
   *
   * <code>.clarifai.api.Visibility visibility = 16;</code>
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
   * <code>.clarifai.api.Visibility visibility = 16;</code>
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
   * <code>.clarifai.api.Visibility visibility = 16;</code>
   */
  com.clarifai.grpc.api.VisibilityOrBuilder getVisibilityOrBuilder();

  /**
   * <pre>
   * data tier id this app is using.
   * </pre>
   *
   * <code>string data_tier_id = 18;</code>
   * @return The dataTierId.
   */
  java.lang.String getDataTierId();
  /**
   * <pre>
   * data tier id this app is using.
   * </pre>
   *
   * <code>string data_tier_id = 18;</code>
   * @return The bytes for dataTierId.
   */
  com.google.protobuf.ByteString
      getDataTierIdBytes();

  /**
   * <pre>
   * Is starred by the requesting user (only showed on get/list requests)
   * Please use PostAppStars/DeleteAppStars endpoints to star/unstar an app
   * </pre>
   *
   * <code>bool is_starred = 19;</code>
   * @return The isStarred.
   */
  boolean getIsStarred();

  /**
   * <pre>
   * How many users have starred the app (only showed on get/list requests)
   * Computed value, not editable
   * </pre>
   *
   * <code>int32 star_count = 20;</code>
   * @return The starCount.
   */
  int getStarCount();

  /**
   * <pre>
   * Notes for the application
   * This field should be used for in-depth notes and supports up to 64Kbs.
   * </pre>
   *
   * <code>string notes = 21;</code>
   * @return The notes.
   */
  java.lang.String getNotes();
  /**
   * <pre>
   * Notes for the application
   * This field should be used for in-depth notes and supports up to 64Kbs.
   * </pre>
   *
   * <code>string notes = 21;</code>
   * @return The bytes for notes.
   */
  com.google.protobuf.ByteString
      getNotesBytes();

  /**
   * <pre>
   * Representative image for this app
   * </pre>
   *
   * <code>.clarifai.api.Image image = 22;</code>
   * @return Whether the image field is set.
   */
  boolean hasImage();
  /**
   * <pre>
   * Representative image for this app
   * </pre>
   *
   * <code>.clarifai.api.Image image = 22;</code>
   * @return The image.
   */
  com.clarifai.grpc.api.Image getImage();
  /**
   * <pre>
   * Representative image for this app
   * </pre>
   *
   * <code>.clarifai.api.Image image = 22;</code>
   */
  com.clarifai.grpc.api.ImageOrBuilder getImageOrBuilder();

  /**
   * <pre>
   * An app marked as a template can be duplicated by any user that can see it,
   * including all visible resources within it.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue is_template = 25;</code>
   * @return Whether the isTemplate field is set.
   */
  boolean hasIsTemplate();
  /**
   * <pre>
   * An app marked as a template can be duplicated by any user that can see it,
   * including all visible resources within it.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue is_template = 25;</code>
   * @return The isTemplate.
   */
  com.google.protobuf.BoolValue getIsTemplate();
  /**
   * <pre>
   * An app marked as a template can be duplicated by any user that can see it,
   * including all visible resources within it.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue is_template = 25;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getIsTemplateOrBuilder();

  /**
   * <code>.clarifai.api.AppExtraInfo extra_info = 24;</code>
   * @return Whether the extraInfo field is set.
   */
  boolean hasExtraInfo();
  /**
   * <code>.clarifai.api.AppExtraInfo extra_info = 24;</code>
   * @return The extraInfo.
   */
  com.clarifai.grpc.api.AppExtraInfo getExtraInfo();
  /**
   * <code>.clarifai.api.AppExtraInfo extra_info = 24;</code>
   */
  com.clarifai.grpc.api.AppExtraInfoOrBuilder getExtraInfoOrBuilder();
}
