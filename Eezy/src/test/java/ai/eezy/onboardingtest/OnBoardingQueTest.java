package ai.eezy.onboardingtest;

import java.util.List;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import ai.eezy.generics.BaseTest;
import ai.eezy.pages.BotHomePage;
import ai.eezy.pages.EmailSignUpSecondPage;
import ai.eezy.pages.EmailSignupFirstPage;
import ai.eezy.pages.MoreSignUpoptionPage;
import ai.eezy.pages.SignUpForeezyPage;
import ai.eezy.pages.WelcomeToeezyPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.functions.ExpectedCondition;
/**
 * 
 * @author Rajiv
 *
 */
public class OnBoardingQueTest extends BaseTest{
	@Test(groups = "Smoke")
	public void onBoardingQuestions() throws Throwable {
		int rowcount = excelLib.getRowCount("Onboarding");
		rowcount++;
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
		/*List<MobileElement> chat = homepage.getWelcomchats();
		for(int i=0;i<rowcount;i++) {
			String actualChat = chat.get(i).getText();
			String expectedChat = excelLib.getExcelData("Onboarding", i, 0);
			Assert.assertEquals(actualChat, expectedChat);
		}*/
		pageutil.waitToDisplay(driver, homepage.getGiphy());
		boolean giphy = homepage.getGiphy().isDisplayed();
		Assert.assertTrue(giphy);
		pageutil.waitToDisplay(driver, homepage.getLeftBtn());
		homepage.getLeftBtn().click();
		Thread.sleep(2000);
		pageutil.waitToDisplay(driver, homepage.getLeftBtn());
		homepage.getLeftBtn().click();
		pageutil.waitToDisplay(driver, homepage.getRightoption());
		homepage.getRightoption().click();
		homepage.getSendResponsebtn().click();
		Assert.assertTrue(homepage.getGiphy().isDisplayed());
		pageutil.waitToDisplay(driver, homepage.getLeftoption());
		homepage.getLeftoption().click();
		homepage.getSendResponsebtn().click();
		pageutil.waitToDisplay(driver, homepage.getCenterOption());
		homepage.getCenterOption().click();
		homepage.getSendResponsebtn().click();
		pageutil.waitToDisplay(driver, homepage.getGiphy());
		Assert.assertTrue(homepage.getGiphy().isDisplayed());
		pageutil.waitToDisplay(driver, homepage.getLeft2ndoption());
		homepage.getLeft2ndoption().click();
		homepage.getSendResponsebtn().click();
		pageutil.waitToDisplay(driver, homepage.getRight2ndoption());
		homepage.getRight2ndoption().click();
		homepage.getSendResponsebtn().click();
		pageutil.waitToDisplay(driver, homepage.getGiphy());
		Assert.assertTrue(homepage.getGiphy().isDisplayed());
		pageutil.waitToDisplay(driver, homepage.getMatchedPercentage());
		Assert.assertTrue(homepage.getMatchedPercentage().isDisplayed());
		Assert.assertTrue(homepage.getPetName().isDisplayed());
	}
}
