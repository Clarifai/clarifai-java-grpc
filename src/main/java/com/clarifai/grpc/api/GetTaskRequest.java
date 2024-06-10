// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

/**
 * <pre>
 * Request to get one task.
 * </pre>
 *
 * Protobuf type {@code clarifai.api.GetTaskRequest}
 */
public final class GetTaskRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.GetTaskRequest)
    GetTaskRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetTaskRequest.newBuilder() to construct.
  private GetTaskRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetTaskRequest() {
    taskId_ = "";
    additionalFields_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetTaskRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetTaskRequest(
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
            com.clarifai.grpc.api.UserAppIDSet.Builder subBuilder = null;
            if (userAppId_ != null) {
              subBuilder = userAppId_.toBuilder();
            }
            userAppId_ = input.readMessage(com.clarifai.grpc.api.UserAppIDSet.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(userAppId_);
              userAppId_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            taskId_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              additionalFields_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            additionalFields_.add(s);
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
        additionalFields_ = additionalFields_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_GetTaskRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_GetTaskRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.GetTaskRequest.class, com.clarifai.grpc.api.GetTaskRequest.Builder.class);
  }

  public static final int USER_APP_ID_FIELD_NUMBER = 1;
  private com.clarifai.grpc.api.UserAppIDSet userAppId_;
  /**
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   * @return Whether the userAppId field is set.
   */
  @java.lang.Override
  public boolean hasUserAppId() {
    return userAppId_ != null;
  }
  /**
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   * @return The userAppId.
   */
  @java.lang.Override
  public com.clarifai.grpc.api.UserAppIDSet getUserAppId() {
    return userAppId_ == null ? com.clarifai.grpc.api.UserAppIDSet.getDefaultInstance() : userAppId_;
  }
  /**
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.UserAppIDSetOrBuilder getUserAppIdOrBuilder() {
    return getUserAppId();
  }

  public static final int TASK_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object taskId_;
  /**
   * <code>string task_id = 2;</code>
   * @return The taskId.
   */
  @java.lang.Override
  public java.lang.String getTaskId() {
    java.lang.Object ref = taskId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      taskId_ = s;
      return s;
    }
  }
  /**
   * <code>string task_id = 2;</code>
   * @return The bytes for taskId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTaskIdBytes() {
    java.lang.Object ref = taskId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      taskId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ADDITIONAL_FIELDS_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList additionalFields_;
  /**
   * <pre>
   * (optional URL parameter) List of additional fields to be included in the response.
   * Currently supported additional fields:
   * - all
   * - worker.users
   * - review.users
   * - metrics.input_source.inputs_count_estimated
   * - metrics.work.inputs_count_estimated
   * - metrics.work.inputs_percent_estimated
   * - metrics.review.inputs_count_estimated
   * - metrics.review.inputs_percent_estimated
   * </pre>
   *
   * <code>repeated string additional_fields = 3;</code>
   * @return A list containing the additionalFields.
   */
  public com.google.protobuf.ProtocolStringList
      getAdditionalFieldsList() {
    return additionalFields_;
  }
  /**
   * <pre>
   * (optional URL parameter) List of additional fields to be included in the response.
   * Currently supported additional fields:
   * - all
   * - worker.users
   * - review.users
   * - metrics.input_source.inputs_count_estimated
   * - metrics.work.inputs_count_estimated
   * - metrics.work.inputs_percent_estimated
   * - metrics.review.inputs_count_estimated
   * - metrics.review.inputs_percent_estimated
   * </pre>
   *
   * <code>repeated string additional_fields = 3;</code>
   * @return The count of additionalFields.
   */
  public int getAdditionalFieldsCount() {
    return additionalFields_.size();
  }
  /**
   * <pre>
   * (optional URL parameter) List of additional fields to be included in the response.
   * Currently supported additional fields:
   * - all
   * - worker.users
   * - review.users
   * - metrics.input_source.inputs_count_estimated
   * - metrics.work.inputs_count_estimated
   * - metrics.work.inputs_percent_estimated
   * - metrics.review.inputs_count_estimated
   * - metrics.review.inputs_percent_estimated
   * </pre>
   *
   * <code>repeated string additional_fields = 3;</code>
   * @param index The index of the element to return.
   * @return The additionalFields at the given index.
   */
  public java.lang.String getAdditionalFields(int index) {
    return additionalFields_.get(index);
  }
  /**
   * <pre>
   * (optional URL parameter) List of additional fields to be included in the response.
   * Currently supported additional fields:
   * - all
   * - worker.users
   * - review.users
   * - metrics.input_source.inputs_count_estimated
   * - metrics.work.inputs_count_estimated
   * - metrics.work.inputs_percent_estimated
   * - metrics.review.inputs_count_estimated
   * - metrics.review.inputs_percent_estimated
   * </pre>
   *
   * <code>repeated string additional_fields = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the additionalFields at the given index.
   */
  public com.google.protobuf.ByteString
      getAdditionalFieldsBytes(int index) {
    return additionalFields_.getByteString(index);
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
    if (userAppId_ != null) {
      output.writeMessage(1, getUserAppId());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(taskId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, taskId_);
    }
    for (int i = 0; i < additionalFields_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, additionalFields_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (userAppId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUserAppId());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(taskId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, taskId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < additionalFields_.size(); i++) {
        dataSize += computeStringSizeNoTag(additionalFields_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAdditionalFieldsList().size();
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
    if (!(obj instanceof com.clarifai.grpc.api.GetTaskRequest)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.GetTaskRequest other = (com.clarifai.grpc.api.GetTaskRequest) obj;

    if (hasUserAppId() != other.hasUserAppId()) return false;
    if (hasUserAppId()) {
      if (!getUserAppId()
          .equals(other.getUserAppId())) return false;
    }
    if (!getTaskId()
        .equals(other.getTaskId())) return false;
    if (!getAdditionalFieldsList()
        .equals(other.getAdditionalFieldsList())) return false;
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
    if (hasUserAppId()) {
      hash = (37 * hash) + USER_APP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getUserAppId().hashCode();
    }
    hash = (37 * hash) + TASK_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTaskId().hashCode();
    if (getAdditionalFieldsCount() > 0) {
      hash = (37 * hash) + ADDITIONAL_FIELDS_FIELD_NUMBER;
      hash = (53 * hash) + getAdditionalFieldsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.GetTaskRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.GetTaskRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.GetTaskRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.GetTaskRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.GetTaskRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.GetTaskRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.GetTaskRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.GetTaskRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.GetTaskRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.GetTaskRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.GetTaskRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.GetTaskRequest parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.GetTaskRequest prototype) {
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
   * Request to get one task.
   * </pre>
   *
   * Protobuf type {@code clarifai.api.GetTaskRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.GetTaskRequest)
      com.clarifai.grpc.api.GetTaskRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_GetTaskRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_GetTaskRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.GetTaskRequest.class, com.clarifai.grpc.api.GetTaskRequest.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.GetTaskRequest.newBuilder()
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
      if (userAppIdBuilder_ == null) {
        userAppId_ = null;
      } else {
        userAppId_ = null;
        userAppIdBuilder_ = null;
      }
      taskId_ = "";

      additionalFields_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_GetTaskRequest_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.GetTaskRequest getDefaultInstanceForType() {
      return com.clarifai.grpc.api.GetTaskRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.GetTaskRequest build() {
      com.clarifai.grpc.api.GetTaskRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.GetTaskRequest buildPartial() {
      com.clarifai.grpc.api.GetTaskRequest result = new com.clarifai.grpc.api.GetTaskRequest(this);
      int from_bitField0_ = bitField0_;
      if (userAppIdBuilder_ == null) {
        result.userAppId_ = userAppId_;
      } else {
        result.userAppId_ = userAppIdBuilder_.build();
      }
      result.taskId_ = taskId_;
      if (((bitField0_ & 0x00000001) != 0)) {
        additionalFields_ = additionalFields_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.additionalFields_ = additionalFields_;
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
      if (other instanceof com.clarifai.grpc.api.GetTaskRequest) {
        return mergeFrom((com.clarifai.grpc.api.GetTaskRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.GetTaskRequest other) {
      if (other == com.clarifai.grpc.api.GetTaskRequest.getDefaultInstance()) return this;
      if (other.hasUserAppId()) {
        mergeUserAppId(other.getUserAppId());
      }
      if (!other.getTaskId().isEmpty()) {
        taskId_ = other.taskId_;
        onChanged();
      }
      if (!other.additionalFields_.isEmpty()) {
        if (additionalFields_.isEmpty()) {
          additionalFields_ = other.additionalFields_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAdditionalFieldsIsMutable();
          additionalFields_.addAll(other.additionalFields_);
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
      com.clarifai.grpc.api.GetTaskRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.GetTaskRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.clarifai.grpc.api.UserAppIDSet userAppId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.UserAppIDSet, com.clarifai.grpc.api.UserAppIDSet.Builder, com.clarifai.grpc.api.UserAppIDSetOrBuilder> userAppIdBuilder_;
    /**
     * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
     * @return Whether the userAppId field is set.
     */
    public boolean hasUserAppId() {
      return userAppIdBuilder_ != null || userAppId_ != null;
    }
    /**
     * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
     * @return The userAppId.
     */
    public com.clarifai.grpc.api.UserAppIDSet getUserAppId() {
      if (userAppIdBuilder_ == null) {
        return userAppId_ == null ? com.clarifai.grpc.api.UserAppIDSet.getDefaultInstance() : userAppId_;
      } else {
        return userAppIdBuilder_.getMessage();
      }
    }
    /**
     * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
     */
    public Builder setUserAppId(com.clarifai.grpc.api.UserAppIDSet value) {
      if (userAppIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        userAppId_ = value;
        onChanged();
      } else {
        userAppIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
     */
    public Builder setUserAppId(
        com.clarifai.grpc.api.UserAppIDSet.Builder builderForValue) {
      if (userAppIdBuilder_ == null) {
        userAppId_ = builderForValue.build();
        onChanged();
      } else {
        userAppIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
     */
    public Builder mergeUserAppId(com.clarifai.grpc.api.UserAppIDSet value) {
      if (userAppIdBuilder_ == null) {
        if (userAppId_ != null) {
          userAppId_ =
            com.clarifai.grpc.api.UserAppIDSet.newBuilder(userAppId_).mergeFrom(value).buildPartial();
        } else {
          userAppId_ = value;
        }
        onChanged();
      } else {
        userAppIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
     */
    public Builder clearUserAppId() {
      if (userAppIdBuilder_ == null) {
        userAppId_ = null;
        onChanged();
      } else {
        userAppId_ = null;
        userAppIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
     */
    public com.clarifai.grpc.api.UserAppIDSet.Builder getUserAppIdBuilder() {
      
      onChanged();
      return getUserAppIdFieldBuilder().getBuilder();
    }
    /**
     * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
     */
    public com.clarifai.grpc.api.UserAppIDSetOrBuilder getUserAppIdOrBuilder() {
      if (userAppIdBuilder_ != null) {
        return userAppIdBuilder_.getMessageOrBuilder();
      } else {
        return userAppId_ == null ?
            com.clarifai.grpc.api.UserAppIDSet.getDefaultInstance() : userAppId_;
      }
    }
    /**
     * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.UserAppIDSet, com.clarifai.grpc.api.UserAppIDSet.Builder, com.clarifai.grpc.api.UserAppIDSetOrBuilder> 
        getUserAppIdFieldBuilder() {
      if (userAppIdBuilder_ == null) {
        userAppIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.clarifai.grpc.api.UserAppIDSet, com.clarifai.grpc.api.UserAppIDSet.Builder, com.clarifai.grpc.api.UserAppIDSetOrBuilder>(
                getUserAppId(),
                getParentForChildren(),
                isClean());
        userAppId_ = null;
      }
      return userAppIdBuilder_;
    }

    private java.lang.Object taskId_ = "";
    /**
     * <code>string task_id = 2;</code>
     * @return The taskId.
     */
    public java.lang.String getTaskId() {
      java.lang.Object ref = taskId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        taskId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string task_id = 2;</code>
     * @return The bytes for taskId.
     */
    public com.google.protobuf.ByteString
        getTaskIdBytes() {
      java.lang.Object ref = taskId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        taskId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string task_id = 2;</code>
     * @param value The taskId to set.
     * @return This builder for chaining.
     */
    public Builder setTaskId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      taskId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string task_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTaskId() {
      
      taskId_ = getDefaultInstance().getTaskId();
      onChanged();
      return this;
    }
    /**
     * <code>string task_id = 2;</code>
     * @param value The bytes for taskId to set.
     * @return This builder for chaining.
     */
    public Builder setTaskIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      taskId_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList additionalFields_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureAdditionalFieldsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        additionalFields_ = new com.google.protobuf.LazyStringArrayList(additionalFields_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * (optional URL parameter) List of additional fields to be included in the response.
     * Currently supported additional fields:
     * - all
     * - worker.users
     * - review.users
     * - metrics.input_source.inputs_count_estimated
     * - metrics.work.inputs_count_estimated
     * - metrics.work.inputs_percent_estimated
     * - metrics.review.inputs_count_estimated
     * - metrics.review.inputs_percent_estimated
     * </pre>
     *
     * <code>repeated string additional_fields = 3;</code>
     * @return A list containing the additionalFields.
     */
    public com.google.protobuf.ProtocolStringList
        getAdditionalFieldsList() {
      return additionalFields_.getUnmodifiableView();
    }
    /**
     * <pre>
     * (optional URL parameter) List of additional fields to be included in the response.
     * Currently supported additional fields:
     * - all
     * - worker.users
     * - review.users
     * - metrics.input_source.inputs_count_estimated
     * - metrics.work.inputs_count_estimated
     * - metrics.work.inputs_percent_estimated
     * - metrics.review.inputs_count_estimated
     * - metrics.review.inputs_percent_estimated
     * </pre>
     *
     * <code>repeated string additional_fields = 3;</code>
     * @return The count of additionalFields.
     */
    public int getAdditionalFieldsCount() {
      return additionalFields_.size();
    }
    /**
     * <pre>
     * (optional URL parameter) List of additional fields to be included in the response.
     * Currently supported additional fields:
     * - all
     * - worker.users
     * - review.users
     * - metrics.input_source.inputs_count_estimated
     * - metrics.work.inputs_count_estimated
     * - metrics.work.inputs_percent_estimated
     * - metrics.review.inputs_count_estimated
     * - metrics.review.inputs_percent_estimated
     * </pre>
     *
     * <code>repeated string additional_fields = 3;</code>
     * @param index The index of the element to return.
     * @return The additionalFields at the given index.
     */
    public java.lang.String getAdditionalFields(int index) {
      return additionalFields_.get(index);
    }
    /**
     * <pre>
     * (optional URL parameter) List of additional fields to be included in the response.
     * Currently supported additional fields:
     * - all
     * - worker.users
     * - review.users
     * - metrics.input_source.inputs_count_estimated
     * - metrics.work.inputs_count_estimated
     * - metrics.work.inputs_percent_estimated
     * - metrics.review.inputs_count_estimated
     * - metrics.review.inputs_percent_estimated
     * </pre>
     *
     * <code>repeated string additional_fields = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the additionalFields at the given index.
     */
    public com.google.protobuf.ByteString
        getAdditionalFieldsBytes(int index) {
      return additionalFields_.getByteString(index);
    }
    /**
     * <pre>
     * (optional URL parameter) List of additional fields to be included in the response.
     * Currently supported additional fields:
     * - all
     * - worker.users
     * - review.users
     * - metrics.input_source.inputs_count_estimated
     * - metrics.work.inputs_count_estimated
     * - metrics.work.inputs_percent_estimated
     * - metrics.review.inputs_count_estimated
     * - metrics.review.inputs_percent_estimated
     * </pre>
     *
     * <code>repeated string additional_fields = 3;</code>
     * @param index The index to set the value at.
     * @param value The additionalFields to set.
     * @return This builder for chaining.
     */
    public Builder setAdditionalFields(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAdditionalFieldsIsMutable();
      additionalFields_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (optional URL parameter) List of additional fields to be included in the response.
     * Currently supported additional fields:
     * - all
     * - worker.users
     * - review.users
     * - metrics.input_source.inputs_count_estimated
     * - metrics.work.inputs_count_estimated
     * - metrics.work.inputs_percent_estimated
     * - metrics.review.inputs_count_estimated
     * - metrics.review.inputs_percent_estimated
     * </pre>
     *
     * <code>repeated string additional_fields = 3;</code>
     * @param value The additionalFields to add.
     * @return This builder for chaining.
     */
    public Builder addAdditionalFields(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAdditionalFieldsIsMutable();
      additionalFields_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (optional URL parameter) List of additional fields to be included in the response.
     * Currently supported additional fields:
     * - all
     * - worker.users
     * - review.users
     * - metrics.input_source.inputs_count_estimated
     * - metrics.work.inputs_count_estimated
     * - metrics.work.inputs_percent_estimated
     * - metrics.review.inputs_count_estimated
     * - metrics.review.inputs_percent_estimated
     * </pre>
     *
     * <code>repeated string additional_fields = 3;</code>
     * @param values The additionalFields to add.
     * @return This builder for chaining.
     */
    public Builder addAllAdditionalFields(
        java.lang.Iterable<java.lang.String> values) {
      ensureAdditionalFieldsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, additionalFields_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (optional URL parameter) List of additional fields to be included in the response.
     * Currently supported additional fields:
     * - all
     * - worker.users
     * - review.users
     * - metrics.input_source.inputs_count_estimated
     * - metrics.work.inputs_count_estimated
     * - metrics.work.inputs_percent_estimated
     * - metrics.review.inputs_count_estimated
     * - metrics.review.inputs_percent_estimated
     * </pre>
     *
     * <code>repeated string additional_fields = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAdditionalFields() {
      additionalFields_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (optional URL parameter) List of additional fields to be included in the response.
     * Currently supported additional fields:
     * - all
     * - worker.users
     * - review.users
     * - metrics.input_source.inputs_count_estimated
     * - metrics.work.inputs_count_estimated
     * - metrics.work.inputs_percent_estimated
     * - metrics.review.inputs_count_estimated
     * - metrics.review.inputs_percent_estimated
     * </pre>
     *
     * <code>repeated string additional_fields = 3;</code>
     * @param value The bytes of the additionalFields to add.
     * @return This builder for chaining.
     */
    public Builder addAdditionalFieldsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureAdditionalFieldsIsMutable();
      additionalFields_.add(value);
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.GetTaskRequest)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.GetTaskRequest)
  private static final com.clarifai.grpc.api.GetTaskRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.GetTaskRequest();
  }

  public static com.clarifai.grpc.api.GetTaskRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetTaskRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetTaskRequest>() {
    @java.lang.Override
    public GetTaskRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetTaskRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetTaskRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetTaskRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.GetTaskRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

