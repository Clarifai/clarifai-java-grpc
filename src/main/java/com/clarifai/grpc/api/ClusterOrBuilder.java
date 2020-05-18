// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface ClusterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.Cluster)
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
   * <pre>
   * Number of annotations tied to the cluster in the app
   * </pre>
   *
   * <code>uint32 count = 2;</code>
   * @return The count.
   */
  int getCount();

  /**
   * <pre>
   * The score assigned to this cluster
   * </pre>
   *
   * <code>float score = 3;</code>
   * @return The score.
   */
  float getScore();

  /**
   * <pre>
   * Representative hits for cluster (for now we only return 1)
   * </pre>
   *
   * <code>repeated .clarifai.api.Hit hits = 4;</code>
   */
  java.util.List<com.clarifai.grpc.api.Hit> 
      getHitsList();
  /**
   * <pre>
   * Representative hits for cluster (for now we only return 1)
   * </pre>
   *
   * <code>repeated .clarifai.api.Hit hits = 4;</code>
   */
  com.clarifai.grpc.api.Hit getHits(int index);
  /**
   * <pre>
   * Representative hits for cluster (for now we only return 1)
   * </pre>
   *
   * <code>repeated .clarifai.api.Hit hits = 4;</code>
   */
  int getHitsCount();
  /**
   * <pre>
   * Representative hits for cluster (for now we only return 1)
   * </pre>
   *
   * <code>repeated .clarifai.api.Hit hits = 4;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.HitOrBuilder> 
      getHitsOrBuilderList();
  /**
   * <pre>
   * Representative hits for cluster (for now we only return 1)
   * </pre>
   *
   * <code>repeated .clarifai.api.Hit hits = 4;</code>
   */
  com.clarifai.grpc.api.HitOrBuilder getHitsOrBuilder(
      int index);
}
