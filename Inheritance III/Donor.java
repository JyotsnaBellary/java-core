import java.util.Date;

public class Donor extends Person{


   //fill your code
	String	donorType;
	String	bloodGroup;
	String	donationDate;
	
	public String getDonorType() {
		return donorType;
	}
	public void setDonorType(String donorType) {
		this.donorType = donorType;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getDonationDate() {
		return donationDate;
	}
	public void setDonationDate(String donationDate) {
		this.donationDate = donationDate;
	}
	public Donor(String name, Date dateOfBirth, String gender, String mobileNumber, String bloodBankName,
			String donorType, String bloodGroup, String donationDate) {
		super(name, dateOfBirth, gender, mobileNumber, bloodBankName);
		this.donorType = donorType;
		this.bloodGroup = bloodGroup;
		this.donationDate = donationDate;
	}
	
	public Donor() {
		super();
	}
	
	void displayDonorDetails() {
		
		System.out.println("Donor Type: " + getDonorType());
		System.out.println("Blood Group: " + getBloodGroup());
		System.out.println("Donation Date: " + getDonationDate());
	}
	

}

