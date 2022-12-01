package CRUDwithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class createProjectTest {
	
	@Test
	
	public void createProject()
	{
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "abc");
		jobj.put("projectName", "SDET_10_RestAssured_234567");
		jobj.put("status", "created");
		jobj.put("teamsize", 10);
		
		given()
		.contentType(ContentType.JSON)
		.body(jobj)
		.when()
		.post("http://localhost:8085/addProject")
		.then()
		.assertThat().statusCode(201)
		.and().assertThat().contentType(ContentType.JSON)
	     .log().all();
	

}
}