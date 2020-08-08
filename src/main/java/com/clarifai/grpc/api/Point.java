// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * Protobuf type {@code clarifai.api.Point}
 */
public  final class Point extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.Point)
    PointOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Point.newBuilder() to construct.
  private Point(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Point() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Point();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Point(
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
          case 13: {

            row_ = input.readFloat();
            break;
          }
          case 21: {

            col_ = input.readFloat();
            break;
          }
          case 29: {

            z_ = input.readFloat();
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
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Point_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Point_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.Point.class, com.clarifai.grpc.api.Point.Builder.class);
  }

  public static final int ROW_FIELD_NUMBER = 1;
  private float row_;
  /**
   * <pre>
   * The row location of the point. This has a [0.0-1.0] range with 0.0 being top row and 1.0
   * being the bottom row.
   * </pre>
   *
   * <code>float row = 1 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The row.
   */
  public float getRow() {
    return row_;
  }

  public static final int COL_FIELD_NUMBER = 2;
  private float col_;
  /**
   * <pre>
   * The column location of the point. This has a [0.0-1.0] range with 0.0 being left col and 1.0
   * being the right col.
   * </pre>
   *
   * <code>float col = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The col.
   */
  public float getCol() {
    return col_;
  }

  public static final int Z_FIELD_NUMBER = 3;
  private float z_;
  /**
   * <pre>
   * Depth if applicable for the point.
   * </pre>
   *
   * <code>float z = 3;</code>
   * @return The z.
   */
  public float getZ() {
    return z_;
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
    if (row_ != 0F) {
      output.writeFloat(1, row_);
    }
    if (col_ != 0F) {
      output.writeFloat(2, col_);
    }
    if (z_ != 0F) {
      output.writeFloat(3, z_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (row_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, row_);
    }
    if (col_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, col_);
    }
    if (z_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, z_);
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
    if (!(obj instanceof com.clarifai.grpc.api.Point)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.Point other = (com.clarifai.grpc.api.Point) obj;

    if (java.lang.Float.floatToIntBits(getRow())
        != java.lang.Float.floatToIntBits(
            other.getRow())) return false;
    if (java.lang.Float.floatToIntBits(getCol())
        != java.lang.Float.floatToIntBits(
            other.getCol())) return false;
    if (java.lang.Float.floatToIntBits(getZ())
        != java.lang.Float.floatToIntBits(
            other.getZ())) return false;
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
    hash = (37 * hash) + ROW_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getRow());
    hash = (37 * hash) + COL_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getCol());
    hash = (37 * hash) + Z_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getZ());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.Point parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.Point parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Point parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.Point parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Point parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.Point parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Point parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.Point parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Point parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.Point parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Point parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.Point parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.Point prototype) {
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
   * Protobuf type {@code clarifai.api.Point}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.Point)
      com.clarifai.grpc.api.PointOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Point_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Point_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.Point.class, com.clarifai.grpc.api.Point.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.Point.newBuilder()
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
      row_ = 0F;

      col_ = 0F;

      z_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Point_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.Point getDefaultInstanceForType() {
      return com.clarifai.grpc.api.Point.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.Point build() {
      com.clarifai.grpc.api.Point result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.Point buildPartial() {
      com.clarifai.grpc.api.Point result = new com.clarifai.grpc.api.Point(this);
      result.row_ = row_;
      result.col_ = col_;
      result.z_ = z_;
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
      if (other instanceof com.clarifai.grpc.api.Point) {
        return mergeFrom((com.clarifai.grpc.api.Point)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.Point other) {
      if (other == com.clarifai.grpc.api.Point.getDefaultInstance()) return this;
      if (other.getRow() != 0F) {
        setRow(other.getRow());
      }
      if (other.getCol() != 0F) {
        setCol(other.getCol());
      }
      if (other.getZ() != 0F) {
        setZ(other.getZ());
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
      com.clarifai.grpc.api.Point parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.Point) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float row_ ;
    /**
     * <pre>
     * The row location of the point. This has a [0.0-1.0] range with 0.0 being top row and 1.0
     * being the bottom row.
     * </pre>
     *
     * <code>float row = 1 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @return The row.
     */
    public float getRow() {
      return row_;
    }
    /**
     * <pre>
     * The row location of the point. This has a [0.0-1.0] range with 0.0 being top row and 1.0
     * being the bottom row.
     * </pre>
     *
     * <code>float row = 1 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @param value The row to set.
     * @return This builder for chaining.
     */
    public Builder setRow(float value) {
      
      row_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The row location of the point. This has a [0.0-1.0] range with 0.0 being top row and 1.0
     * being the bottom row.
     * </pre>
     *
     * <code>float row = 1 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @return This builder for chaining.
     */
    public Builder clearRow() {
      
      row_ = 0F;
      onChanged();
      return this;
    }

    private float col_ ;
    /**
     * <pre>
     * The column location of the point. This has a [0.0-1.0] range with 0.0 being left col and 1.0
     * being the right col.
     * </pre>
     *
     * <code>float col = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @return The col.
     */
    public float getCol() {
      return col_;
    }
    /**
     * <pre>
     * The column location of the point. This has a [0.0-1.0] range with 0.0 being left col and 1.0
     * being the right col.
     * </pre>
     *
     * <code>float col = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @param value The col to set.
     * @return This builder for chaining.
     */
    public Builder setCol(float value) {
      
      col_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The column location of the point. This has a [0.0-1.0] range with 0.0 being left col and 1.0
     * being the right col.
     * </pre>
     *
     * <code>float col = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
     * @return This builder for chaining.
     */
    public Builder clearCol() {
      
      col_ = 0F;
      onChanged();
      return this;
    }

    private float z_ ;
    /**
     * <pre>
     * Depth if applicable for the point.
     * </pre>
     *
     * <code>float z = 3;</code>
     * @return The z.
     */
    public float getZ() {
      return z_;
    }
    /**
     * <pre>
     * Depth if applicable for the point.
     * </pre>
     *
     * <code>float z = 3;</code>
     * @param value The z to set.
     * @return This builder for chaining.
     */
    public Builder setZ(float value) {
      
      z_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Depth if applicable for the point.
     * </pre>
     *
     * <code>float z = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearZ() {
      
      z_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.Point)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.Point)
  private static final com.clarifai.grpc.api.Point DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.Point();
  }

  public static com.clarifai.grpc.api.Point getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Point>
      PARSER = new com.google.protobuf.AbstractParser<Point>() {
    @java.lang.Override
    public Point parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Point(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Point> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Point> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.Point getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
