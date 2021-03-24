package search;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import helper.UtilHelper;

public class GoogleSearch {

	private static String URL = "https://www.google.com";
	private static WebDriver driver;
	private static ExtentReports report;
	private static ExtentTest test;

	@BeforeClass
	public static void init() {
		//new ExtentReport("location", override/replace existing)
		report = new ExtentReports("src/test/resources/reports", true);
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
	public void foundation() {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(URL + "/images");
	}
	
	@Ignore
	@Test
	public void GoogleURLTest() {
		//GET http request
		driver.get(URL);
		//assert correct page
		assertEquals("https://www.google.com/", driver.getCurrentUrl());
		
		//navigation to specific URL passed
		driver.navigate().to(URL);
		//returns a single web element
		WebElement ele = driver.findElement(By.id("Overview"));
		//returns multiple elements
		driver.findElements(By.cssSelector("#Overview"));
		//attempts to click on specific element
		ele.click();
		driver.findElement(By.id("Overview")).click();
		//send keys input to an applicable element
		driver.findElement(By.name("username")).sendKeys("My Name");
		//grabs  associated attribute of the element in question
		List<WebElement> list = driver.findElements(By.name("name"));
		for (WebElement e:list) {
			e.getAttribute("href");
		}
	}	
	
	@Ignore
	@Test
	public void GoogleKittensSearchTest() {
		System.out.println(driver.getCurrentUrl());
		WebElement inputBox = driver.findElement(By.name("q"));
		inputBox.sendKeys("Kittens");
		inputBox.submit();
		
		WebElement results = new WebDriverWait(driver, 5)
				.until(ExpectedConditions.presenceOfElementLocated(By.className("islrc")));
		
		List<WebElement> listResults = results.findElements(By.tagName("img"));
		System.out.println(listResults.size());
		
	}
	
	@Test
	public void GoogleDogsSearchTest() throws Exception {
		driver.get(URL + "/images");
		// Locates the input box with name "q"
		WebElement input = driver.findElement(By.name("q"));

		// Sends "Kittens" to input box
		input.sendKeys("Dogs");
		UtilHelper.screenShot(driver, "src/test/resources/reports/shot.png");
		input.submit();

		// Waits for the search result class to finish loading before attempting to
		// locate
		new WebDriverWait(driver, 5).until(ExpectedConditions.presenceOfElementLocated(By.className("islrc")));

		// Sets the results as result
		WebElement result = driver.findElement(By.className("islrc"));

		// Adds all elements with an img tag to listResult
		List<WebElement> listResult = result.findElements(By.tagName("img"));
		System.out.println(listResult.size());

		// Creates a new action called action
		Actions action = new Actions(driver);

		// Using the action, this will click on the first element in the list
		action.moveToElement(listResult.get(0)).click().perform();
		
		// Captures a shot of the page at this point, you can see the highlighted img, etc
		UtilHelper.screenShot(driver, "src/test/resources/reports/shot.png");
		
		// Using getAttribute we are able to get the src containing a link, copy and paste the output into your browser
		String dogImgURL = listResult.get(3).getAttribute("src").toString();
		System.out.println(dogImgURL);
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
	
	@After
	public void CloseDown() {
		driver.close();
	}
}
