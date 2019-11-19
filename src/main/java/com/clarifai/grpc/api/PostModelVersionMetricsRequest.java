// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

/**
 * <pre>
 * Evaluate this model version.
 * </pre>
 *
 * Protobuf type {@code clarifai.api.PostModelVersionMetricsRequest}
 */
public  final class PostModelVersionMetricsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.PostModelVersionMetricsRequest)
    PostModelVersionMetricsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PostModelVersionMetricsRequest.newBuilder() to construct.
  private PostModelVersionMetricsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PostModelVersionMetricsRequest() {
    modelId_ = "";
    versionId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PostModelVersionMetricsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PostModelVersionMetricsRequest(
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

            modelId_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            versionId_ = s;
            break;
          }
          case 32: {

            maxExamples_ = input.readUInt32();
            break;
          }
          case 42: {
            com.clarifai.grpc.api.Search.Builder subBuilder = null;
            if (search_ != null) {
              subBuilder = search_.toBuilder();
            }
            search_ = input.readMessage(com.clarifai.grpc.api.Search.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(search_);
              search_ = subBuilder.buildPartial();
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
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostModelVersionMetricsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostModelVersionMetricsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.PostModelVersionMetricsRequest.class, com.clarifai.grpc.api.PostModelVersionMetricsRequest.Builder.class);
  }

  public static final int USER_APP_ID_FIELD_NUMBER = 1;
  private com.clarifai.grpc.api.UserAppIDSet userAppId_;
  /**
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   */
  public boolean hasUserAppId() {
    return userAppId_ != null;
  }
  /**
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
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

  public static final int MODEL_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object modelId_;
  /**
   * <code>string model_id = 2;</code>
   */
  public java.lang.String getModelId() {
    java.lang.Object ref = modelId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      modelId_ = s;
      return s;
    }
  }
  /**
   * <code>string model_id = 2;</code>
   */
  public com.google.protobuf.ByteString
      getModelIdBytes() {
    java.lang.Object ref = modelId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      modelId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VERSION_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object versionId_;
  /**
   * <code>string version_id = 3;</code>
   */
  public java.lang.String getVersionId() {
    java.lang.Object ref = versionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      versionId_ = s;
      return s;
    }
  }
  /**
   * <code>string version_id = 3;</code>
   */
  public com.google.protobuf.ByteString
      getVersionIdBytes() {
    java.lang.Object ref = versionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      versionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MAX_EXAMPLES_FIELD_NUMBER = 4;
  private int maxExamples_;
  /**
   * <code>uint32 max_examples = 4;</code>
   */
  public int getMaxExamples() {
    return maxExamples_;
  }

  public static final int SEARCH_FIELD_NUMBER = 5;
  private com.clarifai.grpc.api.Search search_;
  /**
   * <pre>
   * Use this to filter inputs that are used in evaluation
   * </pre>
   *
   * <code>.clarifai.api.Search search = 5;</code>
   */
  public boolean hasSearch() {
    return search_ != null;
  }
  /**
   * <pre>
   * Use this to filter inputs that are used in evaluation
   * </pre>
   *
   * <code>.clarifai.api.Search search = 5;</code>
   */
  public com.clarifai.grpc.api.Search getSearch() {
    return search_ == null ? com.clarifai.grpc.api.Search.getDefaultInstance() : search_;
  }
  /**
   * <pre>
   * Use this to filter inputs that are used in evaluation
   * </pre>
   *
   * <code>.clarifai.api.Search search = 5;</code>
   */
  public com.clarifai.grpc.api.SearchOrBuilder getSearchOrBuilder() {
    return getSearch();
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
    if (!getModelIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, modelId_);
    }
    if (!getVersionIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, versionId_);
    }
    if (maxExamples_ != 0) {
      output.writeUInt32(4, maxExamples_);
    }
    if (search_ != null) {
      output.writeMessage(5, getSearch());
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
    if (!getModelIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, modelId_);
    }
    if (!getVersionIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, versionId_);
    }
    if (maxExamples_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, maxExamples_);
    }
    if (search_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getSearch());
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
    if (!(obj instanceof com.clarifai.grpc.api.PostModelVersionMetricsRequest)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.PostModelVersionMetricsRequest other = (com.clarifai.grpc.api.PostModelVersionMetricsRequest) obj;

    if (hasUserAppId() != other.hasUserAppId()) return false;
    if (hasUserAppId()) {
      if (!getUserAppId()
          .equals(other.getUserAppId())) return false;
    }
    if (!getModelId()
        .equals(other.getModelId())) return false;
    if (!getVersionId()
        .equals(other.getVersionId())) return false;
    if (getMaxExamples()
        != other.getMaxExamples()) return false;
    if (hasSearch() != other.hasSearch()) return false;
    if (hasSearch()) {
      if (!getSearch()
          .equals(other.getSearch())) return false;
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
    if (hasUserAppId()) {
      hash = (37 * hash) + USER_APP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getUserAppId().hashCode();
    }
    hash = (37 * hash) + MODEL_ID_FIELD_NUMBER;
    hash = (53 * hash) + getModelId().hashCode();
    hash = (37 * hash) + VERSION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getVersionId().hashCode();
    hash = (37 * hash) + MAX_EXAMPLES_FIELD_NUMBER;
    hash = (53 * hash) + getMaxExamples();
    if (hasSearch()) {
      hash = (37 * hash) + SEARCH_FIELD_NUMBER;
      hash = (53 * hash) + getSearch().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.PostModelVersionMetricsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.PostModelVersionMetricsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostModelVersionMetricsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.PostModelVersionMetricsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostModelVersionMetricsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.PostModelVersionMetricsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostModelVersionMetricsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.PostModelVersionMetricsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostModelVersionMetricsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.PostModelVersionMetricsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostModelVersionMetricsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.PostModelVersionMetricsRequest parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.PostModelVersionMetricsRequest prototype) {
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
   * Evaluate this model version.
   * </pre>
   *
   * Protobuf type {@code clarifai.api.PostModelVersionMetricsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.PostModelVersionMetricsRequest)
      com.clarifai.grpc.api.PostModelVersionMetricsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostModelVersionMetricsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostModelVersionMetricsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.PostModelVersionMetricsRequest.class, com.clarifai.grpc.api.PostModelVersionMetricsRequest.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.PostModelVersionMetricsRequest.newBuilder()
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
      modelId_ = "";

      versionId_ = "";

      maxExamples_ = 0;

      if (searchBuilder_ == null) {
        search_ = null;
      } else {
        search_ = null;
        searchBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostModelVersionMetricsRequest_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.PostModelVersionMetricsRequest getDefaultInstanceForType() {
      return com.clarifai.grpc.api.PostModelVersionMetricsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.PostModelVersionMetricsRequest build() {
      com.clarifai.grpc.api.PostModelVersionMetricsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.PostModelVersionMetricsRequest buildPartial() {
      com.clarifai.grpc.api.PostModelVersionMetricsRequest result = new com.clarifai.grpc.api.PostModelVersionMetricsRequest(this);
      if (userAppIdBuilder_ == null) {
        result.userAppId_ = userAppId_;
      } else {
        result.userAppId_ = userAppIdBuilder_.build();
      }
      result.modelId_ = modelId_;
      result.versionId_ = versionId_;
      result.maxExamples_ = maxExamples_;
      if (searchBuilder_ == null) {
        result.search_ = search_;
      } else {
        result.search_ = searchBuilder_.build();
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
      if (other instanceof com.clarifai.grpc.api.PostModelVersionMetricsRequest) {
        return mergeFrom((com.clarifai.grpc.api.PostModelVersionMetricsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.PostModelVersionMetricsRequest other) {
      if (other == com.clarifai.grpc.api.PostModelVersionMetricsRequest.getDefaultInstance()) return this;
      if (other.hasUserAppId()) {
        mergeUserAppId(other.getUserAppId());
      }
      if (!other.getModelId().isEmpty()) {
        modelId_ = other.modelId_;
        onChanged();
      }
      if (!other.getVersionId().isEmpty()) {
        versionId_ = other.versionId_;
        onChanged();
      }
      if (other.getMaxExamples() != 0) {
        setMaxExamples(other.getMaxExamples());
      }
      if (other.hasSearch()) {
        mergeSearch(other.getSearch());
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
      com.clarifai.grpc.api.PostModelVersionMetricsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.PostModelVersionMetricsRequest) e.getUnfinishedMessage();
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
     */
    public boolean hasUserAppId() {
      return userAppIdBuilder_ != null || userAppId_ != null;
    }
    /**
     * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
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

    private java.lang.Object modelId_ = "";
    /**
     * <code>string model_id = 2;</code>
     */
    public java.lang.String getModelId() {
      java.lang.Object ref = modelId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        modelId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string model_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getModelIdBytes() {
      java.lang.Object ref = modelId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        modelId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string model_id = 2;</code>
     */
    public Builder setModelId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      modelId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string model_id = 2;</code>
     */
    public Builder clearModelId() {
      
      modelId_ = getDefaultInstance().getModelId();
      onChanged();
      return this;
    }
    /**
     * <code>string model_id = 2;</code>
     */
    public Builder setModelIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      modelId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object versionId_ = "";
    /**
     * <code>string version_id = 3;</code>
     */
    public java.lang.String getVersionId() {
      java.lang.Object ref = versionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        versionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string version_id = 3;</code>
     */
    public com.google.protobuf.ByteString
        getVersionIdBytes() {
      java.lang.Object ref = versionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        versionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string version_id = 3;</code>
     */
    public Builder setVersionId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      versionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string version_id = 3;</code>
     */
    public Builder clearVersionId() {
      
      versionId_ = getDefaultInstance().getVersionId();
      onChanged();
      return this;
    }
    /**
     * <code>string version_id = 3;</code>
     */
    public Builder setVersionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      versionId_ = value;
      onChanged();
      return this;
    }

    private int maxExamples_ ;
    /**
     * <code>uint32 max_examples = 4;</code>
     */
    public int getMaxExamples() {
      return maxExamples_;
    }
    /**
     * <code>uint32 max_examples = 4;</code>
     */
    public Builder setMaxExamples(int value) {
      
      maxExamples_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 max_examples = 4;</code>
     */
    public Builder clearMaxExamples() {
      
      maxExamples_ = 0;
      onChanged();
      return this;
    }

    private com.clarifai.grpc.api.Search search_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.Search, com.clarifai.grpc.api.Search.Builder, com.clarifai.grpc.api.SearchOrBuilder> searchBuilder_;
    /**
     * <pre>
     * Use this to filter inputs that are used in evaluation
     * </pre>
     *
     * <code>.clarifai.api.Search search = 5;</code>
     */
    public boolean hasSearch() {
      return searchBuilder_ != null || search_ != null;
    }
    /**
     * <pre>
     * Use this to filter inputs that are used in evaluation
     * </pre>
     *
     * <code>.clarifai.api.Search search = 5;</code>
     */
    public com.clarifai.grpc.api.Search getSearch() {
      if (searchBuilder_ == null) {
        return search_ == null ? com.clarifai.grpc.api.Search.getDefaultInstance() : search_;
      } else {
        return searchBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Use this to filter inputs that are used in evaluation
     * </pre>
     *
     * <code>.clarifai.api.Search search = 5;</code>
     */
    public Builder setSearch(com.clarifai.grpc.api.Search value) {
      if (searchBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        search_ = value;
        onChanged();
      } else {
        searchBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Use this to filter inputs that are used in evaluation
     * </pre>
     *
     * <code>.clarifai.api.Search search = 5;</code>
     */
    public Builder setSearch(
        com.clarifai.grpc.api.Search.Builder builderForValue) {
      if (searchBuilder_ == null) {
        search_ = builderForValue.build();
        onChanged();
      } else {
        searchBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Use this to filter inputs that are used in evaluation
     * </pre>
     *
     * <code>.clarifai.api.Search search = 5;</code>
     */
    public Builder mergeSearch(com.clarifai.grpc.api.Search value) {
      if (searchBuilder_ == null) {
        if (search_ != null) {
          search_ =
            com.clarifai.grpc.api.Search.newBuilder(search_).mergeFrom(value).buildPartial();
        } else {
          search_ = value;
        }
        onChanged();
      } else {
        searchBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Use this to filter inputs that are used in evaluation
     * </pre>
     *
     * <code>.clarifai.api.Search search = 5;</code>
     */
    public Builder clearSearch() {
      if (searchBuilder_ == null) {
        search_ = null;
        onChanged();
      } else {
        search_ = null;
        searchBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Use this to filter inputs that are used in evaluation
     * </pre>
     *
     * <code>.clarifai.api.Search search = 5;</code>
     */
    public com.clarifai.grpc.api.Search.Builder getSearchBuilder() {
      
      onChanged();
      return getSearchFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Use this to filter inputs that are used in evaluation
     * </pre>
     *
     * <code>.clarifai.api.Search search = 5;</code>
     */
    public com.clarifai.grpc.api.SearchOrBuilder getSearchOrBuilder() {
      if (searchBuilder_ != null) {
        return searchBuilder_.getMessageOrBuilder();
      } else {
        return search_ == null ?
            com.clarifai.grpc.api.Search.getDefaultInstance() : search_;
      }
    }
    /**
     * <pre>
     * Use this to filter inputs that are used in evaluation
     * </pre>
     *
     * <code>.clarifai.api.Search search = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.Search, com.clarifai.grpc.api.Search.Builder, com.clarifai.grpc.api.SearchOrBuilder> 
        getSearchFieldBuilder() {
      if (searchBuilder_ == null) {
        searchBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.clarifai.grpc.api.Search, com.clarifai.grpc.api.Search.Builder, com.clarifai.grpc.api.SearchOrBuilder>(
                getSearch(),
                getParentForChildren(),
                isClean());
        search_ = null;
      }
      return searchBuilder_;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.PostModelVersionMetricsRequest)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.PostModelVersionMetricsRequest)
  private static final com.clarifai.grpc.api.PostModelVersionMetricsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.PostModelVersionMetricsRequest();
  }

  public static com.clarifai.grpc.api.PostModelVersionMetricsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PostModelVersionMetricsRequest>
      PARSER = new com.google.protobuf.AbstractParser<PostModelVersionMetricsRequest>() {
    @java.lang.Override
    public PostModelVersionMetricsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PostModelVersionMetricsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PostModelVersionMetricsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PostModelVersionMetricsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.PostModelVersionMetricsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

