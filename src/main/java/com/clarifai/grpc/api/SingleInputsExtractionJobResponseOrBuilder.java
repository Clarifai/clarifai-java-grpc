// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface SingleInputsExtractionJobResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.SingleInputsExtractionJobResponse)
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
   * <code>.clarifai.api.InputsExtractionJob inputs_extraction_job = 2;</code>
   * @return Whether the inputsExtractionJob field is set.
   */
  boolean hasInputsExtractionJob();
  /**
   * <code>.clarifai.api.InputsExtractionJob inputs_extraction_job = 2;</code>
   * @return The inputsExtractionJob.
   */
  com.clarifai.grpc.api.InputsExtractionJob getInputsExtractionJob();
  /**
   * <code>.clarifai.api.InputsExtractionJob inputs_extraction_job = 2;</code>
   */
  com.clarifai.grpc.api.InputsExtractionJobOrBuilder getInputsExtractionJobOrBuilder();
}
