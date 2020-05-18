// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface MultiAppResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.MultiAppResponse)
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
   * <code>repeated .clarifai.api.App apps = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  java.util.List<com.clarifai.grpc.api.App> 
      getAppsList();
  /**
   * <code>repeated .clarifai.api.App apps = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  com.clarifai.grpc.api.App getApps(int index);
  /**
   * <code>repeated .clarifai.api.App apps = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  int getAppsCount();
  /**
   * <code>repeated .clarifai.api.App apps = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.AppOrBuilder> 
      getAppsOrBuilderList();
  /**
   * <code>repeated .clarifai.api.App apps = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  com.clarifai.grpc.api.AppOrBuilder getAppsOrBuilder(
      int index);
}
