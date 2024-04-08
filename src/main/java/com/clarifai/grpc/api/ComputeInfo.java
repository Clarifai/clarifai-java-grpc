// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * <pre>
 * These are the resource needs of a given API object such as a model.
 * This is what they require as a minimum to run and will be used upon scheduling
 * as the request and limit for the k8s pod. If we want to separate limits and requests in the
 * future we can allow setting a limits ComputeInfo and a requests ComputeInfo.
 * </pre>
 *
 * Protobuf type {@code clarifai.api.ComputeInfo}
 */
public final class ComputeInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.ComputeInfo)
    ComputeInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ComputeInfo.newBuilder() to construct.
  private ComputeInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ComputeInfo() {
    cpuMemory_ = "";
    acceleratorMemory_ = "";
    acceleratorType_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ComputeInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ComputeInfo(
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
          case 8: {

            numCpus_ = input.readUInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            cpuMemory_ = s;
            break;
          }
          case 24: {

            numAccelerators_ = input.readUInt32();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            acceleratorMemory_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              acceleratorType_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            acceleratorType_.add(s);
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
        acceleratorType_ = acceleratorType_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_ComputeInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_ComputeInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.ComputeInfo.class, com.clarifai.grpc.api.ComputeInfo.Builder.class);
  }

  public static final int NUM_CPUS_FIELD_NUMBER = 1;
  private int numCpus_;
  /**
   * <pre>
   * Number of CPUs.
   * </pre>
   *
   * <code>uint32 num_cpus = 1;</code>
   * @return The numCpus.
   */
  @java.lang.Override
  public int getNumCpus() {
    return numCpus_;
  }

  public static final int CPU_MEMORY_FIELD_NUMBER = 2;
  private volatile java.lang.Object cpuMemory_;
  /**
   * <pre>
   * Amount of CPU memory to use as a minimum.
   * </pre>
   *
   * <code>string cpu_memory = 2;</code>
   * @return The cpuMemory.
   */
  @java.lang.Override
  public java.lang.String getCpuMemory() {
    java.lang.Object ref = cpuMemory_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cpuMemory_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Amount of CPU memory to use as a minimum.
   * </pre>
   *
   * <code>string cpu_memory = 2;</code>
   * @return The bytes for cpuMemory.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCpuMemoryBytes() {
    java.lang.Object ref = cpuMemory_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cpuMemory_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NUM_ACCELERATORS_FIELD_NUMBER = 3;
  private int numAccelerators_;
  /**
   * <pre>
   * Number of accelerators (typically GPUs, TPUs, etc. not CPUs) for this resource.
   * </pre>
   *
   * <code>uint32 num_accelerators = 3;</code>
   * @return The numAccelerators.
   */
  @java.lang.Override
  public int getNumAccelerators() {
    return numAccelerators_;
  }

  public static final int ACCELERATOR_MEMORY_FIELD_NUMBER = 4;
  private volatile java.lang.Object acceleratorMemory_;
  /**
   * <pre>
   * Amount of accelerator/GPU memory to use as a minimum.
   * This is defined per accelerator.
   * This follows the format used by kubernetes like 1Ki, 2Mi, 3Gi, 4Ti.
   * </pre>
   *
   * <code>string accelerator_memory = 4;</code>
   * @return The acceleratorMemory.
   */
  @java.lang.Override
  public java.lang.String getAcceleratorMemory() {
    java.lang.Object ref = acceleratorMemory_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      acceleratorMemory_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Amount of accelerator/GPU memory to use as a minimum.
   * This is defined per accelerator.
   * This follows the format used by kubernetes like 1Ki, 2Mi, 3Gi, 4Ti.
   * </pre>
   *
   * <code>string accelerator_memory = 4;</code>
   * @return The bytes for acceleratorMemory.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAcceleratorMemoryBytes() {
    java.lang.Object ref = acceleratorMemory_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      acceleratorMemory_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACCELERATOR_TYPE_FIELD_NUMBER = 5;
  private com.google.protobuf.LazyStringList acceleratorType_;
  /**
   * <pre>
   * Or should it be removed completely and use the nodepool accelerator type itself.
   * These are the supported accelerators that the model can run on.
   * </pre>
   *
   * <code>repeated string accelerator_type = 5;</code>
   * @return A list containing the acceleratorType.
   */
  public com.google.protobuf.ProtocolStringList
      getAcceleratorTypeList() {
    return acceleratorType_;
  }
  /**
   * <pre>
   * Or should it be removed completely and use the nodepool accelerator type itself.
   * These are the supported accelerators that the model can run on.
   * </pre>
   *
   * <code>repeated string accelerator_type = 5;</code>
   * @return The count of acceleratorType.
   */
  public int getAcceleratorTypeCount() {
    return acceleratorType_.size();
  }
  /**
   * <pre>
   * Or should it be removed completely and use the nodepool accelerator type itself.
   * These are the supported accelerators that the model can run on.
   * </pre>
   *
   * <code>repeated string accelerator_type = 5;</code>
   * @param index The index of the element to return.
   * @return The acceleratorType at the given index.
   */
  public java.lang.String getAcceleratorType(int index) {
    return acceleratorType_.get(index);
  }
  /**
   * <pre>
   * Or should it be removed completely and use the nodepool accelerator type itself.
   * These are the supported accelerators that the model can run on.
   * </pre>
   *
   * <code>repeated string accelerator_type = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the acceleratorType at the given index.
   */
  public com.google.protobuf.ByteString
      getAcceleratorTypeBytes(int index) {
    return acceleratorType_.getByteString(index);
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
    if (numCpus_ != 0) {
      output.writeUInt32(1, numCpus_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cpuMemory_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, cpuMemory_);
    }
    if (numAccelerators_ != 0) {
      output.writeUInt32(3, numAccelerators_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(acceleratorMemory_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, acceleratorMemory_);
    }
    for (int i = 0; i < acceleratorType_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, acceleratorType_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (numCpus_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, numCpus_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cpuMemory_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, cpuMemory_);
    }
    if (numAccelerators_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, numAccelerators_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(acceleratorMemory_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, acceleratorMemory_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < acceleratorType_.size(); i++) {
        dataSize += computeStringSizeNoTag(acceleratorType_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAcceleratorTypeList().size();
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
    if (!(obj instanceof com.clarifai.grpc.api.ComputeInfo)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.ComputeInfo other = (com.clarifai.grpc.api.ComputeInfo) obj;

    if (getNumCpus()
        != other.getNumCpus()) return false;
    if (!getCpuMemory()
        .equals(other.getCpuMemory())) return false;
    if (getNumAccelerators()
        != other.getNumAccelerators()) return false;
    if (!getAcceleratorMemory()
        .equals(other.getAcceleratorMemory())) return false;
    if (!getAcceleratorTypeList()
        .equals(other.getAcceleratorTypeList())) return false;
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
    hash = (37 * hash) + NUM_CPUS_FIELD_NUMBER;
    hash = (53 * hash) + getNumCpus();
    hash = (37 * hash) + CPU_MEMORY_FIELD_NUMBER;
    hash = (53 * hash) + getCpuMemory().hashCode();
    hash = (37 * hash) + NUM_ACCELERATORS_FIELD_NUMBER;
    hash = (53 * hash) + getNumAccelerators();
    hash = (37 * hash) + ACCELERATOR_MEMORY_FIELD_NUMBER;
    hash = (53 * hash) + getAcceleratorMemory().hashCode();
    if (getAcceleratorTypeCount() > 0) {
      hash = (37 * hash) + ACCELERATOR_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getAcceleratorTypeList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.ComputeInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.ComputeInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.ComputeInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.ComputeInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.ComputeInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.ComputeInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.ComputeInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.ComputeInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.ComputeInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.ComputeInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.ComputeInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.ComputeInfo parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.ComputeInfo prototype) {
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
   * These are the resource needs of a given API object such as a model.
   * This is what they require as a minimum to run and will be used upon scheduling
   * as the request and limit for the k8s pod. If we want to separate limits and requests in the
   * future we can allow setting a limits ComputeInfo and a requests ComputeInfo.
   * </pre>
   *
   * Protobuf type {@code clarifai.api.ComputeInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.ComputeInfo)
      com.clarifai.grpc.api.ComputeInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_ComputeInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_ComputeInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.ComputeInfo.class, com.clarifai.grpc.api.ComputeInfo.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.ComputeInfo.newBuilder()
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
      numCpus_ = 0;

      cpuMemory_ = "";

      numAccelerators_ = 0;

      acceleratorMemory_ = "";

      acceleratorType_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_ComputeInfo_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.ComputeInfo getDefaultInstanceForType() {
      return com.clarifai.grpc.api.ComputeInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.ComputeInfo build() {
      com.clarifai.grpc.api.ComputeInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.ComputeInfo buildPartial() {
      com.clarifai.grpc.api.ComputeInfo result = new com.clarifai.grpc.api.ComputeInfo(this);
      int from_bitField0_ = bitField0_;
      result.numCpus_ = numCpus_;
      result.cpuMemory_ = cpuMemory_;
      result.numAccelerators_ = numAccelerators_;
      result.acceleratorMemory_ = acceleratorMemory_;
      if (((bitField0_ & 0x00000001) != 0)) {
        acceleratorType_ = acceleratorType_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.acceleratorType_ = acceleratorType_;
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
      if (other instanceof com.clarifai.grpc.api.ComputeInfo) {
        return mergeFrom((com.clarifai.grpc.api.ComputeInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.ComputeInfo other) {
      if (other == com.clarifai.grpc.api.ComputeInfo.getDefaultInstance()) return this;
      if (other.getNumCpus() != 0) {
        setNumCpus(other.getNumCpus());
      }
      if (!other.getCpuMemory().isEmpty()) {
        cpuMemory_ = other.cpuMemory_;
        onChanged();
      }
      if (other.getNumAccelerators() != 0) {
        setNumAccelerators(other.getNumAccelerators());
      }
      if (!other.getAcceleratorMemory().isEmpty()) {
        acceleratorMemory_ = other.acceleratorMemory_;
        onChanged();
      }
      if (!other.acceleratorType_.isEmpty()) {
        if (acceleratorType_.isEmpty()) {
          acceleratorType_ = other.acceleratorType_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAcceleratorTypeIsMutable();
          acceleratorType_.addAll(other.acceleratorType_);
        }
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
      com.clarifai.grpc.api.ComputeInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.ComputeInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int numCpus_ ;
    /**
     * <pre>
     * Number of CPUs.
     * </pre>
     *
     * <code>uint32 num_cpus = 1;</code>
     * @return The numCpus.
     */
    @java.lang.Override
    public int getNumCpus() {
      return numCpus_;
    }
    /**
     * <pre>
     * Number of CPUs.
     * </pre>
     *
     * <code>uint32 num_cpus = 1;</code>
     * @param value The numCpus to set.
     * @return This builder for chaining.
     */
    public Builder setNumCpus(int value) {
      
      numCpus_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of CPUs.
     * </pre>
     *
     * <code>uint32 num_cpus = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumCpus() {
      
      numCpus_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object cpuMemory_ = "";
    /**
     * <pre>
     * Amount of CPU memory to use as a minimum.
     * </pre>
     *
     * <code>string cpu_memory = 2;</code>
     * @return The cpuMemory.
     */
    public java.lang.String getCpuMemory() {
      java.lang.Object ref = cpuMemory_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cpuMemory_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Amount of CPU memory to use as a minimum.
     * </pre>
     *
     * <code>string cpu_memory = 2;</code>
     * @return The bytes for cpuMemory.
     */
    public com.google.protobuf.ByteString
        getCpuMemoryBytes() {
      java.lang.Object ref = cpuMemory_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cpuMemory_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Amount of CPU memory to use as a minimum.
     * </pre>
     *
     * <code>string cpu_memory = 2;</code>
     * @param value The cpuMemory to set.
     * @return This builder for chaining.
     */
    public Builder setCpuMemory(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      cpuMemory_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Amount of CPU memory to use as a minimum.
     * </pre>
     *
     * <code>string cpu_memory = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCpuMemory() {
      
      cpuMemory_ = getDefaultInstance().getCpuMemory();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Amount of CPU memory to use as a minimum.
     * </pre>
     *
     * <code>string cpu_memory = 2;</code>
     * @param value The bytes for cpuMemory to set.
     * @return This builder for chaining.
     */
    public Builder setCpuMemoryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      cpuMemory_ = value;
      onChanged();
      return this;
    }

    private int numAccelerators_ ;
    /**
     * <pre>
     * Number of accelerators (typically GPUs, TPUs, etc. not CPUs) for this resource.
     * </pre>
     *
     * <code>uint32 num_accelerators = 3;</code>
     * @return The numAccelerators.
     */
    @java.lang.Override
    public int getNumAccelerators() {
      return numAccelerators_;
    }
    /**
     * <pre>
     * Number of accelerators (typically GPUs, TPUs, etc. not CPUs) for this resource.
     * </pre>
     *
     * <code>uint32 num_accelerators = 3;</code>
     * @param value The numAccelerators to set.
     * @return This builder for chaining.
     */
    public Builder setNumAccelerators(int value) {
      
      numAccelerators_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of accelerators (typically GPUs, TPUs, etc. not CPUs) for this resource.
     * </pre>
     *
     * <code>uint32 num_accelerators = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumAccelerators() {
      
      numAccelerators_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object acceleratorMemory_ = "";
    /**
     * <pre>
     * Amount of accelerator/GPU memory to use as a minimum.
     * This is defined per accelerator.
     * This follows the format used by kubernetes like 1Ki, 2Mi, 3Gi, 4Ti.
     * </pre>
     *
     * <code>string accelerator_memory = 4;</code>
     * @return The acceleratorMemory.
     */
    public java.lang.String getAcceleratorMemory() {
      java.lang.Object ref = acceleratorMemory_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        acceleratorMemory_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Amount of accelerator/GPU memory to use as a minimum.
     * This is defined per accelerator.
     * This follows the format used by kubernetes like 1Ki, 2Mi, 3Gi, 4Ti.
     * </pre>
     *
     * <code>string accelerator_memory = 4;</code>
     * @return The bytes for acceleratorMemory.
     */
    public com.google.protobuf.ByteString
        getAcceleratorMemoryBytes() {
      java.lang.Object ref = acceleratorMemory_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        acceleratorMemory_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Amount of accelerator/GPU memory to use as a minimum.
     * This is defined per accelerator.
     * This follows the format used by kubernetes like 1Ki, 2Mi, 3Gi, 4Ti.
     * </pre>
     *
     * <code>string accelerator_memory = 4;</code>
     * @param value The acceleratorMemory to set.
     * @return This builder for chaining.
     */
    public Builder setAcceleratorMemory(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      acceleratorMemory_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Amount of accelerator/GPU memory to use as a minimum.
     * This is defined per accelerator.
     * This follows the format used by kubernetes like 1Ki, 2Mi, 3Gi, 4Ti.
     * </pre>
     *
     * <code>string accelerator_memory = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearAcceleratorMemory() {
      
      acceleratorMemory_ = getDefaultInstance().getAcceleratorMemory();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Amount of accelerator/GPU memory to use as a minimum.
     * This is defined per accelerator.
     * This follows the format used by kubernetes like 1Ki, 2Mi, 3Gi, 4Ti.
     * </pre>
     *
     * <code>string accelerator_memory = 4;</code>
     * @param value The bytes for acceleratorMemory to set.
     * @return This builder for chaining.
     */
    public Builder setAcceleratorMemoryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      acceleratorMemory_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList acceleratorType_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureAcceleratorTypeIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        acceleratorType_ = new com.google.protobuf.LazyStringArrayList(acceleratorType_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * Or should it be removed completely and use the nodepool accelerator type itself.
     * These are the supported accelerators that the model can run on.
     * </pre>
     *
     * <code>repeated string accelerator_type = 5;</code>
     * @return A list containing the acceleratorType.
     */
    public com.google.protobuf.ProtocolStringList
        getAcceleratorTypeList() {
      return acceleratorType_.getUnmodifiableView();
    }
    /**
     * <pre>
     * Or should it be removed completely and use the nodepool accelerator type itself.
     * These are the supported accelerators that the model can run on.
     * </pre>
     *
     * <code>repeated string accelerator_type = 5;</code>
     * @return The count of acceleratorType.
     */
    public int getAcceleratorTypeCount() {
      return acceleratorType_.size();
    }
    /**
     * <pre>
     * Or should it be removed completely and use the nodepool accelerator type itself.
     * These are the supported accelerators that the model can run on.
     * </pre>
     *
     * <code>repeated string accelerator_type = 5;</code>
     * @param index The index of the element to return.
     * @return The acceleratorType at the given index.
     */
    public java.lang.String getAcceleratorType(int index) {
      return acceleratorType_.get(index);
    }
    /**
     * <pre>
     * Or should it be removed completely and use the nodepool accelerator type itself.
     * These are the supported accelerators that the model can run on.
     * </pre>
     *
     * <code>repeated string accelerator_type = 5;</code>
     * @param index The index of the value to return.
     * @return The bytes of the acceleratorType at the given index.
     */
    public com.google.protobuf.ByteString
        getAcceleratorTypeBytes(int index) {
      return acceleratorType_.getByteString(index);
    }
    /**
     * <pre>
     * Or should it be removed completely and use the nodepool accelerator type itself.
     * These are the supported accelerators that the model can run on.
     * </pre>
     *
     * <code>repeated string accelerator_type = 5;</code>
     * @param index The index to set the value at.
     * @param value The acceleratorType to set.
     * @return This builder for chaining.
     */
    public Builder setAcceleratorType(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAcceleratorTypeIsMutable();
      acceleratorType_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Or should it be removed completely and use the nodepool accelerator type itself.
     * These are the supported accelerators that the model can run on.
     * </pre>
     *
     * <code>repeated string accelerator_type = 5;</code>
     * @param value The acceleratorType to add.
     * @return This builder for chaining.
     */
    public Builder addAcceleratorType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAcceleratorTypeIsMutable();
      acceleratorType_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Or should it be removed completely and use the nodepool accelerator type itself.
     * These are the supported accelerators that the model can run on.
     * </pre>
     *
     * <code>repeated string accelerator_type = 5;</code>
     * @param values The acceleratorType to add.
     * @return This builder for chaining.
     */
    public Builder addAllAcceleratorType(
        java.lang.Iterable<java.lang.String> values) {
      ensureAcceleratorTypeIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, acceleratorType_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Or should it be removed completely and use the nodepool accelerator type itself.
     * These are the supported accelerators that the model can run on.
     * </pre>
     *
     * <code>repeated string accelerator_type = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearAcceleratorType() {
      acceleratorType_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Or should it be removed completely and use the nodepool accelerator type itself.
     * These are the supported accelerators that the model can run on.
     * </pre>
     *
     * <code>repeated string accelerator_type = 5;</code>
     * @param value The bytes of the acceleratorType to add.
     * @return This builder for chaining.
     */
    public Builder addAcceleratorTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureAcceleratorTypeIsMutable();
      acceleratorType_.add(value);
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.ComputeInfo)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.ComputeInfo)
  private static final com.clarifai.grpc.api.ComputeInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.ComputeInfo();
  }

  public static com.clarifai.grpc.api.ComputeInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ComputeInfo>
      PARSER = new com.google.protobuf.AbstractParser<ComputeInfo>() {
    @java.lang.Override
    public ComputeInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ComputeInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ComputeInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ComputeInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.ComputeInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

