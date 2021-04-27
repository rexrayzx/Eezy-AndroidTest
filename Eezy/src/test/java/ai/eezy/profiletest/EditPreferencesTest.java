package ai.eezy.profiletest;

import org.testng.annotations.Test;

import ai.eezy.generics.BaseTest;
import ai.eezy.pages.LogInToeezyPage;
import ai.eezy.pages.LoginHomePage;
import ai.eezy.pages.MoreSignUpoptionPage;
import ai.eezy.pages.MyPreferencesPage;
import ai.eezy.pages.SignUpForeezyPage;
import ai.eezy.pages.UserProfilePage;
import ai.eezy.pages.WelcomeToeezyPage;

public class EditPreferencesTest extends BaseTest{
	@Test
	public void editPreferences() throws Throwable {
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
		UserProfilePage userprofile=new UserProfilePage(driver);
		pageutil.scroll(driver, .5, .5, .6, .3);
		userprofile.getPreferences().click();
		MyPreferencesPage preferences=new MyPreferencesPage(driver);
		preferences.disLikebutton(driver, "Chinese");
		preferences.likebutton(driver, "Asian");
		preferences.favoritebutton(driver, "French");
		preferences.getActivitiesTab().click();
		preferences.likebutton(driver, "Cinema");
		preferences.favoritebutton(driver, "Bar");
		preferences.disLikebutton(driver, "Concert");
		preferences.getTagsTab().click();
	}

}
