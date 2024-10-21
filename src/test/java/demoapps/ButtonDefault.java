package demoapps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonDefault {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele=driver.findElement(By.xpath("(//p[@class='pb-3'])[last()-2]/following-sibling::button"));
		Thread.sleep(2000);
//	WebElement ele=	driver.findElement(By.xpath("(//p[@class='pb-3'])[last()-2]/following-sibling::button[2]"));
	Actions actions=new Actions(driver);//
	//actions.contextClick(ele).perform();// these 2 for right click
	actions.doubleClick(ele).perform();
	
		
		
		
	}

}
