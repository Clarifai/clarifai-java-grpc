// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface PaginationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.Pagination)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * (optional URL parameter) The page number. Pagination is used to split the results into chunks. Defaults to 1.
   * </pre>
   *
   * <code>uint32 page = 1;</code>
   * @return The page.
   */
  int getPage();

  /**
   * <pre>
   * (optional URL parameter) The number of results that will be contained in each page. Defaults to 10.
   * </pre>
   *
   * <code>uint32 per_page = 2;</code>
   * @return The perPage.
   */
  int getPerPage();
}
