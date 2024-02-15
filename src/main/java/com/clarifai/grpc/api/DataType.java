// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * Protobuf enum {@code clarifai.api.DataType}
 */
public enum DataType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Default value, should not be used
   * </pre>
   *
   * <code>UNDEFINED = 0;</code>
   */
  UNDEFINED(0),
  /**
   * <code>STRING = 1;</code>
   */
  STRING(1),
  /**
   * <code>UINT8 = 2;</code>
   */
  UINT8(2),
  /**
   * <code>INT32 = 3;</code>
   */
  INT32(3),
  /**
   * <code>INT64 = 4;</code>
   */
  INT64(4),
  /**
   * <code>FP32 = 5;</code>
   */
  FP32(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Default value, should not be used
   * </pre>
   *
   * <code>UNDEFINED = 0;</code>
   */
  public static final int UNDEFINED_VALUE = 0;
  /**
   * <code>STRING = 1;</code>
   */
  public static final int STRING_VALUE = 1;
  /**
   * <code>UINT8 = 2;</code>
   */
  public static final int UINT8_VALUE = 2;
  /**
   * <code>INT32 = 3;</code>
   */
  public static final int INT32_VALUE = 3;
  /**
   * <code>INT64 = 4;</code>
   */
  public static final int INT64_VALUE = 4;
  /**
   * <code>FP32 = 5;</code>
   */
  public static final int FP32_VALUE = 5;


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
  public static DataType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DataType forNumber(int value) {
    switch (value) {
      case 0: return UNDEFINED;
      case 1: return STRING;
      case 2: return UINT8;
      case 3: return INT32;
      case 4: return INT64;
      case 5: return FP32;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DataType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DataType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DataType>() {
          public DataType findValueByNumber(int number) {
            return DataType.forNumber(number);
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
    return com.clarifai.grpc.api.Resources.getDescriptor().getEnumTypes().get(5);
  }

  private static final DataType[] VALUES = values();

  public static DataType valueOf(
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

  private DataType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:clarifai.api.DataType)
}

