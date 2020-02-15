package net.fhirbox.pegacorn.referencevalues.communication;

public class PegacornCommunicateValueReferences {

    private static final String Group_Priority_Extension_Meaning = "http://pegacorn.fhirbox.net/pegacorn/R1/communicate/groups/group_priority";
    private static final String Group_Creator_Extension_Meaning = "http://pegacorn.fhirbox.net/pegacorn/R1/communicate/groups/group_creator";
    private static final String Group_Federation_Extension_Meaning = "http://pegacorn.fhirbox.net/pegacorn/R1/communicate/groups/group_federation_flag";
    private static final String Group_Predecessor_Room_Extension_Meaning = "http://pegacorn.fhirbox.net/pegacorn/R1/communicate/groups/group_predecessor_room";
    private static final String Group_Room_Version_Extension_Meaning = "http://pegacorn.fhirbox.net/pegacorn/R1/communicate/groups/group_room_version";
    private static final String Group_Predecessor_Room_Last_Message_Extension_Meaning = "http://pegacorn.fhirbox.net/pegacorn/R1/communicate/groups/group_predecessor_room_last_message";

    private static final String RoomServerAuthToken_IN = "";
    private static final String RoomServerAuthToken_Out = "";

    public String getGroupPriorityExensionMeaning() {
        return (this.Group_Priority_Extension_Meaning);
    }

    public String getGroupCreatorExtensionMeaning() {
        return (Group_Creator_Extension_Meaning);
    }

    public String getGroupFederationStatusMeaning() {
        return (Group_Federation_Extension_Meaning);
    }

    public String getGroupPredecssorRoomExtensionMeaning() {
        return (Group_Predecessor_Room_Extension_Meaning);
    }

    public String getGroupRoomVersionExtensionMeaning() {
        return (Group_Room_Version_Extension_Meaning);
    }

    public String getGroupPredecessorRoomLastMessageExtensionMeaning() {
        return (Group_Predecessor_Room_Last_Message_Extension_Meaning);
    }

    public String getInboundRoomServerAuthToken() {
        return (RoomServerAuthToken_IN);
    }

    public String getOutboundRoomServerAuthToken() {
        return (RoomServerAuthToken_Out);
    }
}
