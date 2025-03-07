// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/auth/scope/scope.proto

package com.clarifai.grpc.auth.scope;

public final class Scope {
  private Scope() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(com.clarifai.grpc.auth.scope.Scope.clarfaiExposed);
    registry.add(com.clarifai.grpc.auth.scope.Scope.clarifaiDependingScopes);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public static final int CLARFAI_EXPOSED_FIELD_NUMBER = 80318;
  /**
   * <pre>
   * indicates whether the given scope should be returned by the Get /scopes/ call
   * or any other call that returns list of available perms.
   * </pre>
   *
   * <code>extend .google.protobuf.EnumValueOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.EnumValueOptions,
      java.lang.Boolean> clarfaiExposed = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.Boolean.class,
        null);
  public static final int CLARIFAI_DEPENDING_SCOPES_FIELD_NUMBER = 80319;
  /**
   * <pre>
   * TODO: We have no way of picking extension field numbers within clarifai to guarantee
   * uniqueness.  Note: 50000-99999 are for organizational use (like this)
   * </pre>
   *
   * <code>extend .google.protobuf.EnumValueOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.EnumValueOptions,
      java.util.List<com.clarifai.grpc.auth.scope.S>> clarifaiDependingScopes = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        com.clarifai.grpc.auth.scope.S.class,
        null);
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_clarifai_auth_scope_ScopeList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_clarifai_auth_scope_ScopeList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%proto/clarifai/auth/scope/scope.proto\022" +
      "\023clarifai.auth.scope\032 google/protobuf/de" +
      "scriptor.proto\"F\n\tScopeList\022&\n\006scopes\030\001 " +
      "\003(\0162\026.clarifai.auth.scope.S\022\021\n\tendpoints" +
      "\030\002 \003(\t*\234\032\n\001S\022\t\n\005undef\020\000\022\r\n\003All\020\001\032\004\360\233\'\001\022\021" +
      "\n\007Predict\020\002\032\004\360\233\'\001\022\030\n\nInputs_Add\020\004\032\010\360\233\'\001\370" +
      "\233\'\005\022\024\n\nInputs_Get\020\005\032\004\360\233\'\001\022 \n\014Inputs_Patc" +
      "h\020\007\032\016\010\001\360\233\'\001\370\233\'\004\370\233\'\005\022\037\n\rInputs_Delete\020\010\032\014" +
      "\360\233\'\001\370\233\'\004\370\233\'\005\022\035\n\rOutputs_Patch\020\t\032\n\010\001\370\233\'\005\370" +
      "\233\'\002\022\032\n\014Concepts_Add\020\n\032\010\360\233\'\001\370\233\'\013\022\026\n\014Conce" +
      "pts_Get\020\013\032\004\360\233\'\001\022\"\n\016Concepts_Patch\020\014\032\016\010\001\360" +
      "\233\'\001\370\233\'\n\370\233\'\013\022\035\n\017Concepts_Delete\020\r\032\010\370\233\'\n\370\233" +
      "\'\013\022\030\n\nModels_Add\020\016\032\010\360\233\'\001\370\233\'\017\022\024\n\nModels_G" +
      "et\020\017\032\004\360\233\'\001\022$\n\014Models_Patch\020\020\032\022\010\001\360\233\'\001\370\233\'\016" +
      "\370\233\'\017\370\233\'\032\022\037\n\rModels_Delete\020\021\032\014\360\233\'\001\370\233\'\016\370\233\'" +
      "\017\022\032\n\014Models_Train\020\032\032\010\360\233\'\001\370\233\'\017\022\025\n\013Models_" +
      "Sync\020\033\032\004\370\233\'\017\022\033\n\020ModelExports_Get\020\216\001\032\004\360\233\'" +
      "\001\022 \n\020ModelExports_Add\020\217\001\032\t\360\233\'\001\370\233\'\216\001\022\032\n\013M" +
      "odels_Pull\020\226\001\032\010\360\233\'\001\370\233\'\017\022\033\n\rWorkflows_Add" +
      "\020\022\032\010\360\233\'\001\370\233\'\023\022\027\n\rWorkflows_Get\020\023\032\004\360\233\'\001\022#\n" +
      "\017Workflows_Patch\020\024\032\016\010\001\360\233\'\001\370\233\'\022\370\233\'\023\022\"\n\020Wo" +
      "rkflows_Delete\020\025\032\014\360\233\'\001\370\233\'\022\370\233\'\023\022\035\n\023Workfl" +
      "owMetrics_Get\020`\032\004\360\233\'\001\022!\n\023WorkflowMetrics" +
      "_Add\020a\032\010\360\233\'\001\370\233\'`\022(\n\026WorkflowMetrics_Dele" +
      "te\020b\032\014\360\233\'\001\370\233\'a\370\233\'`\022\"\n\026TSNEVisualizations" +
      "_Add\020\030\032\006\010\001\370\233\'\031\022\036\n\026TSNEVisualizations_Get" +
      "\020\031\032\002\010\001\022\035\n\017Annotations_Add\020%\032\010\360\233\'\001\370\233\'&\022\031\n" +
      "\017Annotations_Get\020&\032\004\360\233\'\001\022%\n\021Annotations_" +
      "Patch\020\'\032\016\010\001\360\233\'\001\370\233\'%\370\233\'&\022$\n\022Annotations_D" +
      "elete\020(\032\014\360\233\'\001\370\233\'%\370\233\'&\022\034\n\016Collectors_Add\020" +
      ")\032\010\360\233\'\001\370\233\'*\022\030\n\016Collectors_Get\020*\032\004\360\233\'\001\022#\n" +
      "\021Collectors_Delete\020+\032\014\360\233\'\001\370\233\')\370\233\'*\022\026\n\010Ap" +
      "ps_Add\020,\032\010\360\233\'\001\370\233\'-\022\022\n\010Apps_Get\020-\032\004\360\233\'\001\022\035" +
      "\n\013Apps_Delete\020.\032\014\360\233\'\001\370\233\',\370\233\'-\022\026\n\010Keys_Ad" +
      "d\020/\032\010\360\233\'\001\370\233\'0\022\022\n\010Keys_Get\0200\032\004\360\233\'\001\022\035\n\013Key" +
      "s_Delete\0201\032\014\360\233\'\001\370\233\'/\370\233\'0\022\037\n\021Collaborator" +
      "s_Add\0203\032\010\360\233\'\001\370\233\'2\022\033\n\021Collaborators_Get\0202" +
      "\032\004\360\233\'\001\022&\n\024Collaborators_Delete\0204\032\014\360\233\'\001\370\233" +
      "\'3\370\233\'2\022\031\n\013Metrics_Add\0206\032\010\360\233\'\001\370\233\'5\022\025\n\013Met" +
      "rics_Get\0205\032\004\360\233\'\001\022 \n\016Metrics_Delete\020?\032\014\360\233" +
      "\'\001\370\233\'6\370\233\'5\022\027\n\tTasks_Add\0207\032\010\360\233\'\001\370\233\'8\022\023\n\tT" +
      "asks_Get\0208\032\004\360\233\'\001\022\036\n\014Tasks_Delete\020F\032\014\360\233\'\001" +
      "\370\233\'7\370\233\'8\022\"\n\024PasswordPolicies_Add\0209\032\010\360\233\'\001" +
      "\370\233\':\022\036\n\024PasswordPolicies_Get\020:\032\004\360\233\'\001\022)\n\027" +
      "PasswordPolicies_Delete\020;\032\014\360\233\'\001\370\233\'9\370\233\':\022" +
      "\031\n\017LabelOrders_Get\020C\032\004\360\233\'\001\022\035\n\017LabelOrder" +
      "s_Add\020D\032\010\360\233\'\001\370\233\'C\022$\n\022LabelOrders_Delete\020" +
      "E\032\014\360\233\'\001\370\233\'D\370\233\'C\022.\n FindDuplicateAnnotati" +
      "onsJobs_Add\020f\032\010\360\233\'\001\370\233\'g\022*\n FindDuplicate" +
      "AnnotationsJobs_Get\020g\032\004\360\233\'\001\0225\n#FindDupli" +
      "cateAnnotationsJobs_Delete\020h\032\014\360\233\'\001\370\233\'f\370\233" +
      "\'g\022\026\n\014Datasets_Get\020i\032\004\360\233\'\001\022\032\n\014Datasets_A" +
      "dd\020j\032\010\360\233\'\001\370\233\'i\022!\n\017Datasets_Delete\020k\032\014\360\233\'" +
      "\001\370\233\'i\370\233\'j\022\031\n\013Modules_Add\020l\032\010\360\233\'\001\370\233\'m\022\025\n\013" +
      "Modules_Get\020m\032\004\360\233\'\001\022 \n\016Modules_Delete\020n\032" +
      "\014\360\233\'\001\370\233\'l\370\233\'m\022-\n\033InstalledModuleVersions" +
      "_Add\020o\032\014\360\233\'\001\370\233\'p\370\233\'m\022)\n\033InstalledModuleV" +
      "ersions_Get\020p\032\010\360\233\'\001\370\233\'m\0224\n\036InstalledModu" +
      "leVersions_Delete\020q\032\020\360\233\'\001\370\233\'o\370\233\'p\370\233\'m\022\020\n" +
      "\006Search\020\003\032\004\360\233\'\001\022\031\n\017SavedSearch_Get\020r\032\004\360\233" +
      "\'\001\022\035\n\017SavedSearch_Add\020s\032\010\360\233\'\001\370\233\'r\022$\n\022Sav" +
      "edSearch_Delete\020t\032\014\360\233\'\001\370\233\'r\370\233\'s\022&\n\034Model" +
      "VersionPublications_Add\020u\032\004\360\233\'\001\022)\n\037Model" +
      "VersionPublications_Delete\020v\032\004\360\233\'\001\022\"\n\030Wo" +
      "rkflowPublications_Add\020w\032\004\360\233\'\001\022%\n\033Workfl" +
      "owPublications_Delete\020x\032\004\360\233\'\001\022\037\n\021BulkOpe" +
      "ration_Add\020y\032\010\360\233\'\001\370\233\'z\022\033\n\021BulkOperation_" +
      "Get\020z\032\004\360\233\'\001\022&\n\024BulkOperation_Delete\020{\032\014\360" +
      "\233\'\001\370\233\'y\370\233\'z\022\027\n\023HistoricalUsage_Get\020|\022\026\n\013" +
      "Uploads_Get\020\200\001\032\004\360\233\'\001\022\033\n\013Uploads_Add\020\201\001\032\t" +
      "\360\233\'\001\370\233\'\200\001\022#\n\016Uploads_Delete\020\202\001\032\016\360\233\'\001\370\233\'\200" +
      "\001\370\233\'\201\001\022\026\n\013Runners_Get\020\203\001\032\004\360\233\'\001\022\033\n\013Runner" +
      "s_Add\020\204\001\032\t\360\233\'\001\370\233\'\203\001\022#\n\016Runners_Delete\020\205\001" +
      "\032\016\360\233\'\001\370\233\'\203\001\370\233\'\204\001\022\032\n\017RunnerItems_Get\020\206\001\032\004" +
      "\360\233\'\001\022\037\n\017RunnerItems_Add\020\207\001\032\t\360\233\'\001\370\233\'\206\001\022\030\n" +
      "\rNodepools_Get\020\210\001\032\004\360\233\'\001\022\035\n\rNodepools_Add" +
      "\020\211\001\032\t\360\233\'\001\370\233\'\210\001\022%\n\020Nodepools_Delete\020\212\001\032\016\360" +
      "\233\'\001\370\233\'\210\001\370\233\'\211\001\022\036\n\023ComputeClusters_Get\020\213\001\032" +
      "\004\360\233\'\001\022#\n\023ComputeClusters_Add\020\214\001\032\t\360\233\'\001\370\233\'" +
      "\213\001\022+\n\026ComputeClusters_Delete\020\215\001\032\016\360\233\'\001\370\233\'" +
      "\213\001\370\233\'\214\001\022\032\n\017Deployments_Get\020\220\001\032\004\360\233\'\001\022\037\n\017D" +
      "eployments_Add\020\221\001\032\t\360\233\'\001\370\233\'\220\001\022\'\n\022Deployme" +
      "nts_Delete\020\222\001\032\016\360\233\'\001\370\233\'\220\001\370\233\'\221\001\022\034\n\021Instanc" +
      "eTypes_Get\020\224\001\032\004\360\233\'\001\022\030\n\rAuditLogs_Get\020\225\001\032" +
      "\004\360\233\'\001\022\031\n\016LogEntries_Get\020\227\001\032\004\360\233\'\001\022)\n\036Work" +
      "flowVersionEvaluations_Get\020\230\001\032\004\360\233\'\001\022.\n\036W" +
      "orkflowVersionEvaluations_Add\020\231\001\032\t\360\233\'\001\370\233" +
      "\'\230\001\"\004\010\036\020\036\"\004\010\037\020\037\"\004\010 \020 \"\004\010!\020!\"\004\010\"\020\"\"\004\010}\020}\"" +
      "\004\010~\020~:<\n\017clarfai_exposed\022!.google.protob" +
      "uf.EnumValueOptions\030\276\363\004 \001(\010:^\n\031clarifai_" +
      "depending_scopes\022!.google.protobuf.EnumV" +
      "alueOptions\030\277\363\004 \003(\0162\026.clarifai.auth.scop" +
      "e.SBg\n\034com.clarifai.grpc.auth.scopeP\001Z>g" +
      "ithub.com/Clarifai/clarifai-go-grpc/prot" +
      "o/clarifai/auth/scope\242\002\004CAIPb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        });
    internal_static_clarifai_auth_scope_ScopeList_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_clarifai_auth_scope_ScopeList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_clarifai_auth_scope_ScopeList_descriptor,
        new java.lang.String[] { "Scopes", "Endpoints", });
    clarfaiExposed.internalInit(descriptor.getExtensions().get(0));
    clarifaiDependingScopes.internalInit(descriptor.getExtensions().get(1));
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.clarifai.grpc.auth.scope.Scope.clarfaiExposed);
    registry.add(com.clarifai.grpc.auth.scope.Scope.clarifaiDependingScopes);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
