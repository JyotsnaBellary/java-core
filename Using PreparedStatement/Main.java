import java.util.List;

public class Main {
	public static void main(String args[]) throws Exception {
		//write your code here
System.out.format("%-5s %-5s %-15s %-10s %s\n","Id","Name","Contact Detail","Username","Password");
		
		UserDAO userDAO = new UserDAO();
		List<User> List = userDAO.getAllUser();
		
		for(User user : List) {
			System.out.format("%-5s %-5s %-15s %-10s %s\n",user.getId(),user.getName(),user.getContactDetail(),user.getUsername(),user.getPassword());
		}
	}
}
