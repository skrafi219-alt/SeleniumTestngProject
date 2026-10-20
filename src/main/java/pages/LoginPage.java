package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class LoginPage extends BasePage {
	
	private By username=By.id("user-name");
	private By password=By.id("password");
	private By loginButton=By.id("login-button");
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public void enterUsername(String user) {
		driver.findElement(username).sendKeys(user);
	}
	
	public void enterPassword(String pw) {
		driver.findElement(password).sendKeys(pw);
	}
	
	public void clickLogin() {
		driver.findElement(loginButton).click();
	}
}
