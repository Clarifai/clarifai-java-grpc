// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * Protobuf enum {@code clarifai.api.InputIDConflictResolution}
 */
public enum InputIDConflictResolution
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Defaults to SKIP
   * </pre>
   *
   * <code>INPUT_ID_CONFLICT_RESOLUTION_NOT_SET = 0;</code>
   */
  INPUT_ID_CONFLICT_RESOLUTION_NOT_SET(0),
  /**
   * <pre>
   * Mark duplicate inputs as error and skip processing them.
   * </pre>
   *
   * <code>SKIP = 1;</code>
   */
  SKIP(1),
  /**
   * <pre>
   * Add a suffix to inputs with conflicting IDs. Attempts numeric suffixes "-1" to "-9" and then a randomized suffix. Identical ID's in the same request are still treated as errors.
   * </pre>
   *
   * <code>SUFFIX = 2;</code>
   */
  SUFFIX(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Defaults to SKIP
   * </pre>
   *
   * <code>INPUT_ID_CONFLICT_RESOLUTION_NOT_SET = 0;</code>
   */
  public static final int INPUT_ID_CONFLICT_RESOLUTION_NOT_SET_VALUE = 0;
  /**
   * <pre>
   * Mark duplicate inputs as error and skip processing them.
   * </pre>
   *
   * <code>SKIP = 1;</code>
   */
  public static final int SKIP_VALUE = 1;
  /**
   * <pre>
   * Add a suffix to inputs with conflicting IDs. Attempts numeric suffixes "-1" to "-9" and then a randomized suffix. Identical ID's in the same request are still treated as errors.
   * </pre>
   *
   * <code>SUFFIX = 2;</code>
   */
  public static final int SUFFIX_VALUE = 2;


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
  public static InputIDConflictResolution valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static InputIDConflictResolution forNumber(int value) {
    switch (value) {
      case 0: return INPUT_ID_CONFLICT_RESOLUTION_NOT_SET;
      case 1: return SKIP;
      case 2: return SUFFIX;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<InputIDConflictResolution>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      InputIDConflictResolution> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<InputIDConflictResolution>() {
          public InputIDConflictResolution findValueByNumber(int number) {
            return InputIDConflictResolution.forNumber(number);
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
    return com.clarifai.grpc.api.Resources.getDescriptor().getEnumTypes().get(17);
  }

  private static final InputIDConflictResolution[] VALUES = values();

  public static InputIDConflictResolution valueOf(
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

  private InputIDConflictResolution(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:clarifai.api.InputIDConflictResolution)
}

