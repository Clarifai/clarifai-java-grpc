// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * Protobuf enum {@code clarifai.api.EventType}
 */
public enum EventType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * default type is UNDEFINED if not specified
   * </pre>
   *
   * <code>undefined = 0;</code>
   */
  undefined(0),
  /**
   * <code>search_click = 1;</code>
   */
  search_click(1),
  /**
   * <code>annotation = 2;</code>
   */
  annotation(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * default type is UNDEFINED if not specified
   * </pre>
   *
   * <code>undefined = 0;</code>
   */
  public static final int undefined_VALUE = 0;
  /**
   * <code>search_click = 1;</code>
   */
  public static final int search_click_VALUE = 1;
  /**
   * <code>annotation = 2;</code>
   */
  public static final int annotation_VALUE = 2;


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
  public static EventType valueOf(int value) {
    return forNumber(value);
  }

  public static EventType forNumber(int value) {
    switch (value) {
      case 0: return undefined;
      case 1: return search_click;
      case 2: return annotation;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EventType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      EventType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<EventType>() {
          public EventType findValueByNumber(int number) {
            return EventType.forNumber(number);
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
    return com.clarifai.grpc.api.Resources.getDescriptor().getEnumTypes().get(1);
  }

  private static final EventType[] VALUES = values();

  public static EventType valueOf(
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

  private EventType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:clarifai.api.EventType)
}

