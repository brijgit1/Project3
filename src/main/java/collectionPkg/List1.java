package collectionPkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		List<Integer> list =new ArrayList<>();
		System.out.println(list);
		list.add(5);
		list.add(10);
		list.add(0, 15);
		list.add(null);
		list.add(30);
		list.add(null);
		list.add(35);
		System.out.println(list);
		
		//Collections.sort(list);
		System.out.println("Sorted List: "+list);
		
		/*Iterator<Integer> li=list.iterator();
		while(li.hasNext()){
			System.out.println(li.next());
		}
		*/
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		

	}

}
