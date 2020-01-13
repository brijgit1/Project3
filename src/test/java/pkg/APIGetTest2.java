package pkg;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.module.jsv.JsonSchemaValidator.*;

public class APIGetTest2 {
	
	//@Test
	public void getAllPosts(){
		given().when().get("https://jsonplaceholder.typicode.com/posts").then().log().all();
		
	}
	
	@Test
	public void verifyID(){
		given().when().get("https://jsonplaceholder.typicode.com/posts").then().body("id", hasItems(100));
	}
	
	//@Test
	public void verifyTitle(){
		given().when().get("https://jsonplaceholder.typicode.com/posts").then().body("title", hasItems("qui est esse", "eum et est occaecati"));
	}
	
	//Json root can be verified using $
	//@Test
	public void verifyRoot(){
		//given().when().get("https://jsonplaceholder.typicode.com/posts").then().body("$", hasItems());
		given().when().get("https://jsonplaceholder.typicode.com/posts").then().root("").body("$", hasItems());

	}

}
