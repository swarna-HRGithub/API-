package com.Genericlibrary;

import java.sql.SQLException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseAPIClass {
	
	public DataBaseUtility dUtil=new DataBaseUtility();
	@BeforeSuite
	
	public void createConn() throws SQLException
	{
		dUtil.createConnWithDb();
	}
	@AfterSuite
	public void closeConn() throws SQLException
	{
		dUtil.closeConnWithDB();
	}

}
