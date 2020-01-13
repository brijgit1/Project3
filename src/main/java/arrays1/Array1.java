package arrays1;

import java.util.Arrays;
import java.util.List;

public class Array1 {

	public static void main(String[] args) {
		boolean markI=true;
		String[] name1={"Brij", "Bhan", "Singh"};
		String[] name2={"Brij", "Bhan", "Singh"};
		//System.out.println(Arrays.equals(name1, name2));
		List<String> arrayList1=Arrays.asList(name1);
		List<String> arrayList2=Arrays.asList(name2);
		
		//System.out.println(arrayList1.equals(arrayList2));
		
		if(arrayList1.size()==arrayList2.size()){
			for(int i=0; i<arrayList1.size(); i++){
				if(arrayList1.get(i)!=arrayList2.get(i)){
					markI=false;
				}
			}
		}else
		{
			markI=false;
		}
		if(markI){
			System.out.println("Arrays are equal!!!");
		}else
		{
			System.out.println("Arrays are not equal!!!");
		}
	}

}
