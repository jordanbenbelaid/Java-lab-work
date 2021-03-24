package stepdefs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Shopping {

	private static WebDriver driver;
	
	@Before
	public static void init() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Given("^I can access a site$")
	public void i_can_access_a_site(DataTable site) {
		List<String> rows = site.asList(String.class);
		
//		driver.get(rows.get(1).toString());
		driver.get(rows.get(2).toString());
	}

	@When("^I search for clothes$")
	public void i_search_for_clothes(DataTable clothes) throws InterruptedException {
		List<String> row = clothes.asList(String.class);
		
//		WebElement input = driver.findElement(By.id("twotabsearchtextbox"));
//		input.sendKeys(row.get(1).toString());
//		input.submit();
//		Thread.sleep(4000);
//		input.clear();
//		input.sendKeys(row.get(2).toString());
//		input.submit();
		
		WebElement input2 = driver.findElement(By.id("gh-ac"));
		input2.sendKeys(row.get(1).toString());
		input2.submit();
		Thread.sleep(2000);
		
		WebElement input3 = driver.findElement(By.id("gh-ac"));
		input3.clear();
		input3.sendKeys(row.get(2).toString());
		input3.submit();
	}

	@Then("^I will buy something$")
	public void i_will_buy_something() {
//		List<WebElement> results = new WebDriverWait(driver, 5)
//				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("#srp-results")));
//		for(WebElement i : results) {
//			i.findElement(By.cssSelector("li.s-item:nthchild(2)")).getText();
//		}
		
		List<WebElement> results2 = new WebDriverWait(driver, 5)
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("srp-results")));
		for(WebElement i : results2) {
			i.findElement(By.className("s-item__wrapper")).getText();
		}
	}

}
