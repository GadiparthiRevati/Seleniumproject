package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBusingPropertiesFile {
	public static void main(String[] args) throws IOException,InterruptedException {
		FileInputStream fis=new FileInputStream("./src/test/resources/commondata.properties");
		Properties property=new Properties();
		property.load(fis);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	driver.get(property.getProperty("url"));
	long time=Long.parseLong(property.getProperty("timeouts")); //converting string type to time
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	driver.findElement(By.id("email")).sendKeys(property.getProperty("username"));
	driver.findElement(By.id("pass")).sendKeys(property.getProperty("password"));
	driver.findElement(By.name("login")).click();
	}

}































