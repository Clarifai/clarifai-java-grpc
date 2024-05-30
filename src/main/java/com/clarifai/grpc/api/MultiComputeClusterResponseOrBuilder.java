// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface MultiComputeClusterResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.MultiComputeClusterResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.clarifai.api.status.Status status = 1;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>.clarifai.api.status.Status status = 1;</code>
   * @return The status.
   */
  com.clarifai.grpc.api.status.Status getStatus();
  /**
   * <code>.clarifai.api.status.Status status = 1;</code>
   */
  com.clarifai.grpc.api.status.StatusOrBuilder getStatusOrBuilder();

  /**
   * <code>repeated .clarifai.api.ComputeCluster compute_clusters = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  java.util.List<com.clarifai.grpc.api.ComputeCluster> 
      getComputeClustersList();
  /**
   * <code>repeated .clarifai.api.ComputeCluster compute_clusters = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  com.clarifai.grpc.api.ComputeCluster getComputeClusters(int index);
  /**
   * <code>repeated .clarifai.api.ComputeCluster compute_clusters = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  int getComputeClustersCount();
  /**
   * <code>repeated .clarifai.api.ComputeCluster compute_clusters = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.ComputeClusterOrBuilder> 
      getComputeClustersOrBuilderList();
  /**
   * <code>repeated .clarifai.api.ComputeCluster compute_clusters = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  com.clarifai.grpc.api.ComputeClusterOrBuilder getComputeClustersOrBuilder(
      int index);
}
