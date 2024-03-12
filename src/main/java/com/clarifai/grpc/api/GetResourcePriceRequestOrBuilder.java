// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface GetResourcePriceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.GetResourcePriceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   * @return Whether the userAppId field is set.
   */
  boolean hasUserAppId();
  /**
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   * @return The userAppId.
   */
  com.clarifai.grpc.api.UserAppIDSet getUserAppId();
  /**
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   */
  com.clarifai.grpc.api.UserAppIDSetOrBuilder getUserAppIdOrBuilder();

  /**
   * <pre>
   * ########## Supported fields ##########
   * - id
   * - model_version.id
   * </pre>
   *
   * <code>.clarifai.api.Model model = 2;</code>
   * @return Whether the model field is set.
   */
  boolean hasModel();
  /**
   * <pre>
   * ########## Supported fields ##########
   * - id
   * - model_version.id
   * </pre>
   *
   * <code>.clarifai.api.Model model = 2;</code>
   * @return The model.
   */
  com.clarifai.grpc.api.Model getModel();
  /**
   * <pre>
   * ########## Supported fields ##########
   * - id
   * - model_version.id
   * </pre>
   *
   * <code>.clarifai.api.Model model = 2;</code>
   */
  com.clarifai.grpc.api.ModelOrBuilder getModelOrBuilder();

  /**
   * <pre>
   * ########## Supported fields ##########
   * - id
   * - version.id
   * </pre>
   *
   * <code>.clarifai.api.Workflow workflow = 3;</code>
   * @return Whether the workflow field is set.
   */
  boolean hasWorkflow();
  /**
   * <pre>
   * ########## Supported fields ##########
   * - id
   * - version.id
   * </pre>
   *
   * <code>.clarifai.api.Workflow workflow = 3;</code>
   * @return The workflow.
   */
  com.clarifai.grpc.api.Workflow getWorkflow();
  /**
   * <pre>
   * ########## Supported fields ##########
   * - id
   * - version.id
   * </pre>
   *
   * <code>.clarifai.api.Workflow workflow = 3;</code>
   */
  com.clarifai.grpc.api.WorkflowOrBuilder getWorkflowOrBuilder();

  public com.clarifai.grpc.api.GetResourcePriceRequest.ResourceCase getResourceCase();
}