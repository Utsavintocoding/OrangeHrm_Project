package PageObjects;


import org.openqa.selenium.By;

import Orange.Project.Base_Class;

public class Config extends Base_Class{
	
	By config = By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[7]/span");
	By email = By.xpath("//a[text()='Email Configuration']");
	By secure= By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/label/span");
	By reset = By.xpath("//button[text()=' Reset ']");
	
	public void config() {
		driver.findElement(config).click();
	}
	public void email() {
		driver.findElement(email).click();
	}

	public void clickSMtP() {
		driver.findElement(secure).click();
	}
		public void reset() {
			driver.findElement(reset).click();
			
			

}
}
