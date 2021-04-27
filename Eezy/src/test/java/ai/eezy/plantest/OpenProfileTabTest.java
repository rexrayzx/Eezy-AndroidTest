package ai.eezy.plantest;

import org.junit.Assert;
import org.testng.annotations.Test;

import ai.eezy.generics.BaseTest;
import ai.eezy.pages.LogInToeezyPage;
import ai.eezy.pages.LoginHomePage;
import ai.eezy.pages.MoreSignUpoptionPage;
import ai.eezy.pages.SignUpForeezyPage;
import ai.eezy.pages.UserProfilePage;
import ai.eezy.pages.WelcomeToeezyPage;

public class OpenProfileTabTest extends BaseTest{
	@Test
	public void openProfileTab() throws Throwable {
		WelcomeToeezyPage setup=new WelcomeToeezyPage(driver);
		setup.getLocationAllowbtn(driver).click();
		setup.getLoginBtn(driver).click();
		SignUpForeezyPage singin=new SignUpForeezyPage(driver);
		singin.getMoreSignUpoptnLink(driver).click();
		MoreSignUpoptionPage option=new MoreSignUpoptionPage(driver);
		option.getEmailSignUpoptnLink(driver).click();
		LogInToeezyPage login=new LogInToeezyPage(driver);
		login.getLoginEmailtxb().sendKeys(file.getDataFromPropertFile("email"));
		login.getLoginPasswordtxb().sendKeys(file.getDataFromPropertFile("password"));
		login.getContinueBtn().click();
		Thread.sleep(2000);
		//pageutil.waitToDisplay(driver, loginHome.getSkipbtn());
		pageutil.tap(driver, .9, .1);
		UserProfilePage profile=new UserProfilePage(driver);
		Assert.assertTrue(profile.getName().isDisplayed());
	}
}
