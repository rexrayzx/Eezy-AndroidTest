package ai.eezy.signuptest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ai.eezy.generics.BaseTest;
import ai.eezy.pages.EmailSignupFirstPage;
import ai.eezy.pages.MoreSignUpoptionPage;
import ai.eezy.pages.SignUpForeezyPage;
import ai.eezy.pages.WelcomeToeezyPage;

public class EmailSignupInvalidNameTest extends BaseTest{
	String sheetName="InvalidName";

	@Test
	public void blankNameInput() throws Throwable {
		String expectedErrorMsg=excelLib.getExcelData("Validation",2, 1);
		WelcomeToeezyPage setup=new WelcomeToeezyPage(driver);
		setup.getLocationAllowbtn(driver).click();
		setup.getGetStartedbtn(driver).click();
		
		SignUpForeezyPage signup=new SignUpForeezyPage(driver);
		signup.getMoreSignUpoptnLink(driver).click();
		MoreSignUpoptionPage more=new MoreSignUpoptionPage(driver);
		more.getEmailSignUpoptnLink(driver).click();
		
		EmailSignupFirstPage emailSignup=new EmailSignupFirstPage(driver);
		emailSignup.getFirstnametxb(driver).sendKeys("");
		emailSignup.getEmailtxb(driver).sendKeys("abc@red.com");
		emailSignup.getPasswordtxb(driver).sendKeys("123456");
		emailSignup.getContinuebtn(driver).click();
		String actualErrormsg = emailSignup.getValidationErrormsg(driver).getText();
		Assert.assertEquals(actualErrormsg, expectedErrorMsg);
	}
	
	@Test(dataProvider = "getData")
	public void invalidNameInput(String name,String password) throws Throwable {
			int num = util.randomvalue();
			String expectedErrorMsg=excelLib.getExcelData("Validation",1, 1);
			WelcomeToeezyPage setup=new WelcomeToeezyPage(driver);
			setup.getLocationAllowbtn(driver).click();
			setup.getGetStartedbtn(driver).click();
			
			SignUpForeezyPage signup=new SignUpForeezyPage(driver);
			signup.getMoreSignUpoptnLink(driver).click();
			MoreSignUpoptionPage more=new MoreSignUpoptionPage(driver);
			more.getEmailSignUpoptnLink(driver).click();
			
			EmailSignupFirstPage emailSignup=new EmailSignupFirstPage(driver);
			emailSignup.getFirstnametxb(driver).sendKeys(name);
			emailSignup.getEmailtxb(driver).sendKeys("email"+num+"@ymail.com");
			emailSignup.getPasswordtxb(driver).sendKeys(password);
			emailSignup.getContinuebtn(driver).click();
			String actualErrormsg = emailSignup.getValidationErrormsg(driver).getText();
			Assert.assertEquals(actualErrormsg, expectedErrorMsg);
		}
		
		@DataProvider
		public Object[][] getData() throws Throwable{
			int rowIndex = excelLib.getRowCount(sheetName);
			rowIndex++;
			Object[][]objArr=new Object[rowIndex][2];
			for(int i=0; i<rowIndex;i++) {
				objArr[i][0]=excelLib.getExcelData(sheetName,i, 0);
				objArr[i][1]=excelLib.getExcelData(sheetName,i, 1);
			}
			return objArr;
	}
		
		@Test
		public void spcialcharNameInput() throws Throwable {
			int num=util.randomvalue();
			String expectedErrorMsg=excelLib.getExcelData("Validation",2, 1);
			WelcomeToeezyPage setup=new WelcomeToeezyPage(driver);
			setup.getGetStartedbtn(driver).click();
			/*To select email registration*/
			SignUpForeezyPage signup=new SignUpForeezyPage(driver);
			signup.getMoreSignUpoptnLink(driver).click();
			MoreSignUpoptionPage more=new MoreSignUpoptionPage(driver);
			more.getEmailSignUpoptnLink(driver).click();
			/*To enter mandatory data for registration*/
			EmailSignupFirstPage emailSignup=new EmailSignupFirstPage(driver);
			emailSignup.getFirstnametxb(driver).sendKeys("$$%#@*");
			emailSignup.getEmailtxb(driver).sendKeys("abc"+num+"@red.com");
			emailSignup.getPasswordtxb(driver).sendKeys("123456");
			emailSignup.getContinuebtn(driver).click();
			String actualErrormsg = emailSignup.getValidationErrormsg(driver).getText();
			Assert.assertEquals(actualErrormsg, expectedErrorMsg);
		}
		
}
