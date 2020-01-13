package libraryAPI;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.testng.annotations.Test;

import base.TestBase;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class AddBookAPI extends TestBase {

	public AddBookAPI() throws IOException {
		super(); //This will call constructor of TestBase class so propB will be initialised
	}
	
//@Test	
public void addBookAPIGeneral(){
	RestAssured.baseURI=propB.getProperty("libraryHOST");
	//Step1: convert response of Add Book into String
	String respInStr=given().header("ContentType", "application/json").
	body("{"+
"\"name\":\"API Testing Study1\","+
"\"isbn\":\"BBS3\","+
"\"aisle\":\"1233\","+
"\"author\":\"BBS\"}").
	when().
	post("/Library/Addbook.php").then().extract().response().asString();
	System.out.println("Response of Book Add API in String: "+respInStr);
	//Step2: Now convert response from String into Json
	JsonPath jsp1=new JsonPath(respInStr);
	String bookIDCreated=jsp1.get("ID");
	System.out.println("ID of newly Book created: "+bookIDCreated);
}

//This is similar to addBookAPIGeneral test but with payload has been used from Payloads class.
//variables for ISBN and AISLE have been used so that in next test we can update this test for Data Driven
@Test	
public void addBookAPIGeneral1(){
	RestAssured.baseURI=propB.getProperty("libraryHOST");
	//Step1: convert response of Add Book into String
	String respInStr=given().header("ContentType", "application/json").
	body("{"+
			"\"name\":\"API Testing Study1\","+
			"\"isbn\":\"BBS5\","+
			"\"aisle\":\"13\","+
			"\"author\":\"BBS\"}").
	when().
	post("/Library/Addbook.php").then().extract().response().asString();
	System.out.println("Response of Book Add API in String: "+respInStr);
	//Step2: Now convert response from String into Json
	JsonPath jsp1=new JsonPath(respInStr);
	String bookIDCreated=jsp1.get("ID");
	System.out.println("ID of newly Book created: "+bookIDCreated);
}


	

}
