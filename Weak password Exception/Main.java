import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)throws IOException {
		//Your code here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user details");
		String[] str = sc.nextLine().split(",");
		User u = new User(str[0], str[1], str[2], str[3]);
		UserBO userBO = new UserBO();
		try {
			userBO.validate(u);
			u.toString();
		} catch (WeakPasswordException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
