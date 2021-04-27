package ai.eezy.logintest;

import org.testng.Assert;
import org.testng.annotations.Test;

import ai.eezy.generics.BaseTest;
import ai.eezy.pages.DrawerMenuPage;
import ai.eezy.pages.LogInToeezyPage;
import ai.eezy.pages.LoginHomePage;
import ai.eezy.pages.MoreSignUpoptionPage;
import ai.eezy.pages.SignUpForeezyPage;
import ai.eezy.pages.WelcomeToeezyPage;
/**
 * 
 * @author Rajiv
 *
 */
public class LogOutTest extends BaseTest{
	@Test
	public void logout() throws Throwable {
		WelcomeToeezyPage setup=new WelcomeToeezyPage(driver);
		loginToApp(file.getDataFromPropertFile("email"), file.getDataFromPropertFile("password"));
		LoginHomePage loginHome=new LoginHomePage(driver);
		pageutil.waitToDisplay(driver, loginHome.getSkipbtn());
		pageutil.tap(driver, .5, .1);
		DrawerMenuPage menu=new DrawerMenuPage(driver);
		menu.getLogoutMenu().click();
		menu.getYesLogoutBtn().click();
		Assert.assertTrue(setup.getWizardtitleText(driver).isDisplayed());
	}

}
