// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface PostWorkflowResultsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.PostWorkflowResultsRequest)
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
   * Workflow ID to retrieve
   * If no ID is specified we return default workflow of the application
   * If an ID is specified by default we first looks into Clarifai workflows for a Workflow ID
   * </pre>
   *
   * <code>string workflow_id = 2;</code>
   * @return The workflowId.
   */
  java.lang.String getWorkflowId();
  /**
   * <pre>
   * Workflow ID to retrieve
   * If no ID is specified we return default workflow of the application
   * If an ID is specified by default we first looks into Clarifai workflows for a Workflow ID
   * </pre>
   *
   * <code>string workflow_id = 2;</code>
   * @return The bytes for workflowId.
   */
  com.google.protobuf.ByteString
      getWorkflowIdBytes();

  /**
   * <pre>
   * Workflow version ID to retrieve
   * If no ID is specified, latest workflow version is used
   * </pre>
   *
   * <code>string version_id = 7;</code>
   * @return The versionId.
   */
  java.lang.String getVersionId();
  /**
   * <pre>
   * Workflow version ID to retrieve
   * If no ID is specified, latest workflow version is used
   * </pre>
   *
   * <code>string version_id = 7;</code>
   * @return The bytes for versionId.
   */
  com.google.protobuf.ByteString
      getVersionIdBytes();

  /**
   * <code>repeated .clarifai.api.Input inputs = 3;</code>
   */
  java.util.List<com.clarifai.grpc.api.Input> 
      getInputsList();
  /**
   * <code>repeated .clarifai.api.Input inputs = 3;</code>
   */
  com.clarifai.grpc.api.Input getInputs(int index);
  /**
   * <code>repeated .clarifai.api.Input inputs = 3;</code>
   */
  int getInputsCount();
  /**
   * <code>repeated .clarifai.api.Input inputs = 3;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.InputOrBuilder> 
      getInputsOrBuilderList();
  /**
   * <code>repeated .clarifai.api.Input inputs = 3;</code>
   */
  com.clarifai.grpc.api.InputOrBuilder getInputsOrBuilder(
      int index);

  /**
   * <pre>
   * FIXME(zeiler): the request for post workflows is using an outputconfig object that is supposed
   * to be within models. This is not consistent with setting this on the request for post model
   * outputs where it is inside a model object. To make this consistent we would send in the
   * workflow object so that each model can have it's own output config. If nobody is setting
   * this OutputConfig it would probably be easier to just remove it for now to keep things simpler
   * and then it's more consistent we just don't support the OutputConfig on workflows.
   * </pre>
   *
   * <code>.clarifai.api.OutputConfig output_config = 4;</code>
   * @return Whether the outputConfig field is set.
   */
  boolean hasOutputConfig();
  /**
   * <pre>
   * FIXME(zeiler): the request for post workflows is using an outputconfig object that is supposed
   * to be within models. This is not consistent with setting this on the request for post model
   * outputs where it is inside a model object. To make this consistent we would send in the
   * workflow object so that each model can have it's own output config. If nobody is setting
   * this OutputConfig it would probably be easier to just remove it for now to keep things simpler
   * and then it's more consistent we just don't support the OutputConfig on workflows.
   * </pre>
   *
   * <code>.clarifai.api.OutputConfig output_config = 4;</code>
   * @return The outputConfig.
   */
  com.clarifai.grpc.api.OutputConfig getOutputConfig();
  /**
   * <pre>
   * FIXME(zeiler): the request for post workflows is using an outputconfig object that is supposed
   * to be within models. This is not consistent with setting this on the request for post model
   * outputs where it is inside a model object. To make this consistent we would send in the
   * workflow object so that each model can have it's own output config. If nobody is setting
   * this OutputConfig it would probably be easier to just remove it for now to keep things simpler
   * and then it's more consistent we just don't support the OutputConfig on workflows.
   * </pre>
   *
   * <code>.clarifai.api.OutputConfig output_config = 4;</code>
   */
  com.clarifai.grpc.api.OutputConfigOrBuilder getOutputConfigOrBuilder();

  /**
   * <pre>
   * Use this flag to look into clarifai published workflows first for a Workflow ID
   * </pre>
   *
   * <code>bool favor_clarifai_workflows = 5;</code>
   * @return The favorClarifaiWorkflows.
   */
  boolean getFavorClarifaiWorkflows();

  /**
   * <pre>
   * A workflow state to be maintained across PostWorkflowResults requests/responses.
   * If it is not sent in the initial request with workflow_state.id = "init" then no
   * state will be saved or returned in PostWorkflowResultsResponse.
   * </pre>
   *
   * <code>.clarifai.api.WorkflowState workflow_state = 6;</code>
   * @return Whether the workflowState field is set.
   */
  boolean hasWorkflowState();
  /**
   * <pre>
   * A workflow state to be maintained across PostWorkflowResults requests/responses.
   * If it is not sent in the initial request with workflow_state.id = "init" then no
   * state will be saved or returned in PostWorkflowResultsResponse.
   * </pre>
   *
   * <code>.clarifai.api.WorkflowState workflow_state = 6;</code>
   * @return The workflowState.
   */
  com.clarifai.grpc.api.WorkflowState getWorkflowState();
  /**
   * <pre>
   * A workflow state to be maintained across PostWorkflowResults requests/responses.
   * If it is not sent in the initial request with workflow_state.id = "init" then no
   * state will be saved or returned in PostWorkflowResultsResponse.
   * </pre>
   *
   * <code>.clarifai.api.WorkflowState workflow_state = 6;</code>
   */
  com.clarifai.grpc.api.WorkflowStateOrBuilder getWorkflowStateOrBuilder();

  /**
   * <pre>
   * Specify which compute to use for processing each node of the workflow:
   * The key is the node.id from the loaded workflow.
   * The value is a RunnerSelector in which you can specify the deployment or specific nodepool
   * that you'd like that node to run on.
   * This allows for use cases like some light models could run on a CPU-only nodepool
   * while other models in the workflow require large GPUs.
   * If node.id is not in the provided map, it will fall back to searching for
   * an adequate deployment the model owner owns or fall back to
   * the serverless nodepools provided by Clarifai.
   * We recommend you specify these RunnerSelectors so that you have better understanding of where
   * processing occurs.
   * </pre>
   *
   * <code>map&lt;string, .clarifai.api.RunnerSelector&gt; node_runner_selectors = 8;</code>
   */
  int getNodeRunnerSelectorsCount();
  /**
   * <pre>
   * Specify which compute to use for processing each node of the workflow:
   * The key is the node.id from the loaded workflow.
   * The value is a RunnerSelector in which you can specify the deployment or specific nodepool
   * that you'd like that node to run on.
   * This allows for use cases like some light models could run on a CPU-only nodepool
   * while other models in the workflow require large GPUs.
   * If node.id is not in the provided map, it will fall back to searching for
   * an adequate deployment the model owner owns or fall back to
   * the serverless nodepools provided by Clarifai.
   * We recommend you specify these RunnerSelectors so that you have better understanding of where
   * processing occurs.
   * </pre>
   *
   * <code>map&lt;string, .clarifai.api.RunnerSelector&gt; node_runner_selectors = 8;</code>
   */
  boolean containsNodeRunnerSelectors(
      java.lang.String key);
  /**
   * Use {@link #getNodeRunnerSelectorsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.clarifai.grpc.api.RunnerSelector>
  getNodeRunnerSelectors();
  /**
   * <pre>
   * Specify which compute to use for processing each node of the workflow:
   * The key is the node.id from the loaded workflow.
   * The value is a RunnerSelector in which you can specify the deployment or specific nodepool
   * that you'd like that node to run on.
   * This allows for use cases like some light models could run on a CPU-only nodepool
   * while other models in the workflow require large GPUs.
   * If node.id is not in the provided map, it will fall back to searching for
   * an adequate deployment the model owner owns or fall back to
   * the serverless nodepools provided by Clarifai.
   * We recommend you specify these RunnerSelectors so that you have better understanding of where
   * processing occurs.
   * </pre>
   *
   * <code>map&lt;string, .clarifai.api.RunnerSelector&gt; node_runner_selectors = 8;</code>
   */
  java.util.Map<java.lang.String, com.clarifai.grpc.api.RunnerSelector>
  getNodeRunnerSelectorsMap();
  /**
   * <pre>
   * Specify which compute to use for processing each node of the workflow:
   * The key is the node.id from the loaded workflow.
   * The value is a RunnerSelector in which you can specify the deployment or specific nodepool
   * that you'd like that node to run on.
   * This allows for use cases like some light models could run on a CPU-only nodepool
   * while other models in the workflow require large GPUs.
   * If node.id is not in the provided map, it will fall back to searching for
   * an adequate deployment the model owner owns or fall back to
   * the serverless nodepools provided by Clarifai.
   * We recommend you specify these RunnerSelectors so that you have better understanding of where
   * processing occurs.
   * </pre>
   *
   * <code>map&lt;string, .clarifai.api.RunnerSelector&gt; node_runner_selectors = 8;</code>
   */

  /* nullable */
com.clarifai.grpc.api.RunnerSelector getNodeRunnerSelectorsOrDefault(
      java.lang.String key,
      /* nullable */
com.clarifai.grpc.api.RunnerSelector defaultValue);
  /**
   * <pre>
   * Specify which compute to use for processing each node of the workflow:
   * The key is the node.id from the loaded workflow.
   * The value is a RunnerSelector in which you can specify the deployment or specific nodepool
   * that you'd like that node to run on.
   * This allows for use cases like some light models could run on a CPU-only nodepool
   * while other models in the workflow require large GPUs.
   * If node.id is not in the provided map, it will fall back to searching for
   * an adequate deployment the model owner owns or fall back to
   * the serverless nodepools provided by Clarifai.
   * We recommend you specify these RunnerSelectors so that you have better understanding of where
   * processing occurs.
   * </pre>
   *
   * <code>map&lt;string, .clarifai.api.RunnerSelector&gt; node_runner_selectors = 8;</code>
   */

  com.clarifai.grpc.api.RunnerSelector getNodeRunnerSelectorsOrThrow(
      java.lang.String key);
}
