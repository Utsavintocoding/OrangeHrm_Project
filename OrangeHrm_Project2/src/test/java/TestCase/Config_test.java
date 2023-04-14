package TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import PageObjects.Config;
import PageObjects.LoginHrm;

public class Config_test {
	
LoginHrm log;
Config key;
	
	@BeforeMethod
	public void browserConfig()
	{
		log=new LoginHrm();
		log.initialize();
				
	}
	
	@Test
	public void validateConfiguration() 
	{
		try {
			log.login();
			key.config();
			
		} catch (Exception e) {
			// TODO: handle exception
		}	
	}
	
	@Test
	public void validateEmail()
	{
		try {
			log.login();
			key.email();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	@Test
	public void validateclicksmtps()
	{
		try {
			log.login();
			key.clickSMtP();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	@Test
	public void validateReset()
	{
		try {
			log.login();
			key.reset();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		log.tearDown();
	}

}
