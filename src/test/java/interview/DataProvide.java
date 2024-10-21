package interview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvide {
	
	@DataProvider()
	public Object[] [] data()
	
	{
		Object[] [] obj=new Object[4][1];
		obj[0][0]="shoes";
		obj[1][0]="watch";
		obj[2][0]="wallet";
		obj[3][0]="lipstick";
		
		
		
		return obj;
		
	}
	
	@Test(dataProvider="data")
	public void searchTest(String obj) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele=driver.findElement(By.id("twotabsearchtextbox"));
		ele.sendKeys(obj);
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.quit();
		
		
		
		
	}

}
