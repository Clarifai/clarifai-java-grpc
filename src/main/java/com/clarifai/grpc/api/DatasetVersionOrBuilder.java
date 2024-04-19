// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface DatasetVersionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.DatasetVersion)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID for the dataset version
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * The ID for the dataset version
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * When the dataset version was created.
   * The format is https://www.ietf.org/rfc/rfc3339.txt.
   * Example: "2006-01-02T15:04:05.999999Z".
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 2;</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <pre>
   * When the dataset version was created.
   * The format is https://www.ietf.org/rfc/rfc3339.txt.
   * Example: "2006-01-02T15:04:05.999999Z".
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 2;</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <pre>
   * When the dataset version was created.
   * The format is https://www.ietf.org/rfc/rfc3339.txt.
   * Example: "2006-01-02T15:04:05.999999Z".
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <pre>
   * When the dataset version was modified.
   * The format is https://www.ietf.org/rfc/rfc3339.txt.
   * Example: "2006-01-02T15:04:05.999999Z".
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modified_at = 3;</code>
   * @return Whether the modifiedAt field is set.
   */
  boolean hasModifiedAt();
  /**
   * <pre>
   * When the dataset version was modified.
   * The format is https://www.ietf.org/rfc/rfc3339.txt.
   * Example: "2006-01-02T15:04:05.999999Z".
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modified_at = 3;</code>
   * @return The modifiedAt.
   */
  com.google.protobuf.Timestamp getModifiedAt();
  /**
   * <pre>
   * When the dataset version was modified.
   * The format is https://www.ietf.org/rfc/rfc3339.txt.
   * Example: "2006-01-02T15:04:05.999999Z".
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modified_at = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getModifiedAtOrBuilder();

  /**
   * <pre>
   * The app the dataset version belongs to.
   * </pre>
   *
   * <code>string app_id = 4;</code>
   * @return The appId.
   */
  java.lang.String getAppId();
  /**
   * <pre>
   * The app the dataset version belongs to.
   * </pre>
   *
   * <code>string app_id = 4;</code>
   * @return The bytes for appId.
   */
  com.google.protobuf.ByteString
      getAppIdBytes();

  /**
   * <pre>
   * The user the dataset version belongs to.
   * </pre>
   *
   * <code>string user_id = 5;</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * The user the dataset version belongs to.
   * </pre>
   *
   * <code>string user_id = 5;</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * The dataset the dataset version belongs to.
   * </pre>
   *
   * <code>string dataset_id = 6;</code>
   * @return The datasetId.
   */
  java.lang.String getDatasetId();
  /**
   * <pre>
   * The dataset the dataset version belongs to.
   * </pre>
   *
   * <code>string dataset_id = 6;</code>
   * @return The bytes for datasetId.
   */
  com.google.protobuf.ByteString
      getDatasetIdBytes();

  /**
   * <pre>
   * The dataset version will be generated based on a single annotation filter.
   * </pre>
   *
   * <code>.clarifai.api.AnnotationFilterConfig annotation_filter_config = 15;</code>
   * @return Whether the annotationFilterConfig field is set.
   */
  boolean hasAnnotationFilterConfig();
  /**
   * <pre>
   * The dataset version will be generated based on a single annotation filter.
   * </pre>
   *
   * <code>.clarifai.api.AnnotationFilterConfig annotation_filter_config = 15;</code>
   * @return The annotationFilterConfig.
   */
  com.clarifai.grpc.api.AnnotationFilterConfig getAnnotationFilterConfig();
  /**
   * <pre>
   * The dataset version will be generated based on a single annotation filter.
   * </pre>
   *
   * <code>.clarifai.api.AnnotationFilterConfig annotation_filter_config = 15;</code>
   */
  com.clarifai.grpc.api.AnnotationFilterConfigOrBuilder getAnnotationFilterConfigOrBuilder();

  /**
   * <pre>
   * The dataset version will be generated based on model version inferences.
   * </pre>
   *
   * <code>.clarifai.api.ModelPredictConfig model_predict_config = 18;</code>
   * @return Whether the modelPredictConfig field is set.
   */
  boolean hasModelPredictConfig();
  /**
   * <pre>
   * The dataset version will be generated based on model version inferences.
   * </pre>
   *
   * <code>.clarifai.api.ModelPredictConfig model_predict_config = 18;</code>
   * @return The modelPredictConfig.
   */
  com.clarifai.grpc.api.ModelPredictConfig getModelPredictConfig();
  /**
   * <pre>
   * The dataset version will be generated based on model version inferences.
   * </pre>
   *
   * <code>.clarifai.api.ModelPredictConfig model_predict_config = 18;</code>
   */
  com.clarifai.grpc.api.ModelPredictConfigOrBuilder getModelPredictConfigOrBuilder();

  /**
   * <pre>
   * Status for this dataset version.
   * </pre>
   *
   * <code>.clarifai.api.status.Status status = 8;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * Status for this dataset version.
   * </pre>
   *
   * <code>.clarifai.api.status.Status status = 8;</code>
   * @return The status.
   */
  com.clarifai.grpc.api.status.Status getStatus();
  /**
   * <pre>
   * Status for this dataset version.
   * </pre>
   *
   * <code>.clarifai.api.status.Status status = 8;</code>
   */
  com.clarifai.grpc.api.status.StatusOrBuilder getStatusOrBuilder();

  /**
   * <pre>
   * Description of the dataset version
   * </pre>
   *
   * <code>string description = 10;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Description of the dataset version
   * </pre>
   *
   * <code>string description = 10;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Dataset version processing. If this is not set when the dataset version is
   * created, then the dataset default_processing_info is copied instead. Later
   * updates to default_processing_info will not apply to existing versions.
   * </pre>
   *
   * <code>.clarifai.api.DatasetVersionProcessingInfo processing_info = 19;</code>
   * @return Whether the processingInfo field is set.
   */
  boolean hasProcessingInfo();
  /**
   * <pre>
   * Dataset version processing. If this is not set when the dataset version is
   * created, then the dataset default_processing_info is copied instead. Later
   * updates to default_processing_info will not apply to existing versions.
   * </pre>
   *
   * <code>.clarifai.api.DatasetVersionProcessingInfo processing_info = 19;</code>
   * @return The processingInfo.
   */
  com.clarifai.grpc.api.DatasetVersionProcessingInfo getProcessingInfo();
  /**
   * <pre>
   * Dataset version processing. If this is not set when the dataset version is
   * created, then the dataset default_processing_info is copied instead. Later
   * updates to default_processing_info will not apply to existing versions.
   * </pre>
   *
   * <code>.clarifai.api.DatasetVersionProcessingInfo processing_info = 19;</code>
   */
  com.clarifai.grpc.api.DatasetVersionProcessingInfoOrBuilder getProcessingInfoOrBuilder();

  /**
   * <pre>
   * Dataset version metrics
   * </pre>
   *
   * <code>map&lt;string, .clarifai.api.DatasetVersionMetrics&gt; metrics = 16;</code>
   */
  int getMetricsCount();
  /**
   * <pre>
   * Dataset version metrics
   * </pre>
   *
   * <code>map&lt;string, .clarifai.api.DatasetVersionMetrics&gt; metrics = 16;</code>
   */
  boolean containsMetrics(
      java.lang.String key);
  /**
   * Use {@link #getMetricsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.clarifai.grpc.api.DatasetVersionMetrics>
  getMetrics();
  /**
   * <pre>
   * Dataset version metrics
   * </pre>
   *
   * <code>map&lt;string, .clarifai.api.DatasetVersionMetrics&gt; metrics = 16;</code>
   */
  java.util.Map<java.lang.String, com.clarifai.grpc.api.DatasetVersionMetrics>
  getMetricsMap();
  /**
   * <pre>
   * Dataset version metrics
   * </pre>
   *
   * <code>map&lt;string, .clarifai.api.DatasetVersionMetrics&gt; metrics = 16;</code>
   */

  /* nullable */
