/*package Com.OrangeHRM.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import Com.OrangeHRM.Base.Testbase;
import Com.OrangeHRM.Pages.ContactsPage;
import Com.OrangeHRM.Pages.DashboardPage;
import Com.OrangeHRM.Pages.Homepage;
import Com.OrangeHRM.Pages.LoginPage;
import Com.OrangeHRM.Util.Testutil;

public class HomePagetest extends Testbase {

	LoginPage loginpage;
	DashboardPage homepage;
	Testutil testutil;
	ContactsPage contactpage;

	public HomePagetest() {
		super();
	}

	@BeforeMethod
	public void SetUp() {
		initialization(); // call it from Base class(parent)
		loginpage = new LoginPage();
		testutil = new Testutil();
		contactpage = new ContactsPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority = 1)
	public void verifyHomePageTest() {
		String HomePageTitle = homepage.verifyDashBoardPageTitle();
		Assert.assertEquals(HomePageTitle, "CRMPRO", "Home page title not matched");
	}

	@Test(priority = 2)
	public void verifyUserNameTest() {
		Assert.assertTrue(homepage.verifyCorrectUserName());
	}

	@Test(priority = 3)
	public void VerifyContactLinkTest() {
		contactpage = homepage.clickOnContanacts();
		return;
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}*/