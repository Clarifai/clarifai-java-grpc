// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface PostDeploymentsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.PostDeploymentsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Only the user_id is used from this.
   * </pre>
   *
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   * @return Whether the userAppId field is set.
   */
  boolean hasUserAppId();
  /**
   * <pre>
   * Only the user_id is used from this.
   * </pre>
   *
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   * @return The userAppId.
   */
  com.clarifai.grpc.api.UserAppIDSet getUserAppId();
  /**
   * <pre>
   * Only the user_id is used from this.
   * </pre>
   *
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   */
  com.clarifai.grpc.api.UserAppIDSetOrBuilder getUserAppIdOrBuilder();

  /**
   * <pre>
   * This allows you to create one or more deployments by posting it to the API.
   * </pre>
   *
   * <code>repeated .clarifai.api.Deployment deployments = 2;</code>
   */
  java.util.List<com.clarifai.grpc.api.Deployment> 
      getDeploymentsList();
  /**
   * <pre>
   * This allows you to create one or more deployments by posting it to the API.
   * </pre>
   *
   * <code>repeated .clarifai.api.Deployment deployments = 2;</code>
   */
  com.clarifai.grpc.api.Deployment getDeployments(int index);
  /**
   * <pre>
   * This allows you to create one or more deployments by posting it to the API.
   * </pre>
   *
   * <code>repeated .clarifai.api.Deployment deployments = 2;</code>
   */
  int getDeploymentsCount();
  /**
   * <pre>
   * This allows you to create one or more deployments by posting it to the API.
   * </pre>
   *
   * <code>repeated .clarifai.api.Deployment deployments = 2;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.DeploymentOrBuilder> 
      getDeploymentsOrBuilderList();
  /**
   * <pre>
   * This allows you to create one or more deployments by posting it to the API.
   * </pre>
   *
   * <code>repeated .clarifai.api.Deployment deployments = 2;</code>
   */
  com.clarifai.grpc.api.DeploymentOrBuilder getDeploymentsOrBuilder(
      int index);
}
