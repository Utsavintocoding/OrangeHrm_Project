package TestCase;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.LoginHrm;
import PageObjects.SearchEmployee;

public class SearchEmployeeTest {
	
	LoginHrm log;

	@BeforeMethod
	public void browserConfig()
	{
		log=new LoginHrm();
		log.initialize();
		log.login();
	}
	
	@Test
	public void admin() {
			try {
				log.login();
				SearchEmployee se = new SearchEmployee();
				se.admin();
			} catch (Exception e) {
				// TODO: handle exception
			}
	
	}
//	
	@Test 
	public void byUname() {
		try {
			log.login();
			SearchEmployee se = new SearchEmployee();
			se.searchByuname();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	@Test 
	public void byEname() {
		try {
			log.login();
			SearchEmployee se = new SearchEmployee();
			se.searchByEmpname();
		} catch (Exception e) {
			// TODO: handle exception
		}
}	@Test
	public void reset () {
	try {
		log.login();
		SearchEmployee se = new SearchEmployee();
		se.reset();
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
