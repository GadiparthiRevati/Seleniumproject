package interview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClass {
	@Test
	public void actiontest() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/s?bbn=1350387031&rh=n%3A1350387031%2Cp_85%3A10440599031&dc&qid=1729264500&rnid=10440598031&ref=lp_1350388031_nr_p_85_1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/** WebElement ele=driver.findElement(By.xpath("//div[@id='nav-xshop']/child::a[3]"));
		WebElement ele2=driver.findElement(By.xpath("//div[@id='nav-xshop']/child::a[2]"));
		Actions action=new Actions(driver);
		action.moveToElement(ele).perform();
		action.contextClick(ele2).perform(); **/
	WebElement ele=	driver.findElement(By.xpath("//div[@class='a-section s-range-input-container s-lower-bound aok-relative']/following::div[1]"));
	WebElement target=driver.findElement(By.xpath("//input[@id='p_36/range-slider_slider-item_lower-bound-slider']"));
	Actions action=new Actions(driver);
	action.dragAndDrop(ele, target).perform();
		
		
	}

}
