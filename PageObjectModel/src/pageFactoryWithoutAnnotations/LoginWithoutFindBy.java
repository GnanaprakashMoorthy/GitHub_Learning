package pageFactoryWithoutAnnotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginWithoutFindBy {
	
	public static WebElement txtUsername;
	public static WebElement txtPassword;
	public static WebElement btnLogin;
	
    @Test
	public void Login() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prakash\\Downloads\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	driver.manage().window().maximize();
	
	PageFactory.initElements(driver, LoginWithoutFindBy.class);
	
	txtUsername.sendKeys("Admin");
	txtPassword.sendKeys("admin123");
	btnLogin.click();

}
}