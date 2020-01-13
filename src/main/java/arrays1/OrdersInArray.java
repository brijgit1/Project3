package arrays1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdersInArray {

	public static void main(String[] args) {
		int[] arr={10, 20, 30, 0, 6, 9, 11};
		ordersInAnArray(arr);

	}
	
	public static void ordersInAnArray(int[] a){
		List<int[]> listArr=Arrays.asList(a);
		System.out.println(listArr.toString());
		
		
		
		
	}

}
