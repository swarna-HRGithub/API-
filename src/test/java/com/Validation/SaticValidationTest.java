package com.Validation;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class SaticValidationTest {
	
	@Test
	
	public void validationTest()
	{
		String expdata="project2";
		
		Response rsps = when()
		.get("http://localhost:8084/projects");
		
	
		String actData = rsps.jsonPath().get("[1].projectName");
		Assert.assertEquals(actData, expdata);
	}


}
