// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface OutputConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.OutputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * For custom concept model training: whether the concept predictions must sum to 1.
   * </pre>
   *
   * <code>bool concepts_mutually_exclusive = 1 [deprecated = true];</code>
   * @deprecated clarifai.api.OutputConfig.concepts_mutually_exclusive is deprecated.
   *     See proto/clarifai/api/resources.proto;l=1613
   * @return The conceptsMutuallyExclusive.
   */
  @java.lang.Deprecated boolean getConceptsMutuallyExclusive();

  /**
   * <pre>
   * DEPRECATED: For custom models, this is the base model to use for image embeddings.
   * Default is general model.
   * </pre>
   *
   * <code>string existing_model_id = 3 [deprecated = true];</code>
   * @deprecated clarifai.api.OutputConfig.existing_model_id is deprecated.
   *     See proto/clarifai/api/resources.proto;l=1616
   * @return The existingModelId.
   */
  @java.lang.Deprecated java.lang.String getExistingModelId();
  /**
   * <pre>
   * DEPRECATED: For custom models, this is the base model to use for image embeddings.
   * Default is general model.
   * </pre>
   *
   * <code>string existing_model_id = 3 [deprecated = true];</code>
   * @deprecated clarifai.api.OutputConfig.existing_model_id is deprecated.
   *     See proto/clarifai/api/resources.proto;l=1616
   * @return The bytes for existingModelId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getExistingModelIdBytes();

  /**
   * <pre>
   * For concept model predictions: Overrides the default_language for the app in a predict call.
   * </pre>
   *
   * <code>string language = 4;</code>
   * @return The language.
   */
  java.lang.String getLanguage();
  /**
   * <pre>
   * For concept model predictions: Overrides the default_language for the app in a predict call.
   * </pre>
   *
   * <code>string language = 4;</code>
   * @return The bytes for language.
   */
  com.google.protobuf.ByteString
      getLanguageBytes();

  /**
   * <pre>
   * DEPRECATED: Hyper-parameters for custom training.
   * Use new hyper_params field instead.
   * </pre>
   *
   * <code>string hyper_parameters = 5 [deprecated = true];</code>
   * @deprecated clarifai.api.OutputConfig.hyper_parameters is deprecated.
   *     See proto/clarifai/api/resources.proto;l=1621
   * @return The hyperParameters.
   */
  @java.lang.Deprecated java.lang.String getHyperParameters();
  /**
   * <pre>
   * DEPRECATED: Hyper-parameters for custom training.
   * Use new hyper_params field instead.
   * </pre>
   *
   * <code>string hyper_parameters = 5 [deprecated = true];</code>
   * @deprecated clarifai.api.OutputConfig.hyper_parameters is deprecated.
   *     See proto/clarifai/api/resources.proto;l=1621
   * @return The bytes for hyperParameters.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getHyperParametersBytes();

  /**
   * <pre>
   * For concept model predictions:  Maximum number of concepts in result. Defaults to 0 which under
   * the hood will return default of 20. We do a server side default in order to control this
   * feature in the future.
   * </pre>
   *
   * <code>uint32 max_concepts = 6 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The maxConcepts.
   */
  int getMaxConcepts();

  /**
   * <pre>
   * For concept model predictions: Minimum value of concept's probability score in result.
   * Defaults to 0.0 which means we won't do any thresholding as all probabilities will
   * likely be &gt; 0.0.
   * </pre>
   *
   * <code>float min_value = 7 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The minValue.
   */
  float getMinValue();

  /**
   * <pre>
   * For concept model predictions: Select concepts in result by name or by id
   * </pre>
   *
   * <code>repeated .clarifai.api.Concept select_concepts = 8;</code>
   */
  java.util.List<com.clarifai.grpc.api.Concept> 
      getSelectConceptsList();
  /**
   * <pre>
   * For concept model predictions: Select concepts in result by name or by id
   * </pre>
   *
   * <code>repeated .clarifai.api.Concept select_concepts = 8;</code>
   */
  com.clarifai.grpc.api.Concept getSelectConcepts(int index);
  /**
   * <pre>
   * For concept model predictions: Select concepts in result by name or by id
   * </pre>
   *
   * <code>repeated .clarifai.api.Concept select_concepts = 8;</code>
   */
  int getSelectConceptsCount();
  /**
   * <pre>
   * For concept model predictions: Select concepts in result by name or by id
   * </pre>
   *
   * <code>repeated .clarifai.api.Concept select_concepts = 8;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.ConceptOrBuilder> 
      getSelectConceptsOrBuilderList();
  /**
   * <pre>
   * For concept model predictions: Select concepts in result by name or by id
   * </pre>
   *
   * <code>repeated .clarifai.api.Concept select_concepts = 8;</code>
   */
  com.clarifai.grpc.api.ConceptOrBuilder getSelectConceptsOrBuilder(
      int index);

  /**
   * <pre>
   * For custom concept model training: Training timeout of the model (in seconds)
   * </pre>
   *
   * <code>uint32 training_timeout = 9;</code>
   * @return The trainingTimeout.
   */
  int getTrainingTimeout();

  /**
   * <pre>
   * For model predictions on video: Sample delay for video predicting (1 frame per N milliseconds)
   * </pre>
   *
   * <code>uint32 sample_ms = 10;</code>
   * @return The sampleMs.
   */
  int getSampleMs();

  /**
   * <pre>
   * For custom model training: Hyperparameters for custom training
   * </pre>
   *
   * <code>.google.protobuf.Struct hyper_params = 13;</code>
   * @return Whether the hyperParams field is set.
   */
  boolean hasHyperParams();
  /**
   * <pre>
   * For custom model training: Hyperparameters for custom training
   * </pre>
   *
   * <code>.google.protobuf.Struct hyper_params = 13;</code>
   * @return The hyperParams.
   */
  com.google.protobuf.Struct getHyperParams();
  /**
   * <pre>
   * For custom model training: Hyperparameters for custom training
   * </pre>
   *
   * <code>.google.protobuf.Struct hyper_params = 13;</code>
   */
  com.google.protobuf.StructOrBuilder getHyperParamsOrBuilder();

  /**
   * <pre>
   * For custom model training: this is the base model version to use for image embeddings.
   * This has to be one of the embed models in the app workflow.
   * </pre>
   *
   * <code>string embed_model_version_id = 14 [deprecated = true];</code>
   * @deprecated clarifai.api.OutputConfig.embed_model_version_id is deprecated.
   *     See proto/clarifai/api/resources.proto;l=1640
   * @return The embedModelVersionId.
   */
  @java.lang.Deprecated java.lang.String getEmbedModelVersionId();
  /**
   * <pre>
   * For custom model training: this is the base model version to use for image embeddings.
   * This has to be one of the embed models in the app workflow.
   * </pre>
   *
   * <code>string embed_model_version_id = 14 [deprecated = true];</code>
   * @deprecated clarifai.api.OutputConfig.embed_model_version_id is deprecated.
   *     See proto/clarifai/api/resources.proto;l=1640
   * @return The bytes for embedModelVersionId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getEmbedModelVersionIdBytes();

  /**
   * <pre>
   * For custom model training: Use this flag to fail on missing positive examples
   * By default we fill in the missing with random examples
   * </pre>
   *
   * <code>bool fail_on_missing_positive_examples = 15;</code>
   * @return The failOnMissingPositiveExamples.
   */
  boolean getFailOnMissingPositiveExamples();

  /**
   * <pre>
   * For custom model training: This is any additional metadata as a JSON object that we want
   * want to persist in the model's output config. This is a useful quick way to set fields for
   * introducing fields for new model types so we don't have to add a new proto field and DB field
   * each time. Please refer to the documentation or model implementation internally for more
   * details on what fields are supported for which models.
   * TODO(zeiler): remove this field after Portal is updated.
   * </pre>
   *
   * <code>.google.protobuf.Struct model_metadata = 17 [deprecated = true];</code>
   * @deprecated clarifai.api.OutputConfig.model_metadata is deprecated.
   *     See proto/clarifai/api/resources.proto;l=1650
   * @return Whether the modelMetadata field is set.
   */
  @java.lang.Deprecated boolean hasModelMetadata();
  /**
   * <pre>
   * For custom model training: This is any additional metadata as a JSON object that we want
   * want to persist in the model's output config. This is a useful quick way to set fields for
   * introducing fields for new model types so we don't have to add a new proto field and DB field
   * each time. Please refer to the documentation or model implementation internally for more
   * details on what fields are supported for which models.
   * TODO(zeiler): remove this field after Portal is updated.
   * </pre>
   *
   * <code>.google.protobuf.Struct model_metadata = 17 [deprecated = true];</code>
   * @deprecated clarifai.api.OutputConfig.model_metadata is deprecated.
   *     See proto/clarifai/api/resources.proto;l=1650
   * @return The modelMetadata.
   */
  @java.lang.Deprecated com.google.protobuf.Struct getModelMetadata();
  /**
   * <pre>
   * For custom model training: This is any additional metadata as a JSON object that we want
   * want to persist in the model's output config. This is a useful quick way to set fields for
   * introducing fields for new model types so we don't have to add a new proto field and DB field
   * each time. Please refer to the documentation or model implementation internally for more
   * details on what fields are supported for which models.
   * TODO(zeiler): remove this field after Portal is updated.
   * </pre>
   *
   * <code>.google.protobuf.Struct model_metadata = 17 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.StructOrBuilder getModelMetadataOrBuilder();
}
