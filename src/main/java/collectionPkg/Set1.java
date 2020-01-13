package collectionPkg;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*
 * Set Interface
 * Unordered
 */
public class Set1 {

	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		set.add("Brij");
		set.add("Mukesh");
		set.add("Mukesh"); //This element is already in set hence will nt be added again
		set.add("Brij"); //This element is already in set hence will nt be added again
		set.add("Sameer");
		set.add("Amit");
		set.add(null);
		set.add(null);
		set.add("BBSINGH");
		System.out.println(set);
		
		Iterator<String> it=set.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
	
			}

}
