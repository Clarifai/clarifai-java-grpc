// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * Protobuf type {@code clarifai.api.CooccurrenceMatrix}
 */
public  final class CooccurrenceMatrix extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.CooccurrenceMatrix)
    CooccurrenceMatrixOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CooccurrenceMatrix.newBuilder() to construct.
  private CooccurrenceMatrix(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CooccurrenceMatrix() {
    matrix_ = java.util.Collections.emptyList();
    conceptIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CooccurrenceMatrix();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CooccurrenceMatrix(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              matrix_ = new java.util.ArrayList<com.clarifai.grpc.api.CooccurrenceMatrixEntry>();
              mutable_bitField0_ |= 0x00000001;
            }
            matrix_.add(
                input.readMessage(com.clarifai.grpc.api.CooccurrenceMatrixEntry.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              conceptIds_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            conceptIds_.add(s);
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
        matrix_ = java.util.Collections.unmodifiableList(matrix_);
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        conceptIds_ = conceptIds_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_CooccurrenceMatrix_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_CooccurrenceMatrix_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.CooccurrenceMatrix.class, com.clarifai.grpc.api.CooccurrenceMatrix.Builder.class);
  }

  public static final int MATRIX_FIELD_NUMBER = 1;
  private java.util.List<com.clarifai.grpc.api.CooccurrenceMatrixEntry> matrix_;
  /**
   * <code>repeated .clarifai.api.CooccurrenceMatrixEntry matrix = 1;</code>
   */
  public java.util.List<com.clarifai.grpc.api.CooccurrenceMatrixEntry> getMatrixList() {
    return matrix_;
  }
  /**
   * <code>repeated .clarifai.api.CooccurrenceMatrixEntry matrix = 1;</code>
   */
  public java.util.List<? extends com.clarifai.grpc.api.CooccurrenceMatrixEntryOrBuilder> 
      getMatrixOrBuilderList() {
    return matrix_;
  }
  /**
   * <code>repeated .clarifai.api.CooccurrenceMatrixEntry matrix = 1;</code>
   */
  public int getMatrixCount() {
    return matrix_.size();
  }
  /**
   * <code>repeated .clarifai.api.CooccurrenceMatrixEntry matrix = 1;</code>
   */
  public com.clarifai.grpc.api.CooccurrenceMatrixEntry getMatrix(int index) {
    return matrix_.get(index);
  }
  /**
   * <code>repeated .clarifai.api.CooccurrenceMatrixEntry matrix = 1;</code>
   */
  public com.clarifai.grpc.api.CooccurrenceMatrixEntryOrBuilder getMatrixOrBuilder(
      int index) {
    return matrix_.get(index);
  }

  public static final int CONCEPT_IDS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList conceptIds_;
  /**
   * <pre>
   * These concept_ids are ordered by the strength of the diagonal in the ConfusionMatrix.
   * </pre>
   *
   * <code>repeated string concept_ids = 2;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getConceptIdsList() {
    return conceptIds_;
  }
  /**
   * <pre>
   * These concept_ids are ordered by the strength of the diagonal in the ConfusionMatrix.
   * </pre>
   *
   * <code>repeated string concept_ids = 2;</code>
   */
  public int getConceptIdsCount() {
    return conceptIds_.size();
  }
  /**
   * <pre>
   * These concept_ids are ordered by the strength of the diagonal in the ConfusionMatrix.
   * </pre>
   *
   * <code>repeated string concept_ids = 2;</code>
   */
  public java.lang.String getConceptIds(int index) {
    return conceptIds_.get(index);
  }
  /**
   * <pre>
   * These concept_ids are ordered by the strength of the diagonal in the ConfusionMatrix.
   * </pre>
   *
   * <code>repeated string concept_ids = 2;</code>
   */
  public com.google.protobuf.ByteString
      getConceptIdsBytes(int index) {
    return conceptIds_.getByteString(index);
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
    for (int i = 0; i < matrix_.size(); i++) {
      output.writeMessage(1, matrix_.get(i));
    }
    for (int i = 0; i < conceptIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, conceptIds_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < matrix_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, matrix_.get(i));
    }
    {
      int dataSize = 0;
      for (int i = 0; i < conceptIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(conceptIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getConceptIdsList().size();
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
    if (!(obj instanceof com.clarifai.grpc.api.CooccurrenceMatrix)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.CooccurrenceMatrix other = (com.clarifai.grpc.api.CooccurrenceMatrix) obj;

    if (!getMatrixList()
        .equals(other.getMatrixList())) return false;
    if (!getConceptIdsList()
        .equals(other.getConceptIdsList())) return false;
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
    if (getMatrixCount() > 0) {
      hash = (37 * hash) + MATRIX_FIELD_NUMBER;
      hash = (53 * hash) + getMatrixList().hashCode();
    }
    if (getConceptIdsCount() > 0) {
      hash = (37 * hash) + CONCEPT_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getConceptIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.CooccurrenceMatrix parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.CooccurrenceMatrix parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.CooccurrenceMatrix parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.CooccurrenceMatrix parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.CooccurrenceMatrix parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.CooccurrenceMatrix parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.CooccurrenceMatrix parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.CooccurrenceMatrix parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.CooccurrenceMatrix parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.CooccurrenceMatrix parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.CooccurrenceMatrix parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.CooccurrenceMatrix parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.CooccurrenceMatrix prototype) {
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
   * Protobuf type {@code clarifai.api.CooccurrenceMatrix}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.CooccurrenceMatrix)
      com.clarifai.grpc.api.CooccurrenceMatrixOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_CooccurrenceMatrix_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_CooccurrenceMatrix_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.CooccurrenceMatrix.class, com.clarifai.grpc.api.CooccurrenceMatrix.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.CooccurrenceMatrix.newBuilder()
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
        getMatrixFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (matrixBuilder_ == null) {
        matrix_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        matrixBuilder_.clear();
      }
      conceptIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_CooccurrenceMatrix_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.CooccurrenceMatrix getDefaultInstanceForType() {
      return com.clarifai.grpc.api.CooccurrenceMatrix.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.CooccurrenceMatrix build() {
      com.clarifai.grpc.api.CooccurrenceMatrix result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.CooccurrenceMatrix buildPartial() {
      com.clarifai.grpc.api.CooccurrenceMatrix result = new com.clarifai.grpc.api.CooccurrenceMatrix(this);
      int from_bitField0_ = bitField0_;
      if (matrixBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          matrix_ = java.util.Collections.unmodifiableList(matrix_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.matrix_ = matrix_;
      } else {
        result.matrix_ = matrixBuilder_.build();
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        conceptIds_ = conceptIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.conceptIds_ = conceptIds_;
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
      if (other instanceof com.clarifai.grpc.api.CooccurrenceMatrix) {
        return mergeFrom((com.clarifai.grpc.api.CooccurrenceMatrix)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.CooccurrenceMatrix other) {
      if (other == com.clarifai.grpc.api.CooccurrenceMatrix.getDefaultInstance()) return this;
      if (matrixBuilder_ == null) {
        if (!other.matrix_.isEmpty()) {
          if (matrix_.isEmpty()) {
            matrix_ = other.matrix_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMatrixIsMutable();
            matrix_.addAll(other.matrix_);
          }
          onChanged();
        }
      } else {
        if (!other.matrix_.isEmpty()) {
          if (matrixBuilder_.isEmpty()) {
            matrixBuilder_.dispose();
            matrixBuilder_ = null;
            matrix_ = other.matrix_;
            bitField0_ = (bitField0_ & ~0x00000001);
            matrixBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMatrixFieldBuilder() : null;
          } else {
            matrixBuilder_.addAllMessages(other.matrix_);
          }
        }
      }
      if (!other.conceptIds_.isEmpty()) {
        if (conceptIds_.isEmpty()) {
          conceptIds_ = other.conceptIds_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureConceptIdsIsMutable();
          conceptIds_.addAll(other.conceptIds_);
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
      com.clarifai.grpc.api.CooccurrenceMatrix parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.CooccurrenceMatrix) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.clarifai.grpc.api.CooccurrenceMatrixEntry> matrix_ =
      java.util.Collections.emptyList();
    private void ensureMatrixIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        matrix_ = new java.util.ArrayList<com.clarifai.grpc.api.CooccurrenceMatrixEntry>(matrix_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.CooccurrenceMatrixEntry, com.clarifai.grpc.api.CooccurrenceMatrixEntry.Builder, com.clarifai.grpc.api.CooccurrenceMatrixEntryOrBuilder> matrixBuilder_;

    /**
     * <code>repeated .clarifai.api.CooccurrenceMatrixEntry matrix = 1;</code>
     */
    public java.util.List<com.clarifai.grpc.api.CooccurrenceMatrixEntry> getMatrixList() {
      if (matrixBuilder_ == null) {
        return java.util.Collections.unmodifiableList(matrix_);
      } else {
        return matrixBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .clarifai.api.CooccurrenceMatrixEntry matrix = 1;</code>
     */
    public int getMatrixCount() {
      if (matrixBuilder_ == null) {
        return matrix_.size();
      } else {
        return matrixBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .clarifai.api.CooccurrenceMatrixEntry matrix = 1;</code>
     */
    public com.clarifai.grpc.api.CooccurrenceMatrixEntry getMatrix(int index) {
      if (matrixBuilder_ == null) {
        return matrix_.get(index);
      } else {
        return matrixBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .clarifai.api.CooccurrenceMatrixEntry matrix = 1;</code>
     */
    public Builder setMatrix(
        int index, com.clarifai.grpc.api.CooccurrenceMatrixEntry value) {
      if (matrixBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMatrixIsMutable();
        matrix_.set(index, value);
        onChanged();
      } else {
        matrixBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.CooccurrenceMatrixEntry matrix = 1;</code>
     */
    public Builder setMatrix(
        int index, com.clarifai.grpc.api.CooccurrenceMatrixEntry.Builder builderForValue) {
      if (matrixBuilder_ == null) {
        ensureMatrixIsMutable();
        matrix_.set(index, builderForValue.build());
        onChanged();
      } else {
        matrixBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.CooccurrenceMatrixEntry matrix = 1;</code>
     */
    public Builder addMatrix(com.clarifai.grpc.api.CooccurrenceMatrixEntry value) {
      if (matrixBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMatrixIsMutable();
        matrix_.add(value);
        onChanged();
      } else {
        matrixBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.CooccurrenceMatrixEntry matrix = 1;</code>
     */
    public Builder addMatrix(
        int index, com.clarifai.grpc.api.CooccurrenceMatrixEntry value) {
      if (matrixBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMatrixIsMutable();
        matrix_.add(index, value);
        onChanged();
      } else {
        matrixBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.CooccurrenceMatrixEntry matrix = 1;</code>
     */
    public Builder addMatrix(
        com.clarifai.grpc.api.CooccurrenceMatrixEntry.Builder builderForValue) {
      if (matrixBuilder_ == null) {
        ensureMatrixIsMutable();
        matrix_.add(builderForValue.build());
        onChanged();
      } else {
        matrixBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.CooccurrenceMatrixEntry matrix = 1;</code>
     */
    public Builder addMatrix(
        int index, com.clarifai.grpc.api.CooccurrenceMatrixEntry.Builder builderForValue) {
      if (matrixBuilder_ == null) {
        ensureMatrixIsMutable();
        matrix_.add(index, builderForValue.build());
        onChanged();
      } else {
        matrixBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.CooccurrenceMatrixEntry matrix = 1;</code>
     */
    public Builder addAllMatrix(
        java.lang.Iterable<? extends com.clarifai.grpc.api.CooccurrenceMatrixEntry> values) {
      if (matrixBuilder_ == null) {
        ensureMatrixIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, matrix_);
        onChanged();
      } else {
        matrixBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.CooccurrenceMatrixEntry matrix = 1;</code>
     */
    public Builder clearMatrix() {
      if (matrixBuilder_ == null) {
        matrix_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        matrixBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.CooccurrenceMatrixEntry matrix = 1;</code>
     */
    public Builder removeMatrix(int index) {
      if (matrixBuilder_ == null) {
        ensureMatrixIsMutable();
        matrix_.remove(index);
        onChanged();
      } else {
        matrixBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.CooccurrenceMatrixEntry matrix = 1;</code>
     */
    public com.clarifai.grpc.api.CooccurrenceMatrixEntry.Builder getMatrixBuilder(
        int index) {
      return getMatrixFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .clarifai.api.CooccurrenceMatrixEntry matrix = 1;</code>
     */
    public com.clarifai.grpc.api.CooccurrenceMatrixEntryOrBuilder getMatrixOrBuilder(
        int index) {
      if (matrixBuilder_ == null) {
        return matrix_.get(index);  } else {
        return matrixBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .clarifai.api.CooccurrenceMatrixEntry matrix = 1;</code>
     */
    public java.util.List<? extends com.clarifai.grpc.api.CooccurrenceMatrixEntryOrBuilder> 
         getMatrixOrBuilderList() {
      if (matrixBuilder_ != null) {
        return matrixBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(matrix_);
      }
    }
    /**
     * <code>repeated .clarifai.api.CooccurrenceMatrixEntry matrix = 1;</code>
     */
    public com.clarifai.grpc.api.CooccurrenceMatrixEntry.Builder addMatrixBuilder() {
      return getMatrixFieldBuilder().addBuilder(
          com.clarifai.grpc.api.CooccurrenceMatrixEntry.getDefaultInstance());
    }
    /**
     * <code>repeated .clarifai.api.CooccurrenceMatrixEntry matrix = 1;</code>
     */
    public com.clarifai.grpc.api.CooccurrenceMatrixEntry.Builder addMatrixBuilder(
        int index) {
      return getMatrixFieldBuilder().addBuilder(
          index, com.clarifai.grpc.api.CooccurrenceMatrixEntry.getDefaultInstance());
    }
    /**
     * <code>repeated .clarifai.api.CooccurrenceMatrixEntry matrix = 1;</code>
     */
    public java.util.List<com.clarifai.grpc.api.CooccurrenceMatrixEntry.Builder> 
         getMatrixBuilderList() {
      return getMatrixFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.CooccurrenceMatrixEntry, com.clarifai.grpc.api.CooccurrenceMatrixEntry.Builder, com.clarifai.grpc.api.CooccurrenceMatrixEntryOrBuilder> 
        getMatrixFieldBuilder() {
      if (matrixBuilder_ == null) {
        matrixBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.clarifai.grpc.api.CooccurrenceMatrixEntry, com.clarifai.grpc.api.CooccurrenceMatrixEntry.Builder, com.clarifai.grpc.api.CooccurrenceMatrixEntryOrBuilder>(
                matrix_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        matrix_ = null;
      }
      return matrixBuilder_;
    }

    private com.google.protobuf.LazyStringList conceptIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureConceptIdsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        conceptIds_ = new com.google.protobuf.LazyStringArrayList(conceptIds_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     * These concept_ids are ordered by the strength of the diagonal in the ConfusionMatrix.
     * </pre>
     *
     * <code>repeated string concept_ids = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getConceptIdsList() {
      return conceptIds_.getUnmodifiableView();
    }
    /**
     * <pre>
     * These concept_ids are ordered by the strength of the diagonal in the ConfusionMatrix.
     * </pre>
     *
     * <code>repeated string concept_ids = 2;</code>
     */
    public int getConceptIdsCount() {
      return conceptIds_.size();
    }
    /**
     * <pre>
     * These concept_ids are ordered by the strength of the diagonal in the ConfusionMatrix.
     * </pre>
     *
     * <code>repeated string concept_ids = 2;</code>
     */
    public java.lang.String getConceptIds(int index) {
      return conceptIds_.get(index);
    }
    /**
     * <pre>
     * These concept_ids are ordered by the strength of the diagonal in the ConfusionMatrix.
     * </pre>
     *
     * <code>repeated string concept_ids = 2;</code>
     */
    public com.google.protobuf.ByteString
        getConceptIdsBytes(int index) {
      return conceptIds_.getByteString(index);
    }
    /**
     * <pre>
     * These concept_ids are ordered by the strength of the diagonal in the ConfusionMatrix.
     * </pre>
     *
     * <code>repeated string concept_ids = 2;</code>
     */
    public Builder setConceptIds(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureConceptIdsIsMutable();
      conceptIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * These concept_ids are ordered by the strength of the diagonal in the ConfusionMatrix.
     * </pre>
     *
     * <code>repeated string concept_ids = 2;</code>
     */
    public Builder addConceptIds(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureConceptIdsIsMutable();
      conceptIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * These concept_ids are ordered by the strength of the diagonal in the ConfusionMatrix.
     * </pre>
     *
     * <code>repeated string concept_ids = 2;</code>
     */
    public Builder addAllConceptIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureConceptIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, conceptIds_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * These concept_ids are ordered by the strength of the diagonal in the ConfusionMatrix.
     * </pre>
     *
     * <code>repeated string concept_ids = 2;</code>
     */
    public Builder clearConceptIds() {
      conceptIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * These concept_ids are ordered by the strength of the diagonal in the ConfusionMatrix.
     * </pre>
     *
     * <code>repeated string concept_ids = 2;</code>
     */
    public Builder addConceptIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureConceptIdsIsMutable();
      conceptIds_.add(value);
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.CooccurrenceMatrix)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.CooccurrenceMatrix)
  private static final com.clarifai.grpc.api.CooccurrenceMatrix DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.CooccurrenceMatrix();
  }

  public static com.clarifai.grpc.api.CooccurrenceMatrix getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CooccurrenceMatrix>
      PARSER = new com.google.protobuf.AbstractParser<CooccurrenceMatrix>() {
    @java.lang.Override
    public CooccurrenceMatrix parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CooccurrenceMatrix(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CooccurrenceMatrix> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CooccurrenceMatrix> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.CooccurrenceMatrix getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

