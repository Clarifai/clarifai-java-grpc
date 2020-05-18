// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

/**
 * Protobuf type {@code clarifai.api.PostAnnotationsRequest}
 */
public  final class PostAnnotationsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.PostAnnotationsRequest)
    PostAnnotationsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PostAnnotationsRequest.newBuilder() to construct.
  private PostAnnotationsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PostAnnotationsRequest() {
    annotations_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PostAnnotationsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PostAnnotationsRequest(
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
              annotations_ = new java.util.ArrayList<com.clarifai.grpc.api.Annotation>();
              mutable_bitField0_ |= 0x00000001;
            }
            annotations_.add(
                input.readMessage(com.clarifai.grpc.api.Annotation.parser(), extensionRegistry));
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
        annotations_ = java.util.Collections.unmodifiableList(annotations_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostAnnotationsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostAnnotationsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.PostAnnotationsRequest.class, com.clarifai.grpc.api.PostAnnotationsRequest.Builder.class);
  }

  public static final int USER_APP_ID_FIELD_NUMBER = 1;
  private com.clarifai.grpc.api.UserAppIDSet userAppId_;
  /**
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   * @return Whether the userAppId field is set.
   */
  public boolean hasUserAppId() {
    return userAppId_ != null;
  }
  /**
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   * @return The userAppId.
   */
  public com.clarifai.grpc.api.UserAppIDSet getUserAppId() {
    return userAppId_ == null ? com.clarifai.grpc.api.UserAppIDSet.getDefaultInstance() : userAppId_;
  }
  /**
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   */
  public com.clarifai.grpc.api.UserAppIDSetOrBuilder getUserAppIdOrBuilder() {
    return getUserAppId();
  }

  public static final int ANNOTATIONS_FIELD_NUMBER = 2;
  private java.util.List<com.clarifai.grpc.api.Annotation> annotations_;
  /**
   * <code>repeated .clarifai.api.Annotation annotations = 2;</code>
   */
  public java.util.List<com.clarifai.grpc.api.Annotation> getAnnotationsList() {
    return annotations_;
  }
  /**
   * <code>repeated .clarifai.api.Annotation annotations = 2;</code>
   */
  public java.util.List<? extends com.clarifai.grpc.api.AnnotationOrBuilder> 
      getAnnotationsOrBuilderList() {
    return annotations_;
  }
  /**
   * <code>repeated .clarifai.api.Annotation annotations = 2;</code>
   */
  public int getAnnotationsCount() {
    return annotations_.size();
  }
  /**
   * <code>repeated .clarifai.api.Annotation annotations = 2;</code>
   */
  public com.clarifai.grpc.api.Annotation getAnnotations(int index) {
    return annotations_.get(index);
  }
  /**
   * <code>repeated .clarifai.api.Annotation annotations = 2;</code>
   */
  public com.clarifai.grpc.api.AnnotationOrBuilder getAnnotationsOrBuilder(
      int index) {
    return annotations_.get(index);
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
    for (int i = 0; i < annotations_.size(); i++) {
      output.writeMessage(2, annotations_.get(i));
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
    for (int i = 0; i < annotations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, annotations_.get(i));
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
    if (!(obj instanceof com.clarifai.grpc.api.PostAnnotationsRequest)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.PostAnnotationsRequest other = (com.clarifai.grpc.api.PostAnnotationsRequest) obj;

    if (hasUserAppId() != other.hasUserAppId()) return false;
    if (hasUserAppId()) {
      if (!getUserAppId()
          .equals(other.getUserAppId())) return false;
    }
    if (!getAnnotationsList()
        .equals(other.getAnnotationsList())) return false;
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
    if (getAnnotationsCount() > 0) {
      hash = (37 * hash) + ANNOTATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getAnnotationsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.PostAnnotationsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.PostAnnotationsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostAnnotationsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.PostAnnotationsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostAnnotationsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.PostAnnotationsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostAnnotationsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.PostAnnotationsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostAnnotationsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.PostAnnotationsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostAnnotationsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.PostAnnotationsRequest parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.PostAnnotationsRequest prototype) {
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
   * Protobuf type {@code clarifai.api.PostAnnotationsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.PostAnnotationsRequest)
      com.clarifai.grpc.api.PostAnnotationsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostAnnotationsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostAnnotationsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.PostAnnotationsRequest.class, com.clarifai.grpc.api.PostAnnotationsRequest.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.PostAnnotationsRequest.newBuilder()
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
        getAnnotationsFieldBuilder();
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
      if (annotationsBuilder_ == null) {
        annotations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        annotationsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostAnnotationsRequest_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.PostAnnotationsRequest getDefaultInstanceForType() {
      return com.clarifai.grpc.api.PostAnnotationsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.PostAnnotationsRequest build() {
      com.clarifai.grpc.api.PostAnnotationsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.PostAnnotationsRequest buildPartial() {
      com.clarifai.grpc.api.PostAnnotationsRequest result = new com.clarifai.grpc.api.PostAnnotationsRequest(this);
      int from_bitField0_ = bitField0_;
      if (userAppIdBuilder_ == null) {
        result.userAppId_ = userAppId_;
      } else {
        result.userAppId_ = userAppIdBuilder_.build();
      }
      if (annotationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          annotations_ = java.util.Collections.unmodifiableList(annotations_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.annotations_ = annotations_;
      } else {
        result.annotations_ = annotationsBuilder_.build();
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
      if (other instanceof com.clarifai.grpc.api.PostAnnotationsRequest) {
        return mergeFrom((com.clarifai.grpc.api.PostAnnotationsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.PostAnnotationsRequest other) {
      if (other == com.clarifai.grpc.api.PostAnnotationsRequest.getDefaultInstance()) return this;
      if (other.hasUserAppId()) {
        mergeUserAppId(other.getUserAppId());
      }
      if (annotationsBuilder_ == null) {
        if (!other.annotations_.isEmpty()) {
          if (annotations_.isEmpty()) {
            annotations_ = other.annotations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAnnotationsIsMutable();
            annotations_.addAll(other.annotations_);
          }
          onChanged();
        }
      } else {
        if (!other.annotations_.isEmpty()) {
          if (annotationsBuilder_.isEmpty()) {
            annotationsBuilder_.dispose();
            annotationsBuilder_ = null;
            annotations_ = other.annotations_;
            bitField0_ = (bitField0_ & ~0x00000001);
            annotationsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAnnotationsFieldBuilder() : null;
          } else {
            annotationsBuilder_.addAllMessages(other.annotations_);
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
      com.clarifai.grpc.api.PostAnnotationsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.PostAnnotationsRequest) e.getUnfinishedMessage();
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

    private java.util.List<com.clarifai.grpc.api.Annotation> annotations_ =
      java.util.Collections.emptyList();
    private void ensureAnnotationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        annotations_ = new java.util.ArrayList<com.clarifai.grpc.api.Annotation>(annotations_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.Annotation, com.clarifai.grpc.api.Annotation.Builder, com.clarifai.grpc.api.AnnotationOrBuilder> annotationsBuilder_;

    /**
     * <code>repeated .clarifai.api.Annotation annotations = 2;</code>
     */
    public java.util.List<com.clarifai.grpc.api.Annotation> getAnnotationsList() {
      if (annotationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(annotations_);
      } else {
        return annotationsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .clarifai.api.Annotation annotations = 2;</code>
     */
    public int getAnnotationsCount() {
      if (annotationsBuilder_ == null) {
        return annotations_.size();
      } else {
        return annotationsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .clarifai.api.Annotation annotations = 2;</code>
     */
    public com.clarifai.grpc.api.Annotation getAnnotations(int index) {
      if (annotationsBuilder_ == null) {
        return annotations_.get(index);
      } else {
        return annotationsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .clarifai.api.Annotation annotations = 2;</code>
     */
    public Builder setAnnotations(
        int index, com.clarifai.grpc.api.Annotation value) {
      if (annotationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnnotationsIsMutable();
        annotations_.set(index, value);
        onChanged();
      } else {
        annotationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.Annotation annotations = 2;</code>
     */
    public Builder setAnnotations(
        int index, com.clarifai.grpc.api.Annotation.Builder builderForValue) {
      if (annotationsBuilder_ == null) {
        ensureAnnotationsIsMutable();
        annotations_.set(index, builderForValue.build());
        onChanged();
      } else {
        annotationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.Annotation annotations = 2;</code>
     */
    public Builder addAnnotations(com.clarifai.grpc.api.Annotation value) {
      if (annotationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnnotationsIsMutable();
        annotations_.add(value);
        onChanged();
      } else {
        annotationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.Annotation annotations = 2;</code>
     */
    public Builder addAnnotations(
        int index, com.clarifai.grpc.api.Annotation value) {
      if (annotationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnnotationsIsMutable();
        annotations_.add(index, value);
        onChanged();
      } else {
        annotationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.Annotation annotations = 2;</code>
     */
    public Builder addAnnotations(
        com.clarifai.grpc.api.Annotation.Builder builderForValue) {
      if (annotationsBuilder_ == null) {
        ensureAnnotationsIsMutable();
        annotations_.add(builderForValue.build());
        onChanged();
      } else {
        annotationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.Annotation annotations = 2;</code>
     */
    public Builder addAnnotations(
        int index, com.clarifai.grpc.api.Annotation.Builder builderForValue) {
      if (annotationsBuilder_ == null) {
        ensureAnnotationsIsMutable();
        annotations_.add(index, builderForValue.build());
        onChanged();
      } else {
        annotationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.Annotation annotations = 2;</code>
     */
    public Builder addAllAnnotations(
        java.lang.Iterable<? extends com.clarifai.grpc.api.Annotation> values) {
      if (annotationsBuilder_ == null) {
        ensureAnnotationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, annotations_);
        onChanged();
      } else {
        annotationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.Annotation annotations = 2;</code>
     */
    public Builder clearAnnotations() {
      if (annotationsBuilder_ == null) {
        annotations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        annotationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.Annotation annotations = 2;</code>
     */
    public Builder removeAnnotations(int index) {
      if (annotationsBuilder_ == null) {
        ensureAnnotationsIsMutable();
        annotations_.remove(index);
        onChanged();
      } else {
        annotationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.Annotation annotations = 2;</code>
     */
    public com.clarifai.grpc.api.Annotation.Builder getAnnotationsBuilder(
        int index) {
      return getAnnotationsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .clarifai.api.Annotation annotations = 2;</code>
     */
    public com.clarifai.grpc.api.AnnotationOrBuilder getAnnotationsOrBuilder(
        int index) {
      if (annotationsBuilder_ == null) {
        return annotations_.get(index);  } else {
        return annotationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .clarifai.api.Annotation annotations = 2;</code>
     */
    public java.util.List<? extends com.clarifai.grpc.api.AnnotationOrBuilder> 
         getAnnotationsOrBuilderList() {
      if (annotationsBuilder_ != null) {
        return annotationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(annotations_);
      }
    }
    /**
     * <code>repeated .clarifai.api.Annotation annotations = 2;</code>
     */
    public com.clarifai.grpc.api.Annotation.Builder addAnnotationsBuilder() {
      return getAnnotationsFieldBuilder().addBuilder(
          com.clarifai.grpc.api.Annotation.getDefaultInstance());
    }
    /**
     * <code>repeated .clarifai.api.Annotation annotations = 2;</code>
     */
    public com.clarifai.grpc.api.Annotation.Builder addAnnotationsBuilder(
        int index) {
      return getAnnotationsFieldBuilder().addBuilder(
          index, com.clarifai.grpc.api.Annotation.getDefaultInstance());
    }
    /**
     * <code>repeated .clarifai.api.Annotation annotations = 2;</code>
     */
    public java.util.List<com.clarifai.grpc.api.Annotation.Builder> 
         getAnnotationsBuilderList() {
      return getAnnotationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.Annotation, com.clarifai.grpc.api.Annotation.Builder, com.clarifai.grpc.api.AnnotationOrBuilder> 
        getAnnotationsFieldBuilder() {
      if (annotationsBuilder_ == null) {
        annotationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.clarifai.grpc.api.Annotation, com.clarifai.grpc.api.Annotation.Builder, com.clarifai.grpc.api.AnnotationOrBuilder>(
                annotations_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        annotations_ = null;
      }
      return annotationsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.PostAnnotationsRequest)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.PostAnnotationsRequest)
  private static final com.clarifai.grpc.api.PostAnnotationsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.PostAnnotationsRequest();
  }

  public static com.clarifai.grpc.api.PostAnnotationsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PostAnnotationsRequest>
      PARSER = new com.google.protobuf.AbstractParser<PostAnnotationsRequest>() {
    @java.lang.Override
    public PostAnnotationsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PostAnnotationsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PostAnnotationsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PostAnnotationsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.PostAnnotationsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

