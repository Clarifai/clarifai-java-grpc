// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface StatValueAggregateQueryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.StatValueAggregateQuery)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * These tags are used to filter down the values before they are aggregated. For example,
   * if you want to aggregate values for "task_id:a" you could specify that as a tag here.
   * </pre>
   *
   * <code>repeated string tags = 1;</code>
   * @return A list containing the tags.
   */
  java.util.List<java.lang.String>
      getTagsList();
  /**
   * <pre>
   * These tags are used to filter down the values before they are aggregated. For example,
   * if you want to aggregate values for "task_id:a" you could specify that as a tag here.
   * </pre>
   *
   * <code>repeated string tags = 1;</code>
   * @return The count of tags.
   */
  int getTagsCount();
  /**
   * <pre>
   * These tags are used to filter down the values before they are aggregated. For example,
   * if you want to aggregate values for "task_id:a" you could specify that as a tag here.
   * </pre>
   *
   * <code>repeated string tags = 1;</code>
   * @param index The index of the element to return.
   * @return The tags at the given index.
   */
  java.lang.String getTags(int index);
  /**
   * <pre>
   * These tags are used to filter down the values before they are aggregated. For example,
   * if you want to aggregate values for "task_id:a" you could specify that as a tag here.
   * </pre>
   *
   * <code>repeated string tags = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the tags at the given index.
   */
  com.google.protobuf.ByteString
      getTagsBytes(int index);

  /**
   * <pre>
   * These are tag groups to aggregate over. So for example if you added stat values with tags
   * "task_id:a" and others with "task_id:b", then added ["task_id"] to the task group, it the
   * aggregation would return StatValueAggregate values for each task_id. If you provide more than
   * one tag_group the response will return all rolled up combinations of them. For example
   * ["task_id", "something"] where "something:1" and "something:2" were used as tags for some
   * values then you'd get StatValueAggregate values back for:
   * task_id | something
   * a       | 1
   * a       | 2
   * b       | 1
   * b       | 1
   * </pre>
   *
   * <code>repeated string tag_groups = 2;</code>
   * @return A list containing the tagGroups.
   */
  java.util.List<java.lang.String>
      getTagGroupsList();
  /**
   * <pre>
   * These are tag groups to aggregate over. So for example if you added stat values with tags
   * "task_id:a" and others with "task_id:b", then added ["task_id"] to the task group, it the
   * aggregation would return StatValueAggregate values for each task_id. If you provide more than
   * one tag_group the response will return all rolled up combinations of them. For example
   * ["task_id", "something"] where "something:1" and "something:2" were used as tags for some
   * values then you'd get StatValueAggregate values back for:
   * task_id | something
   * a       | 1
   * a       | 2
   * b       | 1
   * b       | 1
   * </pre>
   *
   * <code>repeated string tag_groups = 2;</code>
   * @return The count of tagGroups.
   */
  int getTagGroupsCount();
  /**
   * <pre>
   * These are tag groups to aggregate over. So for example if you added stat values with tags
   * "task_id:a" and others with "task_id:b", then added ["task_id"] to the task group, it the
   * aggregation would return StatValueAggregate values for each task_id. If you provide more than
   * one tag_group the response will return all rolled up combinations of them. For example
   * ["task_id", "something"] where "something:1" and "something:2" were used as tags for some
   * values then you'd get StatValueAggregate values back for:
   * task_id | something
   * a       | 1
   * a       | 2
   * b       | 1
   * b       | 1
   * </pre>
   *
   * <code>repeated string tag_groups = 2;</code>
   * @param index The index of the element to return.
   * @return The tagGroups at the given index.
   */
  java.lang.String getTagGroups(int index);
  /**
   * <pre>
   * These are tag groups to aggregate over. So for example if you added stat values with tags
   * "task_id:a" and others with "task_id:b", then added ["task_id"] to the task group, it the
   * aggregation would return StatValueAggregate values for each task_id. If you provide more than
   * one tag_group the response will return all rolled up combinations of them. For example
   * ["task_id", "something"] where "something:1" and "something:2" were used as tags for some
   * values then you'd get StatValueAggregate values back for:
   * task_id | something
   * a       | 1
   * a       | 2
   * b       | 1
   * b       | 1
   * </pre>
   *
   * <code>repeated string tag_groups = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the tagGroups at the given index.
   */
  com.google.protobuf.ByteString
      getTagGroupsBytes(int index);

  /**
   * <pre>
   * Aggregation function to use over the values. Count(value) is also always returns.
   * Defaults to 'sum' if not provided.
   * </pre>
   *
   * <code>.clarifai.api.StatValueAggType stat_value_agg_type = 3;</code>
   * @return The enum numeric value on the wire for statValueAggType.
   */
  int getStatValueAggTypeValue();
  /**
   * <pre>
   * Aggregation function to use over the values. Count(value) is also always returns.
   * Defaults to 'sum' if not provided.
   * </pre>
   *
   * <code>.clarifai.api.StatValueAggType stat_value_agg_type = 3;</code>
   * @return The statValueAggType.
   */
  com.clarifai.grpc.api.StatValueAggType getStatValueAggType();

  /**
   * <pre>
   * Aggregation bins for time where the values will be aggregated at this bin granualarity.
   * And the "time" field will be returned in StatValueAggregate object.
   * If not provided then bins are not used, and all time is aggregated over.
   * </pre>
   *
   * <code>.clarifai.api.StatTimeAggType stat_time_agg_type = 4;</code>
   * @return The enum numeric value on the wire for statTimeAggType.
   */
  int getStatTimeAggTypeValue();
  /**
   * <pre>
   * Aggregation bins for time where the values will be aggregated at this bin granualarity.
   * And the "time" field will be returned in StatValueAggregate object.
   * If not provided then bins are not used, and all time is aggregated over.
   * </pre>
   *
   * <code>.clarifai.api.StatTimeAggType stat_time_agg_type = 4;</code>
   * @return The statTimeAggType.
   */
  com.clarifai.grpc.api.StatTimeAggType getStatTimeAggType();

  /**
   * <pre>
   * If provided the time range over which values will be &gt;= this time. If not provided then
   * all values will be used back to start of time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 5;</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <pre>
   * If provided the time range over which values will be &gt;= this time. If not provided then
   * all values will be used back to start of time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 5;</code>
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   * <pre>
   * If provided the time range over which values will be &gt;= this time. If not provided then
   * all values will be used back to start of time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   * <pre>
   * If provided the time range over which values will be &lt;= this time. If not provided then all
   * values will be used up until now().
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 6;</code>
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   * <pre>
   * If provided the time range over which values will be &lt;= this time. If not provided then all
   * values will be used up until now().
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 6;</code>
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   * <pre>
   * If provided the time range over which values will be &lt;= this time. If not provided then all
   * values will be used up until now().
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();
}
