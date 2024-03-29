// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface PostModelVersionMetricsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.PostModelVersionMetricsRequest)
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
   * <code>string version_id = 3;</code>
   * @return The versionId.
   */
  java.lang.String getVersionId();
  /**
   * <code>string version_id = 3;</code>
   * @return The bytes for versionId.
   */
  com.google.protobuf.ByteString
      getVersionIdBytes();

  /**
   * <pre>
   * Use this to filter inputs that are used in evaluation
   * </pre>
   *
   * <code>.clarifai.api.Search test_search = 5;</code>
   * @return Whether the testSearch field is set.
   */
  boolean hasTestSearch();
  /**
   * <pre>
   * Use this to filter inputs that are used in evaluation
   * </pre>
   *
   * <code>.clarifai.api.Search test_search = 5;</code>
   * @return The testSearch.
   */
  com.clarifai.grpc.api.Search getTestSearch();
  /**
   * <pre>
   * Use this to filter inputs that are used in evaluation
   * </pre>
   *
   * <code>.clarifai.api.Search test_search = 5;</code>
   */
  com.clarifai.grpc.api.SearchOrBuilder getTestSearchOrBuilder();

  /**
   * <pre>
   * evaluation info. Such as dataset used for evaluation.
   * </pre>
   *
   * <code>.clarifai.api.EvalInfo eval_info = 10;</code>
   * @return Whether the evalInfo field is set.
   */
  boolean hasEvalInfo();
  /**
   * <pre>
   * evaluation info. Such as dataset used for evaluation.
   * </pre>
   *
   * <code>.clarifai.api.EvalInfo eval_info = 10;</code>
   * @return The evalInfo.
   */
  com.clarifai.grpc.api.EvalInfo getEvalInfo();
  /**
   * <pre>
   * evaluation info. Such as dataset used for evaluation.
   * </pre>
   *
   * <code>.clarifai.api.EvalInfo eval_info = 10;</code>
   */
  com.clarifai.grpc.api.EvalInfoOrBuilder getEvalInfoOrBuilder();
}
