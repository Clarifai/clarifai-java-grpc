// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * <pre>
 * Azure Blob storage credentials.
 * </pre>
 *
 * Protobuf type {@code clarifai.api.AzureBlobCreds}
 */
public final class AzureBlobCreds extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.AzureBlobCreds)
    AzureBlobCredsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AzureBlobCreds.newBuilder() to construct.
  private AzureBlobCreds(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AzureBlobCreds() {
    accountName_ = "";
    accountKey_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AzureBlobCreds();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AzureBlobCreds(
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
            java.lang.String s = input.readStringRequireUtf8();

            accountName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            accountKey_ = s;
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
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_AzureBlobCreds_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_AzureBlobCreds_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.AzureBlobCreds.class, com.clarifai.grpc.api.AzureBlobCreds.Builder.class);
  }

  public static final int ACCOUNT_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object accountName_;
  /**
   * <code>string account_name = 1;</code>
   * @return The accountName.
   */
  @java.lang.Override
  public java.lang.String getAccountName() {
    java.lang.Object ref = accountName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      accountName_ = s;
      return s;
    }
  }
  /**
   * <code>string account_name = 1;</code>
   * @return The bytes for accountName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAccountNameBytes() {
    java.lang.Object ref = accountName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      accountName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACCOUNT_KEY_FIELD_NUMBER = 2;
  private volatile java.lang.Object accountKey_;
  /**
   * <code>string account_key = 2;</code>
   * @return The accountKey.
   */
  @java.lang.Override
  public java.lang.String getAccountKey() {
    java.lang.Object ref = accountKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      accountKey_ = s;
      return s;
    }
  }
  /**
   * <code>string account_key = 2;</code>
   * @return The bytes for accountKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAccountKeyBytes() {
    java.lang.Object ref = accountKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      accountKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(accountName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, accountName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(accountKey_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, accountKey_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(accountName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, accountName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(accountKey_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, accountKey_);
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
    if (!(obj instanceof com.clarifai.grpc.api.AzureBlobCreds)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.AzureBlobCreds other = (com.clarifai.grpc.api.AzureBlobCreds) obj;

    if (!getAccountName()
        .equals(other.getAccountName())) return false;
    if (!getAccountKey()
        .equals(other.getAccountKey())) return false;
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
    hash = (37 * hash) + ACCOUNT_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getAccountName().hashCode();
    hash = (37 * hash) + ACCOUNT_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getAccountKey().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.AzureBlobCreds parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.AzureBlobCreds parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.AzureBlobCreds parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.AzureBlobCreds parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.AzureBlobCreds parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.AzureBlobCreds parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.AzureBlobCreds parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.AzureBlobCreds parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.AzureBlobCreds parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.AzureBlobCreds parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.AzureBlobCreds parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.AzureBlobCreds parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.AzureBlobCreds prototype) {
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
   * Azure Blob storage credentials.
   * </pre>
   *
   * Protobuf type {@code clarifai.api.AzureBlobCreds}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.AzureBlobCreds)
      com.clarifai.grpc.api.AzureBlobCredsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_AzureBlobCreds_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_AzureBlobCreds_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.AzureBlobCreds.class, com.clarifai.grpc.api.AzureBlobCreds.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.AzureBlobCreds.newBuilder()
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
      accountName_ = "";

      accountKey_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_AzureBlobCreds_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.AzureBlobCreds getDefaultInstanceForType() {
      return com.clarifai.grpc.api.AzureBlobCreds.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.AzureBlobCreds build() {
      com.clarifai.grpc.api.AzureBlobCreds result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.AzureBlobCreds buildPartial() {
      com.clarifai.grpc.api.AzureBlobCreds result = new com.clarifai.grpc.api.AzureBlobCreds(this);
      result.accountName_ = accountName_;
      result.accountKey_ = accountKey_;
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
      if (other instanceof com.clarifai.grpc.api.AzureBlobCreds) {
        return mergeFrom((com.clarifai.grpc.api.AzureBlobCreds)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.AzureBlobCreds other) {
      if (other == com.clarifai.grpc.api.AzureBlobCreds.getDefaultInstance()) return this;
      if (!other.getAccountName().isEmpty()) {
        accountName_ = other.accountName_;
        onChanged();
      }
      if (!other.getAccountKey().isEmpty()) {
        accountKey_ = other.accountKey_;
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
      com.clarifai.grpc.api.AzureBlobCreds parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.AzureBlobCreds) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object accountName_ = "";
    /**
     * <code>string account_name = 1;</code>
     * @return The accountName.
     */
    public java.lang.String getAccountName() {
      java.lang.Object ref = accountName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        accountName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string account_name = 1;</code>
     * @return The bytes for accountName.
     */
    public com.google.protobuf.ByteString
        getAccountNameBytes() {
      java.lang.Object ref = accountName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        accountName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string account_name = 1;</code>
     * @param value The accountName to set.
     * @return This builder for chaining.
     */
    public Builder setAccountName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      accountName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string account_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAccountName() {
      
      accountName_ = getDefaultInstance().getAccountName();
      onChanged();
      return this;
    }
    /**
     * <code>string account_name = 1;</code>
     * @param value The bytes for accountName to set.
     * @return This builder for chaining.
     */
    public Builder setAccountNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      accountName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object accountKey_ = "";
    /**
     * <code>string account_key = 2;</code>
     * @return The accountKey.
     */
    public java.lang.String getAccountKey() {
      java.lang.Object ref = accountKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        accountKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string account_key = 2;</code>
     * @return The bytes for accountKey.
     */
    public com.google.protobuf.ByteString
        getAccountKeyBytes() {
      java.lang.Object ref = accountKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        accountKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string account_key = 2;</code>
     * @param value The accountKey to set.
     * @return This builder for chaining.
     */
    public Builder setAccountKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      accountKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string account_key = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAccountKey() {
      
      accountKey_ = getDefaultInstance().getAccountKey();
      onChanged();
      return this;
    }
    /**
     * <code>string account_key = 2;</code>
     * @param value The bytes for accountKey to set.
     * @return This builder for chaining.
     */
    public Builder setAccountKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      accountKey_ = value;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.AzureBlobCreds)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.AzureBlobCreds)
  private static final com.clarifai.grpc.api.AzureBlobCreds DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.AzureBlobCreds();
  }

  public static com.clarifai.grpc.api.AzureBlobCreds getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AzureBlobCreds>
      PARSER = new com.google.protobuf.AbstractParser<AzureBlobCreds>() {
    @java.lang.Override
    public AzureBlobCreds parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AzureBlobCreds(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AzureBlobCreds> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AzureBlobCreds> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.AzureBlobCreds getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
