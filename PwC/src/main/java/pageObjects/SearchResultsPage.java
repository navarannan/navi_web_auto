package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WebAutomation.PwC.BasePage;

/**
 * Page Class for Search Results Page
 */

public class SearchResultsPage extends BasePage {

	/**
	 * Page Objects on the Search Results Page
	 */
	@FindAll({ @FindBy(xpath = "//*[@id=\"wrapper\"]/section[2]/div/div") })
	List<WebElement> searchResults;

	/**
	 * Initiate Page Object Factory.
	 */
	public SearchResultsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	/**
	 * Accessing Various Webelements on the Page.
	 */
	public int numberOfSearchResults() {
		return searchResults.size();
	}

}
