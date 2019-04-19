package Com.OrangeHRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.OrangeHRM.Base.Testbase;
import Com.OrangeHRM.Testcases.DashBoardPage_Test;

public class LoginPage extends Testbase{

	//Page factory -- OR:
	@FindBy(name="txtUsername")
	WebElement Username;
	
	@FindBy(name="txtPassword")
	WebElement Password;
	
	@FindBy(xpath="//input[@name='Submit']")
	WebElement Login;

  //Initializing page objects:	
  public LoginPage(){
	  PageFactory.initElements(driver, this);
	  
  }
  //Actions:
  public String validateLoginpageTitle(){
	  return driver.getTitle();
	  
  }
  
  public DashBoard_Page login(String username, String password){
	  Username.sendKeys(username);
	  Password.sendKeys(password);
	  Login.click();
	  
	  return new DashBoard_Page();
  }
  
}