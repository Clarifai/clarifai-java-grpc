// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

/**
 * <pre>
 * MultiWorkflowVersionResponse
 * </pre>
 *
 * Protobuf type {@code clarifai.api.MultiWorkflowVersionResponse}
 */
public  final class MultiWorkflowVersionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.MultiWorkflowVersionResponse)
    MultiWorkflowVersionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MultiWorkflowVersionResponse.newBuilder() to construct.
  private MultiWorkflowVersionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MultiWorkflowVersionResponse() {
    workflowVersions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MultiWorkflowVersionResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MultiWorkflowVersionResponse(
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
              workflowVersions_ = new java.util.ArrayList<com.clarifai.grpc.api.WorkflowVersion>();
              mutable_bitField0_ |= 0x00000001;
            }
            workflowVersions_.add(
                input.readMessage(com.clarifai.grpc.api.WorkflowVersion.parser(), extensionRegistry));
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
        workflowVersions_ = java.util.Collections.unmodifiableList(workflowVersions_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiWorkflowVersionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiWorkflowVersionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.MultiWorkflowVersionResponse.class, com.clarifai.grpc.api.MultiWorkflowVersionResponse.Builder.class);
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private com.clarifai.grpc.api.status.Status status_;
  /**
   * <code>.clarifai.api.status.Status status = 1;</code>
   * @return Whether the status field is set.
   */
  public boolean hasStatus() {
    return status_ != null;
  }
  /**
   * <code>.clarifai.api.status.Status status = 1;</code>
   * @return The status.
   */
  public com.clarifai.grpc.api.status.Status getStatus() {
    return status_ == null ? com.clarifai.grpc.api.status.Status.getDefaultInstance() : status_;
  }
  /**
   * <code>.clarifai.api.status.Status status = 1;</code>
   */
  public com.clarifai.grpc.api.status.StatusOrBuilder getStatusOrBuilder() {
    return getStatus();
  }

  public static final int WORKFLOW_VERSIONS_FIELD_NUMBER = 2;
  private java.util.List<com.clarifai.grpc.api.WorkflowVersion> workflowVersions_;
  /**
   * <code>repeated .clarifai.api.WorkflowVersion workflow_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  public java.util.List<com.clarifai.grpc.api.WorkflowVersion> getWorkflowVersionsList() {
    return workflowVersions_;
  }
  /**
   * <code>repeated .clarifai.api.WorkflowVersion workflow_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  public java.util.List<? extends com.clarifai.grpc.api.WorkflowVersionOrBuilder> 
      getWorkflowVersionsOrBuilderList() {
    return workflowVersions_;
  }
  /**
   * <code>repeated .clarifai.api.WorkflowVersion workflow_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  public int getWorkflowVersionsCount() {
    return workflowVersions_.size();
  }
  /**
   * <code>repeated .clarifai.api.WorkflowVersion workflow_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  public com.clarifai.grpc.api.WorkflowVersion getWorkflowVersions(int index) {
    return workflowVersions_.get(index);
  }
  /**
   * <code>repeated .clarifai.api.WorkflowVersion workflow_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  public com.clarifai.grpc.api.WorkflowVersionOrBuilder getWorkflowVersionsOrBuilder(
      int index) {
    return workflowVersions_.get(index);
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
    for (int i = 0; i < workflowVersions_.size(); i++) {
      output.writeMessage(2, workflowVersions_.get(i));
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
    for (int i = 0; i < workflowVersions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, workflowVersions_.get(i));
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
    if (!(obj instanceof com.clarifai.grpc.api.MultiWorkflowVersionResponse)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.MultiWorkflowVersionResponse other = (com.clarifai.grpc.api.MultiWorkflowVersionResponse) obj;

    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (!getStatus()
          .equals(other.getStatus())) return false;
    }
    if (!getWorkflowVersionsList()
        .equals(other.getWorkflowVersionsList())) return false;
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
    if (getWorkflowVersionsCount() > 0) {
      hash = (37 * hash) + WORKFLOW_VERSIONS_FIELD_NUMBER;
      hash = (53 * hash) + getWorkflowVersionsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.MultiWorkflowVersionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.MultiWorkflowVersionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiWorkflowVersionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.MultiWorkflowVersionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiWorkflowVersionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.MultiWorkflowVersionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiWorkflowVersionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.MultiWorkflowVersionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiWorkflowVersionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.MultiWorkflowVersionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiWorkflowVersionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.MultiWorkflowVersionResponse parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.MultiWorkflowVersionResponse prototype) {
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
   * MultiWorkflowVersionResponse
   * </pre>
   *
   * Protobuf type {@code clarifai.api.MultiWorkflowVersionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.MultiWorkflowVersionResponse)
      com.clarifai.grpc.api.MultiWorkflowVersionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiWorkflowVersionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiWorkflowVersionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.MultiWorkflowVersionResponse.class, com.clarifai.grpc.api.MultiWorkflowVersionResponse.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.MultiWorkflowVersionResponse.newBuilder()
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
        getWorkflowVersionsFieldBuilder();
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
      if (workflowVersionsBuilder_ == null) {
        workflowVersions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        workflowVersionsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiWorkflowVersionResponse_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.MultiWorkflowVersionResponse getDefaultInstanceForType() {
      return com.clarifai.grpc.api.MultiWorkflowVersionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.MultiWorkflowVersionResponse build() {
      com.clarifai.grpc.api.MultiWorkflowVersionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.MultiWorkflowVersionResponse buildPartial() {
      com.clarifai.grpc.api.MultiWorkflowVersionResponse result = new com.clarifai.grpc.api.MultiWorkflowVersionResponse(this);
      int from_bitField0_ = bitField0_;
      if (statusBuilder_ == null) {
        result.status_ = status_;
      } else {
        result.status_ = statusBuilder_.build();
      }
      if (workflowVersionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          workflowVersions_ = java.util.Collections.unmodifiableList(workflowVersions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.workflowVersions_ = workflowVersions_;
      } else {
        result.workflowVersions_ = workflowVersionsBuilder_.build();
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
      if (other instanceof com.clarifai.grpc.api.MultiWorkflowVersionResponse) {
        return mergeFrom((com.clarifai.grpc.api.MultiWorkflowVersionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.MultiWorkflowVersionResponse other) {
      if (other == com.clarifai.grpc.api.MultiWorkflowVersionResponse.getDefaultInstance()) return this;
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
      }
      if (workflowVersionsBuilder_ == null) {
        if (!other.workflowVersions_.isEmpty()) {
          if (workflowVersions_.isEmpty()) {
            workflowVersions_ = other.workflowVersions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureWorkflowVersionsIsMutable();
            workflowVersions_.addAll(other.workflowVersions_);
          }
          onChanged();
        }
      } else {
        if (!other.workflowVersions_.isEmpty()) {
          if (workflowVersionsBuilder_.isEmpty()) {
            workflowVersionsBuilder_.dispose();
            workflowVersionsBuilder_ = null;
            workflowVersions_ = other.workflowVersions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            workflowVersionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getWorkflowVersionsFieldBuilder() : null;
          } else {
            workflowVersionsBuilder_.addAllMessages(other.workflowVersions_);
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
      com.clarifai.grpc.api.MultiWorkflowVersionResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.MultiWorkflowVersionResponse) e.getUnfinishedMessage();
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

    private java.util.List<com.clarifai.grpc.api.WorkflowVersion> workflowVersions_ =
      java.util.Collections.emptyList();
    private void ensureWorkflowVersionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        workflowVersions_ = new java.util.ArrayList<com.clarifai.grpc.api.WorkflowVersion>(workflowVersions_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.WorkflowVersion, com.clarifai.grpc.api.WorkflowVersion.Builder, com.clarifai.grpc.api.WorkflowVersionOrBuilder> workflowVersionsBuilder_;

    /**
     * <code>repeated .clarifai.api.WorkflowVersion workflow_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public java.util.List<com.clarifai.grpc.api.WorkflowVersion> getWorkflowVersionsList() {
      if (workflowVersionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(workflowVersions_);
      } else {
        return workflowVersionsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .clarifai.api.WorkflowVersion workflow_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public int getWorkflowVersionsCount() {
      if (workflowVersionsBuilder_ == null) {
        return workflowVersions_.size();
      } else {
        return workflowVersionsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .clarifai.api.WorkflowVersion workflow_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public com.clarifai.grpc.api.WorkflowVersion getWorkflowVersions(int index) {
      if (workflowVersionsBuilder_ == null) {
        return workflowVersions_.get(index);
      } else {
        return workflowVersionsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .clarifai.api.WorkflowVersion workflow_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder setWorkflowVersions(
        int index, com.clarifai.grpc.api.WorkflowVersion value) {
      if (workflowVersionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWorkflowVersionsIsMutable();
        workflowVersions_.set(index, value);
        onChanged();
      } else {
        workflowVersionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.WorkflowVersion workflow_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder setWorkflowVersions(
        int index, com.clarifai.grpc.api.WorkflowVersion.Builder builderForValue) {
      if (workflowVersionsBuilder_ == null) {
        ensureWorkflowVersionsIsMutable();
        workflowVersions_.set(index, builderForValue.build());
        onChanged();
      } else {
        workflowVersionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.WorkflowVersion workflow_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder addWorkflowVersions(com.clarifai.grpc.api.WorkflowVersion value) {
      if (workflowVersionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWorkflowVersionsIsMutable();
        workflowVersions_.add(value);
        onChanged();
      } else {
        workflowVersionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.WorkflowVersion workflow_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder addWorkflowVersions(
        int index, com.clarifai.grpc.api.WorkflowVersion value) {
      if (workflowVersionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWorkflowVersionsIsMutable();
        workflowVersions_.add(index, value);
        onChanged();
      } else {
        workflowVersionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.WorkflowVersion workflow_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder addWorkflowVersions(
        com.clarifai.grpc.api.WorkflowVersion.Builder builderForValue) {
      if (workflowVersionsBuilder_ == null) {
        ensureWorkflowVersionsIsMutable();
        workflowVersions_.add(builderForValue.build());
        onChanged();
      } else {
        workflowVersionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.WorkflowVersion workflow_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder addWorkflowVersions(
        int index, com.clarifai.grpc.api.WorkflowVersion.Builder builderForValue) {
      if (workflowVersionsBuilder_ == null) {
        ensureWorkflowVersionsIsMutable();
        workflowVersions_.add(index, builderForValue.build());
        onChanged();
      } else {
        workflowVersionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.WorkflowVersion workflow_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder addAllWorkflowVersions(
        java.lang.Iterable<? extends com.clarifai.grpc.api.WorkflowVersion> values) {
      if (workflowVersionsBuilder_ == null) {
        ensureWorkflowVersionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, workflowVersions_);
        onChanged();
      } else {
        workflowVersionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.WorkflowVersion workflow_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder clearWorkflowVersions() {
      if (workflowVersionsBuilder_ == null) {
        workflowVersions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        workflowVersionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.WorkflowVersion workflow_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder removeWorkflowVersions(int index) {
      if (workflowVersionsBuilder_ == null) {
        ensureWorkflowVersionsIsMutable();
        workflowVersions_.remove(index);
        onChanged();
      } else {
        workflowVersionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.WorkflowVersion workflow_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public com.clarifai.grpc.api.WorkflowVersion.Builder getWorkflowVersionsBuilder(
        int index) {
      return getWorkflowVersionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .clarifai.api.WorkflowVersion workflow_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public com.clarifai.grpc.api.WorkflowVersionOrBuilder getWorkflowVersionsOrBuilder(
        int index) {
      if (workflowVersionsBuilder_ == null) {
        return workflowVersions_.get(index);  } else {
        return workflowVersionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .clarifai.api.WorkflowVersion workflow_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public java.util.List<? extends com.clarifai.grpc.api.WorkflowVersionOrBuilder> 
         getWorkflowVersionsOrBuilderList() {
      if (workflowVersionsBuilder_ != null) {
        return workflowVersionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(workflowVersions_);
      }
    }
    /**
     * <code>repeated .clarifai.api.WorkflowVersion workflow_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public com.clarifai.grpc.api.WorkflowVersion.Builder addWorkflowVersionsBuilder() {
      return getWorkflowVersionsFieldBuilder().addBuilder(
          com.clarifai.grpc.api.WorkflowVersion.getDefaultInstance());
    }
    /**
     * <code>repeated .clarifai.api.WorkflowVersion workflow_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public com.clarifai.grpc.api.WorkflowVersion.Builder addWorkflowVersionsBuilder(
        int index) {
      return getWorkflowVersionsFieldBuilder().addBuilder(
          index, com.clarifai.grpc.api.WorkflowVersion.getDefaultInstance());
    }
    /**
     * <code>repeated .clarifai.api.WorkflowVersion workflow_versions = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public java.util.List<com.clarifai.grpc.api.WorkflowVersion.Builder> 
         getWorkflowVersionsBuilderList() {
      return getWorkflowVersionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.WorkflowVersion, com.clarifai.grpc.api.WorkflowVersion.Builder, com.clarifai.grpc.api.WorkflowVersionOrBuilder> 
        getWorkflowVersionsFieldBuilder() {
      if (workflowVersionsBuilder_ == null) {
        workflowVersionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.clarifai.grpc.api.WorkflowVersion, com.clarifai.grpc.api.WorkflowVersion.Builder, com.clarifai.grpc.api.WorkflowVersionOrBuilder>(
                workflowVersions_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        workflowVersions_ = null;
      }
      return workflowVersionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.MultiWorkflowVersionResponse)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.MultiWorkflowVersionResponse)
  private static final com.clarifai.grpc.api.MultiWorkflowVersionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.MultiWorkflowVersionResponse();
  }

  public static com.clarifai.grpc.api.MultiWorkflowVersionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MultiWorkflowVersionResponse>
      PARSER = new com.google.protobuf.AbstractParser<MultiWorkflowVersionResponse>() {
    @java.lang.Override
    public MultiWorkflowVersionResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MultiWorkflowVersionResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MultiWorkflowVersionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MultiWorkflowVersionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.MultiWorkflowVersionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

