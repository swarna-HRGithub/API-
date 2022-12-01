package com.Authentication;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class BasicAuthTest {
	
	@Test
	
	public void basicAuth()
	{
		given()
		.auth().basic("rmgyantra","rmgy@9999")
		.when()
		.get("http://localhost:8084")
		.then()
		.log().all();
		
	}
	

}
