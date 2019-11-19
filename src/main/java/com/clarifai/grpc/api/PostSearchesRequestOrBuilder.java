// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface PostSearchesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.PostSearchesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The user_id and app_id to query from.
   * </pre>
   *
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   */
  boolean hasUserAppId();
  /**
   * <pre>
   * The user_id and app_id to query from.
   * </pre>
   *
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
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
   * The query; this specifies how the data to be searched
   * </pre>
   *
   * <code>.clarifai.api.Query query = 2;</code>
   */
  boolean hasQuery();
  /**
   * <pre>
   * The query; this specifies how the data to be searched
   * </pre>
   *
   * <code>.clarifai.api.Query query = 2;</code>
   */
  com.clarifai.grpc.api.Query getQuery();
  /**
   * <pre>
   * The query; this specifies how the data to be searched
   * </pre>
   *
   * <code>.clarifai.api.Query query = 2;</code>
   */
  com.clarifai.grpc.api.QueryOrBuilder getQueryOrBuilder();

  /**
   * <pre>
   * The searched to be executed or saved
   * Eventually the request level fields will be deprecated in favor of this object
   * </pre>
   *
   * <code>repeated .clarifai.api.Search searches = 3;</code>
   */
  java.util.List<com.clarifai.grpc.api.Search> 
      getSearchesList();
  /**
   * <pre>
   * The searched to be executed or saved
   * Eventually the request level fields will be deprecated in favor of this object
   * </pre>
   *
   * <code>repeated .clarifai.api.Search searches = 3;</code>
   */
  com.clarifai.grpc.api.Search getSearches(int index);
  /**
   * <pre>
   * The searched to be executed or saved
   * Eventually the request level fields will be deprecated in favor of this object
   * </pre>
   *
   * <code>repeated .clarifai.api.Search searches = 3;</code>
   */
  int getSearchesCount();
  /**
   * <pre>
   * The searched to be executed or saved
   * Eventually the request level fields will be deprecated in favor of this object
   * </pre>
   *
   * <code>repeated .clarifai.api.Search searches = 3;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.SearchOrBuilder> 
      getSearchesOrBuilderList();
  /**
   * <pre>
   * The searched to be executed or saved
   * Eventually the request level fields will be deprecated in favor of this object
   * </pre>
   *
   * <code>repeated .clarifai.api.Search searches = 3;</code>
   */
  com.clarifai.grpc.api.SearchOrBuilder getSearchesOrBuilder(
      int index);

  /**
   * <pre>
   * Pagination information to paginate through search result Hits.
   * </pre>
   *
   * <code>.clarifai.api.Pagination pagination = 4;</code>
   */
  boolean hasPagination();
  /**
   * <pre>
   * Pagination information to paginate through search result Hits.
   * </pre>
   *
   * <code>.clarifai.api.Pagination pagination = 4;</code>
   */
  com.clarifai.grpc.api.Pagination getPagination();
  /**
   * <pre>
   * Pagination information to paginate through search result Hits.
   * </pre>
   *
   * <code>.clarifai.api.Pagination pagination = 4;</code>
   */
  com.clarifai.grpc.api.PaginationOrBuilder getPaginationOrBuilder();
}
