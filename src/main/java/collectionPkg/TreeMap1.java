package collectionPkg;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getMap1();
		getMap2();

	}

	public static void getMap1() {
		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(10, "Brij");
		map1.put(11, "Sarita");
		map1.put(9, "Riji");
		map1.put(8, "Deleena");
		System.out.println("Unsorter Map: " + map1);

		TreeMap tMap = new TreeMap(map1);
		System.out.println("Sorted Tree map: " + tMap);

	}

	public static void getMap2() {
		HashMap<Integer, String> map2 = new HashMap<>();
		map2.put(10, "Brij");
		map2.put(11, "Sarita");
		map2.put(9, "Riji");
		map2.put(8, "Deleena");
		System.out.println("Unsorter Map: " + map2);

		TreeMap tMap = new TreeMap(map2);
		System.out.println("Sorted Tree map: " + tMap);

	}

}
