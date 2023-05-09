// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface UserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.User)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string primary_email = 2 [deprecated = true];</code>
   * @deprecated clarifai.api.User.primary_email is deprecated.
   *     See proto/clarifai/api/resources.proto;l=2223
   * @return The primaryEmail.
   */
  @java.lang.Deprecated java.lang.String getPrimaryEmail();
  /**
   * <code>string primary_email = 2 [deprecated = true];</code>
   * @deprecated clarifai.api.User.primary_email is deprecated.
   *     See proto/clarifai/api/resources.proto;l=2223
   * @return The bytes for primaryEmail.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getPrimaryEmailBytes();

  /**
   * <code>string first_name = 3;</code>
   * @return The firstName.
   */
  java.lang.String getFirstName();
  /**
   * <code>string first_name = 3;</code>
   * @return The bytes for firstName.
   */
  com.google.protobuf.ByteString
      getFirstNameBytes();

  /**
   * <code>string last_name = 4;</code>
   * @return The lastName.
   */
  java.lang.String getLastName();
  /**
   * <code>string last_name = 4;</code>
   * @return The bytes for lastName.
   */
  com.google.protobuf.ByteString
      getLastNameBytes();

  /**
   * <code>string company_name = 5;</code>
   * @return The companyName.
   */
  java.lang.String getCompanyName();
  /**
   * <code>string company_name = 5;</code>
   * @return The bytes for companyName.
   */
  com.google.protobuf.ByteString
      getCompanyNameBytes();

  /**
   * <code>string job_title = 19;</code>
   * @return The jobTitle.
   */
  java.lang.String getJobTitle();
  /**
   * <code>string job_title = 19;</code>
   * @return The bytes for jobTitle.
   */
  com.google.protobuf.ByteString
      getJobTitleBytes();

  /**
   * <code>string job_role = 20;</code>
   * @return The jobRole.
   */
  java.lang.String getJobRole();
  /**
   * <code>string job_role = 20;</code>
   * @return The bytes for jobRole.
   */
  com.google.protobuf.ByteString
      getJobRoleBytes();

  /**
   * <code>string bill_type = 7 [deprecated = true];</code>
   * @deprecated clarifai.api.User.bill_type is deprecated.
   *     See proto/clarifai/api/resources.proto;l=2230
   * @return The billType.
   */
  @java.lang.Deprecated java.lang.String getBillType();
  /**
   * <code>string bill_type = 7 [deprecated = true];</code>
   * @deprecated clarifai.api.User.bill_type is deprecated.
   *     See proto/clarifai/api/resources.proto;l=2230
   * @return The bytes for billType.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getBillTypeBytes();

  /**
   * <pre>
   * When the user was created. We follow the XXXX timestamp
   * format. We use https://www.ietf.org/rfc/rfc3339.txt format:
   * "2006-01-02T15:04:05.999999Z" so you can expect results like
   * the following from the API:
   * "2017-04-11T21:50:50.223962Z"
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 6;</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <pre>
   * When the user was created. We follow the XXXX timestamp
   * format. We use https://www.ietf.org/rfc/rfc3339.txt format:
   * "2006-01-02T15:04:05.999999Z" so you can expect results like
   * the following from the API:
   * "2017-04-11T21:50:50.223962Z"
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 6;</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <pre>
   * When the user was created. We follow the XXXX timestamp
   * format. We use https://www.ietf.org/rfc/rfc3339.txt format:
   * "2006-01-02T15:04:05.999999Z" so you can expect results like
   * the following from the API:
   * "2017-04-11T21:50:50.223962Z"
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp date_gdpr_consent = 8 [deprecated = true];</code>
   * @deprecated clarifai.api.User.date_gdpr_consent is deprecated.
   *     See proto/clarifai/api/resources.proto;l=2238
   * @return Whether the dateGdprConsent field is set.
   */
  @java.lang.Deprecated boolean hasDateGdprConsent();
  /**
   * <code>.google.protobuf.Timestamp date_gdpr_consent = 8 [deprecated = true];</code>
   * @deprecated clarifai.api.User.date_gdpr_consent is deprecated.
   *     See proto/clarifai/api/resources.proto;l=2238
   * @return The dateGdprConsent.
   */
  @java.lang.Deprecated com.google.protobuf.Timestamp getDateGdprConsent();
  /**
   * <code>.google.protobuf.Timestamp date_gdpr_consent = 8 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.TimestampOrBuilder getDateGdprConsentOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp date_tos_consent = 9 [deprecated = true];</code>
   * @deprecated clarifai.api.User.date_tos_consent is deprecated.
   *     See proto/clarifai/api/resources.proto;l=2239
   * @return Whether the dateTosConsent field is set.
   */
  @java.lang.Deprecated boolean hasDateTosConsent();
  /**
   * <code>.google.protobuf.Timestamp date_tos_consent = 9 [deprecated = true];</code>
   * @deprecated clarifai.api.User.date_tos_consent is deprecated.
   *     See proto/clarifai/api/resources.proto;l=2239
   * @return The dateTosConsent.
   */
  @java.lang.Deprecated com.google.protobuf.Timestamp getDateTosConsent();
  /**
   * <code>.google.protobuf.Timestamp date_tos_consent = 9 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.TimestampOrBuilder getDateTosConsentOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp date_marketing_consent = 10 [deprecated = true];</code>
   * @deprecated clarifai.api.User.date_marketing_consent is deprecated.
   *     See proto/clarifai/api/resources.proto;l=2240
   * @return Whether the dateMarketingConsent field is set.
   */
  @java.lang.Deprecated boolean hasDateMarketingConsent();
  /**
   * <code>.google.protobuf.Timestamp date_marketing_consent = 10 [deprecated = true];</code>
   * @deprecated clarifai.api.User.date_marketing_consent is deprecated.
   *     See proto/clarifai/api/resources.proto;l=2240
   * @return The dateMarketingConsent.
   */
  @java.lang.Deprecated com.google.protobuf.Timestamp getDateMarketingConsent();
  /**
   * <code>.google.protobuf.Timestamp date_marketing_consent = 10 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.TimestampOrBuilder getDateMarketingConsentOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp date_pii_consent = 23 [deprecated = true];</code>
   * @deprecated clarifai.api.User.date_pii_consent is deprecated.
   *     See proto/clarifai/api/resources.proto;l=2241
   * @return Whether the datePiiConsent field is set.
   */
  @java.lang.Deprecated boolean hasDatePiiConsent();
  /**
   * <code>.google.protobuf.Timestamp date_pii_consent = 23 [deprecated = true];</code>
   * @deprecated clarifai.api.User.date_pii_consent is deprecated.
   *     See proto/clarifai/api/resources.proto;l=2241
   * @return The datePiiConsent.
   */
  @java.lang.Deprecated com.google.protobuf.Timestamp getDatePiiConsent();
  /**
   * <code>.google.protobuf.Timestamp date_pii_consent = 23 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.TimestampOrBuilder getDatePiiConsentOrBuilder();

  /**
   * <pre>
   * To handle arbitrary json metadata you can use a struct field:
   * https://github.com/google/protobuf/blob/master/src/google/protobuf/struct.proto
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 11 [deprecated = true];</code>
   * @deprecated clarifai.api.User.metadata is deprecated.
   *     See proto/clarifai/api/resources.proto;l=2245
   * @return Whether the metadata field is set.
   */
  @java.lang.Deprecated boolean hasMetadata();
  /**
   * <pre>
   * To handle arbitrary json metadata you can use a struct field:
   * https://github.com/google/protobuf/blob/master/src/google/protobuf/struct.proto
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 11 [deprecated = true];</code>
   * @deprecated clarifai.api.User.metadata is deprecated.
   *     See proto/clarifai/api/resources.proto;l=2245
   * @return The metadata.
   */
  @java.lang.Deprecated com.google.protobuf.Struct getMetadata();
  /**
   * <pre>
   * To handle arbitrary json metadata you can use a struct field:
   * https://github.com/google/protobuf/blob/master/src/google/protobuf/struct.proto
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 11 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.StructOrBuilder getMetadataOrBuilder();

  /**
   * <code>repeated .clarifai.api.EmailAddress email_addresses = 12 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<com.clarifai.grpc.api.EmailAddress> 
      getEmailAddressesList();
  /**
   * <code>repeated .clarifai.api.EmailAddress email_addresses = 12 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.clarifai.grpc.api.EmailAddress getEmailAddresses(int index);
  /**
   * <code>repeated .clarifai.api.EmailAddress email_addresses = 12 [deprecated = true];</code>
   */
  @java.lang.Deprecated int getEmailAddressesCount();
  /**
   * <code>repeated .clarifai.api.EmailAddress email_addresses = 12 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<? extends com.clarifai.grpc.api.EmailAddressOrBuilder> 
      getEmailAddressesOrBuilderList();
  /**
   * <code>repeated .clarifai.api.EmailAddress email_addresses = 12 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.clarifai.grpc.api.EmailAddressOrBuilder getEmailAddressesOrBuilder(
      int index);

  /**
   * <code>bool two_factor_auth_enabled = 15 [deprecated = true];</code>
   * @deprecated clarifai.api.User.two_factor_auth_enabled is deprecated.
   *     See proto/clarifai/api/resources.proto;l=2248
   * @return The twoFactorAuthEnabled.
   */
  @java.lang.Deprecated boolean getTwoFactorAuthEnabled();

  /**
   * <code>uint32 teams_count = 16 [deprecated = true];</code>
   * @deprecated clarifai.api.User.teams_count is deprecated.
   *     See proto/clarifai/api/resources.proto;l=2249
   * @return The teamsCount.
   */
  @java.lang.Deprecated int getTeamsCount();

  /**
   * <pre>
   * Is starred by the requesting user (only showed on get/list requests)
   * Please use PostUserStars/DeleteUserStars endpoints to star/unstar an user
   * </pre>
   *
   * <code>bool is_starred = 21;</code>
   * @return The isStarred.
   */
  boolean getIsStarred();

  /**
   * <pre>
   * How many users have starred the user (only showed on get/list requests)
   * Computed value, not editable
   * </pre>
   *
   * <code>int32 star_count = 22;</code>
   * @return The starCount.
   */
  int getStarCount();

  /**
   * <pre>
   * The visibility field represents whether this message is privately/publicly visible.
   * To be visible to the public the App that contains it AND the User that contains the App must
   * also be publicly visible.
   * </pre>
   *
   * <code>.clarifai.api.Visibility visibility = 17;</code>
   * @return Whether the visibility field is set.
   */
  boolean hasVisibility();
  /**
   * <pre>
   * The visibility field represents whether this message is privately/publicly visible.
   * To be visible to the public the App that contains it AND the User that contains the App must
   * also be publicly visible.
   * </pre>
   *
   * <code>.clarifai.api.Visibility visibility = 17;</code>
   * @return The visibility.
   */
  com.clarifai.grpc.api.Visibility getVisibility();
  /**
   * <pre>
   * The visibility field represents whether this message is privately/publicly visible.
   * To be visible to the public the App that contains it AND the User that contains the App must
   * also be publicly visible.
   * </pre>
   *
   * <code>.clarifai.api.Visibility visibility = 17;</code>
   */
  com.clarifai.grpc.api.VisibilityOrBuilder getVisibilityOrBuilder();

  /**
   * <pre>
   * This is all the personal information of a user. GetUser/ListUsers will not return this
   * information unless the caller has the UserAccounts_Get scope on their key or is the user
   * themselves.
   * </pre>
   *
   * <code>.clarifai.api.UserDetail user_detail = 18;</code>
   * @return Whether the userDetail field is set.
   */
  boolean hasUserDetail();
  /**
   * <pre>
   * This is all the personal information of a user. GetUser/ListUsers will not return this
   * information unless the caller has the UserAccounts_Get scope on their key or is the user
   * themselves.
   * </pre>
   *
   * <code>.clarifai.api.UserDetail user_detail = 18;</code>
   * @return The userDetail.
   */
  com.clarifai.grpc.api.UserDetail getUserDetail();
  /**
   * <pre>
   * This is all the personal information of a user. GetUser/ListUsers will not return this
   * information unless the caller has the UserAccounts_Get scope on their key or is the user
   * themselves.
   * </pre>
   *
   * <code>.clarifai.api.UserDetail user_detail = 18;</code>
   */
  com.clarifai.grpc.api.UserDetailOrBuilder getUserDetailOrBuilder();
}
