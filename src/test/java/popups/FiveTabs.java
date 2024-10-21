package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class FiveTabs {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("revathigadiparthii@gmail.com");
	//	driver.findElement(By.xpath("//div[@id='passContainer']")).sendKeys("Dhanvi@4454");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("toys");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		driver.quit();
		
	}

}
