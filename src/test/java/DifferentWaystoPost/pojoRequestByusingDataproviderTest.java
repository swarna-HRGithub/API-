package DifferentWaystoPost;

import org.testng.annotations.Test;

import com.rmgyantrapojoLibrary.POJO;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class pojoRequestByusingDataproviderTest {
	@Test(dataProvider="provideData")
	
	public void pojorequest(String createdBy,String projectName,String status,int teamSize)
	{
		POJO P=new POJO(createdBy,projectName,status,teamSize);
		
		given()
		.contentType(ContentType.JSON)
		.body(P)
		.when()
		.post("http://locahost:8084/addProject")
		.then()
		
		.log().all();
		
		

}
	public Object[][] provideData()
	{
	  Object[][] objArr=new Object[2][4];
	  objArr[0][0]="rty";
	  objArr[0][1]="SDET_10";
	  objArr[0][2]="created";
	  objArr[0][3]="4";
	  
	  objArr[0][0]="rty";
	  objArr[0][1]="SDET_19";
	  objArr[0][2]="created";
	  objArr[0][3]="4";
	  return objArr;
	  
	}
}
			  
			  
			  
			  
			  
			  
			  
			  

