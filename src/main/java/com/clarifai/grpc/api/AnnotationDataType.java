// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * Protobuf enum {@code clarifai.api.AnnotationDataType}
 */
public enum AnnotationDataType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ANNOTATION_DATA_TYPE_NOT_SET = 0;</code>
   */
  ANNOTATION_DATA_TYPE_NOT_SET(0),
  /**
   * <code>TAG = 1;</code>
   */
  TAG(1),
  /**
   * <code>BOUNDING_BOX = 2;</code>
   */
  BOUNDING_BOX(2),
  /**
   * <code>POLYGON = 4;</code>
   */
  POLYGON(4),
  /**
   * <code>POINT = 8;</code>
   */
  POINT(8),
  /**
   * <code>SPAN = 16;</code>
   */
  SPAN(16),
  /**
   * <code>MASK = 32;</code>
   */
  MASK(32),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ANNOTATION_DATA_TYPE_NOT_SET = 0;</code>
   */
  public static final int ANNOTATION_DATA_TYPE_NOT_SET_VALUE = 0;
  /**
   * <code>TAG = 1;</code>
   */
  public static final int TAG_VALUE = 1;
  /**
   * <code>BOUNDING_BOX = 2;</code>
   */
  public static final int BOUNDING_BOX_VALUE = 2;
  /**
   * <code>POLYGON = 4;</code>
   */
  public static final int POLYGON_VALUE = 4;
  /**
   * <code>POINT = 8;</code>
   */
  public static final int POINT_VALUE = 8;
  /**
   * <code>SPAN = 16;</code>
   */
  public static final int SPAN_VALUE = 16;
  /**
   * <code>MASK = 32;</code>
   */
  public static final int MASK_VALUE = 32;


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
  public static AnnotationDataType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AnnotationDataType forNumber(int value) {
    switch (value) {
      case 0: return ANNOTATION_DATA_TYPE_NOT_SET;
      case 1: return TAG;
      case 2: return BOUNDING_BOX;
      case 4: return POLYGON;
      case 8: return POINT;
      case 16: return SPAN;
      case 32: return MASK;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AnnotationDataType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AnnotationDataType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AnnotationDataType>() {
          public AnnotationDataType findValueByNumber(int number) {
            return AnnotationDataType.forNumber(number);
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
    return com.clarifai.grpc.api.Resources.getDescriptor().getEnumTypes().get(11);
  }

  private static final AnnotationDataType[] VALUES = values();

  public static AnnotationDataType valueOf(
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

  private AnnotationDataType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:clarifai.api.AnnotationDataType)
}

