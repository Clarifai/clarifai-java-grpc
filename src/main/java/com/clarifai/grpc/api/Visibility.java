// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * <pre>
 * Visibility represents how visible the given resource is to other users.
 * When authenticating a request we can tell if a user is a collaborator or a teammate for the
 * the app that contains the resource and set their allowed visibility. We use that to restrict
 * what they are allowed to see:
 * If AllowedVisibility is PRIVATE then we allow PRIVATE (10), ORG (30), PUBLIC (50)
 * If AllowedVisibility is ORG then we allow ORG (30), PUBLIC (50)
 * If AllowedVisibility is PUBLIC then we allow PUBLIC (50) only.
 * </pre>
 *
 * Protobuf type {@code clarifai.api.Visibility}
 */
public final class Visibility extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.Visibility)
    VisibilityOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Visibility.newBuilder() to construct.
  private Visibility(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Visibility() {
    gettable_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Visibility();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Visibility(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();

            gettable_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Visibility_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Visibility_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.Visibility.class, com.clarifai.grpc.api.Visibility.Builder.class);
  }

  /**
   * <pre>
   * Gettable defined the level of access for GET operations for this resource.
   * </pre>
   *
   * Protobuf enum {@code clarifai.api.Visibility.Gettable}
   */
  public enum Gettable
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Default value not allowed.
     * </pre>
     *
     * <code>UNKNOWN_VISIBILITY = 0;</code>
     */
    UNKNOWN_VISIBILITY(0),
    /**
     * <pre>
     * PRIVATE requires collaborator or team permissions in order to GET this resource.
     * </pre>
     *
     * <code>PRIVATE = 10;</code>
     */
    PRIVATE(10),
    /**
     * <pre>
     * ORG requires you to be in the same org in order to GET this resource, but don't have to be a
     * teammate or collaborator.
     * </pre>
     *
     * <code>ORG = 30;</code>
     */
    ORG(30),
    /**
     * <pre>
     * PUBLIC opens up GET access to the resource to any user on the platform even if they are not
     * a teammate or collaborator.
     * </pre>
     *
     * <code>PUBLIC = 50;</code>
     */
    PUBLIC(50),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Default value not allowed.
     * </pre>
     *
     * <code>UNKNOWN_VISIBILITY = 0;</code>
     */
    public static final int UNKNOWN_VISIBILITY_VALUE = 0;
    /**
     * <pre>
     * PRIVATE requires collaborator or team permissions in order to GET this resource.
     * </pre>
     *
     * <code>PRIVATE = 10;</code>
     */
    public static final int PRIVATE_VALUE = 10;
    /**
     * <pre>
     * ORG requires you to be in the same org in order to GET this resource, but don't have to be a
     * teammate or collaborator.
     * </pre>
     *
     * <code>ORG = 30;</code>
     */
    public static final int ORG_VALUE = 30;
    /**
     * <pre>
     * PUBLIC opens up GET access to the resource to any user on the platform even if they are not
     * a teammate or collaborator.
     * </pre>
     *
     * <code>PUBLIC = 50;</code>
     */
    public static final int PUBLIC_VALUE = 50;


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
    public static Gettable valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Gettable forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN_VISIBILITY;
        case 10: return PRIVATE;
        case 30: return ORG;
        case 50: return PUBLIC;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Gettable>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Gettable> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Gettable>() {
            public Gettable findValueByNumber(int number) {
              return Gettable.forNumber(number);
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
      return com.clarifai.grpc.api.Visibility.getDescriptor().getEnumTypes().get(0);
    }

    private static final Gettable[] VALUES = values();

    public static Gettable valueOf(
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

    private Gettable(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:clarifai.api.Visibility.Gettable)
  }

  public static final int GETTABLE_FIELD_NUMBER = 1;
  private int gettable_;
  /**
   * <code>.clarifai.api.Visibility.Gettable gettable = 1;</code>
   * @return The enum numeric value on the wire for gettable.
   */
  @java.lang.Override public int getGettableValue() {
    return gettable_;
  }
  /**
   * <code>.clarifai.api.Visibility.Gettable gettable = 1;</code>
   * @return The gettable.
   */
  @java.lang.Override public com.clarifai.grpc.api.Visibility.Gettable getGettable() {
    @SuppressWarnings("deprecation")
    com.clarifai.grpc.api.Visibility.Gettable result = com.clarifai.grpc.api.Visibility.Gettable.valueOf(gettable_);
    return result == null ? com.clarifai.grpc.api.Visibility.Gettable.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (gettable_ != com.clarifai.grpc.api.Visibility.Gettable.UNKNOWN_VISIBILITY.getNumber()) {
      output.writeEnum(1, gettable_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (gettable_ != com.clarifai.grpc.api.Visibility.Gettable.UNKNOWN_VISIBILITY.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, gettable_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.clarifai.grpc.api.Visibility)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.Visibility other = (com.clarifai.grpc.api.Visibility) obj;

    if (gettable_ != other.gettable_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + GETTABLE_FIELD_NUMBER;
    hash = (53 * hash) + gettable_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.Visibility parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.Visibility parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Visibility parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.Visibility parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Visibility parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.Visibility parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Visibility parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.Visibility parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Visibility parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.Visibility parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Visibility parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.Visibility parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.clarifai.grpc.api.Visibility prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Visibility represents how visible the given resource is to other users.
   * When authenticating a request we can tell if a user is a collaborator or a teammate for the
   * the app that contains the resource and set their allowed visibility. We use that to restrict
   * what they are allowed to see:
   * If AllowedVisibility is PRIVATE then we allow PRIVATE (10), ORG (30), PUBLIC (50)
   * If AllowedVisibility is ORG then we allow ORG (30), PUBLIC (50)
   * If AllowedVisibility is PUBLIC then we allow PUBLIC (50) only.
   * </pre>
   *
   * Protobuf type {@code clarifai.api.Visibility}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.Visibility)
      com.clarifai.grpc.api.VisibilityOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Visibility_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Visibility_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.Visibility.class, com.clarifai.grpc.api.Visibility.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.Visibility.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      gettable_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Visibility_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.Visibility getDefaultInstanceForType() {
      return com.clarifai.grpc.api.Visibility.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.Visibility build() {
      com.clarifai.grpc.api.Visibility result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.Visibility buildPartial() {
      com.clarifai.grpc.api.Visibility result = new com.clarifai.grpc.api.Visibility(this);
      result.gettable_ = gettable_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.clarifai.grpc.api.Visibility) {
        return mergeFrom((com.clarifai.grpc.api.Visibility)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.Visibility other) {
      if (other == com.clarifai.grpc.api.Visibility.getDefaultInstance()) return this;
      if (other.gettable_ != 0) {
        setGettableValue(other.getGettableValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.clarifai.grpc.api.Visibility parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.Visibility) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int gettable_ = 0;
    /**
     * <code>.clarifai.api.Visibility.Gettable gettable = 1;</code>
     * @return The enum numeric value on the wire for gettable.
     */
    @java.lang.Override public int getGettableValue() {
      return gettable_;
    }
    /**
     * <code>.clarifai.api.Visibility.Gettable gettable = 1;</code>
     * @param value The enum numeric value on the wire for gettable to set.
     * @return This builder for chaining.
     */
    public Builder setGettableValue(int value) {
      
      gettable_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.clarifai.api.Visibility.Gettable gettable = 1;</code>
     * @return The gettable.
     */
    @java.lang.Override
    public com.clarifai.grpc.api.Visibility.Gettable getGettable() {
      @SuppressWarnings("deprecation")
      com.clarifai.grpc.api.Visibility.Gettable result = com.clarifai.grpc.api.Visibility.Gettable.valueOf(gettable_);
      return result == null ? com.clarifai.grpc.api.Visibility.Gettable.UNRECOGNIZED : result;
    }
    /**
     * <code>.clarifai.api.Visibility.Gettable gettable = 1;</code>
     * @param value The gettable to set.
     * @return This builder for chaining.
     */
    public Builder setGettable(com.clarifai.grpc.api.Visibility.Gettable value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      gettable_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.clarifai.api.Visibility.Gettable gettable = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGettable() {
      
      gettable_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:clarifai.api.Visibility)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.Visibility)
  private static final com.clarifai.grpc.api.Visibility DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.Visibility();
  }

  public static com.clarifai.grpc.api.Visibility getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Visibility>
      PARSER = new com.google.protobuf.AbstractParser<Visibility>() {
    @java.lang.Override
    public Visibility parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Visibility(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Visibility> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Visibility> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.Visibility getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

