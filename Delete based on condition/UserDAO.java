import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
public class UserDAO {
    public List<User> getAllUser() {
        List<User> userList =new ArrayList<>();
        //write your code here
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
//                 System.out.format("%-15s%-15s%-15s%-15s\n", id, name, deposit, costPerDay);
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

    public Boolean deleteUser(String username) {
        //write your code here
        try {
            Connection connection = DBConnection.getConnection();
            String deleteQuery = "DELETE \"user\" WHERE username='"+ username + "'";
            Statement statement = connection.createStatement();
            int result = statement.executeUpdate(deleteQuery);
            if(result == 1) {
                return true;
            }

        }
        catch(SQLException e) {
            e.printStackTrace();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return false;
    }
}