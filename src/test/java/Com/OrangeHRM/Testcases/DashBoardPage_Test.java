package Com.OrangeHRM.Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.OrangeHRM.Base.Testbase;
import Com.OrangeHRM.Pages.AdminPage;
import Com.OrangeHRM.Pages.DashBoard_Page;
import Com.OrangeHRM.Pages.LeavePage;
import Com.OrangeHRM.Pages.LoginPage;
import Com.OrangeHRM.Pages.PIMPage;

public class DashBoardPage_Test extends Testbase {

	LoginPage loginpage;
	DashBoard_Page dashboardpage;
	AdminPage adminpage;
	PIMPage pimpage;
	LeavePage leavepage;

	public DashBoardPage_Test() {
		super();
	}

	@BeforeMethod
	public void SetUp() {
		initialization(); // call it from Base class(parent)
		loginpage = new LoginPage();
		dashboardpage = new DashBoard_Page();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority = 1)
	public void VerifyDashBoardPageTitleTest() {
		String dasboardTitle = dashboardpage.VerifyDashBoardPageTitleTest();
		Assert.assertEquals(dasboardTitle, "OrangeHRM", "This Title is not matched");
	}

	@Test(priority = 2)
	public void ClickOnAdminLinkTest() {
		adminpage = dashboardpage.ClickOnAdminLink();
	}

	@Test(priority = 3)
	public void ClickOnPIMLinkTest() {
		pimpage = dashboardpage.ClickOnPIMLink();
	}

	@Test(priority = 4)
	public void ClickOnLeaveLinkTest() {
		leavepage = dashboardpage.ClickOnLeaveLink();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
