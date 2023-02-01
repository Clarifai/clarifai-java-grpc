// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/status/status.proto

package com.clarifai.grpc.api.status;

/**
 * Protobuf type {@code clarifai.api.status.RedirectInfo}
 */
public final class RedirectInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.status.RedirectInfo)
    RedirectInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RedirectInfo.newBuilder() to construct.
  private RedirectInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RedirectInfo() {
    url_ = "";
    resourceType_ = "";
    oldResourceId_ = "";
    newResourceId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RedirectInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RedirectInfo(
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
            java.lang.String s = input.readStringRequireUtf8();

            url_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            resourceType_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            oldResourceId_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            newResourceId_ = s;
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
    return com.clarifai.grpc.api.status.StatusOuterClass.internal_static_clarifai_api_status_RedirectInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.status.StatusOuterClass.internal_static_clarifai_api_status_RedirectInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.status.RedirectInfo.class, com.clarifai.grpc.api.status.RedirectInfo.Builder.class);
  }

  public static final int URL_FIELD_NUMBER = 1;
  private volatile java.lang.Object url_;
  /**
   * <pre>
   * New location for the resource. Used to set response Location header.
   * </pre>
   *
   * <code>string url = 1;</code>
   * @return The url.
   */
  @java.lang.Override
  public java.lang.String getUrl() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      url_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * New location for the resource. Used to set response Location header.
   * </pre>
   *
   * <code>string url = 1;</code>
   * @return The bytes for url.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUrlBytes() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      url_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESOURCE_TYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object resourceType_;
  /**
   * <pre>
   * Resource type
   * </pre>
   *
   * <code>string resource_type = 2;</code>
   * @return The resourceType.
   */
  @java.lang.Override
  public java.lang.String getResourceType() {
    java.lang.Object ref = resourceType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Resource type
   * </pre>
   *
   * <code>string resource_type = 2;</code>
   * @return The bytes for resourceType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourceTypeBytes() {
    java.lang.Object ref = resourceType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OLD_RESOURCE_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object oldResourceId_;
  /**
   * <pre>
   * Old resource id
   * </pre>
   *
   * <code>string old_resource_id = 3;</code>
   * @return The oldResourceId.
   */
  @java.lang.Override
  public java.lang.String getOldResourceId() {
    java.lang.Object ref = oldResourceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      oldResourceId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Old resource id
   * </pre>
   *
   * <code>string old_resource_id = 3;</code>
   * @return The bytes for oldResourceId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOldResourceIdBytes() {
    java.lang.Object ref = oldResourceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      oldResourceId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NEW_RESOURCE_ID_FIELD_NUMBER = 4;
  private volatile java.lang.Object newResourceId_;
  /**
   * <pre>
   * New resource id
   * </pre>
   *
   * <code>string new_resource_id = 4;</code>
   * @return The newResourceId.
   */
  @java.lang.Override
  public java.lang.String getNewResourceId() {
    java.lang.Object ref = newResourceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      newResourceId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * New resource id
   * </pre>
   *
   * <code>string new_resource_id = 4;</code>
   * @return The bytes for newResourceId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNewResourceIdBytes() {
    java.lang.Object ref = newResourceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      newResourceId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(url_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, url_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, resourceType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(oldResourceId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, oldResourceId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(newResourceId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, newResourceId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(url_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, url_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, resourceType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(oldResourceId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, oldResourceId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(newResourceId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, newResourceId_);
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
    if (!(obj instanceof com.clarifai.grpc.api.status.RedirectInfo)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.status.RedirectInfo other = (com.clarifai.grpc.api.status.RedirectInfo) obj;

    if (!getUrl()
        .equals(other.getUrl())) return false;
    if (!getResourceType()
        .equals(other.getResourceType())) return false;
    if (!getOldResourceId()
        .equals(other.getOldResourceId())) return false;
    if (!getNewResourceId()
        .equals(other.getNewResourceId())) return false;
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
    hash = (37 * hash) + URL_FIELD_NUMBER;
    hash = (53 * hash) + getUrl().hashCode();
    hash = (37 * hash) + RESOURCE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getResourceType().hashCode();
    hash = (37 * hash) + OLD_RESOURCE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getOldResourceId().hashCode();
    hash = (37 * hash) + NEW_RESOURCE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getNewResourceId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.status.RedirectInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.status.RedirectInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.status.RedirectInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.status.RedirectInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.status.RedirectInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.status.RedirectInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.status.RedirectInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.status.RedirectInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.status.RedirectInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.status.RedirectInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.status.RedirectInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.status.RedirectInfo parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.status.RedirectInfo prototype) {
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
   * Protobuf type {@code clarifai.api.status.RedirectInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.status.RedirectInfo)
      com.clarifai.grpc.api.status.RedirectInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.status.StatusOuterClass.internal_static_clarifai_api_status_RedirectInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.status.StatusOuterClass.internal_static_clarifai_api_status_RedirectInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.status.RedirectInfo.class, com.clarifai.grpc.api.status.RedirectInfo.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.status.RedirectInfo.newBuilder()
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
      url_ = "";

      resourceType_ = "";

      oldResourceId_ = "";

      newResourceId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.status.StatusOuterClass.internal_static_clarifai_api_status_RedirectInfo_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.status.RedirectInfo getDefaultInstanceForType() {
      return com.clarifai.grpc.api.status.RedirectInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.status.RedirectInfo build() {
      com.clarifai.grpc.api.status.RedirectInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.status.RedirectInfo buildPartial() {
      com.clarifai.grpc.api.status.RedirectInfo result = new com.clarifai.grpc.api.status.RedirectInfo(this);
      result.url_ = url_;
      result.resourceType_ = resourceType_;
      result.oldResourceId_ = oldResourceId_;
      result.newResourceId_ = newResourceId_;
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
      if (other instanceof com.clarifai.grpc.api.status.RedirectInfo) {
        return mergeFrom((com.clarifai.grpc.api.status.RedirectInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.status.RedirectInfo other) {
      if (other == com.clarifai.grpc.api.status.RedirectInfo.getDefaultInstance()) return this;
      if (!other.getUrl().isEmpty()) {
        url_ = other.url_;
        onChanged();
      }
      if (!other.getResourceType().isEmpty()) {
        resourceType_ = other.resourceType_;
        onChanged();
      }
      if (!other.getOldResourceId().isEmpty()) {
        oldResourceId_ = other.oldResourceId_;
        onChanged();
      }
      if (!other.getNewResourceId().isEmpty()) {
        newResourceId_ = other.newResourceId_;
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
      com.clarifai.grpc.api.status.RedirectInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.status.RedirectInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object url_ = "";
    /**
     * <pre>
     * New location for the resource. Used to set response Location header.
     * </pre>
     *
     * <code>string url = 1;</code>
     * @return The url.
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        url_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * New location for the resource. Used to set response Location header.
     * </pre>
     *
     * <code>string url = 1;</code>
     * @return The bytes for url.
     */
    public com.google.protobuf.ByteString
        getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * New location for the resource. Used to set response Location header.
     * </pre>
     *
     * <code>string url = 1;</code>
     * @param value The url to set.
     * @return This builder for chaining.
     */
    public Builder setUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      url_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * New location for the resource. Used to set response Location header.
     * </pre>
     *
     * <code>string url = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUrl() {
      
      url_ = getDefaultInstance().getUrl();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * New location for the resource. Used to set response Location header.
     * </pre>
     *
     * <code>string url = 1;</code>
     * @param value The bytes for url to set.
     * @return This builder for chaining.
     */
    public Builder setUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      url_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object resourceType_ = "";
    /**
     * <pre>
     * Resource type
     * </pre>
     *
     * <code>string resource_type = 2;</code>
     * @return The resourceType.
     */
    public java.lang.String getResourceType() {
      java.lang.Object ref = resourceType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Resource type
     * </pre>
     *
     * <code>string resource_type = 2;</code>
     * @return The bytes for resourceType.
     */
    public com.google.protobuf.ByteString
        getResourceTypeBytes() {
      java.lang.Object ref = resourceType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Resource type
     * </pre>
     *
     * <code>string resource_type = 2;</code>
     * @param value The resourceType to set.
     * @return This builder for chaining.
     */
    public Builder setResourceType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resourceType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Resource type
     * </pre>
     *
     * <code>string resource_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceType() {
      
      resourceType_ = getDefaultInstance().getResourceType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Resource type
     * </pre>
     *
     * <code>string resource_type = 2;</code>
     * @param value The bytes for resourceType to set.
     * @return This builder for chaining.
     */
    public Builder setResourceTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resourceType_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object oldResourceId_ = "";
    /**
     * <pre>
     * Old resource id
     * </pre>
     *
     * <code>string old_resource_id = 3;</code>
     * @return The oldResourceId.
     */
    public java.lang.String getOldResourceId() {
      java.lang.Object ref = oldResourceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        oldResourceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Old resource id
     * </pre>
     *
     * <code>string old_resource_id = 3;</code>
     * @return The bytes for oldResourceId.
     */
    public com.google.protobuf.ByteString
        getOldResourceIdBytes() {
      java.lang.Object ref = oldResourceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        oldResourceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Old resource id
     * </pre>
     *
     * <code>string old_resource_id = 3;</code>
     * @param value The oldResourceId to set.
     * @return This builder for chaining.
     */
    public Builder setOldResourceId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      oldResourceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Old resource id
     * </pre>
     *
     * <code>string old_resource_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOldResourceId() {
      
      oldResourceId_ = getDefaultInstance().getOldResourceId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Old resource id
     * </pre>
     *
     * <code>string old_resource_id = 3;</code>
     * @param value The bytes for oldResourceId to set.
     * @return This builder for chaining.
     */
    public Builder setOldResourceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      oldResourceId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object newResourceId_ = "";
    /**
     * <pre>
     * New resource id
     * </pre>
     *
     * <code>string new_resource_id = 4;</code>
     * @return The newResourceId.
     */
    public java.lang.String getNewResourceId() {
      java.lang.Object ref = newResourceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        newResourceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * New resource id
     * </pre>
     *
     * <code>string new_resource_id = 4;</code>
     * @return The bytes for newResourceId.
     */
    public com.google.protobuf.ByteString
        getNewResourceIdBytes() {
      java.lang.Object ref = newResourceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        newResourceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * New resource id
     * </pre>
     *
     * <code>string new_resource_id = 4;</code>
     * @param value The newResourceId to set.
     * @return This builder for chaining.
     */
    public Builder setNewResourceId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      newResourceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * New resource id
     * </pre>
     *
     * <code>string new_resource_id = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearNewResourceId() {
      
      newResourceId_ = getDefaultInstance().getNewResourceId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * New resource id
     * </pre>
     *
     * <code>string new_resource_id = 4;</code>
     * @param value The bytes for newResourceId to set.
     * @return This builder for chaining.
     */
    public Builder setNewResourceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      newResourceId_ = value;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.status.RedirectInfo)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.status.RedirectInfo)
  private static final com.clarifai.grpc.api.status.RedirectInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.status.RedirectInfo();
  }

  public static com.clarifai.grpc.api.status.RedirectInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RedirectInfo>
      PARSER = new com.google.protobuf.AbstractParser<RedirectInfo>() {
    @java.lang.Override
    public RedirectInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RedirectInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RedirectInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RedirectInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.status.RedirectInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
