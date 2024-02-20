// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * Protobuf type {@code clarifai.api.TaskConceptAutoAnnotationConfig}
 */
public final class TaskConceptAutoAnnotationConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.TaskConceptAutoAnnotationConfig)
    TaskConceptAutoAnnotationConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TaskConceptAutoAnnotationConfig.newBuilder() to construct.
  private TaskConceptAutoAnnotationConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TaskConceptAutoAnnotationConfig() {
    statusCode_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TaskConceptAutoAnnotationConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TaskConceptAutoAnnotationConfig(
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

            annotationDataTypes_ = input.readUInt32();
            break;
          }
          case 18: {
            com.clarifai.grpc.api.ThresholdRange.Builder subBuilder = null;
            if (thresholdRange_ != null) {
              subBuilder = thresholdRange_.toBuilder();
            }
            thresholdRange_ = input.readMessage(com.clarifai.grpc.api.ThresholdRange.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(thresholdRange_);
              thresholdRange_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            statusCode_ = rawValue;
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
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_TaskConceptAutoAnnotationConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_TaskConceptAutoAnnotationConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.TaskConceptAutoAnnotationConfig.class, com.clarifai.grpc.api.TaskConceptAutoAnnotationConfig.Builder.class);
  }

  public static final int ANNOTATION_DATA_TYPES_FIELD_NUMBER = 1;
  private int annotationDataTypes_;
  /**
   * <pre>
   * Filter annotations by their annotation data type.
   * This is a bit-mask field that holds multiple AnnotationDataType values that are combined in an OR fashion.
   * Example: if annotation_data_types = 34, then we filter annotations that appear as a mask or a bounding box,
   * because MASK = 32 and BOUNDING_BOX = 2.
   * </pre>
   *
   * <code>uint32 annotation_data_types = 1;</code>
   * @return The annotationDataTypes.
   */
  @java.lang.Override
  public int getAnnotationDataTypes() {
    return annotationDataTypes_;
  }

  public static final int THRESHOLD_RANGE_FIELD_NUMBER = 2;
  private com.clarifai.grpc.api.ThresholdRange thresholdRange_;
  /**
   * <pre>
   * Filter annotations by concept value.
   * Only concepts that fit in the threshold will be used to generate annotations.
   * </pre>
   *
   * <code>.clarifai.api.ThresholdRange threshold_range = 2;</code>
   * @return Whether the thresholdRange field is set.
   */
  @java.lang.Override
  public boolean hasThresholdRange() {
    return thresholdRange_ != null;
  }
  /**
   * <pre>
   * Filter annotations by concept value.
   * Only concepts that fit in the threshold will be used to generate annotations.
   * </pre>
   *
   * <code>.clarifai.api.ThresholdRange threshold_range = 2;</code>
   * @return The thresholdRange.
   */
  @java.lang.Override
  public com.clarifai.grpc.api.ThresholdRange getThresholdRange() {
    return thresholdRange_ == null ? com.clarifai.grpc.api.ThresholdRange.getDefaultInstance() : thresholdRange_;
  }
  /**
   * <pre>
   * Filter annotations by concept value.
   * Only concepts that fit in the threshold will be used to generate annotations.
   * </pre>
   *
   * <code>.clarifai.api.ThresholdRange threshold_range = 2;</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.ThresholdRangeOrBuilder getThresholdRangeOrBuilder() {
    return getThresholdRange();
  }

  public static final int STATUS_CODE_FIELD_NUMBER = 3;
  private int statusCode_;
  /**
   * <pre>
   * The output annotations will be created using this status code.
   * </pre>
   *
   * <code>.clarifai.api.status.StatusCode status_code = 3;</code>
   * @return The enum numeric value on the wire for statusCode.
   */
  @java.lang.Override public int getStatusCodeValue() {
    return statusCode_;
  }
  /**
   * <pre>
   * The output annotations will be created using this status code.
   * </pre>
   *
   * <code>.clarifai.api.status.StatusCode status_code = 3;</code>
   * @return The statusCode.
   */
  @java.lang.Override public com.clarifai.grpc.api.status.StatusCode getStatusCode() {
    @SuppressWarnings("deprecation")
    com.clarifai.grpc.api.status.StatusCode result = com.clarifai.grpc.api.status.StatusCode.valueOf(statusCode_);
    return result == null ? com.clarifai.grpc.api.status.StatusCode.UNRECOGNIZED : result;
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
    if (annotationDataTypes_ != 0) {
      output.writeUInt32(1, annotationDataTypes_);
    }
    if (thresholdRange_ != null) {
      output.writeMessage(2, getThresholdRange());
    }
    if (statusCode_ != com.clarifai.grpc.api.status.StatusCode.ZERO.getNumber()) {
      output.writeEnum(3, statusCode_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (annotationDataTypes_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, annotationDataTypes_);
    }
    if (thresholdRange_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getThresholdRange());
    }
    if (statusCode_ != com.clarifai.grpc.api.status.StatusCode.ZERO.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, statusCode_);
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
    if (!(obj instanceof com.clarifai.grpc.api.TaskConceptAutoAnnotationConfig)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.TaskConceptAutoAnnotationConfig other = (com.clarifai.grpc.api.TaskConceptAutoAnnotationConfig) obj;

    if (getAnnotationDataTypes()
        != other.getAnnotationDataTypes()) return false;
    if (hasThresholdRange() != other.hasThresholdRange()) return false;
    if (hasThresholdRange()) {
      if (!getThresholdRange()
          .equals(other.getThresholdRange())) return false;
    }
    if (statusCode_ != other.statusCode_) return false;
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
    hash = (37 * hash) + ANNOTATION_DATA_TYPES_FIELD_NUMBER;
    hash = (53 * hash) + getAnnotationDataTypes();
    if (hasThresholdRange()) {
      hash = (37 * hash) + THRESHOLD_RANGE_FIELD_NUMBER;
      hash = (53 * hash) + getThresholdRange().hashCode();
    }
    hash = (37 * hash) + STATUS_CODE_FIELD_NUMBER;
    hash = (53 * hash) + statusCode_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.TaskConceptAutoAnnotationConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.TaskConceptAutoAnnotationConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.TaskConceptAutoAnnotationConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.TaskConceptAutoAnnotationConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.TaskConceptAutoAnnotationConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.TaskConceptAutoAnnotationConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.TaskConceptAutoAnnotationConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.TaskConceptAutoAnnotationConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.TaskConceptAutoAnnotationConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.TaskConceptAutoAnnotationConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.TaskConceptAutoAnnotationConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.TaskConceptAutoAnnotationConfig parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.TaskConceptAutoAnnotationConfig prototype) {
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
   * Protobuf type {@code clarifai.api.TaskConceptAutoAnnotationConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.TaskConceptAutoAnnotationConfig)
      com.clarifai.grpc.api.TaskConceptAutoAnnotationConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_TaskConceptAutoAnnotationConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_TaskConceptAutoAnnotationConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.TaskConceptAutoAnnotationConfig.class, com.clarifai.grpc.api.TaskConceptAutoAnnotationConfig.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.TaskConceptAutoAnnotationConfig.newBuilder()
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
      annotationDataTypes_ = 0;

      if (thresholdRangeBuilder_ == null) {
        thresholdRange_ = null;
      } else {
        thresholdRange_ = null;
        thresholdRangeBuilder_ = null;
      }
      statusCode_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_TaskConceptAutoAnnotationConfig_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.TaskConceptAutoAnnotationConfig getDefaultInstanceForType() {
      return com.clarifai.grpc.api.TaskConceptAutoAnnotationConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.TaskConceptAutoAnnotationConfig build() {
      com.clarifai.grpc.api.TaskConceptAutoAnnotationConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.TaskConceptAutoAnnotationConfig buildPartial() {
      com.clarifai.grpc.api.TaskConceptAutoAnnotationConfig result = new com.clarifai.grpc.api.TaskConceptAutoAnnotationConfig(this);
      result.annotationDataTypes_ = annotationDataTypes_;
      if (thresholdRangeBuilder_ == null) {
        result.thresholdRange_ = thresholdRange_;
      } else {
        result.thresholdRange_ = thresholdRangeBuilder_.build();
      }
      result.statusCode_ = statusCode_;
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
      if (other instanceof com.clarifai.grpc.api.TaskConceptAutoAnnotationConfig) {
        return mergeFrom((com.clarifai.grpc.api.TaskConceptAutoAnnotationConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.TaskConceptAutoAnnotationConfig other) {
      if (other == com.clarifai.grpc.api.TaskConceptAutoAnnotationConfig.getDefaultInstance()) return this;
      if (other.getAnnotationDataTypes() != 0) {
        setAnnotationDataTypes(other.getAnnotationDataTypes());
      }
      if (other.hasThresholdRange()) {
        mergeThresholdRange(other.getThresholdRange());
      }
      if (other.statusCode_ != 0) {
        setStatusCodeValue(other.getStatusCodeValue());
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
      com.clarifai.grpc.api.TaskConceptAutoAnnotationConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.TaskConceptAutoAnnotationConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int annotationDataTypes_ ;
    /**
     * <pre>
     * Filter annotations by their annotation data type.
     * This is a bit-mask field that holds multiple AnnotationDataType values that are combined in an OR fashion.
     * Example: if annotation_data_types = 34, then we filter annotations that appear as a mask or a bounding box,
     * because MASK = 32 and BOUNDING_BOX = 2.
     * </pre>
     *
     * <code>uint32 annotation_data_types = 1;</code>
     * @return The annotationDataTypes.
     */
    @java.lang.Override
    public int getAnnotationDataTypes() {
      return annotationDataTypes_;
    }
    /**
     * <pre>
     * Filter annotations by their annotation data type.
     * This is a bit-mask field that holds multiple AnnotationDataType values that are combined in an OR fashion.
     * Example: if annotation_data_types = 34, then we filter annotations that appear as a mask or a bounding box,
     * because MASK = 32 and BOUNDING_BOX = 2.
     * </pre>
     *
     * <code>uint32 annotation_data_types = 1;</code>
     * @param value The annotationDataTypes to set.
     * @return This builder for chaining.
     */
    public Builder setAnnotationDataTypes(int value) {
      
      annotationDataTypes_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Filter annotations by their annotation data type.
     * This is a bit-mask field that holds multiple AnnotationDataType values that are combined in an OR fashion.
     * Example: if annotation_data_types = 34, then we filter annotations that appear as a mask or a bounding box,
     * because MASK = 32 and BOUNDING_BOX = 2.
     * </pre>
     *
     * <code>uint32 annotation_data_types = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAnnotationDataTypes() {
      
      annotationDataTypes_ = 0;
      onChanged();
      return this;
    }

    private com.clarifai.grpc.api.ThresholdRange thresholdRange_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.ThresholdRange, com.clarifai.grpc.api.ThresholdRange.Builder, com.clarifai.grpc.api.ThresholdRangeOrBuilder> thresholdRangeBuilder_;
    /**
     * <pre>
     * Filter annotations by concept value.
     * Only concepts that fit in the threshold will be used to generate annotations.
     * </pre>
     *
     * <code>.clarifai.api.ThresholdRange threshold_range = 2;</code>
     * @return Whether the thresholdRange field is set.
     */
    public boolean hasThresholdRange() {
      return thresholdRangeBuilder_ != null || thresholdRange_ != null;
    }
    /**
     * <pre>
     * Filter annotations by concept value.
     * Only concepts that fit in the threshold will be used to generate annotations.
     * </pre>
     *
     * <code>.clarifai.api.ThresholdRange threshold_range = 2;</code>
     * @return The thresholdRange.
     */
    public com.clarifai.grpc.api.ThresholdRange getThresholdRange() {
      if (thresholdRangeBuilder_ == null) {
        return thresholdRange_ == null ? com.clarifai.grpc.api.ThresholdRange.getDefaultInstance() : thresholdRange_;
      } else {
        return thresholdRangeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Filter annotations by concept value.
     * Only concepts that fit in the threshold will be used to generate annotations.
     * </pre>
     *
     * <code>.clarifai.api.ThresholdRange threshold_range = 2;</code>
     */
    public Builder setThresholdRange(com.clarifai.grpc.api.ThresholdRange value) {
      if (thresholdRangeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        thresholdRange_ = value;
        onChanged();
      } else {
        thresholdRangeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Filter annotations by concept value.
     * Only concepts that fit in the threshold will be used to generate annotations.
     * </pre>
     *
     * <code>.clarifai.api.ThresholdRange threshold_range = 2;</code>
     */
    public Builder setThresholdRange(
        com.clarifai.grpc.api.ThresholdRange.Builder builderForValue) {
      if (thresholdRangeBuilder_ == null) {
        thresholdRange_ = builderForValue.build();
        onChanged();
      } else {
        thresholdRangeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Filter annotations by concept value.
     * Only concepts that fit in the threshold will be used to generate annotations.
     * </pre>
     *
     * <code>.clarifai.api.ThresholdRange threshold_range = 2;</code>
     */
    public Builder mergeThresholdRange(com.clarifai.grpc.api.ThresholdRange value) {
      if (thresholdRangeBuilder_ == null) {
        if (thresholdRange_ != null) {
          thresholdRange_ =
            com.clarifai.grpc.api.ThresholdRange.newBuilder(thresholdRange_).mergeFrom(value).buildPartial();
        } else {
          thresholdRange_ = value;
        }
        onChanged();
      } else {
        thresholdRangeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Filter annotations by concept value.
     * Only concepts that fit in the threshold will be used to generate annotations.
     * </pre>
     *
     * <code>.clarifai.api.ThresholdRange threshold_range = 2;</code>
     */
    public Builder clearThresholdRange() {
      if (thresholdRangeBuilder_ == null) {
        thresholdRange_ = null;
        onChanged();
      } else {
        thresholdRange_ = null;
        thresholdRangeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Filter annotations by concept value.
     * Only concepts that fit in the threshold will be used to generate annotations.
     * </pre>
     *
     * <code>.clarifai.api.ThresholdRange threshold_range = 2;</code>
     */
    public com.clarifai.grpc.api.ThresholdRange.Builder getThresholdRangeBuilder() {
      
      onChanged();
      return getThresholdRangeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Filter annotations by concept value.
     * Only concepts that fit in the threshold will be used to generate annotations.
     * </pre>
     *
     * <code>.clarifai.api.ThresholdRange threshold_range = 2;</code>
     */
    public com.clarifai.grpc.api.ThresholdRangeOrBuilder getThresholdRangeOrBuilder() {
      if (thresholdRangeBuilder_ != null) {
        return thresholdRangeBuilder_.getMessageOrBuilder();
      } else {
        return thresholdRange_ == null ?
            com.clarifai.grpc.api.ThresholdRange.getDefaultInstance() : thresholdRange_;
      }
    }
    /**
     * <pre>
     * Filter annotations by concept value.
     * Only concepts that fit in the threshold will be used to generate annotations.
     * </pre>
     *
     * <code>.clarifai.api.ThresholdRange threshold_range = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.ThresholdRange, com.clarifai.grpc.api.ThresholdRange.Builder, com.clarifai.grpc.api.ThresholdRangeOrBuilder> 
        getThresholdRangeFieldBuilder() {
      if (thresholdRangeBuilder_ == null) {
        thresholdRangeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.clarifai.grpc.api.ThresholdRange, com.clarifai.grpc.api.ThresholdRange.Builder, com.clarifai.grpc.api.ThresholdRangeOrBuilder>(
                getThresholdRange(),
                getParentForChildren(),
                isClean());
        thresholdRange_ = null;
      }
      return thresholdRangeBuilder_;
    }

    private int statusCode_ = 0;
    /**
     * <pre>
     * The output annotations will be created using this status code.
     * </pre>
     *
     * <code>.clarifai.api.status.StatusCode status_code = 3;</code>
     * @return The enum numeric value on the wire for statusCode.
     */
    @java.lang.Override public int getStatusCodeValue() {
      return statusCode_;
    }
    /**
     * <pre>
     * The output annotations will be created using this status code.
     * </pre>
     *
     * <code>.clarifai.api.status.StatusCode status_code = 3;</code>
     * @param value The enum numeric value on the wire for statusCode to set.
     * @return This builder for chaining.
     */
    public Builder setStatusCodeValue(int value) {
      
      statusCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The output annotations will be created using this status code.
     * </pre>
     *
     * <code>.clarifai.api.status.StatusCode status_code = 3;</code>
     * @return The statusCode.
     */
    @java.lang.Override
    public com.clarifai.grpc.api.status.StatusCode getStatusCode() {
      @SuppressWarnings("deprecation")
      com.clarifai.grpc.api.status.StatusCode result = com.clarifai.grpc.api.status.StatusCode.valueOf(statusCode_);
      return result == null ? com.clarifai.grpc.api.status.StatusCode.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The output annotations will be created using this status code.
     * </pre>
     *
     * <code>.clarifai.api.status.StatusCode status_code = 3;</code>
     * @param value The statusCode to set.
     * @return This builder for chaining.
     */
    public Builder setStatusCode(com.clarifai.grpc.api.status.StatusCode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      statusCode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The output annotations will be created using this status code.
     * </pre>
     *
     * <code>.clarifai.api.status.StatusCode status_code = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatusCode() {
      
      statusCode_ = 0;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.TaskConceptAutoAnnotationConfig)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.TaskConceptAutoAnnotationConfig)
  private static final com.clarifai.grpc.api.TaskConceptAutoAnnotationConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.TaskConceptAutoAnnotationConfig();
  }

  public static com.clarifai.grpc.api.TaskConceptAutoAnnotationConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TaskConceptAutoAnnotationConfig>
      PARSER = new com.google.protobuf.AbstractParser<TaskConceptAutoAnnotationConfig>() {
    @java.lang.Override
    public TaskConceptAutoAnnotationConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TaskConceptAutoAnnotationConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TaskConceptAutoAnnotationConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TaskConceptAutoAnnotationConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.TaskConceptAutoAnnotationConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

