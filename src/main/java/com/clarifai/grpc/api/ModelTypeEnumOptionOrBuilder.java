// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface ModelTypeEnumOptionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.ModelTypeEnumOption)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The unique value of the enum option.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * The unique value of the enum option.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * List of other ID values that are equivalent with this ID.
   * This allows the user to choose this option by multiple IDs.
   * Example: if enum is "Phone Number Prefix", you could add an option that is selectable by two values:
   * 1. ID: "Estonia"
   * 2. Alias: 37
   * </pre>
   *
   * <code>repeated .clarifai.api.ModelTypeEnumOptionAlias aliases = 5;</code>
   */
  java.util.List<com.clarifai.grpc.api.ModelTypeEnumOptionAlias> 
      getAliasesList();
  /**
   * <pre>
   * List of other ID values that are equivalent with this ID.
   * This allows the user to choose this option by multiple IDs.
   * Example: if enum is "Phone Number Prefix", you could add an option that is selectable by two values:
   * 1. ID: "Estonia"
   * 2. Alias: 37
   * </pre>
   *
   * <code>repeated .clarifai.api.ModelTypeEnumOptionAlias aliases = 5;</code>
   */
  com.clarifai.grpc.api.ModelTypeEnumOptionAlias getAliases(int index);
  /**
   * <pre>
   * List of other ID values that are equivalent with this ID.
   * This allows the user to choose this option by multiple IDs.
   * Example: if enum is "Phone Number Prefix", you could add an option that is selectable by two values:
   * 1. ID: "Estonia"
   * 2. Alias: 37
   * </pre>
   *
   * <code>repeated .clarifai.api.ModelTypeEnumOptionAlias aliases = 5;</code>
   */
  int getAliasesCount();
  /**
   * <pre>
   * List of other ID values that are equivalent with this ID.
   * This allows the user to choose this option by multiple IDs.
   * Example: if enum is "Phone Number Prefix", you could add an option that is selectable by two values:
   * 1. ID: "Estonia"
   * 2. Alias: 37
   * </pre>
   *
   * <code>repeated .clarifai.api.ModelTypeEnumOptionAlias aliases = 5;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.ModelTypeEnumOptionAliasOrBuilder> 
      getAliasesOrBuilderList();
  /**
   * <pre>
   * List of other ID values that are equivalent with this ID.
   * This allows the user to choose this option by multiple IDs.
   * Example: if enum is "Phone Number Prefix", you could add an option that is selectable by two values:
   * 1. ID: "Estonia"
   * 2. Alias: 37
   * </pre>
   *
   * <code>repeated .clarifai.api.ModelTypeEnumOptionAlias aliases = 5;</code>
   */
  com.clarifai.grpc.api.ModelTypeEnumOptionAliasOrBuilder getAliasesOrBuilder(
      int index);

  /**
   * <pre>
   * Optional description for this enum option.
   * </pre>
   *
   * <code>string description = 2;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Optional description for this enum option.
   * </pre>
   *
   * <code>string description = 2;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * These are additional fields that are specific to this enum choice. This allows
   * us to use enums to control configuration settings as well.
   * </pre>
   *
   * <code>repeated .clarifai.api.ModelTypeField model_type_fields = 3;</code>
   */
  java.util.List<com.clarifai.grpc.api.ModelTypeField> 
      getModelTypeFieldsList();
  /**
   * <pre>
   * These are additional fields that are specific to this enum choice. This allows
   * us to use enums to control configuration settings as well.
   * </pre>
   *
   * <code>repeated .clarifai.api.ModelTypeField model_type_fields = 3;</code>
   */
  com.clarifai.grpc.api.ModelTypeField getModelTypeFields(int index);
  /**
   * <pre>
   * These are additional fields that are specific to this enum choice. This allows
   * us to use enums to control configuration settings as well.
   * </pre>
   *
   * <code>repeated .clarifai.api.ModelTypeField model_type_fields = 3;</code>
   */
  int getModelTypeFieldsCount();
  /**
   * <pre>
   * These are additional fields that are specific to this enum choice. This allows
   * us to use enums to control configuration settings as well.
   * </pre>
   *
   * <code>repeated .clarifai.api.ModelTypeField model_type_fields = 3;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.ModelTypeFieldOrBuilder> 
      getModelTypeFieldsOrBuilderList();
  /**
   * <pre>
   * These are additional fields that are specific to this enum choice. This allows
   * us to use enums to control configuration settings as well.
   * </pre>
   *
   * <code>repeated .clarifai.api.ModelTypeField model_type_fields = 3;</code>
   */
  com.clarifai.grpc.api.ModelTypeFieldOrBuilder getModelTypeFieldsOrBuilder(
      int index);

  /**
   * <pre>
   * If this enum option should be internal only.
   * </pre>
   *
   * <code>bool internal_only = 4;</code>
   * @return The internalOnly.
   */
  boolean getInternalOnly();

  /**
   * <pre>
   * Whether this is the recommended enum option. Set to `true` when there 
   * are multiple options, and one is shown to be better than the others.
   * </pre>
   *
   * <code>bool recommended = 6;</code>
   * @return The recommended.
   */
  boolean getRecommended();
}
