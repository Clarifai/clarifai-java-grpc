// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * <pre>
 * InputInfo
 * </pre>
 *
 * Protobuf type {@code clarifai.api.InputInfo}
 */
public final class InputInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clarifai.api.InputInfo)
    InputInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InputInfo.newBuilder() to construct.
  private InputInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InputInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InputInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InputInfo(
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
            com.google.protobuf.Struct.Builder subBuilder = null;
            if (fieldsMap_ != null) {
              subBuilder = fieldsMap_.toBuilder();
            }
            fieldsMap_ = input.readMessage(com.google.protobuf.Struct.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(fieldsMap_);
              fieldsMap_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.Struct.Builder subBuilder = null;
            if (params_ != null) {
              subBuilder = params_.toBuilder();
            }
            params_ = input.readMessage(com.google.protobuf.Struct.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(params_);
              params_ = subBuilder.buildPartial();
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
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_InputInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_InputInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.clarifai.grpc.api.InputInfo.class, com.clarifai.grpc.api.InputInfo.Builder.class);
  }

  public static final int FIELDS_MAP_FIELD_NUMBER = 1;
  private com.google.protobuf.Struct fieldsMap_;
  /**
   * <pre>
   * Map from the api.Data field names to the underlying model graph's inputs. When using a
   * PretrainedModelConfig the values in this map need to match the Triton config.pbtxt input names.
   * </pre>
   *
   * <code>.google.protobuf.Struct fields_map = 1;</code>
   * @return Whether the fieldsMap field is set.
   */
  @java.lang.Override
  public boolean hasFieldsMap() {
    return fieldsMap_ != null;
  }
  /**
   * <pre>
   * Map from the api.Data field names to the underlying model graph's inputs. When using a
   * PretrainedModelConfig the values in this map need to match the Triton config.pbtxt input names.
   * </pre>
   *
   * <code>.google.protobuf.Struct fields_map = 1;</code>
   * @return The fieldsMap.
   */
  @java.lang.Override
  public com.google.protobuf.Struct getFieldsMap() {
    return fieldsMap_ == null ? com.google.protobuf.Struct.getDefaultInstance() : fieldsMap_;
  }
  /**
   * <pre>
   * Map from the api.Data field names to the underlying model graph's inputs. When using a
   * PretrainedModelConfig the values in this map need to match the Triton config.pbtxt input names.
   * </pre>
   *
   * <code>.google.protobuf.Struct fields_map = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StructOrBuilder getFieldsMapOrBuilder() {
    return getFieldsMap();
  }

  public static final int PARAMS_FIELD_NUMBER = 2;
  private com.google.protobuf.Struct params_;
  /**
   * <pre>
   * To control the inputs to the given model we allow a list of parameters
   * defined for each ModelType as a Struct (JSON object) here. During training or inference, the
   * settings contained within are sent to the training processor to alter the training process.
   * </pre>
   *
   * <code>.google.protobuf.Struct params = 2;</code>
   * @return Whether the params field is set.
   */
  @java.lang.Override
  public boolean hasParams() {
    return params_ != null;
  }
  /**
   * <pre>
   * To control the inputs to the given model we allow a list of parameters
   * defined for each ModelType as a Struct (JSON object) here. During training or inference, the
   * settings contained within are sent to the training processor to alter the training process.
   * </pre>
   *
   * <code>.google.protobuf.Struct params = 2;</code>
   * @return The params.
   */
  @java.lang.Override
  public com.google.protobuf.Struct getParams() {
    return params_ == null ? com.google.protobuf.Struct.getDefaultInstance() : params_;
  }
  /**
   * <pre>
   * To control the inputs to the given model we allow a list of parameters
   * defined for each ModelType as a Struct (JSON object) here. During training or inference, the
   * settings contained within are sent to the training processor to alter the training process.
   * </pre>
   *
   * <code>.google.protobuf.Struct params = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StructOrBuilder getParamsOrBuilder() {
    return getParams();
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
    if (fieldsMap_ != null) {
      output.writeMessage(1, getFieldsMap());
    }
    if (params_ != null) {
      output.writeMessage(2, getParams());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (fieldsMap_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getFieldsMap());
    }
    if (params_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getParams());
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
    if (!(obj instanceof com.clarifai.grpc.api.InputInfo)) {
      return super.equals(obj);
    }
    com.clarifai.grpc.api.InputInfo other = (com.clarifai.grpc.api.InputInfo) obj;

    if (hasFieldsMap() != other.hasFieldsMap()) return false;
    if (hasFieldsMap()) {
      if (!getFieldsMap()
          .equals(other.getFieldsMap())) return false;
    }
    if (hasParams() != other.hasParams()) return false;
    if (hasParams()) {
      if (!getParams()
          .equals(other.getParams())) return false;
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
    if (hasFieldsMap()) {
      hash = (37 * hash) + FIELDS_MAP_FIELD_NUMBER;
      hash = (53 * hash) + getFieldsMap().hashCode();
    }
    if (hasParams()) {
      hash = (37 * hash) + PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getParams().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.clarifai.grpc.api.InputInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.InputInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.InputInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.InputInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.InputInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.clarifai.grpc.api.InputInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.clarifai.grpc.api.InputInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.InputInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.InputInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.InputInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.clarifai.grpc.api.InputInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.clarifai.grpc.api.InputInfo parseFrom(
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
  public static Builder newBuilder(com.clarifai.grpc.api.InputInfo prototype) {
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
   * InputInfo
   * </pre>
   *
   * Protobuf type {@code clarifai.api.InputInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clarifai.api.InputInfo)
      com.clarifai.grpc.api.InputInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_InputInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_InputInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.clarifai.grpc.api.InputInfo.class, com.clarifai.grpc.api.InputInfo.Builder.class);
    }

    // Construct using com.clarifai.grpc.api.InputInfo.newBuilder()
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
      if (fieldsMapBuilder_ == null) {
        fieldsMap_ = null;
      } else {
        fieldsMap_ = null;
        fieldsMapBuilder_ = null;
      }
      if (paramsBuilder_ == null) {
        params_ = null;
      } else {
        params_ = null;
        paramsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.clarifai.grpc.api.Resources.internal_static_clarifai_api_InputInfo_descriptor;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.InputInfo getDefaultInstanceForType() {
      return com.clarifai.grpc.api.InputInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.clarifai.grpc.api.InputInfo build() {
      com.clarifai.grpc.api.InputInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.clarifai.grpc.api.InputInfo buildPartial() {
      com.clarifai.grpc.api.InputInfo result = new com.clarifai.grpc.api.InputInfo(this);
      if (fieldsMapBuilder_ == null) {
        result.fieldsMap_ = fieldsMap_;
      } else {
        result.fieldsMap_ = fieldsMapBuilder_.build();
      }
      if (paramsBuilder_ == null) {
        result.params_ = params_;
      } else {
        result.params_ = paramsBuilder_.build();
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
      if (other instanceof com.clarifai.grpc.api.InputInfo) {
        return mergeFrom((com.clarifai.grpc.api.InputInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.clarifai.grpc.api.InputInfo other) {
      if (other == com.clarifai.grpc.api.InputInfo.getDefaultInstance()) return this;
      if (other.hasFieldsMap()) {
        mergeFieldsMap(other.getFieldsMap());
      }
      if (other.hasParams()) {
        mergeParams(other.getParams());
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
      com.clarifai.grpc.api.InputInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.clarifai.grpc.api.InputInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Struct fieldsMap_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> fieldsMapBuilder_;
    /**
     * <pre>
     * Map from the api.Data field names to the underlying model graph's inputs. When using a
     * PretrainedModelConfig the values in this map need to match the Triton config.pbtxt input names.
     * </pre>
     *
     * <code>.google.protobuf.Struct fields_map = 1;</code>
     * @return Whether the fieldsMap field is set.
     */
    public boolean hasFieldsMap() {
      return fieldsMapBuilder_ != null || fieldsMap_ != null;
    }
    /**
     * <pre>
     * Map from the api.Data field names to the underlying model graph's inputs. When using a
     * PretrainedModelConfig the values in this map need to match the Triton config.pbtxt input names.
     * </pre>
     *
     * <code>.google.protobuf.Struct fields_map = 1;</code>
     * @return The fieldsMap.
     */
    public com.google.protobuf.Struct getFieldsMap() {
      if (fieldsMapBuilder_ == null) {
        return fieldsMap_ == null ? com.google.protobuf.Struct.getDefaultInstance() : fieldsMap_;
      } else {
        return fieldsMapBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Map from the api.Data field names to the underlying model graph's inputs. When using a
     * PretrainedModelConfig the values in this map need to match the Triton config.pbtxt input names.
     * </pre>
     *
     * <code>.google.protobuf.Struct fields_map = 1;</code>
     */
    public Builder setFieldsMap(com.google.protobuf.Struct value) {
      if (fieldsMapBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fieldsMap_ = value;
        onChanged();
      } else {
        fieldsMapBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Map from the api.Data field names to the underlying model graph's inputs. When using a
     * PretrainedModelConfig the values in this map need to match the Triton config.pbtxt input names.
     * </pre>
     *
     * <code>.google.protobuf.Struct fields_map = 1;</code>
     */
    public Builder setFieldsMap(
        com.google.protobuf.Struct.Builder builderForValue) {
      if (fieldsMapBuilder_ == null) {
        fieldsMap_ = builderForValue.build();
        onChanged();
      } else {
        fieldsMapBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Map from the api.Data field names to the underlying model graph's inputs. When using a
     * PretrainedModelConfig the values in this map need to match the Triton config.pbtxt input names.
     * </pre>
     *
     * <code>.google.protobuf.Struct fields_map = 1;</code>
     */
    public Builder mergeFieldsMap(com.google.protobuf.Struct value) {
      if (fieldsMapBuilder_ == null) {
        if (fieldsMap_ != null) {
          fieldsMap_ =
            com.google.protobuf.Struct.newBuilder(fieldsMap_).mergeFrom(value).buildPartial();
        } else {
          fieldsMap_ = value;
        }
        onChanged();
      } else {
        fieldsMapBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Map from the api.Data field names to the underlying model graph's inputs. When using a
     * PretrainedModelConfig the values in this map need to match the Triton config.pbtxt input names.
     * </pre>
     *
     * <code>.google.protobuf.Struct fields_map = 1;</code>
     */
    public Builder clearFieldsMap() {
      if (fieldsMapBuilder_ == null) {
        fieldsMap_ = null;
        onChanged();
      } else {
        fieldsMap_ = null;
        fieldsMapBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Map from the api.Data field names to the underlying model graph's inputs. When using a
     * PretrainedModelConfig the values in this map need to match the Triton config.pbtxt input names.
     * </pre>
     *
     * <code>.google.protobuf.Struct fields_map = 1;</code>
     */
    public com.google.protobuf.Struct.Builder getFieldsMapBuilder() {
      
      onChanged();
      return getFieldsMapFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Map from the api.Data field names to the underlying model graph's inputs. When using a
     * PretrainedModelConfig the values in this map need to match the Triton config.pbtxt input names.
     * </pre>
     *
     * <code>.google.protobuf.Struct fields_map = 1;</code>
     */
    public com.google.protobuf.StructOrBuilder getFieldsMapOrBuilder() {
      if (fieldsMapBuilder_ != null) {
        return fieldsMapBuilder_.getMessageOrBuilder();
      } else {
        return fieldsMap_ == null ?
            com.google.protobuf.Struct.getDefaultInstance() : fieldsMap_;
      }
    }
    /**
     * <pre>
     * Map from the api.Data field names to the underlying model graph's inputs. When using a
     * PretrainedModelConfig the values in this map need to match the Triton config.pbtxt input names.
     * </pre>
     *
     * <code>.google.protobuf.Struct fields_map = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> 
        getFieldsMapFieldBuilder() {
      if (fieldsMapBuilder_ == null) {
        fieldsMapBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder>(
                getFieldsMap(),
                getParentForChildren(),
                isClean());
        fieldsMap_ = null;
      }
      return fieldsMapBuilder_;
    }

    private com.google.protobuf.Struct params_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> paramsBuilder_;
    /**
     * <pre>
     * To control the inputs to the given model we allow a list of parameters
     * defined for each ModelType as a Struct (JSON object) here. During training or inference, the
     * settings contained within are sent to the training processor to alter the training process.
     * </pre>
     *
     * <code>.google.protobuf.Struct params = 2;</code>
     * @return Whether the params field is set.
     */
    public boolean hasParams() {
      return paramsBuilder_ != null || params_ != null;
    }
    /**
     * <pre>
     * To control the inputs to the given model we allow a list of parameters
     * defined for each ModelType as a Struct (JSON object) here. During training or inference, the
     * settings contained within are sent to the training processor to alter the training process.
     * </pre>
     *
     * <code>.google.protobuf.Struct params = 2;</code>
     * @return The params.
     */
    public com.google.protobuf.Struct getParams() {
      if (paramsBuilder_ == null) {
        return params_ == null ? com.google.protobuf.Struct.getDefaultInstance() : params_;
      } else {
        return paramsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * To control the inputs to the given model we allow a list of parameters
     * defined for each ModelType as a Struct (JSON object) here. During training or inference, the
     * settings contained within are sent to the training processor to alter the training process.
     * </pre>
     *
     * <code>.google.protobuf.Struct params = 2;</code>
     */
    public Builder setParams(com.google.protobuf.Struct value) {
      if (paramsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        params_ = value;
        onChanged();
      } else {
        paramsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * To control the inputs to the given model we allow a list of parameters
     * defined for each ModelType as a Struct (JSON object) here. During training or inference, the
     * settings contained within are sent to the training processor to alter the training process.
     * </pre>
     *
     * <code>.google.protobuf.Struct params = 2;</code>
     */
    public Builder setParams(
        com.google.protobuf.Struct.Builder builderForValue) {
      if (paramsBuilder_ == null) {
        params_ = builderForValue.build();
        onChanged();
      } else {
        paramsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * To control the inputs to the given model we allow a list of parameters
     * defined for each ModelType as a Struct (JSON object) here. During training or inference, the
     * settings contained within are sent to the training processor to alter the training process.
     * </pre>
     *
     * <code>.google.protobuf.Struct params = 2;</code>
     */
    public Builder mergeParams(com.google.protobuf.Struct value) {
      if (paramsBuilder_ == null) {
        if (params_ != null) {
          params_ =
            com.google.protobuf.Struct.newBuilder(params_).mergeFrom(value).buildPartial();
        } else {
          params_ = value;
        }
        onChanged();
      } else {
        paramsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * To control the inputs to the given model we allow a list of parameters
     * defined for each ModelType as a Struct (JSON object) here. During training or inference, the
     * settings contained within are sent to the training processor to alter the training process.
     * </pre>
     *
     * <code>.google.protobuf.Struct params = 2;</code>
     */
    public Builder clearParams() {
      if (paramsBuilder_ == null) {
        params_ = null;
        onChanged();
      } else {
        params_ = null;
        paramsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * To control the inputs to the given model we allow a list of parameters
     * defined for each ModelType as a Struct (JSON object) here. During training or inference, the
     * settings contained within are sent to the training processor to alter the training process.
     * </pre>
     *
     * <code>.google.protobuf.Struct params = 2;</code>
     */
    public com.google.protobuf.Struct.Builder getParamsBuilder() {
      
      onChanged();
      return getParamsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * To control the inputs to the given model we allow a list of parameters
     * defined for each ModelType as a Struct (JSON object) here. During training or inference, the
     * settings contained within are sent to the training processor to alter the training process.
     * </pre>
     *
     * <code>.google.protobuf.Struct params = 2;</code>
     */
    public com.google.protobuf.StructOrBuilder getParamsOrBuilder() {
      if (paramsBuilder_ != null) {
        return paramsBuilder_.getMessageOrBuilder();
      } else {
        return params_ == null ?
            com.google.protobuf.Struct.getDefaultInstance() : params_;
      }
    }
    /**
     * <pre>
     * To control the inputs to the given model we allow a list of parameters
     * defined for each ModelType as a Struct (JSON object) here. During training or inference, the
     * settings contained within are sent to the training processor to alter the training process.
     * </pre>
     *
     * <code>.google.protobuf.Struct params = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> 
        getParamsFieldBuilder() {
      if (paramsBuilder_ == null) {
        paramsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder>(
                getParams(),
                getParentForChildren(),
                isClean());
        params_ = null;
      }
      return paramsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:clarifai.api.InputInfo)
  }

  // @@protoc_insertion_point(class_scope:clarifai.api.InputInfo)
  private static final com.clarifai.grpc.api.InputInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.clarifai.grpc.api.InputInfo();
  }

  public static com.clarifai.grpc.api.InputInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InputInfo>
      PARSER = new com.google.protobuf.AbstractParser<InputInfo>() {
    @java.lang.Override
    public InputInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InputInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InputInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InputInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.clarifai.grpc.api.InputInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

