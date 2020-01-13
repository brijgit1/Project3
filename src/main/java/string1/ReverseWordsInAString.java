package string1;

public class ReverseWordsInAString {

	public static void main(String[] args) {
		reverseWordsInString("This is Brij Bhan Singh");

	}
	
	public static void reverseWordsInString(String str){
		String[] words=str.split(" ");
		for(int i=0; i<words.length; i++){
			StringBuffer strbfr=new StringBuffer(words[i]);
			System.out.print(strbfr.reverse()+" ");
			
		}
	}

}
