
package TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import PageObjects.LoginHrm;
import PageObjects.QualificationFn;

public class QualificationFn_test {
	
	LoginHrm log;
	QualificationFn key;
		
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
				key.Qualification();
				
			} catch (Exception e) {
				// TODO: handle exception
			}	
		}
		@Test
		public void skill() 
		{
			try {
				log.login();
				key.Skills();
				
			} catch (Exception e) {
				// TODO: handle exception
			}	
		}
		@Test
		public void checkbx () 
		{
			try {
				log.login();
				key.checkBox();
				
			} catch (Exception e) {
				// TODO: handle exception
			}	
		}
		@Test
		public void delete() 
		{
			try {
				log.login();
				key.deleteButton();
				
			} catch (Exception e) {
				// TODO: handle exception
			}	
		}
		@Test
		public void deleteConfirmation() 
		{
			try {
				log.login();
				key.cnfrmDelete();
				
			} catch (Exception e) {
				// TODO: handle exception
			}	
		}
		@Test
		public void edu() 
		{
			try {
				log.login();
				key.education();
				
			} catch (Exception e) {
				// TODO: handle exception
			}	
		}
		@Test
		public void add() 
		{
			try {
				log.login();
				key.add();
				
			} catch (Exception e) {
				// TODO: handle exception
			}	
		}
			@Test
			public void save() 
			{
				try {
					log.login();
					key.save();
					
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
