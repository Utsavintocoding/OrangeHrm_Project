package PageObjects;

import org.openqa.selenium.By;

import Orange.Project.Base_Class;

public class AdminFeatures extends Base_Class {

	By admin = By.xpath("//span[text()='Admin']");
	By usermanagement = By.xpath("//span[text()='User Management ']");
	By user = By.xpath("//a[text()='Users']");
	By userfd = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input");
	By roleselect = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]");
	By userrole = By.xpath("//div[text()='Admin']");
	By employename = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/input");
	By statusdropdown = By.xpath("//div[text()='-- Select --']");
	By status = By.xpath("//div[text()='Enabled']");
	By search = (By.id("searchBtn"));


	public void admin
	
	() {
		driver.findElement(admin).click();
	}

	public void userManagement() {
		driver.findElement(usermanagement).click();

	}

	public void User() {
		driver.findElement(user).click();
	}

	public void userRole() {
		driver.findElement(roleselect).click();
	}

	

	public void employeName(String Empname) {
		driver.findElement(employename).sendKeys(Empname);
	}

	public void statusDropdown() {
		driver.findElement(statusdropdown).click();
	}


	public void Search() {
		driver.findElement(search).click();
	}
}
