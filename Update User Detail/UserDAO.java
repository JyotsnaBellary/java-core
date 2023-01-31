import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
public class UserDAO {
    public void updateUser(User user){
        //your code goes here...
        try {
            Connection connection = DBConnection.getConnection();
            String updateQuery = "UPDATE \"user\" SET contact_detail='" + user.getContactDetail() + "' WHERE username='" + user.getUsername() + "'";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(updateQuery);

        }
        catch(SQLException e) {
            e.printStackTrace();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public User findUserByUsername(String username){
        User user = null;
        //your code goes here...
        try {
            Connection connection = DBConnection.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM \"user\" u WHERE username='" + username +"'");
             if(resultSet.next()) {
                 Long id = resultSet.getLong(1);
                 String name = resultSet.getString(2);
                 String contactDetail = resultSet.getString(3);
                 String userName = resultSet.getString(4);
                 String password = resultSet.getString(5);
                 user = new User(id, name, contactDetail,userName, password);
             }
        }
        catch(SQLException e) {
            e.printStackTrace();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return user;
    }

    public List<User> getAllUsers(){
        List<User> userList =new ArrayList<>();
        //your code goes here...
        try {
            Connection connection = DBConnection.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM \"user\"");
             while(resultSet.next()) {
                 Long id = resultSet.getLong(1);
                 String name = resultSet.getString(2);
                 String contactDetail = resultSet.getString(3);
                 String username = resultSet.getString(4);
                 String password = resultSet.getString(5);
                 userList.add(new User(id, name, contactDetail, username, password));
//                 System.out.format("%-5s %-15s %-10s %s\n", id, name, deposit, costPerDay);
             }
        }
        catch(SQLException e) {
            e.printStackTrace();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return userList;
    }
}