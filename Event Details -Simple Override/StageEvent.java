class StageEvent extends Event{
       //Fill your code here
	int totalShow;
	int seatsPerShow;
	public int getTotalShow() {
		return totalShow;
	}
	public void setTotalShow(int totalShow) {
		this.totalShow = totalShow;
	}
	public int getSeatsPerShow() {
		return seatsPerShow;
	}
	public void setSeatsPerShow(int seatsPerShow) {
		this.seatsPerShow = seatsPerShow;
	}
	public StageEvent(String name, String detail, String organizer, int totalShow, int seatsPerShow) {
		super(name, detail, organizer);
		this.totalShow = totalShow;
		this.seatsPerShow = seatsPerShow;
	}
	
	public void totalCredit() {
		System.out.println("Credit Details");
		System.out.println("Total Credit Gained is " + (totalShow * seatsPerShow )* 100); 
		
	}
	
	public String toString() {
		String newLine = System.getProperty("line.separator");
		
		return "Event Name : " + getName()
	            .concat(newLine)
	            .concat("Event Detail : " + getDetail())
	            .concat(newLine)
	            .concat("Event Organizer : " + getOrganizer())
	            .concat(newLine)
	            .concat("Total Events : " + getTotalShow())
				.concat(newLine)
		        .concat("Total Seats : " + getSeatsPerShow());
	}
}
