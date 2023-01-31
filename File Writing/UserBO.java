import java.util.*;
import java.io.*;
public class UserBO {
    public static void writeFile(ArrayList<User> userList, BufferedWriter bw) throws Exception {
        //Fill your code here
    	for(User user: userList) {
    		bw.write(String.format("%s,%s,%s,%s\n", user.getName(), user.getMobileNumber(), user.getUsername(), user.getPassword()));
    	}
    }
}