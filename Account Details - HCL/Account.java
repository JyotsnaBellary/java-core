class Account{
	private String	holderName;
	private Long	accountNumber;
	private String	IFSCCode;
	private Long	contactNumber;
	
	public Account(String holderName, Long accountNumber, String iFSCCode, Long contactNumber) {
		super();
		this.holderName = holderName;
		this.accountNumber = accountNumber;
		IFSCCode = iFSCCode;
		this.contactNumber = contactNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getIFSCCode() {
		return IFSCCode;
	}

	public void setIFSCCode(String iFSCCode) {
		IFSCCode = iFSCCode;
	}

	public Long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public void display() {
		System.out.println("Your Contact Details");
		System.out.println("HolderName : " + getHolderName());
		System.out.println("Account Number : " + getAccountNumber());
		System.out.println("IFSCCode : " + getIFSCCode());
		System.out.println("ContactNumber : " + getContactNumber());
//		System.out.println();
		
	}
}