package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CreateLeadTeastCase 
{
@Test
public void CreateLead() throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prakash\\Downloads\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps");
	driver.manage().window().maximize();	
	
	PageFactory.initElements(driver, LoginPageObjects.class);
	
	LoginPageObjects.username.sendKeys("DemoSalesManager");
	LoginPageObjects.password.sendKeys("crmsfa");
	LoginPageObjects.submit.click();	
	LoginPageObjects.crmsfa.click();
	
	
	PageFactory.initElements(driver, CreateLeadObjects.class);
	
	
	CreateLeadObjects.clickCreateLead.click();
	CreateLeadObjects.enterCompanyName.sendKeys("Kekraan Mekraan");
	CreateLeadObjects.firstName.sendKeys("ABCD");
	CreateLeadObjects.lastName.sendKeys("ZYXW");
	CreateLeadObjects.clickCreateButton.click();
}	
}
