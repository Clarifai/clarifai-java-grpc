// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * Protobuf type {@code clarifai.api.Span}
 */
public final class Span extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.Span)
    SpanOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Span.newBuilder() to construct.
  private Span(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Span() {
    rawText_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Span();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Span(
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
          case 8: {

            charStart_ = input.readUInt32();
            break;
          }
          case 16: {

            charEnd_ = input.readUInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            rawText_ = s;
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
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Span_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Span_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.Span.class, com.clarifai.grpc.api.Span.Builder.class);
  }

  public static final int CHAR_START_FIELD_NUMBER = 1;
  private int charStart_;
  /**
   * <code>uint32 char_start = 1 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The charStart.
   */
  @java.lang.Override
  public int getCharStart() {
    return charStart_;
  }

  public static final int CHAR_END_FIELD_NUMBER = 2;
  private int charEnd_;
  /**
   * <code>uint32 char_end = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The charEnd.
   */
  @java.lang.Override
  public int getCharEnd() {
    return charEnd_;
  }

  public static final int RAW_TEXT_FIELD_NUMBER = 3;
  private volatile java.lang.Object rawText_;
  /**
   * <code>string raw_text = 3;</code>
   * @return The rawText.
   */
  @java.lang.Override
  public java.lang.String getRawText() {
    java.lang.Object ref = rawText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rawText_ = s;
      return s;
    }
  }
  /**
   * <code>string raw_text = 3;</code>
   * @return The bytes for rawText.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRawTextBytes() {
    java.lang.Object ref = rawText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      rawText_ = b;
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
    if (charStart_ != 0) {
      output.writeUInt32(1, charStart_);
    }
    if (charEnd_ != 0) {
      output.writeUInt32(2, charEnd_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rawText_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, rawText_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (charStart_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, charStart_);
    }
    if (charEnd_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, charEnd_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rawText_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, rawText_);
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
    if (!(obj instanceof com.clarifai.grpc.api.Span)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.Span other = (com.clarifai.grpc.api.Span) obj;

    if (getCharStart()
        != other.getCharStart()) return false;
    if (getCharEnd()
        != other.getCharEnd()) return false;
    if (!getRawText()
        .equals(other.getRawText())) return false;
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
    hash = (37 * hash) + CHAR_START_FIELD_NUMBER;
    hash = (53 * hash) + getCharStart();
    hash = (37 * hash) + CHAR_END_FIELD_NUMBER;
    hash = (53 * hash) + getCharEnd();
    hash = (37 * hash) + RAW_TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getRawText().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.Span parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.Span parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Span parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.Span parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Span parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.Span parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Span parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.Span parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Span parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.Span parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Span parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.Span parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.Span prototype) {
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
   * Protobuf type {@code clarifai.api.Span}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.Span)
      com.clarifai.grpc.api.SpanOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Span_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Span_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.Span.class, com.clarifai.grpc.api.Span.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.Span.newBuilder()
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
      charStart_ = 0;

      charEnd_ = 0;

      rawText_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Span_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.Span getDefaultInstanceForType() {
      return com.clarifai.grpc.api.Span.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.Span build() {
      com.clarifai.grpc.api.Span result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.Span buildPartial() {
      com.clarifai.grpc.api.Span result = new com.clarifai.grpc.api.Span(this);
      result.charStart_ = charStart_;
      result.charEnd_ = charEnd_;
      result.rawText_ = rawText_;
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
      if (other instanceof com.clarifai.grpc.api.Span) {
        return mergeFrom((com.clarifai.grpc.api.Span)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.Span other) {
      if (other == com.clarifai.grpc.api.Span.getDefaultInstance()) return this;
      if (other.getCharStart() != 0) {
        setCharStart(other.getCharStart());
      }
      if (other.getCharEnd() != 0) {
        setCharEnd(other.getCharEnd());
      }
      if (!other.getRawText().isEmpty()) {
        rawText_ = other.rawText_;
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
      com.clarifai.grpc.api.Span parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.Span) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int charStart_ ;
    /**
     * <code>uint32 char_start = 1 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @return The charStart.
     */
    @java.lang.Override
    public int getCharStart() {
      return charStart_;
    }
    /**
     * <code>uint32 char_start = 1 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @param value The charStart to set.
     * @return This builder for chaining.
     */
    public Builder setCharStart(int value) {
      
      charStart_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 char_start = 1 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @return This builder for chaining.
     */
    public Builder clearCharStart() {
      
      charStart_ = 0;
      onChanged();
      return this;
    }

    private int charEnd_ ;
    /**
     * <code>uint32 char_end = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @return The charEnd.
     */
    @java.lang.Override
    public int getCharEnd() {
      return charEnd_;
    }
    /**
     * <code>uint32 char_end = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @param value The charEnd to set.
     * @return This builder for chaining.
     */
    public Builder setCharEnd(int value) {
      
      charEnd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 char_end = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @return This builder for chaining.
     */
    public Builder clearCharEnd() {
      
      charEnd_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object rawText_ = "";
    /**
     * <code>string raw_text = 3;</code>
     * @return The rawText.
     */
    public java.lang.String getRawText() {
      java.lang.Object ref = rawText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rawText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string raw_text = 3;</code>
     * @return The bytes for rawText.
     */
    public com.google.protobuf.ByteString
        getRawTextBytes() {
      java.lang.Object ref = rawText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rawText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string raw_text = 3;</code>
     * @param value The rawText to set.
     * @return This builder for chaining.
     */
    public Builder setRawText(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      rawText_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string raw_text = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRawText() {
      
      rawText_ = getDefaultInstance().getRawText();
      onChanged();
      return this;
    }
    /**
     * <code>string raw_text = 3;</code>
     * @param value The bytes for rawText to set.
     * @return This builder for chaining.
     */
    public Builder setRawTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      rawText_ = value;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.Span)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.Span)
  private static final com.clarifai.grpc.api.Span DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.Span();
  }

  public static com.clarifai.grpc.api.Span getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Span>
      PARSER = new com.google.protobuf.AbstractParser<Span>() {
    @java.lang.Override
    public Span parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Span(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Span> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Span> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.Span getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
