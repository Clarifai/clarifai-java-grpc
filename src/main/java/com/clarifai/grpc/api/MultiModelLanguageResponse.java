// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

/**
 * Protobuf type {@code clarifai.api.MultiModelLanguageResponse}
 */
public final class MultiModelLanguageResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.MultiModelLanguageResponse)
    MultiModelLanguageResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MultiModelLanguageResponse.newBuilder() to construct.
  private MultiModelLanguageResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MultiModelLanguageResponse() {
    languages_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MultiModelLanguageResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MultiModelLanguageResponse(
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
              languages_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            languages_.add(s);
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
        languages_ = languages_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiModelLanguageResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiModelLanguageResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.MultiModelLanguageResponse.class, com.clarifai.grpc.api.MultiModelLanguageResponse.Builder.class);
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

  public static final int LANGUAGES_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList languages_;
  /**
   * <code>repeated string languages = 2;</code>
   * @return A list containing the languages.
   */
  public com.google.protobuf.ProtocolStringList
      getLanguagesList() {
    return languages_;
  }
  /**
   * <code>repeated string languages = 2;</code>
   * @return The count of languages.
   */
  public int getLanguagesCount() {
    return languages_.size();
  }
  /**
   * <code>repeated string languages = 2;</code>
   * @param index The index of the element to return.
   * @return The languages at the given index.
   */
  public java.lang.String getLanguages(int index) {
    return languages_.get(index);
  }
  /**
   * <code>repeated string languages = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the languages at the given index.
   */
  public com.google.protobuf.ByteString
      getLanguagesBytes(int index) {
    return languages_.getByteString(index);
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
    for (int i = 0; i < languages_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, languages_.getRaw(i));
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
      for (int i = 0; i < languages_.size(); i++) {
        dataSize += computeStringSizeNoTag(languages_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getLanguagesList().size();
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
    if (!(obj instanceof com.clarifai.grpc.api.MultiModelLanguageResponse)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.MultiModelLanguageResponse other = (com.clarifai.grpc.api.MultiModelLanguageResponse) obj;

    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (!getStatus()
          .equals(other.getStatus())) return false;
    }
    if (!getLanguagesList()
        .equals(other.getLanguagesList())) return false;
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
    if (getLanguagesCount() > 0) {
      hash = (37 * hash) + LANGUAGES_FIELD_NUMBER;
      hash = (53 * hash) + getLanguagesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.MultiModelLanguageResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.MultiModelLanguageResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiModelLanguageResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.MultiModelLanguageResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiModelLanguageResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.MultiModelLanguageResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiModelLanguageResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.MultiModelLanguageResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiModelLanguageResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.MultiModelLanguageResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiModelLanguageResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.MultiModelLanguageResponse parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.MultiModelLanguageResponse prototype) {
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
   * Protobuf type {@code clarifai.api.MultiModelLanguageResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.MultiModelLanguageResponse)
      com.clarifai.grpc.api.MultiModelLanguageResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiModelLanguageResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiModelLanguageResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.MultiModelLanguageResponse.class, com.clarifai.grpc.api.MultiModelLanguageResponse.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.MultiModelLanguageResponse.newBuilder()
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
      languages_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiModelLanguageResponse_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.MultiModelLanguageResponse getDefaultInstanceForType() {
      return com.clarifai.grpc.api.MultiModelLanguageResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.MultiModelLanguageResponse build() {
      com.clarifai.grpc.api.MultiModelLanguageResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.MultiModelLanguageResponse buildPartial() {
      com.clarifai.grpc.api.MultiModelLanguageResponse result = new com.clarifai.grpc.api.MultiModelLanguageResponse(this);
      int from_bitField0_ = bitField0_;
      if (statusBuilder_ == null) {
        result.status_ = status_;
      } else {
        result.status_ = statusBuilder_.build();
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        languages_ = languages_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.languages_ = languages_;
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
      if (other instanceof com.clarifai.grpc.api.MultiModelLanguageResponse) {
        return mergeFrom((com.clarifai.grpc.api.MultiModelLanguageResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.MultiModelLanguageResponse other) {
      if (other == com.clarifai.grpc.api.MultiModelLanguageResponse.getDefaultInstance()) return this;
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
      }
      if (!other.languages_.isEmpty()) {
        if (languages_.isEmpty()) {
          languages_ = other.languages_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureLanguagesIsMutable();
          languages_.addAll(other.languages_);
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
      com.clarifai.grpc.api.MultiModelLanguageResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.MultiModelLanguageResponse) e.getUnfinishedMessage();
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

    private com.google.protobuf.LazyStringList languages_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureLanguagesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        languages_ = new com.google.protobuf.LazyStringArrayList(languages_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string languages = 2;</code>
     * @return A list containing the languages.
     */
    public com.google.protobuf.ProtocolStringList
        getLanguagesList() {
      return languages_.getUnmodifiableView();
    }
    /**
     * <code>repeated string languages = 2;</code>
     * @return The count of languages.
     */
    public int getLanguagesCount() {
      return languages_.size();
    }
    /**
     * <code>repeated string languages = 2;</code>
     * @param index The index of the element to return.
     * @return The languages at the given index.
     */
    public java.lang.String getLanguages(int index) {
      return languages_.get(index);
    }
    /**
     * <code>repeated string languages = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the languages at the given index.
     */
    public com.google.protobuf.ByteString
        getLanguagesBytes(int index) {
      return languages_.getByteString(index);
    }
    /**
     * <code>repeated string languages = 2;</code>
     * @param index The index to set the value at.
     * @param value The languages to set.
     * @return This builder for chaining.
     */
    public Builder setLanguages(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureLanguagesIsMutable();
      languages_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string languages = 2;</code>
     * @param value The languages to add.
     * @return This builder for chaining.
     */
    public Builder addLanguages(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureLanguagesIsMutable();
      languages_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string languages = 2;</code>
     * @param values The languages to add.
     * @return This builder for chaining.
     */
    public Builder addAllLanguages(
        java.lang.Iterable<java.lang.String> values) {
      ensureLanguagesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, languages_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string languages = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLanguages() {
      languages_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string languages = 2;</code>
     * @param value The bytes of the languages to add.
     * @return This builder for chaining.
     */
    public Builder addLanguagesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureLanguagesIsMutable();
      languages_.add(value);
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.MultiModelLanguageResponse)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.MultiModelLanguageResponse)
  private static final com.clarifai.grpc.api.MultiModelLanguageResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.MultiModelLanguageResponse();
  }

  public static com.clarifai.grpc.api.MultiModelLanguageResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MultiModelLanguageResponse>
      PARSER = new com.google.protobuf.AbstractParser<MultiModelLanguageResponse>() {
    @java.lang.Override
    public MultiModelLanguageResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MultiModelLanguageResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MultiModelLanguageResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MultiModelLanguageResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.MultiModelLanguageResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

