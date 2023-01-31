
public class StageEvent extends Event {
    
    //Fill your code here
	int noOfShows;
	double costPerShow;
	
	
    public StageEvent(String name, String detail, String type, String organiser, int noOfShows, double costPerShow) {
		super(name, detail, type, organiser);
		this.noOfShows = noOfShows;
		this.costPerShow = costPerShow;
	}

	public int getNoOfShows() {
		return noOfShows;
	}

	public void setNoOfShows(int noOfShows) {
		this.noOfShows = noOfShows;
	}

	public double getCostPerShow() {
		return costPerShow;
	}

	public void setCostPerShow(double costPerShow) {
		this.costPerShow = costPerShow;
	}

	Double calculateAmount() {

        //Fill your code here

        return noOfShows * costPerShow;

    }  
	
}