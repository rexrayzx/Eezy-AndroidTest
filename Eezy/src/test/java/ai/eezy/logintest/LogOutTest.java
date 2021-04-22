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
		LoginHomePage loginHome=new LoginHomePage(driver);
		pageutil.waitToDisplay(driver, loginHome.getSkipbtn());
		pageutil.tap(driver, .5, .1);
		DrawerMenuPage menu=new DrawerMenuPage(driver);
		menu.getLogoutMenu().click();
		menu.getYesLogoutBtn().click();
		Assert.assertTrue(setup.getWizardtitleText(driver).isDisplayed());
		
	}

}
