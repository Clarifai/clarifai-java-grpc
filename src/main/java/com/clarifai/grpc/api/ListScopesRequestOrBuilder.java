// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface ListScopesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.ListScopesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If "personal_access_token" include scopes and endpoints available to personal access tokens.
   * If "app_specific_key" include scopes and endpoints available to app-specific keys. (default)
   * </pre>
   *
   * <code>string key_type = 1;</code>
   * @return The keyType.
   */
  java.lang.String getKeyType();
  /**
   * <pre>
   * If "personal_access_token" include scopes and endpoints available to personal access tokens.
   * If "app_specific_key" include scopes and endpoints available to app-specific keys. (default)
   * </pre>
   *
   * <code>string key_type = 1;</code>
   * @return The bytes for keyType.
   */
  com.google.protobuf.ByteString
      getKeyTypeBytes();

  /**
   * <pre>
   * For all user specific information we include user_app_id to get the user_id in a consistent way
   * </pre>
   *
   * <code>.clarifai.api.UserAppIDSet user_app_id = 2;</code>
   * @return Whether the userAppId field is set.
   */
  boolean hasUserAppId();
  /**
   * <pre>
   * For all user specific information we include user_app_id to get the user_id in a consistent way
   * </pre>
   *
   * <code>.clarifai.api.UserAppIDSet user_app_id = 2;</code>
   * @return The userAppId.
   */
  com.clarifai.grpc.api.UserAppIDSet getUserAppId();
  /**
   * <pre>
   * For all user specific information we include user_app_id to get the user_id in a consistent way
   * </pre>
   *
   * <code>.clarifai.api.UserAppIDSet user_app_id = 2;</code>
   */
  com.clarifai.grpc.api.UserAppIDSetOrBuilder getUserAppIdOrBuilder();
}
