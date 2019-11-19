// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface AppOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.App)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string default_language = 3;</code>
   */
  java.lang.String getDefaultLanguage();
  /**
   * <code>string default_language = 3;</code>
   */
  com.google.protobuf.ByteString
      getDefaultLanguageBytes();

  /**
   * <code>string default_workflow_id = 4;</code>
   */
  java.lang.String getDefaultWorkflowId();
  /**
   * <code>string default_workflow_id = 4;</code>
   */
  com.google.protobuf.ByteString
      getDefaultWorkflowIdBytes();

  /**
   * <code>string user_id = 5;</code>
   */
  java.lang.String getUserId();
  /**
   * <code>string user_id = 5;</code>
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * When the app was created. We follow the XXXX timestamp
   * format. We use https://www.ietf.org/rfc/rfc3339.txt format:
   * "2006-01-02T15:04:05.999999Z" so you can expect results like
   * the following from the API:
   * "2017-04-11T21:50:50.223962Z"
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 6;</code>
   */
  boolean hasCreatedAt();
  /**
   * <pre>
   * When the app was created. We follow the XXXX timestamp
   * format. We use https://www.ietf.org/rfc/rfc3339.txt format:
   * "2006-01-02T15:04:05.999999Z" so you can expect results like
   * the following from the API:
   * "2017-04-11T21:50:50.223962Z"
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 6;</code>
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <pre>
   * When the app was created. We follow the XXXX timestamp
   * format. We use https://www.ietf.org/rfc/rfc3339.txt format:
   * "2006-01-02T15:04:05.999999Z" so you can expect results like
   * the following from the API:
   * "2017-04-11T21:50:50.223962Z"
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <pre>
   * if user accept legal consent for face recognition
   * </pre>
   *
   * <code>uint32 legal_consent_status = 7;</code>
   */
  int getLegalConsentStatus();

  /**
   * <pre>
   * Other fields controlled by url params.
   * </pre>
   *
   * <code>.clarifai.api.Input last_input_added = 10;</code>
   */
  boolean hasLastInputAdded();
  /**
   * <pre>
   * Other fields controlled by url params.
   * </pre>
   *
   * <code>.clarifai.api.Input last_input_added = 10;</code>
   */
  com.clarifai.grpc.api.Input getLastInputAdded();
  /**
   * <pre>
   * Other fields controlled by url params.
   * </pre>
   *
   * <code>.clarifai.api.Input last_input_added = 10;</code>
   */
  com.clarifai.grpc.api.InputOrBuilder getLastInputAddedOrBuilder();

  /**
   * <code>.clarifai.api.InputCount input_count = 11;</code>
   */
  boolean hasInputCount();
  /**
   * <code>.clarifai.api.InputCount input_count = 11;</code>
   */
  com.clarifai.grpc.api.InputCount getInputCount();
  /**
   * <code>.clarifai.api.InputCount input_count = 11;</code>
   */
  com.clarifai.grpc.api.InputCountOrBuilder getInputCountOrBuilder();

  /**
   * <code>uint32 active_concept_count = 12 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  int getActiveConceptCount();

  /**
   * <pre>
   * To handle arbitrary json metadata you can use a struct field:
   * https://github.com/google/protobuf/blob/master/src/google/protobuf/struct.proto
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 13;</code>
   */
  boolean hasMetadata();
  /**
   * <pre>
   * To handle arbitrary json metadata you can use a struct field:
   * https://github.com/google/protobuf/blob/master/src/google/protobuf/struct.proto
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 13;</code>
   */
  com.google.protobuf.Struct getMetadata();
  /**
   * <pre>
   * To handle arbitrary json metadata you can use a struct field:
   * https://github.com/google/protobuf/blob/master/src/google/protobuf/struct.proto
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 13;</code>
   */
  com.google.protobuf.StructOrBuilder getMetadataOrBuilder();

  /**
   * <pre>
   * Deprecated fields soon to be removed.
   * </pre>
   *
   * <code>uint32 v1_id = 100 [deprecated = true];</code>
   */
  @java.lang.Deprecated int getV1Id();

  /**
   * <code>string client_id = 101 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.lang.String getClientId();
  /**
   * <code>string client_id = 101 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getClientIdBytes();

  /**
   * <code>string client_secret = 102 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.lang.String getClientSecret();
  /**
   * <code>string client_secret = 102 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getClientSecretBytes();
}
