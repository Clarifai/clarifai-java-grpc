// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface ModelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.Model)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The model's ID. Must be unique within a particular app and URL-friendly.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * The model's ID. Must be unique within a particular app and URL-friendly.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * DEPRECATED: Please use the model id to name the model.
   * </pre>
   *
   * <code>string name = 2 [deprecated = true];</code>
   * @deprecated clarifai.api.Model.name is deprecated.
   *     See proto/clarifai/api/resources.proto;l=1338
   * @return The name.
   */
  @java.lang.Deprecated java.lang.String getName();
  /**
   * <pre>
   * DEPRECATED: Please use the model id to name the model.
   * </pre>
   *
   * <code>string name = 2 [deprecated = true];</code>
   * @deprecated clarifai.api.Model.name is deprecated.
   *     See proto/clarifai/api/resources.proto;l=1338
   * @return The bytes for name.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * When the model was created. We follow the XXXX timestamp
   * format. We use https://www.ietf.org/rfc/rfc3339.txt format:
   * "2006-01-02T15:04:05.999999Z" so you can expect results like
   *  the following from the API:
   *  "2017-04-11T21:50:50.223962Z"
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 3;</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <pre>
   * When the model was created. We follow the XXXX timestamp
   * format. We use https://www.ietf.org/rfc/rfc3339.txt format:
   * "2006-01-02T15:04:05.999999Z" so you can expect results like
   *  the following from the API:
   *  "2017-04-11T21:50:50.223962Z"
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 3;</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <pre>
   * When the model was created. We follow the XXXX timestamp
   * format. We use https://www.ietf.org/rfc/rfc3339.txt format:
   * "2006-01-02T15:04:05.999999Z" so you can expect results like
   *  the following from the API:
   *  "2017-04-11T21:50:50.223962Z"
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <pre>
   * When was the most recent model version created at
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modified_at = 19;</code>
   * @return Whether the modifiedAt field is set.
   */
  boolean hasModifiedAt();
  /**
   * <pre>
   * When was the most recent model version created at
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modified_at = 19;</code>
   * @return The modifiedAt.
   */
  com.google.protobuf.Timestamp getModifiedAt();
  /**
   * <pre>
   * When was the most recent model version created at
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modified_at = 19;</code>
   */
  com.google.protobuf.TimestampOrBuilder getModifiedAtOrBuilder();

  /**
   * <pre>
   * The app the model belongs to.
   * </pre>
   *
   * <code>string app_id = 4 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The appId.
   */
  java.lang.String getAppId();
  /**
   * <pre>
   * The app the model belongs to.
   * </pre>
   *
   * <code>string app_id = 4 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The bytes for appId.
   */
  com.google.protobuf.ByteString
      getAppIdBytes();

  /**
   * <pre>
   * Info about the model's output and configuration.
   * DEPRECATED: Will be moved to model version
   * </pre>
   *
   * <code>.clarifai.api.OutputInfo output_info = 5 [deprecated = true];</code>
   * @deprecated clarifai.api.Model.output_info is deprecated.
   *     See proto/clarifai/api/resources.proto;l=1351
   * @return Whether the outputInfo field is set.
   */
  @java.lang.Deprecated boolean hasOutputInfo();
  /**
   * <pre>
   * Info about the model's output and configuration.
   * DEPRECATED: Will be moved to model version
   * </pre>
   *
   * <code>.clarifai.api.OutputInfo output_info = 5 [deprecated = true];</code>
   * @deprecated clarifai.api.Model.output_info is deprecated.
   *     See proto/clarifai/api/resources.proto;l=1351
   * @return The outputInfo.
   */
  @java.lang.Deprecated com.clarifai.grpc.api.OutputInfo getOutputInfo();
  /**
   * <pre>
   * Info about the model's output and configuration.
   * DEPRECATED: Will be moved to model version
   * </pre>
   *
   * <code>.clarifai.api.OutputInfo output_info = 5 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.clarifai.grpc.api.OutputInfoOrBuilder getOutputInfoOrBuilder();

  /**
   * <pre>
   * A particular version of the model, e.g., to specify the version when creating a workflow or
   * when listing Models to include the latest ModelVersion of the model in the response.
   * </pre>
   *
   * <code>.clarifai.api.ModelVersion model_version = 6;</code>
   * @return Whether the modelVersion field is set.
   */
  boolean hasModelVersion();
  /**
   * <pre>
   * A particular version of the model, e.g., to specify the version when creating a workflow or
   * when listing Models to include the latest ModelVersion of the model in the response.
   * </pre>
   *
   * <code>.clarifai.api.ModelVersion model_version = 6;</code>
   * @return The modelVersion.
   */
  com.clarifai.grpc.api.ModelVersion getModelVersion();
  /**
   * <pre>
   * A particular version of the model, e.g., to specify the version when creating a workflow or
   * when listing Models to include the latest ModelVersion of the model in the response.
   * </pre>
   *
   * <code>.clarifai.api.ModelVersion model_version = 6;</code>
   */
  com.clarifai.grpc.api.ModelVersionOrBuilder getModelVersionOrBuilder();

  /**
   * <pre>
   * DEPRECATED: Please use the model id to name the model.
   * </pre>
   *
   * <code>string display_name = 7 [deprecated = true];</code>
   * @deprecated clarifai.api.Model.display_name is deprecated.
   *     See proto/clarifai/api/resources.proto;l=1356
   * @return The displayName.
   */
  @java.lang.Deprecated java.lang.String getDisplayName();
  /**
   * <pre>
   * DEPRECATED: Please use the model id to name the model.
   * </pre>
   *
   * <code>string display_name = 7 [deprecated = true];</code>
   * @deprecated clarifai.api.Model.display_name is deprecated.
   *     See proto/clarifai/api/resources.proto;l=1356
   * @return The bytes for displayName.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * The user id that the model belongs to.
   * </pre>
   *
   * <code>string user_id = 9;</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * The user id that the model belongs to.
   * </pre>
   *
   * <code>string user_id = 9;</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * The default evaluation info. Can be overwritten by eval request.
   * </pre>
   *
   * <code>.clarifai.api.EvalInfo default_eval_info = 30;</code>
   * @return Whether the defaultEvalInfo field is set.
   */
  boolean hasDefaultEvalInfo();
  /**
   * <pre>
   * The default evaluation info. Can be overwritten by eval request.
   * </pre>
   *
   * <code>.clarifai.api.EvalInfo default_eval_info = 30;</code>
   * @return The defaultEvalInfo.
   */
  com.clarifai.grpc.api.EvalInfo getDefaultEvalInfo();
  /**
   * <pre>
   * The default evaluation info. Can be overwritten by eval request.
   * </pre>
   *
   * <code>.clarifai.api.EvalInfo default_eval_info = 30;</code>
   */
  com.clarifai.grpc.api.EvalInfoOrBuilder getDefaultEvalInfoOrBuilder();

  /**
   * <pre>
   * The ModelType.Id that is used for this model. This is used for all versions and you cannot
   * change model_type_id between versions of the same model.
   * </pre>
   *
   * <code>string model_type_id = 14;</code>
   * @return The modelTypeId.
   */
  java.lang.String getModelTypeId();
  /**
   * <pre>
   * The ModelType.Id that is used for this model. This is used for all versions and you cannot
   * change model_type_id between versions of the same model.
   * </pre>
   *
   * <code>string model_type_id = 14;</code>
   * @return The bytes for modelTypeId.
   */
  com.google.protobuf.ByteString
      getModelTypeIdBytes();

  /**
   * <pre>
   * The task the model was trained to do
   * </pre>
   *
   * <code>string task = 26;</code>
   * @return The task.
   */
  java.lang.String getTask();
  /**
   * <pre>
   * The task the model was trained to do
   * </pre>
   *
   * <code>string task = 26;</code>
   * @return The bytes for task.
   */
  com.google.protobuf.ByteString
      getTaskBytes();

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
   * Short description about this model
   * </pre>
   *
   * <code>string description = 16;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Short description about this model
   * </pre>
   *
   * <code>string description = 16;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * To handle arbitrary json metadata you can use a struct field:
   * https://github.com/google/protobuf/blob/master/src/google/protobuf/struct.proto
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 17;</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <pre>
   * To handle arbitrary json metadata you can use a struct field:
   * https://github.com/google/protobuf/blob/master/src/google/protobuf/struct.proto
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 17;</code>
   * @return The metadata.
   */
  com.google.protobuf.Struct getMetadata();
  /**
   * <pre>
   * To handle arbitrary json metadata you can use a struct field:
   * https://github.com/google/protobuf/blob/master/src/google/protobuf/struct.proto
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 17;</code>
   */
  com.google.protobuf.StructOrBuilder getMetadataOrBuilder();

  /**
   * <code>.google.protobuf.Struct presets = 27;</code>
   * @return Whether the presets field is set.
   */
  boolean hasPresets();
  /**
   * <code>.google.protobuf.Struct presets = 27;</code>
   * @return The presets.
   */
  com.google.protobuf.Struct getPresets();
  /**
   * <code>.google.protobuf.Struct presets = 27;</code>
   */
  com.google.protobuf.StructOrBuilder getPresetsOrBuilder();

  /**
   * <pre>
   * Notes for the model
   * This field should be used for in-depth notes and supports up to 64Kbs.
   * </pre>
   *
   * <code>string notes = 18;</code>
   * @return The notes.
   */
  java.lang.String getNotes();
  /**
   * <pre>
   * Notes for the model
   * This field should be used for in-depth notes and supports up to 64Kbs.
   * </pre>
   *
   * <code>string notes = 18;</code>
   * @return The bytes for notes.
   */
  com.google.protobuf.ByteString
      getNotesBytes();

  /**
   * <pre>
   * Tags from toolkits category
   * </pre>
   *
   * <code>repeated string toolkits = 20 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return A list containing the toolkits.
   */
  java.util.List<java.lang.String>
      getToolkitsList();
  /**
   * <pre>
   * Tags from toolkits category
   * </pre>
   *
   * <code>repeated string toolkits = 20 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The count of toolkits.
   */
  int getToolkitsCount();
  /**
   * <pre>
   * Tags from toolkits category
   * </pre>
   *
   * <code>repeated string toolkits = 20 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @param index The index of the element to return.
   * @return The toolkits at the given index.
   */
  java.lang.String getToolkits(int index);
  /**
   * <pre>
   * Tags from toolkits category
   * </pre>
   *
   * <code>repeated string toolkits = 20 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @param index The index of the value to return.
   * @return The bytes of the toolkits at the given index.
   */
  com.google.protobuf.ByteString
      getToolkitsBytes(int index);

  /**
   * <pre>
   * Tags from use_cases category
   * </pre>
   *
   * <code>repeated string use_cases = 21 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return A list containing the useCases.
   */
  java.util.List<java.lang.String>
      getUseCasesList();
  /**
   * <pre>
   * Tags from use_cases category
   * </pre>
   *
   * <code>repeated string use_cases = 21 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The count of useCases.
   */
  int getUseCasesCount();
  /**
   * <pre>
   * Tags from use_cases category
   * </pre>
   *
   * <code>repeated string use_cases = 21 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @param index The index of the element to return.
   * @return The useCases at the given index.
   */
  java.lang.String getUseCases(int index);
  /**
   * <pre>
   * Tags from use_cases category
   * </pre>
   *
   * <code>repeated string use_cases = 21 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @param index The index of the value to return.
   * @return The bytes of the useCases at the given index.
   */
  com.google.protobuf.ByteString
      getUseCasesBytes(int index);

  /**
   * <pre>
   * Tags from languages category.
   * </pre>
   *
   * <code>repeated string languages = 25 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return A list containing the languages.
   */
  java.util.List<java.lang.String>
      getLanguagesList();
  /**
   * <pre>
   * Tags from languages category.
   * </pre>
   *
   * <code>repeated string languages = 25 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The count of languages.
   */
  int getLanguagesCount();
  /**
   * <pre>
   * Tags from languages category.
   * </pre>
   *
   * <code>repeated string languages = 25 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @param index The index of the element to return.
   * @return The languages at the given index.
   */
  java.lang.String getLanguages(int index);
  /**
   * <pre>
   * Tags from languages category.
   * </pre>
   *
   * <code>repeated string languages = 25 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @param index The index of the value to return.
   * @return The bytes of the languages at the given index.
   */
  com.google.protobuf.ByteString
      getLanguagesBytes(int index);

  /**
   * <pre>
   * Tags from languages category with names, only used in responses.
   * </pre>
   *
   * <code>repeated .clarifai.api.FullTag languages_full = 31 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  java.util.List<com.clarifai.grpc.api.FullTag> 
      getLanguagesFullList();
  /**
   * <pre>
   * Tags from languages category with names, only used in responses.
   * </pre>
   *
   * <code>repeated .clarifai.api.FullTag languages_full = 31 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  com.clarifai.grpc.api.FullTag getLanguagesFull(int index);
  /**
   * <pre>
   * Tags from languages category with names, only used in responses.
   * </pre>
   *
   * <code>repeated .clarifai.api.FullTag languages_full = 31 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  int getLanguagesFullCount();
  /**
   * <pre>
   * Tags from languages category with names, only used in responses.
   * </pre>
   *
   * <code>repeated .clarifai.api.FullTag languages_full = 31 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.FullTagOrBuilder> 
      getLanguagesFullOrBuilderList();
  /**
   * <pre>
   * Tags from languages category with names, only used in responses.
   * </pre>
   *
   * <code>repeated .clarifai.api.FullTag languages_full = 31 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  com.clarifai.grpc.api.FullTagOrBuilder getLanguagesFullOrBuilder(
      int index);

  /**
   * <code>repeated string check_consents = 32 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return A list containing the checkConsents.
   */
  java.util.List<java.lang.String>
      getCheckConsentsList();
  /**
   * <code>repeated string check_consents = 32 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The count of checkConsents.
   */
  int getCheckConsentsCount();
  /**
   * <code>repeated string check_consents = 32 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @param index The index of the element to return.
   * @return The checkConsents at the given index.
   */
  java.lang.String getCheckConsents(int index);
  /**
   * <code>repeated string check_consents = 32 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @param index The index of the value to return.
   * @return The bytes of the checkConsents at the given index.
   */
  com.google.protobuf.ByteString
      getCheckConsentsBytes(int index);

  /**
   * <pre>
   * Is starred by the requesting user (only showed on get/list requests)
   * Please use PostModelStars/DeleteModelStars endpoints to star/unstar a model
   * </pre>
   *
   * <code>bool is_starred = 22;</code>
   * @return The isStarred.
   */
  boolean getIsStarred();

  /**
   * <pre>
   * How many users have starred the model (only showed on get/list requests)
   * Computed value, not editable
   * </pre>
   *
   * <code>int32 star_count = 23;</code>
   * @return The starCount.
   */
  int getStarCount();

  /**
   * <pre>
   * Whether it's recommended that this model is used within a workflow
   * </pre>
   *
   * <code>.google.protobuf.BoolValue workflow_recommended = 29;</code>
   * @return Whether the workflowRecommended field is set.
   */
  boolean hasWorkflowRecommended();
  /**
   * <pre>
   * Whether it's recommended that this model is used within a workflow
   * </pre>
   *
   * <code>.google.protobuf.BoolValue workflow_recommended = 29;</code>
   * @return The workflowRecommended.
   */
  com.google.protobuf.BoolValue getWorkflowRecommended();
  /**
   * <pre>
   * Whether it's recommended that this model is used within a workflow
   * </pre>
   *
   * <code>.google.protobuf.BoolValue workflow_recommended = 29;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getWorkflowRecommendedOrBuilder();

  /**
   * <pre>
   * bookmark info. When set, this model is a bookmarked model of this app.
   * Info in this field will allow you to find/access original model.
   * </pre>
   *
   * <code>.clarifai.api.BookmarkOrigin bookmark_origin = 33;</code>
   * @return Whether the bookmarkOrigin field is set.
   */
  boolean hasBookmarkOrigin();
  /**
   * <pre>
   * bookmark info. When set, this model is a bookmarked model of this app.
   * Info in this field will allow you to find/access original model.
   * </pre>
   *
   * <code>.clarifai.api.BookmarkOrigin bookmark_origin = 33;</code>
   * @return The bookmarkOrigin.
   */
  com.clarifai.grpc.api.BookmarkOrigin getBookmarkOrigin();
  /**
   * <pre>
   * bookmark info. When set, this model is a bookmarked model of this app.
   * Info in this field will allow you to find/access original model.
   * </pre>
   *
   * <code>.clarifai.api.BookmarkOrigin bookmark_origin = 33;</code>
   */
  com.clarifai.grpc.api.BookmarkOriginOrBuilder getBookmarkOriginOrBuilder();

  /**
   * <pre>
   * Representative image for this model
   * </pre>
   *
   * <code>.clarifai.api.Image image = 34;</code>
   * @return Whether the image field is set.
   */
  boolean hasImage();
  /**
   * <pre>
   * Representative image for this model
   * </pre>
   *
   * <code>.clarifai.api.Image image = 34;</code>
   * @return The image.
   */
  com.clarifai.grpc.api.Image getImage();
  /**
   * <pre>
   * Representative image for this model
   * </pre>
   *
   * <code>.clarifai.api.Image image = 34;</code>
   */
  com.clarifai.grpc.api.ImageOrBuilder getImageOrBuilder();

  /**
   * <pre>
   * License Type
   * </pre>
   *
   * <code>.clarifai.api.LicenseType license_type = 35;</code>
   * @return The enum numeric value on the wire for licenseType.
   */
  int getLicenseTypeValue();
  /**
   * <pre>
   * License Type
   * </pre>
   *
   * <code>.clarifai.api.LicenseType license_type = 35;</code>
   * @return The licenseType.
   */
  com.clarifai.grpc.api.LicenseType getLicenseType();

  /**
   * <code>.clarifai.api.Model.Source source = 36;</code>
   * @return The enum numeric value on the wire for source.
   */
  int getSourceValue();
  /**
   * <code>.clarifai.api.Model.Source source = 36;</code>
   * @return The source.
   */
  com.clarifai.grpc.api.Model.Source getSource();

  /**
   * <pre>
   * Creator of Model
   * </pre>
   *
   * <code>string creator = 37;</code>
   * @return The creator.
   */
  java.lang.String getCreator();
  /**
   * <pre>
   * Creator of Model
   * </pre>
   *
   * <code>string creator = 37;</code>
   * @return The bytes for creator.
   */
  com.google.protobuf.ByteString
      getCreatorBytes();
}
