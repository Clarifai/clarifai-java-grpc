// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

/**
 * <pre>
 * Search over the available applications.
 * </pre>
 *
 * Protobuf type {@code clarifai.api.PostAppsSearchesRequest}
 */
public  final class PostAppsSearchesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.PostAppsSearchesRequest)
    PostAppsSearchesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PostAppsSearchesRequest.newBuilder() to construct.
  private PostAppsSearchesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PostAppsSearchesRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PostAppsSearchesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PostAppsSearchesRequest(
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
            com.clarifai.grpc.api.AppQuery.Builder subBuilder = null;
            if (appQuery_ != null) {
              subBuilder = appQuery_.toBuilder();
            }
            appQuery_ = input.readMessage(com.clarifai.grpc.api.AppQuery.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(appQuery_);
              appQuery_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.clarifai.grpc.api.Pagination.Builder subBuilder = null;
            if (pagination_ != null) {
              subBuilder = pagination_.toBuilder();
            }
            pagination_ = input.readMessage(com.clarifai.grpc.api.Pagination.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(pagination_);
              pagination_ = subBuilder.buildPartial();
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
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostAppsSearchesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostAppsSearchesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.PostAppsSearchesRequest.class, com.clarifai.grpc.api.PostAppsSearchesRequest.Builder.class);
  }

  public static final int USER_APP_ID_FIELD_NUMBER = 1;
  private com.clarifai.grpc.api.UserAppIDSet userAppId_;
  /**
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   * @return Whether the userAppId field is set.
   */
  public boolean hasUserAppId() {
    return userAppId_ != null;
  }
  /**
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   * @return The userAppId.
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

  public static final int APP_QUERY_FIELD_NUMBER = 2;
  private com.clarifai.grpc.api.AppQuery appQuery_;
  /**
   * <pre>
   * The body of the request.
   * </pre>
   *
   * <code>.clarifai.api.AppQuery app_query = 2;</code>
   * @return Whether the appQuery field is set.
   */
  public boolean hasAppQuery() {
    return appQuery_ != null;
  }
  /**
   * <pre>
   * The body of the request.
   * </pre>
   *
   * <code>.clarifai.api.AppQuery app_query = 2;</code>
   * @return The appQuery.
   */
  public com.clarifai.grpc.api.AppQuery getAppQuery() {
    return appQuery_ == null ? com.clarifai.grpc.api.AppQuery.getDefaultInstance() : appQuery_;
  }
  /**
   * <pre>
   * The body of the request.
   * </pre>
   *
   * <code>.clarifai.api.AppQuery app_query = 2;</code>
   */
  public com.clarifai.grpc.api.AppQueryOrBuilder getAppQueryOrBuilder() {
    return getAppQuery();
  }

  public static final int PAGINATION_FIELD_NUMBER = 3;
  private com.clarifai.grpc.api.Pagination pagination_;
  /**
   * <pre>
   * Pagination parameters here since there are no url args in this
   * POST request.
   * </pre>
   *
   * <code>.clarifai.api.Pagination pagination = 3;</code>
   * @return Whether the pagination field is set.
   */
  public boolean hasPagination() {
    return pagination_ != null;
  }
  /**
   * <pre>
   * Pagination parameters here since there are no url args in this
   * POST request.
   * </pre>
   *
   * <code>.clarifai.api.Pagination pagination = 3;</code>
   * @return The pagination.
   */
  public com.clarifai.grpc.api.Pagination getPagination() {
    return pagination_ == null ? com.clarifai.grpc.api.Pagination.getDefaultInstance() : pagination_;
  }
  /**
   * <pre>
   * Pagination parameters here since there are no url args in this
   * POST request.
   * </pre>
   *
   * <code>.clarifai.api.Pagination pagination = 3;</code>
   */
  public com.clarifai.grpc.api.PaginationOrBuilder getPaginationOrBuilder() {
    return getPagination();
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
    if (appQuery_ != null) {
      output.writeMessage(2, getAppQuery());
    }
    if (pagination_ != null) {
      output.writeMessage(3, getPagination());
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
    if (appQuery_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAppQuery());
    }
    if (pagination_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPagination());
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
    if (!(obj instanceof com.clarifai.grpc.api.PostAppsSearchesRequest)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.PostAppsSearchesRequest other = (com.clarifai.grpc.api.PostAppsSearchesRequest) obj;

    if (hasUserAppId() != other.hasUserAppId()) return false;
    if (hasUserAppId()) {
      if (!getUserAppId()
          .equals(other.getUserAppId())) return false;
    }
    if (hasAppQuery() != other.hasAppQuery()) return false;
    if (hasAppQuery()) {
      if (!getAppQuery()
          .equals(other.getAppQuery())) return false;
    }
    if (hasPagination() != other.hasPagination()) return false;
    if (hasPagination()) {
      if (!getPagination()
          .equals(other.getPagination())) return false;
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
    if (hasAppQuery()) {
      hash = (37 * hash) + APP_QUERY_FIELD_NUMBER;
      hash = (53 * hash) + getAppQuery().hashCode();
    }
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.PostAppsSearchesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.PostAppsSearchesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostAppsSearchesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.PostAppsSearchesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostAppsSearchesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.PostAppsSearchesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostAppsSearchesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.PostAppsSearchesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostAppsSearchesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.PostAppsSearchesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostAppsSearchesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.PostAppsSearchesRequest parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.PostAppsSearchesRequest prototype) {
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
   * Search over the available applications.
   * </pre>
   *
   * Protobuf type {@code clarifai.api.PostAppsSearchesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.PostAppsSearchesRequest)
      com.clarifai.grpc.api.PostAppsSearchesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostAppsSearchesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostAppsSearchesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.PostAppsSearchesRequest.class, com.clarifai.grpc.api.PostAppsSearchesRequest.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.PostAppsSearchesRequest.newBuilder()
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
      if (appQueryBuilder_ == null) {
        appQuery_ = null;
      } else {
        appQuery_ = null;
        appQueryBuilder_ = null;
      }
      if (paginationBuilder_ == null) {
        pagination_ = null;
      } else {
        pagination_ = null;
        paginationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostAppsSearchesRequest_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.PostAppsSearchesRequest getDefaultInstanceForType() {
      return com.clarifai.grpc.api.PostAppsSearchesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.PostAppsSearchesRequest build() {
      com.clarifai.grpc.api.PostAppsSearchesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.PostAppsSearchesRequest buildPartial() {
      com.clarifai.grpc.api.PostAppsSearchesRequest result = new com.clarifai.grpc.api.PostAppsSearchesRequest(this);
      if (userAppIdBuilder_ == null) {
        result.userAppId_ = userAppId_;
      } else {
        result.userAppId_ = userAppIdBuilder_.build();
      }
      if (appQueryBuilder_ == null) {
        result.appQuery_ = appQuery_;
      } else {
        result.appQuery_ = appQueryBuilder_.build();
      }
      if (paginationBuilder_ == null) {
        result.pagination_ = pagination_;
      } else {
        result.pagination_ = paginationBuilder_.build();
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
      if (other instanceof com.clarifai.grpc.api.PostAppsSearchesRequest) {
        return mergeFrom((com.clarifai.grpc.api.PostAppsSearchesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.PostAppsSearchesRequest other) {
      if (other == com.clarifai.grpc.api.PostAppsSearchesRequest.getDefaultInstance()) return this;
      if (other.hasUserAppId()) {
        mergeUserAppId(other.getUserAppId());
      }
      if (other.hasAppQuery()) {
        mergeAppQuery(other.getAppQuery());
      }
      if (other.hasPagination()) {
        mergePagination(other.getPagination());
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
      com.clarifai.grpc.api.PostAppsSearchesRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.PostAppsSearchesRequest) e.getUnfinishedMessage();
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

    private com.clarifai.grpc.api.AppQuery appQuery_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.AppQuery, com.clarifai.grpc.api.AppQuery.Builder, com.clarifai.grpc.api.AppQueryOrBuilder> appQueryBuilder_;
    /**
     * <pre>
     * The body of the request.
     * </pre>
     *
     * <code>.clarifai.api.AppQuery app_query = 2;</code>
     * @return Whether the appQuery field is set.
     */
    public boolean hasAppQuery() {
      return appQueryBuilder_ != null || appQuery_ != null;
    }
    /**
     * <pre>
     * The body of the request.
     * </pre>
     *
     * <code>.clarifai.api.AppQuery app_query = 2;</code>
     * @return The appQuery.
     */
    public com.clarifai.grpc.api.AppQuery getAppQuery() {
      if (appQueryBuilder_ == null) {
        return appQuery_ == null ? com.clarifai.grpc.api.AppQuery.getDefaultInstance() : appQuery_;
      } else {
        return appQueryBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The body of the request.
     * </pre>
     *
     * <code>.clarifai.api.AppQuery app_query = 2;</code>
     */
    public Builder setAppQuery(com.clarifai.grpc.api.AppQuery value) {
      if (appQueryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        appQuery_ = value;
        onChanged();
      } else {
        appQueryBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The body of the request.
     * </pre>
     *
     * <code>.clarifai.api.AppQuery app_query = 2;</code>
     */
    public Builder setAppQuery(
        com.clarifai.grpc.api.AppQuery.Builder builderForValue) {
      if (appQueryBuilder_ == null) {
        appQuery_ = builderForValue.build();
        onChanged();
      } else {
        appQueryBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The body of the request.
     * </pre>
     *
     * <code>.clarifai.api.AppQuery app_query = 2;</code>
     */
    public Builder mergeAppQuery(com.clarifai.grpc.api.AppQuery value) {
      if (appQueryBuilder_ == null) {
        if (appQuery_ != null) {
          appQuery_ =
            com.clarifai.grpc.api.AppQuery.newBuilder(appQuery_).mergeFrom(value).buildPartial();
        } else {
          appQuery_ = value;
        }
        onChanged();
      } else {
        appQueryBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The body of the request.
     * </pre>
     *
     * <code>.clarifai.api.AppQuery app_query = 2;</code>
     */
    public Builder clearAppQuery() {
      if (appQueryBuilder_ == null) {
        appQuery_ = null;
        onChanged();
      } else {
        appQuery_ = null;
        appQueryBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The body of the request.
     * </pre>
     *
     * <code>.clarifai.api.AppQuery app_query = 2;</code>
     */
    public com.clarifai.grpc.api.AppQuery.Builder getAppQueryBuilder() {
      
      onChanged();
      return getAppQueryFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The body of the request.
     * </pre>
     *
     * <code>.clarifai.api.AppQuery app_query = 2;</code>
     */
    public com.clarifai.grpc.api.AppQueryOrBuilder getAppQueryOrBuilder() {
      if (appQueryBuilder_ != null) {
        return appQueryBuilder_.getMessageOrBuilder();
      } else {
        return appQuery_ == null ?
            com.clarifai.grpc.api.AppQuery.getDefaultInstance() : appQuery_;
      }
    }
    /**
     * <pre>
     * The body of the request.
     * </pre>
     *
     * <code>.clarifai.api.AppQuery app_query = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.AppQuery, com.clarifai.grpc.api.AppQuery.Builder, com.clarifai.grpc.api.AppQueryOrBuilder> 
        getAppQueryFieldBuilder() {
      if (appQueryBuilder_ == null) {
        appQueryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.clarifai.grpc.api.AppQuery, com.clarifai.grpc.api.AppQuery.Builder, com.clarifai.grpc.api.AppQueryOrBuilder>(
                getAppQuery(),
                getParentForChildren(),
                isClean());
        appQuery_ = null;
      }
      return appQueryBuilder_;
    }

    private com.clarifai.grpc.api.Pagination pagination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.Pagination, com.clarifai.grpc.api.Pagination.Builder, com.clarifai.grpc.api.PaginationOrBuilder> paginationBuilder_;
    /**
     * <pre>
     * Pagination parameters here since there are no url args in this
     * POST request.
     * </pre>
     *
     * <code>.clarifai.api.Pagination pagination = 3;</code>
     * @return Whether the pagination field is set.
     */
    public boolean hasPagination() {
      return paginationBuilder_ != null || pagination_ != null;
    }
    /**
     * <pre>
     * Pagination parameters here since there are no url args in this
     * POST request.
     * </pre>
     *
     * <code>.clarifai.api.Pagination pagination = 3;</code>
     * @return The pagination.
     */
    public com.clarifai.grpc.api.Pagination getPagination() {
      if (paginationBuilder_ == null) {
        return pagination_ == null ? com.clarifai.grpc.api.Pagination.getDefaultInstance() : pagination_;
      } else {
        return paginationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Pagination parameters here since there are no url args in this
     * POST request.
     * </pre>
     *
     * <code>.clarifai.api.Pagination pagination = 3;</code>
     */
    public Builder setPagination(com.clarifai.grpc.api.Pagination value) {
      if (paginationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pagination_ = value;
        onChanged();
      } else {
        paginationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Pagination parameters here since there are no url args in this
     * POST request.
     * </pre>
     *
     * <code>.clarifai.api.Pagination pagination = 3;</code>
     */
    public Builder setPagination(
        com.clarifai.grpc.api.Pagination.Builder builderForValue) {
      if (paginationBuilder_ == null) {
        pagination_ = builderForValue.build();
        onChanged();
      } else {
        paginationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Pagination parameters here since there are no url args in this
     * POST request.
     * </pre>
     *
     * <code>.clarifai.api.Pagination pagination = 3;</code>
     */
    public Builder mergePagination(com.clarifai.grpc.api.Pagination value) {
      if (paginationBuilder_ == null) {
        if (pagination_ != null) {
          pagination_ =
            com.clarifai.grpc.api.Pagination.newBuilder(pagination_).mergeFrom(value).buildPartial();
        } else {
          pagination_ = value;
        }
        onChanged();
      } else {
        paginationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Pagination parameters here since there are no url args in this
     * POST request.
     * </pre>
     *
     * <code>.clarifai.api.Pagination pagination = 3;</code>
     */
    public Builder clearPagination() {
      if (paginationBuilder_ == null) {
        pagination_ = null;
        onChanged();
      } else {
        pagination_ = null;
        paginationBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Pagination parameters here since there are no url args in this
     * POST request.
     * </pre>
     *
     * <code>.clarifai.api.Pagination pagination = 3;</code>
     */
    public com.clarifai.grpc.api.Pagination.Builder getPaginationBuilder() {
      
      onChanged();
      return getPaginationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Pagination parameters here since there are no url args in this
     * POST request.
     * </pre>
     *
     * <code>.clarifai.api.Pagination pagination = 3;</code>
     */
    public com.clarifai.grpc.api.PaginationOrBuilder getPaginationOrBuilder() {
      if (paginationBuilder_ != null) {
        return paginationBuilder_.getMessageOrBuilder();
      } else {
        return pagination_ == null ?
            com.clarifai.grpc.api.Pagination.getDefaultInstance() : pagination_;
      }
    }
    /**
     * <pre>
     * Pagination parameters here since there are no url args in this
     * POST request.
     * </pre>
     *
     * <code>.clarifai.api.Pagination pagination = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.Pagination, com.clarifai.grpc.api.Pagination.Builder, com.clarifai.grpc.api.PaginationOrBuilder> 
        getPaginationFieldBuilder() {
      if (paginationBuilder_ == null) {
        paginationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.clarifai.grpc.api.Pagination, com.clarifai.grpc.api.Pagination.Builder, com.clarifai.grpc.api.PaginationOrBuilder>(
                getPagination(),
                getParentForChildren(),
                isClean());
        pagination_ = null;
      }
      return paginationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.PostAppsSearchesRequest)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.PostAppsSearchesRequest)
  private static final com.clarifai.grpc.api.PostAppsSearchesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.PostAppsSearchesRequest();
  }

  public static com.clarifai.grpc.api.PostAppsSearchesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PostAppsSearchesRequest>
      PARSER = new com.google.protobuf.AbstractParser<PostAppsSearchesRequest>() {
    @java.lang.Override
    public PostAppsSearchesRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PostAppsSearchesRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PostAppsSearchesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PostAppsSearchesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.PostAppsSearchesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
