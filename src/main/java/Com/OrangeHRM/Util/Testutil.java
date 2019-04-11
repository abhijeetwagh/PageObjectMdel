package Com.OrangeHRM.Util;

import org.openqa.selenium.interactions.Actions;

import Com.OrangeHRM.Base.Testbase;

public class Testutil extends Testbase {

	
	public static long PAGE_LOAD_TIMEOUT = 10;
	public static long IMPLICIT_WAIT = 20;
	
	Actions action = new Actions(driver);
	
}
