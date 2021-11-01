// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface TextOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.Text)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * This is a raw text string.
   * </pre>
   *
   * <code>string raw = 1;</code>
   * @return The raw.
   */
  java.lang.String getRaw();
  /**
   * <pre>
   * This is a raw text string.
   * </pre>
   *
   * <code>string raw = 1;</code>
   * @return The bytes for raw.
   */
  com.google.protobuf.ByteString
      getRawBytes();

  /**
   * <pre>
   * Url to a text file
   * </pre>
   *
   * <code>string url = 2;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * Url to a text file
   * </pre>
   *
   * <code>string url = 2;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <code>bool allow_duplicate_url = 3;</code>
   * @return The allowDuplicateUrl.
   */
  boolean getAllowDuplicateUrl();

  /**
   * <pre>
   * The hosted field lists original text hosted in Clarifai storage. This field is currently used
   * only in response.
   * </pre>
   *
   * <code>.clarifai.api.HostedURL hosted = 4;</code>
   * @return Whether the hosted field is set.
   */
  boolean hasHosted();
  /**
   * <pre>
   * The hosted field lists original text hosted in Clarifai storage. This field is currently used
   * only in response.
   * </pre>
   *
   * <code>.clarifai.api.HostedURL hosted = 4;</code>
   * @return The hosted.
   */
  com.clarifai.grpc.api.HostedURL getHosted();
  /**
   * <pre>
   * The hosted field lists original text hosted in Clarifai storage. This field is currently used
   * only in response.
   * </pre>
   *
   * <code>.clarifai.api.HostedURL hosted = 4;</code>
   */
  com.clarifai.grpc.api.HostedURLOrBuilder getHostedOrBuilder();

  /**
   * <pre>
   * text info
   * </pre>
   *
   * <code>.clarifai.api.TextInfo text_info = 5;</code>
   * @return Whether the textInfo field is set.
   */
  boolean hasTextInfo();
  /**
   * <pre>
   * text info
   * </pre>
   *
   * <code>.clarifai.api.TextInfo text_info = 5;</code>
   * @return The textInfo.
   */
  com.clarifai.grpc.api.TextInfo getTextInfo();
  /**
   * <pre>
   * text info
   * </pre>
   *
   * <code>.clarifai.api.TextInfo text_info = 5;</code>
   */
  com.clarifai.grpc.api.TextInfoOrBuilder getTextInfoOrBuilder();
}
