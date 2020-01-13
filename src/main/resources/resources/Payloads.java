package resources;

public class Payloads {
	
	public static String addBookPayload(String isbn, String aisl){
		String addBookBodyPayload="{"+
				"\"name\":\"API Testing Study1\","+
				"\"isbn\":\""+isbn+"\","+
				"\"aisle\":\""+aisl+"\","+
				"\"author\":\"BBS\"}";
		return addBookBodyPayload;
	}
	
	public static String deleteBookPayload(String id){
		String deleteBookBodyPayload="{"+
"\"ID\" : \""+id+"\"}";
		return deleteBookBodyPayload;
	}

}
