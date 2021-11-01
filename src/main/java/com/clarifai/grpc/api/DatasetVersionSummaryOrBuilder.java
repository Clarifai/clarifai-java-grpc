// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface DatasetVersionSummaryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.DatasetVersionSummary)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Counts by different filters. Each key is the filter key,
   * e.g. total_image, train_image, test_image, total_video, train_video, test_video.
   * </pre>
   *
   * <code>map&lt;string, uint64&gt; input_counts = 1;</code>
   */
  int getInputCountsCount();
  /**
   * <pre>
   * Counts by different filters. Each key is the filter key,
   * e.g. total_image, train_image, test_image, total_video, train_video, test_video.
   * </pre>
   *
   * <code>map&lt;string, uint64&gt; input_counts = 1;</code>
   */
  boolean containsInputCounts(
      java.lang.String key);
  /**
   * Use {@link #getInputCountsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Long>
  getInputCounts();
  /**
   * <pre>
   * Counts by different filters. Each key is the filter key,
   * e.g. total_image, train_image, test_image, total_video, train_video, test_video.
   * </pre>
   *
   * <code>map&lt;string, uint64&gt; input_counts = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.Long>
  getInputCountsMap();
  /**
   * <pre>
   * Counts by different filters. Each key is the filter key,
   * e.g. total_image, train_image, test_image, total_video, train_video, test_video.
   * </pre>
   *
   * <code>map&lt;string, uint64&gt; input_counts = 1;</code>
   */

  long getInputCountsOrDefault(
      java.lang.String key,
      long defaultValue);
  /**
   * <pre>
   * Counts by different filters. Each key is the filter key,
   * e.g. total_image, train_image, test_image, total_video, train_video, test_video.
   * </pre>
   *
   * <code>map&lt;string, uint64&gt; input_counts = 1;</code>
   */

  long getInputCountsOrThrow(
      java.lang.String key);
}
