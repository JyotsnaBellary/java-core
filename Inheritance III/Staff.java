import java.util.Date;

public class Staff extends Person {
    // fill your code
	Integer	employeeID;
	String	designation;
	public Integer getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Staff(String name, Date dateOfBirth, String gender, String mobileNumber, String bloodBankName,
			Integer employeeID, String designation) {
		super(name, dateOfBirth, gender, mobileNumber, bloodBankName);
		this.employeeID = employeeID;
		this.designation = designation;
	}
	
	void displayStaffdetails() {
		System.out.println("Employee ID: " + getEmployeeID());
		System.out.println("Designation: " + getDesignation());
		
	}
	
	
}
