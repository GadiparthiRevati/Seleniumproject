package crossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	WebDriver driver;
	
	@Parameters("BROWSER")
	@BeforeClass
	public void classSetUp(String browser) {
		if(browser.equals("chrome"))
			driver=new ChromeDriver();
		if(browser.equals("edge"))
			driver=new EdgeDriver();
		if(browser.equals("firefox"))
			driver=new FirefoxDriver();
		driver.manage().window().maximize();
	}
	@AfterClass
	public void classUnset() {
		driver.quit();
	}

}
