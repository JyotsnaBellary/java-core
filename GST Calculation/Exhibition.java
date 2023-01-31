import java.text.DecimalFormat;

class Exhibition extends Event {
	
    //Fill your code here
	static Integer	gst = 5;
	Integer	noOfStalls;
	
	
   
    public Exhibition(String name, String type, Double costPerDay, Integer noOfDays, Integer noOfStalls) {
		super(name, type, costPerDay, noOfDays);
		this.noOfStalls = noOfStalls;
	}


	public Integer getNoOfStalls() {
		return noOfStalls;
	}


	public void setNoOfStalls(Integer noOfStalls) {
		this.noOfStalls = noOfStalls;
	}


	public Double totalCost() {
       
       return gst/100 * super.costPerDay * super.noOfDays + super.costPerDay * super.noOfDays;
    }
    
	private static final DecimalFormat df = new DecimalFormat("0.00");
    public String toString() {
       //Fill your code here
    	String newLine = System.getProperty("line.separator");
		
		return "Event Details"
	            .concat(newLine)
	            .concat("Name:" + super.getName())
	            .concat(newLine)
	            .concat("Type:" + super.getType())
	            .concat(newLine)
	            .concat("Number of stalls:" + getNoOfStalls())
	            .concat(newLine)
	            .concat("Total amount: " + df.format(totalCost()));
    }
}