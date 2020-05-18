// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface CollaboratorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.Collaborator)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *id of this collaborator
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   *id of this collaborator
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   *the app this collaborator has access to
   * </pre>
   *
   * <code>.clarifai.api.App app = 2;</code>
   * @return Whether the app field is set.
   */
  boolean hasApp();
  /**
   * <pre>
   *the app this collaborator has access to
   * </pre>
   *
   * <code>.clarifai.api.App app = 2;</code>
   * @return The app.
   */
  com.clarifai.grpc.api.App getApp();
  /**
   * <pre>
   *the app this collaborator has access to
   * </pre>
   *
   * <code>.clarifai.api.App app = 2;</code>
   */
  com.clarifai.grpc.api.AppOrBuilder getAppOrBuilder();

  /**
   * <pre>
   *who is this collaborator
   * </pre>
   *
   * <code>.clarifai.api.User user = 3;</code>
   * @return Whether the user field is set.
   */
  boolean hasUser();
  /**
   * <pre>
   *who is this collaborator
   * </pre>
   *
   * <code>.clarifai.api.User user = 3;</code>
   * @return The user.
   */
  com.clarifai.grpc.api.User getUser();
  /**
   * <pre>
   *who is this collaborator
   * </pre>
   *
   * <code>.clarifai.api.User user = 3;</code>
   */
  com.clarifai.grpc.api.UserOrBuilder getUserOrBuilder();

  /**
   * <pre>
   *the permission this collaborator
   * </pre>
   *
   * <code>repeated string scopes = 4;</code>
   * @return A list containing the scopes.
   */
  java.util.List<java.lang.String>
      getScopesList();
  /**
   * <pre>
   *the permission this collaborator
   * </pre>
   *
   * <code>repeated string scopes = 4;</code>
   * @return The count of scopes.
   */
  int getScopesCount();
  /**
   * <pre>
   *the permission this collaborator
   * </pre>
   *
   * <code>repeated string scopes = 4;</code>
   * @param index The index of the element to return.
   * @return The scopes at the given index.
   */
  java.lang.String getScopes(int index);
  /**
   * <pre>
   *the permission this collaborator
   * </pre>
   *
   * <code>repeated string scopes = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the scopes at the given index.
   */
  com.google.protobuf.ByteString
      getScopesBytes(int index);

  /**
   * <code>repeated string endpoints = 5;</code>
   * @return A list containing the endpoints.
   */
  java.util.List<java.lang.String>
      getEndpointsList();
  /**
   * <code>repeated string endpoints = 5;</code>
   * @return The count of endpoints.
   */
  int getEndpointsCount();
  /**
   * <code>repeated string endpoints = 5;</code>
   * @param index The index of the element to return.
   * @return The endpoints at the given index.
   */
  java.lang.String getEndpoints(int index);
  /**
   * <code>repeated string endpoints = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the endpoints at the given index.
   */
  com.google.protobuf.ByteString
      getEndpointsBytes(int index);

  /**
   * <pre>
   * When the app was shared with. We follow the XXXX timestamp
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
   * When the app was shared with. We follow the XXXX timestamp
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
   * When the app was shared with. We follow the XXXX timestamp
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
   * When the collaborator was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modified_at = 7;</code>
   * @return Whether the modifiedAt field is set.
   */
  boolean hasModifiedAt();
  /**
   * <pre>
   * When the collaborator was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modified_at = 7;</code>
   * @return The modifiedAt.
   */
  com.google.protobuf.Timestamp getModifiedAt();
  /**
   * <pre>
   * When the collaborator was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modified_at = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getModifiedAtOrBuilder();

  /**
   * <pre>
   * When the collaborator was removed from app.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp deleted_at = 8;</code>
   * @return Whether the deletedAt field is set.
   */
  boolean hasDeletedAt();
  /**
   * <pre>
   * When the collaborator was removed from app.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp deleted_at = 8;</code>
   * @return The deletedAt.
   */
  com.google.protobuf.Timestamp getDeletedAt();
  /**
   * <pre>
   * When the collaborator was removed from app.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp deleted_at = 8;</code>
   */
  com.google.protobuf.TimestampOrBuilder getDeletedAtOrBuilder();
}
