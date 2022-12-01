package CRUDwithBDD;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class GettingProjectTest 
{
	@Test
	
	public void gettingProject()
	{
		given()
		.when()
		.get("http://localhost:8084/projects")
		.then()
		.assertThat().statusCode(200)
		.log().all();
		
	}

}
