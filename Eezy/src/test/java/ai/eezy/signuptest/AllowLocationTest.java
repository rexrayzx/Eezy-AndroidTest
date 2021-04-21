package ai.eezy.signuptest;



import org.testng.Assert;
import org.testng.annotations.Test;

import ai.eezy.generics.BaseTest;
import ai.eezy.pages.SignUpForeezyPage;
import ai.eezy.pages.WelcomeToeezyPage;
/**
 * 
 * @author Rajiv
 *
 */
public class AllowLocationTest extends BaseTest{
	@Test(groups = "Smoke")
	public void allowLocation() throws Throwable {
		WelcomeToeezyPage welcome=new WelcomeToeezyPage(driver);
		welcome.getLocationAllowbtn(driver).click();
		welcome.getGetStartedbtn(driver).click();
		SignUpForeezyPage signup=new SignUpForeezyPage(driver);
		String actualCountrycode=signup.getCountryCode().getText();
		String expectedCountryCode=excelLib.getExcelData("Validation", 1, 5);
		Assert.assertEquals(actualCountrycode, expectedCountryCode);
	}

}
