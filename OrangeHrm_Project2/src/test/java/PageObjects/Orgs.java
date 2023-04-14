package PageObjects;

import org.openqa.selenium.By;

import Orange.Project.Base_Class;

public class Orgs extends Base_Class {
	
	By org = By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/span");
	By structure = By.xpath("//a[text()='Structure']");
	By button = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div/label/span");

	
	public void Organisation() {
		driver.findElement(org).click();
	}
	public void Structure() {
		driver.findElement(structure).click();
	}
	public void radioButton() {
		driver.findElement(button).click();
	}
}
