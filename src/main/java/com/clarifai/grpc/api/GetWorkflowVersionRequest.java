// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

/**
 * Protobuf type {@code clarifai.api.GetWorkflowVersionRequest}
 */
public  final class GetWorkflowVersionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.GetWorkflowVersionRequest)
    GetWorkflowVersionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetWorkflowVersionRequest.newBuilder() to construct.
  private GetWorkflowVersionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetWorkflowVersionRequest() {
    workflowId_ = "";
    workflowVersionId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetWorkflowVersionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetWorkflowVersionRequest(
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

            workflowId_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            workflowVersionId_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_GetWorkflowVersionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_GetWorkflowVersionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.GetWorkflowVersionRequest.class, com.clarifai.grpc.api.GetWorkflowVersionRequest.Builder.class);
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

  public static final int WORKFLOW_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object workflowId_;
  /**
   * <pre>
   * The id of the workflow that has the requested version.
   * </pre>
   *
   * <code>string workflow_id = 2;</code>
   * @return The workflowId.
   */
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
   * <pre>
   * The id of the workflow that has the requested version.
   * </pre>
   *
   * <code>string workflow_id = 2;</code>
   * @return The bytes for workflowId.
   */
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

  public static final int WORKFLOW_VERSION_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object workflowVersionId_;
  /**
   * <pre>
   * Get the identified by this id
   * </pre>
   *
   * <code>string workflow_version_id = 3;</code>
   * @return The workflowVersionId.
   */
  public java.lang.String getWorkflowVersionId() {
    java.lang.Object ref = workflowVersionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      workflowVersionId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Get the identified by this id
   * </pre>
   *
   * <code>string workflow_version_id = 3;</code>
   * @return The bytes for workflowVersionId.
   */
  public com.google.protobuf.ByteString
      getWorkflowVersionIdBytes() {
    java.lang.Object ref = workflowVersionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      workflowVersionId_ = b;
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
    if (!getWorkflowIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, workflowId_);
    }
    if (!getWorkflowVersionIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, workflowVersionId_);
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
    if (!getWorkflowIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, workflowId_);
    }
    if (!getWorkflowVersionIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, workflowVersionId_);
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
    if (!(obj instanceof com.clarifai.grpc.api.GetWorkflowVersionRequest)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.GetWorkflowVersionRequest other = (com.clarifai.grpc.api.GetWorkflowVersionRequest) obj;

    if (hasUserAppId() != other.hasUserAppId()) return false;
    if (hasUserAppId()) {
      if (!getUserAppId()
          .equals(other.getUserAppId())) return false;
    }
    if (!getWorkflowId()
        .equals(other.getWorkflowId())) return false;
    if (!getWorkflowVersionId()
        .equals(other.getWorkflowVersionId())) return false;
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
    hash = (37 * hash) + WORKFLOW_VERSION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getWorkflowVersionId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.GetWorkflowVersionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.GetWorkflowVersionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.GetWorkflowVersionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.GetWorkflowVersionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.GetWorkflowVersionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.GetWorkflowVersionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.GetWorkflowVersionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.GetWorkflowVersionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.GetWorkflowVersionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.GetWorkflowVersionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.GetWorkflowVersionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.GetWorkflowVersionRequest parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.GetWorkflowVersionRequest prototype) {
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
   * Protobuf type {@code clarifai.api.GetWorkflowVersionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.GetWorkflowVersionRequest)
      com.clarifai.grpc.api.GetWorkflowVersionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_GetWorkflowVersionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_GetWorkflowVersionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.GetWorkflowVersionRequest.class, com.clarifai.grpc.api.GetWorkflowVersionRequest.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.GetWorkflowVersionRequest.newBuilder()
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
      workflowId_ = "";

      workflowVersionId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_GetWorkflowVersionRequest_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.GetWorkflowVersionRequest getDefaultInstanceForType() {
      return com.clarifai.grpc.api.GetWorkflowVersionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.GetWorkflowVersionRequest build() {
      com.clarifai.grpc.api.GetWorkflowVersionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.GetWorkflowVersionRequest buildPartial() {
      com.clarifai.grpc.api.GetWorkflowVersionRequest result = new com.clarifai.grpc.api.GetWorkflowVersionRequest(this);
      if (userAppIdBuilder_ == null) {
        result.userAppId_ = userAppId_;
      } else {
        result.userAppId_ = userAppIdBuilder_.build();
      }
      result.workflowId_ = workflowId_;
      result.workflowVersionId_ = workflowVersionId_;
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
      if (other instanceof com.clarifai.grpc.api.GetWorkflowVersionRequest) {
        return mergeFrom((com.clarifai.grpc.api.GetWorkflowVersionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.GetWorkflowVersionRequest other) {
      if (other == com.clarifai.grpc.api.GetWorkflowVersionRequest.getDefaultInstance()) return this;
      if (other.hasUserAppId()) {
        mergeUserAppId(other.getUserAppId());
      }
      if (!other.getWorkflowId().isEmpty()) {
        workflowId_ = other.workflowId_;
        onChanged();
      }
      if (!other.getWorkflowVersionId().isEmpty()) {
        workflowVersionId_ = other.workflowVersionId_;
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
      com.clarifai.grpc.api.GetWorkflowVersionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.GetWorkflowVersionRequest) e.getUnfinishedMessage();
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

    private java.lang.Object workflowId_ = "";
    /**
     * <pre>
     * The id of the workflow that has the requested version.
     * </pre>
     *
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
     * <pre>
     * The id of the workflow that has the requested version.
     * </pre>
     *
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
     * <pre>
     * The id of the workflow that has the requested version.
     * </pre>
     *
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
     * <pre>
     * The id of the workflow that has the requested version.
     * </pre>
     *
     * <code>string workflow_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearWorkflowId() {
      
      workflowId_ = getDefaultInstance().getWorkflowId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The id of the workflow that has the requested version.
     * </pre>
     *
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

    private java.lang.Object workflowVersionId_ = "";
    /**
     * <pre>
     * Get the identified by this id
     * </pre>
     *
     * <code>string workflow_version_id = 3;</code>
     * @return The workflowVersionId.
     */
    public java.lang.String getWorkflowVersionId() {
      java.lang.Object ref = workflowVersionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        workflowVersionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Get the identified by this id
     * </pre>
     *
     * <code>string workflow_version_id = 3;</code>
     * @return The bytes for workflowVersionId.
     */
    public com.google.protobuf.ByteString
        getWorkflowVersionIdBytes() {
      java.lang.Object ref = workflowVersionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        workflowVersionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Get the identified by this id
     * </pre>
     *
     * <code>string workflow_version_id = 3;</code>
     * @param value The workflowVersionId to set.
     * @return This builder for chaining.
     */
    public Builder setWorkflowVersionId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      workflowVersionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Get the identified by this id
     * </pre>
     *
     * <code>string workflow_version_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearWorkflowVersionId() {
      
      workflowVersionId_ = getDefaultInstance().getWorkflowVersionId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Get the identified by this id
     * </pre>
     *
     * <code>string workflow_version_id = 3;</code>
     * @param value The bytes for workflowVersionId to set.
     * @return This builder for chaining.
     */
    public Builder setWorkflowVersionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      workflowVersionId_ = value;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.GetWorkflowVersionRequest)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.GetWorkflowVersionRequest)
  private static final com.clarifai.grpc.api.GetWorkflowVersionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.GetWorkflowVersionRequest();
  }

  public static com.clarifai.grpc.api.GetWorkflowVersionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetWorkflowVersionRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetWorkflowVersionRequest>() {
    @java.lang.Override
    public GetWorkflowVersionRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetWorkflowVersionRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetWorkflowVersionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetWorkflowVersionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.GetWorkflowVersionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

