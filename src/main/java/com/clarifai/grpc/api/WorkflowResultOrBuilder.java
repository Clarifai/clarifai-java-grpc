// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface WorkflowResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.WorkflowResult)
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
   * <code>.clarifai.api.status.Status status = 2;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>.clarifai.api.status.Status status = 2;</code>
   * @return The status.
   */
  com.clarifai.grpc.api.status.Status getStatus();
  /**
   * <code>.clarifai.api.status.Status status = 2;</code>
   */
  com.clarifai.grpc.api.status.StatusOrBuilder getStatusOrBuilder();

  /**
   * <pre>
   * When the object was created. We follow the XXXX timestamp
   * format. We use https://www.ietf.org/rfc/rfc3339.txt format:
   * "2006-01-02T15:04:05.999999Z" so you can expect results like
   * the following from the API:
   * "2017-04-11T21:50:50.223962Z"
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 3;</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <pre>
   * When the object was created. We follow the XXXX timestamp
   * format. We use https://www.ietf.org/rfc/rfc3339.txt format:
   * "2006-01-02T15:04:05.999999Z" so you can expect results like
   * the following from the API:
   * "2017-04-11T21:50:50.223962Z"
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 3;</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <pre>
   * When the object was created. We follow the XXXX timestamp
   * format. We use https://www.ietf.org/rfc/rfc3339.txt format:
   * "2006-01-02T15:04:05.999999Z" so you can expect results like
   * the following from the API:
   * "2017-04-11T21:50:50.223962Z"
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <pre>
   * The model that this WorkflowResult is for.
   * DEPRECATED: not sure why there ever was a model here because each output shows the model
   * that process this given input.
   * </pre>
   *
   * <code>.clarifai.api.Model model = 4 [deprecated = true];</code>
   * @deprecated clarifai.api.WorkflowResult.model is deprecated.
   *     See proto/clarifai/api/resources.proto;l=2863
   * @return Whether the model field is set.
   */
  @java.lang.Deprecated boolean hasModel();
  /**
   * <pre>
   * The model that this WorkflowResult is for.
   * DEPRECATED: not sure why there ever was a model here because each output shows the model
   * that process this given input.
   * </pre>
   *
   * <code>.clarifai.api.Model model = 4 [deprecated = true];</code>
   * @deprecated clarifai.api.WorkflowResult.model is deprecated.
   *     See proto/clarifai/api/resources.proto;l=2863
   * @return The model.
   */
  @java.lang.Deprecated com.clarifai.grpc.api.Model getModel();
  /**
   * <pre>
   * The model that this WorkflowResult is for.
   * DEPRECATED: not sure why there ever was a model here because each output shows the model
   * that process this given input.
   * </pre>
   *
   * <code>.clarifai.api.Model model = 4 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.clarifai.grpc.api.ModelOrBuilder getModelOrBuilder();

  /**
   * <pre>
   * The input that ran through the workflow to generate the outputs in this WorkflowResult.
   * </pre>
   *
   * <code>.clarifai.api.Input input = 5;</code>
   * @return Whether the input field is set.
   */
  boolean hasInput();
  /**
   * <pre>
   * The input that ran through the workflow to generate the outputs in this WorkflowResult.
   * </pre>
   *
   * <code>.clarifai.api.Input input = 5;</code>
   * @return The input.
   */
  com.clarifai.grpc.api.Input getInput();
  /**
   * <pre>
   * The input that ran through the workflow to generate the outputs in this WorkflowResult.
   * </pre>
   *
   * <code>.clarifai.api.Input input = 5;</code>
   */
  com.clarifai.grpc.api.InputOrBuilder getInputOrBuilder();

  /**
   * <pre>
   * For each model in the workflow we return an Output.
   * </pre>
   *
   * <code>repeated .clarifai.api.Output outputs = 6;</code>
   */
  java.util.List<com.clarifai.grpc.api.Output> 
      getOutputsList();
  /**
   * <pre>
   * For each model in the workflow we return an Output.
   * </pre>
   *
   * <code>repeated .clarifai.api.Output outputs = 6;</code>
   */
  com.clarifai.grpc.api.Output getOutputs(int index);
  /**
   * <pre>
   * For each model in the workflow we return an Output.
   * </pre>
   *
   * <code>repeated .clarifai.api.Output outputs = 6;</code>
   */
  int getOutputsCount();
  /**
   * <pre>
   * For each model in the workflow we return an Output.
   * </pre>
   *
   * <code>repeated .clarifai.api.Output outputs = 6;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.OutputOrBuilder> 
      getOutputsOrBuilderList();
  /**
   * <pre>
   * For each model in the workflow we return an Output.
   * </pre>
   *
   * <code>repeated .clarifai.api.Output outputs = 6;</code>
   */
  com.clarifai.grpc.api.OutputOrBuilder getOutputsOrBuilder(
      int index);

  /**
   * <pre>
   * Indicate if the output of this model is suppressed.
   * </pre>
   *
   * <code>bool suppress_output = 7;</code>
   * @return The suppressOutput.
   */
  boolean getSuppressOutput();
}
