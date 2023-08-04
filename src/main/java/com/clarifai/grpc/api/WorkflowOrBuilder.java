// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface WorkflowOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.Workflow)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The workflows's unique id.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * The workflows's unique id.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * The app the workflow belongs to
   * </pre>
   *
   * <code>string app_id = 2;</code>
   * @return The appId.
   */
  java.lang.String getAppId();
  /**
   * <pre>
   * The app the workflow belongs to
   * </pre>
   *
   * <code>string app_id = 2;</code>
   * @return The bytes for appId.
   */
  com.google.protobuf.ByteString
      getAppIdBytes();

  /**
   * <pre>
   * When the workflow was created. We follow the XXXX timestamp
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
   * When the workflow was created. We follow the XXXX timestamp
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
   * When the workflow was created. We follow the XXXX timestamp
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
   * The list of nodes retrieved from latest workflow version.
   * Each node can specify an input node that it connects to in order to define the graph.
   * </pre>
   *
   * <code>repeated .clarifai.api.WorkflowNode nodes = 4;</code>
   */
  java.util.List<com.clarifai.grpc.api.WorkflowNode> 
      getNodesList();
  /**
   * <pre>
   * The list of nodes retrieved from latest workflow version.
   * Each node can specify an input node that it connects to in order to define the graph.
   * </pre>
   *
   * <code>repeated .clarifai.api.WorkflowNode nodes = 4;</code>
   */
  com.clarifai.grpc.api.WorkflowNode getNodes(int index);
  /**
   * <pre>
   * The list of nodes retrieved from latest workflow version.
   * Each node can specify an input node that it connects to in order to define the graph.
   * </pre>
   *
   * <code>repeated .clarifai.api.WorkflowNode nodes = 4;</code>
   */
  int getNodesCount();
  /**
   * <pre>
   * The list of nodes retrieved from latest workflow version.
   * Each node can specify an input node that it connects to in order to define the graph.
   * </pre>
   *
   * <code>repeated .clarifai.api.WorkflowNode nodes = 4;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.WorkflowNodeOrBuilder> 
      getNodesOrBuilderList();
  /**
   * <pre>
   * The list of nodes retrieved from latest workflow version.
   * Each node can specify an input node that it connects to in order to define the graph.
   * </pre>
   *
   * <code>repeated .clarifai.api.WorkflowNode nodes = 4;</code>
   */
  com.clarifai.grpc.api.WorkflowNodeOrBuilder getNodesOrBuilder(
      int index);

  /**
   * <pre>
   * To handle arbitrary json metadata you can use a struct field:
   * https://github.com/google/protobuf/blob/master/src/google/protobuf/struct.proto
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
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 5;</code>
   */
  com.google.protobuf.StructOrBuilder getMetadataOrBuilder();

  /**
   * <pre>
   * The visibility field represents whether this message is privately/publicly visible.
   * To be visible to the public the App that contains it AND the User that contains the App must
   * also be publicly visible.
   * </pre>
   *
   * <code>.clarifai.api.Visibility visibility = 6;</code>
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
   * <code>.clarifai.api.Visibility visibility = 6;</code>
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
   * <code>.clarifai.api.Visibility visibility = 6;</code>
   */
  com.clarifai.grpc.api.VisibilityOrBuilder getVisibilityOrBuilder();

  /**
   * <pre>
   * The user the workflow belongs to
   * </pre>
   *
   * <code>string user_id = 7;</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * The user the workflow belongs to
   * </pre>
   *
   * <code>string user_id = 7;</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * When the workflow was last modified
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modified_at = 8;</code>
   * @return Whether the modifiedAt field is set.
   */
  boolean hasModifiedAt();
  /**
   * <pre>
   * When the workflow was last modified
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modified_at = 8;</code>
   * @return The modifiedAt.
   */
  com.google.protobuf.Timestamp getModifiedAt();
  /**
   * <pre>
   * When the workflow was last modified
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modified_at = 8;</code>
   */
  com.google.protobuf.TimestampOrBuilder getModifiedAtOrBuilder();

  /**
   * <pre>
   * Info about the workflow version used to return the latest version when listing Workflows.
   * </pre>
   *
   * <code>.clarifai.api.WorkflowVersion version = 9;</code>
   * @return Whether the version field is set.
   */
  boolean hasVersion();
  /**
   * <pre>
   * Info about the workflow version used to return the latest version when listing Workflows.
   * </pre>
   *
   * <code>.clarifai.api.WorkflowVersion version = 9;</code>
   * @return The version.
   */
  com.clarifai.grpc.api.WorkflowVersion getVersion();
  /**
   * <pre>
   * Info about the workflow version used to return the latest version when listing Workflows.
   * </pre>
   *
   * <code>.clarifai.api.WorkflowVersion version = 9;</code>
   */
  com.clarifai.grpc.api.WorkflowVersionOrBuilder getVersionOrBuilder();

  /**
   * <pre>
   * Is starred by the requesting user (only showed on get/list requests)
   * Please use PostWorkflowStars/DeleteWorkflowStars endpoints to star/unstar a workflow
   * </pre>
   *
   * <code>bool is_starred = 10;</code>
   * @return The isStarred.
   */
  boolean getIsStarred();

  /**
   * <pre>
   * How many users have starred the workflow (only showed on get/list requests)
   * Computed value, not editable
   * </pre>
   *
   * <code>int32 star_count = 11;</code>
   * @return The starCount.
   */
  int getStarCount();

  /**
   * <pre>
   * Short description about this workflow
   * </pre>
   *
   * <code>string description = 12;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Short description about this workflow
   * </pre>
   *
   * <code>string description = 12;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Notes for the workflow
   * This field should be used for in-depth notes and supports up to 64Kbs.
   * </pre>
   *
   * <code>string notes = 13;</code>
   * @return The notes.
   */
  java.lang.String getNotes();
  /**
   * <pre>
   * Notes for the workflow
   * This field should be used for in-depth notes and supports up to 64Kbs.
   * </pre>
   *
   * <code>string notes = 13;</code>
   * @return The bytes for notes.
   */
  com.google.protobuf.ByteString
      getNotesBytes();

  /**
   * <pre>
   * Tags from use_cases category
   * </pre>
   *
   * <code>repeated string use_cases = 14 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return A list containing the useCases.
   */
  java.util.List<java.lang.String>
      getUseCasesList();
  /**
   * <pre>
   * Tags from use_cases category
   * </pre>
   *
   * <code>repeated string use_cases = 14 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The count of useCases.
   */
  int getUseCasesCount();
  /**
   * <pre>
   * Tags from use_cases category
   * </pre>
   *
   * <code>repeated string use_cases = 14 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @param index The index of the element to return.
   * @return The useCases at the given index.
   */
  java.lang.String getUseCases(int index);
  /**
   * <pre>
   * Tags from use_cases category
   * </pre>
   *
   * <code>repeated string use_cases = 14 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @param index The index of the value to return.
   * @return The bytes of the useCases at the given index.
   */
  com.google.protobuf.ByteString
      getUseCasesBytes(int index);

  /**
   * <pre>
   * Tags for check consents
   * </pre>
   *
   * <code>repeated string check_consents = 15 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return A list containing the checkConsents.
   */
  java.util.List<java.lang.String>
      getCheckConsentsList();
  /**
   * <pre>
   * Tags for check consents
   * </pre>
   *
   * <code>repeated string check_consents = 15 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The count of checkConsents.
   */
  int getCheckConsentsCount();
  /**
   * <pre>
   * Tags for check consents
   * </pre>
   *
   * <code>repeated string check_consents = 15 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @param index The index of the element to return.
   * @return The checkConsents at the given index.
   */
  java.lang.String getCheckConsents(int index);
  /**
   * <pre>
   * Tags for check consents
   * </pre>
   *
   * <code>repeated string check_consents = 15 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @param index The index of the value to return.
   * @return The bytes of the checkConsents at the given index.
   */
  com.google.protobuf.ByteString
      getCheckConsentsBytes(int index);

  /**
   * <pre>
   * bookmark info. When set, this workflow is a bookmarked workflow of this app.
   * Info in this field will allow you to find/access original workflow.
   * </pre>
   *
   * <code>.clarifai.api.BookmarkOrigin bookmark_origin = 16;</code>
   * @return Whether the bookmarkOrigin field is set.
   */
  boolean hasBookmarkOrigin();
  /**
   * <pre>
   * bookmark info. When set, this workflow is a bookmarked workflow of this app.
   * Info in this field will allow you to find/access original workflow.
   * </pre>
   *
   * <code>.clarifai.api.BookmarkOrigin bookmark_origin = 16;</code>
   * @return The bookmarkOrigin.
   */
  com.clarifai.grpc.api.BookmarkOrigin getBookmarkOrigin();
  /**
   * <pre>
   * bookmark info. When set, this workflow is a bookmarked workflow of this app.
   * Info in this field will allow you to find/access original workflow.
   * </pre>
   *
   * <code>.clarifai.api.BookmarkOrigin bookmark_origin = 16;</code>
   */
  com.clarifai.grpc.api.BookmarkOriginOrBuilder getBookmarkOriginOrBuilder();
}
