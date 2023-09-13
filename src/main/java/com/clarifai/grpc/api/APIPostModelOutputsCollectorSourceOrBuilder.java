// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface APIPostModelOutputsCollectorSourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.APIPostModelOutputsCollectorSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * To define the model that we should collect from we need to specify the following 4 IDs:
   * The User ID of the model we want to collect from.
   * This is User B in the example.
   * </pre>
   *
   * <code>string model_user_id = 1;</code>
   * @return The modelUserId.
   */
  java.lang.String getModelUserId();
  /**
   * <pre>
   * To define the model that we should collect from we need to specify the following 4 IDs:
   * The User ID of the model we want to collect from.
   * This is User B in the example.
   * </pre>
   *
   * <code>string model_user_id = 1;</code>
   * @return The bytes for modelUserId.
   */
  com.google.protobuf.ByteString
      getModelUserIdBytes();

  /**
   * <pre>
   * The App ID of the model we want to collect from.
   * </pre>
   *
   * <code>string model_app_id = 2;</code>
   * @return The modelAppId.
   */
  java.lang.String getModelAppId();
  /**
   * <pre>
   * The App ID of the model we want to collect from.
   * </pre>
   *
   * <code>string model_app_id = 2;</code>
   * @return The bytes for modelAppId.
   */
  com.google.protobuf.ByteString
      getModelAppIdBytes();

  /**
   * <pre>
   * The Model ID of the model we want to collect from.
   * </pre>
   *
   * <code>string model_id = 3;</code>
   * @return The modelId.
   */
  java.lang.String getModelId();
  /**
   * <pre>
   * The Model ID of the model we want to collect from.
   * </pre>
   *
   * <code>string model_id = 3;</code>
   * @return The bytes for modelId.
   */
  com.google.protobuf.ByteString
      getModelIdBytes();

  /**
   * <pre>
   * The Version ID of the model we want to collect from.
   * </pre>
   *
   * <code>string model_version_id = 4;</code>
   * @return The modelVersionId.
   */
  java.lang.String getModelVersionId();
  /**
   * <pre>
   * The Version ID of the model we want to collect from.
   * </pre>
   *
   * <code>string model_version_id = 4;</code>
   * @return The bytes for modelVersionId.
   */
  com.google.protobuf.ByteString
      getModelVersionIdBytes();

  /**
   * <pre>
   * This key is used to POST /inputs into your app by the collector. It can be an API key or a
   * PAT. This needs the permissions that are needed for POST /inputs for the app_id this
   * Collector is defined in.
   * </pre>
   *
   * <code>string post_inputs_key_id = 5;</code>
   * @return The postInputsKeyId.
   */
  java.lang.String getPostInputsKeyId();
  /**
   * <pre>
   * This key is used to POST /inputs into your app by the collector. It can be an API key or a
   * PAT. This needs the permissions that are needed for POST /inputs for the app_id this
   * Collector is defined in.
   * </pre>
   *
   * <code>string post_inputs_key_id = 5;</code>
   * @return The bytes for postInputsKeyId.
   */
  com.google.protobuf.ByteString
      getPostInputsKeyIdBytes();

  /**
   * <pre>
   * This is a private field that defaults to the app owner for public users.
   * If this is left blank then this collector will collect from ALL users calling the given model.
   * </pre>
   *
   * <code>string caller_user_id = 6;</code>
   * @return The callerUserId.
   */
  java.lang.String getCallerUserId();
  /**
   * <pre>
   * This is a private field that defaults to the app owner for public users.
   * If this is left blank then this collector will collect from ALL users calling the given model.
   * </pre>
   *
   * <code>string caller_user_id = 6;</code>
   * @return The bytes for callerUserId.
   */
  com.google.protobuf.ByteString
      getCallerUserIdBytes();
}
