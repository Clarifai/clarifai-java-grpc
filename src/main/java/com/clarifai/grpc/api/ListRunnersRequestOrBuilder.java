// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface ListRunnersRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.ListRunnersRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   * @return Whether the userAppId field is set.
   */
  boolean hasUserAppId();
  /**
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   * @return The userAppId.
   */
  com.clarifai.grpc.api.UserAppIDSet getUserAppId();
  /**
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   */
  com.clarifai.grpc.api.UserAppIDSetOrBuilder getUserAppIdOrBuilder();

  /**
   * <code>string nodepool_id = 2;</code>
   * @return The nodepoolId.
   */
  java.lang.String getNodepoolId();
  /**
   * <code>string nodepool_id = 2;</code>
   * @return The bytes for nodepoolId.
   */
  com.google.protobuf.ByteString
      getNodepoolIdBytes();

  /**
   * <pre>
   * (optional URL parameter) The page number. Pagination is used to split the results into chunks.
   * Defaults to 1.
   * </pre>
   *
   * <code>uint32 page = 3;</code>
   * @return The page.
   */
  int getPage();

  /**
   * <pre>
   * (optional URL parameter) The number of results that will be contained in each page. Defaults
   * to 128.
   * </pre>
   *
   * <code>uint32 per_page = 4;</code>
   * @return The perPage.
   */
  int getPerPage();

  /**
   * <code>string compute_cluster_id = 5;</code>
   * @return The computeClusterId.
   */
  java.lang.String getComputeClusterId();
  /**
   * <code>string compute_cluster_id = 5;</code>
   * @return The bytes for computeClusterId.
   */
  com.google.protobuf.ByteString
      getComputeClusterIdBytes();

  /**
   * <pre>
   * Only return runners whose replicas are &gt;= min_replicas.
   * </pre>
   *
   * <code>uint32 min_replicas = 6;</code>
   * @return The minReplicas.
   */
  int getMinReplicas();

  /**
   * <pre>
   * (optional URL parameter) ModelVersion IDs. To list all runners for the model version
   * </pre>
   *
   * <code>repeated string model_version_ids = 7;</code>
   * @return A list containing the modelVersionIds.
   */
  java.util.List<java.lang.String>
      getModelVersionIdsList();
  /**
   * <pre>
   * (optional URL parameter) ModelVersion IDs. To list all runners for the model version
   * </pre>
   *
   * <code>repeated string model_version_ids = 7;</code>
   * @return The count of modelVersionIds.
   */
  int getModelVersionIdsCount();
  /**
   * <pre>
   * (optional URL parameter) ModelVersion IDs. To list all runners for the model version
   * </pre>
   *
   * <code>repeated string model_version_ids = 7;</code>
   * @param index The index of the element to return.
   * @return The modelVersionIds at the given index.
   */
  java.lang.String getModelVersionIds(int index);
  /**
   * <pre>
   * (optional URL parameter) ModelVersion IDs. To list all runners for the model version
   * </pre>
   *
   * <code>repeated string model_version_ids = 7;</code>
   * @param index The index of the value to return.
   * @return The bytes of the modelVersionIds at the given index.
   */
  com.google.protobuf.ByteString
      getModelVersionIdsBytes(int index);
}
