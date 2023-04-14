package TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.AdminFeatures;
import PageObjects.LoginHrm;

public class AdminFeatures_test {
	LoginHrm log;
	AdminFeatures key;
	@BeforeMethod
	public void browserConfig()
	{
		log=new LoginHrm();
		log.initialize();
				
	}
	@Test
	public void admin () {
		try {
			log.login();
			key.admin();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
		@Test
		public void usermange () {
			try {
				log.login();
				key.userManagement();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
			@Test
			public void user() {
				try {
					log.login();
					key.User();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
				@Test
				public void userole () {
					try {
						log.login();
						key.userRole();
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
					@Test
					public void empname () {
						try {
							log.login();
							key.employeName("Paul");
						} catch (Exception e) {
							// TODO: handle exception
						}
					}
						@Test
						public void drop() {
							try {
								log.login();
								key.statusDropdown();
							} catch (Exception e) {
								// TODO: handle exception
							}
						}	
							@Test
							public void search() {
								try {
									log.login();
									key.Search();
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
