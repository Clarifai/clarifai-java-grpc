// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * <pre>
 * LabelCount
 * </pre>
 *
 * Protobuf type {@code clarifai.api.LabelCount}
 */
public final class LabelCount extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.LabelCount)
    LabelCountOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LabelCount.newBuilder() to construct.
  private LabelCount(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LabelCount() {
    conceptName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LabelCount();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LabelCount(
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

            conceptName_ = s;
            break;
          }
          case 16: {

            count_ = input.readUInt32();
            break;
          }
          case 26: {
            com.clarifai.grpc.api.Concept.Builder subBuilder = null;
            if (concept_ != null) {
              subBuilder = concept_.toBuilder();
            }
            concept_ = input.readMessage(com.clarifai.grpc.api.Concept.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(concept_);
              concept_ = subBuilder.buildPartial();
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
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_LabelCount_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_LabelCount_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.LabelCount.class, com.clarifai.grpc.api.LabelCount.Builder.class);
  }

  public static final int CONCEPT_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object conceptName_;
  /**
   * <code>string concept_name = 1 [deprecated = true];</code>
   * @deprecated clarifai.api.LabelCount.concept_name is deprecated.
   *     See proto/clarifai/api/resources.proto;l=1826
   * @return The conceptName.
   */
  @java.lang.Override
  @java.lang.Deprecated public java.lang.String getConceptName() {
    java.lang.Object ref = conceptName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      conceptName_ = s;
      return s;
    }
  }
  /**
   * <code>string concept_name = 1 [deprecated = true];</code>
   * @deprecated clarifai.api.LabelCount.concept_name is deprecated.
   *     See proto/clarifai/api/resources.proto;l=1826
   * @return The bytes for conceptName.
   */
  @java.lang.Override
  @java.lang.Deprecated public com.google.protobuf.ByteString
      getConceptNameBytes() {
    java.lang.Object ref = conceptName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      conceptName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COUNT_FIELD_NUMBER = 2;
  private int count_;
  /**
   * <code>uint32 count = 2;</code>
   * @return The count.
   */
  @java.lang.Override
  public int getCount() {
    return count_;
  }

  public static final int CONCEPT_FIELD_NUMBER = 3;
  private com.clarifai.grpc.api.Concept concept_;
  /**
   * <code>.clarifai.api.Concept concept = 3;</code>
   * @return Whether the concept field is set.
   */
  @java.lang.Override
  public boolean hasConcept() {
    return concept_ != null;
  }
  /**
   * <code>.clarifai.api.Concept concept = 3;</code>
   * @return The concept.
   */
  @java.lang.Override
  public com.clarifai.grpc.api.Concept getConcept() {
    return concept_ == null ? com.clarifai.grpc.api.Concept.getDefaultInstance() : concept_;
  }
  /**
   * <code>.clarifai.api.Concept concept = 3;</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.ConceptOrBuilder getConceptOrBuilder() {
    return getConcept();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(conceptName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, conceptName_);
    }
    if (count_ != 0) {
      output.writeUInt32(2, count_);
    }
    if (concept_ != null) {
      output.writeMessage(3, getConcept());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(conceptName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, conceptName_);
    }
    if (count_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, count_);
    }
    if (concept_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getConcept());
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
    if (!(obj instanceof com.clarifai.grpc.api.LabelCount)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.LabelCount other = (com.clarifai.grpc.api.LabelCount) obj;

    if (!getConceptName()
        .equals(other.getConceptName())) return false;
    if (getCount()
        != other.getCount()) return false;
    if (hasConcept() != other.hasConcept()) return false;
    if (hasConcept()) {
      if (!getConcept()
          .equals(other.getConcept())) return false;
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
    hash = (37 * hash) + CONCEPT_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getConceptName().hashCode();
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getCount();
    if (hasConcept()) {
      hash = (37 * hash) + CONCEPT_FIELD_NUMBER;
      hash = (53 * hash) + getConcept().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.LabelCount parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.LabelCount parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.LabelCount parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.LabelCount parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.LabelCount parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.LabelCount parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.LabelCount parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.LabelCount parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.LabelCount parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.LabelCount parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.LabelCount parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.LabelCount parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.LabelCount prototype) {
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
   * LabelCount
   * </pre>
   *
   * Protobuf type {@code clarifai.api.LabelCount}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.LabelCount)
      com.clarifai.grpc.api.LabelCountOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_LabelCount_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_LabelCount_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.LabelCount.class, com.clarifai.grpc.api.LabelCount.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.LabelCount.newBuilder()
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
      conceptName_ = "";

      count_ = 0;

      if (conceptBuilder_ == null) {
        concept_ = null;
      } else {
        concept_ = null;
        conceptBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_LabelCount_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.LabelCount getDefaultInstanceForType() {
      return com.clarifai.grpc.api.LabelCount.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.LabelCount build() {
      com.clarifai.grpc.api.LabelCount result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.LabelCount buildPartial() {
      com.clarifai.grpc.api.LabelCount result = new com.clarifai.grpc.api.LabelCount(this);
      result.conceptName_ = conceptName_;
      result.count_ = count_;
      if (conceptBuilder_ == null) {
        result.concept_ = concept_;
      } else {
        result.concept_ = conceptBuilder_.build();
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
      if (other instanceof com.clarifai.grpc.api.LabelCount) {
        return mergeFrom((com.clarifai.grpc.api.LabelCount)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.LabelCount other) {
      if (other == com.clarifai.grpc.api.LabelCount.getDefaultInstance()) return this;
      if (!other.getConceptName().isEmpty()) {
        conceptName_ = other.conceptName_;
        onChanged();
      }
      if (other.getCount() != 0) {
        setCount(other.getCount());
      }
      if (other.hasConcept()) {
        mergeConcept(other.getConcept());
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
      com.clarifai.grpc.api.LabelCount parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.LabelCount) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object conceptName_ = "";
    /**
     * <code>string concept_name = 1 [deprecated = true];</code>
     * @deprecated clarifai.api.LabelCount.concept_name is deprecated.
     *     See proto/clarifai/api/resources.proto;l=1826
     * @return The conceptName.
     */
    @java.lang.Deprecated public java.lang.String getConceptName() {
      java.lang.Object ref = conceptName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        conceptName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string concept_name = 1 [deprecated = true];</code>
     * @deprecated clarifai.api.LabelCount.concept_name is deprecated.
     *     See proto/clarifai/api/resources.proto;l=1826
     * @return The bytes for conceptName.
     */
    @java.lang.Deprecated public com.google.protobuf.ByteString
        getConceptNameBytes() {
      java.lang.Object ref = conceptName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        conceptName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string concept_name = 1 [deprecated = true];</code>
     * @deprecated clarifai.api.LabelCount.concept_name is deprecated.
     *     See proto/clarifai/api/resources.proto;l=1826
     * @param value The conceptName to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setConceptName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      conceptName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string concept_name = 1 [deprecated = true];</code>
     * @deprecated clarifai.api.LabelCount.concept_name is deprecated.
     *     See proto/clarifai/api/resources.proto;l=1826
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearConceptName() {
      
      conceptName_ = getDefaultInstance().getConceptName();
      onChanged();
      return this;
    }
    /**
     * <code>string concept_name = 1 [deprecated = true];</code>
     * @deprecated clarifai.api.LabelCount.concept_name is deprecated.
     *     See proto/clarifai/api/resources.proto;l=1826
     * @param value The bytes for conceptName to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setConceptNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      conceptName_ = value;
      onChanged();
      return this;
    }

    private int count_ ;
    /**
     * <code>uint32 count = 2;</code>
     * @return The count.
     */
    @java.lang.Override
    public int getCount() {
      return count_;
    }
    /**
     * <code>uint32 count = 2;</code>
     * @param value The count to set.
     * @return This builder for chaining.
     */
    public Builder setCount(int value) {
      
      count_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 count = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCount() {
      
      count_ = 0;
      onChanged();
      return this;
    }

    private com.clarifai.grpc.api.Concept concept_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.Concept, com.clarifai.grpc.api.Concept.Builder, com.clarifai.grpc.api.ConceptOrBuilder> conceptBuilder_;
    /**
     * <code>.clarifai.api.Concept concept = 3;</code>
     * @return Whether the concept field is set.
     */
    public boolean hasConcept() {
      return conceptBuilder_ != null || concept_ != null;
    }
    /**
     * <code>.clarifai.api.Concept concept = 3;</code>
     * @return The concept.
     */
    public com.clarifai.grpc.api.Concept getConcept() {
      if (conceptBuilder_ == null) {
        return concept_ == null ? com.clarifai.grpc.api.Concept.getDefaultInstance() : concept_;
      } else {
        return conceptBuilder_.getMessage();
      }
    }
    /**
     * <code>.clarifai.api.Concept concept = 3;</code>
     */
    public Builder setConcept(com.clarifai.grpc.api.Concept value) {
      if (conceptBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        concept_ = value;
        onChanged();
      } else {
        conceptBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.clarifai.api.Concept concept = 3;</code>
     */
    public Builder setConcept(
        com.clarifai.grpc.api.Concept.Builder builderForValue) {
      if (conceptBuilder_ == null) {
        concept_ = builderForValue.build();
        onChanged();
      } else {
        conceptBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.clarifai.api.Concept concept = 3;</code>
     */
    public Builder mergeConcept(com.clarifai.grpc.api.Concept value) {
      if (conceptBuilder_ == null) {
        if (concept_ != null) {
          concept_ =
            com.clarifai.grpc.api.Concept.newBuilder(concept_).mergeFrom(value).buildPartial();
        } else {
          concept_ = value;
        }
        onChanged();
      } else {
        conceptBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.clarifai.api.Concept concept = 3;</code>
     */
    public Builder clearConcept() {
      if (conceptBuilder_ == null) {
        concept_ = null;
        onChanged();
      } else {
        concept_ = null;
        conceptBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.clarifai.api.Concept concept = 3;</code>
     */
    public com.clarifai.grpc.api.Concept.Builder getConceptBuilder() {
      
      onChanged();
      return getConceptFieldBuilder().getBuilder();
    }
    /**
     * <code>.clarifai.api.Concept concept = 3;</code>
     */
    public com.clarifai.grpc.api.ConceptOrBuilder getConceptOrBuilder() {
      if (conceptBuilder_ != null) {
        return conceptBuilder_.getMessageOrBuilder();
      } else {
        return concept_ == null ?
            com.clarifai.grpc.api.Concept.getDefaultInstance() : concept_;
      }
    }
    /**
     * <code>.clarifai.api.Concept concept = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.Concept, com.clarifai.grpc.api.Concept.Builder, com.clarifai.grpc.api.ConceptOrBuilder> 
        getConceptFieldBuilder() {
      if (conceptBuilder_ == null) {
        conceptBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.clarifai.grpc.api.Concept, com.clarifai.grpc.api.Concept.Builder, com.clarifai.grpc.api.ConceptOrBuilder>(
                getConcept(),
                getParentForChildren(),
                isClean());
        concept_ = null;
      }
      return conceptBuilder_;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.LabelCount)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.LabelCount)
  private static final com.clarifai.grpc.api.LabelCount DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.LabelCount();
  }

  public static com.clarifai.grpc.api.LabelCount getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LabelCount>
      PARSER = new com.google.protobuf.AbstractParser<LabelCount>() {
    @java.lang.Override
    public LabelCount parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LabelCount(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LabelCount> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LabelCount> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.LabelCount getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

