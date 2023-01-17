// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

/**
 * <pre>
 * Request to patch a list of label orders.
 * </pre>
 *
 * Protobuf type {@code clarifai.api.PatchLabelOrdersRequest}
 */
public final class PatchLabelOrdersRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.PatchLabelOrdersRequest)
    PatchLabelOrdersRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PatchLabelOrdersRequest.newBuilder() to construct.
  private PatchLabelOrdersRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PatchLabelOrdersRequest() {
    labelOrders_ = java.util.Collections.emptyList();
    action_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PatchLabelOrdersRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PatchLabelOrdersRequest(
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
              labelOrders_ = new java.util.ArrayList<com.clarifai.grpc.api.LabelOrder>();
              mutable_bitField0_ |= 0x00000001;
            }
            labelOrders_.add(
                input.readMessage(com.clarifai.grpc.api.LabelOrder.parser(), extensionRegistry));
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
        labelOrders_ = java.util.Collections.unmodifiableList(labelOrders_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PatchLabelOrdersRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PatchLabelOrdersRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.PatchLabelOrdersRequest.class, com.clarifai.grpc.api.PatchLabelOrdersRequest.Builder.class);
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

  public static final int LABEL_ORDERS_FIELD_NUMBER = 2;
  private java.util.List<com.clarifai.grpc.api.LabelOrder> labelOrders_;
  /**
   * <code>repeated .clarifai.api.LabelOrder label_orders = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.clarifai.grpc.api.LabelOrder> getLabelOrdersList() {
    return labelOrders_;
  }
  /**
   * <code>repeated .clarifai.api.LabelOrder label_orders = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.clarifai.grpc.api.LabelOrderOrBuilder> 
      getLabelOrdersOrBuilderList() {
    return labelOrders_;
  }
  /**
   * <code>repeated .clarifai.api.LabelOrder label_orders = 2;</code>
   */
  @java.lang.Override
  public int getLabelOrdersCount() {
    return labelOrders_.size();
  }
  /**
   * <code>repeated .clarifai.api.LabelOrder label_orders = 2;</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.LabelOrder getLabelOrders(int index) {
    return labelOrders_.get(index);
  }
  /**
   * <code>repeated .clarifai.api.LabelOrder label_orders = 2;</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.LabelOrderOrBuilder getLabelOrdersOrBuilder(
      int index) {
    return labelOrders_.get(index);
  }

  public static final int ACTION_FIELD_NUMBER = 3;
  private volatile java.lang.Object action_;
  /**
   * <pre>
   * The action to perform on the patched objects
   * For now actions 'merge', 'overwrite', and 'remove' are supported
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
   * For now actions 'merge', 'overwrite', and 'remove' are supported
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
    for (int i = 0; i < labelOrders_.size(); i++) {
      output.writeMessage(2, labelOrders_.get(i));
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
    for (int i = 0; i < labelOrders_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, labelOrders_.get(i));
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
    if (!(obj instanceof com.clarifai.grpc.api.PatchLabelOrdersRequest)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.PatchLabelOrdersRequest other = (com.clarifai.grpc.api.PatchLabelOrdersRequest) obj;

    if (hasUserAppId() != other.hasUserAppId()) return false;
    if (hasUserAppId()) {
      if (!getUserAppId()
          .equals(other.getUserAppId())) return false;
    }
    if (!getLabelOrdersList()
        .equals(other.getLabelOrdersList())) return false;
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
    if (getLabelOrdersCount() > 0) {
      hash = (37 * hash) + LABEL_ORDERS_FIELD_NUMBER;
      hash = (53 * hash) + getLabelOrdersList().hashCode();
    }
    hash = (37 * hash) + ACTION_FIELD_NUMBER;
    hash = (53 * hash) + getAction().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.PatchLabelOrdersRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.PatchLabelOrdersRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PatchLabelOrdersRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.PatchLabelOrdersRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PatchLabelOrdersRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.PatchLabelOrdersRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PatchLabelOrdersRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.PatchLabelOrdersRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PatchLabelOrdersRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.PatchLabelOrdersRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PatchLabelOrdersRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.PatchLabelOrdersRequest parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.PatchLabelOrdersRequest prototype) {
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
   * Request to patch a list of label orders.
   * </pre>
   *
   * Protobuf type {@code clarifai.api.PatchLabelOrdersRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.PatchLabelOrdersRequest)
      com.clarifai.grpc.api.PatchLabelOrdersRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PatchLabelOrdersRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PatchLabelOrdersRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.PatchLabelOrdersRequest.class, com.clarifai.grpc.api.PatchLabelOrdersRequest.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.PatchLabelOrdersRequest.newBuilder()
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
        getLabelOrdersFieldBuilder();
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
      if (labelOrdersBuilder_ == null) {
        labelOrders_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        labelOrdersBuilder_.clear();
      }
      action_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PatchLabelOrdersRequest_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.PatchLabelOrdersRequest getDefaultInstanceForType() {
      return com.clarifai.grpc.api.PatchLabelOrdersRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.PatchLabelOrdersRequest build() {
      com.clarifai.grpc.api.PatchLabelOrdersRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.PatchLabelOrdersRequest buildPartial() {
      com.clarifai.grpc.api.PatchLabelOrdersRequest result = new com.clarifai.grpc.api.PatchLabelOrdersRequest(this);
      int from_bitField0_ = bitField0_;
      if (userAppIdBuilder_ == null) {
        result.userAppId_ = userAppId_;
      } else {
        result.userAppId_ = userAppIdBuilder_.build();
      }
      if (labelOrdersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          labelOrders_ = java.util.Collections.unmodifiableList(labelOrders_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.labelOrders_ = labelOrders_;
      } else {
        result.labelOrders_ = labelOrdersBuilder_.build();
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
      if (other instanceof com.clarifai.grpc.api.PatchLabelOrdersRequest) {
        return mergeFrom((com.clarifai.grpc.api.PatchLabelOrdersRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.PatchLabelOrdersRequest other) {
      if (other == com.clarifai.grpc.api.PatchLabelOrdersRequest.getDefaultInstance()) return this;
      if (other.hasUserAppId()) {
        mergeUserAppId(other.getUserAppId());
      }
      if (labelOrdersBuilder_ == null) {
        if (!other.labelOrders_.isEmpty()) {
          if (labelOrders_.isEmpty()) {
            labelOrders_ = other.labelOrders_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLabelOrdersIsMutable();
            labelOrders_.addAll(other.labelOrders_);
          }
          onChanged();
        }
      } else {
        if (!other.labelOrders_.isEmpty()) {
          if (labelOrdersBuilder_.isEmpty()) {
            labelOrdersBuilder_.dispose();
            labelOrdersBuilder_ = null;
            labelOrders_ = other.labelOrders_;
            bitField0_ = (bitField0_ & ~0x00000001);
            labelOrdersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLabelOrdersFieldBuilder() : null;
          } else {
            labelOrdersBuilder_.addAllMessages(other.labelOrders_);
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
      com.clarifai.grpc.api.PatchLabelOrdersRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.PatchLabelOrdersRequest) e.getUnfinishedMessage();
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

    private java.util.List<com.clarifai.grpc.api.LabelOrder> labelOrders_ =
      java.util.Collections.emptyList();
    private void ensureLabelOrdersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        labelOrders_ = new java.util.ArrayList<com.clarifai.grpc.api.LabelOrder>(labelOrders_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.LabelOrder, com.clarifai.grpc.api.LabelOrder.Builder, com.clarifai.grpc.api.LabelOrderOrBuilder> labelOrdersBuilder_;

    /**
     * <code>repeated .clarifai.api.LabelOrder label_orders = 2;</code>
     */
    public java.util.List<com.clarifai.grpc.api.LabelOrder> getLabelOrdersList() {
      if (labelOrdersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(labelOrders_);
      } else {
        return labelOrdersBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .clarifai.api.LabelOrder label_orders = 2;</code>
     */
    public int getLabelOrdersCount() {
      if (labelOrdersBuilder_ == null) {
        return labelOrders_.size();
      } else {
        return labelOrdersBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .clarifai.api.LabelOrder label_orders = 2;</code>
     */
    public com.clarifai.grpc.api.LabelOrder getLabelOrders(int index) {
      if (labelOrdersBuilder_ == null) {
        return labelOrders_.get(index);
      } else {
        return labelOrdersBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .clarifai.api.LabelOrder label_orders = 2;</code>
     */
    public Builder setLabelOrders(
        int index, com.clarifai.grpc.api.LabelOrder value) {
      if (labelOrdersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLabelOrdersIsMutable();
        labelOrders_.set(index, value);
        onChanged();
      } else {
        labelOrdersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.LabelOrder label_orders = 2;</code>
     */
    public Builder setLabelOrders(
        int index, com.clarifai.grpc.api.LabelOrder.Builder builderForValue) {
      if (labelOrdersBuilder_ == null) {
        ensureLabelOrdersIsMutable();
        labelOrders_.set(index, builderForValue.build());
        onChanged();
      } else {
        labelOrdersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.LabelOrder label_orders = 2;</code>
     */
    public Builder addLabelOrders(com.clarifai.grpc.api.LabelOrder value) {
      if (labelOrdersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLabelOrdersIsMutable();
        labelOrders_.add(value);
        onChanged();
      } else {
        labelOrdersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.LabelOrder label_orders = 2;</code>
     */
    public Builder addLabelOrders(
        int index, com.clarifai.grpc.api.LabelOrder value) {
      if (labelOrdersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLabelOrdersIsMutable();
        labelOrders_.add(index, value);
        onChanged();
      } else {
        labelOrdersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.LabelOrder label_orders = 2;</code>
     */
    public Builder addLabelOrders(
        com.clarifai.grpc.api.LabelOrder.Builder builderForValue) {
      if (labelOrdersBuilder_ == null) {
        ensureLabelOrdersIsMutable();
        labelOrders_.add(builderForValue.build());
        onChanged();
      } else {
        labelOrdersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.LabelOrder label_orders = 2;</code>
     */
    public Builder addLabelOrders(
        int index, com.clarifai.grpc.api.LabelOrder.Builder builderForValue) {
      if (labelOrdersBuilder_ == null) {
        ensureLabelOrdersIsMutable();
        labelOrders_.add(index, builderForValue.build());
        onChanged();
      } else {
        labelOrdersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.LabelOrder label_orders = 2;</code>
     */
    public Builder addAllLabelOrders(
        java.lang.Iterable<? extends com.clarifai.grpc.api.LabelOrder> values) {
      if (labelOrdersBuilder_ == null) {
        ensureLabelOrdersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, labelOrders_);
        onChanged();
      } else {
        labelOrdersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.LabelOrder label_orders = 2;</code>
     */
    public Builder clearLabelOrders() {
      if (labelOrdersBuilder_ == null) {
        labelOrders_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        labelOrdersBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.LabelOrder label_orders = 2;</code>
     */
    public Builder removeLabelOrders(int index) {
      if (labelOrdersBuilder_ == null) {
        ensureLabelOrdersIsMutable();
        labelOrders_.remove(index);
        onChanged();
      } else {
        labelOrdersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.LabelOrder label_orders = 2;</code>
     */
    public com.clarifai.grpc.api.LabelOrder.Builder getLabelOrdersBuilder(
        int index) {
      return getLabelOrdersFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .clarifai.api.LabelOrder label_orders = 2;</code>
     */
    public com.clarifai.grpc.api.LabelOrderOrBuilder getLabelOrdersOrBuilder(
        int index) {
      if (labelOrdersBuilder_ == null) {
        return labelOrders_.get(index);  } else {
        return labelOrdersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .clarifai.api.LabelOrder label_orders = 2;</code>
     */
    public java.util.List<? extends com.clarifai.grpc.api.LabelOrderOrBuilder> 
         getLabelOrdersOrBuilderList() {
      if (labelOrdersBuilder_ != null) {
        return labelOrdersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(labelOrders_);
      }
    }
    /**
     * <code>repeated .clarifai.api.LabelOrder label_orders = 2;</code>
     */
    public com.clarifai.grpc.api.LabelOrder.Builder addLabelOrdersBuilder() {
      return getLabelOrdersFieldBuilder().addBuilder(
          com.clarifai.grpc.api.LabelOrder.getDefaultInstance());
    }
    /**
     * <code>repeated .clarifai.api.LabelOrder label_orders = 2;</code>
     */
    public com.clarifai.grpc.api.LabelOrder.Builder addLabelOrdersBuilder(
        int index) {
      return getLabelOrdersFieldBuilder().addBuilder(
          index, com.clarifai.grpc.api.LabelOrder.getDefaultInstance());
    }
    /**
     * <code>repeated .clarifai.api.LabelOrder label_orders = 2;</code>
     */
    public java.util.List<com.clarifai.grpc.api.LabelOrder.Builder> 
         getLabelOrdersBuilderList() {
      return getLabelOrdersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.LabelOrder, com.clarifai.grpc.api.LabelOrder.Builder, com.clarifai.grpc.api.LabelOrderOrBuilder> 
        getLabelOrdersFieldBuilder() {
      if (labelOrdersBuilder_ == null) {
        labelOrdersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.clarifai.grpc.api.LabelOrder, com.clarifai.grpc.api.LabelOrder.Builder, com.clarifai.grpc.api.LabelOrderOrBuilder>(
                labelOrders_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        labelOrders_ = null;
      }
      return labelOrdersBuilder_;
    }

    private java.lang.Object action_ = "";
    /**
     * <pre>
     * The action to perform on the patched objects
     * For now actions 'merge', 'overwrite', and 'remove' are supported
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
     * For now actions 'merge', 'overwrite', and 'remove' are supported
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
     * For now actions 'merge', 'overwrite', and 'remove' are supported
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
     * For now actions 'merge', 'overwrite', and 'remove' are supported
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
     * For now actions 'merge', 'overwrite', and 'remove' are supported
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.PatchLabelOrdersRequest)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.PatchLabelOrdersRequest)
  private static final com.clarifai.grpc.api.PatchLabelOrdersRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.PatchLabelOrdersRequest();
  }

  public static com.clarifai.grpc.api.PatchLabelOrdersRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PatchLabelOrdersRequest>
      PARSER = new com.google.protobuf.AbstractParser<PatchLabelOrdersRequest>() {
    @java.lang.Override
    public PatchLabelOrdersRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PatchLabelOrdersRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PatchLabelOrdersRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PatchLabelOrdersRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.PatchLabelOrdersRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

