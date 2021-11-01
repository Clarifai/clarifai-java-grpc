// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface MultiModelUseCaseResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.MultiModelUseCaseResponse)
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
   * <code>repeated string usecases = 2;</code>
   * @return A list containing the usecases.
   */
  java.util.List<java.lang.String>
      getUsecasesList();
  /**
   * <code>repeated string usecases = 2;</code>
   * @return The count of usecases.
   */
  int getUsecasesCount();
  /**
   * <code>repeated string usecases = 2;</code>
   * @param index The index of the element to return.
   * @return The usecases at the given index.
   */
  java.lang.String getUsecases(int index);
  /**
   * <code>repeated string usecases = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the usecases at the given index.
   */
  com.google.protobuf.ByteString
      getUsecasesBytes(int index);
}
