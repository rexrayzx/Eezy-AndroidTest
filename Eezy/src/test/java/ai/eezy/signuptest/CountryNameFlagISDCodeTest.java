package ai.eezy.signuptest;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Keyboard;
import org.testng.Assert;
import org.testng.annotations.Test;

import ai.eezy.generics.BaseTest;
import ai.eezy.pages.SignUpForeezyPage;
import ai.eezy.pages.WelcomeToeezyPage;

public class CountryNameFlagISDCodeTest extends BaseTest{
	@Test
	public void countryDropDownTest() throws Throwable {
		int rowCount = excelLib.getRowCount("CountryList");
		rowCount++;
		WelcomeToeezyPage welcome=new WelcomeToeezyPage(driver);
		welcome.getLocationDenybtn(driver).click();
		welcome.getGetStartedbtn(driver).click();
		SignUpForeezyPage signup=new SignUpForeezyPage(driver);
		signup.getEnterphoneNumbertxb().click();
		
		for(int i=1;i<rowCount;i++) {
			signup.getCountryDropDown().click();
			signup.getSearchCountrytxb(driver).sendKeys(excelLib.getExcelData("CountryList", i, 1));
			String actualCountryName = signup.getCountrylist(driver).getText();
			WebElement flag = signup.checkFlag(driver, actualCountryName);
			Assert.assertTrue(flag.isDisplayed());
			signup.getCountrylist(driver).click();
			String actualISDcode=signup.getCountryCode().getText();
			String expectedISDcode=excelLib.getExcelData("CountryList", i, 2);
			String expectedCountryName = excelLib.getExcelData("CountryList", i, 0);
			Assert.assertEquals(actualCountryName, expectedCountryName);
			Assert.assertEquals(actualISDcode, expectedISDcode);
			Assert.assertTrue(signup.getFlag().isDisplayed());
		}
	}
}
