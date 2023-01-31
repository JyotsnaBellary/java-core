package com.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
            
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
               System.out.println(connection);
            Statement statement = connection.createStatement();
       int result = statement.executeUpdate("delete account where accno = 3 ");
       System.out.println("Account Records removed is " + result);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}

}
