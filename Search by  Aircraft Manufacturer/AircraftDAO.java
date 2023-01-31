
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class AircraftDAO {
	
	Connection connection;
	public AircraftDAO() {
		// TODO Auto-generated constructor stub
		try {
			connection = DBConnection.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
    public ArrayList<String> listModels(String name) throws ClassNotFoundException, SQLException{
    	List<String> modelList =new ArrayList<>();
		//your code goes here...
		try {
			PreparedStatement preparedStatement1 = connection.prepareStatement("select * from aircraft_manufacturer where name=?");
			preparedStatement1.setString(1, name);
			ResultSet resultSet1 = preparedStatement1.executeQuery();
			if (resultSet1.next()) {
				int id = resultSet1.getInt(1);
				PreparedStatement preparedStatement = connection.prepareStatement("select model from aircraft where aircraft_manufacturer_id=?");
				preparedStatement.setInt(1, id);
				ResultSet resultSet = preparedStatement.executeQuery();
				while(resultSet.next()) {
					
					modelList.add(resultSet.getString(1));
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (ArrayList<String>) modelList;
        
        //fill your code
    }
}
