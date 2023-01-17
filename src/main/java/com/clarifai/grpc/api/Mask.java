// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * <pre>
 * Segmentation mask.
 * </pre>
 *
 * Protobuf type {@code clarifai.api.Mask}
 */
public final class Mask extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.Mask)
    MaskOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Mask.newBuilder() to construct.
  private Mask(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Mask() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Mask();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Mask(
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
          case 18: {
            com.clarifai.grpc.api.Image.Builder subBuilder = null;
            if (image_ != null) {
              subBuilder = image_.toBuilder();
            }
            image_ = input.readMessage(com.clarifai.grpc.api.Image.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(image_);
              image_ = subBuilder.buildPartial();
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
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Mask_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Mask_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.Mask.class, com.clarifai.grpc.api.Mask.Builder.class);
  }

  public static final int IMAGE_FIELD_NUMBER = 2;
  private com.clarifai.grpc.api.Image image_;
  /**
   * <pre>
   * The image of the mask in a non-raster format.
   * </pre>
   *
   * <code>.clarifai.api.Image image = 2;</code>
   * @return Whether the image field is set.
   */
  @java.lang.Override
  public boolean hasImage() {
    return image_ != null;
  }
  /**
   * <pre>
   * The image of the mask in a non-raster format.
   * </pre>
   *
   * <code>.clarifai.api.Image image = 2;</code>
   * @return The image.
   */
  @java.lang.Override
  public com.clarifai.grpc.api.Image getImage() {
    return image_ == null ? com.clarifai.grpc.api.Image.getDefaultInstance() : image_;
  }
  /**
   * <pre>
   * The image of the mask in a non-raster format.
   * </pre>
   *
   * <code>.clarifai.api.Image image = 2;</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.ImageOrBuilder getImageOrBuilder() {
    return getImage();
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
    if (image_ != null) {
      output.writeMessage(2, getImage());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (image_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getImage());
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
    if (!(obj instanceof com.clarifai.grpc.api.Mask)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.Mask other = (com.clarifai.grpc.api.Mask) obj;

    if (hasImage() != other.hasImage()) return false;
    if (hasImage()) {
      if (!getImage()
          .equals(other.getImage())) return false;
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
    if (hasImage()) {
      hash = (37 * hash) + IMAGE_FIELD_NUMBER;
      hash = (53 * hash) + getImage().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.Mask parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.Mask parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Mask parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.Mask parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Mask parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.Mask parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Mask parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.Mask parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Mask parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.Mask parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Mask parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.Mask parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.Mask prototype) {
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
   * Segmentation mask.
   * </pre>
   *
   * Protobuf type {@code clarifai.api.Mask}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.Mask)
      com.clarifai.grpc.api.MaskOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Mask_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Mask_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.Mask.class, com.clarifai.grpc.api.Mask.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.Mask.newBuilder()
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
      if (imageBuilder_ == null) {
        image_ = null;
      } else {
        image_ = null;
        imageBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Mask_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.Mask getDefaultInstanceForType() {
      return com.clarifai.grpc.api.Mask.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.Mask build() {
      com.clarifai.grpc.api.Mask result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.Mask buildPartial() {
      com.clarifai.grpc.api.Mask result = new com.clarifai.grpc.api.Mask(this);
      if (imageBuilder_ == null) {
        result.image_ = image_;
      } else {
        result.image_ = imageBuilder_.build();
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
      if (other instanceof com.clarifai.grpc.api.Mask) {
        return mergeFrom((com.clarifai.grpc.api.Mask)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.Mask other) {
      if (other == com.clarifai.grpc.api.Mask.getDefaultInstance()) return this;
      if (other.hasImage()) {
        mergeImage(other.getImage());
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
      com.clarifai.grpc.api.Mask parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.Mask) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.clarifai.grpc.api.Image image_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.Image, com.clarifai.grpc.api.Image.Builder, com.clarifai.grpc.api.ImageOrBuilder> imageBuilder_;
    /**
     * <pre>
     * The image of the mask in a non-raster format.
     * </pre>
     *
     * <code>.clarifai.api.Image image = 2;</code>
     * @return Whether the image field is set.
     */
    public boolean hasImage() {
      return imageBuilder_ != null || image_ != null;
    }
    /**
     * <pre>
     * The image of the mask in a non-raster format.
     * </pre>
     *
     * <code>.clarifai.api.Image image = 2;</code>
     * @return The image.
     */
    public com.clarifai.grpc.api.Image getImage() {
      if (imageBuilder_ == null) {
        return image_ == null ? com.clarifai.grpc.api.Image.getDefaultInstance() : image_;
      } else {
        return imageBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The image of the mask in a non-raster format.
     * </pre>
     *
     * <code>.clarifai.api.Image image = 2;</code>
     */
    public Builder setImage(com.clarifai.grpc.api.Image value) {
      if (imageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        image_ = value;
        onChanged();
      } else {
        imageBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The image of the mask in a non-raster format.
     * </pre>
     *
     * <code>.clarifai.api.Image image = 2;</code>
     */
    public Builder setImage(
        com.clarifai.grpc.api.Image.Builder builderForValue) {
      if (imageBuilder_ == null) {
        image_ = builderForValue.build();
        onChanged();
      } else {
        imageBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The image of the mask in a non-raster format.
     * </pre>
     *
     * <code>.clarifai.api.Image image = 2;</code>
     */
    public Builder mergeImage(com.clarifai.grpc.api.Image value) {
      if (imageBuilder_ == null) {
        if (image_ != null) {
          image_ =
            com.clarifai.grpc.api.Image.newBuilder(image_).mergeFrom(value).buildPartial();
        } else {
          image_ = value;
        }
        onChanged();
      } else {
        imageBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The image of the mask in a non-raster format.
     * </pre>
     *
     * <code>.clarifai.api.Image image = 2;</code>
     */
    public Builder clearImage() {
      if (imageBuilder_ == null) {
        image_ = null;
        onChanged();
      } else {
        image_ = null;
        imageBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The image of the mask in a non-raster format.
     * </pre>
     *
     * <code>.clarifai.api.Image image = 2;</code>
     */
    public com.clarifai.grpc.api.Image.Builder getImageBuilder() {
      
      onChanged();
      return getImageFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The image of the mask in a non-raster format.
     * </pre>
     *
     * <code>.clarifai.api.Image image = 2;</code>
     */
    public com.clarifai.grpc.api.ImageOrBuilder getImageOrBuilder() {
      if (imageBuilder_ != null) {
        return imageBuilder_.getMessageOrBuilder();
      } else {
        return image_ == null ?
            com.clarifai.grpc.api.Image.getDefaultInstance() : image_;
      }
    }
    /**
     * <pre>
     * The image of the mask in a non-raster format.
     * </pre>
     *
     * <code>.clarifai.api.Image image = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.Image, com.clarifai.grpc.api.Image.Builder, com.clarifai.grpc.api.ImageOrBuilder> 
        getImageFieldBuilder() {
      if (imageBuilder_ == null) {
        imageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.clarifai.grpc.api.Image, com.clarifai.grpc.api.Image.Builder, com.clarifai.grpc.api.ImageOrBuilder>(
                getImage(),
                getParentForChildren(),
                isClean());
        image_ = null;
      }
      return imageBuilder_;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.Mask)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.Mask)
  private static final com.clarifai.grpc.api.Mask DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.Mask();
  }

  public static com.clarifai.grpc.api.Mask getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Mask>
      PARSER = new com.google.protobuf.AbstractParser<Mask>() {
    @java.lang.Override
    public Mask parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Mask(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Mask> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Mask> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.Mask getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

