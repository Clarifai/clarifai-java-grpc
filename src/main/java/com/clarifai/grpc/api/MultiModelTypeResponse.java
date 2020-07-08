// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

/**
 * Protobuf type {@code clarifai.api.MultiModelTypeResponse}
 */
public  final class MultiModelTypeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.MultiModelTypeResponse)
    MultiModelTypeResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MultiModelTypeResponse.newBuilder() to construct.
  private MultiModelTypeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MultiModelTypeResponse() {
    modelTypes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MultiModelTypeResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MultiModelTypeResponse(
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
              modelTypes_ = new java.util.ArrayList<com.clarifai.grpc.api.ModelType>();
              mutable_bitField0_ |= 0x00000001;
            }
            modelTypes_.add(
                input.readMessage(com.clarifai.grpc.api.ModelType.parser(), extensionRegistry));
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
        modelTypes_ = java.util.Collections.unmodifiableList(modelTypes_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiModelTypeResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiModelTypeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.MultiModelTypeResponse.class, com.clarifai.grpc.api.MultiModelTypeResponse.Builder.class);
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private com.clarifai.grpc.api.status.Status status_;
  /**
   * <pre>
   * Status of the response.
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
   * Status of the response.
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
   * Status of the response.
   * </pre>
   *
   * <code>.clarifai.api.status.Status status = 1;</code>
   */
  public com.clarifai.grpc.api.status.StatusOrBuilder getStatusOrBuilder() {
    return getStatus();
  }

  public static final int MODEL_TYPES_FIELD_NUMBER = 2;
  private java.util.List<com.clarifai.grpc.api.ModelType> modelTypes_;
  /**
   * <pre>
   * List of ModelType objects.
   * </pre>
   *
   * <code>repeated .clarifai.api.ModelType model_types = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  public java.util.List<com.clarifai.grpc.api.ModelType> getModelTypesList() {
    return modelTypes_;
  }
  /**
   * <pre>
   * List of ModelType objects.
   * </pre>
   *
   * <code>repeated .clarifai.api.ModelType model_types = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  public java.util.List<? extends com.clarifai.grpc.api.ModelTypeOrBuilder> 
      getModelTypesOrBuilderList() {
    return modelTypes_;
  }
  /**
   * <pre>
   * List of ModelType objects.
   * </pre>
   *
   * <code>repeated .clarifai.api.ModelType model_types = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  public int getModelTypesCount() {
    return modelTypes_.size();
  }
  /**
   * <pre>
   * List of ModelType objects.
   * </pre>
   *
   * <code>repeated .clarifai.api.ModelType model_types = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  public com.clarifai.grpc.api.ModelType getModelTypes(int index) {
    return modelTypes_.get(index);
  }
  /**
   * <pre>
   * List of ModelType objects.
   * </pre>
   *
   * <code>repeated .clarifai.api.ModelType model_types = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  public com.clarifai.grpc.api.ModelTypeOrBuilder getModelTypesOrBuilder(
      int index) {
    return modelTypes_.get(index);
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
    for (int i = 0; i < modelTypes_.size(); i++) {
      output.writeMessage(2, modelTypes_.get(i));
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
    for (int i = 0; i < modelTypes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, modelTypes_.get(i));
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
    if (!(obj instanceof com.clarifai.grpc.api.MultiModelTypeResponse)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.MultiModelTypeResponse other = (com.clarifai.grpc.api.MultiModelTypeResponse) obj;

    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (!getStatus()
          .equals(other.getStatus())) return false;
    }
    if (!getModelTypesList()
        .equals(other.getModelTypesList())) return false;
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
    if (getModelTypesCount() > 0) {
      hash = (37 * hash) + MODEL_TYPES_FIELD_NUMBER;
      hash = (53 * hash) + getModelTypesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.MultiModelTypeResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.MultiModelTypeResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiModelTypeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.MultiModelTypeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiModelTypeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.MultiModelTypeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiModelTypeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.MultiModelTypeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiModelTypeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.MultiModelTypeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiModelTypeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.MultiModelTypeResponse parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.MultiModelTypeResponse prototype) {
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
   * Protobuf type {@code clarifai.api.MultiModelTypeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.MultiModelTypeResponse)
      com.clarifai.grpc.api.MultiModelTypeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiModelTypeResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiModelTypeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.MultiModelTypeResponse.class, com.clarifai.grpc.api.MultiModelTypeResponse.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.MultiModelTypeResponse.newBuilder()
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
        getModelTypesFieldBuilder();
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
      if (modelTypesBuilder_ == null) {
        modelTypes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        modelTypesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiModelTypeResponse_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.MultiModelTypeResponse getDefaultInstanceForType() {
      return com.clarifai.grpc.api.MultiModelTypeResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.MultiModelTypeResponse build() {
      com.clarifai.grpc.api.MultiModelTypeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.MultiModelTypeResponse buildPartial() {
      com.clarifai.grpc.api.MultiModelTypeResponse result = new com.clarifai.grpc.api.MultiModelTypeResponse(this);
      int from_bitField0_ = bitField0_;
      if (statusBuilder_ == null) {
        result.status_ = status_;
      } else {
        result.status_ = statusBuilder_.build();
      }
      if (modelTypesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          modelTypes_ = java.util.Collections.unmodifiableList(modelTypes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.modelTypes_ = modelTypes_;
      } else {
        result.modelTypes_ = modelTypesBuilder_.build();
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
      if (other instanceof com.clarifai.grpc.api.MultiModelTypeResponse) {
        return mergeFrom((com.clarifai.grpc.api.MultiModelTypeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.MultiModelTypeResponse other) {
      if (other == com.clarifai.grpc.api.MultiModelTypeResponse.getDefaultInstance()) return this;
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
      }
      if (modelTypesBuilder_ == null) {
        if (!other.modelTypes_.isEmpty()) {
          if (modelTypes_.isEmpty()) {
            modelTypes_ = other.modelTypes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureModelTypesIsMutable();
            modelTypes_.addAll(other.modelTypes_);
          }
          onChanged();
        }
      } else {
        if (!other.modelTypes_.isEmpty()) {
          if (modelTypesBuilder_.isEmpty()) {
            modelTypesBuilder_.dispose();
            modelTypesBuilder_ = null;
            modelTypes_ = other.modelTypes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            modelTypesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getModelTypesFieldBuilder() : null;
          } else {
            modelTypesBuilder_.addAllMessages(other.modelTypes_);
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
      com.clarifai.grpc.api.MultiModelTypeResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.MultiModelTypeResponse) e.getUnfinishedMessage();
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
     * Status of the response.
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
     * Status of the response.
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
     * Status of the response.
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
     * Status of the response.
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
     * Status of the response.
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
     * Status of the response.
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
     * Status of the response.
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
     * Status of the response.
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
     * Status of the response.
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

    private java.util.List<com.clarifai.grpc.api.ModelType> modelTypes_ =
      java.util.Collections.emptyList();
    private void ensureModelTypesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        modelTypes_ = new java.util.ArrayList<com.clarifai.grpc.api.ModelType>(modelTypes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.ModelType, com.clarifai.grpc.api.ModelType.Builder, com.clarifai.grpc.api.ModelTypeOrBuilder> modelTypesBuilder_;

    /**
     * <pre>
     * List of ModelType objects.
     * </pre>
     *
     * <code>repeated .clarifai.api.ModelType model_types = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public java.util.List<com.clarifai.grpc.api.ModelType> getModelTypesList() {
      if (modelTypesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(modelTypes_);
      } else {
        return modelTypesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of ModelType objects.
     * </pre>
     *
     * <code>repeated .clarifai.api.ModelType model_types = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public int getModelTypesCount() {
      if (modelTypesBuilder_ == null) {
        return modelTypes_.size();
      } else {
        return modelTypesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of ModelType objects.
     * </pre>
     *
     * <code>repeated .clarifai.api.ModelType model_types = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public com.clarifai.grpc.api.ModelType getModelTypes(int index) {
      if (modelTypesBuilder_ == null) {
        return modelTypes_.get(index);
      } else {
        return modelTypesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of ModelType objects.
     * </pre>
     *
     * <code>repeated .clarifai.api.ModelType model_types = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder setModelTypes(
        int index, com.clarifai.grpc.api.ModelType value) {
      if (modelTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureModelTypesIsMutable();
        modelTypes_.set(index, value);
        onChanged();
      } else {
        modelTypesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of ModelType objects.
     * </pre>
     *
     * <code>repeated .clarifai.api.ModelType model_types = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder setModelTypes(
        int index, com.clarifai.grpc.api.ModelType.Builder builderForValue) {
      if (modelTypesBuilder_ == null) {
        ensureModelTypesIsMutable();
        modelTypes_.set(index, builderForValue.build());
        onChanged();
      } else {
        modelTypesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of ModelType objects.
     * </pre>
     *
     * <code>repeated .clarifai.api.ModelType model_types = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder addModelTypes(com.clarifai.grpc.api.ModelType value) {
      if (modelTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureModelTypesIsMutable();
        modelTypes_.add(value);
        onChanged();
      } else {
        modelTypesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of ModelType objects.
     * </pre>
     *
     * <code>repeated .clarifai.api.ModelType model_types = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder addModelTypes(
        int index, com.clarifai.grpc.api.ModelType value) {
      if (modelTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureModelTypesIsMutable();
        modelTypes_.add(index, value);
        onChanged();
      } else {
        modelTypesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of ModelType objects.
     * </pre>
     *
     * <code>repeated .clarifai.api.ModelType model_types = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder addModelTypes(
        com.clarifai.grpc.api.ModelType.Builder builderForValue) {
      if (modelTypesBuilder_ == null) {
        ensureModelTypesIsMutable();
        modelTypes_.add(builderForValue.build());
        onChanged();
      } else {
        modelTypesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of ModelType objects.
     * </pre>
     *
     * <code>repeated .clarifai.api.ModelType model_types = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder addModelTypes(
        int index, com.clarifai.grpc.api.ModelType.Builder builderForValue) {
      if (modelTypesBuilder_ == null) {
        ensureModelTypesIsMutable();
        modelTypes_.add(index, builderForValue.build());
        onChanged();
      } else {
        modelTypesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of ModelType objects.
     * </pre>
     *
     * <code>repeated .clarifai.api.ModelType model_types = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder addAllModelTypes(
        java.lang.Iterable<? extends com.clarifai.grpc.api.ModelType> values) {
      if (modelTypesBuilder_ == null) {
        ensureModelTypesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, modelTypes_);
        onChanged();
      } else {
        modelTypesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of ModelType objects.
     * </pre>
     *
     * <code>repeated .clarifai.api.ModelType model_types = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder clearModelTypes() {
      if (modelTypesBuilder_ == null) {
        modelTypes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        modelTypesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of ModelType objects.
     * </pre>
     *
     * <code>repeated .clarifai.api.ModelType model_types = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder removeModelTypes(int index) {
      if (modelTypesBuilder_ == null) {
        ensureModelTypesIsMutable();
        modelTypes_.remove(index);
        onChanged();
      } else {
        modelTypesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of ModelType objects.
     * </pre>
     *
     * <code>repeated .clarifai.api.ModelType model_types = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public com.clarifai.grpc.api.ModelType.Builder getModelTypesBuilder(
        int index) {
      return getModelTypesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of ModelType objects.
     * </pre>
     *
     * <code>repeated .clarifai.api.ModelType model_types = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public com.clarifai.grpc.api.ModelTypeOrBuilder getModelTypesOrBuilder(
        int index) {
      if (modelTypesBuilder_ == null) {
        return modelTypes_.get(index);  } else {
        return modelTypesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of ModelType objects.
     * </pre>
     *
     * <code>repeated .clarifai.api.ModelType model_types = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public java.util.List<? extends com.clarifai.grpc.api.ModelTypeOrBuilder> 
         getModelTypesOrBuilderList() {
      if (modelTypesBuilder_ != null) {
        return modelTypesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(modelTypes_);
      }
    }
    /**
     * <pre>
     * List of ModelType objects.
     * </pre>
     *
     * <code>repeated .clarifai.api.ModelType model_types = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public com.clarifai.grpc.api.ModelType.Builder addModelTypesBuilder() {
      return getModelTypesFieldBuilder().addBuilder(
          com.clarifai.grpc.api.ModelType.getDefaultInstance());
    }
    /**
     * <pre>
     * List of ModelType objects.
     * </pre>
     *
     * <code>repeated .clarifai.api.ModelType model_types = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public com.clarifai.grpc.api.ModelType.Builder addModelTypesBuilder(
        int index) {
      return getModelTypesFieldBuilder().addBuilder(
          index, com.clarifai.grpc.api.ModelType.getDefaultInstance());
    }
    /**
     * <pre>
     * List of ModelType objects.
     * </pre>
     *
     * <code>repeated .clarifai.api.ModelType model_types = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public java.util.List<com.clarifai.grpc.api.ModelType.Builder> 
         getModelTypesBuilderList() {
      return getModelTypesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.ModelType, com.clarifai.grpc.api.ModelType.Builder, com.clarifai.grpc.api.ModelTypeOrBuilder> 
        getModelTypesFieldBuilder() {
      if (modelTypesBuilder_ == null) {
        modelTypesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.clarifai.grpc.api.ModelType, com.clarifai.grpc.api.ModelType.Builder, com.clarifai.grpc.api.ModelTypeOrBuilder>(
                modelTypes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        modelTypes_ = null;
      }
      return modelTypesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.MultiModelTypeResponse)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.MultiModelTypeResponse)
  private static final com.clarifai.grpc.api.MultiModelTypeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.MultiModelTypeResponse();
  }

  public static com.clarifai.grpc.api.MultiModelTypeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MultiModelTypeResponse>
      PARSER = new com.google.protobuf.AbstractParser<MultiModelTypeResponse>() {
    @java.lang.Override
    public MultiModelTypeResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MultiModelTypeResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MultiModelTypeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MultiModelTypeResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.MultiModelTypeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

