// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * Protobuf type {@code clarifai.api.BuildInfo}
 */
public final class BuildInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.BuildInfo)
    BuildInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BuildInfo.newBuilder() to construct.
  private BuildInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BuildInfo() {
    dockerImageName_ = "";
    dockerImageTag_ = "";
    dockerImageDigest_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BuildInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BuildInfo(
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

            dockerImageName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            dockerImageTag_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            dockerImageDigest_ = s;
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
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_BuildInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_BuildInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.BuildInfo.class, com.clarifai.grpc.api.BuildInfo.Builder.class);
  }

  public static final int DOCKER_IMAGE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object dockerImageName_;
  /**
   * <pre>
   * Docker image name
   * </pre>
   *
   * <code>string docker_image_name = 1;</code>
   * @return The dockerImageName.
   */
  @java.lang.Override
  public java.lang.String getDockerImageName() {
    java.lang.Object ref = dockerImageName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dockerImageName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Docker image name
   * </pre>
   *
   * <code>string docker_image_name = 1;</code>
   * @return The bytes for dockerImageName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDockerImageNameBytes() {
    java.lang.Object ref = dockerImageName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dockerImageName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DOCKER_IMAGE_TAG_FIELD_NUMBER = 2;
  private volatile java.lang.Object dockerImageTag_;
  /**
   * <pre>
   * Docker image tag
   * </pre>
   *
   * <code>string docker_image_tag = 2;</code>
   * @return The dockerImageTag.
   */
  @java.lang.Override
  public java.lang.String getDockerImageTag() {
    java.lang.Object ref = dockerImageTag_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dockerImageTag_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Docker image tag
   * </pre>
   *
   * <code>string docker_image_tag = 2;</code>
   * @return The bytes for dockerImageTag.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDockerImageTagBytes() {
    java.lang.Object ref = dockerImageTag_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dockerImageTag_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DOCKER_IMAGE_DIGEST_FIELD_NUMBER = 3;
  private volatile java.lang.Object dockerImageDigest_;
  /**
   * <pre>
   * Docker image digest
   * </pre>
   *
   * <code>string docker_image_digest = 3;</code>
   * @return The dockerImageDigest.
   */
  @java.lang.Override
  public java.lang.String getDockerImageDigest() {
    java.lang.Object ref = dockerImageDigest_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dockerImageDigest_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Docker image digest
   * </pre>
   *
   * <code>string docker_image_digest = 3;</code>
   * @return The bytes for dockerImageDigest.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDockerImageDigestBytes() {
    java.lang.Object ref = dockerImageDigest_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dockerImageDigest_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dockerImageName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, dockerImageName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dockerImageTag_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dockerImageTag_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dockerImageDigest_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, dockerImageDigest_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dockerImageName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, dockerImageName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dockerImageTag_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, dockerImageTag_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dockerImageDigest_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, dockerImageDigest_);
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
    if (!(obj instanceof com.clarifai.grpc.api.BuildInfo)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.BuildInfo other = (com.clarifai.grpc.api.BuildInfo) obj;

    if (!getDockerImageName()
        .equals(other.getDockerImageName())) return false;
    if (!getDockerImageTag()
        .equals(other.getDockerImageTag())) return false;
    if (!getDockerImageDigest()
        .equals(other.getDockerImageDigest())) return false;
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
    hash = (37 * hash) + DOCKER_IMAGE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getDockerImageName().hashCode();
    hash = (37 * hash) + DOCKER_IMAGE_TAG_FIELD_NUMBER;
    hash = (53 * hash) + getDockerImageTag().hashCode();
    hash = (37 * hash) + DOCKER_IMAGE_DIGEST_FIELD_NUMBER;
    hash = (53 * hash) + getDockerImageDigest().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.BuildInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.BuildInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.BuildInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.BuildInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.BuildInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.BuildInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.BuildInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.BuildInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.BuildInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.BuildInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.BuildInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.BuildInfo parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.BuildInfo prototype) {
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
   * Protobuf type {@code clarifai.api.BuildInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.BuildInfo)
      com.clarifai.grpc.api.BuildInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_BuildInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_BuildInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.BuildInfo.class, com.clarifai.grpc.api.BuildInfo.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.BuildInfo.newBuilder()
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
      dockerImageName_ = "";

      dockerImageTag_ = "";

      dockerImageDigest_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_BuildInfo_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.BuildInfo getDefaultInstanceForType() {
      return com.clarifai.grpc.api.BuildInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.BuildInfo build() {
      com.clarifai.grpc.api.BuildInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.BuildInfo buildPartial() {
      com.clarifai.grpc.api.BuildInfo result = new com.clarifai.grpc.api.BuildInfo(this);
      result.dockerImageName_ = dockerImageName_;
      result.dockerImageTag_ = dockerImageTag_;
      result.dockerImageDigest_ = dockerImageDigest_;
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
      if (other instanceof com.clarifai.grpc.api.BuildInfo) {
        return mergeFrom((com.clarifai.grpc.api.BuildInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.BuildInfo other) {
      if (other == com.clarifai.grpc.api.BuildInfo.getDefaultInstance()) return this;
      if (!other.getDockerImageName().isEmpty()) {
        dockerImageName_ = other.dockerImageName_;
        onChanged();
      }
      if (!other.getDockerImageTag().isEmpty()) {
        dockerImageTag_ = other.dockerImageTag_;
        onChanged();
      }
      if (!other.getDockerImageDigest().isEmpty()) {
        dockerImageDigest_ = other.dockerImageDigest_;
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
      com.clarifai.grpc.api.BuildInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.BuildInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object dockerImageName_ = "";
    /**
     * <pre>
     * Docker image name
     * </pre>
     *
     * <code>string docker_image_name = 1;</code>
     * @return The dockerImageName.
     */
    public java.lang.String getDockerImageName() {
      java.lang.Object ref = dockerImageName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dockerImageName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Docker image name
     * </pre>
     *
     * <code>string docker_image_name = 1;</code>
     * @return The bytes for dockerImageName.
     */
    public com.google.protobuf.ByteString
        getDockerImageNameBytes() {
      java.lang.Object ref = dockerImageName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dockerImageName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Docker image name
     * </pre>
     *
     * <code>string docker_image_name = 1;</code>
     * @param value The dockerImageName to set.
     * @return This builder for chaining.
     */
    public Builder setDockerImageName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dockerImageName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Docker image name
     * </pre>
     *
     * <code>string docker_image_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDockerImageName() {
      
      dockerImageName_ = getDefaultInstance().getDockerImageName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Docker image name
     * </pre>
     *
     * <code>string docker_image_name = 1;</code>
     * @param value The bytes for dockerImageName to set.
     * @return This builder for chaining.
     */
    public Builder setDockerImageNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dockerImageName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object dockerImageTag_ = "";
    /**
     * <pre>
     * Docker image tag
     * </pre>
     *
     * <code>string docker_image_tag = 2;</code>
     * @return The dockerImageTag.
     */
    public java.lang.String getDockerImageTag() {
      java.lang.Object ref = dockerImageTag_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dockerImageTag_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Docker image tag
     * </pre>
     *
     * <code>string docker_image_tag = 2;</code>
     * @return The bytes for dockerImageTag.
     */
    public com.google.protobuf.ByteString
        getDockerImageTagBytes() {
      java.lang.Object ref = dockerImageTag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dockerImageTag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Docker image tag
     * </pre>
     *
     * <code>string docker_image_tag = 2;</code>
     * @param value The dockerImageTag to set.
     * @return This builder for chaining.
     */
    public Builder setDockerImageTag(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dockerImageTag_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Docker image tag
     * </pre>
     *
     * <code>string docker_image_tag = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDockerImageTag() {
      
      dockerImageTag_ = getDefaultInstance().getDockerImageTag();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Docker image tag
     * </pre>
     *
     * <code>string docker_image_tag = 2;</code>
     * @param value The bytes for dockerImageTag to set.
     * @return This builder for chaining.
     */
    public Builder setDockerImageTagBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dockerImageTag_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object dockerImageDigest_ = "";
    /**
     * <pre>
     * Docker image digest
     * </pre>
     *
     * <code>string docker_image_digest = 3;</code>
     * @return The dockerImageDigest.
     */
    public java.lang.String getDockerImageDigest() {
      java.lang.Object ref = dockerImageDigest_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dockerImageDigest_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Docker image digest
     * </pre>
     *
     * <code>string docker_image_digest = 3;</code>
     * @return The bytes for dockerImageDigest.
     */
    public com.google.protobuf.ByteString
        getDockerImageDigestBytes() {
      java.lang.Object ref = dockerImageDigest_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dockerImageDigest_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Docker image digest
     * </pre>
     *
     * <code>string docker_image_digest = 3;</code>
     * @param value The dockerImageDigest to set.
     * @return This builder for chaining.
     */
    public Builder setDockerImageDigest(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dockerImageDigest_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Docker image digest
     * </pre>
     *
     * <code>string docker_image_digest = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDockerImageDigest() {
      
      dockerImageDigest_ = getDefaultInstance().getDockerImageDigest();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Docker image digest
     * </pre>
     *
     * <code>string docker_image_digest = 3;</code>
     * @param value The bytes for dockerImageDigest to set.
     * @return This builder for chaining.
     */
    public Builder setDockerImageDigestBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dockerImageDigest_ = value;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.BuildInfo)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.BuildInfo)
  private static final com.clarifai.grpc.api.BuildInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.BuildInfo();
  }

  public static com.clarifai.grpc.api.BuildInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BuildInfo>
      PARSER = new com.google.protobuf.AbstractParser<BuildInfo>() {
    @java.lang.Override
    public BuildInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BuildInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BuildInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BuildInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.BuildInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

