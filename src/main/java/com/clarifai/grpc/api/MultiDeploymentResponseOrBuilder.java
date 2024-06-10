// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface MultiDeploymentResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.MultiDeploymentResponse)
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
   * <code>repeated .clarifai.api.Deployment deployments = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  java.util.List<com.clarifai.grpc.api.Deployment> 
      getDeploymentsList();
  /**
   * <code>repeated .clarifai.api.Deployment deployments = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  com.clarifai.grpc.api.Deployment getDeployments(int index);
  /**
   * <code>repeated .clarifai.api.Deployment deployments = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  int getDeploymentsCount();
  /**
   * <code>repeated .clarifai.api.Deployment deployments = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.DeploymentOrBuilder> 
      getDeploymentsOrBuilderList();
  /**
   * <code>repeated .clarifai.api.Deployment deployments = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  com.clarifai.grpc.api.DeploymentOrBuilder getDeploymentsOrBuilder(
      int index);
}
