package demoapps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://demoapps.qspiders.com/ui");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Revathi");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("revathigadiparthii@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Dhanvi@4454");
        driver.quit();
	}

}
