// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface MultiAnnotationFilterResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.MultiAnnotationFilterResponse)
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
   * <code>repeated .clarifai.api.AnnotationFilter annotation_filters = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  java.util.List<com.clarifai.grpc.api.AnnotationFilter> 
      getAnnotationFiltersList();
  /**
   * <code>repeated .clarifai.api.AnnotationFilter annotation_filters = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  com.clarifai.grpc.api.AnnotationFilter getAnnotationFilters(int index);
  /**
   * <code>repeated .clarifai.api.AnnotationFilter annotation_filters = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  int getAnnotationFiltersCount();
  /**
   * <code>repeated .clarifai.api.AnnotationFilter annotation_filters = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.AnnotationFilterOrBuilder> 
      getAnnotationFiltersOrBuilderList();
  /**
   * <code>repeated .clarifai.api.AnnotationFilter annotation_filters = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  com.clarifai.grpc.api.AnnotationFilterOrBuilder getAnnotationFiltersOrBuilder(
      int index);
}
