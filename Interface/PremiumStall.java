public class PremiumStall implements Stall{

	String stallName;
	Integer cost;
	String ownerName;
	Integer projector;
	
	
	
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



	public Integer getProjector() {
		return projector;
	}



	public void setProjector(Integer projector) {
		this.projector = projector;
	}



	public PremiumStall(String stallName, Integer cost, String ownerName, Integer projector) {
		super();
		this.stallName = stallName;
		this.cost = cost;
		this.ownerName = ownerName;
		this.projector = projector;
	}



	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Stall Name: " + getStallName());
		System.out.println("Cost: " + getCost());
		System.out.println("Owner Name: " + getOwnerName());
		System.out.println("Number of Projectors: " + getProjector());
		
	}
	//fill your code here
}
