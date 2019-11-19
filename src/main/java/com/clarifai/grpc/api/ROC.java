// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * Protobuf type {@code clarifai.api.ROC}
 */
public  final class ROC extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.ROC)
    ROCOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ROC.newBuilder() to construct.
  private ROC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ROC() {
    fpr_ = emptyFloatList();
    tpr_ = emptyFloatList();
    thresholds_ = emptyFloatList();
    fprPerImage_ = emptyFloatList();
    fprPerObject_ = emptyFloatList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ROC();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ROC(
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
              fpr_ = newFloatList();
              mutable_bitField0_ |= 0x00000001;
            }
            fpr_.addFloat(input.readFloat());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              fpr_ = newFloatList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              fpr_.addFloat(input.readFloat());
            }
            input.popLimit(limit);
            break;
          }
          case 21: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              tpr_ = newFloatList();
              mutable_bitField0_ |= 0x00000002;
            }
            tpr_.addFloat(input.readFloat());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
              tpr_ = newFloatList();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              tpr_.addFloat(input.readFloat());
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
          case 37: {
            if (!((mutable_bitField0_ & 0x00000008) != 0)) {
              fprPerImage_ = newFloatList();
              mutable_bitField0_ |= 0x00000008;
            }
            fprPerImage_.addFloat(input.readFloat());
            break;
          }
          case 34: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000008) != 0) && input.getBytesUntilLimit() > 0) {
              fprPerImage_ = newFloatList();
              mutable_bitField0_ |= 0x00000008;
            }
            while (input.getBytesUntilLimit() > 0) {
              fprPerImage_.addFloat(input.readFloat());
            }
            input.popLimit(limit);
            break;
          }
          case 45: {
            if (!((mutable_bitField0_ & 0x00000010) != 0)) {
              fprPerObject_ = newFloatList();
              mutable_bitField0_ |= 0x00000010;
            }
            fprPerObject_.addFloat(input.readFloat());
            break;
          }
          case 42: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000010) != 0) && input.getBytesUntilLimit() > 0) {
              fprPerObject_ = newFloatList();
              mutable_bitField0_ |= 0x00000010;
            }
            while (input.getBytesUntilLimit() > 0) {
              fprPerObject_.addFloat(input.readFloat());
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
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        fpr_.makeImmutable(); // C
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        tpr_.makeImmutable(); // C
      }
      if (((mutable_bitField0_ & 0x00000004) != 0)) {
        thresholds_.makeImmutable(); // C
      }
      if (((mutable_bitField0_ & 0x00000008) != 0)) {
        fprPerImage_.makeImmutable(); // C
      }
      if (((mutable_bitField0_ & 0x00000010) != 0)) {
        fprPerObject_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_ROC_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_ROC_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.ROC.class, com.clarifai.grpc.api.ROC.Builder.class);
  }

  public static final int FPR_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.FloatList fpr_;
  /**
   * <code>repeated float fpr = 1 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  public java.util.List<java.lang.Float>
      getFprList() {
    return fpr_;
  }
  /**
   * <code>repeated float fpr = 1 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  public int getFprCount() {
    return fpr_.size();
  }
  /**
   * <code>repeated float fpr = 1 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  public float getFpr(int index) {
    return fpr_.getFloat(index);
  }
  private int fprMemoizedSerializedSize = -1;

  public static final int TPR_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.FloatList tpr_;
  /**
   * <code>repeated float tpr = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  public java.util.List<java.lang.Float>
      getTprList() {
    return tpr_;
  }
  /**
   * <code>repeated float tpr = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  public int getTprCount() {
    return tpr_.size();
  }
  /**
   * <code>repeated float tpr = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  public float getTpr(int index) {
    return tpr_.getFloat(index);
  }
  private int tprMemoizedSerializedSize = -1;

  public static final int THRESHOLDS_FIELD_NUMBER = 3;
  private com.google.protobuf.Internal.FloatList thresholds_;
  /**
   * <code>repeated float thresholds = 3 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  public java.util.List<java.lang.Float>
      getThresholdsList() {
    return thresholds_;
  }
  /**
   * <code>repeated float thresholds = 3 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  public int getThresholdsCount() {
    return thresholds_.size();
  }
  /**
   * <code>repeated float thresholds = 3 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  public float getThresholds(int index) {
    return thresholds_.getFloat(index);
  }
  private int thresholdsMemoizedSerializedSize = -1;

  public static final int FPR_PER_IMAGE_FIELD_NUMBER = 4;
  private com.google.protobuf.Internal.FloatList fprPerImage_;
  /**
   * <code>repeated float fpr_per_image = 4;</code>
   */
  public java.util.List<java.lang.Float>
      getFprPerImageList() {
    return fprPerImage_;
  }
  /**
   * <code>repeated float fpr_per_image = 4;</code>
   */
  public int getFprPerImageCount() {
    return fprPerImage_.size();
  }
  /**
   * <code>repeated float fpr_per_image = 4;</code>
   */
  public float getFprPerImage(int index) {
    return fprPerImage_.getFloat(index);
  }
  private int fprPerImageMemoizedSerializedSize = -1;

  public static final int FPR_PER_OBJECT_FIELD_NUMBER = 5;
  private com.google.protobuf.Internal.FloatList fprPerObject_;
  /**
   * <code>repeated float fpr_per_object = 5;</code>
   */
  public java.util.List<java.lang.Float>
      getFprPerObjectList() {
    return fprPerObject_;
  }
  /**
   * <code>repeated float fpr_per_object = 5;</code>
   */
  public int getFprPerObjectCount() {
    return fprPerObject_.size();
  }
  /**
   * <code>repeated float fpr_per_object = 5;</code>
   */
  public float getFprPerObject(int index) {
    return fprPerObject_.getFloat(index);
  }
  private int fprPerObjectMemoizedSerializedSize = -1;

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
    if (getFprList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(fprMemoizedSerializedSize);
    }
    for (int i = 0; i < fpr_.size(); i++) {
      output.writeFloatNoTag(fpr_.getFloat(i));
    }
    if (getTprList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(tprMemoizedSerializedSize);
    }
    for (int i = 0; i < tpr_.size(); i++) {
      output.writeFloatNoTag(tpr_.getFloat(i));
    }
    if (getThresholdsList().size() > 0) {
      output.writeUInt32NoTag(26);
      output.writeUInt32NoTag(thresholdsMemoizedSerializedSize);
    }
    for (int i = 0; i < thresholds_.size(); i++) {
      output.writeFloatNoTag(thresholds_.getFloat(i));
    }
    if (getFprPerImageList().size() > 0) {
      output.writeUInt32NoTag(34);
      output.writeUInt32NoTag(fprPerImageMemoizedSerializedSize);
    }
    for (int i = 0; i < fprPerImage_.size(); i++) {
      output.writeFloatNoTag(fprPerImage_.getFloat(i));
    }
    if (getFprPerObjectList().size() > 0) {
      output.writeUInt32NoTag(42);
      output.writeUInt32NoTag(fprPerObjectMemoizedSerializedSize);
    }
    for (int i = 0; i < fprPerObject_.size(); i++) {
      output.writeFloatNoTag(fprPerObject_.getFloat(i));
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
      dataSize = 4 * getFprList().size();
      size += dataSize;
      if (!getFprList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      fprMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      dataSize = 4 * getTprList().size();
      size += dataSize;
      if (!getTprList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      tprMemoizedSerializedSize = dataSize;
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
    {
      int dataSize = 0;
      dataSize = 4 * getFprPerImageList().size();
      size += dataSize;
      if (!getFprPerImageList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      fprPerImageMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      dataSize = 4 * getFprPerObjectList().size();
      size += dataSize;
      if (!getFprPerObjectList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      fprPerObjectMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.clarifai.grpc.api.ROC)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.ROC other = (com.clarifai.grpc.api.ROC) obj;

    if (!getFprList()
        .equals(other.getFprList())) return false;
    if (!getTprList()
        .equals(other.getTprList())) return false;
    if (!getThresholdsList()
        .equals(other.getThresholdsList())) return false;
    if (!getFprPerImageList()
        .equals(other.getFprPerImageList())) return false;
    if (!getFprPerObjectList()
        .equals(other.getFprPerObjectList())) return false;
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
    if (getFprCount() > 0) {
      hash = (37 * hash) + FPR_FIELD_NUMBER;
      hash = (53 * hash) + getFprList().hashCode();
    }
    if (getTprCount() > 0) {
      hash = (37 * hash) + TPR_FIELD_NUMBER;
      hash = (53 * hash) + getTprList().hashCode();
    }
    if (getThresholdsCount() > 0) {
      hash = (37 * hash) + THRESHOLDS_FIELD_NUMBER;
      hash = (53 * hash) + getThresholdsList().hashCode();
    }
    if (getFprPerImageCount() > 0) {
      hash = (37 * hash) + FPR_PER_IMAGE_FIELD_NUMBER;
      hash = (53 * hash) + getFprPerImageList().hashCode();
    }
    if (getFprPerObjectCount() > 0) {
      hash = (37 * hash) + FPR_PER_OBJECT_FIELD_NUMBER;
      hash = (53 * hash) + getFprPerObjectList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.ROC parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.ROC parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.ROC parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.ROC parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.ROC parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.ROC parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.ROC parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.ROC parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.ROC parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.ROC parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.ROC parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.ROC parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.ROC prototype) {
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
   * Protobuf type {@code clarifai.api.ROC}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.ROC)
      com.clarifai.grpc.api.ROCOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_ROC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_ROC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.ROC.class, com.clarifai.grpc.api.ROC.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.ROC.newBuilder()
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
      fpr_ = emptyFloatList();
      bitField0_ = (bitField0_ & ~0x00000001);
      tpr_ = emptyFloatList();
      bitField0_ = (bitField0_ & ~0x00000002);
      thresholds_ = emptyFloatList();
      bitField0_ = (bitField0_ & ~0x00000004);
      fprPerImage_ = emptyFloatList();
      bitField0_ = (bitField0_ & ~0x00000008);
      fprPerObject_ = emptyFloatList();
      bitField0_ = (bitField0_ & ~0x00000010);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_ROC_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.ROC getDefaultInstanceForType() {
      return com.clarifai.grpc.api.ROC.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.ROC build() {
      com.clarifai.grpc.api.ROC result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.ROC buildPartial() {
      com.clarifai.grpc.api.ROC result = new com.clarifai.grpc.api.ROC(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        fpr_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.fpr_ = fpr_;
      if (((bitField0_ & 0x00000002) != 0)) {
        tpr_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.tpr_ = tpr_;
      if (((bitField0_ & 0x00000004) != 0)) {
        thresholds_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.thresholds_ = thresholds_;
      if (((bitField0_ & 0x00000008) != 0)) {
        fprPerImage_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000008);
      }
      result.fprPerImage_ = fprPerImage_;
      if (((bitField0_ & 0x00000010) != 0)) {
        fprPerObject_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000010);
      }
      result.fprPerObject_ = fprPerObject_;
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
      if (other instanceof com.clarifai.grpc.api.ROC) {
        return mergeFrom((com.clarifai.grpc.api.ROC)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.ROC other) {
      if (other == com.clarifai.grpc.api.ROC.getDefaultInstance()) return this;
      if (!other.fpr_.isEmpty()) {
        if (fpr_.isEmpty()) {
          fpr_ = other.fpr_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureFprIsMutable();
          fpr_.addAll(other.fpr_);
        }
        onChanged();
      }
      if (!other.tpr_.isEmpty()) {
        if (tpr_.isEmpty()) {
          tpr_ = other.tpr_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureTprIsMutable();
          tpr_.addAll(other.tpr_);
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
      if (!other.fprPerImage_.isEmpty()) {
        if (fprPerImage_.isEmpty()) {
          fprPerImage_ = other.fprPerImage_;
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          ensureFprPerImageIsMutable();
          fprPerImage_.addAll(other.fprPerImage_);
        }
        onChanged();
      }
      if (!other.fprPerObject_.isEmpty()) {
        if (fprPerObject_.isEmpty()) {
          fprPerObject_ = other.fprPerObject_;
          bitField0_ = (bitField0_ & ~0x00000010);
        } else {
          ensureFprPerObjectIsMutable();
          fprPerObject_.addAll(other.fprPerObject_);
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
      com.clarifai.grpc.api.ROC parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.ROC) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.FloatList fpr_ = emptyFloatList();
    private void ensureFprIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        fpr_ = mutableCopy(fpr_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated float fpr = 1 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public java.util.List<java.lang.Float>
        getFprList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(fpr_) : fpr_;
    }
    /**
     * <code>repeated float fpr = 1 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public int getFprCount() {
      return fpr_.size();
    }
    /**
     * <code>repeated float fpr = 1 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public float getFpr(int index) {
      return fpr_.getFloat(index);
    }
    /**
     * <code>repeated float fpr = 1 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder setFpr(
        int index, float value) {
      ensureFprIsMutable();
      fpr_.setFloat(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float fpr = 1 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder addFpr(float value) {
      ensureFprIsMutable();
      fpr_.addFloat(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float fpr = 1 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder addAllFpr(
        java.lang.Iterable<? extends java.lang.Float> values) {
      ensureFprIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, fpr_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float fpr = 1 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder clearFpr() {
      fpr_ = emptyFloatList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.FloatList tpr_ = emptyFloatList();
    private void ensureTprIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        tpr_ = mutableCopy(tpr_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated float tpr = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public java.util.List<java.lang.Float>
        getTprList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(tpr_) : tpr_;
    }
    /**
     * <code>repeated float tpr = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public int getTprCount() {
      return tpr_.size();
    }
    /**
     * <code>repeated float tpr = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public float getTpr(int index) {
      return tpr_.getFloat(index);
    }
    /**
     * <code>repeated float tpr = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder setTpr(
        int index, float value) {
      ensureTprIsMutable();
      tpr_.setFloat(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float tpr = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder addTpr(float value) {
      ensureTprIsMutable();
      tpr_.addFloat(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float tpr = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder addAllTpr(
        java.lang.Iterable<? extends java.lang.Float> values) {
      ensureTprIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, tpr_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float tpr = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder clearTpr() {
      tpr_ = emptyFloatList();
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
     */
    public java.util.List<java.lang.Float>
        getThresholdsList() {
      return ((bitField0_ & 0x00000004) != 0) ?
               java.util.Collections.unmodifiableList(thresholds_) : thresholds_;
    }
    /**
     * <code>repeated float thresholds = 3 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public int getThresholdsCount() {
      return thresholds_.size();
    }
    /**
     * <code>repeated float thresholds = 3 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public float getThresholds(int index) {
      return thresholds_.getFloat(index);
    }
    /**
     * <code>repeated float thresholds = 3 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
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
     */
    public Builder addThresholds(float value) {
      ensureThresholdsIsMutable();
      thresholds_.addFloat(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float thresholds = 3 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
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
     */
    public Builder clearThresholds() {
      thresholds_ = emptyFloatList();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.FloatList fprPerImage_ = emptyFloatList();
    private void ensureFprPerImageIsMutable() {
      if (!((bitField0_ & 0x00000008) != 0)) {
        fprPerImage_ = mutableCopy(fprPerImage_);
        bitField0_ |= 0x00000008;
       }
    }
    /**
     * <code>repeated float fpr_per_image = 4;</code>
     */
    public java.util.List<java.lang.Float>
        getFprPerImageList() {
      return ((bitField0_ & 0x00000008) != 0) ?
               java.util.Collections.unmodifiableList(fprPerImage_) : fprPerImage_;
    }
    /**
     * <code>repeated float fpr_per_image = 4;</code>
     */
    public int getFprPerImageCount() {
      return fprPerImage_.size();
    }
    /**
     * <code>repeated float fpr_per_image = 4;</code>
     */
    public float getFprPerImage(int index) {
      return fprPerImage_.getFloat(index);
    }
    /**
     * <code>repeated float fpr_per_image = 4;</code>
     */
    public Builder setFprPerImage(
        int index, float value) {
      ensureFprPerImageIsMutable();
      fprPerImage_.setFloat(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float fpr_per_image = 4;</code>
     */
    public Builder addFprPerImage(float value) {
      ensureFprPerImageIsMutable();
      fprPerImage_.addFloat(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float fpr_per_image = 4;</code>
     */
    public Builder addAllFprPerImage(
        java.lang.Iterable<? extends java.lang.Float> values) {
      ensureFprPerImageIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, fprPerImage_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float fpr_per_image = 4;</code>
     */
    public Builder clearFprPerImage() {
      fprPerImage_ = emptyFloatList();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.FloatList fprPerObject_ = emptyFloatList();
    private void ensureFprPerObjectIsMutable() {
      if (!((bitField0_ & 0x00000010) != 0)) {
        fprPerObject_ = mutableCopy(fprPerObject_);
        bitField0_ |= 0x00000010;
       }
    }
    /**
     * <code>repeated float fpr_per_object = 5;</code>
     */
    public java.util.List<java.lang.Float>
        getFprPerObjectList() {
      return ((bitField0_ & 0x00000010) != 0) ?
               java.util.Collections.unmodifiableList(fprPerObject_) : fprPerObject_;
    }
    /**
     * <code>repeated float fpr_per_object = 5;</code>
     */
    public int getFprPerObjectCount() {
      return fprPerObject_.size();
    }
    /**
     * <code>repeated float fpr_per_object = 5;</code>
     */
    public float getFprPerObject(int index) {
      return fprPerObject_.getFloat(index);
    }
    /**
     * <code>repeated float fpr_per_object = 5;</code>
     */
    public Builder setFprPerObject(
        int index, float value) {
      ensureFprPerObjectIsMutable();
      fprPerObject_.setFloat(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float fpr_per_object = 5;</code>
     */
    public Builder addFprPerObject(float value) {
      ensureFprPerObjectIsMutable();
      fprPerObject_.addFloat(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float fpr_per_object = 5;</code>
     */
    public Builder addAllFprPerObject(
        java.lang.Iterable<? extends java.lang.Float> values) {
      ensureFprPerObjectIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, fprPerObject_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float fpr_per_object = 5;</code>
     */
    public Builder clearFprPerObject() {
      fprPerObject_ = emptyFloatList();
      bitField0_ = (bitField0_ & ~0x00000010);
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.ROC)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.ROC)
  private static final com.clarifai.grpc.api.ROC DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.ROC();
  }

  public static com.clarifai.grpc.api.ROC getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ROC>
      PARSER = new com.google.protobuf.AbstractParser<ROC>() {
    @java.lang.Override
    public ROC parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ROC(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ROC> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ROC> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.ROC getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

