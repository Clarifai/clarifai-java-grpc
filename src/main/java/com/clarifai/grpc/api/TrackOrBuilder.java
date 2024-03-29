// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface TrackOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.Track)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * track id
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * track id
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * This is a recursive definition which can contain all the concepts,
   * embeddings, etc. that are computed within this track.
   * </pre>
   *
   * <code>.clarifai.api.Data data = 2;</code>
   * @return Whether the data field is set.
   */
  boolean hasData();
  /**
   * <pre>
   * This is a recursive definition which can contain all the concepts,
   * embeddings, etc. that are computed within this track.
   * </pre>
   *
   * <code>.clarifai.api.Data data = 2;</code>
   * @return The data.
   */
  com.clarifai.grpc.api.Data getData();
  /**
   * <pre>
   * This is a recursive definition which can contain all the concepts,
   * embeddings, etc. that are computed within this track.
   * </pre>
   *
   * <code>.clarifai.api.Data data = 2;</code>
   */
  com.clarifai.grpc.api.DataOrBuilder getDataOrBuilder();

  /**
   * <code>.clarifai.api.TimeInfo time_info = 4;</code>
   * @return Whether the timeInfo field is set.
   */
  boolean hasTimeInfo();
  /**
   * <code>.clarifai.api.TimeInfo time_info = 4;</code>
   * @return The timeInfo.
   */
  com.clarifai.grpc.api.TimeInfo getTimeInfo();
  /**
   * <code>.clarifai.api.TimeInfo time_info = 4;</code>
   */
  com.clarifai.grpc.api.TimeInfoOrBuilder getTimeInfoOrBuilder();

  /**
   * <code>float quality = 5;</code>
   * @return The quality.
   */
  float getQuality();
}
