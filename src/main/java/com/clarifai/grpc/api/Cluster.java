// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * <pre>
 *&#47;/////////////////////////////////////////////////////////////////////////////
 * Messages from /proto/clarifai/api/cluster.proto
 * //////////////////////////////////////////////////////////////////////////////
 * </pre>
 *
 * Protobuf type {@code clarifai.api.Cluster}
 */
public  final class Cluster extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.Cluster)
    ClusterOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Cluster.newBuilder() to construct.
  private Cluster(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Cluster() {
    id_ = "";
    hits_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Cluster();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Cluster(
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

            id_ = s;
            break;
          }
          case 16: {

            count_ = input.readUInt32();
            break;
          }
          case 29: {

            score_ = input.readFloat();
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              hits_ = new java.util.ArrayList<com.clarifai.grpc.api.Hit>();
              mutable_bitField0_ |= 0x00000001;
            }
            hits_.add(
                input.readMessage(com.clarifai.grpc.api.Hit.parser(), extensionRegistry));
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
        hits_ = java.util.Collections.unmodifiableList(hits_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Cluster_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Cluster_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.Cluster.class, com.clarifai.grpc.api.Cluster.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 1;</code>
   */
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COUNT_FIELD_NUMBER = 2;
  private int count_;
  /**
   * <pre>
   * Number of annotations tied to the cluster in the app
   * </pre>
   *
   * <code>uint32 count = 2;</code>
   */
  public int getCount() {
    return count_;
  }

  public static final int SCORE_FIELD_NUMBER = 3;
  private float score_;
  /**
   * <pre>
   * The score assigned to this cluster
   * </pre>
   *
   * <code>float score = 3;</code>
   */
  public float getScore() {
    return score_;
  }

  public static final int HITS_FIELD_NUMBER = 4;
  private java.util.List<com.clarifai.grpc.api.Hit> hits_;
  /**
   * <pre>
   * Representative hits for cluster (for now we only return 1)
   * </pre>
   *
   * <code>repeated .clarifai.api.Hit hits = 4;</code>
   */
  public java.util.List<com.clarifai.grpc.api.Hit> getHitsList() {
    return hits_;
  }
  /**
   * <pre>
   * Representative hits for cluster (for now we only return 1)
   * </pre>
   *
   * <code>repeated .clarifai.api.Hit hits = 4;</code>
   */
  public java.util.List<? extends com.clarifai.grpc.api.HitOrBuilder> 
      getHitsOrBuilderList() {
    return hits_;
  }
  /**
   * <pre>
   * Representative hits for cluster (for now we only return 1)
   * </pre>
   *
   * <code>repeated .clarifai.api.Hit hits = 4;</code>
   */
  public int getHitsCount() {
    return hits_.size();
  }
  /**
   * <pre>
   * Representative hits for cluster (for now we only return 1)
   * </pre>
   *
   * <code>repeated .clarifai.api.Hit hits = 4;</code>
   */
  public com.clarifai.grpc.api.Hit getHits(int index) {
    return hits_.get(index);
  }
  /**
   * <pre>
   * Representative hits for cluster (for now we only return 1)
   * </pre>
   *
   * <code>repeated .clarifai.api.Hit hits = 4;</code>
   */
  public com.clarifai.grpc.api.HitOrBuilder getHitsOrBuilder(
      int index) {
    return hits_.get(index);
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
    if (!getIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (count_ != 0) {
      output.writeUInt32(2, count_);
    }
    if (score_ != 0F) {
      output.writeFloat(3, score_);
    }
    for (int i = 0; i < hits_.size(); i++) {
      output.writeMessage(4, hits_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (count_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, count_);
    }
    if (score_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, score_);
    }
    for (int i = 0; i < hits_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, hits_.get(i));
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
    if (!(obj instanceof com.clarifai.grpc.api.Cluster)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.Cluster other = (com.clarifai.grpc.api.Cluster) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (getCount()
        != other.getCount()) return false;
    if (java.lang.Float.floatToIntBits(getScore())
        != java.lang.Float.floatToIntBits(
            other.getScore())) return false;
    if (!getHitsList()
        .equals(other.getHitsList())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getCount();
    hash = (37 * hash) + SCORE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getScore());
    if (getHitsCount() > 0) {
      hash = (37 * hash) + HITS_FIELD_NUMBER;
      hash = (53 * hash) + getHitsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.Cluster parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.Cluster parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Cluster parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.Cluster parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Cluster parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.Cluster parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Cluster parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.Cluster parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Cluster parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.Cluster parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Cluster parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.Cluster parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.Cluster prototype) {
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
   *&#47;/////////////////////////////////////////////////////////////////////////////
   * Messages from /proto/clarifai/api/cluster.proto
   * //////////////////////////////////////////////////////////////////////////////
   * </pre>
   *
   * Protobuf type {@code clarifai.api.Cluster}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.Cluster)
      com.clarifai.grpc.api.ClusterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Cluster_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Cluster_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.Cluster.class, com.clarifai.grpc.api.Cluster.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.Cluster.newBuilder()
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
        getHitsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = "";

      count_ = 0;

      score_ = 0F;

      if (hitsBuilder_ == null) {
        hits_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        hitsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Cluster_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.Cluster getDefaultInstanceForType() {
      return com.clarifai.grpc.api.Cluster.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.Cluster build() {
      com.clarifai.grpc.api.Cluster result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.Cluster buildPartial() {
      com.clarifai.grpc.api.Cluster result = new com.clarifai.grpc.api.Cluster(this);
      int from_bitField0_ = bitField0_;
      result.id_ = id_;
      result.count_ = count_;
      result.score_ = score_;
      if (hitsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          hits_ = java.util.Collections.unmodifiableList(hits_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.hits_ = hits_;
      } else {
        result.hits_ = hitsBuilder_.build();
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
      if (other instanceof com.clarifai.grpc.api.Cluster) {
        return mergeFrom((com.clarifai.grpc.api.Cluster)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.Cluster other) {
      if (other == com.clarifai.grpc.api.Cluster.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (other.getCount() != 0) {
        setCount(other.getCount());
      }
      if (other.getScore() != 0F) {
        setScore(other.getScore());
      }
      if (hitsBuilder_ == null) {
        if (!other.hits_.isEmpty()) {
          if (hits_.isEmpty()) {
            hits_ = other.hits_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureHitsIsMutable();
            hits_.addAll(other.hits_);
          }
          onChanged();
        }
      } else {
        if (!other.hits_.isEmpty()) {
          if (hitsBuilder_.isEmpty()) {
            hitsBuilder_.dispose();
            hitsBuilder_ = null;
            hits_ = other.hits_;
            bitField0_ = (bitField0_ & ~0x00000001);
            hitsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getHitsFieldBuilder() : null;
          } else {
            hitsBuilder_.addAllMessages(other.hits_);
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
      com.clarifai.grpc.api.Cluster parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.Cluster) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1;</code>
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private int count_ ;
    /**
     * <pre>
     * Number of annotations tied to the cluster in the app
     * </pre>
     *
     * <code>uint32 count = 2;</code>
     */
    public int getCount() {
      return count_;
    }
    /**
     * <pre>
     * Number of annotations tied to the cluster in the app
     * </pre>
     *
     * <code>uint32 count = 2;</code>
     */
    public Builder setCount(int value) {
      
      count_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of annotations tied to the cluster in the app
     * </pre>
     *
     * <code>uint32 count = 2;</code>
     */
    public Builder clearCount() {
      
      count_ = 0;
      onChanged();
      return this;
    }

    private float score_ ;
    /**
     * <pre>
     * The score assigned to this cluster
     * </pre>
     *
     * <code>float score = 3;</code>
     */
    public float getScore() {
      return score_;
    }
    /**
     * <pre>
     * The score assigned to this cluster
     * </pre>
     *
     * <code>float score = 3;</code>
     */
    public Builder setScore(float value) {
      
      score_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The score assigned to this cluster
     * </pre>
     *
     * <code>float score = 3;</code>
     */
    public Builder clearScore() {
      
      score_ = 0F;
      onChanged();
      return this;
    }

    private java.util.List<com.clarifai.grpc.api.Hit> hits_ =
      java.util.Collections.emptyList();
    private void ensureHitsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        hits_ = new java.util.ArrayList<com.clarifai.grpc.api.Hit>(hits_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.Hit, com.clarifai.grpc.api.Hit.Builder, com.clarifai.grpc.api.HitOrBuilder> hitsBuilder_;

    /**
     * <pre>
     * Representative hits for cluster (for now we only return 1)
     * </pre>
     *
     * <code>repeated .clarifai.api.Hit hits = 4;</code>
     */
    public java.util.List<com.clarifai.grpc.api.Hit> getHitsList() {
      if (hitsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(hits_);
      } else {
        return hitsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Representative hits for cluster (for now we only return 1)
     * </pre>
     *
     * <code>repeated .clarifai.api.Hit hits = 4;</code>
     */
    public int getHitsCount() {
      if (hitsBuilder_ == null) {
        return hits_.size();
      } else {
        return hitsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Representative hits for cluster (for now we only return 1)
     * </pre>
     *
     * <code>repeated .clarifai.api.Hit hits = 4;</code>
     */
    public com.clarifai.grpc.api.Hit getHits(int index) {
      if (hitsBuilder_ == null) {
        return hits_.get(index);
      } else {
        return hitsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Representative hits for cluster (for now we only return 1)
     * </pre>
     *
     * <code>repeated .clarifai.api.Hit hits = 4;</code>
     */
    public Builder setHits(
        int index, com.clarifai.grpc.api.Hit value) {
      if (hitsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHitsIsMutable();
        hits_.set(index, value);
        onChanged();
      } else {
        hitsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Representative hits for cluster (for now we only return 1)
     * </pre>
     *
     * <code>repeated .clarifai.api.Hit hits = 4;</code>
     */
    public Builder setHits(
        int index, com.clarifai.grpc.api.Hit.Builder builderForValue) {
      if (hitsBuilder_ == null) {
        ensureHitsIsMutable();
        hits_.set(index, builderForValue.build());
        onChanged();
      } else {
        hitsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Representative hits for cluster (for now we only return 1)
     * </pre>
     *
     * <code>repeated .clarifai.api.Hit hits = 4;</code>
     */
    public Builder addHits(com.clarifai.grpc.api.Hit value) {
      if (hitsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHitsIsMutable();
        hits_.add(value);
        onChanged();
      } else {
        hitsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Representative hits for cluster (for now we only return 1)
     * </pre>
     *
     * <code>repeated .clarifai.api.Hit hits = 4;</code>
     */
    public Builder addHits(
        int index, com.clarifai.grpc.api.Hit value) {
      if (hitsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHitsIsMutable();
        hits_.add(index, value);
        onChanged();
      } else {
        hitsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Representative hits for cluster (for now we only return 1)
     * </pre>
     *
     * <code>repeated .clarifai.api.Hit hits = 4;</code>
     */
    public Builder addHits(
        com.clarifai.grpc.api.Hit.Builder builderForValue) {
      if (hitsBuilder_ == null) {
        ensureHitsIsMutable();
        hits_.add(builderForValue.build());
        onChanged();
      } else {
        hitsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Representative hits for cluster (for now we only return 1)
     * </pre>
     *
     * <code>repeated .clarifai.api.Hit hits = 4;</code>
     */
    public Builder addHits(
        int index, com.clarifai.grpc.api.Hit.Builder builderForValue) {
      if (hitsBuilder_ == null) {
        ensureHitsIsMutable();
        hits_.add(index, builderForValue.build());
        onChanged();
      } else {
        hitsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Representative hits for cluster (for now we only return 1)
     * </pre>
     *
     * <code>repeated .clarifai.api.Hit hits = 4;</code>
     */
    public Builder addAllHits(
        java.lang.Iterable<? extends com.clarifai.grpc.api.Hit> values) {
      if (hitsBuilder_ == null) {
        ensureHitsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, hits_);
        onChanged();
      } else {
        hitsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Representative hits for cluster (for now we only return 1)
     * </pre>
     *
     * <code>repeated .clarifai.api.Hit hits = 4;</code>
     */
    public Builder clearHits() {
      if (hitsBuilder_ == null) {
        hits_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        hitsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Representative hits for cluster (for now we only return 1)
     * </pre>
     *
     * <code>repeated .clarifai.api.Hit hits = 4;</code>
     */
    public Builder removeHits(int index) {
      if (hitsBuilder_ == null) {
        ensureHitsIsMutable();
        hits_.remove(index);
        onChanged();
      } else {
        hitsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Representative hits for cluster (for now we only return 1)
     * </pre>
     *
     * <code>repeated .clarifai.api.Hit hits = 4;</code>
     */
    public com.clarifai.grpc.api.Hit.Builder getHitsBuilder(
        int index) {
      return getHitsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Representative hits for cluster (for now we only return 1)
     * </pre>
     *
     * <code>repeated .clarifai.api.Hit hits = 4;</code>
     */
    public com.clarifai.grpc.api.HitOrBuilder getHitsOrBuilder(
        int index) {
      if (hitsBuilder_ == null) {
        return hits_.get(index);  } else {
        return hitsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Representative hits for cluster (for now we only return 1)
     * </pre>
     *
     * <code>repeated .clarifai.api.Hit hits = 4;</code>
     */
    public java.util.List<? extends com.clarifai.grpc.api.HitOrBuilder> 
         getHitsOrBuilderList() {
      if (hitsBuilder_ != null) {
        return hitsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(hits_);
      }
    }
    /**
     * <pre>
     * Representative hits for cluster (for now we only return 1)
     * </pre>
     *
     * <code>repeated .clarifai.api.Hit hits = 4;</code>
     */
    public com.clarifai.grpc.api.Hit.Builder addHitsBuilder() {
      return getHitsFieldBuilder().addBuilder(
          com.clarifai.grpc.api.Hit.getDefaultInstance());
    }
    /**
     * <pre>
     * Representative hits for cluster (for now we only return 1)
     * </pre>
     *
     * <code>repeated .clarifai.api.Hit hits = 4;</code>
     */
    public com.clarifai.grpc.api.Hit.Builder addHitsBuilder(
        int index) {
      return getHitsFieldBuilder().addBuilder(
          index, com.clarifai.grpc.api.Hit.getDefaultInstance());
    }
    /**
     * <pre>
     * Representative hits for cluster (for now we only return 1)
     * </pre>
     *
     * <code>repeated .clarifai.api.Hit hits = 4;</code>
     */
    public java.util.List<com.clarifai.grpc.api.Hit.Builder> 
         getHitsBuilderList() {
      return getHitsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.Hit, com.clarifai.grpc.api.Hit.Builder, com.clarifai.grpc.api.HitOrBuilder> 
        getHitsFieldBuilder() {
      if (hitsBuilder_ == null) {
        hitsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.clarifai.grpc.api.Hit, com.clarifai.grpc.api.Hit.Builder, com.clarifai.grpc.api.HitOrBuilder>(
                hits_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        hits_ = null;
      }
      return hitsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.Cluster)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.Cluster)
  private static final com.clarifai.grpc.api.Cluster DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.Cluster();
  }

  public static com.clarifai.grpc.api.Cluster getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Cluster>
      PARSER = new com.google.protobuf.AbstractParser<Cluster>() {
    @java.lang.Override
    public Cluster parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Cluster(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Cluster> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Cluster> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.Cluster getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

