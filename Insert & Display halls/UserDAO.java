import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
	
	Connection connection;
	public UserDAO() {
		// TODO Auto-generated constructor stub
		try {
			connection = DBConnection.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public User getUser(String username) {
		User user = null;
		//write your code here
		
        try {
            PreparedStatement preparedStatement=connection.prepareStatement("select * from \"user\" where username=?");
            preparedStatement.setString(1, username);
            ResultSet resultSet=preparedStatement.executeQuery();
            if(resultSet.next()) {
                user=new User(resultSet.getLong(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       
		return user;
	}
}
