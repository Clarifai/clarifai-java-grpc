// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface SingleAnnotationFilterResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.SingleAnnotationFilterResponse)
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
   * <code>.clarifai.api.AnnotationFilter annotation_filter = 2;</code>
   * @return Whether the annotationFilter field is set.
   */
  boolean hasAnnotationFilter();
  /**
   * <code>.clarifai.api.AnnotationFilter annotation_filter = 2;</code>
   * @return The annotationFilter.
   */
  com.clarifai.grpc.api.AnnotationFilter getAnnotationFilter();
  /**
   * <code>.clarifai.api.AnnotationFilter annotation_filter = 2;</code>
   */
  com.clarifai.grpc.api.AnnotationFilterOrBuilder getAnnotationFilterOrBuilder();
}
