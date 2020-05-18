// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface ConceptMappingJobOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.ConceptMappingJob)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The id of the knowledge graph being used for this concept mapping job
   * </pre>
   *
   * <code>string knowledge_graph_id = 1;</code>
   * @return The knowledgeGraphId.
   */
  java.lang.String getKnowledgeGraphId();
  /**
   * <pre>
   * The id of the knowledge graph being used for this concept mapping job
   * </pre>
   *
   * <code>string knowledge_graph_id = 1;</code>
   * @return The bytes for knowledgeGraphId.
   */
  com.google.protobuf.ByteString
      getKnowledgeGraphIdBytes();

  /**
   * <pre>
   * The ids of the concepts being mapped
   * </pre>
   *
   * <code>repeated string concept_ids = 2;</code>
   * @return A list containing the conceptIds.
   */
  java.util.List<java.lang.String>
      getConceptIdsList();
  /**
   * <pre>
   * The ids of the concepts being mapped
   * </pre>
   *
   * <code>repeated string concept_ids = 2;</code>
   * @return The count of conceptIds.
   */
  int getConceptIdsCount();
  /**
   * <pre>
   * The ids of the concepts being mapped
   * </pre>
   *
   * <code>repeated string concept_ids = 2;</code>
   * @param index The index of the element to return.
   * @return The conceptIds at the given index.
   */
  java.lang.String getConceptIds(int index);
  /**
   * <pre>
   * The ids of the concepts being mapped
   * </pre>
   *
   * <code>repeated string concept_ids = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the conceptIds at the given index.
   */
  com.google.protobuf.ByteString
      getConceptIdsBytes(int index);
}
