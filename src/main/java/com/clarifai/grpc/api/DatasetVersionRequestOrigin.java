// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * Protobuf enum {@code clarifai.api.DatasetVersionRequestOrigin}
 */
public enum DatasetVersionRequestOrigin
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>DATASET_VERSION_REQUEST_ORIGIN_NOT_SET = 0;</code>
   */
  DATASET_VERSION_REQUEST_ORIGIN_NOT_SET(0),
  /**
   * <code>MANUAL = 1;</code>
   */
  MANUAL(1),
  /**
   * <code>TRAINING = 2;</code>
   */
  TRAINING(2),
  /**
   * <code>EVAL_GROUND_TRUTH = 3;</code>
   */
  EVAL_GROUND_TRUTH(3),
  /**
   * <code>EVAL_PREDICTIONS = 4;</code>
   */
  EVAL_PREDICTIONS(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>DATASET_VERSION_REQUEST_ORIGIN_NOT_SET = 0;</code>
   */
  public static final int DATASET_VERSION_REQUEST_ORIGIN_NOT_SET_VALUE = 0;
  /**
   * <code>MANUAL = 1;</code>
   */
  public static final int MANUAL_VALUE = 1;
  /**
   * <code>TRAINING = 2;</code>
   */
  public static final int TRAINING_VALUE = 2;
  /**
   * <code>EVAL_GROUND_TRUTH = 3;</code>
   */
  public static final int EVAL_GROUND_TRUTH_VALUE = 3;
  /**
   * <code>EVAL_PREDICTIONS = 4;</code>
   */
  public static final int EVAL_PREDICTIONS_VALUE = 4;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static DatasetVersionRequestOrigin valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DatasetVersionRequestOrigin forNumber(int value) {
    switch (value) {
      case 0: return DATASET_VERSION_REQUEST_ORIGIN_NOT_SET;
      case 1: return MANUAL;
      case 2: return TRAINING;
      case 3: return EVAL_GROUND_TRUTH;
      case 4: return EVAL_PREDICTIONS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DatasetVersionRequestOrigin>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DatasetVersionRequestOrigin> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DatasetVersionRequestOrigin>() {
          public DatasetVersionRequestOrigin findValueByNumber(int number) {
            return DatasetVersionRequestOrigin.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Resources.getDescriptor().getEnumTypes().get(1);
  }

  private static final DatasetVersionRequestOrigin[] VALUES = values();

  public static DatasetVersionRequestOrigin valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private DatasetVersionRequestOrigin(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:clarifai.api.DatasetVersionRequestOrigin)
}
