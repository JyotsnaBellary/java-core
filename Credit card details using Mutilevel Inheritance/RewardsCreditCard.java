
public class RewardsCreditCard extends CreditCard {
	private Double creditPoints;

	public Double getCreditPoints() {
		return creditPoints;
	}

	public void setCreditPoints(Double creditPoints) {
		this.creditPoints = creditPoints;
	}
	
	public Double calculateAmount(Double amount,Integer numberOfPersons) {
		//fill your code here
		double total  = amount * numberOfPersons;
		Double discount = .05 * this.getCreditPoints() * numberOfPersons;
		return total - discount;
	}
}
