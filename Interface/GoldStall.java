public class GoldStall implements Stall{

	String stallName;
	Integer cost;
	String ownerName;
	Integer tvSet;
	
	
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


	public Integer getTvSet() {
		return tvSet;
	}


	public void setTvSet(Integer tvSet) {
		this.tvSet = tvSet;
	}


	public GoldStall(String stallName, Integer cost, String ownerName, Integer tvSet) {
		super();
		this.stallName = stallName;
		this.cost = cost;
		this.ownerName = ownerName;
		this.tvSet = tvSet;
	}


	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Stall Name: " + getStallName());
		System.out.println("Cost: " + getCost());
		System.out.println("Owner Name: " + getOwnerName());
		System.out.println("Number of TV sets: Rs." + getTvSet());
		
	}
	//fill your code here
}

