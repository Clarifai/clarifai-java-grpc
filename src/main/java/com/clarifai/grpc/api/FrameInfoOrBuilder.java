// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface FrameInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.FrameInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Deprecated. Use Time instead.
   * The index of the frame, informational and optional.
   * Depends on the sampling rate used during processing
   * May be 0 for interpolated frames that are generated for brief time (training) or if new frame is manually added
   * </pre>
   *
   * <code>uint32 index = 1 [deprecated = true, (.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @deprecated clarifai.api.FrameInfo.index is deprecated.
   *     See proto/clarifai/api/resources.proto;l=696
   * @return The index.
   */
  @java.lang.Deprecated int getIndex();

  /**
   * <pre>
   * time in the video in milliseconds. This is independent of the sampling rates used during
   * processing.
   * </pre>
   *
   * <code>uint32 time = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The time.
   */
  int getTime();
}
