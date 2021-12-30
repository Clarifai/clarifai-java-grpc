// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * <pre>
 * LossCurveEntry
 * </pre>
 *
 * Protobuf type {@code clarifai.api.LossCurveEntry}
 */
public  final class LossCurveEntry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.LossCurveEntry)
    LossCurveEntryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LossCurveEntry.newBuilder() to construct.
  private LossCurveEntry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LossCurveEntry() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LossCurveEntry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LossCurveEntry(
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

            epoch_ = input.readUInt32();
            break;
          }
          case 16: {

            globalStep_ = input.readUInt32();
            break;
          }
          case 29: {

            cost_ = input.readFloat();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_LossCurveEntry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_LossCurveEntry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.LossCurveEntry.class, com.clarifai.grpc.api.LossCurveEntry.Builder.class);
  }

  public static final int EPOCH_FIELD_NUMBER = 1;
  private int epoch_;
  /**
   * <pre>
   * current epoch
   * </pre>
   *
   * <code>uint32 epoch = 1;</code>
   * @return The epoch.
   */
  public int getEpoch() {
    return epoch_;
  }

  public static final int GLOBAL_STEP_FIELD_NUMBER = 2;
  private int globalStep_;
  /**
   * <pre>
   * current global step
   * </pre>
   *
   * <code>uint32 global_step = 2;</code>
   * @return The globalStep.
   */
  public int getGlobalStep() {
    return globalStep_;
  }

  public static final int COST_FIELD_NUMBER = 3;
  private float cost_;
  /**
   * <pre>
   * current cost
   * FIXME(rigel): this should be loss instead of cost.
   * </pre>
   *
   * <code>float cost = 3;</code>
   * @return The cost.
   */
  public float getCost() {
    return cost_;
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
    if (epoch_ != 0) {
      output.writeUInt32(1, epoch_);
    }
    if (globalStep_ != 0) {
      output.writeUInt32(2, globalStep_);
    }
    if (cost_ != 0F) {
      output.writeFloat(3, cost_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (epoch_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, epoch_);
    }
    if (globalStep_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, globalStep_);
    }
    if (cost_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, cost_);
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
    if (!(obj instanceof com.clarifai.grpc.api.LossCurveEntry)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.LossCurveEntry other = (com.clarifai.grpc.api.LossCurveEntry) obj;

    if (getEpoch()
        != other.getEpoch()) return false;
    if (getGlobalStep()
        != other.getGlobalStep()) return false;
    if (java.lang.Float.floatToIntBits(getCost())
        != java.lang.Float.floatToIntBits(
            other.getCost())) return false;
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
    hash = (37 * hash) + EPOCH_FIELD_NUMBER;
    hash = (53 * hash) + getEpoch();
    hash = (37 * hash) + GLOBAL_STEP_FIELD_NUMBER;
    hash = (53 * hash) + getGlobalStep();
    hash = (37 * hash) + COST_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getCost());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.LossCurveEntry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.LossCurveEntry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.LossCurveEntry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.LossCurveEntry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.LossCurveEntry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.LossCurveEntry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.LossCurveEntry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.LossCurveEntry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.LossCurveEntry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.LossCurveEntry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.LossCurveEntry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.LossCurveEntry parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.LossCurveEntry prototype) {
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
   * LossCurveEntry
   * </pre>
   *
   * Protobuf type {@code clarifai.api.LossCurveEntry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.LossCurveEntry)
      com.clarifai.grpc.api.LossCurveEntryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_LossCurveEntry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_LossCurveEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.LossCurveEntry.class, com.clarifai.grpc.api.LossCurveEntry.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.LossCurveEntry.newBuilder()
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
      epoch_ = 0;

      globalStep_ = 0;

      cost_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_LossCurveEntry_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.LossCurveEntry getDefaultInstanceForType() {
      return com.clarifai.grpc.api.LossCurveEntry.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.LossCurveEntry build() {
      com.clarifai.grpc.api.LossCurveEntry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.LossCurveEntry buildPartial() {
      com.clarifai.grpc.api.LossCurveEntry result = new com.clarifai.grpc.api.LossCurveEntry(this);
      result.epoch_ = epoch_;
      result.globalStep_ = globalStep_;
      result.cost_ = cost_;
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
      if (other instanceof com.clarifai.grpc.api.LossCurveEntry) {
        return mergeFrom((com.clarifai.grpc.api.LossCurveEntry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.LossCurveEntry other) {
      if (other == com.clarifai.grpc.api.LossCurveEntry.getDefaultInstance()) return this;
      if (other.getEpoch() != 0) {
        setEpoch(other.getEpoch());
      }
      if (other.getGlobalStep() != 0) {
        setGlobalStep(other.getGlobalStep());
      }
      if (other.getCost() != 0F) {
        setCost(other.getCost());
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
      com.clarifai.grpc.api.LossCurveEntry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.LossCurveEntry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int epoch_ ;
    /**
     * <pre>
     * current epoch
     * </pre>
     *
     * <code>uint32 epoch = 1;</code>
     * @return The epoch.
     */
    public int getEpoch() {
      return epoch_;
    }
    /**
     * <pre>
     * current epoch
     * </pre>
     *
     * <code>uint32 epoch = 1;</code>
     * @param value The epoch to set.
     * @return This builder for chaining.
     */
    public Builder setEpoch(int value) {
      
      epoch_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * current epoch
     * </pre>
     *
     * <code>uint32 epoch = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEpoch() {
      
      epoch_ = 0;
      onChanged();
      return this;
    }

    private int globalStep_ ;
    /**
     * <pre>
     * current global step
     * </pre>
     *
     * <code>uint32 global_step = 2;</code>
     * @return The globalStep.
     */
    public int getGlobalStep() {
      return globalStep_;
    }
    /**
     * <pre>
     * current global step
     * </pre>
     *
     * <code>uint32 global_step = 2;</code>
     * @param value The globalStep to set.
     * @return This builder for chaining.
     */
    public Builder setGlobalStep(int value) {
      
      globalStep_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * current global step
     * </pre>
     *
     * <code>uint32 global_step = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearGlobalStep() {
      
      globalStep_ = 0;
      onChanged();
      return this;
    }

    private float cost_ ;
    /**
     * <pre>
     * current cost
     * FIXME(rigel): this should be loss instead of cost.
     * </pre>
     *
     * <code>float cost = 3;</code>
     * @return The cost.
     */
    public float getCost() {
      return cost_;
    }
    /**
     * <pre>
     * current cost
     * FIXME(rigel): this should be loss instead of cost.
     * </pre>
     *
     * <code>float cost = 3;</code>
     * @param value The cost to set.
     * @return This builder for chaining.
     */
    public Builder setCost(float value) {
      
      cost_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * current cost
     * FIXME(rigel): this should be loss instead of cost.
     * </pre>
     *
     * <code>float cost = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCost() {
      
      cost_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.LossCurveEntry)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.LossCurveEntry)
  private static final com.clarifai.grpc.api.LossCurveEntry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.LossCurveEntry();
  }

  public static com.clarifai.grpc.api.LossCurveEntry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LossCurveEntry>
      PARSER = new com.google.protobuf.AbstractParser<LossCurveEntry>() {
    @java.lang.Override
    public LossCurveEntry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LossCurveEntry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LossCurveEntry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LossCurveEntry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.LossCurveEntry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

