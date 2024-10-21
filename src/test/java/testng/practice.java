package testng;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class practice {
	WebDriver driver;
	@BeforeClass
	public void setUp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		
	}
	@Test
	public void loginTest() {
		skilraryPage srp=new skilraryPage(driver);
		srp.setEmail("admin");
		srp.setPwd("admin");
		srp.login();
		String title=driver.getTitle();
		Assert.assertEquals(title,"SkillRary Ecommerce");
		
	}
	@Test(dependsOnMethods="loginTest")
	public void alertPopUp()
	{
		Alert a=driver.switchTo().alert();
	
		a.accept();
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
