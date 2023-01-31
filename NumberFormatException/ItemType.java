public class ItemType {
    
    private String name;
	private Double deposit;
	private Double costPerDay;

	public ItemType(String name, Double deposit, Double costPerDay) {
		this.name = name;
		this.deposit = deposit;
		this.costPerDay = costPerDay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(Double costPerDay) {
		this.costPerDay = costPerDay;
	}

	public Double getDeposit() {
		return deposit;
	}

	public void setDeposit(Double deposit) {
		this.deposit = deposit;
	}
	
	public String toString() {
		String newLine = System.getProperty("line.separator");
				
				return "" + super.toString()
			            .concat(newLine)
			            .concat("The details of the item type are:")
			            .concat(newLine)
			            .concat("Name:" + getName())
			            .concat(newLine)
			            .concat("Deposit:" + getDeposit())
			            .concat(newLine)
			            .concat("Cost Per Day:" + getCostPerDay());
				}

	
}