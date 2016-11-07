package Joomla;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import lombok.Getter;

public class AdminLoginPage {
	@FindBy(name = "username")
	@Getter
	private WebElement usernameTextbox;

	@FindBy(name = "passwd")
	@Getter
	private WebElement passwordTextbox;

	@FindBy(xpath = "//button[contains(.,'Log in')]")
	@Getter
	private WebElement loginButton;
}
