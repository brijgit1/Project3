package string1;

public class ReverseStringUsingRecursion {

	public static void main(String[] args) {
		String str11="This is Brij";
		String rev11=revStrByRecurson(str11);
		System.out.println(rev11);
	}
	
	public static String revStrByRecurson(String str){
		if(str.isEmpty()){
			return str;
		}
		return revStrByRecurson(str.substring(1))+str.charAt(0);
	}

}
