class StageEvent extends Event {
        
      
          //your code here
	int noOfShows;
	int noOfSeatsPerShow;
	
	public int getNoOfShows() {
		return noOfShows;
	}
	public void setNoOfShows(int noOfShows) {
		this.noOfShows = noOfShows;
	}
	public int getNoOfSeatsPerShow() {
		return noOfSeatsPerShow;
	}
	public void setNoOfSeatsPerShow(int noOfSeatsPerShow) {
		this.noOfSeatsPerShow = noOfSeatsPerShow;
	}
	public StageEvent(String name, String detail, String ownerName, int noOfShows, int noOfSeatsPerShow) {
		super(name, detail, ownerName);
		this.noOfShows = noOfShows;
		this.noOfSeatsPerShow = noOfSeatsPerShow;
	}
	
	public Double projectedRevenue() {
		return (double) (noOfSeatsPerShow * 50 * noOfShows);
	}
	
	
}