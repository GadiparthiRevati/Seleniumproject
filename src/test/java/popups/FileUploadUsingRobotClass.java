package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadUsingRobotClass {
	public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
	driver.findElement(By.id("name")).sendKeys("revati");
	driver.findElement(By.id("email")).sendKeys("revathigadiparthii@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Dhanvi@4454");
	driver.findElement(By.id("mobile")).sendKeys("9542742470");
	driver.findElement(By.xpath("//h2[text()=\"I'm experienced\"]")).click();
	driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
	StringSelection str=new StringSelection("C:\\Users\\revat\\Downloads\\WhatsApp Image 2024-03-09 at 10.02.45 PM.jpeg");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	Thread.sleep(3000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	

}
}