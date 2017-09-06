package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage3 {
	
	WebDriver driver;
	
	public HomePage3(WebDriver ldriver)
	{
		
		this.driver=ldriver;
		
	}
	@FindBy(xpath="//*[@id='header']/div[2]/div/div/nav/div[1]/a")WebElement womenLink;
	@FindBy(xpath="//a[contains(@title,'Dresses')]")WebElement dressesLink;
	@FindBy(xpath="//a[@class='login']")WebElement signInLink;
	@FindBy(xpath="//a[contains(@title,'Contact us')]")WebElement contactUsLink;
	 
	public void clickOnLink()
	{
		womenLink.click();
	}public void clickOnDressesLink()
	{
		dressesLink.click();
	}
	public void clickSignInLink()
	{
		signInLink.click();
	}
	public void clickContactUsLink()
	{
		contactUsLink.click();
	}
	
	public String getApplicationTitle()
	{
		return driver.getTitle();
	}
	
	

}
