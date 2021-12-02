// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * <pre>
 * ScopeDeps
 * </pre>
 *
 * Protobuf type {@code clarifai.api.ScopeDeps}
 */
public  final class ScopeDeps extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.ScopeDeps)
    ScopeDepsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ScopeDeps.newBuilder() to construct.
  private ScopeDeps(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ScopeDeps() {
    scope_ = "";
    dependingScopes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ScopeDeps();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ScopeDeps(
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

            scope_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              dependingScopes_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            dependingScopes_.add(s);
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
        dependingScopes_ = dependingScopes_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_ScopeDeps_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_ScopeDeps_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.ScopeDeps.class, com.clarifai.grpc.api.ScopeDeps.Builder.class);
  }

  public static final int SCOPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object scope_;
  /**
   * <pre>
   * The scope
   * </pre>
   *
   * <code>string scope = 1;</code>
   * @return The scope.
   */
  public java.lang.String getScope() {
    java.lang.Object ref = scope_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      scope_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The scope
   * </pre>
   *
   * <code>string scope = 1;</code>
   * @return The bytes for scope.
   */
  public com.google.protobuf.ByteString
      getScopeBytes() {
    java.lang.Object ref = scope_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      scope_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEPENDING_SCOPES_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList dependingScopes_;
  /**
   * <pre>
   * Other scopes that are required.
   * </pre>
   *
   * <code>repeated string depending_scopes = 2;</code>
   * @return A list containing the dependingScopes.
   */
  public com.google.protobuf.ProtocolStringList
      getDependingScopesList() {
    return dependingScopes_;
  }
  /**
   * <pre>
   * Other scopes that are required.
   * </pre>
   *
   * <code>repeated string depending_scopes = 2;</code>
   * @return The count of dependingScopes.
   */
  public int getDependingScopesCount() {
    return dependingScopes_.size();
  }
  /**
   * <pre>
   * Other scopes that are required.
   * </pre>
   *
   * <code>repeated string depending_scopes = 2;</code>
   * @param index The index of the element to return.
   * @return The dependingScopes at the given index.
   */
  public java.lang.String getDependingScopes(int index) {
    return dependingScopes_.get(index);
  }
  /**
   * <pre>
   * Other scopes that are required.
   * </pre>
   *
   * <code>repeated string depending_scopes = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the dependingScopes at the given index.
   */
  public com.google.protobuf.ByteString
      getDependingScopesBytes(int index) {
    return dependingScopes_.getByteString(index);
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
    if (!getScopeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, scope_);
    }
    for (int i = 0; i < dependingScopes_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dependingScopes_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getScopeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, scope_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < dependingScopes_.size(); i++) {
        dataSize += computeStringSizeNoTag(dependingScopes_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getDependingScopesList().size();
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
    if (!(obj instanceof com.clarifai.grpc.api.ScopeDeps)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.ScopeDeps other = (com.clarifai.grpc.api.ScopeDeps) obj;

    if (!getScope()
        .equals(other.getScope())) return false;
    if (!getDependingScopesList()
        .equals(other.getDependingScopesList())) return false;
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
    hash = (37 * hash) + SCOPE_FIELD_NUMBER;
    hash = (53 * hash) + getScope().hashCode();
    if (getDependingScopesCount() > 0) {
      hash = (37 * hash) + DEPENDING_SCOPES_FIELD_NUMBER;
      hash = (53 * hash) + getDependingScopesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.ScopeDeps parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.ScopeDeps parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.ScopeDeps parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.ScopeDeps parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.ScopeDeps parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.ScopeDeps parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.ScopeDeps parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.ScopeDeps parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.ScopeDeps parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.ScopeDeps parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.ScopeDeps parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.ScopeDeps parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.ScopeDeps prototype) {
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
   * ScopeDeps
   * </pre>
   *
   * Protobuf type {@code clarifai.api.ScopeDeps}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.ScopeDeps)
      com.clarifai.grpc.api.ScopeDepsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_ScopeDeps_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_ScopeDeps_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.ScopeDeps.class, com.clarifai.grpc.api.ScopeDeps.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.ScopeDeps.newBuilder()
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
      scope_ = "";

      dependingScopes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_ScopeDeps_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.ScopeDeps getDefaultInstanceForType() {
      return com.clarifai.grpc.api.ScopeDeps.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.ScopeDeps build() {
      com.clarifai.grpc.api.ScopeDeps result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.ScopeDeps buildPartial() {
      com.clarifai.grpc.api.ScopeDeps result = new com.clarifai.grpc.api.ScopeDeps(this);
      int from_bitField0_ = bitField0_;
      result.scope_ = scope_;
      if (((bitField0_ & 0x00000001) != 0)) {
        dependingScopes_ = dependingScopes_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.dependingScopes_ = dependingScopes_;
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
      if (other instanceof com.clarifai.grpc.api.ScopeDeps) {
        return mergeFrom((com.clarifai.grpc.api.ScopeDeps)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.ScopeDeps other) {
      if (other == com.clarifai.grpc.api.ScopeDeps.getDefaultInstance()) return this;
      if (!other.getScope().isEmpty()) {
        scope_ = other.scope_;
        onChanged();
      }
      if (!other.dependingScopes_.isEmpty()) {
        if (dependingScopes_.isEmpty()) {
          dependingScopes_ = other.dependingScopes_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureDependingScopesIsMutable();
          dependingScopes_.addAll(other.dependingScopes_);
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
      com.clarifai.grpc.api.ScopeDeps parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.ScopeDeps) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object scope_ = "";
    /**
     * <pre>
     * The scope
     * </pre>
     *
     * <code>string scope = 1;</code>
     * @return The scope.
     */
    public java.lang.String getScope() {
      java.lang.Object ref = scope_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        scope_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The scope
     * </pre>
     *
     * <code>string scope = 1;</code>
     * @return The bytes for scope.
     */
    public com.google.protobuf.ByteString
        getScopeBytes() {
      java.lang.Object ref = scope_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        scope_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The scope
     * </pre>
     *
     * <code>string scope = 1;</code>
     * @param value The scope to set.
     * @return This builder for chaining.
     */
    public Builder setScope(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      scope_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The scope
     * </pre>
     *
     * <code>string scope = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearScope() {
      
      scope_ = getDefaultInstance().getScope();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The scope
     * </pre>
     *
     * <code>string scope = 1;</code>
     * @param value The bytes for scope to set.
     * @return This builder for chaining.
     */
    public Builder setScopeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      scope_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList dependingScopes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureDependingScopesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        dependingScopes_ = new com.google.protobuf.LazyStringArrayList(dependingScopes_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * Other scopes that are required.
     * </pre>
     *
     * <code>repeated string depending_scopes = 2;</code>
     * @return A list containing the dependingScopes.
     */
    public com.google.protobuf.ProtocolStringList
        getDependingScopesList() {
      return dependingScopes_.getUnmodifiableView();
    }
    /**
     * <pre>
     * Other scopes that are required.
     * </pre>
     *
     * <code>repeated string depending_scopes = 2;</code>
     * @return The count of dependingScopes.
     */
    public int getDependingScopesCount() {
      return dependingScopes_.size();
    }
    /**
     * <pre>
     * Other scopes that are required.
     * </pre>
     *
     * <code>repeated string depending_scopes = 2;</code>
     * @param index The index of the element to return.
     * @return The dependingScopes at the given index.
     */
    public java.lang.String getDependingScopes(int index) {
      return dependingScopes_.get(index);
    }
    /**
     * <pre>
     * Other scopes that are required.
     * </pre>
     *
     * <code>repeated string depending_scopes = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the dependingScopes at the given index.
     */
    public com.google.protobuf.ByteString
        getDependingScopesBytes(int index) {
      return dependingScopes_.getByteString(index);
    }
    /**
     * <pre>
     * Other scopes that are required.
     * </pre>
     *
     * <code>repeated string depending_scopes = 2;</code>
     * @param index The index to set the value at.
     * @param value The dependingScopes to set.
     * @return This builder for chaining.
     */
    public Builder setDependingScopes(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureDependingScopesIsMutable();
      dependingScopes_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Other scopes that are required.
     * </pre>
     *
     * <code>repeated string depending_scopes = 2;</code>
     * @param value The dependingScopes to add.
     * @return This builder for chaining.
     */
    public Builder addDependingScopes(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureDependingScopesIsMutable();
      dependingScopes_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Other scopes that are required.
     * </pre>
     *
     * <code>repeated string depending_scopes = 2;</code>
     * @param values The dependingScopes to add.
     * @return This builder for chaining.
     */
    public Builder addAllDependingScopes(
        java.lang.Iterable<java.lang.String> values) {
      ensureDependingScopesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, dependingScopes_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Other scopes that are required.
     * </pre>
     *
     * <code>repeated string depending_scopes = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDependingScopes() {
      dependingScopes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Other scopes that are required.
     * </pre>
     *
     * <code>repeated string depending_scopes = 2;</code>
     * @param value The bytes of the dependingScopes to add.
     * @return This builder for chaining.
     */
    public Builder addDependingScopesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureDependingScopesIsMutable();
      dependingScopes_.add(value);
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.ScopeDeps)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.ScopeDeps)
  private static final com.clarifai.grpc.api.ScopeDeps DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.ScopeDeps();
  }

  public static com.clarifai.grpc.api.ScopeDeps getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ScopeDeps>
      PARSER = new com.google.protobuf.AbstractParser<ScopeDeps>() {
    @java.lang.Override
    public ScopeDeps parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ScopeDeps(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ScopeDeps> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ScopeDeps> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.ScopeDeps getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

