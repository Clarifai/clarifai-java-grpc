// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface ConceptQueryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.ConceptQuery)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the concept to search.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the concept to search.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * (optional) The language of the concept name in a search. Defaults to English.
   * </pre>
   *
   * <code>string language = 2;</code>
   * @return The language.
   */
  java.lang.String getLanguage();
  /**
   * <pre>
   * (optional) The language of the concept name in a search. Defaults to English.
   * </pre>
   *
   * <code>string language = 2;</code>
   * @return The bytes for language.
   */
  com.google.protobuf.ByteString
      getLanguageBytes();
}
