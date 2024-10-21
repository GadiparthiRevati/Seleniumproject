package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HYR {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.id("name")).sendKeys("text1");
		driver.switchTo().frame("frm1");
		WebElement dropDown = driver.findElement(By.id("course"));
		Select select=new Select(dropDown);
		select.selectByVisibleText("Dot Net");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).sendKeys("text2");
		
	}

}
