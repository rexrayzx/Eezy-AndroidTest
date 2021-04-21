package ai.eezy.signuptest;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import ai.eezy.generics.BaseTest;
import ai.eezy.generics.ExcelLibrary;
import ai.eezy.pages.BotHomePage;
import ai.eezy.pages.EmailSignupFirstPage;
import ai.eezy.pages.MoreSignUpoptionPage;
import ai.eezy.pages.SignUpForeezyPage;
import ai.eezy.pages.EmailSignUpSecondPage;
import ai.eezy.pages.WelcomeToeezyPage;
import io.appium.java_client.MobileElement;

public class EmailSignupValidInputTest extends BaseTest{
	@Test(groups = "Smoke")
	public void emailSignup() throws Throwable {
		/*Test Data*/
		int num = util.randomvalue();
		String name = file.getDataFromPropertFile("name");
		/*Allow Location Access and continue*/
		WelcomeToeezyPage setup=new WelcomeToeezyPage(driver);
		setup.getLocationAllowbtn(driver).click();
		setup.getGetStartedbtn(driver).click();
		/*To select email registration*/
		SignUpForeezyPage signup=new SignUpForeezyPage(driver);
		signup.getMoreSignUpoptnLink(driver).click();
		MoreSignUpoptionPage more=new MoreSignUpoptionPage(driver);
		more.getEmailSignUpoptnLink(driver).click();
		/*To enter mandatory data for registration*/
		EmailSignupFirstPage emailSignup=new EmailSignupFirstPage(driver);
		emailSignup.getFirstnametxb(driver).sendKeys(name);
		emailSignup.getEmailtxb(driver).sendKeys("abc"+num+"@gmail.com");
		emailSignup.getPasswordtxb(driver).sendKeys(file.getDataFromPropertFile("password"));
		emailSignup.getContinuebtn(driver).click();
		/* to enter basic detail of user*/
		EmailSignUpSecondPage userdetailSignup=new EmailSignUpSecondPage(driver);
		userdetailSignup.getDobtxb(driver).click();
		userdetailSignup.getYear(driver).click();
		userdetailSignup.getYearsText(driver).click();
		for(int i=0;i<3;i++) {
			userdetailSignup.getNextMonthbtn(driver).click();
		}
		userdetailSignup.selectDate(driver, "27");
		userdetailSignup.getOkbtn(driver).click();
		userdetailSignup.selectGender(driver, "Male");
		userdetailSignup.selectOccupation(driver, "Student");
		userdetailSignup.getCntinuebtn(driver).click();
		BotHomePage homepage=new BotHomePage(driver);
		Thread.sleep(2000);
		String welcomeText = homepage.getWelcomchat().getText();
		Assert.assertTrue(welcomeText.contains(name));
	}
}
