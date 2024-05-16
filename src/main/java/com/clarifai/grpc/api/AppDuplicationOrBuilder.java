// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface AppDuplicationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.AppDuplication)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The unique identifier of an app duplication job.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * The unique identifier of an app duplication job.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * The destination application where resources are written.
   * If the destination does not exist, then the fields from the request are
   * used to create the application. If a field is not set or not supported,
   * then it will be copied from the source app, unless otherwise noted.
   * Note: this field can be empty when reading app duplication jobs in cases
   * where the app has been deleted or is just not visible to the caller.
   * ########## Supported fields ##########
   *  - description
   *  - id      - if not set, then generated automatically
   *  - user_id - if not set, then the calling user is used as the app owner
   * </pre>
   *
   * <code>.clarifai.api.App destination_app = 10;</code>
   * @return Whether the destinationApp field is set.
   */
  boolean hasDestinationApp();
  /**
   * <pre>
   * The destination application where resources are written.
   * If the destination does not exist, then the fields from the request are
   * used to create the application. If a field is not set or not supported,
   * then it will be copied from the source app, unless otherwise noted.
   * Note: this field can be empty when reading app duplication jobs in cases
   * where the app has been deleted or is just not visible to the caller.
   * ########## Supported fields ##########
   *  - description
   *  - id      - if not set, then generated automatically
   *  - user_id - if not set, then the calling user is used as the app owner
   * </pre>
   *
   * <code>.clarifai.api.App destination_app = 10;</code>
   * @return The destinationApp.
   */
  com.clarifai.grpc.api.App getDestinationApp();
  /**
   * <pre>
   * The destination application where resources are written.
   * If the destination does not exist, then the fields from the request are
   * used to create the application. If a field is not set or not supported,
   * then it will be copied from the source app, unless otherwise noted.
   * Note: this field can be empty when reading app duplication jobs in cases
   * where the app has been deleted or is just not visible to the caller.
   * ########## Supported fields ##########
   *  - description
   *  - id      - if not set, then generated automatically
   *  - user_id - if not set, then the calling user is used as the app owner
   * </pre>
   *
   * <code>.clarifai.api.App destination_app = 10;</code>
   */
  com.clarifai.grpc.api.AppOrBuilder getDestinationAppOrBuilder();

  /**
   * <pre>
   * The ID of an existing app you want to copy data into.
   * If not provided, then we will create a new application as the destination instead.
   * The various new_app_* fields can be used to set fields of this new application.
   * Deprecated: Use destination_app.id with an existing ID instead.
   * </pre>
   *
   * <code>string existing_app_id = 8 [deprecated = true];</code>
   * @deprecated clarifai.api.AppDuplication.existing_app_id is deprecated.
   *     See proto/clarifai/api/resources.proto;l=2935
   * @return The existingAppId.
   */
  @java.lang.Deprecated java.lang.String getExistingAppId();
  /**
   * <pre>
   * The ID of an existing app you want to copy data into.
   * If not provided, then we will create a new application as the destination instead.
   * The various new_app_* fields can be used to set fields of this new application.
   * Deprecated: Use destination_app.id with an existing ID instead.
   * </pre>
   *
   * <code>string existing_app_id = 8 [deprecated = true];</code>
   * @deprecated clarifai.api.AppDuplication.existing_app_id is deprecated.
   *     See proto/clarifai/api/resources.proto;l=2935
   * @return The bytes for existingAppId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getExistingAppIdBytes();

  /**
   * <pre>
   * The ID to use when creating a new application.
   * You cannot set this field when copying into an existing app, i.e., when existing_app_is is set.
   * If not provided, then it will be generated automatically.
   * Deprecated: Use destination_app.id with a new ID instead.
   * </pre>
   *
   * <code>string new_app_id = 2 [deprecated = true];</code>
   * @deprecated clarifai.api.AppDuplication.new_app_id is deprecated.
   *     See proto/clarifai/api/resources.proto;l=2943
   * @return The newAppId.
   */
  @java.lang.Deprecated java.lang.String getNewAppId();
  /**
   * <pre>
   * The ID to use when creating a new application.
   * You cannot set this field when copying into an existing app, i.e., when existing_app_is is set.
   * If not provided, then it will be generated automatically.
   * Deprecated: Use destination_app.id with a new ID instead.
   * </pre>
   *
   * <code>string new_app_id = 2 [deprecated = true];</code>
   * @deprecated clarifai.api.AppDuplication.new_app_id is deprecated.
   *     See proto/clarifai/api/resources.proto;l=2943
   * @return The bytes for newAppId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getNewAppIdBytes();

  /**
   * <pre>
   * The name to use when creating a new application.
   * You cannot set this field when copying into an existing app, i.e., when existing_app_is is set.
   * If not provided, then the ID of the new application is also used as the name.
   * Deprecated: Application names are deprecated, use application IDs instead.
   * </pre>
   *
   * <code>string new_app_name = 3 [deprecated = true];</code>
   * @deprecated clarifai.api.AppDuplication.new_app_name is deprecated.
   *     See proto/clarifai/api/resources.proto;l=2951
   * @return The newAppName.
   */
  @java.lang.Deprecated java.lang.String getNewAppName();
  /**
   * <pre>
   * The name to use when creating a new application.
   * You cannot set this field when copying into an existing app, i.e., when existing_app_is is set.
   * If not provided, then the ID of the new application is also used as the name.
   * Deprecated: Application names are deprecated, use application IDs instead.
   * </pre>
   *
   * <code>string new_app_name = 3 [deprecated = true];</code>
   * @deprecated clarifai.api.AppDuplication.new_app_name is deprecated.
   *     See proto/clarifai/api/resources.proto;l=2951
   * @return The bytes for newAppName.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getNewAppNameBytes();

  /**
   * <pre>
   * The status of the app duplication job.
   * </pre>
   *
   * <code>.clarifai.api.status.Status status = 4;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * The status of the app duplication job.
   * </pre>
   *
   * <code>.clarifai.api.status.Status status = 4;</code>
   * @return The status.
   */
  com.clarifai.grpc.api.status.Status getStatus();
  /**
   * <pre>
   * The status of the app duplication job.
   * </pre>
   *
   * <code>.clarifai.api.status.Status status = 4;</code>
   */
  com.clarifai.grpc.api.status.StatusOrBuilder getStatusOrBuilder();

  /**
   * <pre>
   * The time when the app duplication job was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 5;</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <pre>
   * The time when the app duplication job was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 5;</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <pre>
   * The time when the app duplication job was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <pre>
   * The last time when the app duplication job status was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_modified_at = 6;</code>
   * @return Whether the lastModifiedAt field is set.
   */
  boolean hasLastModifiedAt();
  /**
   * <pre>
   * The last time when the app duplication job status was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_modified_at = 6;</code>
   * @return The lastModifiedAt.
   */
  com.google.protobuf.Timestamp getLastModifiedAt();
  /**
   * <pre>
   * The last time when the app duplication job status was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_modified_at = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastModifiedAtOrBuilder();

  /**
   * <pre>
   * The filter specifies which resources are copied by the app duplication job.
   * </pre>
   *
   * <code>.clarifai.api.AppDuplicationFilters filter = 7;</code>
   * @return Whether the filter field is set.
   */
  boolean hasFilter();
  /**
   * <pre>
   * The filter specifies which resources are copied by the app duplication job.
   * </pre>
   *
   * <code>.clarifai.api.AppDuplicationFilters filter = 7;</code>
   * @return The filter.
   */
  com.clarifai.grpc.api.AppDuplicationFilters getFilter();
  /**
   * <pre>
   * The filter specifies which resources are copied by the app duplication job.
   * </pre>
   *
   * <code>.clarifai.api.AppDuplicationFilters filter = 7;</code>
   */
  com.clarifai.grpc.api.AppDuplicationFiltersOrBuilder getFilterOrBuilder();

  /**
   * <pre>
   * Copy progress for each resource type requested by the filter. Possible fields:
   *  - inputs
   *  - concepts
   *  - annotations
   *  - models
   *  - workflows
   *  - installed_module_versions
   * </pre>
   *
   * <code>repeated .clarifai.api.AppCopyProgress progress = 9;</code>
   */
  java.util.List<com.clarifai.grpc.api.AppCopyProgress> 
      getProgressList();
  /**
   * <pre>
   * Copy progress for each resource type requested by the filter. Possible fields:
   *  - inputs
   *  - concepts
   *  - annotations
   *  - models
   *  - workflows
   *  - installed_module_versions
   * </pre>
   *
   * <code>repeated .clarifai.api.AppCopyProgress progress = 9;</code>
   */
  com.clarifai.grpc.api.AppCopyProgress getProgress(int index);
  /**
   * <pre>
   * Copy progress for each resource type requested by the filter. Possible fields:
   *  - inputs
   *  - concepts
   *  - annotations
   *  - models
   *  - workflows
   *  - installed_module_versions
   * </pre>
   *
   * <code>repeated .clarifai.api.AppCopyProgress progress = 9;</code>
   */
  int getProgressCount();
  /**
   * <pre>
   * Copy progress for each resource type requested by the filter. Possible fields:
   *  - inputs
   *  - concepts
   *  - annotations
   *  - models
   *  - workflows
   *  - installed_module_versions
   * </pre>
   *
   * <code>repeated .clarifai.api.AppCopyProgress progress = 9;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.AppCopyProgressOrBuilder> 
      getProgressOrBuilderList();
  /**
   * <pre>
   * Copy progress for each resource type requested by the filter. Possible fields:
   *  - inputs
   *  - concepts
   *  - annotations
   *  - models
   *  - workflows
   *  - installed_module_versions
   * </pre>
   *
   * <code>repeated .clarifai.api.AppCopyProgress progress = 9;</code>
   */
  com.clarifai.grpc.api.AppCopyProgressOrBuilder getProgressOrBuilder(
      int index);
}
