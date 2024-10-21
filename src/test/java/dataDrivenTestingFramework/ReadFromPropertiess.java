package dataDrivenTestingFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromPropertiess {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/cdata.properties"); // . indicates current working directory
		 Properties property=new Properties();
		 property.load(fis); // loading all key value pairs into properties file
		  String url= property.getProperty("url");
		  String time=property.getProperty("timeouts");
		  String browser=property.getProperty("browser");
		  System.out.println(url + "\n" + time + "\n" + browser);
		 
		
	}

}
