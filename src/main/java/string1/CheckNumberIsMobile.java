package string1;

import java.util.Scanner;

import utils.Utility;

public class CheckNumberIsMobile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		if(utils.Utility.numberOrNot(input)){
			System.out.println("Entered number is valid");
		}
		

	}

}
