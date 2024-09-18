// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

/**
 * Protobuf type {@code clarifai.api.PostAuditLogSearchesRequest}
 */
public final class PostAuditLogSearchesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.PostAuditLogSearchesRequest)
    PostAuditLogSearchesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PostAuditLogSearchesRequest.newBuilder() to construct.
  private PostAuditLogSearchesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PostAuditLogSearchesRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PostAuditLogSearchesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PostAuditLogSearchesRequest(
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
            com.clarifai.grpc.api.AuditLogQuery.Builder subBuilder = null;
            if (query_ != null) {
              subBuilder = query_.toBuilder();
            }
            query_ = input.readMessage(com.clarifai.grpc.api.AuditLogQuery.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(query_);
              query_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            sortAscending_ = input.readBool();
            break;
          }
          case 42: {
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
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostAuditLogSearchesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostAuditLogSearchesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.PostAuditLogSearchesRequest.class, com.clarifai.grpc.api.PostAuditLogSearchesRequest.Builder.class);
  }

  public static final int USER_APP_ID_FIELD_NUMBER = 1;
  private com.clarifai.grpc.api.UserAppIDSet userAppId_;
  /**
   * <pre>
   * Only the user_id is used from this.
   * </pre>
   *
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   * @return Whether the userAppId field is set.
   */
  @java.lang.Override
  public boolean hasUserAppId() {
    return userAppId_ != null;
  }
  /**
   * <pre>
   * Only the user_id is used from this.
   * </pre>
   *
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   * @return The userAppId.
   */
  @java.lang.Override
  public com.clarifai.grpc.api.UserAppIDSet getUserAppId() {
    return userAppId_ == null ? com.clarifai.grpc.api.UserAppIDSet.getDefaultInstance() : userAppId_;
  }
  /**
   * <pre>
   * Only the user_id is used from this.
   * </pre>
   *
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.UserAppIDSetOrBuilder getUserAppIdOrBuilder() {
    return getUserAppId();
  }

  public static final int QUERY_FIELD_NUMBER = 2;
  private com.clarifai.grpc.api.AuditLogQuery query_;
  /**
   * <code>.clarifai.api.AuditLogQuery query = 2;</code>
   * @return Whether the query field is set.
   */
  @java.lang.Override
  public boolean hasQuery() {
    return query_ != null;
  }
  /**
   * <code>.clarifai.api.AuditLogQuery query = 2;</code>
   * @return The query.
   */
  @java.lang.Override
  public com.clarifai.grpc.api.AuditLogQuery getQuery() {
    return query_ == null ? com.clarifai.grpc.api.AuditLogQuery.getDefaultInstance() : query_;
  }
  /**
   * <code>.clarifai.api.AuditLogQuery query = 2;</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.AuditLogQueryOrBuilder getQueryOrBuilder() {
    return getQuery();
  }

  public static final int SORT_ASCENDING_FIELD_NUMBER = 3;
  private boolean sortAscending_;
  /**
   * <pre>
   * Sorting options:
   * Whether to sort by timestamp in ascending order. If false, will order in descending order.
   * </pre>
   *
   * <code>bool sort_ascending = 3;</code>
   * @return The sortAscending.
   */
  @java.lang.Override
  public boolean getSortAscending() {
    return sortAscending_;
  }

  public static final int PAGINATION_FIELD_NUMBER = 5;
  private com.clarifai.grpc.api.Pagination pagination_;
  /**
   * <code>.clarifai.api.Pagination pagination = 5;</code>
   * @return Whether the pagination field is set.
   */
  @java.lang.Override
  public boolean hasPagination() {
    return pagination_ != null;
  }
  /**
   * <code>.clarifai.api.Pagination pagination = 5;</code>
   * @return The pagination.
   */
  @java.lang.Override
  public com.clarifai.grpc.api.Pagination getPagination() {
    return pagination_ == null ? com.clarifai.grpc.api.Pagination.getDefaultInstance() : pagination_;
  }
  /**
   * <code>.clarifai.api.Pagination pagination = 5;</code>
   */
  @java.lang.Override
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
    if (query_ != null) {
      output.writeMessage(2, getQuery());
    }
    if (sortAscending_ != false) {
      output.writeBool(3, sortAscending_);
    }
    if (pagination_ != null) {
      output.writeMessage(5, getPagination());
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
    if (query_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getQuery());
    }
    if (sortAscending_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, sortAscending_);
    }
    if (pagination_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getPagination());
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
    if (!(obj instanceof com.clarifai.grpc.api.PostAuditLogSearchesRequest)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.PostAuditLogSearchesRequest other = (com.clarifai.grpc.api.PostAuditLogSearchesRequest) obj;

    if (hasUserAppId() != other.hasUserAppId()) return false;
    if (hasUserAppId()) {
      if (!getUserAppId()
          .equals(other.getUserAppId())) return false;
    }
    if (hasQuery() != other.hasQuery()) return false;
    if (hasQuery()) {
      if (!getQuery()
          .equals(other.getQuery())) return false;
    }
    if (getSortAscending()
        != other.getSortAscending()) return false;
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
    if (hasQuery()) {
      hash = (37 * hash) + QUERY_FIELD_NUMBER;
      hash = (53 * hash) + getQuery().hashCode();
    }
    hash = (37 * hash) + SORT_ASCENDING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSortAscending());
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.PostAuditLogSearchesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.PostAuditLogSearchesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostAuditLogSearchesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.PostAuditLogSearchesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostAuditLogSearchesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.PostAuditLogSearchesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostAuditLogSearchesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.PostAuditLogSearchesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostAuditLogSearchesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.PostAuditLogSearchesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.PostAuditLogSearchesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.PostAuditLogSearchesRequest parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.PostAuditLogSearchesRequest prototype) {
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
   * Protobuf type {@code clarifai.api.PostAuditLogSearchesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.PostAuditLogSearchesRequest)
      com.clarifai.grpc.api.PostAuditLogSearchesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostAuditLogSearchesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostAuditLogSearchesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.PostAuditLogSearchesRequest.class, com.clarifai.grpc.api.PostAuditLogSearchesRequest.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.PostAuditLogSearchesRequest.newBuilder()
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
      if (queryBuilder_ == null) {
        query_ = null;
      } else {
        query_ = null;
        queryBuilder_ = null;
      }
      sortAscending_ = false;

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
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_PostAuditLogSearchesRequest_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.PostAuditLogSearchesRequest getDefaultInstanceForType() {
      return com.clarifai.grpc.api.PostAuditLogSearchesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.PostAuditLogSearchesRequest build() {
      com.clarifai.grpc.api.PostAuditLogSearchesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.PostAuditLogSearchesRequest buildPartial() {
      com.clarifai.grpc.api.PostAuditLogSearchesRequest result = new com.clarifai.grpc.api.PostAuditLogSearchesRequest(this);
      if (userAppIdBuilder_ == null) {
        result.userAppId_ = userAppId_;
      } else {
        result.userAppId_ = userAppIdBuilder_.build();
      }
      if (queryBuilder_ == null) {
        result.query_ = query_;
      } else {
        result.query_ = queryBuilder_.build();
      }
      result.sortAscending_ = sortAscending_;
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
      if (other instanceof com.clarifai.grpc.api.PostAuditLogSearchesRequest) {
        return mergeFrom((com.clarifai.grpc.api.PostAuditLogSearchesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.PostAuditLogSearchesRequest other) {
      if (other == com.clarifai.grpc.api.PostAuditLogSearchesRequest.getDefaultInstance()) return this;
      if (other.hasUserAppId()) {
        mergeUserAppId(other.getUserAppId());
      }
      if (other.hasQuery()) {
        mergeQuery(other.getQuery());
      }
      if (other.getSortAscending() != false) {
        setSortAscending(other.getSortAscending());
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
      com.clarifai.grpc.api.PostAuditLogSearchesRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.PostAuditLogSearchesRequest) e.getUnfinishedMessage();
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
     * <pre>
     * Only the user_id is used from this.
     * </pre>
     *
     * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
     * @return Whether the userAppId field is set.
     */
    public boolean hasUserAppId() {
      return userAppIdBuilder_ != null || userAppId_ != null;
    }
    /**
     * <pre>
     * Only the user_id is used from this.
     * </pre>
     *
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
     * <pre>
     * Only the user_id is used from this.
     * </pre>
     *
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
     * <pre>
     * Only the user_id is used from this.
     * </pre>
     *
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
     * <pre>
     * Only the user_id is used from this.
     * </pre>
     *
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
     * <pre>
     * Only the user_id is used from this.
     * </pre>
     *
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
     * <pre>
     * Only the user_id is used from this.
     * </pre>
     *
     * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
     */
    public com.clarifai.grpc.api.UserAppIDSet.Builder getUserAppIdBuilder() {
      
      onChanged();
      return getUserAppIdFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Only the user_id is used from this.
     * </pre>
     *
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
     * <pre>
     * Only the user_id is used from this.
     * </pre>
     *
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

    private com.clarifai.grpc.api.AuditLogQuery query_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.AuditLogQuery, com.clarifai.grpc.api.AuditLogQuery.Builder, com.clarifai.grpc.api.AuditLogQueryOrBuilder> queryBuilder_;
    /**
     * <code>.clarifai.api.AuditLogQuery query = 2;</code>
     * @return Whether the query field is set.
     */
    public boolean hasQuery() {
      return queryBuilder_ != null || query_ != null;
    }
    /**
     * <code>.clarifai.api.AuditLogQuery query = 2;</code>
     * @return The query.
     */
    public com.clarifai.grpc.api.AuditLogQuery getQuery() {
      if (queryBuilder_ == null) {
        return query_ == null ? com.clarifai.grpc.api.AuditLogQuery.getDefaultInstance() : query_;
      } else {
        return queryBuilder_.getMessage();
      }
    }
    /**
     * <code>.clarifai.api.AuditLogQuery query = 2;</code>
     */
    public Builder setQuery(com.clarifai.grpc.api.AuditLogQuery value) {
      if (queryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        query_ = value;
        onChanged();
      } else {
        queryBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.clarifai.api.AuditLogQuery query = 2;</code>
     */
    public Builder setQuery(
        com.clarifai.grpc.api.AuditLogQuery.Builder builderForValue) {
      if (queryBuilder_ == null) {
        query_ = builderForValue.build();
        onChanged();
      } else {
        queryBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.clarifai.api.AuditLogQuery query = 2;</code>
     */
    public Builder mergeQuery(com.clarifai.grpc.api.AuditLogQuery value) {
      if (queryBuilder_ == null) {
        if (query_ != null) {
          query_ =
            com.clarifai.grpc.api.AuditLogQuery.newBuilder(query_).mergeFrom(value).buildPartial();
        } else {
          query_ = value;
        }
        onChanged();
      } else {
        queryBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.clarifai.api.AuditLogQuery query = 2;</code>
     */
    public Builder clearQuery() {
      if (queryBuilder_ == null) {
        query_ = null;
        onChanged();
      } else {
        query_ = null;
        queryBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.clarifai.api.AuditLogQuery query = 2;</code>
     */
    public com.clarifai.grpc.api.AuditLogQuery.Builder getQueryBuilder() {
      
      onChanged();
      return getQueryFieldBuilder().getBuilder();
    }
    /**
     * <code>.clarifai.api.AuditLogQuery query = 2;</code>
     */
    public com.clarifai.grpc.api.AuditLogQueryOrBuilder getQueryOrBuilder() {
      if (queryBuilder_ != null) {
        return queryBuilder_.getMessageOrBuilder();
      } else {
        return query_ == null ?
            com.clarifai.grpc.api.AuditLogQuery.getDefaultInstance() : query_;
      }
    }
    /**
     * <code>.clarifai.api.AuditLogQuery query = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.AuditLogQuery, com.clarifai.grpc.api.AuditLogQuery.Builder, com.clarifai.grpc.api.AuditLogQueryOrBuilder> 
        getQueryFieldBuilder() {
      if (queryBuilder_ == null) {
        queryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.clarifai.grpc.api.AuditLogQuery, com.clarifai.grpc.api.AuditLogQuery.Builder, com.clarifai.grpc.api.AuditLogQueryOrBuilder>(
                getQuery(),
                getParentForChildren(),
                isClean());
        query_ = null;
      }
      return queryBuilder_;
    }

    private boolean sortAscending_ ;
    /**
     * <pre>
     * Sorting options:
     * Whether to sort by timestamp in ascending order. If false, will order in descending order.
     * </pre>
     *
     * <code>bool sort_ascending = 3;</code>
     * @return The sortAscending.
     */
    @java.lang.Override
    public boolean getSortAscending() {
      return sortAscending_;
    }
    /**
     * <pre>
     * Sorting options:
     * Whether to sort by timestamp in ascending order. If false, will order in descending order.
     * </pre>
     *
     * <code>bool sort_ascending = 3;</code>
     * @param value The sortAscending to set.
     * @return This builder for chaining.
     */
    public Builder setSortAscending(boolean value) {
      
      sortAscending_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Sorting options:
     * Whether to sort by timestamp in ascending order. If false, will order in descending order.
     * </pre>
     *
     * <code>bool sort_ascending = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSortAscending() {
      
      sortAscending_ = false;
      onChanged();
      return this;
    }

    private com.clarifai.grpc.api.Pagination pagination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.Pagination, com.clarifai.grpc.api.Pagination.Builder, com.clarifai.grpc.api.PaginationOrBuilder> paginationBuilder_;
    /**
     * <code>.clarifai.api.Pagination pagination = 5;</code>
     * @return Whether the pagination field is set.
     */
    public boolean hasPagination() {
      return paginationBuilder_ != null || pagination_ != null;
    }
    /**
     * <code>.clarifai.api.Pagination pagination = 5;</code>
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
     * <code>.clarifai.api.Pagination pagination = 5;</code>
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
     * <code>.clarifai.api.Pagination pagination = 5;</code>
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
     * <code>.clarifai.api.Pagination pagination = 5;</code>
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
     * <code>.clarifai.api.Pagination pagination = 5;</code>
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
     * <code>.clarifai.api.Pagination pagination = 5;</code>
     */
    public com.clarifai.grpc.api.Pagination.Builder getPaginationBuilder() {
      
      onChanged();
      return getPaginationFieldBuilder().getBuilder();
    }
    /**
     * <code>.clarifai.api.Pagination pagination = 5;</code>
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
     * <code>.clarifai.api.Pagination pagination = 5;</code>
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.PostAuditLogSearchesRequest)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.PostAuditLogSearchesRequest)
  private static final com.clarifai.grpc.api.PostAuditLogSearchesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.PostAuditLogSearchesRequest();
  }

  public static com.clarifai.grpc.api.PostAuditLogSearchesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PostAuditLogSearchesRequest>
      PARSER = new com.google.protobuf.AbstractParser<PostAuditLogSearchesRequest>() {
    @java.lang.Override
    public PostAuditLogSearchesRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PostAuditLogSearchesRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PostAuditLogSearchesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PostAuditLogSearchesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.PostAuditLogSearchesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
