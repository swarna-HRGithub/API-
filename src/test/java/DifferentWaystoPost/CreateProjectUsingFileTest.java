package DifferentWaystoPost;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;


public class CreateProjectUsingFileTest {
	
	@Test
	
	public void createProjectTest()
	{
		File f=new File("./Data.json");
		
		given()
		.contentType(ContentType.JSON)
		.body(f)
		.when()
		.post("http://localhost:8085/addproject")
		.then()
		.log().all();
		
	}

}
