// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface DatasetVersionExportOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.DatasetVersionExport)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * format is the format of the dataset version export.
   * </pre>
   *
   * <code>.clarifai.api.DatasetVersionExportFormat format = 1;</code>
   * @return The enum numeric value on the wire for format.
   */
  int getFormatValue();
  /**
   * <pre>
   * format is the format of the dataset version export.
   * </pre>
   *
   * <code>.clarifai.api.DatasetVersionExportFormat format = 1;</code>
   * @return The format.
   */
  com.clarifai.grpc.api.DatasetVersionExportFormat getFormat();

  /**
   * <pre>
   * status is the current status of the dataset version export.
   * </pre>
   *
   * <code>.clarifai.api.status.Status status = 2;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * status is the current status of the dataset version export.
   * </pre>
   *
   * <code>.clarifai.api.status.Status status = 2;</code>
   * @return The status.
   */
  com.clarifai.grpc.api.status.Status getStatus();
  /**
   * <pre>
   * status is the current status of the dataset version export.
   * </pre>
   *
   * <code>.clarifai.api.status.Status status = 2;</code>
   */
  com.clarifai.grpc.api.status.StatusOrBuilder getStatusOrBuilder();

  /**
   * <pre>
   * url is the URL from where the dataset version export can be downloaded.
   * </pre>
   *
   * <code>string url = 3;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * url is the URL from where the dataset version export can be downloaded.
   * </pre>
   *
   * <code>string url = 3;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <pre>
   * size is the size of the dataset version export in number of bytes.
   * </pre>
   *
   * <code>uint64 size = 4;</code>
   * @return The size.
   */
  long getSize();
}
