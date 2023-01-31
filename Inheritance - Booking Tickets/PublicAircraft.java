

public class PublicAircraft extends Aircraft {
    //fill your code 
	Boolean	checkInBeforeTwoHours;
	int	noOfKgsAllowed;
	Float	additionalFeePerkg;
	

	public PublicAircraft(String aircraftName, String source, String destination, Boolean checkInBeforeTwoHours, int noOfKgsAllowed, Float additionalFeePerkg) {
		super(aircraftName, source, destination);
		this.checkInBeforeTwoHours = checkInBeforeTwoHours;
		this.noOfKgsAllowed = noOfKgsAllowed;
		this.additionalFeePerkg = additionalFeePerkg;
	}


	public Boolean getCheckInBeforeTwoHours() {
		return checkInBeforeTwoHours;
	}


	public void setCheckInBeforeTwoHours(Boolean checkInBeforeTwoHours) {
		this.checkInBeforeTwoHours = checkInBeforeTwoHours;
	}


	public int getNoOfKgsAllowed() {
		return noOfKgsAllowed;
	}


	public void setNoOfKgsAllowed(int noOfKgsAllowed) {
		this.noOfKgsAllowed = noOfKgsAllowed;
	}


	public Float getAdditionalFeePerkg() {
		return additionalFeePerkg;
	}


	public void setAdditionalFeePerkg(Float additionalFeePerkg) {
		this.additionalFeePerkg = additionalFeePerkg;
	}	
	
	public void displayDetails() {
		System.out.println("Flight Details :");
		System.out.println("Public Aircraft:");
		super.displayDetails();
		System.out.println("Flight check in before two hours : Yes");
		System.out.println("Number of kgs allowed per person : " + getNoOfKgsAllowed());
		System.out.println("Additional fee charged for extra baggage per Kg : " + getAdditionalFeePerkg());
	}
}
