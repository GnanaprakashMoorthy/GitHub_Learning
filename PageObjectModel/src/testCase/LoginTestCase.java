package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjectsForElements.LoginPageObjects;

public class LoginTestCase {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prakash\\Downloads\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps");
	driver.manage().window().maximize();
	
//	LoginPageObjects loginPageObjects = new LoginPageObjects();
	
	LoginPageObjects.username(driver).sendKeys("DemoSalesManager");
	LoginPageObjects.password(driver).sendKeys("crmsfa");
	LoginPageObjects.submit(driver).click();
	LoginPageObjects.crmsfa(driver).click();
	
	

	
	/*
	 * WebElement username = driver.findElement(By.id("username"));
	 * username.sendKeys("DemoSalesManager");
	 * 
	 * WebElement password = driver.findElement(By.id("password"));
	 * password.sendKeys("crmsfa");
	 * 
	 * WebElement submit = driver.findElement(By.className("decorativeSubmit"));
	 * submit.click();
	 * 
	 * WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
	 * crmsfa.click();
	 */
	

	}

}
