// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

/**
 * Protobuf type {@code clarifai.api.PostModelVersionsUploadConfig}
 */
public final class PostModelVersionsUploadConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.PostModelVersionsUploadConfig)
    PostModelVersionsUploadConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PostModelVersionsUploadConfig.newBuilder() to construct.
  private PostModelVersionsUploadConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PostModelVersionsUploadConfig() {
    modelId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PostModelVersionsUploadConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PostModelVersionsUploadConfig(
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

            modelId_ = s;
            break;
          }
          case 26: {
            com.clarifai.grpc.api.ModelVersion.Builder subBuilder = null;
            if (modelVersion_ != null) {
              subBuilder = modelVersion_.toBuilder();
            }
            modelVersion_ = input.readMessage(com.clarifai.grpc.api.ModelVersion.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(modelVersion_);
              modelVersion_ = subBuilder.buildPartial();
            }

            break;
          }
          case 32: {

            totalSize_ = input.readUInt64();
            break;
          }
          case 40: {

            isV3_ = input.readBool();
            break;
          }
          case 48: {

            storageRequestSize_ = input.readUInt64();
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
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostModelVersionsUploadConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostModelVersionsUploadConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.PostModelVersionsUploadConfig.class, com.clarifai.grpc.api.PostModelVersionsUploadConfig.Builder.class);
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

  public static final int MODEL_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object modelId_;
  /**
   * <pre>
   * Model to create version for
   * </pre>
   *
   * <code>string model_id = 2;</code>
   * @return The modelId.
   */
  @java.lang.Override
  public java.lang.String getModelId() {
    java.lang.Object ref = modelId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      modelId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Model to create version for
   * </pre>
   *
   * <code>string model_id = 2;</code>
   * @return The bytes for modelId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getModelIdBytes() {
    java.lang.Object ref = modelId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      modelId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MODEL_VERSION_FIELD_NUMBER = 3;
  private com.clarifai.grpc.api.ModelVersion modelVersion_;
  /**
   * <pre>
   * Specification for the model version to be uploaded
   * </pre>
   *
   * <code>.clarifai.api.ModelVersion model_version = 3;</code>
   * @return Whether the modelVersion field is set.
   */
  @java.lang.Override
  public boolean hasModelVersion() {
    return modelVersion_ != null;
  }
  /**
   * <pre>
   * Specification for the model version to be uploaded
   * </pre>
   *
   * <code>.clarifai.api.ModelVersion model_version = 3;</code>
   * @return The modelVersion.
   */
  @java.lang.Override
  public com.clarifai.grpc.api.ModelVersion getModelVersion() {
    return modelVersion_ == null ? com.clarifai.grpc.api.ModelVersion.getDefaultInstance() : modelVersion_;
  }
  /**
   * <pre>
   * Specification for the model version to be uploaded
   * </pre>
   *
   * <code>.clarifai.api.ModelVersion model_version = 3;</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.ModelVersionOrBuilder getModelVersionOrBuilder() {
    return getModelVersion();
  }

  public static final int TOTAL_SIZE_FIELD_NUMBER = 4;
  private long totalSize_;
  /**
   * <pre>
   * Number of bytes in the model files to be uploaded
   * </pre>
   *
   * <code>uint64 total_size = 4;</code>
   * @return The totalSize.
   */
  @java.lang.Override
  public long getTotalSize() {
    return totalSize_;
  }

  public static final int IS_V3_FIELD_NUMBER = 5;
  private boolean isV3_;
  /**
   * <pre>
   * Whether the uploaded package will be a .tar.gz which contains a Dockerfile or the standard .zip
   * </pre>
   *
   * <code>bool is_v3 = 5;</code>
   * @return The isV3.
   */
  @java.lang.Override
  public boolean getIsV3() {
    return isV3_;
  }

  public static final int STORAGE_REQUEST_SIZE_FIELD_NUMBER = 6;
  private long storageRequestSize_;
  /**
   * <pre>
   * Number of bytes requested for the build process.
   * </pre>
   *
   * <code>uint64 storage_request_size = 6;</code>
   * @return The storageRequestSize.
   */
  @java.lang.Override
  public long getStorageRequestSize() {
    return storageRequestSize_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(modelId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, modelId_);
    }
    if (modelVersion_ != null) {
      output.writeMessage(3, getModelVersion());
    }
    if (totalSize_ != 0L) {
      output.writeUInt64(4, totalSize_);
    }
    if (isV3_ != false) {
      output.writeBool(5, isV3_);
    }
    if (storageRequestSize_ != 0L) {
      output.writeUInt64(6, storageRequestSize_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(modelId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, modelId_);
    }
    if (modelVersion_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getModelVersion());
    }
    if (totalSize_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, totalSize_);
    }
    if (isV3_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, isV3_);
    }
    if (storageRequestSize_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(6, storageRequestSize_);
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
    if (!(obj instanceof com.clarifai.grpc.api.PostModelVersionsUploadConfig)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.PostModelVersionsUploadConfig other = (com.clarifai.grpc.api.PostModelVersionsUploadConfig) obj;

    if (hasUserAppId() != other.hasUserAppId()) return false;
    if (hasUserAppId()) {
      if (!getUserAppId()
          .equals(other.getUserAppId())) return false;
    }
    if (!getModelId()
        .equals(other.getModelId())) return false;
    if (hasModelVersion() != other.hasModelVersion()) return false;
    if (hasModelVersion()) {
      if (!getModelVersion()
          .equals(other.getModelVersion())) return false;
    }
    if (getTotalSize()
        != other.getTotalSize()) return false;
    if (getIsV3()
        != other.getIsV3()) return false;
    if (getStorageRequestSize()
        != other.getStorageRequestSize()) return false;
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
    hash = (37 * hash) + MODEL_ID_FIELD_NUMBER;
    hash = (53 * hash) + getModelId().hashCode();
    if (hasModelVersion()) {
      hash = (37 * hash) + MODEL_VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getModelVersion().hashCode();
    }
    hash = (37 * hash) + TOTAL_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotalSize());
    hash = (37 * hash) + IS_V3_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsV3());
    hash = (37 * hash) + STORAGE_REQUEST_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStorageRequestSize());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.PostModelVersionsUploadConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.PostModelVersionsUploadConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostModelVersionsUploadConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.PostModelVersionsUploadConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostModelVersionsUploadConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.PostModelVersionsUploadConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostModelVersionsUploadConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.PostModelVersionsUploadConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostModelVersionsUploadConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.PostModelVersionsUploadConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostModelVersionsUploadConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.PostModelVersionsUploadConfig parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.PostModelVersionsUploadConfig prototype) {
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
   * Protobuf type {@code clarifai.api.PostModelVersionsUploadConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.PostModelVersionsUploadConfig)
      com.clarifai.grpc.api.PostModelVersionsUploadConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostModelVersionsUploadConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostModelVersionsUploadConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.PostModelVersionsUploadConfig.class, com.clarifai.grpc.api.PostModelVersionsUploadConfig.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.PostModelVersionsUploadConfig.newBuilder()
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
      modelId_ = "";

      if (modelVersionBuilder_ == null) {
        modelVersion_ = null;
      } else {
        modelVersion_ = null;
        modelVersionBuilder_ = null;
      }
      totalSize_ = 0L;

      isV3_ = false;

      storageRequestSize_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostModelVersionsUploadConfig_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.PostModelVersionsUploadConfig getDefaultInstanceForType() {
      return com.clarifai.grpc.api.PostModelVersionsUploadConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.PostModelVersionsUploadConfig build() {
      com.clarifai.grpc.api.PostModelVersionsUploadConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.PostModelVersionsUploadConfig buildPartial() {
      com.clarifai.grpc.api.PostModelVersionsUploadConfig result = new com.clarifai.grpc.api.PostModelVersionsUploadConfig(this);
      if (userAppIdBuilder_ == null) {
        result.userAppId_ = userAppId_;
      } else {
        result.userAppId_ = userAppIdBuilder_.build();
      }
      result.modelId_ = modelId_;
      if (modelVersionBuilder_ == null) {
        result.modelVersion_ = modelVersion_;
      } else {
        result.modelVersion_ = modelVersionBuilder_.build();
      }
      result.totalSize_ = totalSize_;
      result.isV3_ = isV3_;
      result.storageRequestSize_ = storageRequestSize_;
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
      if (other instanceof com.clarifai.grpc.api.PostModelVersionsUploadConfig) {
        return mergeFrom((com.clarifai.grpc.api.PostModelVersionsUploadConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.PostModelVersionsUploadConfig other) {
      if (other == com.clarifai.grpc.api.PostModelVersionsUploadConfig.getDefaultInstance()) return this;
      if (other.hasUserAppId()) {
        mergeUserAppId(other.getUserAppId());
      }
      if (!other.getModelId().isEmpty()) {
        modelId_ = other.modelId_;
        onChanged();
      }
      if (other.hasModelVersion()) {
        mergeModelVersion(other.getModelVersion());
      }
      if (other.getTotalSize() != 0L) {
        setTotalSize(other.getTotalSize());
      }
      if (other.getIsV3() != false) {
        setIsV3(other.getIsV3());
      }
      if (other.getStorageRequestSize() != 0L) {
        setStorageRequestSize(other.getStorageRequestSize());
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
      com.clarifai.grpc.api.PostModelVersionsUploadConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.PostModelVersionsUploadConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

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

    private java.lang.Object modelId_ = "";
    /**
     * <pre>
     * Model to create version for
     * </pre>
     *
     * <code>string model_id = 2;</code>
     * @return The modelId.
     */
    public java.lang.String getModelId() {
      java.lang.Object ref = modelId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        modelId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Model to create version for
     * </pre>
     *
     * <code>string model_id = 2;</code>
     * @return The bytes for modelId.
     */
    public com.google.protobuf.ByteString
        getModelIdBytes() {
      java.lang.Object ref = modelId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        modelId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Model to create version for
     * </pre>
     *
     * <code>string model_id = 2;</code>
     * @param value The modelId to set.
     * @return This builder for chaining.
     */
    public Builder setModelId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      modelId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Model to create version for
     * </pre>
     *
     * <code>string model_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearModelId() {
      
      modelId_ = getDefaultInstance().getModelId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Model to create version for
     * </pre>
     *
     * <code>string model_id = 2;</code>
     * @param value The bytes for modelId to set.
     * @return This builder for chaining.
     */
    public Builder setModelIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      modelId_ = value;
      onChanged();
      return this;
    }

    private com.clarifai.grpc.api.ModelVersion modelVersion_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.ModelVersion, com.clarifai.grpc.api.ModelVersion.Builder, com.clarifai.grpc.api.ModelVersionOrBuilder> modelVersionBuilder_;
    /**
     * <pre>
     * Specification for the model version to be uploaded
     * </pre>
     *
     * <code>.clarifai.api.ModelVersion model_version = 3;</code>
     * @return Whether the modelVersion field is set.
     */
    public boolean hasModelVersion() {
      return modelVersionBuilder_ != null || modelVersion_ != null;
    }
    /**
     * <pre>
     * Specification for the model version to be uploaded
     * </pre>
     *
     * <code>.clarifai.api.ModelVersion model_version = 3;</code>
     * @return The modelVersion.
     */
    public com.clarifai.grpc.api.ModelVersion getModelVersion() {
      if (modelVersionBuilder_ == null) {
        return modelVersion_ == null ? com.clarifai.grpc.api.ModelVersion.getDefaultInstance() : modelVersion_;
      } else {
        return modelVersionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Specification for the model version to be uploaded
     * </pre>
     *
     * <code>.clarifai.api.ModelVersion model_version = 3;</code>
     */
    public Builder setModelVersion(com.clarifai.grpc.api.ModelVersion value) {
      if (modelVersionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        modelVersion_ = value;
        onChanged();
      } else {
        modelVersionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Specification for the model version to be uploaded
     * </pre>
     *
     * <code>.clarifai.api.ModelVersion model_version = 3;</code>
     */
    public Builder setModelVersion(
        com.clarifai.grpc.api.ModelVersion.Builder builderForValue) {
      if (modelVersionBuilder_ == null) {
        modelVersion_ = builderForValue.build();
        onChanged();
      } else {
        modelVersionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Specification for the model version to be uploaded
     * </pre>
     *
     * <code>.clarifai.api.ModelVersion model_version = 3;</code>
     */
    public Builder mergeModelVersion(com.clarifai.grpc.api.ModelVersion value) {
      if (modelVersionBuilder_ == null) {
        if (modelVersion_ != null) {
          modelVersion_ =
            com.clarifai.grpc.api.ModelVersion.newBuilder(modelVersion_).mergeFrom(value).buildPartial();
        } else {
          modelVersion_ = value;
        }
        onChanged();
      } else {
        modelVersionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Specification for the model version to be uploaded
     * </pre>
     *
     * <code>.clarifai.api.ModelVersion model_version = 3;</code>
     */
    public Builder clearModelVersion() {
      if (modelVersionBuilder_ == null) {
        modelVersion_ = null;
        onChanged();
      } else {
        modelVersion_ = null;
        modelVersionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Specification for the model version to be uploaded
     * </pre>
     *
     * <code>.clarifai.api.ModelVersion model_version = 3;</code>
     */
    public com.clarifai.grpc.api.ModelVersion.Builder getModelVersionBuilder() {
      
      onChanged();
      return getModelVersionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Specification for the model version to be uploaded
     * </pre>
     *
     * <code>.clarifai.api.ModelVersion model_version = 3;</code>
     */
    public com.clarifai.grpc.api.ModelVersionOrBuilder getModelVersionOrBuilder() {
      if (modelVersionBuilder_ != null) {
        return modelVersionBuilder_.getMessageOrBuilder();
      } else {
        return modelVersion_ == null ?
            com.clarifai.grpc.api.ModelVersion.getDefaultInstance() : modelVersion_;
      }
    }
    /**
     * <pre>
     * Specification for the model version to be uploaded
     * </pre>
     *
     * <code>.clarifai.api.ModelVersion model_version = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.ModelVersion, com.clarifai.grpc.api.ModelVersion.Builder, com.clarifai.grpc.api.ModelVersionOrBuilder> 
        getModelVersionFieldBuilder() {
      if (modelVersionBuilder_ == null) {
        modelVersionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.clarifai.grpc.api.ModelVersion, com.clarifai.grpc.api.ModelVersion.Builder, com.clarifai.grpc.api.ModelVersionOrBuilder>(
                getModelVersion(),
                getParentForChildren(),
                isClean());
        modelVersion_ = null;
      }
      return modelVersionBuilder_;
    }

    private long totalSize_ ;
    /**
     * <pre>
     * Number of bytes in the model files to be uploaded
     * </pre>
     *
     * <code>uint64 total_size = 4;</code>
     * @return The totalSize.
     */
    @java.lang.Override
    public long getTotalSize() {
      return totalSize_;
    }
    /**
     * <pre>
     * Number of bytes in the model files to be uploaded
     * </pre>
     *
     * <code>uint64 total_size = 4;</code>
     * @param value The totalSize to set.
     * @return This builder for chaining.
     */
    public Builder setTotalSize(long value) {
      
      totalSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of bytes in the model files to be uploaded
     * </pre>
     *
     * <code>uint64 total_size = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalSize() {
      
      totalSize_ = 0L;
      onChanged();
      return this;
    }

    private boolean isV3_ ;
    /**
     * <pre>
     * Whether the uploaded package will be a .tar.gz which contains a Dockerfile or the standard .zip
     * </pre>
     *
     * <code>bool is_v3 = 5;</code>
     * @return The isV3.
     */
    @java.lang.Override
    public boolean getIsV3() {
      return isV3_;
    }
    /**
     * <pre>
     * Whether the uploaded package will be a .tar.gz which contains a Dockerfile or the standard .zip
     * </pre>
     *
     * <code>bool is_v3 = 5;</code>
     * @param value The isV3 to set.
     * @return This builder for chaining.
     */
    public Builder setIsV3(boolean value) {
      
      isV3_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether the uploaded package will be a .tar.gz which contains a Dockerfile or the standard .zip
     * </pre>
     *
     * <code>bool is_v3 = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsV3() {
      
      isV3_ = false;
      onChanged();
      return this;
    }

    private long storageRequestSize_ ;
    /**
     * <pre>
     * Number of bytes requested for the build process.
     * </pre>
     *
     * <code>uint64 storage_request_size = 6;</code>
     * @return The storageRequestSize.
     */
    @java.lang.Override
    public long getStorageRequestSize() {
      return storageRequestSize_;
    }
    /**
     * <pre>
     * Number of bytes requested for the build process.
     * </pre>
     *
     * <code>uint64 storage_request_size = 6;</code>
     * @param value The storageRequestSize to set.
     * @return This builder for chaining.
     */
    public Builder setStorageRequestSize(long value) {
      
      storageRequestSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of bytes requested for the build process.
     * </pre>
     *
     * <code>uint64 storage_request_size = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearStorageRequestSize() {
      
      storageRequestSize_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.PostModelVersionsUploadConfig)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.PostModelVersionsUploadConfig)
  private static final com.clarifai.grpc.api.PostModelVersionsUploadConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.PostModelVersionsUploadConfig();
  }

  public static com.clarifai.grpc.api.PostModelVersionsUploadConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PostModelVersionsUploadConfig>
      PARSER = new com.google.protobuf.AbstractParser<PostModelVersionsUploadConfig>() {
    @java.lang.Override
    public PostModelVersionsUploadConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PostModelVersionsUploadConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PostModelVersionsUploadConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PostModelVersionsUploadConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.PostModelVersionsUploadConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

