package arrays1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestClass {

	public static void main(String[] args) throws IOException{
		//String str1=System.getProperty("user.home");
		//System.out.println(str1);
		String directory=System.getProperty("user.home");
		String fileName="test2.txt";
		String absPath=directory+File.separator+fileName;
		try (FileWriter fw=new FileWriter(absPath)){
			
			fw.write("This is content to be written");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
