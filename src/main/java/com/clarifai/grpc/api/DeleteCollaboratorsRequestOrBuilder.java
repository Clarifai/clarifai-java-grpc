// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface DeleteCollaboratorsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.DeleteCollaboratorsRequest)
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
   * <code>repeated string collaborator_ids = 2;</code>
   * @return A list containing the collaboratorIds.
   */
  java.util.List<java.lang.String>
      getCollaboratorIdsList();
  /**
   * <code>repeated string collaborator_ids = 2;</code>
   * @return The count of collaboratorIds.
   */
  int getCollaboratorIdsCount();
  /**
   * <code>repeated string collaborator_ids = 2;</code>
   * @param index The index of the element to return.
   * @return The collaboratorIds at the given index.
   */
  java.lang.String getCollaboratorIds(int index);
  /**
   * <code>repeated string collaborator_ids = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the collaboratorIds at the given index.
   */
  com.google.protobuf.ByteString
      getCollaboratorIdsBytes(int index);

  /**
   * <code>repeated string user_emails = 3;</code>
   * @return A list containing the userEmails.
   */
  java.util.List<java.lang.String>
      getUserEmailsList();
  /**
   * <code>repeated string user_emails = 3;</code>
   * @return The count of userEmails.
   */
  int getUserEmailsCount();
  /**
   * <code>repeated string user_emails = 3;</code>
   * @param index The index of the element to return.
   * @return The userEmails at the given index.
   */
  java.lang.String getUserEmails(int index);
  /**
   * <code>repeated string user_emails = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the userEmails at the given index.
   */
  com.google.protobuf.ByteString
      getUserEmailsBytes(int index);
}
