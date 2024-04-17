// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface ListDatasetVersionsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.ListDatasetVersionsRequest)
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
   * <pre>
   * Identify dataset by id.
   * </pre>
   *
   * <code>string dataset_id = 2;</code>
   * @return The datasetId.
   */
  java.lang.String getDatasetId();
  /**
   * <pre>
   * Identify dataset by id.
   * </pre>
   *
   * <code>string dataset_id = 2;</code>
   * @return The bytes for datasetId.
   */
  com.google.protobuf.ByteString
      getDatasetIdBytes();

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
   * <pre>
   * (optional URL parameter) Filter by origin of dataset version
   * </pre>
   *
   * <code>repeated .clarifai.api.DatasetVersionRequestOrigin request_origins = 5;</code>
   * @return A list containing the requestOrigins.
   */
  java.util.List<com.clarifai.grpc.api.DatasetVersionRequestOrigin> getRequestOriginsList();
  /**
   * <pre>
   * (optional URL parameter) Filter by origin of dataset version
   * </pre>
   *
   * <code>repeated .clarifai.api.DatasetVersionRequestOrigin request_origins = 5;</code>
   * @return The count of requestOrigins.
   */
  int getRequestOriginsCount();
  /**
   * <pre>
   * (optional URL parameter) Filter by origin of dataset version
   * </pre>
   *
   * <code>repeated .clarifai.api.DatasetVersionRequestOrigin request_origins = 5;</code>
   * @param index The index of the element to return.
   * @return The requestOrigins at the given index.
   */
  com.clarifai.grpc.api.DatasetVersionRequestOrigin getRequestOrigins(int index);
  /**
   * <pre>
   * (optional URL parameter) Filter by origin of dataset version
   * </pre>
   *
   * <code>repeated .clarifai.api.DatasetVersionRequestOrigin request_origins = 5;</code>
   * @return A list containing the enum numeric values on the wire for requestOrigins.
   */
  java.util.List<java.lang.Integer>
  getRequestOriginsValueList();
  /**
   * <pre>
   * (optional URL parameter) Filter by origin of dataset version
   * </pre>
   *
   * <code>repeated .clarifai.api.DatasetVersionRequestOrigin request_origins = 5;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of requestOrigins at the given index.
   */
  int getRequestOriginsValue(int index);
}
