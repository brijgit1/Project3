package utils;

import java.util.Scanner;

public class Utility {

	public static boolean numberOrNot(String inPut){
		try{
			Integer.parseInt(inPut);
		}catch(NumberFormatException e){
			return false;
		}
		return true;
	}

}
