public class User{
	String userId;
	String name;
	Long phoneNumber;
	String password;
	public User() {
		super();
	}
		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(String userId, String name, Long phoneNumber, String password) {
		super();
		this.userId = userId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.password = password;
	}
	
}
