// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * Protobuf type {@code clarifai.api.Face}
 */
public  final class Face extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.Face)
    FaceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Face.newBuilder() to construct.
  private Face(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Face() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Face();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Face(
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
            com.clarifai.grpc.api.FaceIdentity.Builder subBuilder = null;
            if (identity_ != null) {
              subBuilder = identity_.toBuilder();
            }
            identity_ = input.readMessage(com.clarifai.grpc.api.FaceIdentity.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(identity_);
              identity_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.clarifai.grpc.api.FaceAge.Builder subBuilder = null;
            if (ageAppearance_ != null) {
              subBuilder = ageAppearance_.toBuilder();
            }
            ageAppearance_ = input.readMessage(com.clarifai.grpc.api.FaceAge.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(ageAppearance_);
              ageAppearance_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.clarifai.grpc.api.FaceGenderIdentity.Builder subBuilder = null;
            if (genderAppearance_ != null) {
              subBuilder = genderAppearance_.toBuilder();
            }
            genderAppearance_ = input.readMessage(com.clarifai.grpc.api.FaceGenderIdentity.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(genderAppearance_);
              genderAppearance_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            com.clarifai.grpc.api.FaceMCAffinity.Builder subBuilder = null;
            if (multiculturalAppearance_ != null) {
              subBuilder = multiculturalAppearance_.toBuilder();
            }
            multiculturalAppearance_ = input.readMessage(com.clarifai.grpc.api.FaceMCAffinity.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(multiculturalAppearance_);
              multiculturalAppearance_ = subBuilder.buildPartial();
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
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Face_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Face_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.Face.class, com.clarifai.grpc.api.Face.Builder.class);
  }

  public static final int IDENTITY_FIELD_NUMBER = 1;
  private com.clarifai.grpc.api.FaceIdentity identity_;
  /**
   * <code>.clarifai.api.FaceIdentity identity = 1;</code>
   */
  public boolean hasIdentity() {
    return identity_ != null;
  }
  /**
   * <code>.clarifai.api.FaceIdentity identity = 1;</code>
   */
  public com.clarifai.grpc.api.FaceIdentity getIdentity() {
    return identity_ == null ? com.clarifai.grpc.api.FaceIdentity.getDefaultInstance() : identity_;
  }
  /**
   * <code>.clarifai.api.FaceIdentity identity = 1;</code>
   */
  public com.clarifai.grpc.api.FaceIdentityOrBuilder getIdentityOrBuilder() {
    return getIdentity();
  }

  public static final int AGE_APPEARANCE_FIELD_NUMBER = 2;
  private com.clarifai.grpc.api.FaceAge ageAppearance_;
  /**
   * <code>.clarifai.api.FaceAge age_appearance = 2;</code>
   */
  public boolean hasAgeAppearance() {
    return ageAppearance_ != null;
  }
  /**
   * <code>.clarifai.api.FaceAge age_appearance = 2;</code>
   */
  public com.clarifai.grpc.api.FaceAge getAgeAppearance() {
    return ageAppearance_ == null ? com.clarifai.grpc.api.FaceAge.getDefaultInstance() : ageAppearance_;
  }
  /**
   * <code>.clarifai.api.FaceAge age_appearance = 2;</code>
   */
  public com.clarifai.grpc.api.FaceAgeOrBuilder getAgeAppearanceOrBuilder() {
    return getAgeAppearance();
  }

  public static final int GENDER_APPEARANCE_FIELD_NUMBER = 3;
  private com.clarifai.grpc.api.FaceGenderIdentity genderAppearance_;
  /**
   * <code>.clarifai.api.FaceGenderIdentity gender_appearance = 3;</code>
   */
  public boolean hasGenderAppearance() {
    return genderAppearance_ != null;
  }
  /**
   * <code>.clarifai.api.FaceGenderIdentity gender_appearance = 3;</code>
   */
  public com.clarifai.grpc.api.FaceGenderIdentity getGenderAppearance() {
    return genderAppearance_ == null ? com.clarifai.grpc.api.FaceGenderIdentity.getDefaultInstance() : genderAppearance_;
  }
  /**
   * <code>.clarifai.api.FaceGenderIdentity gender_appearance = 3;</code>
   */
  public com.clarifai.grpc.api.FaceGenderIdentityOrBuilder getGenderAppearanceOrBuilder() {
    return getGenderAppearance();
  }

  public static final int MULTICULTURAL_APPEARANCE_FIELD_NUMBER = 4;
  private com.clarifai.grpc.api.FaceMCAffinity multiculturalAppearance_;
  /**
   * <code>.clarifai.api.FaceMCAffinity multicultural_appearance = 4;</code>
   */
  public boolean hasMulticulturalAppearance() {
    return multiculturalAppearance_ != null;
  }
  /**
   * <code>.clarifai.api.FaceMCAffinity multicultural_appearance = 4;</code>
   */
  public com.clarifai.grpc.api.FaceMCAffinity getMulticulturalAppearance() {
    return multiculturalAppearance_ == null ? com.clarifai.grpc.api.FaceMCAffinity.getDefaultInstance() : multiculturalAppearance_;
  }
  /**
   * <code>.clarifai.api.FaceMCAffinity multicultural_appearance = 4;</code>
   */
  public com.clarifai.grpc.api.FaceMCAffinityOrBuilder getMulticulturalAppearanceOrBuilder() {
    return getMulticulturalAppearance();
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
    if (identity_ != null) {
      output.writeMessage(1, getIdentity());
    }
    if (ageAppearance_ != null) {
      output.writeMessage(2, getAgeAppearance());
    }
    if (genderAppearance_ != null) {
      output.writeMessage(3, getGenderAppearance());
    }
    if (multiculturalAppearance_ != null) {
      output.writeMessage(4, getMulticulturalAppearance());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (identity_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getIdentity());
    }
    if (ageAppearance_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAgeAppearance());
    }
    if (genderAppearance_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getGenderAppearance());
    }
    if (multiculturalAppearance_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getMulticulturalAppearance());
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
    if (!(obj instanceof com.clarifai.grpc.api.Face)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.Face other = (com.clarifai.grpc.api.Face) obj;

    if (hasIdentity() != other.hasIdentity()) return false;
    if (hasIdentity()) {
      if (!getIdentity()
          .equals(other.getIdentity())) return false;
    }
    if (hasAgeAppearance() != other.hasAgeAppearance()) return false;
    if (hasAgeAppearance()) {
      if (!getAgeAppearance()
          .equals(other.getAgeAppearance())) return false;
    }
    if (hasGenderAppearance() != other.hasGenderAppearance()) return false;
    if (hasGenderAppearance()) {
      if (!getGenderAppearance()
          .equals(other.getGenderAppearance())) return false;
    }
    if (hasMulticulturalAppearance() != other.hasMulticulturalAppearance()) return false;
    if (hasMulticulturalAppearance()) {
      if (!getMulticulturalAppearance()
          .equals(other.getMulticulturalAppearance())) return false;
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
    if (hasIdentity()) {
      hash = (37 * hash) + IDENTITY_FIELD_NUMBER;
      hash = (53 * hash) + getIdentity().hashCode();
    }
    if (hasAgeAppearance()) {
      hash = (37 * hash) + AGE_APPEARANCE_FIELD_NUMBER;
      hash = (53 * hash) + getAgeAppearance().hashCode();
    }
    if (hasGenderAppearance()) {
      hash = (37 * hash) + GENDER_APPEARANCE_FIELD_NUMBER;
      hash = (53 * hash) + getGenderAppearance().hashCode();
    }
    if (hasMulticulturalAppearance()) {
      hash = (37 * hash) + MULTICULTURAL_APPEARANCE_FIELD_NUMBER;
      hash = (53 * hash) + getMulticulturalAppearance().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.Face parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.Face parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Face parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.Face parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Face parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.Face parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Face parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.Face parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Face parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.Face parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.Face parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.Face parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.Face prototype) {
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
   * Protobuf type {@code clarifai.api.Face}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.Face)
      com.clarifai.grpc.api.FaceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Face_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Face_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.Face.class, com.clarifai.grpc.api.Face.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.Face.newBuilder()
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
      if (identityBuilder_ == null) {
        identity_ = null;
      } else {
        identity_ = null;
        identityBuilder_ = null;
      }
      if (ageAppearanceBuilder_ == null) {
        ageAppearance_ = null;
      } else {
        ageAppearance_ = null;
        ageAppearanceBuilder_ = null;
      }
      if (genderAppearanceBuilder_ == null) {
        genderAppearance_ = null;
      } else {
        genderAppearance_ = null;
        genderAppearanceBuilder_ = null;
      }
      if (multiculturalAppearanceBuilder_ == null) {
        multiculturalAppearance_ = null;
      } else {
        multiculturalAppearance_ = null;
        multiculturalAppearanceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_Face_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.Face getDefaultInstanceForType() {
      return com.clarifai.grpc.api.Face.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.Face build() {
      com.clarifai.grpc.api.Face result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.Face buildPartial() {
      com.clarifai.grpc.api.Face result = new com.clarifai.grpc.api.Face(this);
      if (identityBuilder_ == null) {
        result.identity_ = identity_;
      } else {
        result.identity_ = identityBuilder_.build();
      }
      if (ageAppearanceBuilder_ == null) {
        result.ageAppearance_ = ageAppearance_;
      } else {
        result.ageAppearance_ = ageAppearanceBuilder_.build();
      }
      if (genderAppearanceBuilder_ == null) {
        result.genderAppearance_ = genderAppearance_;
      } else {
        result.genderAppearance_ = genderAppearanceBuilder_.build();
      }
      if (multiculturalAppearanceBuilder_ == null) {
        result.multiculturalAppearance_ = multiculturalAppearance_;
      } else {
        result.multiculturalAppearance_ = multiculturalAppearanceBuilder_.build();
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
      if (other instanceof com.clarifai.grpc.api.Face) {
        return mergeFrom((com.clarifai.grpc.api.Face)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.Face other) {
      if (other == com.clarifai.grpc.api.Face.getDefaultInstance()) return this;
      if (other.hasIdentity()) {
        mergeIdentity(other.getIdentity());
      }
      if (other.hasAgeAppearance()) {
        mergeAgeAppearance(other.getAgeAppearance());
      }
      if (other.hasGenderAppearance()) {
        mergeGenderAppearance(other.getGenderAppearance());
      }
      if (other.hasMulticulturalAppearance()) {
        mergeMulticulturalAppearance(other.getMulticulturalAppearance());
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
      com.clarifai.grpc.api.Face parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.Face) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.clarifai.grpc.api.FaceIdentity identity_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.FaceIdentity, com.clarifai.grpc.api.FaceIdentity.Builder, com.clarifai.grpc.api.FaceIdentityOrBuilder> identityBuilder_;
    /**
     * <code>.clarifai.api.FaceIdentity identity = 1;</code>
     */
    public boolean hasIdentity() {
      return identityBuilder_ != null || identity_ != null;
    }
    /**
     * <code>.clarifai.api.FaceIdentity identity = 1;</code>
     */
    public com.clarifai.grpc.api.FaceIdentity getIdentity() {
      if (identityBuilder_ == null) {
        return identity_ == null ? com.clarifai.grpc.api.FaceIdentity.getDefaultInstance() : identity_;
      } else {
        return identityBuilder_.getMessage();
      }
    }
    /**
     * <code>.clarifai.api.FaceIdentity identity = 1;</code>
     */
    public Builder setIdentity(com.clarifai.grpc.api.FaceIdentity value) {
      if (identityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        identity_ = value;
        onChanged();
      } else {
        identityBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.clarifai.api.FaceIdentity identity = 1;</code>
     */
    public Builder setIdentity(
        com.clarifai.grpc.api.FaceIdentity.Builder builderForValue) {
      if (identityBuilder_ == null) {
        identity_ = builderForValue.build();
        onChanged();
      } else {
        identityBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.clarifai.api.FaceIdentity identity = 1;</code>
     */
    public Builder mergeIdentity(com.clarifai.grpc.api.FaceIdentity value) {
      if (identityBuilder_ == null) {
        if (identity_ != null) {
          identity_ =
            com.clarifai.grpc.api.FaceIdentity.newBuilder(identity_).mergeFrom(value).buildPartial();
        } else {
          identity_ = value;
        }
        onChanged();
      } else {
        identityBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.clarifai.api.FaceIdentity identity = 1;</code>
     */
    public Builder clearIdentity() {
      if (identityBuilder_ == null) {
        identity_ = null;
        onChanged();
      } else {
        identity_ = null;
        identityBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.clarifai.api.FaceIdentity identity = 1;</code>
     */
    public com.clarifai.grpc.api.FaceIdentity.Builder getIdentityBuilder() {
      
      onChanged();
      return getIdentityFieldBuilder().getBuilder();
    }
    /**
     * <code>.clarifai.api.FaceIdentity identity = 1;</code>
     */
    public com.clarifai.grpc.api.FaceIdentityOrBuilder getIdentityOrBuilder() {
      if (identityBuilder_ != null) {
        return identityBuilder_.getMessageOrBuilder();
      } else {
        return identity_ == null ?
            com.clarifai.grpc.api.FaceIdentity.getDefaultInstance() : identity_;
      }
    }
    /**
     * <code>.clarifai.api.FaceIdentity identity = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.FaceIdentity, com.clarifai.grpc.api.FaceIdentity.Builder, com.clarifai.grpc.api.FaceIdentityOrBuilder> 
        getIdentityFieldBuilder() {
      if (identityBuilder_ == null) {
        identityBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.clarifai.grpc.api.FaceIdentity, com.clarifai.grpc.api.FaceIdentity.Builder, com.clarifai.grpc.api.FaceIdentityOrBuilder>(
                getIdentity(),
                getParentForChildren(),
                isClean());
        identity_ = null;
      }
      return identityBuilder_;
    }

    private com.clarifai.grpc.api.FaceAge ageAppearance_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.FaceAge, com.clarifai.grpc.api.FaceAge.Builder, com.clarifai.grpc.api.FaceAgeOrBuilder> ageAppearanceBuilder_;
    /**
     * <code>.clarifai.api.FaceAge age_appearance = 2;</code>
     */
    public boolean hasAgeAppearance() {
      return ageAppearanceBuilder_ != null || ageAppearance_ != null;
    }
    /**
     * <code>.clarifai.api.FaceAge age_appearance = 2;</code>
     */
    public com.clarifai.grpc.api.FaceAge getAgeAppearance() {
      if (ageAppearanceBuilder_ == null) {
        return ageAppearance_ == null ? com.clarifai.grpc.api.FaceAge.getDefaultInstance() : ageAppearance_;
      } else {
        return ageAppearanceBuilder_.getMessage();
      }
    }
    /**
     * <code>.clarifai.api.FaceAge age_appearance = 2;</code>
     */
    public Builder setAgeAppearance(com.clarifai.grpc.api.FaceAge value) {
      if (ageAppearanceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ageAppearance_ = value;
        onChanged();
      } else {
        ageAppearanceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.clarifai.api.FaceAge age_appearance = 2;</code>
     */
    public Builder setAgeAppearance(
        com.clarifai.grpc.api.FaceAge.Builder builderForValue) {
      if (ageAppearanceBuilder_ == null) {
        ageAppearance_ = builderForValue.build();
        onChanged();
      } else {
        ageAppearanceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.clarifai.api.FaceAge age_appearance = 2;</code>
     */
    public Builder mergeAgeAppearance(com.clarifai.grpc.api.FaceAge value) {
      if (ageAppearanceBuilder_ == null) {
        if (ageAppearance_ != null) {
          ageAppearance_ =
            com.clarifai.grpc.api.FaceAge.newBuilder(ageAppearance_).mergeFrom(value).buildPartial();
        } else {
          ageAppearance_ = value;
        }
        onChanged();
      } else {
        ageAppearanceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.clarifai.api.FaceAge age_appearance = 2;</code>
     */
    public Builder clearAgeAppearance() {
      if (ageAppearanceBuilder_ == null) {
        ageAppearance_ = null;
        onChanged();
      } else {
        ageAppearance_ = null;
        ageAppearanceBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.clarifai.api.FaceAge age_appearance = 2;</code>
     */
    public com.clarifai.grpc.api.FaceAge.Builder getAgeAppearanceBuilder() {
      
      onChanged();
      return getAgeAppearanceFieldBuilder().getBuilder();
    }
    /**
     * <code>.clarifai.api.FaceAge age_appearance = 2;</code>
     */
    public com.clarifai.grpc.api.FaceAgeOrBuilder getAgeAppearanceOrBuilder() {
      if (ageAppearanceBuilder_ != null) {
        return ageAppearanceBuilder_.getMessageOrBuilder();
      } else {
        return ageAppearance_ == null ?
            com.clarifai.grpc.api.FaceAge.getDefaultInstance() : ageAppearance_;
      }
    }
    /**
     * <code>.clarifai.api.FaceAge age_appearance = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.FaceAge, com.clarifai.grpc.api.FaceAge.Builder, com.clarifai.grpc.api.FaceAgeOrBuilder> 
        getAgeAppearanceFieldBuilder() {
      if (ageAppearanceBuilder_ == null) {
        ageAppearanceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.clarifai.grpc.api.FaceAge, com.clarifai.grpc.api.FaceAge.Builder, com.clarifai.grpc.api.FaceAgeOrBuilder>(
                getAgeAppearance(),
                getParentForChildren(),
                isClean());
        ageAppearance_ = null;
      }
      return ageAppearanceBuilder_;
    }

    private com.clarifai.grpc.api.FaceGenderIdentity genderAppearance_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.FaceGenderIdentity, com.clarifai.grpc.api.FaceGenderIdentity.Builder, com.clarifai.grpc.api.FaceGenderIdentityOrBuilder> genderAppearanceBuilder_;
    /**
     * <code>.clarifai.api.FaceGenderIdentity gender_appearance = 3;</code>
     */
    public boolean hasGenderAppearance() {
      return genderAppearanceBuilder_ != null || genderAppearance_ != null;
    }
    /**
     * <code>.clarifai.api.FaceGenderIdentity gender_appearance = 3;</code>
     */
    public com.clarifai.grpc.api.FaceGenderIdentity getGenderAppearance() {
      if (genderAppearanceBuilder_ == null) {
        return genderAppearance_ == null ? com.clarifai.grpc.api.FaceGenderIdentity.getDefaultInstance() : genderAppearance_;
      } else {
        return genderAppearanceBuilder_.getMessage();
      }
    }
    /**
     * <code>.clarifai.api.FaceGenderIdentity gender_appearance = 3;</code>
     */
    public Builder setGenderAppearance(com.clarifai.grpc.api.FaceGenderIdentity value) {
      if (genderAppearanceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        genderAppearance_ = value;
        onChanged();
      } else {
        genderAppearanceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.clarifai.api.FaceGenderIdentity gender_appearance = 3;</code>
     */
    public Builder setGenderAppearance(
        com.clarifai.grpc.api.FaceGenderIdentity.Builder builderForValue) {
      if (genderAppearanceBuilder_ == null) {
        genderAppearance_ = builderForValue.build();
        onChanged();
      } else {
        genderAppearanceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.clarifai.api.FaceGenderIdentity gender_appearance = 3;</code>
     */
    public Builder mergeGenderAppearance(com.clarifai.grpc.api.FaceGenderIdentity value) {
      if (genderAppearanceBuilder_ == null) {
        if (genderAppearance_ != null) {
          genderAppearance_ =
            com.clarifai.grpc.api.FaceGenderIdentity.newBuilder(genderAppearance_).mergeFrom(value).buildPartial();
        } else {
          genderAppearance_ = value;
        }
        onChanged();
      } else {
        genderAppearanceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.clarifai.api.FaceGenderIdentity gender_appearance = 3;</code>
     */
    public Builder clearGenderAppearance() {
      if (genderAppearanceBuilder_ == null) {
        genderAppearance_ = null;
        onChanged();
      } else {
        genderAppearance_ = null;
        genderAppearanceBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.clarifai.api.FaceGenderIdentity gender_appearance = 3;</code>
     */
    public com.clarifai.grpc.api.FaceGenderIdentity.Builder getGenderAppearanceBuilder() {
      
      onChanged();
      return getGenderAppearanceFieldBuilder().getBuilder();
    }
    /**
     * <code>.clarifai.api.FaceGenderIdentity gender_appearance = 3;</code>
     */
    public com.clarifai.grpc.api.FaceGenderIdentityOrBuilder getGenderAppearanceOrBuilder() {
      if (genderAppearanceBuilder_ != null) {
        return genderAppearanceBuilder_.getMessageOrBuilder();
      } else {
        return genderAppearance_ == null ?
            com.clarifai.grpc.api.FaceGenderIdentity.getDefaultInstance() : genderAppearance_;
      }
    }
    /**
     * <code>.clarifai.api.FaceGenderIdentity gender_appearance = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.FaceGenderIdentity, com.clarifai.grpc.api.FaceGenderIdentity.Builder, com.clarifai.grpc.api.FaceGenderIdentityOrBuilder> 
        getGenderAppearanceFieldBuilder() {
      if (genderAppearanceBuilder_ == null) {
        genderAppearanceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.clarifai.grpc.api.FaceGenderIdentity, com.clarifai.grpc.api.FaceGenderIdentity.Builder, com.clarifai.grpc.api.FaceGenderIdentityOrBuilder>(
                getGenderAppearance(),
                getParentForChildren(),
                isClean());
        genderAppearance_ = null;
      }
      return genderAppearanceBuilder_;
    }

    private com.clarifai.grpc.api.FaceMCAffinity multiculturalAppearance_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.FaceMCAffinity, com.clarifai.grpc.api.FaceMCAffinity.Builder, com.clarifai.grpc.api.FaceMCAffinityOrBuilder> multiculturalAppearanceBuilder_;
    /**
     * <code>.clarifai.api.FaceMCAffinity multicultural_appearance = 4;</code>
     */
    public boolean hasMulticulturalAppearance() {
      return multiculturalAppearanceBuilder_ != null || multiculturalAppearance_ != null;
    }
    /**
     * <code>.clarifai.api.FaceMCAffinity multicultural_appearance = 4;</code>
     */
    public com.clarifai.grpc.api.FaceMCAffinity getMulticulturalAppearance() {
      if (multiculturalAppearanceBuilder_ == null) {
        return multiculturalAppearance_ == null ? com.clarifai.grpc.api.FaceMCAffinity.getDefaultInstance() : multiculturalAppearance_;
      } else {
        return multiculturalAppearanceBuilder_.getMessage();
      }
    }
    /**
     * <code>.clarifai.api.FaceMCAffinity multicultural_appearance = 4;</code>
     */
    public Builder setMulticulturalAppearance(com.clarifai.grpc.api.FaceMCAffinity value) {
      if (multiculturalAppearanceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        multiculturalAppearance_ = value;
        onChanged();
      } else {
        multiculturalAppearanceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.clarifai.api.FaceMCAffinity multicultural_appearance = 4;</code>
     */
    public Builder setMulticulturalAppearance(
        com.clarifai.grpc.api.FaceMCAffinity.Builder builderForValue) {
      if (multiculturalAppearanceBuilder_ == null) {
        multiculturalAppearance_ = builderForValue.build();
        onChanged();
      } else {
        multiculturalAppearanceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.clarifai.api.FaceMCAffinity multicultural_appearance = 4;</code>
     */
    public Builder mergeMulticulturalAppearance(com.clarifai.grpc.api.FaceMCAffinity value) {
      if (multiculturalAppearanceBuilder_ == null) {
        if (multiculturalAppearance_ != null) {
          multiculturalAppearance_ =
            com.clarifai.grpc.api.FaceMCAffinity.newBuilder(multiculturalAppearance_).mergeFrom(value).buildPartial();
        } else {
          multiculturalAppearance_ = value;
        }
        onChanged();
      } else {
        multiculturalAppearanceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.clarifai.api.FaceMCAffinity multicultural_appearance = 4;</code>
     */
    public Builder clearMulticulturalAppearance() {
      if (multiculturalAppearanceBuilder_ == null) {
        multiculturalAppearance_ = null;
        onChanged();
      } else {
        multiculturalAppearance_ = null;
        multiculturalAppearanceBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.clarifai.api.FaceMCAffinity multicultural_appearance = 4;</code>
     */
    public com.clarifai.grpc.api.FaceMCAffinity.Builder getMulticulturalAppearanceBuilder() {
      
      onChanged();
      return getMulticulturalAppearanceFieldBuilder().getBuilder();
    }
    /**
     * <code>.clarifai.api.FaceMCAffinity multicultural_appearance = 4;</code>
     */
    public com.clarifai.grpc.api.FaceMCAffinityOrBuilder getMulticulturalAppearanceOrBuilder() {
      if (multiculturalAppearanceBuilder_ != null) {
        return multiculturalAppearanceBuilder_.getMessageOrBuilder();
      } else {
        return multiculturalAppearance_ == null ?
            com.clarifai.grpc.api.FaceMCAffinity.getDefaultInstance() : multiculturalAppearance_;
      }
    }
    /**
     * <code>.clarifai.api.FaceMCAffinity multicultural_appearance = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.clarifai.grpc.api.FaceMCAffinity, com.clarifai.grpc.api.FaceMCAffinity.Builder, com.clarifai.grpc.api.FaceMCAffinityOrBuilder> 
        getMulticulturalAppearanceFieldBuilder() {
      if (multiculturalAppearanceBuilder_ == null) {
        multiculturalAppearanceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.clarifai.grpc.api.FaceMCAffinity, com.clarifai.grpc.api.FaceMCAffinity.Builder, com.clarifai.grpc.api.FaceMCAffinityOrBuilder>(
                getMulticulturalAppearance(),
                getParentForChildren(),
                isClean());
        multiculturalAppearance_ = null;
      }
      return multiculturalAppearanceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.Face)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.Face)
  private static final com.clarifai.grpc.api.Face DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.Face();
  }

  public static com.clarifai.grpc.api.Face getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Face>
      PARSER = new com.google.protobuf.AbstractParser<Face>() {
    @java.lang.Override
    public Face parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Face(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Face> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Face> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.Face getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

