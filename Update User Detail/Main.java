import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        //Your code here
        System.out.format("%-5s %-5s %-15s %-10s %s\n","Id","Name","Contact Detail","Username","Password");
        UserDAO userDAO = new UserDAO();
        List<User> userList = userDAO.getAllUsers();
        for(User user : userList) {
            System.out.format("%-5s %-5s %-15s %-10s %s\n", user.getId(), user.getName(), user.getContactDetail(), user.getUsername(), user.getPassword());
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the username:");
        String username = bufferedReader.readLine();
        User user = userDAO.findUserByUsername(username);
        if(user != null) {
            System.out.format("%-5s %-5s %-15s %-10s %s\n","Id","Name","Contact Detail","Username","Password");
            System.out.format("%-5s %-5s %-15s %-10s %s\n", user.getId(), user.getName(), user.getContactDetail(), user.getUsername(), user.getPassword());
            System.out.println("Enter the mobile number to be updated:");
            String mobileNumber = bufferedReader.readLine();
            user.setContactDetail(mobileNumber);
            userDAO.updateUser(user);
            System.out.format("%-5s %-5s %-15s %-10s %s\n","Id","Name","Contact Detail","Username","Password");
            System.out.format("%-5s %-5s %-15s %-10s %s\n", user.getId(), user.getName(), user.getContactDetail(), user.getUsername(), user.getPassword());

        }
        else {
            System.out.println("No such user is present");
        }
    }
}