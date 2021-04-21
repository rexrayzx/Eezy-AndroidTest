package ai.eezy.signuptest;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Dimension;
import org.testng.Assert;
import org.testng.annotations.Test;

import ai.eezy.generics.BaseTest;
import ai.eezy.pages.MoreSignUpoptionPage;
import ai.eezy.pages.SignUpForeezyPage;
import ai.eezy.pages.WelcomeToeezyPage;
/**
 * 
 * @author Rajiv
 *
 */
public class WelcomeTest extends BaseTest{
	@Test(groups = "Smoke")
	public void welcometest() throws Throwable {
		/*Allow Location Access*/
		WelcomeToeezyPage setup=new WelcomeToeezyPage(driver);
		setup.getLocationAllowbtn(driver).click();
		/*Get Title of pets and verify scroll to next pet*/
		for(int i=1;i<4;i++) {
			//get expected title from excel
			String expectedTitle = excelLib.getExcelData("WelcomePage", i, 0);
			//get expected text from excel
			String expectedText = excelLib.getExcelData("WelcomePage", i, 1);
			//get title
			String actualtitle=setup.getWizardtitleText(driver).getText();
			//get text
			String actualtext=setup.getWizardText(driver).getText();
			//validate title 
			Assert.assertEquals(actualtitle, expectedTitle);
			//validate text
			Assert.assertEquals(actualtext, expectedText);
			//scroll to next pet image
			pageutil.scroll(driver, .6, .2, .5, .5);
		}
	}
}
