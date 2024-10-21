package demoapps;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebElement iframe = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(0);
		driver.switchTo().frame(1);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#email")).sendKeys("dhanvi");
		
		driver.switchTo().defaultContent();
		
    	/*WebElement iframe2=	driver.findElement(By.className("w-full h-96"));
    	String s=driver.findElement(By.xpath("//p[text()='Default Email']")).getText();
    	  System.out.println(s); */
    	  driver.quit();
	
		
	}

}
