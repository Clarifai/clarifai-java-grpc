// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface SingleUserResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.SingleUserResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.clarifai.api.status.Status status = 1;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>.clarifai.api.status.Status status = 1;</code>
   * @return The status.
   */
  com.clarifai.grpc.api.status.Status getStatus();
  /**
   * <code>.clarifai.api.status.Status status = 1;</code>
   */
  com.clarifai.grpc.api.status.StatusOrBuilder getStatusOrBuilder();

  /**
   * <code>.clarifai.api.User user = 2;</code>
   * @return Whether the user field is set.
   */
  boolean hasUser();
  /**
   * <code>.clarifai.api.User user = 2;</code>
   * @return The user.
   */
  com.clarifai.grpc.api.User getUser();
  /**
   * <code>.clarifai.api.User user = 2;</code>
   */
  com.clarifai.grpc.api.UserOrBuilder getUserOrBuilder();
}
