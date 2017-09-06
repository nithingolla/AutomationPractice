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

public class VerifyHomePage3 {
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
		
		
	}
	
	@AfterMethod
	
	public void tearDown()
	{
		BrowserFactory.closeBrowser(driver);
	}
	
	
	
	
	

}
