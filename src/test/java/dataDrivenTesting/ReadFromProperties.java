package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromProperties {
	public static void main(String[] args) throws IOException {
		//step1: Convert physical file into java readable object
		FileInputStream fis=new FileInputStream("./src/test/resources/data.properties");
		//step2: create properties class instance 
		Properties property=new Properties();
		//step3: Load all key-value pairs to properties instance from fis
		property.load(fis);
		//step4: fetch data
		String browser = property.getProperty("browser");
		System.out.println(browser);
		System.out.println(property.getProperty("url"));
		System.out.println(property.getProperty("username"));
	}

}
