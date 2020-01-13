package placesAPI;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class NearByPlaceSearch {

@BeforeClass
public void setUp(){
	RestAssured.baseURI="https://maps.googleapis.com";
	RestAssured.basePath="/maps/api";
	
}

@Test
public void FindNearByPlaceTest(){
	given()
	.param("location", "-33.8670522,151.1957362")
	.param("radius", 1500)
	.param("type", "restaurant")
	.param("keyword", "cruise")
	.param("key", "AIzaSyCy1gy_5lTjNdWqjn7M5G_vDFstTLavJrQ")
	.when()
	.get("/place/nearbysearch/json")
	.then()
	.log().all();
}
	
	
	
	
	
	
	

}
