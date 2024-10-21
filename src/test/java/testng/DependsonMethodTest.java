package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsonMethodTest {
	@Test
	public void navigateToApp() throws InterruptedException  {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/login.php?type=login");
	System.out.println(2/0); // just to check second test case skipped or not if test1 is not executed properly
	Thread.sleep(3000);
	driver.quit();
	}
	
	@Test(dependsOnMethods="navigateToApp")
	public void loginToApp() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("email")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.id("last")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
