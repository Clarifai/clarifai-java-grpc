// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * <pre>
 * TaskStatusCountPerUser can represent one of the following:
 * * count of task annotations created by a worker for each valid status,
 * * count of task inputs assigned to a worker  (i.e. task assignments) for each valid status
 * </pre>
 *
 * Protobuf type {@code clarifai.api.TaskStatusCountPerUser}
 */
public final class TaskStatusCountPerUser extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.TaskStatusCountPerUser)
    TaskStatusCountPerUserOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TaskStatusCountPerUser.newBuilder() to construct.
  private TaskStatusCountPerUser(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TaskStatusCountPerUser() {
    userId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TaskStatusCountPerUser();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TaskStatusCountPerUser(
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

            userId_ = s;
            break;
          }
          case 16: {

            pending_ = input.readUInt32();
            break;
          }
          case 24: {

            awaitingReview_ = input.readUInt32();
            break;
          }
          case 32: {

            success_ = input.readUInt32();
            break;
          }
          case 40: {

            reviewDenied_ = input.readUInt32();
            break;
          }
          case 48: {

            awaitingConsensusReview_ = input.readUInt32();
            break;
          }
          case 58: {
            com.clarifai.grpc.api.Worker.Builder subBuilder = null;
            if (worker_ != null) {
              subBuilder = worker_.toBuilder();
            }
            worker_ = input.readMessage(com.clarifai.grpc.api.Worker.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(worker_);
              worker_ = subBuilder.buildPartial();
            }

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
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_TaskStatusCountPerUser_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_TaskStatusCountPerUser_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.TaskStatusCountPerUser.class, com.clarifai.grpc.api.TaskStatusCountPerUser.Builder.class);
  }

  public static final int USER_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object userId_;
  /**
   * <pre>
   * Deprecated: Use worker instead.
   * </pre>
   *
   * <code>string user_id = 1 [deprecated = true];</code>
   * @deprecated clarifai.api.TaskStatusCountPerUser.user_id is deprecated.
   *     See proto/clarifai/api/resources.proto;l=3319
   * @return The userId.
   */
  @java.lang.Override
  @java.lang.Deprecated public java.lang.String getUserId() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Deprecated: Use worker instead.
   * </pre>
   *
   * <code>string user_id = 1 [deprecated = true];</code>
   * @deprecated clarifai.api.TaskStatusCountPerUser.user_id is deprecated.
   *     See proto/clarifai/api/resources.proto;l=3319
   * @return The bytes for userId.
   */
  @java.lang.Override
  @java.lang.Deprecated public com.google.protobuf.ByteString
      getUserIdBytes() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PENDING_FIELD_NUMBER = 2;
  private int pending_;
  /**
   * <code>uint32 pending = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The pending.
   */
  @java.lang.Override
  public int getPending() {
    return pending_;
  }

  public static final int AWAITING_REVIEW_FIELD_NUMBER = 3;
  private int awaitingReview_;
  /**
   * <code>uint32 awaiting_review = 3 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The awaitingReview.
   */
  @java.lang.Override
  public int getAwaitingReview() {
    return awaitingReview_;
  }

  public static final int SUCCESS_FIELD_NUMBER = 4;
  private int success_;
  /**
   * <code>uint32 success = 4 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The success.
   */
  @java.lang.Override
  public int getSuccess() {
    return success_;
  }

  public static final int REVIEW_DENIED_FIELD_NUMBER = 5;
  private int reviewDenied_;
  /**
   * <code>uint32 review_denied = 5 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The reviewDenied.
   */
  @java.lang.Override
  public int getReviewDenied() {
    return reviewDenied_;
  }

  public static final int AWAITING_CONSENSUS_REVIEW_FIELD_NUMBER = 6;
  private int awaitingConsensusReview_;
  /**
   * <code>uint32 awaiting_consensus_review = 6 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The awaitingConsensusReview.
   */
  @java.lang.Override
  public int getAwaitingConsensusReview() {
    return awaitingConsensusReview_;
  }

  public static final int WORKER_FIELD_NUMBER = 7;
  private com.clarifai.grpc.api.Worker worker_;
  /**
   * <code>.clarifai.api.Worker worker = 7;</code>
   * @return Whether the worker field is set.
   */
  @java.lang.Override
  public boolean hasWorker() {
    return worker_ != null;
  }
  /**
   * <code>.clarifai.api.Worker worker = 7;</code>
   * @return The worker.
   */
  @java.lang.Override
  public com.clarifai.grpc.api.Worker getWorker() {
    return worker_ == null ? com.clarifai.grpc.api.Worker.getDefaultInstance() : worker_;
  }
  /**
   * <code>.clarifai.api.Worker worker = 7;</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.WorkerOrBuilder getWorkerOrBuilder() {
    return getWorker();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, userId_);
    }
    if (pending_ != 0) {
      output.writeUInt32(2, pending_);
    }
    if (awaitingReview_ != 0) {
      output.writeUInt32(3, awaitingReview_);
    }
    if (success_ != 0) {
      output.writeUInt32(4, success_);
    }
    if (reviewDenied_ != 0) {
      output.writeUInt32(5, reviewDenied_);
    }
    if (awaitingConsensusReview_ != 0) {
      output.writeUInt32(6, awaitingConsensusReview_);
    }
    if (worker_ != null) {
      output.writeMessage(7, getWorker());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, userId_);
    }
    if (pending_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, pending_);
    }
    if (awaitingReview_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, awaitingReview_);
    }
    if (success_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, success_);
    }
    if (reviewDenied_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(5, reviewDenied_);
    }
    if (awaitingConsensusReview_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(6, awaitingConsensusReview_);
    }
    if (worker_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(7, getWorker());
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
    if (!(obj instanceof com.clarifai.grpc.api.TaskStatusCountPerUser)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.TaskStatusCountPerUser other = (com.clarifai.grpc.api.TaskStatusCountPerUser) obj;

    if (!getUserId()
        .equals(other.getUserId())) return false;
    if (getPending()
        != other.getPending()) return false;
    if (getAwaitingReview()
        != other.getAwaitingReview()) return false;
    if (getSuccess()
        != other.getSuccess()) return false;
    if (getReviewDenied()
        != other.getReviewDenied()) return false;
    if (getAwaitingConsensusReview()
        != other.getAwaitingConsensusReview()) return false;
    if (hasWorker() != other.hasWorker()) return false;
    if (hasWorker()) {
      if (!getWorker()
          .equals(other.getWorker())) return false;
    }
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
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId().hashCode();
    hash = (37 * hash) + PENDING_FIELD_NUMBER;
    hash = (53 * hash) + getPending();
    hash = (37 * hash) + AWAITING_REVIEW_FIELD_NUMBER;
    hash = (53 * hash) + getAwaitingReview();
    hash = (37 * hash) + SUCCESS_FIELD_NUMBER;
    hash = (53 * hash) + getSuccess();
    hash = (37 * hash) + REVIEW_DENIED_FIELD_NUMBER;
    hash = (53 * hash) + getReviewDenied();
    hash = (37 * hash) + AWAITING_CONSENSUS_REVIEW_FIELD_NUMBER;
    hash = (53 * hash) + getAwaitingConsensusReview();
    if (hasWorker()) {
      hash = (37 * hash) + WORKER_FIELD_NUMBER;
      hash = (53 * hash) + getWorker().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.TaskStatusCountPerUser parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.TaskStatusCountPerUser parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.TaskStatusCountPerUser parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.TaskStatusCountPerUser parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.TaskStatusCountPerUser parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.TaskStatusCountPerUser parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.TaskStatusCountPerUser parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.TaskStatusCountPerUser parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.TaskStatusCountPerUser parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.TaskStatusCountPerUser parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.TaskStatusCountPerUser parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.TaskStatusCountPerUser parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.TaskStatusCountPerUser prototype) {
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
   * TaskStatusCountPerUser can represent one of the following:
   * * count of task annotations created by a worker for each valid status,
   * * count of task inputs assigned to a worker  (i.e. task assignments) for each valid status
   * </pre>
   *
   * Protobuf type {@code clarifai.api.TaskStatusCountPerUser}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.TaskStatusCountPerUser)
      com.clarifai.grpc.api.TaskStatusCountPerUserOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_TaskStatusCountPerUser_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_TaskStatusCountPerUser_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.TaskStatusCountPerUser.class, com.clarifai.grpc.api.TaskStatusCountPerUser.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.TaskStatusCountPerUser.newBuilder()
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
      userId_ = "";

      pending_ = 0;

      awaitingReview_ = 0;

      success_ = 0;

      reviewDenied_ = 0;

      awaitingConsensusReview_ = 0;

      if (workerBuilder_ == null) {
        worker_ = null;
      } else {
        worker_ = null;
        workerBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_TaskStatusCountPerUser_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.TaskStatusCountPerUser getDefaultInstanceForType() {
      return com.clarifai.grpc.api.TaskStatusCountPerUser.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.TaskStatusCountPerUser build() {
      com.clarifai.grpc.api.TaskStatusCountPerUser result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.TaskStatusCountPerUser buildPartial() {
      com.clarifai.grpc.api.TaskStatusCountPerUser result = new com.clarifai.grpc.api.TaskStatusCountPerUser(this);
      result.userId_ = userId_;
      result.pending_ = pending_;
      result.awaitingReview_ = awaitingReview_;
      result.success_ = success_;
      result.reviewDenied_ = reviewDenied_;
      result.awaitingConsensusReview_ = awaitingConsensusReview_;
      if (workerBuilder_ == null) {
        result.worker_ = worker_;
      } else {
        result.worker_ = workerBuilder_.build();
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
      if (other instanceof com.clarifai.grpc.api.TaskStatusCountPerUser) {
        return mergeFrom((com.clarifai.grpc.api.TaskStatusCountPerUser)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.TaskStatusCountPerUser other) {
      if (other == com.clarifai.grpc.api.TaskStatusCountPerUser.getDefaultInstance()) return this;
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        onChanged();
      }
      if (other.getPending() != 0) {
        setPending(other.getPending());
      }
      if (other.getAwaitingReview() != 0) {
        setAwaitingReview(other.getAwaitingReview());
      }
      if (other.getSuccess() != 0) {
        setSuccess(other.getSuccess());
      }
      if (other.getReviewDenied() != 0) {
        setReviewDenied(other.getReviewDenied());
      }
      if (other.getAwaitingConsensusReview() != 0) {
        setAwaitingConsensusReview(other.getAwaitingConsensusReview());
      }
      if (other.hasWorker()) {
        mergeWorker(other.getWorker());
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
      com.clarifai.grpc.api.TaskStatusCountPerUser parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.TaskStatusCountPerUser) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object userId_ = "";
    /**
     * <pre>
     * Deprecated: Use worker instead.
     * </pre>
     *
     * <code>string user_id = 1 [deprecated = true];</code>
     * @deprecated clarifai.api.TaskStatusCountPerUser.user_id is deprecated.
     *     See proto/clarifai/api/resources.proto;l=3319
     * @return The userId.
     */
    @java.lang.Deprecated public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Deprecated: Use worker instead.
     * </pre>
     *
     * <code>string user_id = 1 [deprecated = true];</code>
     * @deprecated clarifai.api.TaskStatusCountPerUser.user_id is deprecated.
     *     See proto/clarifai/api/resources.proto;l=3319
     * @return The bytes for userId.
     */
    @java.lang.Deprecated public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Deprecated: Use worker instead.
     * </pre>
     *
     * <code>string user_id = 1 [deprecated = true];</code>
     * @deprecated clarifai.api.TaskStatusCountPerUser.user_id is deprecated.
     *     See proto/clarifai/api/resources.proto;l=3319
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setUserId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Deprecated: Use worker instead.
     * </pre>
     *
     * <code>string user_id = 1 [deprecated = true];</code>
     * @deprecated clarifai.api.TaskStatusCountPerUser.user_id is deprecated.
     *     See proto/clarifai/api/resources.proto;l=3319
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearUserId() {
      
      userId_ = getDefaultInstance().getUserId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Deprecated: Use worker instead.
     * </pre>
     *
     * <code>string user_id = 1 [deprecated = true];</code>
     * @deprecated clarifai.api.TaskStatusCountPerUser.user_id is deprecated.
     *     See proto/clarifai/api/resources.proto;l=3319
     * @param value The bytes for userId to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userId_ = value;
      onChanged();
      return this;
    }

    private int pending_ ;
    /**
     * <code>uint32 pending = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @return The pending.
     */
    @java.lang.Override
    public int getPending() {
      return pending_;
    }
    /**
     * <code>uint32 pending = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @param value The pending to set.
     * @return This builder for chaining.
     */
    public Builder setPending(int value) {
      
      pending_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 pending = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @return This builder for chaining.
     */
    public Builder clearPending() {
      
      pending_ = 0;
      onChanged();
      return this;
    }

    private int awaitingReview_ ;
    /**
     * <code>uint32 awaiting_review = 3 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @return The awaitingReview.
     */
    @java.lang.Override
    public int getAwaitingReview() {
      return awaitingReview_;
    }
    /**
     * <code>uint32 awaiting_review = 3 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @param value The awaitingReview to set.
     * @return This builder for chaining.
     */
    public Builder setAwaitingReview(int value) {
      
      awaitingReview_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 awaiting_review = 3 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @return This builder for chaining.
     */
    public Builder clearAwaitingReview() {
      
      awaitingReview_ = 0;
      onChanged();
      return this;
    }

    private int success_ ;
    /**
     * <code>uint32 success = 4 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @return The success.
     */
    @java.lang.Override
    public int getSuccess() {
      return success_;
    }
    /**
     * <code>uint32 success = 4 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @param value The success to set.
     * @return This builder for chaining.
     */
    public Builder setSuccess(int value) {
      
      success_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 success = 4 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @return This builder for chaining.
     */
    public Builder clearSuccess() {
      
      success_ = 0;
      onChanged();
      return this;
    }

    private int reviewDenied_ ;
    /**
     * <code>uint32 review_denied = 5 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @return The reviewDenied.
     */
    @java.lang.Override
    public int getReviewDenied() {
      return reviewDenied_;
    }
    /**
     * <code>uint32 review_denied = 5 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @param value The reviewDenied to set.
     * @return This builder for chaining.
     */
    public Builder setReviewDenied(int value) {
      
      reviewDenied_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 review_denied = 5 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @return This builder for chaining.
     */
    public Builder clearReviewDenied() {
      
      reviewDenied_ = 0;
      onChanged();
      return this;
    }

    private int awaitingConsensusReview_ ;
    /**
     * <code>uint32 awaiting_consensus_review = 6 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @return The awaitingConsensusReview.
     */
    @java.lang.Override
    public int getAwaitingConsensusReview() {
      return awaitingConsensusReview_;
    }
    /**
     * <code>uint32 awaiting_consensus_review = 6 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @param value The awaitingConsensusReview to set.
     * @return This builder for chaining.
     */
    public Builder setAwaitingConsensusReview(int value) {
      
      awaitingConsensusReview_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 awaiting_consensus_review = 6 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @return This builder for chaining.
     */
    public Builder clearAwaitingConsensusReview() {
      
      awaitingConsensusReview_ = 0;
      onChanged();
      return this;
    }

    private com.clarifai.grpc.api.Worker worker_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.Worker, com.clarifai.grpc.api.Worker.Builder, com.clarifai.grpc.api.WorkerOrBuilder> workerBuilder_;
    /**
     * <code>.clarifai.api.Worker worker = 7;</code>
     * @return Whether the worker field is set.
     */
    public boolean hasWorker() {
      return workerBuilder_ != null || worker_ != null;
    }
    /**
     * <code>.clarifai.api.Worker worker = 7;</code>
     * @return The worker.
     */
    public com.clarifai.grpc.api.Worker getWorker() {
      if (workerBuilder_ == null) {
        return worker_ == null ? com.clarifai.grpc.api.Worker.getDefaultInstance() : worker_;
      } else {
        return workerBuilder_.getMessage();
      }
    }
    /**
     * <code>.clarifai.api.Worker worker = 7;</code>
     */
    public Builder setWorker(com.clarifai.grpc.api.Worker value) {
      if (workerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        worker_ = value;
        onChanged();
      } else {
        workerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.clarifai.api.Worker worker = 7;</code>
     */
    public Builder setWorker(
        com.clarifai.grpc.api.Worker.Builder builderForValue) {
      if (workerBuilder_ == null) {
        worker_ = builderForValue.build();
        onChanged();
      } else {
        workerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.clarifai.api.Worker worker = 7;</code>
     */
    public Builder mergeWorker(com.clarifai.grpc.api.Worker value) {
      if (workerBuilder_ == null) {
        if (worker_ != null) {
          worker_ =
            com.clarifai.grpc.api.Worker.newBuilder(worker_).mergeFrom(value).buildPartial();
        } else {
          worker_ = value;
        }
        onChanged();
      } else {
        workerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.clarifai.api.Worker worker = 7;</code>
     */
    public Builder clearWorker() {
      if (workerBuilder_ == null) {
        worker_ = null;
        onChanged();
      } else {
        worker_ = null;
        workerBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.clarifai.api.Worker worker = 7;</code>
     */
    public com.clarifai.grpc.api.Worker.Builder getWorkerBuilder() {
      
      onChanged();
      return getWorkerFieldBuilder().getBuilder();
    }
    /**
     * <code>.clarifai.api.Worker worker = 7;</code>
     */
    public com.clarifai.grpc.api.WorkerOrBuilder getWorkerOrBuilder() {
      if (workerBuilder_ != null) {
        return workerBuilder_.getMessageOrBuilder();
      } else {
        return worker_ == null ?
            com.clarifai.grpc.api.Worker.getDefaultInstance() : worker_;
      }
    }
    /**
     * <code>.clarifai.api.Worker worker = 7;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.Worker, com.clarifai.grpc.api.Worker.Builder, com.clarifai.grpc.api.WorkerOrBuilder> 
        getWorkerFieldBuilder() {
      if (workerBuilder_ == null) {
        workerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.clarifai.grpc.api.Worker, com.clarifai.grpc.api.Worker.Builder, com.clarifai.grpc.api.WorkerOrBuilder>(
                getWorker(),
                getParentForChildren(),
                isClean());
        worker_ = null;
      }
      return workerBuilder_;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.TaskStatusCountPerUser)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.TaskStatusCountPerUser)
  private static final com.clarifai.grpc.api.TaskStatusCountPerUser DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.TaskStatusCountPerUser();
  }

  public static com.clarifai.grpc.api.TaskStatusCountPerUser getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TaskStatusCountPerUser>
      PARSER = new com.google.protobuf.AbstractParser<TaskStatusCountPerUser>() {
    @java.lang.Override
    public TaskStatusCountPerUser parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TaskStatusCountPerUser(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TaskStatusCountPerUser> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TaskStatusCountPerUser> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.TaskStatusCountPerUser getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

