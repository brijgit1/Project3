package arrays1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicateInArrayListUsingLHS {

	public static void main(String[] args) {
		// Remove duplicate elements from an ArrayList using LinkedHashSet to mantain insertion order
		List<String> arl=new ArrayList<>();
		arl.add("Narendra");
		arl.add("Narendra");
		arl.add("Suresh");
		arl.add("Suresh");
		arl.add("Tukaram");
		arl.add("Tukaram");
		removeDuplicateElements(arl);

	}
	
	public static void removeDuplicateElements(List<String> arlist){
		LinkedHashSet<String> lhs=new LinkedHashSet<>(arlist);
		System.out.println(lhs);
		
		
	}

}
