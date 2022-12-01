package com.Authentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class OATH2Test {
	
	@Test
	
	public void oAuth()
	{
		Response rsps=given()
		.formParam("client_id", "SDET_42")
		.formParam("client_secret","25117f67e43cdf98a991907c47208d8c" )
		.formParam("grant_type", "client_credentials")
		.formParam("redirect_uri", "https://example.com")
		.when()
		.post("http://coop.apps.symfonycasts.com/token");
		
		String token=rsps.jsonPath().get("access_token");
		System.out.println(token);
		
		given()
		.auth().oauth2(token)
		.pathParam("USER_ID","4061")
		.when()
	   .post("http://coop.apps.symfonycasts.com/api/{USER_ID}/chickens-feed")
	   .then()
	    .log().all();
		
	}
	

}
