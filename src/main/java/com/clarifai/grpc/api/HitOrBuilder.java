// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface HitOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.Hit)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * This is the score for the ranked Hit results of the search query. This score is a number
   * between 0.0 and 1.0 as it represents a confidence in the search Hit. For example, if you search
   * for "car" and get a close matching Hit, the score should be close to 1.0. If you get a score
   * of close to 0.0 that means it's very disimilar to your query, in this case NOT a "car". There
   * is a special intermediate score of 0.5 that means that the Hit is not really correlated with
   * your search query (ie. not similar or dissimlar to the query) which is a common occurrence
   * when using negate queries.
   * Note: some queries that are just filtering down your app of inputs may just return a score of
   * 1.0 for all Hits.
   * </pre>
   *
   * <code>float score = 1 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   * @return The score.
   */
  float getScore();

  /**
   * <pre>
   * This is the matched input returned from the search query. This will contain information about
   * the Input such as the url, created_at time and trusted annotation information (for backwards
   * compatibility with apps that existed before Annotations were introduced.
   * </pre>
   *
   * <code>.clarifai.api.Input input = 2;</code>
   * @return Whether the input field is set.
   */
  boolean hasInput();
  /**
   * <pre>
   * This is the matched input returned from the search query. This will contain information about
   * the Input such as the url, created_at time and trusted annotation information (for backwards
   * compatibility with apps that existed before Annotations were introduced.
   * </pre>
   *
   * <code>.clarifai.api.Input input = 2;</code>
   * @return The input.
   */
  com.clarifai.grpc.api.Input getInput();
  /**
   * <pre>
   * This is the matched input returned from the search query. This will contain information about
   * the Input such as the url, created_at time and trusted annotation information (for backwards
   * compatibility with apps that existed before Annotations were introduced.
   * </pre>
   *
   * <code>.clarifai.api.Input input = 2;</code>
   */
  com.clarifai.grpc.api.InputOrBuilder getInputOrBuilder();

  /**
   * <pre>
   * We also provide back the specific matched annotation for the above input. We do this in order
   * to support more complex Annotation queries in the And message below. For example if we match
   * the search results to a region in your input, or a frame in a video input, this annotation
   * field will be that matched annotation info and the input will be the image/video that the user
   * originally added which contains those regions / frames.
   * </pre>
   *
   * <code>.clarifai.api.Annotation annotation = 3;</code>
   * @return Whether the annotation field is set.
   */
  boolean hasAnnotation();
  /**
   * <pre>
   * We also provide back the specific matched annotation for the above input. We do this in order
   * to support more complex Annotation queries in the And message below. For example if we match
   * the search results to a region in your input, or a frame in a video input, this annotation
   * field will be that matched annotation info and the input will be the image/video that the user
   * originally added which contains those regions / frames.
   * </pre>
   *
   * <code>.clarifai.api.Annotation annotation = 3;</code>
   * @return The annotation.
   */
  com.clarifai.grpc.api.Annotation getAnnotation();
  /**
   * <pre>
   * We also provide back the specific matched annotation for the above input. We do this in order
   * to support more complex Annotation queries in the And message below. For example if we match
   * the search results to a region in your input, or a frame in a video input, this annotation
   * field will be that matched annotation info and the input will be the image/video that the user
   * originally added which contains those regions / frames.
   * </pre>
   *
   * <code>.clarifai.api.Annotation annotation = 3;</code>
   */
  com.clarifai.grpc.api.AnnotationOrBuilder getAnnotationOrBuilder();
}
