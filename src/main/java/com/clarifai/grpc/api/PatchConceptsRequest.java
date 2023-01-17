// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

/**
 * <pre>
 * PatchConceptsRequest
 * </pre>
 *
 * Protobuf type {@code clarifai.api.PatchConceptsRequest}
 */
public final class PatchConceptsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.PatchConceptsRequest)
    PatchConceptsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PatchConceptsRequest.newBuilder() to construct.
  private PatchConceptsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PatchConceptsRequest() {
    concepts_ = java.util.Collections.emptyList();
    action_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PatchConceptsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PatchConceptsRequest(
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
              concepts_ = new java.util.ArrayList<com.clarifai.grpc.api.Concept>();
              mutable_bitField0_ |= 0x00000001;
            }
            concepts_.add(
                input.readMessage(com.clarifai.grpc.api.Concept.parser(), extensionRegistry));
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            action_ = s;
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
        concepts_ = java.util.Collections.unmodifiableList(concepts_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PatchConceptsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PatchConceptsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.PatchConceptsRequest.class, com.clarifai.grpc.api.PatchConceptsRequest.Builder.class);
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

  public static final int CONCEPTS_FIELD_NUMBER = 2;
  private java.util.List<com.clarifai.grpc.api.Concept> concepts_;
  /**
   * <pre>
   * The concepts to patch.
   * </pre>
   *
   * <code>repeated .clarifai.api.Concept concepts = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.clarifai.grpc.api.Concept> getConceptsList() {
    return concepts_;
  }
  /**
   * <pre>
   * The concepts to patch.
   * </pre>
   *
   * <code>repeated .clarifai.api.Concept concepts = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.clarifai.grpc.api.ConceptOrBuilder> 
      getConceptsOrBuilderList() {
    return concepts_;
  }
  /**
   * <pre>
   * The concepts to patch.
   * </pre>
   *
   * <code>repeated .clarifai.api.Concept concepts = 2;</code>
   */
  @java.lang.Override
  public int getConceptsCount() {
    return concepts_.size();
  }
  /**
   * <pre>
   * The concepts to patch.
   * </pre>
   *
   * <code>repeated .clarifai.api.Concept concepts = 2;</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.Concept getConcepts(int index) {
    return concepts_.get(index);
  }
  /**
   * <pre>
   * The concepts to patch.
   * </pre>
   *
   * <code>repeated .clarifai.api.Concept concepts = 2;</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.ConceptOrBuilder getConceptsOrBuilder(
      int index) {
    return concepts_.get(index);
  }

  public static final int ACTION_FIELD_NUMBER = 3;
  private volatile java.lang.Object action_;
  /**
   * <pre>
   * The action to perform on the patched objects
   * For now ony action 'overwrite' is supported
   * </pre>
   *
   * <code>string action = 3;</code>
   * @return The action.
   */
  @java.lang.Override
  public java.lang.String getAction() {
    java.lang.Object ref = action_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      action_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The action to perform on the patched objects
   * For now ony action 'overwrite' is supported
   * </pre>
   *
   * <code>string action = 3;</code>
   * @return The bytes for action.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getActionBytes() {
    java.lang.Object ref = action_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      action_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < concepts_.size(); i++) {
      output.writeMessage(2, concepts_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(action_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, action_);
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
    for (int i = 0; i < concepts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, concepts_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(action_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, action_);
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
    if (!(obj instanceof com.clarifai.grpc.api.PatchConceptsRequest)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.PatchConceptsRequest other = (com.clarifai.grpc.api.PatchConceptsRequest) obj;

    if (hasUserAppId() != other.hasUserAppId()) return false;
    if (hasUserAppId()) {
      if (!getUserAppId()
          .equals(other.getUserAppId())) return false;
    }
    if (!getConceptsList()
        .equals(other.getConceptsList())) return false;
    if (!getAction()
        .equals(other.getAction())) return false;
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
    if (getConceptsCount() > 0) {
      hash = (37 * hash) + CONCEPTS_FIELD_NUMBER;
      hash = (53 * hash) + getConceptsList().hashCode();
    }
    hash = (37 * hash) + ACTION_FIELD_NUMBER;
    hash = (53 * hash) + getAction().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.PatchConceptsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.PatchConceptsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PatchConceptsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.PatchConceptsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PatchConceptsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.PatchConceptsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PatchConceptsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.PatchConceptsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PatchConceptsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.PatchConceptsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PatchConceptsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.PatchConceptsRequest parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.PatchConceptsRequest prototype) {
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
   * PatchConceptsRequest
   * </pre>
   *
   * Protobuf type {@code clarifai.api.PatchConceptsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.PatchConceptsRequest)
      com.clarifai.grpc.api.PatchConceptsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PatchConceptsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PatchConceptsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.PatchConceptsRequest.class, com.clarifai.grpc.api.PatchConceptsRequest.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.PatchConceptsRequest.newBuilder()
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
        getConceptsFieldBuilder();
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
      if (conceptsBuilder_ == null) {
        concepts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        conceptsBuilder_.clear();
      }
      action_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PatchConceptsRequest_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.PatchConceptsRequest getDefaultInstanceForType() {
      return com.clarifai.grpc.api.PatchConceptsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.PatchConceptsRequest build() {
      com.clarifai.grpc.api.PatchConceptsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.PatchConceptsRequest buildPartial() {
      com.clarifai.grpc.api.PatchConceptsRequest result = new com.clarifai.grpc.api.PatchConceptsRequest(this);
      int from_bitField0_ = bitField0_;
      if (userAppIdBuilder_ == null) {
        result.userAppId_ = userAppId_;
      } else {
        result.userAppId_ = userAppIdBuilder_.build();
      }
      if (conceptsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          concepts_ = java.util.Collections.unmodifiableList(concepts_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.concepts_ = concepts_;
      } else {
        result.concepts_ = conceptsBuilder_.build();
      }
      result.action_ = action_;
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
      if (other instanceof com.clarifai.grpc.api.PatchConceptsRequest) {
        return mergeFrom((com.clarifai.grpc.api.PatchConceptsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.PatchConceptsRequest other) {
      if (other == com.clarifai.grpc.api.PatchConceptsRequest.getDefaultInstance()) return this;
      if (other.hasUserAppId()) {
        mergeUserAppId(other.getUserAppId());
      }
      if (conceptsBuilder_ == null) {
        if (!other.concepts_.isEmpty()) {
          if (concepts_.isEmpty()) {
            concepts_ = other.concepts_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureConceptsIsMutable();
            concepts_.addAll(other.concepts_);
          }
          onChanged();
        }
      } else {
        if (!other.concepts_.isEmpty()) {
          if (conceptsBuilder_.isEmpty()) {
            conceptsBuilder_.dispose();
            conceptsBuilder_ = null;
            concepts_ = other.concepts_;
            bitField0_ = (bitField0_ & ~0x00000001);
            conceptsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getConceptsFieldBuilder() : null;
          } else {
            conceptsBuilder_.addAllMessages(other.concepts_);
          }
        }
      }
      if (!other.getAction().isEmpty()) {
        action_ = other.action_;
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
      com.clarifai.grpc.api.PatchConceptsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.PatchConceptsRequest) e.getUnfinishedMessage();
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

    private java.util.List<com.clarifai.grpc.api.Concept> concepts_ =
      java.util.Collections.emptyList();
    private void ensureConceptsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        concepts_ = new java.util.ArrayList<com.clarifai.grpc.api.Concept>(concepts_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.Concept, com.clarifai.grpc.api.Concept.Builder, com.clarifai.grpc.api.ConceptOrBuilder> conceptsBuilder_;

    /**
     * <pre>
     * The concepts to patch.
     * </pre>
     *
     * <code>repeated .clarifai.api.Concept concepts = 2;</code>
     */
    public java.util.List<com.clarifai.grpc.api.Concept> getConceptsList() {
      if (conceptsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(concepts_);
      } else {
        return conceptsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The concepts to patch.
     * </pre>
     *
     * <code>repeated .clarifai.api.Concept concepts = 2;</code>
     */
    public int getConceptsCount() {
      if (conceptsBuilder_ == null) {
        return concepts_.size();
      } else {
        return conceptsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The concepts to patch.
     * </pre>
     *
     * <code>repeated .clarifai.api.Concept concepts = 2;</code>
     */
    public com.clarifai.grpc.api.Concept getConcepts(int index) {
      if (conceptsBuilder_ == null) {
        return concepts_.get(index);
      } else {
        return conceptsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The concepts to patch.
     * </pre>
     *
     * <code>repeated .clarifai.api.Concept concepts = 2;</code>
     */
    public Builder setConcepts(
        int index, com.clarifai.grpc.api.Concept value) {
      if (conceptsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConceptsIsMutable();
        concepts_.set(index, value);
        onChanged();
      } else {
        conceptsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The concepts to patch.
     * </pre>
     *
     * <code>repeated .clarifai.api.Concept concepts = 2;</code>
     */
    public Builder setConcepts(
        int index, com.clarifai.grpc.api.Concept.Builder builderForValue) {
      if (conceptsBuilder_ == null) {
        ensureConceptsIsMutable();
        concepts_.set(index, builderForValue.build());
        onChanged();
      } else {
        conceptsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The concepts to patch.
     * </pre>
     *
     * <code>repeated .clarifai.api.Concept concepts = 2;</code>
     */
    public Builder addConcepts(com.clarifai.grpc.api.Concept value) {
      if (conceptsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConceptsIsMutable();
        concepts_.add(value);
        onChanged();
      } else {
        conceptsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The concepts to patch.
     * </pre>
     *
     * <code>repeated .clarifai.api.Concept concepts = 2;</code>
     */
    public Builder addConcepts(
        int index, com.clarifai.grpc.api.Concept value) {
      if (conceptsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConceptsIsMutable();
        concepts_.add(index, value);
        onChanged();
      } else {
        conceptsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The concepts to patch.
     * </pre>
     *
     * <code>repeated .clarifai.api.Concept concepts = 2;</code>
     */
    public Builder addConcepts(
        com.clarifai.grpc.api.Concept.Builder builderForValue) {
      if (conceptsBuilder_ == null) {
        ensureConceptsIsMutable();
        concepts_.add(builderForValue.build());
        onChanged();
      } else {
        conceptsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The concepts to patch.
     * </pre>
     *
     * <code>repeated .clarifai.api.Concept concepts = 2;</code>
     */
    public Builder addConcepts(
        int index, com.clarifai.grpc.api.Concept.Builder builderForValue) {
      if (conceptsBuilder_ == null) {
        ensureConceptsIsMutable();
        concepts_.add(index, builderForValue.build());
        onChanged();
      } else {
        conceptsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The concepts to patch.
     * </pre>
     *
     * <code>repeated .clarifai.api.Concept concepts = 2;</code>
     */
    public Builder addAllConcepts(
        java.lang.Iterable<? extends com.clarifai.grpc.api.Concept> values) {
      if (conceptsBuilder_ == null) {
        ensureConceptsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, concepts_);
        onChanged();
      } else {
        conceptsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The concepts to patch.
     * </pre>
     *
     * <code>repeated .clarifai.api.Concept concepts = 2;</code>
     */
    public Builder clearConcepts() {
      if (conceptsBuilder_ == null) {
        concepts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        conceptsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The concepts to patch.
     * </pre>
     *
     * <code>repeated .clarifai.api.Concept concepts = 2;</code>
     */
    public Builder removeConcepts(int index) {
      if (conceptsBuilder_ == null) {
        ensureConceptsIsMutable();
        concepts_.remove(index);
        onChanged();
      } else {
        conceptsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The concepts to patch.
     * </pre>
     *
     * <code>repeated .clarifai.api.Concept concepts = 2;</code>
     */
    public com.clarifai.grpc.api.Concept.Builder getConceptsBuilder(
        int index) {
      return getConceptsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The concepts to patch.
     * </pre>
     *
     * <code>repeated .clarifai.api.Concept concepts = 2;</code>
     */
    public com.clarifai.grpc.api.ConceptOrBuilder getConceptsOrBuilder(
        int index) {
      if (conceptsBuilder_ == null) {
        return concepts_.get(index);  } else {
        return conceptsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The concepts to patch.
     * </pre>
     *
     * <code>repeated .clarifai.api.Concept concepts = 2;</code>
     */
    public java.util.List<? extends com.clarifai.grpc.api.ConceptOrBuilder> 
         getConceptsOrBuilderList() {
      if (conceptsBuilder_ != null) {
        return conceptsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(concepts_);
      }
    }
    /**
     * <pre>
     * The concepts to patch.
     * </pre>
     *
     * <code>repeated .clarifai.api.Concept concepts = 2;</code>
     */
    public com.clarifai.grpc.api.Concept.Builder addConceptsBuilder() {
      return getConceptsFieldBuilder().addBuilder(
          com.clarifai.grpc.api.Concept.getDefaultInstance());
    }
    /**
     * <pre>
     * The concepts to patch.
     * </pre>
     *
     * <code>repeated .clarifai.api.Concept concepts = 2;</code>
     */
    public com.clarifai.grpc.api.Concept.Builder addConceptsBuilder(
        int index) {
      return getConceptsFieldBuilder().addBuilder(
          index, com.clarifai.grpc.api.Concept.getDefaultInstance());
    }
    /**
     * <pre>
     * The concepts to patch.
     * </pre>
     *
     * <code>repeated .clarifai.api.Concept concepts = 2;</code>
     */
    public java.util.List<com.clarifai.grpc.api.Concept.Builder> 
         getConceptsBuilderList() {
      return getConceptsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.Concept, com.clarifai.grpc.api.Concept.Builder, com.clarifai.grpc.api.ConceptOrBuilder> 
        getConceptsFieldBuilder() {
      if (conceptsBuilder_ == null) {
        conceptsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.clarifai.grpc.api.Concept, com.clarifai.grpc.api.Concept.Builder, com.clarifai.grpc.api.ConceptOrBuilder>(
                concepts_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        concepts_ = null;
      }
      return conceptsBuilder_;
    }

    private java.lang.Object action_ = "";
    /**
     * <pre>
     * The action to perform on the patched objects
     * For now ony action 'overwrite' is supported
     * </pre>
     *
     * <code>string action = 3;</code>
     * @return The action.
     */
    public java.lang.String getAction() {
      java.lang.Object ref = action_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        action_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The action to perform on the patched objects
     * For now ony action 'overwrite' is supported
     * </pre>
     *
     * <code>string action = 3;</code>
     * @return The bytes for action.
     */
    public com.google.protobuf.ByteString
        getActionBytes() {
      java.lang.Object ref = action_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        action_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The action to perform on the patched objects
     * For now ony action 'overwrite' is supported
     * </pre>
     *
     * <code>string action = 3;</code>
     * @param value The action to set.
     * @return This builder for chaining.
     */
    public Builder setAction(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      action_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The action to perform on the patched objects
     * For now ony action 'overwrite' is supported
     * </pre>
     *
     * <code>string action = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAction() {
      
      action_ = getDefaultInstance().getAction();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The action to perform on the patched objects
     * For now ony action 'overwrite' is supported
     * </pre>
     *
     * <code>string action = 3;</code>
     * @param value The bytes for action to set.
     * @return This builder for chaining.
     */
    public Builder setActionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      action_ = value;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.PatchConceptsRequest)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.PatchConceptsRequest)
  private static final com.clarifai.grpc.api.PatchConceptsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.PatchConceptsRequest();
  }

  public static com.clarifai.grpc.api.PatchConceptsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PatchConceptsRequest>
      PARSER = new com.google.protobuf.AbstractParser<PatchConceptsRequest>() {
    @java.lang.Override
    public PatchConceptsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PatchConceptsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PatchConceptsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PatchConceptsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.PatchConceptsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

