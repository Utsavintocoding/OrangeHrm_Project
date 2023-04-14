package TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Orange.Project.Base_Class;
import PageObjects.LoginHrm;
import PageObjects.SearchFn;

public class SearchFnTest extends Base_Class {
	
	LoginHrm log;

	@BeforeTest
	public void browserConfig()
	{
		log=new LoginHrm();
		log.initialize();
		log.login();
	}
		
	@Test
	public void Search() {
	
		try {
			log.login();
			SearchFn search = new SearchFn();
			search.Key0();
		} catch (Exception e) {
			// TODO: handle exception
		} 
	
	
	}
	@Test
	public void Search1() {
	try {
		log.login();
		SearchFn search = new SearchFn();
		search.Key1(); 
	} catch (Exception e) {
		// TODO: handle exception
	}
	}
	@Test
	public void Search2() {
	try {
		log.login();
		SearchFn search = new SearchFn();
		search.Key2(); 
	} catch (Exception e) {
		// TODO: handle exception
	}
	}
	@Test
	public void Search3() {
	try {
		log.login();
		SearchFn search = new SearchFn();
		search.Key3(); 
	} catch (Exception e) {
		// TODO: handle exception
	}
	}
	@Test
	public void Search4() {
	try {
		log.login();
		SearchFn search = new SearchFn();
		search.Key4(); 
	} catch (Exception e) {
		// TODO: handle exception
	}
	}
	@Test
	public void Search5() {
	try {
		log.login();
		SearchFn search = new SearchFn();
		search.Key5(); 
	} catch (Exception e) {
		// TODO: handle exception
	}
	}
	@Test
	public void Search6() {
	try {
		log.login();
		SearchFn search = new SearchFn();
		search.Key6(); 
	} catch (Exception e) {
		// TODO: handle exception
	}
	}
	@Test
	public void Search7() {
	try {
		log.login();
		SearchFn search = new SearchFn();
		search.Key7(); 
	} catch (Exception e) {
		// TODO: handle exception
	}
	}
	@Test
	public void Search8() {
	try {
		log.login();
		SearchFn search = new SearchFn();
		search.Key8(); 
	} catch (Exception e) {
		// TODO: handle exception
	}
	}
	@Test
	public void Search9() {
	try {
		log.login();
		SearchFn search = new SearchFn();
		search.Key9(); 
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
