// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface SingleUploadResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.SingleUploadResponse)
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
   * <code>.clarifai.api.Upload upload = 2;</code>
   * @return Whether the upload field is set.
   */
  boolean hasUpload();
  /**
   * <code>.clarifai.api.Upload upload = 2;</code>
   * @return The upload.
   */
  com.clarifai.grpc.api.Upload getUpload();
  /**
   * <code>.clarifai.api.Upload upload = 2;</code>
   */
  com.clarifai.grpc.api.UploadOrBuilder getUploadOrBuilder();
}
