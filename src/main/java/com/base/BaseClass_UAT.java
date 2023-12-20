package com.base;

import java.util.Random;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.utils.PropertyUtils;

public class BaseClass_UAT {

	public static WebDriver driver = null;

	public static ExtentReports report= null;
	public static ExtentSparkReporter spark=null;
	public static ExtentTest test=null;

	Logger log = Logger.getLogger(BaseClass_UAT.class);

	/**
	 * use this method for cross browsing testing
	 * @throws Exception
	 */
	public void initialization() throws Exception {

		String browserName = PropertyUtils.readProperties("browser");

		if(browserName.equals("Chrome")) {
			driver = new ChromeDriver();
		}

		if(browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}

		if(browserName.equals("Microsoft Edge")) {
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(PropertyUtils.readProperties("Url"));

	}

	/**
	 * this method use for ExtentReport
	 */
	public void reportInit() {
		report = new ExtentReports();
		spark = new ExtentSparkReporter(System.getProperty("user.dir")+"/target/ExtentReports.html");
		report.attachReporter(spark);
	}


	/**
	 * use this method for hover to element
	 * @param driver
	 * @param element
	 */
	public void selectElementfromInputDropdown(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();

	}

	/**
	 * use this method for send text
	 * @param element
	 * @param value
	 */
	public void sendtext(WebElement element, String value) {
		element.clear();
		try {
			element.sendKeys(value);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	/**
	 * use this method for select dropDown
	 * @param element
	 */
	public void selectFromDropDown(WebElement element) {
		Select select = new Select(element);
		try {
			select.selectByIndex(2);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	/**
	 * Use this method for Ganerate Random Mobile Number
	 * @return
	 */
	public String generateRandomMobileNumber() {

		Random random = new Random();
		StringBuilder mobileNumber = new StringBuilder();

		// Ensure the mobile number starts with a digit between 7 and 9 (for example, like a real mobile number)
		mobileNumber.append(random.nextInt(3) + 7);

		// Add the remaining 9 digits
		for (int i = 0; i < 9; i++) {
			mobileNumber.append(random.nextInt(10));
		}

		return mobileNumber.toString();
	}

	/**
	 * use this method for generate random vehicle number
	 * @return
	 */
	public String generateRandomVehicleNumber() {
		Random random = new Random();
		StringBuilder vehicleNumber = new StringBuilder("GJ-01-");

		// Add two uppercase letters (e.g., AB)
		vehicleNumber.append((char) (random.nextInt(26) + 'A'));
		vehicleNumber.append((char) (random.nextInt(26) + 'A'));

		// Add four random digits (e.g., 1111)
		for (int i = 0; i < 4; i++) {
			vehicleNumber.append(random.nextInt(10));
		}

		return vehicleNumber.toString();
	}

	public String generateRandomName() {
		Random random = new Random();
		int nameCount = 1 + random.nextInt(3); // Random name count between 1 and 3
		StringBuilder randomNames = new StringBuilder();

		for (int i = 0; i < nameCount; i++) {
			if (i > 0) {
				randomNames.append(' '); // Add space between names
			}
			int nameLength = 5 + random.nextInt(6); // Random name length between 5 and 10 characters
			StringBuilder randomName = new StringBuilder();

			for (int j = 0; j < nameLength; j++) {
				char randomChar = (char) (random.nextInt(26) + 'A'); // Generates random uppercase letter
				randomName.append(randomChar);
			}

			randomNames.append(randomName);
		}

		return randomNames.toString();
	}

}
