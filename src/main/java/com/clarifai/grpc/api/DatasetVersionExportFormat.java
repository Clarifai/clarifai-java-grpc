// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * Protobuf enum {@code clarifai.api.DatasetVersionExportFormat}
 */
public enum DatasetVersionExportFormat
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>DATASET_VERSION_EXPORT_FORMAT_NOT_SET = 0;</code>
   */
  DATASET_VERSION_EXPORT_FORMAT_NOT_SET(0),
  /**
   * <pre>
   * CLARIFAI_DATA_PROTOBUF is the proprietary Clarifai API Data format. It
   * is a ZIP-archive containing batches of serialized InputBatch protobuf messages.
   * Note that only the "id" and "data" fields of exported inputs are set.
   * </pre>
   *
   * <code>CLARIFAI_DATA_PROTOBUF = 1;</code>
   */
  CLARIFAI_DATA_PROTOBUF(1),
  /**
   * <pre>
   * CLARIFAI_DATA_JSON is the proprietary Clarifai API Data format in JSON. It
   * is a ZIP-archive containing batches of serialized InputBatch JSON messages.
   * Note that only the "id" and "data" fields of exported inputs are set.
   * </pre>
   *
   * <code>CLARIFAI_DATA_JSON = 3;</code>
   */
  CLARIFAI_DATA_JSON(3),
  /**
   * <pre>
   * COCO is the data format used by Common Objects in Context. It is a
   * ZIP-archive containing JSON files with the dataset version annotations.
   * See https://cocodataset.org/#format-data.
   * </pre>
   *
   * <code>COCO = 2;</code>
   */
  COCO(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>DATASET_VERSION_EXPORT_FORMAT_NOT_SET = 0;</code>
   */
  public static final int DATASET_VERSION_EXPORT_FORMAT_NOT_SET_VALUE = 0;
  /**
   * <pre>
   * CLARIFAI_DATA_PROTOBUF is the proprietary Clarifai API Data format. It
   * is a ZIP-archive containing batches of serialized InputBatch protobuf messages.
   * Note that only the "id" and "data" fields of exported inputs are set.
   * </pre>
   *
   * <code>CLARIFAI_DATA_PROTOBUF = 1;</code>
   */
  public static final int CLARIFAI_DATA_PROTOBUF_VALUE = 1;
  /**
   * <pre>
   * CLARIFAI_DATA_JSON is the proprietary Clarifai API Data format in JSON. It
   * is a ZIP-archive containing batches of serialized InputBatch JSON messages.
   * Note that only the "id" and "data" fields of exported inputs are set.
   * </pre>
   *
   * <code>CLARIFAI_DATA_JSON = 3;</code>
   */
  public static final int CLARIFAI_DATA_JSON_VALUE = 3;
  /**
   * <pre>
   * COCO is the data format used by Common Objects in Context. It is a
   * ZIP-archive containing JSON files with the dataset version annotations.
   * See https://cocodataset.org/#format-data.
   * </pre>
   *
   * <code>COCO = 2;</code>
   */
  public static final int COCO_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static DatasetVersionExportFormat valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DatasetVersionExportFormat forNumber(int value) {
    switch (value) {
      case 0: return DATASET_VERSION_EXPORT_FORMAT_NOT_SET;
      case 1: return CLARIFAI_DATA_PROTOBUF;
      case 3: return CLARIFAI_DATA_JSON;
      case 2: return COCO;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DatasetVersionExportFormat>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DatasetVersionExportFormat> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DatasetVersionExportFormat>() {
          public DatasetVersionExportFormat findValueByNumber(int number) {
            return DatasetVersionExportFormat.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Resources.getDescriptor().getEnumTypes().get(1);
  }

  private static final DatasetVersionExportFormat[] VALUES = values();

  public static DatasetVersionExportFormat valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private DatasetVersionExportFormat(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:clarifai.api.DatasetVersionExportFormat)
}
