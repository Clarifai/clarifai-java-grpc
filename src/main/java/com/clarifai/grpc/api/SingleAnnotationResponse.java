// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

/**
 * <pre>
 * SingleAnnotationResponse
 * </pre>
 *
 * Protobuf type {@code clarifai.api.SingleAnnotationResponse}
 */
public  final class SingleAnnotationResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.SingleAnnotationResponse)
    SingleAnnotationResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SingleAnnotationResponse.newBuilder() to construct.
  private SingleAnnotationResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SingleAnnotationResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SingleAnnotationResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SingleAnnotationResponse(
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
            com.clarifai.grpc.api.Annotation.Builder subBuilder = null;
            if (annotation_ != null) {
              subBuilder = annotation_.toBuilder();
            }
            annotation_ = input.readMessage(com.clarifai.grpc.api.Annotation.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(annotation_);
              annotation_ = subBuilder.buildPartial();
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
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_SingleAnnotationResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Service.internal_static_clarifai_api_SingleAnnotationResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.SingleAnnotationResponse.class, com.clarifai.grpc.api.SingleAnnotationResponse.Builder.class);
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private com.clarifai.grpc.api.status.Status status_;
  /**
   * <code>.clarifai.api.status.Status status = 1;</code>
   * @return Whether the status field is set.
   */
  public boolean hasStatus() {
    return status_ != null;
  }
  /**
   * <code>.clarifai.api.status.Status status = 1;</code>
   * @return The status.
   */
  public com.clarifai.grpc.api.status.Status getStatus() {
    return status_ == null ? com.clarifai.grpc.api.status.Status.getDefaultInstance() : status_;
  }
  /**
   * <code>.clarifai.api.status.Status status = 1;</code>
   */
  public com.clarifai.grpc.api.status.StatusOrBuilder getStatusOrBuilder() {
    return getStatus();
  }

  public static final int ANNOTATION_FIELD_NUMBER = 2;
  private com.clarifai.grpc.api.Annotation annotation_;
  /**
   * <code>.clarifai.api.Annotation annotation = 2;</code>
   * @return Whether the annotation field is set.
   */
  public boolean hasAnnotation() {
    return annotation_ != null;
  }
  /**
   * <code>.clarifai.api.Annotation annotation = 2;</code>
   * @return The annotation.
   */
  public com.clarifai.grpc.api.Annotation getAnnotation() {
    return annotation_ == null ? com.clarifai.grpc.api.Annotation.getDefaultInstance() : annotation_;
  }
  /**
   * <code>.clarifai.api.Annotation annotation = 2;</code>
   */
  public com.clarifai.grpc.api.AnnotationOrBuilder getAnnotationOrBuilder() {
    return getAnnotation();
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
    if (annotation_ != null) {
      output.writeMessage(2, getAnnotation());
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
    if (annotation_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAnnotation());
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
    if (!(obj instanceof com.clarifai.grpc.api.SingleAnnotationResponse)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.SingleAnnotationResponse other = (com.clarifai.grpc.api.SingleAnnotationResponse) obj;

    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (!getStatus()
          .equals(other.getStatus())) return false;
    }
    if (hasAnnotation() != other.hasAnnotation()) return false;
    if (hasAnnotation()) {
      if (!getAnnotation()
          .equals(other.getAnnotation())) return false;
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
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatus().hashCode();
    }
    if (hasAnnotation()) {
      hash = (37 * hash) + ANNOTATION_FIELD_NUMBER;
      hash = (53 * hash) + getAnnotation().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.SingleAnnotationResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.SingleAnnotationResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.SingleAnnotationResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.SingleAnnotationResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.SingleAnnotationResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.SingleAnnotationResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.SingleAnnotationResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.SingleAnnotationResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.SingleAnnotationResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.SingleAnnotationResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.SingleAnnotationResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.SingleAnnotationResponse parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.SingleAnnotationResponse prototype) {
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
   * SingleAnnotationResponse
   * </pre>
   *
   * Protobuf type {@code clarifai.api.SingleAnnotationResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.SingleAnnotationResponse)
      com.clarifai.grpc.api.SingleAnnotationResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_SingleAnnotationResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_SingleAnnotationResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.SingleAnnotationResponse.class, com.clarifai.grpc.api.SingleAnnotationResponse.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.SingleAnnotationResponse.newBuilder()
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
      if (statusBuilder_ == null) {
        status_ = null;
      } else {
        status_ = null;
        statusBuilder_ = null;
      }
      if (annotationBuilder_ == null) {
        annotation_ = null;
      } else {
        annotation_ = null;
        annotationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Service.internal_static_clarifai_api_SingleAnnotationResponse_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.SingleAnnotationResponse getDefaultInstanceForType() {
      return com.clarifai.grpc.api.SingleAnnotationResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.SingleAnnotationResponse build() {
      com.clarifai.grpc.api.SingleAnnotationResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.SingleAnnotationResponse buildPartial() {
      com.clarifai.grpc.api.SingleAnnotationResponse result = new com.clarifai.grpc.api.SingleAnnotationResponse(this);
      if (statusBuilder_ == null) {
        result.status_ = status_;
      } else {
        result.status_ = statusBuilder_.build();
      }
      if (annotationBuilder_ == null) {
        result.annotation_ = annotation_;
      } else {
        result.annotation_ = annotationBuilder_.build();
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
      if (other instanceof com.clarifai.grpc.api.SingleAnnotationResponse) {
        return mergeFrom((com.clarifai.grpc.api.SingleAnnotationResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.SingleAnnotationResponse other) {
      if (other == com.clarifai.grpc.api.SingleAnnotationResponse.getDefaultInstance()) return this;
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
      }
      if (other.hasAnnotation()) {
        mergeAnnotation(other.getAnnotation());
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
      com.clarifai.grpc.api.SingleAnnotationResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.SingleAnnotationResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.clarifai.grpc.api.status.Status status_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.status.Status, com.clarifai.grpc.api.status.Status.Builder, com.clarifai.grpc.api.status.StatusOrBuilder> statusBuilder_;
    /**
     * <code>.clarifai.api.status.Status status = 1;</code>
     * @return Whether the status field is set.
     */
    public boolean hasStatus() {
      return statusBuilder_ != null || status_ != null;
    }
    /**
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
     * <code>.clarifai.api.status.Status status = 1;</code>
     */
    public com.clarifai.grpc.api.status.Status.Builder getStatusBuilder() {
      
      onChanged();
      return getStatusFieldBuilder().getBuilder();
    }
    /**
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

    private com.clarifai.grpc.api.Annotation annotation_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.Annotation, com.clarifai.grpc.api.Annotation.Builder, com.clarifai.grpc.api.AnnotationOrBuilder> annotationBuilder_;
    /**
     * <code>.clarifai.api.Annotation annotation = 2;</code>
     * @return Whether the annotation field is set.
     */
    public boolean hasAnnotation() {
      return annotationBuilder_ != null || annotation_ != null;
    }
    /**
     * <code>.clarifai.api.Annotation annotation = 2;</code>
     * @return The annotation.
     */
    public com.clarifai.grpc.api.Annotation getAnnotation() {
      if (annotationBuilder_ == null) {
        return annotation_ == null ? com.clarifai.grpc.api.Annotation.getDefaultInstance() : annotation_;
      } else {
        return annotationBuilder_.getMessage();
      }
    }
    /**
     * <code>.clarifai.api.Annotation annotation = 2;</code>
     */
    public Builder setAnnotation(com.clarifai.grpc.api.Annotation value) {
      if (annotationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        annotation_ = value;
        onChanged();
      } else {
        annotationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.clarifai.api.Annotation annotation = 2;</code>
     */
    public Builder setAnnotation(
        com.clarifai.grpc.api.Annotation.Builder builderForValue) {
      if (annotationBuilder_ == null) {
        annotation_ = builderForValue.build();
        onChanged();
      } else {
        annotationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.clarifai.api.Annotation annotation = 2;</code>
     */
    public Builder mergeAnnotation(com.clarifai.grpc.api.Annotation value) {
      if (annotationBuilder_ == null) {
        if (annotation_ != null) {
          annotation_ =
            com.clarifai.grpc.api.Annotation.newBuilder(annotation_).mergeFrom(value).buildPartial();
        } else {
          annotation_ = value;
        }
        onChanged();
      } else {
        annotationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.clarifai.api.Annotation annotation = 2;</code>
     */
    public Builder clearAnnotation() {
      if (annotationBuilder_ == null) {
        annotation_ = null;
        onChanged();
      } else {
        annotation_ = null;
        annotationBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.clarifai.api.Annotation annotation = 2;</code>
     */
    public com.clarifai.grpc.api.Annotation.Builder getAnnotationBuilder() {
      
      onChanged();
      return getAnnotationFieldBuilder().getBuilder();
    }
    /**
     * <code>.clarifai.api.Annotation annotation = 2;</code>
     */
    public com.clarifai.grpc.api.AnnotationOrBuilder getAnnotationOrBuilder() {
      if (annotationBuilder_ != null) {
        return annotationBuilder_.getMessageOrBuilder();
      } else {
        return annotation_ == null ?
            com.clarifai.grpc.api.Annotation.getDefaultInstance() : annotation_;
      }
    }
    /**
     * <code>.clarifai.api.Annotation annotation = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.Annotation, com.clarifai.grpc.api.Annotation.Builder, com.clarifai.grpc.api.AnnotationOrBuilder> 
        getAnnotationFieldBuilder() {
      if (annotationBuilder_ == null) {
        annotationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.clarifai.grpc.api.Annotation, com.clarifai.grpc.api.Annotation.Builder, com.clarifai.grpc.api.AnnotationOrBuilder>(
                getAnnotation(),
                getParentForChildren(),
                isClean());
        annotation_ = null;
      }
      return annotationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.SingleAnnotationResponse)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.SingleAnnotationResponse)
  private static final com.clarifai.grpc.api.SingleAnnotationResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.SingleAnnotationResponse();
  }

  public static com.clarifai.grpc.api.SingleAnnotationResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SingleAnnotationResponse>
      PARSER = new com.google.protobuf.AbstractParser<SingleAnnotationResponse>() {
    @java.lang.Override
    public SingleAnnotationResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SingleAnnotationResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SingleAnnotationResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SingleAnnotationResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.SingleAnnotationResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

