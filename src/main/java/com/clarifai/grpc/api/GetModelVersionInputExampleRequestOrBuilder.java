// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface GetModelVersionInputExampleRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.GetModelVersionInputExampleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * authorization field  (contains app/user id info)
   * </pre>
   *
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   * @return Whether the userAppId field is set.
   */
  boolean hasUserAppId();
  /**
   * <pre>
   * authorization field  (contains app/user id info)
   * </pre>
   *
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   * @return The userAppId.
   */
  com.clarifai.grpc.api.UserAppIDSet getUserAppId();
  /**
   * <pre>
   * authorization field  (contains app/user id info)
   * </pre>
   *
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   */
  com.clarifai.grpc.api.UserAppIDSetOrBuilder getUserAppIdOrBuilder();

  /**
   * <pre>
   * id of model the example belongs to
   * </pre>
   *
   * <code>string model_id = 2;</code>
   * @return The modelId.
   */
  java.lang.String getModelId();
  /**
   * <pre>
   * id of model the example belongs to
   * </pre>
   *
   * <code>string model_id = 2;</code>
   * @return The bytes for modelId.
   */
  com.google.protobuf.ByteString
      getModelIdBytes();

  /**
   * <pre>
   * specific version the example belongs to
   * </pre>
   *
   * <code>string model_version_id = 3;</code>
   * @return The modelVersionId.
   */
  java.lang.String getModelVersionId();
  /**
   * <pre>
   * specific version the example belongs to
   * </pre>
   *
   * <code>string model_version_id = 3;</code>
   * @return The bytes for modelVersionId.
   */
  com.google.protobuf.ByteString
      getModelVersionIdBytes();

  /**
   * <pre>
   * Id of example to fetch
   * </pre>
   *
   * <code>string example_id = 4;</code>
   * @return The exampleId.
   */
  java.lang.String getExampleId();
  /**
   * <pre>
   * Id of example to fetch
   * </pre>
   *
   * <code>string example_id = 4;</code>
   * @return The bytes for exampleId.
   */
  com.google.protobuf.ByteString
      getExampleIdBytes();
}