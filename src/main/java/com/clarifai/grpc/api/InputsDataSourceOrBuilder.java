// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface InputsDataSourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.InputsDataSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Collect statistics about created inputs in job with given ID.
   * On Post call:
   * * If job ID is empty, then job is automatically created with random ID.
   * * If job ID is non-empty, then a new job will be created with given ID.
   * </pre>
   *
   * <code>string inputs_add_job_id = 1;</code>
   * @return The inputsAddJobId.
   */
  java.lang.String getInputsAddJobId();
  /**
   * <pre>
   * Collect statistics about created inputs in job with given ID.
   * On Post call:
   * * If job ID is empty, then job is automatically created with random ID.
   * * If job ID is non-empty, then a new job will be created with given ID.
   * </pre>
   *
   * <code>string inputs_add_job_id = 1;</code>
   * @return The bytes for inputsAddJobId.
   */
  com.google.protobuf.ByteString
      getInputsAddJobIdBytes();

  /**
   * <code>.clarifai.api.DataSourceURL url = 2;</code>
   * @return Whether the url field is set.
   */
  boolean hasUrl();
  /**
   * <code>.clarifai.api.DataSourceURL url = 2;</code>
   * @return The url.
   */
  com.clarifai.grpc.api.DataSourceURL getUrl();
  /**
   * <code>.clarifai.api.DataSourceURL url = 2;</code>
   */
  com.clarifai.grpc.api.DataSourceURLOrBuilder getUrlOrBuilder();

  /**
   * <pre>
   * How to handle input ID conflicts.
   * </pre>
   *
   * <code>.clarifai.api.InputIDConflictResolution input_id_conflict_resolution = 3;</code>
   * @return The enum numeric value on the wire for inputIdConflictResolution.
   */
  int getInputIdConflictResolutionValue();
  /**
   * <pre>
   * How to handle input ID conflicts.
   * </pre>
   *
   * <code>.clarifai.api.InputIDConflictResolution input_id_conflict_resolution = 3;</code>
   * @return The inputIdConflictResolution.
   */
  com.clarifai.grpc.api.InputIDConflictResolution getInputIdConflictResolution();
}
