package Com.OrangeHRM.Testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.OrangeHRM.Base.Testbase;
import Com.OrangeHRM.Pages.ContactsPage;
import Com.OrangeHRM.Pages.DashboardPage;
import Com.OrangeHRM.Pages.LoginPage;
import Com.OrangeHRM.Util.Testutil;

public class ContactsPageTest extends Testbase{

	LoginPage loginpage;
	DashboardPage homepage;
    Testutil testutil;
    ContactsPage contactpage;
    
	public ContactsPageTest() {
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
	
	@Test(priority=1)
	public void verifyContactsLabel(){
		Assert.assertTrue(contactpage.verifyContactsLabel(),"contact label is missing on the page");
	}
}
