package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesPractice1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement signin=driver.findElement(By.className("accountUserName"));
		Actions actions=new Actions(driver);
		actions.moveToElement(signin).click();
		driver.switchTo().frame("loginIframe");
		driver.findElement(By.id("userName")).sendKeys("9542742470");
		driver.findElement(By.id("checkUser"));
		driver.switchTo().defaultContent();
		driver.findElement(By.name("keyword")).sendKeys("lipstick");
		driver.findElement(By.className("searchformButton")).click();
		
		
		
		
		
		
		
	}

}
