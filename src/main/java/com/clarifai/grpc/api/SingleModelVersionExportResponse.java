// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

/**
 * <pre>
 * SingleModelVersionExportResponse
 * </pre>
 *
 * Protobuf type {@code clarifai.api.SingleModelVersionExportResponse}
 */
public final class SingleModelVersionExportResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.SingleModelVersionExportResponse)
    SingleModelVersionExportResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SingleModelVersionExportResponse.newBuilder() to construct.
  private SingleModelVersionExportResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SingleModelVersionExportResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SingleModelVersionExportResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SingleModelVersionExportResponse(
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
            com.clarifai.grpc.api.ModelVersionExport.Builder subBuilder = null;
            if (export_ != null) {
              subBuilder = export_.toBuilder();
            }
            export_ = input.readMessage(com.clarifai.grpc.api.ModelVersionExport.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(export_);
              export_ = subBuilder.buildPartial();
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
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_SingleModelVersionExportResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_SingleModelVersionExportResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.SingleModelVersionExportResponse.class, com.clarifai.grpc.api.SingleModelVersionExportResponse.Builder.class);
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

  public static final int EXPORT_FIELD_NUMBER = 2;
  private com.clarifai.grpc.api.ModelVersionExport export_;
  /**
   * <code>.clarifai.api.ModelVersionExport export = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return Whether the export field is set.
   */
  @java.lang.Override
  public boolean hasExport() {
    return export_ != null;
  }
  /**
   * <code>.clarifai.api.ModelVersionExport export = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The export.
   */
  @java.lang.Override
  public com.clarifai.grpc.api.ModelVersionExport getExport() {
    return export_ == null ? com.clarifai.grpc.api.ModelVersionExport.getDefaultInstance() : export_;
  }
  /**
   * <code>.clarifai.api.ModelVersionExport export = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.ModelVersionExportOrBuilder getExportOrBuilder() {
    return getExport();
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
    if (export_ != null) {
      output.writeMessage(2, getExport());
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
    if (export_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getExport());
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
    if (!(obj instanceof com.clarifai.grpc.api.SingleModelVersionExportResponse)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.SingleModelVersionExportResponse other = (com.clarifai.grpc.api.SingleModelVersionExportResponse) obj;

    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (!getStatus()
          .equals(other.getStatus())) return false;
    }
    if (hasExport() != other.hasExport()) return false;
    if (hasExport()) {
      if (!getExport()
          .equals(other.getExport())) return false;
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
    if (hasExport()) {
      hash = (37 * hash) + EXPORT_FIELD_NUMBER;
      hash = (53 * hash) + getExport().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.SingleModelVersionExportResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.SingleModelVersionExportResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.SingleModelVersionExportResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.SingleModelVersionExportResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.SingleModelVersionExportResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.SingleModelVersionExportResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.SingleModelVersionExportResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.SingleModelVersionExportResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.SingleModelVersionExportResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.SingleModelVersionExportResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.SingleModelVersionExportResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.SingleModelVersionExportResponse parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.SingleModelVersionExportResponse prototype) {
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
   * SingleModelVersionExportResponse
   * </pre>
   *
   * Protobuf type {@code clarifai.api.SingleModelVersionExportResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.SingleModelVersionExportResponse)
      com.clarifai.grpc.api.SingleModelVersionExportResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_SingleModelVersionExportResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_SingleModelVersionExportResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.SingleModelVersionExportResponse.class, com.clarifai.grpc.api.SingleModelVersionExportResponse.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.SingleModelVersionExportResponse.newBuilder()
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
      if (exportBuilder_ == null) {
        export_ = null;
      } else {
        export_ = null;
        exportBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_SingleModelVersionExportResponse_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.SingleModelVersionExportResponse getDefaultInstanceForType() {
      return com.clarifai.grpc.api.SingleModelVersionExportResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.SingleModelVersionExportResponse build() {
      com.clarifai.grpc.api.SingleModelVersionExportResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.SingleModelVersionExportResponse buildPartial() {
      com.clarifai.grpc.api.SingleModelVersionExportResponse result = new com.clarifai.grpc.api.SingleModelVersionExportResponse(this);
      if (statusBuilder_ == null) {
        result.status_ = status_;
      } else {
        result.status_ = statusBuilder_.build();
      }
      if (exportBuilder_ == null) {
        result.export_ = export_;
      } else {
        result.export_ = exportBuilder_.build();
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
      if (other instanceof com.clarifai.grpc.api.SingleModelVersionExportResponse) {
        return mergeFrom((com.clarifai.grpc.api.SingleModelVersionExportResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.SingleModelVersionExportResponse other) {
      if (other == com.clarifai.grpc.api.SingleModelVersionExportResponse.getDefaultInstance()) return this;
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
      }
      if (other.hasExport()) {
        mergeExport(other.getExport());
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
      com.clarifai.grpc.api.SingleModelVersionExportResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.SingleModelVersionExportResponse) e.getUnfinishedMessage();
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

    private com.clarifai.grpc.api.ModelVersionExport export_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.ModelVersionExport, com.clarifai.grpc.api.ModelVersionExport.Builder, com.clarifai.grpc.api.ModelVersionExportOrBuilder> exportBuilder_;
    /**
     * <code>.clarifai.api.ModelVersionExport export = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @return Whether the export field is set.
     */
    public boolean hasExport() {
      return exportBuilder_ != null || export_ != null;
    }
    /**
     * <code>.clarifai.api.ModelVersionExport export = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @return The export.
     */
    public com.clarifai.grpc.api.ModelVersionExport getExport() {
      if (exportBuilder_ == null) {
        return export_ == null ? com.clarifai.grpc.api.ModelVersionExport.getDefaultInstance() : export_;
      } else {
        return exportBuilder_.getMessage();
      }
    }
    /**
     * <code>.clarifai.api.ModelVersionExport export = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder setExport(com.clarifai.grpc.api.ModelVersionExport value) {
      if (exportBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        export_ = value;
        onChanged();
      } else {
        exportBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.clarifai.api.ModelVersionExport export = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder setExport(
        com.clarifai.grpc.api.ModelVersionExport.Builder builderForValue) {
      if (exportBuilder_ == null) {
        export_ = builderForValue.build();
        onChanged();
      } else {
        exportBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.clarifai.api.ModelVersionExport export = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder mergeExport(com.clarifai.grpc.api.ModelVersionExport value) {
      if (exportBuilder_ == null) {
        if (export_ != null) {
          export_ =
            com.clarifai.grpc.api.ModelVersionExport.newBuilder(export_).mergeFrom(value).buildPartial();
        } else {
          export_ = value;
        }
        onChanged();
      } else {
        exportBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.clarifai.api.ModelVersionExport export = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder clearExport() {
      if (exportBuilder_ == null) {
        export_ = null;
        onChanged();
      } else {
        export_ = null;
        exportBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.clarifai.api.ModelVersionExport export = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public com.clarifai.grpc.api.ModelVersionExport.Builder getExportBuilder() {
      
      onChanged();
      return getExportFieldBuilder().getBuilder();
    }
    /**
     * <code>.clarifai.api.ModelVersionExport export = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public com.clarifai.grpc.api.ModelVersionExportOrBuilder getExportOrBuilder() {
      if (exportBuilder_ != null) {
        return exportBuilder_.getMessageOrBuilder();
      } else {
        return export_ == null ?
            com.clarifai.grpc.api.ModelVersionExport.getDefaultInstance() : export_;
      }
    }
    /**
     * <code>.clarifai.api.ModelVersionExport export = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.ModelVersionExport, com.clarifai.grpc.api.ModelVersionExport.Builder, com.clarifai.grpc.api.ModelVersionExportOrBuilder> 
        getExportFieldBuilder() {
      if (exportBuilder_ == null) {
        exportBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.clarifai.grpc.api.ModelVersionExport, com.clarifai.grpc.api.ModelVersionExport.Builder, com.clarifai.grpc.api.ModelVersionExportOrBuilder>(
                getExport(),
                getParentForChildren(),
                isClean());
        export_ = null;
      }
      return exportBuilder_;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.SingleModelVersionExportResponse)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.SingleModelVersionExportResponse)
  private static final com.clarifai.grpc.api.SingleModelVersionExportResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.SingleModelVersionExportResponse();
  }

  public static com.clarifai.grpc.api.SingleModelVersionExportResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SingleModelVersionExportResponse>
      PARSER = new com.google.protobuf.AbstractParser<SingleModelVersionExportResponse>() {
    @java.lang.Override
    public SingleModelVersionExportResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SingleModelVersionExportResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SingleModelVersionExportResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SingleModelVersionExportResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.SingleModelVersionExportResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
