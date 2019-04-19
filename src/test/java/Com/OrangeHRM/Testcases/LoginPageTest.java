package Com.OrangeHRM.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.OrangeHRM.Base.Testbase;
import Com.OrangeHRM.Pages.DashBoard_Page;
import Com.OrangeHRM.Pages.LoginPage;

public class LoginPageTest extends Testbase {

	LoginPage loginpage;
	DashBoard_Page dashboard;
	
    public  LoginPageTest(){
    	super();
	}
    
	@BeforeMethod
	public void SetUp(){
		initialization(); //call it from Base class(parent)
		loginpage = new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitle(){
		String title = loginpage.validateLoginpageTitle();
		Assert.assertEquals(title, "OrangeHRM");
	}
	
	@Test(priority=2)
	public void loginTest(){
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}	
}
