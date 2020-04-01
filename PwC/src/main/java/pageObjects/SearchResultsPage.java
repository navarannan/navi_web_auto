package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

/**
 * Page Class for Search Results Page
 */

public class SearchResultsPage extends BasePage {

	/**
	 * Page Objects on the Search Results Page
	 */
	@FindAll({ @FindBy(xpath = "//*[@id=\"wrapper\"]/section[2]/div/div") }) List<WebElement> searchResults;


	public SearchResultsPage() {
		super();
	}

	/**
	 * Accessing Various Webelements on the Page.
	 */
	public int numberOfSearchResults() {
		return searchResults.size();
	}

}
