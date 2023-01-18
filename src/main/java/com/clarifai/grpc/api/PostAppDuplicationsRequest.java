// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

/**
 * <pre>
 *Request to start a app duplication process
 * </pre>
 *
 * Protobuf type {@code clarifai.api.PostAppDuplicationsRequest}
 */
public final class PostAppDuplicationsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.PostAppDuplicationsRequest)
    PostAppDuplicationsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PostAppDuplicationsRequest.newBuilder() to construct.
  private PostAppDuplicationsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PostAppDuplicationsRequest() {
    appDuplications_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PostAppDuplicationsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PostAppDuplicationsRequest(
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
              appDuplications_ = new java.util.ArrayList<com.clarifai.grpc.api.AppDuplication>();
              mutable_bitField0_ |= 0x00000001;
            }
            appDuplications_.add(
                input.readMessage(com.clarifai.grpc.api.AppDuplication.parser(), extensionRegistry));
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
        appDuplications_ = java.util.Collections.unmodifiableList(appDuplications_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostAppDuplicationsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostAppDuplicationsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.PostAppDuplicationsRequest.class, com.clarifai.grpc.api.PostAppDuplicationsRequest.Builder.class);
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

  public static final int APP_DUPLICATIONS_FIELD_NUMBER = 2;
  private java.util.List<com.clarifai.grpc.api.AppDuplication> appDuplications_;
  /**
   * <code>repeated .clarifai.api.AppDuplication app_duplications = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.clarifai.grpc.api.AppDuplication> getAppDuplicationsList() {
    return appDuplications_;
  }
  /**
   * <code>repeated .clarifai.api.AppDuplication app_duplications = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.clarifai.grpc.api.AppDuplicationOrBuilder> 
      getAppDuplicationsOrBuilderList() {
    return appDuplications_;
  }
  /**
   * <code>repeated .clarifai.api.AppDuplication app_duplications = 2;</code>
   */
  @java.lang.Override
  public int getAppDuplicationsCount() {
    return appDuplications_.size();
  }
  /**
   * <code>repeated .clarifai.api.AppDuplication app_duplications = 2;</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.AppDuplication getAppDuplications(int index) {
    return appDuplications_.get(index);
  }
  /**
   * <code>repeated .clarifai.api.AppDuplication app_duplications = 2;</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.AppDuplicationOrBuilder getAppDuplicationsOrBuilder(
      int index) {
    return appDuplications_.get(index);
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
    for (int i = 0; i < appDuplications_.size(); i++) {
      output.writeMessage(2, appDuplications_.get(i));
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
    for (int i = 0; i < appDuplications_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, appDuplications_.get(i));
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
    if (!(obj instanceof com.clarifai.grpc.api.PostAppDuplicationsRequest)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.PostAppDuplicationsRequest other = (com.clarifai.grpc.api.PostAppDuplicationsRequest) obj;

    if (hasUserAppId() != other.hasUserAppId()) return false;
    if (hasUserAppId()) {
      if (!getUserAppId()
          .equals(other.getUserAppId())) return false;
    }
    if (!getAppDuplicationsList()
        .equals(other.getAppDuplicationsList())) return false;
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
    if (getAppDuplicationsCount() > 0) {
      hash = (37 * hash) + APP_DUPLICATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getAppDuplicationsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.PostAppDuplicationsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.PostAppDuplicationsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostAppDuplicationsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.PostAppDuplicationsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostAppDuplicationsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.PostAppDuplicationsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostAppDuplicationsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.PostAppDuplicationsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostAppDuplicationsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.PostAppDuplicationsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostAppDuplicationsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.PostAppDuplicationsRequest parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.PostAppDuplicationsRequest prototype) {
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
   *Request to start a app duplication process
   * </pre>
   *
   * Protobuf type {@code clarifai.api.PostAppDuplicationsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.PostAppDuplicationsRequest)
      com.clarifai.grpc.api.PostAppDuplicationsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostAppDuplicationsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostAppDuplicationsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.PostAppDuplicationsRequest.class, com.clarifai.grpc.api.PostAppDuplicationsRequest.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.PostAppDuplicationsRequest.newBuilder()
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
        getAppDuplicationsFieldBuilder();
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
      if (appDuplicationsBuilder_ == null) {
        appDuplications_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        appDuplicationsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostAppDuplicationsRequest_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.PostAppDuplicationsRequest getDefaultInstanceForType() {
      return com.clarifai.grpc.api.PostAppDuplicationsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.PostAppDuplicationsRequest build() {
      com.clarifai.grpc.api.PostAppDuplicationsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.PostAppDuplicationsRequest buildPartial() {
      com.clarifai.grpc.api.PostAppDuplicationsRequest result = new com.clarifai.grpc.api.PostAppDuplicationsRequest(this);
      int from_bitField0_ = bitField0_;
      if (userAppIdBuilder_ == null) {
        result.userAppId_ = userAppId_;
      } else {
        result.userAppId_ = userAppIdBuilder_.build();
      }
      if (appDuplicationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          appDuplications_ = java.util.Collections.unmodifiableList(appDuplications_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.appDuplications_ = appDuplications_;
      } else {
        result.appDuplications_ = appDuplicationsBuilder_.build();
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
      if (other instanceof com.clarifai.grpc.api.PostAppDuplicationsRequest) {
        return mergeFrom((com.clarifai.grpc.api.PostAppDuplicationsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.PostAppDuplicationsRequest other) {
      if (other == com.clarifai.grpc.api.PostAppDuplicationsRequest.getDefaultInstance()) return this;
      if (other.hasUserAppId()) {
        mergeUserAppId(other.getUserAppId());
      }
      if (appDuplicationsBuilder_ == null) {
        if (!other.appDuplications_.isEmpty()) {
          if (appDuplications_.isEmpty()) {
            appDuplications_ = other.appDuplications_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAppDuplicationsIsMutable();
            appDuplications_.addAll(other.appDuplications_);
          }
          onChanged();
        }
      } else {
        if (!other.appDuplications_.isEmpty()) {
          if (appDuplicationsBuilder_.isEmpty()) {
            appDuplicationsBuilder_.dispose();
            appDuplicationsBuilder_ = null;
            appDuplications_ = other.appDuplications_;
            bitField0_ = (bitField0_ & ~0x00000001);
            appDuplicationsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAppDuplicationsFieldBuilder() : null;
          } else {
            appDuplicationsBuilder_.addAllMessages(other.appDuplications_);
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
      com.clarifai.grpc.api.PostAppDuplicationsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.PostAppDuplicationsRequest) e.getUnfinishedMessage();
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

    private java.util.List<com.clarifai.grpc.api.AppDuplication> appDuplications_ =
      java.util.Collections.emptyList();
    private void ensureAppDuplicationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        appDuplications_ = new java.util.ArrayList<com.clarifai.grpc.api.AppDuplication>(appDuplications_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.AppDuplication, com.clarifai.grpc.api.AppDuplication.Builder, com.clarifai.grpc.api.AppDuplicationOrBuilder> appDuplicationsBuilder_;

    /**
     * <code>repeated .clarifai.api.AppDuplication app_duplications = 2;</code>
     */
    public java.util.List<com.clarifai.grpc.api.AppDuplication> getAppDuplicationsList() {
      if (appDuplicationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(appDuplications_);
      } else {
        return appDuplicationsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .clarifai.api.AppDuplication app_duplications = 2;</code>
     */
    public int getAppDuplicationsCount() {
      if (appDuplicationsBuilder_ == null) {
        return appDuplications_.size();
      } else {
        return appDuplicationsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .clarifai.api.AppDuplication app_duplications = 2;</code>
     */
    public com.clarifai.grpc.api.AppDuplication getAppDuplications(int index) {
      if (appDuplicationsBuilder_ == null) {
        return appDuplications_.get(index);
      } else {
        return appDuplicationsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .clarifai.api.AppDuplication app_duplications = 2;</code>
     */
    public Builder setAppDuplications(
        int index, com.clarifai.grpc.api.AppDuplication value) {
      if (appDuplicationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAppDuplicationsIsMutable();
        appDuplications_.set(index, value);
        onChanged();
      } else {
        appDuplicationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.AppDuplication app_duplications = 2;</code>
     */
    public Builder setAppDuplications(
        int index, com.clarifai.grpc.api.AppDuplication.Builder builderForValue) {
      if (appDuplicationsBuilder_ == null) {
        ensureAppDuplicationsIsMutable();
        appDuplications_.set(index, builderForValue.build());
        onChanged();
      } else {
        appDuplicationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.AppDuplication app_duplications = 2;</code>
     */
    public Builder addAppDuplications(com.clarifai.grpc.api.AppDuplication value) {
      if (appDuplicationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAppDuplicationsIsMutable();
        appDuplications_.add(value);
        onChanged();
      } else {
        appDuplicationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.AppDuplication app_duplications = 2;</code>
     */
    public Builder addAppDuplications(
        int index, com.clarifai.grpc.api.AppDuplication value) {
      if (appDuplicationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAppDuplicationsIsMutable();
        appDuplications_.add(index, value);
        onChanged();
      } else {
        appDuplicationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.AppDuplication app_duplications = 2;</code>
     */
    public Builder addAppDuplications(
        com.clarifai.grpc.api.AppDuplication.Builder builderForValue) {
      if (appDuplicationsBuilder_ == null) {
        ensureAppDuplicationsIsMutable();
        appDuplications_.add(builderForValue.build());
        onChanged();
      } else {
        appDuplicationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.AppDuplication app_duplications = 2;</code>
     */
    public Builder addAppDuplications(
        int index, com.clarifai.grpc.api.AppDuplication.Builder builderForValue) {
      if (appDuplicationsBuilder_ == null) {
        ensureAppDuplicationsIsMutable();
        appDuplications_.add(index, builderForValue.build());
        onChanged();
      } else {
        appDuplicationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.AppDuplication app_duplications = 2;</code>
     */
    public Builder addAllAppDuplications(
        java.lang.Iterable<? extends com.clarifai.grpc.api.AppDuplication> values) {
      if (appDuplicationsBuilder_ == null) {
        ensureAppDuplicationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, appDuplications_);
        onChanged();
      } else {
        appDuplicationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.AppDuplication app_duplications = 2;</code>
     */
    public Builder clearAppDuplications() {
      if (appDuplicationsBuilder_ == null) {
        appDuplications_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        appDuplicationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.AppDuplication app_duplications = 2;</code>
     */
    public Builder removeAppDuplications(int index) {
      if (appDuplicationsBuilder_ == null) {
        ensureAppDuplicationsIsMutable();
        appDuplications_.remove(index);
        onChanged();
      } else {
        appDuplicationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.AppDuplication app_duplications = 2;</code>
     */
    public com.clarifai.grpc.api.AppDuplication.Builder getAppDuplicationsBuilder(
        int index) {
      return getAppDuplicationsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .clarifai.api.AppDuplication app_duplications = 2;</code>
     */
    public com.clarifai.grpc.api.AppDuplicationOrBuilder getAppDuplicationsOrBuilder(
        int index) {
      if (appDuplicationsBuilder_ == null) {
        return appDuplications_.get(index);  } else {
        return appDuplicationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .clarifai.api.AppDuplication app_duplications = 2;</code>
     */
    public java.util.List<? extends com.clarifai.grpc.api.AppDuplicationOrBuilder> 
         getAppDuplicationsOrBuilderList() {
      if (appDuplicationsBuilder_ != null) {
        return appDuplicationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(appDuplications_);
      }
    }
    /**
     * <code>repeated .clarifai.api.AppDuplication app_duplications = 2;</code>
     */
    public com.clarifai.grpc.api.AppDuplication.Builder addAppDuplicationsBuilder() {
      return getAppDuplicationsFieldBuilder().addBuilder(
          com.clarifai.grpc.api.AppDuplication.getDefaultInstance());
    }
    /**
     * <code>repeated .clarifai.api.AppDuplication app_duplications = 2;</code>
     */
    public com.clarifai.grpc.api.AppDuplication.Builder addAppDuplicationsBuilder(
        int index) {
      return getAppDuplicationsFieldBuilder().addBuilder(
          index, com.clarifai.grpc.api.AppDuplication.getDefaultInstance());
    }
    /**
     * <code>repeated .clarifai.api.AppDuplication app_duplications = 2;</code>
     */
    public java.util.List<com.clarifai.grpc.api.AppDuplication.Builder> 
         getAppDuplicationsBuilderList() {
      return getAppDuplicationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.AppDuplication, com.clarifai.grpc.api.AppDuplication.Builder, com.clarifai.grpc.api.AppDuplicationOrBuilder> 
        getAppDuplicationsFieldBuilder() {
      if (appDuplicationsBuilder_ == null) {
        appDuplicationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.clarifai.grpc.api.AppDuplication, com.clarifai.grpc.api.AppDuplication.Builder, com.clarifai.grpc.api.AppDuplicationOrBuilder>(
                appDuplications_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        appDuplications_ = null;
      }
      return appDuplicationsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.PostAppDuplicationsRequest)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.PostAppDuplicationsRequest)
  private static final com.clarifai.grpc.api.PostAppDuplicationsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.PostAppDuplicationsRequest();
  }

  public static com.clarifai.grpc.api.PostAppDuplicationsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PostAppDuplicationsRequest>
      PARSER = new com.google.protobuf.AbstractParser<PostAppDuplicationsRequest>() {
    @java.lang.Override
    public PostAppDuplicationsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PostAppDuplicationsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PostAppDuplicationsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PostAppDuplicationsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.PostAppDuplicationsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

