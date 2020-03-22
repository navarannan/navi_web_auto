package pageObjects;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import WebAutomation.PwC.BasePage;


public class ContactUsPage extends BasePage{
	
	
//	@FindAll({ @FindBy(linkText = "Contact") })
	@FindAll({ @FindBy(xpath = "//a[text()=\"Contact\"]") })
	
	List<WebElement> contactUsOptions;

	public ContactUsPage(WebDriver driver) {
//		  this.driver = driver;
		super(driver);
		PageFactory.initElements(driver, this);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);
	}
	
	public List<WebElement> getLink() {
			return contactUsOptions;
	}


}
