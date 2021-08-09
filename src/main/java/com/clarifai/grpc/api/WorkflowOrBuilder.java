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
   * Info about the workflow version
   * </pre>
   *
   * <code>.clarifai.api.WorkflowVersion version = 9;</code>
   * @return Whether the version field is set.
   */
  boolean hasVersion();
  /**
   * <pre>
   * Info about the workflow version
   * </pre>
   *
   * <code>.clarifai.api.WorkflowVersion version = 9;</code>
   * @return The version.
   */
  com.clarifai.grpc.api.WorkflowVersion getVersion();
  /**
   * <pre>
   * Info about the workflow version
   * </pre>
   *
   * <code>.clarifai.api.WorkflowVersion version = 9;</code>
   */
  com.clarifai.grpc.api.WorkflowVersionOrBuilder getVersionOrBuilder();
}
