package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemApps {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		WebElement frame = driver.findElement(By.className("w-full h-96"));
		driver.switchTo().frame(frame);
		driver.findElement(By.name("email")).sendKeys("revati");
		
	}

}
