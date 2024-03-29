// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

/**
 * Protobuf type {@code clarifai.api.PostWorkflowVersionsUnPublishRequest}
 */
public final class PostWorkflowVersionsUnPublishRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.PostWorkflowVersionsUnPublishRequest)
    PostWorkflowVersionsUnPublishRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PostWorkflowVersionsUnPublishRequest.newBuilder() to construct.
  private PostWorkflowVersionsUnPublishRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PostWorkflowVersionsUnPublishRequest() {
    workflowId_ = "";
    publications_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PostWorkflowVersionsUnPublishRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PostWorkflowVersionsUnPublishRequest(
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

            workflowId_ = s;
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              publications_ = new java.util.ArrayList<com.clarifai.grpc.api.WorkflowVersionUnPublishRequest>();
              mutable_bitField0_ |= 0x00000001;
            }
            publications_.add(
                input.readMessage(com.clarifai.grpc.api.WorkflowVersionUnPublishRequest.parser(), extensionRegistry));
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
        publications_ = java.util.Collections.unmodifiableList(publications_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostWorkflowVersionsUnPublishRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostWorkflowVersionsUnPublishRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest.class, com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest.Builder.class);
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

  public static final int WORKFLOW_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object workflowId_;
  /**
   * <code>string workflow_id = 2;</code>
   * @return The workflowId.
   */
  @java.lang.Override
  public java.lang.String getWorkflowId() {
    java.lang.Object ref = workflowId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      workflowId_ = s;
      return s;
    }
  }
  /**
   * <code>string workflow_id = 2;</code>
   * @return The bytes for workflowId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getWorkflowIdBytes() {
    java.lang.Object ref = workflowId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      workflowId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PUBLICATIONS_FIELD_NUMBER = 3;
  private java.util.List<com.clarifai.grpc.api.WorkflowVersionUnPublishRequest> publications_;
  /**
   * <code>repeated .clarifai.api.WorkflowVersionUnPublishRequest publications = 3;</code>
   */
  @java.lang.Override
  public java.util.List<com.clarifai.grpc.api.WorkflowVersionUnPublishRequest> getPublicationsList() {
    return publications_;
  }
  /**
   * <code>repeated .clarifai.api.WorkflowVersionUnPublishRequest publications = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.clarifai.grpc.api.WorkflowVersionUnPublishRequestOrBuilder> 
      getPublicationsOrBuilderList() {
    return publications_;
  }
  /**
   * <code>repeated .clarifai.api.WorkflowVersionUnPublishRequest publications = 3;</code>
   */
  @java.lang.Override
  public int getPublicationsCount() {
    return publications_.size();
  }
  /**
   * <code>repeated .clarifai.api.WorkflowVersionUnPublishRequest publications = 3;</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.WorkflowVersionUnPublishRequest getPublications(int index) {
    return publications_.get(index);
  }
  /**
   * <code>repeated .clarifai.api.WorkflowVersionUnPublishRequest publications = 3;</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.WorkflowVersionUnPublishRequestOrBuilder getPublicationsOrBuilder(
      int index) {
    return publications_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(workflowId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, workflowId_);
    }
    for (int i = 0; i < publications_.size(); i++) {
      output.writeMessage(3, publications_.get(i));
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(workflowId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, workflowId_);
    }
    for (int i = 0; i < publications_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, publications_.get(i));
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
    if (!(obj instanceof com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest other = (com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest) obj;

    if (hasUserAppId() != other.hasUserAppId()) return false;
    if (hasUserAppId()) {
      if (!getUserAppId()
          .equals(other.getUserAppId())) return false;
    }
    if (!getWorkflowId()
        .equals(other.getWorkflowId())) return false;
    if (!getPublicationsList()
        .equals(other.getPublicationsList())) return false;
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
    hash = (37 * hash) + WORKFLOW_ID_FIELD_NUMBER;
    hash = (53 * hash) + getWorkflowId().hashCode();
    if (getPublicationsCount() > 0) {
      hash = (37 * hash) + PUBLICATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getPublicationsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest prototype) {
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
   * Protobuf type {@code clarifai.api.PostWorkflowVersionsUnPublishRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.PostWorkflowVersionsUnPublishRequest)
      com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostWorkflowVersionsUnPublishRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostWorkflowVersionsUnPublishRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest.class, com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest.newBuilder()
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
        getPublicationsFieldBuilder();
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
      workflowId_ = "";

      if (publicationsBuilder_ == null) {
        publications_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        publicationsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostWorkflowVersionsUnPublishRequest_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest getDefaultInstanceForType() {
      return com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest build() {
      com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest buildPartial() {
      com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest result = new com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest(this);
      int from_bitField0_ = bitField0_;
      if (userAppIdBuilder_ == null) {
        result.userAppId_ = userAppId_;
      } else {
        result.userAppId_ = userAppIdBuilder_.build();
      }
      result.workflowId_ = workflowId_;
      if (publicationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          publications_ = java.util.Collections.unmodifiableList(publications_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.publications_ = publications_;
      } else {
        result.publications_ = publicationsBuilder_.build();
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
      if (other instanceof com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest) {
        return mergeFrom((com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest other) {
      if (other == com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest.getDefaultInstance()) return this;
      if (other.hasUserAppId()) {
        mergeUserAppId(other.getUserAppId());
      }
      if (!other.getWorkflowId().isEmpty()) {
        workflowId_ = other.workflowId_;
        onChanged();
      }
      if (publicationsBuilder_ == null) {
        if (!other.publications_.isEmpty()) {
          if (publications_.isEmpty()) {
            publications_ = other.publications_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePublicationsIsMutable();
            publications_.addAll(other.publications_);
          }
          onChanged();
        }
      } else {
        if (!other.publications_.isEmpty()) {
          if (publicationsBuilder_.isEmpty()) {
            publicationsBuilder_.dispose();
            publicationsBuilder_ = null;
            publications_ = other.publications_;
            bitField0_ = (bitField0_ & ~0x00000001);
            publicationsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPublicationsFieldBuilder() : null;
          } else {
            publicationsBuilder_.addAllMessages(other.publications_);
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
      com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest) e.getUnfinishedMessage();
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

    private java.lang.Object workflowId_ = "";
    /**
     * <code>string workflow_id = 2;</code>
     * @return The workflowId.
     */
    public java.lang.String getWorkflowId() {
      java.lang.Object ref = workflowId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        workflowId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string workflow_id = 2;</code>
     * @return The bytes for workflowId.
     */
    public com.google.protobuf.ByteString
        getWorkflowIdBytes() {
      java.lang.Object ref = workflowId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        workflowId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string workflow_id = 2;</code>
     * @param value The workflowId to set.
     * @return This builder for chaining.
     */
    public Builder setWorkflowId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      workflowId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string workflow_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearWorkflowId() {
      
      workflowId_ = getDefaultInstance().getWorkflowId();
      onChanged();
      return this;
    }
    /**
     * <code>string workflow_id = 2;</code>
     * @param value The bytes for workflowId to set.
     * @return This builder for chaining.
     */
    public Builder setWorkflowIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      workflowId_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.clarifai.grpc.api.WorkflowVersionUnPublishRequest> publications_ =
      java.util.Collections.emptyList();
    private void ensurePublicationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        publications_ = new java.util.ArrayList<com.clarifai.grpc.api.WorkflowVersionUnPublishRequest>(publications_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.WorkflowVersionUnPublishRequest, com.clarifai.grpc.api.WorkflowVersionUnPublishRequest.Builder, com.clarifai.grpc.api.WorkflowVersionUnPublishRequestOrBuilder> publicationsBuilder_;

    /**
     * <code>repeated .clarifai.api.WorkflowVersionUnPublishRequest publications = 3;</code>
     */
    public java.util.List<com.clarifai.grpc.api.WorkflowVersionUnPublishRequest> getPublicationsList() {
      if (publicationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(publications_);
      } else {
        return publicationsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .clarifai.api.WorkflowVersionUnPublishRequest publications = 3;</code>
     */
    public int getPublicationsCount() {
      if (publicationsBuilder_ == null) {
        return publications_.size();
      } else {
        return publicationsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .clarifai.api.WorkflowVersionUnPublishRequest publications = 3;</code>
     */
    public com.clarifai.grpc.api.WorkflowVersionUnPublishRequest getPublications(int index) {
      if (publicationsBuilder_ == null) {
        return publications_.get(index);
      } else {
        return publicationsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .clarifai.api.WorkflowVersionUnPublishRequest publications = 3;</code>
     */
    public Builder setPublications(
        int index, com.clarifai.grpc.api.WorkflowVersionUnPublishRequest value) {
      if (publicationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePublicationsIsMutable();
        publications_.set(index, value);
        onChanged();
      } else {
        publicationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.WorkflowVersionUnPublishRequest publications = 3;</code>
     */
    public Builder setPublications(
        int index, com.clarifai.grpc.api.WorkflowVersionUnPublishRequest.Builder builderForValue) {
      if (publicationsBuilder_ == null) {
        ensurePublicationsIsMutable();
        publications_.set(index, builderForValue.build());
        onChanged();
      } else {
        publicationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.WorkflowVersionUnPublishRequest publications = 3;</code>
     */
    public Builder addPublications(com.clarifai.grpc.api.WorkflowVersionUnPublishRequest value) {
      if (publicationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePublicationsIsMutable();
        publications_.add(value);
        onChanged();
      } else {
        publicationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.WorkflowVersionUnPublishRequest publications = 3;</code>
     */
    public Builder addPublications(
        int index, com.clarifai.grpc.api.WorkflowVersionUnPublishRequest value) {
      if (publicationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePublicationsIsMutable();
        publications_.add(index, value);
        onChanged();
      } else {
        publicationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.WorkflowVersionUnPublishRequest publications = 3;</code>
     */
    public Builder addPublications(
        com.clarifai.grpc.api.WorkflowVersionUnPublishRequest.Builder builderForValue) {
      if (publicationsBuilder_ == null) {
        ensurePublicationsIsMutable();
        publications_.add(builderForValue.build());
        onChanged();
      } else {
        publicationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.WorkflowVersionUnPublishRequest publications = 3;</code>
     */
    public Builder addPublications(
        int index, com.clarifai.grpc.api.WorkflowVersionUnPublishRequest.Builder builderForValue) {
      if (publicationsBuilder_ == null) {
        ensurePublicationsIsMutable();
        publications_.add(index, builderForValue.build());
        onChanged();
      } else {
        publicationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.WorkflowVersionUnPublishRequest publications = 3;</code>
     */
    public Builder addAllPublications(
        java.lang.Iterable<? extends com.clarifai.grpc.api.WorkflowVersionUnPublishRequest> values) {
      if (publicationsBuilder_ == null) {
        ensurePublicationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, publications_);
        onChanged();
      } else {
        publicationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.WorkflowVersionUnPublishRequest publications = 3;</code>
     */
    public Builder clearPublications() {
      if (publicationsBuilder_ == null) {
        publications_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        publicationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.WorkflowVersionUnPublishRequest publications = 3;</code>
     */
    public Builder removePublications(int index) {
      if (publicationsBuilder_ == null) {
        ensurePublicationsIsMutable();
        publications_.remove(index);
        onChanged();
      } else {
        publicationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.WorkflowVersionUnPublishRequest publications = 3;</code>
     */
    public com.clarifai.grpc.api.WorkflowVersionUnPublishRequest.Builder getPublicationsBuilder(
        int index) {
      return getPublicationsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .clarifai.api.WorkflowVersionUnPublishRequest publications = 3;</code>
     */
    public com.clarifai.grpc.api.WorkflowVersionUnPublishRequestOrBuilder getPublicationsOrBuilder(
        int index) {
      if (publicationsBuilder_ == null) {
        return publications_.get(index);  } else {
        return publicationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .clarifai.api.WorkflowVersionUnPublishRequest publications = 3;</code>
     */
    public java.util.List<? extends com.clarifai.grpc.api.WorkflowVersionUnPublishRequestOrBuilder> 
         getPublicationsOrBuilderList() {
      if (publicationsBuilder_ != null) {
        return publicationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(publications_);
      }
    }
    /**
     * <code>repeated .clarifai.api.WorkflowVersionUnPublishRequest publications = 3;</code>
     */
    public com.clarifai.grpc.api.WorkflowVersionUnPublishRequest.Builder addPublicationsBuilder() {
      return getPublicationsFieldBuilder().addBuilder(
          com.clarifai.grpc.api.WorkflowVersionUnPublishRequest.getDefaultInstance());
    }
    /**
     * <code>repeated .clarifai.api.WorkflowVersionUnPublishRequest publications = 3;</code>
     */
    public com.clarifai.grpc.api.WorkflowVersionUnPublishRequest.Builder addPublicationsBuilder(
        int index) {
      return getPublicationsFieldBuilder().addBuilder(
          index, com.clarifai.grpc.api.WorkflowVersionUnPublishRequest.getDefaultInstance());
    }
    /**
     * <code>repeated .clarifai.api.WorkflowVersionUnPublishRequest publications = 3;</code>
     */
    public java.util.List<com.clarifai.grpc.api.WorkflowVersionUnPublishRequest.Builder> 
         getPublicationsBuilderList() {
      return getPublicationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.WorkflowVersionUnPublishRequest, com.clarifai.grpc.api.WorkflowVersionUnPublishRequest.Builder, com.clarifai.grpc.api.WorkflowVersionUnPublishRequestOrBuilder> 
        getPublicationsFieldBuilder() {
      if (publicationsBuilder_ == null) {
        publicationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.clarifai.grpc.api.WorkflowVersionUnPublishRequest, com.clarifai.grpc.api.WorkflowVersionUnPublishRequest.Builder, com.clarifai.grpc.api.WorkflowVersionUnPublishRequestOrBuilder>(
                publications_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        publications_ = null;
      }
      return publicationsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.PostWorkflowVersionsUnPublishRequest)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.PostWorkflowVersionsUnPublishRequest)
  private static final com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest();
  }

  public static com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PostWorkflowVersionsUnPublishRequest>
      PARSER = new com.google.protobuf.AbstractParser<PostWorkflowVersionsUnPublishRequest>() {
    @java.lang.Override
    public PostWorkflowVersionsUnPublishRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PostWorkflowVersionsUnPublishRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PostWorkflowVersionsUnPublishRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PostWorkflowVersionsUnPublishRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.PostWorkflowVersionsUnPublishRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

