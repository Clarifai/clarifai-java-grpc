// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface SingleInstalledModuleVersionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.SingleInstalledModuleVersionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.clarifai.api.status.Status status = 1;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>.clarifai.api.status.Status status = 1;</code>
   * @return The status.
   */
  com.clarifai.grpc.api.status.Status getStatus();
  /**
   * <code>.clarifai.api.status.Status status = 1;</code>
   */
  com.clarifai.grpc.api.status.StatusOrBuilder getStatusOrBuilder();

  /**
   * <code>.clarifai.api.InstalledModuleVersion installed_module_version = 2;</code>
   * @return Whether the installedModuleVersion field is set.
   */
  boolean hasInstalledModuleVersion();
  /**
   * <code>.clarifai.api.InstalledModuleVersion installed_module_version = 2;</code>
   * @return The installedModuleVersion.
   */
  com.clarifai.grpc.api.InstalledModuleVersion getInstalledModuleVersion();
  /**
   * <code>.clarifai.api.InstalledModuleVersion installed_module_version = 2;</code>
   */
  com.clarifai.grpc.api.InstalledModuleVersionOrBuilder getInstalledModuleVersionOrBuilder();
}
