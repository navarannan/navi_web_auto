package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WebAutomation.PwC.BasePage;

public class HomePage extends BasePage {

//	public WebDriver driver;

	@FindBy(xpath = "//a[@class=\"flex-next\"]")
	WebElement next;

	@FindBy(xpath = "//a[@class=\"flex-prev\"]")
	WebElement previous;

	@FindAll({ @FindBy(xpath = "//div[@id=\"banners\"]/div[2]/ul/li[2]/div") })
	List<WebElement> banners;

	@FindBy(xpath = "//*[@id=\"wrapper\"]/header/div[1]/div/i[2]")
	WebElement search;

	@FindBy(xpath = "//*[@id=\"search-input\"]")
	WebElement searchBar;
	
	@FindBy(xpath = "//*[@id=\"wrapper\"]/header/div[1]/div/i[1]")
	WebElement hamburgerMenu;

	@FindBy(linkText = "Contact us")
	WebElement contactUs;

	public HomePage(WebDriver driver) {
//		  this.driver = driver;
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public WebElement clickNext() {
		System.out.println("In Here");
		return next;
	}

	public WebElement clickPrevious() {
		return previous;
	}

	public int numberOfFeaturedArticles() {
		return banners.size();
	}

	public WebElement clickSearch() {
		return search;
	}

	public WebElement performSearch() {
		return searchBar;
	}
	
	public WebElement clickhamburgerMenu() {
		return hamburgerMenu;
	}
	
	public WebElement selectContactUs() {
		return contactUs;
	}
	

}
