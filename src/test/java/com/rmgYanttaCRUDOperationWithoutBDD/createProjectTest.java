package com.rmgYanttaCRUDOperationWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class createProjectTest {
	
	@Test
	
	public void createProject()
	{
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "sanj");
		jobj.put("projectName","SDET_10_RestAssured");
		jobj.put("status","created");
		jobj.put("teamsize",8);
		
		  RequestSpecification reqspec = RestAssured.given();
		  reqspec.contentType(ContentType.JSON);
		  reqspec.body(jobj);
		  
		  Response rsps = reqspec.post("http://localhost:8085/addProject");
		  rsps.then().assertThat().statusCode(201).log().all();
		  
		
}
}


