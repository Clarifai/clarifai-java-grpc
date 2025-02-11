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
   * (optional URL parameter) List of additional fields to be included in the response. Currently supported: all, stars, counts
   * </pre>
   *
   * <code>repeated string additional_fields = 10;</code>
   * @return A list containing the additionalFields.
   */
  java.util.List<java.lang.String>
      getAdditionalFieldsList();
  /**
   * <pre>
   * (optional URL parameter) List of additional fields to be included in the response. Currently supported: all, stars, counts
   * </pre>
   *
   * <code>repeated string additional_fields = 10;</code>
   * @return The count of additionalFields.
   */
  int getAdditionalFieldsCount();
  /**
   * <pre>
   * (optional URL parameter) List of additional fields to be included in the response. Currently supported: all, stars, counts
   * </pre>
   *
   * <code>repeated string additional_fields = 10;</code>
   * @param index The index of the element to return.
   * @return The additionalFields at the given index.
   */
  java.lang.String getAdditionalFields(int index);
  /**
   * <pre>
   * (optional URL parameter) List of additional fields to be included in the response. Currently supported: all, stars, counts
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
   * Whether to order by the name.
   * </pre>
   *
   * <code>bool sort_by_name = 6;</code>
   * @return Whether the sortByName field is set.
   */
  boolean hasSortByName();
  /**
   * <pre>
   * Whether to order by the name.
   * </pre>
   *
   * <code>bool sort_by_name = 6;</code>
   * @return The sortByName.
   */
  boolean getSortByName();

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
   * <code>bool sort_by_created_at = 12;</code>
   * @return Whether the sortByCreatedAt field is set.
   */
  boolean hasSortByCreatedAt();
  /**
   * <pre>
   * Whether to order by the created_at time.
   * </pre>
   *
   * <code>bool sort_by_created_at = 12;</code>
   * @return The sortByCreatedAt.
   */
  boolean getSortByCreatedAt();

  /**
   * <pre>
   * Whether to order by the number of users stared the app
   * </pre>
   *
   * <code>bool sort_by_star_count = 13;</code>
   * @return Whether the sortByStarCount field is set.
   */
  boolean hasSortByStarCount();
  /**
   * <pre>
   * Whether to order by the number of users stared the app
   * </pre>
   *
   * <code>bool sort_by_star_count = 13;</code>
   * @return The sortByStarCount.
   */
  boolean getSortByStarCount();

  /**
   * <pre>
   * Whether to order by the id
   * </pre>
   *
   * <code>bool sort_by_id = 17;</code>
   * @return Whether the sortById field is set.
   */
  boolean hasSortById();
  /**
   * <pre>
   * Whether to order by the id
   * </pre>
   *
   * <code>bool sort_by_id = 17;</code>
   * @return The sortById.
   */
  boolean getSortById();

  /**
   * <pre>
   * Filtering options:
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
   * If true, we only return apps that are marked as a template by the app owner.
   * </pre>
   *
   * <code>bool template_only = 16;</code>
   * @return The templateOnly.
   */
  boolean getTemplateOnly();

  /**
   * <pre>
   * Searching options:
   * Specify a search parameter in order to perform keyword search on the
   * following fields of the application:
   *   - id
   *   - name
   *   - description
   *   - notes
   *   - user_id (unless user_app_id.user_id is already set)
   * Keywords are both normalized for search (so searching for "satisfy" matches "satisfied")
   * and used for partial prefix-matching (so searching for "clari" matches "clarifai").
   * NOTE: Both the list of fields searched and the exact keyword matching
   * rules are subject to change and not guaranteed to be backwards-compatible.
   * </pre>
   *
   * <code>string search = 15;</code>
   * @return The search.
   */
  java.lang.String getSearch();
  /**
   * <pre>
   * Searching options:
   * Specify a search parameter in order to perform keyword search on the
   * following fields of the application:
   *   - id
   *   - name
   *   - description
   *   - notes
   *   - user_id (unless user_app_id.user_id is already set)
   * Keywords are both normalized for search (so searching for "satisfy" matches "satisfied")
   * and used for partial prefix-matching (so searching for "clari" matches "clarifai").
   * NOTE: Both the list of fields searched and the exact keyword matching
   * rules are subject to change and not guaranteed to be backwards-compatible.
   * </pre>
   *
   * <code>string search = 15;</code>
   * @return The bytes for search.
   */
  com.google.protobuf.ByteString
      getSearchBytes();

  /**
   * <pre>
   * Query various text fields (id, name, description, and notes) that can contain the words in the query string
   * Deprecated: use search instead.
   * </pre>
   *
   * <code>string query = 8 [deprecated = true];</code>
   * @deprecated clarifai.api.ListAppsRequest.query is deprecated.
   *     See proto/clarifai/api/service.proto;l=4314
   * @return The query.
   */
  @java.lang.Deprecated java.lang.String getQuery();
  /**
   * <pre>
   * Query various text fields (id, name, description, and notes) that can contain the words in the query string
   * Deprecated: use search instead.
   * </pre>
   *
   * <code>string query = 8 [deprecated = true];</code>
   * @deprecated clarifai.api.ListAppsRequest.query is deprecated.
   *     See proto/clarifai/api/service.proto;l=4314
   * @return The bytes for query.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getQueryBytes();

  /**
   * <pre>
   * Filter by the id, name and notes of the app. This supports wilcard queries like "gen*" to match "general" as an example.
   * Deprecated: use search instead.
   * </pre>
   *
   * <code>string name = 4 [deprecated = true];</code>
   * @deprecated clarifai.api.ListAppsRequest.name is deprecated.
   *     See proto/clarifai/api/service.proto;l=4317
   * @return The name.
   */
  @java.lang.Deprecated java.lang.String getName();
  /**
   * <pre>
   * Filter by the id, name and notes of the app. This supports wilcard queries like "gen*" to match "general" as an example.
   * Deprecated: use search instead.
   * </pre>
   *
   * <code>string name = 4 [deprecated = true];</code>
   * @deprecated clarifai.api.ListAppsRequest.name is deprecated.
   *     See proto/clarifai/api/service.proto;l=4317
   * @return The bytes for name.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Filter by the user-unique-id of the app. This supports wilcard queries like "gen*" to match "general" as an example.
   * Deprecated: use search instead.
   * </pre>
   *
   * <code>string id = 14 [deprecated = true];</code>
   * @deprecated clarifai.api.ListAppsRequest.id is deprecated.
   *     See proto/clarifai/api/service.proto;l=4320
   * @return The id.
   */
  @java.lang.Deprecated java.lang.String getId();
  /**
   * <pre>
   * Filter by the user-unique-id of the app. This supports wilcard queries like "gen*" to match "general" as an example.
   * Deprecated: use search instead.
   * </pre>
   *
   * <code>string id = 14 [deprecated = true];</code>
   * @deprecated clarifai.api.ListAppsRequest.id is deprecated.
   *     See proto/clarifai/api/service.proto;l=4320
   * @return The bytes for id.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getIdBytes();

  public com.clarifai.grpc.api.ListAppsRequest.SortByCase getSortByCase();
}
