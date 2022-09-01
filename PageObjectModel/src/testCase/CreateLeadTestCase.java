package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjectsForElements.CreateLeadObjects;
import pageObjectsForElements.LoginPageObjects;

public class CreateLeadTestCase {

//	public static void main(String[] args) {
	@Test
	public void login() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prakash\\Downloads\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		CreateLeadObjects createLeadObjects = new CreateLeadObjects(driver);
		
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		
		LoginPageObjects.username(driver).sendKeys("DemoSalesManager");
		LoginPageObjects.password(driver).sendKeys("crmsfa");
		LoginPageObjects.submit(driver).click();
		LoginPageObjects.crmsfa(driver).click();
		
		
		CreateLeadObjects.clickCreateLead(driver).click();
		CreateLeadObjects.enterCompanyName(driver).sendKeys("Kekraan Mekraan");
		CreateLeadObjects.firstName(driver).sendKeys("ABCD");
		CreateLeadObjects.lastName(driver).sendKeys("ZYXW");
		CreateLeadObjects.clickCreateButton(driver).click();
	}
}
