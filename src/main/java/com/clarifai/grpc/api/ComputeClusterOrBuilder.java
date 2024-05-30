// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface ComputeClusterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.ComputeCluster)
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
   * Short description of cluster region.
   * </pre>
   *
   * <code>string description = 2;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Short description of cluster region.
   * </pre>
   *
   * <code>string description = 2;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>.clarifai.api.CloudProvider cloud_provider = 3;</code>
   * @return Whether the cloudProvider field is set.
   */
  boolean hasCloudProvider();
  /**
   * <code>.clarifai.api.CloudProvider cloud_provider = 3;</code>
   * @return The cloudProvider.
   */
  com.clarifai.grpc.api.CloudProvider getCloudProvider();
  /**
   * <code>.clarifai.api.CloudProvider cloud_provider = 3;</code>
   */
  com.clarifai.grpc.api.CloudProviderOrBuilder getCloudProviderOrBuilder();

  /**
   * <pre>
   * The region. The naming here depends on the cluster choice above and will be validated
   * against which clusters+regions that Clarifai currently supports.
   * </pre>
   *
   * <code>string region = 4;</code>
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   * <pre>
   * The region. The naming here depends on the cluster choice above and will be validated
   * against which clusters+regions that Clarifai currently supports.
   * </pre>
   *
   * <code>string region = 4;</code>
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString
      getRegionBytes();

  /**
   * <pre>
   * The user/org that this compute cluster belongs to.
   * </pre>
   *
   * <code>string user_id = 5;</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * The user/org that this compute cluster belongs to.
   * </pre>
   *
   * <code>string user_id = 5;</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * When the compute cluster was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 6;</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <pre>
   * When the compute cluster was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 6;</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <pre>
   * When the compute cluster was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <pre>
   * When the compute cluster was last modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modified_at = 7;</code>
   * @return Whether the modifiedAt field is set.
   */
  boolean hasModifiedAt();
  /**
   * <pre>
   * When the compute cluster was last modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modified_at = 7;</code>
   * @return The modifiedAt.
   */
  com.google.protobuf.Timestamp getModifiedAt();
  /**
   * <pre>
   * When the compute cluster was last modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modified_at = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getModifiedAtOrBuilder();
}
