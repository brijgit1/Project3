package collectionPkg;

public class String1 {

	public static void main(String[] args) {
		//Below one object "Brij" will be created in String Pool
		String s1="Brij";
		String s2="Brij";
		System.out.println(s1.hashCode()+" "+s2.hashCode());
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1==s2); //true
		
		String s3=new String("Hello");
		String s4=new String("Hello");
		System.out.println(s3.equals(s4)); //
		System.out.println(s3==s4); //
		System.out.println(s3.hashCode()+" "+s4.hashCode());

	}

}
