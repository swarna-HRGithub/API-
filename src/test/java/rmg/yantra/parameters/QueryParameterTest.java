package rmg.yantra.parameters;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class QueryParameterTest {
	
	@Test
	
	public void queryParameter()
	{
		given()
		.pathParam("username","swarna-HRGithub")
		.queryParam("sort", "created")
		.when()
		.get("http://api.github.com/user/{username}/repos")
		.then()
		.log().all();
		
		
	}

}
