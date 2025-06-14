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
      "proto\022\023clarifai.api.status*\360c\n\nStatusCod" +
      "e\022\010\n\004ZERO\020\000\022\014\n\007SUCCESS\020\220N\022\021\n\014MIXED_STATU" +
      "S\020\232N\022\014\n\007FAILURE\020\244N\022\016\n\tTRY_AGAIN\020\256N\022\024\n\017NO" +
      "T_IMPLEMENTED\020\270N\022\n\n\005MOVED\020\302N\022\013\n\006TEAPOT\020\314" +
      "N\022\r\n\010ACCEPTED\020\326N\022\030\n\023CONN_ACCOUNT_ISSUES\020" +
      "\370U\022\033\n\022CONN_TOKEN_INVALID\020\371U\032\002\010\001\022\035\n\030CONN_" +
      "CREDENTIALS_INVALID\020\372U\022\035\n\030CONN_EXCEED_HO" +
      "URLY_LIMIT\020\373U\022\036\n\031CONN_EXCEED_MONTHLY_LIM" +
      "IT\020\374U\022\023\n\016CONN_THROTTLED\020\375U\022\030\n\023CONN_EXCEE" +
      "DS_LIMITS\020\376U\022\035\n\030CONN_INSUFFICIENT_SCOPES" +
      "\020\377U\022\025\n\020CONN_KEY_INVALID\020\200V\022\027\n\022CONN_KEY_N" +
      "OT_FOUND\020\201V\022\034\n\027CONN_BAD_REQUEST_FORMAT\020\334" +
      "V\022\030\n\023CONN_DOES_NOT_EXIST\020\335V\022\031\n\024CONN_INVA" +
      "LID_REQUEST\020\336V\022\034\n\027CONN_METHOD_NOT_ALLOWE" +
      "D\020\337V\022\031\n\024CONN_NO_GDPR_CONSENT\020\340V\022\027\n\022CONN_" +
      "INVALID_RANGE\020\341V\022\036\n\031CONN_AUTH_METHOD_DIS" +
      "ABLED\020\300W\022\023\n\rMODEL_TRAINED\020\354\244\001\022\024\n\016MODEL_T" +
      "RAINING\020\355\244\001\022\025\n\017MODEL_UNTRAINED\020\356\244\001\022\037\n\031MO" +
      "DEL_QUEUED_FOR_TRAINING\020\357\244\001\022\025\n\017MODEL_UPL" +
      "OADING\020\360\244\001\022\034\n\026MODEL_UPLOADING_FAILED\020\361\244\001" +
      "\022\033\n\025MODEL_TRAINING_FAILED\020\362\244\001\022\024\n\016MODEL_B" +
      "UILDING\020\363\244\001\022\033\n\025MODEL_BUILDING_FAILED\020\364\244\001" +
      "\022\"\n\034MODEL_BUILD_UNEXPECTED_ERROR\020\365\244\001\022\034\n\026" +
      "MODEL_TRAINING_NO_DATA\020\366\244\001\022!\n\033MODEL_TRAI" +
      "NING_NO_POSITIVES\020\367\244\001\022*\n$MODEL_TRAINING_" +
      "ONE_VS_N_SINGLE_CLASS\020\370\244\001\022\036\n\030MODEL_TRAIN" +
      "ING_TIMED_OUT\020\371\244\001\022\"\n\034MODEL_TRAINING_WAIT" +
      "ING_ERROR\020\372\244\001\022\"\n\034MODEL_TRAINING_UNKNOWN_" +
      "ERROR\020\373\244\001\022&\n\034MODEL_TRAINING_MSG_REDELIVE" +
      "R\020\374\244\001\032\002\010\001\022&\n MODEL_TRAINING_INSUFFICIENT" +
      "_DATA\020\375\244\001\022#\n\035MODEL_TRAINING_INVALID_PARA" +
      "MS\020\376\244\001\0224\n.MODEL_TRAINING_INVALID_DATA_TO" +
      "LERANCE_EXCEEDED\020\377\244\001\022\032\n\024MODEL_MODIFY_SUC" +
      "CESS\020\236\245\001\022\032\n\024MODEL_MODIFY_PENDING\020\237\245\001\022\031\n\023" +
      "MODEL_MODIFY_FAILED\020\240\245\001\022\032\n\024MODEL_DOES_NO" +
      "T_EXIST\020\320\245\001\022\035\n\027MODEL_PERMISSION_DENIED\020\321" +
      "\245\001\022\034\n\026MODEL_INVALID_ARGUMENT\020\322\245\001\022\033\n\025MODE" +
      "L_INVALID_REQUEST\020\323\245\001\022\025\n\017MODEL_EVALUATED" +
      "\020\264\246\001\022\026\n\020MODEL_EVALUATING\020\265\246\001\022\031\n\023MODEL_NO" +
      "T_EVALUATED\020\266\246\001\022!\n\033MODEL_QUEUED_FOR_EVAL" +
      "UATION\020\267\246\001\022 \n\032MODEL_EVALUATION_TIMED_OUT" +
      "\020\276\246\001\022$\n\036MODEL_EVALUATION_WAITING_ERROR\020\277" +
      "\246\001\022$\n\036MODEL_EVALUATION_UNKNOWN_ERROR\020\300\246\001" +
      "\022\035\n\027MODEL_PREDICTION_FAILED\020\301\246\001\022(\n\036MODEL" +
      "_EVALUATION_MSG_REDELIVER\020\302\246\001\032\002\010\001\022\"\n\034MOD" +
      "EL_EVALUATION_NEED_LABELS\020\303\246\001\022\"\n\034MODEL_E" +
      "VALUATION_NEED_INPUTS\020\304\246\001\022\035\n\027MODEL_EVALU" +
      "ATION_FAILED\020\305\246\001\022\035\n\027MODEL_DEPLOYMENT_FAI" +
      "LED\020\346\246\001\022\025\n\017MODEL_DEPLOYING\020\347\246\001\022!\n\033MODEL_" +
      "QUEUED_FOR_DEPLOYMENT\020\350\246\001\022\030\n\022MODEL_NOT_D" +
      "EPLOYED\020\351\246\001\022\035\n\027MODEL_BUSY_PLEASE_RETRY\020\352" +
      "\246\001\022\023\n\rMODEL_LOADING\020\353\246\001\022&\n MODEL_REFEREN" +
      "CE_INVALID_ARGUMENT\020\230\247\001\022*\n$MODEL_EXAMPLE" +
      "_INPUT_INVALID_ARGUMENT\020\254\247\001\022\024\n\016MODEL_EXP" +
      "ORTED\020\374\247\001\022\025\n\017MODEL_EXPORTING\020\375\247\001\022\034\n\026MODE" +
      "L_EXPORTING_FAILED\020\376\247\001\022\032\n\024MODEL_EXPORT_P" +
      "ENDING\020\377\247\001\022 \n\032WORKFLOW_NO_MATCHING_INPUT" +
      "\020\361\253\001\022$\n\036WORKFLOW_REQUIRE_TRAINED_MODEL\020\362" +
      "\253\001\022\030\n\022WORKFLOW_DUPLICATE\020\324\254\001\022!\n\033WORKFLOW" +
      "_UNSUPPORTED_FORMAT\020\325\254\001\022\035\n\027WORKFLOW_DOES" +
      "_NOT_EXIST\020\326\254\001\022 \n\032WORKFLOW_PERMISSION_DE" +
      "NIED\020\327\254\001\022\037\n\031WORKFLOW_INVALID_ARGUMENT\020\330\254" +
      "\001\022\035\n\027WORKFLOW_INVALID_RECIPE\020\331\254\001\022\037\n\031WORK" +
      "FLOW_INVALID_TEMPLATE\020\332\254\001\022\034\n\026WORKFLOW_IN" +
      "VALID_GRAPH\020\333\254\001\022\037\n\031WORKFLOW_INTERNAL_FAI" +
      "LURE\020\334\254\001\022\036\n\030WORKFLOW_INVALID_REQUEST\020\327\263\001" +
      "\022\035\n\027WORKFLOW_MODIFY_SUCCESS\020\206\255\001\022\035\n\027WORKF" +
      "LOW_MODIFY_PENDING\020\207\255\001\022\034\n\026WORKFLOW_MODIF" +
      "Y_FAILED\020\210\255\001\022\035\n\027WORKFLOW_REINDEX_FAILED\020" +
      "\211\255\001\022\034\n\026CONCEPT_MODIFY_SUCCESS\020\356\264\001\022\034\n\026CON" +
      "CEPT_MODIFY_PENDING\020\357\264\001\022\033\n\025CONCEPT_MODIF" +
      "Y_FAILED\020\360\264\001\022\030\n\022ANNOTATION_SUCCESS\020\326\274\001\022\030" +
      "\n\022ANNOTATION_PENDING\020\327\274\001\022\027\n\021ANNOTATION_F" +
      "AILED\020\330\274\001\022\037\n\031ANNOTATION_UNKNOWN_STATUS\020\332" +
      "\274\001\022!\n\033ANNOTATION_INVALID_ARGUMENT\020\333\274\001\022\"\n" +
      "\034ANNOTATION_PERMISSION_DENIED\020\334\274\001\022 \n\032ANN" +
      "OTATION_AWAITING_REVIEW\020\335\274\001\022*\n$ANNOTATIO" +
      "N_AWAITING_CONSENSUS_REVIEW\020\337\274\001\022\036\n\030ANNOT" +
      "ATION_REVIEW_DENIED\020\336\274\001\022\037\n\031ANNOTATION_MO" +
      "DIFY_SUCCESS\020\272\275\001\022\037\n\031ANNOTATION_MODIFY_PE" +
      "NDING\020\273\275\001\022\036\n\030ANNOTATION_MODIFY_FAILED\020\274\275" +
      "\001\022&\n METADATA_INVALID_PATCH_ARGUMENTS\020\304\302" +
      "\001\022\034\n\026METADATA_PARSING_ISSUE\020\305\302\001\022!\n\033METAD" +
      "ATA_MANIPULATION_ISSUE\020\306\302\001\022\034\n\026TRAINER_JO" +
      "B_STATE_NONE\020\250\303\001\022\036\n\030TRAINER_JOB_STATE_QU" +
      "EUED\020\251\303\001\022\037\n\031TRAINER_JOB_STATE_RUNNING\020\252\303" +
      "\001\022 \n\032TRAINER_JOB_STATE_COMPLETE\020\253\303\001\022\035\n\027T" +
      "RAINER_JOB_STATE_ERROR\020\254\303\001\022\027\n\021DATA_DUMP_" +
      "SUCCESS\020\276\304\001\022\027\n\021DATA_DUMP_PENDING\020\277\304\001\022\026\n\020" +
      "DATA_DUMP_FAILED\020\300\304\001\022\033\n\025DATA_DUMP_IN_PRO" +
      "GRESS\020\301\304\001\022\033\n\021DATA_DUMP_NO_DATA\020\302\304\001\032\002\010\001\022 " +
      "\n\032DATA_DUMP_UNEXPECTED_ERROR\020\303\304\001\022\036\n\030DATA" +
      "_DUMP_EXPORT_SUCCESS\020\322\304\001\022\036\n\030DATA_DUMP_EX" +
      "PORT_PENDING\020\323\304\001\022\035\n\027DATA_DUMP_EXPORT_FAI" +
      "LED\020\324\304\001\022\"\n\034DATA_DUMP_EXPORT_IN_PROGRESS\020" +
      "\325\304\001\022\'\n!DATA_DUMP_EXPORT_UNEXPECTED_ERROR" +
      "\020\326\304\001\022\035\n\027APP_DUPLICATION_SUCCESS\020\360\304\001\022\034\n\026A" +
      "PP_DUPLICATION_FAILED\020\361\304\001\022\035\n\027APP_DUPLICA" +
      "TION_PENDING\020\362\304\001\022!\n\033APP_DUPLICATION_IN_P" +
      "ROGRESS\020\363\304\001\022%\n\037APP_DUPLICATION_INVALID_R" +
      "EQUEST\020\364\304\001\022\033\n\025MODULE_DOES_NOT_EXIST\020\324\305\001\022" +
      "\036\n\030MODULE_PERMISSION_DENIED\020\325\305\001\022\035\n\027MODUL" +
      "E_INVALID_ARGUMENT\020\326\305\001\022\034\n\026MODULE_INVALID" +
      "_REQUEST\020\327\305\001\022\034\n\026BULK_OPERATION_SUCCESS\020\270" +
      "\306\001\022\033\n\025BULK_OPERATION_FAILED\020\271\306\001\022\034\n\026BULK_" +
      "OPERATION_PENDING\020\272\306\001\022 \n\032BULK_OPERATION_" +
      "IN_PROGRESS\020\273\306\001\022$\n\036BULK_OPERATION_INVALI" +
      "D_REQUEST\020\274\306\001\022\036\n\030BULK_OPERATION_CANCELLE" +
      "D\020\275\306\001\022%\n\037BULK_OPERATION_UNEXPECTED_ERROR" +
      "\020\276\306\001\022\033\n\025RUNNER_DOES_NOT_EXIST\020\200\310\001\022\036\n\030RUN" +
      "NER_PERMISSION_DENIED\020\201\310\001\022\035\n\027RUNNER_INVA" +
      "LID_ARGUMENT\020\202\310\001\022\034\n\026RUNNER_INVALID_REQUE" +
      "ST\020\203\310\001\022\030\n\022RUNNER_NEEDS_RETRY\020\204\310\001\022\031\n\023RUNN" +
      "ER_STREAM_START\020\205\310\001\022\027\n\021RUNNER_STREAM_END" +
      "\020\206\310\001\022\033\n\025RUNNER_ITEM_CANCELLED\020\207\310\001\022\036\n\030RUN" +
      "NER_PROCESSING_FAILED\020\210\310\001\022\035\n\027NODEPOOL_DO" +
      "ES_NOT_EXIST\020\344\310\001\022\037\n\031NODEPOOL_INVALID_ARG" +
      "UMENT\020\345\310\001\022\036\n\030NODEPOOL_INVALID_REQUEST\020\346\310" +
      "\001\022$\n\036COMPUTE_CLUSTER_DOES_NOT_EXIST\020\310\311\001\022" +
      "&\n COMPUTE_CLUSTER_INVALID_ARGUMENT\020\311\311\001\022" +
      "%\n\037COMPUTE_CLUSTER_INVALID_REQUEST\020\312\311\001\022\037" +
      "\n\031DEPLOYMENT_DOES_NOT_EXIST\020\254\312\001\022!\n\033DEPLO" +
      "YMENT_INVALID_ARGUMENT\020\255\312\001\022 \n\032DEPLOYMENT" +
      "_INVALID_REQUEST\020\256\312\001\022\"\n\034INSTANCE_TYPE_DO" +
      "ES_NOT_EXIST\020\220\313\001\022$\n\036INSTANCE_TYPE_INVALI" +
      "D_ARGUMENT\020\221\313\001\022#\n\035INSTANCE_TYPE_INVALID_" +
      "REQUEST\020\222\313\001\022+\n%COMPUTE_PLANE_METRICS_INV" +
      "ALID_REQUEST\020\364\313\001\022\"\n\034PIPELINE_STEP_DOES_N" +
      "OT_EXIST\020\330\314\001\022$\n\036PIPELINE_STEP_INVALID_AR" +
      "GUMENT\020\331\314\001\022#\n\035PIPELINE_STEP_INVALID_REQU" +
      "EST\020\332\314\001\022\035\n\027PIPELINE_STEP_UPLOADING\020\333\314\001\022$" +
      "\n\036PIPELINE_STEP_UPLOADING_FAILED\020\334\314\001\022\034\n\026" +
      "PIPELINE_STEP_BUILDING\020\335\314\001\022#\n\035PIPELINE_S" +
      "TEP_BUILDING_FAILED\020\336\314\001\022*\n$PIPELINE_STEP" +
      "_BUILD_UNEXPECTED_ERROR\020\337\314\001\022\031\n\023PIPELINE_" +
      "STEP_READY\020\340\314\001\022\035\n\027PIPELINE_STEP_NOT_READ" +
      "Y\020\341\314\001\022\023\n\rINPUT_SUCCESS\020\260\352\001\022\023\n\rINPUT_PEND" +
      "ING\020\261\352\001\022\022\n\014INPUT_FAILED\020\262\352\001\022\027\n\021INPUT_IN_" +
      "PROGRESS\020\263\352\001\022 \n\026INPUT_DOWNLOAD_SUCCESS\020\260" +
      "\352\001\032\002\010\001\022 \n\026INPUT_DOWNLOAD_PENDING\020\261\352\001\032\002\010\001" +
      "\022\037\n\025INPUT_DOWNLOAD_FAILED\020\262\352\001\032\002\010\001\022$\n\032INP" +
      "UT_DOWNLOAD_IN_PROGRESS\020\263\352\001\032\002\010\001\022 \n\032INPUT" +
      "_STATUS_UPDATE_FAILED\020\264\352\001\022\031\n\023INPUT_DELET" +
      "E_FAILED\020\265\352\001\022\025\n\017INPUT_DUPLICATE\020\224\353\001\022\036\n\030I" +
      "NPUT_UNSUPPORTED_FORMAT\020\225\353\001\022\032\n\024INPUT_DOE" +
      "S_NOT_EXIST\020\226\353\001\022\035\n\027INPUT_PERMISSION_DENI" +
      "ED\020\227\353\001\022\034\n\026INPUT_INVALID_ARGUMENT\020\230\353\001\022\026\n\020" +
      "INPUT_OVER_LIMIT\020\231\353\001\022\027\n\021INPUT_INVALID_UR" +
      "L\020\232\353\001\022\032\n\024INPUT_MODIFY_SUCCESS\020\370\353\001\022\032\n\024INP" +
      "UT_MODIFY_PENDING\020\371\353\001\022\031\n\023INPUT_MODIFY_FA" +
      "ILED\020\373\353\001\022\037\n\031INPUT_STORAGE_HOST_FAILED\020\202\354" +
      "\001\022\035\n\027ALL_INPUT_INVALID_BYTES\020\334\354\001\022\033\n\025INPU" +
      "T_CLUSTER_SUCCESS\020\300\355\001\022\033\n\025INPUT_CLUSTER_P" +
      "ENDING\020\301\355\001\022\032\n\024INPUT_CLUSTER_FAILED\020\302\355\001\022\037" +
      "\n\031INPUT_CLUSTER_IN_PROGRESS\020\303\355\001\022\033\n\025INPUT" +
      "_REINDEX_SUCCESS\020\244\356\001\022\033\n\025INPUT_REINDEX_PE" +
      "NDING\020\245\356\001\022\032\n\024INPUT_REINDEX_FAILED\020\246\356\001\022\037\n" +
      "\031INPUT_REINDEX_IN_PROGRESS\020\247\356\001\022\"\n\034INPUT_" +
      "VIDEO_DOWNLOAD_SUCCESS\020\230\362\001\022\"\n\034INPUT_VIDE" +
      "O_DOWNLOAD_PENDING\020\231\362\001\022!\n\033INPUT_VIDEO_DO" +
      "WNLOAD_FAILED\020\232\362\001\022\033\n\025INPUT_VIDEO_DUPLICA" +
      "TE\020\374\362\001\022$\n\036INPUT_VIDEO_UNSUPPORTED_FORMAT" +
      "\020\375\362\001\022 \n\032INPUT_VIDEO_DOES_NOT_EXIST\020\376\362\001\022#" +
      "\n\035INPUT_VIDEO_PERMISSION_DENIED\020\377\362\001\022\"\n\034I" +
      "NPUT_VIDEO_INVALID_ARGUMENT\020\200\363\001\022\034\n\026INPUT" +
      "_VIDEO_OVER_LIMIT\020\201\363\001\022\035\n\027INPUT_VIDEO_INV" +
      "ALID_URL\020\202\363\001\022 \n\032INPUT_VIDEO_MODIFY_SUCCE" +
      "SS\020\340\363\001\022 \n\032INPUT_VIDEO_MODIFY_PENDING\020\341\363\001" +
      "\022\037\n\031INPUT_VIDEO_MODIFY_FAILED\020\343\363\001\022%\n\037INP" +
      "UT_VIDEO_STORAGE_HOST_FAILED\020\352\363\001\022$\n\036ALL_" +
      "INPUT_VIDEOS_INVALID_BYTES\020\304\364\001\022$\n\036INPUT_" +
      "VIDEO_PROCESSING_SUCCESS\020\250\365\001\022$\n\036INPUT_VI" +
      "DEO_PROCESSING_PENDING\020\262\365\001\022#\n\035INPUT_VIDE" +
      "O_PROCESSING_FAILED\020\274\365\001\022\'\n!INPUT_VIDEO_S" +
      "TORAGE_INCONSISTENCY\020\306\365\001\022!\n\033INPUT_VIDEO_" +
      "STORAGE_FAILURE\020\320\365\001\022(\n\"INPUT_VIDEO_URL_G" +
      "ENERATION_FAILURE\020\332\365\001\022\035\n\027INPUT_CONNECTIO" +
      "N_FAILED\020\274\270\002\022&\n REQUEST_DISABLED_FOR_MAI" +
      "NTENANCE\020\275\270\002\022/\n%INPUT_WRITES_DISABLED_FO" +
      "R_MAINTENANCE\020\276\270\002\032\002\010\001\022\033\n\025INPUT_INVALID_R" +
      "EQUEST\020\277\270\002\022\035\n\027PREDICT_INVALID_REQUEST\020\301\270" +
      "\002\022\034\n\026SEARCH_INVALID_REQUEST\020\302\270\002\022\036\n\030CONCE" +
      "PTS_INVALID_REQUEST\020\303\270\002\022\033\n\025STATS_INVALID" +
      "_REQUEST\020\304\270\002\022\034\n\026DATABASE_DUPLICATE_KEY\020\312" +
      "\270\002\022 \n\032DATABASE_STATEMENT_TIMEOUT\020\313\270\002\022$\n\036" +
      "DATABASE_INVALID_ROWS_AFFECTED\020\314\270\002\022 \n\032DA" +
      "TABASE_DEADLOCK_DETECTED\020\315\270\002\022\030\n\022DATABASE" +
      "_FAIL_TASK\020\316\270\002\022&\n DATABASE_FAIL_TO_GET_C" +
      "ONNECTIONS\020\317\270\002\022\037\n\031DATABASE_TOO_MANY_CLIE" +
      "NTS\020\320\270\002\022\"\n\034DATABASE_CONSTRAINT_VIOLATED\020" +
      "\321\270\002\022\027\n\021DATABASE_CANCELED\020\325\270\002\022\037\n\031ASYNC_WO" +
      "RKER_MULTI_ERRORS\020\324\270\002\022\034\n\026RPC_REQUEST_QUE" +
      "UE_FULL\020\336\270\002\022\034\n\026RPC_SERVER_UNAVAILABLE\020\337\270" +
      "\002\022\031\n\023RPC_REQUEST_TIMEOUT\020\340\270\002\022#\n\035RPC_MAX_" +
      "MESSAGE_SIZE_EXCEEDED\020\341\270\002\022\022\n\014RPC_CANCELE" +
      "D\020\343\270\002\022\030\n\022RPC_UNKNOWN_METHOD\020\344\270\002\022\036\n\030REQUE" +
      "ST_CANCELED_BY_USER\020\345\270\002\022\036\n\030CLUSTER_INTER" +
      "NAL_FAILURE\020\240\320\002\022\037\n\031EXTERNAL_CONNECTION_E" +
      "RROR\020\342\270\002\022\032\n\024QUERY_INVALID_SYNTAX\020\362\270\002\022\026\n\020" +
      "QUEUE_CONN_ERROR\020\250\300\002\022!\n\033QUEUE_CLOSE_REQU" +
      "EST_TIMEOUT\020\252\300\002\022\027\n\021QUEUE_CONN_CLOSED\020\253\300\002" +
      "\022\037\n\031QUEUE_PUBLISH_ACK_TIMEOUT\020\254\300\002\022\031\n\023QUE" +
      "UE_PUBLISH_ERROR\020\255\300\002\022 \n\032QUEUE_SUBSCRIPTI" +
      "ON_TIMEOUT\020\256\300\002\022\036\n\030QUEUE_SUBSCRIPTION_ERR" +
      "OR\020\257\300\002\022\036\n\030QUEUE_MARSHALLING_FAILED\020\260\300\002\022 " +
      "\n\032QUEUE_UNMARSHALLING_FAILED\020\261\300\002\022\'\n!QUEU" +
      "E_MAX_MSG_REDELIVERY_EXCEEDED\020\262\300\002\022\027\n\021QUE" +
      "UE_ACK_FAILURE\020\263\300\002\022\023\n\rSQS_OVERLIMIT\020\214\301\002\022" +
      " \n\032SQS_INVALID_RECEIPT_HANDLE\020\215\301\002\022\021\n\013SQS" +
      "_UNKNOWN\020\216\301\002\022\035\n\027SEARCH_INTERNAL_FAILURE\020" +
      "\371\317\002\022\037\n\031SEARCH_PROJECTION_FAILURE\020\372\317\002\022\037\n\031" +
      "SEARCH_PREDICTION_FAILURE\020\373\317\002\022\'\n!SEARCH_" +
      "BY_NOT_FULLY_INDEXED_INPUT\020\374\317\002\022 \n\032SAVED_" +
      "SEARCH_MODIFY_FAILED\020\375\317\002\022\037\n\031SEARCH_COUNT" +
      "S_UNAVAILABLE\020\376\317\002\022\027\n\021EVALUATION_QUEUED\020\334" +
      "\320\002\022\034\n\026EVALUATION_IN_PROGRESS\020\335\320\002\022\030\n\022EVAL" +
      "UATION_SUCCESS\020\336\320\002\022(\n\"EVALUATION_FAILED_" +
      "TO_RETRIEVE_DATA\020\337\320\002\022!\n\033EVALUATION_INVAL" +
      "ID_ARGUMENT\020\340\320\002\022\027\n\021EVALUATION_FAILED\020\341\320\002" +
      "\022\030\n\022EVALUATION_PENDING\020\342\320\002\022\032\n\024EVALUATION" +
      "_TIMED_OUT\020\343\320\002\022!\n\033EVALUATION_UNEXPECTED_" +
      "ERROR\020\344\320\002\022\026\n\020EVALUATION_MIXED\020\345\320\002\022\030\n\022STR" +
      "IPE_EVENT_ERROR\020\341\327\002\022\020\n\nCACHE_MISS\020\311\337\002\022&\n" +
      " REDIS_SCRIPT_EXITED_WITH_FAILURE\020\312\337\002\022\026\n" +
      "\020REDIS_STREAM_ERR\020\313\337\002\022\030\n\022REDIS_NO_CONSUM" +
      "ERS\020\314\337\002\022\032\n\024REDIS_STREAM_BACKOFF\020\315\337\002\022\030\n\022S" +
      "IGNUP_EVENT_ERROR\020\261\347\002\022\024\n\016SIGNUP_FLAGGED\020" +
      "\262\347\002\022\032\n\024FILETYPE_UNSUPPORTED\020\263\347\002\022\037\n\031APP_C" +
      "OUNT_INVALID_MESSAGE\020\231\357\002\022\'\n!APP_COUNT_UP" +
      "DATE_INCREMENT_FAILED\020\232\357\002\022\036\n\030APP_COUNT_R" +
      "EBUILD_FAILED\020\233\357\002\022 \n\032APP_COUNT_INTERNAL_" +
      "FAILURE\020\234\357\002\022\027\n\021MP_DOWNLOAD_ERROR\020\375\357\002\022\032\n\024" +
      "MP_RESOLVE_DNS_ERROR\020\376\357\002\022)\n#MP_DOWNLOAD_" +
      "MAX_SIZE_EXCEEDED_ERROR\020\377\357\002\022\033\n\025MP_IMAGE_" +
      "DECODE_ERROR\020\200\360\002\022\031\n\023MP_INVALID_ARGUMENT\020" +
      "\201\360\002\022\037\n\031MP_IMAGE_PROCESSING_ERROR\020\202\360\002\022\031\n\023" +
      "DATATIER_CONN_ERROR\020\341\360\002\022\027\n\021USER_CONSENT_" +
      "FACE\020\321\206\003\022\024\n\016WORKER_MISSING\020\270\216\003\022\023\n\rWORKER" +
      "_ACTIVE\020\271\216\003\022\025\n\017WORKER_INACTIVE\020\272\216\003\022\027\n\021CO" +
      "LLECTOR_MISSING\020\240\226\003\022\026\n\020COLLECTOR_ACTIVE\020" +
      "\241\226\003\022\030\n\022COLLECTOR_INACTIVE\020\242\226\003\022!\n\033COLLECT" +
      "OR_POST_INPUT_FAILED\020\243\226\003\022*\n$SSO_IDENTITY" +
      "_PROVIDER_DOES_NOT_EXIST\020\211\236\003\022\026\n\020TASK_IN_" +
      "PROGRESS\020\361\245\003\022\017\n\tTASK_DONE\020\362\245\003\022\022\n\014TASK_WO" +
      "NT_DO\020\363\245\003\022\021\n\013TASK_FAILED\020\365\245\003\022\017\n\tTASK_IDL" +
      "E\020\366\245\003\022\023\n\rTASK_CONFLICT\020\324\246\003\022\032\n\024TASK_NOT_I" +
      "MPLEMENTED\020\325\246\003\022\022\n\014TASK_MISSING\020\326\246\003\022\034\n\026TA" +
      "SK_PERMISSION_DENIED\020\327\246\003\022\035\n\027TASK_ASSIGNM" +
      "ENT_SUCCESS\020\270\247\003\022\035\n\027TASK_ASSIGNMENT_PENDI" +
      "NG\020\271\247\003\022%\n\037TASK_ASSIGNMENT_AWAITING_REVIE" +
      "W\020\272\247\003\022/\n)TASK_ASSIGNMENT_AWAITING_CONSEN" +
      "SUS_REVIEW\020\273\247\003\022\036\n\030TASK_ASSIGNMENT_REJECT" +
      "ED\020\274\247\003\022$\n\036TASK_ASSIGNMENT_REVIEW_SUCCESS" +
      "\020\234\250\003\022$\n\036TASK_ASSIGNMENT_REVIEW_PENDING\020\235" +
      "\250\003\022&\n TASK_ASSIGNMENT_REVIEW_DISMISSED\020\236" +
      "\250\003\022\031\n\023LABEL_ORDER_PENDING\020\331\255\003\022\035\n\027LABEL_O" +
      "RDER_IN_PROGRESS\020\332\255\003\022\031\n\023LABEL_ORDER_SUCC" +
      "ESS\020\333\255\003\022\032\n\024LABEL_ORDER_CANCELED\020\334\255\003\022\024\n\016L" +
      "ICENSE_ACTIVE\020\340\324\003\022\034\n\026LICENSE_DOES_NOT_EX" +
      "IST\020\341\324\003\022\031\n\023LICENSE_NEED_UPDATE\020\342\324\003\022\025\n\017LI" +
      "CENSE_EXPIRED\020\343\324\003\022\025\n\017LICENSE_REVOKED\020\344\324\003" +
      "\022\025\n\017LICENSE_DELETED\020\345\324\003\022\035\n\027LICENSE_VOLUM" +
      "E_EXCEEDED\020\346\324\003\022!\n\033PASSWORD_VALIDATION_SU" +
      "CCESS\020\310\334\003\022 \n\032PASSWORD_VALIDATION_FAILED\020" +
      "\311\334\003\022%\n\037PASSWORDPOLICY_INVALID_ARGUMENT\020\312" +
      "\334\003\022\"\n\034FEATUREFLAG_CONFIG_NOT_FOUND\020\260\344\003\022\"" +
      "\n\034FEATUREFLAG_INVALID_ARGUMENT\020\261\344\003\022\031\n\023FE" +
      "ATUREFLAG_BLOCKED\020\262\344\003\022\033\n\025FEATUREFLAG_NOT" +
      "_FOUND\020\263\344\003\022\031\n\023MAINTENANCE_SUCCESS\020\230\354\003\022\030\n" +
      "\022MAINTENANCE_FAILED\020\231\354\003\022\035\n\027DATASET_VERSI" +
      "ON_PENDING\020\205\364\003\022!\n\033DATASET_VERSION_IN_PRO" +
      "GRESS\020\212\364\003\022\033\n\025DATASET_VERSION_READY\020\217\364\003\022\035" +
      "\n\027DATASET_VERSION_FAILURE\020\224\364\003\022&\n DATASET" +
      "_VERSION_UNEXPECTED_ERROR\020\231\364\003\022\036\n\030DATASET" +
      "_VERSION_CONFLICT\020\236\364\003\022\033\n\025DATASET_INPUT_S" +
      "UCCESS\020\344\364\003\022\035\n\027DATASET_INPUT_DUPLICATE\020\345\364" +
      "\003\022$\n\036DATASET_VERSION_EXPORT_SUCCESS\020\310\365\003\022" +
      "$\n\036DATASET_VERSION_EXPORT_PENDING\020\311\365\003\022#\n" +
      "\035DATASET_VERSION_EXPORT_FAILED\020\312\365\003\022(\n\"DA" +
      "TASET_VERSION_EXPORT_IN_PROGRESS\020\313\365\003\022-\n\'" +
      "DATASET_VERSION_EXPORT_UNEXPECTED_ERROR\020" +
      "\314\365\003\022\020\n\nJOB_QUEUED\020\200\364\003\022\021\n\013JOB_RUNNING\020\201\364\003" +
      "\022\023\n\rJOB_COMPLETED\020\202\364\003\022\020\n\nJOB_FAILED\020\203\364\003\022" +
      "\023\n\rJOB_CANCELLED\020\204\364\003\022\032\n\024JOB_UNEXPECTED_E" +
      "RROR\020\206\364\003\022\022\n\014JOB_CONFLICT\020\207\364\003\022\034\n\026AUTH_MIS" +
      "SING_IDP_ASSOC\020\350\373\003\022\031\n\023LIST_OBJECTS_FAILE" +
      "D\020\320\203\004\022\034\n\026ARCHIVE_EXTRACT_FAILED\020\270\213\004\022\030\n\022U" +
      "PLOAD_IN_PROGRESS\020\240\223\004\022\021\n\013UPLOAD_DONE\020\241\223\004" +
      "\022\023\n\rUPLOAD_FAILED\020\242\223\004\022\035\n\027UPLOAD_UNEXPECT" +
      "ED_ERROR\020\243\223\004\022\024\n\016UPLOAD_EXPIRED\020\244\223\004\022\025\n\017UP" +
      "LOAD_CANCELED\020\245\223\004\022\025\n\017UPLOAD_CONFLICT\020\246\223\004" +
      "\022\032\n\024BILLING_INVALID_INFO\020\210\233\004\022\034\n\026BILLING_" +
      "MISSING_TOKENS\020\211\233\004\022!\n\033LOG_ENTRIES_INVALI" +
      "D_REQUEST\020\360\242\004\022\033\n\025INTERNAL_SERVER_ISSUE\020\324" +
      "\375\005\022\035\n\027INTERNAL_FETCHING_ISSUE\020\325\375\005\022\035\n\027INT" +
      "ERNAL_DATABASE_ISSUE\020\326\375\005\022\037\n\031INTERNAL_CON" +
      "TEXT_CANCELED\020\330\375\005\022!\n\033INTERNAL_UNEXPECTED" +
      "_TIMEOUT\020\331\375\005\022\034\n\026INTERNAL_UNEXPECTED_V1\020\332" +
      "\375\005\022\037\n\031INTERNAL_UNEXPECTED_PANIC\020\333\375\005\022\037\n\031I" +
      "NTERNAL_UNEXPECTED_SPIRE\020\334\375\005\022 \n\032INTERNAL" +
      "_REDIS_UNAVAILABLE\020\335\375\005\022!\n\033INTERNAL_RESOU" +
      "RCE_EXHAUSTED\020\336\375\005\022\"\n\034INTERNAL_REDIS_UNCA" +
      "TEGORIZED\020\337\375\005\022 \n\032INTERNAL_AWS_UNCATEGORI" +
      "ZED\020\340\375\005\022\"\n\034INTERNAL_AZURE_UNCATEGORIZED\020" +
      "\341\375\005\022%\n\037INTERNAL_VECTORDB_UNCATEGORIZED\020\342" +
      "\375\005\022#\n\035INTERNAL_ORACLE_UNCATEGORIZED\020\343\375\005\022" +
      "\"\n\034INTERNAL_VULTR_UNCATEGORIZED\020\344\375\005\022 \n\032I" +
      "NTERNAL_GCP_UNCATEGORIZED\020\345\375\005\022\030\n\022CONN_UN" +
      "CATEGORIZED\020\271\205\006\022\031\n\023MODEL_UNCATEGORIZED\020\272" +
      "\205\006\022\031\n\023INPUT_UNCATEGORIZED\020\273\205\006\022\036\n\030ANNOTAT" +
      "ION_UNCATEGORIZED\020\274\205\006\022\033\n\025BILLING_UNCATEG" +
      "ORIZED\020\275\205\006\022\034\n\026INTERNAL_UNCATEGORIZED\020\301\205\006" +
      "\022\021\n\013BAD_REQUEST\020\240\302\005\022\022\n\014SERVER_ERROR\020\204\303\005\032" +
      "\002\020\001\"\010\010\277\306\001\020\277\306\001\"\010\010\350\201\002\020\350\201\002\"\010\010\351\201\002\020\351\201\002\"\010\010\352\201\002\020" +
      "\352\201\002\"\010\010\314\202\002\020\314\202\002\"\010\010\315\202\002\020\315\202\002\"\010\010\316\202\002\020\316\202\002\"\010\010\317\202\002\020" +
      "\317\202\002\"\010\010\320\202\002\020\320\202\002\"\010\010\321\202\002\020\321\202\002\"\010\010\322\202\002\020\322\202\002\"\010\010\260\203\002\020" +
      "\260\203\002\"\010\010\261\203\002\020\261\203\002\"\010\010\263\203\002\020\263\203\002\"\010\010\272\203\002\020\272\203\002\"\010\010\273\270\002\020" +
      "\273\270\002\"\010\010\322\270\002\020\322\270\002\"\010\010\323\270\002\020\323\270\002\"\010\010\360\301\002\020\360\301\002\"\010\010\361\301\002\020" +
      "\361\301\002\"\010\010\362\301\002\020\362\301\002\"\010\010\363\301\002\020\363\301\002\"\010\010\364\301\002\020\364\301\002\"\010\010\234\307\001\020" +
      "\234\307\001\"\010\010\235\307\001\020\235\307\001\"\010\010\236\307\001\020\236\307\001\"\010\010\237\307\001\020\237\307\001\"\010\010\241\307\001\020" +
      "\241\307\001\"\010\010\242\307\001\020\242\307\001Bg\n\034com.clarifai.grpc.api.s" +
      "tatusP\001Z>github.com/Clarifai/clarifai-go" +
      "-grpc/proto/clarifai/api/status\242\002\004CAIPb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
