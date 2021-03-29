// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface UserDetailOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.UserDetail)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string primary_email = 1;</code>
   * @return The primaryEmail.
   */
  java.lang.String getPrimaryEmail();
  /**
   * <code>string primary_email = 1;</code>
   * @return The bytes for primaryEmail.
   */
  com.google.protobuf.ByteString
      getPrimaryEmailBytes();

  /**
   * <code>string bill_type = 2;</code>
   * @return The billType.
   */
  java.lang.String getBillType();
  /**
   * <code>string bill_type = 2;</code>
   * @return The bytes for billType.
   */
  com.google.protobuf.ByteString
      getBillTypeBytes();

  /**
   * <code>.google.protobuf.Timestamp date_gdpr_consent = 3;</code>
   * @return Whether the dateGdprConsent field is set.
   */
  boolean hasDateGdprConsent();
  /**
   * <code>.google.protobuf.Timestamp date_gdpr_consent = 3;</code>
   * @return The dateGdprConsent.
   */
  com.google.protobuf.Timestamp getDateGdprConsent();
  /**
   * <code>.google.protobuf.Timestamp date_gdpr_consent = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getDateGdprConsentOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp date_tos_consent = 4;</code>
   * @return Whether the dateTosConsent field is set.
   */
  boolean hasDateTosConsent();
  /**
   * <code>.google.protobuf.Timestamp date_tos_consent = 4;</code>
   * @return The dateTosConsent.
   */
  com.google.protobuf.Timestamp getDateTosConsent();
  /**
   * <code>.google.protobuf.Timestamp date_tos_consent = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getDateTosConsentOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp date_marketing_consent = 5;</code>
   * @return Whether the dateMarketingConsent field is set.
   */
  boolean hasDateMarketingConsent();
  /**
   * <code>.google.protobuf.Timestamp date_marketing_consent = 5;</code>
   * @return The dateMarketingConsent.
   */
  com.google.protobuf.Timestamp getDateMarketingConsent();
  /**
   * <code>.google.protobuf.Timestamp date_marketing_consent = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getDateMarketingConsentOrBuilder();

  /**
   * <pre>
   * To handle arbitrary json metadata you can use a struct field:
   * https://github.com/google/protobuf/blob/master/src/google/protobuf/struct.proto
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 6;</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <pre>
   * To handle arbitrary json metadata you can use a struct field:
   * https://github.com/google/protobuf/blob/master/src/google/protobuf/struct.proto
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 6;</code>
   * @return The metadata.
   */
  com.google.protobuf.Struct getMetadata();
  /**
   * <pre>
   * To handle arbitrary json metadata you can use a struct field:
   * https://github.com/google/protobuf/blob/master/src/google/protobuf/struct.proto
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 6;</code>
   */
  com.google.protobuf.StructOrBuilder getMetadataOrBuilder();

  /**
   * <code>repeated .clarifai.api.EmailAddress email_addresses = 7;</code>
   */
  java.util.List<com.clarifai.grpc.api.EmailAddress> 
      getEmailAddressesList();
  /**
   * <code>repeated .clarifai.api.EmailAddress email_addresses = 7;</code>
   */
  com.clarifai.grpc.api.EmailAddress getEmailAddresses(int index);
  /**
   * <code>repeated .clarifai.api.EmailAddress email_addresses = 7;</code>
   */
  int getEmailAddressesCount();
  /**
   * <code>repeated .clarifai.api.EmailAddress email_addresses = 7;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.EmailAddressOrBuilder> 
      getEmailAddressesOrBuilderList();
  /**
   * <code>repeated .clarifai.api.EmailAddress email_addresses = 7;</code>
   */
  com.clarifai.grpc.api.EmailAddressOrBuilder getEmailAddressesOrBuilder(
      int index);

  /**
   * <code>bool is_org_admin = 8;</code>
   * @return The isOrgAdmin.
   */
  boolean getIsOrgAdmin();

  /**
   * <code>bool two_factor_auth_enabled = 9;</code>
   * @return The twoFactorAuthEnabled.
   */
  boolean getTwoFactorAuthEnabled();

  /**
   * <code>uint32 teams_count = 10;</code>
   * @return The teamsCount.
   */
  int getTeamsCount();
}
