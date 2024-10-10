// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * <pre>
 * TaskReviewManualStrategyInfo
 * </pre>
 *
 * Protobuf type {@code clarifai.api.TaskReviewManualStrategyInfo}
 */
public final class TaskReviewManualStrategyInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.TaskReviewManualStrategyInfo)
    TaskReviewManualStrategyInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TaskReviewManualStrategyInfo.newBuilder() to construct.
  private TaskReviewManualStrategyInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TaskReviewManualStrategyInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TaskReviewManualStrategyInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TaskReviewManualStrategyInfo(
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

            samplePercentage_ = input.readFloat();
            break;
          }
          case 16: {

            approvalThreshold_ = input.readInt32();
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
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_TaskReviewManualStrategyInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_TaskReviewManualStrategyInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.TaskReviewManualStrategyInfo.class, com.clarifai.grpc.api.TaskReviewManualStrategyInfo.Builder.class);
  }

  public static final int SAMPLE_PERCENTAGE_FIELD_NUMBER = 1;
  private float samplePercentage_;
  /**
   * <pre>
   * This field represents the percentage of inputs that will be reviewed by reviewers. It is a value between 0 and 1.
   * </pre>
   *
   * <code>float sample_percentage = 1;</code>
   * @return The samplePercentage.
   */
  @java.lang.Override
  public float getSamplePercentage() {
    return samplePercentage_;
  }

  public static final int APPROVAL_THRESHOLD_FIELD_NUMBER = 2;
  private int approvalThreshold_;
  /**
   * <pre>
   * The number of reviewers that need to agree in order to approve an input.
   * Currently, the only allowed values are:
   * 0  - when not set, it defaults to 1
   * 1  - only a single reviewer needs to approve each labeled input
   * -1 - an input will be approved when all reviewers approve it
   * </pre>
   *
   * <code>int32 approval_threshold = 2;</code>
   * @return The approvalThreshold.
   */
  @java.lang.Override
  public int getApprovalThreshold() {
    return approvalThreshold_;
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
    if (java.lang.Float.floatToRawIntBits(samplePercentage_) != 0) {
      output.writeFloat(1, samplePercentage_);
    }
    if (approvalThreshold_ != 0) {
      output.writeInt32(2, approvalThreshold_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Float.floatToRawIntBits(samplePercentage_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, samplePercentage_);
    }
    if (approvalThreshold_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, approvalThreshold_);
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
    if (!(obj instanceof com.clarifai.grpc.api.TaskReviewManualStrategyInfo)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.TaskReviewManualStrategyInfo other = (com.clarifai.grpc.api.TaskReviewManualStrategyInfo) obj;

    if (java.lang.Float.floatToIntBits(getSamplePercentage())
        != java.lang.Float.floatToIntBits(
            other.getSamplePercentage())) return false;
    if (getApprovalThreshold()
        != other.getApprovalThreshold()) return false;
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
    hash = (37 * hash) + SAMPLE_PERCENTAGE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getSamplePercentage());
    hash = (37 * hash) + APPROVAL_THRESHOLD_FIELD_NUMBER;
    hash = (53 * hash) + getApprovalThreshold();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.TaskReviewManualStrategyInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.TaskReviewManualStrategyInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.TaskReviewManualStrategyInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.TaskReviewManualStrategyInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.TaskReviewManualStrategyInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.TaskReviewManualStrategyInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.TaskReviewManualStrategyInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.TaskReviewManualStrategyInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.TaskReviewManualStrategyInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.TaskReviewManualStrategyInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.TaskReviewManualStrategyInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.TaskReviewManualStrategyInfo parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.TaskReviewManualStrategyInfo prototype) {
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
   * TaskReviewManualStrategyInfo
   * </pre>
   *
   * Protobuf type {@code clarifai.api.TaskReviewManualStrategyInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.TaskReviewManualStrategyInfo)
      com.clarifai.grpc.api.TaskReviewManualStrategyInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_TaskReviewManualStrategyInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_TaskReviewManualStrategyInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.TaskReviewManualStrategyInfo.class, com.clarifai.grpc.api.TaskReviewManualStrategyInfo.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.TaskReviewManualStrategyInfo.newBuilder()
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
      samplePercentage_ = 0F;

      approvalThreshold_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_TaskReviewManualStrategyInfo_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.TaskReviewManualStrategyInfo getDefaultInstanceForType() {
      return com.clarifai.grpc.api.TaskReviewManualStrategyInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.TaskReviewManualStrategyInfo build() {
      com.clarifai.grpc.api.TaskReviewManualStrategyInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.TaskReviewManualStrategyInfo buildPartial() {
      com.clarifai.grpc.api.TaskReviewManualStrategyInfo result = new com.clarifai.grpc.api.TaskReviewManualStrategyInfo(this);
      result.samplePercentage_ = samplePercentage_;
      result.approvalThreshold_ = approvalThreshold_;
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
      if (other instanceof com.clarifai.grpc.api.TaskReviewManualStrategyInfo) {
        return mergeFrom((com.clarifai.grpc.api.TaskReviewManualStrategyInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.TaskReviewManualStrategyInfo other) {
      if (other == com.clarifai.grpc.api.TaskReviewManualStrategyInfo.getDefaultInstance()) return this;
      if (other.getSamplePercentage() != 0F) {
        setSamplePercentage(other.getSamplePercentage());
      }
      if (other.getApprovalThreshold() != 0) {
        setApprovalThreshold(other.getApprovalThreshold());
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
      com.clarifai.grpc.api.TaskReviewManualStrategyInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.TaskReviewManualStrategyInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float samplePercentage_ ;
    /**
     * <pre>
     * This field represents the percentage of inputs that will be reviewed by reviewers. It is a value between 0 and 1.
     * </pre>
     *
     * <code>float sample_percentage = 1;</code>
     * @return The samplePercentage.
     */
    @java.lang.Override
    public float getSamplePercentage() {
      return samplePercentage_;
    }
    /**
     * <pre>
     * This field represents the percentage of inputs that will be reviewed by reviewers. It is a value between 0 and 1.
     * </pre>
     *
     * <code>float sample_percentage = 1;</code>
     * @param value The samplePercentage to set.
     * @return This builder for chaining.
     */
    public Builder setSamplePercentage(float value) {
      
      samplePercentage_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This field represents the percentage of inputs that will be reviewed by reviewers. It is a value between 0 and 1.
     * </pre>
     *
     * <code>float sample_percentage = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSamplePercentage() {
      
      samplePercentage_ = 0F;
      onChanged();
      return this;
    }

    private int approvalThreshold_ ;
    /**
     * <pre>
     * The number of reviewers that need to agree in order to approve an input.
     * Currently, the only allowed values are:
     * 0  - when not set, it defaults to 1
     * 1  - only a single reviewer needs to approve each labeled input
     * -1 - an input will be approved when all reviewers approve it
     * </pre>
     *
     * <code>int32 approval_threshold = 2;</code>
     * @return The approvalThreshold.
     */
    @java.lang.Override
    public int getApprovalThreshold() {
      return approvalThreshold_;
    }
    /**
     * <pre>
     * The number of reviewers that need to agree in order to approve an input.
     * Currently, the only allowed values are:
     * 0  - when not set, it defaults to 1
     * 1  - only a single reviewer needs to approve each labeled input
     * -1 - an input will be approved when all reviewers approve it
     * </pre>
     *
     * <code>int32 approval_threshold = 2;</code>
     * @param value The approvalThreshold to set.
     * @return This builder for chaining.
     */
    public Builder setApprovalThreshold(int value) {
      
      approvalThreshold_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of reviewers that need to agree in order to approve an input.
     * Currently, the only allowed values are:
     * 0  - when not set, it defaults to 1
     * 1  - only a single reviewer needs to approve each labeled input
     * -1 - an input will be approved when all reviewers approve it
     * </pre>
     *
     * <code>int32 approval_threshold = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearApprovalThreshold() {
      
      approvalThreshold_ = 0;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.TaskReviewManualStrategyInfo)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.TaskReviewManualStrategyInfo)
  private static final com.clarifai.grpc.api.TaskReviewManualStrategyInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.TaskReviewManualStrategyInfo();
  }

  public static com.clarifai.grpc.api.TaskReviewManualStrategyInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TaskReviewManualStrategyInfo>
      PARSER = new com.google.protobuf.AbstractParser<TaskReviewManualStrategyInfo>() {
    @java.lang.Override
    public TaskReviewManualStrategyInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TaskReviewManualStrategyInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TaskReviewManualStrategyInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TaskReviewManualStrategyInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.TaskReviewManualStrategyInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

