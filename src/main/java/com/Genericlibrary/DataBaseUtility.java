package com.Genericlibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtility {
  
	public Connection con;
	public void createConnWithDb() throws SQLException
	{
		Driver driverRef =new Driver();
		DriverManager.registerDriver(driverRef);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root", "root");
	}
	public void closeConnWithDB() throws SQLException
	{
	   con.close();
		
	}
	public ResultSet executingQuery(String query) throws SQLException
	{
		Statement stmt=con.createStatement();
		ResultSet result = stmt.executeQuery(query);
		return result;
		
	}
}
