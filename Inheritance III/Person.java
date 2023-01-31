import java.text.SimpleDateFormat;
import java.util.Date;

public class Person{

        //    Fill your code
        String	name;
        Date	dateOfBirth;
        String	gender;
        String	mobileNumber;
        String	bloodBankName;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Date getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getMobileNumber() {
			return mobileNumber;
		}
		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}
		public String getBloodBankName() {
			return bloodBankName;
		}
		public void setBloodBankName(String bloodBankName) {
			this.bloodBankName = bloodBankName;
		}
		public Person(String name, Date dateOfBirth, String gender, String mobileNumber, String bloodBankName) {
			super();
			this.name = name;
			this.dateOfBirth = dateOfBirth;
			this.gender = gender;
			this.mobileNumber = mobileNumber;
			this.bloodBankName = bloodBankName;
		}
		public Person() {
			// TODO Auto-generated constructor stub
		}
		
//		SimpleDateFormat simpleFormat(Date d) {
			String pattern = "MM-dd-yyyy";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

//		}
		
		void displayDetails() {
			System.out.println("Name: " + getName());
			System.out.println("Date Of Birth: " + simpleDateFormat.format(getDateOfBirth()));
			System.out.println("Gender: " + getGender());
			System.out.println("Mobile Number: " + getMobileNumber());
			System.out.println("Blood BankName: " + getBloodBankName());
		}
    }


