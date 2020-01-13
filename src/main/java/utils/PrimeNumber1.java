package utils;

import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String[] args) {
		verifyPrime();

	}
	
	public static void verifyPrime(){
		Scanner scanr=new Scanner(System.in);
		int i=scanr.nextInt();
		System.out.println("Entered value is: "+i);
		if(i==0||i==1){
			System.out.println("Not prime");
		}
		if(i==2||i==3){
			System.out.println("Entered number: "+i+" is Prime");
		}
		
		if(((i*i)-1)%24==0){
			System.out.println("Entered number: "+i+" is Prime");
		}else
		{
			System.out.println("Entered number: "+i+" is not Prime");
		}
		
		
		
		
		
	}

}
