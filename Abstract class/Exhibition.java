public class Exhibition extends Event {
 
    //Fill your code here
	int noOfStalls;
	double rentPerStall;
	
	

	public Exhibition(String name, String detail, String type, String organiser, int noOfStalls, double rentPerStall) {
		super(name, detail, type, organiser);
		this.noOfStalls = noOfStalls;
		this.rentPerStall = rentPerStall;
	}



	public int getNoOfStalls() {
		return noOfStalls;
	}



	public void setNoOfStalls(int noOfStalls) {
		this.noOfStalls = noOfStalls;
	}



	public double getRentPerStall() {
		return rentPerStall;
	}



	public void setRentPerStall(double rentPerStall) {
		this.rentPerStall = rentPerStall;
	}



	Double calculateAmount() {

        //Fill your code here

        return rentPerStall * noOfStalls;
    }
     	
}