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

public class LoginTest extends BaseTest{
	@Test
	public void login() throws Throwable {
		String name="Rajiv";
		/*Allow Location Access*/
		WelcomeToeezyPage setup=new WelcomeToeezyPage(driver);
		setup.getLocationAllowbtn(driver).click();
		setup.getLoginBtn(driver).click();
		SignUpForeezyPage singin=new SignUpForeezyPage(driver);
		singin.getMoreSignUpoptnLink(driver).click();
		MoreSignUpoptionPage option=new MoreSignUpoptionPage(driver);
		option.getEmailSignUpoptnLink(driver).click();
		LogInToeezyPage login=new LogInToeezyPage(driver);
		login.getLoginEmailtxb().sendKeys("abc76@gmail.com");
		login.getLoginPasswordtxb().sendKeys("Kikki54554");
		login.getContinueBtn().click();
		LoginHomePage loginHome=new LoginHomePage(driver);
		loginHome.getLaterBtn().click();
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		pageutil.scroll(driver, .5, .5, .3, .8);
		wait.until(ExpectedConditions.visibilityOf(loginHome.getTemperatureTxt()));
		Assert.assertTrue(loginHome.getTemperatureTxt().isDisplayed());

	}
}
