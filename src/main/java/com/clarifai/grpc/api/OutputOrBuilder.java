// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface OutputOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.Output)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * One of these outputs per Input
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * One of these outputs per Input
   * </pre>
   *
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
   * The model that created this Output.
   * </pre>
   *
   * <code>.clarifai.api.Model model = 4;</code>
   * @return Whether the model field is set.
   */
  boolean hasModel();
  /**
   * <pre>
   * The model that created this Output.
   * </pre>
   *
   * <code>.clarifai.api.Model model = 4;</code>
   * @return The model.
   */
  com.clarifai.grpc.api.Model getModel();
  /**
   * <pre>
   * The model that created this Output.
   * </pre>
   *
   * <code>.clarifai.api.Model model = 4;</code>
   */
  com.clarifai.grpc.api.ModelOrBuilder getModelOrBuilder();

  /**
   * <pre>
   * The operator that created this Output.
   * </pre>
   *
   * <code>.clarifai.api.Operator operator = 7;</code>
   * @return Whether the operator field is set.
   */
  boolean hasOperator();
  /**
   * <pre>
   * The operator that created this Output.
   * </pre>
   *
   * <code>.clarifai.api.Operator operator = 7;</code>
   * @return The operator.
   */
  com.clarifai.grpc.api.Operator getOperator();
  /**
   * <pre>
   * The operator that created this Output.
   * </pre>
   *
   * <code>.clarifai.api.Operator operator = 7;</code>
   */
  com.clarifai.grpc.api.OperatorOrBuilder getOperatorOrBuilder();

  /**
   * <pre>
   * The input that was passed to the model to create this Output. For example if we have an image
   * model then it will take as input here an Input object with Image filled in.
   * </pre>
   *
   * <code>.clarifai.api.Input input = 5;</code>
   * @return Whether the input field is set.
   */
  boolean hasInput();
  /**
   * <pre>
   * The input that was passed to the model to create this Output. For example if we have an image
   * model then it will take as input here an Input object with Image filled in.
   * </pre>
   *
   * <code>.clarifai.api.Input input = 5;</code>
   * @return The input.
   */
  com.clarifai.grpc.api.Input getInput();
  /**
   * <pre>
   * The input that was passed to the model to create this Output. For example if we have an image
   * model then it will take as input here an Input object with Image filled in.
   * </pre>
   *
   * <code>.clarifai.api.Input input = 5;</code>
   */
  com.clarifai.grpc.api.InputOrBuilder getInputOrBuilder();

  /**
   * <pre>
   * The output data for this Output. For example if we have a concept model then the predicted
   * concepts will appear here.
   * </pre>
   *
   * <code>.clarifai.api.Data data = 6;</code>
   * @return Whether the data field is set.
   */
  boolean hasData();
  /**
   * <pre>
   * The output data for this Output. For example if we have a concept model then the predicted
   * concepts will appear here.
   * </pre>
   *
   * <code>.clarifai.api.Data data = 6;</code>
   * @return The data.
   */
  com.clarifai.grpc.api.Data getData();
  /**
   * <pre>
   * The output data for this Output. For example if we have a concept model then the predicted
   * concepts will appear here.
   * </pre>
   *
   * <code>.clarifai.api.Data data = 6;</code>
   */
  com.clarifai.grpc.api.DataOrBuilder getDataOrBuilder();
}
