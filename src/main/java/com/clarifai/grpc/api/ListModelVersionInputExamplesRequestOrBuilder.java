// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface ListModelVersionInputExamplesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.ListModelVersionInputExamplesRequest)
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
   * Optional, defaults to 1.
   * </pre>
   *
   * <code>uint32 page = 4;</code>
   * @return The page.
   */
  int getPage();

  /**
   * <pre>
   * Optional, defaults to 128 references per page.
   * </pre>
   *
   * <code>uint32 per_page = 5;</code>
   * @return The perPage.
   */
  int getPerPage();
}
