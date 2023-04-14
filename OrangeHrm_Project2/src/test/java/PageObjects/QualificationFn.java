package PageObjects;

import org.openqa.selenium.By;

import Orange.Project.Base_Class;

public class QualificationFn extends Base_Class{
	 
	By education = By.xpath("//a[text()='Education']");
	By skills = By.xpath("//a[text()='Skills']");
	By checkBox = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[3]/div/div[1]/div/div[1]/div");
	By delete = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[2]/div/div/button");
	By confirmdelete = By .xpath("/html/body/div/div[3]/div/div/div/div[3]/button[2]");
	By addbtn = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[1]/div/button");
	By savebtn=By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]");
	By qualification = By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[4]");
	
	
	
	
	public void Qualification() {
		driver.findElement(qualification).click();
	}
	public void Skills() {
		driver.findElement(skills).click();
	}
	public void checkBox() {
		driver.findElement(checkBox).click();
	}
 
	public void deleteButton() {
		driver.findElement(delete).click();
	}

	public void cnfrmDelete() {
		driver.findElement(confirmdelete).click();
	}
	public void education() {
		driver.findElement(education).click();
	}

	public void add() {
		driver.findElement(addbtn).click();
	}
	
	public void save() {
		driver.findElement(savebtn).click();
	}
}
