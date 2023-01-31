package com.basics;

import java.sql.*;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
               System.out.println(connection);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}

}
