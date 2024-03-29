// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * <pre>
 * ConceptMappingJob
 * </pre>
 *
 * Protobuf type {@code clarifai.api.ConceptMappingJob}
 */
public final class ConceptMappingJob extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.ConceptMappingJob)
    ConceptMappingJobOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConceptMappingJob.newBuilder() to construct.
  private ConceptMappingJob(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConceptMappingJob() {
    knowledgeGraphId_ = "";
    conceptIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConceptMappingJob();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ConceptMappingJob(
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

            knowledgeGraphId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              conceptIds_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            conceptIds_.add(s);
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
        conceptIds_ = conceptIds_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_ConceptMappingJob_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_ConceptMappingJob_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.ConceptMappingJob.class, com.clarifai.grpc.api.ConceptMappingJob.Builder.class);
  }

  public static final int KNOWLEDGE_GRAPH_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object knowledgeGraphId_;
  /**
   * <pre>
   * The id of the knowledge graph being used for this concept mapping job
   * </pre>
   *
   * <code>string knowledge_graph_id = 1;</code>
   * @return The knowledgeGraphId.
   */
  @java.lang.Override
  public java.lang.String getKnowledgeGraphId() {
    java.lang.Object ref = knowledgeGraphId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      knowledgeGraphId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The id of the knowledge graph being used for this concept mapping job
   * </pre>
   *
   * <code>string knowledge_graph_id = 1;</code>
   * @return The bytes for knowledgeGraphId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKnowledgeGraphIdBytes() {
    java.lang.Object ref = knowledgeGraphId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      knowledgeGraphId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONCEPT_IDS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList conceptIds_;
  /**
   * <pre>
   * The ids of the concepts being mapped
   * </pre>
   *
   * <code>repeated string concept_ids = 2;</code>
   * @return A list containing the conceptIds.
   */
  public com.google.protobuf.ProtocolStringList
      getConceptIdsList() {
    return conceptIds_;
  }
  /**
   * <pre>
   * The ids of the concepts being mapped
   * </pre>
   *
   * <code>repeated string concept_ids = 2;</code>
   * @return The count of conceptIds.
   */
  public int getConceptIdsCount() {
    return conceptIds_.size();
  }
  /**
   * <pre>
   * The ids of the concepts being mapped
   * </pre>
   *
   * <code>repeated string concept_ids = 2;</code>
   * @param index The index of the element to return.
   * @return The conceptIds at the given index.
   */
  public java.lang.String getConceptIds(int index) {
    return conceptIds_.get(index);
  }
  /**
   * <pre>
   * The ids of the concepts being mapped
   * </pre>
   *
   * <code>repeated string concept_ids = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the conceptIds at the given index.
   */
  public com.google.protobuf.ByteString
      getConceptIdsBytes(int index) {
    return conceptIds_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(knowledgeGraphId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, knowledgeGraphId_);
    }
    for (int i = 0; i < conceptIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, conceptIds_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(knowledgeGraphId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, knowledgeGraphId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < conceptIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(conceptIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getConceptIdsList().size();
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
    if (!(obj instanceof com.clarifai.grpc.api.ConceptMappingJob)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.ConceptMappingJob other = (com.clarifai.grpc.api.ConceptMappingJob) obj;

    if (!getKnowledgeGraphId()
        .equals(other.getKnowledgeGraphId())) return false;
    if (!getConceptIdsList()
        .equals(other.getConceptIdsList())) return false;
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
    hash = (37 * hash) + KNOWLEDGE_GRAPH_ID_FIELD_NUMBER;
    hash = (53 * hash) + getKnowledgeGraphId().hashCode();
    if (getConceptIdsCount() > 0) {
      hash = (37 * hash) + CONCEPT_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getConceptIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.ConceptMappingJob parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.ConceptMappingJob parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.ConceptMappingJob parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.ConceptMappingJob parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.ConceptMappingJob parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.ConceptMappingJob parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.ConceptMappingJob parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.ConceptMappingJob parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.ConceptMappingJob parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.ConceptMappingJob parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.ConceptMappingJob parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.ConceptMappingJob parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.ConceptMappingJob prototype) {
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
   * ConceptMappingJob
   * </pre>
   *
   * Protobuf type {@code clarifai.api.ConceptMappingJob}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.ConceptMappingJob)
      com.clarifai.grpc.api.ConceptMappingJobOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_ConceptMappingJob_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_ConceptMappingJob_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.ConceptMappingJob.class, com.clarifai.grpc.api.ConceptMappingJob.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.ConceptMappingJob.newBuilder()
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
      knowledgeGraphId_ = "";

      conceptIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_ConceptMappingJob_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.ConceptMappingJob getDefaultInstanceForType() {
      return com.clarifai.grpc.api.ConceptMappingJob.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.ConceptMappingJob build() {
      com.clarifai.grpc.api.ConceptMappingJob result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.ConceptMappingJob buildPartial() {
      com.clarifai.grpc.api.ConceptMappingJob result = new com.clarifai.grpc.api.ConceptMappingJob(this);
      int from_bitField0_ = bitField0_;
      result.knowledgeGraphId_ = knowledgeGraphId_;
      if (((bitField0_ & 0x00000001) != 0)) {
        conceptIds_ = conceptIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.conceptIds_ = conceptIds_;
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
      if (other instanceof com.clarifai.grpc.api.ConceptMappingJob) {
        return mergeFrom((com.clarifai.grpc.api.ConceptMappingJob)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.ConceptMappingJob other) {
      if (other == com.clarifai.grpc.api.ConceptMappingJob.getDefaultInstance()) return this;
      if (!other.getKnowledgeGraphId().isEmpty()) {
        knowledgeGraphId_ = other.knowledgeGraphId_;
        onChanged();
      }
      if (!other.conceptIds_.isEmpty()) {
        if (conceptIds_.isEmpty()) {
          conceptIds_ = other.conceptIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureConceptIdsIsMutable();
          conceptIds_.addAll(other.conceptIds_);
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
      com.clarifai.grpc.api.ConceptMappingJob parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.ConceptMappingJob) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object knowledgeGraphId_ = "";
    /**
     * <pre>
     * The id of the knowledge graph being used for this concept mapping job
     * </pre>
     *
     * <code>string knowledge_graph_id = 1;</code>
     * @return The knowledgeGraphId.
     */
    public java.lang.String getKnowledgeGraphId() {
      java.lang.Object ref = knowledgeGraphId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        knowledgeGraphId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The id of the knowledge graph being used for this concept mapping job
     * </pre>
     *
     * <code>string knowledge_graph_id = 1;</code>
     * @return The bytes for knowledgeGraphId.
     */
    public com.google.protobuf.ByteString
        getKnowledgeGraphIdBytes() {
      java.lang.Object ref = knowledgeGraphId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        knowledgeGraphId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The id of the knowledge graph being used for this concept mapping job
     * </pre>
     *
     * <code>string knowledge_graph_id = 1;</code>
     * @param value The knowledgeGraphId to set.
     * @return This builder for chaining.
     */
    public Builder setKnowledgeGraphId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      knowledgeGraphId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The id of the knowledge graph being used for this concept mapping job
     * </pre>
     *
     * <code>string knowledge_graph_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKnowledgeGraphId() {
      
      knowledgeGraphId_ = getDefaultInstance().getKnowledgeGraphId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The id of the knowledge graph being used for this concept mapping job
     * </pre>
     *
     * <code>string knowledge_graph_id = 1;</code>
     * @param value The bytes for knowledgeGraphId to set.
     * @return This builder for chaining.
     */
    public Builder setKnowledgeGraphIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      knowledgeGraphId_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList conceptIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureConceptIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        conceptIds_ = new com.google.protobuf.LazyStringArrayList(conceptIds_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * The ids of the concepts being mapped
     * </pre>
     *
     * <code>repeated string concept_ids = 2;</code>
     * @return A list containing the conceptIds.
     */
    public com.google.protobuf.ProtocolStringList
        getConceptIdsList() {
      return conceptIds_.getUnmodifiableView();
    }
    /**
     * <pre>
     * The ids of the concepts being mapped
     * </pre>
     *
     * <code>repeated string concept_ids = 2;</code>
     * @return The count of conceptIds.
     */
    public int getConceptIdsCount() {
      return conceptIds_.size();
    }
    /**
     * <pre>
     * The ids of the concepts being mapped
     * </pre>
     *
     * <code>repeated string concept_ids = 2;</code>
     * @param index The index of the element to return.
     * @return The conceptIds at the given index.
     */
    public java.lang.String getConceptIds(int index) {
      return conceptIds_.get(index);
    }
    /**
     * <pre>
     * The ids of the concepts being mapped
     * </pre>
     *
     * <code>repeated string concept_ids = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the conceptIds at the given index.
     */
    public com.google.protobuf.ByteString
        getConceptIdsBytes(int index) {
      return conceptIds_.getByteString(index);
    }
    /**
     * <pre>
     * The ids of the concepts being mapped
     * </pre>
     *
     * <code>repeated string concept_ids = 2;</code>
     * @param index The index to set the value at.
     * @param value The conceptIds to set.
     * @return This builder for chaining.
     */
    public Builder setConceptIds(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureConceptIdsIsMutable();
      conceptIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ids of the concepts being mapped
     * </pre>
     *
     * <code>repeated string concept_ids = 2;</code>
     * @param value The conceptIds to add.
     * @return This builder for chaining.
     */
    public Builder addConceptIds(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureConceptIdsIsMutable();
      conceptIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ids of the concepts being mapped
     * </pre>
     *
     * <code>repeated string concept_ids = 2;</code>
     * @param values The conceptIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllConceptIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureConceptIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, conceptIds_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ids of the concepts being mapped
     * </pre>
     *
     * <code>repeated string concept_ids = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearConceptIds() {
      conceptIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ids of the concepts being mapped
     * </pre>
     *
     * <code>repeated string concept_ids = 2;</code>
     * @param value The bytes of the conceptIds to add.
     * @return This builder for chaining.
     */
    public Builder addConceptIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureConceptIdsIsMutable();
      conceptIds_.add(value);
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.ConceptMappingJob)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.ConceptMappingJob)
  private static final com.clarifai.grpc.api.ConceptMappingJob DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.ConceptMappingJob();
  }

  public static com.clarifai.grpc.api.ConceptMappingJob getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConceptMappingJob>
      PARSER = new com.google.protobuf.AbstractParser<ConceptMappingJob>() {
    @java.lang.Override
    public ConceptMappingJob parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ConceptMappingJob(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ConceptMappingJob> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConceptMappingJob> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.ConceptMappingJob getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

