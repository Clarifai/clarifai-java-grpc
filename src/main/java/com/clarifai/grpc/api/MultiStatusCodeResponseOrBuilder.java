// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface MultiStatusCodeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.MultiStatusCodeResponse)
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
   * <code>repeated .clarifai.api.status.Status statuses = 2;</code>
   */
  java.util.List<com.clarifai.grpc.api.status.Status> 
      getStatusesList();
  /**
   * <code>repeated .clarifai.api.status.Status statuses = 2;</code>
   */
  com.clarifai.grpc.api.status.Status getStatuses(int index);
  /**
   * <code>repeated .clarifai.api.status.Status statuses = 2;</code>
   */
  int getStatusesCount();
  /**
   * <code>repeated .clarifai.api.status.Status statuses = 2;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.status.StatusOrBuilder> 
      getStatusesOrBuilderList();
  /**
   * <code>repeated .clarifai.api.status.Status statuses = 2;</code>
   */
  com.clarifai.grpc.api.status.StatusOrBuilder getStatusesOrBuilder(
      int index);
}
