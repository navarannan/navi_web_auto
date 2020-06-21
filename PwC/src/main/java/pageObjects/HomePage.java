package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import com.cucumber.listener.Reporter;

import utils.Constants;

/**
 * Page Class for Home Page of the application
 */
public class HomePage extends BasePage {

	/**
	 * Page Objects on the Home Page
	 */

	public @FindBy(xpath = "//a[@class=\"flex-next\"]") WebElement next;
	public @FindBy(xpath = "//a[@class=\"flex-prev\"]") WebElement previous;
	public @FindAll({ @FindBy(xpath = "//div[@id=\"banners\"]/div[2]/ul/li[2]/div") }) List<WebElement> banners;
	public @FindBy(xpath = "//*[@id=\"wrapper\"]/header/div[1]/div/i[2]") WebElement search;
	public @FindBy(xpath = "//*[@id=\"search-input\"]") WebElement searchBar;
	public @FindBy(xpath = "//*[@id=\"wrapper\"]/header/div[1]/div/i[1]") WebElement hamburgerMenu;
	public @FindBy(linkText = "Contact us") WebElement contactUs;

	public HomePage() {
		super();
	}
	
	/**
	 * Accessing Various Webelements on the Page.
	 * @throws IOException 
	 */
	
	public HomePage getHomePage() throws IOException {
		Reporter.addStepLog("Accessing PWC Homepage");
		driver.get(Constants.HOME_PAGE_URL);
		return new HomePage();
	}
	public HomePage clickNext() {
		waitForElementVisibilityAndClick(next, 15, "Next");
		return new HomePage();
	}

	public HomePage clickPrevious() {
		waitForElementVisibilityAndClick(previous, 15, "Previous");
		return new HomePage();
	}

	public int numberOfFeaturedArticles() {
		return banners.size();
	}

	public HomePage clickSearch() {
		waitForElementVisibilityAndClick(search, 15, "Search");
		return new HomePage();
	}

	public HomePage performSearch(String searchString) {
		waitForElementVisibilityAndSendKeys(searchBar, 15, searchString);
		return new HomePage();
	}

	public HomePage submitSearch() {
		searchBar.sendKeys(Keys.ENTER);
		return new HomePage();
	}

	public HomePage clickhamburgerMenu() {
		waitForElementVisibilityAndClick(hamburgerMenu, 15, "hamburgerMenu");
		return new HomePage();
	}

	public HomePage selectContactUs() {
		waitForElementVisibilityAndClick(contactUs, 15, "contactUs");
		return new HomePage();
	}

	
	

}
