package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateLeadObjects {

	@FindBy(linkText = "Create Lead")
	public static WebElement clickCreateLead;

	@FindBy(id = "createLeadForm_companyName")
	public static WebElement enterCompanyName;

	@FindBy(id = "createLeadForm_firstName")
	public static WebElement firstName;

	@FindBy(id = "createLeadForm_lastName")
	public static WebElement lastName;

	@FindBy(name = "submitButton")
	public static WebElement clickCreateButton;
}

