package ai.eezy.profiletest;

import org.testng.annotations.Test;

import ai.eezy.generics.BaseTest;
import ai.eezy.pages.LogInToeezyPage;
import ai.eezy.pages.LoginHomePage;
import ai.eezy.pages.MoodPage;
import ai.eezy.pages.MoreSignUpoptionPage;
import ai.eezy.pages.SignUpForeezyPage;
import ai.eezy.pages.UserProfilePage;
import ai.eezy.pages.WelcomeToeezyPage;

public class ChnageMoodTest extends BaseTest{
	@Test
	public void changeMood() throws Throwable {
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
		LoginHomePage loginHome=new LoginHomePage(driver);
		pageutil.waitToDisplay(driver, loginHome.getSkipbtn());
		pageutil.tap(driver, .9, .1);
		UserProfilePage profilepage=new UserProfilePage(driver);
		pageutil.scroll(driver, .5, .5, .6, .3);
		profilepage.getMoodActivityCard().click();
		MoodPage mood=new MoodPage(driver);
		mood.getDownMood().click();
		pageutil.back(driver);
	}
}
