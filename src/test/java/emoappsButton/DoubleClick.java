package emoappsButton;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/button/buttonDouble?sublist=2");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       WebElement btn=driver.findElement(By.xpath("//button[@id='btn20']"));
       Actions act=new Actions(driver);
       act.doubleClick(btn).perform();
       System.out.println(btn.isEnabled());
	}

}
