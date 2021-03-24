package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUser {

	@FindBy(name = "username")
	WebElement userName;
	
	@FindBy(name = "passWord")
	WebElement passWord;
	
	public void createUser(String username, String password) {
		userName.sendKeys(username);
		passWord.sendKeys(password);
		passWord.submit();
	}
}
