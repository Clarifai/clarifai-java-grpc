// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface TimeSegmentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.TimeSegment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.clarifai.api.Data data = 1;</code>
   * @return Whether the data field is set.
   */
  boolean hasData();
  /**
   * <code>.clarifai.api.Data data = 1;</code>
   * @return The data.
   */
  com.clarifai.grpc.api.Data getData();
  /**
   * <code>.clarifai.api.Data data = 1;</code>
   */
  com.clarifai.grpc.api.DataOrBuilder getDataOrBuilder();

  /**
   * <code>.clarifai.api.TimeInfo time_info = 2;</code>
   * @return Whether the timeInfo field is set.
   */
  boolean hasTimeInfo();
  /**
   * <code>.clarifai.api.TimeInfo time_info = 2;</code>
   * @return The timeInfo.
   */
  com.clarifai.grpc.api.TimeInfo getTimeInfo();
  /**
   * <code>.clarifai.api.TimeInfo time_info = 2;</code>
   */
  com.clarifai.grpc.api.TimeInfoOrBuilder getTimeInfoOrBuilder();
}