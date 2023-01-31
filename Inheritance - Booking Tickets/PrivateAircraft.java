public class PrivateAircraft extends Aircraft{
    
		//fill your code 	
	Boolean	checkInBeforeTwoHours;
	String	pilotPreference;
	String	purpose;
	
	public PrivateAircraft(String aircraftName, String source, String destination, Boolean checkInBeforeTwoHours,
			String pilotPreference, String purpose) {
		super(aircraftName, source, destination);
		this.checkInBeforeTwoHours = checkInBeforeTwoHours;
		this.pilotPreference = pilotPreference;
		this.purpose = purpose;
	}

	public Boolean getCheckInBeforeTwoHours() {
		return checkInBeforeTwoHours;
	}

	public void setCheckInBeforeTwoHours(Boolean checkInBeforeTwoHours) {
		this.checkInBeforeTwoHours = checkInBeforeTwoHours;
	}

	public String getPilotPreference() {
		return pilotPreference;
	}

	public void setPilotPreference(String pilotPreference) {
		this.pilotPreference = pilotPreference;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	
	public void displayDetails() {
		System.out.println("Flight Details :");
		System.out.println("Private Aircraft:");
		super.displayDetails();
		System.out.println("Flight check in before two hours : No");
		System.out.println("Pilot chose : " + getPilotPreference());
		System.out.println("Purpose of the flight : " + getPurpose());
	}
	
	
	
	
					
}
