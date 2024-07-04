// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface ReviewStartConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.ReviewStartConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Review the work done by these workers.
   * If empty, review the work for all workers.
   * </pre>
   *
   * <code>repeated .clarifai.api.Worker workers = 1;</code>
   */
  java.util.List<com.clarifai.grpc.api.Worker> 
      getWorkersList();
  /**
   * <pre>
   * Review the work done by these workers.
   * If empty, review the work for all workers.
   * </pre>
   *
   * <code>repeated .clarifai.api.Worker workers = 1;</code>
   */
  com.clarifai.grpc.api.Worker getWorkers(int index);
  /**
   * <pre>
   * Review the work done by these workers.
   * If empty, review the work for all workers.
   * </pre>
   *
   * <code>repeated .clarifai.api.Worker workers = 1;</code>
   */
  int getWorkersCount();
  /**
   * <pre>
   * Review the work done by these workers.
   * If empty, review the work for all workers.
   * </pre>
   *
   * <code>repeated .clarifai.api.Worker workers = 1;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.WorkerOrBuilder> 
      getWorkersOrBuilderList();
  /**
   * <pre>
   * Review the work done by these workers.
   * If empty, review the work for all workers.
   * </pre>
   *
   * <code>repeated .clarifai.api.Worker workers = 1;</code>
   */
  com.clarifai.grpc.api.WorkerOrBuilder getWorkersOrBuilder(
      int index);
}
