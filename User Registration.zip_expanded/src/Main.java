import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

public class Main {
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
		//FILL YOUR CODE
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of users");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 1; i <=n; i++) {
			System.out.println("Enter name of user " + i);
			String name = sc.next();
			System.out.println(name);
			System.out.println("Enter phone number of user 1");
			long num = sc.nextLong();
			System.out.println(num);
			System.out.println("Enter user id of user " + i);
			String id = sc.next();
			System.out.println(id);
			System.out.println("Enter password of user " + i);
			String password = sc.next();
			System.out.println(password);
			User u = new User(id, name, num, password);
			UserDAO userDAO = new UserDAO();
			userDAO.insert(u);
		}
		
	}
}

