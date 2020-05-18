// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

/**
 * Protobuf type {@code clarifai.api.MultiAnnotationSearchMetricsResponse}
 */
public  final class MultiAnnotationSearchMetricsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.MultiAnnotationSearchMetricsResponse)
    MultiAnnotationSearchMetricsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MultiAnnotationSearchMetricsResponse.newBuilder() to construct.
  private MultiAnnotationSearchMetricsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MultiAnnotationSearchMetricsResponse() {
    annotationSearchMetrics_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MultiAnnotationSearchMetricsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MultiAnnotationSearchMetricsResponse(
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
              annotationSearchMetrics_ = new java.util.ArrayList<com.clarifai.grpc.api.AnnotationSearchMetrics>();
              mutable_bitField0_ |= 0x00000001;
            }
            annotationSearchMetrics_.add(
                input.readMessage(com.clarifai.grpc.api.AnnotationSearchMetrics.parser(), extensionRegistry));
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
        annotationSearchMetrics_ = java.util.Collections.unmodifiableList(annotationSearchMetrics_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiAnnotationSearchMetricsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiAnnotationSearchMetricsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse.class, com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse.Builder.class);
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private com.clarifai.grpc.api.status.Status status_;
  /**
   * <pre>
   * Status of the request
   * </pre>
   *
   * <code>.clarifai.api.status.Status status = 1;</code>
   * @return Whether the status field is set.
   */
  public boolean hasStatus() {
    return status_ != null;
  }
  /**
   * <pre>
   * Status of the request
   * </pre>
   *
   * <code>.clarifai.api.status.Status status = 1;</code>
   * @return The status.
   */
  public com.clarifai.grpc.api.status.Status getStatus() {
    return status_ == null ? com.clarifai.grpc.api.status.Status.getDefaultInstance() : status_;
  }
  /**
   * <pre>
   * Status of the request
   * </pre>
   *
   * <code>.clarifai.api.status.Status status = 1;</code>
   */
  public com.clarifai.grpc.api.status.StatusOrBuilder getStatusOrBuilder() {
    return getStatus();
  }

  public static final int ANNOTATION_SEARCH_METRICS_FIELD_NUMBER = 2;
  private java.util.List<com.clarifai.grpc.api.AnnotationSearchMetrics> annotationSearchMetrics_;
  /**
   * <code>repeated .clarifai.api.AnnotationSearchMetrics annotation_search_metrics = 2;</code>
   */
  public java.util.List<com.clarifai.grpc.api.AnnotationSearchMetrics> getAnnotationSearchMetricsList() {
    return annotationSearchMetrics_;
  }
  /**
   * <code>repeated .clarifai.api.AnnotationSearchMetrics annotation_search_metrics = 2;</code>
   */
  public java.util.List<? extends com.clarifai.grpc.api.AnnotationSearchMetricsOrBuilder> 
      getAnnotationSearchMetricsOrBuilderList() {
    return annotationSearchMetrics_;
  }
  /**
   * <code>repeated .clarifai.api.AnnotationSearchMetrics annotation_search_metrics = 2;</code>
   */
  public int getAnnotationSearchMetricsCount() {
    return annotationSearchMetrics_.size();
  }
  /**
   * <code>repeated .clarifai.api.AnnotationSearchMetrics annotation_search_metrics = 2;</code>
   */
  public com.clarifai.grpc.api.AnnotationSearchMetrics getAnnotationSearchMetrics(int index) {
    return annotationSearchMetrics_.get(index);
  }
  /**
   * <code>repeated .clarifai.api.AnnotationSearchMetrics annotation_search_metrics = 2;</code>
   */
  public com.clarifai.grpc.api.AnnotationSearchMetricsOrBuilder getAnnotationSearchMetricsOrBuilder(
      int index) {
    return annotationSearchMetrics_.get(index);
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
    for (int i = 0; i < annotationSearchMetrics_.size(); i++) {
      output.writeMessage(2, annotationSearchMetrics_.get(i));
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
    for (int i = 0; i < annotationSearchMetrics_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, annotationSearchMetrics_.get(i));
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
    if (!(obj instanceof com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse other = (com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse) obj;

    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (!getStatus()
          .equals(other.getStatus())) return false;
    }
    if (!getAnnotationSearchMetricsList()
        .equals(other.getAnnotationSearchMetricsList())) return false;
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
    if (getAnnotationSearchMetricsCount() > 0) {
      hash = (37 * hash) + ANNOTATION_SEARCH_METRICS_FIELD_NUMBER;
      hash = (53 * hash) + getAnnotationSearchMetricsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse prototype) {
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
   * Protobuf type {@code clarifai.api.MultiAnnotationSearchMetricsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.MultiAnnotationSearchMetricsResponse)
      com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiAnnotationSearchMetricsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiAnnotationSearchMetricsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse.class, com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse.newBuilder()
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
        getAnnotationSearchMetricsFieldBuilder();
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
      if (annotationSearchMetricsBuilder_ == null) {
        annotationSearchMetrics_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        annotationSearchMetricsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiAnnotationSearchMetricsResponse_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse getDefaultInstanceForType() {
      return com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse build() {
      com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse buildPartial() {
      com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse result = new com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse(this);
      int from_bitField0_ = bitField0_;
      if (statusBuilder_ == null) {
        result.status_ = status_;
      } else {
        result.status_ = statusBuilder_.build();
      }
      if (annotationSearchMetricsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          annotationSearchMetrics_ = java.util.Collections.unmodifiableList(annotationSearchMetrics_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.annotationSearchMetrics_ = annotationSearchMetrics_;
      } else {
        result.annotationSearchMetrics_ = annotationSearchMetricsBuilder_.build();
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
      if (other instanceof com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse) {
        return mergeFrom((com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse other) {
      if (other == com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse.getDefaultInstance()) return this;
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
      }
      if (annotationSearchMetricsBuilder_ == null) {
        if (!other.annotationSearchMetrics_.isEmpty()) {
          if (annotationSearchMetrics_.isEmpty()) {
            annotationSearchMetrics_ = other.annotationSearchMetrics_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAnnotationSearchMetricsIsMutable();
            annotationSearchMetrics_.addAll(other.annotationSearchMetrics_);
          }
          onChanged();
        }
      } else {
        if (!other.annotationSearchMetrics_.isEmpty()) {
          if (annotationSearchMetricsBuilder_.isEmpty()) {
            annotationSearchMetricsBuilder_.dispose();
            annotationSearchMetricsBuilder_ = null;
            annotationSearchMetrics_ = other.annotationSearchMetrics_;
            bitField0_ = (bitField0_ & ~0x00000001);
            annotationSearchMetricsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAnnotationSearchMetricsFieldBuilder() : null;
          } else {
            annotationSearchMetricsBuilder_.addAllMessages(other.annotationSearchMetrics_);
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
      com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse) e.getUnfinishedMessage();
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
     * <pre>
     * Status of the request
     * </pre>
     *
     * <code>.clarifai.api.status.Status status = 1;</code>
     * @return Whether the status field is set.
     */
    public boolean hasStatus() {
      return statusBuilder_ != null || status_ != null;
    }
    /**
     * <pre>
     * Status of the request
     * </pre>
     *
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
     * <pre>
     * Status of the request
     * </pre>
     *
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
     * <pre>
     * Status of the request
     * </pre>
     *
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
     * <pre>
     * Status of the request
     * </pre>
     *
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
     * <pre>
     * Status of the request
     * </pre>
     *
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
     * <pre>
     * Status of the request
     * </pre>
     *
     * <code>.clarifai.api.status.Status status = 1;</code>
     */
    public com.clarifai.grpc.api.status.Status.Builder getStatusBuilder() {
      
      onChanged();
      return getStatusFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Status of the request
     * </pre>
     *
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
     * <pre>
     * Status of the request
     * </pre>
     *
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

    private java.util.List<com.clarifai.grpc.api.AnnotationSearchMetrics> annotationSearchMetrics_ =
      java.util.Collections.emptyList();
    private void ensureAnnotationSearchMetricsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        annotationSearchMetrics_ = new java.util.ArrayList<com.clarifai.grpc.api.AnnotationSearchMetrics>(annotationSearchMetrics_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.AnnotationSearchMetrics, com.clarifai.grpc.api.AnnotationSearchMetrics.Builder, com.clarifai.grpc.api.AnnotationSearchMetricsOrBuilder> annotationSearchMetricsBuilder_;

    /**
     * <code>repeated .clarifai.api.AnnotationSearchMetrics annotation_search_metrics = 2;</code>
     */
    public java.util.List<com.clarifai.grpc.api.AnnotationSearchMetrics> getAnnotationSearchMetricsList() {
      if (annotationSearchMetricsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(annotationSearchMetrics_);
      } else {
        return annotationSearchMetricsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .clarifai.api.AnnotationSearchMetrics annotation_search_metrics = 2;</code>
     */
    public int getAnnotationSearchMetricsCount() {
      if (annotationSearchMetricsBuilder_ == null) {
        return annotationSearchMetrics_.size();
      } else {
        return annotationSearchMetricsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .clarifai.api.AnnotationSearchMetrics annotation_search_metrics = 2;</code>
     */
    public com.clarifai.grpc.api.AnnotationSearchMetrics getAnnotationSearchMetrics(int index) {
      if (annotationSearchMetricsBuilder_ == null) {
        return annotationSearchMetrics_.get(index);
      } else {
        return annotationSearchMetricsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .clarifai.api.AnnotationSearchMetrics annotation_search_metrics = 2;</code>
     */
    public Builder setAnnotationSearchMetrics(
        int index, com.clarifai.grpc.api.AnnotationSearchMetrics value) {
      if (annotationSearchMetricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnnotationSearchMetricsIsMutable();
        annotationSearchMetrics_.set(index, value);
        onChanged();
      } else {
        annotationSearchMetricsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.AnnotationSearchMetrics annotation_search_metrics = 2;</code>
     */
    public Builder setAnnotationSearchMetrics(
        int index, com.clarifai.grpc.api.AnnotationSearchMetrics.Builder builderForValue) {
      if (annotationSearchMetricsBuilder_ == null) {
        ensureAnnotationSearchMetricsIsMutable();
        annotationSearchMetrics_.set(index, builderForValue.build());
        onChanged();
      } else {
        annotationSearchMetricsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.AnnotationSearchMetrics annotation_search_metrics = 2;</code>
     */
    public Builder addAnnotationSearchMetrics(com.clarifai.grpc.api.AnnotationSearchMetrics value) {
      if (annotationSearchMetricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnnotationSearchMetricsIsMutable();
        annotationSearchMetrics_.add(value);
        onChanged();
      } else {
        annotationSearchMetricsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.AnnotationSearchMetrics annotation_search_metrics = 2;</code>
     */
    public Builder addAnnotationSearchMetrics(
        int index, com.clarifai.grpc.api.AnnotationSearchMetrics value) {
      if (annotationSearchMetricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnnotationSearchMetricsIsMutable();
        annotationSearchMetrics_.add(index, value);
        onChanged();
      } else {
        annotationSearchMetricsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.AnnotationSearchMetrics annotation_search_metrics = 2;</code>
     */
    public Builder addAnnotationSearchMetrics(
        com.clarifai.grpc.api.AnnotationSearchMetrics.Builder builderForValue) {
      if (annotationSearchMetricsBuilder_ == null) {
        ensureAnnotationSearchMetricsIsMutable();
        annotationSearchMetrics_.add(builderForValue.build());
        onChanged();
      } else {
        annotationSearchMetricsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.AnnotationSearchMetrics annotation_search_metrics = 2;</code>
     */
    public Builder addAnnotationSearchMetrics(
        int index, com.clarifai.grpc.api.AnnotationSearchMetrics.Builder builderForValue) {
      if (annotationSearchMetricsBuilder_ == null) {
        ensureAnnotationSearchMetricsIsMutable();
        annotationSearchMetrics_.add(index, builderForValue.build());
        onChanged();
      } else {
        annotationSearchMetricsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.AnnotationSearchMetrics annotation_search_metrics = 2;</code>
     */
    public Builder addAllAnnotationSearchMetrics(
        java.lang.Iterable<? extends com.clarifai.grpc.api.AnnotationSearchMetrics> values) {
      if (annotationSearchMetricsBuilder_ == null) {
        ensureAnnotationSearchMetricsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, annotationSearchMetrics_);
        onChanged();
      } else {
        annotationSearchMetricsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.AnnotationSearchMetrics annotation_search_metrics = 2;</code>
     */
    public Builder clearAnnotationSearchMetrics() {
      if (annotationSearchMetricsBuilder_ == null) {
        annotationSearchMetrics_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        annotationSearchMetricsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.AnnotationSearchMetrics annotation_search_metrics = 2;</code>
     */
    public Builder removeAnnotationSearchMetrics(int index) {
      if (annotationSearchMetricsBuilder_ == null) {
        ensureAnnotationSearchMetricsIsMutable();
        annotationSearchMetrics_.remove(index);
        onChanged();
      } else {
        annotationSearchMetricsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.AnnotationSearchMetrics annotation_search_metrics = 2;</code>
     */
    public com.clarifai.grpc.api.AnnotationSearchMetrics.Builder getAnnotationSearchMetricsBuilder(
        int index) {
      return getAnnotationSearchMetricsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .clarifai.api.AnnotationSearchMetrics annotation_search_metrics = 2;</code>
     */
    public com.clarifai.grpc.api.AnnotationSearchMetricsOrBuilder getAnnotationSearchMetricsOrBuilder(
        int index) {
      if (annotationSearchMetricsBuilder_ == null) {
        return annotationSearchMetrics_.get(index);  } else {
        return annotationSearchMetricsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .clarifai.api.AnnotationSearchMetrics annotation_search_metrics = 2;</code>
     */
    public java.util.List<? extends com.clarifai.grpc.api.AnnotationSearchMetricsOrBuilder> 
         getAnnotationSearchMetricsOrBuilderList() {
      if (annotationSearchMetricsBuilder_ != null) {
        return annotationSearchMetricsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(annotationSearchMetrics_);
      }
    }
    /**
     * <code>repeated .clarifai.api.AnnotationSearchMetrics annotation_search_metrics = 2;</code>
     */
    public com.clarifai.grpc.api.AnnotationSearchMetrics.Builder addAnnotationSearchMetricsBuilder() {
      return getAnnotationSearchMetricsFieldBuilder().addBuilder(
          com.clarifai.grpc.api.AnnotationSearchMetrics.getDefaultInstance());
    }
    /**
     * <code>repeated .clarifai.api.AnnotationSearchMetrics annotation_search_metrics = 2;</code>
     */
    public com.clarifai.grpc.api.AnnotationSearchMetrics.Builder addAnnotationSearchMetricsBuilder(
        int index) {
      return getAnnotationSearchMetricsFieldBuilder().addBuilder(
          index, com.clarifai.grpc.api.AnnotationSearchMetrics.getDefaultInstance());
    }
    /**
     * <code>repeated .clarifai.api.AnnotationSearchMetrics annotation_search_metrics = 2;</code>
     */
    public java.util.List<com.clarifai.grpc.api.AnnotationSearchMetrics.Builder> 
         getAnnotationSearchMetricsBuilderList() {
      return getAnnotationSearchMetricsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.AnnotationSearchMetrics, com.clarifai.grpc.api.AnnotationSearchMetrics.Builder, com.clarifai.grpc.api.AnnotationSearchMetricsOrBuilder> 
        getAnnotationSearchMetricsFieldBuilder() {
      if (annotationSearchMetricsBuilder_ == null) {
        annotationSearchMetricsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.clarifai.grpc.api.AnnotationSearchMetrics, com.clarifai.grpc.api.AnnotationSearchMetrics.Builder, com.clarifai.grpc.api.AnnotationSearchMetricsOrBuilder>(
                annotationSearchMetrics_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        annotationSearchMetrics_ = null;
      }
      return annotationSearchMetricsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.MultiAnnotationSearchMetricsResponse)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.MultiAnnotationSearchMetricsResponse)
  private static final com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse();
  }

  public static com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MultiAnnotationSearchMetricsResponse>
      PARSER = new com.google.protobuf.AbstractParser<MultiAnnotationSearchMetricsResponse>() {
    @java.lang.Override
    public MultiAnnotationSearchMetricsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MultiAnnotationSearchMetricsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MultiAnnotationSearchMetricsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MultiAnnotationSearchMetricsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.MultiAnnotationSearchMetricsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

