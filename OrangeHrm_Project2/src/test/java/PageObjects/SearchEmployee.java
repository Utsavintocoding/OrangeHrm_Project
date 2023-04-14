package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;

import Orange.Project.Base_Class;

public class SearchEmployee extends Base_Class{
	 
	
//	    By WorkSft = By.xpath("//body//div[@id='app']//li//li[1]");
//	    By Status = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]");
//	    By EmployeeName = By.xpath("//input[@placeholder='Type for hints...']");
//	    By Username = By.xpath("//body/div[@id='app']/div/div/div/div/div/div/form/div/div/div/div/div/input[1]");
//	    By Search = By.xpath("//button[@type='submit']");
	
	public void admin() {
		driver.findElement(By.xpath("//span[text()='Dashboard']")).isDisplayed();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		driver.findElement(By.linkText("User Management")).click();
	}



	public void searchByuname() {
		driver.findElement(By.xpath("//span[text()='Dashboard']")).isDisplayed();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).sendKeys("uname");
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
	}
	public void searchByEmpname() {
		driver.findElement(By.xpath("//span[text()='Dashboard']")).isDisplayed();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Empname");
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
	}
	public void reset() {
		driver.findElement(By.xpath("//span[text()='Dashboard']")).isDisplayed();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Reset']")).click();
		
	}
}
