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

	public HomePage() throws IOException {
		super();
	}
	
	/**
	 * Accessing Various Webelements on the Page.
	 * @throws IOException 
	 */
	
	public HomePage getHomePage() throws IOException {
		Reporter.addStepLog("Accessing PWC Homepage");
		getDriver().get(Constants.HOME_PAGE_URL);
		return new HomePage();
	}
	
	public HomePage clickNext() throws InterruptedException, IOException {
		waitAndClickElement(next);
		return new HomePage();
	}

	public HomePage clickPrevious() throws InterruptedException, IOException {
		waitAndClickElement(previous);
		return new HomePage();
	}

	public int numberOfFeaturedArticles() {
		return banners.size();
	}

	public HomePage clickSearch() throws InterruptedException, IOException {
		waitAndClickElement(search);
		return new HomePage();
	}

	public HomePage performSearch(String searchString) throws Exception {
		sendKeysToWebElement(searchBar, searchString);
		return new HomePage();
	}

	public HomePage submitSearch() throws IOException {
		searchBar.sendKeys(Keys.ENTER);
		return new HomePage();
	}

	public HomePage clickhamburgerMenu() throws InterruptedException, IOException {
		waitAndClickElement(hamburgerMenu);
		return new HomePage();
	}

	public HomePage selectContactUs() throws InterruptedException, IOException {
		waitAndClickElement(contactUs);
		return new HomePage();
	}
}
