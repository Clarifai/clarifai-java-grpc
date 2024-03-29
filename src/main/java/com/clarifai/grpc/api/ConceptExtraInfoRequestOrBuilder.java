// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface ConceptExtraInfoRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.ConceptExtraInfoRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Determine if the concept is searchable by rank using this model.
   * Currently, only embedder models are supported.
   * ########## Supported fields ##########
   * - app_id
   * - id
   * - model_version.id
   * - user_id
   * </pre>
   *
   * <code>.clarifai.api.Model rankable_model = 1;</code>
   * @return Whether the rankableModel field is set.
   */
  boolean hasRankableModel();
  /**
   * <pre>
   * Determine if the concept is searchable by rank using this model.
   * Currently, only embedder models are supported.
   * ########## Supported fields ##########
   * - app_id
   * - id
   * - model_version.id
   * - user_id
   * </pre>
   *
   * <code>.clarifai.api.Model rankable_model = 1;</code>
   * @return The rankableModel.
   */
  com.clarifai.grpc.api.Model getRankableModel();
  /**
   * <pre>
   * Determine if the concept is searchable by rank using this model.
   * Currently, only embedder models are supported.
   * ########## Supported fields ##########
   * - app_id
   * - id
   * - model_version.id
   * - user_id
   * </pre>
   *
   * <code>.clarifai.api.Model rankable_model = 1;</code>
   */
  com.clarifai.grpc.api.ModelOrBuilder getRankableModelOrBuilder();
}
