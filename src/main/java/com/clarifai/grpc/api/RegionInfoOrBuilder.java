// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface RegionInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.RegionInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.clarifai.api.BoundingBox bounding_box = 1;</code>
   */
  boolean hasBoundingBox();
  /**
   * <code>.clarifai.api.BoundingBox bounding_box = 1;</code>
   */
  com.clarifai.grpc.api.BoundingBox getBoundingBox();
  /**
   * <code>.clarifai.api.BoundingBox bounding_box = 1;</code>
   */
  com.clarifai.grpc.api.BoundingBoxOrBuilder getBoundingBoxOrBuilder();

  /**
   * <code>float value = 2;</code>
   */
  float getValue();

  /**
   * <code>.clarifai.api.Mask mask = 4;</code>
   */
  boolean hasMask();
  /**
   * <code>.clarifai.api.Mask mask = 4;</code>
   */
  com.clarifai.grpc.api.Mask getMask();
  /**
   * <code>.clarifai.api.Mask mask = 4;</code>
   */
  com.clarifai.grpc.api.MaskOrBuilder getMaskOrBuilder();
}
