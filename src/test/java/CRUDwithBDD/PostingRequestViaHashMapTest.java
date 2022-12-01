package CRUDwithBDD;

import java.util.HashMap;

import org.testng.annotations.Test;

import static  io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class PostingRequestViaHashMapTest 
{
	@Test
	
	public void postingrequest()
	{
		HashMap hp=new HashMap();
		hp.put("createdBy", "den");
		hp.put("projectName", "SDET_10_Rest");
		hp.put("status", "created");
		hp.put("teamsize", 6);
		
		RequestSpecification reqSpec=RestAssured.given();
		reqSpec.contentType(ContentType.JSON);
		reqSpec.body(hp);
		
	Response resp = reqSpec.post("http://localhost:8085/addProject");
		resp.then().assertThat().statusCode(201).log().all();
		
		
		
				
	}
}
