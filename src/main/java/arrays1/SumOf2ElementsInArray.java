package arrays1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SumOf2ElementsInArray {

	public static void main(String[] args) {
		// Find pair of elements in an array whose SUM=10;
		int[] ar={5, 5, 4, 6, 0, 10};
		getElementPair(ar);
		getElementPair(ar, 10);
			String homeDir=System.getProperty("user.home");
			System.out.println(homeDir);
	}
	
	public static void getElementPair(int[] a){
		for(int i=0; i<(a.length-1); i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i]+a[j]==10){
					System.out.println(a[i]+" + "+a[j]+" = "+"10");
				}
				
			}
		}
		
	}
	
	public static void getElementPair(int[] a1, int n){
		Arrays.sort(a1);
		int i=0;
		int j=a1.length-1;
		while(i<j){
			
			if(a1[i]+a1[j]==n){
				System.out.println(a1[i]+" "+a1[j]);
				i++;
			}else
			
			if(a1[i]+a1[j]>n){
				j=j--;
			}else
			if(a1[i]+a1[j]<n){
				i++;
			}
			
		}
		
		
		
	}

}
