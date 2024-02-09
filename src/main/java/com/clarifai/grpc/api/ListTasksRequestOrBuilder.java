// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface ListTasksRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.ListTasksRequest)
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
   * (optional URL parameter) The page number. Pagination is used to split the results into chunks.
   * Defaults to 1.
   * </pre>
   *
   * <code>uint32 page = 2;</code>
   * @return The page.
   */
  int getPage();

  /**
   * <pre>
   * (optional URL parameter) The number of results that will be contained in each page. Defaults
   * to 128.
   * </pre>
   *
   * <code>uint32 per_page = 3;</code>
   * @return The perPage.
   */
  int getPerPage();

  /**
   * <pre>
   * Get tasks that have ANY user from this list assigned as worker.
   * </pre>
   *
   * <code>repeated string worker_user_ids = 4;</code>
   * @return A list containing the workerUserIds.
   */
  java.util.List<java.lang.String>
      getWorkerUserIdsList();
  /**
   * <pre>
   * Get tasks that have ANY user from this list assigned as worker.
   * </pre>
   *
   * <code>repeated string worker_user_ids = 4;</code>
   * @return The count of workerUserIds.
   */
  int getWorkerUserIdsCount();
  /**
   * <pre>
   * Get tasks that have ANY user from this list assigned as worker.
   * </pre>
   *
   * <code>repeated string worker_user_ids = 4;</code>
   * @param index The index of the element to return.
   * @return The workerUserIds at the given index.
   */
  java.lang.String getWorkerUserIds(int index);
  /**
   * <pre>
   * Get tasks that have ANY user from this list assigned as worker.
   * </pre>
   *
   * <code>repeated string worker_user_ids = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the workerUserIds at the given index.
   */
  com.google.protobuf.ByteString
      getWorkerUserIdsBytes(int index);

  /**
   * <pre>
   * Get tasks that have ANY user from this list assigned as reviewer.
   * </pre>
   *
   * <code>repeated string review_user_ids = 5;</code>
   * @return A list containing the reviewUserIds.
   */
  java.util.List<java.lang.String>
      getReviewUserIdsList();
  /**
   * <pre>
   * Get tasks that have ANY user from this list assigned as reviewer.
   * </pre>
   *
   * <code>repeated string review_user_ids = 5;</code>
   * @return The count of reviewUserIds.
   */
  int getReviewUserIdsCount();
  /**
   * <pre>
   * Get tasks that have ANY user from this list assigned as reviewer.
   * </pre>
   *
   * <code>repeated string review_user_ids = 5;</code>
   * @param index The index of the element to return.
   * @return The reviewUserIds at the given index.
   */
  java.lang.String getReviewUserIds(int index);
  /**
   * <pre>
   * Get tasks that have ANY user from this list assigned as reviewer.
   * </pre>
   *
   * <code>repeated string review_user_ids = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the reviewUserIds at the given index.
   */
  com.google.protobuf.ByteString
      getReviewUserIdsBytes(int index);

  /**
   * <pre>
   * Get tasks that are associated to ANY label order from this list.
   * </pre>
   *
   * <code>repeated string label_order_ids = 8;</code>
   * @return A list containing the labelOrderIds.
   */
  java.util.List<java.lang.String>
      getLabelOrderIdsList();
  /**
   * <pre>
   * Get tasks that are associated to ANY label order from this list.
   * </pre>
   *
   * <code>repeated string label_order_ids = 8;</code>
   * @return The count of labelOrderIds.
   */
  int getLabelOrderIdsCount();
  /**
   * <pre>
   * Get tasks that are associated to ANY label order from this list.
   * </pre>
   *
   * <code>repeated string label_order_ids = 8;</code>
   * @param index The index of the element to return.
   * @return The labelOrderIds at the given index.
   */
  java.lang.String getLabelOrderIds(int index);
  /**
   * <pre>
   * Get tasks that are associated to ANY label order from this list.
   * </pre>
   *
   * <code>repeated string label_order_ids = 8;</code>
   * @param index The index of the value to return.
   * @return The bytes of the labelOrderIds at the given index.
   */
  com.google.protobuf.ByteString
      getLabelOrderIdsBytes(int index);

  /**
   * <pre>
   * Get label order tasks as well
   * It is automatically set to true if label_order_ids is set.
   * </pre>
   *
   * <code>bool including_label_order_tasks = 6;</code>
   * @return The includingLabelOrderTasks.
   */
  boolean getIncludingLabelOrderTasks();

  /**
   * <pre>
   * (optional URL parameter) List of additional fields to be included in the response.
   * Currently supported: all, worker.users, review.users.
   * </pre>
   *
   * <code>repeated string additional_fields = 7;</code>
   * @return A list containing the additionalFields.
   */
  java.util.List<java.lang.String>
      getAdditionalFieldsList();
  /**
   * <pre>
   * (optional URL parameter) List of additional fields to be included in the response.
   * Currently supported: all, worker.users, review.users.
   * </pre>
   *
   * <code>repeated string additional_fields = 7;</code>
   * @return The count of additionalFields.
   */
  int getAdditionalFieldsCount();
  /**
   * <pre>
   * (optional URL parameter) List of additional fields to be included in the response.
   * Currently supported: all, worker.users, review.users.
   * </pre>
   *
   * <code>repeated string additional_fields = 7;</code>
   * @param index The index of the element to return.
   * @return The additionalFields at the given index.
   */
  java.lang.String getAdditionalFields(int index);
  /**
   * <pre>
   * (optional URL parameter) List of additional fields to be included in the response.
   * Currently supported: all, worker.users, review.users.
   * </pre>
   *
   * <code>repeated string additional_fields = 7;</code>
   * @param index The index of the value to return.
   * @return The bytes of the additionalFields at the given index.
   */
  com.google.protobuf.ByteString
      getAdditionalFieldsBytes(int index);

  /**
   * <pre>
   * (optional) task IDs to filter on
   * </pre>
   *
   * <code>repeated string ids = 9;</code>
   * @return A list containing the ids.
   */
  java.util.List<java.lang.String>
      getIdsList();
  /**
   * <pre>
   * (optional) task IDs to filter on
   * </pre>
   *
   * <code>repeated string ids = 9;</code>
   * @return The count of ids.
   */
  int getIdsCount();
  /**
   * <pre>
   * (optional) task IDs to filter on
   * </pre>
   *
   * <code>repeated string ids = 9;</code>
   * @param index The index of the element to return.
   * @return The ids at the given index.
   */
  java.lang.String getIds(int index);
  /**
   * <pre>
   * (optional) task IDs to filter on
   * </pre>
   *
   * <code>repeated string ids = 9;</code>
   * @param index The index of the value to return.
   * @return The bytes of the ids at the given index.
   */
  com.google.protobuf.ByteString
      getIdsBytes(int index);
}
