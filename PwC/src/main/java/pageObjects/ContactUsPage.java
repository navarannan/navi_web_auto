package pageObjects;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

/**
 * Page Class for Contact US page
 */

public class ContactUsPage extends BasePage{
	
	/**
	 * Page Objects on the Contact US Page
	 */
	public @FindAll({ @FindBy(xpath = "//a[text()=\"Contact\"]") }) List<WebElement> contactUsOptions;

	public ContactUsPage() {
		super();
	}

	/**
	 * Accessing Various Webelements on the Page.
	 */
	public List<WebElement> getLink() {
			return contactUsOptions;
	}
}
