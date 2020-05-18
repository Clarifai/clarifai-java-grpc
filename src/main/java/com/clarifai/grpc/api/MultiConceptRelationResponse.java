// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

/**
 * Protobuf type {@code clarifai.api.MultiConceptRelationResponse}
 */
public  final class MultiConceptRelationResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.MultiConceptRelationResponse)
    MultiConceptRelationResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MultiConceptRelationResponse.newBuilder() to construct.
  private MultiConceptRelationResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MultiConceptRelationResponse() {
    conceptRelations_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MultiConceptRelationResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MultiConceptRelationResponse(
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
            com.clarifai.grpc.api.status.Status.Builder subBuilder = null;
            if (status_ != null) {
              subBuilder = status_.toBuilder();
            }
            status_ = input.readMessage(com.clarifai.grpc.api.status.Status.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(status_);
              status_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              conceptRelations_ = new java.util.ArrayList<com.clarifai.grpc.api.ConceptRelation>();
              mutable_bitField0_ |= 0x00000001;
            }
            conceptRelations_.add(
                input.readMessage(com.clarifai.grpc.api.ConceptRelation.parser(), extensionRegistry));
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
        conceptRelations_ = java.util.Collections.unmodifiableList(conceptRelations_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiConceptRelationResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiConceptRelationResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.MultiConceptRelationResponse.class, com.clarifai.grpc.api.MultiConceptRelationResponse.Builder.class);
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private com.clarifai.grpc.api.status.Status status_;
  /**
   * <pre>
   * The response status.
   * </pre>
   *
   * <code>.clarifai.api.status.Status status = 1;</code>
   * @return Whether the status field is set.
   */
  public boolean hasStatus() {
    return status_ != null;
  }
  /**
   * <pre>
   * The response status.
   * </pre>
   *
   * <code>.clarifai.api.status.Status status = 1;</code>
   * @return The status.
   */
  public com.clarifai.grpc.api.status.Status getStatus() {
    return status_ == null ? com.clarifai.grpc.api.status.Status.getDefaultInstance() : status_;
  }
  /**
   * <pre>
   * The response status.
   * </pre>
   *
   * <code>.clarifai.api.status.Status status = 1;</code>
   */
  public com.clarifai.grpc.api.status.StatusOrBuilder getStatusOrBuilder() {
    return getStatus();
  }

  public static final int CONCEPT_RELATIONS_FIELD_NUMBER = 2;
  private java.util.List<com.clarifai.grpc.api.ConceptRelation> conceptRelations_;
  /**
   * <pre>
   * The returned concept relations.
   * </pre>
   *
   * <code>repeated .clarifai.api.ConceptRelation concept_relations = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  public java.util.List<com.clarifai.grpc.api.ConceptRelation> getConceptRelationsList() {
    return conceptRelations_;
  }
  /**
   * <pre>
   * The returned concept relations.
   * </pre>
   *
   * <code>repeated .clarifai.api.ConceptRelation concept_relations = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  public java.util.List<? extends com.clarifai.grpc.api.ConceptRelationOrBuilder> 
      getConceptRelationsOrBuilderList() {
    return conceptRelations_;
  }
  /**
   * <pre>
   * The returned concept relations.
   * </pre>
   *
   * <code>repeated .clarifai.api.ConceptRelation concept_relations = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  public int getConceptRelationsCount() {
    return conceptRelations_.size();
  }
  /**
   * <pre>
   * The returned concept relations.
   * </pre>
   *
   * <code>repeated .clarifai.api.ConceptRelation concept_relations = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  public com.clarifai.grpc.api.ConceptRelation getConceptRelations(int index) {
    return conceptRelations_.get(index);
  }
  /**
   * <pre>
   * The returned concept relations.
   * </pre>
   *
   * <code>repeated .clarifai.api.ConceptRelation concept_relations = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  public com.clarifai.grpc.api.ConceptRelationOrBuilder getConceptRelationsOrBuilder(
      int index) {
    return conceptRelations_.get(index);
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
    if (status_ != null) {
      output.writeMessage(1, getStatus());
    }
    for (int i = 0; i < conceptRelations_.size(); i++) {
      output.writeMessage(2, conceptRelations_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getStatus());
    }
    for (int i = 0; i < conceptRelations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, conceptRelations_.get(i));
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
    if (!(obj instanceof com.clarifai.grpc.api.MultiConceptRelationResponse)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.MultiConceptRelationResponse other = (com.clarifai.grpc.api.MultiConceptRelationResponse) obj;

    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (!getStatus()
          .equals(other.getStatus())) return false;
    }
    if (!getConceptRelationsList()
        .equals(other.getConceptRelationsList())) return false;
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
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatus().hashCode();
    }
    if (getConceptRelationsCount() > 0) {
      hash = (37 * hash) + CONCEPT_RELATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getConceptRelationsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.MultiConceptRelationResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.MultiConceptRelationResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiConceptRelationResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.MultiConceptRelationResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiConceptRelationResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.MultiConceptRelationResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiConceptRelationResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.MultiConceptRelationResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiConceptRelationResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.MultiConceptRelationResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.MultiConceptRelationResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.MultiConceptRelationResponse parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.MultiConceptRelationResponse prototype) {
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
   * Protobuf type {@code clarifai.api.MultiConceptRelationResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.MultiConceptRelationResponse)
      com.clarifai.grpc.api.MultiConceptRelationResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiConceptRelationResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiConceptRelationResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.MultiConceptRelationResponse.class, com.clarifai.grpc.api.MultiConceptRelationResponse.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.MultiConceptRelationResponse.newBuilder()
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
        getConceptRelationsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (statusBuilder_ == null) {
        status_ = null;
      } else {
        status_ = null;
        statusBuilder_ = null;
      }
      if (conceptRelationsBuilder_ == null) {
        conceptRelations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        conceptRelationsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_MultiConceptRelationResponse_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.MultiConceptRelationResponse getDefaultInstanceForType() {
      return com.clarifai.grpc.api.MultiConceptRelationResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.MultiConceptRelationResponse build() {
      com.clarifai.grpc.api.MultiConceptRelationResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.MultiConceptRelationResponse buildPartial() {
      com.clarifai.grpc.api.MultiConceptRelationResponse result = new com.clarifai.grpc.api.MultiConceptRelationResponse(this);
      int from_bitField0_ = bitField0_;
      if (statusBuilder_ == null) {
        result.status_ = status_;
      } else {
        result.status_ = statusBuilder_.build();
      }
      if (conceptRelationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          conceptRelations_ = java.util.Collections.unmodifiableList(conceptRelations_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.conceptRelations_ = conceptRelations_;
      } else {
        result.conceptRelations_ = conceptRelationsBuilder_.build();
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
      if (other instanceof com.clarifai.grpc.api.MultiConceptRelationResponse) {
        return mergeFrom((com.clarifai.grpc.api.MultiConceptRelationResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.MultiConceptRelationResponse other) {
      if (other == com.clarifai.grpc.api.MultiConceptRelationResponse.getDefaultInstance()) return this;
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
      }
      if (conceptRelationsBuilder_ == null) {
        if (!other.conceptRelations_.isEmpty()) {
          if (conceptRelations_.isEmpty()) {
            conceptRelations_ = other.conceptRelations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureConceptRelationsIsMutable();
            conceptRelations_.addAll(other.conceptRelations_);
          }
          onChanged();
        }
      } else {
        if (!other.conceptRelations_.isEmpty()) {
          if (conceptRelationsBuilder_.isEmpty()) {
            conceptRelationsBuilder_.dispose();
            conceptRelationsBuilder_ = null;
            conceptRelations_ = other.conceptRelations_;
            bitField0_ = (bitField0_ & ~0x00000001);
            conceptRelationsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getConceptRelationsFieldBuilder() : null;
          } else {
            conceptRelationsBuilder_.addAllMessages(other.conceptRelations_);
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
      com.clarifai.grpc.api.MultiConceptRelationResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.MultiConceptRelationResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.clarifai.grpc.api.status.Status status_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.status.Status, com.clarifai.grpc.api.status.Status.Builder, com.clarifai.grpc.api.status.StatusOrBuilder> statusBuilder_;
    /**
     * <pre>
     * The response status.
     * </pre>
     *
     * <code>.clarifai.api.status.Status status = 1;</code>
     * @return Whether the status field is set.
     */
    public boolean hasStatus() {
      return statusBuilder_ != null || status_ != null;
    }
    /**
     * <pre>
     * The response status.
     * </pre>
     *
     * <code>.clarifai.api.status.Status status = 1;</code>
     * @return The status.
     */
    public com.clarifai.grpc.api.status.Status getStatus() {
      if (statusBuilder_ == null) {
        return status_ == null ? com.clarifai.grpc.api.status.Status.getDefaultInstance() : status_;
      } else {
        return statusBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The response status.
     * </pre>
     *
     * <code>.clarifai.api.status.Status status = 1;</code>
     */
    public Builder setStatus(com.clarifai.grpc.api.status.Status value) {
      if (statusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        status_ = value;
        onChanged();
      } else {
        statusBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The response status.
     * </pre>
     *
     * <code>.clarifai.api.status.Status status = 1;</code>
     */
    public Builder setStatus(
        com.clarifai.grpc.api.status.Status.Builder builderForValue) {
      if (statusBuilder_ == null) {
        status_ = builderForValue.build();
        onChanged();
      } else {
        statusBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The response status.
     * </pre>
     *
     * <code>.clarifai.api.status.Status status = 1;</code>
     */
    public Builder mergeStatus(com.clarifai.grpc.api.status.Status value) {
      if (statusBuilder_ == null) {
        if (status_ != null) {
          status_ =
            com.clarifai.grpc.api.status.Status.newBuilder(status_).mergeFrom(value).buildPartial();
        } else {
          status_ = value;
        }
        onChanged();
      } else {
        statusBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The response status.
     * </pre>
     *
     * <code>.clarifai.api.status.Status status = 1;</code>
     */
    public Builder clearStatus() {
      if (statusBuilder_ == null) {
        status_ = null;
        onChanged();
      } else {
        status_ = null;
        statusBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The response status.
     * </pre>
     *
     * <code>.clarifai.api.status.Status status = 1;</code>
     */
    public com.clarifai.grpc.api.status.Status.Builder getStatusBuilder() {
      
      onChanged();
      return getStatusFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The response status.
     * </pre>
     *
     * <code>.clarifai.api.status.Status status = 1;</code>
     */
    public com.clarifai.grpc.api.status.StatusOrBuilder getStatusOrBuilder() {
      if (statusBuilder_ != null) {
        return statusBuilder_.getMessageOrBuilder();
      } else {
        return status_ == null ?
            com.clarifai.grpc.api.status.Status.getDefaultInstance() : status_;
      }
    }
    /**
     * <pre>
     * The response status.
     * </pre>
     *
     * <code>.clarifai.api.status.Status status = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.status.Status, com.clarifai.grpc.api.status.Status.Builder, com.clarifai.grpc.api.status.StatusOrBuilder> 
        getStatusFieldBuilder() {
      if (statusBuilder_ == null) {
        statusBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.clarifai.grpc.api.status.Status, com.clarifai.grpc.api.status.Status.Builder, com.clarifai.grpc.api.status.StatusOrBuilder>(
                getStatus(),
                getParentForChildren(),
                isClean());
        status_ = null;
      }
      return statusBuilder_;
    }

    private java.util.List<com.clarifai.grpc.api.ConceptRelation> conceptRelations_ =
      java.util.Collections.emptyList();
    private void ensureConceptRelationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        conceptRelations_ = new java.util.ArrayList<com.clarifai.grpc.api.ConceptRelation>(conceptRelations_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.ConceptRelation, com.clarifai.grpc.api.ConceptRelation.Builder, com.clarifai.grpc.api.ConceptRelationOrBuilder> conceptRelationsBuilder_;

    /**
     * <pre>
     * The returned concept relations.
     * </pre>
     *
     * <code>repeated .clarifai.api.ConceptRelation concept_relations = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public java.util.List<com.clarifai.grpc.api.ConceptRelation> getConceptRelationsList() {
      if (conceptRelationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(conceptRelations_);
      } else {
        return conceptRelationsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The returned concept relations.
     * </pre>
     *
     * <code>repeated .clarifai.api.ConceptRelation concept_relations = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public int getConceptRelationsCount() {
      if (conceptRelationsBuilder_ == null) {
        return conceptRelations_.size();
      } else {
        return conceptRelationsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The returned concept relations.
     * </pre>
     *
     * <code>repeated .clarifai.api.ConceptRelation concept_relations = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public com.clarifai.grpc.api.ConceptRelation getConceptRelations(int index) {
      if (conceptRelationsBuilder_ == null) {
        return conceptRelations_.get(index);
      } else {
        return conceptRelationsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The returned concept relations.
     * </pre>
     *
     * <code>repeated .clarifai.api.ConceptRelation concept_relations = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder setConceptRelations(
        int index, com.clarifai.grpc.api.ConceptRelation value) {
      if (conceptRelationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConceptRelationsIsMutable();
        conceptRelations_.set(index, value);
        onChanged();
      } else {
        conceptRelationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The returned concept relations.
     * </pre>
     *
     * <code>repeated .clarifai.api.ConceptRelation concept_relations = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder setConceptRelations(
        int index, com.clarifai.grpc.api.ConceptRelation.Builder builderForValue) {
      if (conceptRelationsBuilder_ == null) {
        ensureConceptRelationsIsMutable();
        conceptRelations_.set(index, builderForValue.build());
        onChanged();
      } else {
        conceptRelationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The returned concept relations.
     * </pre>
     *
     * <code>repeated .clarifai.api.ConceptRelation concept_relations = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder addConceptRelations(com.clarifai.grpc.api.ConceptRelation value) {
      if (conceptRelationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConceptRelationsIsMutable();
        conceptRelations_.add(value);
        onChanged();
      } else {
        conceptRelationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The returned concept relations.
     * </pre>
     *
     * <code>repeated .clarifai.api.ConceptRelation concept_relations = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder addConceptRelations(
        int index, com.clarifai.grpc.api.ConceptRelation value) {
      if (conceptRelationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConceptRelationsIsMutable();
        conceptRelations_.add(index, value);
        onChanged();
      } else {
        conceptRelationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The returned concept relations.
     * </pre>
     *
     * <code>repeated .clarifai.api.ConceptRelation concept_relations = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder addConceptRelations(
        com.clarifai.grpc.api.ConceptRelation.Builder builderForValue) {
      if (conceptRelationsBuilder_ == null) {
        ensureConceptRelationsIsMutable();
        conceptRelations_.add(builderForValue.build());
        onChanged();
      } else {
        conceptRelationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The returned concept relations.
     * </pre>
     *
     * <code>repeated .clarifai.api.ConceptRelation concept_relations = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder addConceptRelations(
        int index, com.clarifai.grpc.api.ConceptRelation.Builder builderForValue) {
      if (conceptRelationsBuilder_ == null) {
        ensureConceptRelationsIsMutable();
        conceptRelations_.add(index, builderForValue.build());
        onChanged();
      } else {
        conceptRelationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The returned concept relations.
     * </pre>
     *
     * <code>repeated .clarifai.api.ConceptRelation concept_relations = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder addAllConceptRelations(
        java.lang.Iterable<? extends com.clarifai.grpc.api.ConceptRelation> values) {
      if (conceptRelationsBuilder_ == null) {
        ensureConceptRelationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, conceptRelations_);
        onChanged();
      } else {
        conceptRelationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The returned concept relations.
     * </pre>
     *
     * <code>repeated .clarifai.api.ConceptRelation concept_relations = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder clearConceptRelations() {
      if (conceptRelationsBuilder_ == null) {
        conceptRelations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        conceptRelationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The returned concept relations.
     * </pre>
     *
     * <code>repeated .clarifai.api.ConceptRelation concept_relations = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public Builder removeConceptRelations(int index) {
      if (conceptRelationsBuilder_ == null) {
        ensureConceptRelationsIsMutable();
        conceptRelations_.remove(index);
        onChanged();
      } else {
        conceptRelationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The returned concept relations.
     * </pre>
     *
     * <code>repeated .clarifai.api.ConceptRelation concept_relations = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public com.clarifai.grpc.api.ConceptRelation.Builder getConceptRelationsBuilder(
        int index) {
      return getConceptRelationsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The returned concept relations.
     * </pre>
     *
     * <code>repeated .clarifai.api.ConceptRelation concept_relations = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public com.clarifai.grpc.api.ConceptRelationOrBuilder getConceptRelationsOrBuilder(
        int index) {
      if (conceptRelationsBuilder_ == null) {
        return conceptRelations_.get(index);  } else {
        return conceptRelationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The returned concept relations.
     * </pre>
     *
     * <code>repeated .clarifai.api.ConceptRelation concept_relations = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public java.util.List<? extends com.clarifai.grpc.api.ConceptRelationOrBuilder> 
         getConceptRelationsOrBuilderList() {
      if (conceptRelationsBuilder_ != null) {
        return conceptRelationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(conceptRelations_);
      }
    }
    /**
     * <pre>
     * The returned concept relations.
     * </pre>
     *
     * <code>repeated .clarifai.api.ConceptRelation concept_relations = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public com.clarifai.grpc.api.ConceptRelation.Builder addConceptRelationsBuilder() {
      return getConceptRelationsFieldBuilder().addBuilder(
          com.clarifai.grpc.api.ConceptRelation.getDefaultInstance());
    }
    /**
     * <pre>
     * The returned concept relations.
     * </pre>
     *
     * <code>repeated .clarifai.api.ConceptRelation concept_relations = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public com.clarifai.grpc.api.ConceptRelation.Builder addConceptRelationsBuilder(
        int index) {
      return getConceptRelationsFieldBuilder().addBuilder(
          index, com.clarifai.grpc.api.ConceptRelation.getDefaultInstance());
    }
    /**
     * <pre>
     * The returned concept relations.
     * </pre>
     *
     * <code>repeated .clarifai.api.ConceptRelation concept_relations = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     */
    public java.util.List<com.clarifai.grpc.api.ConceptRelation.Builder> 
         getConceptRelationsBuilderList() {
      return getConceptRelationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.clarifai.grpc.api.ConceptRelation, com.clarifai.grpc.api.ConceptRelation.Builder, com.clarifai.grpc.api.ConceptRelationOrBuilder> 
        getConceptRelationsFieldBuilder() {
      if (conceptRelationsBuilder_ == null) {
        conceptRelationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.clarifai.grpc.api.ConceptRelation, com.clarifai.grpc.api.ConceptRelation.Builder, com.clarifai.grpc.api.ConceptRelationOrBuilder>(
                conceptRelations_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        conceptRelations_ = null;
      }
      return conceptRelationsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.MultiConceptRelationResponse)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.MultiConceptRelationResponse)
  private static final com.clarifai.grpc.api.MultiConceptRelationResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.MultiConceptRelationResponse();
  }

  public static com.clarifai.grpc.api.MultiConceptRelationResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MultiConceptRelationResponse>
      PARSER = new com.google.protobuf.AbstractParser<MultiConceptRelationResponse>() {
    @java.lang.Override
    public MultiConceptRelationResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MultiConceptRelationResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MultiConceptRelationResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MultiConceptRelationResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.MultiConceptRelationResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

