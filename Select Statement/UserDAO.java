import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

	public List<User> getAllUsers(){
		List<User> userList = new ArrayList<User>();
		//your code goes here...
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("select * from /'user/'");
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				User user = new User(resultSet.getLong(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5));
				userList.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userList;
	}
}

