class CurrentAccount extends Account implements MaintainanceCharge 
{

	public CurrentAccount(String name, String accountNumber, double balance) {
		super(name, accountNumber, balance);
		// TODO Auto-generated constructor stub
	}
    //Fill your code here

	@Override
	public double computeMaintainanceCharge(int noOfYears) {
		// TODO Auto-generated method stub
		return noOfYears*100 + 200;
	}
}