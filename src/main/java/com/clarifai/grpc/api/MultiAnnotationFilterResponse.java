// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

/**
 * <pre>
 * MultiAnnotationFilterResponse
 * </pre>
 *
 * Protobuf type {@code clarifai.api.MultiAnnotationFilterResponse}
 */
public final class MultiAnnotationFilterResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.MultiAnnotationFilterResponse)
    MultiAnnotationFilterResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MultiAnnotationFilterResponse.newBuilder() to construct.
  private MultiAnnotationFilterResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MultiAnnotationFilterResponse() {
    annotationFilters_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MultiAnnotationFilterResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MultiAnnotationFilterResponse(
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
              annotationFilters_ = new java.util.ArrayList<com.clarifai.grpc.api.AnnotationFilter>();
              mutable_bitField0_ |= 0x00000001;
            }
            annotationFilters_.add(
                input.readMessage(com.clarifai.grpc.api.AnnotationFilter.parser(), extensionRegistry));
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
        annotationFilters_ = java.util.Collections.unmodifiableList(annotationFilters_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiAnnotationFilterResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiAnnotationFilterResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.MultiAnnotationFilterResponse.class, com.clarifai.grpc.api.MultiAnnotationFilterResponse.Builder.class);
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

  public static final int ANNOTATION_FILTERS_FIELD_NUMBER = 2;
  private java.util.List<com.clarifai.grpc.api.AnnotationFilter> annotationFilters_;
  /**
   * <code>repeated .clarifai.api.AnnotationFilter annotation_filters = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  @java.lang.Override
  public java.util.List<com.clarifai.grpc.api.AnnotationFilter> getAnnotationFiltersList() {
    return annotationFilters_;
  }
  /**
   * <code>repeated .clarifai.api.AnnotationFilter annotation_filters = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.clarifai.grpc.api.AnnotationFilterOrBuilder> 
      getAnnotationFiltersOrBuilderList() {
    return annotationFilters_;
  }
  /**
   * <code>repeated .clarifai.api.AnnotationFilter annotation_filters = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  @java.lang.Override
  public int getAnnotationFiltersCount() {
    return annotationFilters_.size();
  }
  /**
   * <code>repeated .clarifai.api.AnnotationFilter annotation_filters = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.AnnotationFilter getAnnotationFilters(int index) {
    return annotationFilters_.get(index);
  }
  /**
   * <code>repeated .clarifai.api.AnnotationFilter annotation_filters = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.AnnotationFilterOrBuilder getAnnotationFiltersOrBuilder(
      int index) {
    return annotationFilters_.get(index);
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
    for (int i = 0; i < annotationFilters_.size(); i++) {
      output.writeMessage(2, annotationFilters_.get(i));
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
    for (int i = 0; i < annotationFilters_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, annotationFilters_.get(i));
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
    if (!(obj instanceof com.clarifai.grpc.api.MultiAnnotationFilterResponse)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.MultiAnnotationFilterResponse other = (com.clarifai.grpc.api.MultiAnnotationFilterResponse) obj;

    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (!getStatus()
          .equals(other.getStatus())) return false;
    }
    if (!getAnnotationFiltersList()
        .equals(other.getAnnotationFiltersList())) return false;
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
    if (getAnnotationFiltersCount() > 0) {
      hash = (37 * hash) + ANNOTATION_FILTERS_FIELD_NUMBER;
      hash = (53 * hash) + getAnnotationFiltersList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.MultiAnnotationFilterResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.MultiAnnotationFilterResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiAnnotationFilterResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.MultiAnnotationFilterResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiAnnotationFilterResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.MultiAnnotationFilterResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiAnnotationFilterResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.MultiAnnotationFilterResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiAnnotationFilterResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.MultiAnnotationFilterResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiAnnotationFilterResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.MultiAnnotationFilterResponse parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.MultiAnnotationFilterResponse prototype) {
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
   * MultiAnnotationFilterResponse
   * </pre>
   *
   * Protobuf type {@code clarifai.api.MultiAnnotationFilterResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.MultiAnnotationFilterResponse)
      com.clarifai.grpc.api.MultiAnnotationFilterResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiAnnotationFilterResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiAnnotationFilterResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.MultiAnnotationFilterResponse.class, com.clarifai.grpc.api.MultiAnnotationFilterResponse.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.MultiAnnotationFilterResponse.newBuilder()
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
        getAnnotationFiltersFieldBuilder();
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
      if (annotationFiltersBuilder_ == null) {
        annotationFilters_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        annotationFiltersBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiAnnotationFilterResponse_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.MultiAnnotationFilterResponse getDefaultInstanceForType() {
      return com.clarifai.grpc.api.MultiAnnotationFilterResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.MultiAnnotationFilterResponse build() {
      com.clarifai.grpc.api.MultiAnnotationFilterResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.MultiAnnotationFilterResponse buildPartial() {
      com.clarifai.grpc.api.MultiAnnotationFilterResponse result = new com.clarifai.grpc.api.MultiAnnotationFilterResponse(this);
      int from_bitField0_ = bitField0_;
      if (statusBuilder_ == null) {
        result.status_ = status_;
      } else {
        result.status_ = statusBuilder_.build();
      }
      if (annotationFiltersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          annotationFilters_ = java.util.Collections.unmodifiableList(annotationFilters_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.annotationFilters_ = annotationFilters_;
      } else {
        result.annotationFilters_ = annotationFiltersBuilder_.build();
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
      if (other instanceof com.clarifai.grpc.api.MultiAnnotationFilterResponse) {
        return mergeFrom((com.clarifai.grpc.api.MultiAnnotationFilterResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.MultiAnnotationFilterResponse other) {
      if (other == com.clarifai.grpc.api.MultiAnnotationFilterResponse.getDefaultInstance()) return this;
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
      }
      if (annotationFiltersBuilder_ == null) {
        if (!other.annotationFilters_.isEmpty()) {
          if (annotationFilters_.isEmpty()) {
            annotationFilters_ = other.annotationFilters_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAnnotationFiltersIsMutable();
            annotationFilters_.addAll(other.annotationFilters_);
          }
          onChanged();
        }
      } else {
        if (!other.annotationFilters_.isEmpty()) {
          if (annotationFiltersBuilder_.isEmpty()) {
            annotationFiltersBuilder_.dispose();
            annotationFiltersBuilder_ = null;
            annotationFilters_ = other.annotationFilters_;
            bitField0_ = (bitField0_ & ~0x00000001);
            annotationFiltersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAnnotationFiltersFieldBuilder() : null;
          } else {
            annotationFiltersBuilder_.addAllMessages(other.annotationFilters_);
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
      com.clarifai.grpc.api.MultiAnnotationFilterResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.MultiAnnotationFilterResponse) e.getUnfinishedMessage();
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

    private java.util.List<com.clarifai.grpc.api.AnnotationFilter> annotationFilters_ =
      java.util.Collections.emptyList();
    private void ensureAnnotationFiltersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        annotationFilters_ = new java.util.ArrayList<com.clarifai.grpc.api.AnnotationFilter>(annotationFilters_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.AnnotationFilter, com.clarifai.grpc.api.AnnotationFilter.Builder, com.clarifai.grpc.api.AnnotationFilterOrBuilder> annotationFiltersBuilder_;

    /**
     * <code>repeated .clarifai.api.AnnotationFilter annotation_filters = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public java.util.List<com.clarifai.grpc.api.AnnotationFilter> getAnnotationFiltersList() {
      if (annotationFiltersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(annotationFilters_);
      } else {
        return annotationFiltersBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .clarifai.api.AnnotationFilter annotation_filters = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public int getAnnotationFiltersCount() {
      if (annotationFiltersBuilder_ == null) {
        return annotationFilters_.size();
      } else {
        return annotationFiltersBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .clarifai.api.AnnotationFilter annotation_filters = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public com.clarifai.grpc.api.AnnotationFilter getAnnotationFilters(int index) {
      if (annotationFiltersBuilder_ == null) {
        return annotationFilters_.get(index);
      } else {
        return annotationFiltersBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .clarifai.api.AnnotationFilter annotation_filters = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder setAnnotationFilters(
        int index, com.clarifai.grpc.api.AnnotationFilter value) {
      if (annotationFiltersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnnotationFiltersIsMutable();
        annotationFilters_.set(index, value);
        onChanged();
      } else {
        annotationFiltersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.AnnotationFilter annotation_filters = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder setAnnotationFilters(
        int index, com.clarifai.grpc.api.AnnotationFilter.Builder builderForValue) {
      if (annotationFiltersBuilder_ == null) {
        ensureAnnotationFiltersIsMutable();
        annotationFilters_.set(index, builderForValue.build());
        onChanged();
      } else {
        annotationFiltersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.AnnotationFilter annotation_filters = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder addAnnotationFilters(com.clarifai.grpc.api.AnnotationFilter value) {
      if (annotationFiltersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnnotationFiltersIsMutable();
        annotationFilters_.add(value);
        onChanged();
      } else {
        annotationFiltersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.AnnotationFilter annotation_filters = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder addAnnotationFilters(
        int index, com.clarifai.grpc.api.AnnotationFilter value) {
      if (annotationFiltersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnnotationFiltersIsMutable();
        annotationFilters_.add(index, value);
        onChanged();
      } else {
        annotationFiltersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.AnnotationFilter annotation_filters = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder addAnnotationFilters(
        com.clarifai.grpc.api.AnnotationFilter.Builder builderForValue) {
      if (annotationFiltersBuilder_ == null) {
        ensureAnnotationFiltersIsMutable();
        annotationFilters_.add(builderForValue.build());
        onChanged();
      } else {
        annotationFiltersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.AnnotationFilter annotation_filters = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder addAnnotationFilters(
        int index, com.clarifai.grpc.api.AnnotationFilter.Builder builderForValue) {
      if (annotationFiltersBuilder_ == null) {
        ensureAnnotationFiltersIsMutable();
        annotationFilters_.add(index, builderForValue.build());
        onChanged();
      } else {
        annotationFiltersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.AnnotationFilter annotation_filters = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder addAllAnnotationFilters(
        java.lang.Iterable<? extends com.clarifai.grpc.api.AnnotationFilter> values) {
      if (annotationFiltersBuilder_ == null) {
        ensureAnnotationFiltersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, annotationFilters_);
        onChanged();
      } else {
        annotationFiltersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.AnnotationFilter annotation_filters = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder clearAnnotationFilters() {
      if (annotationFiltersBuilder_ == null) {
        annotationFilters_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        annotationFiltersBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.AnnotationFilter annotation_filters = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder removeAnnotationFilters(int index) {
      if (annotationFiltersBuilder_ == null) {
        ensureAnnotationFiltersIsMutable();
        annotationFilters_.remove(index);
        onChanged();
      } else {
        annotationFiltersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.AnnotationFilter annotation_filters = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public com.clarifai.grpc.api.AnnotationFilter.Builder getAnnotationFiltersBuilder(
        int index) {
      return getAnnotationFiltersFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .clarifai.api.AnnotationFilter annotation_filters = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public com.clarifai.grpc.api.AnnotationFilterOrBuilder getAnnotationFiltersOrBuilder(
        int index) {
      if (annotationFiltersBuilder_ == null) {
        return annotationFilters_.get(index);  } else {
        return annotationFiltersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .clarifai.api.AnnotationFilter annotation_filters = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public java.util.List<? extends com.clarifai.grpc.api.AnnotationFilterOrBuilder> 
         getAnnotationFiltersOrBuilderList() {
      if (annotationFiltersBuilder_ != null) {
        return annotationFiltersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(annotationFilters_);
      }
    }
    /**
     * <code>repeated .clarifai.api.AnnotationFilter annotation_filters = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public com.clarifai.grpc.api.AnnotationFilter.Builder addAnnotationFiltersBuilder() {
      return getAnnotationFiltersFieldBuilder().addBuilder(
          com.clarifai.grpc.api.AnnotationFilter.getDefaultInstance());
    }
    /**
     * <code>repeated .clarifai.api.AnnotationFilter annotation_filters = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public com.clarifai.grpc.api.AnnotationFilter.Builder addAnnotationFiltersBuilder(
        int index) {
      return getAnnotationFiltersFieldBuilder().addBuilder(
          index, com.clarifai.grpc.api.AnnotationFilter.getDefaultInstance());
    }
    /**
     * <code>repeated .clarifai.api.AnnotationFilter annotation_filters = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public java.util.List<com.clarifai.grpc.api.AnnotationFilter.Builder> 
         getAnnotationFiltersBuilderList() {
      return getAnnotationFiltersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.AnnotationFilter, com.clarifai.grpc.api.AnnotationFilter.Builder, com.clarifai.grpc.api.AnnotationFilterOrBuilder> 
        getAnnotationFiltersFieldBuilder() {
      if (annotationFiltersBuilder_ == null) {
        annotationFiltersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.clarifai.grpc.api.AnnotationFilter, com.clarifai.grpc.api.AnnotationFilter.Builder, com.clarifai.grpc.api.AnnotationFilterOrBuilder>(
                annotationFilters_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        annotationFilters_ = null;
      }
      return annotationFiltersBuilder_;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.MultiAnnotationFilterResponse)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.MultiAnnotationFilterResponse)
  private static final com.clarifai.grpc.api.MultiAnnotationFilterResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.MultiAnnotationFilterResponse();
  }

  public static com.clarifai.grpc.api.MultiAnnotationFilterResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MultiAnnotationFilterResponse>
      PARSER = new com.google.protobuf.AbstractParser<MultiAnnotationFilterResponse>() {
    @java.lang.Override
    public MultiAnnotationFilterResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MultiAnnotationFilterResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MultiAnnotationFilterResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MultiAnnotationFilterResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.MultiAnnotationFilterResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

