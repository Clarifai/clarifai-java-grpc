// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

/**
 * <pre>
 * Estimated training time in seconds
 * </pre>
 *
 * Protobuf type {@code clarifai.api.MultiTrainingTimeEstimateResponse}
 */
public final class MultiTrainingTimeEstimateResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.MultiTrainingTimeEstimateResponse)
    MultiTrainingTimeEstimateResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MultiTrainingTimeEstimateResponse.newBuilder() to construct.
  private MultiTrainingTimeEstimateResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MultiTrainingTimeEstimateResponse() {
    trainingTimeEstimates_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MultiTrainingTimeEstimateResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MultiTrainingTimeEstimateResponse(
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
          case 10: {
            com.clarifai.grpc.api.status.Status.Builder subBuilder = null;
            if (status_ != null) {
              subBuilder = status_.toBuilder();
            }
            status_ = input.readMessage(com.clarifai.grpc.api.status.Status.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(status_);
              status_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              trainingTimeEstimates_ = new java.util.ArrayList<com.google.protobuf.Duration>();
              mutable_bitField0_ |= 0x00000001;
            }
            trainingTimeEstimates_.add(
                input.readMessage(com.google.protobuf.Duration.parser(), extensionRegistry));
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
        trainingTimeEstimates_ = java.util.Collections.unmodifiableList(trainingTimeEstimates_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiTrainingTimeEstimateResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiTrainingTimeEstimateResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.MultiTrainingTimeEstimateResponse.class, com.clarifai.grpc.api.MultiTrainingTimeEstimateResponse.Builder.class);
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private com.clarifai.grpc.api.status.Status status_;
  /**
   * <code>.clarifai.api.status.Status status = 1;</code>
   * @return Whether the status field is set.
   */
  @java.lang.Override
  public boolean hasStatus() {
    return status_ != null;
  }
  /**
   * <code>.clarifai.api.status.Status status = 1;</code>
   * @return The status.
   */
  @java.lang.Override
  public com.clarifai.grpc.api.status.Status getStatus() {
    return status_ == null ? com.clarifai.grpc.api.status.Status.getDefaultInstance() : status_;
  }
  /**
   * <code>.clarifai.api.status.Status status = 1;</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.status.StatusOrBuilder getStatusOrBuilder() {
    return getStatus();
  }

  public static final int TRAINING_TIME_ESTIMATES_FIELD_NUMBER = 2;
  private java.util.List<com.google.protobuf.Duration> trainingTimeEstimates_;
  /**
   * <code>repeated .google.protobuf.Duration training_time_estimates = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.protobuf.Duration> getTrainingTimeEstimatesList() {
    return trainingTimeEstimates_;
  }
  /**
   * <code>repeated .google.protobuf.Duration training_time_estimates = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.protobuf.DurationOrBuilder> 
      getTrainingTimeEstimatesOrBuilderList() {
    return trainingTimeEstimates_;
  }
  /**
   * <code>repeated .google.protobuf.Duration training_time_estimates = 2;</code>
   */
  @java.lang.Override
  public int getTrainingTimeEstimatesCount() {
    return trainingTimeEstimates_.size();
  }
  /**
   * <code>repeated .google.protobuf.Duration training_time_estimates = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Duration getTrainingTimeEstimates(int index) {
    return trainingTimeEstimates_.get(index);
  }
  /**
   * <code>repeated .google.protobuf.Duration training_time_estimates = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getTrainingTimeEstimatesOrBuilder(
      int index) {
    return trainingTimeEstimates_.get(index);
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
    if (status_ != null) {
      output.writeMessage(1, getStatus());
    }
    for (int i = 0; i < trainingTimeEstimates_.size(); i++) {
      output.writeMessage(2, trainingTimeEstimates_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getStatus());
    }
    for (int i = 0; i < trainingTimeEstimates_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, trainingTimeEstimates_.get(i));
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
    if (!(obj instanceof com.clarifai.grpc.api.MultiTrainingTimeEstimateResponse)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.MultiTrainingTimeEstimateResponse other = (com.clarifai.grpc.api.MultiTrainingTimeEstimateResponse) obj;

    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (!getStatus()
          .equals(other.getStatus())) return false;
    }
    if (!getTrainingTimeEstimatesList()
        .equals(other.getTrainingTimeEstimatesList())) return false;
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
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatus().hashCode();
    }
    if (getTrainingTimeEstimatesCount() > 0) {
      hash = (37 * hash) + TRAINING_TIME_ESTIMATES_FIELD_NUMBER;
      hash = (53 * hash) + getTrainingTimeEstimatesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.MultiTrainingTimeEstimateResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.MultiTrainingTimeEstimateResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiTrainingTimeEstimateResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.MultiTrainingTimeEstimateResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiTrainingTimeEstimateResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.MultiTrainingTimeEstimateResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiTrainingTimeEstimateResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.MultiTrainingTimeEstimateResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiTrainingTimeEstimateResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.MultiTrainingTimeEstimateResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiTrainingTimeEstimateResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.MultiTrainingTimeEstimateResponse parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.MultiTrainingTimeEstimateResponse prototype) {
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
   * Estimated training time in seconds
   * </pre>
   *
   * Protobuf type {@code clarifai.api.MultiTrainingTimeEstimateResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.MultiTrainingTimeEstimateResponse)
      com.clarifai.grpc.api.MultiTrainingTimeEstimateResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiTrainingTimeEstimateResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiTrainingTimeEstimateResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.MultiTrainingTimeEstimateResponse.class, com.clarifai.grpc.api.MultiTrainingTimeEstimateResponse.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.MultiTrainingTimeEstimateResponse.newBuilder()
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
        getTrainingTimeEstimatesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (statusBuilder_ == null) {
        status_ = null;
      } else {
        status_ = null;
        statusBuilder_ = null;
      }
      if (trainingTimeEstimatesBuilder_ == null) {
        trainingTimeEstimates_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        trainingTimeEstimatesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiTrainingTimeEstimateResponse_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.MultiTrainingTimeEstimateResponse getDefaultInstanceForType() {
      return com.clarifai.grpc.api.MultiTrainingTimeEstimateResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.MultiTrainingTimeEstimateResponse build() {
      com.clarifai.grpc.api.MultiTrainingTimeEstimateResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.MultiTrainingTimeEstimateResponse buildPartial() {
      com.clarifai.grpc.api.MultiTrainingTimeEstimateResponse result = new com.clarifai.grpc.api.MultiTrainingTimeEstimateResponse(this);
      int from_bitField0_ = bitField0_;
      if (statusBuilder_ == null) {
        result.status_ = status_;
      } else {
        result.status_ = statusBuilder_.build();
      }
      if (trainingTimeEstimatesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          trainingTimeEstimates_ = java.util.Collections.unmodifiableList(trainingTimeEstimates_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.trainingTimeEstimates_ = trainingTimeEstimates_;
      } else {
        result.trainingTimeEstimates_ = trainingTimeEstimatesBuilder_.build();
      }
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
      if (other instanceof com.clarifai.grpc.api.MultiTrainingTimeEstimateResponse) {
        return mergeFrom((com.clarifai.grpc.api.MultiTrainingTimeEstimateResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.MultiTrainingTimeEstimateResponse other) {
      if (other == com.clarifai.grpc.api.MultiTrainingTimeEstimateResponse.getDefaultInstance()) return this;
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
      }
      if (trainingTimeEstimatesBuilder_ == null) {
        if (!other.trainingTimeEstimates_.isEmpty()) {
          if (trainingTimeEstimates_.isEmpty()) {
            trainingTimeEstimates_ = other.trainingTimeEstimates_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTrainingTimeEstimatesIsMutable();
            trainingTimeEstimates_.addAll(other.trainingTimeEstimates_);
          }
          onChanged();
        }
      } else {
        if (!other.trainingTimeEstimates_.isEmpty()) {
          if (trainingTimeEstimatesBuilder_.isEmpty()) {
            trainingTimeEstimatesBuilder_.dispose();
            trainingTimeEstimatesBuilder_ = null;
            trainingTimeEstimates_ = other.trainingTimeEstimates_;
            bitField0_ = (bitField0_ & ~0x00000001);
            trainingTimeEstimatesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTrainingTimeEstimatesFieldBuilder() : null;
          } else {
            trainingTimeEstimatesBuilder_.addAllMessages(other.trainingTimeEstimates_);
          }
        }
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
      com.clarifai.grpc.api.MultiTrainingTimeEstimateResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.MultiTrainingTimeEstimateResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.clarifai.grpc.api.status.Status status_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.status.Status, com.clarifai.grpc.api.status.Status.Builder, com.clarifai.grpc.api.status.StatusOrBuilder> statusBuilder_;
    /**
     * <code>.clarifai.api.status.Status status = 1;</code>
     * @return Whether the status field is set.
     */
    public boolean hasStatus() {
      return statusBuilder_ != null || status_ != null;
    }
    /**
     * <code>.clarifai.api.status.Status status = 1;</code>
     * @return The status.
     */
    public com.clarifai.grpc.api.status.Status getStatus() {
      if (statusBuilder_ == null) {
        return status_ == null ? com.clarifai.grpc.api.status.Status.getDefaultInstance() : status_;
      } else {
        return statusBuilder_.getMessage();
      }
    }
    /**
     * <code>.clarifai.api.status.Status status = 1;</code>
     */
    public Builder setStatus(com.clarifai.grpc.api.status.Status value) {
      if (statusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        status_ = value;
        onChanged();
      } else {
        statusBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.clarifai.api.status.Status status = 1;</code>
     */
    public Builder setStatus(
        com.clarifai.grpc.api.status.Status.Builder builderForValue) {
      if (statusBuilder_ == null) {
        status_ = builderForValue.build();
        onChanged();
      } else {
        statusBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.clarifai.api.status.Status status = 1;</code>
     */
    public Builder mergeStatus(com.clarifai.grpc.api.status.Status value) {
      if (statusBuilder_ == null) {
        if (status_ != null) {
          status_ =
            com.clarifai.grpc.api.status.Status.newBuilder(status_).mergeFrom(value).buildPartial();
        } else {
          status_ = value;
        }
        onChanged();
      } else {
        statusBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.clarifai.api.status.Status status = 1;</code>
     */
    public Builder clearStatus() {
      if (statusBuilder_ == null) {
        status_ = null;
        onChanged();
      } else {
        status_ = null;
        statusBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.clarifai.api.status.Status status = 1;</code>
     */
    public com.clarifai.grpc.api.status.Status.Builder getStatusBuilder() {
      
      onChanged();
      return getStatusFieldBuilder().getBuilder();
    }
    /**
     * <code>.clarifai.api.status.Status status = 1;</code>
     */
    public com.clarifai.grpc.api.status.StatusOrBuilder getStatusOrBuilder() {
      if (statusBuilder_ != null) {
        return statusBuilder_.getMessageOrBuilder();
      } else {
        return status_ == null ?
            com.clarifai.grpc.api.status.Status.getDefaultInstance() : status_;
      }
    }
    /**
     * <code>.clarifai.api.status.Status status = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.status.Status, com.clarifai.grpc.api.status.Status.Builder, com.clarifai.grpc.api.status.StatusOrBuilder> 
        getStatusFieldBuilder() {
      if (statusBuilder_ == null) {
        statusBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.clarifai.grpc.api.status.Status, com.clarifai.grpc.api.status.Status.Builder, com.clarifai.grpc.api.status.StatusOrBuilder>(
                getStatus(),
                getParentForChildren(),
                isClean());
        status_ = null;
      }
      return statusBuilder_;
    }

    private java.util.List<com.google.protobuf.Duration> trainingTimeEstimates_ =
      java.util.Collections.emptyList();
    private void ensureTrainingTimeEstimatesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        trainingTimeEstimates_ = new java.util.ArrayList<com.google.protobuf.Duration>(trainingTimeEstimates_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> trainingTimeEstimatesBuilder_;

    /**
     * <code>repeated .google.protobuf.Duration training_time_estimates = 2;</code>
     */
    public java.util.List<com.google.protobuf.Duration> getTrainingTimeEstimatesList() {
      if (trainingTimeEstimatesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(trainingTimeEstimates_);
      } else {
        return trainingTimeEstimatesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .google.protobuf.Duration training_time_estimates = 2;</code>
     */
    public int getTrainingTimeEstimatesCount() {
      if (trainingTimeEstimatesBuilder_ == null) {
        return trainingTimeEstimates_.size();
      } else {
        return trainingTimeEstimatesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .google.protobuf.Duration training_time_estimates = 2;</code>
     */
    public com.google.protobuf.Duration getTrainingTimeEstimates(int index) {
      if (trainingTimeEstimatesBuilder_ == null) {
        return trainingTimeEstimates_.get(index);
      } else {
        return trainingTimeEstimatesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .google.protobuf.Duration training_time_estimates = 2;</code>
     */
    public Builder setTrainingTimeEstimates(
        int index, com.google.protobuf.Duration value) {
      if (trainingTimeEstimatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTrainingTimeEstimatesIsMutable();
        trainingTimeEstimates_.set(index, value);
        onChanged();
      } else {
        trainingTimeEstimatesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Duration training_time_estimates = 2;</code>
     */
    public Builder setTrainingTimeEstimates(
        int index, com.google.protobuf.Duration.Builder builderForValue) {
      if (trainingTimeEstimatesBuilder_ == null) {
        ensureTrainingTimeEstimatesIsMutable();
        trainingTimeEstimates_.set(index, builderForValue.build());
        onChanged();
      } else {
        trainingTimeEstimatesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Duration training_time_estimates = 2;</code>
     */
    public Builder addTrainingTimeEstimates(com.google.protobuf.Duration value) {
      if (trainingTimeEstimatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTrainingTimeEstimatesIsMutable();
        trainingTimeEstimates_.add(value);
        onChanged();
      } else {
        trainingTimeEstimatesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Duration training_time_estimates = 2;</code>
     */
    public Builder addTrainingTimeEstimates(
        int index, com.google.protobuf.Duration value) {
      if (trainingTimeEstimatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTrainingTimeEstimatesIsMutable();
        trainingTimeEstimates_.add(index, value);
        onChanged();
      } else {
        trainingTimeEstimatesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Duration training_time_estimates = 2;</code>
     */
    public Builder addTrainingTimeEstimates(
        com.google.protobuf.Duration.Builder builderForValue) {
      if (trainingTimeEstimatesBuilder_ == null) {
        ensureTrainingTimeEstimatesIsMutable();
        trainingTimeEstimates_.add(builderForValue.build());
        onChanged();
      } else {
        trainingTimeEstimatesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Duration training_time_estimates = 2;</code>
     */
    public Builder addTrainingTimeEstimates(
        int index, com.google.protobuf.Duration.Builder builderForValue) {
      if (trainingTimeEstimatesBuilder_ == null) {
        ensureTrainingTimeEstimatesIsMutable();
        trainingTimeEstimates_.add(index, builderForValue.build());
        onChanged();
      } else {
        trainingTimeEstimatesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Duration training_time_estimates = 2;</code>
     */
    public Builder addAllTrainingTimeEstimates(
        java.lang.Iterable<? extends com.google.protobuf.Duration> values) {
      if (trainingTimeEstimatesBuilder_ == null) {
        ensureTrainingTimeEstimatesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, trainingTimeEstimates_);
        onChanged();
      } else {
        trainingTimeEstimatesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Duration training_time_estimates = 2;</code>
     */
    public Builder clearTrainingTimeEstimates() {
      if (trainingTimeEstimatesBuilder_ == null) {
        trainingTimeEstimates_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        trainingTimeEstimatesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Duration training_time_estimates = 2;</code>
     */
    public Builder removeTrainingTimeEstimates(int index) {
      if (trainingTimeEstimatesBuilder_ == null) {
        ensureTrainingTimeEstimatesIsMutable();
        trainingTimeEstimates_.remove(index);
        onChanged();
      } else {
        trainingTimeEstimatesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Duration training_time_estimates = 2;</code>
     */
    public com.google.protobuf.Duration.Builder getTrainingTimeEstimatesBuilder(
        int index) {
      return getTrainingTimeEstimatesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .google.protobuf.Duration training_time_estimates = 2;</code>
     */
    public com.google.protobuf.DurationOrBuilder getTrainingTimeEstimatesOrBuilder(
        int index) {
      if (trainingTimeEstimatesBuilder_ == null) {
        return trainingTimeEstimates_.get(index);  } else {
        return trainingTimeEstimatesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .google.protobuf.Duration training_time_estimates = 2;</code>
     */
    public java.util.List<? extends com.google.protobuf.DurationOrBuilder> 
         getTrainingTimeEstimatesOrBuilderList() {
      if (trainingTimeEstimatesBuilder_ != null) {
        return trainingTimeEstimatesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(trainingTimeEstimates_);
      }
    }
    /**
     * <code>repeated .google.protobuf.Duration training_time_estimates = 2;</code>
     */
    public com.google.protobuf.Duration.Builder addTrainingTimeEstimatesBuilder() {
      return getTrainingTimeEstimatesFieldBuilder().addBuilder(
          com.google.protobuf.Duration.getDefaultInstance());
    }
    /**
     * <code>repeated .google.protobuf.Duration training_time_estimates = 2;</code>
     */
    public com.google.protobuf.Duration.Builder addTrainingTimeEstimatesBuilder(
        int index) {
      return getTrainingTimeEstimatesFieldBuilder().addBuilder(
          index, com.google.protobuf.Duration.getDefaultInstance());
    }
    /**
     * <code>repeated .google.protobuf.Duration training_time_estimates = 2;</code>
     */
    public java.util.List<com.google.protobuf.Duration.Builder> 
         getTrainingTimeEstimatesBuilderList() {
      return getTrainingTimeEstimatesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
        getTrainingTimeEstimatesFieldBuilder() {
      if (trainingTimeEstimatesBuilder_ == null) {
        trainingTimeEstimatesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                trainingTimeEstimates_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        trainingTimeEstimates_ = null;
      }
      return trainingTimeEstimatesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.MultiTrainingTimeEstimateResponse)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.MultiTrainingTimeEstimateResponse)
  private static final com.clarifai.grpc.api.MultiTrainingTimeEstimateResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.MultiTrainingTimeEstimateResponse();
  }

  public static com.clarifai.grpc.api.MultiTrainingTimeEstimateResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MultiTrainingTimeEstimateResponse>
      PARSER = new com.google.protobuf.AbstractParser<MultiTrainingTimeEstimateResponse>() {
    @java.lang.Override
    public MultiTrainingTimeEstimateResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MultiTrainingTimeEstimateResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MultiTrainingTimeEstimateResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MultiTrainingTimeEstimateResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.MultiTrainingTimeEstimateResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
