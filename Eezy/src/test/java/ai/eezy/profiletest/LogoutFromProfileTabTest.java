package ai.eezy.profiletest;

import org.testng.Assert;
import org.testng.annotations.Test;

import ai.eezy.generics.BaseTest;
import ai.eezy.pages.LogInToeezyPage;
import ai.eezy.pages.MoreSignUpoptionPage;
import ai.eezy.pages.SignUpForeezyPage;
import ai.eezy.pages.UserProfilePage;
import ai.eezy.pages.WelcomeToeezyPage;

public class LogoutFromProfileTabTest extends BaseTest{
	@Test
	public void logOutFromProfile() throws Throwable {
		WelcomeToeezyPage setup=new WelcomeToeezyPage(driver);
		setup.getLoginBtn(driver).click();
		SignUpForeezyPage singin=new SignUpForeezyPage(driver);
		singin.getMoreSignUpoptnLink(driver).click();
		MoreSignUpoptionPage option=new MoreSignUpoptionPage(driver);
		option.getEmailSignUpoptnLink(driver).click();
		LogInToeezyPage login=new LogInToeezyPage(driver);
		login.getLoginEmailtxb().sendKeys(file.getDataFromPropertFile("email"));
		login.getLoginPasswordtxb().sendKeys(file.getDataFromPropertFile("password"));
		login.getContinueBtn().click();
		Thread.sleep(1200);
		pageutil.tap(driver, .9, .1);
		UserProfilePage profile=new UserProfilePage(driver);
		Thread.sleep(1300);
		pageutil.tap(driver, .9, .1);
		profile.getLogOutBtn().click();
		profile.getYesBtn().click();
		Assert.assertTrue(setup.getWizardtitleText(driver).isDisplayed());
	}
}
