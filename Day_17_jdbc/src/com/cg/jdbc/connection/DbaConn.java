package com.cg.jdbc.connection;

import java.sql.*;
import java.util.Iterator;

import com.mysql.cj.jdbc.Driver;

public class DbaConn {

	public static void main(String[] args) {
		String dbDriver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/CG1";
		String usr = "root";
		String pwd = "pass1221";
		String query = "select * from Employee12";
		try 
		{
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection cnn = DriverManager.getConnection(url,usr,pwd);
			Statement st = cnn.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) 
			{
				String EmployeeData= "";
				for (int i = 1; i <=3; i++) {
					EmployeeData = EmployeeData+" "+rs.getString(i);
				}
				System.out.println(EmployeeData);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
