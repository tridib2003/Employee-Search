/*
 * author: @tridib2003
 */

package com.tridib.app.dao;

import com.tridib.app.model.Employee;
import java.sql.*;

public class EmployeeDAO {
	
	// Database URL, username and password
	static final String url = "jdbc:mysql://localhost:3306/testjdbc";
	static final String unameDB = "root";
	static final String passDB = "passtridib123";
	
	public Employee getEmployeeData(int empid) {
		
		// Query to fetch employee data
		String query = "SELECT * FROM t_emp_details WHERE emp_id=";
		
		Employee emp = new Employee();
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, unameDB, passDB);
			
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery(query + empid);
			
			if (rs.next()) {
				
				emp.setEmp_id(rs.getInt("emp_id"));
				emp.setEmp_firstname(rs.getString("emp_firstname"));
				emp.setEmp_surname(rs.getString("emp_surname"));
				emp.setEmp_age(rs.getInt("emp_age"));
				emp.setEmp_address(rs.getString("emp_address"));
				emp.setContact_no(rs.getString("emp_contact_no"));
			}

			rs.close();
			st.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		return emp;
		
	}
	
}
