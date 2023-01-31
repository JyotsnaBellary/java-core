import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException{
		
		//Fill your code here
		BufferedReader br = new BufferedReader(new FileReader("input.csv"));
		UserBO userbo = new UserBO();
		List<User> users = userbo.readFromFile(br);
		br.close();
		if(users.isEmpty()) {
			System.out.println("The list is empty");
		}else {
			userbo.display(users);
		}
	}
}
