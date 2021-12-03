// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * <pre>
 * TrackerMetrics
 * </pre>
 *
 * Protobuf type {@code clarifai.api.TrackerMetrics}
 */
public  final class TrackerMetrics extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.TrackerMetrics)
    TrackerMetricsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TrackerMetrics.newBuilder() to construct.
  private TrackerMetrics(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TrackerMetrics() {
    aiid_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TrackerMetrics();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TrackerMetrics(
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
          case 13: {

            motMota_ = input.readFloat();
            break;
          }
          case 16: {

            motNumSwitches_ = input.readInt32();
            break;
          }
          case 29: {

            morseFrag_ = input.readFloat();
            break;
          }
          case 37: {

            avgPrecision_ = input.readFloat();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            aiid_ = s;
            break;
          }
          case 53: {

            uniqueSwitchRate_ = input.readFloat();
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
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_TrackerMetrics_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_TrackerMetrics_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.TrackerMetrics.class, com.clarifai.grpc.api.TrackerMetrics.Builder.class);
  }

  public static final int MOT_MOTA_FIELD_NUMBER = 1;
  private float motMota_;
  /**
   * <pre>
   * Multiple object tracking accuracy
   * </pre>
   *
   * <code>float mot_mota = 1;</code>
   * @return The motMota.
   */
  public float getMotMota() {
    return motMota_;
  }

  public static final int MOT_NUM_SWITCHES_FIELD_NUMBER = 2;
  private int motNumSwitches_;
  /**
   * <pre>
   * Number of switches between tracks
   * </pre>
   *
   * <code>int32 mot_num_switches = 2;</code>
   * @return The motNumSwitches.
   */
  public int getMotNumSwitches() {
    return motNumSwitches_;
  }

  public static final int MORSE_FRAG_FIELD_NUMBER = 3;
  private float morseFrag_;
  /**
   * <pre>
   * MORSE fragmentation rate (a.k.a unique switch rate, only calculated in public sector)
   * </pre>
   *
   * <code>float morse_frag = 3;</code>
   * @return The morseFrag.
   */
  public float getMorseFrag() {
    return morseFrag_;
  }

  public static final int AVG_PRECISION_FIELD_NUMBER = 4;
  private float avgPrecision_;
  /**
   * <pre>
   * Average precision calculated from all processed frames
   * </pre>
   *
   * <code>float avg_precision = 4;</code>
   * @return The avgPrecision.
   */
  public float getAvgPrecision() {
    return avgPrecision_;
  }

  public static final int AIID_FIELD_NUMBER = 5;
  private volatile java.lang.Object aiid_;
  /**
   * <pre>
   * The concept that we are evaluating the tracker
   * </pre>
   *
   * <code>string aiid = 5;</code>
   * @return The aiid.
   */
  public java.lang.String getAiid() {
    java.lang.Object ref = aiid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      aiid_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The concept that we are evaluating the tracker
   * </pre>
   *
   * <code>string aiid = 5;</code>
   * @return The bytes for aiid.
   */
  public com.google.protobuf.ByteString
      getAiidBytes() {
    java.lang.Object ref = aiid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      aiid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int UNIQUE_SWITCH_RATE_FIELD_NUMBER = 6;
  private float uniqueSwitchRate_;
  /**
   * <pre>
   * Same as morse_frag but calculated using MOT mapping/metrics
   * </pre>
   *
   * <code>float unique_switch_rate = 6;</code>
   * @return The uniqueSwitchRate.
   */
  public float getUniqueSwitchRate() {
    return uniqueSwitchRate_;
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
    if (motMota_ != 0F) {
      output.writeFloat(1, motMota_);
    }
    if (motNumSwitches_ != 0) {
      output.writeInt32(2, motNumSwitches_);
    }
    if (morseFrag_ != 0F) {
      output.writeFloat(3, morseFrag_);
    }
    if (avgPrecision_ != 0F) {
      output.writeFloat(4, avgPrecision_);
    }
    if (!getAiidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, aiid_);
    }
    if (uniqueSwitchRate_ != 0F) {
      output.writeFloat(6, uniqueSwitchRate_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (motMota_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, motMota_);
    }
    if (motNumSwitches_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, motNumSwitches_);
    }
    if (morseFrag_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, morseFrag_);
    }
    if (avgPrecision_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, avgPrecision_);
    }
    if (!getAiidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, aiid_);
    }
    if (uniqueSwitchRate_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(6, uniqueSwitchRate_);
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
    if (!(obj instanceof com.clarifai.grpc.api.TrackerMetrics)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.TrackerMetrics other = (com.clarifai.grpc.api.TrackerMetrics) obj;

    if (java.lang.Float.floatToIntBits(getMotMota())
        != java.lang.Float.floatToIntBits(
            other.getMotMota())) return false;
    if (getMotNumSwitches()
        != other.getMotNumSwitches()) return false;
    if (java.lang.Float.floatToIntBits(getMorseFrag())
        != java.lang.Float.floatToIntBits(
            other.getMorseFrag())) return false;
    if (java.lang.Float.floatToIntBits(getAvgPrecision())
        != java.lang.Float.floatToIntBits(
            other.getAvgPrecision())) return false;
    if (!getAiid()
        .equals(other.getAiid())) return false;
    if (java.lang.Float.floatToIntBits(getUniqueSwitchRate())
        != java.lang.Float.floatToIntBits(
            other.getUniqueSwitchRate())) return false;
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
    hash = (37 * hash) + MOT_MOTA_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getMotMota());
    hash = (37 * hash) + MOT_NUM_SWITCHES_FIELD_NUMBER;
    hash = (53 * hash) + getMotNumSwitches();
    hash = (37 * hash) + MORSE_FRAG_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getMorseFrag());
    hash = (37 * hash) + AVG_PRECISION_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getAvgPrecision());
    hash = (37 * hash) + AIID_FIELD_NUMBER;
    hash = (53 * hash) + getAiid().hashCode();
    hash = (37 * hash) + UNIQUE_SWITCH_RATE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getUniqueSwitchRate());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.TrackerMetrics parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.TrackerMetrics parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.TrackerMetrics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.TrackerMetrics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.TrackerMetrics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.TrackerMetrics parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.TrackerMetrics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.TrackerMetrics parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.TrackerMetrics parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.TrackerMetrics parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.TrackerMetrics parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.TrackerMetrics parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.TrackerMetrics prototype) {
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
   * TrackerMetrics
   * </pre>
   *
   * Protobuf type {@code clarifai.api.TrackerMetrics}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.TrackerMetrics)
      com.clarifai.grpc.api.TrackerMetricsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_TrackerMetrics_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_TrackerMetrics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.TrackerMetrics.class, com.clarifai.grpc.api.TrackerMetrics.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.TrackerMetrics.newBuilder()
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
      motMota_ = 0F;

      motNumSwitches_ = 0;

      morseFrag_ = 0F;

      avgPrecision_ = 0F;

      aiid_ = "";

      uniqueSwitchRate_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_TrackerMetrics_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.TrackerMetrics getDefaultInstanceForType() {
      return com.clarifai.grpc.api.TrackerMetrics.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.TrackerMetrics build() {
      com.clarifai.grpc.api.TrackerMetrics result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.TrackerMetrics buildPartial() {
      com.clarifai.grpc.api.TrackerMetrics result = new com.clarifai.grpc.api.TrackerMetrics(this);
      result.motMota_ = motMota_;
      result.motNumSwitches_ = motNumSwitches_;
      result.morseFrag_ = morseFrag_;
      result.avgPrecision_ = avgPrecision_;
      result.aiid_ = aiid_;
      result.uniqueSwitchRate_ = uniqueSwitchRate_;
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
      if (other instanceof com.clarifai.grpc.api.TrackerMetrics) {
        return mergeFrom((com.clarifai.grpc.api.TrackerMetrics)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.TrackerMetrics other) {
      if (other == com.clarifai.grpc.api.TrackerMetrics.getDefaultInstance()) return this;
      if (other.getMotMota() != 0F) {
        setMotMota(other.getMotMota());
      }
      if (other.getMotNumSwitches() != 0) {
        setMotNumSwitches(other.getMotNumSwitches());
      }
      if (other.getMorseFrag() != 0F) {
        setMorseFrag(other.getMorseFrag());
      }
      if (other.getAvgPrecision() != 0F) {
        setAvgPrecision(other.getAvgPrecision());
      }
      if (!other.getAiid().isEmpty()) {
        aiid_ = other.aiid_;
        onChanged();
      }
      if (other.getUniqueSwitchRate() != 0F) {
        setUniqueSwitchRate(other.getUniqueSwitchRate());
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
      com.clarifai.grpc.api.TrackerMetrics parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.TrackerMetrics) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float motMota_ ;
    /**
     * <pre>
     * Multiple object tracking accuracy
     * </pre>
     *
     * <code>float mot_mota = 1;</code>
     * @return The motMota.
     */
    public float getMotMota() {
      return motMota_;
    }
    /**
     * <pre>
     * Multiple object tracking accuracy
     * </pre>
     *
     * <code>float mot_mota = 1;</code>
     * @param value The motMota to set.
     * @return This builder for chaining.
     */
    public Builder setMotMota(float value) {
      
      motMota_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Multiple object tracking accuracy
     * </pre>
     *
     * <code>float mot_mota = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMotMota() {
      
      motMota_ = 0F;
      onChanged();
      return this;
    }

    private int motNumSwitches_ ;
    /**
     * <pre>
     * Number of switches between tracks
     * </pre>
     *
     * <code>int32 mot_num_switches = 2;</code>
     * @return The motNumSwitches.
     */
    public int getMotNumSwitches() {
      return motNumSwitches_;
    }
    /**
     * <pre>
     * Number of switches between tracks
     * </pre>
     *
     * <code>int32 mot_num_switches = 2;</code>
     * @param value The motNumSwitches to set.
     * @return This builder for chaining.
     */
    public Builder setMotNumSwitches(int value) {
      
      motNumSwitches_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of switches between tracks
     * </pre>
     *
     * <code>int32 mot_num_switches = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMotNumSwitches() {
      
      motNumSwitches_ = 0;
      onChanged();
      return this;
    }

    private float morseFrag_ ;
    /**
     * <pre>
     * MORSE fragmentation rate (a.k.a unique switch rate, only calculated in public sector)
     * </pre>
     *
     * <code>float morse_frag = 3;</code>
     * @return The morseFrag.
     */
    public float getMorseFrag() {
      return morseFrag_;
    }
    /**
     * <pre>
     * MORSE fragmentation rate (a.k.a unique switch rate, only calculated in public sector)
     * </pre>
     *
     * <code>float morse_frag = 3;</code>
     * @param value The morseFrag to set.
     * @return This builder for chaining.
     */
    public Builder setMorseFrag(float value) {
      
      morseFrag_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * MORSE fragmentation rate (a.k.a unique switch rate, only calculated in public sector)
     * </pre>
     *
     * <code>float morse_frag = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMorseFrag() {
      
      morseFrag_ = 0F;
      onChanged();
      return this;
    }

    private float avgPrecision_ ;
    /**
     * <pre>
     * Average precision calculated from all processed frames
     * </pre>
     *
     * <code>float avg_precision = 4;</code>
     * @return The avgPrecision.
     */
    public float getAvgPrecision() {
      return avgPrecision_;
    }
    /**
     * <pre>
     * Average precision calculated from all processed frames
     * </pre>
     *
     * <code>float avg_precision = 4;</code>
     * @param value The avgPrecision to set.
     * @return This builder for chaining.
     */
    public Builder setAvgPrecision(float value) {
      
      avgPrecision_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Average precision calculated from all processed frames
     * </pre>
     *
     * <code>float avg_precision = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearAvgPrecision() {
      
      avgPrecision_ = 0F;
      onChanged();
      return this;
    }

    private java.lang.Object aiid_ = "";
    /**
     * <pre>
     * The concept that we are evaluating the tracker
     * </pre>
     *
     * <code>string aiid = 5;</code>
     * @return The aiid.
     */
    public java.lang.String getAiid() {
      java.lang.Object ref = aiid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        aiid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The concept that we are evaluating the tracker
     * </pre>
     *
     * <code>string aiid = 5;</code>
     * @return The bytes for aiid.
     */
    public com.google.protobuf.ByteString
        getAiidBytes() {
      java.lang.Object ref = aiid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        aiid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The concept that we are evaluating the tracker
     * </pre>
     *
     * <code>string aiid = 5;</code>
     * @param value The aiid to set.
     * @return This builder for chaining.
     */
    public Builder setAiid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      aiid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The concept that we are evaluating the tracker
     * </pre>
     *
     * <code>string aiid = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearAiid() {
      
      aiid_ = getDefaultInstance().getAiid();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The concept that we are evaluating the tracker
     * </pre>
     *
     * <code>string aiid = 5;</code>
     * @param value The bytes for aiid to set.
     * @return This builder for chaining.
     */
    public Builder setAiidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      aiid_ = value;
      onChanged();
      return this;
    }

    private float uniqueSwitchRate_ ;
    /**
     * <pre>
     * Same as morse_frag but calculated using MOT mapping/metrics
     * </pre>
     *
     * <code>float unique_switch_rate = 6;</code>
     * @return The uniqueSwitchRate.
     */
    public float getUniqueSwitchRate() {
      return uniqueSwitchRate_;
    }
    /**
     * <pre>
     * Same as morse_frag but calculated using MOT mapping/metrics
     * </pre>
     *
     * <code>float unique_switch_rate = 6;</code>
     * @param value The uniqueSwitchRate to set.
     * @return This builder for chaining.
     */
    public Builder setUniqueSwitchRate(float value) {
      
      uniqueSwitchRate_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Same as morse_frag but calculated using MOT mapping/metrics
     * </pre>
     *
     * <code>float unique_switch_rate = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearUniqueSwitchRate() {
      
      uniqueSwitchRate_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.TrackerMetrics)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.TrackerMetrics)
  private static final com.clarifai.grpc.api.TrackerMetrics DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.TrackerMetrics();
  }

  public static com.clarifai.grpc.api.TrackerMetrics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TrackerMetrics>
      PARSER = new com.google.protobuf.AbstractParser<TrackerMetrics>() {
    @java.lang.Override
    public TrackerMetrics parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TrackerMetrics(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TrackerMetrics> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TrackerMetrics> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.TrackerMetrics getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

