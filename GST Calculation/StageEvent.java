import java.text.DecimalFormat;

class StageEvent extends Event{

    //Fill your code here
	static Integer	gst = 15;
	Integer	noOfSeats;

	
    public StageEvent(String name, String type, Double costPerDay, Integer noOfDays, Integer noOfSeats) {
		super(name, type, costPerDay, noOfDays);
		this.noOfSeats = noOfSeats;
	}

	public Integer getNoOfSeats() {
		return noOfSeats;
	}



	public void setNoOfSeats(Integer noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	private static final DecimalFormat df = new DecimalFormat("0.00");
	public Double totalCost() {
	       
	       return gst/100 * super.costPerDay * super.noOfDays + super.costPerDay * super.noOfDays;
	    }
	    
	    
	    public String toString() {
	       //Fill your code here
	    	String newLine = System.getProperty("line.separator");
			
			return "Event Details"
		            .concat(newLine)
		            .concat("Name:" + super.getName())
		            .concat(newLine)
		            .concat("Type:" + super.getType())
		            .concat(newLine)
		            .concat("Number of seats:" + getNoOfSeats())
		            .concat(newLine)
		            .concat("Total amount: " + df.format(totalCost()));
	    }
	}
