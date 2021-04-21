package ai.eezy.signuptest;

import org.testng.Assert;
import org.testng.annotations.Test;

import ai.eezy.generics.BaseTest;
import ai.eezy.pages.OTPPage;
import ai.eezy.pages.SignUpForeezyPage;
import ai.eezy.pages.WelcomeToeezyPage;

public class NavigateToOtpPageTest extends BaseTest{
	@Test(groups = "Smoke")
	public void navigateToOtpPage() {
		WelcomeToeezyPage setup=new WelcomeToeezyPage(driver);
		setup.getLocationDenybtn(driver).click();
		//setup.getLocationAllowbtn(driver).click();
		setup.getLoginBtn(driver).click();
		/*To select email registration*/
		SignUpForeezyPage signup=new SignUpForeezyPage(driver);
		signup.getEnterphoneNumbertxb().click();
		signup.getCountryDropDown().click();
		signup.getSearchCountrytxb(driver).sendKeys("india");
		signup.getCountrylist(driver).click();
		signup.getEnterphoneNumbertxb().sendKeys("9560226368");
		signup.getNextbtn(driver).click();
		OTPPage otp=new OTPPage(driver);
		boolean value = otp.getDidntGetOtpTxt().isDisplayed();
		Assert.assertTrue(value);
	}

}
