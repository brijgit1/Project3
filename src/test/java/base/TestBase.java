package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
	public Properties propB=new Properties();
	
	public TestBase() throws IOException{
		FileInputStream fis=new FileInputStream("./src/main/resources/resources/config.properties");
		propB.load(fis);
	}

}
