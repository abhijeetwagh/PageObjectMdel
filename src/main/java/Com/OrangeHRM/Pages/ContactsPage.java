package Com.OrangeHRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.OrangeHRM.Base.Testbase;

public class ContactsPage extends Testbase {

	
	@FindBy(xpath = "//td[(contains(text(),'Contacts')]")
	WebElement contactsLabel;
	
	// Initializing page objects:
		public ContactsPage() {
			PageFactory.initElements(driver, this);
		}
		
		public boolean verifyContactsLabel(){
			return contactsLabel.isDisplayed();
		}
}
