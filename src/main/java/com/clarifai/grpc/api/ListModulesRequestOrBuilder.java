// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface ListModulesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.ListModulesRequest)
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
   * <code>repeated string additional_fields = 5;</code>
   * @return A list containing the additionalFields.
   */
  java.util.List<java.lang.String>
      getAdditionalFieldsList();
  /**
   * <code>repeated string additional_fields = 5;</code>
   * @return The count of additionalFields.
   */
  int getAdditionalFieldsCount();
  /**
   * <code>repeated string additional_fields = 5;</code>
   * @param index The index of the element to return.
   * @return The additionalFields at the given index.
   */
  java.lang.String getAdditionalFields(int index);
  /**
   * <code>repeated string additional_fields = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the additionalFields at the given index.
   */
  com.google.protobuf.ByteString
      getAdditionalFieldsBytes(int index);

  /**
   * <pre>
   * Sorting options:
   * Whether to sort in ascending order. If false, will order in descending order.
   * </pre>
   *
   * <code>bool sort_ascending = 6;</code>
   * @return The sortAscending.
   */
  boolean getSortAscending();

  /**
   * <pre>
   * Whether to order by the created_at time.
   * </pre>
   *
   * <code>bool sort_by_created_at = 7;</code>
   * @return Whether the sortByCreatedAt field is set.
   */
  boolean hasSortByCreatedAt();
  /**
   * <pre>
   * Whether to order by the created_at time.
   * </pre>
   *
   * <code>bool sort_by_created_at = 7;</code>
   * @return The sortByCreatedAt.
   */
  boolean getSortByCreatedAt();

  /**
   * <pre>
   * Whether to order by the number of users stared the app
   * </pre>
   *
   * <code>bool sort_by_star_count = 8;</code>
   * @return Whether the sortByStarCount field is set.
   */
  boolean hasSortByStarCount();
  /**
   * <pre>
   * Whether to order by the number of users stared the app
   * </pre>
   *
   * <code>bool sort_by_star_count = 8;</code>
   * @return The sortByStarCount.
   */
  boolean getSortByStarCount();

  /**
   * <pre>
   * If neither sort option is set to true, will sort by modified_at.
   * </pre>
   *
   * <code>bool sort_by_modified_at = 9;</code>
   * @return Whether the sortByModifiedAt field is set.
   */
  boolean hasSortByModifiedAt();
  /**
   * <pre>
   * If neither sort option is set to true, will sort by modified_at.
   * </pre>
   *
   * <code>bool sort_by_modified_at = 9;</code>
   * @return The sortByModifiedAt.
   */
  boolean getSortByModifiedAt();

  /**
   * <pre>
   * Whether to order by the external id
   * </pre>
   *
   * <code>bool sort_by_id = 11;</code>
   * @return Whether the sortById field is set.
   */
  boolean hasSortById();
  /**
   * <pre>
   * Whether to order by the external id
   * </pre>
   *
   * <code>bool sort_by_id = 11;</code>
   * @return The sortById.
   */
  boolean getSortById();

  /**
   * <pre>
   * Filtering options:
   * </pre>
   *
   * <code>bool starred_only = 4;</code>
   * @return The starredOnly.
   */
  boolean getStarredOnly();

  /**
   * <pre>
   * Filter modules by bookmark. If set, only return bookmarked modules. Otherwise none bookmarked modules only.
   * </pre>
   *
   * <code>bool bookmark = 10;</code>
   * @return The bookmark.
   */
  boolean getBookmark();

  /**
   * <pre>
   * Searching options:
   * Specify a search parameter in order to perform keyword search on the
   * following fields of the module:
   *   - id
   *   - description
   *   - user_id (unless user_app_id.user_id is already set)
   * Keywords are both normalized for search (so searching for "satisfy" matches "satisfied")
   * and used for partial prefix-matching (so searching for "clari" matches "clarifai").
   * NOTE: Both the list of fields searched and the exact keyword matching
   * rules are subject to change and not guaranteed to be backwards-compatible.
   * </pre>
   *
   * <code>string search = 14;</code>
   * @return The search.
   */
  java.lang.String getSearch();
  /**
   * <pre>
   * Searching options:
   * Specify a search parameter in order to perform keyword search on the
   * following fields of the module:
   *   - id
   *   - description
   *   - user_id (unless user_app_id.user_id is already set)
   * Keywords are both normalized for search (so searching for "satisfy" matches "satisfied")
   * and used for partial prefix-matching (so searching for "clari" matches "clarifai").
   * NOTE: Both the list of fields searched and the exact keyword matching
   * rules are subject to change and not guaranteed to be backwards-compatible.
   * </pre>
   *
   * <code>string search = 14;</code>
   * @return The bytes for search.
   */
  com.google.protobuf.ByteString
      getSearchBytes();

  /**
   * <pre>
   * Filter by the id and description of the module. This supports wildcard queries like "gen*" to match "general" as an example.
   * Deprecated: use search instead.
   * </pre>
   *
   * <code>string name = 12 [deprecated = true];</code>
   * @deprecated clarifai.api.ListModulesRequest.name is deprecated.
   *     See proto/clarifai/api/service.proto;l=6742
   * @return The name.
   */
  @java.lang.Deprecated java.lang.String getName();
  /**
   * <pre>
   * Filter by the id and description of the module. This supports wildcard queries like "gen*" to match "general" as an example.
   * Deprecated: use search instead.
   * </pre>
   *
   * <code>string name = 12 [deprecated = true];</code>
   * @deprecated clarifai.api.ListModulesRequest.name is deprecated.
   *     See proto/clarifai/api/service.proto;l=6742
   * @return The bytes for name.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Filter by the application owner whose this module belongs to
   * Deprecated: use search instead of name.
   * </pre>
   *
   * <code>bool filter_by_user_id = 13 [deprecated = true];</code>
   * @deprecated clarifai.api.ListModulesRequest.filter_by_user_id is deprecated.
   *     See proto/clarifai/api/service.proto;l=6745
   * @return The filterByUserId.
   */
  @java.lang.Deprecated boolean getFilterByUserId();

  public com.clarifai.grpc.api.ListModulesRequest.SortByCase getSortByCase();
}
