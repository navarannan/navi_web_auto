package pageObjects;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import WebAutomation.PwC.BasePage;

/**
 * Page Class for Contact US page
 */

public class ContactUsPage extends BasePage{
	
	/**
	 * Page Objects on the Contact US Page
	 */
	@FindAll({ @FindBy(xpath = "//a[text()=\"Contact\"]") })
	List<WebElement> contactUsOptions;

	/**
	 * Initiate Page Object Factory.
	 */
	public ContactUsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// For Fluent Waiting
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);
	}

	/**
	 * Accessing Various Webelements on the Page.
	 */
	public List<WebElement> getLink() {
			return contactUsOptions;
	}
}
