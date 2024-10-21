package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skilraryPage {
	@FindBy(id="email")
	WebElement email_TF;
	
	@FindBy(id="password")
	WebElement pwd_TF;
	
	@FindBy(id="last")
	WebElement login_TF;
	
	skilraryPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	public void setEmail(String email) {
		email_TF.sendKeys("admin");
		
	}
	public void setPwd(String pwd) {
		pwd_TF.sendKeys("admin");
	}
	public void login() {
		
	login_TF.click();
	}
	

}
