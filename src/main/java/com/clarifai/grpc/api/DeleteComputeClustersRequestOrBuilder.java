// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface DeleteComputeClustersRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.DeleteComputeClustersRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Only the user_id is used from this.
   * </pre>
   *
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   * @return Whether the userAppId field is set.
   */
  boolean hasUserAppId();
  /**
   * <pre>
   * Only the user_id is used from this.
   * </pre>
   *
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   * @return The userAppId.
   */
  com.clarifai.grpc.api.UserAppIDSet getUserAppId();
  /**
   * <pre>
   * Only the user_id is used from this.
   * </pre>
   *
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   */
  com.clarifai.grpc.api.UserAppIDSetOrBuilder getUserAppIdOrBuilder();

  /**
   * <pre>
   * List of nodepool ids to be deleted
   * </pre>
   *
   * <code>repeated string ids = 2;</code>
   * @return A list containing the ids.
   */
  java.util.List<java.lang.String>
      getIdsList();
  /**
   * <pre>
   * List of nodepool ids to be deleted
   * </pre>
   *
   * <code>repeated string ids = 2;</code>
   * @return The count of ids.
   */
  int getIdsCount();
  /**
   * <pre>
   * List of nodepool ids to be deleted
   * </pre>
   *
   * <code>repeated string ids = 2;</code>
   * @param index The index of the element to return.
   * @return The ids at the given index.
   */
  java.lang.String getIds(int index);
  /**
   * <pre>
   * List of nodepool ids to be deleted
   * </pre>
   *
   * <code>repeated string ids = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the ids at the given index.
   */
  com.google.protobuf.ByteString
      getIdsBytes(int index);
}