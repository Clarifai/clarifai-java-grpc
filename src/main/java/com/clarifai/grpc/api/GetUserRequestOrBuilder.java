// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface GetUserRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.GetUserRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * we used to have user_id but moved to the standard convention. Since this endpoint
   * hasn't been exposed and only used by portal as a url this won't effect anything external.
   * </pre>
   *
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   * @return Whether the userAppId field is set.
   */
  boolean hasUserAppId();
  /**
   * <pre>
   * we used to have user_id but moved to the standard convention. Since this endpoint
   * hasn't been exposed and only used by portal as a url this won't effect anything external.
   * </pre>
   *
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   * @return The userAppId.
   */
  com.clarifai.grpc.api.UserAppIDSet getUserAppId();
  /**
   * <pre>
   * we used to have user_id but moved to the standard convention. Since this endpoint
   * hasn't been exposed and only used by portal as a url this won't effect anything external.
   * </pre>
   *
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   */
  com.clarifai.grpc.api.UserAppIDSetOrBuilder getUserAppIdOrBuilder();

  /**
   * <pre>
   * (optional URL parameter) List of additional fields to be included in the response. Currently supported: all, stars
   * </pre>
   *
   * <code>repeated string additional_fields = 2;</code>
   * @return A list containing the additionalFields.
   */
  java.util.List<java.lang.String>
      getAdditionalFieldsList();
  /**
   * <pre>
   * (optional URL parameter) List of additional fields to be included in the response. Currently supported: all, stars
   * </pre>
   *
   * <code>repeated string additional_fields = 2;</code>
   * @return The count of additionalFields.
   */
  int getAdditionalFieldsCount();
  /**
   * <pre>
   * (optional URL parameter) List of additional fields to be included in the response. Currently supported: all, stars
   * </pre>
   *
   * <code>repeated string additional_fields = 2;</code>
   * @param index The index of the element to return.
   * @return The additionalFields at the given index.
   */
  java.lang.String getAdditionalFields(int index);
  /**
   * <pre>
   * (optional URL parameter) List of additional fields to be included in the response. Currently supported: all, stars
   * </pre>
   *
   * <code>repeated string additional_fields = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the additionalFields at the given index.
   */
  com.google.protobuf.ByteString
      getAdditionalFieldsBytes(int index);
}
