// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * Protobuf type {@code clarifai.api.WorkflowEvaluationResult}
 */
public final class WorkflowEvaluationResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.WorkflowEvaluationResult)
    WorkflowEvaluationResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WorkflowEvaluationResult.newBuilder() to construct.
  private WorkflowEvaluationResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WorkflowEvaluationResult() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WorkflowEvaluationResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WorkflowEvaluationResult(
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
            com.clarifai.grpc.api.WorkflowEvaluationResultSummary.Builder subBuilder = null;
            if (summary_ != null) {
              subBuilder = summary_.toBuilder();
            }
            summary_ = input.readMessage(com.clarifai.grpc.api.WorkflowEvaluationResultSummary.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(summary_);
              summary_ = subBuilder.buildPartial();
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
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_WorkflowEvaluationResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_WorkflowEvaluationResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.WorkflowEvaluationResult.class, com.clarifai.grpc.api.WorkflowEvaluationResult.Builder.class);
  }

  public static final int SUMMARY_FIELD_NUMBER = 1;
  private com.clarifai.grpc.api.WorkflowEvaluationResultSummary summary_;
  /**
   * <pre>
   * The summary of the evaluation result.
   * </pre>
   *
   * <code>.clarifai.api.WorkflowEvaluationResultSummary summary = 1;</code>
   * @return Whether the summary field is set.
   */
  @java.lang.Override
  public boolean hasSummary() {
    return summary_ != null;
  }
  /**
   * <pre>
   * The summary of the evaluation result.
   * </pre>
   *
   * <code>.clarifai.api.WorkflowEvaluationResultSummary summary = 1;</code>
   * @return The summary.
   */
  @java.lang.Override
  public com.clarifai.grpc.api.WorkflowEvaluationResultSummary getSummary() {
    return summary_ == null ? com.clarifai.grpc.api.WorkflowEvaluationResultSummary.getDefaultInstance() : summary_;
  }
  /**
   * <pre>
   * The summary of the evaluation result.
   * </pre>
   *
   * <code>.clarifai.api.WorkflowEvaluationResultSummary summary = 1;</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.WorkflowEvaluationResultSummaryOrBuilder getSummaryOrBuilder() {
    return getSummary();
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
    if (summary_ != null) {
      output.writeMessage(1, getSummary());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (summary_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSummary());
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
    if (!(obj instanceof com.clarifai.grpc.api.WorkflowEvaluationResult)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.WorkflowEvaluationResult other = (com.clarifai.grpc.api.WorkflowEvaluationResult) obj;

    if (hasSummary() != other.hasSummary()) return false;
    if (hasSummary()) {
      if (!getSummary()
          .equals(other.getSummary())) return false;
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
    if (hasSummary()) {
      hash = (37 * hash) + SUMMARY_FIELD_NUMBER;
      hash = (53 * hash) + getSummary().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.WorkflowEvaluationResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.WorkflowEvaluationResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.WorkflowEvaluationResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.WorkflowEvaluationResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.WorkflowEvaluationResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.WorkflowEvaluationResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.WorkflowEvaluationResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.WorkflowEvaluationResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.WorkflowEvaluationResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.WorkflowEvaluationResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.WorkflowEvaluationResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.WorkflowEvaluationResult parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.WorkflowEvaluationResult prototype) {
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
   * Protobuf type {@code clarifai.api.WorkflowEvaluationResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.WorkflowEvaluationResult)
      com.clarifai.grpc.api.WorkflowEvaluationResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_WorkflowEvaluationResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_WorkflowEvaluationResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.WorkflowEvaluationResult.class, com.clarifai.grpc.api.WorkflowEvaluationResult.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.WorkflowEvaluationResult.newBuilder()
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
      if (summaryBuilder_ == null) {
        summary_ = null;
      } else {
        summary_ = null;
        summaryBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_WorkflowEvaluationResult_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.WorkflowEvaluationResult getDefaultInstanceForType() {
      return com.clarifai.grpc.api.WorkflowEvaluationResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.WorkflowEvaluationResult build() {
      com.clarifai.grpc.api.WorkflowEvaluationResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.WorkflowEvaluationResult buildPartial() {
      com.clarifai.grpc.api.WorkflowEvaluationResult result = new com.clarifai.grpc.api.WorkflowEvaluationResult(this);
      if (summaryBuilder_ == null) {
        result.summary_ = summary_;
      } else {
        result.summary_ = summaryBuilder_.build();
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
      if (other instanceof com.clarifai.grpc.api.WorkflowEvaluationResult) {
        return mergeFrom((com.clarifai.grpc.api.WorkflowEvaluationResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.WorkflowEvaluationResult other) {
      if (other == com.clarifai.grpc.api.WorkflowEvaluationResult.getDefaultInstance()) return this;
      if (other.hasSummary()) {
        mergeSummary(other.getSummary());
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
      com.clarifai.grpc.api.WorkflowEvaluationResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.WorkflowEvaluationResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.clarifai.grpc.api.WorkflowEvaluationResultSummary summary_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.WorkflowEvaluationResultSummary, com.clarifai.grpc.api.WorkflowEvaluationResultSummary.Builder, com.clarifai.grpc.api.WorkflowEvaluationResultSummaryOrBuilder> summaryBuilder_;
    /**
     * <pre>
     * The summary of the evaluation result.
     * </pre>
     *
     * <code>.clarifai.api.WorkflowEvaluationResultSummary summary = 1;</code>
     * @return Whether the summary field is set.
     */
    public boolean hasSummary() {
      return summaryBuilder_ != null || summary_ != null;
    }
    /**
     * <pre>
     * The summary of the evaluation result.
     * </pre>
     *
     * <code>.clarifai.api.WorkflowEvaluationResultSummary summary = 1;</code>
     * @return The summary.
     */
    public com.clarifai.grpc.api.WorkflowEvaluationResultSummary getSummary() {
      if (summaryBuilder_ == null) {
        return summary_ == null ? com.clarifai.grpc.api.WorkflowEvaluationResultSummary.getDefaultInstance() : summary_;
      } else {
        return summaryBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The summary of the evaluation result.
     * </pre>
     *
     * <code>.clarifai.api.WorkflowEvaluationResultSummary summary = 1;</code>
     */
    public Builder setSummary(com.clarifai.grpc.api.WorkflowEvaluationResultSummary value) {
      if (summaryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        summary_ = value;
        onChanged();
      } else {
        summaryBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The summary of the evaluation result.
     * </pre>
     *
     * <code>.clarifai.api.WorkflowEvaluationResultSummary summary = 1;</code>
     */
    public Builder setSummary(
        com.clarifai.grpc.api.WorkflowEvaluationResultSummary.Builder builderForValue) {
      if (summaryBuilder_ == null) {
        summary_ = builderForValue.build();
        onChanged();
      } else {
        summaryBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The summary of the evaluation result.
     * </pre>
     *
     * <code>.clarifai.api.WorkflowEvaluationResultSummary summary = 1;</code>
     */
    public Builder mergeSummary(com.clarifai.grpc.api.WorkflowEvaluationResultSummary value) {
      if (summaryBuilder_ == null) {
        if (summary_ != null) {
          summary_ =
            com.clarifai.grpc.api.WorkflowEvaluationResultSummary.newBuilder(summary_).mergeFrom(value).buildPartial();
        } else {
          summary_ = value;
        }
        onChanged();
      } else {
        summaryBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The summary of the evaluation result.
     * </pre>
     *
     * <code>.clarifai.api.WorkflowEvaluationResultSummary summary = 1;</code>
     */
    public Builder clearSummary() {
      if (summaryBuilder_ == null) {
        summary_ = null;
        onChanged();
      } else {
        summary_ = null;
        summaryBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The summary of the evaluation result.
     * </pre>
     *
     * <code>.clarifai.api.WorkflowEvaluationResultSummary summary = 1;</code>
     */
    public com.clarifai.grpc.api.WorkflowEvaluationResultSummary.Builder getSummaryBuilder() {
      
      onChanged();
      return getSummaryFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The summary of the evaluation result.
     * </pre>
     *
     * <code>.clarifai.api.WorkflowEvaluationResultSummary summary = 1;</code>
     */
    public com.clarifai.grpc.api.WorkflowEvaluationResultSummaryOrBuilder getSummaryOrBuilder() {
      if (summaryBuilder_ != null) {
        return summaryBuilder_.getMessageOrBuilder();
      } else {
        return summary_ == null ?
            com.clarifai.grpc.api.WorkflowEvaluationResultSummary.getDefaultInstance() : summary_;
      }
    }
    /**
     * <pre>
     * The summary of the evaluation result.
     * </pre>
     *
     * <code>.clarifai.api.WorkflowEvaluationResultSummary summary = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.WorkflowEvaluationResultSummary, com.clarifai.grpc.api.WorkflowEvaluationResultSummary.Builder, com.clarifai.grpc.api.WorkflowEvaluationResultSummaryOrBuilder> 
        getSummaryFieldBuilder() {
      if (summaryBuilder_ == null) {
        summaryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.clarifai.grpc.api.WorkflowEvaluationResultSummary, com.clarifai.grpc.api.WorkflowEvaluationResultSummary.Builder, com.clarifai.grpc.api.WorkflowEvaluationResultSummaryOrBuilder>(
                getSummary(),
                getParentForChildren(),
                isClean());
        summary_ = null;
      }
      return summaryBuilder_;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.WorkflowEvaluationResult)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.WorkflowEvaluationResult)
  private static final com.clarifai.grpc.api.WorkflowEvaluationResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.WorkflowEvaluationResult();
  }

  public static com.clarifai.grpc.api.WorkflowEvaluationResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WorkflowEvaluationResult>
      PARSER = new com.google.protobuf.AbstractParser<WorkflowEvaluationResult>() {
    @java.lang.Override
    public WorkflowEvaluationResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WorkflowEvaluationResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WorkflowEvaluationResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WorkflowEvaluationResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.WorkflowEvaluationResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

