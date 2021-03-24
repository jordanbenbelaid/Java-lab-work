package stepdefs;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleKittens {

	private static WebDriver driver;
	private static String URL = "https://www.google.com";
	
	
	@Before
	public static void init() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1366, 768));
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Given("^I can open Google$")
	public void i_can_open_Google() {
	    driver.get(URL);
	    assertEquals("Google", driver.getTitle());
	}

	@When("^I search for kittens$")
	public void i_search_for_kittens() {
	    WebElement input = driver.findElement(By.name("q"));
	    input.sendKeys("kittens");
	    input.submit();
	    assertEquals("kittens - Google Search", driver.getTitle());
	}

	@Then("^kittens should be returned$")
	public void kittens_should_be_returned() {
		WebElement input = driver.findElement(By.name("q"));
		input.clear();
		driver.getPageSource().contains("kittens");
	}
	
	@When("^I search for puppies$")
	public void i_search_for_puppies() {
		WebElement input = driver.findElement(By.name("q"));
	    input.sendKeys("puppies");
	    input.submit();
	    assertEquals("puppies - Google Search", driver.getTitle());
	}

	@Then("^puppies should be returned$")
	public void puppies_should_be_returned() {
		WebElement input = driver.findElement(By.name("q"));
		input.clear();
		driver.getPageSource().contains("puppies");
	}

}
