package emoappsButton;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Submit {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/button/buttonSubmit?sublist=3");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='sat1']")).click();
       WebElement submit=driver.findElement(By.xpath("//button[@id='btn40']"));
       Actions act=new Actions(driver);
       act.doubleClick(submit).perform();
       System.out.println(submit.isEnabled()); //submit is clicked
       
  
	}

}
