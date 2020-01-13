package resources;

import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class ResuableMethods {
	
	//This methods taked RAW response and return proper XML Format
	public static XmlPath responseInrawToXml(Response resp){
		String responseInString=resp.asString();
		//Convert Response String format into XML
		XmlPath responseInXML=new XmlPath(responseInString);
		return responseInXML;
	}
	
	public static JsonPath responseInrawToJson(Response resp){
		String responseInString=resp.asString();
		JsonPath responseInJson=new JsonPath(responseInString);
		return responseInJson;
	}

}
