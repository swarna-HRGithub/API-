package CRUDwithBDD;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class UpdateProjectTest 
{
	public void updateProject()
	{
	JSONObject jobj=new JSONObject();
	jobj.put("createdBy", "sag");
	jobj.put("projectName","SDET_10_RestAssured");
	jobj.put("status","created");
	jobj.put("teamsize",8);
	
	 given()
	.contentType(ContentType.JSON)
	.body(jobj)
	.when()
	.put("http://localhost:8085/projects/TY_PROJ_1202")
	.then()
	.assertThat().statusCode(201)
	.and().assertThat().contentType(ContentType.JSON)
	.log().all();

}
}
