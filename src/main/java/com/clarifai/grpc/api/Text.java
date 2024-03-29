// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * <pre>
 * Text
 * </pre>
 *
 * Protobuf type {@code clarifai.api.Text}
 */
public final class Text extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.Text)
    TextOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Text.newBuilder() to construct.
  private Text(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Text() {
    raw_ = "";
    url_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Text();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Text(
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

            raw_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            url_ = s;
            break;
          }
          case 24: {

            allowDuplicateUrl_ = input.readBool();
            break;
          }
          case 34: {
            com.clarifai.grpc.api.HostedURL.Builder subBuilder = null;
            if (hosted_ != null) {
              subBuilder = hosted_.toBuilder();
            }
            hosted_ = input.readMessage(com.clarifai.grpc.api.HostedURL.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(hosted_);
              hosted_ = subBuilder.buildPartial();
            }

            break;
          }
          case 42: {
            com.clarifai.grpc.api.TextInfo.Builder subBuilder = null;
            if (textInfo_ != null) {
              subBuilder = textInfo_.toBuilder();
            }
            textInfo_ = input.readMessage(com.clarifai.grpc.api.TextInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(textInfo_);
              textInfo_ = subBuilder.buildPartial();
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
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Text_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Text_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.Text.class, com.clarifai.grpc.api.Text.Builder.class);
  }

  public static final int RAW_FIELD_NUMBER = 1;
  private volatile java.lang.Object raw_;
  /**
   * <pre>
   * This is a raw text string.
   * </pre>
   *
   * <code>string raw = 1;</code>
   * @return The raw.
   */
  @java.lang.Override
  public java.lang.String getRaw() {
    java.lang.Object ref = raw_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      raw_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * This is a raw text string.
   * </pre>
   *
   * <code>string raw = 1;</code>
   * @return The bytes for raw.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRawBytes() {
    java.lang.Object ref = raw_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      raw_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int URL_FIELD_NUMBER = 2;
  private volatile java.lang.Object url_;
  /**
   * <pre>
   * Url to a text file
   * </pre>
   *
   * <code>string url = 2;</code>
   * @return The url.
   */
  @java.lang.Override
  public java.lang.String getUrl() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      url_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Url to a text file
   * </pre>
   *
   * <code>string url = 2;</code>
   * @return The bytes for url.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUrlBytes() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      url_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ALLOW_DUPLICATE_URL_FIELD_NUMBER = 3;
  private boolean allowDuplicateUrl_;
  /**
   * <code>bool allow_duplicate_url = 3;</code>
   * @return The allowDuplicateUrl.
   */
  @java.lang.Override
  public boolean getAllowDuplicateUrl() {
    return allowDuplicateUrl_;
  }

  public static final int HOSTED_FIELD_NUMBER = 4;
  private com.clarifai.grpc.api.HostedURL hosted_;
  /**
   * <pre>
   * The hosted field lists original text hosted in Clarifai storage. This field is currently used
   * only in response.
   * </pre>
   *
   * <code>.clarifai.api.HostedURL hosted = 4;</code>
   * @return Whether the hosted field is set.
   */
  @java.lang.Override
  public boolean hasHosted() {
    return hosted_ != null;
  }
  /**
   * <pre>
   * The hosted field lists original text hosted in Clarifai storage. This field is currently used
   * only in response.
   * </pre>
   *
   * <code>.clarifai.api.HostedURL hosted = 4;</code>
   * @return The hosted.
   */
  @java.lang.Override
  public com.clarifai.grpc.api.HostedURL getHosted() {
    return hosted_ == null ? com.clarifai.grpc.api.HostedURL.getDefaultInstance() : hosted_;
  }
  /**
   * <pre>
   * The hosted field lists original text hosted in Clarifai storage. This field is currently used
   * only in response.
   * </pre>
   *
   * <code>.clarifai.api.HostedURL hosted = 4;</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.HostedURLOrBuilder getHostedOrBuilder() {
    return getHosted();
  }

  public static final int TEXT_INFO_FIELD_NUMBER = 5;
  private com.clarifai.grpc.api.TextInfo textInfo_;
  /**
   * <pre>
   * text info
   * </pre>
   *
   * <code>.clarifai.api.TextInfo text_info = 5;</code>
   * @return Whether the textInfo field is set.
   */
  @java.lang.Override
  public boolean hasTextInfo() {
    return textInfo_ != null;
  }
  /**
   * <pre>
   * text info
   * </pre>
   *
   * <code>.clarifai.api.TextInfo text_info = 5;</code>
   * @return The textInfo.
   */
  @java.lang.Override
  public com.clarifai.grpc.api.TextInfo getTextInfo() {
    return textInfo_ == null ? com.clarifai.grpc.api.TextInfo.getDefaultInstance() : textInfo_;
  }
  /**
   * <pre>
   * text info
   * </pre>
   *
   * <code>.clarifai.api.TextInfo text_info = 5;</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.TextInfoOrBuilder getTextInfoOrBuilder() {
    return getTextInfo();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(raw_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, raw_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(url_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, url_);
    }
    if (allowDuplicateUrl_ != false) {
      output.writeBool(3, allowDuplicateUrl_);
    }
    if (hosted_ != null) {
      output.writeMessage(4, getHosted());
    }
    if (textInfo_ != null) {
      output.writeMessage(5, getTextInfo());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(raw_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, raw_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(url_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, url_);
    }
    if (allowDuplicateUrl_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, allowDuplicateUrl_);
    }
    if (hosted_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getHosted());
    }
    if (textInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getTextInfo());
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
    if (!(obj instanceof com.clarifai.grpc.api.Text)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.Text other = (com.clarifai.grpc.api.Text) obj;

    if (!getRaw()
        .equals(other.getRaw())) return false;
    if (!getUrl()
        .equals(other.getUrl())) return false;
    if (getAllowDuplicateUrl()
        != other.getAllowDuplicateUrl()) return false;
    if (hasHosted() != other.hasHosted()) return false;
    if (hasHosted()) {
      if (!getHosted()
          .equals(other.getHosted())) return false;
    }
    if (hasTextInfo() != other.hasTextInfo()) return false;
    if (hasTextInfo()) {
      if (!getTextInfo()
          .equals(other.getTextInfo())) return false;
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
    hash = (37 * hash) + RAW_FIELD_NUMBER;
    hash = (53 * hash) + getRaw().hashCode();
    hash = (37 * hash) + URL_FIELD_NUMBER;
    hash = (53 * hash) + getUrl().hashCode();
    hash = (37 * hash) + ALLOW_DUPLICATE_URL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAllowDuplicateUrl());
    if (hasHosted()) {
      hash = (37 * hash) + HOSTED_FIELD_NUMBER;
      hash = (53 * hash) + getHosted().hashCode();
    }
    if (hasTextInfo()) {
      hash = (37 * hash) + TEXT_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getTextInfo().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.Text parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.Text parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Text parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.Text parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Text parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.Text parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Text parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.Text parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Text parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.Text parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Text parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.Text parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.Text prototype) {
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
   * Text
   * </pre>
   *
   * Protobuf type {@code clarifai.api.Text}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.Text)
      com.clarifai.grpc.api.TextOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Text_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Text_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.Text.class, com.clarifai.grpc.api.Text.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.Text.newBuilder()
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
      raw_ = "";

      url_ = "";

      allowDuplicateUrl_ = false;

      if (hostedBuilder_ == null) {
        hosted_ = null;
      } else {
        hosted_ = null;
        hostedBuilder_ = null;
      }
      if (textInfoBuilder_ == null) {
        textInfo_ = null;
      } else {
        textInfo_ = null;
        textInfoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Text_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.Text getDefaultInstanceForType() {
      return com.clarifai.grpc.api.Text.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.Text build() {
      com.clarifai.grpc.api.Text result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.Text buildPartial() {
      com.clarifai.grpc.api.Text result = new com.clarifai.grpc.api.Text(this);
      result.raw_ = raw_;
      result.url_ = url_;
      result.allowDuplicateUrl_ = allowDuplicateUrl_;
      if (hostedBuilder_ == null) {
        result.hosted_ = hosted_;
      } else {
        result.hosted_ = hostedBuilder_.build();
      }
      if (textInfoBuilder_ == null) {
        result.textInfo_ = textInfo_;
      } else {
        result.textInfo_ = textInfoBuilder_.build();
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
      if (other instanceof com.clarifai.grpc.api.Text) {
        return mergeFrom((com.clarifai.grpc.api.Text)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.Text other) {
      if (other == com.clarifai.grpc.api.Text.getDefaultInstance()) return this;
      if (!other.getRaw().isEmpty()) {
        raw_ = other.raw_;
        onChanged();
      }
      if (!other.getUrl().isEmpty()) {
        url_ = other.url_;
        onChanged();
      }
      if (other.getAllowDuplicateUrl() != false) {
        setAllowDuplicateUrl(other.getAllowDuplicateUrl());
      }
      if (other.hasHosted()) {
        mergeHosted(other.getHosted());
      }
      if (other.hasTextInfo()) {
        mergeTextInfo(other.getTextInfo());
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
      com.clarifai.grpc.api.Text parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.Text) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object raw_ = "";
    /**
     * <pre>
     * This is a raw text string.
     * </pre>
     *
     * <code>string raw = 1;</code>
     * @return The raw.
     */
    public java.lang.String getRaw() {
      java.lang.Object ref = raw_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        raw_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * This is a raw text string.
     * </pre>
     *
     * <code>string raw = 1;</code>
     * @return The bytes for raw.
     */
    public com.google.protobuf.ByteString
        getRawBytes() {
      java.lang.Object ref = raw_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        raw_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * This is a raw text string.
     * </pre>
     *
     * <code>string raw = 1;</code>
     * @param value The raw to set.
     * @return This builder for chaining.
     */
    public Builder setRaw(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      raw_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is a raw text string.
     * </pre>
     *
     * <code>string raw = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRaw() {
      
      raw_ = getDefaultInstance().getRaw();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is a raw text string.
     * </pre>
     *
     * <code>string raw = 1;</code>
     * @param value The bytes for raw to set.
     * @return This builder for chaining.
     */
    public Builder setRawBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      raw_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object url_ = "";
    /**
     * <pre>
     * Url to a text file
     * </pre>
     *
     * <code>string url = 2;</code>
     * @return The url.
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        url_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Url to a text file
     * </pre>
     *
     * <code>string url = 2;</code>
     * @return The bytes for url.
     */
    public com.google.protobuf.ByteString
        getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Url to a text file
     * </pre>
     *
     * <code>string url = 2;</code>
     * @param value The url to set.
     * @return This builder for chaining.
     */
    public Builder setUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      url_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Url to a text file
     * </pre>
     *
     * <code>string url = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUrl() {
      
      url_ = getDefaultInstance().getUrl();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Url to a text file
     * </pre>
     *
     * <code>string url = 2;</code>
     * @param value The bytes for url to set.
     * @return This builder for chaining.
     */
    public Builder setUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      url_ = value;
      onChanged();
      return this;
    }

    private boolean allowDuplicateUrl_ ;
    /**
     * <code>bool allow_duplicate_url = 3;</code>
     * @return The allowDuplicateUrl.
     */
    @java.lang.Override
    public boolean getAllowDuplicateUrl() {
      return allowDuplicateUrl_;
    }
    /**
     * <code>bool allow_duplicate_url = 3;</code>
     * @param value The allowDuplicateUrl to set.
     * @return This builder for chaining.
     */
    public Builder setAllowDuplicateUrl(boolean value) {
      
      allowDuplicateUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool allow_duplicate_url = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAllowDuplicateUrl() {
      
      allowDuplicateUrl_ = false;
      onChanged();
      return this;
    }

    private com.clarifai.grpc.api.HostedURL hosted_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.HostedURL, com.clarifai.grpc.api.HostedURL.Builder, com.clarifai.grpc.api.HostedURLOrBuilder> hostedBuilder_;
    /**
     * <pre>
     * The hosted field lists original text hosted in Clarifai storage. This field is currently used
     * only in response.
     * </pre>
     *
     * <code>.clarifai.api.HostedURL hosted = 4;</code>
     * @return Whether the hosted field is set.
     */
    public boolean hasHosted() {
      return hostedBuilder_ != null || hosted_ != null;
    }
    /**
     * <pre>
     * The hosted field lists original text hosted in Clarifai storage. This field is currently used
     * only in response.
     * </pre>
     *
     * <code>.clarifai.api.HostedURL hosted = 4;</code>
     * @return The hosted.
     */
    public com.clarifai.grpc.api.HostedURL getHosted() {
      if (hostedBuilder_ == null) {
        return hosted_ == null ? com.clarifai.grpc.api.HostedURL.getDefaultInstance() : hosted_;
      } else {
        return hostedBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The hosted field lists original text hosted in Clarifai storage. This field is currently used
     * only in response.
     * </pre>
     *
     * <code>.clarifai.api.HostedURL hosted = 4;</code>
     */
    public Builder setHosted(com.clarifai.grpc.api.HostedURL value) {
      if (hostedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        hosted_ = value;
        onChanged();
      } else {
        hostedBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The hosted field lists original text hosted in Clarifai storage. This field is currently used
     * only in response.
     * </pre>
     *
     * <code>.clarifai.api.HostedURL hosted = 4;</code>
     */
    public Builder setHosted(
        com.clarifai.grpc.api.HostedURL.Builder builderForValue) {
      if (hostedBuilder_ == null) {
        hosted_ = builderForValue.build();
        onChanged();
      } else {
        hostedBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The hosted field lists original text hosted in Clarifai storage. This field is currently used
     * only in response.
     * </pre>
     *
     * <code>.clarifai.api.HostedURL hosted = 4;</code>
     */
    public Builder mergeHosted(com.clarifai.grpc.api.HostedURL value) {
      if (hostedBuilder_ == null) {
        if (hosted_ != null) {
          hosted_ =
            com.clarifai.grpc.api.HostedURL.newBuilder(hosted_).mergeFrom(value).buildPartial();
        } else {
          hosted_ = value;
        }
        onChanged();
      } else {
        hostedBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The hosted field lists original text hosted in Clarifai storage. This field is currently used
     * only in response.
     * </pre>
     *
     * <code>.clarifai.api.HostedURL hosted = 4;</code>
     */
    public Builder clearHosted() {
      if (hostedBuilder_ == null) {
        hosted_ = null;
        onChanged();
      } else {
        hosted_ = null;
        hostedBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The hosted field lists original text hosted in Clarifai storage. This field is currently used
     * only in response.
     * </pre>
     *
     * <code>.clarifai.api.HostedURL hosted = 4;</code>
     */
    public com.clarifai.grpc.api.HostedURL.Builder getHostedBuilder() {
      
      onChanged();
      return getHostedFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The hosted field lists original text hosted in Clarifai storage. This field is currently used
     * only in response.
     * </pre>
     *
     * <code>.clarifai.api.HostedURL hosted = 4;</code>
     */
    public com.clarifai.grpc.api.HostedURLOrBuilder getHostedOrBuilder() {
      if (hostedBuilder_ != null) {
        return hostedBuilder_.getMessageOrBuilder();
      } else {
        return hosted_ == null ?
            com.clarifai.grpc.api.HostedURL.getDefaultInstance() : hosted_;
      }
    }
    /**
     * <pre>
     * The hosted field lists original text hosted in Clarifai storage. This field is currently used
     * only in response.
     * </pre>
     *
     * <code>.clarifai.api.HostedURL hosted = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.HostedURL, com.clarifai.grpc.api.HostedURL.Builder, com.clarifai.grpc.api.HostedURLOrBuilder> 
        getHostedFieldBuilder() {
      if (hostedBuilder_ == null) {
        hostedBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.clarifai.grpc.api.HostedURL, com.clarifai.grpc.api.HostedURL.Builder, com.clarifai.grpc.api.HostedURLOrBuilder>(
                getHosted(),
                getParentForChildren(),
                isClean());
        hosted_ = null;
      }
      return hostedBuilder_;
    }

    private com.clarifai.grpc.api.TextInfo textInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.TextInfo, com.clarifai.grpc.api.TextInfo.Builder, com.clarifai.grpc.api.TextInfoOrBuilder> textInfoBuilder_;
    /**
     * <pre>
     * text info
     * </pre>
     *
     * <code>.clarifai.api.TextInfo text_info = 5;</code>
     * @return Whether the textInfo field is set.
     */
    public boolean hasTextInfo() {
      return textInfoBuilder_ != null || textInfo_ != null;
    }
    /**
     * <pre>
     * text info
     * </pre>
     *
     * <code>.clarifai.api.TextInfo text_info = 5;</code>
     * @return The textInfo.
     */
    public com.clarifai.grpc.api.TextInfo getTextInfo() {
      if (textInfoBuilder_ == null) {
        return textInfo_ == null ? com.clarifai.grpc.api.TextInfo.getDefaultInstance() : textInfo_;
      } else {
        return textInfoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * text info
     * </pre>
     *
     * <code>.clarifai.api.TextInfo text_info = 5;</code>
     */
    public Builder setTextInfo(com.clarifai.grpc.api.TextInfo value) {
      if (textInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        textInfo_ = value;
        onChanged();
      } else {
        textInfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * text info
     * </pre>
     *
     * <code>.clarifai.api.TextInfo text_info = 5;</code>
     */
    public Builder setTextInfo(
        com.clarifai.grpc.api.TextInfo.Builder builderForValue) {
      if (textInfoBuilder_ == null) {
        textInfo_ = builderForValue.build();
        onChanged();
      } else {
        textInfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * text info
     * </pre>
     *
     * <code>.clarifai.api.TextInfo text_info = 5;</code>
     */
    public Builder mergeTextInfo(com.clarifai.grpc.api.TextInfo value) {
      if (textInfoBuilder_ == null) {
        if (textInfo_ != null) {
          textInfo_ =
            com.clarifai.grpc.api.TextInfo.newBuilder(textInfo_).mergeFrom(value).buildPartial();
        } else {
          textInfo_ = value;
        }
        onChanged();
      } else {
        textInfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * text info
     * </pre>
     *
     * <code>.clarifai.api.TextInfo text_info = 5;</code>
     */
    public Builder clearTextInfo() {
      if (textInfoBuilder_ == null) {
        textInfo_ = null;
        onChanged();
      } else {
        textInfo_ = null;
        textInfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * text info
     * </pre>
     *
     * <code>.clarifai.api.TextInfo text_info = 5;</code>
     */
    public com.clarifai.grpc.api.TextInfo.Builder getTextInfoBuilder() {
      
      onChanged();
      return getTextInfoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * text info
     * </pre>
     *
     * <code>.clarifai.api.TextInfo text_info = 5;</code>
     */
    public com.clarifai.grpc.api.TextInfoOrBuilder getTextInfoOrBuilder() {
      if (textInfoBuilder_ != null) {
        return textInfoBuilder_.getMessageOrBuilder();
      } else {
        return textInfo_ == null ?
            com.clarifai.grpc.api.TextInfo.getDefaultInstance() : textInfo_;
      }
    }
    /**
     * <pre>
     * text info
     * </pre>
     *
     * <code>.clarifai.api.TextInfo text_info = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.TextInfo, com.clarifai.grpc.api.TextInfo.Builder, com.clarifai.grpc.api.TextInfoOrBuilder> 
        getTextInfoFieldBuilder() {
      if (textInfoBuilder_ == null) {
        textInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.clarifai.grpc.api.TextInfo, com.clarifai.grpc.api.TextInfo.Builder, com.clarifai.grpc.api.TextInfoOrBuilder>(
                getTextInfo(),
                getParentForChildren(),
                isClean());
        textInfo_ = null;
      }
      return textInfoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.Text)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.Text)
  private static final com.clarifai.grpc.api.Text DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.Text();
  }

  public static com.clarifai.grpc.api.Text getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Text>
      PARSER = new com.google.protobuf.AbstractParser<Text>() {
    @java.lang.Override
    public Text parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Text(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Text> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Text> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.Text getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

