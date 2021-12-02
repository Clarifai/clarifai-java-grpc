// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * <pre>
 * ConceptTypeCount
 * </pre>
 *
 * Protobuf type {@code clarifai.api.ConceptTypeCount}
 */
public  final class ConceptTypeCount extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.ConceptTypeCount)
    ConceptTypeCountOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConceptTypeCount.newBuilder() to construct.
  private ConceptTypeCount(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConceptTypeCount() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConceptTypeCount();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ConceptTypeCount(
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

            positive_ = input.readUInt32();
            break;
          }
          case 16: {

            negative_ = input.readUInt32();
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
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_ConceptTypeCount_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_ConceptTypeCount_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.ConceptTypeCount.class, com.clarifai.grpc.api.ConceptTypeCount.Builder.class);
  }

  public static final int POSITIVE_FIELD_NUMBER = 1;
  private int positive_;
  /**
   * <pre>
   * The number of inputs that have a concept with a value of 1.0 (indicating presence of the
   * concept in an input).
   * </pre>
   *
   * <code>uint32 positive = 1 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The positive.
   */
  public int getPositive() {
    return positive_;
  }

  public static final int NEGATIVE_FIELD_NUMBER = 2;
  private int negative_;
  /**
   * <pre>
   * The number of inputs that have a concept with a value of 0.0 (indicating absence of the
   * concept in an input).
   * </pre>
   *
   * <code>uint32 negative = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The negative.
   */
  public int getNegative() {
    return negative_;
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
    if (positive_ != 0) {
      output.writeUInt32(1, positive_);
    }
    if (negative_ != 0) {
      output.writeUInt32(2, negative_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (positive_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, positive_);
    }
    if (negative_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, negative_);
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
    if (!(obj instanceof com.clarifai.grpc.api.ConceptTypeCount)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.ConceptTypeCount other = (com.clarifai.grpc.api.ConceptTypeCount) obj;

    if (getPositive()
        != other.getPositive()) return false;
    if (getNegative()
        != other.getNegative()) return false;
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
    hash = (37 * hash) + POSITIVE_FIELD_NUMBER;
    hash = (53 * hash) + getPositive();
    hash = (37 * hash) + NEGATIVE_FIELD_NUMBER;
    hash = (53 * hash) + getNegative();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.ConceptTypeCount parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.ConceptTypeCount parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.ConceptTypeCount parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.ConceptTypeCount parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.ConceptTypeCount parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.ConceptTypeCount parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.ConceptTypeCount parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.ConceptTypeCount parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.ConceptTypeCount parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.ConceptTypeCount parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.ConceptTypeCount parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.ConceptTypeCount parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.ConceptTypeCount prototype) {
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
   * ConceptTypeCount
   * </pre>
   *
   * Protobuf type {@code clarifai.api.ConceptTypeCount}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.ConceptTypeCount)
      com.clarifai.grpc.api.ConceptTypeCountOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_ConceptTypeCount_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_ConceptTypeCount_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.ConceptTypeCount.class, com.clarifai.grpc.api.ConceptTypeCount.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.ConceptTypeCount.newBuilder()
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
      positive_ = 0;

      negative_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_ConceptTypeCount_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.ConceptTypeCount getDefaultInstanceForType() {
      return com.clarifai.grpc.api.ConceptTypeCount.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.ConceptTypeCount build() {
      com.clarifai.grpc.api.ConceptTypeCount result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.ConceptTypeCount buildPartial() {
      com.clarifai.grpc.api.ConceptTypeCount result = new com.clarifai.grpc.api.ConceptTypeCount(this);
      result.positive_ = positive_;
      result.negative_ = negative_;
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
      if (other instanceof com.clarifai.grpc.api.ConceptTypeCount) {
        return mergeFrom((com.clarifai.grpc.api.ConceptTypeCount)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.ConceptTypeCount other) {
      if (other == com.clarifai.grpc.api.ConceptTypeCount.getDefaultInstance()) return this;
      if (other.getPositive() != 0) {
        setPositive(other.getPositive());
      }
      if (other.getNegative() != 0) {
        setNegative(other.getNegative());
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
      com.clarifai.grpc.api.ConceptTypeCount parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.ConceptTypeCount) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int positive_ ;
    /**
     * <pre>
     * The number of inputs that have a concept with a value of 1.0 (indicating presence of the
     * concept in an input).
     * </pre>
     *
     * <code>uint32 positive = 1 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @return The positive.
     */
    public int getPositive() {
      return positive_;
    }
    /**
     * <pre>
     * The number of inputs that have a concept with a value of 1.0 (indicating presence of the
     * concept in an input).
     * </pre>
     *
     * <code>uint32 positive = 1 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @param value The positive to set.
     * @return This builder for chaining.
     */
    public Builder setPositive(int value) {
      
      positive_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of inputs that have a concept with a value of 1.0 (indicating presence of the
     * concept in an input).
     * </pre>
     *
     * <code>uint32 positive = 1 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @return This builder for chaining.
     */
    public Builder clearPositive() {
      
      positive_ = 0;
      onChanged();
      return this;
    }

    private int negative_ ;
    /**
     * <pre>
     * The number of inputs that have a concept with a value of 0.0 (indicating absence of the
     * concept in an input).
     * </pre>
     *
     * <code>uint32 negative = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @return The negative.
     */
    public int getNegative() {
      return negative_;
    }
    /**
     * <pre>
     * The number of inputs that have a concept with a value of 0.0 (indicating absence of the
     * concept in an input).
     * </pre>
     *
     * <code>uint32 negative = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @param value The negative to set.
     * @return This builder for chaining.
     */
    public Builder setNegative(int value) {
      
      negative_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of inputs that have a concept with a value of 0.0 (indicating absence of the
     * concept in an input).
     * </pre>
     *
     * <code>uint32 negative = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @return This builder for chaining.
     */
    public Builder clearNegative() {
      
      negative_ = 0;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.ConceptTypeCount)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.ConceptTypeCount)
  private static final com.clarifai.grpc.api.ConceptTypeCount DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.ConceptTypeCount();
  }

  public static com.clarifai.grpc.api.ConceptTypeCount getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConceptTypeCount>
      PARSER = new com.google.protobuf.AbstractParser<ConceptTypeCount>() {
    @java.lang.Override
    public ConceptTypeCount parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ConceptTypeCount(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ConceptTypeCount> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConceptTypeCount> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.ConceptTypeCount getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

