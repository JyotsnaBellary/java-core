package com.basics;

import java.sql.*;

public class FirstPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
//               System.out.println(connection);
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert into account values(3, 'ciaz', 'cz', 9500)");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}

}
