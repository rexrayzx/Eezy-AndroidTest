package ai.eezy.signuptest;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ai.eezy.generics.BaseTest;
import ai.eezy.pages.OTPPage;
import ai.eezy.pages.OtpSignupPage;
import ai.eezy.pages.SignUpForeezyPage;
import ai.eezy.pages.WelcomeToeezyPage;
/**
 * 
 * @author Rajiv
 *
 */
public class PhoneNumberRegistrationTest extends BaseTest{
	@Test(groups = "Smoke")
	public void phoneNumberSignUp() throws InterruptedException {
		WelcomeToeezyPage setup=new WelcomeToeezyPage(driver);
		setup.getLocationDenybtn(driver).click();
		//setup.getLocationAllowbtn(driver).click();
		setup.getGetStartedbtn(driver).click();
		SignUpForeezyPage signup=new SignUpForeezyPage(driver);
		signup.getEnterphoneNumbertxb().click();
		signup.getCountryDropDown().click();
		//pageutil.tapOnElement(driver, signup.getCountryDropDown());
		signup.getSearchCountrytxb(driver).sendKeys("india");
		signup.getCountrylist(driver).click();
		signup.getEnterphoneNumbertxb().sendKeys("7503293645");
		signup.getNextbtn(driver).click();
		OtpSignupPage otpsignup=new OtpSignupPage(driver);
		boolean text = otpsignup.getFirstNameTxb().isDisplayed();
		Assert.assertTrue(text);
	}
}
