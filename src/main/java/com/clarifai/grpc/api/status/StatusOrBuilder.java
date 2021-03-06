// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/status/status.proto

package com.clarifai.grpc.api.status;

public interface StatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.status.Status)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Status code from internal codes.
   * </pre>
   *
   * <code>.clarifai.api.status.StatusCode code = 1;</code>
   * @return The enum numeric value on the wire for code.
   */
  int getCodeValue();
  /**
   * <pre>
   * Status code from internal codes.
   * </pre>
   *
   * <code>.clarifai.api.status.StatusCode code = 1;</code>
   * @return The code.
   */
  com.clarifai.grpc.api.status.StatusCode getCode();

  /**
   * <pre>
   * A longer description of the error.
   * </pre>
   *
   * <code>string description = 2;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * A longer description of the error.
   * </pre>
   *
   * <code>string description = 2;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * More details of the given error.
   * </pre>
   *
   * <code>string details = 3;</code>
   * @return The details.
   */
  java.lang.String getDetails();
  /**
   * <pre>
   * More details of the given error.
   * </pre>
   *
   * <code>string details = 3;</code>
   * @return The bytes for details.
   */
  com.google.protobuf.ByteString
      getDetailsBytes();

  /**
   * <pre>
   * For some environment we may return a stack trace to help debug
   * any issues.
   * </pre>
   *
   * <code>repeated string stack_trace = 4 [(.clarifai.auth.util.cl_private_field) = true];</code>
   * @return A list containing the stackTrace.
   */
  java.util.List<java.lang.String>
      getStackTraceList();
  /**
   * <pre>
   * For some environment we may return a stack trace to help debug
   * any issues.
   * </pre>
   *
   * <code>repeated string stack_trace = 4 [(.clarifai.auth.util.cl_private_field) = true];</code>
   * @return The count of stackTrace.
   */
  int getStackTraceCount();
  /**
   * <pre>
   * For some environment we may return a stack trace to help debug
   * any issues.
   * </pre>
   *
   * <code>repeated string stack_trace = 4 [(.clarifai.auth.util.cl_private_field) = true];</code>
   * @param index The index of the element to return.
   * @return The stackTrace at the given index.
   */
  java.lang.String getStackTrace(int index);
  /**
   * <pre>
   * For some environment we may return a stack trace to help debug
   * any issues.
   * </pre>
   *
   * <code>repeated string stack_trace = 4 [(.clarifai.auth.util.cl_private_field) = true];</code>
   * @param index The index of the value to return.
   * @return The bytes of the stackTrace at the given index.
   */
  com.google.protobuf.ByteString
      getStackTraceBytes(int index);

  /**
   * <pre>
   * specifically for long running jobs
   * </pre>
   *
   * <code>uint32 percent_completed = 5;</code>
   * @return The percentCompleted.
   */
  int getPercentCompleted();

  /**
   * <pre>
   * if status is pending, how much time is remaining (in seconds)
   * </pre>
   *
   * <code>uint32 time_remaining = 6;</code>
   * @return The timeRemaining.
   */
  int getTimeRemaining();

  /**
   * <pre>
   * If we want to return a request id in the base status field
   * </pre>
   *
   * <code>string req_id = 7;</code>
   * @return The reqId.
   */
  java.lang.String getReqId();
  /**
   * <pre>
   * If we want to return a request id in the base status field
   * </pre>
   *
   * <code>string req_id = 7;</code>
   * @return The bytes for reqId.
   */
  com.google.protobuf.ByteString
      getReqIdBytes();

  /**
   * <pre>
   * Internal Annotation (do not set in production, for internal Clarifai use only).
   * </pre>
   *
   * <code>string internal_details = 8 [(.clarifai.auth.util.cl_private_field) = true];</code>
   * @return The internalDetails.
   */
  java.lang.String getInternalDetails();
  /**
   * <pre>
   * Internal Annotation (do not set in production, for internal Clarifai use only).
   * </pre>
   *
   * <code>string internal_details = 8 [(.clarifai.auth.util.cl_private_field) = true];</code>
   * @return The bytes for internalDetails.
   */
  com.google.protobuf.ByteString
      getInternalDetailsBytes();
}
