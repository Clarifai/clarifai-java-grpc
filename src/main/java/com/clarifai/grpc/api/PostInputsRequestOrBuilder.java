// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface PostInputsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.PostInputsRequest)
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
   * List of inputs to post.
   * For each input, the following fields are used:
   * * id
   * * data
   * * dataset_ids
   * </pre>
   *
   * <code>repeated .clarifai.api.Input inputs = 2;</code>
   */
  java.util.List<com.clarifai.grpc.api.Input> 
      getInputsList();
  /**
   * <pre>
   * List of inputs to post.
   * For each input, the following fields are used:
   * * id
   * * data
   * * dataset_ids
   * </pre>
   *
   * <code>repeated .clarifai.api.Input inputs = 2;</code>
   */
  com.clarifai.grpc.api.Input getInputs(int index);
  /**
   * <pre>
   * List of inputs to post.
   * For each input, the following fields are used:
   * * id
   * * data
   * * dataset_ids
   * </pre>
   *
   * <code>repeated .clarifai.api.Input inputs = 2;</code>
   */
  int getInputsCount();
  /**
   * <pre>
   * List of inputs to post.
   * For each input, the following fields are used:
   * * id
   * * data
   * * dataset_ids
   * </pre>
   *
   * <code>repeated .clarifai.api.Input inputs = 2;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.InputOrBuilder> 
      getInputsOrBuilderList();
  /**
   * <pre>
   * List of inputs to post.
   * For each input, the following fields are used:
   * * id
   * * data
   * * dataset_ids
   * </pre>
   *
   * <code>repeated .clarifai.api.Input inputs = 2;</code>
   */
  com.clarifai.grpc.api.InputOrBuilder getInputsOrBuilder(
      int index);

  /**
   * <pre>
   * Collect statistics about created inputs in job with given ID.
   * * If job ID is empty, then job is not created.
   * * If job ID is non-empty and doesn't already exist, then a new job will be created with given ID.
   * * If job ID does already exist, then new inputs statistics are merged with previous inputs statistics.
   * </pre>
   *
   * <code>string inputs_add_job_id = 3;</code>
   * @return The inputsAddJobId.
   */
  java.lang.String getInputsAddJobId();
  /**
   * <pre>
   * Collect statistics about created inputs in job with given ID.
   * * If job ID is empty, then job is not created.
   * * If job ID is non-empty and doesn't already exist, then a new job will be created with given ID.
   * * If job ID does already exist, then new inputs statistics are merged with previous inputs statistics.
   * </pre>
   *
   * <code>string inputs_add_job_id = 3;</code>
   * @return The bytes for inputsAddJobId.
   */
  com.google.protobuf.ByteString
      getInputsAddJobIdBytes();

  /**
   * <pre>
   * How to handle input ID conflicts.
   * </pre>
   *
   * <code>.clarifai.api.InputIDConflictResolution input_id_conflict_resolution = 4;</code>
   * @return The enum numeric value on the wire for inputIdConflictResolution.
   */
  int getInputIdConflictResolutionValue();
  /**
   * <pre>
   * How to handle input ID conflicts.
   * </pre>
   *
   * <code>.clarifai.api.InputIDConflictResolution input_id_conflict_resolution = 4;</code>
   * @return The inputIdConflictResolution.
   */
  com.clarifai.grpc.api.InputIDConflictResolution getInputIdConflictResolution();
}
