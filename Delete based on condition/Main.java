import java.util.*;
import java.io.*;

 

public class Main {

 

    public static void main(String[] args) throws Exception{
        //Your code here
        System.out.format("%-15s%-15s%-15s%-15s\n", "Name","Mobile","Username","Password");
        UserDAO userDAO = new UserDAO();
        List<User> userList = userDAO.getAllUser();
        for(User user : userList) {
            System.out.println(user.toString());
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the username to be deleted:");
        String username = bufferedReader.readLine();
        Boolean validator = userDAO.deleteUser(username);
        if(validator == true) {
            System.out.println("User deleted successfully");
        }
        else {
            System.out.println("User not found");
        }
        System.out.format("%-15s%-15s%-15s%-15s\n", "Name","Mobile","Username","Password");
        userList = userDAO.getAllUser();
        for(User user : userList) {
            System.out.println(user.toString());
        }
    }
}