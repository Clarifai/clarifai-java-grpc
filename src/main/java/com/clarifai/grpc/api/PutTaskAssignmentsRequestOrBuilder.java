// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface PutTaskAssignmentsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.PutTaskAssignmentsRequest)
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
   * <code>string task_id = 2;</code>
   * @return The taskId.
   */
  java.lang.String getTaskId();
  /**
   * <code>string task_id = 2;</code>
   * @return The bytes for taskId.
   */
  com.google.protobuf.ByteString
      getTaskIdBytes();

  /**
   * <pre>
   * Deprecated: use action and action_config instead.
   * Supported for backwards compatibility: setting this field is equivalent with
   * * action = LABEL_SUBMIT
   * * label_submit_config = [{"task_assignments": {"input": {"id": &lt;input-id&gt;}}}]
   * </pre>
   *
   * <code>string input_id = 3;</code>
   * @return The inputId.
   */
  java.lang.String getInputId();
  /**
   * <pre>
   * Deprecated: use action and action_config instead.
   * Supported for backwards compatibility: setting this field is equivalent with
   * * action = LABEL_SUBMIT
   * * label_submit_config = [{"task_assignments": {"input": {"id": &lt;input-id&gt;}}}]
   * </pre>
   *
   * <code>string input_id = 3;</code>
   * @return The bytes for inputId.
   */
  com.google.protobuf.ByteString
      getInputIdBytes();

  /**
   * <pre>
   * Action to perform on selected task.
   * </pre>
   *
   * <code>.clarifai.api.PutTaskAssignmentsRequestAction action = 4;</code>
   * @return The enum numeric value on the wire for action.
   */
  int getActionValue();
  /**
   * <pre>
   * Action to perform on selected task.
   * </pre>
   *
   * <code>.clarifai.api.PutTaskAssignmentsRequestAction action = 4;</code>
   * @return The action.
   */
  com.clarifai.grpc.api.PutTaskAssignmentsRequestAction getAction();

  /**
   * <code>.clarifai.api.LabelSubmitConfig label_submit_config = 6;</code>
   * @return Whether the labelSubmitConfig field is set.
   */
  boolean hasLabelSubmitConfig();
  /**
   * <code>.clarifai.api.LabelSubmitConfig label_submit_config = 6;</code>
   * @return The labelSubmitConfig.
   */
  com.clarifai.grpc.api.LabelSubmitConfig getLabelSubmitConfig();
  /**
   * <code>.clarifai.api.LabelSubmitConfig label_submit_config = 6;</code>
   */
  com.clarifai.grpc.api.LabelSubmitConfigOrBuilder getLabelSubmitConfigOrBuilder();

  public com.clarifai.grpc.api.PutTaskAssignmentsRequest.ActionConfigCase getActionConfigCase();
}
