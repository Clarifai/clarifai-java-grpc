// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface ListAnnotationsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.ListAnnotationsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   * @return Whether the userAppId field is set.
   */
  boolean hasUserAppId();
  /**
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   * @return The userAppId.
   */
  com.clarifai.grpc.api.UserAppIDSet getUserAppId();
  /**
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   */
  com.clarifai.grpc.api.UserAppIDSetOrBuilder getUserAppIdOrBuilder();

  /**
   * <pre>
   * List annotations for these IDs
   * </pre>
   *
   * <code>repeated string ids = 2;</code>
   * @return A list containing the ids.
   */
  java.util.List<java.lang.String>
      getIdsList();
  /**
   * <pre>
   * List annotations for these IDs
   * </pre>
   *
   * <code>repeated string ids = 2;</code>
   * @return The count of ids.
   */
  int getIdsCount();
  /**
   * <pre>
   * List annotations for these IDs
   * </pre>
   *
   * <code>repeated string ids = 2;</code>
   * @param index The index of the element to return.
   * @return The ids at the given index.
   */
  java.lang.String getIds(int index);
  /**
   * <pre>
   * List annotations for these IDs
   * </pre>
   *
   * <code>repeated string ids = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the ids at the given index.
   */
  com.google.protobuf.ByteString
      getIdsBytes(int index);

  /**
   * <pre>
   * List annotations for these Input IDs
   * Note that 'ids' are optional but if the are provided the number and order in
   * 'ids' and 'input_ids' should match
   * If you do not specify 'ids' all the annotations for 'input_ids' are returned
   * If a you do not specify both 'input_ids' and 'ids' all the annotations in the app are returned
   * </pre>
   *
   * <code>repeated string input_ids = 3;</code>
   * @return A list containing the inputIds.
   */
  java.util.List<java.lang.String>
      getInputIdsList();
  /**
   * <pre>
   * List annotations for these Input IDs
   * Note that 'ids' are optional but if the are provided the number and order in
   * 'ids' and 'input_ids' should match
   * If you do not specify 'ids' all the annotations for 'input_ids' are returned
   * If a you do not specify both 'input_ids' and 'ids' all the annotations in the app are returned
   * </pre>
   *
   * <code>repeated string input_ids = 3;</code>
   * @return The count of inputIds.
   */
  int getInputIdsCount();
  /**
   * <pre>
   * List annotations for these Input IDs
   * Note that 'ids' are optional but if the are provided the number and order in
   * 'ids' and 'input_ids' should match
   * If you do not specify 'ids' all the annotations for 'input_ids' are returned
   * If a you do not specify both 'input_ids' and 'ids' all the annotations in the app are returned
   * </pre>
   *
   * <code>repeated string input_ids = 3;</code>
   * @param index The index of the element to return.
   * @return The inputIds at the given index.
   */
  java.lang.String getInputIds(int index);
  /**
   * <pre>
   * List annotations for these Input IDs
   * Note that 'ids' are optional but if the are provided the number and order in
   * 'ids' and 'input_ids' should match
   * If you do not specify 'ids' all the annotations for 'input_ids' are returned
   * If a you do not specify both 'input_ids' and 'ids' all the annotations in the app are returned
   * </pre>
   *
   * <code>repeated string input_ids = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the inputIds at the given index.
   */
  com.google.protobuf.ByteString
      getInputIdsBytes(int index);

  /**
   * <pre>
   * Only return the annotations that has one of these user IDs, effectively operating as an
   * OR among them to filter down the results.
   * If model_version_ids are also provided these user_ids are OR'd with them as well since
   * annotations are either provided by users or model versions and we want the union of any
   * provided user or model version annotations in the results of ListAnnotations request.
   * If no user_ids are provided then annotations from all users are returned.
   * </pre>
   *
   * <code>repeated string user_ids = 9;</code>
   * @return A list containing the userIds.
   */
  java.util.List<java.lang.String>
      getUserIdsList();
  /**
   * <pre>
   * Only return the annotations that has one of these user IDs, effectively operating as an
   * OR among them to filter down the results.
   * If model_version_ids are also provided these user_ids are OR'd with them as well since
   * annotations are either provided by users or model versions and we want the union of any
   * provided user or model version annotations in the results of ListAnnotations request.
   * If no user_ids are provided then annotations from all users are returned.
   * </pre>
   *
   * <code>repeated string user_ids = 9;</code>
   * @return The count of userIds.
   */
  int getUserIdsCount();
  /**
   * <pre>
   * Only return the annotations that has one of these user IDs, effectively operating as an
   * OR among them to filter down the results.
   * If model_version_ids are also provided these user_ids are OR'd with them as well since
   * annotations are either provided by users or model versions and we want the union of any
   * provided user or model version annotations in the results of ListAnnotations request.
   * If no user_ids are provided then annotations from all users are returned.
   * </pre>
   *
   * <code>repeated string user_ids = 9;</code>
   * @param index The index of the element to return.
   * @return The userIds at the given index.
   */
  java.lang.String getUserIds(int index);
  /**
   * <pre>
   * Only return the annotations that has one of these user IDs, effectively operating as an
   * OR among them to filter down the results.
   * If model_version_ids are also provided these user_ids are OR'd with them as well since
   * annotations are either provided by users or model versions and we want the union of any
   * provided user or model version annotations in the results of ListAnnotations request.
   * If no user_ids are provided then annotations from all users are returned.
   * </pre>
   *
   * <code>repeated string user_ids = 9;</code>
   * @param index The index of the value to return.
   * @return The bytes of the userIds at the given index.
   */
  com.google.protobuf.ByteString
      getUserIdsBytes(int index);

  /**
   * <pre>
   * Only return the annotations that has one of these model version IDs, effectively operating as an
   * OR among them to filter down the results.
   * If user_ids are also provided these model_versions_ids are OR'd with them as well since
   * annotations are either provided by users or model versions and we want the union of any
   * provided user or model version annotations in the results of ListAnnotations request.
   * If no model_version_ids are provided then annotations from all model versions are returned.
   * </pre>
   *
   * <code>repeated string model_version_ids = 10;</code>
   * @return A list containing the modelVersionIds.
   */
  java.util.List<java.lang.String>
      getModelVersionIdsList();
  /**
   * <pre>
   * Only return the annotations that has one of these model version IDs, effectively operating as an
   * OR among them to filter down the results.
   * If user_ids are also provided these model_versions_ids are OR'd with them as well since
   * annotations are either provided by users or model versions and we want the union of any
   * provided user or model version annotations in the results of ListAnnotations request.
   * If no model_version_ids are provided then annotations from all model versions are returned.
   * </pre>
   *
   * <code>repeated string model_version_ids = 10;</code>
   * @return The count of modelVersionIds.
   */
  int getModelVersionIdsCount();
  /**
   * <pre>
   * Only return the annotations that has one of these model version IDs, effectively operating as an
   * OR among them to filter down the results.
   * If user_ids are also provided these model_versions_ids are OR'd with them as well since
   * annotations are either provided by users or model versions and we want the union of any
   * provided user or model version annotations in the results of ListAnnotations request.
   * If no model_version_ids are provided then annotations from all model versions are returned.
   * </pre>
   *
   * <code>repeated string model_version_ids = 10;</code>
   * @param index The index of the element to return.
   * @return The modelVersionIds at the given index.
   */
  java.lang.String getModelVersionIds(int index);
  /**
   * <pre>
   * Only return the annotations that has one of these model version IDs, effectively operating as an
   * OR among them to filter down the results.
   * If user_ids are also provided these model_versions_ids are OR'd with them as well since
   * annotations are either provided by users or model versions and we want the union of any
   * provided user or model version annotations in the results of ListAnnotations request.
   * If no model_version_ids are provided then annotations from all model versions are returned.
   * </pre>
   *
   * <code>repeated string model_version_ids = 10;</code>
   * @param index The index of the value to return.
   * @return The bytes of the modelVersionIds at the given index.
   */
  com.google.protobuf.ByteString
      getModelVersionIdsBytes(int index);

  /**
   * <pre>
   * Set status to filter by a list of statuses
   * If not statuses are provided then annotations with any status will be returned.
   * </pre>
   *
   * <code>repeated .clarifai.api.status.Status statuses = 5;</code>
   */
  java.util.List<com.clarifai.grpc.api.status.Status> 
      getStatusesList();
  /**
   * <pre>
   * Set status to filter by a list of statuses
   * If not statuses are provided then annotations with any status will be returned.
   * </pre>
   *
   * <code>repeated .clarifai.api.status.Status statuses = 5;</code>
   */
  com.clarifai.grpc.api.status.Status getStatuses(int index);
  /**
   * <pre>
   * Set status to filter by a list of statuses
   * If not statuses are provided then annotations with any status will be returned.
   * </pre>
   *
   * <code>repeated .clarifai.api.status.Status statuses = 5;</code>
   */
  int getStatusesCount();
  /**
   * <pre>
   * Set status to filter by a list of statuses
   * If not statuses are provided then annotations with any status will be returned.
   * </pre>
   *
   * <code>repeated .clarifai.api.status.Status statuses = 5;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.status.StatusOrBuilder> 
      getStatusesOrBuilderList();
  /**
   * <pre>
   * Set status to filter by a list of statuses
   * If not statuses are provided then annotations with any status will be returned.
   * </pre>
   *
   * <code>repeated .clarifai.api.status.Status statuses = 5;</code>
   */
  com.clarifai.grpc.api.status.StatusOrBuilder getStatusesOrBuilder(
      int index);

  /**
   * <pre>
   * Set this flag to list both trusted and not trusted annotations
   * by default it's listing only trusted annotations
   * </pre>
   *
   * <code>bool list_all_annotations = 6;</code>
   * @return The listAllAnnotations.
   */
  boolean getListAllAnnotations();

  /**
   * <code>uint32 page = 7;</code>
   * @return The page.
   */
  int getPage();

  /**
   * <code>uint32 per_page = 8;</code>
   * @return The perPage.
   */
  int getPerPage();

  /**
   * <pre>
   * Flag to filter annotations by task_id
   * </pre>
   *
   * <code>string task_id = 11;</code>
   * @return The taskId.
   */
  java.lang.String getTaskId();
  /**
   * <pre>
   * Flag to filter annotations by task_id
   * </pre>
   *
   * <code>string task_id = 11;</code>
   * @return The bytes for taskId.
   */
  com.google.protobuf.ByteString
      getTaskIdBytes();
}
