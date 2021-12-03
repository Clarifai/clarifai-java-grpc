// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * <pre>
 * HostedURL
 * </pre>
 *
 * Protobuf type {@code clarifai.api.HostedURL}
 */
public  final class HostedURL extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.HostedURL)
    HostedURLOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HostedURL.newBuilder() to construct.
  private HostedURL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HostedURL() {
    prefix_ = "";
    suffix_ = "";
    sizes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    crossorigin_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HostedURL();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HostedURL(
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
            java.lang.String s = input.readStringRequireUtf8();

            prefix_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            suffix_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              sizes_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            sizes_.add(s);
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            crossorigin_ = s;
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
        sizes_ = sizes_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_HostedURL_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_HostedURL_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.HostedURL.class, com.clarifai.grpc.api.HostedURL.Builder.class);
  }

  public static final int PREFIX_FIELD_NUMBER = 1;
  private volatile java.lang.Object prefix_;
  /**
   * <pre>
   * Prefix of the URL of every hosted image.
   * </pre>
   *
   * <code>string prefix = 1;</code>
   * @return The prefix.
   */
  public java.lang.String getPrefix() {
    java.lang.Object ref = prefix_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      prefix_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Prefix of the URL of every hosted image.
   * </pre>
   *
   * <code>string prefix = 1;</code>
   * @return The bytes for prefix.
   */
  public com.google.protobuf.ByteString
      getPrefixBytes() {
    java.lang.Object ref = prefix_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      prefix_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUFFIX_FIELD_NUMBER = 2;
  private volatile java.lang.Object suffix_;
  /**
   * <pre>
   * Suffix of an image stored in different sizes.
   * </pre>
   *
   * <code>string suffix = 2;</code>
   * @return The suffix.
   */
  public java.lang.String getSuffix() {
    java.lang.Object ref = suffix_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      suffix_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Suffix of an image stored in different sizes.
   * </pre>
   *
   * <code>string suffix = 2;</code>
   * @return The bytes for suffix.
   */
  public com.google.protobuf.ByteString
      getSuffixBytes() {
    java.lang.Object ref = suffix_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      suffix_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SIZES_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList sizes_;
  /**
   * <pre>
   * The sizes field lists which images of the different sizes are hosted in our storage. The URL
   * of each hosted image can be obtained by joining the prefix, one of the sizes and suffix.
   * </pre>
   *
   * <code>repeated string sizes = 3;</code>
   * @return A list containing the sizes.
   */
  public com.google.protobuf.ProtocolStringList
      getSizesList() {
    return sizes_;
  }
  /**
   * <pre>
   * The sizes field lists which images of the different sizes are hosted in our storage. The URL
   * of each hosted image can be obtained by joining the prefix, one of the sizes and suffix.
   * </pre>
   *
   * <code>repeated string sizes = 3;</code>
   * @return The count of sizes.
   */
  public int getSizesCount() {
    return sizes_.size();
  }
  /**
   * <pre>
   * The sizes field lists which images of the different sizes are hosted in our storage. The URL
   * of each hosted image can be obtained by joining the prefix, one of the sizes and suffix.
   * </pre>
   *
   * <code>repeated string sizes = 3;</code>
   * @param index The index of the element to return.
   * @return The sizes at the given index.
   */
  public java.lang.String getSizes(int index) {
    return sizes_.get(index);
  }
  /**
   * <pre>
   * The sizes field lists which images of the different sizes are hosted in our storage. The URL
   * of each hosted image can be obtained by joining the prefix, one of the sizes and suffix.
   * </pre>
   *
   * <code>repeated string sizes = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the sizes at the given index.
   */
  public com.google.protobuf.ByteString
      getSizesBytes(int index) {
    return sizes_.getByteString(index);
  }

  public static final int CROSSORIGIN_FIELD_NUMBER = 4;
  private volatile java.lang.Object crossorigin_;
  /**
   * <pre>
   * The crossorigin property of html media tag
   * For Secure Data Hosting this needs to be set to 'use-credentials'
   * </pre>
   *
   * <code>string crossorigin = 4;</code>
   * @return The crossorigin.
   */
  public java.lang.String getCrossorigin() {
    java.lang.Object ref = crossorigin_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      crossorigin_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The crossorigin property of html media tag
   * For Secure Data Hosting this needs to be set to 'use-credentials'
   * </pre>
   *
   * <code>string crossorigin = 4;</code>
   * @return The bytes for crossorigin.
   */
  public com.google.protobuf.ByteString
      getCrossoriginBytes() {
    java.lang.Object ref = crossorigin_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      crossorigin_ = b;
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
    if (!getPrefixBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, prefix_);
    }
    if (!getSuffixBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, suffix_);
    }
    for (int i = 0; i < sizes_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, sizes_.getRaw(i));
    }
    if (!getCrossoriginBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, crossorigin_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPrefixBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, prefix_);
    }
    if (!getSuffixBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, suffix_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < sizes_.size(); i++) {
        dataSize += computeStringSizeNoTag(sizes_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getSizesList().size();
    }
    if (!getCrossoriginBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, crossorigin_);
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
    if (!(obj instanceof com.clarifai.grpc.api.HostedURL)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.HostedURL other = (com.clarifai.grpc.api.HostedURL) obj;

    if (!getPrefix()
        .equals(other.getPrefix())) return false;
    if (!getSuffix()
        .equals(other.getSuffix())) return false;
    if (!getSizesList()
        .equals(other.getSizesList())) return false;
    if (!getCrossorigin()
        .equals(other.getCrossorigin())) return false;
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
    hash = (37 * hash) + PREFIX_FIELD_NUMBER;
    hash = (53 * hash) + getPrefix().hashCode();
    hash = (37 * hash) + SUFFIX_FIELD_NUMBER;
    hash = (53 * hash) + getSuffix().hashCode();
    if (getSizesCount() > 0) {
      hash = (37 * hash) + SIZES_FIELD_NUMBER;
      hash = (53 * hash) + getSizesList().hashCode();
    }
    hash = (37 * hash) + CROSSORIGIN_FIELD_NUMBER;
    hash = (53 * hash) + getCrossorigin().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.HostedURL parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.HostedURL parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.HostedURL parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.HostedURL parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.HostedURL parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.HostedURL parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.HostedURL parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.HostedURL parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.HostedURL parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.HostedURL parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.HostedURL parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.HostedURL parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.HostedURL prototype) {
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
   * HostedURL
   * </pre>
   *
   * Protobuf type {@code clarifai.api.HostedURL}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.HostedURL)
      com.clarifai.grpc.api.HostedURLOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_HostedURL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_HostedURL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.HostedURL.class, com.clarifai.grpc.api.HostedURL.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.HostedURL.newBuilder()
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
      prefix_ = "";

      suffix_ = "";

      sizes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      crossorigin_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_HostedURL_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.HostedURL getDefaultInstanceForType() {
      return com.clarifai.grpc.api.HostedURL.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.HostedURL build() {
      com.clarifai.grpc.api.HostedURL result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.HostedURL buildPartial() {
      com.clarifai.grpc.api.HostedURL result = new com.clarifai.grpc.api.HostedURL(this);
      int from_bitField0_ = bitField0_;
      result.prefix_ = prefix_;
      result.suffix_ = suffix_;
      if (((bitField0_ & 0x00000001) != 0)) {
        sizes_ = sizes_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.sizes_ = sizes_;
      result.crossorigin_ = crossorigin_;
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
      if (other instanceof com.clarifai.grpc.api.HostedURL) {
        return mergeFrom((com.clarifai.grpc.api.HostedURL)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.HostedURL other) {
      if (other == com.clarifai.grpc.api.HostedURL.getDefaultInstance()) return this;
      if (!other.getPrefix().isEmpty()) {
        prefix_ = other.prefix_;
        onChanged();
      }
      if (!other.getSuffix().isEmpty()) {
        suffix_ = other.suffix_;
        onChanged();
      }
      if (!other.sizes_.isEmpty()) {
        if (sizes_.isEmpty()) {
          sizes_ = other.sizes_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureSizesIsMutable();
          sizes_.addAll(other.sizes_);
        }
        onChanged();
      }
      if (!other.getCrossorigin().isEmpty()) {
        crossorigin_ = other.crossorigin_;
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
      com.clarifai.grpc.api.HostedURL parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.HostedURL) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object prefix_ = "";
    /**
     * <pre>
     * Prefix of the URL of every hosted image.
     * </pre>
     *
     * <code>string prefix = 1;</code>
     * @return The prefix.
     */
    public java.lang.String getPrefix() {
      java.lang.Object ref = prefix_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        prefix_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Prefix of the URL of every hosted image.
     * </pre>
     *
     * <code>string prefix = 1;</code>
     * @return The bytes for prefix.
     */
    public com.google.protobuf.ByteString
        getPrefixBytes() {
      java.lang.Object ref = prefix_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        prefix_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Prefix of the URL of every hosted image.
     * </pre>
     *
     * <code>string prefix = 1;</code>
     * @param value The prefix to set.
     * @return This builder for chaining.
     */
    public Builder setPrefix(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      prefix_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Prefix of the URL of every hosted image.
     * </pre>
     *
     * <code>string prefix = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrefix() {
      
      prefix_ = getDefaultInstance().getPrefix();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Prefix of the URL of every hosted image.
     * </pre>
     *
     * <code>string prefix = 1;</code>
     * @param value The bytes for prefix to set.
     * @return This builder for chaining.
     */
    public Builder setPrefixBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      prefix_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object suffix_ = "";
    /**
     * <pre>
     * Suffix of an image stored in different sizes.
     * </pre>
     *
     * <code>string suffix = 2;</code>
     * @return The suffix.
     */
    public java.lang.String getSuffix() {
      java.lang.Object ref = suffix_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        suffix_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Suffix of an image stored in different sizes.
     * </pre>
     *
     * <code>string suffix = 2;</code>
     * @return The bytes for suffix.
     */
    public com.google.protobuf.ByteString
        getSuffixBytes() {
      java.lang.Object ref = suffix_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        suffix_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Suffix of an image stored in different sizes.
     * </pre>
     *
     * <code>string suffix = 2;</code>
     * @param value The suffix to set.
     * @return This builder for chaining.
     */
    public Builder setSuffix(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      suffix_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Suffix of an image stored in different sizes.
     * </pre>
     *
     * <code>string suffix = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSuffix() {
      
      suffix_ = getDefaultInstance().getSuffix();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Suffix of an image stored in different sizes.
     * </pre>
     *
     * <code>string suffix = 2;</code>
     * @param value The bytes for suffix to set.
     * @return This builder for chaining.
     */
    public Builder setSuffixBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      suffix_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList sizes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureSizesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        sizes_ = new com.google.protobuf.LazyStringArrayList(sizes_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * The sizes field lists which images of the different sizes are hosted in our storage. The URL
     * of each hosted image can be obtained by joining the prefix, one of the sizes and suffix.
     * </pre>
     *
     * <code>repeated string sizes = 3;</code>
     * @return A list containing the sizes.
     */
    public com.google.protobuf.ProtocolStringList
        getSizesList() {
      return sizes_.getUnmodifiableView();
    }
    /**
     * <pre>
     * The sizes field lists which images of the different sizes are hosted in our storage. The URL
     * of each hosted image can be obtained by joining the prefix, one of the sizes and suffix.
     * </pre>
     *
     * <code>repeated string sizes = 3;</code>
     * @return The count of sizes.
     */
    public int getSizesCount() {
      return sizes_.size();
    }
    /**
     * <pre>
     * The sizes field lists which images of the different sizes are hosted in our storage. The URL
     * of each hosted image can be obtained by joining the prefix, one of the sizes and suffix.
     * </pre>
     *
     * <code>repeated string sizes = 3;</code>
     * @param index The index of the element to return.
     * @return The sizes at the given index.
     */
    public java.lang.String getSizes(int index) {
      return sizes_.get(index);
    }
    /**
     * <pre>
     * The sizes field lists which images of the different sizes are hosted in our storage. The URL
     * of each hosted image can be obtained by joining the prefix, one of the sizes and suffix.
     * </pre>
     *
     * <code>repeated string sizes = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the sizes at the given index.
     */
    public com.google.protobuf.ByteString
        getSizesBytes(int index) {
      return sizes_.getByteString(index);
    }
    /**
     * <pre>
     * The sizes field lists which images of the different sizes are hosted in our storage. The URL
     * of each hosted image can be obtained by joining the prefix, one of the sizes and suffix.
     * </pre>
     *
     * <code>repeated string sizes = 3;</code>
     * @param index The index to set the value at.
     * @param value The sizes to set.
     * @return This builder for chaining.
     */
    public Builder setSizes(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureSizesIsMutable();
      sizes_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The sizes field lists which images of the different sizes are hosted in our storage. The URL
     * of each hosted image can be obtained by joining the prefix, one of the sizes and suffix.
     * </pre>
     *
     * <code>repeated string sizes = 3;</code>
     * @param value The sizes to add.
     * @return This builder for chaining.
     */
    public Builder addSizes(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureSizesIsMutable();
      sizes_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The sizes field lists which images of the different sizes are hosted in our storage. The URL
     * of each hosted image can be obtained by joining the prefix, one of the sizes and suffix.
     * </pre>
     *
     * <code>repeated string sizes = 3;</code>
     * @param values The sizes to add.
     * @return This builder for chaining.
     */
    public Builder addAllSizes(
        java.lang.Iterable<java.lang.String> values) {
      ensureSizesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, sizes_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The sizes field lists which images of the different sizes are hosted in our storage. The URL
     * of each hosted image can be obtained by joining the prefix, one of the sizes and suffix.
     * </pre>
     *
     * <code>repeated string sizes = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSizes() {
      sizes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The sizes field lists which images of the different sizes are hosted in our storage. The URL
     * of each hosted image can be obtained by joining the prefix, one of the sizes and suffix.
     * </pre>
     *
     * <code>repeated string sizes = 3;</code>
     * @param value The bytes of the sizes to add.
     * @return This builder for chaining.
     */
    public Builder addSizesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureSizesIsMutable();
      sizes_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object crossorigin_ = "";
    /**
     * <pre>
     * The crossorigin property of html media tag
     * For Secure Data Hosting this needs to be set to 'use-credentials'
     * </pre>
     *
     * <code>string crossorigin = 4;</code>
     * @return The crossorigin.
     */
    public java.lang.String getCrossorigin() {
      java.lang.Object ref = crossorigin_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        crossorigin_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The crossorigin property of html media tag
     * For Secure Data Hosting this needs to be set to 'use-credentials'
     * </pre>
     *
     * <code>string crossorigin = 4;</code>
     * @return The bytes for crossorigin.
     */
    public com.google.protobuf.ByteString
        getCrossoriginBytes() {
      java.lang.Object ref = crossorigin_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        crossorigin_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The crossorigin property of html media tag
     * For Secure Data Hosting this needs to be set to 'use-credentials'
     * </pre>
     *
     * <code>string crossorigin = 4;</code>
     * @param value The crossorigin to set.
     * @return This builder for chaining.
     */
    public Builder setCrossorigin(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      crossorigin_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The crossorigin property of html media tag
     * For Secure Data Hosting this needs to be set to 'use-credentials'
     * </pre>
     *
     * <code>string crossorigin = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCrossorigin() {
      
      crossorigin_ = getDefaultInstance().getCrossorigin();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The crossorigin property of html media tag
     * For Secure Data Hosting this needs to be set to 'use-credentials'
     * </pre>
     *
     * <code>string crossorigin = 4;</code>
     * @param value The bytes for crossorigin to set.
     * @return This builder for chaining.
     */
    public Builder setCrossoriginBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      crossorigin_ = value;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.HostedURL)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.HostedURL)
  private static final com.clarifai.grpc.api.HostedURL DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.HostedURL();
  }

  public static com.clarifai.grpc.api.HostedURL getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HostedURL>
      PARSER = new com.google.protobuf.AbstractParser<HostedURL>() {
    @java.lang.Override
    public HostedURL parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HostedURL(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HostedURL> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HostedURL> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.HostedURL getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

