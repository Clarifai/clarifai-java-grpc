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
   * <pre>
   * The track information.
   * </pre>
   *
   * <code>.clarifai.api.Track.TrackInfo track_info = 3;</code>
   * @return Whether the trackInfo field is set.
   */
  boolean hasTrackInfo();
  /**
   * <pre>
   * The track information.
   * </pre>
   *
   * <code>.clarifai.api.Track.TrackInfo track_info = 3;</code>
   * @return The trackInfo.
   */
  com.clarifai.grpc.api.Track.TrackInfo getTrackInfo();
  /**
   * <pre>
   * The track information.
   * </pre>
   *
   * <code>.clarifai.api.Track.TrackInfo track_info = 3;</code>
   */
  com.clarifai.grpc.api.Track.TrackInfoOrBuilder getTrackInfoOrBuilder();
}