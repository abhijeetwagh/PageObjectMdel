package Com.OrangeHRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import Com.OrangeHRM.Base.Testbase;

public class AdminPage extends Testbase {

	
	@FindBy(id = "systemUser_employeeName_empName")
	WebElement EmployeeName ;
	
	@FindBy(name = "systemUser[userName]")
	WebElement username ;
	
	@FindBy(name = "btnSave")
	WebElement save ;
	
	@FindBy(xpath = "//a[@class='toggle tiptip']")
	WebElement AdminLabel;

	@FindBy(xpath = "//input[@name='searchSystemUser[userName]']")
	WebElement usernamelabel;

	@FindBy(name = "searchSystemUser[userType]")
	public WebElement Select_Compound;
	
	@FindBy(xpath = "//input[@name='searchSystemUser[employeeName][empName]']")
	WebElement employeename;

	// Initializing page objects:
	public AdminPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean VerifyAdminLabel() {
		return AdminLabel.isDisplayed();
	}

	public String EnterUserName(String name) {
		usernamelabel.sendKeys(name);
		return name;
	}

	public void selectUserRole() {
		Select dropDownBox = new Select(Select_Compound);
		dropDownBox.selectByVisibleText("Admin");
	}

	public void enterEmployeeName(String string) {
		employeename.sendKeys(string);
	}

	public void CreateNewUser(String title,String empName,String uname, String status){
		Select select = new Select(driver.findElement(By.name("systemUser[userType]")));
		select.selectByVisibleText(title);
		EmployeeName.sendKeys(empName);
		username.sendKeys(uname);
		save.click(); 
	}	
	
	public void SelectStatus(String enable){
		Select select = new Select(driver.findElement(By.name("systemUser[status]")));
		select.selectByVisibleText(enable);
	}	
}
