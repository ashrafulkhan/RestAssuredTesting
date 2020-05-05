package rest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class Get_01 {
	
	@Test
	public void getTest01() {
	Response response = RestAssured.get("https://reqres.in/api/users?page=2");
	System.out.println(response.getStatusCode());
	System.out.println(response.getHeader("content-type"));
	System.out.println(response.getBody().asString());
	System.out.println(response.getTime());
	System.out.println(response.statusLine());
	
	}

}
