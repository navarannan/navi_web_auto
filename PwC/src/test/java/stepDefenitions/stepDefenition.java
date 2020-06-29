package stepDefenitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.Constants;
import utils.DriverFactory;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;

public class stepDefenition extends DriverFactory {

	public static Logger log = LogManager.getLogger(stepDefenition.class.getName());

	@Given("^I navigate to the PwC Digital Pulse website$")
	public void i_navigate_to_the_PwC_Digital_Pulse_website() throws Throwable {
		// log4j logger can be used for logging. Some automation projects insist on very
		// less logging
		log.info("Navigating to PWC homePage");
		homePage.getHomePage();

	}

	@When("^I am viewing the 'Home' page$")
	public void i_am_viewing_the_page() throws Throwable {

		assertThat(getDriver().getCurrentUrl()).isEqualTo(Constants.HOME_PAGE_URL);

	}

	@Then("^I am presented with a carousel displaying \"([^\"]*)\" featured articles$")
	public void i_am_presented_with_a_carousel_displaying_featured_articles(String arg) throws Throwable {
		assertEquals(homePage.numberOfFeaturedArticles(), Integer.parseInt(arg));
	}

	@Then("^Clicking the 'Next' button on the carousel will load the next \"([^\"]*)\" featured articles$")
	public void clicking_the_Next_button_on_the_carousel_will_load_the_next_featured_articles(String arg) throws Throwable {
		homePage.clickNext();
		assertEquals(homePage.numberOfFeaturedArticles(), Integer.parseInt(arg));

	}

	@Then("^Clicking the 'Previous' button on the carousel will load the previous \"([^\"]*)\" featured articles$")
	public void clicking_the_Previous_button_on_the_carousel_will_load_the_previous_featured_articles(String arg) throws Throwable {
		homePage.clickPrevious();
		assertEquals(homePage.numberOfFeaturedArticles(), Integer.parseInt(arg));
	}

	@When("^I click on the 'Magnifying glass' icon to perform a search$")
	public void i_click_on_the_Magnifying_glass_icon_to_perform_a_search() throws Throwable {
		homePage.clickSearch();
	}

	@When("^I enter the text \"([^\"]*)\"$")
	public void i_enter_the_text_Single_page_applications(String arg) throws Throwable {
		homePage.performSearch(arg);
	}

	@When("^I submit the search$")
	public void i_submit_the_search() throws Throwable {
		homePage.submitSearch();
	}

	@Then("^I am taken to the search results page$")
	public void i_am_taken_to_the_search_results_page() throws Throwable {
		assertEquals(getDriver().getTitle(), Constants.SEARCH_RESULTS_PAGE_TITLE);

	}

	@Then("^I am presented with at least \"(\\d+)\" search result$")
	public void i_am_presented_with_at_least_search_result(int arg) throws Throwable {
		assertTrue(arg <= searchResultsPage.numberOfSearchResults());
	}

	@When("^I select 'Contact us' from the hamburger menu$")
	public void i_select_from_the_hamburger_menu() throws Throwable {
		homePage.clickhamburgerMenu();
		homePage.selectContactUs();
	}

	@Then("^I am taken to the \"([^\"]*)\" page$")
	public void i_am_taken_to_the_page(String arg) throws Throwable {
		assertEquals(getDriver().getTitle(), Constants.CONTACT_US_PAGE_TITLE);

	}

	@Then("^I am presented with the below options for contacts$")
	public void i_am_presented_with_the_below_options_for_contacts(DataTable dt) throws Throwable {
		List<Map<String, String>> list = dt.asMaps(String.class, String.class);
		List<String> webLinks = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {
			if (!(list.get(i).get("Contact Link").equals(""))) {
				webLinks.add(list.get(i).get("Contact Link"));
			}
		}
		List<WebElement> links = contactUsPage.getLink();
		for (int i = 0; i < links.size(); i++) {
			assertEquals(links.get(i).getAttribute("href"), webLinks.get(i));
		}
	}
}
