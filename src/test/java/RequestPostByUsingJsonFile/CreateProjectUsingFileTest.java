package RequestPostByUsingJsonFile;

import java.io.File;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

public class CreateProjectUsingFileTest 
{
	public void createProject()
	{
		File f=new File(".Data1.json");
		
		given()
		.contentType(ContentType.JSON)
		.body(f)
		.when()
		.post("http://localhost:8085/addproject")
		.then()
		.assertThat().contentType(ContentType.JSON)
		.log().all();
	}

}
