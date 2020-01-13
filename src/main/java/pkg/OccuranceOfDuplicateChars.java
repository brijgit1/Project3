package pkg;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfDuplicateChars {

	public static void main(String[] args) {
		String str="Brij Bhan Singh".replaceAll(" ", "");
		char[] ca=str.toCharArray();
		Map<Character, Integer> map=new HashMap<>();
		for(int i=0; i<ca.length; i++){
			if(map.containsKey(ca[i])){
				map.put(str.charAt(i), map.get(i)+1);
			}else
				map.put(ca[i], 1);
		}
		System.out.println(map);

	}
	
		

}
