package pkg;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GooglePlacesAPI2 {
	
	/*
	 This test is to create a place first and delete the same place.
	 Step1: Create a place using POST
	 Step2: Get place_id from step1
	 Step3: Run Delete method using place_id. here we are using POST method and referring delete resource
	 */
	@Test
	public void verifyUdemyAPIForPOST(){
		//Below string will be used in Body when we hit POST to create place
		String bodyToPost="{"+
			    "\"location\":{"+
		        "\"lat\" : -38.383494,"+
		        "\"lng\" : 33.427362},"+
		    "\"accuracy\":50,"+
		    "\"name\":\"Frontline house\","+
		    "\"phone_number\":\"(+91) 983 893 3937\","+
		    "\"address\" : \"29, side layout, cohen 09\","+
		    "\"types\": [\"shoe park\",\"shop\"],"+
		    "\"website\" : \"http://google.com\","+
		    "\"language\" : \"French-IN\"}";
		RestAssured.baseURI="http://216.10.245.166/";
		//Step1
		//Hit POST with body content and get response in Response type, this will be kind of Raw type
		Response response=given().
		queryParam("key", "qaclick123").  //here param() can not be used as in POST
		body(bodyToPost).
		when().
		post("maps/api/place/add/json").then().assertThat().statusCode(200).extract().response();
		System.out.println("First: "+response.asString());
		//Convert raw type response into String Type
		String responseInString=response.asString();
		System.out.println("Second: "+responseInString);
		//Now to locate any resource/field we need to convert this String response into JSON form. To do this we will be using JsonPath class
		JsonPath responseInJson=new JsonPath(responseInString);
		//Step2:
		//Now get place_id from responseInJson
		String place_id=responseInJson.get("place_id");
		System.out.println(responseInJson.get("place_id").toString());
		
		//Step3: Perform Delete operation
		given().
		queryParam("key", "qaclick123").
		body("{"+
    "\"place_id\":\""+place_id+"\"}").
		when().
		post("maps/api/place/delete/json").
		then().
		assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
		body("status", equalTo("OK"));
	}


}
