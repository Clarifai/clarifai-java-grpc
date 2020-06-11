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
      "proto\022\023clarifai.api.status*\344?\n\nStatusCod" +
      "e\022\010\n\004ZERO\020\000\022\014\n\007SUCCESS\020\220N\022\021\n\014MIXED_STATU" +
      "S\020\232N\022\014\n\007FAILURE\020\244N\022\016\n\tTRY_AGAIN\020\256N\022\024\n\017NO" +
      "T_IMPLEMENTED\020\270N\022\030\n\023CONN_ACCOUNT_ISSUES\020" +
      "\370U\022\027\n\022CONN_TOKEN_INVALID\020\371U\022\035\n\030CONN_CRED" +
      "ENTIALS_INVALID\020\372U\022\035\n\030CONN_EXCEED_HOURLY" +
      "_LIMIT\020\373U\022\036\n\031CONN_EXCEED_MONTHLY_LIMIT\020\374" +
      "U\022\023\n\016CONN_THROTTLED\020\375U\022\030\n\023CONN_EXCEEDS_L" +
      "IMITS\020\376U\022\035\n\030CONN_INSUFFICIENT_SCOPES\020\377U\022" +
      "\025\n\020CONN_KEY_INVALID\020\200V\022\027\n\022CONN_KEY_NOT_F" +
      "OUND\020\201V\022\034\n\027CONN_BAD_REQUEST_FORMAT\020\334V\022\030\n" +
      "\023CONN_DOES_NOT_EXIST\020\335V\022\031\n\024CONN_INVALID_" +
      "REQUEST\020\336V\022\034\n\027CONN_METHOD_NOT_ALLOWED\020\337V" +
      "\022\031\n\024CONN_NO_GDPR_CONSENT\020\340V\022\036\n\031CONN_AUTH" +
      "_METHOD_DISABLED\020\300W\022\023\n\rMODEL_TRAINED\020\354\244\001" +
      "\022\024\n\016MODEL_TRAINING\020\355\244\001\022\025\n\017MODEL_UNTRAINE" +
      "D\020\356\244\001\022\037\n\031MODEL_QUEUED_FOR_TRAINING\020\357\244\001\022\025" +
      "\n\017MODEL_UPLOADING\020\360\244\001\022\034\n\026MODEL_TRAINING_" +
      "NO_DATA\020\366\244\001\022!\n\033MODEL_TRAINING_NO_POSITIV" +
      "ES\020\367\244\001\022*\n$MODEL_TRAINING_ONE_VS_N_SINGLE" +
      "_CLASS\020\370\244\001\022\036\n\030MODEL_TRAINING_TIMED_OUT\020\371" +
      "\244\001\022\"\n\034MODEL_TRAINING_WAITING_ERROR\020\372\244\001\022\"" +
      "\n\034MODEL_TRAINING_UNKNOWN_ERROR\020\373\244\001\022\"\n\034MO" +
      "DEL_TRAINING_MSG_REDELIVER\020\374\244\001\022&\n MODEL_" +
      "TRAINING_INSUFFICIENT_DATA\020\375\244\001\022#\n\035MODEL_" +
      "TRAINING_INVALID_PARAMS\020\376\244\001\0224\n.MODEL_TRA" +
      "INING_INVALID_DATA_TOLERANCE_EXCEEDED\020\377\244" +
      "\001\022\032\n\024MODEL_MODIFY_SUCCESS\020\236\245\001\022\032\n\024MODEL_M" +
      "ODIFY_PENDING\020\237\245\001\022\031\n\023MODEL_MODIFY_FAILED" +
      "\020\240\245\001\022\032\n\024MODEL_DOES_NOT_EXIST\020\320\245\001\022\035\n\027MODE" +
      "L_PERMISSION_DENIED\020\321\245\001\022\034\n\026MODEL_INVALID" +
      "_ARGUMENT\020\322\245\001\022\033\n\025MODEL_INVALID_REQUEST\020\323" +
      "\245\001\022\025\n\017MODEL_EVALUATED\020\264\246\001\022\026\n\020MODEL_EVALU" +
      "ATING\020\265\246\001\022\031\n\023MODEL_NOT_EVALUATED\020\266\246\001\022!\n\033" +
      "MODEL_QUEUED_FOR_EVALUATION\020\267\246\001\022 \n\032MODEL" +
      "_EVALUATION_TIMED_OUT\020\276\246\001\022$\n\036MODEL_EVALU" +
      "ATION_WAITING_ERROR\020\277\246\001\022$\n\036MODEL_EVALUAT" +
      "ION_UNKNOWN_ERROR\020\300\246\001\022\035\n\027MODEL_PREDICTIO" +
      "N_FAILED\020\301\246\001\022$\n\036MODEL_EVALUATION_MSG_RED" +
      "ELIVER\020\302\246\001\022\"\n\034MODEL_EVALUATION_NEED_LABE" +
      "LS\020\303\246\001\022\"\n\034MODEL_EVALUATION_NEED_INPUTS\020\304" +
      "\246\001\022\035\n\027MODEL_DEPLOYMENT_FAILED\020\346\246\001\022\025\n\017MOD" +
      "EL_DEPLOYING\020\347\246\001\022!\n\033MODEL_QUEUED_FOR_DEP" +
      "LOYMENT\020\350\246\001\022\030\n\022MODEL_NOT_DEPLOYED\020\351\246\001\022 \n" +
      "\032WORKFLOW_NO_MATCHING_INPUT\020\361\253\001\022$\n\036WORKF" +
      "LOW_REQUIRE_TRAINED_MODEL\020\362\253\001\022\030\n\022WORKFLO" +
      "W_DUPLICATE\020\324\254\001\022!\n\033WORKFLOW_UNSUPPORTED_" +
      "FORMAT\020\325\254\001\022\035\n\027WORKFLOW_DOES_NOT_EXIST\020\326\254" +
      "\001\022 \n\032WORKFLOW_PERMISSION_DENIED\020\327\254\001\022\037\n\031W" +
      "ORKFLOW_INVALID_ARGUMENT\020\330\254\001\022\035\n\027WORKFLOW" +
      "_INVALID_RECIPE\020\331\254\001\022\037\n\031WORKFLOW_INVALID_" +
      "TEMPLATE\020\332\254\001\022\034\n\026WORKFLOW_INVALID_GRAPH\020\333" +
      "\254\001\022\037\n\031WORKFLOW_INTERNAL_FAILURE\020\334\254\001\022\036\n\030W" +
      "ORKFLOW_INVALID_REQUEST\020\327\263\001\022\035\n\027WORKFLOW_" +
      "MODIFY_SUCCESS\020\206\255\001\022\035\n\027WORKFLOW_MODIFY_PE" +
      "NDING\020\207\255\001\022\034\n\026WORKFLOW_MODIFY_FAILED\020\210\255\001\022" +
      "\035\n\027WORKFLOW_REINDEX_FAILED\020\211\255\001\022\034\n\026CONCEP" +
      "T_MODIFY_SUCCESS\020\356\264\001\022\034\n\026CONCEPT_MODIFY_P" +
      "ENDING\020\357\264\001\022\033\n\025CONCEPT_MODIFY_FAILED\020\360\264\001\022" +
      "\030\n\022ANNOTATION_SUCCESS\020\326\274\001\022\030\n\022ANNOTATION_" +
      "PENDING\020\327\274\001\022\027\n\021ANNOTATION_FAILED\020\330\274\001\022\037\n\031" +
      "ANNOTATION_UNKNOWN_STATUS\020\332\274\001\022!\n\033ANNOTAT" +
      "ION_INVALID_ARGUMENT\020\333\274\001\022\"\n\034ANNOTATION_P" +
      "ERMISSION_DENIED\020\334\274\001\022 \n\032ANNOTATION_AWAIT" +
      "ING_REVIEW\020\335\274\001\022\036\n\030ANNOTATION_REVIEW_DENI" +
      "ED\020\336\274\001\022\037\n\031ANNOTATION_MODIFY_SUCCESS\020\272\275\001\022" +
      "\037\n\031ANNOTATION_MODIFY_PENDING\020\273\275\001\022\036\n\030ANNO" +
      "TATION_MODIFY_FAILED\020\274\275\001\022&\n METADATA_INV" +
      "ALID_PATCH_ARGUMENTS\020\304\302\001\022\034\n\026METADATA_PAR" +
      "SING_ISSUE\020\305\302\001\022!\n\033METADATA_MANIPULATION_" +
      "ISSUE\020\306\302\001\022\034\n\026TRAINER_JOB_STATE_NONE\020\250\303\001\022" +
      "\036\n\030TRAINER_JOB_STATE_QUEUED\020\251\303\001\022\037\n\031TRAIN" +
      "ER_JOB_STATE_RUNNING\020\252\303\001\022 \n\032TRAINER_JOB_" +
      "STATE_COMPLETE\020\253\303\001\022\035\n\027TRAINER_JOB_STATE_" +
      "ERROR\020\254\303\001\022\027\n\021DATA_DUMP_SUCCESS\020\276\304\001\022\027\n\021DA" +
      "TA_DUMP_PENDING\020\277\304\001\022\026\n\020DATA_DUMP_FAILED\020" +
      "\300\304\001\022\033\n\025DATA_DUMP_IN_PROGRESS\020\301\304\001\022\035\n\027APP_" +
      "DUPLICATION_SUCCESS\020\360\304\001\022\034\n\026APP_DUPLICATI" +
      "ON_FAILED\020\361\304\001\022\035\n\027APP_DUPLICATION_PENDING" +
      "\020\362\304\001\022!\n\033APP_DUPLICATION_IN_PROGRESS\020\363\304\001\022" +
      "%\n\037APP_DUPLICATION_INVALID_REQUEST\020\364\304\001\022\034" +
      "\n\026INPUT_DOWNLOAD_SUCCESS\020\260\352\001\022\034\n\026INPUT_DO" +
      "WNLOAD_PENDING\020\261\352\001\022\033\n\025INPUT_DOWNLOAD_FAI" +
      "LED\020\262\352\001\022 \n\032INPUT_DOWNLOAD_IN_PROGRESS\020\263\352" +
      "\001\022 \n\032INPUT_STATUS_UPDATE_FAILED\020\264\352\001\022\031\n\023I" +
      "NPUT_DELETE_FAILED\020\265\352\001\022\025\n\017INPUT_DUPLICAT" +
      "E\020\224\353\001\022\036\n\030INPUT_UNSUPPORTED_FORMAT\020\225\353\001\022\032\n" +
      "\024INPUT_DOES_NOT_EXIST\020\226\353\001\022\035\n\027INPUT_PERMI" +
      "SSION_DENIED\020\227\353\001\022\034\n\026INPUT_INVALID_ARGUME" +
      "NT\020\230\353\001\022\026\n\020INPUT_OVER_LIMIT\020\231\353\001\022\027\n\021INPUT_" +
      "INVALID_URL\020\232\353\001\022\032\n\024INPUT_MODIFY_SUCCESS\020" +
      "\370\353\001\022\032\n\024INPUT_MODIFY_PENDING\020\371\353\001\022\031\n\023INPUT" +
      "_MODIFY_FAILED\020\373\353\001\022\037\n\031INPUT_STORAGE_HOST" +
      "_FAILED\020\202\354\001\022\035\n\027ALL_INPUT_INVALID_BYTES\020\334" +
      "\354\001\022\033\n\025INPUT_CLUSTER_SUCCESS\020\300\355\001\022\033\n\025INPUT" +
      "_CLUSTER_PENDING\020\301\355\001\022\032\n\024INPUT_CLUSTER_FA" +
      "ILED\020\302\355\001\022\037\n\031INPUT_CLUSTER_IN_PROGRESS\020\303\355" +
      "\001\022\033\n\025INPUT_REINDEX_SUCCESS\020\244\356\001\022\033\n\025INPUT_" +
      "REINDEX_PENDING\020\245\356\001\022\032\n\024INPUT_REINDEX_FAI" +
      "LED\020\246\356\001\022\037\n\031INPUT_REINDEX_IN_PROGRESS\020\247\356\001" +
      "\022\"\n\034INPUT_VIDEO_DOWNLOAD_SUCCESS\020\230\362\001\022\"\n\034" +
      "INPUT_VIDEO_DOWNLOAD_PENDING\020\231\362\001\022!\n\033INPU" +
      "T_VIDEO_DOWNLOAD_FAILED\020\232\362\001\022\033\n\025INPUT_VID" +
      "EO_DUPLICATE\020\374\362\001\022$\n\036INPUT_VIDEO_UNSUPPOR" +
      "TED_FORMAT\020\375\362\001\022 \n\032INPUT_VIDEO_DOES_NOT_E" +
      "XIST\020\376\362\001\022#\n\035INPUT_VIDEO_PERMISSION_DENIE" +
      "D\020\377\362\001\022\"\n\034INPUT_VIDEO_INVALID_ARGUMENT\020\200\363" +
      "\001\022\034\n\026INPUT_VIDEO_OVER_LIMIT\020\201\363\001\022\035\n\027INPUT" +
      "_VIDEO_INVALID_URL\020\202\363\001\022 \n\032INPUT_VIDEO_MO" +
      "DIFY_SUCCESS\020\340\363\001\022 \n\032INPUT_VIDEO_MODIFY_P" +
      "ENDING\020\341\363\001\022\037\n\031INPUT_VIDEO_MODIFY_FAILED\020" +
      "\343\363\001\022%\n\037INPUT_VIDEO_STORAGE_HOST_FAILED\020\352" +
      "\363\001\022$\n\036ALL_INPUT_VIDEOS_INVALID_BYTES\020\304\364\001" +
      "\022\035\n\027INPUT_CONNECTION_FAILED\020\274\270\002\022&\n REQUE" +
      "ST_DISABLED_FOR_MAINTENANCE\020\275\270\002\022+\n%INPUT" +
      "_WRITES_DISABLED_FOR_MAINTENANCE\020\276\270\002\022\033\n\025" +
      "INPUT_INVALID_REQUEST\020\277\270\002\022\035\n\027PREDICT_INV" +
      "ALID_REQUEST\020\301\270\002\022\034\n\026SEARCH_INVALID_REQUE" +
      "ST\020\302\270\002\022\036\n\030CONCEPTS_INVALID_REQUEST\020\303\270\002\022\033" +
      "\n\025STATS_INVALID_REQUEST\020\304\270\002\022\034\n\026DATABASE_" +
      "DUPLICATE_KEY\020\312\270\002\022 \n\032DATABASE_STATEMENT_" +
      "TIMEOUT\020\313\270\002\022$\n\036DATABASE_INVALID_ROWS_AFF" +
      "ECTED\020\314\270\002\022 \n\032DATABASE_DEADLOCK_DETECTED\020" +
      "\315\270\002\022\030\n\022DATABASE_FAIL_TASK\020\316\270\002\022&\n DATABAS" +
      "E_FAIL_TO_GET_CONNECTIONS\020\317\270\002\022\037\n\031DATABAS" +
      "E_TOO_MANY_CLIENTS\020\320\270\002\022\"\n\034DATABASE_CONST" +
      "RAINT_VIOLATED\020\321\270\002\022$\n\036DATABASE_NO_ONGOIN" +
      "G_OPERATIONS\020\322\270\002\022*\n$DATABASE_LOCKED_BY_O" +
      "NGOING_OPERATION\020\323\270\002\022\037\n\031ASYNC_WORKER_MUL" +
      "TI_ERRORS\020\324\270\002\022\034\n\026RPC_REQUEST_QUEUE_FULL\020" +
      "\336\270\002\022\034\n\026RPC_SERVER_UNAVAILABLE\020\337\270\002\022\031\n\023RPC" +
      "_REQUEST_TIMEOUT\020\340\270\002\022#\n\035RPC_MAX_MESSAGE_" +
      "SIZE_EXCEEDED\020\341\270\002\022\022\n\014RPC_CANCELED\020\343\270\002\022\036\n" +
      "\030CLUSTER_INTERNAL_FAILURE\020\240\320\002\022\037\n\031EXTERNA" +
      "L_CONNECTION_ERROR\020\342\270\002\022\026\n\020QUEUE_CONN_ERR" +
      "OR\020\250\300\002\022!\n\033QUEUE_CLOSE_REQUEST_TIMEOUT\020\252\300" +
      "\002\022\027\n\021QUEUE_CONN_CLOSED\020\253\300\002\022\037\n\031QUEUE_PUBL" +
      "ISH_ACK_TIMEOUT\020\254\300\002\022\031\n\023QUEUE_PUBLISH_ERR" +
      "OR\020\255\300\002\022 \n\032QUEUE_SUBSCRIPTION_TIMEOUT\020\256\300\002" +
      "\022\036\n\030QUEUE_SUBSCRIPTION_ERROR\020\257\300\002\022\036\n\030QUEU" +
      "E_MARSHALLING_FAILED\020\260\300\002\022 \n\032QUEUE_UNMARS" +
      "HALLING_FAILED\020\261\300\002\022\'\n!QUEUE_MAX_MSG_REDE" +
      "LIVERY_EXCEEDED\020\262\300\002\022\027\n\021QUEUE_ACK_FAILURE" +
      "\020\263\300\002\022\023\n\rSQS_OVERLIMIT\020\214\301\002\022 \n\032SQS_INVALID" +
      "_RECEIPT_HANDLE\020\215\301\002\022\021\n\013SQS_UNKNOWN\020\216\301\002\022\022" +
      "\n\014KAFKA_UNKNOW\020\360\301\002\022\031\n\023KAFKA_MISSING_TOPI" +
      "C\020\361\301\002\022\025\n\017KAFKA_ADMIN_ERR\020\362\301\002\022\030\n\022KAFKA_CO" +
      "NSUMER_ERR\020\363\301\002\022\031\n\023KAFKA_PUBLISHER_ERR\020\364\301" +
      "\002\022\035\n\027SEARCH_INTERNAL_FAILURE\020\371\317\002\022\037\n\031SEAR" +
      "CH_PROJECTION_FAILURE\020\372\317\002\022\037\n\031SEARCH_PRED" +
      "ICTION_FAILURE\020\373\317\002\022\'\n!SEARCH_BY_NOT_FULL" +
      "Y_INDEXED_INPUT\020\374\317\002\022 \n\032SAVED_SEARCH_MODI" +
      "FY_FAILED\020\375\317\002\0225\n/ANNOTATION_SEARCH_METRI" +
      "CS_QUEUED_FOR_EVALUATION\020\334\320\002\022*\n$ANNOTATI" +
      "ON_SEARCH_METRICS_EVALUATING\020\335\320\002\022)\n#ANNO" +
      "TATION_SEARCH_METRICS_EVALUATED\020\336\320\002\0227\n1A" +
      "NNOTATION_SEARCH_METRICS_FAILED_TO_RETRI" +
      "EVE_DATA\020\337\320\002\0220\n*ANNOTATION_SEARCH_METRIC" +
      "S_INVALID_ARGUMENT\020\340\320\002\022&\n ANNOTATION_SEA" +
      "RCH_METRICS_FAILED\020\341\320\002\022\030\n\022STRIPE_EVENT_E" +
      "RROR\020\341\327\002\022\020\n\nCACHE_MISS\020\311\337\002\022&\n REDIS_SCRI" +
      "PT_EXITED_WITH_FAILURE\020\312\337\002\022\030\n\022SIGNUP_EVE" +
      "NT_ERROR\020\261\347\002\022\024\n\016SIGNUP_FLAGGED\020\262\347\002\022\032\n\024FI" +
      "LETYPE_UNSUPPORTED\020\263\347\002\022\037\n\031APP_COUNT_INVA" +
      "LID_MESSAGE\020\231\357\002\022\'\n!APP_COUNT_UPDATE_INCR" +
      "EMENT_FAILED\020\232\357\002\022\036\n\030APP_COUNT_REBUILD_FA" +
      "ILED\020\233\357\002\022 \n\032APP_COUNT_INTERNAL_FAILURE\020\234" +
      "\357\002\022\027\n\021MP_DOWNLOAD_ERROR\020\375\357\002\022\032\n\024MP_RESOLV" +
      "E_DNS_ERROR\020\376\357\002\022)\n#MP_DOWNLOAD_MAX_SIZE_" +
      "EXCEEDED_ERROR\020\377\357\002\022\033\n\025MP_IMAGE_DECODE_ER" +
      "ROR\020\200\360\002\022\031\n\023MP_INVALID_ARGUMENT\020\201\360\002\022\037\n\031MP" +
      "_IMAGE_PROCESSING_ERROR\020\202\360\002\022\027\n\021USER_CONS" +
      "ENT_FACE\020\321\206\003\022\024\n\016WORKER_MISSING\020\270\216\003\022\023\n\rWO" +
      "RKER_ACTIVE\020\271\216\003\022\025\n\017WORKER_INACTIVE\020\272\216\003\022\027" +
      "\n\021COLLECTOR_MISSING\020\240\226\003\022\026\n\020COLLECTOR_ACT" +
      "IVE\020\241\226\003\022\030\n\022COLLECTOR_INACTIVE\020\242\226\003\022*\n$SSO" +
      "_IDENTITY_PROVIDER_DOES_NOT_EXIST\020\211\236\003\022\026\n" +
      "\020TASK_IN_PROGRESS\020\361\245\003\022\017\n\tTASK_DONE\020\362\245\003\022\035" +
      "\n\027TASK_NOT_VALID_TO_CLOSE\020\324\246\003\022\024\n\016LICENSE" +
      "_ACTIVE\020\340\324\003\022\034\n\026LICENSE_DOES_NOT_EXIST\020\341\324" +
      "\003\022\031\n\023LICENSE_NEED_UPDATE\020\342\324\003\022\025\n\017LICENSE_" +
      "EXPIRED\020\343\324\003\022\025\n\017LICENSE_REVOKED\020\344\324\003\022\025\n\017LI" +
      "CENSE_DELETED\020\345\324\003\022\035\n\027LICENSE_VOLUME_EXCE" +
      "EDED\020\346\324\003\022!\n\033PASSWORD_VALIDATION_SUCCESS\020" +
      "\310\334\003\022 \n\032PASSWORD_VALIDATION_FAILED\020\311\334\003\022%\n" +
      "\037PASSWORDPOLICY_INVALID_ARGUMENT\020\312\334\003\022\033\n\025" +
      "INTERNAL_SERVER_ISSUE\020\324\375\005\022\035\n\027INTERNAL_FE" +
      "TCHING_ISSUE\020\325\375\005\022\035\n\027INTERNAL_DATABASE_IS" +
      "SUE\020\326\375\005\022!\n\033INTERNAL_UNEXPECTED_TIMEOUT\020\331" +
      "\375\005\022\034\n\026INTERNAL_UNEXPECTED_V1\020\332\375\005\022\037\n\031INTE" +
      "RNAL_UNEXPECTED_PANIC\020\333\375\005\022\037\n\031INTERNAL_UN" +
      "EXPECTED_SPIRE\020\334\375\005\022 \n\032INTERNAL_REDIS_UNA" +
      "VAILABLE\020\335\375\005\022!\n\033INTERNAL_RESOURCE_EXHAUS" +
      "TED\020\336\375\005\022\"\n\034INTERNAL_REDIS_UNCATEGORIZED\020" +
      "\337\375\005\022 \n\032INTERNAL_AWS_UNCATEGORIZED\020\340\375\005\022\"\n" +
      "\034INTERNAL_AZURE_UNCATEGORIZED\020\341\375\005\022\030\n\022CON" +
      "N_UNCATEGORIZED\020\271\205\006\022\031\n\023MODEL_UNCATEGORIZ" +
      "ED\020\272\205\006\022\031\n\023INPUT_UNCATEGORIZED\020\273\205\006\022\036\n\030ANN" +
      "OTATION_UNCATEGORIZED\020\274\205\006\022\033\n\025BILLING_UNC" +
      "ATEGORIZED\020\275\205\006\022\034\n\026INTERNAL_UNCATEGORIZED" +
      "\020\301\205\006\022\021\n\013BAD_REQUEST\020\240\302\005\022\022\n\014SERVER_ERROR\020" +
      "\204\303\005\"\010\010\350\201\002\020\350\201\002\"\010\010\351\201\002\020\351\201\002\"\010\010\352\201\002\020\352\201\002\"\010\010\314\202\002\020" +
      "\314\202\002\"\010\010\315\202\002\020\315\202\002\"\010\010\316\202\002\020\316\202\002\"\010\010\317\202\002\020\317\202\002\"\010\010\320\202\002\020" +
      "\320\202\002\"\010\010\321\202\002\020\321\202\002\"\010\010\322\202\002\020\322\202\002\"\010\010\260\203\002\020\260\203\002\"\010\010\261\203\002\020" +
      "\261\203\002\"\010\010\263\203\002\020\263\203\002\"\010\010\272\203\002\020\272\203\002\"\010\010\273\270\002\020\273\270\002B/\n\034com" +
      ".clarifai.grpc.api.statusP\001Z\006status\242\002\004CA" +
      "IPb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
