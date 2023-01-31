package com.basics;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrieveData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
               System.out.println(connection);
            Statement statement = connection.createStatement();
       ResultSet result = statement.executeQuery("select * from account");
       while(result.next()) {
    	   System.out.println(result.getInt(1));
    	   System.out.println(result.getString(2));
    	   System.out.println(result.getString(3));
    	   System.out.println(result.getInt(4));
        } 
		}catch (SQLException e) {
            // TODO Auto-generated catch block
		            e.printStackTrace();
		        }
			}
	}

