// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface PartOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.Part)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The data for this part.
   * </pre>
   *
   * <code>.clarifai.api.Data data = 1;</code>
   * @return Whether the data field is set.
   */
  boolean hasData();
  /**
   * <pre>
   * The data for this part.
   * </pre>
   *
   * <code>.clarifai.api.Data data = 1;</code>
   * @return The data.
   */
  com.clarifai.grpc.api.Data getData();
  /**
   * <pre>
   * The data for this part.
   * </pre>
   *
   * <code>.clarifai.api.Data data = 1;</code>
   */
  com.clarifai.grpc.api.DataOrBuilder getDataOrBuilder();

  /**
   * <pre>
   * A unique id for the part.
   * </pre>
   *
   * <code>string id = 2;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * A unique id for the part.
   * </pre>
   *
   * <code>string id = 2;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();
}
