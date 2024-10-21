package popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewWindowAndTab {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.netflix.com/in/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.makemytrip.com/");
driver.quit();
		
	}

}
