package Com.OrangeHRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.OrangeHRM.Base.Testbase;

public class DashboardPage extends Testbase {

	@FindBy(xpath = "//b[contains(text(),'Dashboard')]")
	WebElement DashbaordText;

	@FindBy(xpath = "//a[@id='menu_admin_viewAdminModule']")
	WebElement AdminLink;

	@FindBy(xpath = "//a[@id='menu_pim_viewPimModule']")
	WebElement PIMLink;

	@FindBy(xpath = "//a[@id='menu_leave_viewLeaveModule']")
	WebElement LeaveLink;

	// Initializing page objects:
	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyDashBoardPageTitle() {
		return driver.getTitle();
	}

	public AdminPage clickOnAdminLink() {
		AdminLink.click();
		return new AdminPage();
	}

	public PIMPage clickonPIM() {
		PIMLink.click();
		return new PIMPage();
	}

	public Leavepage clickonLeaveLink() {
		LeaveLink.click();
		return new Leavepage();
	}

	public boolean verifyCorrectUserName() {
		
		return false;
	}

	public ContactsPage clickOnContanacts() {
		// TODO Auto-generated method stub
		return null;
	}
}
