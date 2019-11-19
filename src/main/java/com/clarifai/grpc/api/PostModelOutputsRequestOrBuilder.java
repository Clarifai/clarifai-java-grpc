// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface PostModelOutputsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.PostModelOutputsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   */
  boolean hasUserAppId();
  /**
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   */
  com.clarifai.grpc.api.UserAppIDSet getUserAppId();
  /**
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   */
  com.clarifai.grpc.api.UserAppIDSetOrBuilder getUserAppIdOrBuilder();

  /**
   * <code>string model_id = 2;</code>
   */
  java.lang.String getModelId();
  /**
   * <code>string model_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getModelIdBytes();

  /**
   * <code>string version_id = 3;</code>
   */
  java.lang.String getVersionId();
  /**
   * <code>string version_id = 3;</code>
   */
  com.google.protobuf.ByteString
      getVersionIdBytes();

  /**
   * <code>repeated .clarifai.api.Input inputs = 4;</code>
   */
  java.util.List<com.clarifai.grpc.api.Input> 
      getInputsList();
  /**
   * <code>repeated .clarifai.api.Input inputs = 4;</code>
   */
  com.clarifai.grpc.api.Input getInputs(int index);
  /**
   * <code>repeated .clarifai.api.Input inputs = 4;</code>
   */
  int getInputsCount();
  /**
   * <code>repeated .clarifai.api.Input inputs = 4;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.InputOrBuilder> 
      getInputsOrBuilderList();
  /**
   * <code>repeated .clarifai.api.Input inputs = 4;</code>
   */
  com.clarifai.grpc.api.InputOrBuilder getInputsOrBuilder(
      int index);

  /**
   * <pre>
   * This allows you to specify config options for the model such as
   * the language which appear's in the model's output_info.
   * </pre>
   *
   * <code>.clarifai.api.Model model = 5;</code>
   */
  boolean hasModel();
  /**
   * <pre>
   * This allows you to specify config options for the model such as
   * the language which appear's in the model's output_info.
   * </pre>
   *
   * <code>.clarifai.api.Model model = 5;</code>
   */
  com.clarifai.grpc.api.Model getModel();
  /**
   * <pre>
   * This allows you to specify config options for the model such as
   * the language which appear's in the model's output_info.
   * </pre>
   *
   * <code>.clarifai.api.Model model = 5;</code>
   */
  com.clarifai.grpc.api.ModelOrBuilder getModelOrBuilder();
}
