package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Base {

	public WebDriver driver;
	public Properties prop;
	public Wait<WebDriver> wait;
	public static String home_page_url;
	public static String contact_us_page_title;
	public static String browserName;
	public static String chromeDriverPath;

	public WebDriver initializeDriver() throws IOException {
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\data.properties");
		prop = new Properties();
		prop.load(fis);
		readPropertiesFile();

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", chromeDriverPath);
			driver = new ChromeDriver();

		} else if (browserName.equals("firefox")) {

		} else if (browserName.equals("ie")) {

		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 15);
		return driver;
	}

	public void readPropertiesFile() {

		browserName = prop.getProperty("browser");
		home_page_url = prop.getProperty("home_page_url");
		contact_us_page_title = prop.getProperty("contact_us_page_title");
		chromeDriverPath = prop.getProperty("chromeDriverPath");
	}

	public void waitForElementVisibilityAndClick(WebElement element, int timeOut, String elementName) {
		try {
			wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
					.pollingEvery(Duration.ofMillis(1000)).ignoring(NoSuchElementException.class);
			wait.until(ExpectedConditions.visibilityOf(element));
			element.click();
		} catch (Exception e) {
		}
	}

	public void waitForElementVisibilityAndSendKeys(WebElement element, int timeOut, String text) {
		try {
			wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
					.pollingEvery(Duration.ofMillis(1000)).ignoring(NoSuchElementException.class);
			wait.until(ExpectedConditions.visibilityOf(element));
			element.sendKeys(text);
		} catch (Exception e) {
		}
	}
}
