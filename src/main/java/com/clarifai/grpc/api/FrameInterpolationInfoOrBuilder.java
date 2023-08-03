// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface FrameInterpolationInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.FrameInterpolationInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * sample_ms is the sampling rate at which frame annotations are interpolated.
   * If sample_ms is zero, then the dataset default_processing_info value is used.
   * If the dataset default is zero or not set, then the input frame prediction
   * sampling rate is used.
   * </pre>
   *
   * <code>uint32 sample_ms = 1;</code>
   * @return The sampleMs.
   */
  int getSampleMs();
}
