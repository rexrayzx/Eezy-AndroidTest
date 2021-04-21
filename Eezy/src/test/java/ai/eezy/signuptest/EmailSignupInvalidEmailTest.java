package ai.eezy.signuptest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ai.eezy.generics.BaseTest;
import ai.eezy.pages.EmailSignupFirstPage;
import ai.eezy.pages.MoreSignUpoptionPage;
import ai.eezy.pages.SignUpForeezyPage;
import ai.eezy.pages.WelcomeToeezyPage;

public class EmailSignupInvalidEmailTest extends BaseTest{
	String sheetName="InvalidEmailInput";
	@Test
	public void blankEmailInput() throws Throwable {
		String expectedErrorMsg=excelLib.getExcelData("Validation", 3, 1);
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
		emailSignup.getFirstnametxb(driver).sendKeys("raj");
		emailSignup.getEmailtxb(driver).sendKeys("");
		emailSignup.getPasswordtxb(driver).sendKeys("123456");
		emailSignup.getContinuebtn(driver).click();
		String actualErrormsg = emailSignup.getValidationErrormsg(driver).getText();
		Assert.assertEquals(actualErrormsg, expectedErrorMsg);
	}
	@Test(dataProvider = "getData")
	public void invalidEmailInput(String name,String email,String password) throws Throwable {
		
		String expectedErrorMsg=excelLib.getExcelData("Validation", 4, 1);
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
		emailSignup.getEmailtxb(driver).sendKeys(email);
		emailSignup.getPasswordtxb(driver).sendKeys(password);
		emailSignup.getContinuebtn(driver).click();
		String actualErrormsg = emailSignup.getValidationErrormsg(driver).getText();
		Assert.assertEquals(actualErrormsg, expectedErrorMsg);
	}
	
	@DataProvider
	public Object[][] getData() throws Throwable{
		int rowIndex = excelLib.getRowCount(sheetName);
		rowIndex++;
		Object[][]objArr=new Object[rowIndex][3];
		for(int i=0; i<rowIndex;i++) {
			objArr[i][0]=excelLib.getExcelData(sheetName,i, 0);
			objArr[i][1]=excelLib.getExcelData(sheetName,i, 1);
			objArr[i][2]=excelLib.getExcelData(sheetName,i, 2);
		}
		return objArr;
	}
}
