package Com.OrangeHRM.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.OrangeHRM.Base.Testbase;
import Com.OrangeHRM.Pages.AdminPage;
import Com.OrangeHRM.Pages.DashboardPage;
import Com.OrangeHRM.Pages.Leavepage;
import Com.OrangeHRM.Pages.LoginPage;
import Com.OrangeHRM.Pages.PIMPage;
import Com.OrangeHRM.Util.Testutil;

public class DashboardPageTest extends Testbase {

	LoginPage loginpage;
	DashboardPage dashboardpage;
	AdminPage adminpage;
	PIMPage pimpage;
	Testutil testutil;
	Leavepage leavepage;

	public DashboardPageTest() {
		super();
	}

	@BeforeMethod
	public void SetUp() {
		initialization(); // call it from Base class(parent)
		loginpage = new LoginPage();
		adminpage = new AdminPage();
		pimpage = new PIMPage();
		leavepage = new Leavepage(); 
		testutil = new Testutil();
		dashboardpage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority = 1)
	public void verifyDashboardPageTitle() {
		String dashboardpageTitle = dashboardpage.verifyDashBoardPageTitle();
		Assert.assertEquals(dashboardpageTitle, "OrangeHRM", "Home page title not matched");
		System.out.println(dashboardpageTitle);
	}

	@Test(priority = 2)
	public AdminPage VerifyAdminLinkTest() {
		adminpage = dashboardpage.clickOnAdminLink();
        return new AdminPage();
	}

	@Test(priority = 3)
	public PIMPage VerifyPimPageLinkTest() {
		pimpage = dashboardpage.clickonPIM();
		return new PIMPage();
	}

	@Test(priority = 4)
	public Leavepage VerifyLeaveLinkTest() {
		leavepage = dashboardpage.clickonLeaveLink();
		return new Leavepage();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
