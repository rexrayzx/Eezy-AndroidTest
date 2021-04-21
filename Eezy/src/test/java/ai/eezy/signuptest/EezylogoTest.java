package ai.eezy.signuptest;

import org.openqa.selenium.Point;
import org.testng.Assert;
import org.testng.annotations.Test;

import ai.eezy.generics.BaseTest;
import ai.eezy.pages.SignUpForeezyPage;
import ai.eezy.pages.WelcomeToeezyPage;

public class EezylogoTest extends BaseTest{
	@Test(groups = "Smoke")
	public void eezyLogo() {
		WelcomeToeezyPage welcome=new WelcomeToeezyPage(driver);
		welcome.getLocationAllowbtn(driver).click();
		welcome.getGetStartedbtn(driver).click();
		SignUpForeezyPage signup=new SignUpForeezyPage(driver);
		boolean visible = signup.getEezyLogo().isDisplayed();
		Point points = signup.getEezyLogo().getLocation();
		System.out.println(points.getX());
		System.out.println(points.getY());
		Assert.assertTrue(visible);
	}

}
