// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface DatasetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.Dataset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID for the dataset
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * The ID for the dataset
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * When the dataset was created.
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
   * When the dataset was created.
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
   * When the dataset was created.
   * The format is https://www.ietf.org/rfc/rfc3339.txt.
   * Example: "2006-01-02T15:04:05.999999Z".
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <pre>
   * When the dataset was modified.
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
   * When the dataset was modified.
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
   * When the dataset was modified.
   * The format is https://www.ietf.org/rfc/rfc3339.txt.
   * Example: "2006-01-02T15:04:05.999999Z".
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modified_at = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getModifiedAtOrBuilder();

  /**
   * <pre>
   * The app the dataset belongs to.
   * </pre>
   *
   * <code>string app_id = 4;</code>
   * @return The appId.
   */
  java.lang.String getAppId();
  /**
   * <pre>
   * The app the dataset belongs to.
   * </pre>
   *
   * <code>string app_id = 4;</code>
   * @return The bytes for appId.
   */
  com.google.protobuf.ByteString
      getAppIdBytes();

  /**
   * <pre>
   * The user the dataset belongs to.
   * </pre>
   *
   * <code>string user_id = 5;</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * The user the dataset belongs to.
   * </pre>
   *
   * <code>string user_id = 5;</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * Description of the dataset
   * </pre>
   *
   * <code>string description = 7;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Description of the dataset
   * </pre>
   *
   * <code>string description = 7;</code>
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
   * <code>.google.protobuf.Struct metadata = 8;</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <pre>
   * To handle arbitrary json metadata you can use a struct field:
   * https://github.com/google/protobuf/blob/master/src/google/protobuf/struct.proto
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 8;</code>
   * @return The metadata.
   */
  com.google.protobuf.Struct getMetadata();
  /**
   * <pre>
   * To handle arbitrary json metadata you can use a struct field:
   * https://github.com/google/protobuf/blob/master/src/google/protobuf/struct.proto
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 8;</code>
   */
  com.google.protobuf.StructOrBuilder getMetadataOrBuilder();

  /**
   * <pre>
   * The visibility field represents whether this message is privately/publicly visible.
   * To be visible to the public the App that contains it AND the User that contains the App must
   * also be publicly visible.
   * </pre>
   *
   * <code>.clarifai.api.Visibility visibility = 9;</code>
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
   * <code>.clarifai.api.Visibility visibility = 9;</code>
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
   * <code>.clarifai.api.Visibility visibility = 9;</code>
   */
  com.clarifai.grpc.api.VisibilityOrBuilder getVisibilityOrBuilder();

  /**
   * <pre>
   * Default annotation filter used for this dataset.
   * </pre>
   *
   * <code>.clarifai.api.AnnotationFilter default_annotation_filter = 12;</code>
   * @return Whether the defaultAnnotationFilter field is set.
   */
  boolean hasDefaultAnnotationFilter();
  /**
   * <pre>
   * Default annotation filter used for this dataset.
   * </pre>
   *
   * <code>.clarifai.api.AnnotationFilter default_annotation_filter = 12;</code>
   * @return The defaultAnnotationFilter.
   */
  com.clarifai.grpc.api.AnnotationFilter getDefaultAnnotationFilter();
  /**
   * <pre>
   * Default annotation filter used for this dataset.
   * </pre>
   *
   * <code>.clarifai.api.AnnotationFilter default_annotation_filter = 12;</code>
   */
  com.clarifai.grpc.api.AnnotationFilterOrBuilder getDefaultAnnotationFilterOrBuilder();

  /**
   * <pre>
   * Notes for the dataset
   * This field should be used for in-depth notes and supports up to 64Kbs.
   * </pre>
   *
   * <code>string notes = 11;</code>
   * @return The notes.
   */
  java.lang.String getNotes();
  /**
   * <pre>
   * Notes for the dataset
   * This field should be used for in-depth notes and supports up to 64Kbs.
   * </pre>
   *
   * <code>string notes = 11;</code>
   * @return The bytes for notes.
   */
  com.google.protobuf.ByteString
      getNotesBytes();

  /**
   * <pre>
   * Dataset version associated with this dataset. This is used in listing Datasets
   * and including the latest version.
   * </pre>
   *
   * <code>.clarifai.api.DatasetVersion version = 13;</code>
   * @return Whether the version field is set.
   */
  boolean hasVersion();
  /**
   * <pre>
   * Dataset version associated with this dataset. This is used in listing Datasets
   * and including the latest version.
   * </pre>
   *
   * <code>.clarifai.api.DatasetVersion version = 13;</code>
   * @return The version.
   */
  com.clarifai.grpc.api.DatasetVersion getVersion();
  /**
   * <pre>
   * Dataset version associated with this dataset. This is used in listing Datasets
   * and including the latest version.
   * </pre>
   *
   * <code>.clarifai.api.DatasetVersion version = 13;</code>
   */
  com.clarifai.grpc.api.DatasetVersionOrBuilder getVersionOrBuilder();

  /**
   * <pre>
   * Whether the dataset is starred by the requesting user.
   * </pre>
   *
   * <code>bool is_starred = 14;</code>
   * @return The isStarred.
   */
  boolean getIsStarred();

  /**
   * <pre>
   * Number of users that starred this dataset.
   * </pre>
   *
   * <code>int32 star_count = 15;</code>
   * @return The starCount.
   */
  int getStarCount();
}
