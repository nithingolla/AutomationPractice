package testcases;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.HomePage3;
import pages.LoginPage3;

public class VerifyLoginPage4withReports {
	WebDriver driver;
	ExtentReports report;
	ExtentTest logger;
	
	
	@BeforeMethod
	
	public void setUp() 
	{
		report = new ExtentReports("./Reports/LoginPageReport.html",true);// true is to override the old report
		logger = report.startTest("Verify the test login");
		
        driver = BrowserFactory.getBrowser("chrome");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl());
		logger.log(LogStatus.INFO,"Application up and running");
	}
	@Test
	public void testHomePage()
	{ 
HomePage3 home = PageFactory.initElements(driver, HomePage3.class);
		
		String title = home.getApplicationTitle();
		
		Assert.assertTrue(title.contains("My Store"));
		logger.log(LogStatus.PASS,"HomePage loaded and verified");
		
		home.clickSignInLink();
		logger.log(LogStatus.INFO,"Click on Sign in link");
	
		LoginPage3 login = PageFactory.initElements(driver, LoginPage3.class);
		
		login.loginApplication(DataProviderFactory.getExcel().getData(0, 0, 0),DataProviderFactory.getExcel().getData(0, 0, 1));
		
	//	logger.log(LogStatus.INFO,"Login to application");
		
	}
		@AfterMethod
	
	public void tearDown()
	{
		BrowserFactory.closeBrowser(driver);
		report.endTest(logger);
		report.flush();
	}


	
	
	
	

}
