/*package Com.OrangeHRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.OrangeHRM.Base.Testbase;

public class Homepage extends Testbase {

	@FindBy(xpath = "//td[contains(text(),'User: Abhi Wagh')]")
	WebElement userNameLabel;

	@FindBy(xpath = "//a[contains(text(),'Contacts')")
	WebElement contactsLink;

	@FindBy(xpath = "//a[contains(text(),'Deals')")
	WebElement dealsLink;

	@FindBy(xpath = "//a[contains(text(),'Tasks')")
	WebElement taskLink;

	@FindBy(xpath = "//a[contains(text(),'Companies')")
	WebElement CompaniesLink;

	// Initializing page objects:
	public Homepage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyHomePageTitle() {
		return driver.getTitle();
	}

	public boolean verifyCorrectUserName() {
		return userNameLabel.isDisplayed();

	}

	public ContactsPage clickOnContanacts() {
		contactsLink.click();
		return new ContactsPage();
	}

	public DealsPage clickonDeals() {
		dealsLink.click();
		return new DealsPage();
	}

	public TaskPage clickonTaskLink() {
		taskLink.click();
		return new TaskPage();
	}

	public CompanyPage clickonCompanies() {
		CompaniesLink.click();
		return new CompanyPage();
	}
}*/