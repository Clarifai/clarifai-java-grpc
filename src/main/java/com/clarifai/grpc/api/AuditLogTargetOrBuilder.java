// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface AuditLogTargetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.AuditLogTarget)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * An organization member, only used in org audit logs.
   * </pre>
   *
   * <code>.clarifai.api.User member = 1;</code>
   * @return Whether the member field is set.
   */
  boolean hasMember();
  /**
   * <pre>
   * An organization member, only used in org audit logs.
   * </pre>
   *
   * <code>.clarifai.api.User member = 1;</code>
   * @return The member.
   */
  com.clarifai.grpc.api.User getMember();
  /**
   * <pre>
   * An organization member, only used in org audit logs.
   * </pre>
   *
   * <code>.clarifai.api.User member = 1;</code>
   */
  com.clarifai.grpc.api.UserOrBuilder getMemberOrBuilder();

  public com.clarifai.grpc.api.AuditLogTarget.TargetCase getTargetCase();
}
