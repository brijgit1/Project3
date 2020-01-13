package string1;

public class StringImmutablity1 {

	public static void main(String[] args) {
		//string1();
		//String2();
		//String3();
		String str=String4("ABCABCABCABCabc", 'C');
		System.out.println(str);
	}
	
	public static void string1(){
		String s1="BRIJbrij";
		String s2="BRIJbrij";
		System.out.println(s1.hashCode()+"    "+s2.hashCode());
	}
	
	public static void String2(){
		String a1=new String("BRIJbrij1");
		String a2=new String("BRIJbrij1");
		System.out.println(a1.hashCode()+"   "+a2.hashCode());
		
	}
	
	public static void String3(){
		String b1="ABCabcef";
		String b2=b1.toUpperCase();
		System.out.println(b2+"   "+b1);
	}
	
	public static String String4(String str, char c){
		if(str==null)
			return str;
		return str.replaceAll(Character.toString(c), "");
	}

}
