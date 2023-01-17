// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * Protobuf type {@code clarifai.api.KeypointInfo}
 */
public final class KeypointInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.KeypointInfo)
    KeypointInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KeypointInfo.newBuilder() to construct.
  private KeypointInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KeypointInfo() {
    keypointNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    skeleton_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KeypointInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KeypointInfo(
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
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              keypointNames_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            keypointNames_.add(s);
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              skeleton_ = new java.util.ArrayList<com.clarifai.grpc.api.KeypointEdge>();
              mutable_bitField0_ |= 0x00000002;
            }
            skeleton_.add(
                input.readMessage(com.clarifai.grpc.api.KeypointEdge.parser(), extensionRegistry));
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
        keypointNames_ = keypointNames_.getUnmodifiableView();
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        skeleton_ = java.util.Collections.unmodifiableList(skeleton_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_KeypointInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_KeypointInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.KeypointInfo.class, com.clarifai.grpc.api.KeypointInfo.Builder.class);
  }

  public static final int KEYPOINT_NAMES_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList keypointNames_;
  /**
   * <pre>
   * Names of the keypoints
   * </pre>
   *
   * <code>repeated string keypoint_names = 1;</code>
   * @return A list containing the keypointNames.
   */
  public com.google.protobuf.ProtocolStringList
      getKeypointNamesList() {
    return keypointNames_;
  }
  /**
   * <pre>
   * Names of the keypoints
   * </pre>
   *
   * <code>repeated string keypoint_names = 1;</code>
   * @return The count of keypointNames.
   */
  public int getKeypointNamesCount() {
    return keypointNames_.size();
  }
  /**
   * <pre>
   * Names of the keypoints
   * </pre>
   *
   * <code>repeated string keypoint_names = 1;</code>
   * @param index The index of the element to return.
   * @return The keypointNames at the given index.
   */
  public java.lang.String getKeypointNames(int index) {
    return keypointNames_.get(index);
  }
  /**
   * <pre>
   * Names of the keypoints
   * </pre>
   *
   * <code>repeated string keypoint_names = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the keypointNames at the given index.
   */
  public com.google.protobuf.ByteString
      getKeypointNamesBytes(int index) {
    return keypointNames_.getByteString(index);
  }

  public static final int SKELETON_FIELD_NUMBER = 2;
  private java.util.List<com.clarifai.grpc.api.KeypointEdge> skeleton_;
  /**
   * <pre>
   * Defines the connections between keypoint_names. Each value represents the index in keypoint_names.
   * </pre>
   *
   * <code>repeated .clarifai.api.KeypointEdge skeleton = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.clarifai.grpc.api.KeypointEdge> getSkeletonList() {
    return skeleton_;
  }
  /**
   * <pre>
   * Defines the connections between keypoint_names. Each value represents the index in keypoint_names.
   * </pre>
   *
   * <code>repeated .clarifai.api.KeypointEdge skeleton = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.clarifai.grpc.api.KeypointEdgeOrBuilder> 
      getSkeletonOrBuilderList() {
    return skeleton_;
  }
  /**
   * <pre>
   * Defines the connections between keypoint_names. Each value represents the index in keypoint_names.
   * </pre>
   *
   * <code>repeated .clarifai.api.KeypointEdge skeleton = 2;</code>
   */
  @java.lang.Override
  public int getSkeletonCount() {
    return skeleton_.size();
  }
  /**
   * <pre>
   * Defines the connections between keypoint_names. Each value represents the index in keypoint_names.
   * </pre>
   *
   * <code>repeated .clarifai.api.KeypointEdge skeleton = 2;</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.KeypointEdge getSkeleton(int index) {
    return skeleton_.get(index);
  }
  /**
   * <pre>
   * Defines the connections between keypoint_names. Each value represents the index in keypoint_names.
   * </pre>
   *
   * <code>repeated .clarifai.api.KeypointEdge skeleton = 2;</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.KeypointEdgeOrBuilder getSkeletonOrBuilder(
      int index) {
    return skeleton_.get(index);
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
    for (int i = 0; i < keypointNames_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, keypointNames_.getRaw(i));
    }
    for (int i = 0; i < skeleton_.size(); i++) {
      output.writeMessage(2, skeleton_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < keypointNames_.size(); i++) {
        dataSize += computeStringSizeNoTag(keypointNames_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getKeypointNamesList().size();
    }
    for (int i = 0; i < skeleton_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, skeleton_.get(i));
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
    if (!(obj instanceof com.clarifai.grpc.api.KeypointInfo)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.KeypointInfo other = (com.clarifai.grpc.api.KeypointInfo) obj;

    if (!getKeypointNamesList()
        .equals(other.getKeypointNamesList())) return false;
    if (!getSkeletonList()
        .equals(other.getSkeletonList())) return false;
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
    if (getKeypointNamesCount() > 0) {
      hash = (37 * hash) + KEYPOINT_NAMES_FIELD_NUMBER;
      hash = (53 * hash) + getKeypointNamesList().hashCode();
    }
    if (getSkeletonCount() > 0) {
      hash = (37 * hash) + SKELETON_FIELD_NUMBER;
      hash = (53 * hash) + getSkeletonList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.KeypointInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.KeypointInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.KeypointInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.KeypointInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.KeypointInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.KeypointInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.KeypointInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.KeypointInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.KeypointInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.KeypointInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.KeypointInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.KeypointInfo parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.KeypointInfo prototype) {
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
   * Protobuf type {@code clarifai.api.KeypointInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.KeypointInfo)
      com.clarifai.grpc.api.KeypointInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_KeypointInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_KeypointInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.KeypointInfo.class, com.clarifai.grpc.api.KeypointInfo.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.KeypointInfo.newBuilder()
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
        getSkeletonFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      keypointNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      if (skeletonBuilder_ == null) {
        skeleton_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        skeletonBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_KeypointInfo_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.KeypointInfo getDefaultInstanceForType() {
      return com.clarifai.grpc.api.KeypointInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.KeypointInfo build() {
      com.clarifai.grpc.api.KeypointInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.KeypointInfo buildPartial() {
      com.clarifai.grpc.api.KeypointInfo result = new com.clarifai.grpc.api.KeypointInfo(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        keypointNames_ = keypointNames_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.keypointNames_ = keypointNames_;
      if (skeletonBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          skeleton_ = java.util.Collections.unmodifiableList(skeleton_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.skeleton_ = skeleton_;
      } else {
        result.skeleton_ = skeletonBuilder_.build();
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
      if (other instanceof com.clarifai.grpc.api.KeypointInfo) {
        return mergeFrom((com.clarifai.grpc.api.KeypointInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.KeypointInfo other) {
      if (other == com.clarifai.grpc.api.KeypointInfo.getDefaultInstance()) return this;
      if (!other.keypointNames_.isEmpty()) {
        if (keypointNames_.isEmpty()) {
          keypointNames_ = other.keypointNames_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureKeypointNamesIsMutable();
          keypointNames_.addAll(other.keypointNames_);
        }
        onChanged();
      }
      if (skeletonBuilder_ == null) {
        if (!other.skeleton_.isEmpty()) {
          if (skeleton_.isEmpty()) {
            skeleton_ = other.skeleton_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureSkeletonIsMutable();
            skeleton_.addAll(other.skeleton_);
          }
          onChanged();
        }
      } else {
        if (!other.skeleton_.isEmpty()) {
          if (skeletonBuilder_.isEmpty()) {
            skeletonBuilder_.dispose();
            skeletonBuilder_ = null;
            skeleton_ = other.skeleton_;
            bitField0_ = (bitField0_ & ~0x00000002);
            skeletonBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSkeletonFieldBuilder() : null;
          } else {
            skeletonBuilder_.addAllMessages(other.skeleton_);
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
      com.clarifai.grpc.api.KeypointInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.KeypointInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList keypointNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureKeypointNamesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        keypointNames_ = new com.google.protobuf.LazyStringArrayList(keypointNames_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * Names of the keypoints
     * </pre>
     *
     * <code>repeated string keypoint_names = 1;</code>
     * @return A list containing the keypointNames.
     */
    public com.google.protobuf.ProtocolStringList
        getKeypointNamesList() {
      return keypointNames_.getUnmodifiableView();
    }
    /**
     * <pre>
     * Names of the keypoints
     * </pre>
     *
     * <code>repeated string keypoint_names = 1;</code>
     * @return The count of keypointNames.
     */
    public int getKeypointNamesCount() {
      return keypointNames_.size();
    }
    /**
     * <pre>
     * Names of the keypoints
     * </pre>
     *
     * <code>repeated string keypoint_names = 1;</code>
     * @param index The index of the element to return.
     * @return The keypointNames at the given index.
     */
    public java.lang.String getKeypointNames(int index) {
      return keypointNames_.get(index);
    }
    /**
     * <pre>
     * Names of the keypoints
     * </pre>
     *
     * <code>repeated string keypoint_names = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the keypointNames at the given index.
     */
    public com.google.protobuf.ByteString
        getKeypointNamesBytes(int index) {
      return keypointNames_.getByteString(index);
    }
    /**
     * <pre>
     * Names of the keypoints
     * </pre>
     *
     * <code>repeated string keypoint_names = 1;</code>
     * @param index The index to set the value at.
     * @param value The keypointNames to set.
     * @return This builder for chaining.
     */
    public Builder setKeypointNames(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureKeypointNamesIsMutable();
      keypointNames_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Names of the keypoints
     * </pre>
     *
     * <code>repeated string keypoint_names = 1;</code>
     * @param value The keypointNames to add.
     * @return This builder for chaining.
     */
    public Builder addKeypointNames(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureKeypointNamesIsMutable();
      keypointNames_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Names of the keypoints
     * </pre>
     *
     * <code>repeated string keypoint_names = 1;</code>
     * @param values The keypointNames to add.
     * @return This builder for chaining.
     */
    public Builder addAllKeypointNames(
        java.lang.Iterable<java.lang.String> values) {
      ensureKeypointNamesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, keypointNames_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Names of the keypoints
     * </pre>
     *
     * <code>repeated string keypoint_names = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKeypointNames() {
      keypointNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Names of the keypoints
     * </pre>
     *
     * <code>repeated string keypoint_names = 1;</code>
     * @param value The bytes of the keypointNames to add.
     * @return This builder for chaining.
     */
    public Builder addKeypointNamesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureKeypointNamesIsMutable();
      keypointNames_.add(value);
      onChanged();
      return this;
    }

    private java.util.List<com.clarifai.grpc.api.KeypointEdge> skeleton_ =
      java.util.Collections.emptyList();
    private void ensureSkeletonIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        skeleton_ = new java.util.ArrayList<com.clarifai.grpc.api.KeypointEdge>(skeleton_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.KeypointEdge, com.clarifai.grpc.api.KeypointEdge.Builder, com.clarifai.grpc.api.KeypointEdgeOrBuilder> skeletonBuilder_;

    /**
     * <pre>
     * Defines the connections between keypoint_names. Each value represents the index in keypoint_names.
     * </pre>
     *
     * <code>repeated .clarifai.api.KeypointEdge skeleton = 2;</code>
     */
    public java.util.List<com.clarifai.grpc.api.KeypointEdge> getSkeletonList() {
      if (skeletonBuilder_ == null) {
        return java.util.Collections.unmodifiableList(skeleton_);
      } else {
        return skeletonBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Defines the connections between keypoint_names. Each value represents the index in keypoint_names.
     * </pre>
     *
     * <code>repeated .clarifai.api.KeypointEdge skeleton = 2;</code>
     */
    public int getSkeletonCount() {
      if (skeletonBuilder_ == null) {
        return skeleton_.size();
      } else {
        return skeletonBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Defines the connections between keypoint_names. Each value represents the index in keypoint_names.
     * </pre>
     *
     * <code>repeated .clarifai.api.KeypointEdge skeleton = 2;</code>
     */
    public com.clarifai.grpc.api.KeypointEdge getSkeleton(int index) {
      if (skeletonBuilder_ == null) {
        return skeleton_.get(index);
      } else {
        return skeletonBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Defines the connections between keypoint_names. Each value represents the index in keypoint_names.
     * </pre>
     *
     * <code>repeated .clarifai.api.KeypointEdge skeleton = 2;</code>
     */
    public Builder setSkeleton(
        int index, com.clarifai.grpc.api.KeypointEdge value) {
      if (skeletonBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSkeletonIsMutable();
        skeleton_.set(index, value);
        onChanged();
      } else {
        skeletonBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Defines the connections between keypoint_names. Each value represents the index in keypoint_names.
     * </pre>
     *
     * <code>repeated .clarifai.api.KeypointEdge skeleton = 2;</code>
     */
    public Builder setSkeleton(
        int index, com.clarifai.grpc.api.KeypointEdge.Builder builderForValue) {
      if (skeletonBuilder_ == null) {
        ensureSkeletonIsMutable();
        skeleton_.set(index, builderForValue.build());
        onChanged();
      } else {
        skeletonBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Defines the connections between keypoint_names. Each value represents the index in keypoint_names.
     * </pre>
     *
     * <code>repeated .clarifai.api.KeypointEdge skeleton = 2;</code>
     */
    public Builder addSkeleton(com.clarifai.grpc.api.KeypointEdge value) {
      if (skeletonBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSkeletonIsMutable();
        skeleton_.add(value);
        onChanged();
      } else {
        skeletonBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Defines the connections between keypoint_names. Each value represents the index in keypoint_names.
     * </pre>
     *
     * <code>repeated .clarifai.api.KeypointEdge skeleton = 2;</code>
     */
    public Builder addSkeleton(
        int index, com.clarifai.grpc.api.KeypointEdge value) {
      if (skeletonBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSkeletonIsMutable();
        skeleton_.add(index, value);
        onChanged();
      } else {
        skeletonBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Defines the connections between keypoint_names. Each value represents the index in keypoint_names.
     * </pre>
     *
     * <code>repeated .clarifai.api.KeypointEdge skeleton = 2;</code>
     */
    public Builder addSkeleton(
        com.clarifai.grpc.api.KeypointEdge.Builder builderForValue) {
      if (skeletonBuilder_ == null) {
        ensureSkeletonIsMutable();
        skeleton_.add(builderForValue.build());
        onChanged();
      } else {
        skeletonBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Defines the connections between keypoint_names. Each value represents the index in keypoint_names.
     * </pre>
     *
     * <code>repeated .clarifai.api.KeypointEdge skeleton = 2;</code>
     */
    public Builder addSkeleton(
        int index, com.clarifai.grpc.api.KeypointEdge.Builder builderForValue) {
      if (skeletonBuilder_ == null) {
        ensureSkeletonIsMutable();
        skeleton_.add(index, builderForValue.build());
        onChanged();
      } else {
        skeletonBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Defines the connections between keypoint_names. Each value represents the index in keypoint_names.
     * </pre>
     *
     * <code>repeated .clarifai.api.KeypointEdge skeleton = 2;</code>
     */
    public Builder addAllSkeleton(
        java.lang.Iterable<? extends com.clarifai.grpc.api.KeypointEdge> values) {
      if (skeletonBuilder_ == null) {
        ensureSkeletonIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, skeleton_);
        onChanged();
      } else {
        skeletonBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Defines the connections between keypoint_names. Each value represents the index in keypoint_names.
     * </pre>
     *
     * <code>repeated .clarifai.api.KeypointEdge skeleton = 2;</code>
     */
    public Builder clearSkeleton() {
      if (skeletonBuilder_ == null) {
        skeleton_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        skeletonBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Defines the connections between keypoint_names. Each value represents the index in keypoint_names.
     * </pre>
     *
     * <code>repeated .clarifai.api.KeypointEdge skeleton = 2;</code>
     */
    public Builder removeSkeleton(int index) {
      if (skeletonBuilder_ == null) {
        ensureSkeletonIsMutable();
        skeleton_.remove(index);
        onChanged();
      } else {
        skeletonBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Defines the connections between keypoint_names. Each value represents the index in keypoint_names.
     * </pre>
     *
     * <code>repeated .clarifai.api.KeypointEdge skeleton = 2;</code>
     */
    public com.clarifai.grpc.api.KeypointEdge.Builder getSkeletonBuilder(
        int index) {
      return getSkeletonFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Defines the connections between keypoint_names. Each value represents the index in keypoint_names.
     * </pre>
     *
     * <code>repeated .clarifai.api.KeypointEdge skeleton = 2;</code>
     */
    public com.clarifai.grpc.api.KeypointEdgeOrBuilder getSkeletonOrBuilder(
        int index) {
      if (skeletonBuilder_ == null) {
        return skeleton_.get(index);  } else {
        return skeletonBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Defines the connections between keypoint_names. Each value represents the index in keypoint_names.
     * </pre>
     *
     * <code>repeated .clarifai.api.KeypointEdge skeleton = 2;</code>
     */
    public java.util.List<? extends com.clarifai.grpc.api.KeypointEdgeOrBuilder> 
         getSkeletonOrBuilderList() {
      if (skeletonBuilder_ != null) {
        return skeletonBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(skeleton_);
      }
    }
    /**
     * <pre>
     * Defines the connections between keypoint_names. Each value represents the index in keypoint_names.
     * </pre>
     *
     * <code>repeated .clarifai.api.KeypointEdge skeleton = 2;</code>
     */
    public com.clarifai.grpc.api.KeypointEdge.Builder addSkeletonBuilder() {
      return getSkeletonFieldBuilder().addBuilder(
          com.clarifai.grpc.api.KeypointEdge.getDefaultInstance());
    }
    /**
     * <pre>
     * Defines the connections between keypoint_names. Each value represents the index in keypoint_names.
     * </pre>
     *
     * <code>repeated .clarifai.api.KeypointEdge skeleton = 2;</code>
     */
    public com.clarifai.grpc.api.KeypointEdge.Builder addSkeletonBuilder(
        int index) {
      return getSkeletonFieldBuilder().addBuilder(
          index, com.clarifai.grpc.api.KeypointEdge.getDefaultInstance());
    }
    /**
     * <pre>
     * Defines the connections between keypoint_names. Each value represents the index in keypoint_names.
     * </pre>
     *
     * <code>repeated .clarifai.api.KeypointEdge skeleton = 2;</code>
     */
    public java.util.List<com.clarifai.grpc.api.KeypointEdge.Builder> 
         getSkeletonBuilderList() {
      return getSkeletonFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.KeypointEdge, com.clarifai.grpc.api.KeypointEdge.Builder, com.clarifai.grpc.api.KeypointEdgeOrBuilder> 
        getSkeletonFieldBuilder() {
      if (skeletonBuilder_ == null) {
        skeletonBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.clarifai.grpc.api.KeypointEdge, com.clarifai.grpc.api.KeypointEdge.Builder, com.clarifai.grpc.api.KeypointEdgeOrBuilder>(
                skeleton_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        skeleton_ = null;
      }
      return skeletonBuilder_;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.KeypointInfo)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.KeypointInfo)
  private static final com.clarifai.grpc.api.KeypointInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.KeypointInfo();
  }

  public static com.clarifai.grpc.api.KeypointInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeypointInfo>
      PARSER = new com.google.protobuf.AbstractParser<KeypointInfo>() {
    @java.lang.Override
    public KeypointInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KeypointInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KeypointInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeypointInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.KeypointInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

