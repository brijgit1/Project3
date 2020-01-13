package utils;

public class Fibonnaci1 {

	public static void main(String[] args) {
		int i=0;
		int j=1;
		int k;
		System.out.print(i+" "+j+" ");
		for(int l=0; l<=10; l++){
			k=i+j;
			i=j;
			j=k;
			System.out.print(k+" ");

		}

	}

}
