// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface PatchDatasetsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.PatchDatasetsRequest)
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
   * List of datasets that are requested to be updated.
   * </pre>
   *
   * <code>repeated .clarifai.api.Dataset datasets = 2;</code>
   */
  java.util.List<com.clarifai.grpc.api.Dataset> 
      getDatasetsList();
  /**
   * <pre>
   * List of datasets that are requested to be updated.
   * </pre>
   *
   * <code>repeated .clarifai.api.Dataset datasets = 2;</code>
   */
  com.clarifai.grpc.api.Dataset getDatasets(int index);
  /**
   * <pre>
   * List of datasets that are requested to be updated.
   * </pre>
   *
   * <code>repeated .clarifai.api.Dataset datasets = 2;</code>
   */
  int getDatasetsCount();
  /**
   * <pre>
   * List of datasets that are requested to be updated.
   * </pre>
   *
   * <code>repeated .clarifai.api.Dataset datasets = 2;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.DatasetOrBuilder> 
      getDatasetsOrBuilderList();
  /**
   * <pre>
   * List of datasets that are requested to be updated.
   * </pre>
   *
   * <code>repeated .clarifai.api.Dataset datasets = 2;</code>
   */
  com.clarifai.grpc.api.DatasetOrBuilder getDatasetsOrBuilder(
      int index);

  /**
   * <pre>
   * The action to perform on the patched objects
   * Supported values: 'overwrite' and 'merge'
   * </pre>
   *
   * <code>string action = 3;</code>
   * @return The action.
   */
  java.lang.String getAction();
  /**
   * <pre>
   * The action to perform on the patched objects
   * Supported values: 'overwrite' and 'merge'
   * </pre>
   *
   * <code>string action = 3;</code>
   * @return The bytes for action.
   */
  com.google.protobuf.ByteString
      getActionBytes();
}
