package com.rmgYanttaCRUDOperationWithoutBDD;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class putmethodTest {
	
	public void Project()
	{
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "sony");
		jobj.put("projectName","SDET_10_RestAssured");
		jobj.put("status","created");
		jobj.put("teamsize",6);
		
		  RequestSpecification reqspec = RestAssured.given();
		  reqspec.contentType(ContentType.JSON);
		  reqspec.body(jobj);
		  
		  Response rsps = reqspec.put("http://localhost:8085/projects/TY_PROJ_202");
		  rsps.then().assertThat().statusCode(201).log().all();
		  
		
}
}
	

