package com.rmgYanttaCRUDOperationWithoutBDD;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateProjectTest {
	
	public void updateProject()
	{
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "sam");
		jobj.put("projectName","SDET_10_RestAssured");
		jobj.put("status","created");
		jobj.put("teamsize",8);
		
		  RequestSpecification reqspec = RestAssured.given();
		  reqspec.contentType(ContentType.JSON);
		  reqspec.body(jobj);
		  
		  Response rsps = reqspec.post("http://localhost:8085/addProject");
		  rsps.then().assertThat().statusCode(200).log().all();
		  
		
}

	}


