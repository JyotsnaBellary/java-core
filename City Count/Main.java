import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws Exception {
		//write your code here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of users:");
		int N = sc.nextInt();
		sc.nextLine();
		ArrayList<User> userList = new ArrayList<>();
		for(int i=1;i<=N;i++)
		{
		System.out.println("Enter the details of user " + i);
			String[] str = sc.nextLine().split(",");
			User u = new User(str[0], str[1], str[2], str[3]);
			userList.add(u);
		}
		System.out.println("Enter the number of cities:");
		int C = sc.nextInt();
		ArrayList<CityCount> cityList = new ArrayList<>();
		for(int c = 1; c <= C; c++) {
		System.out.println("Enter the name of city "  + c);
			CityCount cCount = new CityCount(sc.next(), userList);
			cityList.add(cCount);
			cCount.start();
		}
		for(CityCount c: cityList){
			System.out.println(c.getCity() + "--" + c.getCount());
		}
		
	}
}
