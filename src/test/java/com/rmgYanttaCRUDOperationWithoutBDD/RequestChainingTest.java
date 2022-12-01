package com.rmgYanttaCRUDOperationWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class RequestChainingTest {
	
	@Test
	
	public void reqChaining()
	{
		Response rsps = when()
		.get("http://localhost:8084/projects");
		rsps.prettyPrint();
		String projectid=rsps.jsonPath().getString("[1].projectId");
		
		given()
		.pathParam("proId", projectid)
		.when()
		.delete("http://localhost:8084/projects/{proId)")
		.then()
		.log().all();
		
	}

}
