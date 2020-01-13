package jSonPlaceHoldersAPI;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import jSonPlaceHoldersAPIModel.JSonPlaceHoldersAPIBody;

public class UpdateAResourcePUT {
	int id=1;
	
@BeforeClass
public void setUp(){
	RestAssured.baseURI="https://jsonplaceholder.typicode.com";
	//RestAssured.basePath="";
	
	
}
//Below test is to update an existing resource
@Test
public void updateAnExistingResource(int id){
	JSonPlaceHoldersAPIBody jSonPlaceHoldersAPIBody=new JSonPlaceHoldersAPIBody();
	jSonPlaceHoldersAPIBody.setUserId(1);
	jSonPlaceHoldersAPIBody.setTitle("BBS Title4");
	jSonPlaceHoldersAPIBody.setBody("BBS Body4");
	jSonPlaceHoldersAPIBody.setId(id);
	
	//Now jSonPlaceHoldersAPIBody object contains whole body that need to be passed in POST call
	
	Response resp=given()
	.contentType(ContentType.JSON)
	.body(jSonPlaceHoldersAPIBody)
	.when()
	.put("/posts/id");
	System.out.println(resp.asString());
	
	
	
}


}
