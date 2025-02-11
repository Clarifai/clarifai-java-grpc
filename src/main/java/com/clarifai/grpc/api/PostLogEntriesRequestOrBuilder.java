// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface PostLogEntriesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.PostLogEntriesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of log entries to be stored.
   * </pre>
   *
   * <code>repeated .clarifai.api.LogEntry log_entries = 1;</code>
   */
  java.util.List<com.clarifai.grpc.api.LogEntry> 
      getLogEntriesList();
  /**
   * <pre>
   * List of log entries to be stored.
   * </pre>
   *
   * <code>repeated .clarifai.api.LogEntry log_entries = 1;</code>
   */
  com.clarifai.grpc.api.LogEntry getLogEntries(int index);
  /**
   * <pre>
   * List of log entries to be stored.
   * </pre>
   *
   * <code>repeated .clarifai.api.LogEntry log_entries = 1;</code>
   */
  int getLogEntriesCount();
  /**
   * <pre>
   * List of log entries to be stored.
   * </pre>
   *
   * <code>repeated .clarifai.api.LogEntry log_entries = 1;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.LogEntryOrBuilder> 
      getLogEntriesOrBuilderList();
  /**
   * <pre>
   * List of log entries to be stored.
   * </pre>
   *
   * <code>repeated .clarifai.api.LogEntry log_entries = 1;</code>
   */
  com.clarifai.grpc.api.LogEntryOrBuilder getLogEntriesOrBuilder(
      int index);
}
