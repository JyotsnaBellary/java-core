import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
public class ItemTypeDAO {
	Connection connection;
	public ItemTypeDAO() {
		// TODO Auto-generated constructor stub
		try {
			connection = DBConnection.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<ItemType> getAllItemTypes() {
		List<ItemType> itemTypeList = new ArrayList<>();
		//your code goes here...
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("select * from item_type");
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				ItemType itemType = new ItemType(resultSet.getLong(1), resultSet.getString(2), resultSet.getDouble(3), resultSet.getDouble(4));
				itemTypeList.add(itemType);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return itemTypeList;
	}
}
