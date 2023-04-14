package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;

import Orange.Project.Base_Class;

public class SearchFn extends Base_Class{
	
	public void Key0() {
	
		driver.findElement(By.xpath("//span[text()='Scearch']")).sendKeys("key0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='PIM']")).isDisplayed();	
	}
	
	public void Key1() {
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("key1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Admin")).isDisplayed();
	}
	public void Key2() {
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("key2");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Leave")).isDisplayed();
	}
	public void Key3() {
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("key3");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Time")).isDisplayed();
	}
	public void Key4() {
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("key4");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Recruitment")).isDisplayed();
	}
	public void Key5() {
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("key5");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Performance")).isDisplayed();
}
	public void Key6() {
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("key6");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Dashboard")).isDisplayed();
}
	public void Key7() {
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("key7");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Directory")).isDisplayed();
	}
	public void Key8() {
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("key8");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Maintenance")).isDisplayed();
	}
	public void Key9() {
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("key9");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Buzz")).isDisplayed();
		
	}
}