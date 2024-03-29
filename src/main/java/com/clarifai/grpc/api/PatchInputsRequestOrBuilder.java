// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface PatchInputsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.PatchInputsRequest)
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
   * List of inputs to patch.
   * Inputs are identified by id field.
   * For each input, the following fields are patchable:
   * * data
   * </pre>
   *
   * <code>repeated .clarifai.api.Input inputs = 2;</code>
   */
  java.util.List<com.clarifai.grpc.api.Input> 
      getInputsList();
  /**
   * <pre>
   * List of inputs to patch.
   * Inputs are identified by id field.
   * For each input, the following fields are patchable:
   * * data
   * </pre>
   *
   * <code>repeated .clarifai.api.Input inputs = 2;</code>
   */
  com.clarifai.grpc.api.Input getInputs(int index);
  /**
   * <pre>
   * List of inputs to patch.
   * Inputs are identified by id field.
   * For each input, the following fields are patchable:
   * * data
   * </pre>
   *
   * <code>repeated .clarifai.api.Input inputs = 2;</code>
   */
  int getInputsCount();
  /**
   * <pre>
   * List of inputs to patch.
   * Inputs are identified by id field.
   * For each input, the following fields are patchable:
   * * data
   * </pre>
   *
   * <code>repeated .clarifai.api.Input inputs = 2;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.InputOrBuilder> 
      getInputsOrBuilderList();
  /**
   * <pre>
   * List of inputs to patch.
   * Inputs are identified by id field.
   * For each input, the following fields are patchable:
   * * data
   * </pre>
   *
   * <code>repeated .clarifai.api.Input inputs = 2;</code>
   */
  com.clarifai.grpc.api.InputOrBuilder getInputsOrBuilder(
      int index);

  /**
   * <pre>
   * The action to perform on the patched objects
   * For now actions 'merge', 'overwrite', and 'remove' are supported
   * </pre>
   *
   * <code>string action = 3;</code>
   * @return The action.
   */
  java.lang.String getAction();
  /**
   * <pre>
   * The action to perform on the patched objects
   * For now actions 'merge', 'overwrite', and 'remove' are supported
   * </pre>
   *
   * <code>string action = 3;</code>
   * @return The bytes for action.
   */
  com.google.protobuf.ByteString
      getActionBytes();
}
