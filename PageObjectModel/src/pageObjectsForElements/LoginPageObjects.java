package pageObjectsForElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
public static WebElement username(WebDriver driver) 
{
	return driver.findElement(By.id("username"));
}

public static WebElement password(WebDriver driver) 
{
	return driver.findElement(By.id("password"));
}

public static WebElement submit(WebDriver driver) 
{
	return driver.findElement(By.className("decorativeSubmit"));
}

public static WebElement crmsfa(WebDriver driver) 
{
	return driver.findElement(By.linkText("CRM/SFA"));
}

}
