
class Exhibition extends Event {
      
          //Your code here
	int noOfStalls;

	public int getNoOfStalls() {
		return noOfStalls;
	}

	public void setNoOfStalls(int noOfStalls) {
		this.noOfStalls = noOfStalls;
	}

	public Exhibition(String name, String detail, String ownerName, int noOfStalls) {
		super(name, detail, ownerName);
		this.noOfStalls = noOfStalls;
	}

	public Double projectedRevenue() {
		return (double) (noOfStalls * 100000);
	}
	
	
}