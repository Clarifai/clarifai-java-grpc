// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface EvalTestSetEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.EvalTestSetEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Input CFID
   * </pre>
   *
   * <code>string id = 1 [deprecated = true];</code>
   * @return The id.
   */
  @java.lang.Deprecated java.lang.String getId();
  /**
   * <pre>
   * Input CFID
   * </pre>
   *
   * <code>string id = 1 [deprecated = true];</code>
   * @return The bytes for id.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string url = 2 [deprecated = true];</code>
   * @return The url.
   */
  @java.lang.Deprecated java.lang.String getUrl();
  /**
   * <code>string url = 2 [deprecated = true];</code>
   * @return The bytes for url.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <pre>
   * the input information
   * </pre>
   *
   * <code>.clarifai.api.Input input = 6;</code>
   * @return Whether the input field is set.
   */
  boolean hasInput();
  /**
   * <pre>
   * the input information
   * </pre>
   *
   * <code>.clarifai.api.Input input = 6;</code>
   * @return The input.
   */
  com.clarifai.grpc.api.Input getInput();
  /**
   * <pre>
   * the input information
   * </pre>
   *
   * <code>.clarifai.api.Input input = 6;</code>
   */
  com.clarifai.grpc.api.InputOrBuilder getInputOrBuilder();

  /**
   * <code>repeated .clarifai.api.Concept predicted_concepts = 3;</code>
   */
  java.util.List<com.clarifai.grpc.api.Concept> 
      getPredictedConceptsList();
  /**
   * <code>repeated .clarifai.api.Concept predicted_concepts = 3;</code>
   */
  com.clarifai.grpc.api.Concept getPredictedConcepts(int index);
  /**
   * <code>repeated .clarifai.api.Concept predicted_concepts = 3;</code>
   */
  int getPredictedConceptsCount();
  /**
   * <code>repeated .clarifai.api.Concept predicted_concepts = 3;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.ConceptOrBuilder> 
      getPredictedConceptsOrBuilderList();
  /**
   * <code>repeated .clarifai.api.Concept predicted_concepts = 3;</code>
   */
  com.clarifai.grpc.api.ConceptOrBuilder getPredictedConceptsOrBuilder(
      int index);

  /**
   * <pre>
   * All the ground truth concepts will be show on the top level
   * </pre>
   *
   * <code>repeated .clarifai.api.Concept ground_truth_concepts = 4;</code>
   */
  java.util.List<com.clarifai.grpc.api.Concept> 
      getGroundTruthConceptsList();
  /**
   * <pre>
   * All the ground truth concepts will be show on the top level
   * </pre>
   *
   * <code>repeated .clarifai.api.Concept ground_truth_concepts = 4;</code>
   */
  com.clarifai.grpc.api.Concept getGroundTruthConcepts(int index);
  /**
   * <pre>
   * All the ground truth concepts will be show on the top level
   * </pre>
   *
   * <code>repeated .clarifai.api.Concept ground_truth_concepts = 4;</code>
   */
  int getGroundTruthConceptsCount();
  /**
   * <pre>
   * All the ground truth concepts will be show on the top level
   * </pre>
   *
   * <code>repeated .clarifai.api.Concept ground_truth_concepts = 4;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.ConceptOrBuilder> 
      getGroundTruthConceptsOrBuilderList();
  /**
   * <pre>
   * All the ground truth concepts will be show on the top level
   * </pre>
   *
   * <code>repeated .clarifai.api.Concept ground_truth_concepts = 4;</code>
   */
  com.clarifai.grpc.api.ConceptOrBuilder getGroundTruthConceptsOrBuilder(
      int index);

  /**
   * <pre>
   * Only region-based/frame-based app contains this annotation
   * Each annotation only contains one region
   * And the concepts is in ground_truth_concepts instead of this annotation
   * </pre>
   *
   * <code>.clarifai.api.Annotation annotation = 5;</code>
   * @return Whether the annotation field is set.
   */
  boolean hasAnnotation();
  /**
   * <pre>
   * Only region-based/frame-based app contains this annotation
   * Each annotation only contains one region
   * And the concepts is in ground_truth_concepts instead of this annotation
   * </pre>
   *
   * <code>.clarifai.api.Annotation annotation = 5;</code>
   * @return The annotation.
   */
  com.clarifai.grpc.api.Annotation getAnnotation();
  /**
   * <pre>
   * Only region-based/frame-based app contains this annotation
   * Each annotation only contains one region
   * And the concepts is in ground_truth_concepts instead of this annotation
   * </pre>
   *
   * <code>.clarifai.api.Annotation annotation = 5;</code>
   */
  com.clarifai.grpc.api.AnnotationOrBuilder getAnnotationOrBuilder();
}
