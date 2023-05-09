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
      "proto\022\023clarifai.api.status*\233Q\n\nStatusCod" +
      "e\022\010\n\004ZERO\020\000\022\014\n\007SUCCESS\020\220N\022\021\n\014MIXED_STATU" +
      "S\020\232N\022\014\n\007FAILURE\020\244N\022\016\n\tTRY_AGAIN\020\256N\022\024\n\017NO" +
      "T_IMPLEMENTED\020\270N\022\n\n\005MOVED\020\302N\022\030\n\023CONN_ACC" +
      "OUNT_ISSUES\020\370U\022\033\n\022CONN_TOKEN_INVALID\020\371U\032" +
      "\002\010\001\022\035\n\030CONN_CREDENTIALS_INVALID\020\372U\022\035\n\030CO" +
      "NN_EXCEED_HOURLY_LIMIT\020\373U\022\036\n\031CONN_EXCEED" +
      "_MONTHLY_LIMIT\020\374U\022\023\n\016CONN_THROTTLED\020\375U\022\030" +
      "\n\023CONN_EXCEEDS_LIMITS\020\376U\022\035\n\030CONN_INSUFFI" +
      "CIENT_SCOPES\020\377U\022\025\n\020CONN_KEY_INVALID\020\200V\022\027" +
      "\n\022CONN_KEY_NOT_FOUND\020\201V\022\034\n\027CONN_BAD_REQU" +
      "EST_FORMAT\020\334V\022\030\n\023CONN_DOES_NOT_EXIST\020\335V\022" +
      "\031\n\024CONN_INVALID_REQUEST\020\336V\022\034\n\027CONN_METHO" +
      "D_NOT_ALLOWED\020\337V\022\031\n\024CONN_NO_GDPR_CONSENT" +
      "\020\340V\022\036\n\031CONN_AUTH_METHOD_DISABLED\020\300W\022\023\n\rM" +
      "ODEL_TRAINED\020\354\244\001\022\024\n\016MODEL_TRAINING\020\355\244\001\022\025" +
      "\n\017MODEL_UNTRAINED\020\356\244\001\022\037\n\031MODEL_QUEUED_FO" +
      "R_TRAINING\020\357\244\001\022\025\n\017MODEL_UPLOADING\020\360\244\001\022\034\n" +
      "\026MODEL_UPLOADING_FAILED\020\361\244\001\022\033\n\025MODEL_TRA" +
      "INING_FAILED\020\362\244\001\022\034\n\026MODEL_TRAINING_NO_DA" +
      "TA\020\366\244\001\022!\n\033MODEL_TRAINING_NO_POSITIVES\020\367\244" +
      "\001\022*\n$MODEL_TRAINING_ONE_VS_N_SINGLE_CLAS" +
      "S\020\370\244\001\022\036\n\030MODEL_TRAINING_TIMED_OUT\020\371\244\001\022\"\n" +
      "\034MODEL_TRAINING_WAITING_ERROR\020\372\244\001\022\"\n\034MOD" +
      "EL_TRAINING_UNKNOWN_ERROR\020\373\244\001\022&\n\034MODEL_T" +
      "RAINING_MSG_REDELIVER\020\374\244\001\032\002\010\001\022&\n MODEL_T" +
      "RAINING_INSUFFICIENT_DATA\020\375\244\001\022#\n\035MODEL_T" +
      "RAINING_INVALID_PARAMS\020\376\244\001\0224\n.MODEL_TRAI" +
      "NING_INVALID_DATA_TOLERANCE_EXCEEDED\020\377\244\001" +
      "\022\032\n\024MODEL_MODIFY_SUCCESS\020\236\245\001\022\032\n\024MODEL_MO" +
      "DIFY_PENDING\020\237\245\001\022\031\n\023MODEL_MODIFY_FAILED\020" +
      "\240\245\001\022\032\n\024MODEL_DOES_NOT_EXIST\020\320\245\001\022\035\n\027MODEL" +
      "_PERMISSION_DENIED\020\321\245\001\022\034\n\026MODEL_INVALID_" +
      "ARGUMENT\020\322\245\001\022\033\n\025MODEL_INVALID_REQUEST\020\323\245" +
      "\001\022\025\n\017MODEL_EVALUATED\020\264\246\001\022\026\n\020MODEL_EVALUA" +
      "TING\020\265\246\001\022\031\n\023MODEL_NOT_EVALUATED\020\266\246\001\022!\n\033M" +
      "ODEL_QUEUED_FOR_EVALUATION\020\267\246\001\022 \n\032MODEL_" +
      "EVALUATION_TIMED_OUT\020\276\246\001\022$\n\036MODEL_EVALUA" +
      "TION_WAITING_ERROR\020\277\246\001\022$\n\036MODEL_EVALUATI" +
      "ON_UNKNOWN_ERROR\020\300\246\001\022\035\n\027MODEL_PREDICTION" +
      "_FAILED\020\301\246\001\022(\n\036MODEL_EVALUATION_MSG_REDE" +
      "LIVER\020\302\246\001\032\002\010\001\022\"\n\034MODEL_EVALUATION_NEED_L" +
      "ABELS\020\303\246\001\022\"\n\034MODEL_EVALUATION_NEED_INPUT" +
      "S\020\304\246\001\022\035\n\027MODEL_EVALUATION_FAILED\020\305\246\001\022\035\n\027" +
      "MODEL_DEPLOYMENT_FAILED\020\346\246\001\022\025\n\017MODEL_DEP" +
      "LOYING\020\347\246\001\022!\n\033MODEL_QUEUED_FOR_DEPLOYMEN" +
      "T\020\350\246\001\022\030\n\022MODEL_NOT_DEPLOYED\020\351\246\001\022&\n MODEL" +
      "_REFERENCE_INVALID_ARGUMENT\020\230\247\001\022*\n$MODEL" +
      "_EXAMPLE_INPUT_INVALID_ARGUMENT\020\254\247\001\022 \n\032W" +
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
      "D\020\300\304\001\022\033\n\025DATA_DUMP_IN_PROGRESS\020\301\304\001\022\027\n\021DA" +
      "TA_DUMP_NO_DATA\020\302\304\001\022 \n\032DATA_DUMP_UNEXPEC" +
      "TED_ERROR\020\303\304\001\022\036\n\030DATA_DUMP_EXPORT_SUCCES" +
      "S\020\322\304\001\022\036\n\030DATA_DUMP_EXPORT_PENDING\020\323\304\001\022\035\n" +
      "\027DATA_DUMP_EXPORT_FAILED\020\324\304\001\022\"\n\034DATA_DUM" +
      "P_EXPORT_IN_PROGRESS\020\325\304\001\022\'\n!DATA_DUMP_EX" +
      "PORT_UNEXPECTED_ERROR\020\326\304\001\022\035\n\027APP_DUPLICA" +
      "TION_SUCCESS\020\360\304\001\022\034\n\026APP_DUPLICATION_FAIL" +
      "ED\020\361\304\001\022\035\n\027APP_DUPLICATION_PENDING\020\362\304\001\022!\n" +
      "\033APP_DUPLICATION_IN_PROGRESS\020\363\304\001\022%\n\037APP_" +
      "DUPLICATION_INVALID_REQUEST\020\364\304\001\022\033\n\025MODUL" +
      "E_DOES_NOT_EXIST\020\324\305\001\022\036\n\030MODULE_PERMISSIO" +
      "N_DENIED\020\325\305\001\022\035\n\027MODULE_INVALID_ARGUMENT\020" +
      "\326\305\001\022\034\n\026MODULE_INVALID_REQUEST\020\327\305\001\022\034\n\026BUL" +
      "K_OPERATION_SUCCESS\020\270\306\001\022\033\n\025BULK_OPERATIO" +
      "N_FAILED\020\271\306\001\022\034\n\026BULK_OPERATION_PENDING\020\272" +
      "\306\001\022 \n\032BULK_OPERATION_IN_PROGRESS\020\273\306\001\022$\n\036" +
      "BULK_OPERATION_INVALID_REQUEST\020\274\306\001\022\036\n\030BU" +
      "LK_OPERATION_CANCELLED\020\275\306\001\022%\n\037BULK_OPERA" +
      "TION_UNEXPECTED_ERROR\020\276\306\001\022\034\n\026INPUT_DOWNL" +
      "OAD_SUCCESS\020\260\352\001\022\034\n\026INPUT_DOWNLOAD_PENDIN" +
      "G\020\261\352\001\022\033\n\025INPUT_DOWNLOAD_FAILED\020\262\352\001\022 \n\032IN" +
      "PUT_DOWNLOAD_IN_PROGRESS\020\263\352\001\022 \n\032INPUT_ST" +
      "ATUS_UPDATE_FAILED\020\264\352\001\022\031\n\023INPUT_DELETE_F" +
      "AILED\020\265\352\001\022\025\n\017INPUT_DUPLICATE\020\224\353\001\022\036\n\030INPU" +
      "T_UNSUPPORTED_FORMAT\020\225\353\001\022\032\n\024INPUT_DOES_N" +
      "OT_EXIST\020\226\353\001\022\035\n\027INPUT_PERMISSION_DENIED\020" +
      "\227\353\001\022\034\n\026INPUT_INVALID_ARGUMENT\020\230\353\001\022\026\n\020INP" +
      "UT_OVER_LIMIT\020\231\353\001\022\027\n\021INPUT_INVALID_URL\020\232" +
      "\353\001\022\032\n\024INPUT_MODIFY_SUCCESS\020\370\353\001\022\032\n\024INPUT_" +
      "MODIFY_PENDING\020\371\353\001\022\031\n\023INPUT_MODIFY_FAILE" +
      "D\020\373\353\001\022\037\n\031INPUT_STORAGE_HOST_FAILED\020\202\354\001\022\035" +
      "\n\027ALL_INPUT_INVALID_BYTES\020\334\354\001\022\033\n\025INPUT_C" +
      "LUSTER_SUCCESS\020\300\355\001\022\033\n\025INPUT_CLUSTER_PEND" +
      "ING\020\301\355\001\022\032\n\024INPUT_CLUSTER_FAILED\020\302\355\001\022\037\n\031I" +
      "NPUT_CLUSTER_IN_PROGRESS\020\303\355\001\022\033\n\025INPUT_RE" +
      "INDEX_SUCCESS\020\244\356\001\022\033\n\025INPUT_REINDEX_PENDI" +
      "NG\020\245\356\001\022\032\n\024INPUT_REINDEX_FAILED\020\246\356\001\022\037\n\031IN" +
      "PUT_REINDEX_IN_PROGRESS\020\247\356\001\022\"\n\034INPUT_VID" +
      "EO_DOWNLOAD_SUCCESS\020\230\362\001\022\"\n\034INPUT_VIDEO_D" +
      "OWNLOAD_PENDING\020\231\362\001\022!\n\033INPUT_VIDEO_DOWNL" +
      "OAD_FAILED\020\232\362\001\022\033\n\025INPUT_VIDEO_DUPLICATE\020" +
      "\374\362\001\022$\n\036INPUT_VIDEO_UNSUPPORTED_FORMAT\020\375\362" +
      "\001\022 \n\032INPUT_VIDEO_DOES_NOT_EXIST\020\376\362\001\022#\n\035I" +
      "NPUT_VIDEO_PERMISSION_DENIED\020\377\362\001\022\"\n\034INPU" +
      "T_VIDEO_INVALID_ARGUMENT\020\200\363\001\022\034\n\026INPUT_VI" +
      "DEO_OVER_LIMIT\020\201\363\001\022\035\n\027INPUT_VIDEO_INVALI" +
      "D_URL\020\202\363\001\022 \n\032INPUT_VIDEO_MODIFY_SUCCESS\020" +
      "\340\363\001\022 \n\032INPUT_VIDEO_MODIFY_PENDING\020\341\363\001\022\037\n" +
      "\031INPUT_VIDEO_MODIFY_FAILED\020\343\363\001\022%\n\037INPUT_" +
      "VIDEO_STORAGE_HOST_FAILED\020\352\363\001\022$\n\036ALL_INP" +
      "UT_VIDEOS_INVALID_BYTES\020\304\364\001\022\035\n\027INPUT_CON" +
      "NECTION_FAILED\020\274\270\002\022&\n REQUEST_DISABLED_F" +
      "OR_MAINTENANCE\020\275\270\002\022+\n%INPUT_WRITES_DISAB" +
      "LED_FOR_MAINTENANCE\020\276\270\002\022\033\n\025INPUT_INVALID" +
      "_REQUEST\020\277\270\002\022\035\n\027PREDICT_INVALID_REQUEST\020" +
      "\301\270\002\022\034\n\026SEARCH_INVALID_REQUEST\020\302\270\002\022\036\n\030CON" +
      "CEPTS_INVALID_REQUEST\020\303\270\002\022\033\n\025STATS_INVAL" +
      "ID_REQUEST\020\304\270\002\022\034\n\026DATABASE_DUPLICATE_KEY" +
      "\020\312\270\002\022 \n\032DATABASE_STATEMENT_TIMEOUT\020\313\270\002\022$" +
      "\n\036DATABASE_INVALID_ROWS_AFFECTED\020\314\270\002\022 \n\032" +
      "DATABASE_DEADLOCK_DETECTED\020\315\270\002\022\030\n\022DATABA" +
      "SE_FAIL_TASK\020\316\270\002\022&\n DATABASE_FAIL_TO_GET" +
      "_CONNECTIONS\020\317\270\002\022\037\n\031DATABASE_TOO_MANY_CL" +
      "IENTS\020\320\270\002\022\"\n\034DATABASE_CONSTRAINT_VIOLATE" +
      "D\020\321\270\002\022\027\n\021DATABASE_CANCELED\020\325\270\002\022\037\n\031ASYNC_" +
      "WORKER_MULTI_ERRORS\020\324\270\002\022\034\n\026RPC_REQUEST_Q" +
      "UEUE_FULL\020\336\270\002\022\034\n\026RPC_SERVER_UNAVAILABLE\020" +
      "\337\270\002\022\031\n\023RPC_REQUEST_TIMEOUT\020\340\270\002\022#\n\035RPC_MA" +
      "X_MESSAGE_SIZE_EXCEEDED\020\341\270\002\022\022\n\014RPC_CANCE" +
      "LED\020\343\270\002\022\030\n\022RPC_UNKNOWN_METHOD\020\344\270\002\022\036\n\030REQ" +
      "UEST_CANCELED_BY_USER\020\345\270\002\022\036\n\030CLUSTER_INT" +
      "ERNAL_FAILURE\020\240\320\002\022\037\n\031EXTERNAL_CONNECTION" +
      "_ERROR\020\342\270\002\022\032\n\024QUERY_INVALID_SYNTAX\020\362\270\002\022\026" +
      "\n\020QUEUE_CONN_ERROR\020\250\300\002\022!\n\033QUEUE_CLOSE_RE" +
      "QUEST_TIMEOUT\020\252\300\002\022\027\n\021QUEUE_CONN_CLOSED\020\253" +
      "\300\002\022\037\n\031QUEUE_PUBLISH_ACK_TIMEOUT\020\254\300\002\022\031\n\023Q" +
      "UEUE_PUBLISH_ERROR\020\255\300\002\022 \n\032QUEUE_SUBSCRIP" +
      "TION_TIMEOUT\020\256\300\002\022\036\n\030QUEUE_SUBSCRIPTION_E" +
      "RROR\020\257\300\002\022\036\n\030QUEUE_MARSHALLING_FAILED\020\260\300\002" +
      "\022 \n\032QUEUE_UNMARSHALLING_FAILED\020\261\300\002\022\'\n!QU" +
      "EUE_MAX_MSG_REDELIVERY_EXCEEDED\020\262\300\002\022\027\n\021Q" +
      "UEUE_ACK_FAILURE\020\263\300\002\022\023\n\rSQS_OVERLIMIT\020\214\301" +
      "\002\022 \n\032SQS_INVALID_RECEIPT_HANDLE\020\215\301\002\022\021\n\013S" +
      "QS_UNKNOWN\020\216\301\002\022\035\n\027SEARCH_INTERNAL_FAILUR" +
      "E\020\371\317\002\022\037\n\031SEARCH_PROJECTION_FAILURE\020\372\317\002\022\037" +
      "\n\031SEARCH_PREDICTION_FAILURE\020\373\317\002\022\'\n!SEARC" +
      "H_BY_NOT_FULLY_INDEXED_INPUT\020\374\317\002\022 \n\032SAVE" +
      "D_SEARCH_MODIFY_FAILED\020\375\317\002\022\037\n\031SEARCH_COU" +
      "NTS_UNAVAILABLE\020\376\317\002\022\027\n\021EVALUATION_QUEUED" +
      "\020\334\320\002\022\034\n\026EVALUATION_IN_PROGRESS\020\335\320\002\022\030\n\022EV" +
      "ALUATION_SUCCESS\020\336\320\002\022(\n\"EVALUATION_FAILE" +
      "D_TO_RETRIEVE_DATA\020\337\320\002\022!\n\033EVALUATION_INV" +
      "ALID_ARGUMENT\020\340\320\002\022\027\n\021EVALUATION_FAILED\020\341" +
      "\320\002\022\030\n\022EVALUATION_PENDING\020\342\320\002\022\032\n\024EVALUATI" +
      "ON_TIMED_OUT\020\343\320\002\022!\n\033EVALUATION_UNEXPECTE" +
      "D_ERROR\020\344\320\002\022\026\n\020EVALUATION_MIXED\020\345\320\002\022\030\n\022S" +
      "TRIPE_EVENT_ERROR\020\341\327\002\022\020\n\nCACHE_MISS\020\311\337\002\022" +
      "&\n REDIS_SCRIPT_EXITED_WITH_FAILURE\020\312\337\002\022" +
      "\026\n\020REDIS_STREAM_ERR\020\313\337\002\022\030\n\022REDIS_NO_CONS" +
      "UMERS\020\314\337\002\022\032\n\024REDIS_STREAM_BACKOFF\020\315\337\002\022\030\n" +
      "\022SIGNUP_EVENT_ERROR\020\261\347\002\022\024\n\016SIGNUP_FLAGGE" +
      "D\020\262\347\002\022\032\n\024FILETYPE_UNSUPPORTED\020\263\347\002\022\037\n\031APP" +
      "_COUNT_INVALID_MESSAGE\020\231\357\002\022\'\n!APP_COUNT_" +
      "UPDATE_INCREMENT_FAILED\020\232\357\002\022\036\n\030APP_COUNT" +
      "_REBUILD_FAILED\020\233\357\002\022 \n\032APP_COUNT_INTERNA" +
      "L_FAILURE\020\234\357\002\022\027\n\021MP_DOWNLOAD_ERROR\020\375\357\002\022\032" +
      "\n\024MP_RESOLVE_DNS_ERROR\020\376\357\002\022)\n#MP_DOWNLOA" +
      "D_MAX_SIZE_EXCEEDED_ERROR\020\377\357\002\022\033\n\025MP_IMAG" +
      "E_DECODE_ERROR\020\200\360\002\022\031\n\023MP_INVALID_ARGUMEN" +
      "T\020\201\360\002\022\037\n\031MP_IMAGE_PROCESSING_ERROR\020\202\360\002\022\031" +
      "\n\023DATATIER_CONN_ERROR\020\341\360\002\022\027\n\021USER_CONSEN" +
      "T_FACE\020\321\206\003\022\024\n\016WORKER_MISSING\020\270\216\003\022\023\n\rWORK" +
      "ER_ACTIVE\020\271\216\003\022\025\n\017WORKER_INACTIVE\020\272\216\003\022\027\n\021" +
      "COLLECTOR_MISSING\020\240\226\003\022\026\n\020COLLECTOR_ACTIV" +
      "E\020\241\226\003\022\030\n\022COLLECTOR_INACTIVE\020\242\226\003\022!\n\033COLLE" +
      "CTOR_POST_INPUT_FAILED\020\243\226\003\022*\n$SSO_IDENTI" +
      "TY_PROVIDER_DOES_NOT_EXIST\020\211\236\003\022\026\n\020TASK_I" +
      "N_PROGRESS\020\361\245\003\022\017\n\tTASK_DONE\020\362\245\003\022\022\n\014TASK_" +
      "WONT_DO\020\363\245\003\022\"\n\034TASK_ADD_ANNOTATIONS_FAIL" +
      "URE\020\365\245\003\022\023\n\rTASK_CONFLICT\020\324\246\003\022\032\n\024TASK_NOT" +
      "_IMPLEMENTED\020\325\246\003\022\022\n\014TASK_MISSING\020\326\246\003\022\031\n\023" +
      "LABEL_ORDER_PENDING\020\331\255\003\022\035\n\027LABEL_ORDER_I" +
      "N_PROGRESS\020\332\255\003\022\031\n\023LABEL_ORDER_SUCCESS\020\333\255" +
      "\003\022\032\n\024LABEL_ORDER_CANCELED\020\334\255\003\022\024\n\016LICENSE" +
      "_ACTIVE\020\340\324\003\022\034\n\026LICENSE_DOES_NOT_EXIST\020\341\324" +
      "\003\022\031\n\023LICENSE_NEED_UPDATE\020\342\324\003\022\025\n\017LICENSE_" +
      "EXPIRED\020\343\324\003\022\025\n\017LICENSE_REVOKED\020\344\324\003\022\025\n\017LI" +
      "CENSE_DELETED\020\345\324\003\022\035\n\027LICENSE_VOLUME_EXCE" +
      "EDED\020\346\324\003\022!\n\033PASSWORD_VALIDATION_SUCCESS\020" +
      "\310\334\003\022 \n\032PASSWORD_VALIDATION_FAILED\020\311\334\003\022%\n" +
      "\037PASSWORDPOLICY_INVALID_ARGUMENT\020\312\334\003\022\"\n\034" +
      "FEATUREFLAG_CONFIG_NOT_FOUND\020\260\344\003\022\"\n\034FEAT" +
      "UREFLAG_INVALID_ARGUMENT\020\261\344\003\022\031\n\023FEATUREF" +
      "LAG_BLOCKED\020\262\344\003\022\031\n\023MAINTENANCE_SUCCESS\020\230" +
      "\354\003\022\030\n\022MAINTENANCE_FAILED\020\231\354\003\022\035\n\027DATASET_" +
      "VERSION_PENDING\020\205\364\003\022!\n\033DATASET_VERSION_I" +
      "N_PROGRESS\020\212\364\003\022\033\n\025DATASET_VERSION_READY\020" +
      "\217\364\003\022\035\n\027DATASET_VERSION_FAILURE\020\224\364\003\022&\n DA" +
      "TASET_VERSION_UNEXPECTED_ERROR\020\231\364\003\022\036\n\030DA" +
      "TASET_VERSION_CONFLICT\020\236\364\003\022\033\n\025DATASET_IN" +
      "PUT_SUCCESS\020\344\364\003\022\035\n\027DATASET_INPUT_DUPLICA" +
      "TE\020\345\364\003\022$\n\036DATASET_VERSION_EXPORT_SUCCESS" +
      "\020\310\365\003\022$\n\036DATASET_VERSION_EXPORT_PENDING\020\311" +
      "\365\003\022#\n\035DATASET_VERSION_EXPORT_FAILED\020\312\365\003\022" +
      "(\n\"DATASET_VERSION_EXPORT_IN_PROGRESS\020\313\365" +
      "\003\022-\n\'DATASET_VERSION_EXPORT_UNEXPECTED_E" +
      "RROR\020\314\365\003\022\020\n\nJOB_QUEUED\020\200\364\003\022\021\n\013JOB_RUNNIN" +
      "G\020\201\364\003\022\023\n\rJOB_COMPLETED\020\202\364\003\022\020\n\nJOB_FAILED" +
      "\020\203\364\003\022\023\n\rJOB_CANCELLED\020\204\364\003\022\032\n\024JOB_UNEXPEC" +
      "TED_ERROR\020\206\364\003\022\034\n\026AUTH_MISSING_IDP_ASSOC\020" +
      "\350\373\003\022\031\n\023LIST_OBJECTS_FAILED\020\320\203\004\022\034\n\026ARCHIV" +
      "E_EXTRACT_FAILED\020\270\213\004\022\030\n\022UPLOAD_IN_PROGRE" +
      "SS\020\240\223\004\022\021\n\013UPLOAD_DONE\020\241\223\004\022\023\n\rUPLOAD_FAIL" +
      "ED\020\242\223\004\022\035\n\027UPLOAD_UNEXPECTED_ERROR\020\243\223\004\022\024\n" +
      "\016UPLOAD_EXPIRED\020\244\223\004\022\032\n\024BILLING_INVALID_I" +
      "NFO\020\210\233\004\022\033\n\025INTERNAL_SERVER_ISSUE\020\324\375\005\022\035\n\027" +
      "INTERNAL_FETCHING_ISSUE\020\325\375\005\022\035\n\027INTERNAL_" +
      "DATABASE_ISSUE\020\326\375\005\022!\n\033INTERNAL_UNEXPECTE" +
      "D_TIMEOUT\020\331\375\005\022\034\n\026INTERNAL_UNEXPECTED_V1\020" +
      "\332\375\005\022\037\n\031INTERNAL_UNEXPECTED_PANIC\020\333\375\005\022\037\n\031" +
      "INTERNAL_UNEXPECTED_SPIRE\020\334\375\005\022 \n\032INTERNA" +
      "L_REDIS_UNAVAILABLE\020\335\375\005\022!\n\033INTERNAL_RESO" +
      "URCE_EXHAUSTED\020\336\375\005\022\"\n\034INTERNAL_REDIS_UNC" +
      "ATEGORIZED\020\337\375\005\022 \n\032INTERNAL_AWS_UNCATEGOR" +
      "IZED\020\340\375\005\022\"\n\034INTERNAL_AZURE_UNCATEGORIZED" +
      "\020\341\375\005\022\030\n\022CONN_UNCATEGORIZED\020\271\205\006\022\031\n\023MODEL_" +
      "UNCATEGORIZED\020\272\205\006\022\031\n\023INPUT_UNCATEGORIZED" +
      "\020\273\205\006\022\036\n\030ANNOTATION_UNCATEGORIZED\020\274\205\006\022\033\n\025" +
      "BILLING_UNCATEGORIZED\020\275\205\006\022\034\n\026INTERNAL_UN" +
      "CATEGORIZED\020\301\205\006\022\021\n\013BAD_REQUEST\020\240\302\005\022\022\n\014SE" +
      "RVER_ERROR\020\204\303\005\"\010\010\277\306\001\020\277\306\001\"\010\010\350\201\002\020\350\201\002\"\010\010\351\201\002" +
      "\020\351\201\002\"\010\010\352\201\002\020\352\201\002\"\010\010\314\202\002\020\314\202\002\"\010\010\315\202\002\020\315\202\002\"\010\010\316\202\002" +
      "\020\316\202\002\"\010\010\317\202\002\020\317\202\002\"\010\010\320\202\002\020\320\202\002\"\010\010\321\202\002\020\321\202\002\"\010\010\322\202\002" +
      "\020\322\202\002\"\010\010\260\203\002\020\260\203\002\"\010\010\261\203\002\020\261\203\002\"\010\010\263\203\002\020\263\203\002\"\010\010\272\203\002" +
      "\020\272\203\002\"\010\010\273\270\002\020\273\270\002\"\010\010\322\270\002\020\322\270\002\"\010\010\323\270\002\020\323\270\002\"\010\010\360\301\002" +
      "\020\360\301\002\"\010\010\361\301\002\020\361\301\002\"\010\010\362\301\002\020\362\301\002\"\010\010\363\301\002\020\363\301\002\"\010\010\364\301\002" +
      "\020\364\301\002\"\010\010\234\307\001\020\234\307\001\"\010\010\235\307\001\020\235\307\001\"\010\010\236\307\001\020\236\307\001\"\010\010\237\307\001" +
      "\020\237\307\001\"\010\010\241\307\001\020\241\307\001\"\010\010\242\307\001\020\242\307\001Bg\n\034com.clarifai" +
      ".grpc.api.statusP\001Z>github.com/Clarifai/" +
      "clarifai-go-grpc/proto/clarifai/api/stat" +
      "us\242\002\004CAIPb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
