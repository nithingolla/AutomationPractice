package testcases;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.HomePage3;
import pages.LoginPage3;

public class VerifyLoginPage3 {
	WebDriver driver;
	
	
	@BeforeMethod
	
	public void setUp() 
	{
        driver = BrowserFactory.getBrowser("chrome");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl());
	}
	@Test
	public void testHomePage()
	{ 
HomePage3 home = PageFactory.initElements(driver, HomePage3.class);
		
		String title = home.getApplicationTitle();
		
		Assert.assertTrue(title.contains("My Store"));
		
		home.clickSignInLink();
	
		LoginPage3 login = PageFactory.initElements(driver, LoginPage3.class);
		
		login.loginApplication(DataProviderFactory.getExcel().getData(0, 0, 0),DataProviderFactory.getExcel().getData(0, 0, 1));
		
		
		
	}
		@AfterMethod
	
	public void tearDown()
	{
		BrowserFactory.closeBrowser(driver);
	}


	
	
	
	

}
