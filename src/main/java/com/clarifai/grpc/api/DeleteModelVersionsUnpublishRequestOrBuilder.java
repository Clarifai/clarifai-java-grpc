// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface DeleteModelVersionsUnpublishRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.DeleteModelVersionsUnpublishRequest)
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
   * <code>string model_id = 2;</code>
   * @return The modelId.
   */
  java.lang.String getModelId();
  /**
   * <code>string model_id = 2;</code>
   * @return The bytes for modelId.
   */
  com.google.protobuf.ByteString
      getModelIdBytes();

  /**
   * <code>repeated .clarifai.api.ModelVersionUnpublishRequest publications = 3;</code>
   */
  java.util.List<com.clarifai.grpc.api.ModelVersionUnpublishRequest> 
      getPublicationsList();
  /**
   * <code>repeated .clarifai.api.ModelVersionUnpublishRequest publications = 3;</code>
   */
  com.clarifai.grpc.api.ModelVersionUnpublishRequest getPublications(int index);
  /**
   * <code>repeated .clarifai.api.ModelVersionUnpublishRequest publications = 3;</code>
   */
  int getPublicationsCount();
  /**
   * <code>repeated .clarifai.api.ModelVersionUnpublishRequest publications = 3;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.ModelVersionUnpublishRequestOrBuilder> 
      getPublicationsOrBuilderList();
  /**
   * <code>repeated .clarifai.api.ModelVersionUnpublishRequest publications = 3;</code>
   */
  com.clarifai.grpc.api.ModelVersionUnpublishRequestOrBuilder getPublicationsOrBuilder(
      int index);
}
