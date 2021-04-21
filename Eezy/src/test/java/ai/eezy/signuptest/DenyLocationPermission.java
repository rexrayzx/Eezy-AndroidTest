package ai.eezy.signuptest;

import org.testng.Assert;
import org.testng.annotations.Test;

import ai.eezy.generics.BaseTest;
import ai.eezy.pages.SignUpForeezyPage;
import ai.eezy.pages.WelcomeToeezyPage;

public class DenyLocationPermission extends BaseTest{
	@Test
	public void denyLocation() throws Throwable {
		WelcomeToeezyPage welcome=new WelcomeToeezyPage(driver);
		welcome.getLocationDenybtn(driver).click();
		welcome.getGetStartedbtn(driver).click();
		SignUpForeezyPage signup=new SignUpForeezyPage(driver);
		String actualCountrycode=signup.getCountryCode().getText();
		String expectedCountryCode=excelLib.getExcelData("Validation", 2, 5);
		Assert.assertEquals(actualCountrycode, expectedCountryCode);
	}

}
