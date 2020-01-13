package placesAPI;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetPlaceDetail {

@BeforeClass
public void setUp(){
	RestAssured.baseURI="https://maps.googleapis.com";
	RestAssured.basePath="/maps/api";
}

@Test
public void getPlaceDetailTest(){
	given()
	.param("placeid", "ChIJi6C1MxquEmsR9-c-3O48ykI")
	.param("key", "AIzaSyB9qQjFNlehW5ZXG4ebIHY1F2dGQUSaFOk")
	.when()
	.get("/place/detail/json")
	.then()
	.statusCode(200);
}
	
	
	
	
	
	
	

}
