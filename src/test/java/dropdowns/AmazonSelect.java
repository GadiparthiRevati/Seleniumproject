package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class AmazonSelect {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement allDropDown=driver.findElement(By.id("searchDropdownBox"));
	Select select=new Select(allDropDown);
	select.selectByIndex(11);
	select.selectByValue("search-alias=fashion");
	select.selectByVisibleText("Appliances");
	 List<WebElement> options= select.getOptions();
	 for(WebElement opt : options)
	 {
		 System.out.println(opt.getText());
	 }
	 if(select.isMultiple())
	 {
		 System.out.println("multi select");
	 }
	 else
	 {
		 System.out.println("single select");
	 }
	 
	
}
}

