package autoSuggestions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Biryani {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("biryani");
		driver.findElement(By.xpath("//button[text()='Stay signed out']")).click();
		Thread.sleep(3000);
		
		int i=0;
		while(i<4)
		{
			driver.findElement(By.xpath("//div[@id='jZ2SBf']")).sendKeys(Keys.DOWN);
		}
		
				
	}

}
