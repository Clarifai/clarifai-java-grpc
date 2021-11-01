// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface MultiModelLanguageResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.MultiModelLanguageResponse)
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
   * <code>repeated string languages = 2;</code>
   * @return A list containing the languages.
   */
  java.util.List<java.lang.String>
      getLanguagesList();
  /**
   * <code>repeated string languages = 2;</code>
   * @return The count of languages.
   */
  int getLanguagesCount();
  /**
   * <code>repeated string languages = 2;</code>
   * @param index The index of the element to return.
   * @return The languages at the given index.
   */
  java.lang.String getLanguages(int index);
  /**
   * <code>repeated string languages = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the languages at the given index.
   */
  com.google.protobuf.ByteString
      getLanguagesBytes(int index);
}
