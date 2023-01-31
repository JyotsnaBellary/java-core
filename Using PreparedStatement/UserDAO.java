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
	
    public List<User> getAllUser() {
        List<User> userList = new ArrayList<User>();
        //fill your code here
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
    
    public void insertDetails(User user) {
        //fill your code here
    	try {
			PreparedStatement preparedStatement = connection.prepareStatement("insert into \"user\" values(\"user_seq\".nextval,?,?,?,?)");
			preparedStatement.setString(1, user.getName());
			preparedStatement.setString(2, user.getContactDetail());
			preparedStatement.setString(3, user.getUsername());
			preparedStatement.setString(4, user.getPassword());
			int res = preparedStatement.executeUpdate();
			
			if(res>0)
            {
                connection.commit();
            }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
