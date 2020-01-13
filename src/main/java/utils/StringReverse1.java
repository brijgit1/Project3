package utils;

public class StringReverse1 {

	public static void main(String[] args) {
		RevString("Brij Bhan Singh");
		RevString1("Brij Bhan Singh");


	}
	
	public static void RevString(String str){
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
		
	}
	
	public static void RevString1(String str){
		for(int i=(str.length()-1); i>=0; i--){
			System.out.print(str.charAt(i));
		}
		
	}

}
