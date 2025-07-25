// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface VideoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.Video)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * This is a URL to a publicly accessible video file. The platform will download this file server
   * side and then process.
   * </pre>
   *
   * <code>string url = 1;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * This is a URL to a publicly accessible video file. The platform will download this file server
   * side and then process.
   * </pre>
   *
   * <code>string url = 1;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <pre>
   * The base64 field is using video file bytes directly in the request.
   * NOTE: if you're sending a json request, then this MUST be base64 encoded before sending (hence
   * the name here).
   * When using our grpc clients, you DO NOT need to base64 encode
   * it yourself since the clients know how to do this for you automatically and will avoid the
   * base64 encoding if they send a binary request.
   * </pre>
   *
   * <code>bytes base64 = 2;</code>
   * @return The base64.
   */
  com.google.protobuf.ByteString getBase64();

  /**
   * <code>bool allow_duplicate_url = 4;</code>
   * @return The allowDuplicateUrl.
   */
  boolean getAllowDuplicateUrl();

  /**
   * <pre>
   * URL of thumbnail image, which is currently frame at position of 1s. This field is currently
   * used only in response.
   * Deprecated in favour of thumbnail_hosted, which also contains alternate sizes of thumbnail
   * </pre>
   *
   * <code>string thumbnail_url = 5 [deprecated = true];</code>
   * @deprecated clarifai.api.Video.thumbnail_url is deprecated.
   *     See proto/clarifai/api/resources.proto;l=2953
   * @return The thumbnailUrl.
   */
  @java.lang.Deprecated java.lang.String getThumbnailUrl();
  /**
   * <pre>
   * URL of thumbnail image, which is currently frame at position of 1s. This field is currently
   * used only in response.
   * Deprecated in favour of thumbnail_hosted, which also contains alternate sizes of thumbnail
   * </pre>
   *
   * <code>string thumbnail_url = 5 [deprecated = true];</code>
   * @deprecated clarifai.api.Video.thumbnail_url is deprecated.
   *     See proto/clarifai/api/resources.proto;l=2953
   * @return The bytes for thumbnailUrl.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getThumbnailUrlBytes();

  /**
   * <pre>
   * The hosted field lists original video hosted in Clarifai storage. This field is currently used
   * only in response.
   * </pre>
   *
   * <code>.clarifai.api.HostedURL hosted = 6;</code>
   * @return Whether the hosted field is set.
   */
  boolean hasHosted();
  /**
   * <pre>
   * The hosted field lists original video hosted in Clarifai storage. This field is currently used
   * only in response.
   * </pre>
   *
   * <code>.clarifai.api.HostedURL hosted = 6;</code>
   * @return The hosted.
   */
  com.clarifai.grpc.api.HostedURL getHosted();
  /**
   * <pre>
   * The hosted field lists original video hosted in Clarifai storage. This field is currently used
   * only in response.
   * </pre>
   *
   * <code>.clarifai.api.HostedURL hosted = 6;</code>
   */
  com.clarifai.grpc.api.HostedURLOrBuilder getHostedOrBuilder();

  /**
   * <pre>
   * The hosted field lists various sizes of the vide thumbnail hosted in Clarifai storage, with 'thumbnail' as the full size
   * This field is currently used only in response.
   * </pre>
   *
   * <code>.clarifai.api.HostedURL hosted_thumbnail = 8;</code>
   * @return Whether the hostedThumbnail field is set.
   */
  boolean hasHostedThumbnail();
  /**
   * <pre>
   * The hosted field lists various sizes of the vide thumbnail hosted in Clarifai storage, with 'thumbnail' as the full size
   * This field is currently used only in response.
   * </pre>
   *
   * <code>.clarifai.api.HostedURL hosted_thumbnail = 8;</code>
   * @return The hostedThumbnail.
   */
  com.clarifai.grpc.api.HostedURL getHostedThumbnail();
  /**
   * <pre>
   * The hosted field lists various sizes of the vide thumbnail hosted in Clarifai storage, with 'thumbnail' as the full size
   * This field is currently used only in response.
   * </pre>
   *
   * <code>.clarifai.api.HostedURL hosted_thumbnail = 8;</code>
   */
  com.clarifai.grpc.api.HostedURLOrBuilder getHostedThumbnailOrBuilder();

  /**
   * <pre>
   * video info
   * </pre>
   *
   * <code>.clarifai.api.VideoInfo video_info = 7;</code>
   * @return Whether the videoInfo field is set.
   */
  boolean hasVideoInfo();
  /**
   * <pre>
   * video info
   * </pre>
   *
   * <code>.clarifai.api.VideoInfo video_info = 7;</code>
   * @return The videoInfo.
   */
  com.clarifai.grpc.api.VideoInfo getVideoInfo();
  /**
   * <pre>
   * video info
   * </pre>
   *
   * <code>.clarifai.api.VideoInfo video_info = 7;</code>
   */
  com.clarifai.grpc.api.VideoInfoOrBuilder getVideoInfoOrBuilder();
}
