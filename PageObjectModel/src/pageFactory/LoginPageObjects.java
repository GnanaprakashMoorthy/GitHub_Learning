package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjects {
	
//@FindBy(how=How.ID, using=("username"))	
@FindBy(id="username")
public static WebElement username;

//@FindBy(how=How.ID,using="password")
@FindBy(id="password")
public static WebElement password;

//@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
@FindBy(className="decorativeSubmit")
public static WebElement submit;

@FindBy(linkText="CRM/SFA")
public static WebElement crmsfa;

}
