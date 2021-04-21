package ai.eezy.signuptest;

import org.testng.Assert;
import org.testng.annotations.Test;

import ai.eezy.generics.BaseTest;
import ai.eezy.pages.EmailSignupFirstPage;
import ai.eezy.pages.MoreSignUpoptionPage;
import ai.eezy.pages.SignUpForeezyPage;
import ai.eezy.pages.WelcomeToeezyPage;

public class EmailSignupInvalidPasswordTest extends BaseTest {
	String sheetname="InvalidPassword";
	@Test
	public void blankPasswordInput() throws Throwable {
		String expectedErrorMsg=excelLib.getExcelData("Validation",6, 1);
		WelcomeToeezyPage setup=new WelcomeToeezyPage(driver);
		setup.getLocationAllowbtn(driver).click();
		setup.getGetStartedbtn(driver).click();
		
		SignUpForeezyPage signup=new SignUpForeezyPage(driver);
		signup.getMoreSignUpoptnLink(driver).click();
		MoreSignUpoptionPage more=new MoreSignUpoptionPage(driver);
		more.getEmailSignUpoptnLink(driver).click();
		
		EmailSignupFirstPage emailSignup=new EmailSignupFirstPage(driver);
		emailSignup.getFirstnametxb(driver).sendKeys("abcdr");
		emailSignup.getEmailtxb(driver).sendKeys("abc@red.com");
		emailSignup.getPasswordtxb(driver).sendKeys("");
		emailSignup.getContinuebtn(driver).click();
		String actualErrormsg = emailSignup.getValidationErrormsg(driver).getText();
		Assert.assertEquals(actualErrormsg, expectedErrorMsg);
	}
	
	@Test
	public void invalidPasswordInput() throws Throwable {
		String expectedErrorMsg=excelLib.getExcelData("Validation",5, 1);
		WelcomeToeezyPage setup=new WelcomeToeezyPage(driver);
		setup.getLocationAllowbtn(driver).click();
		setup.getGetStartedbtn(driver).click();
		
		SignUpForeezyPage signup=new SignUpForeezyPage(driver);
		signup.getMoreSignUpoptnLink(driver).click();
		MoreSignUpoptionPage more=new MoreSignUpoptionPage(driver);
		more.getEmailSignUpoptnLink(driver).click();
		
		EmailSignupFirstPage emailSignup=new EmailSignupFirstPage(driver);
		emailSignup.getFirstnametxb(driver).sendKeys(excelLib.getExcelData(sheetname, 0, 0));
		emailSignup.getEmailtxb(driver).sendKeys("abc@red.com");
		emailSignup.getPasswordtxb(driver).sendKeys(excelLib.getExcelData(sheetname, 0, 1));
		emailSignup.getContinuebtn(driver).click();
		String actualErrormsg = emailSignup.getValidationErrormsg(driver).getText();
		Assert.assertEquals(actualErrormsg, expectedErrorMsg);
	}
}
