package ai.eezy.signuptest;

import org.testng.annotations.Test;

import ai.eezy.generics.BaseTest;
import ai.eezy.pages.SignUpForeezyPage;
import ai.eezy.pages.WelcomeToeezyPage;

public class NavigateToTermsAndConditionPage extends BaseTest{
	@Test
	public void navigateToTermsandCondition() {
		WelcomeToeezyPage welcome=new WelcomeToeezyPage(driver);
		welcome.getLocationDenybtn(driver).click();
		welcome.getGetStartedbtn(driver).click();
		SignUpForeezyPage signup=new SignUpForeezyPage(driver);
		signup.getTermConditionLink(driver).click();
	}

}
