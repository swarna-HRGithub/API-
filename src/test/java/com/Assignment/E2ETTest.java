package com.Assignment;
import static io.restassured.RestAssured.given;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import okhttp3.Connection;

public class E2ETTest {
	@Test
	
	public void CreatedPro()
	{
		JSONObject jobj=new JSONObject();
		jobj.put("crearedBy", " ert");
		jobj.put("projectName", " ty");
		jobj.put("crearedBy", " Created");
		jobj.put("crearedBy", 5);
		
	 given()
		.contentType(ContentType.JSON)
		.body(jobj)
		.when()
		.post("http://locahost:8084/addproject");	
		
	}
	@Test
	public void UpdatePro()
	{
		JSONObject jobj1=new JSONObject();
		jobj1.put("crearedBy", " dfg");
		jobj1.put("projectName", " fgh23");
		jobj1.put("crearedBy", " ongoing");
		jobj1.put("crearedBy", 4);
		
	 given()
		.contentType(ContentType.JSON)
		.body(jobj1)
		.when()
		.post("http://locahost:8084/addproject")
		.then().assertThat().statusCode(201).log().all();
	}
	public void gettingPro()
	{
		given()
		.get("http://localhost:8084/projects/TY_PROJ_603")
		.then()
		.assertThat().statusCode(200)
		.log().all();
	}
	public void specificProject()
	{
		.when()
		.get("http://localhost:8084/projects/TY_PROJ_603")
		.jsonPath().get("ProjectName");
	}
	@Test
	
	public void JDBC() throws SQLException{
		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
		System.out.println("connection is done");
		 Statement stat=con.createStatement();
		ResultSet result=state.executeQuery("select * from project");
		System.out.println(resultGetString(1));
		
	}
	@Test
	
	public void ValidationTest()
	{
	  String expData="fgh23";
	  Response resp=when()
			  .get("http://localhost:8084/projects");
	          String actData=resp.jsonPath().getString("projectName");
	          Assert.assertEquals(false, false);
	
	
	
	
	
	
		
	
		
		
	
	
	

}
