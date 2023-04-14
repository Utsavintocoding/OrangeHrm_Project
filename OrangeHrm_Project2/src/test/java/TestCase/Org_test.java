package TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.LoginHrm;
import PageObjects.Orgs;

public class Org_test {
	

	LoginHrm log;
	Orgs key;
		
		@BeforeMethod
		public void browserConfig()
		{
			log=new LoginHrm();
			log.initialize();
					
		}
		
		@Test
		public void qualification() 
		{
			try {
				log.login();
				key.Organisation();
				
			} catch (Exception e) {
				// TODO: handle exception
			}	
		}

	
		@Test
		public void structure() 
		{
			try {
				log.login();
				key.Structure();
		
			} catch (Exception e) {
				// TODO: handle exception
			}	
		}
		
        @Test
        public void radiobutton() {
        	try {
        		log.login();
        		key.radioButton();
		
        	} 	catch (Exception e) {
        		// TODO: handle exception
        	}	
        }
        
    
        @AfterMethod
        public void closeBrowser()
	{
		log.tearDown();
		}
		}
		
	
