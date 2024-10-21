package emoappsButton;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       WebElement rightClick=driver.findElement(By.xpath("//button[@id='btn30']"));
       Actions act=new Actions(driver);
       act.contextClick(rightClick).perform();//right click on a button
       System.out.println(rightClick.isEnabled());//verifying the button is clicked
	
	}

}
