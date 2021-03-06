// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface ROCOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.ROC)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated float fpr = 1 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return A list containing the fpr.
   */
  java.util.List<java.lang.Float> getFprList();
  /**
   * <code>repeated float fpr = 1 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The count of fpr.
   */
  int getFprCount();
  /**
   * <code>repeated float fpr = 1 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @param index The index of the element to return.
   * @return The fpr at the given index.
   */
  float getFpr(int index);

  /**
   * <code>repeated float tpr = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return A list containing the tpr.
   */
  java.util.List<java.lang.Float> getTprList();
  /**
   * <code>repeated float tpr = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The count of tpr.
   */
  int getTprCount();
  /**
   * <code>repeated float tpr = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @param index The index of the element to return.
   * @return The tpr at the given index.
   */
  float getTpr(int index);

  /**
   * <code>repeated float thresholds = 3 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return A list containing the thresholds.
   */
  java.util.List<java.lang.Float> getThresholdsList();
  /**
   * <code>repeated float thresholds = 3 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The count of thresholds.
   */
  int getThresholdsCount();
  /**
   * <code>repeated float thresholds = 3 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @param index The index of the element to return.
   * @return The thresholds at the given index.
   */
  float getThresholds(int index);

  /**
   * <code>repeated float fpr_per_image = 4;</code>
   * @return A list containing the fprPerImage.
   */
  java.util.List<java.lang.Float> getFprPerImageList();
  /**
   * <code>repeated float fpr_per_image = 4;</code>
   * @return The count of fprPerImage.
   */
  int getFprPerImageCount();
  /**
   * <code>repeated float fpr_per_image = 4;</code>
   * @param index The index of the element to return.
   * @return The fprPerImage at the given index.
   */
  float getFprPerImage(int index);

  /**
   * <code>repeated float fpr_per_object = 5;</code>
   * @return A list containing the fprPerObject.
   */
  java.util.List<java.lang.Float> getFprPerObjectList();
  /**
   * <code>repeated float fpr_per_object = 5;</code>
   * @return The count of fprPerObject.
   */
  int getFprPerObjectCount();
  /**
   * <code>repeated float fpr_per_object = 5;</code>
   * @param index The index of the element to return.
   * @return The fprPerObject at the given index.
   */
  float getFprPerObject(int index);
}
