package com.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
               System.out.println(connection);
            Statement statement = connection.createStatement();
//            statement.executeUpdate("insert into account values(3, 'ciaz', 'cz', 9500)");
            statement.executeUpdate("update accno");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


	}

}
