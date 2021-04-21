package ai.eezy.signuptest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ai.eezy.generics.BaseTest;
import ai.eezy.pages.SignUpForeezyPage;
import ai.eezy.pages.WelcomeToeezyPage;

public class InvalidPhoneNumberSignup extends BaseTest{
	String sheetName="InvalidPhoneNumber";
	@Test(dataProvider = "getData")
	public void invalidNumber(String number) throws Throwable {
		String expectedErrorMsg=excelLib.getExcelData("Validation", 1, 4);
		WelcomeToeezyPage setup=new WelcomeToeezyPage(driver);
		setup.getLocationAllowbtn(driver).click();
		setup.getGetStartedbtn(driver).click();
		/*To select email registration*/
		SignUpForeezyPage signup=new SignUpForeezyPage(driver);
		signup.getEnterphoneNumbertxb().click();
		signup.getEnterphoneNumbertxb().sendKeys(number);
		signup.getNextbtn(driver).click();
		String actualerrormsg=signup.getErrorMsg().getText();
		Assert.assertEquals(actualerrormsg, expectedErrorMsg);
	}
	@DataProvider
	public Object[] getData() throws Throwable{
		int rowIndex = excelLib.getRowCount(sheetName);
		rowIndex++;
		Object[]objArr=new Object[rowIndex];
		for(int i=0; i<rowIndex;i++) {
			objArr[i]=excelLib.getExcelData(sheetName,i, 0);
		}
		return objArr;
	}

}
