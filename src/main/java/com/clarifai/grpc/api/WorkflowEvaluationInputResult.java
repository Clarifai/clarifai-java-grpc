// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * <pre>
 * The evaluation result at the input/sample level
 * </pre>
 *
 * Protobuf type {@code clarifai.api.WorkflowEvaluationInputResult}
 */
public final class WorkflowEvaluationInputResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.WorkflowEvaluationInputResult)
    WorkflowEvaluationInputResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WorkflowEvaluationInputResult.newBuilder() to construct.
  private WorkflowEvaluationInputResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WorkflowEvaluationInputResult() {
    inputEvaluationMetricValues_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WorkflowEvaluationInputResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WorkflowEvaluationInputResult(
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
              inputEvaluationMetricValues_ = new java.util.ArrayList<com.clarifai.grpc.api.InputEvaluationMetricValue>();
              mutable_bitField0_ |= 0x00000001;
            }
            inputEvaluationMetricValues_.add(
                input.readMessage(com.clarifai.grpc.api.InputEvaluationMetricValue.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        inputEvaluationMetricValues_ = java.util.Collections.unmodifiableList(inputEvaluationMetricValues_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_WorkflowEvaluationInputResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_WorkflowEvaluationInputResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.WorkflowEvaluationInputResult.class, com.clarifai.grpc.api.WorkflowEvaluationInputResult.Builder.class);
  }

  public static final int INPUT_EVALUATION_METRIC_VALUES_FIELD_NUMBER = 1;
  private java.util.List<com.clarifai.grpc.api.InputEvaluationMetricValue> inputEvaluationMetricValues_;
  /**
   * <code>repeated .clarifai.api.InputEvaluationMetricValue input_evaluation_metric_values = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.clarifai.grpc.api.InputEvaluationMetricValue> getInputEvaluationMetricValuesList() {
    return inputEvaluationMetricValues_;
  }
  /**
   * <code>repeated .clarifai.api.InputEvaluationMetricValue input_evaluation_metric_values = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.clarifai.grpc.api.InputEvaluationMetricValueOrBuilder> 
      getInputEvaluationMetricValuesOrBuilderList() {
    return inputEvaluationMetricValues_;
  }
  /**
   * <code>repeated .clarifai.api.InputEvaluationMetricValue input_evaluation_metric_values = 1;</code>
   */
  @java.lang.Override
  public int getInputEvaluationMetricValuesCount() {
    return inputEvaluationMetricValues_.size();
  }
  /**
   * <code>repeated .clarifai.api.InputEvaluationMetricValue input_evaluation_metric_values = 1;</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.InputEvaluationMetricValue getInputEvaluationMetricValues(int index) {
    return inputEvaluationMetricValues_.get(index);
  }
  /**
   * <code>repeated .clarifai.api.InputEvaluationMetricValue input_evaluation_metric_values = 1;</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.InputEvaluationMetricValueOrBuilder getInputEvaluationMetricValuesOrBuilder(
      int index) {
    return inputEvaluationMetricValues_.get(index);
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
    for (int i = 0; i < inputEvaluationMetricValues_.size(); i++) {
      output.writeMessage(1, inputEvaluationMetricValues_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < inputEvaluationMetricValues_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, inputEvaluationMetricValues_.get(i));
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
    if (!(obj instanceof com.clarifai.grpc.api.WorkflowEvaluationInputResult)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.WorkflowEvaluationInputResult other = (com.clarifai.grpc.api.WorkflowEvaluationInputResult) obj;

    if (!getInputEvaluationMetricValuesList()
        .equals(other.getInputEvaluationMetricValuesList())) return false;
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
    if (getInputEvaluationMetricValuesCount() > 0) {
      hash = (37 * hash) + INPUT_EVALUATION_METRIC_VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getInputEvaluationMetricValuesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.WorkflowEvaluationInputResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.WorkflowEvaluationInputResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.WorkflowEvaluationInputResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.WorkflowEvaluationInputResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.WorkflowEvaluationInputResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.WorkflowEvaluationInputResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.WorkflowEvaluationInputResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.WorkflowEvaluationInputResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.WorkflowEvaluationInputResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.WorkflowEvaluationInputResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.WorkflowEvaluationInputResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.WorkflowEvaluationInputResult parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.WorkflowEvaluationInputResult prototype) {
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
   * The evaluation result at the input/sample level
   * </pre>
   *
   * Protobuf type {@code clarifai.api.WorkflowEvaluationInputResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.WorkflowEvaluationInputResult)
      com.clarifai.grpc.api.WorkflowEvaluationInputResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_WorkflowEvaluationInputResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_WorkflowEvaluationInputResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.WorkflowEvaluationInputResult.class, com.clarifai.grpc.api.WorkflowEvaluationInputResult.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.WorkflowEvaluationInputResult.newBuilder()
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
        getInputEvaluationMetricValuesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (inputEvaluationMetricValuesBuilder_ == null) {
        inputEvaluationMetricValues_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        inputEvaluationMetricValuesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_WorkflowEvaluationInputResult_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.WorkflowEvaluationInputResult getDefaultInstanceForType() {
      return com.clarifai.grpc.api.WorkflowEvaluationInputResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.WorkflowEvaluationInputResult build() {
      com.clarifai.grpc.api.WorkflowEvaluationInputResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.WorkflowEvaluationInputResult buildPartial() {
      com.clarifai.grpc.api.WorkflowEvaluationInputResult result = new com.clarifai.grpc.api.WorkflowEvaluationInputResult(this);
      int from_bitField0_ = bitField0_;
      if (inputEvaluationMetricValuesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          inputEvaluationMetricValues_ = java.util.Collections.unmodifiableList(inputEvaluationMetricValues_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.inputEvaluationMetricValues_ = inputEvaluationMetricValues_;
      } else {
        result.inputEvaluationMetricValues_ = inputEvaluationMetricValuesBuilder_.build();
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
      if (other instanceof com.clarifai.grpc.api.WorkflowEvaluationInputResult) {
        return mergeFrom((com.clarifai.grpc.api.WorkflowEvaluationInputResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.WorkflowEvaluationInputResult other) {
      if (other == com.clarifai.grpc.api.WorkflowEvaluationInputResult.getDefaultInstance()) return this;
      if (inputEvaluationMetricValuesBuilder_ == null) {
        if (!other.inputEvaluationMetricValues_.isEmpty()) {
          if (inputEvaluationMetricValues_.isEmpty()) {
            inputEvaluationMetricValues_ = other.inputEvaluationMetricValues_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureInputEvaluationMetricValuesIsMutable();
            inputEvaluationMetricValues_.addAll(other.inputEvaluationMetricValues_);
          }
          onChanged();
        }
      } else {
        if (!other.inputEvaluationMetricValues_.isEmpty()) {
          if (inputEvaluationMetricValuesBuilder_.isEmpty()) {
            inputEvaluationMetricValuesBuilder_.dispose();
            inputEvaluationMetricValuesBuilder_ = null;
            inputEvaluationMetricValues_ = other.inputEvaluationMetricValues_;
            bitField0_ = (bitField0_ & ~0x00000001);
            inputEvaluationMetricValuesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getInputEvaluationMetricValuesFieldBuilder() : null;
          } else {
            inputEvaluationMetricValuesBuilder_.addAllMessages(other.inputEvaluationMetricValues_);
          }
        }
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
      com.clarifai.grpc.api.WorkflowEvaluationInputResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.WorkflowEvaluationInputResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.clarifai.grpc.api.InputEvaluationMetricValue> inputEvaluationMetricValues_ =
      java.util.Collections.emptyList();
    private void ensureInputEvaluationMetricValuesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        inputEvaluationMetricValues_ = new java.util.ArrayList<com.clarifai.grpc.api.InputEvaluationMetricValue>(inputEvaluationMetricValues_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.InputEvaluationMetricValue, com.clarifai.grpc.api.InputEvaluationMetricValue.Builder, com.clarifai.grpc.api.InputEvaluationMetricValueOrBuilder> inputEvaluationMetricValuesBuilder_;

    /**
     * <code>repeated .clarifai.api.InputEvaluationMetricValue input_evaluation_metric_values = 1;</code>
     */
    public java.util.List<com.clarifai.grpc.api.InputEvaluationMetricValue> getInputEvaluationMetricValuesList() {
      if (inputEvaluationMetricValuesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(inputEvaluationMetricValues_);
      } else {
        return inputEvaluationMetricValuesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .clarifai.api.InputEvaluationMetricValue input_evaluation_metric_values = 1;</code>
     */
    public int getInputEvaluationMetricValuesCount() {
      if (inputEvaluationMetricValuesBuilder_ == null) {
        return inputEvaluationMetricValues_.size();
      } else {
        return inputEvaluationMetricValuesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .clarifai.api.InputEvaluationMetricValue input_evaluation_metric_values = 1;</code>
     */
    public com.clarifai.grpc.api.InputEvaluationMetricValue getInputEvaluationMetricValues(int index) {
      if (inputEvaluationMetricValuesBuilder_ == null) {
        return inputEvaluationMetricValues_.get(index);
      } else {
        return inputEvaluationMetricValuesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .clarifai.api.InputEvaluationMetricValue input_evaluation_metric_values = 1;</code>
     */
    public Builder setInputEvaluationMetricValues(
        int index, com.clarifai.grpc.api.InputEvaluationMetricValue value) {
      if (inputEvaluationMetricValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInputEvaluationMetricValuesIsMutable();
        inputEvaluationMetricValues_.set(index, value);
        onChanged();
      } else {
        inputEvaluationMetricValuesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.InputEvaluationMetricValue input_evaluation_metric_values = 1;</code>
     */
    public Builder setInputEvaluationMetricValues(
        int index, com.clarifai.grpc.api.InputEvaluationMetricValue.Builder builderForValue) {
      if (inputEvaluationMetricValuesBuilder_ == null) {
        ensureInputEvaluationMetricValuesIsMutable();
        inputEvaluationMetricValues_.set(index, builderForValue.build());
        onChanged();
      } else {
        inputEvaluationMetricValuesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.InputEvaluationMetricValue input_evaluation_metric_values = 1;</code>
     */
    public Builder addInputEvaluationMetricValues(com.clarifai.grpc.api.InputEvaluationMetricValue value) {
      if (inputEvaluationMetricValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInputEvaluationMetricValuesIsMutable();
        inputEvaluationMetricValues_.add(value);
        onChanged();
      } else {
        inputEvaluationMetricValuesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.InputEvaluationMetricValue input_evaluation_metric_values = 1;</code>
     */
    public Builder addInputEvaluationMetricValues(
        int index, com.clarifai.grpc.api.InputEvaluationMetricValue value) {
      if (inputEvaluationMetricValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInputEvaluationMetricValuesIsMutable();
        inputEvaluationMetricValues_.add(index, value);
        onChanged();
      } else {
        inputEvaluationMetricValuesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.InputEvaluationMetricValue input_evaluation_metric_values = 1;</code>
     */
    public Builder addInputEvaluationMetricValues(
        com.clarifai.grpc.api.InputEvaluationMetricValue.Builder builderForValue) {
      if (inputEvaluationMetricValuesBuilder_ == null) {
        ensureInputEvaluationMetricValuesIsMutable();
        inputEvaluationMetricValues_.add(builderForValue.build());
        onChanged();
      } else {
        inputEvaluationMetricValuesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.InputEvaluationMetricValue input_evaluation_metric_values = 1;</code>
     */
    public Builder addInputEvaluationMetricValues(
        int index, com.clarifai.grpc.api.InputEvaluationMetricValue.Builder builderForValue) {
      if (inputEvaluationMetricValuesBuilder_ == null) {
        ensureInputEvaluationMetricValuesIsMutable();
        inputEvaluationMetricValues_.add(index, builderForValue.build());
        onChanged();
      } else {
        inputEvaluationMetricValuesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.InputEvaluationMetricValue input_evaluation_metric_values = 1;</code>
     */
    public Builder addAllInputEvaluationMetricValues(
        java.lang.Iterable<? extends com.clarifai.grpc.api.InputEvaluationMetricValue> values) {
      if (inputEvaluationMetricValuesBuilder_ == null) {
        ensureInputEvaluationMetricValuesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, inputEvaluationMetricValues_);
        onChanged();
      } else {
        inputEvaluationMetricValuesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.InputEvaluationMetricValue input_evaluation_metric_values = 1;</code>
     */
    public Builder clearInputEvaluationMetricValues() {
      if (inputEvaluationMetricValuesBuilder_ == null) {
        inputEvaluationMetricValues_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        inputEvaluationMetricValuesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.InputEvaluationMetricValue input_evaluation_metric_values = 1;</code>
     */
    public Builder removeInputEvaluationMetricValues(int index) {
      if (inputEvaluationMetricValuesBuilder_ == null) {
        ensureInputEvaluationMetricValuesIsMutable();
        inputEvaluationMetricValues_.remove(index);
        onChanged();
      } else {
        inputEvaluationMetricValuesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.InputEvaluationMetricValue input_evaluation_metric_values = 1;</code>
     */
    public com.clarifai.grpc.api.InputEvaluationMetricValue.Builder getInputEvaluationMetricValuesBuilder(
        int index) {
      return getInputEvaluationMetricValuesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .clarifai.api.InputEvaluationMetricValue input_evaluation_metric_values = 1;</code>
     */
    public com.clarifai.grpc.api.InputEvaluationMetricValueOrBuilder getInputEvaluationMetricValuesOrBuilder(
        int index) {
      if (inputEvaluationMetricValuesBuilder_ == null) {
        return inputEvaluationMetricValues_.get(index);  } else {
        return inputEvaluationMetricValuesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .clarifai.api.InputEvaluationMetricValue input_evaluation_metric_values = 1;</code>
     */
    public java.util.List<? extends com.clarifai.grpc.api.InputEvaluationMetricValueOrBuilder> 
         getInputEvaluationMetricValuesOrBuilderList() {
      if (inputEvaluationMetricValuesBuilder_ != null) {
        return inputEvaluationMetricValuesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(inputEvaluationMetricValues_);
      }
    }
    /**
     * <code>repeated .clarifai.api.InputEvaluationMetricValue input_evaluation_metric_values = 1;</code>
     */
    public com.clarifai.grpc.api.InputEvaluationMetricValue.Builder addInputEvaluationMetricValuesBuilder() {
      return getInputEvaluationMetricValuesFieldBuilder().addBuilder(
          com.clarifai.grpc.api.InputEvaluationMetricValue.getDefaultInstance());
    }
    /**
     * <code>repeated .clarifai.api.InputEvaluationMetricValue input_evaluation_metric_values = 1;</code>
     */
    public com.clarifai.grpc.api.InputEvaluationMetricValue.Builder addInputEvaluationMetricValuesBuilder(
        int index) {
      return getInputEvaluationMetricValuesFieldBuilder().addBuilder(
          index, com.clarifai.grpc.api.InputEvaluationMetricValue.getDefaultInstance());
    }
    /**
     * <code>repeated .clarifai.api.InputEvaluationMetricValue input_evaluation_metric_values = 1;</code>
     */
    public java.util.List<com.clarifai.grpc.api.InputEvaluationMetricValue.Builder> 
         getInputEvaluationMetricValuesBuilderList() {
      return getInputEvaluationMetricValuesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.InputEvaluationMetricValue, com.clarifai.grpc.api.InputEvaluationMetricValue.Builder, com.clarifai.grpc.api.InputEvaluationMetricValueOrBuilder> 
        getInputEvaluationMetricValuesFieldBuilder() {
      if (inputEvaluationMetricValuesBuilder_ == null) {
        inputEvaluationMetricValuesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.clarifai.grpc.api.InputEvaluationMetricValue, com.clarifai.grpc.api.InputEvaluationMetricValue.Builder, com.clarifai.grpc.api.InputEvaluationMetricValueOrBuilder>(
                inputEvaluationMetricValues_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        inputEvaluationMetricValues_ = null;
      }
      return inputEvaluationMetricValuesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.WorkflowEvaluationInputResult)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.WorkflowEvaluationInputResult)
  private static final com.clarifai.grpc.api.WorkflowEvaluationInputResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.WorkflowEvaluationInputResult();
  }

  public static com.clarifai.grpc.api.WorkflowEvaluationInputResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WorkflowEvaluationInputResult>
      PARSER = new com.google.protobuf.AbstractParser<WorkflowEvaluationInputResult>() {
    @java.lang.Override
    public WorkflowEvaluationInputResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WorkflowEvaluationInputResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WorkflowEvaluationInputResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WorkflowEvaluationInputResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.WorkflowEvaluationInputResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

