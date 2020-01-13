package utils;

public class Factorial1 {

	public static void main(String[] args) {
		getFactorial(5);

	}
	
	public static void getFactorial(int i){
		if(i>=0 && i<=2){
			System.out.println("Factorial is: "+i);
		}else
			if(i>3){
				for(int j=i; j>=1; j--){
					int fact=i*(i-1);
					getFactorial(i-2);
					System.out.println(fact);

				}
			}
		
	}

}
