package pageObjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.Duration;
import java.util.Date;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.listener.Reporter;

import utils.Base;
/**
 * Common Utilities 
 */

public class BasePage extends Base {

	protected Wait<WebDriver> wait;
	private static String screenshotName;

	public BasePage() {
		this.wait = new WebDriverWait(driver, 15);
	}
	

	public String getPageURL() {
		return driver.getCurrentUrl();
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	/**
	 * Wait for an element to be visible and click()
	 */
	public void waitForElementVisibilityAndClick(WebElement element, int timeOut, String elementName) {
		try {
			wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
					.pollingEvery(Duration.ofMillis(1000)).ignoring(NoSuchElementException.class);
			wait.until(ExpectedConditions.visibilityOf(element));
			element.click();
		} catch (Exception e) {
			System.out.println("Unable to wait and click on WebElement, Exception: " + e.getMessage());
			Assert.fail("Unable to wait and click on the WebElement, using locator: " + "<" + element.toString() + ">");
		}
	}

	/**
	 * Wait for an element to be visible and set text
	 */
	public void waitForElementVisibilityAndSendKeys(WebElement element, int timeOut, String text) {
		try {
			wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
					.pollingEvery(Duration.ofMillis(1000)).ignoring(NoSuchElementException.class);
			wait.until(ExpectedConditions.visibilityOf(element));
			element.sendKeys(text);
		} catch (Exception e) {
			System.out.println("Unable to locate WebElement: " + "<" + element.toString() + "> and send the following keys: " + text);
			Assert.fail("Unable to send keys to WebElement, Exception: " + e.getMessage());
		}
	}


	public static void captureScreenshot() throws IOException, InterruptedException {
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		screenshotName = returnDateStamp(".jpg");
		FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir") + "\\output\\imgs\\" + screenshotName));
		
		Reporter.addStepLog("Taking a screenshot!");
		Reporter.addStepLog("<br>");
		Reporter.addStepLog("<a target=\"_blank\", href="+ returnScreenshotName() + "><img src="+ returnScreenshotName()+ " height=200 width=300></img></a>");
	}

	public static String returnDateStamp(String fileExtension) {
		Date d = new Date();
		String date = d.toString().replace(":", "_").replace(" ", "_") + fileExtension;
		return date;
	}

	public static String returnScreenshotName() {
		System.out.println((System.getProperty("user.dir") + "\\output\\imgs\\" + screenshotName).toString());
		return (System.getProperty("user.dir") + "\\output\\imgs\\" + screenshotName).toString();
	}
	
	private static void copyFileUsingStream(File source, File dest) throws IOException {
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream(source);
			os = new FileOutputStream(dest);
			byte[] buffer = new byte[1024];
			int length;
			
			while((length = is.read(buffer)) > 0) {
				os.write(buffer, 0, length);
			}
			
		} finally {
			is.close();
			os.close();
		}
	}
	public static void copyLatestExtentReport() throws IOException  {
		Date d = new Date();
		String date = d.toString().replace(":", "_").replace(" ", "_");
		File source = new File(System.getProperty("user.dir") + "\\output\\report.html");
		File dest = new File(System.getProperty("user.dir") + "\\output\\" + date.toString() + ".html");
		copyFileUsingStream(source, dest);
	}

}
