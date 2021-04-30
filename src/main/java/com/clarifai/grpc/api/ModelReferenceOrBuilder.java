// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface ModelReferenceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.ModelReference)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Id of the reference
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Id of the reference
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * The id of the model this Model reference is tied to.
   * </pre>
   *
   * <code>string model_id = 2;</code>
   * @return The modelId.
   */
  java.lang.String getModelId();
  /**
   * <pre>
   * The id of the model this Model reference is tied to.
   * </pre>
   *
   * <code>string model_id = 2;</code>
   * @return The bytes for modelId.
   */
  com.google.protobuf.ByteString
      getModelIdBytes();

  /**
   * <pre>
   * address of resource
   * </pre>
   *
   * <code>string url = 3;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * address of resource
   * </pre>
   *
   * <code>string url = 3;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <pre>
   * name of link
   * </pre>
   *
   * <code>string name = 4;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * name of link
   * </pre>
   *
   * <code>string name = 4;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * To handle arbitrary json metadata:
   * https://github.com/google/protobuf/blob/master/src/google/protobuf/struct.proto
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 5;</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <pre>
   * To handle arbitrary json metadata:
   * https://github.com/google/protobuf/blob/master/src/google/protobuf/struct.proto
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 5;</code>
   * @return The metadata.
   */
  com.google.protobuf.Struct getMetadata();
  /**
   * <pre>
   * To handle arbitrary json metadata:
   * https://github.com/google/protobuf/blob/master/src/google/protobuf/struct.proto
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 5;</code>
   */
  com.google.protobuf.StructOrBuilder getMetadataOrBuilder();
}
