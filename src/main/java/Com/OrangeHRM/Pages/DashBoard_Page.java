package Com.OrangeHRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Com.OrangeHRM.Base.Testbase;

public class DashBoard_Page extends Testbase {

	@FindBy(xpath = "//a[@id='menu_admin_viewAdminModule']")
	WebElement AdminLink;
	
	@FindBy(xpath = "//input[@id='btnAdd']")
	WebElement AddBtn;

	@FindBy(xpath = "//a[@id='menu_pim_viewPimModule']")
	WebElement PIMLink;

	@FindBy(xpath = "//a[@id='menu_leave_viewLeaveModule']")
	WebElement LeaveLink;

	// Initializing page objects:
	public DashBoard_Page() {
		PageFactory.initElements(driver, this);
	}

	public String VerifyDashBoardPageTitleTest() {
		return driver.getTitle();
	}
	
	public AdminPage ClickOnAdminLink() {
		AdminLink.click();
		return new AdminPage();
	}
	
	public PIMPage ClickOnPIMLink() {
		PIMLink.click();
		return new PIMPage();
	}

	public LeavePage ClickOnLeaveLink() {
		LeaveLink.click();
		return new LeavePage();
	}
	
	public void clickOnAddLink(){
		AddBtn.click();
	}

	public void cliclOnNewUser(){
		Actions action = new Actions(driver);
		action.moveToElement(AdminLink);
		AddBtn.click();
	}
}
