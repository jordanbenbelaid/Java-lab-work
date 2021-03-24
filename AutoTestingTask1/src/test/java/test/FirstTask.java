package test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import helper.UtilHelper;

public class FirstTask {

	private static String URL = "http://www.thedemosite.co.uk";
	private static WebDriver driver;
	private static ExtentReports report;
	private static ExtentTest test;

	@BeforeClass
	public static void init() {
		//new ExtentReport("location", override/replace existing)
		report = new ExtentReports("src/test/resources/reports/reports.html", true);
		//create new test 'name'
		test = report.startTest("Demo");
		
		//identifies which driver we are using
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		ChromeOptions fOptions = new ChromeOptions();
		//sets our driver window headless
		fOptions.setHeadless(false);
		
		//configuration for cookie managements, where 2/true is on
		fOptions.setCapability("profile.default_content_setting_values.cookies", 2);
		fOptions.setCapability("network.cookie.cookieBehavior", 2);
		fOptions.setCapability("profile.block_third_party_cookies", true);
		
		driver = new ChromeDriver(fOptions);
		driver.manage().window().setSize(new Dimension(1366, 768));
	}
	
	@Before
	public void setup() {
//		driver = new ChromeDriver();
//		driver.manage().window().setSize(new Dimension(1366, 768));
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		try {
			driver.get(URL);
		} catch (TimeoutException e) {
			System.out.println("Page: " + URL + " did not load within 30 seconds!");
		}

	}
	
	@Test
	public void AddUserTest() throws Exception {
//		new WebDriverWait(driver, 5).until(ExpectedConditions.presenceOfElementLocated(By.className("")));
		
		driver.get(URL + "/addauser.php");
		
		UtilHelper.screenShot(driver, "src/test/resources/reports/shot.png");
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("TestUsername");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("TestPassword");
		
		WebElement save = driver.findElement(By.name("FormsButton2"));
		save.click();

		UtilHelper.screenShot(driver, "src/test/resources/reports/shot.png");
	}
	
	@Test 
	public void LoginAsMadeUserTest() throws Exception {
		AddUserTest();
		
		driver.get(URL + "/login.php");
//	WebDriverWait wait = new WebDriverWait(driver, 10);
//		
		
		UtilHelper.screenShot(driver, "src/test/resources/reports/shot.png");
		
//	WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));	
	WebElement username = driver.findElement(By.name("username"));
	username.sendKeys("TestUsername");
	
//	WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));	
	WebElement password = driver.findElement(By.name("password"));
	password.sendKeys("TestPassword");
	
//	WebElement save = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("FormsButton2")));	
	WebElement save = driver.findElement(By.name("FormsButton2"));
	save.click();
	
	
	WebElement madeUser = driver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > blockquote > blockquote:nth-child(2)"));
	System.out.println(madeUser.toString());
	
	UtilHelper.screenShot(driver, "src/test/resources/reports/shot.png");
	}
	
	@AfterClass
	public static void TearDown() {
		driver.quit();
		
		//lets report know test has been completed
		report.endTest(test);
		//sends to report 
		report.flush();
		//close down
		report.close();
	}
	
//	@After
//	public void CloseDown() {
//		driver.close();
//	}
}
