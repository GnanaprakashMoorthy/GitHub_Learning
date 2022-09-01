package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class LoginTestCase {
	
	@Test
	public void Login() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prakash\\Downloads\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps");
	driver.manage().window().maximize();
	
	PageFactory.initElements(driver, LoginPageObjects.class);
	
	LoginPageObjects.username.sendKeys("DemoSalesManager");
	LoginPageObjects.password.sendKeys("crmsfa");
	LoginPageObjects.submit.click();
	LoginPageObjects.crmsfa.click();
	}
}
