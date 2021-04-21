package ai.eezy.logintest;

import org.testng.Assert;
import org.testng.annotations.Test;

import ai.eezy.generics.BaseTest;
import ai.eezy.pages.SignUpForeezyPage;
import ai.eezy.pages.WelcomeToeezyPage;
/**
 * 
 * @author Rajiv
 *
 */
public class LoginRedirectingToSignupTest extends BaseTest{
	@Test(groups = "Smoke")
	public void loginToSingup() throws Throwable {
		String expectedText=excelLib.getExcelData("WelcomePage", 1, 2);
		WelcomeToeezyPage welcome=new WelcomeToeezyPage(driver);
		welcome.getLocationAllowbtn(driver).click();
		welcome.getLoginBtn(driver).click();
		SignUpForeezyPage signup=new SignUpForeezyPage(driver);
		String actualText = signup.getSignUpMessage(driver).getText();
		Assert.assertEquals(actualText, expectedText);
	}

}
