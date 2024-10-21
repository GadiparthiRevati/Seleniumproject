package dataDrivenTestingFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToProperties {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/cdata.properties"); // . indicates current working directory
		 Properties property=new Properties();
		 property.load(fis); 
		 property.put("browser2","edge");
		 FileOutputStream fos=new FileOutputStream("./src/test/resources/cdata.properties");
		 property.store(fos, "updated successfully");		
	}

}