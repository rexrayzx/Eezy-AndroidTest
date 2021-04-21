package ai.eezy.signuptest;


import org.testng.Assert;
import org.testng.annotations.Test;

import ai.eezy.generics.BaseTest;
import ai.eezy.pages.WelcomeToeezyPage;

public class LocationPermissionTest extends BaseTest{
	@Test(groups = "Smoke")
	public void locationpermission() throws Throwable {
		WelcomeToeezyPage welcome=new WelcomeToeezyPage(driver);
		String Actualallow=welcome.getLocationAllowbtn(driver).getText();
		String ExpectedAllow=excelLib.getExcelData("WelcomePage", 1, 3);
		Assert.assertEquals(Actualallow, ExpectedAllow);
	}

}
