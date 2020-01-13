package arrays1;

public class SumOf2Elements {

	public static void main(String[] args) {
		int[] a={4, 5, 6, 10, 16, 15, 10};
		
		sumOfTwoElements(a, 20);

	}
	
	public static void sumOfTwoElements(int[] ar, int n){
		for(int i=0; i<ar.length; i++){
			for(int j=i+1; j<ar.length; j++){
				if(ar[i]+ar[j]==n){
					System.out.println(ar[i]+" + "+ar[j]+" = "+n);
				}
			}
			
		}
		
	}
	
	

}
