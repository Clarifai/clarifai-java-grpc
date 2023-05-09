// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

/**
 * <pre>
 * Start uploading a file archive containing inputs.
 * Will create and return an inputs-add-job for tracking progress.
 * Associated inputs-add-job contains an upload id which should be completed through `PutUploadContentParts` endpoint.
 * Completing the upload will automatically begin unpacking the archive and uploading the contents as inputs.
 * </pre>
 *
 * Protobuf type {@code clarifai.api.PostInputsUploadsRequest}
 */
public final class PostInputsUploadsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.PostInputsUploadsRequest)
    PostInputsUploadsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PostInputsUploadsRequest.newBuilder() to construct.
  private PostInputsUploadsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PostInputsUploadsRequest() {
    inputsUploads_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PostInputsUploadsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PostInputsUploadsRequest(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              inputsUploads_ = new java.util.ArrayList<com.clarifai.grpc.api.InputsUpload>();
              mutable_bitField0_ |= 0x00000001;
            }
            inputsUploads_.add(
                input.readMessage(com.clarifai.grpc.api.InputsUpload.parser(), extensionRegistry));
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
        inputsUploads_ = java.util.Collections.unmodifiableList(inputsUploads_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostInputsUploadsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostInputsUploadsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.PostInputsUploadsRequest.class, com.clarifai.grpc.api.PostInputsUploadsRequest.Builder.class);
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

  public static final int INPUTS_UPLOADS_FIELD_NUMBER = 2;
  private java.util.List<com.clarifai.grpc.api.InputsUpload> inputsUploads_;
  /**
   * <code>repeated .clarifai.api.InputsUpload inputs_uploads = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.clarifai.grpc.api.InputsUpload> getInputsUploadsList() {
    return inputsUploads_;
  }
  /**
   * <code>repeated .clarifai.api.InputsUpload inputs_uploads = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.clarifai.grpc.api.InputsUploadOrBuilder> 
      getInputsUploadsOrBuilderList() {
    return inputsUploads_;
  }
  /**
   * <code>repeated .clarifai.api.InputsUpload inputs_uploads = 2;</code>
   */
  @java.lang.Override
  public int getInputsUploadsCount() {
    return inputsUploads_.size();
  }
  /**
   * <code>repeated .clarifai.api.InputsUpload inputs_uploads = 2;</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.InputsUpload getInputsUploads(int index) {
    return inputsUploads_.get(index);
  }
  /**
   * <code>repeated .clarifai.api.InputsUpload inputs_uploads = 2;</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.InputsUploadOrBuilder getInputsUploadsOrBuilder(
      int index) {
    return inputsUploads_.get(index);
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
    for (int i = 0; i < inputsUploads_.size(); i++) {
      output.writeMessage(2, inputsUploads_.get(i));
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
    for (int i = 0; i < inputsUploads_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, inputsUploads_.get(i));
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
    if (!(obj instanceof com.clarifai.grpc.api.PostInputsUploadsRequest)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.PostInputsUploadsRequest other = (com.clarifai.grpc.api.PostInputsUploadsRequest) obj;

    if (hasUserAppId() != other.hasUserAppId()) return false;
    if (hasUserAppId()) {
      if (!getUserAppId()
          .equals(other.getUserAppId())) return false;
    }
    if (!getInputsUploadsList()
        .equals(other.getInputsUploadsList())) return false;
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
    if (getInputsUploadsCount() > 0) {
      hash = (37 * hash) + INPUTS_UPLOADS_FIELD_NUMBER;
      hash = (53 * hash) + getInputsUploadsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.PostInputsUploadsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.PostInputsUploadsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostInputsUploadsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.PostInputsUploadsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostInputsUploadsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.PostInputsUploadsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostInputsUploadsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.PostInputsUploadsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostInputsUploadsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.PostInputsUploadsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostInputsUploadsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.PostInputsUploadsRequest parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.PostInputsUploadsRequest prototype) {
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
   * Start uploading a file archive containing inputs.
   * Will create and return an inputs-add-job for tracking progress.
   * Associated inputs-add-job contains an upload id which should be completed through `PutUploadContentParts` endpoint.
   * Completing the upload will automatically begin unpacking the archive and uploading the contents as inputs.
   * </pre>
   *
   * Protobuf type {@code clarifai.api.PostInputsUploadsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.PostInputsUploadsRequest)
      com.clarifai.grpc.api.PostInputsUploadsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostInputsUploadsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostInputsUploadsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.PostInputsUploadsRequest.class, com.clarifai.grpc.api.PostInputsUploadsRequest.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.PostInputsUploadsRequest.newBuilder()
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
        getInputsUploadsFieldBuilder();
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
      if (inputsUploadsBuilder_ == null) {
        inputsUploads_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        inputsUploadsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostInputsUploadsRequest_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.PostInputsUploadsRequest getDefaultInstanceForType() {
      return com.clarifai.grpc.api.PostInputsUploadsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.PostInputsUploadsRequest build() {
      com.clarifai.grpc.api.PostInputsUploadsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.PostInputsUploadsRequest buildPartial() {
      com.clarifai.grpc.api.PostInputsUploadsRequest result = new com.clarifai.grpc.api.PostInputsUploadsRequest(this);
      int from_bitField0_ = bitField0_;
      if (userAppIdBuilder_ == null) {
        result.userAppId_ = userAppId_;
      } else {
        result.userAppId_ = userAppIdBuilder_.build();
      }
      if (inputsUploadsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          inputsUploads_ = java.util.Collections.unmodifiableList(inputsUploads_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.inputsUploads_ = inputsUploads_;
      } else {
        result.inputsUploads_ = inputsUploadsBuilder_.build();
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
      if (other instanceof com.clarifai.grpc.api.PostInputsUploadsRequest) {
        return mergeFrom((com.clarifai.grpc.api.PostInputsUploadsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.PostInputsUploadsRequest other) {
      if (other == com.clarifai.grpc.api.PostInputsUploadsRequest.getDefaultInstance()) return this;
      if (other.hasUserAppId()) {
        mergeUserAppId(other.getUserAppId());
      }
      if (inputsUploadsBuilder_ == null) {
        if (!other.inputsUploads_.isEmpty()) {
          if (inputsUploads_.isEmpty()) {
            inputsUploads_ = other.inputsUploads_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureInputsUploadsIsMutable();
            inputsUploads_.addAll(other.inputsUploads_);
          }
          onChanged();
        }
      } else {
        if (!other.inputsUploads_.isEmpty()) {
          if (inputsUploadsBuilder_.isEmpty()) {
            inputsUploadsBuilder_.dispose();
            inputsUploadsBuilder_ = null;
            inputsUploads_ = other.inputsUploads_;
            bitField0_ = (bitField0_ & ~0x00000001);
            inputsUploadsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getInputsUploadsFieldBuilder() : null;
          } else {
            inputsUploadsBuilder_.addAllMessages(other.inputsUploads_);
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
      com.clarifai.grpc.api.PostInputsUploadsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.PostInputsUploadsRequest) e.getUnfinishedMessage();
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

    private java.util.List<com.clarifai.grpc.api.InputsUpload> inputsUploads_ =
      java.util.Collections.emptyList();
    private void ensureInputsUploadsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        inputsUploads_ = new java.util.ArrayList<com.clarifai.grpc.api.InputsUpload>(inputsUploads_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.InputsUpload, com.clarifai.grpc.api.InputsUpload.Builder, com.clarifai.grpc.api.InputsUploadOrBuilder> inputsUploadsBuilder_;

    /**
     * <code>repeated .clarifai.api.InputsUpload inputs_uploads = 2;</code>
     */
    public java.util.List<com.clarifai.grpc.api.InputsUpload> getInputsUploadsList() {
      if (inputsUploadsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(inputsUploads_);
      } else {
        return inputsUploadsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .clarifai.api.InputsUpload inputs_uploads = 2;</code>
     */
    public int getInputsUploadsCount() {
      if (inputsUploadsBuilder_ == null) {
        return inputsUploads_.size();
      } else {
        return inputsUploadsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .clarifai.api.InputsUpload inputs_uploads = 2;</code>
     */
    public com.clarifai.grpc.api.InputsUpload getInputsUploads(int index) {
      if (inputsUploadsBuilder_ == null) {
        return inputsUploads_.get(index);
      } else {
        return inputsUploadsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .clarifai.api.InputsUpload inputs_uploads = 2;</code>
     */
    public Builder setInputsUploads(
        int index, com.clarifai.grpc.api.InputsUpload value) {
      if (inputsUploadsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInputsUploadsIsMutable();
        inputsUploads_.set(index, value);
        onChanged();
      } else {
        inputsUploadsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.InputsUpload inputs_uploads = 2;</code>
     */
    public Builder setInputsUploads(
        int index, com.clarifai.grpc.api.InputsUpload.Builder builderForValue) {
      if (inputsUploadsBuilder_ == null) {
        ensureInputsUploadsIsMutable();
        inputsUploads_.set(index, builderForValue.build());
        onChanged();
      } else {
        inputsUploadsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.InputsUpload inputs_uploads = 2;</code>
     */
    public Builder addInputsUploads(com.clarifai.grpc.api.InputsUpload value) {
      if (inputsUploadsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInputsUploadsIsMutable();
        inputsUploads_.add(value);
        onChanged();
      } else {
        inputsUploadsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.InputsUpload inputs_uploads = 2;</code>
     */
    public Builder addInputsUploads(
        int index, com.clarifai.grpc.api.InputsUpload value) {
      if (inputsUploadsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInputsUploadsIsMutable();
        inputsUploads_.add(index, value);
        onChanged();
      } else {
        inputsUploadsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.InputsUpload inputs_uploads = 2;</code>
     */
    public Builder addInputsUploads(
        com.clarifai.grpc.api.InputsUpload.Builder builderForValue) {
      if (inputsUploadsBuilder_ == null) {
        ensureInputsUploadsIsMutable();
        inputsUploads_.add(builderForValue.build());
        onChanged();
      } else {
        inputsUploadsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.InputsUpload inputs_uploads = 2;</code>
     */
    public Builder addInputsUploads(
        int index, com.clarifai.grpc.api.InputsUpload.Builder builderForValue) {
      if (inputsUploadsBuilder_ == null) {
        ensureInputsUploadsIsMutable();
        inputsUploads_.add(index, builderForValue.build());
        onChanged();
      } else {
        inputsUploadsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.InputsUpload inputs_uploads = 2;</code>
     */
    public Builder addAllInputsUploads(
        java.lang.Iterable<? extends com.clarifai.grpc.api.InputsUpload> values) {
      if (inputsUploadsBuilder_ == null) {
        ensureInputsUploadsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, inputsUploads_);
        onChanged();
      } else {
        inputsUploadsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.InputsUpload inputs_uploads = 2;</code>
     */
    public Builder clearInputsUploads() {
      if (inputsUploadsBuilder_ == null) {
        inputsUploads_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        inputsUploadsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.InputsUpload inputs_uploads = 2;</code>
     */
    public Builder removeInputsUploads(int index) {
      if (inputsUploadsBuilder_ == null) {
        ensureInputsUploadsIsMutable();
        inputsUploads_.remove(index);
        onChanged();
      } else {
        inputsUploadsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.InputsUpload inputs_uploads = 2;</code>
     */
    public com.clarifai.grpc.api.InputsUpload.Builder getInputsUploadsBuilder(
        int index) {
      return getInputsUploadsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .clarifai.api.InputsUpload inputs_uploads = 2;</code>
     */
    public com.clarifai.grpc.api.InputsUploadOrBuilder getInputsUploadsOrBuilder(
        int index) {
      if (inputsUploadsBuilder_ == null) {
        return inputsUploads_.get(index);  } else {
        return inputsUploadsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .clarifai.api.InputsUpload inputs_uploads = 2;</code>
     */
    public java.util.List<? extends com.clarifai.grpc.api.InputsUploadOrBuilder> 
         getInputsUploadsOrBuilderList() {
      if (inputsUploadsBuilder_ != null) {
        return inputsUploadsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(inputsUploads_);
      }
    }
    /**
     * <code>repeated .clarifai.api.InputsUpload inputs_uploads = 2;</code>
     */
    public com.clarifai.grpc.api.InputsUpload.Builder addInputsUploadsBuilder() {
      return getInputsUploadsFieldBuilder().addBuilder(
          com.clarifai.grpc.api.InputsUpload.getDefaultInstance());
    }
    /**
     * <code>repeated .clarifai.api.InputsUpload inputs_uploads = 2;</code>
     */
    public com.clarifai.grpc.api.InputsUpload.Builder addInputsUploadsBuilder(
        int index) {
      return getInputsUploadsFieldBuilder().addBuilder(
          index, com.clarifai.grpc.api.InputsUpload.getDefaultInstance());
    }
    /**
     * <code>repeated .clarifai.api.InputsUpload inputs_uploads = 2;</code>
     */
    public java.util.List<com.clarifai.grpc.api.InputsUpload.Builder> 
         getInputsUploadsBuilderList() {
      return getInputsUploadsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.InputsUpload, com.clarifai.grpc.api.InputsUpload.Builder, com.clarifai.grpc.api.InputsUploadOrBuilder> 
        getInputsUploadsFieldBuilder() {
      if (inputsUploadsBuilder_ == null) {
        inputsUploadsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.clarifai.grpc.api.InputsUpload, com.clarifai.grpc.api.InputsUpload.Builder, com.clarifai.grpc.api.InputsUploadOrBuilder>(
                inputsUploads_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        inputsUploads_ = null;
      }
      return inputsUploadsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.PostInputsUploadsRequest)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.PostInputsUploadsRequest)
  private static final com.clarifai.grpc.api.PostInputsUploadsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.PostInputsUploadsRequest();
  }

  public static com.clarifai.grpc.api.PostInputsUploadsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PostInputsUploadsRequest>
      PARSER = new com.google.protobuf.AbstractParser<PostInputsUploadsRequest>() {
    @java.lang.Override
    public PostInputsUploadsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PostInputsUploadsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PostInputsUploadsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PostInputsUploadsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.PostInputsUploadsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

