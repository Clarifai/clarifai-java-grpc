// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface MetricsSummaryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.MetricsSummary)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>float top1_accuracy = 1 [deprecated = true];</code>
   * @deprecated clarifai.api.MetricsSummary.top1_accuracy is deprecated.
   *     See proto/clarifai/api/resources.proto;l=1874
   * @return The top1Accuracy.
   */
  @java.lang.Deprecated float getTop1Accuracy();

  /**
   * <code>float top5_accuracy = 2 [deprecated = true];</code>
   * @deprecated clarifai.api.MetricsSummary.top5_accuracy is deprecated.
   *     See proto/clarifai/api/resources.proto;l=1875
   * @return The top5Accuracy.
   */
  @java.lang.Deprecated float getTop5Accuracy();

  /**
   * <code>float macro_avg_roc_auc = 3 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The macroAvgRocAuc.
   */
  float getMacroAvgRocAuc();

  /**
   * <code>float macro_std_roc_auc = 4 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The macroStdRocAuc.
   */
  float getMacroStdRocAuc();

  /**
   * <code>float macro_avg_f1_score = 5 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The macroAvgF1Score.
   */
  float getMacroAvgF1Score();

  /**
   * <code>float macro_std_f1_score = 6 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The macroStdF1Score.
   */
  float getMacroStdF1Score();

  /**
   * <code>float macro_avg_precision = 7 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The macroAvgPrecision.
   */
  float getMacroAvgPrecision();

  /**
   * <code>float macro_avg_recall = 8 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The macroAvgRecall.
   */
  float getMacroAvgRecall();

  /**
   * <code>float mean_avg_precision_iou_50 = 10;</code>
   * @return The meanAvgPrecisionIou50.
   */
  float getMeanAvgPrecisionIou50();

  /**
   * <code>float mean_avg_precision_iou_range = 11;</code>
   * @return The meanAvgPrecisionIouRange.
   */
  float getMeanAvgPrecisionIouRange();

  /**
   * <code>repeated .clarifai.api.LOPQEvalResult lopq_metrics = 9;</code>
   */
  java.util.List<com.clarifai.grpc.api.LOPQEvalResult> 
      getLopqMetricsList();
  /**
   * <code>repeated .clarifai.api.LOPQEvalResult lopq_metrics = 9;</code>
   */
  com.clarifai.grpc.api.LOPQEvalResult getLopqMetrics(int index);
  /**
   * <code>repeated .clarifai.api.LOPQEvalResult lopq_metrics = 9;</code>
   */
  int getLopqMetricsCount();
  /**
   * <code>repeated .clarifai.api.LOPQEvalResult lopq_metrics = 9;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.LOPQEvalResultOrBuilder> 
      getLopqMetricsOrBuilderList();
  /**
   * <code>repeated .clarifai.api.LOPQEvalResult lopq_metrics = 9;</code>
   */
  com.clarifai.grpc.api.LOPQEvalResultOrBuilder getLopqMetricsOrBuilder(
      int index);
}
