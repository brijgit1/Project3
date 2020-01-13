package collectionPkg;

public class StaticKey {
	String s1;
	
	public StaticKey(){
		s1="BBS";
		System.out.println(s1);
	}
	static{
		String name="Brij Bhan Singh";
		System.out.println("This is from Static"+name);
	}

	public static void main(String[] args) {
		StaticKey list=new StaticKey();

	}

}
