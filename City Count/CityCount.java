import java.util.List;

public class CityCount extends Thread{
	//write your code here
	String city;
	Integer count = 0;
	List<User> userList;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public List<User> getUserList() {
		return userList;
	}
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	public CityCount(String city, List<User> userList) {
		super();
		this.city = city;
		this.userList = userList;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(User u:userList) {
			if(u.getCity().equals(this.getCity())) {
				this.count += 1;
			}
		}
	}
	
	
}
