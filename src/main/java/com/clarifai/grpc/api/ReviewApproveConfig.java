// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

/**
 * Protobuf type {@code clarifai.api.ReviewApproveConfig}
 */
public final class ReviewApproveConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.ReviewApproveConfig)
    ReviewApproveConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReviewApproveConfig.newBuilder() to construct.
  private ReviewApproveConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReviewApproveConfig() {
    taskAssignments_ = java.util.Collections.emptyList();
    workers_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReviewApproveConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReviewApproveConfig(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              taskAssignments_ = new java.util.ArrayList<com.clarifai.grpc.api.TaskAssignment>();
              mutable_bitField0_ |= 0x00000001;
            }
            taskAssignments_.add(
                input.readMessage(com.clarifai.grpc.api.TaskAssignment.parser(), extensionRegistry));
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              workers_ = new java.util.ArrayList<com.clarifai.grpc.api.Worker>();
              mutable_bitField0_ |= 0x00000002;
            }
            workers_.add(
                input.readMessage(com.clarifai.grpc.api.Worker.parser(), extensionRegistry));
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
        taskAssignments_ = java.util.Collections.unmodifiableList(taskAssignments_);
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        workers_ = java.util.Collections.unmodifiableList(workers_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_ReviewApproveConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_ReviewApproveConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.ReviewApproveConfig.class, com.clarifai.grpc.api.ReviewApproveConfig.Builder.class);
  }

  public static final int TASK_ASSIGNMENTS_FIELD_NUMBER = 1;
  private java.util.List<com.clarifai.grpc.api.TaskAssignment> taskAssignments_;
  /**
   * <code>repeated .clarifai.api.TaskAssignment task_assignments = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.clarifai.grpc.api.TaskAssignment> getTaskAssignmentsList() {
    return taskAssignments_;
  }
  /**
   * <code>repeated .clarifai.api.TaskAssignment task_assignments = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.clarifai.grpc.api.TaskAssignmentOrBuilder> 
      getTaskAssignmentsOrBuilderList() {
    return taskAssignments_;
  }
  /**
   * <code>repeated .clarifai.api.TaskAssignment task_assignments = 1;</code>
   */
  @java.lang.Override
  public int getTaskAssignmentsCount() {
    return taskAssignments_.size();
  }
  /**
   * <code>repeated .clarifai.api.TaskAssignment task_assignments = 1;</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.TaskAssignment getTaskAssignments(int index) {
    return taskAssignments_.get(index);
  }
  /**
   * <code>repeated .clarifai.api.TaskAssignment task_assignments = 1;</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.TaskAssignmentOrBuilder getTaskAssignmentsOrBuilder(
      int index) {
    return taskAssignments_.get(index);
  }

  public static final int WORKERS_FIELD_NUMBER = 2;
  private java.util.List<com.clarifai.grpc.api.Worker> workers_;
  /**
   * <code>repeated .clarifai.api.Worker workers = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.clarifai.grpc.api.Worker> getWorkersList() {
    return workers_;
  }
  /**
   * <code>repeated .clarifai.api.Worker workers = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.clarifai.grpc.api.WorkerOrBuilder> 
      getWorkersOrBuilderList() {
    return workers_;
  }
  /**
   * <code>repeated .clarifai.api.Worker workers = 2;</code>
   */
  @java.lang.Override
  public int getWorkersCount() {
    return workers_.size();
  }
  /**
   * <code>repeated .clarifai.api.Worker workers = 2;</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.Worker getWorkers(int index) {
    return workers_.get(index);
  }
  /**
   * <code>repeated .clarifai.api.Worker workers = 2;</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.WorkerOrBuilder getWorkersOrBuilder(
      int index) {
    return workers_.get(index);
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
    for (int i = 0; i < taskAssignments_.size(); i++) {
      output.writeMessage(1, taskAssignments_.get(i));
    }
    for (int i = 0; i < workers_.size(); i++) {
      output.writeMessage(2, workers_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < taskAssignments_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, taskAssignments_.get(i));
    }
    for (int i = 0; i < workers_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, workers_.get(i));
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
    if (!(obj instanceof com.clarifai.grpc.api.ReviewApproveConfig)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.ReviewApproveConfig other = (com.clarifai.grpc.api.ReviewApproveConfig) obj;

    if (!getTaskAssignmentsList()
        .equals(other.getTaskAssignmentsList())) return false;
    if (!getWorkersList()
        .equals(other.getWorkersList())) return false;
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
    if (getTaskAssignmentsCount() > 0) {
      hash = (37 * hash) + TASK_ASSIGNMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getTaskAssignmentsList().hashCode();
    }
    if (getWorkersCount() > 0) {
      hash = (37 * hash) + WORKERS_FIELD_NUMBER;
      hash = (53 * hash) + getWorkersList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.ReviewApproveConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.ReviewApproveConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.ReviewApproveConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.ReviewApproveConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.ReviewApproveConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.ReviewApproveConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.ReviewApproveConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.ReviewApproveConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.ReviewApproveConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.ReviewApproveConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.ReviewApproveConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.ReviewApproveConfig parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.ReviewApproveConfig prototype) {
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
   * Protobuf type {@code clarifai.api.ReviewApproveConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.ReviewApproveConfig)
      com.clarifai.grpc.api.ReviewApproveConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_ReviewApproveConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_ReviewApproveConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.ReviewApproveConfig.class, com.clarifai.grpc.api.ReviewApproveConfig.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.ReviewApproveConfig.newBuilder()
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
        getTaskAssignmentsFieldBuilder();
        getWorkersFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (taskAssignmentsBuilder_ == null) {
        taskAssignments_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        taskAssignmentsBuilder_.clear();
      }
      if (workersBuilder_ == null) {
        workers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        workersBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_ReviewApproveConfig_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.ReviewApproveConfig getDefaultInstanceForType() {
      return com.clarifai.grpc.api.ReviewApproveConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.ReviewApproveConfig build() {
      com.clarifai.grpc.api.ReviewApproveConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.ReviewApproveConfig buildPartial() {
      com.clarifai.grpc.api.ReviewApproveConfig result = new com.clarifai.grpc.api.ReviewApproveConfig(this);
      int from_bitField0_ = bitField0_;
      if (taskAssignmentsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          taskAssignments_ = java.util.Collections.unmodifiableList(taskAssignments_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.taskAssignments_ = taskAssignments_;
      } else {
        result.taskAssignments_ = taskAssignmentsBuilder_.build();
      }
      if (workersBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          workers_ = java.util.Collections.unmodifiableList(workers_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.workers_ = workers_;
      } else {
        result.workers_ = workersBuilder_.build();
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
      if (other instanceof com.clarifai.grpc.api.ReviewApproveConfig) {
        return mergeFrom((com.clarifai.grpc.api.ReviewApproveConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.ReviewApproveConfig other) {
      if (other == com.clarifai.grpc.api.ReviewApproveConfig.getDefaultInstance()) return this;
      if (taskAssignmentsBuilder_ == null) {
        if (!other.taskAssignments_.isEmpty()) {
          if (taskAssignments_.isEmpty()) {
            taskAssignments_ = other.taskAssignments_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTaskAssignmentsIsMutable();
            taskAssignments_.addAll(other.taskAssignments_);
          }
          onChanged();
        }
      } else {
        if (!other.taskAssignments_.isEmpty()) {
          if (taskAssignmentsBuilder_.isEmpty()) {
            taskAssignmentsBuilder_.dispose();
            taskAssignmentsBuilder_ = null;
            taskAssignments_ = other.taskAssignments_;
            bitField0_ = (bitField0_ & ~0x00000001);
            taskAssignmentsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTaskAssignmentsFieldBuilder() : null;
          } else {
            taskAssignmentsBuilder_.addAllMessages(other.taskAssignments_);
          }
        }
      }
      if (workersBuilder_ == null) {
        if (!other.workers_.isEmpty()) {
          if (workers_.isEmpty()) {
            workers_ = other.workers_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureWorkersIsMutable();
            workers_.addAll(other.workers_);
          }
          onChanged();
        }
      } else {
        if (!other.workers_.isEmpty()) {
          if (workersBuilder_.isEmpty()) {
            workersBuilder_.dispose();
            workersBuilder_ = null;
            workers_ = other.workers_;
            bitField0_ = (bitField0_ & ~0x00000002);
            workersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getWorkersFieldBuilder() : null;
          } else {
            workersBuilder_.addAllMessages(other.workers_);
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
      com.clarifai.grpc.api.ReviewApproveConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.ReviewApproveConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.clarifai.grpc.api.TaskAssignment> taskAssignments_ =
      java.util.Collections.emptyList();
    private void ensureTaskAssignmentsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        taskAssignments_ = new java.util.ArrayList<com.clarifai.grpc.api.TaskAssignment>(taskAssignments_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.TaskAssignment, com.clarifai.grpc.api.TaskAssignment.Builder, com.clarifai.grpc.api.TaskAssignmentOrBuilder> taskAssignmentsBuilder_;

    /**
     * <code>repeated .clarifai.api.TaskAssignment task_assignments = 1;</code>
     */
    public java.util.List<com.clarifai.grpc.api.TaskAssignment> getTaskAssignmentsList() {
      if (taskAssignmentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(taskAssignments_);
      } else {
        return taskAssignmentsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .clarifai.api.TaskAssignment task_assignments = 1;</code>
     */
    public int getTaskAssignmentsCount() {
      if (taskAssignmentsBuilder_ == null) {
        return taskAssignments_.size();
      } else {
        return taskAssignmentsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .clarifai.api.TaskAssignment task_assignments = 1;</code>
     */
    public com.clarifai.grpc.api.TaskAssignment getTaskAssignments(int index) {
      if (taskAssignmentsBuilder_ == null) {
        return taskAssignments_.get(index);
      } else {
        return taskAssignmentsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .clarifai.api.TaskAssignment task_assignments = 1;</code>
     */
    public Builder setTaskAssignments(
        int index, com.clarifai.grpc.api.TaskAssignment value) {
      if (taskAssignmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTaskAssignmentsIsMutable();
        taskAssignments_.set(index, value);
        onChanged();
      } else {
        taskAssignmentsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.TaskAssignment task_assignments = 1;</code>
     */
    public Builder setTaskAssignments(
        int index, com.clarifai.grpc.api.TaskAssignment.Builder builderForValue) {
      if (taskAssignmentsBuilder_ == null) {
        ensureTaskAssignmentsIsMutable();
        taskAssignments_.set(index, builderForValue.build());
        onChanged();
      } else {
        taskAssignmentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.TaskAssignment task_assignments = 1;</code>
     */
    public Builder addTaskAssignments(com.clarifai.grpc.api.TaskAssignment value) {
      if (taskAssignmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTaskAssignmentsIsMutable();
        taskAssignments_.add(value);
        onChanged();
      } else {
        taskAssignmentsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.TaskAssignment task_assignments = 1;</code>
     */
    public Builder addTaskAssignments(
        int index, com.clarifai.grpc.api.TaskAssignment value) {
      if (taskAssignmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTaskAssignmentsIsMutable();
        taskAssignments_.add(index, value);
        onChanged();
      } else {
        taskAssignmentsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.TaskAssignment task_assignments = 1;</code>
     */
    public Builder addTaskAssignments(
        com.clarifai.grpc.api.TaskAssignment.Builder builderForValue) {
      if (taskAssignmentsBuilder_ == null) {
        ensureTaskAssignmentsIsMutable();
        taskAssignments_.add(builderForValue.build());
        onChanged();
      } else {
        taskAssignmentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.TaskAssignment task_assignments = 1;</code>
     */
    public Builder addTaskAssignments(
        int index, com.clarifai.grpc.api.TaskAssignment.Builder builderForValue) {
      if (taskAssignmentsBuilder_ == null) {
        ensureTaskAssignmentsIsMutable();
        taskAssignments_.add(index, builderForValue.build());
        onChanged();
      } else {
        taskAssignmentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.TaskAssignment task_assignments = 1;</code>
     */
    public Builder addAllTaskAssignments(
        java.lang.Iterable<? extends com.clarifai.grpc.api.TaskAssignment> values) {
      if (taskAssignmentsBuilder_ == null) {
        ensureTaskAssignmentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, taskAssignments_);
        onChanged();
      } else {
        taskAssignmentsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.TaskAssignment task_assignments = 1;</code>
     */
    public Builder clearTaskAssignments() {
      if (taskAssignmentsBuilder_ == null) {
        taskAssignments_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        taskAssignmentsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.TaskAssignment task_assignments = 1;</code>
     */
    public Builder removeTaskAssignments(int index) {
      if (taskAssignmentsBuilder_ == null) {
        ensureTaskAssignmentsIsMutable();
        taskAssignments_.remove(index);
        onChanged();
      } else {
        taskAssignmentsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.TaskAssignment task_assignments = 1;</code>
     */
    public com.clarifai.grpc.api.TaskAssignment.Builder getTaskAssignmentsBuilder(
        int index) {
      return getTaskAssignmentsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .clarifai.api.TaskAssignment task_assignments = 1;</code>
     */
    public com.clarifai.grpc.api.TaskAssignmentOrBuilder getTaskAssignmentsOrBuilder(
        int index) {
      if (taskAssignmentsBuilder_ == null) {
        return taskAssignments_.get(index);  } else {
        return taskAssignmentsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .clarifai.api.TaskAssignment task_assignments = 1;</code>
     */
    public java.util.List<? extends com.clarifai.grpc.api.TaskAssignmentOrBuilder> 
         getTaskAssignmentsOrBuilderList() {
      if (taskAssignmentsBuilder_ != null) {
        return taskAssignmentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(taskAssignments_);
      }
    }
    /**
     * <code>repeated .clarifai.api.TaskAssignment task_assignments = 1;</code>
     */
    public com.clarifai.grpc.api.TaskAssignment.Builder addTaskAssignmentsBuilder() {
      return getTaskAssignmentsFieldBuilder().addBuilder(
          com.clarifai.grpc.api.TaskAssignment.getDefaultInstance());
    }
    /**
     * <code>repeated .clarifai.api.TaskAssignment task_assignments = 1;</code>
     */
    public com.clarifai.grpc.api.TaskAssignment.Builder addTaskAssignmentsBuilder(
        int index) {
      return getTaskAssignmentsFieldBuilder().addBuilder(
          index, com.clarifai.grpc.api.TaskAssignment.getDefaultInstance());
    }
    /**
     * <code>repeated .clarifai.api.TaskAssignment task_assignments = 1;</code>
     */
    public java.util.List<com.clarifai.grpc.api.TaskAssignment.Builder> 
         getTaskAssignmentsBuilderList() {
      return getTaskAssignmentsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.TaskAssignment, com.clarifai.grpc.api.TaskAssignment.Builder, com.clarifai.grpc.api.TaskAssignmentOrBuilder> 
        getTaskAssignmentsFieldBuilder() {
      if (taskAssignmentsBuilder_ == null) {
        taskAssignmentsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.clarifai.grpc.api.TaskAssignment, com.clarifai.grpc.api.TaskAssignment.Builder, com.clarifai.grpc.api.TaskAssignmentOrBuilder>(
                taskAssignments_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        taskAssignments_ = null;
      }
      return taskAssignmentsBuilder_;
    }

    private java.util.List<com.clarifai.grpc.api.Worker> workers_ =
      java.util.Collections.emptyList();
    private void ensureWorkersIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        workers_ = new java.util.ArrayList<com.clarifai.grpc.api.Worker>(workers_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.Worker, com.clarifai.grpc.api.Worker.Builder, com.clarifai.grpc.api.WorkerOrBuilder> workersBuilder_;

    /**
     * <code>repeated .clarifai.api.Worker workers = 2;</code>
     */
    public java.util.List<com.clarifai.grpc.api.Worker> getWorkersList() {
      if (workersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(workers_);
      } else {
        return workersBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .clarifai.api.Worker workers = 2;</code>
     */
    public int getWorkersCount() {
      if (workersBuilder_ == null) {
        return workers_.size();
      } else {
        return workersBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .clarifai.api.Worker workers = 2;</code>
     */
    public com.clarifai.grpc.api.Worker getWorkers(int index) {
      if (workersBuilder_ == null) {
        return workers_.get(index);
      } else {
        return workersBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .clarifai.api.Worker workers = 2;</code>
     */
    public Builder setWorkers(
        int index, com.clarifai.grpc.api.Worker value) {
      if (workersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWorkersIsMutable();
        workers_.set(index, value);
        onChanged();
      } else {
        workersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.Worker workers = 2;</code>
     */
    public Builder setWorkers(
        int index, com.clarifai.grpc.api.Worker.Builder builderForValue) {
      if (workersBuilder_ == null) {
        ensureWorkersIsMutable();
        workers_.set(index, builderForValue.build());
        onChanged();
      } else {
        workersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.Worker workers = 2;</code>
     */
    public Builder addWorkers(com.clarifai.grpc.api.Worker value) {
      if (workersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWorkersIsMutable();
        workers_.add(value);
        onChanged();
      } else {
        workersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.Worker workers = 2;</code>
     */
    public Builder addWorkers(
        int index, com.clarifai.grpc.api.Worker value) {
      if (workersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWorkersIsMutable();
        workers_.add(index, value);
        onChanged();
      } else {
        workersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.Worker workers = 2;</code>
     */
    public Builder addWorkers(
        com.clarifai.grpc.api.Worker.Builder builderForValue) {
      if (workersBuilder_ == null) {
        ensureWorkersIsMutable();
        workers_.add(builderForValue.build());
        onChanged();
      } else {
        workersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.Worker workers = 2;</code>
     */
    public Builder addWorkers(
        int index, com.clarifai.grpc.api.Worker.Builder builderForValue) {
      if (workersBuilder_ == null) {
        ensureWorkersIsMutable();
        workers_.add(index, builderForValue.build());
        onChanged();
      } else {
        workersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.Worker workers = 2;</code>
     */
    public Builder addAllWorkers(
        java.lang.Iterable<? extends com.clarifai.grpc.api.Worker> values) {
      if (workersBuilder_ == null) {
        ensureWorkersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, workers_);
        onChanged();
      } else {
        workersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.Worker workers = 2;</code>
     */
    public Builder clearWorkers() {
      if (workersBuilder_ == null) {
        workers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        workersBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.Worker workers = 2;</code>
     */
    public Builder removeWorkers(int index) {
      if (workersBuilder_ == null) {
        ensureWorkersIsMutable();
        workers_.remove(index);
        onChanged();
      } else {
        workersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .clarifai.api.Worker workers = 2;</code>
     */
    public com.clarifai.grpc.api.Worker.Builder getWorkersBuilder(
        int index) {
      return getWorkersFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .clarifai.api.Worker workers = 2;</code>
     */
    public com.clarifai.grpc.api.WorkerOrBuilder getWorkersOrBuilder(
        int index) {
      if (workersBuilder_ == null) {
        return workers_.get(index);  } else {
        return workersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .clarifai.api.Worker workers = 2;</code>
     */
    public java.util.List<? extends com.clarifai.grpc.api.WorkerOrBuilder> 
         getWorkersOrBuilderList() {
      if (workersBuilder_ != null) {
        return workersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(workers_);
      }
    }
    /**
     * <code>repeated .clarifai.api.Worker workers = 2;</code>
     */
    public com.clarifai.grpc.api.Worker.Builder addWorkersBuilder() {
      return getWorkersFieldBuilder().addBuilder(
          com.clarifai.grpc.api.Worker.getDefaultInstance());
    }
    /**
     * <code>repeated .clarifai.api.Worker workers = 2;</code>
     */
    public com.clarifai.grpc.api.Worker.Builder addWorkersBuilder(
        int index) {
      return getWorkersFieldBuilder().addBuilder(
          index, com.clarifai.grpc.api.Worker.getDefaultInstance());
    }
    /**
     * <code>repeated .clarifai.api.Worker workers = 2;</code>
     */
    public java.util.List<com.clarifai.grpc.api.Worker.Builder> 
         getWorkersBuilderList() {
      return getWorkersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.Worker, com.clarifai.grpc.api.Worker.Builder, com.clarifai.grpc.api.WorkerOrBuilder> 
        getWorkersFieldBuilder() {
      if (workersBuilder_ == null) {
        workersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.clarifai.grpc.api.Worker, com.clarifai.grpc.api.Worker.Builder, com.clarifai.grpc.api.WorkerOrBuilder>(
                workers_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        workers_ = null;
      }
      return workersBuilder_;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.ReviewApproveConfig)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.ReviewApproveConfig)
  private static final com.clarifai.grpc.api.ReviewApproveConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.ReviewApproveConfig();
  }

  public static com.clarifai.grpc.api.ReviewApproveConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReviewApproveConfig>
      PARSER = new com.google.protobuf.AbstractParser<ReviewApproveConfig>() {
    @java.lang.Override
    public ReviewApproveConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReviewApproveConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReviewApproveConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReviewApproveConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.ReviewApproveConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

