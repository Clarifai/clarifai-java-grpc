// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface DetailConceptCountOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.DetailConceptCount)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The concept count for processed assets
   * </pre>
   *
   * <code>.clarifai.api.ConceptTypeCount processed = 1;</code>
   */
  boolean hasProcessed();
  /**
   * <pre>
   * The concept count for processed assets
   * </pre>
   *
   * <code>.clarifai.api.ConceptTypeCount processed = 1;</code>
   */
  com.clarifai.grpc.api.ConceptTypeCount getProcessed();
  /**
   * <pre>
   * The concept count for processed assets
   * </pre>
   *
   * <code>.clarifai.api.ConceptTypeCount processed = 1;</code>
   */
  com.clarifai.grpc.api.ConceptTypeCountOrBuilder getProcessedOrBuilder();

  /**
   * <pre>
   * The concept count for to process assets
   * </pre>
   *
   * <code>.clarifai.api.ConceptTypeCount to_process = 2;</code>
   */
  boolean hasToProcess();
  /**
   * <pre>
   * The concept count for to process assets
   * </pre>
   *
   * <code>.clarifai.api.ConceptTypeCount to_process = 2;</code>
   */
  com.clarifai.grpc.api.ConceptTypeCount getToProcess();
  /**
   * <pre>
   * The concept count for to process assets
   * </pre>
   *
   * <code>.clarifai.api.ConceptTypeCount to_process = 2;</code>
   */
  com.clarifai.grpc.api.ConceptTypeCountOrBuilder getToProcessOrBuilder();

  /**
   * <pre>
   * The concept count for assets with status error
   * </pre>
   *
   * <code>.clarifai.api.ConceptTypeCount errors = 3;</code>
   */
  boolean hasErrors();
  /**
   * <pre>
   * The concept count for assets with status error
   * </pre>
   *
   * <code>.clarifai.api.ConceptTypeCount errors = 3;</code>
   */
  com.clarifai.grpc.api.ConceptTypeCount getErrors();
  /**
   * <pre>
   * The concept count for assets with status error
   * </pre>
   *
   * <code>.clarifai.api.ConceptTypeCount errors = 3;</code>
   */
  com.clarifai.grpc.api.ConceptTypeCountOrBuilder getErrorsOrBuilder();

  /**
   * <pre>
   * The concept count for processing assets
   * </pre>
   *
   * <code>.clarifai.api.ConceptTypeCount processing = 4;</code>
   */
  boolean hasProcessing();
  /**
   * <pre>
   * The concept count for processing assets
   * </pre>
   *
   * <code>.clarifai.api.ConceptTypeCount processing = 4;</code>
   */
  com.clarifai.grpc.api.ConceptTypeCount getProcessing();
  /**
   * <pre>
   * The concept count for processing assets
   * </pre>
   *
   * <code>.clarifai.api.ConceptTypeCount processing = 4;</code>
   */
  com.clarifai.grpc.api.ConceptTypeCountOrBuilder getProcessingOrBuilder();
}
