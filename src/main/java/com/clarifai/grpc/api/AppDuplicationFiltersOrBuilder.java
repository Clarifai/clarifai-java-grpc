// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface AppDuplicationFiltersOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.AppDuplicationFilters)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Copy inputs. Requires that copy_concepts is also set.
   * Note that this will still copy input-level annotations even if copy_annotations is not set.
   * </pre>
   *
   * <code>bool copy_inputs = 1;</code>
   * @return The copyInputs.
   */
  boolean getCopyInputs();

  /**
   * <pre>
   * Copy concepts.
   * </pre>
   *
   * <code>bool copy_concepts = 2;</code>
   * @return The copyConcepts.
   */
  boolean getCopyConcepts();

  /**
   * <pre>
   * Copy annotations. Requires that copy_inputs and copy_concepts are also set.
   * </pre>
   *
   * <code>bool copy_annotations = 3;</code>
   * @return The copyAnnotations.
   */
  boolean getCopyAnnotations();

  /**
   * <pre>
   * Copy models. Requires that copy_concepts is also set.
   * </pre>
   *
   * <code>bool copy_models = 4;</code>
   * @return The copyModels.
   */
  boolean getCopyModels();

  /**
   * <pre>
   * Copy workflows.
   * </pre>
   *
   * <code>bool copy_workflows = 5;</code>
   * @return The copyWorkflows.
   */
  boolean getCopyWorkflows();

  /**
   * <pre>
   * Copy installed module versions.
   * </pre>
   *
   * <code>bool copy_installed_module_versions = 6;</code>
   * @return The copyInstalledModuleVersions.
   */
  boolean getCopyInstalledModuleVersions();
}
