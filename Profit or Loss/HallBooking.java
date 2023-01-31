public class HallBooking {
	//Your code here
	String hallName;
	Double cost;
	Integer hallCapacity;
	Integer seatsBooked;
	public String getHallName() {
		return hallName;
	}
	public void setHallName(String hallName) {
		this.hallName = hallName;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public Integer getHallCapacity() {
		return hallCapacity;
	}
	public void setHallCapacity(Integer hallCapacity) {
		this.hallCapacity = hallCapacity;
	}
	public Integer getSeatsBooked() {
		return seatsBooked;
	}
	public void setSeatsBooked(Integer seatsBooked) {
		this.seatsBooked = seatsBooked;
	}
	public HallBooking(String hallName, Double cost, Integer hallCapacity, Integer seatsBooked) {
		super();
		this.hallName = hallName;
		this.cost = cost;
		this.hallCapacity = hallCapacity;
		this.seatsBooked = seatsBooked;
	}
	
	
	
}
