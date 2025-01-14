package annotations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass1 {
	WebDriver driver;
	@BeforeSuite
	public void suiteConfig() {
		System.out.println("suite execution started");
	}
	@BeforeTest
	public void testCinfig() {
		System.out.println("test execution started");
	}
	@BeforeClass
	public void classconfig() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@BeforeMethod
	public void methodConfig() {
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.findElement(By.name("email")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.id("last")).click();
		
	}
	@AfterMethod
	public void methodUnSet() {
		driver.findElement(By.xpath("//span[text()='SkillRary Admin']")).click();
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();
		
		}
	
	@AfterClass
	public void classUnset() {
		driver.quit();
	}
	@AfterTest
	public void testUnset() {
		System.out.println("test execution ended");
	}
	@AfterSuite
	public void suiteUnset() {
		System.out.println("suite execution ended");
	}
	
		
	

}
