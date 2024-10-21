package autoSuggestions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("q")).sendKeys("choclate");
		List<WebElement> list=driver.findElements(By.xpath("//div[contains(@class,'s-suggestion-ellipsis-direction') and contains(.,'watch')])]"));
		List<String> text=new ArrayList<String >();
		for(WebElement e:list)
		{
			System.out.println(e.getText());
		}
		System.out.println("---------------------------");
		Collections.sort(text);
		for(String string : text)
		{
			System.out.println(string);
		}
	}
}


