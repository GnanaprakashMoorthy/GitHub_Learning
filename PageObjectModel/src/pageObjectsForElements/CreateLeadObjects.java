package pageObjectsForElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateLeadObjects {
	
	
	
	/*
	 * WebDriver driver; public CreateLeadObjects(WebDriver driver) //Constructor {
	 * this.driver = driver; }
	 */

public static WebElement clickCreateLead(WebDriver driver)
{
	return driver.findElement(By.linkText("Create Lead"));
}

public static WebElement enterCompanyName(WebDriver driver) 
{
	return driver.findElement(By.id("createLeadForm_companyName"));
}

public static WebElement firstName(WebDriver driver) 
{
	return driver.findElement(By.id("createLeadForm_firstName"));
}

public static WebElement lastName(WebDriver driver) 
{
	return driver.findElement(By.id("createLeadForm_lastName"));
}

public static WebElement clickCreateButton(WebDriver driver) 
{
	return driver.findElement(By.name("submitButton"));
}
}
