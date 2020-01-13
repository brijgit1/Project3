package collectionPkg;

public class String2 {
/**
 * This program explains on Immutable and Mutable
 * @param args
 */
	public static void main(String[] args) {
		StringImmutable();
		//StringBuilderMutable();
		//StringBufferMutable();
	}
	
	public static void StringImmutable(){
		String s1=new String("Hello");
		String s2=s1.concat("I Am Brij");
		//s1 and s2 are two different objects, as there was a change in s1.append() 
		//hence a new object will be created
		System.out.println(s1.hashCode()+"  :NNNNN: "+s2.hashCode());
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		String s3="BBSINGH1";
		String s4="BBSINGH1";
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		System.out.println(s3.hashCode()==s4.hashCode());
		System.out.println("*********");
		String sb1=new String("ABCDEFBRIJ");
		String sb2=new String("ABCDEFBRIJ");
		System.out.println(sb1);
		System.out.println(sb2);

		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.hashCode()==sb2.hashCode());
	}
	
	/*public static void StringBuilderMutable(){
		StringBuilder strbld=new StringBuilder("HelloWorld");
		StringBuilder strbld1=strbld.append("I am Brij");
		//As StringBuilder is mutable class hence any change in object will not create new object
		//i.e. HashCode for both will remain same
		System.out.println(strbld.hashCode()+"  :NNN:  "+strbld1.hashCode());
		System.out.println(strbld.equals(strbld1));
		System.out.println(strbld==strbld1);
	}
	
	public static void StringBufferMutable(){
		StringBuffer strbfr=new StringBuffer("Hello");
		StringBuffer strbfr1=strbfr.append("BSingh");
		//As StringBuffer is mutable class hence any change in object will not create new object
		//i.e. HashCode for both will remain same
		System.out.println(strbfr.hashCode()+"   N "+strbfr1.hashCode());
		System.out.println(strbfr.equals(strbfr1));
		System.out.println(strbfr==strbfr1);
	}
*/
}
