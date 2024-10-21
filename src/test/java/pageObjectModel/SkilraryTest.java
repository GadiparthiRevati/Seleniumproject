package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SkilraryTest {
	WebDriver driver;
	@BeforeClass
	public void seUp() {
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
		
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
