package DifferentWaystoPost;

import org.testng.annotations.Test;

import com.rmgyantrapojoLibrary.POJO;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

public class PojoRequestTest {
	
	@Test
	
	public void pojoRequest()
	{
		POJO P=new POJO("swarna","SDET_10","created",8);
		
		given()
		.contentType(ContentType.JSON)
		.body(P)
		.post("http://localhost:8084/addProject")
		.then()
		
		.log().all();
		
	}

}
