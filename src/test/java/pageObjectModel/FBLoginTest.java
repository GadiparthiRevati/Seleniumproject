package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FBLoginTest {
	WebDriver driver;

	@BeforeClass
	void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
				
	}
	
	@Test
	void testLogin()
	{
		FBLoginPage fb=new FBLoginPage(driver);
		fb.setEmail("revati");
		fb.setPwd("12345");
		fb.clickLogin();
	}
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
}
