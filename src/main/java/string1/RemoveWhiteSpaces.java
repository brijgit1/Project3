package string1;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		removeWhiteSpaces("I am Brij    Singh    from Pune");

	}
	
	public static void removeWhiteSpaces(String str){
		String s11=str.replaceAll("\\s+", " ");
		System.out.println(s11);
	}

}
