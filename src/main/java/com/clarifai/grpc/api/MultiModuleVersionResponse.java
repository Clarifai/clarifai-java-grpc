// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

/**
 * <pre>
 * MultiModuleVersionResponse
 * </pre>
 *
 * Protobuf type {@code clarifai.api.MultiModuleVersionResponse}
 */
public final class MultiModuleVersionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.MultiModuleVersionResponse)
    MultiModuleVersionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MultiModuleVersionResponse.newBuilder() to construct.
  private MultiModuleVersionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MultiModuleVersionResponse() {
    moduleVersions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MultiModuleVersionResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MultiModuleVersionResponse(
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
              moduleVersions_ = new java.util.ArrayList<com.clarifai.grpc.api.ModuleVersion>();
              mutable_bitField0_ |= 0x00000001;
            }
            moduleVersions_.add(
                input.readMessage(com.clarifai.grpc.api.ModuleVersion.parser(), extensionRegistry));
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
        moduleVersions_ = java.util.Collections.unmodifiableList(moduleVersions_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiModuleVersionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiModuleVersionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.MultiModuleVersionResponse.class, com.clarifai.grpc.api.MultiModuleVersionResponse.Builder.class);
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

  public static final int MODULE_VERSIONS_FIELD_NUMBER = 2;
  private java.util.List<com.clarifai.grpc.api.ModuleVersion> moduleVersions_;
  /**
   * <code>repeated .clarifai.api.ModuleVersion module_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  @java.lang.Override
  public java.util.List<com.clarifai.grpc.api.ModuleVersion> getModuleVersionsList() {
    return moduleVersions_;
  }
  /**
   * <code>repeated .clarifai.api.ModuleVersion module_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.clarifai.grpc.api.ModuleVersionOrBuilder> 
      getModuleVersionsOrBuilderList() {
    return moduleVersions_;
  }
  /**
   * <code>repeated .clarifai.api.ModuleVersion module_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  @java.lang.Override
  public int getModuleVersionsCount() {
    return moduleVersions_.size();
  }
  /**
   * <code>repeated .clarifai.api.ModuleVersion module_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.ModuleVersion getModuleVersions(int index) {
    return moduleVersions_.get(index);
  }
  /**
   * <code>repeated .clarifai.api.ModuleVersion module_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.ModuleVersionOrBuilder getModuleVersionsOrBuilder(
      int index) {
    return moduleVersions_.get(index);
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
    for (int i = 0; i < moduleVersions_.size(); i++) {
      output.writeMessage(2, moduleVersions_.get(i));
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
    for (int i = 0; i < moduleVersions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, moduleVersions_.get(i));
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
    if (!(obj instanceof com.clarifai.grpc.api.MultiModuleVersionResponse)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.MultiModuleVersionResponse other = (com.clarifai.grpc.api.MultiModuleVersionResponse) obj;

    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (!getStatus()
          .equals(other.getStatus())) return false;
    }
    if (!getModuleVersionsList()
        .equals(other.getModuleVersionsList())) return false;
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
    if (getModuleVersionsCount() > 0) {
      hash = (37 * hash) + MODULE_VERSIONS_FIELD_NUMBER;
      hash = (53 * hash) + getModuleVersionsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.MultiModuleVersionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.MultiModuleVersionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiModuleVersionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.MultiModuleVersionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiModuleVersionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.MultiModuleVersionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiModuleVersionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.MultiModuleVersionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiModuleVersionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.MultiModuleVersionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiModuleVersionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.MultiModuleVersionResponse parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.MultiModuleVersionResponse prototype) {
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
   * MultiModuleVersionResponse
   * </pre>
   *
   * Protobuf type {@code clarifai.api.MultiModuleVersionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.MultiModuleVersionResponse)
      com.clarifai.grpc.api.MultiModuleVersionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiModuleVersionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiModuleVersionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.MultiModuleVersionResponse.class, com.clarifai.grpc.api.MultiModuleVersionResponse.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.MultiModuleVersionResponse.newBuilder()
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
        getModuleVersionsFieldBuilder();
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
      if (moduleVersionsBuilder_ == null) {
        moduleVersions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        moduleVersionsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiModuleVersionResponse_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.MultiModuleVersionResponse getDefaultInstanceForType() {
      return com.clarifai.grpc.api.MultiModuleVersionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.MultiModuleVersionResponse build() {
      com.clarifai.grpc.api.MultiModuleVersionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.MultiModuleVersionResponse buildPartial() {
      com.clarifai.grpc.api.MultiModuleVersionResponse result = new com.clarifai.grpc.api.MultiModuleVersionResponse(this);
      int from_bitField0_ = bitField0_;
      if (statusBuilder_ == null) {
        result.status_ = status_;
      } else {
        result.status_ = statusBuilder_.build();
      }
      if (moduleVersionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          moduleVersions_ = java.util.Collections.unmodifiableList(moduleVersions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.moduleVersions_ = moduleVersions_;
      } else {
        result.moduleVersions_ = moduleVersionsBuilder_.build();
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
      if (other instanceof com.clarifai.grpc.api.MultiModuleVersionResponse) {
        return mergeFrom((com.clarifai.grpc.api.MultiModuleVersionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.MultiModuleVersionResponse other) {
      if (other == com.clarifai.grpc.api.MultiModuleVersionResponse.getDefaultInstance()) return this;
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
      }
      if (moduleVersionsBuilder_ == null) {
        if (!other.moduleVersions_.isEmpty()) {
          if (moduleVersions_.isEmpty()) {
            moduleVersions_ = other.moduleVersions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureModuleVersionsIsMutable();
            moduleVersions_.addAll(other.moduleVersions_);
          }
          onChanged();
        }
      } else {
        if (!other.moduleVersions_.isEmpty()) {
          if (moduleVersionsBuilder_.isEmpty()) {
            moduleVersionsBuilder_.dispose();
            moduleVersionsBuilder_ = null;
            moduleVersions_ = other.moduleVersions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            moduleVersionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getModuleVersionsFieldBuilder() : null;
          } else {
            moduleVersionsBuilder_.addAllMessages(other.moduleVersions_);
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
      com.clarifai.grpc.api.MultiModuleVersionResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.MultiModuleVersionResponse) e.getUnfinishedMessage();
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

    private java.util.List<com.clarifai.grpc.api.ModuleVersion> moduleVersions_ =
      java.util.Collections.emptyList();
    private void ensureModuleVersionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        moduleVersions_ = new java.util.ArrayList<com.clarifai.grpc.api.ModuleVersion>(moduleVersions_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.ModuleVersion, com.clarifai.grpc.api.ModuleVersion.Builder, com.clarifai.grpc.api.ModuleVersionOrBuilder> moduleVersionsBuilder_;

    /**
     * <code>repeated .clarifai.api.ModuleVersion module_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public java.util.List<com.clarifai.grpc.api.ModuleVersion> getModuleVersionsList() {
      if (moduleVersionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(moduleVersions_);
      } else {
        return moduleVersionsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .clarifai.api.ModuleVersion module_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public int getModuleVersionsCount() {
      if (moduleVersionsBuilder_ == null) {
        return moduleVersions_.size();
      } else {
        return moduleVersionsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .clarifai.api.ModuleVersion module_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public com.clarifai.grpc.api.ModuleVersion getModuleVersions(int index) {
      if (moduleVersionsBuilder_ == null) {
        return moduleVersions_.get(index);
      } else {
        return moduleVersionsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .clarifai.api.ModuleVersion module_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder setModuleVersions(
        int index, com.clarifai.grpc.api.ModuleVersion value) {
      if (moduleVersionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureModuleVersionsIsMutable();
        moduleVersions_.set(index, value);
        onChanged();
      } else {
        moduleVersionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.ModuleVersion module_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder setModuleVersions(
        int index, com.clarifai.grpc.api.ModuleVersion.Builder builderForValue) {
      if (moduleVersionsBuilder_ == null) {
        ensureModuleVersionsIsMutable();
        moduleVersions_.set(index, builderForValue.build());
        onChanged();
      } else {
        moduleVersionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.ModuleVersion module_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder addModuleVersions(com.clarifai.grpc.api.ModuleVersion value) {
      if (moduleVersionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureModuleVersionsIsMutable();
        moduleVersions_.add(value);
        onChanged();
      } else {
        moduleVersionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.ModuleVersion module_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder addModuleVersions(
        int index, com.clarifai.grpc.api.ModuleVersion value) {
      if (moduleVersionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureModuleVersionsIsMutable();
        moduleVersions_.add(index, value);
        onChanged();
      } else {
        moduleVersionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.ModuleVersion module_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder addModuleVersions(
        com.clarifai.grpc.api.ModuleVersion.Builder builderForValue) {
      if (moduleVersionsBuilder_ == null) {
        ensureModuleVersionsIsMutable();
        moduleVersions_.add(builderForValue.build());
        onChanged();
      } else {
        moduleVersionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.ModuleVersion module_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder addModuleVersions(
        int index, com.clarifai.grpc.api.ModuleVersion.Builder builderForValue) {
      if (moduleVersionsBuilder_ == null) {
        ensureModuleVersionsIsMutable();
        moduleVersions_.add(index, builderForValue.build());
        onChanged();
      } else {
        moduleVersionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.ModuleVersion module_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder addAllModuleVersions(
        java.lang.Iterable<? extends com.clarifai.grpc.api.ModuleVersion> values) {
      if (moduleVersionsBuilder_ == null) {
        ensureModuleVersionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, moduleVersions_);
        onChanged();
      } else {
        moduleVersionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.ModuleVersion module_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder clearModuleVersions() {
      if (moduleVersionsBuilder_ == null) {
        moduleVersions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        moduleVersionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.ModuleVersion module_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder removeModuleVersions(int index) {
      if (moduleVersionsBuilder_ == null) {
        ensureModuleVersionsIsMutable();
        moduleVersions_.remove(index);
        onChanged();
      } else {
        moduleVersionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.ModuleVersion module_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public com.clarifai.grpc.api.ModuleVersion.Builder getModuleVersionsBuilder(
        int index) {
      return getModuleVersionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .clarifai.api.ModuleVersion module_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public com.clarifai.grpc.api.ModuleVersionOrBuilder getModuleVersionsOrBuilder(
        int index) {
      if (moduleVersionsBuilder_ == null) {
        return moduleVersions_.get(index);  } else {
        return moduleVersionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .clarifai.api.ModuleVersion module_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public java.util.List<? extends com.clarifai.grpc.api.ModuleVersionOrBuilder> 
         getModuleVersionsOrBuilderList() {
      if (moduleVersionsBuilder_ != null) {
        return moduleVersionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(moduleVersions_);
      }
    }
    /**
     * <code>repeated .clarifai.api.ModuleVersion module_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public com.clarifai.grpc.api.ModuleVersion.Builder addModuleVersionsBuilder() {
      return getModuleVersionsFieldBuilder().addBuilder(
          com.clarifai.grpc.api.ModuleVersion.getDefaultInstance());
    }
    /**
     * <code>repeated .clarifai.api.ModuleVersion module_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public com.clarifai.grpc.api.ModuleVersion.Builder addModuleVersionsBuilder(
        int index) {
      return getModuleVersionsFieldBuilder().addBuilder(
          index, com.clarifai.grpc.api.ModuleVersion.getDefaultInstance());
    }
    /**
     * <code>repeated .clarifai.api.ModuleVersion module_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public java.util.List<com.clarifai.grpc.api.ModuleVersion.Builder> 
         getModuleVersionsBuilderList() {
      return getModuleVersionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.ModuleVersion, com.clarifai.grpc.api.ModuleVersion.Builder, com.clarifai.grpc.api.ModuleVersionOrBuilder> 
        getModuleVersionsFieldBuilder() {
      if (moduleVersionsBuilder_ == null) {
        moduleVersionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.clarifai.grpc.api.ModuleVersion, com.clarifai.grpc.api.ModuleVersion.Builder, com.clarifai.grpc.api.ModuleVersionOrBuilder>(
                moduleVersions_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        moduleVersions_ = null;
      }
      return moduleVersionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.MultiModuleVersionResponse)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.MultiModuleVersionResponse)
  private static final com.clarifai.grpc.api.MultiModuleVersionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.MultiModuleVersionResponse();
  }

  public static com.clarifai.grpc.api.MultiModuleVersionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MultiModuleVersionResponse>
      PARSER = new com.google.protobuf.AbstractParser<MultiModuleVersionResponse>() {
    @java.lang.Override
    public MultiModuleVersionResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MultiModuleVersionResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MultiModuleVersionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MultiModuleVersionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.MultiModuleVersionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

