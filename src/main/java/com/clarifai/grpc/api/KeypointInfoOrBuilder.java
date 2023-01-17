// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface KeypointInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.KeypointInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Names of the keypoints
   * </pre>
   *
   * <code>repeated string keypoint_names = 1;</code>
   * @return A list containing the keypointNames.
   */
  java.util.List<java.lang.String>
      getKeypointNamesList();
  /**
   * <pre>
   * Names of the keypoints
   * </pre>
   *
   * <code>repeated string keypoint_names = 1;</code>
   * @return The count of keypointNames.
   */
  int getKeypointNamesCount();
  /**
   * <pre>
   * Names of the keypoints
   * </pre>
   *
   * <code>repeated string keypoint_names = 1;</code>
   * @param index The index of the element to return.
   * @return The keypointNames at the given index.
   */
  java.lang.String getKeypointNames(int index);
  /**
   * <pre>
   * Names of the keypoints
   * </pre>
   *
   * <code>repeated string keypoint_names = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the keypointNames at the given index.
   */
  com.google.protobuf.ByteString
      getKeypointNamesBytes(int index);

  /**
   * <pre>
   * Defines the connections between keypoint_names. Each value represents the index in keypoint_names.
   * </pre>
   *
   * <code>repeated .clarifai.api.KeypointEdge skeleton = 2;</code>
   */
  java.util.List<com.clarifai.grpc.api.KeypointEdge> 
      getSkeletonList();
  /**
   * <pre>
   * Defines the connections between keypoint_names. Each value represents the index in keypoint_names.
   * </pre>
   *
   * <code>repeated .clarifai.api.KeypointEdge skeleton = 2;</code>
   */
  com.clarifai.grpc.api.KeypointEdge getSkeleton(int index);
  /**
   * <pre>
   * Defines the connections between keypoint_names. Each value represents the index in keypoint_names.
   * </pre>
   *
   * <code>repeated .clarifai.api.KeypointEdge skeleton = 2;</code>
   */
  int getSkeletonCount();
  /**
   * <pre>
   * Defines the connections between keypoint_names. Each value represents the index in keypoint_names.
   * </pre>
   *
   * <code>repeated .clarifai.api.KeypointEdge skeleton = 2;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.KeypointEdgeOrBuilder> 
      getSkeletonOrBuilderList();
  /**
   * <pre>
   * Defines the connections between keypoint_names. Each value represents the index in keypoint_names.
   * </pre>
   *
   * <code>repeated .clarifai.api.KeypointEdge skeleton = 2;</code>
   */
  com.clarifai.grpc.api.KeypointEdgeOrBuilder getSkeletonOrBuilder(
      int index);
}
