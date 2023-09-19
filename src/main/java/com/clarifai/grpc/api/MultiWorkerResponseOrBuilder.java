// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface MultiWorkerResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.MultiWorkerResponse)
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
   * <code>repeated .clarifai.api.Worker workers = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  java.util.List<com.clarifai.grpc.api.Worker> 
      getWorkersList();
  /**
   * <code>repeated .clarifai.api.Worker workers = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  com.clarifai.grpc.api.Worker getWorkers(int index);
  /**
   * <code>repeated .clarifai.api.Worker workers = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  int getWorkersCount();
  /**
   * <code>repeated .clarifai.api.Worker workers = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.WorkerOrBuilder> 
      getWorkersOrBuilderList();
  /**
   * <code>repeated .clarifai.api.Worker workers = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  com.clarifai.grpc.api.WorkerOrBuilder getWorkersOrBuilder(
      int index);
}
