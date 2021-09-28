// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

/**
 * Protobuf type {@code clarifai.api.MultiScopeUserResponse}
 */
public  final class MultiScopeUserResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.MultiScopeUserResponse)
    MultiScopeUserResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MultiScopeUserResponse.newBuilder() to construct.
  private MultiScopeUserResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MultiScopeUserResponse() {
    scopes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    endpoints_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MultiScopeUserResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MultiScopeUserResponse(
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
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              scopes_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            scopes_.add(s);
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              endpoints_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            endpoints_.add(s);
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
        scopes_ = scopes_.getUnmodifiableView();
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        endpoints_ = endpoints_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiScopeUserResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiScopeUserResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.MultiScopeUserResponse.class, com.clarifai.grpc.api.MultiScopeUserResponse.Builder.class);
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private com.clarifai.grpc.api.status.Status status_;
  /**
   * <pre>
   * The status of the request.
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
   * The status of the request.
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
   * The status of the request.
   * </pre>
   *
   * <code>.clarifai.api.status.Status status = 1;</code>
   */
  public com.clarifai.grpc.api.status.StatusOrBuilder getStatusOrBuilder() {
    return getStatus();
  }

  public static final int SCOPES_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList scopes_;
  /**
   * <pre>
   * This is a list of the scopes that your key has.
   * </pre>
   *
   * <code>repeated string scopes = 2;</code>
   * @return A list containing the scopes.
   */
  public com.google.protobuf.ProtocolStringList
      getScopesList() {
    return scopes_;
  }
  /**
   * <pre>
   * This is a list of the scopes that your key has.
   * </pre>
   *
   * <code>repeated string scopes = 2;</code>
   * @return The count of scopes.
   */
  public int getScopesCount() {
    return scopes_.size();
  }
  /**
   * <pre>
   * This is a list of the scopes that your key has.
   * </pre>
   *
   * <code>repeated string scopes = 2;</code>
   * @param index The index of the element to return.
   * @return The scopes at the given index.
   */
  public java.lang.String getScopes(int index) {
    return scopes_.get(index);
  }
  /**
   * <pre>
   * This is a list of the scopes that your key has.
   * </pre>
   *
   * <code>repeated string scopes = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the scopes at the given index.
   */
  public com.google.protobuf.ByteString
      getScopesBytes(int index) {
    return scopes_.getByteString(index);
  }

  public static final int ENDPOINTS_FIELD_NUMBER = 4;
  private com.google.protobuf.LazyStringList endpoints_;
  /**
   * <pre>
   * This is a list of endpoint permissions that your key has.
   * </pre>
   *
   * <code>repeated string endpoints = 4;</code>
   * @return A list containing the endpoints.
   */
  public com.google.protobuf.ProtocolStringList
      getEndpointsList() {
    return endpoints_;
  }
  /**
   * <pre>
   * This is a list of endpoint permissions that your key has.
   * </pre>
   *
   * <code>repeated string endpoints = 4;</code>
   * @return The count of endpoints.
   */
  public int getEndpointsCount() {
    return endpoints_.size();
  }
  /**
   * <pre>
   * This is a list of endpoint permissions that your key has.
   * </pre>
   *
   * <code>repeated string endpoints = 4;</code>
   * @param index The index of the element to return.
   * @return The endpoints at the given index.
   */
  public java.lang.String getEndpoints(int index) {
    return endpoints_.get(index);
  }
  /**
   * <pre>
   * This is a list of endpoint permissions that your key has.
   * </pre>
   *
   * <code>repeated string endpoints = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the endpoints at the given index.
   */
  public com.google.protobuf.ByteString
      getEndpointsBytes(int index) {
    return endpoints_.getByteString(index);
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
    for (int i = 0; i < scopes_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, scopes_.getRaw(i));
    }
    for (int i = 0; i < endpoints_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, endpoints_.getRaw(i));
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
    {
      int dataSize = 0;
      for (int i = 0; i < scopes_.size(); i++) {
        dataSize += computeStringSizeNoTag(scopes_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getScopesList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < endpoints_.size(); i++) {
        dataSize += computeStringSizeNoTag(endpoints_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getEndpointsList().size();
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
    if (!(obj instanceof com.clarifai.grpc.api.MultiScopeUserResponse)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.MultiScopeUserResponse other = (com.clarifai.grpc.api.MultiScopeUserResponse) obj;

    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (!getStatus()
          .equals(other.getStatus())) return false;
    }
    if (!getScopesList()
        .equals(other.getScopesList())) return false;
    if (!getEndpointsList()
        .equals(other.getEndpointsList())) return false;
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
    if (getScopesCount() > 0) {
      hash = (37 * hash) + SCOPES_FIELD_NUMBER;
      hash = (53 * hash) + getScopesList().hashCode();
    }
    if (getEndpointsCount() > 0) {
      hash = (37 * hash) + ENDPOINTS_FIELD_NUMBER;
      hash = (53 * hash) + getEndpointsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.MultiScopeUserResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.MultiScopeUserResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiScopeUserResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.MultiScopeUserResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiScopeUserResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.MultiScopeUserResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiScopeUserResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.MultiScopeUserResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiScopeUserResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.MultiScopeUserResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiScopeUserResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.MultiScopeUserResponse parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.MultiScopeUserResponse prototype) {
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
   * Protobuf type {@code clarifai.api.MultiScopeUserResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.MultiScopeUserResponse)
      com.clarifai.grpc.api.MultiScopeUserResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiScopeUserResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiScopeUserResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.MultiScopeUserResponse.class, com.clarifai.grpc.api.MultiScopeUserResponse.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.MultiScopeUserResponse.newBuilder()
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
      scopes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      endpoints_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiScopeUserResponse_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.MultiScopeUserResponse getDefaultInstanceForType() {
      return com.clarifai.grpc.api.MultiScopeUserResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.MultiScopeUserResponse build() {
      com.clarifai.grpc.api.MultiScopeUserResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.MultiScopeUserResponse buildPartial() {
      com.clarifai.grpc.api.MultiScopeUserResponse result = new com.clarifai.grpc.api.MultiScopeUserResponse(this);
      int from_bitField0_ = bitField0_;
      if (statusBuilder_ == null) {
        result.status_ = status_;
      } else {
        result.status_ = statusBuilder_.build();
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        scopes_ = scopes_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.scopes_ = scopes_;
      if (((bitField0_ & 0x00000002) != 0)) {
        endpoints_ = endpoints_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.endpoints_ = endpoints_;
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
      if (other instanceof com.clarifai.grpc.api.MultiScopeUserResponse) {
        return mergeFrom((com.clarifai.grpc.api.MultiScopeUserResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.MultiScopeUserResponse other) {
      if (other == com.clarifai.grpc.api.MultiScopeUserResponse.getDefaultInstance()) return this;
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
      }
      if (!other.scopes_.isEmpty()) {
        if (scopes_.isEmpty()) {
          scopes_ = other.scopes_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureScopesIsMutable();
          scopes_.addAll(other.scopes_);
        }
        onChanged();
      }
      if (!other.endpoints_.isEmpty()) {
        if (endpoints_.isEmpty()) {
          endpoints_ = other.endpoints_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureEndpointsIsMutable();
          endpoints_.addAll(other.endpoints_);
        }
        onChanged();
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
      com.clarifai.grpc.api.MultiScopeUserResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.MultiScopeUserResponse) e.getUnfinishedMessage();
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
     * The status of the request.
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
     * The status of the request.
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
     * The status of the request.
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
     * The status of the request.
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
     * The status of the request.
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
     * The status of the request.
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
     * The status of the request.
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
     * The status of the request.
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
     * The status of the request.
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

    private com.google.protobuf.LazyStringList scopes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureScopesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        scopes_ = new com.google.protobuf.LazyStringArrayList(scopes_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * This is a list of the scopes that your key has.
     * </pre>
     *
     * <code>repeated string scopes = 2;</code>
     * @return A list containing the scopes.
     */
    public com.google.protobuf.ProtocolStringList
        getScopesList() {
      return scopes_.getUnmodifiableView();
    }
    /**
     * <pre>
     * This is a list of the scopes that your key has.
     * </pre>
     *
     * <code>repeated string scopes = 2;</code>
     * @return The count of scopes.
     */
    public int getScopesCount() {
      return scopes_.size();
    }
    /**
     * <pre>
     * This is a list of the scopes that your key has.
     * </pre>
     *
     * <code>repeated string scopes = 2;</code>
     * @param index The index of the element to return.
     * @return The scopes at the given index.
     */
    public java.lang.String getScopes(int index) {
      return scopes_.get(index);
    }
    /**
     * <pre>
     * This is a list of the scopes that your key has.
     * </pre>
     *
     * <code>repeated string scopes = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the scopes at the given index.
     */
    public com.google.protobuf.ByteString
        getScopesBytes(int index) {
      return scopes_.getByteString(index);
    }
    /**
     * <pre>
     * This is a list of the scopes that your key has.
     * </pre>
     *
     * <code>repeated string scopes = 2;</code>
     * @param index The index to set the value at.
     * @param value The scopes to set.
     * @return This builder for chaining.
     */
    public Builder setScopes(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureScopesIsMutable();
      scopes_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is a list of the scopes that your key has.
     * </pre>
     *
     * <code>repeated string scopes = 2;</code>
     * @param value The scopes to add.
     * @return This builder for chaining.
     */
    public Builder addScopes(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureScopesIsMutable();
      scopes_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is a list of the scopes that your key has.
     * </pre>
     *
     * <code>repeated string scopes = 2;</code>
     * @param values The scopes to add.
     * @return This builder for chaining.
     */
    public Builder addAllScopes(
        java.lang.Iterable<java.lang.String> values) {
      ensureScopesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, scopes_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is a list of the scopes that your key has.
     * </pre>
     *
     * <code>repeated string scopes = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearScopes() {
      scopes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is a list of the scopes that your key has.
     * </pre>
     *
     * <code>repeated string scopes = 2;</code>
     * @param value The bytes of the scopes to add.
     * @return This builder for chaining.
     */
    public Builder addScopesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureScopesIsMutable();
      scopes_.add(value);
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList endpoints_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureEndpointsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        endpoints_ = new com.google.protobuf.LazyStringArrayList(endpoints_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     * This is a list of endpoint permissions that your key has.
     * </pre>
     *
     * <code>repeated string endpoints = 4;</code>
     * @return A list containing the endpoints.
     */
    public com.google.protobuf.ProtocolStringList
        getEndpointsList() {
      return endpoints_.getUnmodifiableView();
    }
    /**
     * <pre>
     * This is a list of endpoint permissions that your key has.
     * </pre>
     *
     * <code>repeated string endpoints = 4;</code>
     * @return The count of endpoints.
     */
    public int getEndpointsCount() {
      return endpoints_.size();
    }
    /**
     * <pre>
     * This is a list of endpoint permissions that your key has.
     * </pre>
     *
     * <code>repeated string endpoints = 4;</code>
     * @param index The index of the element to return.
     * @return The endpoints at the given index.
     */
    public java.lang.String getEndpoints(int index) {
      return endpoints_.get(index);
    }
    /**
     * <pre>
     * This is a list of endpoint permissions that your key has.
     * </pre>
     *
     * <code>repeated string endpoints = 4;</code>
     * @param index The index of the value to return.
     * @return The bytes of the endpoints at the given index.
     */
    public com.google.protobuf.ByteString
        getEndpointsBytes(int index) {
      return endpoints_.getByteString(index);
    }
    /**
     * <pre>
     * This is a list of endpoint permissions that your key has.
     * </pre>
     *
     * <code>repeated string endpoints = 4;</code>
     * @param index The index to set the value at.
     * @param value The endpoints to set.
     * @return This builder for chaining.
     */
    public Builder setEndpoints(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureEndpointsIsMutable();
      endpoints_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is a list of endpoint permissions that your key has.
     * </pre>
     *
     * <code>repeated string endpoints = 4;</code>
     * @param value The endpoints to add.
     * @return This builder for chaining.
     */
    public Builder addEndpoints(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureEndpointsIsMutable();
      endpoints_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is a list of endpoint permissions that your key has.
     * </pre>
     *
     * <code>repeated string endpoints = 4;</code>
     * @param values The endpoints to add.
     * @return This builder for chaining.
     */
    public Builder addAllEndpoints(
        java.lang.Iterable<java.lang.String> values) {
      ensureEndpointsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, endpoints_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is a list of endpoint permissions that your key has.
     * </pre>
     *
     * <code>repeated string endpoints = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndpoints() {
      endpoints_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is a list of endpoint permissions that your key has.
     * </pre>
     *
     * <code>repeated string endpoints = 4;</code>
     * @param value The bytes of the endpoints to add.
     * @return This builder for chaining.
     */
    public Builder addEndpointsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureEndpointsIsMutable();
      endpoints_.add(value);
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.MultiScopeUserResponse)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.MultiScopeUserResponse)
  private static final com.clarifai.grpc.api.MultiScopeUserResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.MultiScopeUserResponse();
  }

  public static com.clarifai.grpc.api.MultiScopeUserResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MultiScopeUserResponse>
      PARSER = new com.google.protobuf.AbstractParser<MultiScopeUserResponse>() {
    @java.lang.Override
    public MultiScopeUserResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MultiScopeUserResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MultiScopeUserResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MultiScopeUserResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.MultiScopeUserResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

