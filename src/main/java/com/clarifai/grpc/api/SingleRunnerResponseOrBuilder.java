// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface SingleRunnerResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.SingleRunnerResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.clarifai.api.status.Status status = 1;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>.clarifai.api.status.Status status = 1;</code>
   * @return The status.
   */
  com.clarifai.grpc.api.status.Status getStatus();
  /**
   * <code>.clarifai.api.status.Status status = 1;</code>
   */
  com.clarifai.grpc.api.status.StatusOrBuilder getStatusOrBuilder();

  /**
   * <code>.clarifai.api.Runner runner = 2;</code>
   * @return Whether the runner field is set.
   */
  boolean hasRunner();
  /**
   * <code>.clarifai.api.Runner runner = 2;</code>
   * @return The runner.
   */
  com.clarifai.grpc.api.Runner getRunner();
  /**
   * <code>.clarifai.api.Runner runner = 2;</code>
   */
  com.clarifai.grpc.api.RunnerOrBuilder getRunnerOrBuilder();
}
