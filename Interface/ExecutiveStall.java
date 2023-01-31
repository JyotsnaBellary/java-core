public class ExecutiveStall implements Stall{

	String stallName;
	Integer cost;
	String ownerName;
	Integer screen;
	
	
	
	public String getStallName() {
		return stallName;
	}



	public void setStallName(String stallName) {
		this.stallName = stallName;
	}



	public Integer getCost() {
		return cost;
	}



	public void setCost(Integer cost) {
		this.cost = cost;
	}



	public String getOwnerName() {
		return ownerName;
	}



	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}



	public Integer getScreen() {
		return screen;
	}



	public void setScreen(Integer screen) {
		this.screen = screen;
	}


	

	public ExecutiveStall(String stallName, Integer cost, String ownerName, Integer screen) {
		super();
		this.stallName = stallName;
		this.cost = cost;
		this.ownerName = ownerName;
		this.screen = screen;
	}



	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Stall Name: " + getStallName());
		System.out.println("Cost: " + getCost());
		System.out.println("Owner Name: " + getOwnerName());
		System.out.println("Number of Screens: " + getScreen());
		
	}
	//fill your code here
}
