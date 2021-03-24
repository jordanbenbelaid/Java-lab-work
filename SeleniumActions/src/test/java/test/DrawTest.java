package test;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.HomePage;

public class DrawTest {

	private static WebDriver driver;
	HomePage hp = PageFactory.initElements(driver, HomePage.class);
	Actions action = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver, 7);
	
	@BeforeClass
	public static void init() {
	System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
	
	ChromeOptions fOptions = new ChromeOptions();
	fOptions.setHeadless(false);
	
	fOptions.setCapability("profile.default_content_setting_values.cookies", 2);
	fOptions.setCapability("network.cookie.cookieBehavior", 2);
	fOptions.setCapability("profile.block_third_party_cookies", true);
	
	driver = new ChromeDriver();
	driver.manage().window().setSize(new Dimension(1366, 768));
	
	}
	
	@Before
	public void setup() {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(hp.URL);
	}
	
	@AfterClass
	public static void tearDown() {
		driver.quit();
	}
	
	@Test
	public void drawInitialsTest() throws InterruptedException {
		//sorts out selecting the brush
		hp.selectBrush();
		WebElement canvas = driver.findElement(By.cssSelector("#catch"));
		
		//we now need the actions to make it write our initials
		
		//J
		action.moveToElement(canvas).clickAndHold().moveByOffset(0, 200)
		.moveByOffset(-80, 0).moveByOffset(0, -80).click().moveToElement(canvas, 0, 0).build().perform();
		
		action.moveToElement(canvas).clickAndHold().moveByOffset(80,0)
		.moveByOffset(-160, 0).click().moveToElement(canvas, 0, 0).build().perform();
		
		Thread.sleep(2000);
		//B
		action.moveByOffset(150,0).clickAndHold().moveByOffset(0,200)
		.moveByOffset(100, 0).moveByOffset(0, -100).moveByOffset(-100, 0)
		.moveByOffset(75, 0).moveByOffset(0, -100).moveByOffset(-75, 0).build().perform();
		
		Thread.sleep(2000);
	}
	
}
