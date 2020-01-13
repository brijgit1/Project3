package pkg;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.module.jsv.JsonSchemaValidator.*;

public class APIGetTest {
	
	//Log().all() returns the response with headers detail and response of resources.
	@Test
	public void getStatusCheck(){
		given().when().get("http://ip.jsontest.com/").then().log().all();
	}
	
	//Verify Status Code
	@Test
	public void verifyStatusCode(){
		given().when().get("http://ip.jsontest.com/").then().assertThat().statusCode(200);
	}
	
	//Verify Header: Content Type
	@Test
	public void verifyContentType(){
		given().when().get("http://ip.jsontest.com/").then().header("Content-Type", "application/json");
	}
	
	//Verify Header: Server detail
	@Test
	public void verifyServer(){
		given().when().get("http://ip.jsontest.com/").then().header("Server", "Google Frontend");

	}
	
	//Verify Status Line
	@Test
	public void verifyStatusLine(){
		Response resp=given().when().get("http://ip.jsontest.com/");
		Assert.assertEquals(resp.getStatusLine(), "HTTP/1.1 200 OK");
	}
	
	//Verify Status Line
		@Test
		public void verifyStatusLine2(){
			given().when().get("http://ip.jsontest.com/").then().assertThat().statusLine("HTTP/1.1 200 OK");
		}


}
