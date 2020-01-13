package arrays1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class IntersactionOfLists2 {

	public static void main(String[] args) {
		// getting common elements from two List using retainAll method
		Integer[] a1={10, 20, 30, 40};
		Integer[] a2={10, 20, 30, 60};
		getCommonElements(a1, a2);

	}
	
	public static void getCommonElements(Integer[] a, Integer[] b){
		HashSet<Integer> hs1=new HashSet<>(Arrays.asList(a));
		HashSet<Integer> hs2=new HashSet<>(Arrays.asList(b));
		hs1.retainAll(hs2);
		System.out.println(hs1);
		System.out.println(hs2);
		
	}

}
