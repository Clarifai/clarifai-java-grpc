// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * <pre>
 * The instance types that will be available in this pool of nodes.
 * Clarifai offers multiple different choices that combine cpu cores, memory and accelerator.
 * </pre>
 *
 * Protobuf type {@code clarifai.api.InstanceType}
 */
public final class InstanceType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.InstanceType)
    InstanceTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InstanceType.newBuilder() to construct.
  private InstanceType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InstanceType() {
    id_ = "";
    description_ = "";
    price_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InstanceType();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InstanceType(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            id_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            description_ = s;
            break;
          }
          case 26: {
            com.clarifai.grpc.api.ComputeInfo.Builder subBuilder = null;
            if (computeInfo_ != null) {
              subBuilder = computeInfo_.toBuilder();
            }
            computeInfo_ = input.readMessage(com.clarifai.grpc.api.ComputeInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(computeInfo_);
              computeInfo_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            price_ = s;
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
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_InstanceType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_InstanceType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.InstanceType.class, com.clarifai.grpc.api.InstanceType.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 2;
  private volatile java.lang.Object description_;
  /**
   * <pre>
   * Short description of instance type.
   * </pre>
   *
   * <code>string description = 2;</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Short description of instance type.
   * </pre>
   *
   * <code>string description = 2;</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COMPUTE_INFO_FIELD_NUMBER = 3;
  private com.clarifai.grpc.api.ComputeInfo computeInfo_;
  /**
   * <code>.clarifai.api.ComputeInfo compute_info = 3;</code>
   * @return Whether the computeInfo field is set.
   */
  @java.lang.Override
  public boolean hasComputeInfo() {
    return computeInfo_ != null;
  }
  /**
   * <code>.clarifai.api.ComputeInfo compute_info = 3;</code>
   * @return The computeInfo.
   */
  @java.lang.Override
  public com.clarifai.grpc.api.ComputeInfo getComputeInfo() {
    return computeInfo_ == null ? com.clarifai.grpc.api.ComputeInfo.getDefaultInstance() : computeInfo_;
  }
  /**
   * <code>.clarifai.api.ComputeInfo compute_info = 3;</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.ComputeInfoOrBuilder getComputeInfoOrBuilder() {
    return getComputeInfo();
  }

  public static final int PRICE_FIELD_NUMBER = 4;
  private volatile java.lang.Object price_;
  /**
   * <code>string price = 4;</code>
   * @return The price.
   */
  @java.lang.Override
  public java.lang.String getPrice() {
    java.lang.Object ref = price_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      price_ = s;
      return s;
    }
  }
  /**
   * <code>string price = 4;</code>
   * @return The bytes for price.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPriceBytes() {
    java.lang.Object ref = price_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      price_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, description_);
    }
    if (computeInfo_ != null) {
      output.writeMessage(3, getComputeInfo());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(price_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, price_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, description_);
    }
    if (computeInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getComputeInfo());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(price_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, price_);
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
    if (!(obj instanceof com.clarifai.grpc.api.InstanceType)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.InstanceType other = (com.clarifai.grpc.api.InstanceType) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (hasComputeInfo() != other.hasComputeInfo()) return false;
    if (hasComputeInfo()) {
      if (!getComputeInfo()
          .equals(other.getComputeInfo())) return false;
    }
    if (!getPrice()
        .equals(other.getPrice())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    if (hasComputeInfo()) {
      hash = (37 * hash) + COMPUTE_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getComputeInfo().hashCode();
    }
    hash = (37 * hash) + PRICE_FIELD_NUMBER;
    hash = (53 * hash) + getPrice().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.InstanceType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.InstanceType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.InstanceType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.InstanceType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.InstanceType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.InstanceType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.InstanceType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.InstanceType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.InstanceType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.InstanceType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.InstanceType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.InstanceType parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.InstanceType prototype) {
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
   * The instance types that will be available in this pool of nodes.
   * Clarifai offers multiple different choices that combine cpu cores, memory and accelerator.
   * </pre>
   *
   * Protobuf type {@code clarifai.api.InstanceType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.InstanceType)
      com.clarifai.grpc.api.InstanceTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_InstanceType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_InstanceType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.InstanceType.class, com.clarifai.grpc.api.InstanceType.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.InstanceType.newBuilder()
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
      id_ = "";

      description_ = "";

      if (computeInfoBuilder_ == null) {
        computeInfo_ = null;
      } else {
        computeInfo_ = null;
        computeInfoBuilder_ = null;
      }
      price_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_InstanceType_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.InstanceType getDefaultInstanceForType() {
      return com.clarifai.grpc.api.InstanceType.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.InstanceType build() {
      com.clarifai.grpc.api.InstanceType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.InstanceType buildPartial() {
      com.clarifai.grpc.api.InstanceType result = new com.clarifai.grpc.api.InstanceType(this);
      result.id_ = id_;
      result.description_ = description_;
      if (computeInfoBuilder_ == null) {
        result.computeInfo_ = computeInfo_;
      } else {
        result.computeInfo_ = computeInfoBuilder_.build();
      }
      result.price_ = price_;
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
      if (other instanceof com.clarifai.grpc.api.InstanceType) {
        return mergeFrom((com.clarifai.grpc.api.InstanceType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.InstanceType other) {
      if (other == com.clarifai.grpc.api.InstanceType.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      if (other.hasComputeInfo()) {
        mergeComputeInfo(other.getComputeInfo());
      }
      if (!other.getPrice().isEmpty()) {
        price_ = other.price_;
        onChanged();
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
      com.clarifai.grpc.api.InstanceType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.InstanceType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <pre>
     * Short description of instance type.
     * </pre>
     *
     * <code>string description = 2;</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Short description of instance type.
     * </pre>
     *
     * <code>string description = 2;</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Short description of instance type.
     * </pre>
     *
     * <code>string description = 2;</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Short description of instance type.
     * </pre>
     *
     * <code>string description = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Short description of instance type.
     * </pre>
     *
     * <code>string description = 2;</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      description_ = value;
      onChanged();
      return this;
    }

    private com.clarifai.grpc.api.ComputeInfo computeInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.ComputeInfo, com.clarifai.grpc.api.ComputeInfo.Builder, com.clarifai.grpc.api.ComputeInfoOrBuilder> computeInfoBuilder_;
    /**
     * <code>.clarifai.api.ComputeInfo compute_info = 3;</code>
     * @return Whether the computeInfo field is set.
     */
    public boolean hasComputeInfo() {
      return computeInfoBuilder_ != null || computeInfo_ != null;
    }
    /**
     * <code>.clarifai.api.ComputeInfo compute_info = 3;</code>
     * @return The computeInfo.
     */
    public com.clarifai.grpc.api.ComputeInfo getComputeInfo() {
      if (computeInfoBuilder_ == null) {
        return computeInfo_ == null ? com.clarifai.grpc.api.ComputeInfo.getDefaultInstance() : computeInfo_;
      } else {
        return computeInfoBuilder_.getMessage();
      }
    }
    /**
     * <code>.clarifai.api.ComputeInfo compute_info = 3;</code>
     */
    public Builder setComputeInfo(com.clarifai.grpc.api.ComputeInfo value) {
      if (computeInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        computeInfo_ = value;
        onChanged();
      } else {
        computeInfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.clarifai.api.ComputeInfo compute_info = 3;</code>
     */
    public Builder setComputeInfo(
        com.clarifai.grpc.api.ComputeInfo.Builder builderForValue) {
      if (computeInfoBuilder_ == null) {
        computeInfo_ = builderForValue.build();
        onChanged();
      } else {
        computeInfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.clarifai.api.ComputeInfo compute_info = 3;</code>
     */
    public Builder mergeComputeInfo(com.clarifai.grpc.api.ComputeInfo value) {
      if (computeInfoBuilder_ == null) {
        if (computeInfo_ != null) {
          computeInfo_ =
            com.clarifai.grpc.api.ComputeInfo.newBuilder(computeInfo_).mergeFrom(value).buildPartial();
        } else {
          computeInfo_ = value;
        }
        onChanged();
      } else {
        computeInfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.clarifai.api.ComputeInfo compute_info = 3;</code>
     */
    public Builder clearComputeInfo() {
      if (computeInfoBuilder_ == null) {
        computeInfo_ = null;
        onChanged();
      } else {
        computeInfo_ = null;
        computeInfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.clarifai.api.ComputeInfo compute_info = 3;</code>
     */
    public com.clarifai.grpc.api.ComputeInfo.Builder getComputeInfoBuilder() {
      
      onChanged();
      return getComputeInfoFieldBuilder().getBuilder();
    }
    /**
     * <code>.clarifai.api.ComputeInfo compute_info = 3;</code>
     */
    public com.clarifai.grpc.api.ComputeInfoOrBuilder getComputeInfoOrBuilder() {
      if (computeInfoBuilder_ != null) {
        return computeInfoBuilder_.getMessageOrBuilder();
      } else {
        return computeInfo_ == null ?
            com.clarifai.grpc.api.ComputeInfo.getDefaultInstance() : computeInfo_;
      }
    }
    /**
     * <code>.clarifai.api.ComputeInfo compute_info = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.ComputeInfo, com.clarifai.grpc.api.ComputeInfo.Builder, com.clarifai.grpc.api.ComputeInfoOrBuilder> 
        getComputeInfoFieldBuilder() {
      if (computeInfoBuilder_ == null) {
        computeInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.clarifai.grpc.api.ComputeInfo, com.clarifai.grpc.api.ComputeInfo.Builder, com.clarifai.grpc.api.ComputeInfoOrBuilder>(
                getComputeInfo(),
                getParentForChildren(),
                isClean());
        computeInfo_ = null;
      }
      return computeInfoBuilder_;
    }

    private java.lang.Object price_ = "";
    /**
     * <code>string price = 4;</code>
     * @return The price.
     */
    public java.lang.String getPrice() {
      java.lang.Object ref = price_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        price_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string price = 4;</code>
     * @return The bytes for price.
     */
    public com.google.protobuf.ByteString
        getPriceBytes() {
      java.lang.Object ref = price_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        price_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string price = 4;</code>
     * @param value The price to set.
     * @return This builder for chaining.
     */
    public Builder setPrice(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      price_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string price = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrice() {
      
      price_ = getDefaultInstance().getPrice();
      onChanged();
      return this;
    }
    /**
     * <code>string price = 4;</code>
     * @param value The bytes for price to set.
     * @return This builder for chaining.
     */
    public Builder setPriceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      price_ = value;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.InstanceType)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.InstanceType)
  private static final com.clarifai.grpc.api.InstanceType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.InstanceType();
  }

  public static com.clarifai.grpc.api.InstanceType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InstanceType>
      PARSER = new com.google.protobuf.AbstractParser<InstanceType>() {
    @java.lang.Override
    public InstanceType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InstanceType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InstanceType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstanceType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.InstanceType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

