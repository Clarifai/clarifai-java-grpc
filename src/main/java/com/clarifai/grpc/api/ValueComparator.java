// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * Protobuf enum {@code clarifai.api.ValueComparator}
 */
public enum ValueComparator
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CONCEPT_THRESHOLD_NOT_SET = 0;</code>
   */
  CONCEPT_THRESHOLD_NOT_SET(0),
  /**
   * <pre>
   * input &gt; value
   * </pre>
   *
   * <code>GREATER_THAN = 1;</code>
   */
  GREATER_THAN(1),
  /**
   * <pre>
   * input &gt;= value
   * </pre>
   *
   * <code>GREATER_THAN_OR_EQUAL = 2;</code>
   */
  GREATER_THAN_OR_EQUAL(2),
  /**
   * <pre>
   * input &lt; value
   * </pre>
   *
   * <code>LESS_THAN = 3;</code>
   */
  LESS_THAN(3),
  /**
   * <pre>
   * input &lt;= value
   * </pre>
   *
   * <code>LESS_THAN_OR_EQUAL = 4;</code>
   */
  LESS_THAN_OR_EQUAL(4),
  /**
   * <pre>
   * input == value
   * </pre>
   *
   * <code>EQUAL = 5;</code>
   */
  EQUAL(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CONCEPT_THRESHOLD_NOT_SET = 0;</code>
   */
  public static final int CONCEPT_THRESHOLD_NOT_SET_VALUE = 0;
  /**
   * <pre>
   * input &gt; value
   * </pre>
   *
   * <code>GREATER_THAN = 1;</code>
   */
  public static final int GREATER_THAN_VALUE = 1;
  /**
   * <pre>
   * input &gt;= value
   * </pre>
   *
   * <code>GREATER_THAN_OR_EQUAL = 2;</code>
   */
  public static final int GREATER_THAN_OR_EQUAL_VALUE = 2;
  /**
   * <pre>
   * input &lt; value
   * </pre>
   *
   * <code>LESS_THAN = 3;</code>
   */
  public static final int LESS_THAN_VALUE = 3;
  /**
   * <pre>
   * input &lt;= value
   * </pre>
   *
   * <code>LESS_THAN_OR_EQUAL = 4;</code>
   */
  public static final int LESS_THAN_OR_EQUAL_VALUE = 4;
  /**
   * <pre>
   * input == value
   * </pre>
   *
   * <code>EQUAL = 5;</code>
   */
  public static final int EQUAL_VALUE = 5;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ValueComparator valueOf(int value) {
    return forNumber(value);
  }

  public static ValueComparator forNumber(int value) {
    switch (value) {
      case 0: return CONCEPT_THRESHOLD_NOT_SET;
      case 1: return GREATER_THAN;
      case 2: return GREATER_THAN_OR_EQUAL;
      case 3: return LESS_THAN;
      case 4: return LESS_THAN_OR_EQUAL;
      case 5: return EQUAL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ValueComparator>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ValueComparator> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ValueComparator>() {
          public ValueComparator findValueByNumber(int number) {
            return ValueComparator.forNumber(number);
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
    return com.clarifai.grpc.api.Resources.getDescriptor().getEnumTypes().get(4);
  }

  private static final ValueComparator[] VALUES = values();

  public static ValueComparator valueOf(
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

  private ValueComparator(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:clarifai.api.ValueComparator)
}

