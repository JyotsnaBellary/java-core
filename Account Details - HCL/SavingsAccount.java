class SavingsAccount extends Account{

	Double	interestRate;
	public SavingsAccount(String holderName, Long accountNumber, String iFSCCode, Long contactNumber, Double interestRate) {
		super(holderName, accountNumber, iFSCCode, contactNumber);
		this.interestRate = interestRate;
		// TODO Auto-generated constructor stub
	}
	
	public Double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void display() {
		super.display();
//		System.out.println("Interest Rate : " + getInterestRate());
	}
	
	
	
	
}