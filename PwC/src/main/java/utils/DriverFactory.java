package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import pageObjects.ContactUsPage;
import pageObjects.HomePage;
import pageObjects.SearchResultsPage;
import pageObjects.BasePage;


/**
 * Reads the properties file and instantiates the Webdriver for respective
 * browser type
 */
public class DriverFactory {

	public static SearchResultsPage searchResultsPage;
	public static ContactUsPage contactUsPage;
	public static HomePage homePage;
	public static BasePage basePage;

	public static WebDriver driver;
	

	public WebDriver getDriver() throws IOException { //added from eclipse automatically, is it needed becasue we have try catch???
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + Constants.CONFIG_PROPERTIES_DIRECTORY);
			Properties prop = new Properties();
			prop.load(fis);
			String browserName = prop.getProperty("browser");

			if (browserName.equals("chrome") && null == driver) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + Constants.CHROME_DRIVER_DIRECTORY);
				driver = new ChromeDriver();

			} else if (browserName.equals("firefox") && null == driver) {

			} else if (browserName.equals("ie") && null == driver) {

			}
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("Unable to launch browser"+e.getMessage());
		} finally {
			searchResultsPage = PageFactory.initElements(driver, SearchResultsPage.class);
			contactUsPage= PageFactory.initElements(driver, ContactUsPage.class);
			homePage = PageFactory.initElements(driver, HomePage.class);
			basePage = PageFactory.initElements(driver, BasePage.class);
			PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);
		}
		return driver;
	}

}