com.clarifai.grpc.api.DatasetVersionMetrics getMetricsOrDefault(
      java.lang.String key,
      /* nullable */
com.clarifai.grpc.api.DatasetVersionMetrics defaultValue);
  /**
   * <pre>
   * Dataset version metrics
   * </pre>
   *
   * <code>map&lt;string, .clarifai.api.DatasetVersionMetrics&gt; metrics = 16;</code>
   */

  com.clarifai.grpc.api.DatasetVersionMetrics getMetricsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Dataset version exports
   * </pre>
   *
   * <code>.clarifai.api.DatasetVersionExportInfo export_info = 17;</code>
   * @return Whether the exportInfo field is set.
   */
  boolean hasExportInfo();
  /**
   * <pre>
   * Dataset version exports
   * </pre>
   *
   * <code>.clarifai.api.DatasetVersionExportInfo export_info = 17;</code>
   * @return The exportInfo.
   */
  com.clarifai.grpc.api.DatasetVersionExportInfo getExportInfo();
  /**
   * <pre>
   * Dataset version exports
   * </pre>
   *
   * <code>.clarifai.api.DatasetVersionExportInfo export_info = 17;</code>
   */
  com.clarifai.grpc.api.DatasetVersionExportInfoOrBuilder getExportInfoOrBuilder();

  /**
   * <pre>
   * To handle arbitrary json metadata you can use a struct field:
   * https://github.com/google/protobuf/blob/master/src/google/protobuf/struct.proto
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 12;</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <pre>
   * To handle arbitrary json metadata you can use a struct field:
   * https://github.com/google/protobuf/blob/master/src/google/protobuf/struct.proto
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 12;</code>
   * @return The metadata.
   */
  com.google.protobuf.Struct getMetadata();
  /**
   * <pre>
   * To handle arbitrary json metadata you can use a struct field:
   * https://github.com/google/protobuf/blob/master/src/google/protobuf/struct.proto
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 12;</code>
   */
  com.google.protobuf.StructOrBuilder getMetadataOrBuilder();

  /**
   * <pre>
   * The visibility field represents whether this message is privately/publicly visible.
   * To be visible to the public the App that contains it AND the User that contains the App must
   * also be publicly visible.
   * </pre>
   *
   * <code>.clarifai.api.Visibility visibility = 13;</code>
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
   * <code>.clarifai.api.Visibility visibility = 13;</code>
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
   * <code>.clarifai.api.Visibility visibility = 13;</code>
   */
  com.clarifai.grpc.api.VisibilityOrBuilder getVisibilityOrBuilder();

  /**
   * <pre>
   * The embedding models to return embeddings for. If empty, no embeddings are returned.
   * </pre>
   *
   * <code>repeated string embed_model_version_ids = 14;</code>
   * @return A list containing the embedModelVersionIds.
   */
  java.util.List<java.lang.String>
      getEmbedModelVersionIdsList();
  /**
   * <pre>
   * The embedding models to return embeddings for. If empty, no embeddings are returned.
   * </pre>
   *
   * <code>repeated string embed_model_version_ids = 14;</code>
   * @return The count of embedModelVersionIds.
   */
  int getEmbedModelVersionIdsCount();
  /**
   * <pre>
   * The embedding models to return embeddings for. If empty, no embeddings are returned.
   * </pre>
   *
   * <code>repeated string embed_model_version_ids = 14;</code>
   * @param index The index of the element to return.
   * @return The embedModelVersionIds at the given index.
   */
  java.lang.String getEmbedModelVersionIds(int index);
  /**
   * <pre>
   * The embedding models to return embeddings for. If empty, no embeddings are returned.
   * </pre>
   *
   * <code>repeated string embed_model_version_ids = 14;</code>
   * @param index The index of the value to return.
   * @return The bytes of the embedModelVersionIds at the given index.
   */
  com.google.protobuf.ByteString
      getEmbedModelVersionIdsBytes(int index);

  /**
   * <pre>
   * Read Only. Cannot be Set
   * Origin of request for new dataset version
   * </pre>
   *
   * <code>.clarifai.api.DatasetVersionRequestOrigin request_origin = 20;</code>
   * @return The enum numeric value on the wire for requestOrigin.
   */
  int getRequestOriginValue();
  /**
   * <pre>
   * Read Only. Cannot be Set
   * Origin of request for new dataset version
   * </pre>
   *
   * <code>.clarifai.api.DatasetVersionRequestOrigin request_origin = 20;</code>
   * @return The requestOrigin.
   */
  com.clarifai.grpc.api.DatasetVersionRequestOrigin getRequestOrigin();

  public com.clarifai.grpc.api.DatasetVersion.DataConfigCase getDataConfigCase();
}
