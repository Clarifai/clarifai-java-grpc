// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * <pre>
 * StatValue
 * </pre>
 *
 * Protobuf type {@code clarifai.api.StatValue}
 */
public  final class StatValue extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.StatValue)
    StatValueOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StatValue.newBuilder() to construct.
  private StatValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StatValue() {
    tags_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StatValue();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StatValue(
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
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (time_ != null) {
              subBuilder = time_.toBuilder();
            }
            time_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(time_);
              time_ = subBuilder.buildPartial();
            }

            break;
          }
          case 21: {

            value_ = input.readFloat();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              tags_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            tags_.add(s);
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
        tags_ = tags_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_StatValue_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_StatValue_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.StatValue.class, com.clarifai.grpc.api.StatValue.Builder.class);
  }

  public static final int TIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp time_;
  /**
   * <pre>
   * The time of the event. Defaults to now().
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time = 1;</code>
   * @return Whether the time field is set.
   */
  public boolean hasTime() {
    return time_ != null;
  }
  /**
   * <pre>
   * The time of the event. Defaults to now().
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time = 1;</code>
   * @return The time.
   */
  public com.google.protobuf.Timestamp getTime() {
    return time_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : time_;
  }
  /**
   * <pre>
   * The time of the event. Defaults to now().
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time = 1;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getTimeOrBuilder() {
    return getTime();
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private float value_;
  /**
   * <pre>
   * A value for the metric you're recording.
   * </pre>
   *
   * <code>float value = 2;</code>
   * @return The value.
   */
  public float getValue() {
    return value_;
  }

  public static final int TAGS_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList tags_;
  /**
   * <pre>
   * List of tags to attach to this stat. Each should contain one colon so that the first part will
   * be used as a tag group while the second being the tag itself. For example: ["task_id:a",
   * "worker_id:1"]. These tag groups like "task_id" or "worker_id" are important for aggregating
   * values in the StatValueAggregateQuery.
   * </pre>
   *
   * <code>repeated string tags = 3;</code>
   * @return A list containing the tags.
   */
  public com.google.protobuf.ProtocolStringList
      getTagsList() {
    return tags_;
  }
  /**
   * <pre>
   * List of tags to attach to this stat. Each should contain one colon so that the first part will
   * be used as a tag group while the second being the tag itself. For example: ["task_id:a",
   * "worker_id:1"]. These tag groups like "task_id" or "worker_id" are important for aggregating
   * values in the StatValueAggregateQuery.
   * </pre>
   *
   * <code>repeated string tags = 3;</code>
   * @return The count of tags.
   */
  public int getTagsCount() {
    return tags_.size();
  }
  /**
   * <pre>
   * List of tags to attach to this stat. Each should contain one colon so that the first part will
   * be used as a tag group while the second being the tag itself. For example: ["task_id:a",
   * "worker_id:1"]. These tag groups like "task_id" or "worker_id" are important for aggregating
   * values in the StatValueAggregateQuery.
   * </pre>
   *
   * <code>repeated string tags = 3;</code>
   * @param index The index of the element to return.
   * @return The tags at the given index.
   */
  public java.lang.String getTags(int index) {
    return tags_.get(index);
  }
  /**
   * <pre>
   * List of tags to attach to this stat. Each should contain one colon so that the first part will
   * be used as a tag group while the second being the tag itself. For example: ["task_id:a",
   * "worker_id:1"]. These tag groups like "task_id" or "worker_id" are important for aggregating
   * values in the StatValueAggregateQuery.
   * </pre>
   *
   * <code>repeated string tags = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the tags at the given index.
   */
  public com.google.protobuf.ByteString
      getTagsBytes(int index) {
    return tags_.getByteString(index);
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
    if (time_ != null) {
      output.writeMessage(1, getTime());
    }
    if (value_ != 0F) {
      output.writeFloat(2, value_);
    }
    for (int i = 0; i < tags_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, tags_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (time_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTime());
    }
    if (value_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, value_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < tags_.size(); i++) {
        dataSize += computeStringSizeNoTag(tags_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getTagsList().size();
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
    if (!(obj instanceof com.clarifai.grpc.api.StatValue)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.StatValue other = (com.clarifai.grpc.api.StatValue) obj;

    if (hasTime() != other.hasTime()) return false;
    if (hasTime()) {
      if (!getTime()
          .equals(other.getTime())) return false;
    }
    if (java.lang.Float.floatToIntBits(getValue())
        != java.lang.Float.floatToIntBits(
            other.getValue())) return false;
    if (!getTagsList()
        .equals(other.getTagsList())) return false;
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
    if (hasTime()) {
      hash = (37 * hash) + TIME_FIELD_NUMBER;
      hash = (53 * hash) + getTime().hashCode();
    }
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getValue());
    if (getTagsCount() > 0) {
      hash = (37 * hash) + TAGS_FIELD_NUMBER;
      hash = (53 * hash) + getTagsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.StatValue parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.StatValue parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.StatValue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.StatValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.StatValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.StatValue parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.StatValue parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.StatValue parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.StatValue parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.StatValue parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.StatValue parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.StatValue parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.StatValue prototype) {
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
   * StatValue
   * </pre>
   *
   * Protobuf type {@code clarifai.api.StatValue}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.StatValue)
      com.clarifai.grpc.api.StatValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_StatValue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_StatValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.StatValue.class, com.clarifai.grpc.api.StatValue.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.StatValue.newBuilder()
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
      if (timeBuilder_ == null) {
        time_ = null;
      } else {
        time_ = null;
        timeBuilder_ = null;
      }
      value_ = 0F;

      tags_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_StatValue_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.StatValue getDefaultInstanceForType() {
      return com.clarifai.grpc.api.StatValue.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.StatValue build() {
      com.clarifai.grpc.api.StatValue result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.StatValue buildPartial() {
      com.clarifai.grpc.api.StatValue result = new com.clarifai.grpc.api.StatValue(this);
      int from_bitField0_ = bitField0_;
      if (timeBuilder_ == null) {
        result.time_ = time_;
      } else {
        result.time_ = timeBuilder_.build();
      }
      result.value_ = value_;
      if (((bitField0_ & 0x00000001) != 0)) {
        tags_ = tags_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.tags_ = tags_;
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
      if (other instanceof com.clarifai.grpc.api.StatValue) {
        return mergeFrom((com.clarifai.grpc.api.StatValue)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.StatValue other) {
      if (other == com.clarifai.grpc.api.StatValue.getDefaultInstance()) return this;
      if (other.hasTime()) {
        mergeTime(other.getTime());
      }
      if (other.getValue() != 0F) {
        setValue(other.getValue());
      }
      if (!other.tags_.isEmpty()) {
        if (tags_.isEmpty()) {
          tags_ = other.tags_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureTagsIsMutable();
          tags_.addAll(other.tags_);
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
      com.clarifai.grpc.api.StatValue parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.StatValue) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Timestamp time_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> timeBuilder_;
    /**
     * <pre>
     * The time of the event. Defaults to now().
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time = 1;</code>
     * @return Whether the time field is set.
     */
    public boolean hasTime() {
      return timeBuilder_ != null || time_ != null;
    }
    /**
     * <pre>
     * The time of the event. Defaults to now().
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time = 1;</code>
     * @return The time.
     */
    public com.google.protobuf.Timestamp getTime() {
      if (timeBuilder_ == null) {
        return time_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : time_;
      } else {
        return timeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The time of the event. Defaults to now().
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time = 1;</code>
     */
    public Builder setTime(com.google.protobuf.Timestamp value) {
      if (timeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        time_ = value;
        onChanged();
      } else {
        timeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The time of the event. Defaults to now().
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time = 1;</code>
     */
    public Builder setTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (timeBuilder_ == null) {
        time_ = builderForValue.build();
        onChanged();
      } else {
        timeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The time of the event. Defaults to now().
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time = 1;</code>
     */
    public Builder mergeTime(com.google.protobuf.Timestamp value) {
      if (timeBuilder_ == null) {
        if (time_ != null) {
          time_ =
            com.google.protobuf.Timestamp.newBuilder(time_).mergeFrom(value).buildPartial();
        } else {
          time_ = value;
        }
        onChanged();
      } else {
        timeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The time of the event. Defaults to now().
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time = 1;</code>
     */
    public Builder clearTime() {
      if (timeBuilder_ == null) {
        time_ = null;
        onChanged();
      } else {
        time_ = null;
        timeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The time of the event. Defaults to now().
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time = 1;</code>
     */
    public com.google.protobuf.Timestamp.Builder getTimeBuilder() {
      
      onChanged();
      return getTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The time of the event. Defaults to now().
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time = 1;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getTimeOrBuilder() {
      if (timeBuilder_ != null) {
        return timeBuilder_.getMessageOrBuilder();
      } else {
        return time_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : time_;
      }
    }
    /**
     * <pre>
     * The time of the event. Defaults to now().
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getTimeFieldBuilder() {
      if (timeBuilder_ == null) {
        timeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getTime(),
                getParentForChildren(),
                isClean());
        time_ = null;
      }
      return timeBuilder_;
    }

    private float value_ ;
    /**
     * <pre>
     * A value for the metric you're recording.
     * </pre>
     *
     * <code>float value = 2;</code>
     * @return The value.
     */
    public float getValue() {
      return value_;
    }
    /**
     * <pre>
     * A value for the metric you're recording.
     * </pre>
     *
     * <code>float value = 2;</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(float value) {
      
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A value for the metric you're recording.
     * </pre>
     *
     * <code>float value = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      
      value_ = 0F;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList tags_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureTagsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        tags_ = new com.google.protobuf.LazyStringArrayList(tags_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * List of tags to attach to this stat. Each should contain one colon so that the first part will
     * be used as a tag group while the second being the tag itself. For example: ["task_id:a",
     * "worker_id:1"]. These tag groups like "task_id" or "worker_id" are important for aggregating
     * values in the StatValueAggregateQuery.
     * </pre>
     *
     * <code>repeated string tags = 3;</code>
     * @return A list containing the tags.
     */
    public com.google.protobuf.ProtocolStringList
        getTagsList() {
      return tags_.getUnmodifiableView();
    }
    /**
     * <pre>
     * List of tags to attach to this stat. Each should contain one colon so that the first part will
     * be used as a tag group while the second being the tag itself. For example: ["task_id:a",
     * "worker_id:1"]. These tag groups like "task_id" or "worker_id" are important for aggregating
     * values in the StatValueAggregateQuery.
     * </pre>
     *
     * <code>repeated string tags = 3;</code>
     * @return The count of tags.
     */
    public int getTagsCount() {
      return tags_.size();
    }
    /**
     * <pre>
     * List of tags to attach to this stat. Each should contain one colon so that the first part will
     * be used as a tag group while the second being the tag itself. For example: ["task_id:a",
     * "worker_id:1"]. These tag groups like "task_id" or "worker_id" are important for aggregating
     * values in the StatValueAggregateQuery.
     * </pre>
     *
     * <code>repeated string tags = 3;</code>
     * @param index The index of the element to return.
     * @return The tags at the given index.
     */
    public java.lang.String getTags(int index) {
      return tags_.get(index);
    }
    /**
     * <pre>
     * List of tags to attach to this stat. Each should contain one colon so that the first part will
     * be used as a tag group while the second being the tag itself. For example: ["task_id:a",
     * "worker_id:1"]. These tag groups like "task_id" or "worker_id" are important for aggregating
     * values in the StatValueAggregateQuery.
     * </pre>
     *
     * <code>repeated string tags = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the tags at the given index.
     */
    public com.google.protobuf.ByteString
        getTagsBytes(int index) {
      return tags_.getByteString(index);
    }
    /**
     * <pre>
     * List of tags to attach to this stat. Each should contain one colon so that the first part will
     * be used as a tag group while the second being the tag itself. For example: ["task_id:a",
     * "worker_id:1"]. These tag groups like "task_id" or "worker_id" are important for aggregating
     * values in the StatValueAggregateQuery.
     * </pre>
     *
     * <code>repeated string tags = 3;</code>
     * @param index The index to set the value at.
     * @param value The tags to set.
     * @return This builder for chaining.
     */
    public Builder setTags(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTagsIsMutable();
      tags_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of tags to attach to this stat. Each should contain one colon so that the first part will
     * be used as a tag group while the second being the tag itself. For example: ["task_id:a",
     * "worker_id:1"]. These tag groups like "task_id" or "worker_id" are important for aggregating
     * values in the StatValueAggregateQuery.
     * </pre>
     *
     * <code>repeated string tags = 3;</code>
     * @param value The tags to add.
     * @return This builder for chaining.
     */
    public Builder addTags(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTagsIsMutable();
      tags_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of tags to attach to this stat. Each should contain one colon so that the first part will
     * be used as a tag group while the second being the tag itself. For example: ["task_id:a",
     * "worker_id:1"]. These tag groups like "task_id" or "worker_id" are important for aggregating
     * values in the StatValueAggregateQuery.
     * </pre>
     *
     * <code>repeated string tags = 3;</code>
     * @param values The tags to add.
     * @return This builder for chaining.
     */
    public Builder addAllTags(
        java.lang.Iterable<java.lang.String> values) {
      ensureTagsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, tags_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of tags to attach to this stat. Each should contain one colon so that the first part will
     * be used as a tag group while the second being the tag itself. For example: ["task_id:a",
     * "worker_id:1"]. These tag groups like "task_id" or "worker_id" are important for aggregating
     * values in the StatValueAggregateQuery.
     * </pre>
     *
     * <code>repeated string tags = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTags() {
      tags_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of tags to attach to this stat. Each should contain one colon so that the first part will
     * be used as a tag group while the second being the tag itself. For example: ["task_id:a",
     * "worker_id:1"]. These tag groups like "task_id" or "worker_id" are important for aggregating
     * values in the StatValueAggregateQuery.
     * </pre>
     *
     * <code>repeated string tags = 3;</code>
     * @param value The bytes of the tags to add.
     * @return This builder for chaining.
     */
    public Builder addTagsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureTagsIsMutable();
      tags_.add(value);
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.StatValue)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.StatValue)
  private static final com.clarifai.grpc.api.StatValue DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.StatValue();
  }

  public static com.clarifai.grpc.api.StatValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StatValue>
      PARSER = new com.google.protobuf.AbstractParser<StatValue>() {
    @java.lang.Override
    public StatValue parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StatValue(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StatValue> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StatValue> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.StatValue getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

