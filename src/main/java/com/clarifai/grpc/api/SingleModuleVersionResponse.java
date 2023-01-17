// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

/**
 * <pre>
 * SingleModuleVersionResponse
 * </pre>
 *
 * Protobuf type {@code clarifai.api.SingleModuleVersionResponse}
 */
public final class SingleModuleVersionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.SingleModuleVersionResponse)
    SingleModuleVersionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SingleModuleVersionResponse.newBuilder() to construct.
  private SingleModuleVersionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SingleModuleVersionResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SingleModuleVersionResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SingleModuleVersionResponse(
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
            com.clarifai.grpc.api.ModuleVersion.Builder subBuilder = null;
            if (moduleVersion_ != null) {
              subBuilder = moduleVersion_.toBuilder();
            }
            moduleVersion_ = input.readMessage(com.clarifai.grpc.api.ModuleVersion.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(moduleVersion_);
              moduleVersion_ = subBuilder.buildPartial();
            }

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
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_SingleModuleVersionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_SingleModuleVersionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.SingleModuleVersionResponse.class, com.clarifai.grpc.api.SingleModuleVersionResponse.Builder.class);
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

  public static final int MODULE_VERSION_FIELD_NUMBER = 2;
  private com.clarifai.grpc.api.ModuleVersion moduleVersion_;
  /**
   * <code>.clarifai.api.ModuleVersion module_version = 2;</code>
   * @return Whether the moduleVersion field is set.
   */
  @java.lang.Override
  public boolean hasModuleVersion() {
    return moduleVersion_ != null;
  }
  /**
   * <code>.clarifai.api.ModuleVersion module_version = 2;</code>
   * @return The moduleVersion.
   */
  @java.lang.Override
  public com.clarifai.grpc.api.ModuleVersion getModuleVersion() {
    return moduleVersion_ == null ? com.clarifai.grpc.api.ModuleVersion.getDefaultInstance() : moduleVersion_;
  }
  /**
   * <code>.clarifai.api.ModuleVersion module_version = 2;</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.ModuleVersionOrBuilder getModuleVersionOrBuilder() {
    return getModuleVersion();
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
    if (moduleVersion_ != null) {
      output.writeMessage(2, getModuleVersion());
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
    if (moduleVersion_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getModuleVersion());
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
    if (!(obj instanceof com.clarifai.grpc.api.SingleModuleVersionResponse)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.SingleModuleVersionResponse other = (com.clarifai.grpc.api.SingleModuleVersionResponse) obj;

    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (!getStatus()
          .equals(other.getStatus())) return false;
    }
    if (hasModuleVersion() != other.hasModuleVersion()) return false;
    if (hasModuleVersion()) {
      if (!getModuleVersion()
          .equals(other.getModuleVersion())) return false;
    }
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
    if (hasModuleVersion()) {
      hash = (37 * hash) + MODULE_VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getModuleVersion().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.SingleModuleVersionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.SingleModuleVersionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.SingleModuleVersionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.SingleModuleVersionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.SingleModuleVersionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.SingleModuleVersionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.SingleModuleVersionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.SingleModuleVersionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.SingleModuleVersionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.SingleModuleVersionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.SingleModuleVersionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.SingleModuleVersionResponse parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.SingleModuleVersionResponse prototype) {
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
   * SingleModuleVersionResponse
   * </pre>
   *
   * Protobuf type {@code clarifai.api.SingleModuleVersionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.SingleModuleVersionResponse)
      com.clarifai.grpc.api.SingleModuleVersionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_SingleModuleVersionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_SingleModuleVersionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.SingleModuleVersionResponse.class, com.clarifai.grpc.api.SingleModuleVersionResponse.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.SingleModuleVersionResponse.newBuilder()
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
      if (statusBuilder_ == null) {
        status_ = null;
      } else {
        status_ = null;
        statusBuilder_ = null;
      }
      if (moduleVersionBuilder_ == null) {
        moduleVersion_ = null;
      } else {
        moduleVersion_ = null;
        moduleVersionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_SingleModuleVersionResponse_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.SingleModuleVersionResponse getDefaultInstanceForType() {
      return com.clarifai.grpc.api.SingleModuleVersionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.SingleModuleVersionResponse build() {
      com.clarifai.grpc.api.SingleModuleVersionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.SingleModuleVersionResponse buildPartial() {
      com.clarifai.grpc.api.SingleModuleVersionResponse result = new com.clarifai.grpc.api.SingleModuleVersionResponse(this);
      if (statusBuilder_ == null) {
        result.status_ = status_;
      } else {
        result.status_ = statusBuilder_.build();
      }
      if (moduleVersionBuilder_ == null) {
        result.moduleVersion_ = moduleVersion_;
      } else {
        result.moduleVersion_ = moduleVersionBuilder_.build();
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
      if (other instanceof com.clarifai.grpc.api.SingleModuleVersionResponse) {
        return mergeFrom((com.clarifai.grpc.api.SingleModuleVersionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.SingleModuleVersionResponse other) {
      if (other == com.clarifai.grpc.api.SingleModuleVersionResponse.getDefaultInstance()) return this;
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
      }
      if (other.hasModuleVersion()) {
        mergeModuleVersion(other.getModuleVersion());
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
      com.clarifai.grpc.api.SingleModuleVersionResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.SingleModuleVersionResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

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

    private com.clarifai.grpc.api.ModuleVersion moduleVersion_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.ModuleVersion, com.clarifai.grpc.api.ModuleVersion.Builder, com.clarifai.grpc.api.ModuleVersionOrBuilder> moduleVersionBuilder_;
    /**
     * <code>.clarifai.api.ModuleVersion module_version = 2;</code>
     * @return Whether the moduleVersion field is set.
     */
    public boolean hasModuleVersion() {
      return moduleVersionBuilder_ != null || moduleVersion_ != null;
    }
    /**
     * <code>.clarifai.api.ModuleVersion module_version = 2;</code>
     * @return The moduleVersion.
     */
    public com.clarifai.grpc.api.ModuleVersion getModuleVersion() {
      if (moduleVersionBuilder_ == null) {
        return moduleVersion_ == null ? com.clarifai.grpc.api.ModuleVersion.getDefaultInstance() : moduleVersion_;
      } else {
        return moduleVersionBuilder_.getMessage();
      }
    }
    /**
     * <code>.clarifai.api.ModuleVersion module_version = 2;</code>
     */
    public Builder setModuleVersion(com.clarifai.grpc.api.ModuleVersion value) {
      if (moduleVersionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        moduleVersion_ = value;
        onChanged();
      } else {
        moduleVersionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.clarifai.api.ModuleVersion module_version = 2;</code>
     */
    public Builder setModuleVersion(
        com.clarifai.grpc.api.ModuleVersion.Builder builderForValue) {
      if (moduleVersionBuilder_ == null) {
        moduleVersion_ = builderForValue.build();
        onChanged();
      } else {
        moduleVersionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.clarifai.api.ModuleVersion module_version = 2;</code>
     */
    public Builder mergeModuleVersion(com.clarifai.grpc.api.ModuleVersion value) {
      if (moduleVersionBuilder_ == null) {
        if (moduleVersion_ != null) {
          moduleVersion_ =
            com.clarifai.grpc.api.ModuleVersion.newBuilder(moduleVersion_).mergeFrom(value).buildPartial();
        } else {
          moduleVersion_ = value;
        }
        onChanged();
      } else {
        moduleVersionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.clarifai.api.ModuleVersion module_version = 2;</code>
     */
    public Builder clearModuleVersion() {
      if (moduleVersionBuilder_ == null) {
        moduleVersion_ = null;
        onChanged();
      } else {
        moduleVersion_ = null;
        moduleVersionBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.clarifai.api.ModuleVersion module_version = 2;</code>
     */
    public com.clarifai.grpc.api.ModuleVersion.Builder getModuleVersionBuilder() {
      
      onChanged();
      return getModuleVersionFieldBuilder().getBuilder();
    }
    /**
     * <code>.clarifai.api.ModuleVersion module_version = 2;</code>
     */
    public com.clarifai.grpc.api.ModuleVersionOrBuilder getModuleVersionOrBuilder() {
      if (moduleVersionBuilder_ != null) {
        return moduleVersionBuilder_.getMessageOrBuilder();
      } else {
        return moduleVersion_ == null ?
            com.clarifai.grpc.api.ModuleVersion.getDefaultInstance() : moduleVersion_;
      }
    }
    /**
     * <code>.clarifai.api.ModuleVersion module_version = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.ModuleVersion, com.clarifai.grpc.api.ModuleVersion.Builder, com.clarifai.grpc.api.ModuleVersionOrBuilder> 
        getModuleVersionFieldBuilder() {
      if (moduleVersionBuilder_ == null) {
        moduleVersionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.clarifai.grpc.api.ModuleVersion, com.clarifai.grpc.api.ModuleVersion.Builder, com.clarifai.grpc.api.ModuleVersionOrBuilder>(
                getModuleVersion(),
                getParentForChildren(),
                isClean());
        moduleVersion_ = null;
      }
      return moduleVersionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.SingleModuleVersionResponse)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.SingleModuleVersionResponse)
  private static final com.clarifai.grpc.api.SingleModuleVersionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.SingleModuleVersionResponse();
  }

  public static com.clarifai.grpc.api.SingleModuleVersionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SingleModuleVersionResponse>
      PARSER = new com.google.protobuf.AbstractParser<SingleModuleVersionResponse>() {
    @java.lang.Override
    public SingleModuleVersionResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SingleModuleVersionResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SingleModuleVersionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SingleModuleVersionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.SingleModuleVersionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

