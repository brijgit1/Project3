package string1;

public class ReverseStr2 {

	public static void main(String[] args) {
		ReverseStr1("I am Brij Bhan Singh from Pune");
		ReverseStr2("This is Brij");

	}
	
	public static void ReverseStr1(String str){
		StringBuffer strbfr=new StringBuffer(str);
		System.out.println(strbfr.reverse());
		
	}
	
	public static void ReverseStr2(String str){
		StringBuilder strbldr=new StringBuilder(str);
		System.out.println(strbldr.reverse());
		
	}

}
