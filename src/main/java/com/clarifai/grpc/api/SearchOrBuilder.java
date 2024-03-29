// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface SearchOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.Search)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Search query.
   * </pre>
   *
   * <code>.clarifai.api.Query query = 1;</code>
   * @return Whether the query field is set.
   */
  boolean hasQuery();
  /**
   * <pre>
   * Search query.
   * </pre>
   *
   * <code>.clarifai.api.Query query = 1;</code>
   * @return The query.
   */
  com.clarifai.grpc.api.Query getQuery();
  /**
   * <pre>
   * Search query.
   * </pre>
   *
   * <code>.clarifai.api.Query query = 1;</code>
   */
  com.clarifai.grpc.api.QueryOrBuilder getQueryOrBuilder();

  /**
   * <pre>
   * Customer facing, external ID for search to be saved. Provided by the user, e.g. "saved-search-1.
   * It is unique per application.
   * </pre>
   *
   * <code>string id = 2;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Customer facing, external ID for search to be saved. Provided by the user, e.g. "saved-search-1.
   * It is unique per application.
   * </pre>
   *
   * <code>string id = 2;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Application that owns this saved search.
   * </pre>
   *
   * <code>string application_id = 3;</code>
   * @return The applicationId.
   */
  java.lang.String getApplicationId();
  /**
   * <pre>
   * Application that owns this saved search.
   * </pre>
   *
   * <code>string application_id = 3;</code>
   * @return The bytes for applicationId.
   */
  com.google.protobuf.ByteString
      getApplicationIdBytes();

  /**
   * <pre>
   * Human readable display name of the saved search.
   * </pre>
   *
   * <code>string name = 4;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Human readable display name of the saved search.
   * </pre>
   *
   * <code>string name = 4;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * "As of" timestamp, indicating a time in the past as of which we want to
   * retrieve the annotations satisfying the query.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp as_of = 5;</code>
   * @return Whether the asOf field is set.
   */
  boolean hasAsOf();
  /**
   * <pre>
   * "As of" timestamp, indicating a time in the past as of which we want to
   * retrieve the annotations satisfying the query.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp as_of = 5;</code>
   * @return The asOf.
   */
  com.google.protobuf.Timestamp getAsOf();
  /**
   * <pre>
   * "As of" timestamp, indicating a time in the past as of which we want to
   * retrieve the annotations satisfying the query.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp as_of = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getAsOfOrBuilder();

  /**
   * <pre>
   * Git hash of the code that ran the filter.
   * </pre>
   *
   * <code>string git_hash = 6;</code>
   * @return The gitHash.
   */
  java.lang.String getGitHash();
  /**
   * <pre>
   * Git hash of the code that ran the filter.
   * </pre>
   *
   * <code>string git_hash = 6;</code>
   * @return The bytes for gitHash.
   */
  com.google.protobuf.ByteString
      getGitHashBytes();

  /**
   * <pre>
   * When the saved search was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 7;</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <pre>
   * When the saved search was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 7;</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <pre>
   * When the saved search was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <pre>
   * When the saved search was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modified_at = 8;</code>
   * @return Whether the modifiedAt field is set.
   */
  boolean hasModifiedAt();
  /**
   * <pre>
   * When the saved search was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modified_at = 8;</code>
   * @return The modifiedAt.
   */
  com.google.protobuf.Timestamp getModifiedAt();
  /**
   * <pre>
   * When the saved search was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modified_at = 8;</code>
   */
  com.google.protobuf.TimestampOrBuilder getModifiedAtOrBuilder();

  /**
   * <pre>
   * The search algorithm to be used.
   * Options are are 'nearest_neighbor', 'brute_force', and 'avg_concept_brute_force'
   * The last two perform a brute force search visual search instead of a more scalable distributed
   * nearest neighbor search and should be used by advanced users only.
   * If not specified we default to nearest neighbor
   * </pre>
   *
   * <code>string algorithm = 9;</code>
   * @return The algorithm.
   */
  java.lang.String getAlgorithm();
  /**
   * <pre>
   * The search algorithm to be used.
   * Options are are 'nearest_neighbor', 'brute_force', and 'avg_concept_brute_force'
   * The last two perform a brute force search visual search instead of a more scalable distributed
   * nearest neighbor search and should be used by advanced users only.
   * If not specified we default to nearest neighbor
   * </pre>
   *
   * <code>string algorithm = 9;</code>
   * @return The bytes for algorithm.
   */
  com.google.protobuf.ByteString
      getAlgorithmBytes();

  /**
   * <pre>
   * If true, save this search, and exit without executing the search.
   * If false execute the query
   * </pre>
   *
   * <code>bool save = 10;</code>
   * @return The save.
   */
  boolean getSave();

  /**
   * <pre>
   * Minimum value of confidence threshold score in result.
   * Defaults to 0.0 which means we won't do any thresholding as all probabilities will
   * likely be &gt; 0.0.
   * </pre>
   *
   * <code>float min_value = 11;</code>
   * @return The minValue.
   */
  float getMinValue();

  /**
   * <pre>
   * The visibility field represents whether this message is privately/publicly visible.
   * To be visible to the public the App that contains it AND the User that contains the App must
   * also be publicly visible.
   * </pre>
   *
   * <code>.clarifai.api.Visibility visibility = 12;</code>
   * @return Whether the visibility field is set.
   */
  boolean hasVisibility();
  /**
   * <pre>
   * The visibility field represents whether this message is privately/publicly visible.
   * To be visible to the public the App that contains it AND the User that contains the App must
   * also be publicly visible.
   * </pre>
   *
   * <code>.clarifai.api.Visibility visibility = 12;</code>
   * @return The visibility.
   */
  com.clarifai.grpc.api.Visibility getVisibility();
  /**
   * <pre>
   * The visibility field represents whether this message is privately/publicly visible.
   * To be visible to the public the App that contains it AND the User that contains the App must
   * also be publicly visible.
   * </pre>
   *
   * <code>.clarifai.api.Visibility visibility = 12;</code>
   */
  com.clarifai.grpc.api.VisibilityOrBuilder getVisibilityOrBuilder();

  /**
   * <code>.clarifai.api.Search.Metric metric = 13;</code>
   * @return The enum numeric value on the wire for metric.
   */
  int getMetricValue();
  /**
   * <code>.clarifai.api.Search.Metric metric = 13;</code>
   * @return The metric.
   */
  com.clarifai.grpc.api.Search.Metric getMetric();
}
