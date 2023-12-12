// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface PostModelsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.PostModelsRequest)
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
   * NOTE: inconsistent since "model" is not plural, please use "models" below.
   * Previously you could only create one model at a time.
   * We still support this but you should pass it as models=[model] so
   * that this endpoint is consistent with the rest of our API.
   * </pre>
   *
   * <code>.clarifai.api.Model model = 2 [deprecated = true];</code>
   * @deprecated clarifai.api.PostModelsRequest.model is deprecated.
   *     See proto/clarifai/api/service.proto;l=5102
   * @return Whether the model field is set.
   */
  @java.lang.Deprecated boolean hasModel();
  /**
   * <pre>
   * NOTE: inconsistent since "model" is not plural, please use "models" below.
   * Previously you could only create one model at a time.
   * We still support this but you should pass it as models=[model] so
   * that this endpoint is consistent with the rest of our API.
   * </pre>
   *
   * <code>.clarifai.api.Model model = 2 [deprecated = true];</code>
   * @deprecated clarifai.api.PostModelsRequest.model is deprecated.
   *     See proto/clarifai/api/service.proto;l=5102
   * @return The model.
   */
  @java.lang.Deprecated com.clarifai.grpc.api.Model getModel();
  /**
   * <pre>
   * NOTE: inconsistent since "model" is not plural, please use "models" below.
   * Previously you could only create one model at a time.
   * We still support this but you should pass it as models=[model] so
   * that this endpoint is consistent with the rest of our API.
   * </pre>
   *
   * <code>.clarifai.api.Model model = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.clarifai.grpc.api.ModelOrBuilder getModelOrBuilder();

  /**
   * <pre>
   * This allows you to create one or more model by posting it to the API.
   * </pre>
   *
   * <code>repeated .clarifai.api.Model models = 3;</code>
   */
  java.util.List<com.clarifai.grpc.api.Model> 
      getModelsList();
  /**
   * <pre>
   * This allows you to create one or more model by posting it to the API.
   * </pre>
   *
   * <code>repeated .clarifai.api.Model models = 3;</code>
   */
  com.clarifai.grpc.api.Model getModels(int index);
  /**
   * <pre>
   * This allows you to create one or more model by posting it to the API.
   * </pre>
   *
   * <code>repeated .clarifai.api.Model models = 3;</code>
   */
  int getModelsCount();
  /**
   * <pre>
   * This allows you to create one or more model by posting it to the API.
   * </pre>
   *
   * <code>repeated .clarifai.api.Model models = 3;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.ModelOrBuilder> 
      getModelsOrBuilderList();
  /**
   * <pre>
   * This allows you to create one or more model by posting it to the API.
   * </pre>
   *
   * <code>repeated .clarifai.api.Model models = 3;</code>
   */
  com.clarifai.grpc.api.ModelOrBuilder getModelsOrBuilder(
      int index);
}
