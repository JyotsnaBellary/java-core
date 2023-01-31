class SavingsAccount extends Account implements MaintainanceCharge 
{

	
	public SavingsAccount(String name, String accountNumber, double balance) {
		super(name, accountNumber, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double computeMaintainanceCharge(int noOfYears) {
		// TODO Auto-generated method stub
		return 2*50*noOfYears + 50;
	}
    //Fill your code here
}