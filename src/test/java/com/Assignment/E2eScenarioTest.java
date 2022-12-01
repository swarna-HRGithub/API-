package com.Assignment;

import com.Genericlibrary.BaseAPIClass;
import com.Genericlibrary.EndPoints;
import com.Genericlibrary.Javautility;
import com.rmgyantrapojoLibrary.POJO;
import static io.restassured.RestAssured.*;

	import java.sql.ResultSet;
	import java.sql.SQLException;
	import org.testng.annotations.Test;

import io.restassured.http.ContentType;
	import io.restassured.response.Response;
	public class E2eScenarioTest extends BaseAPIClass {

		@Test
		public void endToEnd() throws SQLException
		{
		//create project
		POJO P=new POJO("swa","res_33"+Javautility.generaterandomNum(),"created",6);
			
			baseURI="http://localhost";
			port=8084;
			
			Response rsps=given()
					.contentType(ContentType.JSON)
					.body(P)
					.when()
					.post(EndPoints.addproject);
			         rsps.prettyPrint();
			          String projectid=rsps.jsonPath().get("projectId");
			//Update
			POJO p1=new POJO("swa","res_14","created",8);
			given()
		    .contentType(ContentType.JSON)
		    .body(p1)
			.pathParam("projectId", projectid)
			 .when()
			.put(EndPoints.CompleteUpdate);
			//Get
			Response rsps1= given()
			.pathParam("projectId", projectid)
			.when()
			.get(EndPoints.UpdateProject);
			
			String projectname=rsps1.jsonPath().getString("projectName");
			System.out.println(projectname);
					
			//verify in DB Layer
			ResultSet result = dUtil.executingQuery("select * from project");
			while(result.next())
			{
				if(projectname.equals(result.getString(4)))
				{
					
						System.out.println(projectname+" is avilable");
						break;
								
		}
			}
		}
	}

		
	





