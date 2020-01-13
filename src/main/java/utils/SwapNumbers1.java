package utils;

public class SwapNumbers1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swapNumbers(10, 12);

	}
	
	public static void swapNumbers(int i, int j){
		i=i+j;
		j=i-j;
		i=i-j;
		System.out.println("Value of i: "+i+" Value of j: "+j);
	}

}
