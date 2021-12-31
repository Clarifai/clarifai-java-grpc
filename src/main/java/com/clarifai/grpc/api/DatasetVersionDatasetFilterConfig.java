// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * Protobuf type {@code clarifai.api.DatasetVersionDatasetFilterConfig}
 */
public  final class DatasetVersionDatasetFilterConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.DatasetVersionDatasetFilterConfig)
    DatasetVersionDatasetFilterConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DatasetVersionDatasetFilterConfig.newBuilder() to construct.
  private DatasetVersionDatasetFilterConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DatasetVersionDatasetFilterConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DatasetVersionDatasetFilterConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DatasetVersionDatasetFilterConfig(
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
            com.clarifai.grpc.api.DatasetFilter.Builder subBuilder = null;
            if (datasetFilter_ != null) {
              subBuilder = datasetFilter_.toBuilder();
            }
            datasetFilter_ = input.readMessage(com.clarifai.grpc.api.DatasetFilter.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(datasetFilter_);
              datasetFilter_ = subBuilder.buildPartial();
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
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_DatasetVersionDatasetFilterConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_DatasetVersionDatasetFilterConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.DatasetVersionDatasetFilterConfig.class, com.clarifai.grpc.api.DatasetVersionDatasetFilterConfig.Builder.class);
  }

  public static final int DATASET_FILTER_FIELD_NUMBER = 1;
  private com.clarifai.grpc.api.DatasetFilter datasetFilter_;
  /**
   * <code>.clarifai.api.DatasetFilter dataset_filter = 1;</code>
   * @return Whether the datasetFilter field is set.
   */
  public boolean hasDatasetFilter() {
    return datasetFilter_ != null;
  }
  /**
   * <code>.clarifai.api.DatasetFilter dataset_filter = 1;</code>
   * @return The datasetFilter.
   */
  public com.clarifai.grpc.api.DatasetFilter getDatasetFilter() {
    return datasetFilter_ == null ? com.clarifai.grpc.api.DatasetFilter.getDefaultInstance() : datasetFilter_;
  }
  /**
   * <code>.clarifai.api.DatasetFilter dataset_filter = 1;</code>
   */
  public com.clarifai.grpc.api.DatasetFilterOrBuilder getDatasetFilterOrBuilder() {
    return getDatasetFilter();
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
    if (datasetFilter_ != null) {
      output.writeMessage(1, getDatasetFilter());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (datasetFilter_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDatasetFilter());
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
    if (!(obj instanceof com.clarifai.grpc.api.DatasetVersionDatasetFilterConfig)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.DatasetVersionDatasetFilterConfig other = (com.clarifai.grpc.api.DatasetVersionDatasetFilterConfig) obj;

    if (hasDatasetFilter() != other.hasDatasetFilter()) return false;
    if (hasDatasetFilter()) {
      if (!getDatasetFilter()
          .equals(other.getDatasetFilter())) return false;
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
    if (hasDatasetFilter()) {
      hash = (37 * hash) + DATASET_FILTER_FIELD_NUMBER;
      hash = (53 * hash) + getDatasetFilter().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.DatasetVersionDatasetFilterConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.DatasetVersionDatasetFilterConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.DatasetVersionDatasetFilterConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.DatasetVersionDatasetFilterConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.DatasetVersionDatasetFilterConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.DatasetVersionDatasetFilterConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.DatasetVersionDatasetFilterConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.DatasetVersionDatasetFilterConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.DatasetVersionDatasetFilterConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.DatasetVersionDatasetFilterConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.DatasetVersionDatasetFilterConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.DatasetVersionDatasetFilterConfig parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.DatasetVersionDatasetFilterConfig prototype) {
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
   * Protobuf type {@code clarifai.api.DatasetVersionDatasetFilterConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.DatasetVersionDatasetFilterConfig)
      com.clarifai.grpc.api.DatasetVersionDatasetFilterConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_DatasetVersionDatasetFilterConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_DatasetVersionDatasetFilterConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.DatasetVersionDatasetFilterConfig.class, com.clarifai.grpc.api.DatasetVersionDatasetFilterConfig.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.DatasetVersionDatasetFilterConfig.newBuilder()
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
      if (datasetFilterBuilder_ == null) {
        datasetFilter_ = null;
      } else {
        datasetFilter_ = null;
        datasetFilterBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_DatasetVersionDatasetFilterConfig_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.DatasetVersionDatasetFilterConfig getDefaultInstanceForType() {
      return com.clarifai.grpc.api.DatasetVersionDatasetFilterConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.DatasetVersionDatasetFilterConfig build() {
      com.clarifai.grpc.api.DatasetVersionDatasetFilterConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.DatasetVersionDatasetFilterConfig buildPartial() {
      com.clarifai.grpc.api.DatasetVersionDatasetFilterConfig result = new com.clarifai.grpc.api.DatasetVersionDatasetFilterConfig(this);
      if (datasetFilterBuilder_ == null) {
        result.datasetFilter_ = datasetFilter_;
      } else {
        result.datasetFilter_ = datasetFilterBuilder_.build();
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
      if (other instanceof com.clarifai.grpc.api.DatasetVersionDatasetFilterConfig) {
        return mergeFrom((com.clarifai.grpc.api.DatasetVersionDatasetFilterConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.DatasetVersionDatasetFilterConfig other) {
      if (other == com.clarifai.grpc.api.DatasetVersionDatasetFilterConfig.getDefaultInstance()) return this;
      if (other.hasDatasetFilter()) {
        mergeDatasetFilter(other.getDatasetFilter());
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
      com.clarifai.grpc.api.DatasetVersionDatasetFilterConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.DatasetVersionDatasetFilterConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.clarifai.grpc.api.DatasetFilter datasetFilter_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.DatasetFilter, com.clarifai.grpc.api.DatasetFilter.Builder, com.clarifai.grpc.api.DatasetFilterOrBuilder> datasetFilterBuilder_;
    /**
     * <code>.clarifai.api.DatasetFilter dataset_filter = 1;</code>
     * @return Whether the datasetFilter field is set.
     */
    public boolean hasDatasetFilter() {
      return datasetFilterBuilder_ != null || datasetFilter_ != null;
    }
    /**
     * <code>.clarifai.api.DatasetFilter dataset_filter = 1;</code>
     * @return The datasetFilter.
     */
    public com.clarifai.grpc.api.DatasetFilter getDatasetFilter() {
      if (datasetFilterBuilder_ == null) {
        return datasetFilter_ == null ? com.clarifai.grpc.api.DatasetFilter.getDefaultInstance() : datasetFilter_;
      } else {
        return datasetFilterBuilder_.getMessage();
      }
    }
    /**
     * <code>.clarifai.api.DatasetFilter dataset_filter = 1;</code>
     */
    public Builder setDatasetFilter(com.clarifai.grpc.api.DatasetFilter value) {
      if (datasetFilterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        datasetFilter_ = value;
        onChanged();
      } else {
        datasetFilterBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.clarifai.api.DatasetFilter dataset_filter = 1;</code>
     */
    public Builder setDatasetFilter(
        com.clarifai.grpc.api.DatasetFilter.Builder builderForValue) {
      if (datasetFilterBuilder_ == null) {
        datasetFilter_ = builderForValue.build();
        onChanged();
      } else {
        datasetFilterBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.clarifai.api.DatasetFilter dataset_filter = 1;</code>
     */
    public Builder mergeDatasetFilter(com.clarifai.grpc.api.DatasetFilter value) {
      if (datasetFilterBuilder_ == null) {
        if (datasetFilter_ != null) {
          datasetFilter_ =
            com.clarifai.grpc.api.DatasetFilter.newBuilder(datasetFilter_).mergeFrom(value).buildPartial();
        } else {
          datasetFilter_ = value;
        }
        onChanged();
      } else {
        datasetFilterBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.clarifai.api.DatasetFilter dataset_filter = 1;</code>
     */
    public Builder clearDatasetFilter() {
      if (datasetFilterBuilder_ == null) {
        datasetFilter_ = null;
        onChanged();
      } else {
        datasetFilter_ = null;
        datasetFilterBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.clarifai.api.DatasetFilter dataset_filter = 1;</code>
     */
    public com.clarifai.grpc.api.DatasetFilter.Builder getDatasetFilterBuilder() {
      
      onChanged();
      return getDatasetFilterFieldBuilder().getBuilder();
    }
    /**
     * <code>.clarifai.api.DatasetFilter dataset_filter = 1;</code>
     */
    public com.clarifai.grpc.api.DatasetFilterOrBuilder getDatasetFilterOrBuilder() {
      if (datasetFilterBuilder_ != null) {
        return datasetFilterBuilder_.getMessageOrBuilder();
      } else {
        return datasetFilter_ == null ?
            com.clarifai.grpc.api.DatasetFilter.getDefaultInstance() : datasetFilter_;
      }
    }
    /**
     * <code>.clarifai.api.DatasetFilter dataset_filter = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.DatasetFilter, com.clarifai.grpc.api.DatasetFilter.Builder, com.clarifai.grpc.api.DatasetFilterOrBuilder> 
        getDatasetFilterFieldBuilder() {
      if (datasetFilterBuilder_ == null) {
        datasetFilterBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.clarifai.grpc.api.DatasetFilter, com.clarifai.grpc.api.DatasetFilter.Builder, com.clarifai.grpc.api.DatasetFilterOrBuilder>(
                getDatasetFilter(),
                getParentForChildren(),
                isClean());
        datasetFilter_ = null;
      }
      return datasetFilterBuilder_;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.DatasetVersionDatasetFilterConfig)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.DatasetVersionDatasetFilterConfig)
  private static final com.clarifai.grpc.api.DatasetVersionDatasetFilterConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.DatasetVersionDatasetFilterConfig();
  }

  public static com.clarifai.grpc.api.DatasetVersionDatasetFilterConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DatasetVersionDatasetFilterConfig>
      PARSER = new com.google.protobuf.AbstractParser<DatasetVersionDatasetFilterConfig>() {
    @java.lang.Override
    public DatasetVersionDatasetFilterConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DatasetVersionDatasetFilterConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DatasetVersionDatasetFilterConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DatasetVersionDatasetFilterConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.DatasetVersionDatasetFilterConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
