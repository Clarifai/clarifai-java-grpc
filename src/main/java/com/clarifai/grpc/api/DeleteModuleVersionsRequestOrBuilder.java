// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface DeleteModuleVersionsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.DeleteModuleVersionsRequest)
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
   * <code>string module_id = 2;</code>
   * @return The moduleId.
   */
  java.lang.String getModuleId();
  /**
   * <code>string module_id = 2;</code>
   * @return The bytes for moduleId.
   */
  com.google.protobuf.ByteString
      getModuleIdBytes();

  /**
   * <code>repeated string ids = 3;</code>
   * @return A list containing the ids.
   */
  java.util.List<java.lang.String>
      getIdsList();
  /**
   * <code>repeated string ids = 3;</code>
   * @return The count of ids.
   */
  int getIdsCount();
  /**
   * <code>repeated string ids = 3;</code>
   * @param index The index of the element to return.
   * @return The ids at the given index.
   */
  java.lang.String getIds(int index);
  /**
   * <code>repeated string ids = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the ids at the given index.
   */
  com.google.protobuf.ByteString
      getIdsBytes(int index);
}
