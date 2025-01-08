// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * Protobuf enum {@code clarifai.api.EventType}
 */
public enum EventType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>EVENT_TYPE_NOT_SET = 0;</code>
   */
  EVENT_TYPE_NOT_SET(0),
  /**
   * <pre>
   * Event types related to organization memberships and teams: 100 - 199
   * </pre>
   *
   * <code>ORGANIZATION_MEMBER_ADD = 100 [(.clarifai.api.utils.description) = "Organization members added"];</code>
   */
  ORGANIZATION_MEMBER_ADD(100),
  /**
   * <code>ORGANIZATION_MEMBER_CHANGE = 101 [(.clarifai.api.utils.description) = "Organization members&#92;' roles changed"];</code>
   */
  ORGANIZATION_MEMBER_CHANGE(101),
  /**
   * <code>ORGANIZATION_MEMBER_REMOVE = 102 [(.clarifai.api.utils.description) = "Organization members removed"];</code>
   */
  ORGANIZATION_MEMBER_REMOVE(102),
  /**
   * <code>ORGANIZATION_MEMBER_INVITATION_CREATE = 103 [(.clarifai.api.utils.description) = "Organization member invitations created"];</code>
   */
  ORGANIZATION_MEMBER_INVITATION_CREATE(103),
  /**
   * <code>ORGANIZATION_MEMBER_INVITATION_CANCEL = 104 [(.clarifai.api.utils.description) = "Organization member invitations canceled"];</code>
   */
  ORGANIZATION_MEMBER_INVITATION_CANCEL(104),
  /**
   * <code>ORGANIZATION_MEMBER_INVITATION_ACCEPT = 105 [(.clarifai.api.utils.description) = "Organization member invitations accepted"];</code>
   */
  ORGANIZATION_MEMBER_INVITATION_ACCEPT(105),
  /**
   * <code>ORGANIZATION_MEMBER_INVITATION_DECLINE = 106 [(.clarifai.api.utils.description) = "Organization member invitations declined"];</code>
   */
  ORGANIZATION_MEMBER_INVITATION_DECLINE(106),
  /**
   * <code>ORGANIZATION_TEAM_CREATE = 107 [(.clarifai.api.utils.description) = "Organization teams created"];</code>
   */
  ORGANIZATION_TEAM_CREATE(107),
  /**
   * <code>ORGANIZATION_TEAM_UPDATE = 108 [(.clarifai.api.utils.description) = "Organization teams updated"];</code>
   */
  ORGANIZATION_TEAM_UPDATE(108),
  /**
   * <code>ORGANIZATION_TEAM_DELETE = 109 [(.clarifai.api.utils.description) = "Organization teams deleted"];</code>
   */
  ORGANIZATION_TEAM_DELETE(109),
  /**
   * <code>ORGANIZATION_TEAM_MEMBER_ADD = 110 [(.clarifai.api.utils.description) = "Organization team members added"];</code>
   */
  ORGANIZATION_TEAM_MEMBER_ADD(110),
  /**
   * <code>ORGANIZATION_TEAM_MEMBER_REMOVE = 111 [(.clarifai.api.utils.description) = "Organization team members removed"];</code>
   */
  ORGANIZATION_TEAM_MEMBER_REMOVE(111),
  /**
   * <code>ORGANIZATION_TEAM_APP_ADD = 112 [(.clarifai.api.utils.description) = "Organization team applications added"];</code>
   */
  ORGANIZATION_TEAM_APP_ADD(112),
  /**
   * <code>ORGANIZATION_TEAM_APP_REMOVE = 113 [(.clarifai.api.utils.description) = "Organization team applications removed"];</code>
   */
  ORGANIZATION_TEAM_APP_REMOVE(113),
  /**
   * <pre>
   * Event types related to modules: 200 - 299
   * </pre>
   *
   * <code>MODULE_CREATE = 200 [(.clarifai.api.utils.description) = "Modules created"];</code>
   */
  MODULE_CREATE(200),
  /**
   * <code>MODULE_UPDATE = 201 [(.clarifai.api.utils.description) = "Modules updated"];</code>
   */
  MODULE_UPDATE(201),
  /**
   * <code>MODULE_DELETE = 202 [(.clarifai.api.utils.description) = "Modules deleted"];</code>
   */
  MODULE_DELETE(202),
  /**
   * <code>MODULE_VERSION_CREATE = 203 [(.clarifai.api.utils.description) = "Module versions created"];</code>
   */
  MODULE_VERSION_CREATE(203),
  /**
   * <code>MODULE_VERSION_UPDATE = 204 [(.clarifai.api.utils.description) = "Module versions updated"];</code>
   */
  MODULE_VERSION_UPDATE(204),
  /**
   * <code>MODULE_VERSION_DELETE = 205 [(.clarifai.api.utils.description) = "Module versions deleted"];</code>
   */
  MODULE_VERSION_DELETE(205),
  /**
   * <pre>
   * Event types related to workflows: 400 - 499
   * </pre>
   *
   * <code>WORKFLOW_CREATE = 400 [(.clarifai.api.utils.description) = "Workflows created"];</code>
   */
  WORKFLOW_CREATE(400),
  /**
   * <code>WORKFLOW_UPDATE = 401 [(.clarifai.api.utils.description) = "Workflows updated"];</code>
   */
  WORKFLOW_UPDATE(401),
  /**
   * <code>WORKFLOW_DELETE = 402 [(.clarifai.api.utils.description) = "Workflows deleted"];</code>
   */
  WORKFLOW_DELETE(402),
  /**
   * <code>WORKFLOW_VERSION_CREATE = 403 [(.clarifai.api.utils.description) = "Workflow versions created"];</code>
   */
  WORKFLOW_VERSION_CREATE(403),
  /**
   * <code>WORKFLOW_VERSION_UPDATE = 404 [(.clarifai.api.utils.description) = "Workflow versions updated"];</code>
   */
  WORKFLOW_VERSION_UPDATE(404),
  /**
   * <code>WORKFLOW_VERSION_DELETE = 405 [(.clarifai.api.utils.description) = "Workflow versions deleted"];</code>
   */
  WORKFLOW_VERSION_DELETE(405),
  /**
   * <pre>
   * Event types related to applications: 600 - 699
   * </pre>
   *
   * <code>APPLICATION_CREATE = 600 [(.clarifai.api.utils.description) = "Applications created"];</code>
   */
  APPLICATION_CREATE(600),
  /**
   * <code>APPLICATION_UPDATE = 601 [(.clarifai.api.utils.description) = "Applications updated"];</code>
   */
  APPLICATION_UPDATE(601),
  /**
   * <code>APPLICATION_DELETE = 602 [(.clarifai.api.utils.description) = "Applications deleted"];</code>
   */
  APPLICATION_DELETE(602),
  /**
   * <pre>
   * Event types related to collaborators: 700 - 799
   * </pre>
   *
   * <code>COLLABORATOR_ADD = 700 [(.clarifai.api.utils.description) = "Collaborators added"];</code>
   */
  COLLABORATOR_ADD(700),
  /**
   * <code>COLLABORATOR_UPDATE = 701 [(.clarifai.api.utils.description) = "Collaborators updated"];</code>
   */
  COLLABORATOR_UPDATE(701),
  /**
   * <code>COLLABORATOR_REMOVE = 702 [(.clarifai.api.utils.description) = "Collaborators removed"];</code>
   */
  COLLABORATOR_REMOVE(702),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>EVENT_TYPE_NOT_SET = 0;</code>
   */
  public static final int EVENT_TYPE_NOT_SET_VALUE = 0;
  /**
   * <pre>
   * Event types related to organization memberships and teams: 100 - 199
   * </pre>
   *
   * <code>ORGANIZATION_MEMBER_ADD = 100 [(.clarifai.api.utils.description) = "Organization members added"];</code>
   */
  public static final int ORGANIZATION_MEMBER_ADD_VALUE = 100;
  /**
   * <code>ORGANIZATION_MEMBER_CHANGE = 101 [(.clarifai.api.utils.description) = "Organization members&#92;' roles changed"];</code>
   */
  public static final int ORGANIZATION_MEMBER_CHANGE_VALUE = 101;
  /**
   * <code>ORGANIZATION_MEMBER_REMOVE = 102 [(.clarifai.api.utils.description) = "Organization members removed"];</code>
   */
  public static final int ORGANIZATION_MEMBER_REMOVE_VALUE = 102;
  /**
   * <code>ORGANIZATION_MEMBER_INVITATION_CREATE = 103 [(.clarifai.api.utils.description) = "Organization member invitations created"];</code>
   */
  public static final int ORGANIZATION_MEMBER_INVITATION_CREATE_VALUE = 103;
  /**
   * <code>ORGANIZATION_MEMBER_INVITATION_CANCEL = 104 [(.clarifai.api.utils.description) = "Organization member invitations canceled"];</code>
   */
  public static final int ORGANIZATION_MEMBER_INVITATION_CANCEL_VALUE = 104;
  /**
   * <code>ORGANIZATION_MEMBER_INVITATION_ACCEPT = 105 [(.clarifai.api.utils.description) = "Organization member invitations accepted"];</code>
   */
  public static final int ORGANIZATION_MEMBER_INVITATION_ACCEPT_VALUE = 105;
  /**
   * <code>ORGANIZATION_MEMBER_INVITATION_DECLINE = 106 [(.clarifai.api.utils.description) = "Organization member invitations declined"];</code>
   */
  public static final int ORGANIZATION_MEMBER_INVITATION_DECLINE_VALUE = 106;
  /**
   * <code>ORGANIZATION_TEAM_CREATE = 107 [(.clarifai.api.utils.description) = "Organization teams created"];</code>
   */
  public static final int ORGANIZATION_TEAM_CREATE_VALUE = 107;
  /**
   * <code>ORGANIZATION_TEAM_UPDATE = 108 [(.clarifai.api.utils.description) = "Organization teams updated"];</code>
   */
  public static final int ORGANIZATION_TEAM_UPDATE_VALUE = 108;
  /**
   * <code>ORGANIZATION_TEAM_DELETE = 109 [(.clarifai.api.utils.description) = "Organization teams deleted"];</code>
   */
  public static final int ORGANIZATION_TEAM_DELETE_VALUE = 109;
  /**
   * <code>ORGANIZATION_TEAM_MEMBER_ADD = 110 [(.clarifai.api.utils.description) = "Organization team members added"];</code>
   */
  public static final int ORGANIZATION_TEAM_MEMBER_ADD_VALUE = 110;
  /**
   * <code>ORGANIZATION_TEAM_MEMBER_REMOVE = 111 [(.clarifai.api.utils.description) = "Organization team members removed"];</code>
   */
  public static final int ORGANIZATION_TEAM_MEMBER_REMOVE_VALUE = 111;
  /**
   * <code>ORGANIZATION_TEAM_APP_ADD = 112 [(.clarifai.api.utils.description) = "Organization team applications added"];</code>
   */
  public static final int ORGANIZATION_TEAM_APP_ADD_VALUE = 112;
  /**
   * <code>ORGANIZATION_TEAM_APP_REMOVE = 113 [(.clarifai.api.utils.description) = "Organization team applications removed"];</code>
   */
  public static final int ORGANIZATION_TEAM_APP_REMOVE_VALUE = 113;
  /**
   * <pre>
   * Event types related to modules: 200 - 299
   * </pre>
   *
   * <code>MODULE_CREATE = 200 [(.clarifai.api.utils.description) = "Modules created"];</code>
   */
  public static final int MODULE_CREATE_VALUE = 200;
  /**
   * <code>MODULE_UPDATE = 201 [(.clarifai.api.utils.description) = "Modules updated"];</code>
   */
  public static final int MODULE_UPDATE_VALUE = 201;
  /**
   * <code>MODULE_DELETE = 202 [(.clarifai.api.utils.description) = "Modules deleted"];</code>
   */
  public static final int MODULE_DELETE_VALUE = 202;
  /**
   * <code>MODULE_VERSION_CREATE = 203 [(.clarifai.api.utils.description) = "Module versions created"];</code>
   */
  public static final int MODULE_VERSION_CREATE_VALUE = 203;
  /**
   * <code>MODULE_VERSION_UPDATE = 204 [(.clarifai.api.utils.description) = "Module versions updated"];</code>
   */
  public static final int MODULE_VERSION_UPDATE_VALUE = 204;
  /**
   * <code>MODULE_VERSION_DELETE = 205 [(.clarifai.api.utils.description) = "Module versions deleted"];</code>
   */
  public static final int MODULE_VERSION_DELETE_VALUE = 205;
  /**
   * <pre>
   * Event types related to workflows: 400 - 499
   * </pre>
   *
   * <code>WORKFLOW_CREATE = 400 [(.clarifai.api.utils.description) = "Workflows created"];</code>
   */
  public static final int WORKFLOW_CREATE_VALUE = 400;
  /**
   * <code>WORKFLOW_UPDATE = 401 [(.clarifai.api.utils.description) = "Workflows updated"];</code>
   */
  public static final int WORKFLOW_UPDATE_VALUE = 401;
  /**
   * <code>WORKFLOW_DELETE = 402 [(.clarifai.api.utils.description) = "Workflows deleted"];</code>
   */
  public static final int WORKFLOW_DELETE_VALUE = 402;
  /**
   * <code>WORKFLOW_VERSION_CREATE = 403 [(.clarifai.api.utils.description) = "Workflow versions created"];</code>
   */
  public static final int WORKFLOW_VERSION_CREATE_VALUE = 403;
  /**
   * <code>WORKFLOW_VERSION_UPDATE = 404 [(.clarifai.api.utils.description) = "Workflow versions updated"];</code>
   */
  public static final int WORKFLOW_VERSION_UPDATE_VALUE = 404;
  /**
   * <code>WORKFLOW_VERSION_DELETE = 405 [(.clarifai.api.utils.description) = "Workflow versions deleted"];</code>
   */
  public static final int WORKFLOW_VERSION_DELETE_VALUE = 405;
  /**
   * <pre>
   * Event types related to applications: 600 - 699
   * </pre>
   *
   * <code>APPLICATION_CREATE = 600 [(.clarifai.api.utils.description) = "Applications created"];</code>
   */
  public static final int APPLICATION_CREATE_VALUE = 600;
  /**
   * <code>APPLICATION_UPDATE = 601 [(.clarifai.api.utils.description) = "Applications updated"];</code>
   */
  public static final int APPLICATION_UPDATE_VALUE = 601;
  /**
   * <code>APPLICATION_DELETE = 602 [(.clarifai.api.utils.description) = "Applications deleted"];</code>
   */
  public static final int APPLICATION_DELETE_VALUE = 602;
  /**
   * <pre>
   * Event types related to collaborators: 700 - 799
   * </pre>
   *
   * <code>COLLABORATOR_ADD = 700 [(.clarifai.api.utils.description) = "Collaborators added"];</code>
   */
  public static final int COLLABORATOR_ADD_VALUE = 700;
  /**
   * <code>COLLABORATOR_UPDATE = 701 [(.clarifai.api.utils.description) = "Collaborators updated"];</code>
   */
  public static final int COLLABORATOR_UPDATE_VALUE = 701;
  /**
   * <code>COLLABORATOR_REMOVE = 702 [(.clarifai.api.utils.description) = "Collaborators removed"];</code>
   */
  public static final int COLLABORATOR_REMOVE_VALUE = 702;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static EventType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static EventType forNumber(int value) {
    switch (value) {
      case 0: return EVENT_TYPE_NOT_SET;
      case 100: return ORGANIZATION_MEMBER_ADD;
      case 101: return ORGANIZATION_MEMBER_CHANGE;
      case 102: return ORGANIZATION_MEMBER_REMOVE;
      case 103: return ORGANIZATION_MEMBER_INVITATION_CREATE;
      case 104: return ORGANIZATION_MEMBER_INVITATION_CANCEL;
      case 105: return ORGANIZATION_MEMBER_INVITATION_ACCEPT;
      case 106: return ORGANIZATION_MEMBER_INVITATION_DECLINE;
      case 107: return ORGANIZATION_TEAM_CREATE;
      case 108: return ORGANIZATION_TEAM_UPDATE;
      case 109: return ORGANIZATION_TEAM_DELETE;
      case 110: return ORGANIZATION_TEAM_MEMBER_ADD;
      case 111: return ORGANIZATION_TEAM_MEMBER_REMOVE;
      case 112: return ORGANIZATION_TEAM_APP_ADD;
      case 113: return ORGANIZATION_TEAM_APP_REMOVE;
      case 200: return MODULE_CREATE;
      case 201: return MODULE_UPDATE;
      case 202: return MODULE_DELETE;
      case 203: return MODULE_VERSION_CREATE;
      case 204: return MODULE_VERSION_UPDATE;
      case 205: return MODULE_VERSION_DELETE;
      case 400: return WORKFLOW_CREATE;
      case 401: return WORKFLOW_UPDATE;
      case 402: return WORKFLOW_DELETE;
      case 403: return WORKFLOW_VERSION_CREATE;
      case 404: return WORKFLOW_VERSION_UPDATE;
      case 405: return WORKFLOW_VERSION_DELETE;
      case 600: return APPLICATION_CREATE;
      case 601: return APPLICATION_UPDATE;
      case 602: return APPLICATION_DELETE;
      case 700: return COLLABORATOR_ADD;
      case 701: return COLLABORATOR_UPDATE;
      case 702: return COLLABORATOR_REMOVE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EventType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      EventType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<EventType>() {
          public EventType findValueByNumber(int number) {
            return EventType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Resources.getDescriptor().getEnumTypes().get(19);
  }

  private static final EventType[] VALUES = values();

  public static EventType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private EventType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:clarifai.api.EventType)
}

