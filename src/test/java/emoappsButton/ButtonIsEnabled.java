package emoappsButton;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonIsEnabled {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/button/buttonDisabled?sublist=4");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement radio=driver.findElement(By.xpath("//button[@id='btn10']"));
       System.out.println(radio.isEnabled());
       Actions act=new Actions(driver);
       
	}

}
