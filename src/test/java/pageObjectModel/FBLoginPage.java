package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLoginPage {
//Declaration
	
	@FindBy(id="email")
	 WebElement email_TF;
	
	@FindBy(id="pass")
	WebElement password_TF;
	@FindBy(name="login")
	WebElement login_BTn;
	
	//initialization or constructor
	
	FBLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//action methods
	public void setEmail(String email ) {
		
		email_TF.sendKeys(email);
	}
	public void setPwd(String pwd)
	{
		password_TF.sendKeys(pwd);
	}
	public void clickLogin()
	{
		login_BTn.click();
	}

}
