// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/status/status_code.proto

package com.clarifai.grpc.api.status;

public final class StatusCodeOuterClass {
  private StatusCodeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+proto/clarifai/api/status/status_code." +
      "proto\022\023clarifai.api.status*\373_\n\nStatusCod" +
      "e\022\010\n\004ZERO\020\000\022\014\n\007SUCCESS\020\220N\022\021\n\014MIXED_STATU" +
      "S\020\232N\022\014\n\007FAILURE\020\244N\022\016\n\tTRY_AGAIN\020\256N\022\024\n\017NO" +
      "T_IMPLEMENTED\020\270N\022\n\n\005MOVED\020\302N\022\013\n\006TEAPOT\020\314" +
      "N\022\030\n\023CONN_ACCOUNT_ISSUES\020\370U\022\033\n\022CONN_TOKE" +
      "N_INVALID\020\371U\032\002\010\001\022\035\n\030CONN_CREDENTIALS_INV" +
      "ALID\020\372U\022\035\n\030CONN_EXCEED_HOURLY_LIMIT\020\373U\022\036" +
      "\n\031CONN_EXCEED_MONTHLY_LIMIT\020\374U\022\023\n\016CONN_T" +
      "HROTTLED\020\375U\022\030\n\023CONN_EXCEEDS_LIMITS\020\376U\022\035\n" +
      "\030CONN_INSUFFICIENT_SCOPES\020\377U\022\025\n\020CONN_KEY" +
      "_INVALID\020\200V\022\027\n\022CONN_KEY_NOT_FOUND\020\201V\022\034\n\027" +
      "CONN_BAD_REQUEST_FORMAT\020\334V\022\030\n\023CONN_DOES_" +
      "NOT_EXIST\020\335V\022\031\n\024CONN_INVALID_REQUEST\020\336V\022" +
      "\034\n\027CONN_METHOD_NOT_ALLOWED\020\337V\022\031\n\024CONN_NO" +
      "_GDPR_CONSENT\020\340V\022\027\n\022CONN_INVALID_RANGE\020\341" +
      "V\022\036\n\031CONN_AUTH_METHOD_DISABLED\020\300W\022\023\n\rMOD" +
      "EL_TRAINED\020\354\244\001\022\024\n\016MODEL_TRAINING\020\355\244\001\022\025\n\017" +
      "MODEL_UNTRAINED\020\356\244\001\022\037\n\031MODEL_QUEUED_FOR_" +
      "TRAINING\020\357\244\001\022\025\n\017MODEL_UPLOADING\020\360\244\001\022\034\n\026M" +
      "ODEL_UPLOADING_FAILED\020\361\244\001\022\033\n\025MODEL_TRAIN" +
      "ING_FAILED\020\362\244\001\022\024\n\016MODEL_BUILDING\020\363\244\001\022\033\n\025" +
      "MODEL_BUILDING_FAILED\020\364\244\001\022\"\n\034MODEL_BUILD" +
      "_UNEXPECTED_ERROR\020\365\244\001\022\034\n\026MODEL_TRAINING_" +
      "NO_DATA\020\366\244\001\022!\n\033MODEL_TRAINING_NO_POSITIV" +
      "ES\020\367\244\001\022*\n$MODEL_TRAINING_ONE_VS_N_SINGLE" +
      "_CLASS\020\370\244\001\022\036\n\030MODEL_TRAINING_TIMED_OUT\020\371" +
      "\244\001\022\"\n\034MODEL_TRAINING_WAITING_ERROR\020\372\244\001\022\"" +
      "\n\034MODEL_TRAINING_UNKNOWN_ERROR\020\373\244\001\022&\n\034MO" +
      "DEL_TRAINING_MSG_REDELIVER\020\374\244\001\032\002\010\001\022&\n MO" +
      "DEL_TRAINING_INSUFFICIENT_DATA\020\375\244\001\022#\n\035MO" +
      "DEL_TRAINING_INVALID_PARAMS\020\376\244\001\0224\n.MODEL" +
      "_TRAINING_INVALID_DATA_TOLERANCE_EXCEEDE" +
      "D\020\377\244\001\022\032\n\024MODEL_MODIFY_SUCCESS\020\236\245\001\022\032\n\024MOD" +
      "EL_MODIFY_PENDING\020\237\245\001\022\031\n\023MODEL_MODIFY_FA" +
      "ILED\020\240\245\001\022\032\n\024MODEL_DOES_NOT_EXIST\020\320\245\001\022\035\n\027" +
      "MODEL_PERMISSION_DENIED\020\321\245\001\022\034\n\026MODEL_INV" +
      "ALID_ARGUMENT\020\322\245\001\022\033\n\025MODEL_INVALID_REQUE" +
      "ST\020\323\245\001\022\025\n\017MODEL_EVALUATED\020\264\246\001\022\026\n\020MODEL_E" +
      "VALUATING\020\265\246\001\022\031\n\023MODEL_NOT_EVALUATED\020\266\246\001" +
      "\022!\n\033MODEL_QUEUED_FOR_EVALUATION\020\267\246\001\022 \n\032M" +
      "ODEL_EVALUATION_TIMED_OUT\020\276\246\001\022$\n\036MODEL_E" +
      "VALUATION_WAITING_ERROR\020\277\246\001\022$\n\036MODEL_EVA" +
      "LUATION_UNKNOWN_ERROR\020\300\246\001\022\035\n\027MODEL_PREDI" +
      "CTION_FAILED\020\301\246\001\022(\n\036MODEL_EVALUATION_MSG" +
      "_REDELIVER\020\302\246\001\032\002\010\001\022\"\n\034MODEL_EVALUATION_N" +
      "EED_LABELS\020\303\246\001\022\"\n\034MODEL_EVALUATION_NEED_" +
      "INPUTS\020\304\246\001\022\035\n\027MODEL_EVALUATION_FAILED\020\305\246" +
      "\001\022\035\n\027MODEL_DEPLOYMENT_FAILED\020\346\246\001\022\025\n\017MODE" +
      "L_DEPLOYING\020\347\246\001\022!\n\033MODEL_QUEUED_FOR_DEPL" +
      "OYMENT\020\350\246\001\022\030\n\022MODEL_NOT_DEPLOYED\020\351\246\001\022\035\n\027" +
      "MODEL_BUSY_PLEASE_RETRY\020\352\246\001\022\023\n\rMODEL_LOA" +
      "DING\020\353\246\001\022&\n MODEL_REFERENCE_INVALID_ARGU" +
      "MENT\020\230\247\001\022*\n$MODEL_EXAMPLE_INPUT_INVALID_" +
      "ARGUMENT\020\254\247\001\022\024\n\016MODEL_EXPORTED\020\374\247\001\022\025\n\017MO" +
      "DEL_EXPORTING\020\375\247\001\022\034\n\026MODEL_EXPORTING_FAI" +
      "LED\020\376\247\001\022\032\n\024MODEL_EXPORT_PENDING\020\377\247\001\022 \n\032W" +
      "ORKFLOW_NO_MATCHING_INPUT\020\361\253\001\022$\n\036WORKFLO" +
      "W_REQUIRE_TRAINED_MODEL\020\362\253\001\022\030\n\022WORKFLOW_" +
      "DUPLICATE\020\324\254\001\022!\n\033WORKFLOW_UNSUPPORTED_FO" +
      "RMAT\020\325\254\001\022\035\n\027WORKFLOW_DOES_NOT_EXIST\020\326\254\001\022" +
      " \n\032WORKFLOW_PERMISSION_DENIED\020\327\254\001\022\037\n\031WOR" +
      "KFLOW_INVALID_ARGUMENT\020\330\254\001\022\035\n\027WORKFLOW_I" +
      "NVALID_RECIPE\020\331\254\001\022\037\n\031WORKFLOW_INVALID_TE" +
      "MPLATE\020\332\254\001\022\034\n\026WORKFLOW_INVALID_GRAPH\020\333\254\001" +
      "\022\037\n\031WORKFLOW_INTERNAL_FAILURE\020\334\254\001\022\036\n\030WOR" +
      "KFLOW_INVALID_REQUEST\020\327\263\001\022\035\n\027WORKFLOW_MO" +
      "DIFY_SUCCESS\020\206\255\001\022\035\n\027WORKFLOW_MODIFY_PEND" +
      "ING\020\207\255\001\022\034\n\026WORKFLOW_MODIFY_FAILED\020\210\255\001\022\035\n" +
      "\027WORKFLOW_REINDEX_FAILED\020\211\255\001\022\034\n\026CONCEPT_" +
      "MODIFY_SUCCESS\020\356\264\001\022\034\n\026CONCEPT_MODIFY_PEN" +
      "DING\020\357\264\001\022\033\n\025CONCEPT_MODIFY_FAILED\020\360\264\001\022\030\n" +
      "\022ANNOTATION_SUCCESS\020\326\274\001\022\030\n\022ANNOTATION_PE" +
      "NDING\020\327\274\001\022\027\n\021ANNOTATION_FAILED\020\330\274\001\022\037\n\031AN" +
      "NOTATION_UNKNOWN_STATUS\020\332\274\001\022!\n\033ANNOTATIO" +
      "N_INVALID_ARGUMENT\020\333\274\001\022\"\n\034ANNOTATION_PER" +
      "MISSION_DENIED\020\334\274\001\022 \n\032ANNOTATION_AWAITIN" +
      "G_REVIEW\020\335\274\001\022*\n$ANNOTATION_AWAITING_CONS" +
      "ENSUS_REVIEW\020\337\274\001\022\036\n\030ANNOTATION_REVIEW_DE" +
      "NIED\020\336\274\001\022\037\n\031ANNOTATION_MODIFY_SUCCESS\020\272\275" +
      "\001\022\037\n\031ANNOTATION_MODIFY_PENDING\020\273\275\001\022\036\n\030AN" +
      "NOTATION_MODIFY_FAILED\020\274\275\001\022&\n METADATA_I" +
      "NVALID_PATCH_ARGUMENTS\020\304\302\001\022\034\n\026METADATA_P" +
      "ARSING_ISSUE\020\305\302\001\022!\n\033METADATA_MANIPULATIO" +
      "N_ISSUE\020\306\302\001\022\034\n\026TRAINER_JOB_STATE_NONE\020\250\303" +
      "\001\022\036\n\030TRAINER_JOB_STATE_QUEUED\020\251\303\001\022\037\n\031TRA" +
      "INER_JOB_STATE_RUNNING\020\252\303\001\022 \n\032TRAINER_JO" +
      "B_STATE_COMPLETE\020\253\303\001\022\035\n\027TRAINER_JOB_STAT" +
      "E_ERROR\020\254\303\001\022\027\n\021DATA_DUMP_SUCCESS\020\276\304\001\022\027\n\021" +
      "DATA_DUMP_PENDING\020\277\304\001\022\026\n\020DATA_DUMP_FAILE" +
      "D\020\300\304\001\022\033\n\025DATA_DUMP_IN_PROGRESS\020\301\304\001\022\033\n\021DA" +
      "TA_DUMP_NO_DATA\020\302\304\001\032\002\010\001\022 \n\032DATA_DUMP_UNE" +
      "XPECTED_ERROR\020\303\304\001\022\036\n\030DATA_DUMP_EXPORT_SU" +
      "CCESS\020\322\304\001\022\036\n\030DATA_DUMP_EXPORT_PENDING\020\323\304" +
      "\001\022\035\n\027DATA_DUMP_EXPORT_FAILED\020\324\304\001\022\"\n\034DATA" +
      "_DUMP_EXPORT_IN_PROGRESS\020\325\304\001\022\'\n!DATA_DUM" +
      "P_EXPORT_UNEXPECTED_ERROR\020\326\304\001\022\035\n\027APP_DUP" +
      "LICATION_SUCCESS\020\360\304\001\022\034\n\026APP_DUPLICATION_" +
      "FAILED\020\361\304\001\022\035\n\027APP_DUPLICATION_PENDING\020\362\304" +
      "\001\022!\n\033APP_DUPLICATION_IN_PROGRESS\020\363\304\001\022%\n\037" +
      "APP_DUPLICATION_INVALID_REQUEST\020\364\304\001\022\033\n\025M" +
      "ODULE_DOES_NOT_EXIST\020\324\305\001\022\036\n\030MODULE_PERMI" +
      "SSION_DENIED\020\325\305\001\022\035\n\027MODULE_INVALID_ARGUM" +
      "ENT\020\326\305\001\022\034\n\026MODULE_INVALID_REQUEST\020\327\305\001\022\034\n" +
      "\026BULK_OPERATION_SUCCESS\020\270\306\001\022\033\n\025BULK_OPER" +
      "ATION_FAILED\020\271\306\001\022\034\n\026BULK_OPERATION_PENDI" +
      "NG\020\272\306\001\022 \n\032BULK_OPERATION_IN_PROGRESS\020\273\306\001" +
      "\022$\n\036BULK_OPERATION_INVALID_REQUEST\020\274\306\001\022\036" +
      "\n\030BULK_OPERATION_CANCELLED\020\275\306\001\022%\n\037BULK_O" +
      "PERATION_UNEXPECTED_ERROR\020\276\306\001\022\033\n\025RUNNER_" +
      "DOES_NOT_EXIST\020\200\310\001\022\036\n\030RUNNER_PERMISSION_" +
      "DENIED\020\201\310\001\022\035\n\027RUNNER_INVALID_ARGUMENT\020\202\310" +
      "\001\022\034\n\026RUNNER_INVALID_REQUEST\020\203\310\001\022\030\n\022RUNNE" +
      "R_NEEDS_RETRY\020\204\310\001\022\031\n\023RUNNER_STREAM_START" +
      "\020\205\310\001\022\027\n\021RUNNER_STREAM_END\020\206\310\001\022\033\n\025RUNNER_" +
      "ITEM_CANCELLED\020\207\310\001\022\036\n\030RUNNER_PROCESSING_" +
      "FAILED\020\210\310\001\022\035\n\027NODEPOOL_DOES_NOT_EXIST\020\344\310" +
      "\001\022\037\n\031NODEPOOL_INVALID_ARGUMENT\020\345\310\001\022\036\n\030NO" +
      "DEPOOL_INVALID_REQUEST\020\346\310\001\022$\n\036COMPUTE_CL" +
      "USTER_DOES_NOT_EXIST\020\310\311\001\022&\n COMPUTE_CLUS" +
      "TER_INVALID_ARGUMENT\020\311\311\001\022%\n\037COMPUTE_CLUS" +
      "TER_INVALID_REQUEST\020\312\311\001\022\037\n\031DEPLOYMENT_DO" +
      "ES_NOT_EXIST\020\254\312\001\022!\n\033DEPLOYMENT_INVALID_A" +
      "RGUMENT\020\255\312\001\022 \n\032DEPLOYMENT_INVALID_REQUES" +
      "T\020\256\312\001\022\"\n\034INSTANCE_TYPE_DOES_NOT_EXIST\020\220\313" +
      "\001\022$\n\036INSTANCE_TYPE_INVALID_ARGUMENT\020\221\313\001\022" +
      "#\n\035INSTANCE_TYPE_INVALID_REQUEST\020\222\313\001\022+\n%" +
      "COMPUTE_PLANE_METRICS_INVALID_REQUEST\020\364\313" +
      "\001\022\023\n\rINPUT_SUCCESS\020\260\352\001\022\023\n\rINPUT_PENDING\020" +
      "\261\352\001\022\022\n\014INPUT_FAILED\020\262\352\001\022\027\n\021INPUT_IN_PROG" +
      "RESS\020\263\352\001\022 \n\026INPUT_DOWNLOAD_SUCCESS\020\260\352\001\032\002" +
      "\010\001\022 \n\026INPUT_DOWNLOAD_PENDING\020\261\352\001\032\002\010\001\022\037\n\025" +
      "INPUT_DOWNLOAD_FAILED\020\262\352\001\032\002\010\001\022$\n\032INPUT_D" +
      "OWNLOAD_IN_PROGRESS\020\263\352\001\032\002\010\001\022 \n\032INPUT_STA" +
      "TUS_UPDATE_FAILED\020\264\352\001\022\031\n\023INPUT_DELETE_FA" +
      "ILED\020\265\352\001\022\025\n\017INPUT_DUPLICATE\020\224\353\001\022\036\n\030INPUT" +
      "_UNSUPPORTED_FORMAT\020\225\353\001\022\032\n\024INPUT_DOES_NO" +
      "T_EXIST\020\226\353\001\022\035\n\027INPUT_PERMISSION_DENIED\020\227" +
      "\353\001\022\034\n\026INPUT_INVALID_ARGUMENT\020\230\353\001\022\026\n\020INPU" +
      "T_OVER_LIMIT\020\231\353\001\022\027\n\021INPUT_INVALID_URL\020\232\353" +
      "\001\022\032\n\024INPUT_MODIFY_SUCCESS\020\370\353\001\022\032\n\024INPUT_M" +
      "ODIFY_PENDING\020\371\353\001\022\031\n\023INPUT_MODIFY_FAILED" +
      "\020\373\353\001\022\037\n\031INPUT_STORAGE_HOST_FAILED\020\202\354\001\022\035\n" +
      "\027ALL_INPUT_INVALID_BYTES\020\334\354\001\022\033\n\025INPUT_CL" +
      "USTER_SUCCESS\020\300\355\001\022\033\n\025INPUT_CLUSTER_PENDI" +
      "NG\020\301\355\001\022\032\n\024INPUT_CLUSTER_FAILED\020\302\355\001\022\037\n\031IN" +
      "PUT_CLUSTER_IN_PROGRESS\020\303\355\001\022\033\n\025INPUT_REI" +
      "NDEX_SUCCESS\020\244\356\001\022\033\n\025INPUT_REINDEX_PENDIN" +
      "G\020\245\356\001\022\032\n\024INPUT_REINDEX_FAILED\020\246\356\001\022\037\n\031INP" +
      "UT_REINDEX_IN_PROGRESS\020\247\356\001\022\"\n\034INPUT_VIDE" +
      "O_DOWNLOAD_SUCCESS\020\230\362\001\022\"\n\034INPUT_VIDEO_DO" +
      "WNLOAD_PENDING\020\231\362\001\022!\n\033INPUT_VIDEO_DOWNLO" +
      "AD_FAILED\020\232\362\001\022\033\n\025INPUT_VIDEO_DUPLICATE\020\374" +
      "\362\001\022$\n\036INPUT_VIDEO_UNSUPPORTED_FORMAT\020\375\362\001" +
      "\022 \n\032INPUT_VIDEO_DOES_NOT_EXIST\020\376\362\001\022#\n\035IN" +
      "PUT_VIDEO_PERMISSION_DENIED\020\377\362\001\022\"\n\034INPUT" +
      "_VIDEO_INVALID_ARGUMENT\020\200\363\001\022\034\n\026INPUT_VID" +
      "EO_OVER_LIMIT\020\201\363\001\022\035\n\027INPUT_VIDEO_INVALID" +
      "_URL\020\202\363\001\022 \n\032INPUT_VIDEO_MODIFY_SUCCESS\020\340" +
      "\363\001\022 \n\032INPUT_VIDEO_MODIFY_PENDING\020\341\363\001\022\037\n\031" +
      "INPUT_VIDEO_MODIFY_FAILED\020\343\363\001\022%\n\037INPUT_V" +
      "IDEO_STORAGE_HOST_FAILED\020\352\363\001\022$\n\036ALL_INPU" +
      "T_VIDEOS_INVALID_BYTES\020\304\364\001\022$\n\036INPUT_VIDE" +
      "O_PROCESSING_SUCCESS\020\250\365\001\022$\n\036INPUT_VIDEO_" +
      "PROCESSING_PENDING\020\262\365\001\022#\n\035INPUT_VIDEO_PR" +
      "OCESSING_FAILED\020\274\365\001\022\'\n!INPUT_VIDEO_STORA" +
      "GE_INCONSISTENCY\020\306\365\001\022!\n\033INPUT_VIDEO_STOR" +
      "AGE_FAILURE\020\320\365\001\022(\n\"INPUT_VIDEO_URL_GENER" +
      "ATION_FAILURE\020\332\365\001\022\035\n\027INPUT_CONNECTION_FA" +
      "ILED\020\274\270\002\022&\n REQUEST_DISABLED_FOR_MAINTEN" +
      "ANCE\020\275\270\002\022/\n%INPUT_WRITES_DISABLED_FOR_MA" +
      "INTENANCE\020\276\270\002\032\002\010\001\022\033\n\025INPUT_INVALID_REQUE" +
      "ST\020\277\270\002\022\035\n\027PREDICT_INVALID_REQUEST\020\301\270\002\022\034\n" +
      "\026SEARCH_INVALID_REQUEST\020\302\270\002\022\036\n\030CONCEPTS_" +
      "INVALID_REQUEST\020\303\270\002\022\033\n\025STATS_INVALID_REQ" +
      "UEST\020\304\270\002\022\034\n\026DATABASE_DUPLICATE_KEY\020\312\270\002\022 " +
      "\n\032DATABASE_STATEMENT_TIMEOUT\020\313\270\002\022$\n\036DATA" +
      "BASE_INVALID_ROWS_AFFECTED\020\314\270\002\022 \n\032DATABA" +
      "SE_DEADLOCK_DETECTED\020\315\270\002\022\030\n\022DATABASE_FAI" +
      "L_TASK\020\316\270\002\022&\n DATABASE_FAIL_TO_GET_CONNE" +
      "CTIONS\020\317\270\002\022\037\n\031DATABASE_TOO_MANY_CLIENTS\020" +
      "\320\270\002\022\"\n\034DATABASE_CONSTRAINT_VIOLATED\020\321\270\002\022" +
      "\027\n\021DATABASE_CANCELED\020\325\270\002\022\037\n\031ASYNC_WORKER" +
      "_MULTI_ERRORS\020\324\270\002\022\034\n\026RPC_REQUEST_QUEUE_F" +
      "ULL\020\336\270\002\022\034\n\026RPC_SERVER_UNAVAILABLE\020\337\270\002\022\031\n" +
      "\023RPC_REQUEST_TIMEOUT\020\340\270\002\022#\n\035RPC_MAX_MESS" +
      "AGE_SIZE_EXCEEDED\020\341\270\002\022\022\n\014RPC_CANCELED\020\343\270" +
      "\002\022\030\n\022RPC_UNKNOWN_METHOD\020\344\270\002\022\036\n\030REQUEST_C" +
      "ANCELED_BY_USER\020\345\270\002\022\036\n\030CLUSTER_INTERNAL_" +
      "FAILURE\020\240\320\002\022\037\n\031EXTERNAL_CONNECTION_ERROR" +
      "\020\342\270\002\022\032\n\024QUERY_INVALID_SYNTAX\020\362\270\002\022\026\n\020QUEU" +
      "E_CONN_ERROR\020\250\300\002\022!\n\033QUEUE_CLOSE_REQUEST_" +
      "TIMEOUT\020\252\300\002\022\027\n\021QUEUE_CONN_CLOSED\020\253\300\002\022\037\n\031" +
      "QUEUE_PUBLISH_ACK_TIMEOUT\020\254\300\002\022\031\n\023QUEUE_P" +
      "UBLISH_ERROR\020\255\300\002\022 \n\032QUEUE_SUBSCRIPTION_T" +
      "IMEOUT\020\256\300\002\022\036\n\030QUEUE_SUBSCRIPTION_ERROR\020\257" +
      "\300\002\022\036\n\030QUEUE_MARSHALLING_FAILED\020\260\300\002\022 \n\032QU" +
      "EUE_UNMARSHALLING_FAILED\020\261\300\002\022\'\n!QUEUE_MA" +
      "X_MSG_REDELIVERY_EXCEEDED\020\262\300\002\022\027\n\021QUEUE_A" +
      "CK_FAILURE\020\263\300\002\022\023\n\rSQS_OVERLIMIT\020\214\301\002\022 \n\032S" +
      "QS_INVALID_RECEIPT_HANDLE\020\215\301\002\022\021\n\013SQS_UNK" +
      "NOWN\020\216\301\002\022\035\n\027SEARCH_INTERNAL_FAILURE\020\371\317\002\022" +
      "\037\n\031SEARCH_PROJECTION_FAILURE\020\372\317\002\022\037\n\031SEAR" +
      "CH_PREDICTION_FAILURE\020\373\317\002\022\'\n!SEARCH_BY_N" +
      "OT_FULLY_INDEXED_INPUT\020\374\317\002\022 \n\032SAVED_SEAR" +
      "CH_MODIFY_FAILED\020\375\317\002\022\037\n\031SEARCH_COUNTS_UN" +
      "AVAILABLE\020\376\317\002\022\027\n\021EVALUATION_QUEUED\020\334\320\002\022\034" +
      "\n\026EVALUATION_IN_PROGRESS\020\335\320\002\022\030\n\022EVALUATI" +
      "ON_SUCCESS\020\336\320\002\022(\n\"EVALUATION_FAILED_TO_R" +
      "ETRIEVE_DATA\020\337\320\002\022!\n\033EVALUATION_INVALID_A" +
      "RGUMENT\020\340\320\002\022\027\n\021EVALUATION_FAILED\020\341\320\002\022\030\n\022" +
      "EVALUATION_PENDING\020\342\320\002\022\032\n\024EVALUATION_TIM" +
      "ED_OUT\020\343\320\002\022!\n\033EVALUATION_UNEXPECTED_ERRO" +
      "R\020\344\320\002\022\026\n\020EVALUATION_MIXED\020\345\320\002\022\030\n\022STRIPE_" +
      "EVENT_ERROR\020\341\327\002\022\020\n\nCACHE_MISS\020\311\337\002\022&\n RED" +
      "IS_SCRIPT_EXITED_WITH_FAILURE\020\312\337\002\022\026\n\020RED" +
      "IS_STREAM_ERR\020\313\337\002\022\030\n\022REDIS_NO_CONSUMERS\020" +
      "\314\337\002\022\032\n\024REDIS_STREAM_BACKOFF\020\315\337\002\022\030\n\022SIGNU" +
      "P_EVENT_ERROR\020\261\347\002\022\024\n\016SIGNUP_FLAGGED\020\262\347\002\022" +
      "\032\n\024FILETYPE_UNSUPPORTED\020\263\347\002\022\037\n\031APP_COUNT" +
      "_INVALID_MESSAGE\020\231\357\002\022\'\n!APP_COUNT_UPDATE" +
      "_INCREMENT_FAILED\020\232\357\002\022\036\n\030APP_COUNT_REBUI" +
      "LD_FAILED\020\233\357\002\022 \n\032APP_COUNT_INTERNAL_FAIL" +
      "URE\020\234\357\002\022\027\n\021MP_DOWNLOAD_ERROR\020\375\357\002\022\032\n\024MP_R" +
      "ESOLVE_DNS_ERROR\020\376\357\002\022)\n#MP_DOWNLOAD_MAX_" +
      "SIZE_EXCEEDED_ERROR\020\377\357\002\022\033\n\025MP_IMAGE_DECO" +
      "DE_ERROR\020\200\360\002\022\031\n\023MP_INVALID_ARGUMENT\020\201\360\002\022" +
      "\037\n\031MP_IMAGE_PROCESSING_ERROR\020\202\360\002\022\031\n\023DATA" +
      "TIER_CONN_ERROR\020\341\360\002\022\027\n\021USER_CONSENT_FACE" +
      "\020\321\206\003\022\024\n\016WORKER_MISSING\020\270\216\003\022\023\n\rWORKER_ACT" +
      "IVE\020\271\216\003\022\025\n\017WORKER_INACTIVE\020\272\216\003\022\027\n\021COLLEC" +
      "TOR_MISSING\020\240\226\003\022\026\n\020COLLECTOR_ACTIVE\020\241\226\003\022" +
      "\030\n\022COLLECTOR_INACTIVE\020\242\226\003\022!\n\033COLLECTOR_P" +
      "OST_INPUT_FAILED\020\243\226\003\022*\n$SSO_IDENTITY_PRO" +
      "VIDER_DOES_NOT_EXIST\020\211\236\003\022\026\n\020TASK_IN_PROG" +
      "RESS\020\361\245\003\022\017\n\tTASK_DONE\020\362\245\003\022\022\n\014TASK_WONT_D" +
      "O\020\363\245\003\022\021\n\013TASK_FAILED\020\365\245\003\022\017\n\tTASK_IDLE\020\366\245" +
      "\003\022\023\n\rTASK_CONFLICT\020\324\246\003\022\032\n\024TASK_NOT_IMPLE" +
      "MENTED\020\325\246\003\022\022\n\014TASK_MISSING\020\326\246\003\022\034\n\026TASK_P" +
      "ERMISSION_DENIED\020\327\246\003\022\035\n\027TASK_ASSIGNMENT_" +
      "SUCCESS\020\270\247\003\022\035\n\027TASK_ASSIGNMENT_PENDING\020\271" +
      "\247\003\022%\n\037TASK_ASSIGNMENT_AWAITING_REVIEW\020\272\247" +
      "\003\022/\n)TASK_ASSIGNMENT_AWAITING_CONSENSUS_" +
      "REVIEW\020\273\247\003\022\036\n\030TASK_ASSIGNMENT_REJECTED\020\274" +
      "\247\003\022$\n\036TASK_ASSIGNMENT_REVIEW_SUCCESS\020\234\250\003" +
      "\022$\n\036TASK_ASSIGNMENT_REVIEW_PENDING\020\235\250\003\022&" +
      "\n TASK_ASSIGNMENT_REVIEW_DISMISSED\020\236\250\003\022\031" +
      "\n\023LABEL_ORDER_PENDING\020\331\255\003\022\035\n\027LABEL_ORDER" +
      "_IN_PROGRESS\020\332\255\003\022\031\n\023LABEL_ORDER_SUCCESS\020" +
      "\333\255\003\022\032\n\024LABEL_ORDER_CANCELED\020\334\255\003\022\024\n\016LICEN" +
      "SE_ACTIVE\020\340\324\003\022\034\n\026LICENSE_DOES_NOT_EXIST\020" +
      "\341\324\003\022\031\n\023LICENSE_NEED_UPDATE\020\342\324\003\022\025\n\017LICENS" +
      "E_EXPIRED\020\343\324\003\022\025\n\017LICENSE_REVOKED\020\344\324\003\022\025\n\017" +
      "LICENSE_DELETED\020\345\324\003\022\035\n\027LICENSE_VOLUME_EX" +
      "CEEDED\020\346\324\003\022!\n\033PASSWORD_VALIDATION_SUCCES" +
      "S\020\310\334\003\022 \n\032PASSWORD_VALIDATION_FAILED\020\311\334\003\022" +
      "%\n\037PASSWORDPOLICY_INVALID_ARGUMENT\020\312\334\003\022\"" +
      "\n\034FEATUREFLAG_CONFIG_NOT_FOUND\020\260\344\003\022\"\n\034FE" +
      "ATUREFLAG_INVALID_ARGUMENT\020\261\344\003\022\031\n\023FEATUR" +
      "EFLAG_BLOCKED\020\262\344\003\022\033\n\025FEATUREFLAG_NOT_FOU" +
      "ND\020\263\344\003\022\031\n\023MAINTENANCE_SUCCESS\020\230\354\003\022\030\n\022MAI" +
      "NTENANCE_FAILED\020\231\354\003\022\035\n\027DATASET_VERSION_P" +
      "ENDING\020\205\364\003\022!\n\033DATASET_VERSION_IN_PROGRES" +
      "S\020\212\364\003\022\033\n\025DATASET_VERSION_READY\020\217\364\003\022\035\n\027DA" +
      "TASET_VERSION_FAILURE\020\224\364\003\022&\n DATASET_VER" +
      "SION_UNEXPECTED_ERROR\020\231\364\003\022\036\n\030DATASET_VER" +
      "SION_CONFLICT\020\236\364\003\022\033\n\025DATASET_INPUT_SUCCE" +
      "SS\020\344\364\003\022\035\n\027DATASET_INPUT_DUPLICATE\020\345\364\003\022$\n" +
      "\036DATASET_VERSION_EXPORT_SUCCESS\020\310\365\003\022$\n\036D" +
      "ATASET_VERSION_EXPORT_PENDING\020\311\365\003\022#\n\035DAT" +
      "ASET_VERSION_EXPORT_FAILED\020\312\365\003\022(\n\"DATASE" +
      "T_VERSION_EXPORT_IN_PROGRESS\020\313\365\003\022-\n\'DATA" +
      "SET_VERSION_EXPORT_UNEXPECTED_ERROR\020\314\365\003\022" +
      "\020\n\nJOB_QUEUED\020\200\364\003\022\021\n\013JOB_RUNNING\020\201\364\003\022\023\n\r" +
      "JOB_COMPLETED\020\202\364\003\022\020\n\nJOB_FAILED\020\203\364\003\022\023\n\rJ" +
      "OB_CANCELLED\020\204\364\003\022\032\n\024JOB_UNEXPECTED_ERROR" +
      "\020\206\364\003\022\022\n\014JOB_CONFLICT\020\207\364\003\022\034\n\026AUTH_MISSING" +
      "_IDP_ASSOC\020\350\373\003\022\031\n\023LIST_OBJECTS_FAILED\020\320\203" +
      "\004\022\034\n\026ARCHIVE_EXTRACT_FAILED\020\270\213\004\022\030\n\022UPLOA" +
      "D_IN_PROGRESS\020\240\223\004\022\021\n\013UPLOAD_DONE\020\241\223\004\022\023\n\r" +
      "UPLOAD_FAILED\020\242\223\004\022\035\n\027UPLOAD_UNEXPECTED_E" +
      "RROR\020\243\223\004\022\024\n\016UPLOAD_EXPIRED\020\244\223\004\022\025\n\017UPLOAD" +
      "_CANCELED\020\245\223\004\022\025\n\017UPLOAD_CONFLICT\020\246\223\004\022\032\n\024" +
      "BILLING_INVALID_INFO\020\210\233\004\022!\n\033LOG_ENTRIES_" +
      "INVALID_REQUEST\020\360\242\004\022\033\n\025INTERNAL_SERVER_I" +
      "SSUE\020\324\375\005\022\035\n\027INTERNAL_FETCHING_ISSUE\020\325\375\005\022" +
      "\035\n\027INTERNAL_DATABASE_ISSUE\020\326\375\005\022\037\n\031INTERN" +
      "AL_CONTEXT_CANCELED\020\330\375\005\022!\n\033INTERNAL_UNEX" +
      "PECTED_TIMEOUT\020\331\375\005\022\034\n\026INTERNAL_UNEXPECTE" +
      "D_V1\020\332\375\005\022\037\n\031INTERNAL_UNEXPECTED_PANIC\020\333\375" +
      "\005\022\037\n\031INTERNAL_UNEXPECTED_SPIRE\020\334\375\005\022 \n\032IN" +
      "TERNAL_REDIS_UNAVAILABLE\020\335\375\005\022!\n\033INTERNAL" +
      "_RESOURCE_EXHAUSTED\020\336\375\005\022\"\n\034INTERNAL_REDI" +
      "S_UNCATEGORIZED\020\337\375\005\022 \n\032INTERNAL_AWS_UNCA" +
      "TEGORIZED\020\340\375\005\022\"\n\034INTERNAL_AZURE_UNCATEGO" +
      "RIZED\020\341\375\005\022%\n\037INTERNAL_VECTORDB_UNCATEGOR" +
      "IZED\020\342\375\005\022\030\n\022CONN_UNCATEGORIZED\020\271\205\006\022\031\n\023MO" +
      "DEL_UNCATEGORIZED\020\272\205\006\022\031\n\023INPUT_UNCATEGOR" +
      "IZED\020\273\205\006\022\036\n\030ANNOTATION_UNCATEGORIZED\020\274\205\006" +
      "\022\033\n\025BILLING_UNCATEGORIZED\020\275\205\006\022\034\n\026INTERNA" +
      "L_UNCATEGORIZED\020\301\205\006\022\021\n\013BAD_REQUEST\020\240\302\005\022\022" +
      "\n\014SERVER_ERROR\020\204\303\005\032\002\020\001\"\010\010\277\306\001\020\277\306\001\"\010\010\350\201\002\020\350" +
      "\201\002\"\010\010\351\201\002\020\351\201\002\"\010\010\352\201\002\020\352\201\002\"\010\010\314\202\002\020\314\202\002\"\010\010\315\202\002\020\315" +
      "\202\002\"\010\010\316\202\002\020\316\202\002\"\010\010\317\202\002\020\317\202\002\"\010\010\320\202\002\020\320\202\002\"\010\010\321\202\002\020\321" +
      "\202\002\"\010\010\322\202\002\020\322\202\002\"\010\010\260\203\002\020\260\203\002\"\010\010\261\203\002\020\261\203\002\"\010\010\263\203\002\020\263" +
      "\203\002\"\010\010\272\203\002\020\272\203\002\"\010\010\273\270\002\020\273\270\002\"\010\010\322\270\002\020\322\270\002\"\010\010\323\270\002\020\323" +
      "\270\002\"\010\010\360\301\002\020\360\301\002\"\010\010\361\301\002\020\361\301\002\"\010\010\362\301\002\020\362\301\002\"\010\010\363\301\002\020\363" +
      "\301\002\"\010\010\364\301\002\020\364\301\002\"\010\010\234\307\001\020\234\307\001\"\010\010\235\307\001\020\235\307\001\"\010\010\236\307\001\020\236" +
      "\307\001\"\010\010\237\307\001\020\237\307\001\"\010\010\241\307\001\020\241\307\001\"\010\010\242\307\001\020\242\307\001Bg\n\034com." +
      "clarifai.grpc.api.statusP\001Z>github.com/C" +
      "larifai/clarifai-go-grpc/proto/clarifai/" +
      "api/status\242\002\004CAIPb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
