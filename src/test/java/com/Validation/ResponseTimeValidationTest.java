package com.Validation;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;



public class ResponseTimeValidationTest {
	
	@Test
	
	public void responsevaltest()
	{
		when()
		.get("http://localhost:8084/projects")
		.then()
		.assertThat().time(Matchers.lessThan(7000L), TimeUnit.MILLISECONDS)
		.assertThat().body("[2].projectName",Matchers.equalTo("project3"))
		.log().all();
				
		
	}

}
