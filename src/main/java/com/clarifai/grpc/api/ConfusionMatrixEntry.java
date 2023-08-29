// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * <pre>
 * ConfusionMatrixEntry
 * </pre>
 *
 * Protobuf type {@code clarifai.api.ConfusionMatrixEntry}
 */
public final class ConfusionMatrixEntry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.ConfusionMatrixEntry)
    ConfusionMatrixEntryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConfusionMatrixEntry.newBuilder() to construct.
  private ConfusionMatrixEntry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConfusionMatrixEntry() {
    predicted_ = "";
    actual_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConfusionMatrixEntry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ConfusionMatrixEntry(
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

            predicted_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            actual_ = s;
            break;
          }
          case 37: {

            value_ = input.readFloat();
            break;
          }
          case 42: {
            com.clarifai.grpc.api.Concept.Builder subBuilder = null;
            if (predictedConcept_ != null) {
              subBuilder = predictedConcept_.toBuilder();
            }
            predictedConcept_ = input.readMessage(com.clarifai.grpc.api.Concept.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(predictedConcept_);
              predictedConcept_ = subBuilder.buildPartial();
            }

            break;
          }
          case 50: {
            com.clarifai.grpc.api.Concept.Builder subBuilder = null;
            if (actualConcept_ != null) {
              subBuilder = actualConcept_.toBuilder();
            }
            actualConcept_ = input.readMessage(com.clarifai.grpc.api.Concept.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(actualConcept_);
              actualConcept_ = subBuilder.buildPartial();
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
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_ConfusionMatrixEntry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_ConfusionMatrixEntry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.ConfusionMatrixEntry.class, com.clarifai.grpc.api.ConfusionMatrixEntry.Builder.class);
  }

  public static final int PREDICTED_FIELD_NUMBER = 1;
  private volatile java.lang.Object predicted_;
  /**
   * <code>string predicted = 1;</code>
   * @return The predicted.
   */
  @java.lang.Override
  public java.lang.String getPredicted() {
    java.lang.Object ref = predicted_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      predicted_ = s;
      return s;
    }
  }
  /**
   * <code>string predicted = 1;</code>
   * @return The bytes for predicted.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPredictedBytes() {
    java.lang.Object ref = predicted_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      predicted_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACTUAL_FIELD_NUMBER = 2;
  private volatile java.lang.Object actual_;
  /**
   * <code>string actual = 2;</code>
   * @return The actual.
   */
  @java.lang.Override
  public java.lang.String getActual() {
    java.lang.Object ref = actual_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      actual_ = s;
      return s;
    }
  }
  /**
   * <code>string actual = 2;</code>
   * @return The bytes for actual.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getActualBytes() {
    java.lang.Object ref = actual_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      actual_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUE_FIELD_NUMBER = 4;
  private float value_;
  /**
   * <code>float value = 4 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The value.
   */
  @java.lang.Override
  public float getValue() {
    return value_;
  }

  public static final int PREDICTED_CONCEPT_FIELD_NUMBER = 5;
  private com.clarifai.grpc.api.Concept predictedConcept_;
  /**
   * <code>.clarifai.api.Concept predicted_concept = 5;</code>
   * @return Whether the predictedConcept field is set.
   */
  @java.lang.Override
  public boolean hasPredictedConcept() {
    return predictedConcept_ != null;
  }
  /**
   * <code>.clarifai.api.Concept predicted_concept = 5;</code>
   * @return The predictedConcept.
   */
  @java.lang.Override
  public com.clarifai.grpc.api.Concept getPredictedConcept() {
    return predictedConcept_ == null ? com.clarifai.grpc.api.Concept.getDefaultInstance() : predictedConcept_;
  }
  /**
   * <code>.clarifai.api.Concept predicted_concept = 5;</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.ConceptOrBuilder getPredictedConceptOrBuilder() {
    return getPredictedConcept();
  }

  public static final int ACTUAL_CONCEPT_FIELD_NUMBER = 6;
  private com.clarifai.grpc.api.Concept actualConcept_;
  /**
   * <code>.clarifai.api.Concept actual_concept = 6;</code>
   * @return Whether the actualConcept field is set.
   */
  @java.lang.Override
  public boolean hasActualConcept() {
    return actualConcept_ != null;
  }
  /**
   * <code>.clarifai.api.Concept actual_concept = 6;</code>
   * @return The actualConcept.
   */
  @java.lang.Override
  public com.clarifai.grpc.api.Concept getActualConcept() {
    return actualConcept_ == null ? com.clarifai.grpc.api.Concept.getDefaultInstance() : actualConcept_;
  }
  /**
   * <code>.clarifai.api.Concept actual_concept = 6;</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.ConceptOrBuilder getActualConceptOrBuilder() {
    return getActualConcept();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(predicted_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, predicted_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(actual_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, actual_);
    }
    if (java.lang.Float.floatToRawIntBits(value_) != 0) {
      output.writeFloat(4, value_);
    }
    if (predictedConcept_ != null) {
      output.writeMessage(5, getPredictedConcept());
    }
    if (actualConcept_ != null) {
      output.writeMessage(6, getActualConcept());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(predicted_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, predicted_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(actual_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, actual_);
    }
    if (java.lang.Float.floatToRawIntBits(value_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, value_);
    }
    if (predictedConcept_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getPredictedConcept());
    }
    if (actualConcept_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, getActualConcept());
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
    if (!(obj instanceof com.clarifai.grpc.api.ConfusionMatrixEntry)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.ConfusionMatrixEntry other = (com.clarifai.grpc.api.ConfusionMatrixEntry) obj;

    if (!getPredicted()
        .equals(other.getPredicted())) return false;
    if (!getActual()
        .equals(other.getActual())) return false;
    if (java.lang.Float.floatToIntBits(getValue())
        != java.lang.Float.floatToIntBits(
            other.getValue())) return false;
    if (hasPredictedConcept() != other.hasPredictedConcept()) return false;
    if (hasPredictedConcept()) {
      if (!getPredictedConcept()
          .equals(other.getPredictedConcept())) return false;
    }
    if (hasActualConcept() != other.hasActualConcept()) return false;
    if (hasActualConcept()) {
      if (!getActualConcept()
          .equals(other.getActualConcept())) return false;
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
    hash = (37 * hash) + PREDICTED_FIELD_NUMBER;
    hash = (53 * hash) + getPredicted().hashCode();
    hash = (37 * hash) + ACTUAL_FIELD_NUMBER;
    hash = (53 * hash) + getActual().hashCode();
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getValue());
    if (hasPredictedConcept()) {
      hash = (37 * hash) + PREDICTED_CONCEPT_FIELD_NUMBER;
      hash = (53 * hash) + getPredictedConcept().hashCode();
    }
    if (hasActualConcept()) {
      hash = (37 * hash) + ACTUAL_CONCEPT_FIELD_NUMBER;
      hash = (53 * hash) + getActualConcept().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.ConfusionMatrixEntry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.ConfusionMatrixEntry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.ConfusionMatrixEntry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.ConfusionMatrixEntry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.ConfusionMatrixEntry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.ConfusionMatrixEntry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.ConfusionMatrixEntry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.ConfusionMatrixEntry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.ConfusionMatrixEntry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.ConfusionMatrixEntry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.ConfusionMatrixEntry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.ConfusionMatrixEntry parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.ConfusionMatrixEntry prototype) {
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
   * ConfusionMatrixEntry
   * </pre>
   *
   * Protobuf type {@code clarifai.api.ConfusionMatrixEntry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.ConfusionMatrixEntry)
      com.clarifai.grpc.api.ConfusionMatrixEntryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_ConfusionMatrixEntry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_ConfusionMatrixEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.ConfusionMatrixEntry.class, com.clarifai.grpc.api.ConfusionMatrixEntry.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.ConfusionMatrixEntry.newBuilder()
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
      predicted_ = "";

      actual_ = "";

      value_ = 0F;

      if (predictedConceptBuilder_ == null) {
        predictedConcept_ = null;
      } else {
        predictedConcept_ = null;
        predictedConceptBuilder_ = null;
      }
      if (actualConceptBuilder_ == null) {
        actualConcept_ = null;
      } else {
        actualConcept_ = null;
        actualConceptBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_ConfusionMatrixEntry_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.ConfusionMatrixEntry getDefaultInstanceForType() {
      return com.clarifai.grpc.api.ConfusionMatrixEntry.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.ConfusionMatrixEntry build() {
      com.clarifai.grpc.api.ConfusionMatrixEntry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.ConfusionMatrixEntry buildPartial() {
      com.clarifai.grpc.api.ConfusionMatrixEntry result = new com.clarifai.grpc.api.ConfusionMatrixEntry(this);
      result.predicted_ = predicted_;
      result.actual_ = actual_;
      result.value_ = value_;
      if (predictedConceptBuilder_ == null) {
        result.predictedConcept_ = predictedConcept_;
      } else {
        result.predictedConcept_ = predictedConceptBuilder_.build();
      }
      if (actualConceptBuilder_ == null) {
        result.actualConcept_ = actualConcept_;
      } else {
        result.actualConcept_ = actualConceptBuilder_.build();
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
      if (other instanceof com.clarifai.grpc.api.ConfusionMatrixEntry) {
        return mergeFrom((com.clarifai.grpc.api.ConfusionMatrixEntry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.ConfusionMatrixEntry other) {
      if (other == com.clarifai.grpc.api.ConfusionMatrixEntry.getDefaultInstance()) return this;
      if (!other.getPredicted().isEmpty()) {
        predicted_ = other.predicted_;
        onChanged();
      }
      if (!other.getActual().isEmpty()) {
        actual_ = other.actual_;
        onChanged();
      }
      if (other.getValue() != 0F) {
        setValue(other.getValue());
      }
      if (other.hasPredictedConcept()) {
        mergePredictedConcept(other.getPredictedConcept());
      }
      if (other.hasActualConcept()) {
        mergeActualConcept(other.getActualConcept());
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
      com.clarifai.grpc.api.ConfusionMatrixEntry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.ConfusionMatrixEntry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object predicted_ = "";
    /**
     * <code>string predicted = 1;</code>
     * @return The predicted.
     */
    public java.lang.String getPredicted() {
      java.lang.Object ref = predicted_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        predicted_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string predicted = 1;</code>
     * @return The bytes for predicted.
     */
    public com.google.protobuf.ByteString
        getPredictedBytes() {
      java.lang.Object ref = predicted_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        predicted_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string predicted = 1;</code>
     * @param value The predicted to set.
     * @return This builder for chaining.
     */
    public Builder setPredicted(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      predicted_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string predicted = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPredicted() {
      
      predicted_ = getDefaultInstance().getPredicted();
      onChanged();
      return this;
    }
    /**
     * <code>string predicted = 1;</code>
     * @param value The bytes for predicted to set.
     * @return This builder for chaining.
     */
    public Builder setPredictedBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      predicted_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object actual_ = "";
    /**
     * <code>string actual = 2;</code>
     * @return The actual.
     */
    public java.lang.String getActual() {
      java.lang.Object ref = actual_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        actual_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string actual = 2;</code>
     * @return The bytes for actual.
     */
    public com.google.protobuf.ByteString
        getActualBytes() {
      java.lang.Object ref = actual_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        actual_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string actual = 2;</code>
     * @param value The actual to set.
     * @return This builder for chaining.
     */
    public Builder setActual(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      actual_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string actual = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearActual() {
      
      actual_ = getDefaultInstance().getActual();
      onChanged();
      return this;
    }
    /**
     * <code>string actual = 2;</code>
     * @param value The bytes for actual to set.
     * @return This builder for chaining.
     */
    public Builder setActualBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      actual_ = value;
      onChanged();
      return this;
    }

    private float value_ ;
    /**
     * <code>float value = 4 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @return The value.
     */
    @java.lang.Override
    public float getValue() {
      return value_;
    }
    /**
     * <code>float value = 4 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(float value) {
      
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float value = 4 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      
      value_ = 0F;
      onChanged();
      return this;
    }

    private com.clarifai.grpc.api.Concept predictedConcept_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.Concept, com.clarifai.grpc.api.Concept.Builder, com.clarifai.grpc.api.ConceptOrBuilder> predictedConceptBuilder_;
    /**
     * <code>.clarifai.api.Concept predicted_concept = 5;</code>
     * @return Whether the predictedConcept field is set.
     */
    public boolean hasPredictedConcept() {
      return predictedConceptBuilder_ != null || predictedConcept_ != null;
    }
    /**
     * <code>.clarifai.api.Concept predicted_concept = 5;</code>
     * @return The predictedConcept.
     */
    public com.clarifai.grpc.api.Concept getPredictedConcept() {
      if (predictedConceptBuilder_ == null) {
        return predictedConcept_ == null ? com.clarifai.grpc.api.Concept.getDefaultInstance() : predictedConcept_;
      } else {
        return predictedConceptBuilder_.getMessage();
      }
    }
    /**
     * <code>.clarifai.api.Concept predicted_concept = 5;</code>
     */
    public Builder setPredictedConcept(com.clarifai.grpc.api.Concept value) {
      if (predictedConceptBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        predictedConcept_ = value;
        onChanged();
      } else {
        predictedConceptBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.clarifai.api.Concept predicted_concept = 5;</code>
     */
    public Builder setPredictedConcept(
        com.clarifai.grpc.api.Concept.Builder builderForValue) {
      if (predictedConceptBuilder_ == null) {
        predictedConcept_ = builderForValue.build();
        onChanged();
      } else {
        predictedConceptBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.clarifai.api.Concept predicted_concept = 5;</code>
     */
    public Builder mergePredictedConcept(com.clarifai.grpc.api.Concept value) {
      if (predictedConceptBuilder_ == null) {
        if (predictedConcept_ != null) {
          predictedConcept_ =
            com.clarifai.grpc.api.Concept.newBuilder(predictedConcept_).mergeFrom(value).buildPartial();
        } else {
          predictedConcept_ = value;
        }
        onChanged();
      } else {
        predictedConceptBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.clarifai.api.Concept predicted_concept = 5;</code>
     */
    public Builder clearPredictedConcept() {
      if (predictedConceptBuilder_ == null) {
        predictedConcept_ = null;
        onChanged();
      } else {
        predictedConcept_ = null;
        predictedConceptBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.clarifai.api.Concept predicted_concept = 5;</code>
     */
    public com.clarifai.grpc.api.Concept.Builder getPredictedConceptBuilder() {
      
      onChanged();
      return getPredictedConceptFieldBuilder().getBuilder();
    }
    /**
     * <code>.clarifai.api.Concept predicted_concept = 5;</code>
     */
    public com.clarifai.grpc.api.ConceptOrBuilder getPredictedConceptOrBuilder() {
      if (predictedConceptBuilder_ != null) {
        return predictedConceptBuilder_.getMessageOrBuilder();
      } else {
        return predictedConcept_ == null ?
            com.clarifai.grpc.api.Concept.getDefaultInstance() : predictedConcept_;
      }
    }
    /**
     * <code>.clarifai.api.Concept predicted_concept = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.Concept, com.clarifai.grpc.api.Concept.Builder, com.clarifai.grpc.api.ConceptOrBuilder> 
        getPredictedConceptFieldBuilder() {
      if (predictedConceptBuilder_ == null) {
        predictedConceptBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.clarifai.grpc.api.Concept, com.clarifai.grpc.api.Concept.Builder, com.clarifai.grpc.api.ConceptOrBuilder>(
                getPredictedConcept(),
                getParentForChildren(),
                isClean());
        predictedConcept_ = null;
      }
      return predictedConceptBuilder_;
    }

    private com.clarifai.grpc.api.Concept actualConcept_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.Concept, com.clarifai.grpc.api.Concept.Builder, com.clarifai.grpc.api.ConceptOrBuilder> actualConceptBuilder_;
    /**
     * <code>.clarifai.api.Concept actual_concept = 6;</code>
     * @return Whether the actualConcept field is set.
     */
    public boolean hasActualConcept() {
      return actualConceptBuilder_ != null || actualConcept_ != null;
    }
    /**
     * <code>.clarifai.api.Concept actual_concept = 6;</code>
     * @return The actualConcept.
     */
    public com.clarifai.grpc.api.Concept getActualConcept() {
      if (actualConceptBuilder_ == null) {
        return actualConcept_ == null ? com.clarifai.grpc.api.Concept.getDefaultInstance() : actualConcept_;
      } else {
        return actualConceptBuilder_.getMessage();
      }
    }
    /**
     * <code>.clarifai.api.Concept actual_concept = 6;</code>
     */
    public Builder setActualConcept(com.clarifai.grpc.api.Concept value) {
      if (actualConceptBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        actualConcept_ = value;
        onChanged();
      } else {
        actualConceptBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.clarifai.api.Concept actual_concept = 6;</code>
     */
    public Builder setActualConcept(
        com.clarifai.grpc.api.Concept.Builder builderForValue) {
      if (actualConceptBuilder_ == null) {
        actualConcept_ = builderForValue.build();
        onChanged();
      } else {
        actualConceptBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.clarifai.api.Concept actual_concept = 6;</code>
     */
    public Builder mergeActualConcept(com.clarifai.grpc.api.Concept value) {
      if (actualConceptBuilder_ == null) {
        if (actualConcept_ != null) {
          actualConcept_ =
            com.clarifai.grpc.api.Concept.newBuilder(actualConcept_).mergeFrom(value).buildPartial();
        } else {
          actualConcept_ = value;
        }
        onChanged();
      } else {
        actualConceptBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.clarifai.api.Concept actual_concept = 6;</code>
     */
    public Builder clearActualConcept() {
      if (actualConceptBuilder_ == null) {
        actualConcept_ = null;
        onChanged();
      } else {
        actualConcept_ = null;
        actualConceptBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.clarifai.api.Concept actual_concept = 6;</code>
     */
    public com.clarifai.grpc.api.Concept.Builder getActualConceptBuilder() {
      
      onChanged();
      return getActualConceptFieldBuilder().getBuilder();
    }
    /**
     * <code>.clarifai.api.Concept actual_concept = 6;</code>
     */
    public com.clarifai.grpc.api.ConceptOrBuilder getActualConceptOrBuilder() {
      if (actualConceptBuilder_ != null) {
        return actualConceptBuilder_.getMessageOrBuilder();
      } else {
        return actualConcept_ == null ?
            com.clarifai.grpc.api.Concept.getDefaultInstance() : actualConcept_;
      }
    }
    /**
     * <code>.clarifai.api.Concept actual_concept = 6;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.Concept, com.clarifai.grpc.api.Concept.Builder, com.clarifai.grpc.api.ConceptOrBuilder> 
        getActualConceptFieldBuilder() {
      if (actualConceptBuilder_ == null) {
        actualConceptBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.clarifai.grpc.api.Concept, com.clarifai.grpc.api.Concept.Builder, com.clarifai.grpc.api.ConceptOrBuilder>(
                getActualConcept(),
                getParentForChildren(),
                isClean());
        actualConcept_ = null;
      }
      return actualConceptBuilder_;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.ConfusionMatrixEntry)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.ConfusionMatrixEntry)
  private static final com.clarifai.grpc.api.ConfusionMatrixEntry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.ConfusionMatrixEntry();
  }

  public static com.clarifai.grpc.api.ConfusionMatrixEntry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConfusionMatrixEntry>
      PARSER = new com.google.protobuf.AbstractParser<ConfusionMatrixEntry>() {
    @java.lang.Override
    public ConfusionMatrixEntry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ConfusionMatrixEntry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ConfusionMatrixEntry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConfusionMatrixEntry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.ConfusionMatrixEntry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

