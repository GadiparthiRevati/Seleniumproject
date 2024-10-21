package annotations;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestClass2 extends BaseClass1{
	@Test
	public void createCategory() {
		driver.findElement(By.xpath("//span[text()='Courses']")).click();
		driver.findElement(By.xpath(" //a[text()=' Category']")).click();
		driver.findElement(By.xpath("//a[text()=' New']")).click();
		driver.findElement(By.cssSelector("input#name")).sendKeys("dhanvi");
		driver.findElement(By.name("add")).click();
		
		driver.findElement(By.xpath("//td[text()='dhanvi']/following-sibling::td"
				+ "/descendant::button[text()=' Delete']")).click();
		driver.findElement(By.name("delete")).click();
	}
		
		}
	


