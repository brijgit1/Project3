package arrays1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class IntersactionOfLists {

	public static void main(String[] args) {
		// Find common elements from two List
		List<String> l1=Arrays.asList("Brij", "Bhan", "Singh", "Pidaura");
		List<String> l2=Arrays.asList("Brij", "Bhan", "Singh", "Pidaura1");

		getCommonElements(l1, l2);

	}
	
	public static void getCommonElements(List<String> ll1, List<String> ll2){
		HashSet<String> hs=new HashSet<>();
		for(int i=0; i<ll1.size(); i++){
			for(int j=0; j<ll2.size(); j++){
				if(ll1.get(i)==ll2.get(j)){
					hs.add(ll1.get(i));
				}
			}
			
		}
		System.out.println(hs);
		
	}

}
