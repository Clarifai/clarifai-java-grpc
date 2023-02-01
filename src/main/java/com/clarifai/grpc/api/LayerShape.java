// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * Protobuf type {@code clarifai.api.LayerShape}
 */
public final class LayerShape extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.LayerShape)
    LayerShapeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LayerShape.newBuilder() to construct.
  private LayerShape(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LayerShape() {
    dims_ = emptyIntList();
    maxDims_ = emptyIntList();
    dataType_ = 0;
    description_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LayerShape();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LayerShape(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              dims_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            dims_.addInt(input.readInt32());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              dims_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              dims_.addInt(input.readInt32());
            }
            input.popLimit(limit);
            break;
          }
          case 16: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              maxDims_ = newIntList();
              mutable_bitField0_ |= 0x00000002;
            }
            maxDims_.addInt(input.readInt32());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
              maxDims_ = newIntList();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              maxDims_.addInt(input.readInt32());
            }
            input.popLimit(limit);
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            dataType_ = rawValue;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            description_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        dims_.makeImmutable(); // C
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        maxDims_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_LayerShape_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_LayerShape_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.LayerShape.class, com.clarifai.grpc.api.LayerShape.Builder.class);
  }

  public static final int DIMS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.IntList dims_;
  /**
   * <pre>
   * Supported dimensions
   * Example: [-1,4] is a 2-dimensional array with the first dimension of variablesize, but second dimension with a static size: [[1,2,3,4],[4,5,6,7],...]
   * </pre>
   *
   * <code>repeated int32 dims = 1;</code>
   * @return A list containing the dims.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getDimsList() {
    return dims_;
  }
  /**
   * <pre>
   * Supported dimensions
   * Example: [-1,4] is a 2-dimensional array with the first dimension of variablesize, but second dimension with a static size: [[1,2,3,4],[4,5,6,7],...]
   * </pre>
   *
   * <code>repeated int32 dims = 1;</code>
   * @return The count of dims.
   */
  public int getDimsCount() {
    return dims_.size();
  }
  /**
   * <pre>
   * Supported dimensions
   * Example: [-1,4] is a 2-dimensional array with the first dimension of variablesize, but second dimension with a static size: [[1,2,3,4],[4,5,6,7],...]
   * </pre>
   *
   * <code>repeated int32 dims = 1;</code>
   * @param index The index of the element to return.
   * @return The dims at the given index.
   */
  public int getDims(int index) {
    return dims_.getInt(index);
  }
  private int dimsMemoizedSerializedSize = -1;

  public static final int MAX_DIMS_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.IntList maxDims_;
  /**
   * <pre>
   * Max dimension size, applicable to layers that can have flexible sizes.
   * </pre>
   *
   * <code>repeated int32 max_dims = 2;</code>
   * @return A list containing the maxDims.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getMaxDimsList() {
    return maxDims_;
  }
  /**
   * <pre>
   * Max dimension size, applicable to layers that can have flexible sizes.
   * </pre>
   *
   * <code>repeated int32 max_dims = 2;</code>
   * @return The count of maxDims.
   */
  public int getMaxDimsCount() {
    return maxDims_.size();
  }
  /**
   * <pre>
   * Max dimension size, applicable to layers that can have flexible sizes.
   * </pre>
   *
   * <code>repeated int32 max_dims = 2;</code>
   * @param index The index of the element to return.
   * @return The maxDims at the given index.
   */
  public int getMaxDims(int index) {
    return maxDims_.getInt(index);
  }
  private int maxDimsMemoizedSerializedSize = -1;

  public static final int DATA_TYPE_FIELD_NUMBER = 3;
  private int dataType_;
  /**
   * <pre>
   * The triton data type
   * </pre>
   *
   * <code>.clarifai.api.DataType data_type = 3;</code>
   * @return The enum numeric value on the wire for dataType.
   */
  @java.lang.Override public int getDataTypeValue() {
    return dataType_;
  }
  /**
   * <pre>
   * The triton data type
   * </pre>
   *
   * <code>.clarifai.api.DataType data_type = 3;</code>
   * @return The dataType.
   */
  @java.lang.Override public com.clarifai.grpc.api.DataType getDataType() {
    @SuppressWarnings("deprecation")
    com.clarifai.grpc.api.DataType result = com.clarifai.grpc.api.DataType.valueOf(dataType_);
    return result == null ? com.clarifai.grpc.api.DataType.UNRECOGNIZED : result;
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 4;
  private volatile java.lang.Object description_;
  /**
   * <pre>
   * Description about the dimensions
   * </pre>
   *
   * <code>string description = 4;</code>
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
   * Description about the dimensions
   * </pre>
   *
   * <code>string description = 4;</code>
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
    getSerializedSize();
    if (getDimsList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(dimsMemoizedSerializedSize);
    }
    for (int i = 0; i < dims_.size(); i++) {
      output.writeInt32NoTag(dims_.getInt(i));
    }
    if (getMaxDimsList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(maxDimsMemoizedSerializedSize);
    }
    for (int i = 0; i < maxDims_.size(); i++) {
      output.writeInt32NoTag(maxDims_.getInt(i));
    }
    if (dataType_ != com.clarifai.grpc.api.DataType.UNDEFINED.getNumber()) {
      output.writeEnum(3, dataType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, description_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < dims_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(dims_.getInt(i));
      }
      size += dataSize;
      if (!getDimsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      dimsMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      for (int i = 0; i < maxDims_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(maxDims_.getInt(i));
      }
      size += dataSize;
      if (!getMaxDimsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      maxDimsMemoizedSerializedSize = dataSize;
    }
    if (dataType_ != com.clarifai.grpc.api.DataType.UNDEFINED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, dataType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, description_);
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
    if (!(obj instanceof com.clarifai.grpc.api.LayerShape)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.LayerShape other = (com.clarifai.grpc.api.LayerShape) obj;

    if (!getDimsList()
        .equals(other.getDimsList())) return false;
    if (!getMaxDimsList()
        .equals(other.getMaxDimsList())) return false;
    if (dataType_ != other.dataType_) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
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
    if (getDimsCount() > 0) {
      hash = (37 * hash) + DIMS_FIELD_NUMBER;
      hash = (53 * hash) + getDimsList().hashCode();
    }
    if (getMaxDimsCount() > 0) {
      hash = (37 * hash) + MAX_DIMS_FIELD_NUMBER;
      hash = (53 * hash) + getMaxDimsList().hashCode();
    }
    hash = (37 * hash) + DATA_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + dataType_;
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.LayerShape parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.LayerShape parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.LayerShape parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.LayerShape parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.LayerShape parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.LayerShape parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.LayerShape parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.LayerShape parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.LayerShape parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.LayerShape parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.LayerShape parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.LayerShape parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.LayerShape prototype) {
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
   * Protobuf type {@code clarifai.api.LayerShape}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.LayerShape)
      com.clarifai.grpc.api.LayerShapeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_LayerShape_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_LayerShape_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.LayerShape.class, com.clarifai.grpc.api.LayerShape.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.LayerShape.newBuilder()
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
      dims_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      maxDims_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
      dataType_ = 0;

      description_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_LayerShape_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.LayerShape getDefaultInstanceForType() {
      return com.clarifai.grpc.api.LayerShape.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.LayerShape build() {
      com.clarifai.grpc.api.LayerShape result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.LayerShape buildPartial() {
      com.clarifai.grpc.api.LayerShape result = new com.clarifai.grpc.api.LayerShape(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        dims_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.dims_ = dims_;
      if (((bitField0_ & 0x00000002) != 0)) {
        maxDims_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.maxDims_ = maxDims_;
      result.dataType_ = dataType_;
      result.description_ = description_;
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
      if (other instanceof com.clarifai.grpc.api.LayerShape) {
        return mergeFrom((com.clarifai.grpc.api.LayerShape)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.LayerShape other) {
      if (other == com.clarifai.grpc.api.LayerShape.getDefaultInstance()) return this;
      if (!other.dims_.isEmpty()) {
        if (dims_.isEmpty()) {
          dims_ = other.dims_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureDimsIsMutable();
          dims_.addAll(other.dims_);
        }
        onChanged();
      }
      if (!other.maxDims_.isEmpty()) {
        if (maxDims_.isEmpty()) {
          maxDims_ = other.maxDims_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureMaxDimsIsMutable();
          maxDims_.addAll(other.maxDims_);
        }
        onChanged();
      }
      if (other.dataType_ != 0) {
        setDataTypeValue(other.getDataTypeValue());
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
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
      com.clarifai.grpc.api.LayerShape parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.LayerShape) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.IntList dims_ = emptyIntList();
    private void ensureDimsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        dims_ = mutableCopy(dims_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * Supported dimensions
     * Example: [-1,4] is a 2-dimensional array with the first dimension of variablesize, but second dimension with a static size: [[1,2,3,4],[4,5,6,7],...]
     * </pre>
     *
     * <code>repeated int32 dims = 1;</code>
     * @return A list containing the dims.
     */
    public java.util.List<java.lang.Integer>
        getDimsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(dims_) : dims_;
    }
    /**
     * <pre>
     * Supported dimensions
     * Example: [-1,4] is a 2-dimensional array with the first dimension of variablesize, but second dimension with a static size: [[1,2,3,4],[4,5,6,7],...]
     * </pre>
     *
     * <code>repeated int32 dims = 1;</code>
     * @return The count of dims.
     */
    public int getDimsCount() {
      return dims_.size();
    }
    /**
     * <pre>
     * Supported dimensions
     * Example: [-1,4] is a 2-dimensional array with the first dimension of variablesize, but second dimension with a static size: [[1,2,3,4],[4,5,6,7],...]
     * </pre>
     *
     * <code>repeated int32 dims = 1;</code>
     * @param index The index of the element to return.
     * @return The dims at the given index.
     */
    public int getDims(int index) {
      return dims_.getInt(index);
    }
    /**
     * <pre>
     * Supported dimensions
     * Example: [-1,4] is a 2-dimensional array with the first dimension of variablesize, but second dimension with a static size: [[1,2,3,4],[4,5,6,7],...]
     * </pre>
     *
     * <code>repeated int32 dims = 1;</code>
     * @param index The index to set the value at.
     * @param value The dims to set.
     * @return This builder for chaining.
     */
    public Builder setDims(
        int index, int value) {
      ensureDimsIsMutable();
      dims_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Supported dimensions
     * Example: [-1,4] is a 2-dimensional array with the first dimension of variablesize, but second dimension with a static size: [[1,2,3,4],[4,5,6,7],...]
     * </pre>
     *
     * <code>repeated int32 dims = 1;</code>
     * @param value The dims to add.
     * @return This builder for chaining.
     */
    public Builder addDims(int value) {
      ensureDimsIsMutable();
      dims_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Supported dimensions
     * Example: [-1,4] is a 2-dimensional array with the first dimension of variablesize, but second dimension with a static size: [[1,2,3,4],[4,5,6,7],...]
     * </pre>
     *
     * <code>repeated int32 dims = 1;</code>
     * @param values The dims to add.
     * @return This builder for chaining.
     */
    public Builder addAllDims(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureDimsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, dims_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Supported dimensions
     * Example: [-1,4] is a 2-dimensional array with the first dimension of variablesize, but second dimension with a static size: [[1,2,3,4],[4,5,6,7],...]
     * </pre>
     *
     * <code>repeated int32 dims = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDims() {
      dims_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList maxDims_ = emptyIntList();
    private void ensureMaxDimsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        maxDims_ = mutableCopy(maxDims_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     * Max dimension size, applicable to layers that can have flexible sizes.
     * </pre>
     *
     * <code>repeated int32 max_dims = 2;</code>
     * @return A list containing the maxDims.
     */
    public java.util.List<java.lang.Integer>
        getMaxDimsList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(maxDims_) : maxDims_;
    }
    /**
     * <pre>
     * Max dimension size, applicable to layers that can have flexible sizes.
     * </pre>
     *
     * <code>repeated int32 max_dims = 2;</code>
     * @return The count of maxDims.
     */
    public int getMaxDimsCount() {
      return maxDims_.size();
    }
    /**
     * <pre>
     * Max dimension size, applicable to layers that can have flexible sizes.
     * </pre>
     *
     * <code>repeated int32 max_dims = 2;</code>
     * @param index The index of the element to return.
     * @return The maxDims at the given index.
     */
    public int getMaxDims(int index) {
      return maxDims_.getInt(index);
    }
    /**
     * <pre>
     * Max dimension size, applicable to layers that can have flexible sizes.
     * </pre>
     *
     * <code>repeated int32 max_dims = 2;</code>
     * @param index The index to set the value at.
     * @param value The maxDims to set.
     * @return This builder for chaining.
     */
    public Builder setMaxDims(
        int index, int value) {
      ensureMaxDimsIsMutable();
      maxDims_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Max dimension size, applicable to layers that can have flexible sizes.
     * </pre>
     *
     * <code>repeated int32 max_dims = 2;</code>
     * @param value The maxDims to add.
     * @return This builder for chaining.
     */
    public Builder addMaxDims(int value) {
      ensureMaxDimsIsMutable();
      maxDims_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Max dimension size, applicable to layers that can have flexible sizes.
     * </pre>
     *
     * <code>repeated int32 max_dims = 2;</code>
     * @param values The maxDims to add.
     * @return This builder for chaining.
     */
    public Builder addAllMaxDims(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureMaxDimsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, maxDims_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Max dimension size, applicable to layers that can have flexible sizes.
     * </pre>
     *
     * <code>repeated int32 max_dims = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxDims() {
      maxDims_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    private int dataType_ = 0;
    /**
     * <pre>
     * The triton data type
     * </pre>
     *
     * <code>.clarifai.api.DataType data_type = 3;</code>
     * @return The enum numeric value on the wire for dataType.
     */
    @java.lang.Override public int getDataTypeValue() {
      return dataType_;
    }
    /**
     * <pre>
     * The triton data type
     * </pre>
     *
     * <code>.clarifai.api.DataType data_type = 3;</code>
     * @param value The enum numeric value on the wire for dataType to set.
     * @return This builder for chaining.
     */
    public Builder setDataTypeValue(int value) {
      
      dataType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The triton data type
     * </pre>
     *
     * <code>.clarifai.api.DataType data_type = 3;</code>
     * @return The dataType.
     */
    @java.lang.Override
    public com.clarifai.grpc.api.DataType getDataType() {
      @SuppressWarnings("deprecation")
      com.clarifai.grpc.api.DataType result = com.clarifai.grpc.api.DataType.valueOf(dataType_);
      return result == null ? com.clarifai.grpc.api.DataType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The triton data type
     * </pre>
     *
     * <code>.clarifai.api.DataType data_type = 3;</code>
     * @param value The dataType to set.
     * @return This builder for chaining.
     */
    public Builder setDataType(com.clarifai.grpc.api.DataType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      dataType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The triton data type
     * </pre>
     *
     * <code>.clarifai.api.DataType data_type = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDataType() {
      
      dataType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <pre>
     * Description about the dimensions
     * </pre>
     *
     * <code>string description = 4;</code>
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
     * Description about the dimensions
     * </pre>
     *
     * <code>string description = 4;</code>
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
     * Description about the dimensions
     * </pre>
     *
     * <code>string description = 4;</code>
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
     * Description about the dimensions
     * </pre>
     *
     * <code>string description = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Description about the dimensions
     * </pre>
     *
     * <code>string description = 4;</code>
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.LayerShape)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.LayerShape)
  private static final com.clarifai.grpc.api.LayerShape DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.LayerShape();
  }

  public static com.clarifai.grpc.api.LayerShape getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LayerShape>
      PARSER = new com.google.protobuf.AbstractParser<LayerShape>() {
    @java.lang.Override
    public LayerShape parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LayerShape(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LayerShape> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LayerShape> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.LayerShape getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
