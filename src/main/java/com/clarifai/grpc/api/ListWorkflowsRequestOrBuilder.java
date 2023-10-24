// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface ListWorkflowsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.ListWorkflowsRequest)
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

  /**
   * <pre>
   * Sorting options:
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
   * <code>bool sort_by_id = 6;</code>
   * @return Whether the sortById field is set.
   */
  boolean hasSortById();
  /**
   * <pre>
   * Whether to order by the name
   * </pre>
   *
   * <code>bool sort_by_id = 6;</code>
   * @return The sortById.
   */
  boolean getSortById();

  /**
   * <pre>
   * Whether to order by the modified_at time.
   * If none of the sort options is set to true, will sort by modified_at.
   * </pre>
   *
   * <code>bool sort_by_modified_at = 7;</code>
   * @return Whether the sortByModifiedAt field is set.
   */
  boolean hasSortByModifiedAt();
  /**
   * <pre>
   * Whether to order by the modified_at time.
   * If none of the sort options is set to true, will sort by modified_at.
   * </pre>
   *
   * <code>bool sort_by_modified_at = 7;</code>
   * @return The sortByModifiedAt.
   */
  boolean getSortByModifiedAt();

  /**
   * <pre>
   * Whether to order by the created_at time.
   * </pre>
   *
   * <code>bool sort_by_created_at = 13;</code>
   * @return Whether the sortByCreatedAt field is set.
   */
  boolean hasSortByCreatedAt();
  /**
   * <pre>
   * Whether to order by the created_at time.
   * </pre>
   *
   * <code>bool sort_by_created_at = 13;</code>
   * @return The sortByCreatedAt.
   */
  boolean getSortByCreatedAt();

  /**
   * <pre>
   * Whether to order by the number of users stared the workflow
   * </pre>
   *
   * <code>bool sort_by_star_count = 14;</code>
   * @return Whether the sortByStarCount field is set.
   */
  boolean hasSortByStarCount();
  /**
   * <pre>
   * Whether to order by the number of users stared the workflow
   * </pre>
   *
   * <code>bool sort_by_star_count = 14;</code>
   * @return The sortByStarCount.
   */
  boolean getSortByStarCount();

  /**
   * <pre>
   * Filtering options:
   * If true, we only return workflows that are handpicked by clarifai staff
   * </pre>
   *
   * <code>bool featured_only = 9;</code>
   * @return The featuredOnly.
   */
  boolean getFeaturedOnly();

  /**
   * <pre>
   * If true, we only return workflows that are starred by the requesting user
   * </pre>
   *
   * <code>bool starred_only = 11;</code>
   * @return The starredOnly.
   */
  boolean getStarredOnly();

  /**
   * <pre>
   * Filter workflows by bookmark. If set, only return bookmarked workflows. Otherwise none bookmarked workflows only.
   * </pre>
   *
   * <code>bool bookmark = 15;</code>
   * @return The bookmark.
   */
  boolean getBookmark();

  /**
   * <pre>
   * Searching options:
   * Specify a search parameter in order to perform keyword search on the
   * following fields of the workflow:
   *   - id
   *   - description
   *   - notes
   *   - user_id (unless user_app_id.user_id is already set)
   * Keywords are both normalized for search (so searching for "satisfy" matches "satisfied")
   * and used for partial prefix-matching (so searching for "clari" matches "clarifai").
   * NOTE: Both the list of fields searched and the exact keyword matching
   * rules are subject to change and not guaranteed to be backwards-compatible.
   * </pre>
   *
   * <code>string search = 16;</code>
   * @return The search.
   */
  java.lang.String getSearch();
  /**
   * <pre>
   * Searching options:
   * Specify a search parameter in order to perform keyword search on the
   * following fields of the workflow:
   *   - id
   *   - description
   *   - notes
   *   - user_id (unless user_app_id.user_id is already set)
   * Keywords are both normalized for search (so searching for "satisfy" matches "satisfied")
   * and used for partial prefix-matching (so searching for "clari" matches "clarifai").
   * NOTE: Both the list of fields searched and the exact keyword matching
   * rules are subject to change and not guaranteed to be backwards-compatible.
   * </pre>
   *
   * <code>string search = 16;</code>
   * @return The bytes for search.
   */
  com.google.protobuf.ByteString
      getSearchBytes();

  /**
   * <pre>
   * Query various text fields (id, description and notes) that can contain the words in the query string.
   * Deprecated: use search instead.
   * </pre>
   *
   * <code>string query = 8 [deprecated = true];</code>
   * @deprecated clarifai.api.ListWorkflowsRequest.query is deprecated.
   *     See proto/clarifai/api/service.proto;l=6094
   * @return The query.
   */
  @java.lang.Deprecated java.lang.String getQuery();
  /**
   * <pre>
   * Query various text fields (id, description and notes) that can contain the words in the query string.
   * Deprecated: use search instead.
   * </pre>
   *
   * <code>string query = 8 [deprecated = true];</code>
   * @deprecated clarifai.api.ListWorkflowsRequest.query is deprecated.
   *     See proto/clarifai/api/service.proto;l=6094
   * @return The bytes for query.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getQueryBytes();

  /**
   * <pre>
   * Filter by the id of the workflow. This supports wilcard queries like "gen*" to match "general" as an example.
   * Deprecated: use search instead.
   * </pre>
   *
   * <code>string id = 4 [deprecated = true];</code>
   * @deprecated clarifai.api.ListWorkflowsRequest.id is deprecated.
   *     See proto/clarifai/api/service.proto;l=6097
   * @return The id.
   */
  @java.lang.Deprecated java.lang.String getId();
  /**
   * <pre>
   * Filter by the id of the workflow. This supports wilcard queries like "gen*" to match "general" as an example.
   * Deprecated: use search instead.
   * </pre>
   *
   * <code>string id = 4 [deprecated = true];</code>
   * @deprecated clarifai.api.ListWorkflowsRequest.id is deprecated.
   *     See proto/clarifai/api/service.proto;l=6097
   * @return The bytes for id.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Full text and prefix matching on id, owner id, description and notes. Searchable fields may be added
   * Deprecated: use search instead.
   * </pre>
   *
   * <code>string search_term = 12 [deprecated = true];</code>
   * @deprecated clarifai.api.ListWorkflowsRequest.search_term is deprecated.
   *     See proto/clarifai/api/service.proto;l=6100
   * @return The searchTerm.
   */
  @java.lang.Deprecated java.lang.String getSearchTerm();
  /**
   * <pre>
   * Full text and prefix matching on id, owner id, description and notes. Searchable fields may be added
   * Deprecated: use search instead.
   * </pre>
   *
   * <code>string search_term = 12 [deprecated = true];</code>
   * @deprecated clarifai.api.ListWorkflowsRequest.search_term is deprecated.
   *     See proto/clarifai/api/service.proto;l=6100
   * @return The bytes for searchTerm.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getSearchTermBytes();

  public com.clarifai.grpc.api.ListWorkflowsRequest.SortByCase getSortByCase();
}
