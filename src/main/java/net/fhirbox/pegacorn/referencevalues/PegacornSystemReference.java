package net.fhirbox.pegacorn.referencevalues;

public class PegacornSystemReference {
	
	private static final String ROOMSERVER_IDENTIFIER_SYSTEM = "http://pegacorn.fhirbox.net/pegacorn/R1/iris/roomserver";
	
	public String getDefaultIdentifierSystemForRoomServerDetails() {
		return(ROOMSERVER_IDENTIFIER_SYSTEM);
	}

}
