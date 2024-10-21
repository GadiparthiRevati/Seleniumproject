package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToProperties {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/dataa.properties");
		Properties property=new Properties();
		property.load(fis);
		 
		property.put("user2", "user");
		property.put("password", "12345");
		FileOutputStream fos=new FileOutputStream("./src/test/resources/dataa.properties");
		property.store(fos, "updated successfully");
	}

}
