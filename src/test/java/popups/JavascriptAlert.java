package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptAlert {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='JavaScript Alerts']")).click();
		//driver.findElement(By.xpath("//button[text()='Click for JS Confirm']").click();    // js confirm
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();  //js prompt
	//	driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		//a.accept();
		a.sendKeys("rev");
		a.accept();
		
	String result=	driver.findElement(By.id("result")).getText();
	System.out.println(result);
	driver.quit();
		
	}

}
