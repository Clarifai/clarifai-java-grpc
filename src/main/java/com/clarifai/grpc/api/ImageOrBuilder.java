// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface ImageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.Image)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * This is a URL to a publicly accessible image file. The platform will download this file server
   * side and then process.
   * </pre>
   *
   * <code>string url = 1;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * This is a URL to a publicly accessible image file. The platform will download this file server
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
   * The base64 field is using image file bytes directly in the request.
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
   * The hosted field lists images in different sizes hosted in Clarifai storage.
   * </pre>
   *
   * <code>.clarifai.api.HostedURL hosted = 5;</code>
   * @return Whether the hosted field is set.
   */
  boolean hasHosted();
  /**
   * <pre>
   * The hosted field lists images in different sizes hosted in Clarifai storage.
   * </pre>
   *
   * <code>.clarifai.api.HostedURL hosted = 5;</code>
   * @return The hosted.
   */
  com.clarifai.grpc.api.HostedURL getHosted();
  /**
   * <pre>
   * The hosted field lists images in different sizes hosted in Clarifai storage.
   * </pre>
   *
   * <code>.clarifai.api.HostedURL hosted = 5;</code>
   */
  com.clarifai.grpc.api.HostedURLOrBuilder getHostedOrBuilder();

  /**
   * <pre>
   * image info for original size. for image info for other sizes, use hosted_image_info
   * </pre>
   *
   * <code>.clarifai.api.ImageInfo image_info = 6;</code>
   * @return Whether the imageInfo field is set.
   */
  boolean hasImageInfo();
  /**
   * <pre>
   * image info for original size. for image info for other sizes, use hosted_image_info
   * </pre>
   *
   * <code>.clarifai.api.ImageInfo image_info = 6;</code>
   * @return The imageInfo.
   */
  com.clarifai.grpc.api.ImageInfo getImageInfo();
  /**
   * <pre>
   * image info for original size. for image info for other sizes, use hosted_image_info
   * </pre>
   *
   * <code>.clarifai.api.ImageInfo image_info = 6;</code>
   */
  com.clarifai.grpc.api.ImageInfoOrBuilder getImageInfoOrBuilder();

  /**
   * <pre>
   * The map of hosted image info of different sizes (see hosted.sizes), excluding the original image.
   * Note: keys(hosted_image_info) = hosted.sizes - "orig"
   * </pre>
   *
   * <code>map&lt;string, .clarifai.api.ImageInfo&gt; hosted_image_info = 7;</code>
   */
  int getHostedImageInfoCount();
  /**
   * <pre>
   * The map of hosted image info of different sizes (see hosted.sizes), excluding the original image.
   * Note: keys(hosted_image_info) = hosted.sizes - "orig"
   * </pre>
   *
   * <code>map&lt;string, .clarifai.api.ImageInfo&gt; hosted_image_info = 7;</code>
   */
  boolean containsHostedImageInfo(
      java.lang.String key);
  /**
   * Use {@link #getHostedImageInfoMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.clarifai.grpc.api.ImageInfo>
  getHostedImageInfo();
  /**
   * <pre>
   * The map of hosted image info of different sizes (see hosted.sizes), excluding the original image.
   * Note: keys(hosted_image_info) = hosted.sizes - "orig"
   * </pre>
   *
   * <code>map&lt;string, .clarifai.api.ImageInfo&gt; hosted_image_info = 7;</code>
   */
  java.util.Map<java.lang.String, com.clarifai.grpc.api.ImageInfo>
  getHostedImageInfoMap();
  /**
   * <pre>
   * The map of hosted image info of different sizes (see hosted.sizes), excluding the original image.
   * Note: keys(hosted_image_info) = hosted.sizes - "orig"
   * </pre>
   *
   * <code>map&lt;string, .clarifai.api.ImageInfo&gt; hosted_image_info = 7;</code>
   */

  /* nullable */
com.clarifai.grpc.api.ImageInfo getHostedImageInfoOrDefault(
      java.lang.String key,
      /* nullable */
com.clarifai.grpc.api.ImageInfo defaultValue);
  /**
   * <pre>
   * The map of hosted image info of different sizes (see hosted.sizes), excluding the original image.
   * Note: keys(hosted_image_info) = hosted.sizes - "orig"
   * </pre>
   *
   * <code>map&lt;string, .clarifai.api.ImageInfo&gt; hosted_image_info = 7;</code>
   */

  com.clarifai.grpc.api.ImageInfo getHostedImageInfoOrThrow(
      java.lang.String key);
}
