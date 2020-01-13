package arrays1;

import java.util.Arrays;

public class SumOf2Elements2 {

	public static void main(String[] args) {
		int[] a={5, 5, 7, 10, 10, 8};
		Arrays.sort(a);
		SumOf2Elements2(a, 15);

	}
	
	public static void SumOf2Elements2(int[] ar, int n){
		int i=0;
		int j=ar.length-1;
		while(i<j){
			if(ar[i]+ar[j]==n){
				System.out.println(ar[i]+" + "+ar[j]+" = "+n);
				i++;
				j--;
			}else if(ar[i]+ar[j]<n){
				i++;
			}else if(ar[i]+ar[j]>n){
				j--;
			}
		}
	}

}
