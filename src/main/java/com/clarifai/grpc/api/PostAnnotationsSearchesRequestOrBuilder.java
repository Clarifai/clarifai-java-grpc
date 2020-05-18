// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface PostAnnotationsSearchesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.PostAnnotationsSearchesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The user_id and app_id to query from.
   * </pre>
   *
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   * @return Whether the userAppId field is set.
   */
  boolean hasUserAppId();
  /**
   * <pre>
   * The user_id and app_id to query from.
   * </pre>
   *
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   * @return The userAppId.
   */
  com.clarifai.grpc.api.UserAppIDSet getUserAppId();
  /**
   * <pre>
   * The user_id and app_id to query from.
   * </pre>
   *
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   */
  com.clarifai.grpc.api.UserAppIDSetOrBuilder getUserAppIdOrBuilder();

  /**
   * <pre>
   * The searched to be executed or saved
   * </pre>
   *
   * <code>repeated .clarifai.api.Search searches = 2;</code>
   */
  java.util.List<com.clarifai.grpc.api.Search> 
      getSearchesList();
  /**
   * <pre>
   * The searched to be executed or saved
   * </pre>
   *
   * <code>repeated .clarifai.api.Search searches = 2;</code>
   */
  com.clarifai.grpc.api.Search getSearches(int index);
  /**
   * <pre>
   * The searched to be executed or saved
   * </pre>
   *
   * <code>repeated .clarifai.api.Search searches = 2;</code>
   */
  int getSearchesCount();
  /**
   * <pre>
   * The searched to be executed or saved
   * </pre>
   *
   * <code>repeated .clarifai.api.Search searches = 2;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.SearchOrBuilder> 
      getSearchesOrBuilderList();
  /**
   * <pre>
   * The searched to be executed or saved
   * </pre>
   *
   * <code>repeated .clarifai.api.Search searches = 2;</code>
   */
  com.clarifai.grpc.api.SearchOrBuilder getSearchesOrBuilder(
      int index);

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
