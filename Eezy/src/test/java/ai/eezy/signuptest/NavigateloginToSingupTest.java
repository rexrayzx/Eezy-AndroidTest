package ai.eezy.signuptest;

import org.testng.Assert;
import org.testng.annotations.Test;

import ai.eezy.generics.BaseTest;
import ai.eezy.pages.OtpSignupPage;
import ai.eezy.pages.SignUpForeezyPage;
import ai.eezy.pages.WelcomeToeezyPage;

public class NavigateloginToSingupTest extends BaseTest{
	@Test(groups = "Smoke")
	public void loginToSingup() throws Throwable {
		String expectedResult = excelLib.getExcelData("WelcomePage", 2, 2);
		WelcomeToeezyPage setup=new WelcomeToeezyPage(driver);
		setup.getLocationDenybtn(driver).click();
		//setup.getLocationAllowbtn(driver).click();
		setup.getGetStartedbtn(driver).click();
		SignUpForeezyPage signup=new SignUpForeezyPage(driver);
		signup.getEnterphoneNumbertxb().click();
		signup.getCountryDropDown().click();
		signup.getSearchCountrytxb(driver).sendKeys("india");
		signup.getCountrylist(driver).click();
		signup.getEnterphoneNumbertxb().sendKeys("7503293645");
		signup.getNextbtn(driver).click();
		OtpSignupPage otpsignup=new OtpSignupPage(driver);
		String actualResult = otpsignup.getEezySignupTxt().getText();
		Assert.assertEquals(actualResult, expectedResult);
	}

}
