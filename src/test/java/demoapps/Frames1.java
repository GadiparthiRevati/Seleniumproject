package demoapps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement iframe = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(iframe);
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("revatigadiparthii@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Dhanvi@4454");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}

}
