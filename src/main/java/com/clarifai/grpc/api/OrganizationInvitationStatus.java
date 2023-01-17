// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

/**
 * Protobuf enum {@code clarifai.api.OrganizationInvitationStatus}
 */
public enum OrganizationInvitationStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>NOT_SET = 0;</code>
   */
  NOT_SET(0),
  /**
   * <code>PENDING = 1;</code>
   */
  PENDING(1),
  /**
   * <code>ACCEPTED = 2;</code>
   */
  ACCEPTED(2),
  /**
   * <code>CANCELLED = 3;</code>
   */
  CANCELLED(3),
  /**
   * <code>DECLINED = 4;</code>
   */
  DECLINED(4),
  /**
   * <code>EXPIRED = 5;</code>
   */
  EXPIRED(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>NOT_SET = 0;</code>
   */
  public static final int NOT_SET_VALUE = 0;
  /**
   * <code>PENDING = 1;</code>
   */
  public static final int PENDING_VALUE = 1;
  /**
   * <code>ACCEPTED = 2;</code>
   */
  public static final int ACCEPTED_VALUE = 2;
  /**
   * <code>CANCELLED = 3;</code>
   */
  public static final int CANCELLED_VALUE = 3;
  /**
   * <code>DECLINED = 4;</code>
   */
  public static final int DECLINED_VALUE = 4;
  /**
   * <code>EXPIRED = 5;</code>
   */
  public static final int EXPIRED_VALUE = 5;


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
  public static OrganizationInvitationStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static OrganizationInvitationStatus forNumber(int value) {
    switch (value) {
      case 0: return NOT_SET;
      case 1: return PENDING;
      case 2: return ACCEPTED;
      case 3: return CANCELLED;
      case 4: return DECLINED;
      case 5: return EXPIRED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OrganizationInvitationStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OrganizationInvitationStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OrganizationInvitationStatus>() {
          public OrganizationInvitationStatus findValueByNumber(int number) {
            return OrganizationInvitationStatus.forNumber(number);
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
    return com.clarifai.grpc.api.Service.getDescriptor().getEnumTypes().get(0);
  }

  private static final OrganizationInvitationStatus[] VALUES = values();

  public static OrganizationInvitationStatus valueOf(
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

  private OrganizationInvitationStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:clarifai.api.OrganizationInvitationStatus)
}

