package PageObjects;

import org.openqa.selenium.By;

import Orange.Project.Base_Class;

public class LoginHrm extends Base_Class{
	
	public void login()
	{ 
		driver.findElement(By.name("username")).sendKeys(prop.getProperty("Username"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("Password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
