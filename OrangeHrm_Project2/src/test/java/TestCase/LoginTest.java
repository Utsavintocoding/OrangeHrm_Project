package TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import PageObjects.LoginHrm;

public class LoginTest {
	
	LoginHrm log;
	
	@BeforeMethod
	public void browserConfig()
	{
		log=new LoginHrm();
		log.initialize();
			
	}
	
	@Test

	public void validateLoginTest()
	{
		log.login();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		log.tearDown();
	}

}
