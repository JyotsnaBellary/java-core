public class Event {
	//Your code here
	String name;
	HallBooking hallBooking;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HallBooking getHallBooking() {
		return hallBooking;
	}
	public void setHallBooking(HallBooking hallBooking) {
		this.hallBooking = hallBooking;
	}
	public Event(String name, HallBooking hallBooking) {
		super();
		this.name = name;
		this.hallBooking = hallBooking;
	}
	
	
	
}
