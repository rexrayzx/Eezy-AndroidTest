package ai.eezy.profiletest;

import org.testng.annotations.Test;

import ai.eezy.generics.BaseTest;
import ai.eezy.pages.LogInToeezyPage;
import ai.eezy.pages.MoreSignUpoptionPage;
import ai.eezy.pages.SignUpForeezyPage;
import ai.eezy.pages.UserProfilePage;
import ai.eezy.pages.WelcomeToeezyPage;

public class ViewPhotoTest extends BaseTest{
	@Test
	public void viewPhoto() throws Throwable {
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
		Thread.sleep(1500);
		pageutil.tap(driver, .9, .1);
		UserProfilePage profile=new UserProfilePage(driver);
		profile.getUserProfileImg().click();
		profile.getViewPhotoBtn().click();
		pageutil.back(driver);
		profile.getUserProfileImg().click();
	}
}
