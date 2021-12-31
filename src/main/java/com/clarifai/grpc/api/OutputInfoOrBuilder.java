// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface OutputInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.OutputInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of concepts or other output related data for the model.
   * </pre>
   *
   * <code>.clarifai.api.Data data = 1;</code>
   * @return Whether the data field is set.
   */
  boolean hasData();
  /**
   * <pre>
   * List of concepts or other output related data for the model.
   * </pre>
   *
   * <code>.clarifai.api.Data data = 1;</code>
   * @return The data.
   */
  com.clarifai.grpc.api.Data getData();
  /**
   * <pre>
   * List of concepts or other output related data for the model.
   * </pre>
   *
   * <code>.clarifai.api.Data data = 1;</code>
   */
  com.clarifai.grpc.api.DataOrBuilder getDataOrBuilder();

  /**
   * <pre>
   * Model configuration...going away in favor of infer_params and train_params over time.
   * TO BE DEPRECATED
   * </pre>
   *
   * <code>.clarifai.api.OutputConfig output_config = 2;</code>
   * @return Whether the outputConfig field is set.
   */
  boolean hasOutputConfig();
  /**
   * <pre>
   * Model configuration...going away in favor of infer_params and train_params over time.
   * TO BE DEPRECATED
   * </pre>
   *
   * <code>.clarifai.api.OutputConfig output_config = 2;</code>
   * @return The outputConfig.
   */
  com.clarifai.grpc.api.OutputConfig getOutputConfig();
  /**
   * <pre>
   * Model configuration...going away in favor of infer_params and train_params over time.
   * TO BE DEPRECATED
   * </pre>
   *
   * <code>.clarifai.api.OutputConfig output_config = 2;</code>
   */
  com.clarifai.grpc.api.OutputConfigOrBuilder getOutputConfigOrBuilder();

  /**
   * <pre>
   * For returning where to look for the Output info if not returning it.
   * </pre>
   *
   * <code>string message = 3;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * For returning where to look for the Output info if not returning it.
   * </pre>
   *
   * <code>string message = 3;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <pre>
   * Map from the api.Data field names to the underlying model graph's outputs. When using a
   * PretrainedModelConfig the values in this map need to match the Triton config.pbtxt output names.
   * </pre>
   *
   * <code>.google.protobuf.Struct fields_map = 6;</code>
   * @return Whether the fieldsMap field is set.
   */
  boolean hasFieldsMap();
  /**
   * <pre>
   * Map from the api.Data field names to the underlying model graph's outputs. When using a
   * PretrainedModelConfig the values in this map need to match the Triton config.pbtxt output names.
   * </pre>
   *
   * <code>.google.protobuf.Struct fields_map = 6;</code>
   * @return The fieldsMap.
   */
  com.google.protobuf.Struct getFieldsMap();
  /**
   * <pre>
   * Map from the api.Data field names to the underlying model graph's outputs. When using a
   * PretrainedModelConfig the values in this map need to match the Triton config.pbtxt output names.
   * </pre>
   *
   * <code>.google.protobuf.Struct fields_map = 6;</code>
   */
  com.google.protobuf.StructOrBuilder getFieldsMapOrBuilder();

  /**
   * <pre>
   * For predicting with the various ModelType's we accept a Struct (JSON object) worth of args
   * that the ModelTypeField defines. During inference, the settings contained within are sent
   * to the model predictor to alter predictions from this Model.
   * </pre>
   *
   * <code>.google.protobuf.Struct params = 7;</code>
   * @return Whether the params field is set.
   */
  boolean hasParams();
  /**
   * <pre>
   * For predicting with the various ModelType's we accept a Struct (JSON object) worth of args
   * that the ModelTypeField defines. During inference, the settings contained within are sent
   * to the model predictor to alter predictions from this Model.
   * </pre>
   *
   * <code>.google.protobuf.Struct params = 7;</code>
   * @return The params.
   */
  com.google.protobuf.Struct getParams();
  /**
   * <pre>
   * For predicting with the various ModelType's we accept a Struct (JSON object) worth of args
   * that the ModelTypeField defines. During inference, the settings contained within are sent
   * to the model predictor to alter predictions from this Model.
   * </pre>
   *
   * <code>.google.protobuf.Struct params = 7;</code>
   */
  com.google.protobuf.StructOrBuilder getParamsOrBuilder();
}
