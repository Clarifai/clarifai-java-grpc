// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * Protobuf enum {@code clarifai.api.ValidationErrorType}
 */
public enum ValidationErrorType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>VALIDATION_ERROR_TYPE_NOT_SET = 0;</code>
   */
  VALIDATION_ERROR_TYPE_NOT_SET(0),
  /**
   * <code>RESTRICTED = 1;</code>
   */
  RESTRICTED(1),
  /**
   * <code>DATABASE = 2;</code>
   */
  DATABASE(2),
  /**
   * <code>FORMAT = 3;</code>
   */
  FORMAT(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>VALIDATION_ERROR_TYPE_NOT_SET = 0;</code>
   */
  public static final int VALIDATION_ERROR_TYPE_NOT_SET_VALUE = 0;
  /**
   * <code>RESTRICTED = 1;</code>
   */
  public static final int RESTRICTED_VALUE = 1;
  /**
   * <code>DATABASE = 2;</code>
   */
  public static final int DATABASE_VALUE = 2;
  /**
   * <code>FORMAT = 3;</code>
   */
  public static final int FORMAT_VALUE = 3;


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
  public static ValidationErrorType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ValidationErrorType forNumber(int value) {
    switch (value) {
      case 0: return VALIDATION_ERROR_TYPE_NOT_SET;
      case 1: return RESTRICTED;
      case 2: return DATABASE;
      case 3: return FORMAT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ValidationErrorType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ValidationErrorType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ValidationErrorType>() {
          public ValidationErrorType findValueByNumber(int number) {
            return ValidationErrorType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Resources.getDescriptor().getEnumTypes().get(9);
  }

  private static final ValidationErrorType[] VALUES = values();

  public static ValidationErrorType valueOf(
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

  private ValidationErrorType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:clarifai.api.ValidationErrorType)
}
