package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownInAmazon {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement multiselect = driver.findElement(By.id("multiselect1"));
		Select select=new Select(multiselect);
		List<WebElement> options = select.getOptions();
		for(WebElement e : options)
		{
			System.out.println(e.getText());
		}
		select.selectByIndex(0);
		select.selectByIndex(1);
		select.selectByValue("Hyundaix");
		select.deselectByIndex(0);
		List<WebElement> all = select.getAllSelectedOptions();
		for(WebElement e:all)
		{
			System.out.println(e.getText());
		}
		driver.quit();;
		
	}

}
