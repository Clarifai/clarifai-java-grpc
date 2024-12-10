// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface ModelVersionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.ModelVersion)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * When the version was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 2;</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <pre>
   * When the version was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 2;</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <pre>
   * When the version was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <pre>
   * The status of the version (whether it's untrained, training, trained, etc.).
   * </pre>
   *
   * <code>.clarifai.api.status.Status status = 3;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * The status of the version (whether it's untrained, training, trained, etc.).
   * </pre>
   *
   * <code>.clarifai.api.status.Status status = 3;</code>
   * @return The status.
   */
  com.clarifai.grpc.api.status.Status getStatus();
  /**
   * <pre>
   * The status of the version (whether it's untrained, training, trained, etc.).
   * </pre>
   *
   * <code>.clarifai.api.status.Status status = 3;</code>
   */
  com.clarifai.grpc.api.status.StatusOrBuilder getStatusOrBuilder();

  /**
   * <code>uint32 active_concept_count = 4;</code>
   * @return The activeConceptCount.
   */
  int getActiveConceptCount();

  /**
   * <code>.clarifai.api.EvalMetrics metrics = 5;</code>
   * @return Whether the metrics field is set.
   */
  boolean hasMetrics();
  /**
   * <code>.clarifai.api.EvalMetrics metrics = 5;</code>
   * @return The metrics.
   */
  com.clarifai.grpc.api.EvalMetrics getMetrics();
  /**
   * <code>.clarifai.api.EvalMetrics metrics = 5;</code>
   */
  com.clarifai.grpc.api.EvalMetricsOrBuilder getMetricsOrBuilder();

  /**
   * <pre>
   * number of inputs in the model version
   * </pre>
   *
   * <code>uint32 total_input_count = 6;</code>
   * @return The totalInputCount.
   */
  int getTotalInputCount();

  /**
   * <pre>
   * When a model has already been trained externally, you can upload
   * it directly to the platform as a model version directly by
   * setting the PretrainedModelConfig
   * </pre>
   *
   * <code>.clarifai.api.PretrainedModelConfig pretrained_model_config = 7;</code>
   * @return Whether the pretrainedModelConfig field is set.
   */
  boolean hasPretrainedModelConfig();
  /**
   * <pre>
   * When a model has already been trained externally, you can upload
   * it directly to the platform as a model version directly by
   * setting the PretrainedModelConfig
   * </pre>
   *
   * <code>.clarifai.api.PretrainedModelConfig pretrained_model_config = 7;</code>
   * @return The pretrainedModelConfig.
   */
  com.clarifai.grpc.api.PretrainedModelConfig getPretrainedModelConfig();
  /**
   * <pre>
   * When a model has already been trained externally, you can upload
   * it directly to the platform as a model version directly by
   * setting the PretrainedModelConfig
   * </pre>
   *
   * <code>.clarifai.api.PretrainedModelConfig pretrained_model_config = 7;</code>
   */
  com.clarifai.grpc.api.PretrainedModelConfigOrBuilder getPretrainedModelConfigOrBuilder();

  /**
   * <pre>
   * When training of this version was completed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp completed_at = 10;</code>
   * @return Whether the completedAt field is set.
   */
  boolean hasCompletedAt();
  /**
   * <pre>
   * When training of this version was completed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp completed_at = 10;</code>
   * @return The completedAt.
   */
  com.google.protobuf.Timestamp getCompletedAt();
  /**
   * <pre>
   * When training of this version was completed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp completed_at = 10;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCompletedAtOrBuilder();

  /**
   * <pre>
   * Description about this version
   * </pre>
   *
   * <code>string description = 11;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Description about this version
   * </pre>
   *
   * <code>string description = 11;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

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
   * <pre>
   * The app the model version belongs to.
   * </pre>
   *
   * <code>string app_id = 13;</code>
   * @return The appId.
   */
  java.lang.String getAppId();
  /**
   * <pre>
   * The app the model version belongs to.
   * </pre>
   *
   * <code>string app_id = 13;</code>
   * @return The bytes for appId.
   */
  com.google.protobuf.ByteString
      getAppIdBytes();

  /**
   * <pre>
   * The user the model version belongs to.
   * </pre>
   *
   * <code>string user_id = 14;</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * The user the model version belongs to.
   * </pre>
   *
   * <code>string user_id = 14;</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * When this model version was last modified
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modified_at = 15;</code>
   * @return Whether the modifiedAt field is set.
   */
  boolean hasModifiedAt();
  /**
   * <pre>
   * When this model version was last modified
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modified_at = 15;</code>
   * @return The modifiedAt.
   */
  com.google.protobuf.Timestamp getModifiedAt();
  /**
   * <pre>
   * When this model version was last modified
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modified_at = 15;</code>
   */
  com.google.protobuf.TimestampOrBuilder getModifiedAtOrBuilder();

  /**
   * <pre>
   * To handle arbitrary json metadata you can use a struct field:
   * https://github.com/google/protobuf/blob/master/src/google/protobuf/struct.proto
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 16;</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <pre>
   * To handle arbitrary json metadata you can use a struct field:
   * https://github.com/google/protobuf/blob/master/src/google/protobuf/struct.proto
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 16;</code>
   * @return The metadata.
   */
  com.google.protobuf.Struct getMetadata();
  /**
   * <pre>
   * To handle arbitrary json metadata you can use a struct field:
   * https://github.com/google/protobuf/blob/master/src/google/protobuf/struct.proto
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 16;</code>
   */
  com.google.protobuf.StructOrBuilder getMetadataOrBuilder();

  /**
   * <code>string license = 17;</code>
   * @return The license.
   */
  java.lang.String getLicense();
  /**
   * <code>string license = 17;</code>
   * @return The bytes for license.
   */
  com.google.protobuf.ByteString
      getLicenseBytes();

  /**
   * <pre>
   * Info about the model's output. Besides `output_info.data`, these fields should
   * be reserved for parameters that affect the models outputs when inferencing.
   * `output_info.data` is used to specify the training concepts for this model version.
   * </pre>
   *
   * <code>.clarifai.api.OutputInfo output_info = 19;</code>
   * @return Whether the outputInfo field is set.
   */
  boolean hasOutputInfo();
  /**
   * <pre>
   * Info about the model's output. Besides `output_info.data`, these fields should
   * be reserved for parameters that affect the models outputs when inferencing.
   * `output_info.data` is used to specify the training concepts for this model version.
   * </pre>
   *
   * <code>.clarifai.api.OutputInfo output_info = 19;</code>
   * @return The outputInfo.
   */
  com.clarifai.grpc.api.OutputInfo getOutputInfo();
  /**
   * <pre>
   * Info about the model's output. Besides `output_info.data`, these fields should
   * be reserved for parameters that affect the models outputs when inferencing.
   * `output_info.data` is used to specify the training concepts for this model version.
   * </pre>
   *
   * <code>.clarifai.api.OutputInfo output_info = 19;</code>
   */
  com.clarifai.grpc.api.OutputInfoOrBuilder getOutputInfoOrBuilder();

  /**
   * <pre>
   * Info about preprocessing the models inputs, before they are sent to this model for training or inferencing.
   * E.g.: `input_info.base_embed_model` lets us know inputs should be ran through a base model before being sent to an embedding-classifier.
   * </pre>
   *
   * <code>.clarifai.api.InputInfo input_info = 20;</code>
   * @return Whether the inputInfo field is set.
   */
  boolean hasInputInfo();
  /**
   * <pre>
   * Info about preprocessing the models inputs, before they are sent to this model for training or inferencing.
   * E.g.: `input_info.base_embed_model` lets us know inputs should be ran through a base model before being sent to an embedding-classifier.
   * </pre>
   *
   * <code>.clarifai.api.InputInfo input_info = 20;</code>
   * @return The inputInfo.
   */
  com.clarifai.grpc.api.InputInfo getInputInfo();
  /**
   * <pre>
   * Info about preprocessing the models inputs, before they are sent to this model for training or inferencing.
   * E.g.: `input_info.base_embed_model` lets us know inputs should be ran through a base model before being sent to an embedding-classifier.
   * </pre>
   *
   * <code>.clarifai.api.InputInfo input_info = 20;</code>
   */
  com.clarifai.grpc.api.InputInfoOrBuilder getInputInfoOrBuilder();

  /**
   * <pre>
   * Configuration for the training process of this model version.
   * </pre>
   *
   * <code>.clarifai.api.TrainInfo train_info = 21;</code>
   * @return Whether the trainInfo field is set.
   */
  boolean hasTrainInfo();
  /**
   * <pre>
   * Configuration for the training process of this model version.
   * </pre>
   *
   * <code>.clarifai.api.TrainInfo train_info = 21;</code>
   * @return The trainInfo.
   */
  com.clarifai.grpc.api.TrainInfo getTrainInfo();
  /**
   * <pre>
   * Configuration for the training process of this model version.
   * </pre>
   *
   * <code>.clarifai.api.TrainInfo train_info = 21;</code>
   */
  com.clarifai.grpc.api.TrainInfoOrBuilder getTrainInfoOrBuilder();

  /**
   * <pre>
   * Configuration used to import model from third-party toolkits
   * </pre>
   *
   * <code>.clarifai.api.ImportInfo import_info = 22;</code>
   * @return Whether the importInfo field is set.
   */
  boolean hasImportInfo();
  /**
   * <pre>
   * Configuration used to import model from third-party toolkits
   * </pre>
   *
   * <code>.clarifai.api.ImportInfo import_info = 22;</code>
   * @return The importInfo.
   */
  com.clarifai.grpc.api.ImportInfo getImportInfo();
  /**
   * <pre>
   * Configuration used to import model from third-party toolkits
   * </pre>
   *
   * <code>.clarifai.api.ImportInfo import_info = 22;</code>
   */
  com.clarifai.grpc.api.ImportInfoOrBuilder getImportInfoOrBuilder();

  /**
   * <pre>
   * Contains the training logs if available
   * </pre>
   *
   * <code>string train_log = 23;</code>
   * @return The trainLog.
   */
  java.lang.String getTrainLog();
  /**
   * <pre>
   * Contains the training logs if available
   * </pre>
   *
   * <code>string train_log = 23;</code>
   * @return The bytes for trainLog.
   */
  com.google.protobuf.ByteString
      getTrainLogBytes();

  /**
   * <pre>
   * The minimum required compute resource for this model for inference.
   * </pre>
   *
   * <code>.clarifai.api.ComputeInfo inference_compute_info = 24;</code>
   * @return Whether the inferenceComputeInfo field is set.
   */
  boolean hasInferenceComputeInfo();
  /**
   * <pre>
   * The minimum required compute resource for this model for inference.
   * </pre>
   *
   * <code>.clarifai.api.ComputeInfo inference_compute_info = 24;</code>
   * @return The inferenceComputeInfo.
   */
  com.clarifai.grpc.api.ComputeInfo getInferenceComputeInfo();
  /**
   * <pre>
   * The minimum required compute resource for this model for inference.
   * </pre>
   *
   * <code>.clarifai.api.ComputeInfo inference_compute_info = 24;</code>
   */
  com.clarifai.grpc.api.ComputeInfoOrBuilder getInferenceComputeInfoOrBuilder();

  /**
   * <pre>
   * Build information for the model version
   * </pre>
   *
   * <code>.clarifai.api.BuildInfo build_info = 25;</code>
   * @return Whether the buildInfo field is set.
   */
  boolean hasBuildInfo();
  /**
   * <pre>
   * Build information for the model version
   * </pre>
   *
   * <code>.clarifai.api.BuildInfo build_info = 25;</code>
   * @return The buildInfo.
   */
  com.clarifai.grpc.api.BuildInfo getBuildInfo();
  /**
   * <pre>
   * Build information for the model version
   * </pre>
   *
   * <code>.clarifai.api.BuildInfo build_info = 25;</code>
   */
  com.clarifai.grpc.api.BuildInfoOrBuilder getBuildInfoOrBuilder();
}
