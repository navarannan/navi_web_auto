package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WebAutomation.PwC.BasePage;

public class SearchResultsPage extends BasePage {

//	public WebDriver driver;

	@FindAll({ @FindBy(xpath = "//*[@id=\"wrapper\"]/section[2]/div/div") })
	List<WebElement> searchResults;

	public SearchResultsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public int numberOfSearchResults() {
		return searchResults.size();
	}

}
