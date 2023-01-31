
public class CountryCard extends TravelCreditcard {
	public Double calculateAmount(Double amount,Integer numberOfPersons) {
		//fill your code here
		double total  = amount * numberOfPersons;
		return total - getExchangePercentage()*total;
	}
}
