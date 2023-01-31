package com.bosch.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.bosch.entity.Employee;
import com.bosch.dao.ConnectionUtil;

public class EmployeeDAOImpl implements EmployeeDAO{

	@Override
	public boolean addEmployee(Employee e) {
		// TODO Auto-generated method stub
		
		Connection connection = ConnectionUtil.getConnection ();
		PreparedStatement pmt = null;
		
		try {
			String query = "insert into employee calues(?,?,?,?,?)";
			PreparedStatement pmt = connection.prepareStatement(query);
			pmt.setInt(1, e.);
			pmt.setString(2, x);
			pmt.setInt(3, x);
			pmt.setString(4, x);
			pmt.setString(5, x);
			
			return pmt.executeUpdate()>0?true:false;
		}catch(SQLException e) {}
		return false;
	}

	@Override
	public List<Employee> getAllEmployessd() {
		// TODO Auto-generated method stub
		
		Statement stmt = null;
		Connection connection = null;
		List<Employee> list = new ArrayList<>();
		
		con = ConnectionUtil.getConnection
		return null;
	}

	@Override
	public boolean deleteEmployee(Employee e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee searchEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

}
