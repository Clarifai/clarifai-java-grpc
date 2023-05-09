// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface ListAppsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.ListAppsRequest)
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
   * (optional URL parameter) The page number. Pagination is used to split the results into chunks.
   * Defaults to 1.
   * </pre>
   *
   * <code>uint32 page = 2;</code>
   * @return The page.
   */
  int getPage();

  /**
   * <pre>
   * (optional URL parameter) The number of results that will be contained in each page. Defaults
   * to 128.
   * </pre>
   *
   * <code>uint32 per_page = 3;</code>
   * @return The perPage.
   */
  int getPerPage();

  /**
   * <pre>
   * Sorting opitons:
   * Whether to sort in ascending order. If false, will order in descending order.
   * </pre>
   *
   * <code>bool sort_ascending = 5;</code>
   * @return The sortAscending.
   */
  boolean getSortAscending();

  /**
   * <pre>
   * Whether to order by the name
   * </pre>
   *
   * <code>bool sort_by_name = 6;</code>
   * @return Whether the sortByName field is set.
   */
  boolean hasSortByName();
  /**
   * <pre>
   * Whether to order by the name
   * </pre>
   *
   * <code>bool sort_by_name = 6;</code>
   * @return The sortByName.
   */
  boolean getSortByName();

  /**
   * <pre>
   * Whether to order by the modified_at time.
   * If neither sort option is set to true, will sort by modified_at.
   * </pre>
   *
   * <code>bool sort_by_modified_at = 7;</code>
   * @return Whether the sortByModifiedAt field is set.
   */
  boolean hasSortByModifiedAt();
  /**
   * <pre>
   * Whether to order by the modified_at time.
   * If neither sort option is set to true, will sort by modified_at.
   * </pre>
   *
   * <code>bool sort_by_modified_at = 7;</code>
   * @return The sortByModifiedAt.
   */
  boolean getSortByModifiedAt();

  /**
   * <pre>
   * Filtering options:
   * Query various text fields that can contain the words in the query string
   * </pre>
   *
   * <code>string query = 8;</code>
   * @return The query.
   */
  java.lang.String getQuery();
  /**
   * <pre>
   * Filtering options:
   * Query various text fields that can contain the words in the query string
   * </pre>
   *
   * <code>string query = 8;</code>
   * @return The bytes for query.
   */
  com.google.protobuf.ByteString
      getQueryBytes();

  /**
   * <pre>
   * Filter by the name of the app. This supports wilcard queries like "gen*" to match "general" as an example.
   * Deprecated in favor of query
   * </pre>
   *
   * <code>string name = 4 [deprecated = true];</code>
   * @deprecated clarifai.api.ListAppsRequest.name is deprecated.
   *     See proto/clarifai/api/service.proto;l=3407
   * @return The name.
   */
  @java.lang.Deprecated java.lang.String getName();
  /**
   * <pre>
   * Filter by the name of the app. This supports wilcard queries like "gen*" to match "general" as an example.
   * Deprecated in favor of query
   * </pre>
   *
   * <code>string name = 4 [deprecated = true];</code>
   * @deprecated clarifai.api.ListAppsRequest.name is deprecated.
   *     See proto/clarifai/api/service.proto;l=3407
   * @return The bytes for name.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * If true, we only return apps that are handpicked by clarifai staff
   * </pre>
   *
   * <code>bool featured_only = 9;</code>
   * @return The featuredOnly.
   */
  boolean getFeaturedOnly();

  /**
   * <pre>
   * If true, we only return apps that are starred by the requesting user
   * </pre>
   *
   * <code>bool starred_only = 11;</code>
   * @return The starredOnly.
   */
  boolean getStarredOnly();

  /**
   * <pre>
   * (optional URL parameter) List of additional fields to be included in the response. Currently supported: all, stars
   * </pre>
   *
   * <code>repeated string additional_fields = 10;</code>
   * @return A list containing the additionalFields.
   */
  java.util.List<java.lang.String>
      getAdditionalFieldsList();
  /**
   * <pre>
   * (optional URL parameter) List of additional fields to be included in the response. Currently supported: all, stars
   * </pre>
   *
   * <code>repeated string additional_fields = 10;</code>
   * @return The count of additionalFields.
   */
  int getAdditionalFieldsCount();
  /**
   * <pre>
   * (optional URL parameter) List of additional fields to be included in the response. Currently supported: all, stars
   * </pre>
   *
   * <code>repeated string additional_fields = 10;</code>
   * @param index The index of the element to return.
   * @return The additionalFields at the given index.
   */
  java.lang.String getAdditionalFields(int index);
  /**
   * <pre>
   * (optional URL parameter) List of additional fields to be included in the response. Currently supported: all, stars
   * </pre>
   *
   * <code>repeated string additional_fields = 10;</code>
   * @param index The index of the value to return.
   * @return The bytes of the additionalFields at the given index.
   */
  com.google.protobuf.ByteString
      getAdditionalFieldsBytes(int index);

  public com.clarifai.grpc.api.ListAppsRequest.SortByCase getSortByCase();
}
