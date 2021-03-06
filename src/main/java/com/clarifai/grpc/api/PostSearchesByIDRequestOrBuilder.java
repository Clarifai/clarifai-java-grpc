// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface PostSearchesByIDRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.PostSearchesByIDRequest)
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
   * ID for saves search to be executed
   * </pre>
   *
   * <code>string id = 2;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * ID for saves search to be executed
   * </pre>
   *
   * <code>string id = 2;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Pagination information to paginate through search result Hits.
   * </pre>
   *
   * <code>.clarifai.api.Pagination pagination = 3;</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <pre>
   * Pagination information to paginate through search result Hits.
   * </pre>
   *
   * <code>.clarifai.api.Pagination pagination = 3;</code>
   * @return The pagination.
   */
  com.clarifai.grpc.api.Pagination getPagination();
  /**
   * <pre>
   * Pagination information to paginate through search result Hits.
   * </pre>
   *
   * <code>.clarifai.api.Pagination pagination = 3;</code>
   */
  com.clarifai.grpc.api.PaginationOrBuilder getPaginationOrBuilder();
}
