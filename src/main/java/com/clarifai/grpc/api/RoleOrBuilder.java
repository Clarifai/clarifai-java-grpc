// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface RoleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.Role)
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
   * <pre>
   * When the role was created.
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
   * When the role was created.
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
   * When the role was created.
   * The format is https://www.ietf.org/rfc/rfc3339.txt.
   * Example: "2006-01-02T15:04:05.999999Z".
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <pre>
   * Most recent time when the role was updated.
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
   * Most recent time when the role was updated.
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
   * Most recent time when the role was updated.
   * The format is https://www.ietf.org/rfc/rfc3339.txt.
   * Example: "2006-01-02T15:04:05.999999Z".
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modified_at = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getModifiedAtOrBuilder();

  /**
   * <code>string name = 4;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 4;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string description = 5;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 5;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * The low-level scopes this role has
   * </pre>
   *
   * <code>repeated string scopes = 6;</code>
   * @return A list containing the scopes.
   */
  java.util.List<java.lang.String>
      getScopesList();
  /**
   * <pre>
   * The low-level scopes this role has
   * </pre>
   *
   * <code>repeated string scopes = 6;</code>
   * @return The count of scopes.
   */
  int getScopesCount();
  /**
   * <pre>
   * The low-level scopes this role has
   * </pre>
   *
   * <code>repeated string scopes = 6;</code>
   * @param index The index of the element to return.
   * @return The scopes at the given index.
   */
  java.lang.String getScopes(int index);
  /**
   * <pre>
   * The low-level scopes this role has
   * </pre>
   *
   * <code>repeated string scopes = 6;</code>
   * @param index The index of the value to return.
   * @return The bytes of the scopes at the given index.
   */
  com.google.protobuf.ByteString
      getScopesBytes(int index);

  /**
   * <pre>
   * The endpoint-level scopes this role has
   * </pre>
   *
   * <code>repeated string endpoints = 7;</code>
   * @return A list containing the endpoints.
   */
  java.util.List<java.lang.String>
      getEndpointsList();
  /**
   * <pre>
   * The endpoint-level scopes this role has
   * </pre>
   *
   * <code>repeated string endpoints = 7;</code>
   * @return The count of endpoints.
   */
  int getEndpointsCount();
  /**
   * <pre>
   * The endpoint-level scopes this role has
   * </pre>
   *
   * <code>repeated string endpoints = 7;</code>
   * @param index The index of the element to return.
   * @return The endpoints at the given index.
   */
  java.lang.String getEndpoints(int index);
  /**
   * <pre>
   * The endpoint-level scopes this role has
   * </pre>
   *
   * <code>repeated string endpoints = 7;</code>
   * @param index The index of the value to return.
   * @return The bytes of the endpoints at the given index.
   */
  com.google.protobuf.ByteString
      getEndpointsBytes(int index);

  /**
   * <pre>
   * Type of the role 'team' or 'org'
   * </pre>
   *
   * <code>.clarifai.api.RoleType type = 8;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Type of the role 'team' or 'org'
   * </pre>
   *
   * <code>.clarifai.api.RoleType type = 8;</code>
   * @return The type.
   */
  com.clarifai.grpc.api.RoleType getType();
}