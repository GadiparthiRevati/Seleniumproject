package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       WebElement men=driver.findElement(By.xpath(""));
       WebElement shirts=driver.findElement(By.xpath(""));
       Actions act=new Actions(driver);
       act.moveToElement(men).build().perform();
       Thread.sleep(3000);
       act.moveToElement(shirts).click().build().perform();
       
		
	}

}
