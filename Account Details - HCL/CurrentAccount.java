
public class CurrentAccount extends Account {
	
	String organizationName;
	Long TIN;
	
	public CurrentAccount(String holderName, Long accountNumber, String iFSCCode, Long contactNumber, String organizationName, Long TIN) {
		super(holderName, accountNumber, iFSCCode, contactNumber);
		this.organizationName = organizationName;
		this.TIN = TIN;
		// TODO Auto-generated constructor stub
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public Long getTIN() {
		return TIN;
	}

	public void setTIN(Long tIN) {
		this.TIN = tIN;
	}
	
	public void display() {
		super.display();
		System.out.println("Organization Name : " + getOrganizationName());
		System.out.println("TIN : " + getTIN());
	}
	
	

	
		
	

}
