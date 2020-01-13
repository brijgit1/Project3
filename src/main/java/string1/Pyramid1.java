package string1;

public class Pyramid1 {

	public static void main(String[] args) {
		getPyramid("A");
	}
	
	public static void getPyramid(String str){
		System.out.println("     "+str);
		for(int i=1; i<=5; i++){
			str="A"+str+"A";
			System.out.println(str);
		}
	}

}
