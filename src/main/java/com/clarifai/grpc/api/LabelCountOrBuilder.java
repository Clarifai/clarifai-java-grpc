// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface LabelCountOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.LabelCount)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string concept_name = 1 [deprecated = true];</code>
   * @deprecated clarifai.api.LabelCount.concept_name is deprecated.
   *     See proto/clarifai/api/resources.proto;l=2015
   * @return The conceptName.
   */
  @java.lang.Deprecated java.lang.String getConceptName();
  /**
   * <code>string concept_name = 1 [deprecated = true];</code>
   * @deprecated clarifai.api.LabelCount.concept_name is deprecated.
   *     See proto/clarifai/api/resources.proto;l=2015
   * @return The bytes for conceptName.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getConceptNameBytes();

  /**
   * <code>uint32 count = 2;</code>
   * @return The count.
   */
  int getCount();

  /**
   * <code>.clarifai.api.Concept concept = 3;</code>
   * @return Whether the concept field is set.
   */
  boolean hasConcept();
  /**
   * <code>.clarifai.api.Concept concept = 3;</code>
   * @return The concept.
   */
  com.clarifai.grpc.api.Concept getConcept();
  /**
   * <code>.clarifai.api.Concept concept = 3;</code>
   */
  com.clarifai.grpc.api.ConceptOrBuilder getConceptOrBuilder();
}
