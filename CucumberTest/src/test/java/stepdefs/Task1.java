package stepdefs;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Task1 {

private static WebDriver driver;
private static String URLadd = "http://thedemosite.co.uk/addauser.php";
private static String URLlogin = "http://thedemosite.co.uk/login.php";
	
	@Before
	public static void init() {
System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		
		ChromeOptions fOptions = new ChromeOptions();
		fOptions.setHeadless(false);
		
		fOptions.setCapability("profile.default_content_setting_values.cookies", 2);
		fOptions.setCapability("network.cookie.cookieBehavior", 2);
		fOptions.setCapability("profile.block_third_party_cookies", true);
		
		driver = new ChromeDriver(fOptions);
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Given("^I can get to the add user page$")
	public void i_can_get_to_the_add_user_page() {
		driver.get(URLadd);
		assertEquals("http://thedemosite.co.uk/addauser.php", driver.getCurrentUrl());
	}

	@Given("^A jordan and football is created$")
	public void a_jordan_and_football_is_created() {
		
		
	}

	@When("^we input the jordan and football into the fields$")
	public void we_input_the_jordan_and_football_into_the_fields() {
		WebElement input = driver.findElement(By.className("username"));
		input.sendKeys("jordan");
		WebElement input2 = driver.findElement(By.className("password"));
		input2.sendKeys("football");
		 
		WebElement save = driver.findElement(By.className("FormsButton2"));
		save.click();
	}

	@When("^I verify that the login has been created$")
	public void i_verify_that_the_login_has_been_created() {

	}

	@Then("^assert the login works$")
	public void assert_the_login_works() {

	}

	@Given("^A nancy and tennis is created$")
	public void a_nancy_and_tennis_is_created() {

	}

	@When("^we input the nancy and tennis into the fields$")
	public void we_input_the_nancy_and_tennis_into_the_fields() {

	}
}
