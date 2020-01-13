package pkg;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;

import static io.restassured.module.jsv.JsonSchemaValidator.*;
// Google Places API KKEY=AIzaSyCy1gy_5lTjNdWqjn7M5G_vDFstTLavJrQ
public class APIPostTest1 {
	
	//@Test
	public void getAllTopics(){
		given().when().get("http://localhost:8083/alltopics/").then().log().all();
		
	}
	
	@Test
	public void addTopic(){
		/*given().contentType("application/json").
		accept("application/json").
		body("{\"topicID\": \"Bio1\",\"topicName\": \"Bio1 Topic\", \"topicDesc\": \"Bio Desc\"}").
		when().
		post("localhost:8083/addtpc").then().log().all();*/
		
		//RestAssured.baseURI="localhost:8083/addtpc";
		RequestSpecification req=RestAssured.given();
		JSONObject requestParams = new JSONObject();
		requestParams.put("topicID", "Bio1");
		requestParams.put("topicName", "Bio1 Name");
		requestParams.put("topicDesc", "Bio1 Topic Desc");
		//System.out.println(requestParams);
		req.header("Content-Type", "application/json");
		req.body(requestParams.toString());
		req.post("localhost:8083/addtpc").then().statusCode(200);
	}
	
	
}
