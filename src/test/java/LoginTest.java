import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest {
	
	@Test
	public void loginApp() {
		
		WebDriver driver = new ChromeDriver();
		
		try {
			
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			
			LoginPage loginPage=new LoginPage(driver);
			
			loginPage.enterUsername("standard_user");
			loginPage.enterPassword("secret_sauce");
			loginPage.clickLogin();
			
			Assert.assertTrue(driver.getCurrentUrl().contains("inventory.htoml"),"Lohin Failed");
			
		}finally {
			driver.quit();
		}
	}

}
