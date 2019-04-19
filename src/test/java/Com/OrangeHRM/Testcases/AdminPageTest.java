package Com.OrangeHRM.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Com.OrangeHRM.Base.Testbase;
import Com.OrangeHRM.Pages.AdminPage;
import Com.OrangeHRM.Pages.DashBoard_Page;
import Com.OrangeHRM.Pages.LoginPage;
import Com.OrangeHRM.Util.Testutil;

public class AdminPageTest extends Testbase {

	LoginPage loginpage;
	DashBoard_Page dashboardpage;
	AdminPage adminpage;
	
	String sheetName = "Admin";

	public AdminPageTest() {
		super();
	}

	@BeforeMethod
	public void SetUp() {
		initialization(); // call it from Base class(parent)
		loginpage = new LoginPage();
		dashboardpage = new DashBoard_Page();
		adminpage = new AdminPage();
		dashboardpage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		adminpage = dashboardpage.ClickOnAdminLink();
	}

	@Test(priority = 1)
	public void veryfyAdminPageTest() {
		Assert.assertTrue(adminpage.VerifyAdminLabel(), "System users is missing");
	}

	@Test(priority = 2)
	public void EnteruserName() {
		adminpage.EnterUserName("Admin");
	}

	@Test(priority = 3)
	public void SelectRoleofuser() {
		adminpage.selectUserRole();
	}

	@Test(priority = 4)
	public void EnterEmployeename() {
		adminpage.enterEmployeeName("Linda Anderson");
	}
 
	@DataProvider
	public Object[][] getData(){
		Object data [][] = Testutil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority = 5,dataProvider="getData")
	public void validatenewUser(String UserRole, String EmployeeName, String Username,String status) {
    dashboardpage.cliclOnNewUser();
    //adminpage.CreateNewUser("Admin", "Linda Anderson", "Admin1");
    adminpage.CreateNewUser(UserRole, EmployeeName, Username, status);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
