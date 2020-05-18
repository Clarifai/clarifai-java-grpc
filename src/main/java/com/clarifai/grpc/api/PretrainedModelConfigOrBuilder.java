// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface PretrainedModelConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.PretrainedModelConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * This is the internal id of the pretrained model.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * This is the internal id of the pretrained model.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * This is the internal type of the pretrained model.
   * </pre>
   *
   * <code>string type = 2;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <pre>
   * This is the internal type of the pretrained model.
   * </pre>
   *
   * <code>string type = 2;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * Map from the api.Data field names to the Triton config.pbtxt input.
   * </pre>
   *
   * <code>.google.protobuf.Struct input_fields_map = 3;</code>
   * @return Whether the inputFieldsMap field is set.
   */
  boolean hasInputFieldsMap();
  /**
   * <pre>
   * Map from the api.Data field names to the Triton config.pbtxt input.
   * </pre>
   *
   * <code>.google.protobuf.Struct input_fields_map = 3;</code>
   * @return The inputFieldsMap.
   */
  com.google.protobuf.Struct getInputFieldsMap();
  /**
   * <pre>
   * Map from the api.Data field names to the Triton config.pbtxt input.
   * </pre>
   *
   * <code>.google.protobuf.Struct input_fields_map = 3;</code>
   */
  com.google.protobuf.StructOrBuilder getInputFieldsMapOrBuilder();

  /**
   * <pre>
   * Map from the api.Data field names to the Triton config.pbtxt output.
   * </pre>
   *
   * <code>.google.protobuf.Struct output_fields_map = 4;</code>
   * @return Whether the outputFieldsMap field is set.
   */
  boolean hasOutputFieldsMap();
  /**
   * <pre>
   * Map from the api.Data field names to the Triton config.pbtxt output.
   * </pre>
   *
   * <code>.google.protobuf.Struct output_fields_map = 4;</code>
   * @return The outputFieldsMap.
   */
  com.google.protobuf.Struct getOutputFieldsMap();
  /**
   * <pre>
   * Map from the api.Data field names to the Triton config.pbtxt output.
   * </pre>
   *
   * <code>.google.protobuf.Struct output_fields_map = 4;</code>
   */
  com.google.protobuf.StructOrBuilder getOutputFieldsMapOrBuilder();

  /**
   * <pre>
   * Preprocessing steps for the model as a json string
   * </pre>
   *
   * <code>string data_provider_params = 5;</code>
   * @return The dataProviderParams.
   */
  java.lang.String getDataProviderParams();
  /**
   * <pre>
   * Preprocessing steps for the model as a json string
   * </pre>
   *
   * <code>string data_provider_params = 5;</code>
   * @return The bytes for dataProviderParams.
   */
  com.google.protobuf.ByteString
      getDataProviderParamsBytes();

  /**
   * <pre>
   * Url to a zipped up model in triton format with only version 1
   * </pre>
   *
   * <code>string model_zip_url = 6;</code>
   * @return The modelZipUrl.
   */
  java.lang.String getModelZipUrl();
  /**
   * <pre>
   * Url to a zipped up model in triton format with only version 1
   * </pre>
   *
   * <code>string model_zip_url = 6;</code>
   * @return The bytes for modelZipUrl.
   */
  com.google.protobuf.ByteString
      getModelZipUrlBytes();
}
