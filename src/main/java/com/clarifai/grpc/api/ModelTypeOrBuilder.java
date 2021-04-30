// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface ModelTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.ModelType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A unique identifies for this model type. This is differnt than the 'type' field below because
   * the 'type' can be re-used for differnet input and output combinations whereas 'id' is always
   * unique.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * A unique identifies for this model type. This is differnt than the 'type' field below because
   * the 'type' can be re-used for differnet input and output combinations whereas 'id' is always
   * unique.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * title for this model in model gallery
   * </pre>
   *
   * <code>string title = 2;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * title for this model in model gallery
   * </pre>
   *
   * <code>string title = 2;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * Description of this model type.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Description of this model type.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * The type of the model to create. This is currently stored in output_info.type.
   * </pre>
   *
   * <code>string type = 4;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <pre>
   * The type of the model to create. This is currently stored in output_info.type.
   * </pre>
   *
   * <code>string type = 4;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * The list of input fields that this model accepts. These are the keys of the Model's
   * InputInfo.fields_map
   * </pre>
   *
   * <code>repeated string input_fields = 5;</code>
   * @return A list containing the inputFields.
   */
  java.util.List<java.lang.String>
      getInputFieldsList();
  /**
   * <pre>
   * The list of input fields that this model accepts. These are the keys of the Model's
   * InputInfo.fields_map
   * </pre>
   *
   * <code>repeated string input_fields = 5;</code>
   * @return The count of inputFields.
   */
  int getInputFieldsCount();
  /**
   * <pre>
   * The list of input fields that this model accepts. These are the keys of the Model's
   * InputInfo.fields_map
   * </pre>
   *
   * <code>repeated string input_fields = 5;</code>
   * @param index The index of the element to return.
   * @return The inputFields at the given index.
   */
  java.lang.String getInputFields(int index);
  /**
   * <pre>
   * The list of input fields that this model accepts. These are the keys of the Model's
   * InputInfo.fields_map
   * </pre>
   *
   * <code>repeated string input_fields = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the inputFields at the given index.
   */
  com.google.protobuf.ByteString
      getInputFieldsBytes(int index);

  /**
   * <pre>
   * The list of output fields that this model accepts. These are the keys of the Model's
   * OutputInfo.fields_map
   * </pre>
   *
   * <code>repeated string output_fields = 6;</code>
   * @return A list containing the outputFields.
   */
  java.util.List<java.lang.String>
      getOutputFieldsList();
  /**
   * <pre>
   * The list of output fields that this model accepts. These are the keys of the Model's
   * OutputInfo.fields_map
   * </pre>
   *
   * <code>repeated string output_fields = 6;</code>
   * @return The count of outputFields.
   */
  int getOutputFieldsCount();
  /**
   * <pre>
   * The list of output fields that this model accepts. These are the keys of the Model's
   * OutputInfo.fields_map
   * </pre>
   *
   * <code>repeated string output_fields = 6;</code>
   * @param index The index of the element to return.
   * @return The outputFields at the given index.
   */
  java.lang.String getOutputFields(int index);
  /**
   * <pre>
   * The list of output fields that this model accepts. These are the keys of the Model's
   * OutputInfo.fields_map
   * </pre>
   *
   * <code>repeated string output_fields = 6;</code>
   * @param index The index of the value to return.
   * @return The bytes of the outputFields at the given index.
   */
  com.google.protobuf.ByteString
      getOutputFieldsBytes(int index);

  /**
   * <pre>
   * Is this model trainable in our platform.
   * </pre>
   *
   * <code>bool trainable = 8;</code>
   * @return The trainable.
   */
  boolean getTrainable();

  /**
   * <pre>
   * Is this model creatable. We have some pre-trained model types that users cannot create yet in
   * model mode.
   * </pre>
   *
   * <code>bool creatable = 9;</code>
   * @return The creatable.
   */
  boolean getCreatable();

  /**
   * <pre>
   * Is this model type only for internal users at this time.
   * </pre>
   *
   * <code>bool internal_only = 10;</code>
   * @return The internalOnly.
   */
  boolean getInternalOnly();

  /**
   * <pre>
   * The remaining fields are definitions of the configurable fields that exist.
   * Each field has path into the Model object such as "name" as a top level or "output_info.data"
   * if it's the Data object within the OutputInfo object. We decided to not break these up
   * into input_info, train_info and output_info related parameters and instead use the path
   * so that they are most flexible.
   * </pre>
   *
   * <code>repeated .clarifai.api.ModelTypeField model_type_fields = 11;</code>
   */
  java.util.List<com.clarifai.grpc.api.ModelTypeField> 
      getModelTypeFieldsList();
  /**
   * <pre>
   * The remaining fields are definitions of the configurable fields that exist.
   * Each field has path into the Model object such as "name" as a top level or "output_info.data"
   * if it's the Data object within the OutputInfo object. We decided to not break these up
   * into input_info, train_info and output_info related parameters and instead use the path
   * so that they are most flexible.
   * </pre>
   *
   * <code>repeated .clarifai.api.ModelTypeField model_type_fields = 11;</code>
   */
  com.clarifai.grpc.api.ModelTypeField getModelTypeFields(int index);
  /**
   * <pre>
   * The remaining fields are definitions of the configurable fields that exist.
   * Each field has path into the Model object such as "name" as a top level or "output_info.data"
   * if it's the Data object within the OutputInfo object. We decided to not break these up
   * into input_info, train_info and output_info related parameters and instead use the path
   * so that they are most flexible.
   * </pre>
   *
   * <code>repeated .clarifai.api.ModelTypeField model_type_fields = 11;</code>
   */
  int getModelTypeFieldsCount();
  /**
   * <pre>
   * The remaining fields are definitions of the configurable fields that exist.
   * Each field has path into the Model object such as "name" as a top level or "output_info.data"
   * if it's the Data object within the OutputInfo object. We decided to not break these up
   * into input_info, train_info and output_info related parameters and instead use the path
   * so that they are most flexible.
   * </pre>
   *
   * <code>repeated .clarifai.api.ModelTypeField model_type_fields = 11;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.ModelTypeFieldOrBuilder> 
      getModelTypeFieldsOrBuilderList();
  /**
   * <pre>
   * The remaining fields are definitions of the configurable fields that exist.
   * Each field has path into the Model object such as "name" as a top level or "output_info.data"
   * if it's the Data object within the OutputInfo object. We decided to not break these up
   * into input_info, train_info and output_info related parameters and instead use the path
   * so that they are most flexible.
   * </pre>
   *
   * <code>repeated .clarifai.api.ModelTypeField model_type_fields = 11;</code>
   */
  com.clarifai.grpc.api.ModelTypeFieldOrBuilder getModelTypeFieldsOrBuilder(
      int index);

  /**
   * <pre>
   * For sequence models we need to know when processing that they require temporal time frames
   * in sequential order. This will be true for model types like trackers as an example.
   * </pre>
   *
   * <code>bool requires_sequential_frames = 12;</code>
   * @return The requiresSequentialFrames.
   */
  boolean getRequiresSequentialFrames();

  /**
   * <pre>
   * Can this model be evaluated?
   * </pre>
   *
   * <code>bool evaluable = 13;</code>
   * @return The evaluable.
   */
  boolean getEvaluable();

  /**
   * <pre>
   * Maps input_fields to the more granular data fields needed to parse a triton models inputs
   * </pre>
   *
   * <code>.google.protobuf.Struct expected_pretrained_input_fields = 14;</code>
   * @return Whether the expectedPretrainedInputFields field is set.
   */
  boolean hasExpectedPretrainedInputFields();
  /**
   * <pre>
   * Maps input_fields to the more granular data fields needed to parse a triton models inputs
   * </pre>
   *
   * <code>.google.protobuf.Struct expected_pretrained_input_fields = 14;</code>
   * @return The expectedPretrainedInputFields.
   */
  com.google.protobuf.Struct getExpectedPretrainedInputFields();
  /**
   * <pre>
   * Maps input_fields to the more granular data fields needed to parse a triton models inputs
   * </pre>
   *
   * <code>.google.protobuf.Struct expected_pretrained_input_fields = 14;</code>
   */
  com.google.protobuf.StructOrBuilder getExpectedPretrainedInputFieldsOrBuilder();

  /**
   * <pre>
   * Maps output_fields to the more granular data fields needed to parse a triton models outputs
   * </pre>
   *
   * <code>.google.protobuf.Struct expected_pretrained_output_fields = 15;</code>
   * @return Whether the expectedPretrainedOutputFields field is set.
   */
  boolean hasExpectedPretrainedOutputFields();
  /**
   * <pre>
   * Maps output_fields to the more granular data fields needed to parse a triton models outputs
   * </pre>
   *
   * <code>.google.protobuf.Struct expected_pretrained_output_fields = 15;</code>
   * @return The expectedPretrainedOutputFields.
   */
  com.google.protobuf.Struct getExpectedPretrainedOutputFields();
  /**
   * <pre>
   * Maps output_fields to the more granular data fields needed to parse a triton models outputs
   * </pre>
   *
   * <code>.google.protobuf.Struct expected_pretrained_output_fields = 15;</code>
   */
  com.google.protobuf.StructOrBuilder getExpectedPretrainedOutputFieldsOrBuilder();
}
