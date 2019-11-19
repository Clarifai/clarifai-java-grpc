// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface ConceptTypeCountOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.ConceptTypeCount)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The number of inputs that have a concept with a value of 1.0 (indicating presence of the
   * concept in an input).
   * </pre>
   *
   * <code>uint32 positive = 1 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  int getPositive();

  /**
   * <pre>
   * The number of inputs that have a concept with a value of 0.0 (indicating absence of the
   * concept in an input).
   * </pre>
   *
   * <code>uint32 negative = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  int getNegative();
}
