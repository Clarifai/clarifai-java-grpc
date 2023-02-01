// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface MultiDatasetInputResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.MultiDatasetInputResponse)
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
   * <code>repeated .clarifai.api.DatasetInput dataset_inputs = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  java.util.List<com.clarifai.grpc.api.DatasetInput> 
      getDatasetInputsList();
  /**
   * <code>repeated .clarifai.api.DatasetInput dataset_inputs = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  com.clarifai.grpc.api.DatasetInput getDatasetInputs(int index);
  /**
   * <code>repeated .clarifai.api.DatasetInput dataset_inputs = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  int getDatasetInputsCount();
  /**
   * <code>repeated .clarifai.api.DatasetInput dataset_inputs = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.DatasetInputOrBuilder> 
      getDatasetInputsOrBuilderList();
  /**
   * <code>repeated .clarifai.api.DatasetInput dataset_inputs = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  com.clarifai.grpc.api.DatasetInputOrBuilder getDatasetInputsOrBuilder(
      int index);

  /**
   * <code>.clarifai.api.DatasetInputsSearchAddJob dataset_inputs_search_add_job = 3;</code>
   * @return Whether the datasetInputsSearchAddJob field is set.
   */
  boolean hasDatasetInputsSearchAddJob();
  /**
   * <code>.clarifai.api.DatasetInputsSearchAddJob dataset_inputs_search_add_job = 3;</code>
   * @return The datasetInputsSearchAddJob.
   */
  com.clarifai.grpc.api.DatasetInputsSearchAddJob getDatasetInputsSearchAddJob();
  /**
   * <code>.clarifai.api.DatasetInputsSearchAddJob dataset_inputs_search_add_job = 3;</code>
   */
  com.clarifai.grpc.api.DatasetInputsSearchAddJobOrBuilder getDatasetInputsSearchAddJobOrBuilder();
}