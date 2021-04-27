package ai.eezy.logintest;

import java.util.List;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import ai.eezy.generics.BaseTest;
import ai.eezy.pages.BotHomePage;
import ai.eezy.pages.EmailSignUpSecondPage;
import ai.eezy.pages.EmailSignupFirstPage;
import ai.eezy.pages.LogInToeezyPage;
import ai.eezy.pages.LoginHomePage;
import ai.eezy.pages.MoreSignUpoptionPage;
import ai.eezy.pages.SignUpForeezyPage;
import ai.eezy.pages.WelcomeToeezyPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.functions.ExpectedCondition;
/**
 * 
 * @author Rajiv
 *
 */
public class LoginTest extends BaseTest{
	@Test
	public void login() throws Throwable {
		loginToApp(file.getDataFromPropertFile("email"), file.getDataFromPropertFile("password"));
		LoginHomePage loginHome=new LoginHomePage(driver);
		try{
			loginHome.getLaterBtn().click();
		}catch (Exception e) {
			// TODO: handle exception
		}
		pageutil.scroll(driver, .5, .5, .3, .8);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(loginHome.getTemperatureTxt()));
		Assert.assertTrue(loginHome.getTemperatureTxt().isDisplayed());

	}
}
