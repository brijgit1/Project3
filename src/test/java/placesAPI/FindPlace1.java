package placesAPI;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class FindPlace1 {

@BeforeClass
public void setUp(){
	RestAssured.baseURI="https://maps.googleapis.com";
	RestAssured.basePath="/maps/api";
	
}

@Test(enabled=false)
public void FindPlaceTest(){
	Response resp=given()
	.param("input", "Xoriant%Pune")
	.param("inputtype", "textquery")
	.param("fields", "photos,formatted_address,name,rating,opening_hours,geometry")
	.param("key", "AIzaSyCy1gy_5lTjNdWqjn7M5G_vDFstTLavJrQ")
	.when()
	.get("/place/findplacefromtext/json");
	//System.out.println(resp.asString());
	
	//Response extract using path method of Response Object.

	String st1=resp.path("candidates[0].name");
	System.out.println(st1);
}


@Test(enabled=true)
public void FindPlaceTestDuplicate(){
	Response resp=given()
	.param("input", "Xoriant%Pune")
	.param("inputtype", "textquery")
	.param("fields", "photos,formatted_address,name,rating,opening_hours,geometry")
	.param("key", "AIzaSyCy1gy_5lTjNdWqjn7M5G_vDFstTLavJrQ")
	.when()
	.get("/place/findplacefromtext/json");
	//System.out.println(resp.asString());
	/*String st1=resp.path("candidates[0].name");
	System.out.println(st1);*/
	
	//Response extract using JsonPath
	JsonPath jp=new JsonPath(resp.asString());
	String name=jp.get("candidates[0].name");
	System.out.println(name);
}

//@Test(enabled=true)
public void FindPlaceTestXml(){
	Response resp=given()
	.param("input", "Xoriant%Pune")
	.param("inputtype", "textquery")
	.param("fields", "photos,formatted_address,name,rating,opening_hours,geometry")
	.param("key", "AIzaSyCy1gy_5lTjNdWqjn7M5G_vDFstTLavJrQ")
	.when()
	.get("/place/findplacefromtext/xml");
	//System.out.println(resp.asString());
	//String st1=resp.path("candidates[0].name");
	//System.out.println(st1);
	
	//Response extract using JsonPath
	String respInStr=resp.asString();
	//System.out.println(respInStr);
	XmlPath jp=new XmlPath(respInStr);
	String name=jp.get("candidates[0].name");
	System.out.println(name);
}



@Test(enabled=false)
public void FindPlaceBodyTest(){
	Response resp=given()
	.param("input", "Xoriant%Pune")
	.param("inputtype", "textquery")
	.param("fields", "photos,formatted_address,name,rating,opening_hours,geometry")
	.param("key", "AIzaSyCy1gy_5lTjNdWqjn7M5G_vDFstTLavJrQ")
	.when()
	.get("/place/findplacefromtext/json");
	System.out.println(resp.body().asString());
}

//@Test
public void FindPlaceBody2Test(){
	Response resp=given()
	.param("input", "Xoriant%Pune")
	.param("inputtype", "textquery")
	.param("fields", "photos,formatted_address,name,rating,opening_hours,geometry")
	.param("key", "AIzaSyCy1gy_5lTjNdWqjn7M5G_vDFstTLavJrQ")
	.when()
	.get("/place/findplacefromtext/json");
	System.out.println(resp.body().prettyPrint());
}

//@Test
public void FindPlaceAssertBodyTest(){
	given()
	.param("input", "Xoriant%Pune")
	.param("inputtype", "textquery")
	.param("fields", "photos,formatted_address,name,rating,opening_hours,geometry")
	.param("key", "AIzaSyCy1gy_5lTjNdWqjn7M5G_vDFstTLavJrQ")
	.when()
	.get("/place/findplacefromtext/json")
	.then()
	.body("candidates[0].name", equalTo("Xoriant Solutions Pvt. Ltd."))
	.and()
	.contentType(ContentType.JSON);
}

//@Test
public void FindPlaceAssertBodyRatingsTest(){
	given()
	.param("input", "Xoriant%Pune")
	.param("inputtype", "textquery")
	.param("fields", "photos,formatted_address,name,rating,opening_hours,geometry")
	.param("key", "AIzaSyCy1gy_5lTjNdWqjn7M5G_vDFstTLavJrQ")
	.when()
	.get("/place/findplacefromtext/json")
	.then()
	.body("candidates[0].rating", equalTo(4.2))
	.contentType(ContentType.JSON);
}




	
	
	
	
	
	
	

}
