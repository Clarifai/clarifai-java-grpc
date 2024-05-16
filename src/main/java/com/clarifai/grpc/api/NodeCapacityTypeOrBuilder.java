// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface NodeCapacityTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.NodeCapacityType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .clarifai.api.NodeCapacityType.CapacityType capacity_types = 1;</code>
   * @return A list containing the capacityTypes.
   */
  java.util.List<com.clarifai.grpc.api.NodeCapacityType.CapacityType> getCapacityTypesList();
  /**
   * <code>repeated .clarifai.api.NodeCapacityType.CapacityType capacity_types = 1;</code>
   * @return The count of capacityTypes.
   */
  int getCapacityTypesCount();
  /**
   * <code>repeated .clarifai.api.NodeCapacityType.CapacityType capacity_types = 1;</code>
   * @param index The index of the element to return.
   * @return The capacityTypes at the given index.
   */
  com.clarifai.grpc.api.NodeCapacityType.CapacityType getCapacityTypes(int index);
  /**
   * <code>repeated .clarifai.api.NodeCapacityType.CapacityType capacity_types = 1;</code>
   * @return A list containing the enum numeric values on the wire for capacityTypes.
   */
  java.util.List<java.lang.Integer>
  getCapacityTypesValueList();
  /**
   * <code>repeated .clarifai.api.NodeCapacityType.CapacityType capacity_types = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of capacityTypes at the given index.
   */
  int getCapacityTypesValue(int index);
}
