package stepDefenitions;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.ContactUsPage;
import pageObjects.HomePage;
import pageObjects.SearchResultsPage;
import resources.Base;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class stepDefenition extends Base {

	HomePage home;
	SearchResultsPage searchRP;
	ContactUsPage contactUs;

	public static Logger log = LogManager.getLogger(stepDefenition.class.getName());
	
	@Before
	public void init() throws Throwable{
		driver = initializeDriver();
	}

	@Given("^I navigate to the PwC Digital Pulse website$")
	public void i_navigate_to_the_PwC_Digital_Pulse_website() throws Throwable {
		log.info("Navigating to PWC homePage");
		driver.get(home_page_url);
	}

	@When("^I am viewing the 'Home' page$")
	public void i_am_viewing_the_page() throws Throwable {
		home = new HomePage(driver);
		assertEquals(home.getPageURL(), home_page_url);

	}

	@Then("^I am presented with a carousel displaying \"([^\"]*)\" featured articles$")
	public void i_am_presented_with_a_carousel_displaying_featured_articles(String arg) throws Throwable {
		assertEquals(home.numberOfFeaturedArticles(), Integer.parseInt(arg));
	}

	@Then("^Clicking the 'Next' button on the carousel will load the next \"([^\"]*)\" featured articles$")
	public void clicking_the_Next_button_on_the_carousel_will_load_the_next_featured_articles(String arg)
			throws Throwable {
		home.clickNext().click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		assertEquals(home.numberOfFeaturedArticles(), Integer.parseInt(arg));

	}

	@Then("^Clicking the 'Previous' button on the carousel will load the previous \"([^\"]*)\" featured articles$")
	public void clicking_the_Previous_button_on_the_carousel_will_load_the_previous_featured_articles(String arg)
			throws Throwable {
		home.clickPrevious().click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		assertEquals(home.numberOfFeaturedArticles(), Integer.parseInt(arg));
	}

	@When("^I click on the 'Magnifying glass' icon to perform a search$")
	public void i_click_on_the_Magnifying_glass_icon_to_perform_a_search() throws Throwable {
		home = new HomePage(driver);
		home.clickSearch().click();
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//		}
	}

	@When("^I enter the text \"([^\"]*)\"$")
	public void i_enter_the_text_Single_page_applications(String arg) throws Throwable {
//		home.performSearch().sendKeys(arg);
		waitForElementVisibilityAndSendKeys(home.performSearch(),15,arg);
//		waitForElementVisibilityAndClick(home.selectContactUs(), 15, "contactUs");
	}

	@When("^I submit the search$")
	public void i_submit_the_search() throws Throwable {
		home.performSearch().sendKeys(Keys.ENTER);
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//		}
	}

	@Then("^I am taken to the search results page$")
	public void i_am_taken_to_the_search_results_page() throws Throwable {
		assertEquals(home.getPageTitle(), "You searched for Single page applications - Digital Pulse");

	}

	@Then("^I am presented with at least \"(\\d+)\" search result$")
	public void i_am_presented_with_at_least_search_result(int arg) throws Throwable {
		searchRP = new SearchResultsPage(driver);
		assertTrue(arg <= searchRP.numberOfSearchResults());
	}
	
	@When("^I select 'Contact us' from the hamburger menu$")
	public void i_select_from_the_hamburger_menu() throws Throwable {
		home = new HomePage(driver);
		home.clickhamburgerMenu().click();
		waitForElementVisibilityAndClick(home.selectContactUs(), 15, "contactUs");
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//		}
//		home.selectContactUs().click();
	}

	@Then("^I am taken to the \"([^\"]*)\" page$")
	public void i_am_taken_to_the_page(String arg) throws Throwable {
		assertEquals(home.getPageTitle(), contact_us_page_title);
	}

	@Then("^I am presented with the below options for contacts$")
	public void i_am_presented_with_the_below_options_for_contacts(DataTable dt) throws Throwable {
		contactUs = new ContactUsPage(driver);
		List<Map<String, String>> list = dt.asMaps(String.class, String.class);
		List<String> webLinks = new ArrayList<String>();
		for(int i=0;i<list.size();i++) {
			if(!(list.get(i).get("Contact Link").equals(""))) {
				webLinks.add(list.get(i).get("Contact Link"));
			}
		}
	    List<WebElement> links = contactUs.getLink();
	    for(int i=0;i<links.size();i++) {
	    	assertEquals(links.get(i).getAttribute("href"), webLinks.get(i));
	    }
	}

	@After
	public void cleanUp() {
		driver.close();
	}
}
