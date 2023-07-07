// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

/**
 * Protobuf type {@code clarifai.api.MultiEvalMetricsResponse}
 */
public final class MultiEvalMetricsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.MultiEvalMetricsResponse)
    MultiEvalMetricsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MultiEvalMetricsResponse.newBuilder() to construct.
  private MultiEvalMetricsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MultiEvalMetricsResponse() {
    evalMetrics_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MultiEvalMetricsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MultiEvalMetricsResponse(
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
              evalMetrics_ = new java.util.ArrayList<com.clarifai.grpc.api.EvalMetrics>();
              mutable_bitField0_ |= 0x00000001;
            }
            evalMetrics_.add(
                input.readMessage(com.clarifai.grpc.api.EvalMetrics.parser(), extensionRegistry));
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
        evalMetrics_ = java.util.Collections.unmodifiableList(evalMetrics_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiEvalMetricsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiEvalMetricsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.MultiEvalMetricsResponse.class, com.clarifai.grpc.api.MultiEvalMetricsResponse.Builder.class);
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

  public static final int EVAL_METRICS_FIELD_NUMBER = 2;
  private java.util.List<com.clarifai.grpc.api.EvalMetrics> evalMetrics_;
  /**
   * <code>repeated .clarifai.api.EvalMetrics eval_metrics = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.clarifai.grpc.api.EvalMetrics> getEvalMetricsList() {
    return evalMetrics_;
  }
  /**
   * <code>repeated .clarifai.api.EvalMetrics eval_metrics = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.clarifai.grpc.api.EvalMetricsOrBuilder> 
      getEvalMetricsOrBuilderList() {
    return evalMetrics_;
  }
  /**
   * <code>repeated .clarifai.api.EvalMetrics eval_metrics = 2;</code>
   */
  @java.lang.Override
  public int getEvalMetricsCount() {
    return evalMetrics_.size();
  }
  /**
   * <code>repeated .clarifai.api.EvalMetrics eval_metrics = 2;</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.EvalMetrics getEvalMetrics(int index) {
    return evalMetrics_.get(index);
  }
  /**
   * <code>repeated .clarifai.api.EvalMetrics eval_metrics = 2;</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.EvalMetricsOrBuilder getEvalMetricsOrBuilder(
      int index) {
    return evalMetrics_.get(index);
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
    for (int i = 0; i < evalMetrics_.size(); i++) {
      output.writeMessage(2, evalMetrics_.get(i));
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
    for (int i = 0; i < evalMetrics_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, evalMetrics_.get(i));
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
    if (!(obj instanceof com.clarifai.grpc.api.MultiEvalMetricsResponse)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.MultiEvalMetricsResponse other = (com.clarifai.grpc.api.MultiEvalMetricsResponse) obj;

    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (!getStatus()
          .equals(other.getStatus())) return false;
    }
    if (!getEvalMetricsList()
        .equals(other.getEvalMetricsList())) return false;
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
    if (getEvalMetricsCount() > 0) {
      hash = (37 * hash) + EVAL_METRICS_FIELD_NUMBER;
      hash = (53 * hash) + getEvalMetricsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.MultiEvalMetricsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.MultiEvalMetricsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiEvalMetricsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.MultiEvalMetricsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiEvalMetricsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.MultiEvalMetricsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiEvalMetricsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.MultiEvalMetricsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiEvalMetricsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.MultiEvalMetricsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiEvalMetricsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.MultiEvalMetricsResponse parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.MultiEvalMetricsResponse prototype) {
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
   * Protobuf type {@code clarifai.api.MultiEvalMetricsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.MultiEvalMetricsResponse)
      com.clarifai.grpc.api.MultiEvalMetricsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiEvalMetricsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiEvalMetricsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.MultiEvalMetricsResponse.class, com.clarifai.grpc.api.MultiEvalMetricsResponse.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.MultiEvalMetricsResponse.newBuilder()
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
        getEvalMetricsFieldBuilder();
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
      if (evalMetricsBuilder_ == null) {
        evalMetrics_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        evalMetricsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiEvalMetricsResponse_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.MultiEvalMetricsResponse getDefaultInstanceForType() {
      return com.clarifai.grpc.api.MultiEvalMetricsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.MultiEvalMetricsResponse build() {
      com.clarifai.grpc.api.MultiEvalMetricsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.MultiEvalMetricsResponse buildPartial() {
      com.clarifai.grpc.api.MultiEvalMetricsResponse result = new com.clarifai.grpc.api.MultiEvalMetricsResponse(this);
      int from_bitField0_ = bitField0_;
      if (statusBuilder_ == null) {
        result.status_ = status_;
      } else {
        result.status_ = statusBuilder_.build();
      }
      if (evalMetricsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          evalMetrics_ = java.util.Collections.unmodifiableList(evalMetrics_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.evalMetrics_ = evalMetrics_;
      } else {
        result.evalMetrics_ = evalMetricsBuilder_.build();
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
      if (other instanceof com.clarifai.grpc.api.MultiEvalMetricsResponse) {
        return mergeFrom((com.clarifai.grpc.api.MultiEvalMetricsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.MultiEvalMetricsResponse other) {
      if (other == com.clarifai.grpc.api.MultiEvalMetricsResponse.getDefaultInstance()) return this;
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
      }
      if (evalMetricsBuilder_ == null) {
        if (!other.evalMetrics_.isEmpty()) {
          if (evalMetrics_.isEmpty()) {
            evalMetrics_ = other.evalMetrics_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEvalMetricsIsMutable();
            evalMetrics_.addAll(other.evalMetrics_);
          }
          onChanged();
        }
      } else {
        if (!other.evalMetrics_.isEmpty()) {
          if (evalMetricsBuilder_.isEmpty()) {
            evalMetricsBuilder_.dispose();
            evalMetricsBuilder_ = null;
            evalMetrics_ = other.evalMetrics_;
            bitField0_ = (bitField0_ & ~0x00000001);
            evalMetricsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEvalMetricsFieldBuilder() : null;
          } else {
            evalMetricsBuilder_.addAllMessages(other.evalMetrics_);
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
      com.clarifai.grpc.api.MultiEvalMetricsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.MultiEvalMetricsResponse) e.getUnfinishedMessage();
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

    private java.util.List<com.clarifai.grpc.api.EvalMetrics> evalMetrics_ =
      java.util.Collections.emptyList();
    private void ensureEvalMetricsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        evalMetrics_ = new java.util.ArrayList<com.clarifai.grpc.api.EvalMetrics>(evalMetrics_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.EvalMetrics, com.clarifai.grpc.api.EvalMetrics.Builder, com.clarifai.grpc.api.EvalMetricsOrBuilder> evalMetricsBuilder_;

    /**
     * <code>repeated .clarifai.api.EvalMetrics eval_metrics = 2;</code>
     */
    public java.util.List<com.clarifai.grpc.api.EvalMetrics> getEvalMetricsList() {
      if (evalMetricsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(evalMetrics_);
      } else {
        return evalMetricsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .clarifai.api.EvalMetrics eval_metrics = 2;</code>
     */
    public int getEvalMetricsCount() {
      if (evalMetricsBuilder_ == null) {
        return evalMetrics_.size();
      } else {
        return evalMetricsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .clarifai.api.EvalMetrics eval_metrics = 2;</code>
     */
    public com.clarifai.grpc.api.EvalMetrics getEvalMetrics(int index) {
      if (evalMetricsBuilder_ == null) {
        return evalMetrics_.get(index);
      } else {
        return evalMetricsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .clarifai.api.EvalMetrics eval_metrics = 2;</code>
     */
    public Builder setEvalMetrics(
        int index, com.clarifai.grpc.api.EvalMetrics value) {
      if (evalMetricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEvalMetricsIsMutable();
        evalMetrics_.set(index, value);
        onChanged();
      } else {
        evalMetricsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.EvalMetrics eval_metrics = 2;</code>
     */
    public Builder setEvalMetrics(
        int index, com.clarifai.grpc.api.EvalMetrics.Builder builderForValue) {
      if (evalMetricsBuilder_ == null) {
        ensureEvalMetricsIsMutable();
        evalMetrics_.set(index, builderForValue.build());
        onChanged();
      } else {
        evalMetricsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.EvalMetrics eval_metrics = 2;</code>
     */
    public Builder addEvalMetrics(com.clarifai.grpc.api.EvalMetrics value) {
      if (evalMetricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEvalMetricsIsMutable();
        evalMetrics_.add(value);
        onChanged();
      } else {
        evalMetricsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.EvalMetrics eval_metrics = 2;</code>
     */
    public Builder addEvalMetrics(
        int index, com.clarifai.grpc.api.EvalMetrics value) {
      if (evalMetricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEvalMetricsIsMutable();
        evalMetrics_.add(index, value);
        onChanged();
      } else {
        evalMetricsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.EvalMetrics eval_metrics = 2;</code>
     */
    public Builder addEvalMetrics(
        com.clarifai.grpc.api.EvalMetrics.Builder builderForValue) {
      if (evalMetricsBuilder_ == null) {
        ensureEvalMetricsIsMutable();
        evalMetrics_.add(builderForValue.build());
        onChanged();
      } else {
        evalMetricsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.EvalMetrics eval_metrics = 2;</code>
     */
    public Builder addEvalMetrics(
        int index, com.clarifai.grpc.api.EvalMetrics.Builder builderForValue) {
      if (evalMetricsBuilder_ == null) {
        ensureEvalMetricsIsMutable();
        evalMetrics_.add(index, builderForValue.build());
        onChanged();
      } else {
        evalMetricsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.EvalMetrics eval_metrics = 2;</code>
     */
    public Builder addAllEvalMetrics(
        java.lang.Iterable<? extends com.clarifai.grpc.api.EvalMetrics> values) {
      if (evalMetricsBuilder_ == null) {
        ensureEvalMetricsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, evalMetrics_);
        onChanged();
      } else {
        evalMetricsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.EvalMetrics eval_metrics = 2;</code>
     */
    public Builder clearEvalMetrics() {
      if (evalMetricsBuilder_ == null) {
        evalMetrics_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        evalMetricsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.EvalMetrics eval_metrics = 2;</code>
     */
    public Builder removeEvalMetrics(int index) {
      if (evalMetricsBuilder_ == null) {
        ensureEvalMetricsIsMutable();
        evalMetrics_.remove(index);
        onChanged();
      } else {
        evalMetricsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.EvalMetrics eval_metrics = 2;</code>
     */
    public com.clarifai.grpc.api.EvalMetrics.Builder getEvalMetricsBuilder(
        int index) {
      return getEvalMetricsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .clarifai.api.EvalMetrics eval_metrics = 2;</code>
     */
    public com.clarifai.grpc.api.EvalMetricsOrBuilder getEvalMetricsOrBuilder(
        int index) {
      if (evalMetricsBuilder_ == null) {
        return evalMetrics_.get(index);  } else {
        return evalMetricsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .clarifai.api.EvalMetrics eval_metrics = 2;</code>
     */
    public java.util.List<? extends com.clarifai.grpc.api.EvalMetricsOrBuilder> 
         getEvalMetricsOrBuilderList() {
      if (evalMetricsBuilder_ != null) {
        return evalMetricsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(evalMetrics_);
      }
    }
    /**
     * <code>repeated .clarifai.api.EvalMetrics eval_metrics = 2;</code>
     */
    public com.clarifai.grpc.api.EvalMetrics.Builder addEvalMetricsBuilder() {
      return getEvalMetricsFieldBuilder().addBuilder(
          com.clarifai.grpc.api.EvalMetrics.getDefaultInstance());
    }
    /**
     * <code>repeated .clarifai.api.EvalMetrics eval_metrics = 2;</code>
     */
    public com.clarifai.grpc.api.EvalMetrics.Builder addEvalMetricsBuilder(
        int index) {
      return getEvalMetricsFieldBuilder().addBuilder(
          index, com.clarifai.grpc.api.EvalMetrics.getDefaultInstance());
    }
    /**
     * <code>repeated .clarifai.api.EvalMetrics eval_metrics = 2;</code>
     */
    public java.util.List<com.clarifai.grpc.api.EvalMetrics.Builder> 
         getEvalMetricsBuilderList() {
      return getEvalMetricsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.EvalMetrics, com.clarifai.grpc.api.EvalMetrics.Builder, com.clarifai.grpc.api.EvalMetricsOrBuilder> 
        getEvalMetricsFieldBuilder() {
      if (evalMetricsBuilder_ == null) {
        evalMetricsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.clarifai.grpc.api.EvalMetrics, com.clarifai.grpc.api.EvalMetrics.Builder, com.clarifai.grpc.api.EvalMetricsOrBuilder>(
                evalMetrics_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        evalMetrics_ = null;
      }
      return evalMetricsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.MultiEvalMetricsResponse)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.MultiEvalMetricsResponse)
  private static final com.clarifai.grpc.api.MultiEvalMetricsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.MultiEvalMetricsResponse();
  }

  public static com.clarifai.grpc.api.MultiEvalMetricsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MultiEvalMetricsResponse>
      PARSER = new com.google.protobuf.AbstractParser<MultiEvalMetricsResponse>() {
    @java.lang.Override
    public MultiEvalMetricsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MultiEvalMetricsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MultiEvalMetricsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MultiEvalMetricsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.MultiEvalMetricsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
