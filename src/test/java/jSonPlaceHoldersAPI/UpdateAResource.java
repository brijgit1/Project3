package jSonPlaceHoldersAPI;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import jSonPlaceHoldersAPIModel.JSonPlaceHoldersAPIBody;

public class UpdateAResource {
	
@BeforeClass
public void setUp(){
	RestAssured.baseURI="https://jsonplaceholder.typicode.com";
	//RestAssured.basePath="";
	
}

@Test(enabled=false)
public void addAPost(){
	given()
	.contentType(ContentType.JSON)
	.body("{"
    +"\"userId\": 1,"
    +"\"title\": \"BBS Title2\","
    +"\"body\": \"BBS Body2\""
+"}")
	.when()
	.post("/posts")
	.then()
	.statusCode(201);
	
}

//Below test is to create a new Resource
@Test
public void addAPost2(){
	JSonPlaceHoldersAPIBody jSonPlaceHoldersAPIBody=new JSonPlaceHoldersAPIBody();
	jSonPlaceHoldersAPIBody.setUserId(1);
	jSonPlaceHoldersAPIBody.setTitle("BBS Title4");
	jSonPlaceHoldersAPIBody.setBody("BBS Body4");
	
	//Now jSonPlaceHoldersAPIBody object contains whole body that need to be passed in POST call
	
	Response resp=given()
	.contentType(ContentType.JSON)
	.body(jSonPlaceHoldersAPIBody)
	.when()
	.post("/posts");
	System.out.println(resp.asString());
	
	
	
}


}
