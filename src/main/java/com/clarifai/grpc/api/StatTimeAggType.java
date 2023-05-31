// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * Protobuf enum {@code clarifai.api.StatTimeAggType}
 */
public enum StatTimeAggType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>NO_TIME_AGG = 0;</code>
   */
  NO_TIME_AGG(0),
  /**
   * <code>YEAR = 1;</code>
   */
  YEAR(1),
  /**
   * <code>MONTH = 2;</code>
   */
  MONTH(2),
  /**
   * <code>WEEK = 3;</code>
   */
  WEEK(3),
  /**
   * <code>DAY = 4;</code>
   */
  DAY(4),
  /**
   * <code>HOUR = 5;</code>
   */
  HOUR(5),
  /**
   * <code>MINUTE = 6;</code>
   */
  MINUTE(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>NO_TIME_AGG = 0;</code>
   */
  public static final int NO_TIME_AGG_VALUE = 0;
  /**
   * <code>YEAR = 1;</code>
   */
  public static final int YEAR_VALUE = 1;
  /**
   * <code>MONTH = 2;</code>
   */
  public static final int MONTH_VALUE = 2;
  /**
   * <code>WEEK = 3;</code>
   */
  public static final int WEEK_VALUE = 3;
  /**
   * <code>DAY = 4;</code>
   */
  public static final int DAY_VALUE = 4;
  /**
   * <code>HOUR = 5;</code>
   */
  public static final int HOUR_VALUE = 5;
  /**
   * <code>MINUTE = 6;</code>
   */
  public static final int MINUTE_VALUE = 6;


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
  public static StatTimeAggType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static StatTimeAggType forNumber(int value) {
    switch (value) {
      case 0: return NO_TIME_AGG;
      case 1: return YEAR;
      case 2: return MONTH;
      case 3: return WEEK;
      case 4: return DAY;
      case 5: return HOUR;
      case 6: return MINUTE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<StatTimeAggType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      StatTimeAggType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<StatTimeAggType>() {
          public StatTimeAggType findValueByNumber(int number) {
            return StatTimeAggType.forNumber(number);
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
    return com.clarifai.grpc.api.Resources.getDescriptor().getEnumTypes().get(12);
  }

  private static final StatTimeAggType[] VALUES = values();

  public static StatTimeAggType valueOf(
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

  private StatTimeAggType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:clarifai.api.StatTimeAggType)
}

