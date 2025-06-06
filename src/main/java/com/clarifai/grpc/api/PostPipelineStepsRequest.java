// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

/**
 * Protobuf type {@code clarifai.api.PostPipelineStepsRequest}
 */
public final class PostPipelineStepsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.PostPipelineStepsRequest)
    PostPipelineStepsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PostPipelineStepsRequest.newBuilder() to construct.
  private PostPipelineStepsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PostPipelineStepsRequest() {
    pipelineSteps_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PostPipelineStepsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PostPipelineStepsRequest(
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
          case 26: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              pipelineSteps_ = new java.util.ArrayList<com.clarifai.grpc.api.PipelineStep>();
              mutable_bitField0_ |= 0x00000001;
            }
            pipelineSteps_.add(
                input.readMessage(com.clarifai.grpc.api.PipelineStep.parser(), extensionRegistry));
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
        pipelineSteps_ = java.util.Collections.unmodifiableList(pipelineSteps_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostPipelineStepsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostPipelineStepsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.PostPipelineStepsRequest.class, com.clarifai.grpc.api.PostPipelineStepsRequest.Builder.class);
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

  public static final int PIPELINE_STEPS_FIELD_NUMBER = 3;
  private java.util.List<com.clarifai.grpc.api.PipelineStep> pipelineSteps_;
  /**
   * <code>repeated .clarifai.api.PipelineStep pipeline_steps = 3;</code>
   */
  @java.lang.Override
  public java.util.List<com.clarifai.grpc.api.PipelineStep> getPipelineStepsList() {
    return pipelineSteps_;
  }
  /**
   * <code>repeated .clarifai.api.PipelineStep pipeline_steps = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.clarifai.grpc.api.PipelineStepOrBuilder> 
      getPipelineStepsOrBuilderList() {
    return pipelineSteps_;
  }
  /**
   * <code>repeated .clarifai.api.PipelineStep pipeline_steps = 3;</code>
   */
  @java.lang.Override
  public int getPipelineStepsCount() {
    return pipelineSteps_.size();
  }
  /**
   * <code>repeated .clarifai.api.PipelineStep pipeline_steps = 3;</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.PipelineStep getPipelineSteps(int index) {
    return pipelineSteps_.get(index);
  }
  /**
   * <code>repeated .clarifai.api.PipelineStep pipeline_steps = 3;</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.PipelineStepOrBuilder getPipelineStepsOrBuilder(
      int index) {
    return pipelineSteps_.get(index);
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
    for (int i = 0; i < pipelineSteps_.size(); i++) {
      output.writeMessage(3, pipelineSteps_.get(i));
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
    for (int i = 0; i < pipelineSteps_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, pipelineSteps_.get(i));
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
    if (!(obj instanceof com.clarifai.grpc.api.PostPipelineStepsRequest)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.PostPipelineStepsRequest other = (com.clarifai.grpc.api.PostPipelineStepsRequest) obj;

    if (hasUserAppId() != other.hasUserAppId()) return false;
    if (hasUserAppId()) {
      if (!getUserAppId()
          .equals(other.getUserAppId())) return false;
    }
    if (!getPipelineStepsList()
        .equals(other.getPipelineStepsList())) return false;
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
    if (getPipelineStepsCount() > 0) {
      hash = (37 * hash) + PIPELINE_STEPS_FIELD_NUMBER;
      hash = (53 * hash) + getPipelineStepsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.PostPipelineStepsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.PostPipelineStepsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostPipelineStepsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.PostPipelineStepsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostPipelineStepsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.PostPipelineStepsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostPipelineStepsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.PostPipelineStepsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostPipelineStepsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.PostPipelineStepsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostPipelineStepsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.PostPipelineStepsRequest parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.PostPipelineStepsRequest prototype) {
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
   * Protobuf type {@code clarifai.api.PostPipelineStepsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.PostPipelineStepsRequest)
      com.clarifai.grpc.api.PostPipelineStepsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostPipelineStepsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostPipelineStepsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.PostPipelineStepsRequest.class, com.clarifai.grpc.api.PostPipelineStepsRequest.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.PostPipelineStepsRequest.newBuilder()
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
        getPipelineStepsFieldBuilder();
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
      if (pipelineStepsBuilder_ == null) {
        pipelineSteps_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        pipelineStepsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostPipelineStepsRequest_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.PostPipelineStepsRequest getDefaultInstanceForType() {
      return com.clarifai.grpc.api.PostPipelineStepsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.PostPipelineStepsRequest build() {
      com.clarifai.grpc.api.PostPipelineStepsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.PostPipelineStepsRequest buildPartial() {
      com.clarifai.grpc.api.PostPipelineStepsRequest result = new com.clarifai.grpc.api.PostPipelineStepsRequest(this);
      int from_bitField0_ = bitField0_;
      if (userAppIdBuilder_ == null) {
        result.userAppId_ = userAppId_;
      } else {
        result.userAppId_ = userAppIdBuilder_.build();
      }
      if (pipelineStepsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          pipelineSteps_ = java.util.Collections.unmodifiableList(pipelineSteps_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.pipelineSteps_ = pipelineSteps_;
      } else {
        result.pipelineSteps_ = pipelineStepsBuilder_.build();
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
      if (other instanceof com.clarifai.grpc.api.PostPipelineStepsRequest) {
        return mergeFrom((com.clarifai.grpc.api.PostPipelineStepsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.PostPipelineStepsRequest other) {
      if (other == com.clarifai.grpc.api.PostPipelineStepsRequest.getDefaultInstance()) return this;
      if (other.hasUserAppId()) {
        mergeUserAppId(other.getUserAppId());
      }
      if (pipelineStepsBuilder_ == null) {
        if (!other.pipelineSteps_.isEmpty()) {
          if (pipelineSteps_.isEmpty()) {
            pipelineSteps_ = other.pipelineSteps_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePipelineStepsIsMutable();
            pipelineSteps_.addAll(other.pipelineSteps_);
          }
          onChanged();
        }
      } else {
        if (!other.pipelineSteps_.isEmpty()) {
          if (pipelineStepsBuilder_.isEmpty()) {
            pipelineStepsBuilder_.dispose();
            pipelineStepsBuilder_ = null;
            pipelineSteps_ = other.pipelineSteps_;
            bitField0_ = (bitField0_ & ~0x00000001);
            pipelineStepsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPipelineStepsFieldBuilder() : null;
          } else {
            pipelineStepsBuilder_.addAllMessages(other.pipelineSteps_);
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
      com.clarifai.grpc.api.PostPipelineStepsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.PostPipelineStepsRequest) e.getUnfinishedMessage();
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

    private java.util.List<com.clarifai.grpc.api.PipelineStep> pipelineSteps_ =
      java.util.Collections.emptyList();
    private void ensurePipelineStepsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        pipelineSteps_ = new java.util.ArrayList<com.clarifai.grpc.api.PipelineStep>(pipelineSteps_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.PipelineStep, com.clarifai.grpc.api.PipelineStep.Builder, com.clarifai.grpc.api.PipelineStepOrBuilder> pipelineStepsBuilder_;

    /**
     * <code>repeated .clarifai.api.PipelineStep pipeline_steps = 3;</code>
     */
    public java.util.List<com.clarifai.grpc.api.PipelineStep> getPipelineStepsList() {
      if (pipelineStepsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(pipelineSteps_);
      } else {
        return pipelineStepsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .clarifai.api.PipelineStep pipeline_steps = 3;</code>
     */
    public int getPipelineStepsCount() {
      if (pipelineStepsBuilder_ == null) {
        return pipelineSteps_.size();
      } else {
        return pipelineStepsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .clarifai.api.PipelineStep pipeline_steps = 3;</code>
     */
    public com.clarifai.grpc.api.PipelineStep getPipelineSteps(int index) {
      if (pipelineStepsBuilder_ == null) {
        return pipelineSteps_.get(index);
      } else {
        return pipelineStepsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .clarifai.api.PipelineStep pipeline_steps = 3;</code>
     */
    public Builder setPipelineSteps(
        int index, com.clarifai.grpc.api.PipelineStep value) {
      if (pipelineStepsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePipelineStepsIsMutable();
        pipelineSteps_.set(index, value);
        onChanged();
      } else {
        pipelineStepsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.PipelineStep pipeline_steps = 3;</code>
     */
    public Builder setPipelineSteps(
        int index, com.clarifai.grpc.api.PipelineStep.Builder builderForValue) {
      if (pipelineStepsBuilder_ == null) {
        ensurePipelineStepsIsMutable();
        pipelineSteps_.set(index, builderForValue.build());
        onChanged();
      } else {
        pipelineStepsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.PipelineStep pipeline_steps = 3;</code>
     */
    public Builder addPipelineSteps(com.clarifai.grpc.api.PipelineStep value) {
      if (pipelineStepsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePipelineStepsIsMutable();
        pipelineSteps_.add(value);
        onChanged();
      } else {
        pipelineStepsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.PipelineStep pipeline_steps = 3;</code>
     */
    public Builder addPipelineSteps(
        int index, com.clarifai.grpc.api.PipelineStep value) {
      if (pipelineStepsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePipelineStepsIsMutable();
        pipelineSteps_.add(index, value);
        onChanged();
      } else {
        pipelineStepsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.PipelineStep pipeline_steps = 3;</code>
     */
    public Builder addPipelineSteps(
        com.clarifai.grpc.api.PipelineStep.Builder builderForValue) {
      if (pipelineStepsBuilder_ == null) {
        ensurePipelineStepsIsMutable();
        pipelineSteps_.add(builderForValue.build());
        onChanged();
      } else {
        pipelineStepsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.PipelineStep pipeline_steps = 3;</code>
     */
    public Builder addPipelineSteps(
        int index, com.clarifai.grpc.api.PipelineStep.Builder builderForValue) {
      if (pipelineStepsBuilder_ == null) {
        ensurePipelineStepsIsMutable();
        pipelineSteps_.add(index, builderForValue.build());
        onChanged();
      } else {
        pipelineStepsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.PipelineStep pipeline_steps = 3;</code>
     */
    public Builder addAllPipelineSteps(
        java.lang.Iterable<? extends com.clarifai.grpc.api.PipelineStep> values) {
      if (pipelineStepsBuilder_ == null) {
        ensurePipelineStepsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, pipelineSteps_);
        onChanged();
      } else {
        pipelineStepsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.PipelineStep pipeline_steps = 3;</code>
     */
    public Builder clearPipelineSteps() {
      if (pipelineStepsBuilder_ == null) {
        pipelineSteps_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        pipelineStepsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.PipelineStep pipeline_steps = 3;</code>
     */
    public Builder removePipelineSteps(int index) {
      if (pipelineStepsBuilder_ == null) {
        ensurePipelineStepsIsMutable();
        pipelineSteps_.remove(index);
        onChanged();
      } else {
        pipelineStepsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.PipelineStep pipeline_steps = 3;</code>
     */
    public com.clarifai.grpc.api.PipelineStep.Builder getPipelineStepsBuilder(
        int index) {
      return getPipelineStepsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .clarifai.api.PipelineStep pipeline_steps = 3;</code>
     */
    public com.clarifai.grpc.api.PipelineStepOrBuilder getPipelineStepsOrBuilder(
        int index) {
      if (pipelineStepsBuilder_ == null) {
        return pipelineSteps_.get(index);  } else {
        return pipelineStepsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .clarifai.api.PipelineStep pipeline_steps = 3;</code>
     */
    public java.util.List<? extends com.clarifai.grpc.api.PipelineStepOrBuilder> 
         getPipelineStepsOrBuilderList() {
      if (pipelineStepsBuilder_ != null) {
        return pipelineStepsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(pipelineSteps_);
      }
    }
    /**
     * <code>repeated .clarifai.api.PipelineStep pipeline_steps = 3;</code>
     */
    public com.clarifai.grpc.api.PipelineStep.Builder addPipelineStepsBuilder() {
      return getPipelineStepsFieldBuilder().addBuilder(
          com.clarifai.grpc.api.PipelineStep.getDefaultInstance());
    }
    /**
     * <code>repeated .clarifai.api.PipelineStep pipeline_steps = 3;</code>
     */
    public com.clarifai.grpc.api.PipelineStep.Builder addPipelineStepsBuilder(
        int index) {
      return getPipelineStepsFieldBuilder().addBuilder(
          index, com.clarifai.grpc.api.PipelineStep.getDefaultInstance());
    }
    /**
     * <code>repeated .clarifai.api.PipelineStep pipeline_steps = 3;</code>
     */
    public java.util.List<com.clarifai.grpc.api.PipelineStep.Builder> 
         getPipelineStepsBuilderList() {
      return getPipelineStepsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.PipelineStep, com.clarifai.grpc.api.PipelineStep.Builder, com.clarifai.grpc.api.PipelineStepOrBuilder> 
        getPipelineStepsFieldBuilder() {
      if (pipelineStepsBuilder_ == null) {
        pipelineStepsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.clarifai.grpc.api.PipelineStep, com.clarifai.grpc.api.PipelineStep.Builder, com.clarifai.grpc.api.PipelineStepOrBuilder>(
                pipelineSteps_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        pipelineSteps_ = null;
      }
      return pipelineStepsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.PostPipelineStepsRequest)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.PostPipelineStepsRequest)
  private static final com.clarifai.grpc.api.PostPipelineStepsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.PostPipelineStepsRequest();
  }

  public static com.clarifai.grpc.api.PostPipelineStepsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PostPipelineStepsRequest>
      PARSER = new com.google.protobuf.AbstractParser<PostPipelineStepsRequest>() {
    @java.lang.Override
    public PostPipelineStepsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PostPipelineStepsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PostPipelineStepsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PostPipelineStepsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.PostPipelineStepsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

