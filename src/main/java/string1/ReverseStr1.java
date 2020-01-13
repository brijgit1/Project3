package string1;

public class ReverseStr1 {
	static String strNew="";

	public static void main(String[] args) {
		stringRev("I am Brij Bhan Singh");

	}
	
	public static void stringRev(String str){
		for(int i=(str.length()-1); i>=0; i--){
			strNew=strNew+str.charAt(i);
		}
		System.out.println(strNew);
	}

}
