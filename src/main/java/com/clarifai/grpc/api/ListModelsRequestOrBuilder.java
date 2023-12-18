// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface ListModelsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.ListModelsRequest)
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
   * (optional URL parameter) List of additional fields to be included in the response. Currently supported: all, stars, outputs, presets
   * </pre>
   *
   * <code>repeated string additional_fields = 19;</code>
   * @return A list containing the additionalFields.
   */
  java.util.List<java.lang.String>
      getAdditionalFieldsList();
  /**
   * <pre>
   * (optional URL parameter) List of additional fields to be included in the response. Currently supported: all, stars, outputs, presets
   * </pre>
   *
   * <code>repeated string additional_fields = 19;</code>
   * @return The count of additionalFields.
   */
  int getAdditionalFieldsCount();
  /**
   * <pre>
   * (optional URL parameter) List of additional fields to be included in the response. Currently supported: all, stars, outputs, presets
   * </pre>
   *
   * <code>repeated string additional_fields = 19;</code>
   * @param index The index of the element to return.
   * @return The additionalFields at the given index.
   */
  java.lang.String getAdditionalFields(int index);
  /**
   * <pre>
   * (optional URL parameter) List of additional fields to be included in the response. Currently supported: all, stars, outputs, presets
   * </pre>
   *
   * <code>repeated string additional_fields = 19;</code>
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
   * <code>bool sort_ascending = 10;</code>
   * @return The sortAscending.
   */
  boolean getSortAscending();

  /**
   * <pre>
   * Whether to order by the name
   * </pre>
   *
   * <code>bool sort_by_name = 11;</code>
   * @return Whether the sortByName field is set.
   */
  boolean hasSortByName();
  /**
   * <pre>
   * Whether to order by the name
   * </pre>
   *
   * <code>bool sort_by_name = 11;</code>
   * @return The sortByName.
   */
  boolean getSortByName();

  /**
   * <pre>
   * Whether to order by the number of training inputs
   * </pre>
   *
   * <code>bool sort_by_num_inputs = 12;</code>
   * @return Whether the sortByNumInputs field is set.
   */
  boolean hasSortByNumInputs();
  /**
   * <pre>
   * Whether to order by the number of training inputs
   * </pre>
   *
   * <code>bool sort_by_num_inputs = 12;</code>
   * @return The sortByNumInputs.
   */
  boolean getSortByNumInputs();

  /**
   * <pre>
   * Whether to order by the modified_at time of the latest model version.
   * If none of the sort options is set to true, will sort by modified_at.
   * </pre>
   *
   * <code>bool sort_by_modified_at = 13;</code>
   * @return Whether the sortByModifiedAt field is set.
   */
  boolean hasSortByModifiedAt();
  /**
   * <pre>
   * Whether to order by the modified_at time of the latest model version.
   * If none of the sort options is set to true, will sort by modified_at.
   * </pre>
   *
   * <code>bool sort_by_modified_at = 13;</code>
   * @return The sortByModifiedAt.
   */
  boolean getSortByModifiedAt();

  /**
   * <pre>
   * Whether to order by the created_at
   * </pre>
   *
   * <code>bool sort_by_created_at = 24;</code>
   * @return Whether the sortByCreatedAt field is set.
   */
  boolean hasSortByCreatedAt();
  /**
   * <pre>
   * Whether to order by the created_at
   * </pre>
   *
   * <code>bool sort_by_created_at = 24;</code>
   * @return The sortByCreatedAt.
   */
  boolean getSortByCreatedAt();

  /**
   * <pre>
   * Whether to order by count of stars
   * </pre>
   *
   * <code>bool sort_by_star_count = 25;</code>
   * @return Whether the sortByStarCount field is set.
   */
  boolean hasSortByStarCount();
  /**
   * <pre>
   * Whether to order by count of stars
   * </pre>
   *
   * <code>bool sort_by_star_count = 25;</code>
   * @return The sortByStarCount.
   */
  boolean getSortByStarCount();

  /**
   * <pre>
   * Filtering options:
   * Filter models by the specific model_type_id. See ListModelTypes for the list of ModelType.Id's
   * supported.
   * </pre>
   *
   * <code>string model_type_id = 6;</code>
   * @return The modelTypeId.
   */
  java.lang.String getModelTypeId();
  /**
   * <pre>
   * Filtering options:
   * Filter models by the specific model_type_id. See ListModelTypes for the list of ModelType.Id's
   * supported.
   * </pre>
   *
   * <code>string model_type_id = 6;</code>
   * @return The bytes for modelTypeId.
   */
  com.google.protobuf.ByteString
      getModelTypeIdBytes();

  /**
   * <pre>
   * If true, we only return models that have the status MODEL_TRAINED, which includes non-trainable model types.
   * </pre>
   *
   * <code>bool trained_only = 7;</code>
   * @return The trainedOnly.
   */
  boolean getTrainedOnly();

  /**
   * <pre>
   * The list of input fields to the model.
   * For example, you can specify 'image', which will return models that make inferences on images like visual-classifier models.
   * </pre>
   *
   * <code>repeated string input_fields = 8;</code>
   * @return A list containing the inputFields.
   */
  java.util.List<java.lang.String>
      getInputFieldsList();
  /**
   * <pre>
   * The list of input fields to the model.
   * For example, you can specify 'image', which will return models that make inferences on images like visual-classifier models.
   * </pre>
   *
   * <code>repeated string input_fields = 8;</code>
   * @return The count of inputFields.
   */
  int getInputFieldsCount();
  /**
   * <pre>
   * The list of input fields to the model.
   * For example, you can specify 'image', which will return models that make inferences on images like visual-classifier models.
   * </pre>
   *
   * <code>repeated string input_fields = 8;</code>
   * @param index The index of the element to return.
   * @return The inputFields at the given index.
   */
  java.lang.String getInputFields(int index);
  /**
   * <pre>
   * The list of input fields to the model.
   * For example, you can specify 'image', which will return models that make inferences on images like visual-classifier models.
   * </pre>
   *
   * <code>repeated string input_fields = 8;</code>
   * @param index The index of the value to return.
   * @return The bytes of the inputFields at the given index.
   */
  com.google.protobuf.ByteString
      getInputFieldsBytes(int index);

  /**
   * <pre>
   * The list of output fields to the model.
   * For example, you can specify 'regions[...].data.concepts', which will return visual-detector models.
   * </pre>
   *
   * <code>repeated string output_fields = 9;</code>
   * @return A list containing the outputFields.
   */
  java.util.List<java.lang.String>
      getOutputFieldsList();
  /**
   * <pre>
   * The list of output fields to the model.
   * For example, you can specify 'regions[...].data.concepts', which will return visual-detector models.
   * </pre>
   *
   * <code>repeated string output_fields = 9;</code>
   * @return The count of outputFields.
   */
  int getOutputFieldsCount();
  /**
   * <pre>
   * The list of output fields to the model.
   * For example, you can specify 'regions[...].data.concepts', which will return visual-detector models.
   * </pre>
   *
   * <code>repeated string output_fields = 9;</code>
   * @param index The index of the element to return.
   * @return The outputFields at the given index.
   */
  java.lang.String getOutputFields(int index);
  /**
   * <pre>
   * The list of output fields to the model.
   * For example, you can specify 'regions[...].data.concepts', which will return visual-detector models.
   * </pre>
   *
   * <code>repeated string output_fields = 9;</code>
   * @param index The index of the value to return.
   * @return The bytes of the outputFields at the given index.
   */
  com.google.protobuf.ByteString
      getOutputFieldsBytes(int index);

  /**
   * <pre>
   * Filter by the license of the model version
   * </pre>
   *
   * <code>string license = 15;</code>
   * @return The license.
   */
  java.lang.String getLicense();
  /**
   * <pre>
   * Filter by the license of the model version
   * </pre>
   *
   * <code>string license = 15;</code>
   * @return The bytes for license.
   */
  com.google.protobuf.ByteString
      getLicenseBytes();

  /**
   * <pre>
   * If true, we only return models that are handpicked by clarifai staff
   * </pre>
   *
   * <code>bool featured_only = 16;</code>
   * @return The featuredOnly.
   */
  boolean getFeaturedOnly();

  /**
   * <pre>
   * If true, we only return models that are starred by the requesting user
   * </pre>
   *
   * <code>bool starred_only = 20;</code>
   * @return The starredOnly.
   */
  boolean getStarredOnly();

  /**
   * <pre>
   * List of toolkit tags to filter by
   * </pre>
   *
   * <code>repeated string toolkits = 17;</code>
   * @return A list containing the toolkits.
   */
  java.util.List<java.lang.String>
      getToolkitsList();
  /**
   * <pre>
   * List of toolkit tags to filter by
   * </pre>
   *
   * <code>repeated string toolkits = 17;</code>
   * @return The count of toolkits.
   */
  int getToolkitsCount();
  /**
   * <pre>
   * List of toolkit tags to filter by
   * </pre>
   *
   * <code>repeated string toolkits = 17;</code>
   * @param index The index of the element to return.
   * @return The toolkits at the given index.
   */
  java.lang.String getToolkits(int index);
  /**
   * <pre>
   * List of toolkit tags to filter by
   * </pre>
   *
   * <code>repeated string toolkits = 17;</code>
   * @param index The index of the value to return.
   * @return The bytes of the toolkits at the given index.
   */
  com.google.protobuf.ByteString
      getToolkitsBytes(int index);

  /**
   * <pre>
   * List of use_case tags to filter by
   * </pre>
   *
   * <code>repeated string use_cases = 18;</code>
   * @return A list containing the useCases.
   */
  java.util.List<java.lang.String>
      getUseCasesList();
  /**
   * <pre>
   * List of use_case tags to filter by
   * </pre>
   *
   * <code>repeated string use_cases = 18;</code>
   * @return The count of useCases.
   */
  int getUseCasesCount();
  /**
   * <pre>
   * List of use_case tags to filter by
   * </pre>
   *
   * <code>repeated string use_cases = 18;</code>
   * @param index The index of the element to return.
   * @return The useCases at the given index.
   */
  java.lang.String getUseCases(int index);
  /**
   * <pre>
   * List of use_case tags to filter by
   * </pre>
   *
   * <code>repeated string use_cases = 18;</code>
   * @param index The index of the value to return.
   * @return The bytes of the useCases at the given index.
   */
  com.google.protobuf.ByteString
      getUseCasesBytes(int index);

  /**
   * <pre>
   * List of language tags to filter by
   * </pre>
   *
   * <code>repeated string languages = 21;</code>
   * @return A list containing the languages.
   */
  java.util.List<java.lang.String>
      getLanguagesList();
  /**
   * <pre>
   * List of language tags to filter by
   * </pre>
   *
   * <code>repeated string languages = 21;</code>
   * @return The count of languages.
   */
  int getLanguagesCount();
  /**
   * <pre>
   * List of language tags to filter by
   * </pre>
   *
   * <code>repeated string languages = 21;</code>
   * @param index The index of the element to return.
   * @return The languages at the given index.
   */
  java.lang.String getLanguages(int index);
  /**
   * <pre>
   * List of language tags to filter by
   * </pre>
   *
   * <code>repeated string languages = 21;</code>
   * @param index The index of the value to return.
   * @return The bytes of the languages at the given index.
   */
  com.google.protobuf.ByteString
      getLanguagesBytes(int index);

  /**
   * <pre>
   * Old API behavior resulted in returning clarifai main models when calling ListModels while scoped to an app. While we transition
   * away from that, we can use this flag to not always fetch clarifai main models, unless that is the app we are explicitly listing for.
   * </pre>
   *
   * <code>bool dont_fetch_from_main = 23;</code>
   * @return The dontFetchFromMain.
   */
  boolean getDontFetchFromMain();

  /**
   * <pre>
   * Filter models by bookmark. If set, only return bookmarked models. Otherwise none bookmarked models only.
   * Note: you can not filter `trained_only` and bookmark at the same time.
   * When filter by bookmark, we will return trained and untrained models.
   * </pre>
   *
   * <code>bool bookmark = 26;</code>
   * @return The bookmark.
   */
  boolean getBookmark();

  /**
   * <pre>
   * Searching options:
   * Specify a search parameter in order to perform keyword search on the
   * following fields of the model:
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
   * <code>string search = 27;</code>
   * @return The search.
   */
  java.lang.String getSearch();
  /**
   * <pre>
   * Searching options:
   * Specify a search parameter in order to perform keyword search on the
   * following fields of the model:
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
   * <code>string search = 27;</code>
   * @return The bytes for search.
   */
  com.google.protobuf.ByteString
      getSearchBytes();

  /**
   * <pre>
   * Query name, description and id fields, that can contain the words in the query string. Does NOT support wildcards - full words only. Supports operators "OR" and "-" as NOT.
   * Deprecated: use search instead.
   * </pre>
   *
   * <code>string query = 14 [deprecated = true];</code>
   * @deprecated clarifai.api.ListModelsRequest.query is deprecated.
   *     See proto/clarifai/api/service.proto;l=5027
   * @return The query.
   */
  @java.lang.Deprecated java.lang.String getQuery();
  /**
   * <pre>
   * Query name, description and id fields, that can contain the words in the query string. Does NOT support wildcards - full words only. Supports operators "OR" and "-" as NOT.
   * Deprecated: use search instead.
   * </pre>
   *
   * <code>string query = 14 [deprecated = true];</code>
   * @deprecated clarifai.api.ListModelsRequest.query is deprecated.
   *     See proto/clarifai/api/service.proto;l=5027
   * @return The bytes for query.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getQueryBytes();

  /**
   * <pre>
   * Filter by the description and id of the model. This supports wildcard queries like "gen*" to match "general" as an example.
   * Deprecated: use search instead.
   * </pre>
   *
   * <code>string name = 5 [deprecated = true];</code>
   * @deprecated clarifai.api.ListModelsRequest.name is deprecated.
   *     See proto/clarifai/api/service.proto;l=5030
   * @return The name.
   */
  @java.lang.Deprecated java.lang.String getName();
  /**
   * <pre>
   * Filter by the description and id of the model. This supports wildcard queries like "gen*" to match "general" as an example.
   * Deprecated: use search instead.
   * </pre>
   *
   * <code>string name = 5 [deprecated = true];</code>
   * @deprecated clarifai.api.ListModelsRequest.name is deprecated.
   *     See proto/clarifai/api/service.proto;l=5030
   * @return The bytes for name.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Extends the name filter to include the user_id of the application owner that the model belongs to.
   * Deprecated: use search instead of name.
   * </pre>
   *
   * <code>bool filter_by_user_id = 22 [deprecated = true];</code>
   * @deprecated clarifai.api.ListModelsRequest.filter_by_user_id is deprecated.
   *     See proto/clarifai/api/service.proto;l=5033
   * @return The filterByUserId.
   */
  @java.lang.Deprecated boolean getFilterByUserId();

  public com.clarifai.grpc.api.ListModelsRequest.SortByCase getSortByCase();
}
