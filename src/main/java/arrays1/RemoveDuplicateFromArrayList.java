package arrays1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicateFromArrayList {

	public static void main(String[] args) {
		// Remove Duplicate Elements from an ArrayList, using HashSet
		//In this i.e. HashSet insertion order is not mantained
		ArrayList<String> als=new ArrayList<>();
		als.add("Ramesh");
		als.add("Ramesh");
		als.add("Mukesh");
		als.add("Mukesh");
		als.add("Brij");

		
		removeDuplicate1(als);

	}
	
	public static void removeDuplicate1(ArrayList arl){
		HashSet<String> hs=new HashSet<>(arl);
		System.out.println(hs);
		
		
	}

}
