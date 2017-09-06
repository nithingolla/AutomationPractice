package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage3 {
	
	WebDriver driver;
	
	public LoginPage3(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	@FindBy(xpath="//*[@id='email']")WebElement emailAddress;
	
	@FindBy(xpath="//*[@id='passwd']")WebElement password;
	

	
	public void loginApplication(String uname,String pass)
	{
		emailAddress.sendKeys(uname);
		password.sendKeys(pass);

	}
	


}
