package collectionPkg;

import java.util.HashMap;
import java.util.Map;
/*
 * HashMap is not ordered as well as not Synchronised
 * Keys can not have duplicate
 * Keys can have null values
 */
public class Map1 {

	public static void main(String[] args) {
		Map<Integer, String> students=new HashMap<Integer, String>();
		students.put(1, "Brij");
		students.put(2, "Suresh");
		students.put(3, "Gautam");
		students.put(4, "Amit");
		students.put(1, "BBS");
		students.put(2, null);
		students.put(5, null);
		System.out.println(students);

	}

}
