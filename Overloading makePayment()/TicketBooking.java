public class TicketBooking{

	//Fill your code
	String stageEvent;	
	String customer;
	int noOfSeats;
	
	public String getStageEvent() {
		return stageEvent;
	}
	public void setStageEvent(String stageEvent) {
		this.stageEvent = stageEvent;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public TicketBooking(String stageEvent, String customer, int noOfSeats) {
		super();
		this.stageEvent = stageEvent;
		this.customer = customer;
		this.noOfSeats = noOfSeats;
	}
	public TicketBooking() {
		
	}
	
	public void MakePayment(Double amount) {
		System.out.println("Stage event: " + getStageEvent());
		System.out.println("Customer: " + getCustomer());
		System.out.println("Number of seats:" + getNoOfSeats());
		System.out.println("Amount "+ amount +" paid in cash");
	}
	
	public void MakePayment(String walletNumber , Double amount) {
		System.out.println("Stage event: " + getStageEvent());
		System.out.println("Customer: " + getCustomer());
		System.out.println("Number of seats:" + getNoOfSeats());
		System.out.println("Amount "+ amount +" paid using wallet number " + walletNumber);
	}
	
	public void MakePayment(String creditCard,String ccv,String name,Double amount) {
		System.out.println("Stage event: " + getStageEvent());
		System.out.println("Customer: " + getCustomer());
		System.out.println("Number of seats:" + getNoOfSeats());
		System.out.println("Holder name: " + name);
		System.out.println("Amount "+ amount +" paid using Master card");
		System.out.println("CVV:" + ccv);
	
	}
	
}
