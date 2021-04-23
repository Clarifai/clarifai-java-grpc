// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * Protobuf type {@code clarifai.api.Operator}
 */
public  final class Operator extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.Operator)
    OperatorOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Operator.newBuilder() to construct.
  private Operator(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Operator() {
    typeId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Operator();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Operator(
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

            typeId_ = s;
            break;
          }
          case 18: {
            com.clarifai.grpc.api.OutputInfo.Builder subBuilder = null;
            if (outputInfo_ != null) {
              subBuilder = outputInfo_.toBuilder();
            }
            outputInfo_ = input.readMessage(com.clarifai.grpc.api.OutputInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(outputInfo_);
              outputInfo_ = subBuilder.buildPartial();
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
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Operator_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Operator_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.Operator.class, com.clarifai.grpc.api.Operator.Builder.class);
  }

  public static final int TYPE_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object typeId_;
  /**
   * <pre>
   * Specify the operator type ID.
   * </pre>
   *
   * <code>string type_id = 1;</code>
   * @return The typeId.
   */
  public java.lang.String getTypeId() {
    java.lang.Object ref = typeId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      typeId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Specify the operator type ID.
   * </pre>
   *
   * <code>string type_id = 1;</code>
   * @return The bytes for typeId.
   */
  public com.google.protobuf.ByteString
      getTypeIdBytes() {
    java.lang.Object ref = typeId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      typeId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OUTPUT_INFO_FIELD_NUMBER = 2;
  private com.clarifai.grpc.api.OutputInfo outputInfo_;
  /**
   * <pre>
   * Info about the operator's output and configuration.
   * </pre>
   *
   * <code>.clarifai.api.OutputInfo output_info = 2;</code>
   * @return Whether the outputInfo field is set.
   */
  public boolean hasOutputInfo() {
    return outputInfo_ != null;
  }
  /**
   * <pre>
   * Info about the operator's output and configuration.
   * </pre>
   *
   * <code>.clarifai.api.OutputInfo output_info = 2;</code>
   * @return The outputInfo.
   */
  public com.clarifai.grpc.api.OutputInfo getOutputInfo() {
    return outputInfo_ == null ? com.clarifai.grpc.api.OutputInfo.getDefaultInstance() : outputInfo_;
  }
  /**
   * <pre>
   * Info about the operator's output and configuration.
   * </pre>
   *
   * <code>.clarifai.api.OutputInfo output_info = 2;</code>
   */
  public com.clarifai.grpc.api.OutputInfoOrBuilder getOutputInfoOrBuilder() {
    return getOutputInfo();
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
    if (!getTypeIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, typeId_);
    }
    if (outputInfo_ != null) {
      output.writeMessage(2, getOutputInfo());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTypeIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, typeId_);
    }
    if (outputInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getOutputInfo());
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
    if (!(obj instanceof com.clarifai.grpc.api.Operator)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.Operator other = (com.clarifai.grpc.api.Operator) obj;

    if (!getTypeId()
        .equals(other.getTypeId())) return false;
    if (hasOutputInfo() != other.hasOutputInfo()) return false;
    if (hasOutputInfo()) {
      if (!getOutputInfo()
          .equals(other.getOutputInfo())) return false;
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
    hash = (37 * hash) + TYPE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTypeId().hashCode();
    if (hasOutputInfo()) {
      hash = (37 * hash) + OUTPUT_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getOutputInfo().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.Operator parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.Operator parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Operator parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.Operator parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Operator parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.Operator parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Operator parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.Operator parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Operator parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.Operator parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Operator parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.Operator parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.Operator prototype) {
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
   * Protobuf type {@code clarifai.api.Operator}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.Operator)
      com.clarifai.grpc.api.OperatorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Operator_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Operator_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.Operator.class, com.clarifai.grpc.api.Operator.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.Operator.newBuilder()
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
      typeId_ = "";

      if (outputInfoBuilder_ == null) {
        outputInfo_ = null;
      } else {
        outputInfo_ = null;
        outputInfoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Operator_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.Operator getDefaultInstanceForType() {
      return com.clarifai.grpc.api.Operator.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.Operator build() {
      com.clarifai.grpc.api.Operator result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.Operator buildPartial() {
      com.clarifai.grpc.api.Operator result = new com.clarifai.grpc.api.Operator(this);
      result.typeId_ = typeId_;
      if (outputInfoBuilder_ == null) {
        result.outputInfo_ = outputInfo_;
      } else {
        result.outputInfo_ = outputInfoBuilder_.build();
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
      if (other instanceof com.clarifai.grpc.api.Operator) {
        return mergeFrom((com.clarifai.grpc.api.Operator)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.Operator other) {
      if (other == com.clarifai.grpc.api.Operator.getDefaultInstance()) return this;
      if (!other.getTypeId().isEmpty()) {
        typeId_ = other.typeId_;
        onChanged();
      }
      if (other.hasOutputInfo()) {
        mergeOutputInfo(other.getOutputInfo());
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
      com.clarifai.grpc.api.Operator parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.Operator) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object typeId_ = "";
    /**
     * <pre>
     * Specify the operator type ID.
     * </pre>
     *
     * <code>string type_id = 1;</code>
     * @return The typeId.
     */
    public java.lang.String getTypeId() {
      java.lang.Object ref = typeId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        typeId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Specify the operator type ID.
     * </pre>
     *
     * <code>string type_id = 1;</code>
     * @return The bytes for typeId.
     */
    public com.google.protobuf.ByteString
        getTypeIdBytes() {
      java.lang.Object ref = typeId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        typeId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Specify the operator type ID.
     * </pre>
     *
     * <code>string type_id = 1;</code>
     * @param value The typeId to set.
     * @return This builder for chaining.
     */
    public Builder setTypeId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      typeId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specify the operator type ID.
     * </pre>
     *
     * <code>string type_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTypeId() {
      
      typeId_ = getDefaultInstance().getTypeId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specify the operator type ID.
     * </pre>
     *
     * <code>string type_id = 1;</code>
     * @param value The bytes for typeId to set.
     * @return This builder for chaining.
     */
    public Builder setTypeIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      typeId_ = value;
      onChanged();
      return this;
    }

    private com.clarifai.grpc.api.OutputInfo outputInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.OutputInfo, com.clarifai.grpc.api.OutputInfo.Builder, com.clarifai.grpc.api.OutputInfoOrBuilder> outputInfoBuilder_;
    /**
     * <pre>
     * Info about the operator's output and configuration.
     * </pre>
     *
     * <code>.clarifai.api.OutputInfo output_info = 2;</code>
     * @return Whether the outputInfo field is set.
     */
    public boolean hasOutputInfo() {
      return outputInfoBuilder_ != null || outputInfo_ != null;
    }
    /**
     * <pre>
     * Info about the operator's output and configuration.
     * </pre>
     *
     * <code>.clarifai.api.OutputInfo output_info = 2;</code>
     * @return The outputInfo.
     */
    public com.clarifai.grpc.api.OutputInfo getOutputInfo() {
      if (outputInfoBuilder_ == null) {
        return outputInfo_ == null ? com.clarifai.grpc.api.OutputInfo.getDefaultInstance() : outputInfo_;
      } else {
        return outputInfoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Info about the operator's output and configuration.
     * </pre>
     *
     * <code>.clarifai.api.OutputInfo output_info = 2;</code>
     */
    public Builder setOutputInfo(com.clarifai.grpc.api.OutputInfo value) {
      if (outputInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        outputInfo_ = value;
        onChanged();
      } else {
        outputInfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Info about the operator's output and configuration.
     * </pre>
     *
     * <code>.clarifai.api.OutputInfo output_info = 2;</code>
     */
    public Builder setOutputInfo(
        com.clarifai.grpc.api.OutputInfo.Builder builderForValue) {
      if (outputInfoBuilder_ == null) {
        outputInfo_ = builderForValue.build();
        onChanged();
      } else {
        outputInfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Info about the operator's output and configuration.
     * </pre>
     *
     * <code>.clarifai.api.OutputInfo output_info = 2;</code>
     */
    public Builder mergeOutputInfo(com.clarifai.grpc.api.OutputInfo value) {
      if (outputInfoBuilder_ == null) {
        if (outputInfo_ != null) {
          outputInfo_ =
            com.clarifai.grpc.api.OutputInfo.newBuilder(outputInfo_).mergeFrom(value).buildPartial();
        } else {
          outputInfo_ = value;
        }
        onChanged();
      } else {
        outputInfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Info about the operator's output and configuration.
     * </pre>
     *
     * <code>.clarifai.api.OutputInfo output_info = 2;</code>
     */
    public Builder clearOutputInfo() {
      if (outputInfoBuilder_ == null) {
        outputInfo_ = null;
        onChanged();
      } else {
        outputInfo_ = null;
        outputInfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Info about the operator's output and configuration.
     * </pre>
     *
     * <code>.clarifai.api.OutputInfo output_info = 2;</code>
     */
    public com.clarifai.grpc.api.OutputInfo.Builder getOutputInfoBuilder() {
      
      onChanged();
      return getOutputInfoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Info about the operator's output and configuration.
     * </pre>
     *
     * <code>.clarifai.api.OutputInfo output_info = 2;</code>
     */
    public com.clarifai.grpc.api.OutputInfoOrBuilder getOutputInfoOrBuilder() {
      if (outputInfoBuilder_ != null) {
        return outputInfoBuilder_.getMessageOrBuilder();
      } else {
        return outputInfo_ == null ?
            com.clarifai.grpc.api.OutputInfo.getDefaultInstance() : outputInfo_;
      }
    }
    /**
     * <pre>
     * Info about the operator's output and configuration.
     * </pre>
     *
     * <code>.clarifai.api.OutputInfo output_info = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.OutputInfo, com.clarifai.grpc.api.OutputInfo.Builder, com.clarifai.grpc.api.OutputInfoOrBuilder> 
        getOutputInfoFieldBuilder() {
      if (outputInfoBuilder_ == null) {
        outputInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.clarifai.grpc.api.OutputInfo, com.clarifai.grpc.api.OutputInfo.Builder, com.clarifai.grpc.api.OutputInfoOrBuilder>(
                getOutputInfo(),
                getParentForChildren(),
                isClean());
        outputInfo_ = null;
      }
      return outputInfoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.Operator)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.Operator)
  private static final com.clarifai.grpc.api.Operator DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.Operator();
  }

  public static com.clarifai.grpc.api.Operator getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Operator>
      PARSER = new com.google.protobuf.AbstractParser<Operator>() {
    @java.lang.Override
    public Operator parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Operator(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Operator> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Operator> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.Operator getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
