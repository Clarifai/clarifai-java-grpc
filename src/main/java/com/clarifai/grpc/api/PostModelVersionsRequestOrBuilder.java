// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface PostModelVersionsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.PostModelVersionsRequest)
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
   * <code>string model_id = 2;</code>
   * @return The modelId.
   */
  java.lang.String getModelId();
  /**
   * <code>string model_id = 2;</code>
   * @return The bytes for modelId.
   */
  com.google.protobuf.ByteString
      getModelIdBytes();

  /**
   * <code>repeated .clarifai.api.ModelVersion model_versions = 3;</code>
   */
  java.util.List<com.clarifai.grpc.api.ModelVersion> 
      getModelVersionsList();
  /**
   * <code>repeated .clarifai.api.ModelVersion model_versions = 3;</code>
   */
  com.clarifai.grpc.api.ModelVersion getModelVersions(int index);
  /**
   * <code>repeated .clarifai.api.ModelVersion model_versions = 3;</code>
   */
  int getModelVersionsCount();
  /**
   * <code>repeated .clarifai.api.ModelVersion model_versions = 3;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.ModelVersionOrBuilder> 
      getModelVersionsOrBuilderList();
  /**
   * <code>repeated .clarifai.api.ModelVersion model_versions = 3;</code>
   */
  com.clarifai.grpc.api.ModelVersionOrBuilder getModelVersionsOrBuilder(
      int index);

  /**
   * <pre>
   * Use this to filter inputs that are used in training
   * Alternatively, dataset_version field.
   * </pre>
   *
   * <code>.clarifai.api.Search search = 4 [deprecated = true];</code>
   * @deprecated clarifai.api.PostModelVersionsRequest.search is deprecated.
   *     See proto/clarifai/api/service.proto;l=4511
   * @return Whether the search field is set.
   */
  @java.lang.Deprecated boolean hasSearch();
  /**
   * <pre>
   * Use this to filter inputs that are used in training
   * Alternatively, dataset_version field.
   * </pre>
   *
   * <code>.clarifai.api.Search search = 4 [deprecated = true];</code>
   * @deprecated clarifai.api.PostModelVersionsRequest.search is deprecated.
   *     See proto/clarifai/api/service.proto;l=4511
   * @return The search.
   */
  @java.lang.Deprecated com.clarifai.grpc.api.Search getSearch();
  /**
   * <pre>
   * Use this to filter inputs that are used in training
   * Alternatively, dataset_version field.
   * </pre>
   *
   * <code>.clarifai.api.Search search = 4 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.clarifai.grpc.api.SearchOrBuilder getSearchOrBuilder();

  /**
   * <pre>
   *train_search is used to specify what data to train on.
   * Alternatively, use dataset_version field.
   * </pre>
   *
   * <code>.clarifai.api.Search train_search = 5 [deprecated = true];</code>
   * @deprecated clarifai.api.PostModelVersionsRequest.train_search is deprecated.
   *     See proto/clarifai/api/service.proto;l=4514
   * @return Whether the trainSearch field is set.
   */
  @java.lang.Deprecated boolean hasTrainSearch();
  /**
   * <pre>
   *train_search is used to specify what data to train on.
   * Alternatively, use dataset_version field.
   * </pre>
   *
   * <code>.clarifai.api.Search train_search = 5 [deprecated = true];</code>
   * @deprecated clarifai.api.PostModelVersionsRequest.train_search is deprecated.
   *     See proto/clarifai/api/service.proto;l=4514
   * @return The trainSearch.
   */
  @java.lang.Deprecated com.clarifai.grpc.api.Search getTrainSearch();
  /**
   * <pre>
   *train_search is used to specify what data to train on.
   * Alternatively, use dataset_version field.
   * </pre>
   *
   * <code>.clarifai.api.Search train_search = 5 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.clarifai.grpc.api.SearchOrBuilder getTrainSearchOrBuilder();

  /**
   * <pre>
   *test_search is used to specify what data to test on.
   * Alternatively, use dataset_version field.
   * </pre>
   *
   * <code>.clarifai.api.Search test_search = 6 [deprecated = true];</code>
   * @deprecated clarifai.api.PostModelVersionsRequest.test_search is deprecated.
   *     See proto/clarifai/api/service.proto;l=4517
   * @return Whether the testSearch field is set.
   */
  @java.lang.Deprecated boolean hasTestSearch();
  /**
   * <pre>
   *test_search is used to specify what data to test on.
   * Alternatively, use dataset_version field.
   * </pre>
   *
   * <code>.clarifai.api.Search test_search = 6 [deprecated = true];</code>
   * @deprecated clarifai.api.PostModelVersionsRequest.test_search is deprecated.
   *     See proto/clarifai/api/service.proto;l=4517
   * @return The testSearch.
   */
  @java.lang.Deprecated com.clarifai.grpc.api.Search getTestSearch();
  /**
   * <pre>
   *test_search is used to specify what data to test on.
   * Alternatively, use dataset_version field.
   * </pre>
   *
   * <code>.clarifai.api.Search test_search = 6 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.clarifai.grpc.api.SearchOrBuilder getTestSearchOrBuilder();

  /**
   * <pre>
   * Description about this training run
   * </pre>
   *
   * <code>string description = 8;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Description about this training run
   * </pre>
   *
   * <code>string description = 8;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Use the data from this dataset version for training.
   * Set dataset_version.dataset_id to identify the dataset that you would like to use.
   * When dataset_version.id field is set,
   * the system will reuse the data from provided dataset version.
   * When dataset_version.id is not set,
   * a new dataset version will be created in the dataset using provided dataset_version fields.
   * </pre>
   *
   * <code>.clarifai.api.DatasetVersion dataset_version = 9;</code>
   * @return Whether the datasetVersion field is set.
   */
  boolean hasDatasetVersion();
  /**
   * <pre>
   * Use the data from this dataset version for training.
   * Set dataset_version.dataset_id to identify the dataset that you would like to use.
   * When dataset_version.id field is set,
   * the system will reuse the data from provided dataset version.
   * When dataset_version.id is not set,
   * a new dataset version will be created in the dataset using provided dataset_version fields.
   * </pre>
   *
   * <code>.clarifai.api.DatasetVersion dataset_version = 9;</code>
   * @return The datasetVersion.
   */
  com.clarifai.grpc.api.DatasetVersion getDatasetVersion();
  /**
   * <pre>
   * Use the data from this dataset version for training.
   * Set dataset_version.dataset_id to identify the dataset that you would like to use.
   * When dataset_version.id field is set,
   * the system will reuse the data from provided dataset version.
   * When dataset_version.id is not set,
   * a new dataset version will be created in the dataset using provided dataset_version fields.
   * </pre>
   *
   * <code>.clarifai.api.DatasetVersion dataset_version = 9;</code>
   */
  com.clarifai.grpc.api.DatasetVersionOrBuilder getDatasetVersionOrBuilder();

  /**
   * <pre>
   * When evaluate_after_training set to true, we will do evaluation immediately after training finishes.
   * We will merge this with default_eval_info.
   * </pre>
   *
   * <code>.clarifai.api.EvalInfo eval_info = 10;</code>
   * @return Whether the evalInfo field is set.
   */
  boolean hasEvalInfo();
  /**
   * <pre>
   * When evaluate_after_training set to true, we will do evaluation immediately after training finishes.
   * We will merge this with default_eval_info.
   * </pre>
   *
   * <code>.clarifai.api.EvalInfo eval_info = 10;</code>
   * @return The evalInfo.
   */
  com.clarifai.grpc.api.EvalInfo getEvalInfo();
  /**
   * <pre>
   * When evaluate_after_training set to true, we will do evaluation immediately after training finishes.
   * We will merge this with default_eval_info.
   * </pre>
   *
   * <code>.clarifai.api.EvalInfo eval_info = 10;</code>
   */
  com.clarifai.grpc.api.EvalInfoOrBuilder getEvalInfoOrBuilder();
}
