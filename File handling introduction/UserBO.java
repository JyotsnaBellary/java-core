import java.io.*;
import java.util.*;

public class UserBO{
    List<User> list=new ArrayList<User>();
    
    public List<User>readFromFile(BufferedReader br) throws IOException
    {
        //Fill your code here
    	String line;
    	while ((line = br.readLine()) != null) {
  	      String[] parts = line.split(",");
  	      User u = new User(parts[0], parts[1], parts[2], parts[3]);
  	      list.add(u);
    	}
        return list;
    }
    public void display(List<User> list)
    {
        //Fill your code here
    	System.out.printf("%-15s %-20s %-15s %s\n", "Name", "Email", "Username", "Password");
    	for(User u: list) {
    	System.out.printf("%-15s %-20s %-15s %s\n", u.getName(), u.getEmail(), u.getUsername(), u.getPassword());
    	}
    }
}