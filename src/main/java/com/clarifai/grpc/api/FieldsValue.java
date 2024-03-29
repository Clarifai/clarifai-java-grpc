// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * <pre>
 * FieldsValue
 * </pre>
 *
 * Protobuf type {@code clarifai.api.FieldsValue}
 */
public final class FieldsValue extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.FieldsValue)
    FieldsValueOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FieldsValue.newBuilder() to construct.
  private FieldsValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FieldsValue() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FieldsValue();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FieldsValue(
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

            confusionMatrix_ = input.readBool();
            break;
          }
          case 16: {

            cooccurrenceMatrix_ = input.readBool();
            break;
          }
          case 24: {

            labelCounts_ = input.readBool();
            break;
          }
          case 32: {

            binaryMetrics_ = input.readBool();
            break;
          }
          case 40: {

            testSet_ = input.readBool();
            break;
          }
          case 48: {

            metricsByArea_ = input.readBool();
            break;
          }
          case 56: {

            metricsByClass_ = input.readBool();
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
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_FieldsValue_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_FieldsValue_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.FieldsValue.class, com.clarifai.grpc.api.FieldsValue.Builder.class);
  }

  public static final int CONFUSION_MATRIX_FIELD_NUMBER = 1;
  private boolean confusionMatrix_;
  /**
   * <code>bool confusion_matrix = 1;</code>
   * @return The confusionMatrix.
   */
  @java.lang.Override
  public boolean getConfusionMatrix() {
    return confusionMatrix_;
  }

  public static final int COOCCURRENCE_MATRIX_FIELD_NUMBER = 2;
  private boolean cooccurrenceMatrix_;
  /**
   * <code>bool cooccurrence_matrix = 2;</code>
   * @return The cooccurrenceMatrix.
   */
  @java.lang.Override
  public boolean getCooccurrenceMatrix() {
    return cooccurrenceMatrix_;
  }

  public static final int LABEL_COUNTS_FIELD_NUMBER = 3;
  private boolean labelCounts_;
  /**
   * <code>bool label_counts = 3;</code>
   * @return The labelCounts.
   */
  @java.lang.Override
  public boolean getLabelCounts() {
    return labelCounts_;
  }

  public static final int BINARY_METRICS_FIELD_NUMBER = 4;
  private boolean binaryMetrics_;
  /**
   * <code>bool binary_metrics = 4;</code>
   * @return The binaryMetrics.
   */
  @java.lang.Override
  public boolean getBinaryMetrics() {
    return binaryMetrics_;
  }

  public static final int TEST_SET_FIELD_NUMBER = 5;
  private boolean testSet_;
  /**
   * <code>bool test_set = 5;</code>
   * @return The testSet.
   */
  @java.lang.Override
  public boolean getTestSet() {
    return testSet_;
  }

  public static final int METRICS_BY_AREA_FIELD_NUMBER = 6;
  private boolean metricsByArea_;
  /**
   * <code>bool metrics_by_area = 6;</code>
   * @return The metricsByArea.
   */
  @java.lang.Override
  public boolean getMetricsByArea() {
    return metricsByArea_;
  }

  public static final int METRICS_BY_CLASS_FIELD_NUMBER = 7;
  private boolean metricsByClass_;
  /**
   * <code>bool metrics_by_class = 7;</code>
   * @return The metricsByClass.
   */
  @java.lang.Override
  public boolean getMetricsByClass() {
    return metricsByClass_;
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
    if (confusionMatrix_ != false) {
      output.writeBool(1, confusionMatrix_);
    }
    if (cooccurrenceMatrix_ != false) {
      output.writeBool(2, cooccurrenceMatrix_);
    }
    if (labelCounts_ != false) {
      output.writeBool(3, labelCounts_);
    }
    if (binaryMetrics_ != false) {
      output.writeBool(4, binaryMetrics_);
    }
    if (testSet_ != false) {
      output.writeBool(5, testSet_);
    }
    if (metricsByArea_ != false) {
      output.writeBool(6, metricsByArea_);
    }
    if (metricsByClass_ != false) {
      output.writeBool(7, metricsByClass_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (confusionMatrix_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, confusionMatrix_);
    }
    if (cooccurrenceMatrix_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, cooccurrenceMatrix_);
    }
    if (labelCounts_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, labelCounts_);
    }
    if (binaryMetrics_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, binaryMetrics_);
    }
    if (testSet_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, testSet_);
    }
    if (metricsByArea_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, metricsByArea_);
    }
    if (metricsByClass_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(7, metricsByClass_);
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
    if (!(obj instanceof com.clarifai.grpc.api.FieldsValue)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.FieldsValue other = (com.clarifai.grpc.api.FieldsValue) obj;

    if (getConfusionMatrix()
        != other.getConfusionMatrix()) return false;
    if (getCooccurrenceMatrix()
        != other.getCooccurrenceMatrix()) return false;
    if (getLabelCounts()
        != other.getLabelCounts()) return false;
    if (getBinaryMetrics()
        != other.getBinaryMetrics()) return false;
    if (getTestSet()
        != other.getTestSet()) return false;
    if (getMetricsByArea()
        != other.getMetricsByArea()) return false;
    if (getMetricsByClass()
        != other.getMetricsByClass()) return false;
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
    hash = (37 * hash) + CONFUSION_MATRIX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getConfusionMatrix());
    hash = (37 * hash) + COOCCURRENCE_MATRIX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getCooccurrenceMatrix());
    hash = (37 * hash) + LABEL_COUNTS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getLabelCounts());
    hash = (37 * hash) + BINARY_METRICS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getBinaryMetrics());
    hash = (37 * hash) + TEST_SET_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getTestSet());
    hash = (37 * hash) + METRICS_BY_AREA_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getMetricsByArea());
    hash = (37 * hash) + METRICS_BY_CLASS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getMetricsByClass());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.FieldsValue parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.FieldsValue parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.FieldsValue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.FieldsValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.FieldsValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.FieldsValue parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.FieldsValue parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.FieldsValue parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.FieldsValue parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.FieldsValue parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.FieldsValue parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.FieldsValue parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.FieldsValue prototype) {
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
   * FieldsValue
   * </pre>
   *
   * Protobuf type {@code clarifai.api.FieldsValue}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.FieldsValue)
      com.clarifai.grpc.api.FieldsValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_FieldsValue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_FieldsValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.FieldsValue.class, com.clarifai.grpc.api.FieldsValue.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.FieldsValue.newBuilder()
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
      confusionMatrix_ = false;

      cooccurrenceMatrix_ = false;

      labelCounts_ = false;

      binaryMetrics_ = false;

      testSet_ = false;

      metricsByArea_ = false;

      metricsByClass_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_FieldsValue_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.FieldsValue getDefaultInstanceForType() {
      return com.clarifai.grpc.api.FieldsValue.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.FieldsValue build() {
      com.clarifai.grpc.api.FieldsValue result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.FieldsValue buildPartial() {
      com.clarifai.grpc.api.FieldsValue result = new com.clarifai.grpc.api.FieldsValue(this);
      result.confusionMatrix_ = confusionMatrix_;
      result.cooccurrenceMatrix_ = cooccurrenceMatrix_;
      result.labelCounts_ = labelCounts_;
      result.binaryMetrics_ = binaryMetrics_;
      result.testSet_ = testSet_;
      result.metricsByArea_ = metricsByArea_;
      result.metricsByClass_ = metricsByClass_;
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
      if (other instanceof com.clarifai.grpc.api.FieldsValue) {
        return mergeFrom((com.clarifai.grpc.api.FieldsValue)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.FieldsValue other) {
      if (other == com.clarifai.grpc.api.FieldsValue.getDefaultInstance()) return this;
      if (other.getConfusionMatrix() != false) {
        setConfusionMatrix(other.getConfusionMatrix());
      }
      if (other.getCooccurrenceMatrix() != false) {
        setCooccurrenceMatrix(other.getCooccurrenceMatrix());
      }
      if (other.getLabelCounts() != false) {
        setLabelCounts(other.getLabelCounts());
      }
      if (other.getBinaryMetrics() != false) {
        setBinaryMetrics(other.getBinaryMetrics());
      }
      if (other.getTestSet() != false) {
        setTestSet(other.getTestSet());
      }
      if (other.getMetricsByArea() != false) {
        setMetricsByArea(other.getMetricsByArea());
      }
      if (other.getMetricsByClass() != false) {
        setMetricsByClass(other.getMetricsByClass());
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
      com.clarifai.grpc.api.FieldsValue parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.FieldsValue) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean confusionMatrix_ ;
    /**
     * <code>bool confusion_matrix = 1;</code>
     * @return The confusionMatrix.
     */
    @java.lang.Override
    public boolean getConfusionMatrix() {
      return confusionMatrix_;
    }
    /**
     * <code>bool confusion_matrix = 1;</code>
     * @param value The confusionMatrix to set.
     * @return This builder for chaining.
     */
    public Builder setConfusionMatrix(boolean value) {
      
      confusionMatrix_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool confusion_matrix = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearConfusionMatrix() {
      
      confusionMatrix_ = false;
      onChanged();
      return this;
    }

    private boolean cooccurrenceMatrix_ ;
    /**
     * <code>bool cooccurrence_matrix = 2;</code>
     * @return The cooccurrenceMatrix.
     */
    @java.lang.Override
    public boolean getCooccurrenceMatrix() {
      return cooccurrenceMatrix_;
    }
    /**
     * <code>bool cooccurrence_matrix = 2;</code>
     * @param value The cooccurrenceMatrix to set.
     * @return This builder for chaining.
     */
    public Builder setCooccurrenceMatrix(boolean value) {
      
      cooccurrenceMatrix_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool cooccurrence_matrix = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCooccurrenceMatrix() {
      
      cooccurrenceMatrix_ = false;
      onChanged();
      return this;
    }

    private boolean labelCounts_ ;
    /**
     * <code>bool label_counts = 3;</code>
     * @return The labelCounts.
     */
    @java.lang.Override
    public boolean getLabelCounts() {
      return labelCounts_;
    }
    /**
     * <code>bool label_counts = 3;</code>
     * @param value The labelCounts to set.
     * @return This builder for chaining.
     */
    public Builder setLabelCounts(boolean value) {
      
      labelCounts_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool label_counts = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLabelCounts() {
      
      labelCounts_ = false;
      onChanged();
      return this;
    }

    private boolean binaryMetrics_ ;
    /**
     * <code>bool binary_metrics = 4;</code>
     * @return The binaryMetrics.
     */
    @java.lang.Override
    public boolean getBinaryMetrics() {
      return binaryMetrics_;
    }
    /**
     * <code>bool binary_metrics = 4;</code>
     * @param value The binaryMetrics to set.
     * @return This builder for chaining.
     */
    public Builder setBinaryMetrics(boolean value) {
      
      binaryMetrics_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool binary_metrics = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearBinaryMetrics() {
      
      binaryMetrics_ = false;
      onChanged();
      return this;
    }

    private boolean testSet_ ;
    /**
     * <code>bool test_set = 5;</code>
     * @return The testSet.
     */
    @java.lang.Override
    public boolean getTestSet() {
      return testSet_;
    }
    /**
     * <code>bool test_set = 5;</code>
     * @param value The testSet to set.
     * @return This builder for chaining.
     */
    public Builder setTestSet(boolean value) {
      
      testSet_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool test_set = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearTestSet() {
      
      testSet_ = false;
      onChanged();
      return this;
    }

    private boolean metricsByArea_ ;
    /**
     * <code>bool metrics_by_area = 6;</code>
     * @return The metricsByArea.
     */
    @java.lang.Override
    public boolean getMetricsByArea() {
      return metricsByArea_;
    }
    /**
     * <code>bool metrics_by_area = 6;</code>
     * @param value The metricsByArea to set.
     * @return This builder for chaining.
     */
    public Builder setMetricsByArea(boolean value) {
      
      metricsByArea_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool metrics_by_area = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearMetricsByArea() {
      
      metricsByArea_ = false;
      onChanged();
      return this;
    }

    private boolean metricsByClass_ ;
    /**
     * <code>bool metrics_by_class = 7;</code>
     * @return The metricsByClass.
     */
    @java.lang.Override
    public boolean getMetricsByClass() {
      return metricsByClass_;
    }
    /**
     * <code>bool metrics_by_class = 7;</code>
     * @param value The metricsByClass to set.
     * @return This builder for chaining.
     */
    public Builder setMetricsByClass(boolean value) {
      
      metricsByClass_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool metrics_by_class = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearMetricsByClass() {
      
      metricsByClass_ = false;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.FieldsValue)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.FieldsValue)
  private static final com.clarifai.grpc.api.FieldsValue DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.FieldsValue();
  }

  public static com.clarifai.grpc.api.FieldsValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FieldsValue>
      PARSER = new com.google.protobuf.AbstractParser<FieldsValue>() {
    @java.lang.Override
    public FieldsValue parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FieldsValue(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FieldsValue> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FieldsValue> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.FieldsValue getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

