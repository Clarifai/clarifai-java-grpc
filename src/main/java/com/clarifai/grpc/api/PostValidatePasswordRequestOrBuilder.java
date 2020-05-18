// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface PostValidatePasswordRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.PostValidatePasswordRequest)
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
   * password to be validated
   * </pre>
   *
   * <code>.clarifai.api.Password password = 2;</code>
   * @return Whether the password field is set.
   */
  boolean hasPassword();
  /**
   * <pre>
   * password to be validated
   * </pre>
   *
   * <code>.clarifai.api.Password password = 2;</code>
   * @return The password.
   */
  com.clarifai.grpc.api.Password getPassword();
  /**
   * <pre>
   * password to be validated
   * </pre>
   *
   * <code>.clarifai.api.Password password = 2;</code>
   */
  com.clarifai.grpc.api.PasswordOrBuilder getPasswordOrBuilder();
}
