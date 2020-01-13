package string1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateChar1 {

	public static void main(String[] args) {
		duplicateChar("This is Brij Bhan SIngh");

	}
	
	public static void duplicateChar(String str){
		char[] ca=str.toCharArray();
		Map<Character, Integer> map=new HashMap<>();
		for(int i=0; i<ca.length; i++){
			if(map.containsKey(ca[i])){
				map.put(ca[i], map.get(ca[i])+1);
			}else
			{
				map.put(ca[i], 1);
			}
		}
		System.out.println(map);
		Set<Map.Entry<Character, Integer>> set=map.entrySet();
		for(Map.Entry<Character, Integer>i:set){
			if(i.getValue()>1){
				System.out.println(i.getKey()+"   ===  "+i.getValue());
			}
			/*if(i.getValue()==1){
				System.out.println(i.getKey()+"   ===  "+i.getValue());
				break;//put this if we want only first character that is present only once
			}*/

		}
		
		
	}

}
