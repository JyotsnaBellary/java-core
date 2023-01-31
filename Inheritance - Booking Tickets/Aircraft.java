

public class Aircraft {

    //fill your code 
	String	aircraftName;
	String	source;
	String	destination;
	public Aircraft(String aircraftName, String source, String destination) {
		super();
		this.aircraftName = aircraftName;
		this.source = source;
		this.destination = destination;
	}
	public String getAircraftName() {
		return aircraftName;
	}
	public void setAircraftName(String aircraftName) {
		this.aircraftName = aircraftName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public void displayDetails() {
		System.out.println("Aircraft Name : " + getAircraftName());
		System.out.println("Source : " + getSource());
		System.out.println("Destination : " + getDestination());
	}
}

