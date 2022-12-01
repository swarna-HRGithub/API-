package com.Validation;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class DynamicValidationTest {

@Test
public void dynamicTest()
{
	String expData="SDET_10";
	Response rsps=when()
	.get("http://localhost:8084/projects");
	
	List<String> actData = rsps.jsonPath().get("projectName");
	for(int i=0;i<actData.size();i++)
	{
		String actualData = actData.get(i);
		if(expData.equals(actualData))
		{
			System.out.println(expData+" is available");
		}
		break;
	}
}
	
	
}
