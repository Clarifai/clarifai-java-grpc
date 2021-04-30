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
      "proto\022\023clarifai.api.status*\235E\n\nStatusCod" +
      "e\022\010\n\004ZERO\020\000\022\014\n\007SUCCESS\020\220N\022\021\n\014MIXED_STATU" +
      "S\020\232N\022\014\n\007FAILURE\020\244N\022\016\n\tTRY_AGAIN\020\256N\022\024\n\017NO" +
      "T_IMPLEMENTED\020\270N\022\030\n\023CONN_ACCOUNT_ISSUES\020" +
      "\370U\022\033\n\022CONN_TOKEN_INVALID\020\371U\032\002\010\001\022\035\n\030CONN_" +
      "CREDENTIALS_INVALID\020\372U\022\035\n\030CONN_EXCEED_HO" +
      "URLY_LIMIT\020\373U\022\036\n\031CONN_EXCEED_MONTHLY_LIM" +
      "IT\020\374U\022\023\n\016CONN_THROTTLED\020\375U\022\030\n\023CONN_EXCEE" +
      "DS_LIMITS\020\376U\022\035\n\030CONN_INSUFFICIENT_SCOPES" +
      "\020\377U\022\025\n\020CONN_KEY_INVALID\020\200V\022\027\n\022CONN_KEY_N" +
      "OT_FOUND\020\201V\022\034\n\027CONN_BAD_REQUEST_FORMAT\020\334" +
      "V\022\030\n\023CONN_DOES_NOT_EXIST\020\335V\022\031\n\024CONN_INVA" +
      "LID_REQUEST\020\336V\022\034\n\027CONN_METHOD_NOT_ALLOWE" +
      "D\020\337V\022\031\n\024CONN_NO_GDPR_CONSENT\020\340V\022\036\n\031CONN_" +
      "AUTH_METHOD_DISABLED\020\300W\022\023\n\rMODEL_TRAINED" +
      "\020\354\244\001\022\024\n\016MODEL_TRAINING\020\355\244\001\022\025\n\017MODEL_UNTR" +
      "AINED\020\356\244\001\022\037\n\031MODEL_QUEUED_FOR_TRAINING\020\357" +
      "\244\001\022\025\n\017MODEL_UPLOADING\020\360\244\001\022\034\n\026MODEL_UPLOA" +
      "DING_FAILED\020\361\244\001\022\034\n\026MODEL_TRAINING_NO_DAT" +
      "A\020\366\244\001\022!\n\033MODEL_TRAINING_NO_POSITIVES\020\367\244\001" +
      "\022*\n$MODEL_TRAINING_ONE_VS_N_SINGLE_CLASS" +
      "\020\370\244\001\022\036\n\030MODEL_TRAINING_TIMED_OUT\020\371\244\001\022\"\n\034" +
      "MODEL_TRAINING_WAITING_ERROR\020\372\244\001\022\"\n\034MODE" +
      "L_TRAINING_UNKNOWN_ERROR\020\373\244\001\022\"\n\034MODEL_TR" +
      "AINING_MSG_REDELIVER\020\374\244\001\022&\n MODEL_TRAINI" +
      "NG_INSUFFICIENT_DATA\020\375\244\001\022#\n\035MODEL_TRAINI" +
      "NG_INVALID_PARAMS\020\376\244\001\0224\n.MODEL_TRAINING_" +
      "INVALID_DATA_TOLERANCE_EXCEEDED\020\377\244\001\022\032\n\024M" +
      "ODEL_MODIFY_SUCCESS\020\236\245\001\022\032\n\024MODEL_MODIFY_" +
      "PENDING\020\237\245\001\022\031\n\023MODEL_MODIFY_FAILED\020\240\245\001\022\032" +
      "\n\024MODEL_DOES_NOT_EXIST\020\320\245\001\022\035\n\027MODEL_PERM" +
      "ISSION_DENIED\020\321\245\001\022\034\n\026MODEL_INVALID_ARGUM" +
      "ENT\020\322\245\001\022\033\n\025MODEL_INVALID_REQUEST\020\323\245\001\022\025\n\017" +
      "MODEL_EVALUATED\020\264\246\001\022\026\n\020MODEL_EVALUATING\020" +
      "\265\246\001\022\031\n\023MODEL_NOT_EVALUATED\020\266\246\001\022!\n\033MODEL_" +
      "QUEUED_FOR_EVALUATION\020\267\246\001\022 \n\032MODEL_EVALU" +
      "ATION_TIMED_OUT\020\276\246\001\022$\n\036MODEL_EVALUATION_" +
      "WAITING_ERROR\020\277\246\001\022$\n\036MODEL_EVALUATION_UN" +
      "KNOWN_ERROR\020\300\246\001\022\035\n\027MODEL_PREDICTION_FAIL" +
      "ED\020\301\246\001\022$\n\036MODEL_EVALUATION_MSG_REDELIVER" +
      "\020\302\246\001\022\"\n\034MODEL_EVALUATION_NEED_LABELS\020\303\246\001" +
      "\022\"\n\034MODEL_EVALUATION_NEED_INPUTS\020\304\246\001\022\035\n\027" +
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
      "TA_DUMP_NO_DATA\020\302\304\001\022\035\n\027APP_DUPLICATION_S" +
      "UCCESS\020\360\304\001\022\034\n\026APP_DUPLICATION_FAILED\020\361\304\001" +
      "\022\035\n\027APP_DUPLICATION_PENDING\020\362\304\001\022!\n\033APP_D" +
      "UPLICATION_IN_PROGRESS\020\363\304\001\022%\n\037APP_DUPLIC" +
      "ATION_INVALID_REQUEST\020\364\304\001\022\034\n\026INPUT_DOWNL" +
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
      "D\020\321\270\002\022\037\n\031ASYNC_WORKER_MULTI_ERRORS\020\324\270\002\022\034" +
      "\n\026RPC_REQUEST_QUEUE_FULL\020\336\270\002\022\034\n\026RPC_SERV" +
      "ER_UNAVAILABLE\020\337\270\002\022\031\n\023RPC_REQUEST_TIMEOU" +
      "T\020\340\270\002\022#\n\035RPC_MAX_MESSAGE_SIZE_EXCEEDED\020\341" +
      "\270\002\022\022\n\014RPC_CANCELED\020\343\270\002\022\030\n\022RPC_UNKNOWN_ME" +
      "THOD\020\344\270\002\022\036\n\030CLUSTER_INTERNAL_FAILURE\020\240\320\002" +
      "\022\037\n\031EXTERNAL_CONNECTION_ERROR\020\342\270\002\022\026\n\020QUE" +
      "UE_CONN_ERROR\020\250\300\002\022!\n\033QUEUE_CLOSE_REQUEST" +
      "_TIMEOUT\020\252\300\002\022\027\n\021QUEUE_CONN_CLOSED\020\253\300\002\022\037\n" +
      "\031QUEUE_PUBLISH_ACK_TIMEOUT\020\254\300\002\022\031\n\023QUEUE_" +
      "PUBLISH_ERROR\020\255\300\002\022 \n\032QUEUE_SUBSCRIPTION_" +
      "TIMEOUT\020\256\300\002\022\036\n\030QUEUE_SUBSCRIPTION_ERROR\020" +
      "\257\300\002\022\036\n\030QUEUE_MARSHALLING_FAILED\020\260\300\002\022 \n\032Q" +
      "UEUE_UNMARSHALLING_FAILED\020\261\300\002\022\'\n!QUEUE_M" +
      "AX_MSG_REDELIVERY_EXCEEDED\020\262\300\002\022\027\n\021QUEUE_" +
      "ACK_FAILURE\020\263\300\002\022\023\n\rSQS_OVERLIMIT\020\214\301\002\022 \n\032" +
      "SQS_INVALID_RECEIPT_HANDLE\020\215\301\002\022\021\n\013SQS_UN" +
      "KNOWN\020\216\301\002\022\022\n\014KAFKA_UNKNOW\020\360\301\002\022\031\n\023KAFKA_M" +
      "ISSING_TOPIC\020\361\301\002\022\025\n\017KAFKA_ADMIN_ERR\020\362\301\002\022" +
      "\030\n\022KAFKA_CONSUMER_ERR\020\363\301\002\022\031\n\023KAFKA_PUBLI" +
      "SHER_ERR\020\364\301\002\022\035\n\027SEARCH_INTERNAL_FAILURE\020" +
      "\371\317\002\022\037\n\031SEARCH_PROJECTION_FAILURE\020\372\317\002\022\037\n\031" +
      "SEARCH_PREDICTION_FAILURE\020\373\317\002\022\'\n!SEARCH_" +
      "BY_NOT_FULLY_INDEXED_INPUT\020\374\317\002\022 \n\032SAVED_" +
      "SEARCH_MODIFY_FAILED\020\375\317\002\022\027\n\021EVALUATION_Q" +
      "UEUED\020\334\320\002\022\034\n\026EVALUATION_IN_PROGRESS\020\335\320\002\022" +
      "\030\n\022EVALUATION_SUCCESS\020\336\320\002\022(\n\"EVALUATION_" +
      "FAILED_TO_RETRIEVE_DATA\020\337\320\002\022!\n\033EVALUATIO" +
      "N_INVALID_ARGUMENT\020\340\320\002\022\027\n\021EVALUATION_FAI" +
      "LED\020\341\320\002\022\030\n\022EVALUATION_PENDING\020\342\320\002\022\032\n\024EVA" +
      "LUATION_TIMED_OUT\020\343\320\002\022!\n\033EVALUATION_UNEX" +
      "PECTED_ERROR\020\344\320\002\022\026\n\020EVALUATION_MIXED\020\345\320\002" +
      "\022\030\n\022STRIPE_EVENT_ERROR\020\341\327\002\022\020\n\nCACHE_MISS" +
      "\020\311\337\002\022&\n REDIS_SCRIPT_EXITED_WITH_FAILURE" +
      "\020\312\337\002\022\026\n\020REDIS_STREAM_ERR\020\313\337\002\022\030\n\022REDIS_NO" +
      "_CONSUMERS\020\314\337\002\022\032\n\024REDIS_STREAM_BACKOFF\020\315" +
      "\337\002\022\030\n\022SIGNUP_EVENT_ERROR\020\261\347\002\022\024\n\016SIGNUP_F" +
      "LAGGED\020\262\347\002\022\032\n\024FILETYPE_UNSUPPORTED\020\263\347\002\022\037" +
      "\n\031APP_COUNT_INVALID_MESSAGE\020\231\357\002\022\'\n!APP_C" +
      "OUNT_UPDATE_INCREMENT_FAILED\020\232\357\002\022\036\n\030APP_" +
      "COUNT_REBUILD_FAILED\020\233\357\002\022 \n\032APP_COUNT_IN" +
      "TERNAL_FAILURE\020\234\357\002\022\027\n\021MP_DOWNLOAD_ERROR\020" +
      "\375\357\002\022\032\n\024MP_RESOLVE_DNS_ERROR\020\376\357\002\022)\n#MP_DO" +
      "WNLOAD_MAX_SIZE_EXCEEDED_ERROR\020\377\357\002\022\033\n\025MP" +
      "_IMAGE_DECODE_ERROR\020\200\360\002\022\031\n\023MP_INVALID_AR" +
      "GUMENT\020\201\360\002\022\037\n\031MP_IMAGE_PROCESSING_ERROR\020" +
      "\202\360\002\022\027\n\021USER_CONSENT_FACE\020\321\206\003\022\024\n\016WORKER_M" +
      "ISSING\020\270\216\003\022\023\n\rWORKER_ACTIVE\020\271\216\003\022\025\n\017WORKE" +
      "R_INACTIVE\020\272\216\003\022\027\n\021COLLECTOR_MISSING\020\240\226\003\022" +
      "\026\n\020COLLECTOR_ACTIVE\020\241\226\003\022\030\n\022COLLECTOR_INA" +
      "CTIVE\020\242\226\003\022*\n$SSO_IDENTITY_PROVIDER_DOES_" +
      "NOT_EXIST\020\211\236\003\022\026\n\020TASK_IN_PROGRESS\020\361\245\003\022\017\n" +
      "\tTASK_DONE\020\362\245\003\022\022\n\014TASK_WONT_DO\020\363\245\003\022\"\n\034TA" +
      "SK_ADD_ANNOTATIONS_FAILURE\020\365\245\003\022\023\n\rTASK_C" +
      "ONFLICT\020\324\246\003\022\032\n\024TASK_NOT_IMPLEMENTED\020\325\246\003\022" +
      "\022\n\014TASK_MISSING\020\326\246\003\022\031\n\023LABEL_ORDER_PENDI" +
      "NG\020\331\255\003\022\035\n\027LABEL_ORDER_IN_PROGRESS\020\332\255\003\022\031\n" +
      "\023LABEL_ORDER_SUCCESS\020\333\255\003\022\032\n\024LABEL_ORDER_" +
      "CANCELED\020\334\255\003\022\024\n\016LICENSE_ACTIVE\020\340\324\003\022\034\n\026LI" +
      "CENSE_DOES_NOT_EXIST\020\341\324\003\022\031\n\023LICENSE_NEED" +
      "_UPDATE\020\342\324\003\022\025\n\017LICENSE_EXPIRED\020\343\324\003\022\025\n\017LI" +
      "CENSE_REVOKED\020\344\324\003\022\025\n\017LICENSE_DELETED\020\345\324\003" +
      "\022\035\n\027LICENSE_VOLUME_EXCEEDED\020\346\324\003\022!\n\033PASSW" +
      "ORD_VALIDATION_SUCCESS\020\310\334\003\022 \n\032PASSWORD_V" +
      "ALIDATION_FAILED\020\311\334\003\022%\n\037PASSWORDPOLICY_I" +
      "NVALID_ARGUMENT\020\312\334\003\022\"\n\034FEATUREFLAG_CONFI" +
      "G_NOT_FOUND\020\260\344\003\022\"\n\034FEATUREFLAG_INVALID_A" +
      "RGUMENT\020\261\344\003\022\031\n\023FEATUREFLAG_BLOCKED\020\262\344\003\022\031" +
      "\n\023MAINTENANCE_SUCCESS\020\230\354\003\022\030\n\022MAINTENANCE" +
      "_FAILED\020\231\354\003\022\017\n\nJOB_QUEUED\020\2002\022\020\n\013JOB_RUNN" +
      "ING\020\2012\022\022\n\rJOB_COMPLETED\020\2022\022\017\n\nJOB_FAILED" +
      "\020\2032\022\034\n\026AUTH_MISSING_IDP_ASSOC\020\350\373\003\022\033\n\025INT" +
      "ERNAL_SERVER_ISSUE\020\324\375\005\022\035\n\027INTERNAL_FETCH" +
      "ING_ISSUE\020\325\375\005\022\035\n\027INTERNAL_DATABASE_ISSUE" +
      "\020\326\375\005\022!\n\033INTERNAL_UNEXPECTED_TIMEOUT\020\331\375\005\022" +
      "\034\n\026INTERNAL_UNEXPECTED_V1\020\332\375\005\022\037\n\031INTERNA" +
      "L_UNEXPECTED_PANIC\020\333\375\005\022\037\n\031INTERNAL_UNEXP" +
      "ECTED_SPIRE\020\334\375\005\022 \n\032INTERNAL_REDIS_UNAVAI" +
      "LABLE\020\335\375\005\022!\n\033INTERNAL_RESOURCE_EXHAUSTED" +
      "\020\336\375\005\022\"\n\034INTERNAL_REDIS_UNCATEGORIZED\020\337\375\005" +
      "\022 \n\032INTERNAL_AWS_UNCATEGORIZED\020\340\375\005\022\"\n\034IN" +
      "TERNAL_AZURE_UNCATEGORIZED\020\341\375\005\022\030\n\022CONN_U" +
      "NCATEGORIZED\020\271\205\006\022\031\n\023MODEL_UNCATEGORIZED\020" +
      "\272\205\006\022\031\n\023INPUT_UNCATEGORIZED\020\273\205\006\022\036\n\030ANNOTA" +
      "TION_UNCATEGORIZED\020\274\205\006\022\033\n\025BILLING_UNCATE" +
      "GORIZED\020\275\205\006\022\034\n\026INTERNAL_UNCATEGORIZED\020\301\205" +
      "\006\022\021\n\013BAD_REQUEST\020\240\302\005\022\022\n\014SERVER_ERROR\020\204\303\005" +
      "\"\010\010\350\201\002\020\350\201\002\"\010\010\351\201\002\020\351\201\002\"\010\010\352\201\002\020\352\201\002\"\010\010\314\202\002\020\314\202\002" +
      "\"\010\010\315\202\002\020\315\202\002\"\010\010\316\202\002\020\316\202\002\"\010\010\317\202\002\020\317\202\002\"\010\010\320\202\002\020\320\202\002" +
      "\"\010\010\321\202\002\020\321\202\002\"\010\010\322\202\002\020\322\202\002\"\010\010\260\203\002\020\260\203\002\"\010\010\261\203\002\020\261\203\002" +
      "\"\010\010\263\203\002\020\263\203\002\"\010\010\272\203\002\020\272\203\002\"\010\010\273\270\002\020\273\270\002\"\010\010\322\270\002\020\322\270\002" +
      "\"\010\010\323\270\002\020\323\270\002Bg\n\034com.clarifai.grpc.api.stat" +
      "usP\001Z>github.com/Clarifai/clarifai-go-gr" +
      "pc/proto/clarifai/api/status\242\002\004CAIPb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
