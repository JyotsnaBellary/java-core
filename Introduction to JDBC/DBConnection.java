
import java.util.ResourceBundle;
import java.sql.*;
public class DBConnection {
	public static Connection getConnection() throws Exception {        
        ResourceBundle rb = ResourceBundle.getBundle("oracle");
        String url = rb.getString("db.url");
        String username = rb.getString("db.username");
        String password = rb.getString("db.password");
        //Fill your code here
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
        return connection;
        
    }
}
