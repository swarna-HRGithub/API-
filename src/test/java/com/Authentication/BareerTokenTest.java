package com.Authentication;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class BareerTokenTest {
	@Test
	
	public void bareerToken()
	{
		given()
		.auth().oauth2("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")
		.when()
		.get("https://api.github.com/user/repos")
		.then()
		.log().all();
	}

}
