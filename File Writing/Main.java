import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws IOException {
		//write your code here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of users:");
		int n = sc.nextInt();
		ArrayList<User> users = new ArrayList<>();
		for(int i= 1; i<=n; i++) {
			System.out.println("Enter the details of user :" + i);
			String[] str = sc.nextLine().split(",");
			User u = new User(str[0], str[1], str[2], str[3]);
			users.add(u);
		}
		BufferedWriter bw = new BufferedWriter(new FileWriter("output.csv"));
		UserBO userBO = new UserBO();
		try {
			userBO.writeFile(users, bw);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bw.close();
	}
}
