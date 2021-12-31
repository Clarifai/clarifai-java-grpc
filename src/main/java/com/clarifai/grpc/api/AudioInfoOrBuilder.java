// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface AudioInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.AudioInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * audio format
   * </pre>
   *
   * <code>string audio_format = 1;</code>
   * @return The audioFormat.
   */
  java.lang.String getAudioFormat();
  /**
   * <pre>
   * audio format
   * </pre>
   *
   * <code>string audio_format = 1;</code>
   * @return The bytes for audioFormat.
   */
  com.google.protobuf.ByteString
      getAudioFormatBytes();

  /**
   * <pre>
   * sample rate
   * </pre>
   *
   * <code>int32 sample_rate = 2;</code>
   * @return The sampleRate.
   */
  int getSampleRate();

  /**
   * <pre>
   * audio track duration in seconds
   * </pre>
   *
   * <code>float duration_seconds = 3;</code>
   * @return The durationSeconds.
   */
  float getDurationSeconds();

  /**
   * <pre>
   * audio track bit rate
   * </pre>
   *
   * <code>int32 bit_rate = 4;</code>
   * @return The bitRate.
   */
  int getBitRate();
}