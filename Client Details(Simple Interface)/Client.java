public class Client implements Display{
	//Fill your code
	Integer clientId;
	String firstName;	
	String middleName;	
	String lastName;	
	String phoneNumber;	
	String email;	
	String passport;	
	String iataCountryCode;
	public Integer getClientId() {
		return clientId;
	}
	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
		this.passport = passport;
	}
	public String getIataCountryCode() {
		return iataCountryCode;
	}
	public void setIataCountryCode(String iataCountryCode) {
		this.iataCountryCode = iataCountryCode;
	}
	public Client(Integer clientId, String firstName, String middleName, String lastName, String phoneNumber,
			String email, String passport, String iataCountryCode) {
		super();
		this.clientId = clientId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.passport = passport;
		this.iataCountryCode = iataCountryCode;
	}
	@Override
	public void displayClientDetails() {
		// TODO Auto-generated method stub
		
		System.out.println("Client Details");
		System.out.println("Client Id : " + this.getClientId());
		System.out.println("First Name : " + this.getFirstName());
		System.out.println("Middle Name : " + this.getMiddleName());
		System.out.println("Last Name : " + this.getLastName());
		System.out.println("Phone Number : " + this.getPhoneNumber());
		System.out.println("Email : " + this.getEmail());
		System.out.println("Passport : " + this.getPassport());
		System.out.println("IATA Country Code : " + this.getIataCountryCode());
		
		
	}
	
	
}
