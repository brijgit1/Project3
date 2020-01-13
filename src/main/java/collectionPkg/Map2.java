package collectionPkg;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map2 {

	public static void main(String[] args) {
		Map<Integer, String> map=new Hashtable<>();
		map.put(10, "Pune");
		map.put(11, "Agra");
		map.put(20, "Kasganj");
		map.put(15, "Sahabar");
		map.put(12, "Etah");
		System.out.println(map.toString());
		Set<Entry<Integer, String>> itr=map.entrySet();
		for(Map.Entry<Integer,String> i:itr){
			System.out.println(i.getKey()+" "+i.getValue());
		}

	}

}
