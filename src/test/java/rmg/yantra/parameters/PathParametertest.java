package rmg.yantra.parameters;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class PathParametertest {
	
	@Test
	
	public void pathParameter()
	{
		given()
		.pathParam("ProId","TY_PROJ_202")
		.when()
		.get("http://localhost:8084/projects/{ProId}")
		.then()
		.log().all();
		
	}

	

}
