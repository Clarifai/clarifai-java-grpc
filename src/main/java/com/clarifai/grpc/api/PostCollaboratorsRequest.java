// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

/**
 * Protobuf type {@code clarifai.api.PostCollaboratorsRequest}
 */
public  final class PostCollaboratorsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.PostCollaboratorsRequest)
    PostCollaboratorsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PostCollaboratorsRequest.newBuilder() to construct.
  private PostCollaboratorsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PostCollaboratorsRequest() {
    collaborators_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PostCollaboratorsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PostCollaboratorsRequest(
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
              collaborators_ = new java.util.ArrayList<com.clarifai.grpc.api.Collaborator>();
              mutable_bitField0_ |= 0x00000001;
            }
            collaborators_.add(
                input.readMessage(com.clarifai.grpc.api.Collaborator.parser(), extensionRegistry));
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
        collaborators_ = java.util.Collections.unmodifiableList(collaborators_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostCollaboratorsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostCollaboratorsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.PostCollaboratorsRequest.class, com.clarifai.grpc.api.PostCollaboratorsRequest.Builder.class);
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

  public static final int COLLABORATORS_FIELD_NUMBER = 2;
  private java.util.List<com.clarifai.grpc.api.Collaborator> collaborators_;
  /**
   * <code>repeated .clarifai.api.Collaborator collaborators = 2;</code>
   */
  public java.util.List<com.clarifai.grpc.api.Collaborator> getCollaboratorsList() {
    return collaborators_;
  }
  /**
   * <code>repeated .clarifai.api.Collaborator collaborators = 2;</code>
   */
  public java.util.List<? extends com.clarifai.grpc.api.CollaboratorOrBuilder> 
      getCollaboratorsOrBuilderList() {
    return collaborators_;
  }
  /**
   * <code>repeated .clarifai.api.Collaborator collaborators = 2;</code>
   */
  public int getCollaboratorsCount() {
    return collaborators_.size();
  }
  /**
   * <code>repeated .clarifai.api.Collaborator collaborators = 2;</code>
   */
  public com.clarifai.grpc.api.Collaborator getCollaborators(int index) {
    return collaborators_.get(index);
  }
  /**
   * <code>repeated .clarifai.api.Collaborator collaborators = 2;</code>
   */
  public com.clarifai.grpc.api.CollaboratorOrBuilder getCollaboratorsOrBuilder(
      int index) {
    return collaborators_.get(index);
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
    for (int i = 0; i < collaborators_.size(); i++) {
      output.writeMessage(2, collaborators_.get(i));
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
    for (int i = 0; i < collaborators_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, collaborators_.get(i));
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
    if (!(obj instanceof com.clarifai.grpc.api.PostCollaboratorsRequest)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.PostCollaboratorsRequest other = (com.clarifai.grpc.api.PostCollaboratorsRequest) obj;

    if (hasUserAppId() != other.hasUserAppId()) return false;
    if (hasUserAppId()) {
      if (!getUserAppId()
          .equals(other.getUserAppId())) return false;
    }
    if (!getCollaboratorsList()
        .equals(other.getCollaboratorsList())) return false;
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
    if (getCollaboratorsCount() > 0) {
      hash = (37 * hash) + COLLABORATORS_FIELD_NUMBER;
      hash = (53 * hash) + getCollaboratorsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.PostCollaboratorsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.PostCollaboratorsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostCollaboratorsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.PostCollaboratorsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostCollaboratorsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.PostCollaboratorsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostCollaboratorsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.PostCollaboratorsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostCollaboratorsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.PostCollaboratorsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostCollaboratorsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.PostCollaboratorsRequest parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.PostCollaboratorsRequest prototype) {
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
   * Protobuf type {@code clarifai.api.PostCollaboratorsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.PostCollaboratorsRequest)
      com.clarifai.grpc.api.PostCollaboratorsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostCollaboratorsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostCollaboratorsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.PostCollaboratorsRequest.class, com.clarifai.grpc.api.PostCollaboratorsRequest.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.PostCollaboratorsRequest.newBuilder()
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
        getCollaboratorsFieldBuilder();
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
      if (collaboratorsBuilder_ == null) {
        collaborators_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        collaboratorsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostCollaboratorsRequest_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.PostCollaboratorsRequest getDefaultInstanceForType() {
      return com.clarifai.grpc.api.PostCollaboratorsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.PostCollaboratorsRequest build() {
      com.clarifai.grpc.api.PostCollaboratorsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.PostCollaboratorsRequest buildPartial() {
      com.clarifai.grpc.api.PostCollaboratorsRequest result = new com.clarifai.grpc.api.PostCollaboratorsRequest(this);
      int from_bitField0_ = bitField0_;
      if (userAppIdBuilder_ == null) {
        result.userAppId_ = userAppId_;
      } else {
        result.userAppId_ = userAppIdBuilder_.build();
      }
      if (collaboratorsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          collaborators_ = java.util.Collections.unmodifiableList(collaborators_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.collaborators_ = collaborators_;
      } else {
        result.collaborators_ = collaboratorsBuilder_.build();
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
      if (other instanceof com.clarifai.grpc.api.PostCollaboratorsRequest) {
        return mergeFrom((com.clarifai.grpc.api.PostCollaboratorsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.PostCollaboratorsRequest other) {
      if (other == com.clarifai.grpc.api.PostCollaboratorsRequest.getDefaultInstance()) return this;
      if (other.hasUserAppId()) {
        mergeUserAppId(other.getUserAppId());
      }
      if (collaboratorsBuilder_ == null) {
        if (!other.collaborators_.isEmpty()) {
          if (collaborators_.isEmpty()) {
            collaborators_ = other.collaborators_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCollaboratorsIsMutable();
            collaborators_.addAll(other.collaborators_);
          }
          onChanged();
        }
      } else {
        if (!other.collaborators_.isEmpty()) {
          if (collaboratorsBuilder_.isEmpty()) {
            collaboratorsBuilder_.dispose();
            collaboratorsBuilder_ = null;
            collaborators_ = other.collaborators_;
            bitField0_ = (bitField0_ & ~0x00000001);
            collaboratorsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCollaboratorsFieldBuilder() : null;
          } else {
            collaboratorsBuilder_.addAllMessages(other.collaborators_);
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
      com.clarifai.grpc.api.PostCollaboratorsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.PostCollaboratorsRequest) e.getUnfinishedMessage();
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

    private java.util.List<com.clarifai.grpc.api.Collaborator> collaborators_ =
      java.util.Collections.emptyList();
    private void ensureCollaboratorsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        collaborators_ = new java.util.ArrayList<com.clarifai.grpc.api.Collaborator>(collaborators_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.Collaborator, com.clarifai.grpc.api.Collaborator.Builder, com.clarifai.grpc.api.CollaboratorOrBuilder> collaboratorsBuilder_;

    /**
     * <code>repeated .clarifai.api.Collaborator collaborators = 2;</code>
     */
    public java.util.List<com.clarifai.grpc.api.Collaborator> getCollaboratorsList() {
      if (collaboratorsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(collaborators_);
      } else {
        return collaboratorsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .clarifai.api.Collaborator collaborators = 2;</code>
     */
    public int getCollaboratorsCount() {
      if (collaboratorsBuilder_ == null) {
        return collaborators_.size();
      } else {
        return collaboratorsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .clarifai.api.Collaborator collaborators = 2;</code>
     */
    public com.clarifai.grpc.api.Collaborator getCollaborators(int index) {
      if (collaboratorsBuilder_ == null) {
        return collaborators_.get(index);
      } else {
        return collaboratorsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .clarifai.api.Collaborator collaborators = 2;</code>
     */
    public Builder setCollaborators(
        int index, com.clarifai.grpc.api.Collaborator value) {
      if (collaboratorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCollaboratorsIsMutable();
        collaborators_.set(index, value);
        onChanged();
      } else {
        collaboratorsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.Collaborator collaborators = 2;</code>
     */
    public Builder setCollaborators(
        int index, com.clarifai.grpc.api.Collaborator.Builder builderForValue) {
      if (collaboratorsBuilder_ == null) {
        ensureCollaboratorsIsMutable();
        collaborators_.set(index, builderForValue.build());
        onChanged();
      } else {
        collaboratorsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.Collaborator collaborators = 2;</code>
     */
    public Builder addCollaborators(com.clarifai.grpc.api.Collaborator value) {
      if (collaboratorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCollaboratorsIsMutable();
        collaborators_.add(value);
        onChanged();
      } else {
        collaboratorsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.Collaborator collaborators = 2;</code>
     */
    public Builder addCollaborators(
        int index, com.clarifai.grpc.api.Collaborator value) {
      if (collaboratorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCollaboratorsIsMutable();
        collaborators_.add(index, value);
        onChanged();
      } else {
        collaboratorsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.Collaborator collaborators = 2;</code>
     */
    public Builder addCollaborators(
        com.clarifai.grpc.api.Collaborator.Builder builderForValue) {
      if (collaboratorsBuilder_ == null) {
        ensureCollaboratorsIsMutable();
        collaborators_.add(builderForValue.build());
        onChanged();
      } else {
        collaboratorsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.Collaborator collaborators = 2;</code>
     */
    public Builder addCollaborators(
        int index, com.clarifai.grpc.api.Collaborator.Builder builderForValue) {
      if (collaboratorsBuilder_ == null) {
        ensureCollaboratorsIsMutable();
        collaborators_.add(index, builderForValue.build());
        onChanged();
      } else {
        collaboratorsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.Collaborator collaborators = 2;</code>
     */
    public Builder addAllCollaborators(
        java.lang.Iterable<? extends com.clarifai.grpc.api.Collaborator> values) {
      if (collaboratorsBuilder_ == null) {
        ensureCollaboratorsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, collaborators_);
        onChanged();
      } else {
        collaboratorsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.Collaborator collaborators = 2;</code>
     */
    public Builder clearCollaborators() {
      if (collaboratorsBuilder_ == null) {
        collaborators_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        collaboratorsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.Collaborator collaborators = 2;</code>
     */
    public Builder removeCollaborators(int index) {
      if (collaboratorsBuilder_ == null) {
        ensureCollaboratorsIsMutable();
        collaborators_.remove(index);
        onChanged();
      } else {
        collaboratorsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.Collaborator collaborators = 2;</code>
     */
    public com.clarifai.grpc.api.Collaborator.Builder getCollaboratorsBuilder(
        int index) {
      return getCollaboratorsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .clarifai.api.Collaborator collaborators = 2;</code>
     */
    public com.clarifai.grpc.api.CollaboratorOrBuilder getCollaboratorsOrBuilder(
        int index) {
      if (collaboratorsBuilder_ == null) {
        return collaborators_.get(index);  } else {
        return collaboratorsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .clarifai.api.Collaborator collaborators = 2;</code>
     */
    public java.util.List<? extends com.clarifai.grpc.api.CollaboratorOrBuilder> 
         getCollaboratorsOrBuilderList() {
      if (collaboratorsBuilder_ != null) {
        return collaboratorsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(collaborators_);
      }
    }
    /**
     * <code>repeated .clarifai.api.Collaborator collaborators = 2;</code>
     */
    public com.clarifai.grpc.api.Collaborator.Builder addCollaboratorsBuilder() {
      return getCollaboratorsFieldBuilder().addBuilder(
          com.clarifai.grpc.api.Collaborator.getDefaultInstance());
    }
    /**
     * <code>repeated .clarifai.api.Collaborator collaborators = 2;</code>
     */
    public com.clarifai.grpc.api.Collaborator.Builder addCollaboratorsBuilder(
        int index) {
      return getCollaboratorsFieldBuilder().addBuilder(
          index, com.clarifai.grpc.api.Collaborator.getDefaultInstance());
    }
    /**
     * <code>repeated .clarifai.api.Collaborator collaborators = 2;</code>
     */
    public java.util.List<com.clarifai.grpc.api.Collaborator.Builder> 
         getCollaboratorsBuilderList() {
      return getCollaboratorsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.Collaborator, com.clarifai.grpc.api.Collaborator.Builder, com.clarifai.grpc.api.CollaboratorOrBuilder> 
        getCollaboratorsFieldBuilder() {
      if (collaboratorsBuilder_ == null) {
        collaboratorsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.clarifai.grpc.api.Collaborator, com.clarifai.grpc.api.Collaborator.Builder, com.clarifai.grpc.api.CollaboratorOrBuilder>(
                collaborators_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        collaborators_ = null;
      }
      return collaboratorsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.PostCollaboratorsRequest)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.PostCollaboratorsRequest)
  private static final com.clarifai.grpc.api.PostCollaboratorsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.PostCollaboratorsRequest();
  }

  public static com.clarifai.grpc.api.PostCollaboratorsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PostCollaboratorsRequest>
      PARSER = new com.google.protobuf.AbstractParser<PostCollaboratorsRequest>() {
    @java.lang.Override
    public PostCollaboratorsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PostCollaboratorsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PostCollaboratorsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PostCollaboratorsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.PostCollaboratorsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

