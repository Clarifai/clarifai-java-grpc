// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface MultiScopeDepsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.MultiScopeDepsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The status of the request.
   * </pre>
   *
   * <code>.clarifai.api.status.Status status = 1;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * The status of the request.
   * </pre>
   *
   * <code>.clarifai.api.status.Status status = 1;</code>
   * @return The status.
   */
  com.clarifai.grpc.api.status.Status getStatus();
  /**
   * <pre>
   * The status of the request.
   * </pre>
   *
   * <code>.clarifai.api.status.Status status = 1;</code>
   */
  com.clarifai.grpc.api.status.StatusOrBuilder getStatusOrBuilder();

  /**
   * <pre>
   * scopes is a list of low-level scopes and their dependencies.
   * </pre>
   *
   * <code>repeated .clarifai.api.ScopeDeps scope_deps = 2;</code>
   */
  java.util.List<com.clarifai.grpc.api.ScopeDeps> 
      getScopeDepsList();
  /**
   * <pre>
   * scopes is a list of low-level scopes and their dependencies.
   * </pre>
   *
   * <code>repeated .clarifai.api.ScopeDeps scope_deps = 2;</code>
   */
  com.clarifai.grpc.api.ScopeDeps getScopeDeps(int index);
  /**
   * <pre>
   * scopes is a list of low-level scopes and their dependencies.
   * </pre>
   *
   * <code>repeated .clarifai.api.ScopeDeps scope_deps = 2;</code>
   */
  int getScopeDepsCount();
  /**
   * <pre>
   * scopes is a list of low-level scopes and their dependencies.
   * </pre>
   *
   * <code>repeated .clarifai.api.ScopeDeps scope_deps = 2;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.ScopeDepsOrBuilder> 
      getScopeDepsOrBuilderList();
  /**
   * <pre>
   * scopes is a list of low-level scopes and their dependencies.
   * </pre>
   *
   * <code>repeated .clarifai.api.ScopeDeps scope_deps = 2;</code>
   */
  com.clarifai.grpc.api.ScopeDepsOrBuilder getScopeDepsOrBuilder(
      int index);

  /**
   * <pre>
   * endpoint_scopes is a listof all the publicly available endponts which can be
   * used as scopes as well. A call to each of those endpoint depends on a subset
   * of the above "scopes"
   * </pre>
   *
   * <code>repeated .clarifai.api.EndpointDeps endpoint_deps = 3;</code>
   */
  java.util.List<com.clarifai.grpc.api.EndpointDeps> 
      getEndpointDepsList();
  /**
   * <pre>
   * endpoint_scopes is a listof all the publicly available endponts which can be
   * used as scopes as well. A call to each of those endpoint depends on a subset
   * of the above "scopes"
   * </pre>
   *
   * <code>repeated .clarifai.api.EndpointDeps endpoint_deps = 3;</code>
   */
  com.clarifai.grpc.api.EndpointDeps getEndpointDeps(int index);
  /**
   * <pre>
   * endpoint_scopes is a listof all the publicly available endponts which can be
   * used as scopes as well. A call to each of those endpoint depends on a subset
   * of the above "scopes"
   * </pre>
   *
   * <code>repeated .clarifai.api.EndpointDeps endpoint_deps = 3;</code>
   */
  int getEndpointDepsCount();
  /**
   * <pre>
   * endpoint_scopes is a listof all the publicly available endponts which can be
   * used as scopes as well. A call to each of those endpoint depends on a subset
   * of the above "scopes"
   * </pre>
   *
   * <code>repeated .clarifai.api.EndpointDeps endpoint_deps = 3;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.EndpointDepsOrBuilder> 
      getEndpointDepsOrBuilderList();
  /**
   * <pre>
   * endpoint_scopes is a listof all the publicly available endponts which can be
   * used as scopes as well. A call to each of those endpoint depends on a subset
   * of the above "scopes"
   * </pre>
   *
   * <code>repeated .clarifai.api.EndpointDeps endpoint_deps = 3;</code>
   */
  com.clarifai.grpc.api.EndpointDepsOrBuilder getEndpointDepsOrBuilder(
      int index);
}
