// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * Protobuf enum {@code clarifai.api.DatasetVersionMetricsGroupType}
 */
public enum DatasetVersionMetricsGroupType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>DATASET_VERSION_METRICS_GROUP_TYPE_NOT_SET = 0;</code>
   */
  DATASET_VERSION_METRICS_GROUP_TYPE_NOT_SET(0),
  /**
   * <pre>
   * Group data examples by input type.
   * Examples: images, videos, text, audio.
   * </pre>
   *
   * <code>INPUT_TYPE = 2;</code>
   */
  INPUT_TYPE(2),
  /**
   * <pre>
   * Group data examples by concept ID.
   * Examples: inputs with cat concept, inputs with dog concept.
   * </pre>
   *
   * <code>CONCEPT_ID = 10;</code>
   */
  CONCEPT_ID(10),
  /**
   * <pre>
   * Group data examples by concepts count.
   * Examples: inputs with 20 concepts, inputs with 21 concepts.
   * </pre>
   *
   * <code>CONCEPTS_COUNT = 11;</code>
   */
  CONCEPTS_COUNT(11),
  /**
   * <pre>
   * Group data examples by bounding boxes count.
   * Examples: inputs with 20 bounding boxes, inputs with 21 bounding boxes.
   * </pre>
   *
   * <code>BOUNDING_BOXES_COUNT = 20;</code>
   */
  BOUNDING_BOXES_COUNT(20),
  /**
   * <pre>
   * Group data examples by polygons count.
   * Examples: inputs with 20 polygons, inputs with 21 polygons.
   * </pre>
   *
   * <code>POLYGONS_COUNT = 21;</code>
   */
  POLYGONS_COUNT(21),
  /**
   * <pre>
   * Group data examples by points count.
   * Examples: inputs with 20 points, inputs with 21 points.
   * </pre>
   *
   * <code>POINTS_COUNT = 22;</code>
   */
  POINTS_COUNT(22),
  /**
   * <pre>
   * Group data examples by masks count.
   * Examples: inputs with 20 masks, inputs with 21 masks.
   * </pre>
   *
   * <code>MASKS_COUNT = 23;</code>
   */
  MASKS_COUNT(23),
  /**
   * <pre>
   * Group data examples by pixels count.
   * In order to reduce the number of groups, we use bins.
   * Examples for bin size = 400: inputs with [200000, 200400) pixels, inputs with [200400, 200800) pixels.
   * </pre>
   *
   * <code>PIXELS_COUNT = 30;</code>
   */
  PIXELS_COUNT(30),
  /**
   * <pre>
   * Group data examples by aspect ratio.
   * In order to reduce the number of groups, we use bins.
   * Examples for bin size = 0.1: inputs with [0.5, 0.6) aspect ratio, inputs with [0.6, 0.7) aspect ratio.
   * </pre>
   *
   * <code>ASPECT_RATIO = 31;</code>
   */
  ASPECT_RATIO(31),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>DATASET_VERSION_METRICS_GROUP_TYPE_NOT_SET = 0;</code>
   */
  public static final int DATASET_VERSION_METRICS_GROUP_TYPE_NOT_SET_VALUE = 0;
  /**
   * <pre>
   * Group data examples by input type.
   * Examples: images, videos, text, audio.
   * </pre>
   *
   * <code>INPUT_TYPE = 2;</code>
   */
  public static final int INPUT_TYPE_VALUE = 2;
  /**
   * <pre>
   * Group data examples by concept ID.
   * Examples: inputs with cat concept, inputs with dog concept.
   * </pre>
   *
   * <code>CONCEPT_ID = 10;</code>
   */
  public static final int CONCEPT_ID_VALUE = 10;
  /**
   * <pre>
   * Group data examples by concepts count.
   * Examples: inputs with 20 concepts, inputs with 21 concepts.
   * </pre>
   *
   * <code>CONCEPTS_COUNT = 11;</code>
   */
  public static final int CONCEPTS_COUNT_VALUE = 11;
  /**
   * <pre>
   * Group data examples by bounding boxes count.
   * Examples: inputs with 20 bounding boxes, inputs with 21 bounding boxes.
   * </pre>
   *
   * <code>BOUNDING_BOXES_COUNT = 20;</code>
   */
  public static final int BOUNDING_BOXES_COUNT_VALUE = 20;
  /**
   * <pre>
   * Group data examples by polygons count.
   * Examples: inputs with 20 polygons, inputs with 21 polygons.
   * </pre>
   *
   * <code>POLYGONS_COUNT = 21;</code>
   */
  public static final int POLYGONS_COUNT_VALUE = 21;
  /**
   * <pre>
   * Group data examples by points count.
   * Examples: inputs with 20 points, inputs with 21 points.
   * </pre>
   *
   * <code>POINTS_COUNT = 22;</code>
   */
  public static final int POINTS_COUNT_VALUE = 22;
  /**
   * <pre>
   * Group data examples by masks count.
   * Examples: inputs with 20 masks, inputs with 21 masks.
   * </pre>
   *
   * <code>MASKS_COUNT = 23;</code>
   */
  public static final int MASKS_COUNT_VALUE = 23;
  /**
   * <pre>
   * Group data examples by pixels count.
   * In order to reduce the number of groups, we use bins.
   * Examples for bin size = 400: inputs with [200000, 200400) pixels, inputs with [200400, 200800) pixels.
   * </pre>
   *
   * <code>PIXELS_COUNT = 30;</code>
   */
  public static final int PIXELS_COUNT_VALUE = 30;
  /**
   * <pre>
   * Group data examples by aspect ratio.
   * In order to reduce the number of groups, we use bins.
   * Examples for bin size = 0.1: inputs with [0.5, 0.6) aspect ratio, inputs with [0.6, 0.7) aspect ratio.
   * </pre>
   *
   * <code>ASPECT_RATIO = 31;</code>
   */
  public static final int ASPECT_RATIO_VALUE = 31;


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
  public static DatasetVersionMetricsGroupType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DatasetVersionMetricsGroupType forNumber(int value) {
    switch (value) {
      case 0: return DATASET_VERSION_METRICS_GROUP_TYPE_NOT_SET;
      case 2: return INPUT_TYPE;
      case 10: return CONCEPT_ID;
      case 11: return CONCEPTS_COUNT;
      case 20: return BOUNDING_BOXES_COUNT;
      case 21: return POLYGONS_COUNT;
      case 22: return POINTS_COUNT;
      case 23: return MASKS_COUNT;
      case 30: return PIXELS_COUNT;
      case 31: return ASPECT_RATIO;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DatasetVersionMetricsGroupType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DatasetVersionMetricsGroupType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DatasetVersionMetricsGroupType>() {
          public DatasetVersionMetricsGroupType findValueByNumber(int number) {
            return DatasetVersionMetricsGroupType.forNumber(number);
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
    return com.clarifai.grpc.api.Resources.getDescriptor().getEnumTypes().get(2);
  }

  private static final DatasetVersionMetricsGroupType[] VALUES = values();

  public static DatasetVersionMetricsGroupType valueOf(
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

  private DatasetVersionMetricsGroupType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:clarifai.api.DatasetVersionMetricsGroupType)
}

