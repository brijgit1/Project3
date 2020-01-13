package pkg;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class GooglePlacesAPI3InXML {
	
	/*
	 This test is to create a place first and delete the same place.
	 Step1: Create a place using POST for XML body
	 URL: http://216.10.245.166/maps/api/place/add/xml?key= qaclick123
	 */
	@Test
	public void verifyUdemyAPIForPOSTInXML() throws IOException{
		//Below string will be used in Body when we hit POST to create place
		
		RestAssured.baseURI="http://216.10.245.166/";
		//Step1
		//Hit POST with body content and get response in Response type, this will be kind of Raw type
		Response response=given().
		queryParam("key", "qaclick123").  //here param() can not be used as in POST
		body(convertXMLintoString("./src/main/resources/resources/postPayloadInXML.xml")).
		when().
		post("/maps/api/place/add/xml").then().assertThat().statusCode(200).and().
		contentType(ContentType.XML).
		extract().response();
		//Convert raw type response into String Type
		String responseInString=response.asString();
		System.out.println("Response in String Format: "+responseInString);
		
		//Convert Response String format into XML
		XmlPath responseInXML=new XmlPath(responseInString);
		System.out.println("Response In XML: "+responseInXML);
		Assert.assertTrue(responseInXML.get("response.status").equals("OK"));
			}
	//below is a method to convert xml contents into a String, this is a generic and reusable method is been written.
	public String convertXMLintoString(String path) throws IOException{
		return new String(Files.readAllBytes(Paths.get(path)));
	}


}
