import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class HallDAO {
	
	Connection connection;
	public HallDAO() {
		// TODO Auto-generated constructor stub
		try {
			connection = DBConnection.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void saveHall(Hall hall) {
		//write your code here
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("insert into hall values(hall_seq.nextval,?,?,?,?)");
			preparedStatement.setString(1, hall.getName());
			preparedStatement.setString(2, hall.getContactNumber());
			preparedStatement.setDouble(3, hall.getCostPerDay());
			preparedStatement.setLong(4, hall.getOwner().getId());
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
	
	public List<Hall> getAllHall() {
		List<Hall> hallList = new ArrayList<Hall>();
        //write your code here
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("select * from hall");
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				PreparedStatement preparedStatement1 = connection.prepareStatement("select * from \"user\" where id = ?");
				// System.out.println(resultSet.getInt(5));
				preparedStatement1.setInt(1, resultSet.getInt(5));
				ResultSet resultSet1 = preparedStatement1.executeQuery();
				while(resultSet1.next()){
				// System.out.println(resultSet1.getInt(1)+ resultSet1.getString(2)+ resultSet1.getString(3)+ resultSet1.getString(4)+ resultSet1.getString(5));}
				User u = new User(resultSet1.getLong(1), resultSet1.getString(2), resultSet1.getString(3), resultSet1.getString(4), resultSet1.getString(5));
				Hall hall = new Hall(resultSet.getString(2), resultSet.getString(3), resultSet.getDouble(4), u);
				hallList.add(hall);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return hallList;
	}
}
