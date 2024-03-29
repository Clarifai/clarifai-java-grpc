// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * <pre>
 * PrecisionRecallCurve
 * </pre>
 *
 * Protobuf type {@code clarifai.api.PrecisionRecallCurve}
 */
public final class PrecisionRecallCurve extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.PrecisionRecallCurve)
    PrecisionRecallCurveOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PrecisionRecallCurve.newBuilder() to construct.
  private PrecisionRecallCurve(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PrecisionRecallCurve() {
    recall_ = emptyFloatList();
    precision_ = emptyFloatList();
    thresholds_ = emptyFloatList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PrecisionRecallCurve();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PrecisionRecallCurve(
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
          case 13: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              recall_ = newFloatList();
              mutable_bitField0_ |= 0x00000001;
            }
            recall_.addFloat(input.readFloat());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              recall_ = newFloatList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              recall_.addFloat(input.readFloat());
            }
            input.popLimit(limit);
            break;
          }
          case 21: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              precision_ = newFloatList();
              mutable_bitField0_ |= 0x00000002;
            }
            precision_.addFloat(input.readFloat());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
              precision_ = newFloatList();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              precision_.addFloat(input.readFloat());
            }
            input.popLimit(limit);
            break;
          }
          case 29: {
            if (!((mutable_bitField0_ & 0x00000004) != 0)) {
              thresholds_ = newFloatList();
              mutable_bitField0_ |= 0x00000004;
            }
            thresholds_.addFloat(input.readFloat());
            break;
          }
          case 26: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000004) != 0) && input.getBytesUntilLimit() > 0) {
              thresholds_ = newFloatList();
              mutable_bitField0_ |= 0x00000004;
            }
            while (input.getBytesUntilLimit() > 0) {
              thresholds_.addFloat(input.readFloat());
            }
            input.popLimit(limit);
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
        recall_.makeImmutable(); // C
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        precision_.makeImmutable(); // C
      }
      if (((mutable_bitField0_ & 0x00000004) != 0)) {
        thresholds_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_PrecisionRecallCurve_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_PrecisionRecallCurve_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.PrecisionRecallCurve.class, com.clarifai.grpc.api.PrecisionRecallCurve.Builder.class);
  }

  public static final int RECALL_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.FloatList recall_;
  /**
   * <code>repeated float recall = 1 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return A list containing the recall.
   */
  @java.lang.Override
  public java.util.List<java.lang.Float>
      getRecallList() {
    return recall_;
  }
  /**
   * <code>repeated float recall = 1 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The count of recall.
   */
  public int getRecallCount() {
    return recall_.size();
  }
  /**
   * <code>repeated float recall = 1 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @param index The index of the element to return.
   * @return The recall at the given index.
   */
  public float getRecall(int index) {
    return recall_.getFloat(index);
  }
  private int recallMemoizedSerializedSize = -1;

  public static final int PRECISION_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.FloatList precision_;
  /**
   * <code>repeated float precision = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return A list containing the precision.
   */
  @java.lang.Override
  public java.util.List<java.lang.Float>
      getPrecisionList() {
    return precision_;
  }
  /**
   * <code>repeated float precision = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The count of precision.
   */
  public int getPrecisionCount() {
    return precision_.size();
  }
  /**
   * <code>repeated float precision = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @param index The index of the element to return.
   * @return The precision at the given index.
   */
  public float getPrecision(int index) {
    return precision_.getFloat(index);
  }
  private int precisionMemoizedSerializedSize = -1;

  public static final int THRESHOLDS_FIELD_NUMBER = 3;
  private com.google.protobuf.Internal.FloatList thresholds_;
  /**
   * <code>repeated float thresholds = 3 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return A list containing the thresholds.
   */
  @java.lang.Override
  public java.util.List<java.lang.Float>
      getThresholdsList() {
    return thresholds_;
  }
  /**
   * <code>repeated float thresholds = 3 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The count of thresholds.
   */
  public int getThresholdsCount() {
    return thresholds_.size();
  }
  /**
   * <code>repeated float thresholds = 3 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @param index The index of the element to return.
   * @return The thresholds at the given index.
   */
  public float getThresholds(int index) {
    return thresholds_.getFloat(index);
  }
  private int thresholdsMemoizedSerializedSize = -1;

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
    if (getRecallList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(recallMemoizedSerializedSize);
    }
    for (int i = 0; i < recall_.size(); i++) {
      output.writeFloatNoTag(recall_.getFloat(i));
    }
    if (getPrecisionList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(precisionMemoizedSerializedSize);
    }
    for (int i = 0; i < precision_.size(); i++) {
      output.writeFloatNoTag(precision_.getFloat(i));
    }
    if (getThresholdsList().size() > 0) {
      output.writeUInt32NoTag(26);
      output.writeUInt32NoTag(thresholdsMemoizedSerializedSize);
    }
    for (int i = 0; i < thresholds_.size(); i++) {
      output.writeFloatNoTag(thresholds_.getFloat(i));
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
      dataSize = 4 * getRecallList().size();
      size += dataSize;
      if (!getRecallList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      recallMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      dataSize = 4 * getPrecisionList().size();
      size += dataSize;
      if (!getPrecisionList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      precisionMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      dataSize = 4 * getThresholdsList().size();
      size += dataSize;
      if (!getThresholdsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      thresholdsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.clarifai.grpc.api.PrecisionRecallCurve)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.PrecisionRecallCurve other = (com.clarifai.grpc.api.PrecisionRecallCurve) obj;

    if (!getRecallList()
        .equals(other.getRecallList())) return false;
    if (!getPrecisionList()
        .equals(other.getPrecisionList())) return false;
    if (!getThresholdsList()
        .equals(other.getThresholdsList())) return false;
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
    if (getRecallCount() > 0) {
      hash = (37 * hash) + RECALL_FIELD_NUMBER;
      hash = (53 * hash) + getRecallList().hashCode();
    }
    if (getPrecisionCount() > 0) {
      hash = (37 * hash) + PRECISION_FIELD_NUMBER;
      hash = (53 * hash) + getPrecisionList().hashCode();
    }
    if (getThresholdsCount() > 0) {
      hash = (37 * hash) + THRESHOLDS_FIELD_NUMBER;
      hash = (53 * hash) + getThresholdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.PrecisionRecallCurve parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.PrecisionRecallCurve parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PrecisionRecallCurve parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.PrecisionRecallCurve parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PrecisionRecallCurve parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.PrecisionRecallCurve parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PrecisionRecallCurve parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.PrecisionRecallCurve parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PrecisionRecallCurve parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.PrecisionRecallCurve parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PrecisionRecallCurve parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.PrecisionRecallCurve parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.PrecisionRecallCurve prototype) {
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
   * PrecisionRecallCurve
   * </pre>
   *
   * Protobuf type {@code clarifai.api.PrecisionRecallCurve}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.PrecisionRecallCurve)
      com.clarifai.grpc.api.PrecisionRecallCurveOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_PrecisionRecallCurve_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_PrecisionRecallCurve_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.PrecisionRecallCurve.class, com.clarifai.grpc.api.PrecisionRecallCurve.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.PrecisionRecallCurve.newBuilder()
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
      recall_ = emptyFloatList();
      bitField0_ = (bitField0_ & ~0x00000001);
      precision_ = emptyFloatList();
      bitField0_ = (bitField0_ & ~0x00000002);
      thresholds_ = emptyFloatList();
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_PrecisionRecallCurve_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.PrecisionRecallCurve getDefaultInstanceForType() {
      return com.clarifai.grpc.api.PrecisionRecallCurve.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.PrecisionRecallCurve build() {
      com.clarifai.grpc.api.PrecisionRecallCurve result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.PrecisionRecallCurve buildPartial() {
      com.clarifai.grpc.api.PrecisionRecallCurve result = new com.clarifai.grpc.api.PrecisionRecallCurve(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        recall_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.recall_ = recall_;
      if (((bitField0_ & 0x00000002) != 0)) {
        precision_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.precision_ = precision_;
      if (((bitField0_ & 0x00000004) != 0)) {
        thresholds_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.thresholds_ = thresholds_;
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
      if (other instanceof com.clarifai.grpc.api.PrecisionRecallCurve) {
        return mergeFrom((com.clarifai.grpc.api.PrecisionRecallCurve)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.PrecisionRecallCurve other) {
      if (other == com.clarifai.grpc.api.PrecisionRecallCurve.getDefaultInstance()) return this;
      if (!other.recall_.isEmpty()) {
        if (recall_.isEmpty()) {
          recall_ = other.recall_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureRecallIsMutable();
          recall_.addAll(other.recall_);
        }
        onChanged();
      }
      if (!other.precision_.isEmpty()) {
        if (precision_.isEmpty()) {
          precision_ = other.precision_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensurePrecisionIsMutable();
          precision_.addAll(other.precision_);
        }
        onChanged();
      }
      if (!other.thresholds_.isEmpty()) {
        if (thresholds_.isEmpty()) {
          thresholds_ = other.thresholds_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureThresholdsIsMutable();
          thresholds_.addAll(other.thresholds_);
        }
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
      com.clarifai.grpc.api.PrecisionRecallCurve parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.PrecisionRecallCurve) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.FloatList recall_ = emptyFloatList();
    private void ensureRecallIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        recall_ = mutableCopy(recall_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated float recall = 1 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @return A list containing the recall.
     */
    public java.util.List<java.lang.Float>
        getRecallList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(recall_) : recall_;
    }
    /**
     * <code>repeated float recall = 1 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @return The count of recall.
     */
    public int getRecallCount() {
      return recall_.size();
    }
    /**
     * <code>repeated float recall = 1 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @param index The index of the element to return.
     * @return The recall at the given index.
     */
    public float getRecall(int index) {
      return recall_.getFloat(index);
    }
    /**
     * <code>repeated float recall = 1 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @param index The index to set the value at.
     * @param value The recall to set.
     * @return This builder for chaining.
     */
    public Builder setRecall(
        int index, float value) {
      ensureRecallIsMutable();
      recall_.setFloat(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float recall = 1 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @param value The recall to add.
     * @return This builder for chaining.
     */
    public Builder addRecall(float value) {
      ensureRecallIsMutable();
      recall_.addFloat(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float recall = 1 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @param values The recall to add.
     * @return This builder for chaining.
     */
    public Builder addAllRecall(
        java.lang.Iterable<? extends java.lang.Float> values) {
      ensureRecallIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, recall_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float recall = 1 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @return This builder for chaining.
     */
    public Builder clearRecall() {
      recall_ = emptyFloatList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.FloatList precision_ = emptyFloatList();
    private void ensurePrecisionIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        precision_ = mutableCopy(precision_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated float precision = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @return A list containing the precision.
     */
    public java.util.List<java.lang.Float>
        getPrecisionList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(precision_) : precision_;
    }
    /**
     * <code>repeated float precision = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @return The count of precision.
     */
    public int getPrecisionCount() {
      return precision_.size();
    }
    /**
     * <code>repeated float precision = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @param index The index of the element to return.
     * @return The precision at the given index.
     */
    public float getPrecision(int index) {
      return precision_.getFloat(index);
    }
    /**
     * <code>repeated float precision = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @param index The index to set the value at.
     * @param value The precision to set.
     * @return This builder for chaining.
     */
    public Builder setPrecision(
        int index, float value) {
      ensurePrecisionIsMutable();
      precision_.setFloat(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float precision = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @param value The precision to add.
     * @return This builder for chaining.
     */
    public Builder addPrecision(float value) {
      ensurePrecisionIsMutable();
      precision_.addFloat(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float precision = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @param values The precision to add.
     * @return This builder for chaining.
     */
    public Builder addAllPrecision(
        java.lang.Iterable<? extends java.lang.Float> values) {
      ensurePrecisionIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, precision_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float precision = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @return This builder for chaining.
     */
    public Builder clearPrecision() {
      precision_ = emptyFloatList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.FloatList thresholds_ = emptyFloatList();
    private void ensureThresholdsIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        thresholds_ = mutableCopy(thresholds_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <code>repeated float thresholds = 3 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @return A list containing the thresholds.
     */
    public java.util.List<java.lang.Float>
        getThresholdsList() {
      return ((bitField0_ & 0x00000004) != 0) ?
               java.util.Collections.unmodifiableList(thresholds_) : thresholds_;
    }
    /**
     * <code>repeated float thresholds = 3 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @return The count of thresholds.
     */
    public int getThresholdsCount() {
      return thresholds_.size();
    }
    /**
     * <code>repeated float thresholds = 3 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @param index The index of the element to return.
     * @return The thresholds at the given index.
     */
    public float getThresholds(int index) {
      return thresholds_.getFloat(index);
    }
    /**
     * <code>repeated float thresholds = 3 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @param index The index to set the value at.
     * @param value The thresholds to set.
     * @return This builder for chaining.
     */
    public Builder setThresholds(
        int index, float value) {
      ensureThresholdsIsMutable();
      thresholds_.setFloat(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float thresholds = 3 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @param value The thresholds to add.
     * @return This builder for chaining.
     */
    public Builder addThresholds(float value) {
      ensureThresholdsIsMutable();
      thresholds_.addFloat(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float thresholds = 3 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @param values The thresholds to add.
     * @return This builder for chaining.
     */
    public Builder addAllThresholds(
        java.lang.Iterable<? extends java.lang.Float> values) {
      ensureThresholdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, thresholds_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float thresholds = 3 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @return This builder for chaining.
     */
    public Builder clearThresholds() {
      thresholds_ = emptyFloatList();
      bitField0_ = (bitField0_ & ~0x00000004);
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.PrecisionRecallCurve)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.PrecisionRecallCurve)
  private static final com.clarifai.grpc.api.PrecisionRecallCurve DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.PrecisionRecallCurve();
  }

  public static com.clarifai.grpc.api.PrecisionRecallCurve getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PrecisionRecallCurve>
      PARSER = new com.google.protobuf.AbstractParser<PrecisionRecallCurve>() {
    @java.lang.Override
    public PrecisionRecallCurve parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PrecisionRecallCurve(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PrecisionRecallCurve> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PrecisionRecallCurve> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.PrecisionRecallCurve getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

