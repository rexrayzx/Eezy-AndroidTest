package ai.eezy.plantest;

import org.testng.annotations.Test;

import ai.eezy.generics.BaseTest;
import ai.eezy.pages.DrawerMenuPage;
import ai.eezy.pages.LogInToeezyPage;
import ai.eezy.pages.LoginHomePage;
import ai.eezy.pages.MoreSignUpoptionPage;
import ai.eezy.pages.MyPlanPage;
import ai.eezy.pages.SignUpForeezyPage;
import ai.eezy.pages.WelcomeToeezyPage;

public class MyPlanTest extends BaseTest{
	@Test
	public void myPlan() throws InterruptedException {
		boolean flag=false;
		/*Allow Location Access*/
		WelcomeToeezyPage setup=new WelcomeToeezyPage(driver);
		setup.getLocationAllowbtn(driver).click();
		setup.getLoginBtn(driver).click();
		SignUpForeezyPage singin=new SignUpForeezyPage(driver);
		singin.getMoreSignUpoptnLink(driver).click();
		MoreSignUpoptionPage option=new MoreSignUpoptionPage(driver);
		option.getEmailSignUpoptnLink(driver).click();
		LogInToeezyPage login=new LogInToeezyPage(driver);
		login.getLoginEmailtxb().sendKeys("abc76@gmail.com");
		login.getLoginPasswordtxb().sendKeys("Kikki54554");
		login.getContinueBtn().click();
		LoginHomePage loginHome=new LoginHomePage(driver);
		pageutil.waitToDisplay(driver, loginHome.getSkipbtn());
		pageutil.tap(driver, .5, .1);
		DrawerMenuPage menu=new DrawerMenuPage(driver);
		menu.getPlanMenu().click();
		MyPlanPage plan=new MyPlanPage(driver);
		plan.selectDateForPlan(driver, "28");
		plan.selectTimeForPlan(driver, "Evening");
		plan.getCreatePlanMeBtn().click();
		Thread.sleep(3000);
	}
}
