package autoSuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BiryaniList {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("biryani");
		List<WebElement> biryani = driver.findElements(By.xpath("//li[contains(.,'iryani')]"));
		for(WebElement e : biryani)
		{
			System.out.println(e.getText());
		}
		int count=biryani.size();
		System.out.println(count);
		biryani.get(count-2).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
