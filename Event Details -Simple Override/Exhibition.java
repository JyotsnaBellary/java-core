class Exhibition extends Event{
    
	int	stallCount;
     //Your code here

	public int getStallCount() {
		return stallCount;
	}

	public void setStallCount(int stallCount) {
		this.stallCount = stallCount;
	}

	public Exhibition(String name, String detail, String organizer, int stallCount) {
		super(name, detail, organizer);
		this.stallCount = stallCount;
	}

	public void totalCredit() {
		System.out.println("Credit Details");
		System.out.println("Total Credit Gained is " + stallCount * 50); 
	}
	
	public String toString() {
		String newLine = System.getProperty("line.separator");
		
		return "Event Name : " + getName()
	            .concat(newLine)
	            .concat("Event Detail : " + getDetail())
	            .concat(newLine)
	            .concat("Event Organizer : " + getOrganizer())
	            .concat(newLine)
	            .concat("Stall Count: " + getStallCount());
	}

}