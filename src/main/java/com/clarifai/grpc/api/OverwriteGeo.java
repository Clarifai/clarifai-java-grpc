// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * Protobuf type {@code clarifai.api.OverwriteGeo}
 */
public final class OverwriteGeo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.OverwriteGeo)
    OverwriteGeoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OverwriteGeo.newBuilder() to construct.
  private OverwriteGeo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OverwriteGeo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OverwriteGeo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OverwriteGeo(
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
            com.clarifai.grpc.api.Geo.Builder subBuilder = null;
            if (geo_ != null) {
              subBuilder = geo_.toBuilder();
            }
            geo_ = input.readMessage(com.clarifai.grpc.api.Geo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(geo_);
              geo_ = subBuilder.buildPartial();
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
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_OverwriteGeo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_OverwriteGeo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.OverwriteGeo.class, com.clarifai.grpc.api.OverwriteGeo.Builder.class);
  }

  public static final int GEO_FIELD_NUMBER = 1;
  private com.clarifai.grpc.api.Geo geo_;
  /**
   * <pre>
   * Geo info
   * </pre>
   *
   * <code>.clarifai.api.Geo geo = 1;</code>
   * @return Whether the geo field is set.
   */
  @java.lang.Override
  public boolean hasGeo() {
    return geo_ != null;
  }
  /**
   * <pre>
   * Geo info
   * </pre>
   *
   * <code>.clarifai.api.Geo geo = 1;</code>
   * @return The geo.
   */
  @java.lang.Override
  public com.clarifai.grpc.api.Geo getGeo() {
    return geo_ == null ? com.clarifai.grpc.api.Geo.getDefaultInstance() : geo_;
  }
  /**
   * <pre>
   * Geo info
   * </pre>
   *
   * <code>.clarifai.api.Geo geo = 1;</code>
   */
  @java.lang.Override
  public com.clarifai.grpc.api.GeoOrBuilder getGeoOrBuilder() {
    return getGeo();
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
    if (geo_ != null) {
      output.writeMessage(1, getGeo());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (geo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getGeo());
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
    if (!(obj instanceof com.clarifai.grpc.api.OverwriteGeo)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.OverwriteGeo other = (com.clarifai.grpc.api.OverwriteGeo) obj;

    if (hasGeo() != other.hasGeo()) return false;
    if (hasGeo()) {
      if (!getGeo()
          .equals(other.getGeo())) return false;
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
    if (hasGeo()) {
      hash = (37 * hash) + GEO_FIELD_NUMBER;
      hash = (53 * hash) + getGeo().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.OverwriteGeo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.OverwriteGeo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.OverwriteGeo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.OverwriteGeo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.OverwriteGeo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.OverwriteGeo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.OverwriteGeo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.OverwriteGeo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.OverwriteGeo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.OverwriteGeo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.OverwriteGeo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.OverwriteGeo parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.OverwriteGeo prototype) {
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
   * Protobuf type {@code clarifai.api.OverwriteGeo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.OverwriteGeo)
      com.clarifai.grpc.api.OverwriteGeoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_OverwriteGeo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_OverwriteGeo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.OverwriteGeo.class, com.clarifai.grpc.api.OverwriteGeo.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.OverwriteGeo.newBuilder()
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
      if (geoBuilder_ == null) {
        geo_ = null;
      } else {
        geo_ = null;
        geoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_OverwriteGeo_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.OverwriteGeo getDefaultInstanceForType() {
      return com.clarifai.grpc.api.OverwriteGeo.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.OverwriteGeo build() {
      com.clarifai.grpc.api.OverwriteGeo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.OverwriteGeo buildPartial() {
      com.clarifai.grpc.api.OverwriteGeo result = new com.clarifai.grpc.api.OverwriteGeo(this);
      if (geoBuilder_ == null) {
        result.geo_ = geo_;
      } else {
        result.geo_ = geoBuilder_.build();
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
      if (other instanceof com.clarifai.grpc.api.OverwriteGeo) {
        return mergeFrom((com.clarifai.grpc.api.OverwriteGeo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.OverwriteGeo other) {
      if (other == com.clarifai.grpc.api.OverwriteGeo.getDefaultInstance()) return this;
      if (other.hasGeo()) {
        mergeGeo(other.getGeo());
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
      com.clarifai.grpc.api.OverwriteGeo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.OverwriteGeo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.clarifai.grpc.api.Geo geo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.Geo, com.clarifai.grpc.api.Geo.Builder, com.clarifai.grpc.api.GeoOrBuilder> geoBuilder_;
    /**
     * <pre>
     * Geo info
     * </pre>
     *
     * <code>.clarifai.api.Geo geo = 1;</code>
     * @return Whether the geo field is set.
     */
    public boolean hasGeo() {
      return geoBuilder_ != null || geo_ != null;
    }
    /**
     * <pre>
     * Geo info
     * </pre>
     *
     * <code>.clarifai.api.Geo geo = 1;</code>
     * @return The geo.
     */
    public com.clarifai.grpc.api.Geo getGeo() {
      if (geoBuilder_ == null) {
        return geo_ == null ? com.clarifai.grpc.api.Geo.getDefaultInstance() : geo_;
      } else {
        return geoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Geo info
     * </pre>
     *
     * <code>.clarifai.api.Geo geo = 1;</code>
     */
    public Builder setGeo(com.clarifai.grpc.api.Geo value) {
      if (geoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        geo_ = value;
        onChanged();
      } else {
        geoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Geo info
     * </pre>
     *
     * <code>.clarifai.api.Geo geo = 1;</code>
     */
    public Builder setGeo(
        com.clarifai.grpc.api.Geo.Builder builderForValue) {
      if (geoBuilder_ == null) {
        geo_ = builderForValue.build();
        onChanged();
      } else {
        geoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Geo info
     * </pre>
     *
     * <code>.clarifai.api.Geo geo = 1;</code>
     */
    public Builder mergeGeo(com.clarifai.grpc.api.Geo value) {
      if (geoBuilder_ == null) {
        if (geo_ != null) {
          geo_ =
            com.clarifai.grpc.api.Geo.newBuilder(geo_).mergeFrom(value).buildPartial();
        } else {
          geo_ = value;
        }
        onChanged();
      } else {
        geoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Geo info
     * </pre>
     *
     * <code>.clarifai.api.Geo geo = 1;</code>
     */
    public Builder clearGeo() {
      if (geoBuilder_ == null) {
        geo_ = null;
        onChanged();
      } else {
        geo_ = null;
        geoBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Geo info
     * </pre>
     *
     * <code>.clarifai.api.Geo geo = 1;</code>
     */
    public com.clarifai.grpc.api.Geo.Builder getGeoBuilder() {
      
      onChanged();
      return getGeoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Geo info
     * </pre>
     *
     * <code>.clarifai.api.Geo geo = 1;</code>
     */
    public com.clarifai.grpc.api.GeoOrBuilder getGeoOrBuilder() {
      if (geoBuilder_ != null) {
        return geoBuilder_.getMessageOrBuilder();
      } else {
        return geo_ == null ?
            com.clarifai.grpc.api.Geo.getDefaultInstance() : geo_;
      }
    }
    /**
     * <pre>
     * Geo info
     * </pre>
     *
     * <code>.clarifai.api.Geo geo = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.Geo, com.clarifai.grpc.api.Geo.Builder, com.clarifai.grpc.api.GeoOrBuilder> 
        getGeoFieldBuilder() {
      if (geoBuilder_ == null) {
        geoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.clarifai.grpc.api.Geo, com.clarifai.grpc.api.Geo.Builder, com.clarifai.grpc.api.GeoOrBuilder>(
                getGeo(),
                getParentForChildren(),
                isClean());
        geo_ = null;
      }
      return geoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.OverwriteGeo)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.OverwriteGeo)
  private static final com.clarifai.grpc.api.OverwriteGeo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.OverwriteGeo();
  }

  public static com.clarifai.grpc.api.OverwriteGeo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OverwriteGeo>
      PARSER = new com.google.protobuf.AbstractParser<OverwriteGeo>() {
    @java.lang.Override
    public OverwriteGeo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OverwriteGeo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OverwriteGeo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OverwriteGeo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.OverwriteGeo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

